package com.yandex.passport.internal.ui.autologin;

import android.content.Context;
import android.os.SystemClock;
import android.widget.Button;
import com.yandex.passport.R;
import com.yandex.passport.internal.ui.bouncer.error.n;
import com.yandex.passport.internal.ui.domik.call.f;
import com.yandex.passport.internal.widget.ConfirmationCodeInput;

/* loaded from: classes2.dex */
public final class d implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ Object b;

    public /* synthetic */ d(int i, Object obj) {
        this.a = i;
        this.b = obj;
    }

    @Override // java.lang.Runnable
    public final void run() {
        boolean z;
        Runnable runnable;
        int i = this.a;
        Object obj = this.b;
        switch (i) {
            case 0:
                ((e) obj).w.invoke();
                break;
            case 1:
                f fVar = (f) obj;
                int max = Math.max(0, (int) (((fVar.c + 30000) - SystemClock.elapsedRealtime()) / 1000));
                boolean z2 = max > 0;
                n nVar = fVar.b;
                Context context = fVar.a;
                nVar.invoke(max > 0 ? context.getString(R.string.passport_reg_use_sms_template, String.valueOf(max)) : context.getString(R.string.passport_reg_use_sms), Boolean.valueOf(z2));
                if (z2) {
                    fVar.e.postDelayed(this, 1000L);
                    break;
                }
                break;
            case 2:
                ((com.yandex.passport.internal.ui.sloth.menu.d) obj).invoke();
                break;
            case 3:
                long currentTimeMillis = System.currentTimeMillis();
                com.yandex.passport.internal.ui.util.a aVar = (com.yandex.passport.internal.ui.util.a) obj;
                long j = aVar.f;
                Button button = aVar.a;
                if (j > currentTimeMillis) {
                    button.setText(button.getContext().getString(aVar.d, String.valueOf((j - currentTimeMillis) / 1000)));
                    aVar.g.postDelayed(this, 1000L);
                    button.setClickable(false);
                    break;
                } else {
                    button.setText(button.getContext().getString(aVar.c));
                    button.setClickable(true);
                    break;
                }
            default:
                ConfirmationCodeInput confirmationCodeInput = (ConfirmationCodeInput) obj;
                z = confirmationCodeInput.cursorVisible;
                confirmationCodeInput.cursorVisible = !z;
                confirmationCodeInput.invalidate();
                runnable = confirmationCodeInput.cursorVisibilityChangeRunnable;
                confirmationCodeInput.postDelayed(runnable, 400L);
                break;
        }
    }
}
