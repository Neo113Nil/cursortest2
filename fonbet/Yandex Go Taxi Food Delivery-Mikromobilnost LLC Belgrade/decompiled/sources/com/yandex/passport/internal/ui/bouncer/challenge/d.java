package com.yandex.passport.internal.ui.bouncer.challenge;

import android.content.ClipData;
import android.content.ClipboardManager;
import android.content.Context;
import android.widget.Toast;
import com.yandex.passport.R;
import defpackage.tls;
import defpackage.zy11;

/* loaded from: classes2.dex */
public final /* synthetic */ class d implements tls {
    public final /* synthetic */ int a;
    public final /* synthetic */ Context b;

    public /* synthetic */ d(Context context, int i) {
        this.a = i;
        this.b = context;
    }

    @Override // defpackage.tls
    public final Object invoke(Object obj) {
        int i = this.a;
        zy11 zy11Var = zy11.a;
        Context context = this.b;
        String str = (String) obj;
        switch (i) {
            case 0:
                Toast.makeText(context, str, 0).show();
                break;
            case 1:
                Toast.makeText(context, str, 0).show();
                break;
            default:
                ((ClipboardManager) context.getSystemService("clipboard")).setPrimaryClip(ClipData.newPlainText("errorInfo", str));
                Toast.makeText(context, context.getString(R.string.passport_error_slab_toast_text), 0).show();
                break;
        }
        return zy11Var;
    }
}
