package com.google.android.gms.common.api;

import android.text.TextUtils;
import com.google.android.gms.common.ConnectionResult;
import defpackage.cvw;
import defpackage.s53;
import defpackage.w53;
import defpackage.wn2;
import defpackage.yqv;
import java.util.ArrayList;
import java.util.Iterator;
import ru.CryptoPro.JCP.tools.CertReader.Extension;

/* loaded from: classes11.dex */
public class AvailabilityException extends Exception {
    private final w53 zaa;

    public AvailabilityException(w53 w53Var) {
        this.zaa = w53Var;
    }

    @Override // java.lang.Throwable
    public final String getMessage() {
        ArrayList arrayList = new ArrayList();
        Iterator it = ((s53) this.zaa.keySet()).iterator();
        boolean z = true;
        while (true) {
            yqv yqvVar = (yqv) it;
            if (!yqvVar.hasNext()) {
                break;
            }
            wn2 wn2Var = (wn2) yqvVar.next();
            ConnectionResult connectionResult = (ConnectionResult) this.zaa.get(wn2Var);
            cvw.l(connectionResult);
            z &= !connectionResult.isSuccess();
            arrayList.add(wn2Var.b.c + Extension.COLON_SPACE + String.valueOf(connectionResult));
        }
        StringBuilder sb = new StringBuilder();
        if (z) {
            sb.append("None of the queried APIs are available. ");
        } else {
            sb.append("Some of the queried APIs are unavailable. ");
        }
        sb.append(TextUtils.join(Extension.SEMICOLON_SPACE, arrayList));
        return sb.toString();
    }
}
