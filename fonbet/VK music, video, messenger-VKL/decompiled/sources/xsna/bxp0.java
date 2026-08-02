package xsna;

import android.app.Activity;
import android.content.Context;
import android.content.ContextWrapper;
import android.os.Bundle;
import androidx.appcompat.app.AppCompatActivity;
import androidx.lifecycle.Lifecycle;
import com.vk.auth.api.models.AuthResult;
import com.vk.auth.emailactualization.EmailActualizationMetadataResult;
import com.vk.core.fragments.FragmentEntry;
import com.vk.navigation.NavigationDelegateActivity;
import io.reactivex.rxjava3.internal.functions.a;
import kotlin.jvm.internal.Ref$ObjectRef;
import xsna.c63;

/* compiled from: UIRebuilderDelegate.kt */
/* loaded from: classes7.dex */
public final class bxp0 {

    /* compiled from: UIRebuilderDelegate.kt */
    public static final /* synthetic */ class a {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;

        static {
            int[] iArr = new int[EmailActualizationMetadataResult.values().length];
            try {
                iArr[EmailActualizationMetadataResult.SUCCESS.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[EmailActualizationMetadataResult.ERROR.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            $EnumSwitchMapping$0 = iArr;
        }
    }

    /* compiled from: UIRebuilderDelegate.kt */
    public static final class b extends c63.b {
        public final /* synthetic */ izs<ww50<?>, s3q0> b;

        /* JADX WARN: Multi-variable type inference failed */
        public b(izs<? super ww50<?>, s3q0> izsVar) {
            this.b = izsVar;
        }

        @Override // xsna.c63.b
        public final void m(Activity activity) {
            ww50<?> v = s200.v(activity);
            if (v != null) {
                this.b.invoke(v);
            }
            c63 c63Var = c63.a;
            c63.c(this);
        }

        @Override // xsna.c63.b
        public final void p(Activity activity) {
            ww50<?> v = s200.v(activity);
            if (v != null) {
                this.b.invoke(v);
            }
            c63 c63Var = c63.a;
            c63.c(this);
        }
    }

    public static void a(izs izsVar) {
        AppCompatActivity appCompatActivity;
        boolean z;
        c63 c63Var = c63.a;
        Context b2 = c63.b();
        if (b2 != null) {
            while (true) {
                z = b2 instanceof AppCompatActivity;
                if (z || !(b2 instanceof ContextWrapper)) {
                    break;
                } else {
                    b2 = ((ContextWrapper) b2).getBaseContext();
                }
            }
            appCompatActivity = (AppCompatActivity) (z ? (Activity) b2 : null);
        } else {
            appCompatActivity = null;
        }
        ww50 v = appCompatActivity != null ? s200.v(appCompatActivity) : null;
        if (appCompatActivity != null && v != null && appCompatActivity.getLifecycle().getCurrentState().a(Lifecycle.State.RESUMED)) {
            izsVar.invoke(v);
        } else {
            c63 c63Var2 = c63.a;
            c63.a(new b(izsVar));
        }
    }

    public static io.reactivex.rxjava3.core.q b(io.reactivex.rxjava3.internal.operators.observable.b0 b0Var, AuthResult authResult, ymj0 ymj0Var, zzl0 zzl0Var, hwi0 hwi0Var) {
        return (!sv1.r(authResult.r) && authResult.o.f) ? new io.reactivex.rxjava3.internal.operators.observable.z(b0Var, new dpo0(new sub(ymj0Var, zzl0Var, hwi0Var, 5), 1)) : b0Var;
    }

    public static io.reactivex.rxjava3.internal.operators.observable.b0 c(io.reactivex.rxjava3.internal.operators.observable.a aVar, final AuthResult authResult, final boolean z) {
        a.k kVar = io.reactivex.rxjava3.internal.functions.a.c;
        a.l lVar = io.reactivex.rxjava3.internal.functions.a.d;
        if (authResult != null && !sv1.r(authResult.r) && !z) {
            return aVar.E(lVar, lVar, kVar, new vdq(authResult, 7));
        }
        final Ref$ObjectRef ref$ObjectRef = new Ref$ObjectRef();
        final Ref$ObjectRef ref$ObjectRef2 = new Ref$ObjectRef();
        final Ref$ObjectRef ref$ObjectRef3 = new Ref$ObjectRef();
        return new io.reactivex.rxjava3.internal.operators.observable.z(new io.reactivex.rxjava3.internal.operators.observable.c0(aVar, new a8v(new j20(28, ref$ObjectRef, ref$ObjectRef2), 22), kVar), new j7l0(new hyl0(z, ref$ObjectRef, ref$ObjectRef3), 5)).F(new nan0(new flo0(z, 1), 1)).E(lVar, lVar, kVar, new io.reactivex.rxjava3.functions.a() { // from class: xsna.axp0
            /* JADX WARN: Multi-variable type inference failed */
            @Override // io.reactivex.rxjava3.functions.a
            public final void run() {
                Object Y;
                Bundle bundle;
                FragmentEntry fragmentEntry = (FragmentEntry) ref$ObjectRef.element;
                FragmentEntry fragmentEntry2 = (FragmentEntry) ref$ObjectRef2.element;
                AuthResult authResult2 = AuthResult.this;
                boolean z2 = z;
                zwp0 zwp0Var = new zwp0(authResult2, z2, fragmentEntry, fragmentEntry2);
                c63 c63Var = c63.a;
                Activity b2 = c63.b();
                if (b2 == null || (Y = s200.v(b2)) == null) {
                    NavigationDelegateActivity a2 = x93.a();
                    Y = a2 != null ? a2.Y() : null;
                }
                if (Y != null) {
                    zwp0Var.invoke(Y);
                }
                if (authResult2 != null && (sv1.r(authResult2.r) || !z2)) {
                    i0q0.f(new t9b(17, ref$ObjectRef3, authResult2));
                }
                if (authResult2 == null || (bundle = authResult2.r) == null || sv1.r(bundle) || rte0.o(bundle) == null) {
                    return;
                }
                i0q0.f(new cck0(bundle, 9));
            }
        });
    }
}
