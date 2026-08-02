package xsna;

import android.content.Context;
import androidx.compose.runtime.a;
import com.vk.profile.community.creationonboarding.api.models.CommunityCreationOnboardingFinishArguments;
import com.vk.profile.community.creationonboarding.impl.finish.presentation.feature.CommunityCreationOnboardingFinishState;
import kotlin.LazyThreadSafetyMode;
import kotlin.Pair;
import kotlin.jvm.internal.PropertyReference1Impl;
import xsna.dh6;
import xsna.wcy;

/* compiled from: CommunityCreationOnboardingFinishDialog.kt */
/* loaded from: classes5.dex */
public final class nzg extends jmu0 {
    public static final /* synthetic */ qcy<Object>[] k1;
    public final Object h1;
    public final Object i1;
    public final nzw j1;

    static {
        PropertyReference1Impl propertyReference1Impl = new PropertyReference1Impl(nzg.class, "inlineStore", "getInlineStore()Lcom/vk/mvi/MviStore;", 0);
        fpf0.a.getClass();
        k1 = new qcy[]{propertyReference1Impl};
    }

    public nzg() {
        qc qcVar = new qc(this, 24);
        LazyThreadSafetyMode lazyThreadSafetyMode = LazyThreadSafetyMode.NONE;
        this.h1 = msy.a(lazyThreadSafetyMode, qcVar);
        this.i1 = msy.a(lazyThreadSafetyMode, new i5f(this, 4));
        pff pffVar = new pff(this, 5);
        int i = wcy.c;
        this.j1 = new nzw(fpf0.e(mm50.class, wcy.a.a(fpf0.d(CommunityCreationOnboardingFinishState.class)), wcy.a.a(fpf0.d(com.vk.profile.community.creationonboarding.impl.finish.presentation.feature.a.class)), wcy.a.a(fpf0.d(pzg.class))).toString(), this, pffVar);
    }

    @Override // xsna.dw20
    public final nw20 Fn(int i, Context context) {
        return new npi(context, i);
    }

    @Override // xsna.jmu0
    public final void co(int i, androidx.compose.runtime.a aVar) {
        androidx.compose.runtime.a M = aVar.M(987067731);
        int i2 = (M.J(this) ? 4 : 2) | i;
        if (M.t(i2 & 1, (i2 & 3) != 2)) {
            if (androidx.compose.runtime.b.d()) {
                androidx.compose.runtime.b.f(987067731, i2, -1, "com.vk.profile.community.creationonboarding.impl.finish.presentation.fragment.CommunityCreationOnboardingFinishDialog.ThemedContent (CommunityCreationOnboardingFinishDialog.kt:47)");
            }
            qcy<Object> qcyVar = k1[0];
            mm50 mm50Var = (mm50) this.j1.getValue();
            boolean z = (i2 & 14) == 4;
            Object x = M.x();
            a.C0011a.C0012a c0012a = a.C0011a.a;
            if (z || x == c0012a) {
                x = new e1(this, 29);
                M.R(x);
            }
            izs izsVar = (izs) x;
            if (androidx.compose.runtime.b.d()) {
                androidx.compose.runtime.b.f(-1549809083, 0, -1, "com.vk.profile.community.creationonboarding.impl.finish.presentation.compose.CommunityCreationOnboardingFinishScreen (CommunityCreationOnboardingFinishScreen.kt:59)");
            }
            boolean y = M.y(mm50Var);
            Object x2 = M.x();
            if (y || x2 == c0012a) {
                x2 = new wl0(mm50Var, 25);
                M.R(x2);
            }
            izs izsVar2 = (izs) x2;
            boolean J = M.J(izsVar);
            Object x3 = M.x();
            if (J || x3 == c0012a) {
                x3 = new tzg(izsVar, null);
                M.R(x3);
            }
            r37.a(izsVar2, (yzs) x3, idi.a, M, 384, 0);
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
            s.d = new bh5(this, i, 1);
        }
    }

    /* compiled from: CommunityCreationOnboardingFinishDialog.kt */
    public static final class a extends kmu0 {
        public final CommunityCreationOnboardingFinishArguments h;

        /* compiled from: CommunityCreationOnboardingFinishDialog.kt */
        public static final class b implements fcn {
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

        public a(Context context, CommunityCreationOnboardingFinishArguments communityCreationOnboardingFinishArguments) {
            super(context, new C3427a());
            this.h = communityCreationOnboardingFinishArguments;
            cpo cpoVar = new cpo(true, 0, 6);
            I(true);
            c(cpoVar);
            F0(true);
            x(0);
        }

        @Override // xsna.dw20.b, xsna.dw20.a
        public final dw20 f() {
            nzg nzgVar = new nzg();
            b bVar = new b();
            d0(new vq6(4, nzgVar, bVar));
            a0(new com.vk.movika.sdk.base.flow.binding.g(8, nzgVar, bVar));
            nzgVar.setArguments(yfb.b(new Pair("arguments_key", this.h)));
            return nzgVar;
        }

        /* compiled from: CommunityCreationOnboardingFinishDialog.kt */
        /* renamed from: xsna.nzg$a$a, reason: collision with other inner class name */
        public static final class C3427a implements dh6.a {
            @Override // xsna.dh6.a
            public final void a() {
            }

            @Override // xsna.dh6.a
            public final void b() {
            }
        }
    }
}
