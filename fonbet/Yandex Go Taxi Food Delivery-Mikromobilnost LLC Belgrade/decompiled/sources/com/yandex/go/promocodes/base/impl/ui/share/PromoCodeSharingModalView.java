package com.yandex.go.promocodes.base.impl.ui.share;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import com.yandex.go.promocodes.base.impl.ui.share.v1.PromocodeSharingView;
import com.yandex.go.promocodes.base.impl.ui.share.v2.PromocodeSharingViewV2;
import com.yandex.go.promocodes.referral.api.net.dto.ReferralCode;
import com.yandex.go.promocodes.referral.impl.provider.k;
import defpackage.apf;
import defpackage.bnf0;
import defpackage.bvf0;
import defpackage.c0g;
import defpackage.cnf0;
import defpackage.dnf0;
import defpackage.dvh0;
import defpackage.e230;
import defpackage.enf0;
import defpackage.fnf0;
import defpackage.ip11;
import defpackage.ity;
import defpackage.jqr;
import defpackage.k3c;
import defpackage.k7x0;
import defpackage.l8x;
import defpackage.lh2;
import defpackage.lx4;
import defpackage.nni0;
import defpackage.oz01;
import defpackage.pav;
import defpackage.pse;
import defpackage.q5z;
import defpackage.r0d0;
import defpackage.tje;
import defpackage.tmf0;
import defpackage.tse;
import defpackage.umf0;
import defpackage.v770;
import defpackage.vjr0;
import defpackage.w511;
import defpackage.wmf0;
import defpackage.xdf;
import defpackage.xw31;
import defpackage.y130;
import defpackage.y6h0;
import defpackage.ymf0;
import defpackage.zmf0;
import defpackage.zuj0;
import defpackage.zzf;
import kotlin.Metadata;
import kotlinx.coroutines.flow.e;
import kotlinx.coroutines.flow.o;
import ru.yandex.common.clid.ClidProvider;
import ru.yandex.taxi.widget.ModalView;
import ru.yandex.taxi.widget.c;

@Metadata(d1 = {"\u0000v\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\u0018\u00002\u00020\u00012\u00020\u0002:\u00014B?\b\u0007\u0012\b\b\u0001\u0010\u0004\u001a\u00020\u0003\u0012\b\b\u0001\u0010\u0006\u001a\u00020\u0005\u0012\b\b\u0001\u0010\b\u001a\u00020\u0007\u0012\u0006\u0010\n\u001a\u00020\t\u0012\u0006\u0010\f\u001a\u00020\u000b\u0012\u0006\u0010\u000e\u001a\u00020\r¢\u0006\u0004\b\u000f\u0010\u0010J#\u0010\u0016\u001a\u00020\u00152\u0006\u0010\u0012\u001a\u00020\u00112\n\b\u0002\u0010\u0014\u001a\u0004\u0018\u00010\u0013H\u0002¢\u0006\u0004\b\u0016\u0010\u0017J#\u0010\u0018\u001a\u00020\u00152\u0006\u0010\u0012\u001a\u00020\u00112\n\b\u0002\u0010\u0014\u001a\u0004\u0018\u00010\u0013H\u0002¢\u0006\u0004\b\u0018\u0010\u0017J\u000f\u0010\u001a\u001a\u00020\u0019H\u0014¢\u0006\u0004\b\u001a\u0010\u001bJ\u000f\u0010\u001d\u001a\u00020\u001cH\u0014¢\u0006\u0004\b\u001d\u0010\u001eJ\u000f\u0010\u001f\u001a\u00020\u0015H\u0014¢\u0006\u0004\b\u001f\u0010 J\u000f\u0010!\u001a\u00020\u0015H\u0014¢\u0006\u0004\b!\u0010 J\u0017\u0010$\u001a\u00020\u00152\u0006\u0010#\u001a\u00020\"H\u0016¢\u0006\u0004\b$\u0010%R\u0014\u0010\u0006\u001a\u00020\u00058\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0006\u0010&R\u0014\u0010\b\u001a\u00020\u00078\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\b\u0010'R\u0014\u0010\n\u001a\u00020\t8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\n\u0010(R\u0014\u0010\f\u001a\u00020\u000b8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\f\u0010)R\u0014\u0010\u000e\u001a\u00020\r8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u000e\u0010*R\u0014\u0010,\u001a\u00020+8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b,\u0010-R\u0014\u0010/\u001a\u00020.8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b/\u00100R\u0018\u00102\u001a\u0004\u0018\u0001018\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b2\u00103¨\u00065"}, d2 = {"Lcom/yandex/go/promocodes/base/impl/ui/share/PromoCodeSharingModalView;", "Lru/yandex/taxi/widget/ModalView;", "Lbnf0;", "Landroid/content/Context;", "context", "Lv770;", "openReason", "Lumf0;", "navigator", "Lnni0;", "referralCodesProvider", "Lzmf0;", "presenter", "Ldnf0;", "componentDependencies", "<init>", "(Landroid/content/Context;Lv770;Lumf0;Lnni0;Lzmf0;Ldnf0;)V", "Lcnf0;", "shareComponent", "Lcom/yandex/go/promocodes/referral/api/net/dto/ReferralCode;", "referralCode", "Lzy11;", "setupContentView", "(Lcnf0;Lcom/yandex/go/promocodes/referral/api/net/dto/ReferralCode;)V", "setupContentViewV2", "Le230;", "insetsType", "()Le230;", "Landroid/view/View;", "contentView", "()Landroid/view/View;", "onAttachedToWindow", "()V", "onDetachedFromWindow", "Lcom/yandex/go/promocodes/base/impl/ui/share/PromoCodeShareViewHolderState;", ClidProvider.STATE, "setShareState", "(Lcom/yandex/go/promocodes/base/impl/ui/share/PromoCodeShareViewHolderState;)V", "Lv770;", "Lumf0;", "Lnni0;", "Lzmf0;", "Ldnf0;", "Landroid/widget/FrameLayout;", "container", "Landroid/widget/FrameLayout;", "Ltse;", "mainScope", "Ltse;", "Ll8x;", "job", "Ll8x;", "gnf0", "impl"}, k = 1, mv = {2, 4, 0}, xi = 48)
/* loaded from: classes13.dex */
public final class PromoCodeSharingModalView extends ModalView implements bnf0 {
    private final dnf0 componentDependencies;
    private final FrameLayout container;
    private l8x job;
    private final tse mainScope;
    private final umf0 navigator;
    private final v770 openReason;
    private final zmf0 presenter;
    private final nni0 referralCodesProvider;

    public PromoCodeSharingModalView(Context context, v770 v770Var, umf0 umf0Var, nni0 nni0Var, zmf0 zmf0Var, dnf0 dnf0Var) {
        super(context);
        this.openReason = v770Var;
        this.navigator = umf0Var;
        this.referralCodesProvider = nni0Var;
        this.presenter = zmf0Var;
        this.componentDependencies = dnf0Var;
        this.mainScope = bvf0.M(bvf0.b(), new pse("PromoCodeSharingModalView"));
        this.container = (FrameLayout) LayoutInflater.from(getContext()).inflate(dvh0.promocode_sharing_modal_view, (ViewGroup) this, true).findViewById(y6h0.container);
        setAnimationDelegate(lh2.c);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final View insetsType$lambda$0(PromoCodeSharingModalView promoCodeSharingModalView) {
        FrameLayout frameLayout = promoCodeSharingModalView.container;
        View childAt = frameLayout.getChildCount() == 1 ? frameLayout.getChildAt(0) : null;
        xw31.G(0, frameLayout);
        if (childAt == null) {
            return frameLayout;
        }
        xw31.G(0, childAt);
        return childAt;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void setupContentView(cnf0 shareComponent, ReferralCode referralCode) {
        apf apfVar = (apf) shareComponent;
        apfVar.getClass();
        dnf0 dnf0Var = (dnf0) apfVar.b;
        c0g c0gVar = (c0g) dnf0Var;
        Context e2 = c0gVar.e2();
        q5z.h(e2);
        umf0 umf0Var = (umf0) apfVar.c;
        zzf zzfVar = c0gVar.z;
        nni0 nni0Var = (nni0) zzfVar.ok.get();
        q5z.h(nni0Var);
        k3c d2 = c0gVar.d2();
        vjr0 vjr0Var = (vjr0) c0gVar.pu.get();
        q5z.h(vjr0Var);
        lx4 lx4Var = (lx4) ((c0g) dnf0Var).z.Y.get();
        q5z.h(lx4Var);
        tmf0 tmf0Var = new tmf0(lx4Var, (v770) apfVar.w);
        zuj0 N2 = c0gVar.N2();
        q5z.h(N2);
        k7x0 Z2 = c0gVar.Z2();
        q5z.h(Z2);
        xdf g2 = c0gVar.g2();
        q5z.h(g2);
        oz01 oz01Var = (oz01) zzfVar.la.get();
        q5z.h(oz01Var);
        wmf0 wmf0Var = new wmf0(nni0Var, d2, vjr0Var, tmf0Var, N2, Z2, g2, oz01Var, (ity) apfVar.x);
        pav w2 = c0gVar.w2();
        q5z.h(w2);
        PromocodeSharingView promocodeSharingView = new PromocodeSharingView(e2, umf0Var, wmf0Var, w2);
        promocodeSharingView.setInitialReferralCode$impl(referralCode);
        this.container.removeAllViews();
        this.container.addView(promocodeSharingView);
        post(new enf0(this, 0));
    }

    public static /* synthetic */ void setupContentView$default(PromoCodeSharingModalView promoCodeSharingModalView, cnf0 cnf0Var, ReferralCode referralCode, int i, Object obj) {
        if ((i & 2) != 0) {
            referralCode = null;
        }
        promoCodeSharingModalView.setupContentView(cnf0Var, referralCode);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void setupContentViewV2(cnf0 shareComponent, ReferralCode referralCode) {
        apf apfVar = (apf) shareComponent;
        apfVar.getClass();
        dnf0 dnf0Var = (dnf0) apfVar.b;
        c0g c0gVar = (c0g) dnf0Var;
        Context e2 = c0gVar.e2();
        q5z.h(e2);
        umf0 umf0Var = (umf0) apfVar.c;
        nni0 nni0Var = (nni0) c0gVar.z.ok.get();
        q5z.h(nni0Var);
        k3c d2 = c0gVar.d2();
        vjr0 vjr0Var = (vjr0) c0gVar.pu.get();
        q5z.h(vjr0Var);
        lx4 lx4Var = (lx4) ((c0g) dnf0Var).z.Y.get();
        q5z.h(lx4Var);
        tmf0 tmf0Var = new tmf0(lx4Var, (v770) apfVar.w);
        zuj0 N2 = c0gVar.N2();
        q5z.h(N2);
        k7x0 Z2 = c0gVar.Z2();
        q5z.h(Z2);
        xdf g2 = c0gVar.g2();
        q5z.h(g2);
        c r2 = c0gVar.r2();
        q5z.h(r2);
        ymf0 ymf0Var = new ymf0(nni0Var, d2, vjr0Var, tmf0Var, N2, Z2, g2, r2);
        pav w2 = c0gVar.w2();
        q5z.h(w2);
        ip11 u = c0gVar.u();
        q5z.h(u);
        PromocodeSharingViewV2 promocodeSharingViewV2 = new PromocodeSharingViewV2(e2, umf0Var, ymf0Var, w2, u);
        promocodeSharingViewV2.setInitialReferralCode$impl(referralCode);
        this.container.removeAllViews();
        this.container.addView(promocodeSharingViewV2);
        post(new enf0(this, 1));
    }

    public static /* synthetic */ void setupContentViewV2$default(PromoCodeSharingModalView promoCodeSharingModalView, cnf0 cnf0Var, ReferralCode referralCode, int i, Object obj) {
        if ((i & 2) != 0) {
            referralCode = null;
        }
        promoCodeSharingModalView.setupContentViewV2(cnf0Var, referralCode);
    }

    @Override // ru.yandex.taxi.widget.ModalView
    /* renamed from: contentView */
    public View getContentView() {
        return this.container;
    }

    @Override // ru.yandex.taxi.widget.ModalView
    public e230 insetsType() {
        return new y130(1, new r0d0(28, this));
    }

    @Override // ru.yandex.taxi.widget.ModalView, android.view.ViewGroup, android.view.View
    public void onAttachedToWindow() {
        super.onAttachedToWindow();
        zmf0 zmf0Var = this.presenter;
        zmf0Var.Bg(this);
        tje.N(zmf0Var.Jg(), null, null, new PromoCodeShareViewHolderPresenter$attachView$1(zmf0Var, this, null), 3);
    }

    @Override // ru.yandex.taxi.widget.ModalView, android.view.ViewGroup, android.view.View
    public void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        l8x l8xVar = this.job;
        if (l8xVar != null) {
            l8xVar.a(null);
        }
        this.presenter.Cg();
    }

    @Override // defpackage.bnf0
    public void setShareState(PromoCodeShareViewHolderState state) {
        dnf0 dnf0Var = this.componentDependencies;
        umf0 umf0Var = this.navigator;
        ity ityVar = new ity();
        v770 v770Var = this.openReason;
        dnf0Var.getClass();
        umf0Var.getClass();
        v770Var.getClass();
        apf apfVar = new apf(dnf0Var, umf0Var, ityVar, v770Var);
        int i = fnf0.a[state.ordinal()];
        if (i == 1) {
            setupContentView$default(this, apfVar, null, 2, null);
        } else if (i != 2) {
            w511.b();
        } else {
            this.job = e.H(this.mainScope, new o(new jqr(e.t(((k) this.referralCodesProvider).a()), new PromoCodeSharingModalView$setShareState$1(this, apfVar, null), 3), new PromoCodeSharingModalView$setShareState$2(this, apfVar, null)));
        }
    }
}
