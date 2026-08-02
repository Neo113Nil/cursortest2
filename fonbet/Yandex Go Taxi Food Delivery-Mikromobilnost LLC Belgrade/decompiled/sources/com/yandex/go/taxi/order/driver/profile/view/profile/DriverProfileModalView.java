package com.yandex.go.taxi.order.driver.profile.view.profile;

import android.animation.ValueAnimator;
import android.content.Context;
import android.graphics.drawable.Drawable;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewStub;
import android.view.animation.AccelerateInterpolator;
import android.view.animation.AlphaAnimation;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.LinearLayout;
import androidx.core.view.b;
import com.yandex.go.taxi.order.driver.profile.view.aspectratio.AspectRatioImageView;
import com.yandex.go.taxi.order.driver.profile.view.fact.DriverFactsComponent;
import com.yandex.go.taxi.order.feedback.ui.AchievementsView;
import com.yandex.go.taxi.order.models.api.car.CopyInfoType;
import com.yandex.go.taxi.order.models.api.objects.Driver;
import com.yandex.go.taxi.order.models.api.response.OrderStatusInfo;
import com.yandex.urbanads.internal.navigation.UrbanAdsBottomSheetFragment;
import defpackage.bi;
import defpackage.bjm;
import defpackage.bxl;
import defpackage.c230;
import defpackage.cjm;
import defpackage.cma1;
import defpackage.djm;
import defpackage.ejm;
import defpackage.evu0;
import defpackage.f1h0;
import defpackage.jgv;
import defpackage.jim;
import defpackage.k48;
import defpackage.kyh0;
import defpackage.m48;
import defpackage.mim;
import defpackage.n4h0;
import defpackage.nac;
import defpackage.nfv;
import defpackage.nim;
import defpackage.ny61;
import defpackage.p8h0;
import defpackage.pav;
import defpackage.qim;
import defpackage.qmp;
import defpackage.r8i0;
import defpackage.ssd;
import defpackage.tcc;
import defpackage.tje;
import defpackage.ul51;
import defpackage.vf2;
import defpackage.wm;
import defpackage.wqj;
import defpackage.xhm;
import defpackage.xqg0;
import defpackage.yvf0;
import defpackage.zkh0;
import defpackage.zy11;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.function.BiConsumer;
import kotlin.Metadata;
import kotlin.collections.EmptyList;
import ru.CryptoPro.JCPRequest.ca20.status.CA20Status;
import ru.yandex.taxi.design.ButtonComponent;
import ru.yandex.taxi.design.ListGroupHeaderComponent;
import ru.yandex.taxi.design.ListItemComponent;
import ru.yandex.taxi.design.utils.c;
import ru.yandex.taxi.models.CopySource;
import ru.yandex.taxi.theme.ThemeType;
import ru.yandex.taxi.ui.routing.DriverFullNameCopyRouter$CopySource;
import ru.yandex.taxi.widget.ModalView;
import ru.yandex.taxi.widget.RoundedCornersFrameLayout;
import ru.yandex.taxi.widget.scroll.NestedScrollViewAdvanced;

@Metadata(d1 = {"\u0000ª\u0001\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\b\n\u0002\b\r\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0014\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u000b\n\u0002\b\u0003\b\u0007\u0018\u00002\u00020\u0001B]\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0006\u0012\u0006\u0010\t\u001a\u00020\b\u0012\u0006\u0010\u000b\u001a\u00020\n\u0012\u0006\u0010\r\u001a\u00020\f\u0012\u0006\u0010\u000f\u001a\u00020\u000e\u0012\u0006\u0010\u0011\u001a\u00020\u0010\u0012\u0006\u0010\u0013\u001a\u00020\u0012\u0012\f\u0010\u0016\u001a\b\u0012\u0004\u0012\u00020\u00150\u0014¢\u0006\u0004\b\u0017\u0010\u0018J\u000f\u0010\u001a\u001a\u00020\u0019H\u0014¢\u0006\u0004\b\u001a\u0010\u001bJ\u0017\u0010\u001f\u001a\u00020\u001e2\u0006\u0010\u001d\u001a\u00020\u001cH\u0016¢\u0006\u0004\b\u001f\u0010 J\u000f\u0010\"\u001a\u00020!H\u0014¢\u0006\u0004\b\"\u0010#J\u000f\u0010$\u001a\u00020\u001eH\u0014¢\u0006\u0004\b$\u0010%J\u000f\u0010'\u001a\u00020&H\u0014¢\u0006\u0004\b'\u0010(J\u000f\u0010)\u001a\u00020!H\u0014¢\u0006\u0004\b)\u0010#J\u000f\u0010*\u001a\u00020\u001eH\u0002¢\u0006\u0004\b*\u0010%J\u000f\u0010+\u001a\u00020\u001eH\u0002¢\u0006\u0004\b+\u0010%J\u000f\u0010,\u001a\u00020\u001eH\u0002¢\u0006\u0004\b,\u0010%J\u000f\u0010-\u001a\u00020\u001eH\u0002¢\u0006\u0004\b-\u0010%J\u000f\u0010.\u001a\u00020\u001eH\u0002¢\u0006\u0004\b.\u0010%J\u000f\u0010/\u001a\u00020\u001eH\u0002¢\u0006\u0004\b/\u0010%J\u000f\u00100\u001a\u00020\u001eH\u0002¢\u0006\u0004\b0\u0010%J\u000f\u00101\u001a\u00020\u001eH\u0002¢\u0006\u0004\b1\u0010%J\u000f\u00102\u001a\u00020\u001eH\u0002¢\u0006\u0004\b2\u0010%J!\u00106\u001a\u00020\u001e2\u0006\u00103\u001a\u00020!2\b\u00105\u001a\u0004\u0018\u000104H\u0002¢\u0006\u0004\b6\u00107J\u0017\u0010;\u001a\u00020:2\u0006\u00109\u001a\u000208H\u0002¢\u0006\u0004\b;\u0010<J\u000f\u0010=\u001a\u00020\u001eH\u0002¢\u0006\u0004\b=\u0010%J;\u0010C\u001a\u00020\u001e2\u0006\u00103\u001a\u00020!2\u0006\u0010>\u001a\u00020&2\u0006\u0010?\u001a\u00020&2\u0012\u0010B\u001a\u000e\u0012\u0004\u0012\u00020&\u0012\u0004\u0012\u00020A0@H\u0002¢\u0006\u0004\bC\u0010DJ\u000f\u0010E\u001a\u00020\u001eH\u0002¢\u0006\u0004\bE\u0010%J\u000f\u0010F\u001a\u00020\u001eH\u0002¢\u0006\u0004\bF\u0010%J\u000f\u0010G\u001a\u00020\u001eH\u0002¢\u0006\u0004\bG\u0010%J\u000f\u0010H\u001a\u00020\u001eH\u0002¢\u0006\u0004\bH\u0010%J\u000f\u0010I\u001a\u00020\u001eH\u0002¢\u0006\u0004\bI\u0010%J\u000f\u0010J\u001a\u00020\u001eH\u0002¢\u0006\u0004\bJ\u0010%J\u000f\u0010K\u001a\u00020\u001eH\u0002¢\u0006\u0004\bK\u0010%J\u000f\u0010L\u001a\u00020\u001eH\u0002¢\u0006\u0004\bL\u0010%R\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0005\u0010MR\u0014\u0010\u0007\u001a\u00020\u00068\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0007\u0010NR\u0014\u0010\t\u001a\u00020\b8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\t\u0010OR\u0014\u0010\u000b\u001a\u00020\n8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u000b\u0010PR\u0014\u0010\r\u001a\u00020\f8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\r\u0010QR\u0014\u0010\u000f\u001a\u00020\u000e8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u000f\u0010RR\u0014\u0010\u0011\u001a\u00020\u00108\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0011\u0010SR\u0014\u0010\u0013\u001a\u00020\u00128\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0013\u0010TR\u001a\u0010\u0016\u001a\b\u0012\u0004\u0012\u00020\u00150\u00148\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0016\u0010UR\u0014\u0010W\u001a\u00020V8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bW\u0010XR\u0018\u0010Z\u001a\u0004\u0018\u00010Y8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\bZ\u0010[R\u0014\u0010\\\u001a\u00020&8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\\\u0010]R\u0016\u0010_\u001a\u00020^8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b_\u0010`¨\u0006a"}, d2 = {"Lcom/yandex/go/taxi/order/driver/profile/view/profile/DriverProfileModalView;", "Lru/yandex/taxi/widget/ModalView;", "Landroid/content/Context;", "context", "Lxhm;", "driverAnalytics", "Lpav;", "imageLoader", "Lqmp;", "featureToggleDelegate", "Ljgv;", "imageUrlResolver", "Lqim;", "driver", "Ljim;", "driverFullNameCopyRouter", "Lk48;", "carCopyRouter", "Lbjm;", "driverProfileAnalytics", "Lyvf0;", "Lwm;", "achievementsAdapterProvider", "<init>", "(Landroid/content/Context;Lxhm;Lpav;Lqmp;Ljgv;Lqim;Ljim;Lk48;Lbjm;Lyvf0;)V", "Lc230;", "insetsType", "()Lc230;", "Lru/yandex/taxi/theme/ThemeType;", "themeType", "Lzy11;", "applyTheme", "(Lru/yandex/taxi/theme/ThemeType;)V", "Landroid/view/View;", "contentView", "()Landroid/view/View;", "onAppearAnimationComplete", "()V", "", UrbanAdsBottomSheetFragment.BACKGROUND_COLOR, "()I", "getFocusedForAccessibilityViewOnAppear", "setupDriverFactsComponent", "setupFullNameComponent", "setupShortNameComponent", "setupCarInfoComponent", "setupParkInfoComponent", "setupAchievementsComponent", "setupPanelVisibility", "setupExtraItemViews", "setupBottomCloseButton", "view", "", "value", "setTextOrGone", "(Landroid/view/View;Ljava/lang/String;)V", "Lcom/yandex/go/taxi/order/models/api/response/OrderStatusInfo$ExtraItem;", "extraItem", "Lru/yandex/taxi/design/ListItemComponent;", "createExtraItemView", "(Lcom/yandex/go/taxi/order/models/api/response/OrderStatusInfo$ExtraItem;)Lru/yandex/taxi/design/ListItemComponent;", "showPhotos", "startValue", "endValue", "Ljava/util/function/BiConsumer;", "Landroid/view/ViewGroup$LayoutParams;", "layoutModifier", "animateLayoutParams", "(Landroid/view/View;IILjava/util/function/BiConsumer;)V", "downloadPhoto", "downloadAvatar", "showAvatar", "animateHidePhoto", "showPhoto", "showFallbackPhoto", "startBlinkAnimation", "stopBlinkAnimation", "Lxhm;", "Lpav;", "Lqmp;", "Ljgv;", "Lqim;", "Ljim;", "Lk48;", "Lbjm;", "Lyvf0;", "Lejm;", "binding", "Lejm;", "Landroid/view/animation/AlphaAnimation;", "photoPlaceholderBlinkAnimation", "Landroid/view/animation/AlphaAnimation;", "avatarImageSize", CA20Status.STATUS_USER_I, "", "fallbackShown", "Z", "impl"}, k = 1, mv = {2, 4, 0}, xi = 48)
/* loaded from: classes14.dex */
public final class DriverProfileModalView extends ModalView {
    public static final int $stable = 8;
    private final yvf0 achievementsAdapterProvider;
    private final int avatarImageSize;
    private final ejm binding;
    private final k48 carCopyRouter;
    private final qim driver;
    private final xhm driverAnalytics;
    private final jim driverFullNameCopyRouter;
    private final bjm driverProfileAnalytics;
    private boolean fallbackShown;
    private final qmp featureToggleDelegate;
    private final pav imageLoader;
    private final jgv imageUrlResolver;
    private AlphaAnimation photoPlaceholderBlinkAnimation;

    public DriverProfileModalView(Context context, xhm xhmVar, pav pavVar, qmp qmpVar, jgv jgvVar, qim qimVar, jim jimVar, k48 k48Var, bjm bjmVar, yvf0 yvf0Var) {
        super(context);
        this.driverAnalytics = xhmVar;
        this.imageLoader = pavVar;
        this.featureToggleDelegate = qmpVar;
        this.imageUrlResolver = jgvVar;
        this.driver = qimVar;
        this.driverFullNameCopyRouter = jimVar;
        this.carCopyRouter = k48Var;
        this.driverProfileAnalytics = bjmVar;
        this.achievementsAdapterProvider = yvf0Var;
        LayoutInflater.from(context).inflate(zkh0.driver_profile_modal_view, this);
        int i = p8h0.content;
        RoundedCornersFrameLayout roundedCornersFrameLayout = (RoundedCornersFrameLayout) cma1.O(i, this);
        if (roundedCornersFrameLayout != null) {
            i = p8h0.content_background;
            FrameLayout frameLayout = (FrameLayout) cma1.O(i, this);
            if (frameLayout != null) {
                i = p8h0.driver_profile_achievement_title;
                ListItemComponent listItemComponent = (ListItemComponent) cma1.O(i, this);
                if (listItemComponent != null) {
                    i = p8h0.driver_profile_achievement_view;
                    ViewStub viewStub = (ViewStub) cma1.O(i, this);
                    if (viewStub != null) {
                        i = p8h0.driver_profile_avatar_view;
                        ImageView imageView = (ImageView) cma1.O(i, this);
                        if (imageView != null) {
                            i = p8h0.driver_profile_bottom_close_button;
                            ButtonComponent buttonComponent = (ButtonComponent) cma1.O(i, this);
                            if (buttonComponent != null) {
                                i = p8h0.driver_profile_bottom_close_button_container;
                                if (((FrameLayout) cma1.O(i, this)) != null) {
                                    i = p8h0.driver_profile_car_info;
                                    ListItemComponent listItemComponent2 = (ListItemComponent) cma1.O(i, this);
                                    if (listItemComponent2 != null) {
                                        i = p8h0.driver_profile_driver_facts;
                                        DriverFactsComponent driverFactsComponent = (DriverFactsComponent) cma1.O(i, this);
                                        if (driverFactsComponent != null) {
                                            i = p8h0.driver_profile_full_name;
                                            ListItemComponent listItemComponent3 = (ListItemComponent) cma1.O(i, this);
                                            if (listItemComponent3 != null) {
                                                i = p8h0.driver_profile_info_block;
                                                LinearLayout linearLayout = (LinearLayout) cma1.O(i, this);
                                                if (linearLayout != null) {
                                                    i = p8h0.driver_profile_panel;
                                                    ListGroupHeaderComponent listGroupHeaderComponent = (ListGroupHeaderComponent) cma1.O(i, this);
                                                    if (listGroupHeaderComponent != null) {
                                                        i = p8h0.driver_profile_park_info;
                                                        ListItemComponent listItemComponent4 = (ListItemComponent) cma1.O(i, this);
                                                        if (listItemComponent4 != null) {
                                                            i = p8h0.driver_profile_photo_container;
                                                            FrameLayout frameLayout2 = (FrameLayout) cma1.O(i, this);
                                                            if (frameLayout2 != null) {
                                                                i = p8h0.driver_profile_photo_placeholder;
                                                                AspectRatioImageView aspectRatioImageView = (AspectRatioImageView) cma1.O(i, this);
                                                                if (aspectRatioImageView != null) {
                                                                    i = p8h0.driver_profile_photo_view;
                                                                    AspectRatioImageView aspectRatioImageView2 = (AspectRatioImageView) cma1.O(i, this);
                                                                    if (aspectRatioImageView2 != null) {
                                                                        i = p8h0.driver_profile_scroll_view;
                                                                        if (((NestedScrollViewAdvanced) cma1.O(i, this)) != null) {
                                                                            i = p8h0.driver_profile_short_name;
                                                                            ListItemComponent listItemComponent5 = (ListItemComponent) cma1.O(i, this);
                                                                            if (listItemComponent5 != null) {
                                                                                this.binding = new ejm(this, roundedCornersFrameLayout, frameLayout, listItemComponent, viewStub, imageView, buttonComponent, listItemComponent2, driverFactsComponent, listItemComponent3, linearLayout, listGroupHeaderComponent, listItemComponent4, frameLayout2, aspectRatioImageView, aspectRatioImageView2, listItemComponent5);
                                                                                this.avatarImageSize = tje.u(144, getContext());
                                                                                setupDriverFactsComponent();
                                                                                setupFullNameComponent();
                                                                                setupShortNameComponent();
                                                                                setupCarInfoComponent();
                                                                                setupParkInfoComponent();
                                                                                setupAchievementsComponent();
                                                                                setupPanelVisibility();
                                                                                setupExtraItemViews();
                                                                                setupBottomCloseButton();
                                                                                return;
                                                                            }
                                                                        }
                                                                    }
                                                                }
                                                            }
                                                        }
                                                    }
                                                }
                                            }
                                        }
                                    }
                                }
                            }
                        }
                    }
                }
            }
        }
        ny61.t("Missing required view with ID: ".concat(getResources().getResourceName(i)));
        throw null;
    }

    private final void animateHidePhoto() {
        ejm ejmVar = this.binding;
        FrameLayout frameLayout = ejmVar.n;
        ejmVar.o.setBackgroundColor(getContext().getColor(xqg0.transparent));
        animateLayoutParams(frameLayout, frameLayout.getHeight(), 0, new ssd(1));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void animateHidePhoto$lambda$0(Integer num, ViewGroup.LayoutParams layoutParams) {
        layoutParams.height = num.intValue();
    }

    private final void animateLayoutParams(View view, int startValue, int endValue, BiConsumer<Integer, ViewGroup.LayoutParams> layoutModifier) {
        ValueAnimator ofInt = ValueAnimator.ofInt(startValue, endValue);
        ofInt.addUpdateListener(new vf2(4, view, layoutModifier));
        ofInt.setDuration(200L);
        ofInt.start();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void animateLayoutParams$lambda$0(View view, BiConsumer biConsumer, ValueAnimator valueAnimator) {
        Integer num = (Integer) valueAnimator.getAnimatedValue();
        ViewGroup.LayoutParams layoutParams = view.getLayoutParams();
        biConsumer.accept(num, layoutParams);
        view.setLayoutParams(layoutParams);
    }

    private final ListItemComponent createExtraItemView(OrderStatusInfo.ExtraItem extraItem) {
        ListItemComponent listItemComponent = new ListItemComponent(getContext(), null, 0, 6, null);
        listItemComponent.setTitle(extraItem.a);
        return listItemComponent;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void downloadAvatar() {
        String a = this.imageUrlResolver.a(this.driver.i);
        if (a == null || a.length() == 0) {
            showFallbackPhoto();
            return;
        }
        nac nacVar = (nac) this.imageLoader.a(this.binding.f);
        nacVar.g(nfv.a);
        int i = this.avatarImageSize;
        nacVar.f(i, i);
        nacVar.h = new cjm(this, 1);
        nacVar.i = new DriverProfileModalView$downloadAvatar$2(0, this, DriverProfileModalView.class, "showFallbackPhoto", "showFallbackPhoto()V", 0);
        nacVar.c(a);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final zy11 downloadAvatar$lambda$0(DriverProfileModalView driverProfileModalView, Drawable drawable) {
        driverProfileModalView.showAvatar();
        return zy11.a;
    }

    private final void downloadPhoto() {
        String a = this.imageUrlResolver.a(this.driver.h);
        if (a == null || a.length() == 0) {
            downloadAvatar();
            return;
        }
        nac nacVar = (nac) this.imageLoader.a(this.binding.p);
        nacVar.h = new cjm(this, 0);
        nacVar.i = new DriverProfileModalView$downloadPhoto$2(0, this, DriverProfileModalView.class, "downloadAvatar", "downloadAvatar()V", 0);
        nacVar.c(a);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final zy11 downloadPhoto$lambda$0(DriverProfileModalView driverProfileModalView, Drawable drawable) {
        driverProfileModalView.showPhoto();
        return zy11.a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final View insetsType$lambda$0(DriverProfileModalView driverProfileModalView) {
        return driverProfileModalView.binding.c;
    }

    private final void setTextOrGone(View view, String value) {
        view.setVisibility(value == null || value.length() == 0 ? 8 : 0);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v4, types: [kotlin.collections.EmptyList] */
    /* JADX WARN: Type inference failed for: r0v5, types: [java.util.List] */
    /* JADX WARN: Type inference failed for: r0v8, types: [java.util.ArrayList] */
    /* JADX WARN: Type inference failed for: r2v0, types: [android.view.View, com.yandex.go.taxi.order.feedback.ui.AchievementsView] */
    private final void setupAchievementsComponent() {
        ?? r0;
        ((ul51) this.featureToggleDelegate).getClass();
        List list = this.driver.e;
        if (list != null) {
            ArrayList arrayList = new ArrayList();
            for (Object obj : list) {
                Driver.FeedbackBadges feedbackBadges = (Driver.FeedbackBadges) obj;
                if (feedbackBadges.b.length() > 0 && feedbackBadges.d.length() > 0) {
                    arrayList.add(obj);
                }
            }
            r0 = new ArrayList(tcc.n(arrayList, 10));
            Iterator it = arrayList.iterator();
            while (it.hasNext()) {
                Driver.FeedbackBadges feedbackBadges2 = (Driver.FeedbackBadges) it.next();
                r0.add(new r8i0(16, "", feedbackBadges2.b, feedbackBadges2.d, null, feedbackBadges2.c, false));
            }
        } else {
            r0 = EmptyList.a;
        }
        ListItemComponent listItemComponent = this.binding.d;
        ?? achievementsView = new AchievementsView(getContext(), (wm) this.achievementsAdapterProvider.get());
        c.w(this.binding.e, achievementsView);
        if (r0.isEmpty()) {
            achievementsView.setVisibility(8);
            listItemComponent.setVisibility(8);
        } else {
            achievementsView.setData(r0);
            achievementsView.setVisibility(0);
            listItemComponent.setVisibility(0);
        }
    }

    private final void setupBottomCloseButton() {
        this.binding.g.setDebounceClickListener(new djm(this, 1));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void setupBottomCloseButton$lambda$0(DriverProfileModalView driverProfileModalView) {
        xhm xhmVar = driverProfileModalView.driverAnalytics;
        qim qimVar = driverProfileModalView.driver;
        nim nimVar = xhmVar.a;
        LinkedHashMap a = xhm.a(qimVar);
        String str = qimVar.g;
        if (str.length() <= 0) {
            str = null;
        }
        nimVar.getClass();
        HashMap hashMap = new HashMap();
        hashMap.put("driver_stat", a);
        if (str != null) {
            hashMap.put("status_title", str);
        }
        nimVar.a.a("DriverInfo.CloseContentCard", hashMap, 1, new HashMap());
        driverProfileModalView.onBackPressed();
    }

    private final void setupCarInfoComponent() {
        ListItemComponent listItemComponent = this.binding.h;
        String str = this.driver.k;
        setTextOrGone(listItemComponent, str);
        listItemComponent.setSubtitle(str);
        if (listItemComponent.getVisibility() == 0) {
            listItemComponent.setTrailImage(f1h0.ic_copy);
            int i = 0;
            listItemComponent.setDebounceClickListener(new djm(this, i));
            b.p(listItemComponent, new bi(listItemComponent.getContext().getString(kyh0.common_copy_to_clipboard), i));
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void setupCarInfoComponent$lambda$0$0(DriverProfileModalView driverProfileModalView) {
        bjm bjmVar = driverProfileModalView.driverProfileAnalytics;
        bjmVar.getClass();
        bjmVar.a.a("DriverProfile.CarNumberCopy.Tapped", new HashMap(), 1, new HashMap());
        String str = driverProfileModalView.driver.l;
        if (str == null || str.length() == 0) {
            return;
        }
        ((m48) driverProfileModalView.carCopyRouter).a(str, CopyInfoType.CAR_NUMBER, CopySource.DETAILS);
    }

    private final void setupDriverFactsComponent() {
        int i;
        DriverFactsComponent driverFactsComponent = this.binding.i;
        Iterator it = this.driver.c.iterator();
        while (true) {
            if (!it.hasNext()) {
                i = 8;
                break;
            }
            Driver.ProfileFact profileFact = (Driver.ProfileFact) it.next();
            if (profileFact.a.length() > 0 && profileFact.b.length() > 0) {
                i = 0;
                break;
            }
        }
        driverFactsComponent.setVisibility(i);
        driverFactsComponent.setFacts(this.driver.c);
    }

    private final void setupExtraItemViews() {
        for (OrderStatusInfo.ExtraItem extraItem : this.driver.n) {
            if (!evu0.J(extraItem.a)) {
                this.binding.k.addView(createExtraItemView(extraItem));
            }
        }
    }

    private final void setupFullNameComponent() {
        ListItemComponent listItemComponent = this.binding.j;
        String str = this.driver.a;
        setTextOrGone(listItemComponent, str);
        listItemComponent.setTitle(str);
        if (listItemComponent.getVisibility() == 0) {
            listItemComponent.setTrailImage(f1h0.ic_copy);
            listItemComponent.setDebounceClickListener(new wqj(9, this, str));
            b.p(listItemComponent, new bi(listItemComponent.getContext().getString(kyh0.common_copy_to_clipboard), 0));
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void setupFullNameComponent$lambda$0$0(DriverProfileModalView driverProfileModalView, String str) {
        ((mim) driverProfileModalView.driverFullNameCopyRouter).a(str, DriverFullNameCopyRouter$CopySource.PROFILE);
    }

    private final void setupPanelVisibility() {
        ejm ejmVar = this.binding;
        ejmVar.l.setVisibility(((ejmVar.h.getVisibility() == 0 || ejmVar.j.getVisibility() == 0 || ejmVar.m.getVisibility() == 0) && (ejmVar.e.getVisibility() == 0 || ejmVar.i.getVisibility() == 0)) ? 0 : 8);
    }

    private final void setupParkInfoComponent() {
        ListItemComponent listItemComponent = this.binding.m;
        String str = this.driver.j;
        setTextOrGone(listItemComponent, str);
        listItemComponent.setSubtitle(str);
    }

    private final void setupShortNameComponent() {
        ListItemComponent listItemComponent = this.binding.q;
        String str = this.driver.f;
        if (str == null || str.length() == 0) {
            str = null;
        }
        if (str == null) {
            str = listItemComponent.getContext().getString(kyh0.order_info_modal_view_driver);
        }
        listItemComponent.setTitle(str);
    }

    private final void showAvatar() {
        stopBlinkAnimation();
        cma1.J(this.binding.f);
        animateHidePhoto();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void showFallbackPhoto() {
        this.fallbackShown = true;
        this.binding.p.setAlpha(1.0f);
        this.binding.p.setImageResource(n4h0.driver_avatar_fallback_background);
        stopBlinkAnimation();
    }

    private final void showPhoto() {
        cma1.J(this.binding.p);
        stopBlinkAnimation();
    }

    private final void showPhotos() {
        boolean b = this.imageUrlResolver.b(this.driver.h);
        boolean b2 = this.imageUrlResolver.b(this.driver.i);
        if (b || b2) {
            startBlinkAnimation();
        }
        downloadPhoto();
    }

    private final void startBlinkAnimation() {
        AlphaAnimation alphaAnimation = new AlphaAnimation(1.0f, 0.1f);
        this.photoPlaceholderBlinkAnimation = alphaAnimation;
        alphaAnimation.setRepeatCount(-1);
        AlphaAnimation alphaAnimation2 = this.photoPlaceholderBlinkAnimation;
        if (alphaAnimation2 != null) {
            alphaAnimation2.setRepeatMode(2);
        }
        AlphaAnimation alphaAnimation3 = this.photoPlaceholderBlinkAnimation;
        if (alphaAnimation3 != null) {
            alphaAnimation3.setDuration(1000L);
        }
        AlphaAnimation alphaAnimation4 = this.photoPlaceholderBlinkAnimation;
        if (alphaAnimation4 != null) {
            alphaAnimation4.setInterpolator(new AccelerateInterpolator());
        }
        this.binding.o.startAnimation(this.photoPlaceholderBlinkAnimation);
        AlphaAnimation alphaAnimation5 = this.photoPlaceholderBlinkAnimation;
        if (alphaAnimation5 != null) {
            alphaAnimation5.start();
        }
    }

    private final void stopBlinkAnimation() {
        AlphaAnimation alphaAnimation = this.photoPlaceholderBlinkAnimation;
        if (alphaAnimation != null) {
            if (alphaAnimation != null) {
                alphaAnimation.cancel();
            }
            this.photoPlaceholderBlinkAnimation = null;
        }
    }

    @Override // ru.yandex.taxi.widget.ModalView, defpackage.nwy0
    public void applyTheme(ThemeType themeType) {
        super.applyTheme(themeType);
        if (this.fallbackShown) {
            showFallbackPhoto();
        }
    }

    @Override // ru.yandex.taxi.widget.ModalView
    /* renamed from: backgroundColor */
    public int getBackgroundColor() {
        return xqg0.transparent_60_black;
    }

    @Override // ru.yandex.taxi.widget.ModalView
    /* renamed from: contentView */
    public View getContent() {
        return this.binding.b;
    }

    @Override // ru.yandex.taxi.widget.ModalView
    public View getFocusedForAccessibilityViewOnAppear() {
        return this.binding.q.title();
    }

    @Override // ru.yandex.taxi.widget.ModalView
    public c230 insetsType() {
        return new c230(0, new bxl(11, this), false);
    }

    @Override // ru.yandex.taxi.widget.ModalView
    public void onAppearAnimationComplete() {
        super.onAppearAnimationComplete();
        showPhotos();
    }
}
