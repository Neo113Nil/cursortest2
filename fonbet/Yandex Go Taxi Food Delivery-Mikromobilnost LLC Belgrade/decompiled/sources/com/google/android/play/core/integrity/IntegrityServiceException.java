package com.google.android.play.core.integrity;

import com.google.android.gms.common.api.ApiException;
import com.google.android.gms.common.api.Status;
import defpackage.eh61;
import defpackage.ny61;
import defpackage.oyr;
import defpackage.unr0;
import java.util.HashMap;
import java.util.Locale;
import ru.CryptoPro.JCP.tools.CertReader.Extension;

/* loaded from: classes11.dex */
public class IntegrityServiceException extends ApiException {
    private final Throwable a;

    /* JADX WARN: Illegal instructions before constructor call */
    /* JADX WARN: Removed duplicated region for block: B:11:0x0045  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0042  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public IntegrityServiceException(int i, Exception exc) {
        super(new Status(i, oyr.l(i, "Integrity API error (", "): ", r1, Extension.DOT_CHAR)));
        String str;
        Locale locale = Locale.ROOT;
        HashMap hashMap = eh61.a;
        Integer valueOf = Integer.valueOf(i);
        if (hashMap.containsKey(valueOf)) {
            HashMap hashMap2 = eh61.b;
            if (hashMap2.containsKey(valueOf)) {
                str = unr0.o((String) hashMap.get(valueOf), " (https://developer.android.com/google/play/integrity/reference/com/google/android/play/core/integrity/model/IntegrityErrorCode.html#", (String) hashMap2.get(valueOf), Extension.C_BRAKE);
                if (i == 0) {
                    this.a = exc;
                    return;
                } else {
                    ny61.g("ErrorCode should not be 0.");
                    throw null;
                }
            }
        }
        str = "";
        if (i == 0) {
        }
    }

    @Override // java.lang.Throwable
    public final synchronized Throwable getCause() {
        return this.a;
    }
}
