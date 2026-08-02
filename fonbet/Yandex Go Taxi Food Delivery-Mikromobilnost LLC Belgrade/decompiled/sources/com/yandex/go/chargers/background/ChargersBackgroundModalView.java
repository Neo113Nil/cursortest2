package com.yandex.go.chargers.background;

import android.content.Context;
import android.graphics.Color;
import android.graphics.drawable.GradientDrawable;
import android.view.LayoutInflater;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import androidx.constraintlayout.widget.ConstraintLayout;
import com.yandex.go.design.view.GoConstraintLayout;
import com.yandex.go.design.view.GoImageButton;
import com.yandex.go.design.view.GoImageView;
import com.yandex.go.plus.api.model.CashbackScreenSource;
import com.yandex.urbanads.internal.navigation.UrbanAdsBottomSheetFragment;
import defpackage.ao9;
import defpackage.bdc;
import defpackage.cma1;
import defpackage.co9;
import defpackage.cxq0;
import defpackage.czo0;
import defpackage.dg4;
import defpackage.e230;
import defpackage.fo9;
import defpackage.g18;
import defpackage.h8;
import defpackage.hbp0;
import defpackage.hxx;
import defpackage.ip11;
import defpackage.jo9;
import defpackage.ju8;
import defpackage.l8x;
import defpackage.lma;
import defpackage.lwa;
import defpackage.m950;
import defpackage.mhh0;
import defpackage.mma;
import defpackage.mqg0;
import defpackage.mrg0;
import defpackage.ny61;
import defpackage.od9;
import defpackage.p8w0;
import defpackage.pav;
import defpackage.pep0;
import defpackage.phh0;
import defpackage.po9;
import defpackage.psh0;
import defpackage.qje;
import defpackage.t1w;
import defpackage.tje;
import defpackage.tpr;
import defpackage.tse;
import defpackage.u90;
import defpackage.uyj;
import defpackage.vn9;
import defpackage.w130;
import defpackage.wn9;
import defpackage.xng0;
import defpackage.xw31;
import defpackage.y49;
import defpackage.z49;
import defpackage.zn9;
import defpackage.zy11;
import kotlin.Metadata;
import kotlinx.coroutines.flow.e;
import kotlinx.coroutines.flow.r0;
import ru.CryptoPro.JCPRequest.ca20.status.CA20Status;
import ru.yandex.taxi.animation.AnimUtils$AnimationStartEndListener;
import ru.yandex.taxi.design.utils.TopRoundRectBackgroundHelper$makeViewRounded$1;
import ru.yandex.taxi.design.utils.a;
import ru.yandex.taxi.design.utils.c;
import ru.yandex.taxi.experiments.d;
import ru.yandex.taxi.theme.ThemeType;
import ru.yandex.taxi.widget.BalanceWidget;
import ru.yandex.taxi.widget.BindingModalView;
import ru.yandex.taxi.widget.RobotoTextView;
import ru.yandex.video.m3.ott.data.local.db.DatabaseHelper;

@Metadata(d1 = {"\u0000¬\u0001\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0011\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001:\u0001\\BE\b\u0007\u0012\b\b\u0001\u0010\u0004\u001a\u00020\u0003\u0012\u0006\u0010\u0006\u001a\u00020\u0005\u0012\u0006\u0010\b\u001a\u00020\u0007\u0012\u0006\u0010\n\u001a\u00020\t\u0012\u0006\u0010\f\u001a\u00020\u000b\u0012\u0006\u0010\u000e\u001a\u00020\r\u0012\b\b\u0001\u0010\u0010\u001a\u00020\u000f¢\u0006\u0004\b\u0011\u0010\u0012J\u001f\u0010\u0017\u001a\u00020\u00022\u0006\u0010\u0014\u001a\u00020\u00132\u0006\u0010\u0016\u001a\u00020\u0015H\u0016¢\u0006\u0004\b\u0017\u0010\u0018J\u000f\u0010\u001a\u001a\u00020\u0019H\u0014¢\u0006\u0004\b\u001a\u0010\u001bJ\u000f\u0010\u001d\u001a\u00020\u001cH\u0014¢\u0006\u0004\b\u001d\u0010\u001eJ\u000f\u0010 \u001a\u00020\u001fH\u0014¢\u0006\u0004\b \u0010!J\u000f\u0010\"\u001a\u00020\u001fH\u0014¢\u0006\u0004\b\"\u0010!J\u0017\u0010&\u001a\u00020%2\u0006\u0010$\u001a\u00020#H\u0017¢\u0006\u0004\b&\u0010'J\u0017\u0010*\u001a\u00020\u001f2\u0006\u0010)\u001a\u00020(H\u0016¢\u0006\u0004\b*\u0010+J\u001f\u0010.\u001a\u00020\u001f2\u0006\u0010,\u001a\u00020(2\u0006\u0010-\u001a\u00020(H\u0014¢\u0006\u0004\b.\u0010/J\u0017\u00102\u001a\u00020\u001f2\u0006\u00101\u001a\u000200H\u0016¢\u0006\u0004\b2\u00103J\u000f\u00105\u001a\u000204H\u0002¢\u0006\u0004\b5\u00106J\u000f\u00107\u001a\u00020\u001fH\u0002¢\u0006\u0004\b7\u0010!J\u000f\u00108\u001a\u00020\u001fH\u0002¢\u0006\u0004\b8\u0010!J\u000f\u00109\u001a\u00020\u001fH\u0002¢\u0006\u0004\b9\u0010!J\u000f\u0010:\u001a\u00020\u001fH\u0002¢\u0006\u0004\b:\u0010!J\u0017\u0010=\u001a\u00020\u001f2\u0006\u0010<\u001a\u00020;H\u0002¢\u0006\u0004\b=\u0010>R\u0014\u0010\u0006\u001a\u00020\u00058\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0006\u0010?R\u0014\u0010\b\u001a\u00020\u00078\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\b\u0010@R\u0014\u0010\n\u001a\u00020\t8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\n\u0010AR\u0014\u0010\f\u001a\u00020\u000b8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\f\u0010BR\u0014\u0010\u000e\u001a\u00020\r8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u000e\u0010CR\u0014\u0010\u0010\u001a\u00020\u000f8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0010\u0010DR\u0014\u0010E\u001a\u00020\u001c8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bE\u0010FR\u0014\u0010G\u001a\u00020\u001c8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bG\u0010FR\u0014\u0010H\u001a\u00020\u001c8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bH\u0010FR\u0014\u0010I\u001a\u00020\u001c8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bI\u0010FR\u0014\u0010J\u001a\u00020\u001c8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bJ\u0010FR\u0014\u0010K\u001a\u00020\u001c8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bK\u0010FR\u0014\u0010L\u001a\u00020\u001c8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bL\u0010FR\u0018\u0010N\u001a\u0004\u0018\u00010M8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\bN\u0010OR\u0016\u0010P\u001a\u00020%8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\bP\u0010QR\u0018\u0010S\u001a\u0004\u0018\u00010R8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\bS\u0010TR\u0016\u0010U\u001a\u00020%8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\bU\u0010QR\u0018\u0010W\u001a\u0004\u0018\u00010V8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\bW\u0010XR\u0014\u0010Z\u001a\u00020Y8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bZ\u0010[¨\u0006]"}, d2 = {"Lcom/yandex/go/chargers/background/ChargersBackgroundModalView;", "Lru/yandex/taxi/widget/BindingModalView;", "Lao9;", "Landroid/content/Context;", "context", "Lpav;", "imageLoader", "Lip11;", "typefaceDelegate", "Lru/yandex/taxi/design/utils/a;", "overlayShadowUtil", "Llma;", "chargersPlusViewHolder", "Lvn9;", "chargersBackgroundDelegate", "Lfo9;", "chargersBackgroundPresenter", "<init>", "(Landroid/content/Context;Lpav;Lip11;Lru/yandex/taxi/design/utils/a;Llma;Lvn9;Lfo9;)V", "Landroid/view/LayoutInflater;", "inflater", "Landroid/view/ViewGroup;", "parent", "bindingFactory", "(Landroid/view/LayoutInflater;Landroid/view/ViewGroup;)Lao9;", "Le230;", "insetsType", "()Le230;", "", UrbanAdsBottomSheetFragment.BACKGROUND_COLOR, "()I", "Lzy11;", "onAttachedToWindow", "()V", "onDetachedFromWindow", "Landroid/view/MotionEvent;", DatabaseHelper.OttTrackingTable.COLUMN_EVENT, "", "onTouchEvent", "(Landroid/view/MotionEvent;)Z", "Ljava/lang/Runnable;", "onBackPressedListener", "setOnBackPressedListener", "(Ljava/lang/Runnable;)V", "startAction", "endAction", "animateDismiss", "(Ljava/lang/Runnable;Ljava/lang/Runnable;)V", "Lru/yandex/taxi/theme/ThemeType;", "themeType", "applyTheme", "(Lru/yandex/taxi/theme/ThemeType;)V", "Landroid/graphics/drawable/GradientDrawable;", "createTopGradientDrawable", "()Landroid/graphics/drawable/GradientDrawable;", "showMenuButtonAndHideToolbar", "showPlusPlaque", "hidePlusPlaque", "cancelSetContentJob", "Llwa;", "surgeState", "updateSurgeUi", "(Llwa;)V", "Lpav;", "Lip11;", "Lru/yandex/taxi/design/utils/a;", "Llma;", "Lvn9;", "Lfo9;", "dp4", CA20Status.STATUS_USER_I, "dp6", "dp8", "dp20", "dp48", "dp88", "plaqueExpandedThreshold", "Ly49;", "plusView", "Ly49;", "isPlusPlaqueShown", "Z", "Ll8x;", "setContentJob", "Ll8x;", "isSurgeViewShown", "Lg18;", "loadIconCancellable", "Lg18;", "Lru/yandex/taxi/widget/BalanceWidget;", "surgeView", "Lru/yandex/taxi/widget/BalanceWidget;", "zn9", "impl"}, k = 1, mv = {2, 4, 0}, xi = 48)
/* loaded from: classes12.dex */
public final class ChargersBackgroundModalView extends BindingModalView<ao9> {
    private final vn9 chargersBackgroundDelegate;
    private final fo9 chargersBackgroundPresenter;
    private final lma chargersPlusViewHolder;
    private final int dp20;
    private final int dp4;
    private final int dp48;
    private final int dp6;
    private final int dp8;
    private final int dp88;
    private final pav imageLoader;
    private boolean isPlusPlaqueShown;
    private boolean isSurgeViewShown;
    private g18 loadIconCancellable;
    private final a overlayShadowUtil;
    private final int plaqueExpandedThreshold;
    private y49 plusView;
    private l8x setContentJob;
    private final BalanceWidget surgeView;
    private final ip11 typefaceDelegate;

    public ChargersBackgroundModalView(Context context, pav pavVar, ip11 ip11Var, a aVar, lma lmaVar, vn9 vn9Var, fo9 fo9Var) {
        super(context);
        this.imageLoader = pavVar;
        this.typefaceDelegate = ip11Var;
        this.overlayShadowUtil = aVar;
        this.chargersPlusViewHolder = lmaVar;
        this.chargersBackgroundDelegate = vn9Var;
        this.chargersBackgroundPresenter = fo9Var;
        this.dp4 = tje.u(4, getContext());
        this.dp6 = tje.u(6, getContext());
        this.dp8 = tje.u(8, getContext());
        this.dp20 = tje.u(20, getContext());
        this.dp48 = tje.u(48, getContext());
        this.dp88 = tje.u(88, getContext());
        this.plaqueExpandedThreshold = tje.u(100, getContext());
        BalanceWidget balanceWidget = new BalanceWidget(context, null, 0, 6, null);
        balanceWidget.setLayoutParams(new ViewGroup.MarginLayoutParams(-2, -2));
        balanceWidget.setVisibility(8);
        balanceWidget.setAlpha(0.0f);
        this.surgeView = balanceWidget;
        setAnimateOnAppearing(false);
        setClipChildren(false);
        setClipToPadding(false);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void cancelSetContentJob() {
        l8x l8xVar = this.setContentJob;
        if (l8xVar != null) {
            l8xVar.a(null);
        }
        this.setContentJob = null;
    }

    private final GradientDrawable createTopGradientDrawable() {
        GradientDrawable.Orientation orientation = GradientDrawable.Orientation.BOTTOM_TOP;
        int t = qje.t(xng0.bgMain, getContext());
        int argb = Color.argb((int) (Color.alpha(t) * 0.0f), Color.red(t), Color.green(t), Color.blue(t));
        int t2 = qje.t(xng0.bgMain, getContext());
        return new GradientDrawable(orientation, new int[]{argb, Color.argb((int) (Color.alpha(t2) * 1.0f), Color.red(t2), Color.green(t2), Color.blue(t2))});
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void hidePlusPlaque() {
        y49 y49Var = this.plusView;
        if (y49Var != null) {
            ((cxq0) y49Var).z();
        }
        this.isPlusPlaqueShown = false;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final zy11 insetsType$lambda$0(ChargersBackgroundModalView chargersBackgroundModalView, t1w t1wVar) {
        View view = chargersBackgroundModalView.getBinding().i;
        c.D(view.getLayoutParams().width, t1wVar.b + chargersBackgroundModalView.dp88, view);
        GoConstraintLayout goConstraintLayout = chargersBackgroundModalView.getBinding().d;
        int i = chargersBackgroundModalView.dp20;
        int i2 = t1wVar.b;
        xw31.F(goConstraintLayout, null, Integer.valueOf(i + i2), null, null);
        View view2 = chargersBackgroundModalView.getBinding().b;
        view2.setPaddingRelative(view2.getPaddingStart(), chargersBackgroundModalView.dp6 + i2, chargersBackgroundModalView.dp8 + t1wVar.c, view2.getPaddingBottom());
        FrameLayout frameLayout = chargersBackgroundModalView.getBinding().h;
        frameLayout.setPaddingRelative(t1wVar.a, i2, frameLayout.getPaddingEnd(), frameLayout.getPaddingBottom());
        xw31.F(chargersBackgroundModalView.getBinding().g, 0, Integer.valueOf(chargersBackgroundModalView.dp4 + i2), 0, 0);
        return zy11.a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final zy11 onAttachedToWindow$lambda$2$0(ChargersBackgroundModalView chargersBackgroundModalView) {
        jo9 jo9Var = (jo9) chargersBackgroundModalView.chargersBackgroundPresenter.B.a;
        ((pep0) jo9Var.E).f((m950) jo9Var.I.get(), new p8w0(2), hxx.a);
        return zy11.a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void onAttachedToWindow$lambda$3(ChargersBackgroundModalView chargersBackgroundModalView, View view, int i, int i2, int i3, int i4, int i5, int i6, int i7, int i8) {
        Object value;
        boolean z = chargersBackgroundModalView.getBinding().b.getHeight() > chargersBackgroundModalView.plaqueExpandedThreshold;
        r0 r0Var = chargersBackgroundModalView.chargersBackgroundDelegate.a;
        do {
            value = r0Var.getValue();
        } while (!r0Var.k(value, wn9.a((wn9) value, false, false, false, false, z, 15)));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void showMenuButtonAndHideToolbar() {
        getBinding().f.setVisibility(8);
        getBinding().e.setVisibility(8);
        getBinding().g.setVisibility(0);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void showPlusPlaque() {
        if (this.isPlusPlaqueShown) {
            return;
        }
        y49 y49Var = this.plusView;
        if (y49Var != null) {
            ((cxq0) y49Var).D();
        }
        this.isPlusPlaqueShown = true;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void updateSurgeUi(lwa surgeState) {
        tse c;
        Object tag = getTag(mhh0.view_scope_scope_delegate_tag_key);
        hbp0 hbp0Var = tag instanceof hbp0 ? (hbp0) tag : null;
        if (hbp0Var != null) {
            c = hbp0Var.c();
        } else {
            final hbp0 hbp0Var2 = new hbp0(new czo0(14), "ViewScope", null);
            if (isAttachedToWindow()) {
                hbp0Var2.a();
            }
            addOnAttachStateChangeListener(new View.OnAttachStateChangeListener() { // from class: com.yandex.go.chargers.design.utils.ViewExtensionsKt$special$$inlined$addLifecycleListener$1
                @Override // android.view.View.OnAttachStateChangeListener
                public void onViewAttachedToWindow(View v) {
                    hbp0.this.a();
                }

                @Override // android.view.View.OnAttachStateChangeListener
                public void onViewDetachedFromWindow(View v) {
                    hbp0Var2.b();
                }
            });
            setTag(mhh0.view_scope_scope_delegate_tag_key, hbp0Var2);
            c = hbp0Var2.c();
        }
        this.setContentJob = tje.N(c, null, null, new ChargersBackgroundModalView$updateSurgeUi$1(this, surgeState, null), 3);
    }

    @Override // ru.yandex.taxi.widget.ModalView
    public void animateDismiss(Runnable startAction, Runnable endAction) {
        cma1.L(getContent()).setListener(new AnimUtils$AnimationStartEndListener(startAction, endAction));
    }

    @Override // ru.yandex.taxi.widget.ModalView, defpackage.nwy0
    public void applyTheme(ThemeType themeType) {
        super.applyTheme(themeType);
        getBinding().i.setBackground(createTopGradientDrawable());
    }

    @Override // ru.yandex.taxi.widget.ModalView
    /* renamed from: backgroundColor */
    public int getBackgroundColor() {
        return mqg0.transparent;
    }

    /* JADX WARN: Can't rename method to resolve collision */
    @Override // ru.yandex.taxi.widget.BindingModalView
    public ao9 bindingFactory(LayoutInflater inflater, ViewGroup parent) {
        View O;
        View inflate = inflater.inflate(psh0.chargers_background_modal_view, parent, false);
        int i = phh0.plus_container;
        View O2 = cma1.O(i, inflate);
        if (O2 != null) {
            ConstraintLayout constraintLayout = (ConstraintLayout) inflate;
            i = phh0.service_container;
            GoConstraintLayout goConstraintLayout = (GoConstraintLayout) cma1.O(i, inflate);
            if (goConstraintLayout != null) {
                i = phh0.service_icon_image;
                GoImageView goImageView = (GoImageView) cma1.O(i, inflate);
                if (goImageView != null) {
                    i = phh0.service_name_view;
                    RobotoTextView robotoTextView = (RobotoTextView) cma1.O(i, inflate);
                    if (robotoTextView != null) {
                        i = phh0.super_profile_menu_button;
                        GoImageButton goImageButton = (GoImageButton) cma1.O(i, inflate);
                        if (goImageButton != null) {
                            i = phh0.surge_container;
                            FrameLayout frameLayout = (FrameLayout) cma1.O(i, inflate);
                            if (frameLayout != null && (O = cma1.O((i = phh0.top_fade), inflate)) != null) {
                                return new ao9(constraintLayout, O2, constraintLayout, goConstraintLayout, goImageView, robotoTextView, goImageButton, frameLayout, O);
                            }
                        }
                    }
                }
            }
        }
        ny61.t("Missing required view with ID: ".concat(inflate.getResources().getResourceName(i)));
        return null;
    }

    @Override // ru.yandex.taxi.widget.ModalView
    public e230 insetsType() {
        return new w130(1, new od9(2, this));
    }

    @Override // ru.yandex.taxi.widget.ModalView, android.view.ViewGroup, android.view.View
    public void onAttachedToWindow() {
        super.onAttachedToWindow();
        setDismissOnTouchOutside(false);
        setOnTouchOutsideListener(null);
        setInterceptOnBackPress(false);
        getBinding().i.setBackground(createTopGradientDrawable());
        GoImageView goImageView = getBinding().e;
        goImageView.updateBackground(new dg4(new bdc(xng0.bgMain)));
        goImageView.setOutlineProvider(new TopRoundRectBackgroundHelper$makeViewRounded$1(this.dp48));
        goImageView.setClipToOutline(true);
        RobotoTextView robotoTextView = getBinding().f;
        robotoTextView.setTextSize(tje.s(mrg0.component_text_size_title, robotoTextView.getContext()));
        robotoTextView.setTypeface(this.typefaceDelegate.c(robotoTextView.getContext()));
        robotoTextView.setTextColor(new bdc(xng0.textMain));
        c.z(new ju8(20, this), getBinding().g);
        getBinding().h.addView(this.surgeView);
        fo9 fo9Var = this.chargersBackgroundPresenter;
        fo9Var.Bg(new zn9(this));
        po9 po9Var = fo9Var.z;
        tpr t = e.t(e.l(d.b(po9Var.g), e.d(po9Var.f.a), d.b(po9Var.i), e.d(po9Var.e.a), po9Var.d.a(), new ChargersBackgroundUiStateInteractor$uiStateFlow$1(po9Var, null)));
        po9Var.a.getClass();
        tje.N(fo9Var.Jg(), null, null, new ChargersBackgroundPresenter$observeUiState$$inlined$collectIn$1(e.F(t, uyj.a), null, (co9) fo9Var.Dg()), 3);
        this.plusView = ((z49) ((mma) this.chargersPlusViewHolder).b.get()).a(this, CashbackScreenSource.CHARGERS, "chargers");
        getBinding().b.addOnLayoutChangeListener(new u90(14, this));
    }

    @Override // ru.yandex.taxi.widget.ModalView, android.view.ViewGroup, android.view.View
    public void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        cancelSetContentJob();
        g18 g18Var = this.loadIconCancellable;
        if (g18Var != null) {
            g18Var.cancel();
        }
        this.loadIconCancellable = null;
        hidePlusPlaque();
        this.plusView = null;
        h8 h8Var = new h8(3, getBinding().c);
        while (h8Var.hasNext()) {
            ((View) h8Var.next()).animate().cancel();
        }
        this.surgeView.animate().cancel();
        removeAllViews();
        this.chargersBackgroundPresenter.Cg();
    }

    @Override // ru.yandex.taxi.widget.ModalView, android.view.View
    public boolean onTouchEvent(MotionEvent event) {
        return false;
    }

    @Override // ru.yandex.taxi.widget.ModalView
    public void setOnBackPressedListener(Runnable onBackPressedListener) {
    }
}
