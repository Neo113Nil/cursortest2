package defpackage;

import android.content.Context;
import android.content.Intent;
import android.graphics.Typeface;
import android.net.Uri;
import android.util.TypedValue;
import androidx.fragment.app.Fragment;
import com.ybsdk.core.mvp.BaseMvvmFragment;
import java.util.concurrent.atomic.AtomicReferenceFieldUpdater;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import ru.CryptoPro.JCP.tools.SelfTester_JCP;
import ru.yandex.taxi.masstransit.model.RouteType;

/* loaded from: classes11.dex */
public abstract class cua1 {
    public static final Typeface a(buj0 buj0Var, Context context) {
        return wuj0.b(buj0Var.a, context);
    }

    public static final Object b(buj0 buj0Var, Context context, Continuation continuation) {
        j18 j18Var = new j18(1, dvw.b(continuation));
        j18Var.u();
        int i = buj0Var.a;
        n92 n92Var = new n92(j18Var, buj0Var);
        ThreadLocal threadLocal = wuj0.a;
        if (context.isRestricted()) {
            n92Var.a(-4);
        } else {
            wuj0.c(context, i, new TypedValue(), 0, n92Var, false, false);
        }
        Object s = j18Var.s();
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        return s;
    }

    public static final int c(RouteType routeType) {
        int i = wel0.a[routeType.ordinal()];
        return i != 1 ? i != 2 ? i != 4 ? i != 5 ? i != 6 ? i != 7 ? tog0.mt_fallback_color : tog0.mt_ship_color : tog0.mt_train_color : tog0.mt_trolley_color : tog0.mt_tram_color : tog0.mt_minibus_color : tog0.mt_bus_color;
    }

    public static final void d(Fragment fragment) {
        Intent intent = new Intent("android.settings.APPLICATION_DETAILS_SETTINGS");
        intent.setData(Uri.parse("package:" + fragment.requireActivity().getPackageName()));
        intent.addFlags(SelfTester_JCP.IMITA);
        rje.k(fragment.requireActivity(), intent);
    }

    public static final String e(BaseMvvmFragment baseMvvmFragment) {
        String tag = baseMvvmFragment.getTag();
        if (tag != null) {
            return tag;
        }
        x4c.g("There is no tag for fragment", null, "Fragment name: ".concat(baseMvvmFragment.getClass().getName()), null, 10);
        return "<no tag>";
    }

    public static /* synthetic */ boolean f(AtomicReferenceFieldUpdater atomicReferenceFieldUpdater, ql91 ql91Var, Object obj, Object obj2) {
        while (!atomicReferenceFieldUpdater.compareAndSet(ql91Var, obj, obj2)) {
            if (atomicReferenceFieldUpdater.get(ql91Var) != obj && atomicReferenceFieldUpdater.get(ql91Var) != obj) {
                return false;
            }
        }
        return true;
    }
}
