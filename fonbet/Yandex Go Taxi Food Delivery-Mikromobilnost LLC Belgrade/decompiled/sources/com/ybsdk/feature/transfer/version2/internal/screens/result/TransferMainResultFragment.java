package com.ybsdk.feature.transfer.version2.internal.screens.result;

import android.content.Context;
import android.net.Uri;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewPropertyAnimator;
import android.webkit.WebView;
import android.widget.TextView;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import com.ybsdk.core.design.animation.AnimUtils;
import com.ybsdk.core.utils.text.Text;
import com.ybsdk.core.utils.text.d;
import com.ybsdk.feature.divkit.api.ui.YbDivView;
import com.ybsdk.feature.divkit.api.ui.screen.BaseDivContextMvvmFragment;
import com.ybsdk.feature.transfer.version2.api.TransferMainResultScreenParams;
import com.ybsdk.feature.transfer.version2.api.TransferTwoFactorScreenProvider$Request;
import com.ybsdk.feature.transfer.version2.api.TransferTwoFactorScreenProvider$TwoFactorResult;
import com.ybsdk.feature.transfer.version2.internal.screens.result.TransferMainResultFragment;
import com.ybsdk.widgets.common.OperationProgressView;
import com.ybsdk.widgets.common.YbButtonView;
import com.ybsdk.widgets.common.YbButtonViewGroup;
import defpackage.ca41;
import defpackage.ce4;
import defpackage.ck01;
import defpackage.dcs;
import defpackage.dk01;
import defpackage.e7n;
import defpackage.ek01;
import defpackage.fk01;
import defpackage.fs01;
import defpackage.ha41;
import defpackage.hc5;
import defpackage.hk01;
import defpackage.hu01;
import defpackage.hua1;
import defpackage.i3y;
import defpackage.jl40;
import defpackage.lfx;
import defpackage.lk01;
import defpackage.m70;
import defpackage.mj31;
import defpackage.oc70;
import defpackage.ola1;
import defpackage.pbj;
import defpackage.qa3;
import defpackage.qc70;
import defpackage.rbv;
import defpackage.rk01;
import defpackage.rr51;
import defpackage.sk01;
import defpackage.sls;
import defpackage.spl;
import defpackage.stz0;
import defpackage.tu01;
import defpackage.u601;
import defpackage.un01;
import defpackage.v4b1;
import defpackage.vty0;
import defpackage.w961;
import defpackage.x49;
import defpackage.xlp0;
import defpackage.y8f;
import defpackage.yr31;
import defpackage.zy11;
import io.appmetrica.analytics.rtm.internal.Constants;
import java.util.List;
import kotlin.LazyThreadSafetyMode;
import kotlin.Metadata;
import ru.yandex.common.clid.ClidProvider;
import ru.yandex.video.m3.player.utils.DRMInfoProvider;

@Metadata(d1 = {"\u0000ä\u0001\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0005\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\t\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\t\b\u0000\u0018\u0000 u2\u0014\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00040\u00012\u00020\u0005:\u0001vB!\b\u0007\u0012\u0006\u0010\u0007\u001a\u00020\u0006\u0012\u0006\u0010\t\u001a\u00020\b\u0012\u0006\u0010\u000b\u001a\u00020\n¢\u0006\u0004\b\f\u0010\rJ\u000f\u0010\u000e\u001a\u00020\u0004H\u0014¢\u0006\u0004\b\u000e\u0010\u000fJ!\u0010\u0014\u001a\u00020\u00022\u0006\u0010\u0011\u001a\u00020\u00102\b\u0010\u0013\u001a\u0004\u0018\u00010\u0012H\u0014¢\u0006\u0004\b\u0014\u0010\u0015J!\u0010\u001b\u001a\u00020\u001a2\u0006\u0010\u0017\u001a\u00020\u00162\b\u0010\u0019\u001a\u0004\u0018\u00010\u0018H\u0016¢\u0006\u0004\b\u001b\u0010\u001cJ\u000f\u0010\u001e\u001a\u00020\u001dH\u0016¢\u0006\u0004\b\u001e\u0010\u001fJ\u0017\u0010!\u001a\u00020\u001a2\u0006\u0010 \u001a\u00020\u0003H\u0016¢\u0006\u0004\b!\u0010\"J\u001d\u0010&\u001a\u00020\u001a2\f\u0010%\u001a\b\u0012\u0004\u0012\u00020$0#H\u0002¢\u0006\u0004\b&\u0010'J\u0017\u0010*\u001a\u00020\u001a2\u0006\u0010)\u001a\u00020(H\u0002¢\u0006\u0004\b*\u0010+J\u0017\u0010.\u001a\u00020\u001a2\u0006\u0010-\u001a\u00020,H\u0002¢\u0006\u0004\b.\u0010/J\u0017\u00102\u001a\u00020\u001a2\u0006\u00101\u001a\u000200H\u0002¢\u0006\u0004\b2\u00103J\u0017\u00106\u001a\u00020\u001a2\u0006\u00105\u001a\u000204H\u0002¢\u0006\u0004\b6\u00107J\u0019\u0010:\u001a\u00020\u001a2\b\u00109\u001a\u0004\u0018\u000108H\u0002¢\u0006\u0004\b:\u0010;J\u0019\u0010=\u001a\u00020\u001a2\b\u0010<\u001a\u0004\u0018\u000104H\u0002¢\u0006\u0004\b=\u00107J\u0017\u0010@\u001a\u00020\u001a2\u0006\u0010?\u001a\u00020>H\u0002¢\u0006\u0004\b@\u0010AJ\u001b\u0010D\u001a\u0004\u0018\u00010\u001a2\b\u0010C\u001a\u0004\u0018\u00010BH\u0002¢\u0006\u0004\bD\u0010EJ\u0019\u0010H\u001a\u00020\u001a2\b\u0010G\u001a\u0004\u0018\u00010FH\u0002¢\u0006\u0004\bH\u0010IJ!\u0010M\u001a\u00020\u001a2\b\u0010K\u001a\u0004\u0018\u00010J2\u0006\u0010L\u001a\u00020\u001dH\u0002¢\u0006\u0004\bM\u0010NJ\u0017\u0010R\u001a\u00020Q2\u0006\u0010P\u001a\u00020OH\u0002¢\u0006\u0004\bR\u0010SJ\u001d\u0010V\u001a\u00020\u001a*\u00020\u00162\b\b\u0002\u0010U\u001a\u00020TH\u0002¢\u0006\u0004\bV\u0010WJ!\u0010Z\u001a\u00020\u001a*\u00020\u00162\f\u0010Y\u001a\b\u0012\u0004\u0012\u00020\u001a0XH\u0002¢\u0006\u0004\bZ\u0010[J\u0013\u0010\\\u001a\u00020\u001a*\u00020\u0016H\u0002¢\u0006\u0004\b\\\u0010]R\u0014\u0010\u0007\u001a\u00020\u00068\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0007\u0010^R\u0014\u0010\t\u001a\u00020\b8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\t\u0010_R\u0014\u0010\u000b\u001a\u00020\n8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u000b\u0010`R!\u0010g\u001a\b\u0012\u0004\u0012\u00020b0a8BX\u0082\u0084\u0002¢\u0006\f\n\u0004\bc\u0010d\u001a\u0004\be\u0010fR)\u0010m\u001a\u0010\u0012\f\u0012\n i*\u0004\u0018\u00010$0$0h8BX\u0082\u0084\u0002¢\u0006\f\n\u0004\bj\u0010d\u001a\u0004\bk\u0010lR\u001b\u0010r\u001a\u00020n8BX\u0082\u0084\u0002¢\u0006\f\n\u0004\bo\u0010d\u001a\u0004\bp\u0010qR\u0018\u0010s\u001a\u0004\u0018\u00010Q8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\bs\u0010t¨\u0006w"}, d2 = {"Lcom/ybsdk/feature/transfer/version2/internal/screens/result/TransferMainResultFragment;", "Lcom/ybsdk/feature/divkit/api/ui/screen/BaseDivContextMvvmFragment;", "Lw961;", "Lsk01;", "Lcom/ybsdk/feature/transfer/version2/internal/screens/result/a;", "Lce4;", "Llk01;", "viewModelFactory", "Lhu01;", "twoFactorScreenProvider", "Lca41;", "web3dsFeature", "<init>", "(Llk01;Lhu01;Lca41;)V", "createViewModel", "()Lcom/ybsdk/feature/transfer/version2/internal/screens/result/a;", "Landroid/view/LayoutInflater;", "inflater", "Landroid/view/ViewGroup;", "container", "getViewBinding", "(Landroid/view/LayoutInflater;Landroid/view/ViewGroup;)Lw961;", "Landroid/view/View;", "view", "Landroid/os/Bundle;", "savedInstanceState", "Lzy11;", "onViewCreated", "(Landroid/view/View;Landroid/os/Bundle;)V", "", "onBackPressed", "()Z", "viewState", "render", "(Lsk01;)V", "", "Lun01;", "quickActions", "renderQuickActions", "(Ljava/util/List;)V", "Lstz0;", "toolbarView", "renderToolbar", "(Lstz0;)V", "Lrbv;", "icon", "renderIcon", "(Lrbv;)V", "Lqc70;", ClidProvider.STATE, "renderStatusIcon", "(Lqc70;)V", "Lvty0;", "title", "renderTitle", "(Lvty0;)V", "Lcom/ybsdk/core/utils/text/Text;", "comment", "renderComment", "(Lcom/ybsdk/core/utils/text/Text;)V", DRMInfoProvider.MediaDRMKeys.PLUGIN_DESCRIPTION, "renderDescription", "Lcom/ybsdk/widgets/common/YbButtonViewGroup$b;", "buttonViewGroup", "renderButton", "(Lcom/ybsdk/widgets/common/YbButtonViewGroup$b;)V", "Lx49;", "cashback", "renderCashback", "(Lx49;)Lzy11;", "Lrr51;", Constants.KEY_DATA, "renderDivkitWidgetUnderAmount", "(Lrr51;)V", "", "urlFor3ds", "pageReady", "renderRequired3ds", "(Ljava/lang/String;Z)V", "Landroid/content/Context;", "context", "Lha41;", "ensureWeb3dsView", "(Landroid/content/Context;)Lha41;", "", "delay", "fadeIn", "(Landroid/view/View;J)V", "Lkotlin/Function0;", "onAnimationEnd", "fadeOutAnd", "(Landroid/view/View;Lsls;)V", "fadeOutAndGone", "(Landroid/view/View;)V", "Llk01;", "Lhu01;", "Lca41;", "Le7n;", "Lgc5;", "widgetsAdapter$delegate", "Li3y;", "getWidgetsAdapter", "()Le7n;", "widgetsAdapter", "Lqa3;", "kotlin.jvm.PlatformType", "quickActionsAdapter$delegate", "getQuickActionsAdapter", "()Lqa3;", "quickActionsAdapter", "Lcom/ybsdk/feature/transfer/version2/api/TransferMainResultScreenParams;", "screenParams$delegate", "getScreenParams", "()Lcom/ybsdk/feature/transfer/version2/api/TransferMainResultScreenParams;", "screenParams", "web3dsView", "Lha41;", "Companion", "hk01", "feature-transfer-version2_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes8.dex */
public final class TransferMainResultFragment extends BaseDivContextMvvmFragment<w961, sk01, a> implements ce4 {
    public static final hk01 Companion = new hk01();
    private static final long FADE_OUT_DURATION = 200;

    /* renamed from: quickActionsAdapter$delegate, reason: from kotlin metadata */
    private final i3y quickActionsAdapter;

    /* renamed from: screenParams$delegate, reason: from kotlin metadata */
    private final i3y screenParams;
    private final hu01 twoFactorScreenProvider;
    private final lk01 viewModelFactory;
    private final ca41 web3dsFeature;
    private ha41 web3dsView;

    /* renamed from: widgetsAdapter$delegate, reason: from kotlin metadata */
    private final i3y widgetsAdapter;

    public TransferMainResultFragment(lk01 lk01Var, hu01 hu01Var, ca41 ca41Var) {
        super(Boolean.FALSE, null, null, null, a.class, 14, null);
        this.viewModelFactory = lk01Var;
        this.twoFactorScreenProvider = hu01Var;
        this.web3dsFeature = ca41Var;
        LazyThreadSafetyMode lazyThreadSafetyMode = LazyThreadSafetyMode.NONE;
        this.widgetsAdapter = kotlin.a.b(lazyThreadSafetyMode, new fk01(this, 2));
        this.quickActionsAdapter = kotlin.a.b(lazyThreadSafetyMode, new fk01(this, 3));
        this.screenParams = dcs.c(this);
    }

    /* JADX WARN: Multi-variable type inference failed */
    private final ha41 ensureWeb3dsView(Context context) {
        ha41 ha41Var = this.web3dsView;
        if (ha41Var != null) {
            return ha41Var;
        }
        pbj w = ((mj31) this.web3dsFeature).w(context);
        w.Q(new fk01(this, 0));
        int i = 1;
        w.R(new fk01(this, i));
        w.P(new dk01(this, i));
        ((w961) getBinding()).m.removeAllViews();
        WebView J = w.J();
        if (J != null) {
            ((w961) getBinding()).m.addView(J);
        }
        this.web3dsView = w;
        return w;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Multi-variable type inference failed */
    public static final zy11 ensureWeb3dsView$lambda$35$lambda$31(TransferMainResultFragment transferMainResultFragment) {
        ((a) transferMainResultFragment.getViewModel()).i0();
        return zy11.a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Multi-variable type inference failed */
    public static final zy11 ensureWeb3dsView$lambda$35$lambda$32(TransferMainResultFragment transferMainResultFragment) {
        ((a) transferMainResultFragment.getViewModel()).j0();
        return zy11.a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Multi-variable type inference failed */
    public static final zy11 ensureWeb3dsView$lambda$35$lambda$33(TransferMainResultFragment transferMainResultFragment, Throwable th) {
        ((a) transferMainResultFragment.getViewModel()).h0();
        return zy11.a;
    }

    private final void fadeIn(View view, long j) {
        ViewPropertyAnimator f = AnimUtils.f(view);
        f.setStartDelay(j);
        f.setDuration(300L);
    }

    public static /* synthetic */ void fadeIn$default(TransferMainResultFragment transferMainResultFragment, View view, long j, int i, Object obj) {
        if ((i & 1) != 0) {
            j = 0;
        }
        transferMainResultFragment.fadeIn(view, j);
    }

    private final void fadeOutAnd(View view, sls slsVar) {
        AnimUtils.h(view, this, new u601(1, slsVar)).setDuration(200L);
    }

    private final void fadeOutAndGone(View view) {
        AnimUtils.i(view, this).setDuration(200L);
    }

    private final qa3 getQuickActionsAdapter() {
        return (qa3) this.quickActionsAdapter.getValue();
    }

    private final TransferMainResultScreenParams getScreenParams() {
        return (TransferMainResultScreenParams) this.screenParams.getValue();
    }

    private final e7n getWidgetsAdapter() {
        return (e7n) this.widgetsAdapter.getValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Multi-variable type inference failed */
    public static final zy11 onViewCreated$lambda$4(TransferMainResultFragment transferMainResultFragment, String str, Bundle bundle) {
        TransferTwoFactorScreenProvider$TwoFactorResult a = ((tu01) transferMainResultFragment.twoFactorScreenProvider).a(bundle);
        if (a instanceof TransferTwoFactorScreenProvider$TwoFactorResult.VerificationToken) {
            ((a) transferMainResultFragment.getViewModel()).q0(((TransferTwoFactorScreenProvider$TwoFactorResult.VerificationToken) a).getVerificationToken());
        } else {
            ((a) transferMainResultFragment.getViewModel()).o0();
        }
        return zy11.a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Multi-variable type inference failed */
    public static final boolean onViewCreated$lambda$9$lambda$5(TransferMainResultFragment transferMainResultFragment, Uri uri) {
        return ((a) transferMainResultFragment.getViewModel()).l0(uri);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Multi-variable type inference failed */
    public static final zy11 onViewCreated$lambda$9$lambda$6(TransferMainResultFragment transferMainResultFragment) {
        ((a) transferMainResultFragment.getViewModel()).n0();
        return zy11.a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Multi-variable type inference failed */
    public static final zy11 onViewCreated$lambda$9$lambda$7(TransferMainResultFragment transferMainResultFragment, w961 w961Var) {
        a aVar = (a) transferMainResultFragment.getViewModel();
        Text primaryButtonText = w961Var.b.getPrimaryButtonText();
        aVar.k0(String.valueOf(primaryButtonText != null ? d.a(transferMainResultFragment.requireContext(), primaryButtonText) : null), true);
        return zy11.a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Multi-variable type inference failed */
    public static final zy11 onViewCreated$lambda$9$lambda$8(TransferMainResultFragment transferMainResultFragment, w961 w961Var) {
        a aVar = (a) transferMainResultFragment.getViewModel();
        Text secondaryButtonText = w961Var.b.getSecondaryButtonText();
        aVar.k0(String.valueOf(secondaryButtonText != null ? d.a(transferMainResultFragment.requireContext(), secondaryButtonText) : null), false);
        return zy11.a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final qa3 quickActionsAdapter_delegate$lambda$3(TransferMainResultFragment transferMainResultFragment) {
        return new qa3(fs01.a(), fs01.b(new dk01(transferMainResultFragment, 0)));
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Multi-variable type inference failed */
    public static final zy11 quickActionsAdapter_delegate$lambda$3$lambda$2(TransferMainResultFragment transferMainResultFragment, List list) {
        ((a) transferMainResultFragment.getViewModel()).m0(list);
        return zy11.a;
    }

    /* JADX WARN: Multi-variable type inference failed */
    private final void renderButton(YbButtonViewGroup.b buttonViewGroup) {
        w961 w961Var = (w961) getBinding();
        YbButtonView.a c = buttonViewGroup.c();
        if (c == null || c.b() == null) {
            fadeOutAndGone(w961Var.b);
        } else {
            fadeOutAnd(w961Var.b, new xlp0(29, w961Var, buttonViewGroup, this));
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final zy11 renderButton$lambda$26$lambda$24$lambda$23(w961 w961Var, YbButtonViewGroup.b bVar, TransferMainResultFragment transferMainResultFragment) {
        w961Var.b.render(bVar);
        YbButtonViewGroup ybButtonViewGroup = w961Var.b;
        ybButtonViewGroup.setVisibility(0);
        fadeIn$default(transferMainResultFragment, ybButtonViewGroup, 0L, 1, null);
        return zy11.a;
    }

    /* JADX WARN: Multi-variable type inference failed */
    private final zy11 renderCashback(x49 cashback) {
        w961 w961Var = (w961) getBinding();
        w961Var.e.setVisibility(cashback != null ? 0 : 8);
        if (cashback == null) {
            return null;
        }
        w961Var.e.render(cashback);
        return zy11.a;
    }

    /* JADX WARN: Multi-variable type inference failed */
    private final void renderComment(Text comment) {
        w961 w961Var = (w961) getBinding();
        if (comment == null) {
            fadeOutAndGone(w961Var.f);
        } else {
            if (jl40.l(w961Var.f.getText(), d.a(requireContext(), comment))) {
                return;
            }
            fadeOutAnd(w961Var.f, new xlp0(28, w961Var, comment, this));
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final zy11 renderComment$lambda$18$lambda$16$lambda$15(w961 w961Var, Text text, TransferMainResultFragment transferMainResultFragment) {
        w961Var.f.setVisibility(0);
        TextView textView = w961Var.f;
        textView.setText(d.a(transferMainResultFragment.requireContext(), text));
        fadeIn$default(transferMainResultFragment, textView, 0L, 1, null);
        return zy11.a;
    }

    private final void renderDescription(vty0 description) {
        w961 w961Var = (w961) getBinding();
        if (description == null) {
            fadeOutAndGone(w961Var.g);
            return;
        }
        TextView textView = w961Var.g;
        if (jl40.l(textView.getText(), d.a(requireContext(), description.a()))) {
            return;
        }
        textView.setVisibility(0);
        fadeOutAnd(textView, new ck01(w961Var, description, this, 0));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final zy11 renderDescription$lambda$22$lambda$20$lambda$19(w961 w961Var, vty0 vty0Var, TransferMainResultFragment transferMainResultFragment) {
        w961Var.g.setText(d.a(transferMainResultFragment.requireContext(), vty0Var.a()));
        TextView textView = w961Var.g;
        textView.setTextAppearance(vty0Var.b());
        fadeIn$default(transferMainResultFragment, textView, 0L, 1, null);
        return zy11.a;
    }

    /* JADX WARN: Multi-variable type inference failed */
    private final void renderDivkitWidgetUnderAmount(rr51 data) {
        rr51 rr51Var;
        w961 w961Var = (w961) getBinding();
        if (data != null) {
            rr51Var = data;
            YbDivView.setData$default(w961Var.h, rr51Var, null, null, false, 14, null);
        } else {
            rr51Var = data;
        }
        w961Var.h.setVisibility(rr51Var != null ? 0 : 8);
    }

    /* JADX WARN: Multi-variable type inference failed */
    private final void renderIcon(rbv icon) {
        v4b1.k(icon, ((w961) getBinding()).i, null, null, 6);
    }

    /* JADX WARN: Multi-variable type inference failed */
    private final void renderQuickActions(List<un01> quickActions) {
        ((w961) getBinding()).k.setVisibility(!quickActions.isEmpty() ? 0 : 8);
        getQuickActionsAdapter().g(quickActions);
    }

    /* JADX WARN: Multi-variable type inference failed */
    private final void renderRequired3ds(String urlFor3ds, boolean pageReady) {
        w961 w961Var = (w961) getBinding();
        if (urlFor3ds == null) {
            w961Var.m.setVisibility(8);
        } else {
            w961Var.m.setVisibility(pageReady ? 0 : 8);
            ((pbj) ensureWeb3dsView(requireContext())).K(urlFor3ds);
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    private final void renderStatusIcon(qc70 state) {
        OperationProgressView operationProgressView = ((w961) getBinding()).j;
        operationProgressView.setVisibility(jl40.l(state, oc70.a) ? 8 : 0);
        operationProgressView.render(state);
    }

    /* JADX WARN: Multi-variable type inference failed */
    private final void renderTitle(vty0 title) {
        w961 w961Var = (w961) getBinding();
        if (jl40.l(w961Var.l.getText(), d.a(requireContext(), title.a()))) {
            return;
        }
        fadeOutAnd(w961Var.l, new ck01(w961Var, title, this, 1));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final zy11 renderTitle$lambda$14$lambda$13(w961 w961Var, vty0 vty0Var, TransferMainResultFragment transferMainResultFragment) {
        w961Var.l.setVisibility(0);
        TextView textView = w961Var.l;
        textView.setText(d.a(transferMainResultFragment.requireContext(), vty0Var.a()));
        textView.setTextAppearance(vty0Var.b());
        fadeIn$default(transferMainResultFragment, textView, 0L, 1, null);
        return zy11.a;
    }

    /* JADX WARN: Multi-variable type inference failed */
    private final void renderToolbar(stz0 toolbarView) {
        ((w961) getBinding()).d.render(toolbarView);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final e7n widgetsAdapter_delegate$lambda$1(TransferMainResultFragment transferMainResultFragment) {
        return new e7n(hc5.a(), ola1.c(new ek01(transferMainResultFragment, 0)), new m70[0]);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Multi-variable type inference failed */
    public static final boolean widgetsAdapter_delegate$lambda$1$lambda$0(TransferMainResultFragment transferMainResultFragment, Uri uri, spl splVar) {
        return ((a) transferMainResultFragment.getViewModel()).l0(uri);
    }

    @Override // com.ybsdk.feature.divkit.api.ui.screen.BaseDivContextMvvmFragment, com.ybsdk.core.mvp.BaseMvvmFragment, defpackage.hs31
    public /* bridge */ /* synthetic */ yr31 create(lfx lfxVar, y8f y8fVar) {
        return super.create(lfxVar, y8fVar);
    }

    @Override // com.ybsdk.core.mvp.BaseMvvmFragment
    /* renamed from: createViewModel */
    public a getFactoryOfViewModel() {
        return ((rk01) this.viewModelFactory).a(getScreenParams());
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // defpackage.ce4
    public boolean onBackPressed() {
        ((a) getViewModel()).o0();
        return true;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // com.ybsdk.core.mvp.BaseMvvmFragment, androidx.fragment.app.Fragment
    public void onViewCreated(View view, Bundle savedInstanceState) {
        super.onViewCreated(view, savedInstanceState);
        final int i = 1;
        hua1.g(this, TransferTwoFactorScreenProvider$Request.CONFIRM_TRANSFER.getKey(), new ek01(this, i));
        final w961 w961Var = (w961) getBinding();
        w961Var.h.setActionHandler(new dk01(this, 2));
        w961Var.d.setOnCloseButtonClickListener(new fk01(this, 4));
        YbButtonViewGroup ybButtonViewGroup = w961Var.b;
        final int i2 = 0;
        ybButtonViewGroup.setPrimaryButtonOnClickListener(new sls(this) { // from class: gk01
            public final /* synthetic */ TransferMainResultFragment b;

            {
                this.b = this;
            }

            @Override // defpackage.sls
            public final Object invoke() {
                zy11 onViewCreated$lambda$9$lambda$7;
                zy11 onViewCreated$lambda$9$lambda$8;
                int i3 = i2;
                w961 w961Var2 = w961Var;
                TransferMainResultFragment transferMainResultFragment = this.b;
                switch (i3) {
                    case 0:
                        onViewCreated$lambda$9$lambda$7 = TransferMainResultFragment.onViewCreated$lambda$9$lambda$7(transferMainResultFragment, w961Var2);
                        return onViewCreated$lambda$9$lambda$7;
                    default:
                        onViewCreated$lambda$9$lambda$8 = TransferMainResultFragment.onViewCreated$lambda$9$lambda$8(transferMainResultFragment, w961Var2);
                        return onViewCreated$lambda$9$lambda$8;
                }
            }
        });
        ybButtonViewGroup.setSecondaryButtonClickListener(new sls(this) { // from class: gk01
            public final /* synthetic */ TransferMainResultFragment b;

            {
                this.b = this;
            }

            @Override // defpackage.sls
            public final Object invoke() {
                zy11 onViewCreated$lambda$9$lambda$7;
                zy11 onViewCreated$lambda$9$lambda$8;
                int i3 = i;
                w961 w961Var2 = w961Var;
                TransferMainResultFragment transferMainResultFragment = this.b;
                switch (i3) {
                    case 0:
                        onViewCreated$lambda$9$lambda$7 = TransferMainResultFragment.onViewCreated$lambda$9$lambda$7(transferMainResultFragment, w961Var2);
                        return onViewCreated$lambda$9$lambda$7;
                    default:
                        onViewCreated$lambda$9$lambda$8 = TransferMainResultFragment.onViewCreated$lambda$9$lambda$8(transferMainResultFragment, w961Var2);
                        return onViewCreated$lambda$9$lambda$8;
                }
            }
        });
        RecyclerView recyclerView = w961Var.k;
        recyclerView.setAdapter(getQuickActionsAdapter());
        recyclerView.setLayoutManager(new LinearLayoutManager(getContext(), 0, false));
        ((w961) getBinding()).c.setAdapter(getWidgetsAdapter());
    }

    @Override // com.ybsdk.core.mvp.BaseMvvmFragment
    public void render(sk01 viewState) {
        renderToolbar(viewState.l());
        renderIcon(viewState.g());
        renderStatusIcon(viewState.j());
        renderTitle(viewState.k());
        renderDescription(viewState.d());
        renderButton(viewState.a());
        renderComment(viewState.c());
        renderCashback(viewState.b());
        renderDivkitWidgetUnderAmount(viewState.f());
        renderQuickActions(viewState.i());
        renderRequired3ds(viewState.m(), viewState.h());
        getWidgetsAdapter().g(viewState.e());
    }

    @Override // com.ybsdk.feature.divkit.api.ui.screen.BaseDivContextMvvmFragment, com.ybsdk.core.mvp.BaseMvvmFragment, defpackage.hs31
    public yr31 create(Class cls, y8f y8fVar) {
        return create(cls);
    }

    @Override // com.ybsdk.core.presentation.BindingFragment
    public w961 getViewBinding(LayoutInflater inflater, ViewGroup container) {
        return w961.o(inflater, container);
    }
}
