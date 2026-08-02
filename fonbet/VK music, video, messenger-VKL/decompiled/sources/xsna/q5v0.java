package xsna;

import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import com.vk.auth.main.AuthActivity;
import com.vk.navigation.NavigationDelegateActivity;
import com.vkontakte.android.MainActivity;
import com.vkontakte.android.VKActivity;
import xsna.c63;

/* compiled from: VkMusicActivityLaunchManager.kt */
/* loaded from: classes.dex */
public final class q5v0 implements c940 {
    public a a;

    /* compiled from: VkMusicActivityLaunchManager.kt */
    /* loaded from: classes3.dex */
    public static final class a extends c63.b {
        public final q5v0 b;
        public final izs<Activity, s3q0> c;

        public a(q5v0 q5v0Var, izs izsVar) {
            this.b = q5v0Var;
            this.c = izsVar;
        }

        @Override // xsna.c63.b
        public final void p(Activity activity) {
            c63 c63Var = c63.a;
            c63.c(this);
            this.b.a(this.c);
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v3 */
    /* JADX WARN: Type inference failed for: r0v4, types: [com.vk.navigation.NavigationDelegateActivity] */
    /* JADX WARN: Type inference failed for: r0v5, types: [android.content.Context] */
    /* JADX WARN: Type inference failed for: r0v6, types: [android.content.Context] */
    /* JADX WARN: Type inference failed for: r0v7 */
    /* JADX WARN: Type inference failed for: r0v9 */
    @Override // xsna.c940
    public final void a(izs<? super Activity, s3q0> izsVar) {
        c63 c63Var = c63.a;
        Activity b = c63.b();
        if (b instanceof AuthActivity) {
            a aVar = this.a;
            if (aVar != null) {
                c63.c(aVar);
                return;
            }
            return;
        }
        boolean isInstance = VKActivity.class.isInstance(b);
        if (b != null && isInstance && c63.f) {
            izsVar.invoke(b);
            return;
        }
        Activity b2 = c63.b();
        ?? r0 = b2 instanceof NavigationDelegateActivity ? (NavigationDelegateActivity) b2 : 0;
        Class<MainActivity> i = his0.i(r0);
        if (i == null) {
            i = MainActivity.class;
        }
        if (r0 == 0 && (r0 = e43.a) == 0) {
            r0 = 0;
        }
        Context context = e43.a;
        Intent intent = new Intent(context != null ? context : null, i);
        fdi.f(r0, intent);
        intent.addFlags(603979776);
        a aVar2 = new a(this, izsVar);
        c63.a(aVar2);
        this.a = aVar2;
        r0.startActivity(intent);
    }
}
