package xsna;

import android.content.Context;
import android.content.Intent;
import androidx.annotation.NonNull;
import com.vkontakte.android.ConfirmationActivity;
import com.vkontakte.android.ValidationActivity;
import xsna.n7r0;

/* compiled from: DefaultValidationHandler.java */
/* loaded from: classes11.dex */
public final class jql implements n7r0 {
    public final Context b;
    public final b25 c;

    public jql(Context context, b25 b25Var) {
        this.b = context;
        this.c = b25Var;
    }

    @Override // xsna.n7r0
    public final void a(@NonNull n7r0.b bVar, @NonNull n7r0.a<n7r0.c> aVar) {
        par0.a.getClass();
        par0.e("CaptchaActivity isn't available");
        aVar.a();
    }

    @Override // xsna.n7r0
    public final void b(@NonNull String str, @NonNull n7r0.a<Boolean> aVar) {
        Context context = this.b;
        c63 c63Var = c63.a;
        if (!c63.f) {
            aVar.a();
            return;
        }
        ConfirmationActivity.y = false;
        ConfirmationActivity.x = false;
        Intent intent = new Intent(context, (Class<?>) ConfirmationActivity.class);
        intent.addFlags(268435456);
        intent.putExtra("confirm_text", str);
        context.startActivity(intent);
        while (!ConfirmationActivity.y) {
            try {
                Thread.sleep(100L);
            } catch (InterruptedException unused) {
            }
        }
        aVar.d(Boolean.valueOf(ConfirmationActivity.x));
        ConfirmationActivity.y = false;
        ConfirmationActivity.x = false;
    }

    @Override // xsna.n7r0
    public final void c(String str, n7r0.a<n7r0.d> aVar) {
        c63 c63Var = c63.a;
        if (!c63.f) {
            aVar.a();
            return;
        }
        Intent intent = new Intent(this.b, (Class<?>) ValidationActivity.class);
        intent.addFlags(268435456);
        intent.putExtra("url", str);
        ValidationActivity.H = 0;
        pro0.e(new kgb(3, this, intent));
        while (ValidationActivity.H == 0) {
            try {
                Thread.sleep(100L);
            } catch (InterruptedException unused) {
            }
        }
        if (ValidationActivity.H == 2) {
            ValidationActivity.H = 0;
            this.c.getClass();
            String h = this.c.h();
            aVar.d(new n7r0.d(this.c.I(), this.c.r(), this.c.c(), "", h));
        } else {
            aVar.a();
        }
        ValidationActivity.H = 0;
    }
}
