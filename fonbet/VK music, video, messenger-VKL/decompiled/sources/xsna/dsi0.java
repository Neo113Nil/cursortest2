package xsna;

import android.app.Activity;
import com.vk.dto.hints.Hint;
import com.vk.dto.hints.HintId;
import com.vk.profile.core.onboarding.model.ContentHintOnboardingResource;
import com.vk.profile.user.impl.ui.UserProfileAction;
import com.vk.profile.user.impl.ui.f;
import java.util.ArrayList;
import java.util.List;
import kotlin.NoWhenBranchMatchedException;
import kotlin.jvm.internal.PropertyReference1Impl;
import xsna.wg90;

/* compiled from: ServicesOnBoardingFeatureDelegate.kt */
/* loaded from: classes5.dex */
public final class dsi0 implements huq {
    public final l36 b;
    public io.reactivex.rxjava3.disposables.b c;
    public izs<? super com.vk.profile.user.impl.ui.b, s3q0> d;
    public fpq0 e;

    /* compiled from: ServicesOnBoardingFeatureDelegate.kt */
    public static final /* synthetic */ class a extends PropertyReference1Impl {
        public static final a b = new a(h8s0.class, "urlDark", "getUrlDark()Ljava/lang/String;", 0);

        @Override // kotlin.jvm.internal.PropertyReference1Impl, xsna.scy
        public final Object get(Object obj) {
            return ((h8s0) obj).d;
        }
    }

    /* compiled from: ServicesOnBoardingFeatureDelegate.kt */
    public static final /* synthetic */ class b extends PropertyReference1Impl {
        public static final b b = new b(h8s0.class, "urlLight", "getUrlLight()Ljava/lang/String;", 0);

        @Override // kotlin.jvm.internal.PropertyReference1Impl, xsna.scy
        public final Object get(Object obj) {
            return ((h8s0) obj).c;
        }
    }

    public dsi0(l36 l36Var) {
        this.b = l36Var;
    }

    public static ContentHintOnboardingResource.Contents.ServicesContents b(List list, izs izsVar) {
        List<h8s0> list2 = list;
        ArrayList arrayList = new ArrayList(c5g.u(list2, 10));
        for (h8s0 h8s0Var : list2) {
            arrayList.add(new ContentHintOnboardingResource.RemoteContentResource(h8s0Var.a, h8s0Var.b, new ContentHintOnboardingResource.ContentUrl.Video((String) izsVar.invoke(h8s0Var)), h8s0Var.e));
        }
        return new ContentHintOnboardingResource.Contents.ServicesContents(arrayList);
    }

    @Override // xsna.huq
    public final void H(fpq0 fpq0Var) {
        this.e = fpq0Var;
    }

    @Override // xsna.ruu
    public final izs<com.vk.profile.user.impl.ui.b, s3q0> L() {
        izs izsVar = this.d;
        if (izsVar != null) {
            return izsVar;
        }
        return null;
    }

    public final void a(UserProfileAction.p.a aVar) {
        if (!(aVar instanceof UserProfileAction.p.a.b)) {
            if (!(aVar instanceof UserProfileAction.p.a.C1689a)) {
                throw new NoWhenBranchMatchedException();
            }
            l7v b2 = ((wvw) this.b.a).b();
            Hint p = b2.p(HintId.PROFILE_REDESIGN_SERVICES_MENU_BANNER.getId());
            if (p != null) {
                b2.s(p);
                return;
            }
            return;
        }
        wg90 wg90Var = ((UserProfileAction.p.a.b) aVar).b.e;
        if (!(wg90Var instanceof wg90.a)) {
            if (wg90Var != null) {
                throw new NoWhenBranchMatchedException();
            }
            return;
        }
        fpq0 fpq0Var = this.e;
        if (fpq0Var == null) {
            fpq0Var = null;
        }
        wg90.a aVar2 = (wg90.a) wg90Var;
        fpq0Var.B(new f.c.t(new ContentHintOnboardingResource(b(aVar2.a, a.b), b(aVar2.a, b.b))));
    }

    @Override // xsna.huq
    public final void i(io.reactivex.rxjava3.disposables.b bVar) {
        this.c = bVar;
    }

    @Override // xsna.ruu
    public final void r(r9c0 r9c0Var) {
        this.d = r9c0Var;
    }

    @Override // xsna.huq
    public final void j() {
    }

    @Override // xsna.huq
    public final void onDestroy() {
    }

    @Override // xsna.huq
    public final void onPause() {
    }

    @Override // xsna.huq
    public final void onResume() {
    }

    @Override // xsna.huq
    public final void onStart() {
    }

    @Override // xsna.huq
    public final void onStop() {
    }

    @Override // xsna.huq
    public final void k(u5p0 u5p0Var) {
    }

    @Override // xsna.huq
    public final void m(Activity activity) {
    }

    @Override // xsna.huq
    public final void J(com.vk.profile.user.impl.ui.g gVar, UserProfileAction.a aVar) {
    }
}
