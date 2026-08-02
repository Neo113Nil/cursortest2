package xsna;

import android.app.Activity;
import android.app.Dialog;
import android.content.Context;
import android.content.Intent;
import android.content.res.Configuration;
import android.os.Bundle;
import android.view.Window;
import com.vk.core.fragments.FragmentImpl;
import com.vk.log.L;
import com.vk.navigation.NavigationDelegateActivity;
import xsna.ikv0;

/* compiled from: VkSnackbarExt.kt */
/* loaded from: classes18.dex */
public final class pkv0 {
    public static final void a(ikv0 ikv0Var, io.reactivex.rxjava3.disposables.b bVar) {
        bVar.b(new io.reactivex.rxjava3.disposables.f(new nq4(ikv0Var, 12)));
    }

    public static final void b(ikv0 ikv0Var, FragmentImpl fragmentImpl) {
        fragmentImpl.D.a(new a(ikv0Var, fragmentImpl));
    }

    public static final Window c(Context context, CharSequence charSequence) {
        Window window;
        ww50<?> Y;
        Activity h = e3m.h(context);
        if (h != null && !(h instanceof NavigationDelegateActivity) && h.getWindow() != null) {
            return h.getWindow();
        }
        if (h == null) {
            c63 c63Var = c63.a;
            h = c63.b();
            if (h == null) {
                h = x93.a();
            }
        }
        if (h == null) {
            L.l("For correct show snackbar you must pass activity");
            if (charSequence != null) {
                cvk.w(charSequence, false);
                return null;
            }
        } else {
            if (h instanceof lkv0) {
                return h.getWindow();
            }
            ey50 ey50Var = h instanceof ey50 ? (ey50) h : null;
            Object z = (ey50Var == null || (Y = ey50Var.Y()) == null) ? null : Y.z();
            if (z == null || (z instanceof Dialog)) {
                Dialog dialog = z instanceof Dialog ? (Dialog) z : null;
                return (dialog == null || (window = dialog.getWindow()) == null) ? h.getWindow() : window;
            }
            if (z instanceof ni90) {
                Dialog x2 = ((ni90) z).x2();
                if (x2 != null) {
                    return x2.getWindow();
                }
            } else if (z instanceof dw20) {
                Dialog dialog2 = ((androidx.fragment.app.d) z).s;
                if (dialog2 != null) {
                    return dialog2.getWindow();
                }
            } else {
                L.l("Found Dismissed instance but cannot find dialog");
                if (charSequence != null) {
                    cvk.w(charSequence, false);
                }
            }
        }
        return null;
    }

    public static final void d(ikv0 ikv0Var, Context context, String str) {
        utj utjVar = ikv0Var.b;
        Window c = c(context, str);
        if (c == null) {
            utjVar.e();
            return;
        }
        int i = ikv0.e;
        ikv0.b.a(c);
        utjVar.f(c);
    }

    public static final void e(ikv0.a aVar) {
        int i;
        Activity h = e3m.h(aVar.a);
        if (h != null) {
            NavigationDelegateActivity navigationDelegateActivity = h instanceof NavigationDelegateActivity ? (NavigationDelegateActivity) h : null;
            i = (navigationDelegateActivity != null ? navigationDelegateActivity.Y().z() : null) instanceof dw20 ? 0 : utj.s;
        } else {
            i = utj.s;
        }
        aVar.e(i);
    }

    public static final ikv0 f(ikv0.a aVar) {
        ikv0.d.c a2;
        Context context = aVar.a;
        ikv0.d dVar = aVar.u;
        Window c = c(context, (dVar == null || (a2 = dVar.a()) == null) ? null : a2.a);
        if (c != null) {
            return aVar.p(c);
        }
        return null;
    }

    public static final void g(ikv0.a aVar, long j) {
        ikv0.d.c a2;
        Context context = aVar.a;
        ikv0.d dVar = aVar.u;
        Window c = c(context, (dVar == null || (a2 = dVar.a()) == null) ? null : a2.a);
        if (c == null) {
            return;
        }
        if (j == 0) {
            aVar.p(c);
        } else {
            i0q0.d(j, new ew4(5, aVar, c));
        }
    }

    /* compiled from: VkSnackbarExt.kt */
    public static final class a implements obs {
        public final /* synthetic */ ikv0 b;
        public final /* synthetic */ FragmentImpl c;

        public a(ikv0 ikv0Var, FragmentImpl fragmentImpl) {
            this.b = ikv0Var;
            this.c = fragmentImpl;
        }

        @Override // xsna.obs
        public final void onPause() {
            this.b.a();
            this.c.D.d(this);
        }

        @Override // xsna.obs
        public final void b() {
        }

        @Override // xsna.obs
        public final void c() {
        }

        @Override // xsna.obs
        public final void onDestroy() {
        }

        @Override // xsna.obs
        public final void onDestroyView() {
        }

        @Override // xsna.obs
        public final void onResume() {
        }

        @Override // xsna.obs
        public final void onStop() {
        }

        @Override // xsna.obs
        public final void onConfigurationChanged(Configuration configuration) {
        }

        @Override // xsna.obs
        public final void onCreate(Bundle bundle) {
        }

        @Override // xsna.obs
        public final void onActivityResult(int i, int i2, Intent intent) {
        }
    }
}
