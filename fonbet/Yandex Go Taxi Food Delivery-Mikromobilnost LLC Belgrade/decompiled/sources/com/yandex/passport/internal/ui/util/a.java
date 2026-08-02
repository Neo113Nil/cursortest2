package com.yandex.passport.internal.ui.util;

import android.os.Handler;
import android.os.Looper;
import android.widget.Button;
import com.yandex.passport.R;

/* loaded from: classes2.dex */
public final class a {
    public final Button a;
    public final com.yandex.passport.internal.ui.domik.common.c b;
    public boolean e;
    public long f;
    public final com.yandex.passport.internal.ui.autologin.d h;
    public final int c = R.string.passport_sms_resend_button;
    public final int d = R.string.passport_sms_resend_button_placeholder;
    public final Handler g = new Handler(Looper.getMainLooper());

    public a(Button button, com.yandex.passport.internal.ui.domik.common.c cVar) {
        this.a = button;
        this.b = cVar;
        button.setOnClickListener(new com.yandex.passport.internal.autologin.ui.b(7, this));
        this.h = new com.yandex.passport.internal.ui.autologin.d(3, this);
    }

    public final void a() {
        if (!this.e) {
            this.a.setText(this.c);
            return;
        }
        Handler handler = this.g;
        com.yandex.passport.internal.ui.autologin.d dVar = this.h;
        handler.removeCallbacks(dVar);
        handler.post(dVar);
    }
}
