package xsna;

import android.content.Context;
import android.content.Intent;

/* compiled from: AccountAvatarUpdaterImpl.kt */
/* loaded from: classes.dex */
public final class in implements hn {
    @Override // xsna.hn
    public final void a(tr5 tr5Var) {
        n6r0 A = o25.a().A();
        A.d(tr5Var.b(), tr5Var.c());
        A.b(tr5Var.a(), tr5Var.c());
        A.commit();
        Intent putExtra = new Intent("com.vkontakte.android.ACTION_PROFILE_UPDATED").putExtra("uid", o25.a().c());
        Context context = e43.a;
        if (context == null) {
            context = null;
        }
        n2i0.a(context, hf8.a, putExtra);
    }
}
