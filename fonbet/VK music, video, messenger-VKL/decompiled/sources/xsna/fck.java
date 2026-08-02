package xsna;

import android.content.Context;
import android.os.Bundle;
import androidx.compose.runtime.a;
import com.vk.profile.community.creationonboarding.api.models.CreationOnboardingArguments;
import com.vk.profile.community.creationonboarding.api.models.OnBoardingTaskType;
import kotlin.LazyThreadSafetyMode;
import kotlin.Pair;
import kotlin.jvm.internal.PropertyReference1Impl;
import xsna.wcy;

/* compiled from: CreationOnboardingTasksDialog.kt */
/* loaded from: classes5.dex */
public final class fck extends jmu0 {
    public static final /* synthetic */ qcy<Object>[] t1;
    public bhh h1;
    public final Object i1;
    public final Object j1;
    public final Object k1;
    public final Object l1;
    public final Object m1;
    public final Object n1;
    public final Object o1;
    public final Object p1;
    public final dck q1;
    public final kh3 r1;
    public final nzw s1;

    /* compiled from: CreationOnboardingTasksDialog.kt */
    public static final class a extends kmu0 {
        public final CreationOnboardingArguments h;
        public final bhh i;

        /* compiled from: CreationOnboardingTasksDialog.kt */
        /* renamed from: xsna.fck$a$a, reason: collision with other inner class name */
        public static final class C2864a implements fcn {
            @Override // xsna.fcn
            public final boolean M4() {
                return true;
            }

            @Override // xsna.fcn
            public final boolean N8() {
                return false;
            }

            @Override // xsna.fcn
            public final void b(boolean z) {
                b(false);
            }

            @Override // xsna.fcn
            public final void dismiss() {
                b(false);
            }

            @Override // xsna.fcn
            public final boolean v6() {
                return false;
            }
        }

        public a(Context context, CreationOnboardingArguments creationOnboardingArguments, bhh bhhVar) {
            super(context, new eck());
            this.h = creationOnboardingArguments;
            this.i = bhhVar;
            cpo cpoVar = new cpo(true, 0, 6);
            I(true);
            c(cpoVar);
            F0(true);
            x(0);
        }

        @Override // xsna.dw20.b, xsna.dw20.a
        public final dw20 f() {
            fck fckVar = new fck();
            C2864a c2864a = new C2864a();
            d0(new mh3(5, fckVar, c2864a));
            a0(new d5(6, fckVar, c2864a));
            fckVar.setArguments(yfb.b(new Pair("arguments_key", this.h)));
            fckVar.h1 = this.i;
            return fckVar;
        }
    }

    static {
        PropertyReference1Impl propertyReference1Impl = new PropertyReference1Impl(fck.class, "inlineStore", "getInlineStore()Lcom/vk/mvi/MviStore;", 0);
        fpf0.a.getClass();
        t1 = new qcy[]{propertyReference1Impl};
    }

    public fck() {
        ocg ocgVar = new ocg(this, 11);
        LazyThreadSafetyMode lazyThreadSafetyMode = LazyThreadSafetyMode.NONE;
        this.i1 = msy.a(lazyThreadSafetyMode, ocgVar);
        this.j1 = msy.a(lazyThreadSafetyMode, new y3i(this, 2));
        this.k1 = msy.a(lazyThreadSafetyMode, new x5i(this, 5));
        this.l1 = msy.a(lazyThreadSafetyMode, new xqf(this, 10));
        this.m1 = msy.a(lazyThreadSafetyMode, new sje(this, 16));
        this.n1 = msy.a(lazyThreadSafetyMode, new cwg(this, 6));
        this.o1 = msy.a(lazyThreadSafetyMode, new trf(this, 14));
        this.p1 = msy.a(lazyThreadSafetyMode, new pce(this, 15));
        this.q1 = new dck(this, 0);
        this.r1 = new kh3(this, 1);
        x3i x3iVar = new x3i(this, 5);
        int i = wcy.c;
        this.s1 = new nzw(fpf0.e(mm50.class, wcy.a.a(fpf0.d(xck.class)), wcy.a.a(fpf0.d(cck.class)), wcy.a.a(fpf0.d(tck.class))).toString(), this, x3iVar);
    }

    @Override // xsna.dw20
    public final nw20 Fn(int i, Context context) {
        return new npi(context, i);
    }

    @Override // xsna.jmu0
    public final void co(int i, androidx.compose.runtime.a aVar) {
        androidx.compose.runtime.a M = aVar.M(1433538772);
        int i2 = (M.J(this) ? 4 : 2) | i;
        if (M.t(i2 & 1, (i2 & 3) != 2)) {
            if (androidx.compose.runtime.b.d()) {
                androidx.compose.runtime.b.f(1433538772, i2, -1, "com.vk.profile.community.creationonboarding.impl.tasks.presentation.fragment.CreationOnboardingTasksDialog.ThemedContent (CreationOnboardingTasksDialog.kt:121)");
            }
            mm50<xck, cck, tck> eo = eo();
            boolean z = (i2 & 14) == 4;
            Object x = M.x();
            a.C0011a.C0012a c0012a = a.C0011a.a;
            if (z || x == c0012a) {
                x = new m1k(this, 1);
                M.R(x);
            }
            izs izsVar = (izs) x;
            if (androidx.compose.runtime.b.d()) {
                androidx.compose.runtime.b.f(2134751456, 0, -1, "com.vk.profile.community.creationonboarding.impl.tasks.presentation.compose.CreationOnBoardingTasksScreen (CreationOnBoardingTasksScreen.kt:73)");
            }
            boolean y = M.y(eo);
            Object x2 = M.x();
            if (y || x2 == c0012a) {
                x2 = new dsc(eo, 18);
                M.R(x2);
            }
            izs izsVar2 = (izs) x2;
            boolean J = M.J(izsVar);
            Object x3 = M.x();
            if (J || x3 == c0012a) {
                x3 = new sbk(izsVar, null);
                M.R(x3);
            }
            r37.a(izsVar2, (yzs) x3, qei.a, M, 384, 0);
            if (androidx.compose.runtime.b.d()) {
                androidx.compose.runtime.b.e();
            }
            if (androidx.compose.runtime.b.d()) {
                androidx.compose.runtime.b.e();
            }
        } else {
            M.h();
        }
        androidx.compose.runtime.f s = M.s();
        if (s != null) {
            s.d = new com.vk.movika.tools.controls.seekbar.u(this, i, 3);
        }
    }

    public final mm50<xck, cck, tck> eo() {
        qcy<Object> qcyVar = t1[0];
        return (mm50) this.s1.getValue();
    }

    public final void fo(OnBoardingTaskType onBoardingTaskType) {
        bhh bhhVar = this.h1;
        if (bhhVar == null) {
            bhhVar = null;
        }
        bhhVar.invoke(onBoardingTaskType);
        dismiss();
    }

    /* JADX WARN: Type inference failed for: r3v1, types: [java.lang.Object, kotlin.Lazy] */
    /* JADX WARN: Type inference failed for: r3v4, types: [java.lang.Object, kotlin.Lazy] */
    @Override // androidx.fragment.app.d, androidx.fragment.app.Fragment
    public final void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        ((p870) this.l1.getValue()).b(102, this.q1);
        ((p870) this.m1.getValue()).b(105, this.r1);
        getParentFragmentManager().l0("invite_friends_result", this, new c8(this, 9));
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, kotlin.Lazy] */
    /* JADX WARN: Type inference failed for: r0v3, types: [java.lang.Object, kotlin.Lazy] */
    @Override // androidx.fragment.app.Fragment
    public final void onDestroy() {
        super.onDestroy();
        ((p870) this.l1.getValue()).g(this.q1);
        ((p870) this.m1.getValue()).g(this.r1);
    }
}
