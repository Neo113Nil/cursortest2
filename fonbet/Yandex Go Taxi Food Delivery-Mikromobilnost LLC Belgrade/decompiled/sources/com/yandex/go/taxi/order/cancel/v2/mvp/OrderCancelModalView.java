package com.yandex.go.taxi.order.cancel.v2.mvp;

import android.content.Context;
import android.content.res.ColorStateList;
import android.graphics.Color;
import android.graphics.drawable.Drawable;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.LinearLayout;
import androidx.core.view.b;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import com.yandex.fintechsdk.adapters.flex.sdk.impl.divkit.shimmer.ShimmerDivHandler;
import com.yandex.go.design.view.GoFrameLayout;
import com.yandex.go.design.view.GoLinearLayout;
import com.yandex.go.taxi.order.cancel.v2.domain.models.OrderCancelUiState$HeaderImage$Content;
import com.yandex.go.taxi.order.cancel.v2.mvp.OrderCancelModalView;
import com.yandex.go.taxi.order.cancel.v2.ui.CircleBadgeIcon;
import com.yandex.go.taxi.order.cancel.v2.ui.adapter.a;
import defpackage.cl70;
import defpackage.cma1;
import defpackage.dl70;
import defpackage.el70;
import defpackage.fl70;
import defpackage.g8e;
import defpackage.i3y;
import defpackage.jl40;
import defpackage.kdc;
import defpackage.kyh0;
import defpackage.lhc;
import defpackage.mrg0;
import defpackage.ny61;
import defpackage.ol70;
import defpackage.p8h0;
import defpackage.pl70;
import defpackage.qd00;
import defpackage.qdb1;
import defpackage.qje;
import defpackage.ql70;
import defpackage.rl70;
import defpackage.scc;
import defpackage.sd30;
import defpackage.sf30;
import defpackage.sl70;
import defpackage.sls;
import defpackage.tje;
import defpackage.tl70;
import defpackage.vbb;
import defpackage.w511;
import defpackage.wk70;
import defpackage.wug0;
import defpackage.xng0;
import defpackage.xw31;
import defpackage.yiz0;
import defpackage.zkh0;
import java.util.List;
import kotlin.LazyThreadSafetyMode;
import kotlin.Metadata;
import kotlin.Pair;
import ru.yandex.taxi.common_models.net.Orientation;
import ru.yandex.taxi.design.DividerWithColorView;
import ru.yandex.taxi.design.ListItemComponent;
import ru.yandex.taxi.design.utils.c;
import ru.yandex.taxi.theme.ThemeType;
import ru.yandex.taxi.utils.UiStateDrawableWrapper;
import ru.yandex.taxi.widget.RobotoTextView;
import ru.yandex.taxi.widget.ShimmeringBar;
import ru.yandex.taxi.widget.SlideableBindingModalView;

@Metadata(d1 = {"\u0000´\u0001\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\"\n\u0002\u0010\u0007\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\b\b\u0007\u0018\u0000 \u0086\u00012\b\u0012\u0004\u0012\u00020\u00020\u0001:\u0004\u0087\u0001\u0088\u0001B#\b\u0007\u0012\b\b\u0001\u0010\u0004\u001a\u00020\u0003\u0012\u0006\u0010\u0006\u001a\u00020\u0005\u0012\u0006\u0010\b\u001a\u00020\u0007¢\u0006\u0004\b\t\u0010\nJ\u000f\u0010\f\u001a\u00020\u000bH\u0016¢\u0006\u0004\b\f\u0010\rJ\u001f\u0010\u0012\u001a\u00020\u00022\u0006\u0010\u000f\u001a\u00020\u000e2\u0006\u0010\u0011\u001a\u00020\u0010H\u0016¢\u0006\u0004\b\u0012\u0010\u0013J\u0017\u0010\u0017\u001a\u00020\u00162\u0006\u0010\u0015\u001a\u00020\u0014H\u0016¢\u0006\u0004\b\u0017\u0010\u0018J\u000f\u0010\u0019\u001a\u00020\u0016H\u0014¢\u0006\u0004\b\u0019\u0010\u001aJ\u000f\u0010\u001b\u001a\u00020\u0016H\u0014¢\u0006\u0004\b\u001b\u0010\u001aJ\u000f\u0010\u001d\u001a\u00020\u001cH\u0014¢\u0006\u0004\b\u001d\u0010\u001eJ\u001b\u0010!\u001a\u00020\u0016*\u00020\u00022\u0006\u0010 \u001a\u00020\u001fH\u0002¢\u0006\u0004\b!\u0010\"J\u0013\u0010#\u001a\u00020\u0016*\u00020\u0002H\u0002¢\u0006\u0004\b#\u0010$J\u001d\u0010&\u001a\u00020\u0016*\u00020\u00022\b\u0010%\u001a\u0004\u0018\u00010\u000bH\u0002¢\u0006\u0004\b&\u0010'J\u001b\u0010)\u001a\u00020\u0016*\u00020\u00022\u0006\u0010 \u001a\u00020(H\u0002¢\u0006\u0004\b)\u0010*J\u001d\u0010,\u001a\u00020\u0016*\u00020\u00022\b\u0010+\u001a\u0004\u0018\u00010\u000bH\u0002¢\u0006\u0004\b,\u0010'J\u001b\u0010.\u001a\u00020\u0016*\u00020\u00022\u0006\u0010-\u001a\u00020\u000bH\u0002¢\u0006\u0004\b.\u0010'J\u001b\u0010/\u001a\u00020\u0016*\u00020\u00022\u0006\u0010+\u001a\u00020\u000bH\u0002¢\u0006\u0004\b/\u0010'J!\u00103\u001a\u00020\u0016*\u00020\u00022\f\u00102\u001a\b\u0012\u0004\u0012\u00020100H\u0002¢\u0006\u0004\b3\u00104J\u001b\u00107\u001a\u00020\u0016*\u00020\u00022\u0006\u00106\u001a\u000205H\u0002¢\u0006\u0004\b7\u00108J\u0013\u00109\u001a\u00020\u0016*\u00020\u0002H\u0002¢\u0006\u0004\b9\u0010$J\u001b\u0010:\u001a\u00020\u0016*\u00020\u00022\u0006\u00106\u001a\u000205H\u0002¢\u0006\u0004\b:\u00108J/\u0010C\u001a\u00020B2\u0006\u0010<\u001a\u00020;2\u0006\u0010>\u001a\u00020=2\u0006\u0010@\u001a\u00020?2\u0006\u0010A\u001a\u00020\u001cH\u0002¢\u0006\u0004\bC\u0010DJ\u001b\u0010E\u001a\u00020\u0016*\u00020\u00022\u0006\u0010@\u001a\u00020?H\u0002¢\u0006\u0004\bE\u0010FR\u0014\u0010\u0006\u001a\u00020\u00058\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0006\u0010GR\u0014\u0010\b\u001a\u00020\u00078\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\b\u0010HR\u0018\u0010J\u001a\u0004\u0018\u00010I8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\bJ\u0010KR\u001b\u0010P\u001a\u00020=8BX\u0082\u0084\u0002¢\u0006\f\n\u0004\bL\u0010M\u001a\u0004\bN\u0010OR\u001b\u0010S\u001a\u00020=8BX\u0082\u0084\u0002¢\u0006\f\n\u0004\bQ\u0010M\u001a\u0004\bR\u0010OR\u001b\u0010V\u001a\u00020=8BX\u0082\u0084\u0002¢\u0006\f\n\u0004\bT\u0010M\u001a\u0004\bU\u0010OR\u001b\u0010Y\u001a\u00020=8BX\u0082\u0084\u0002¢\u0006\f\n\u0004\bW\u0010M\u001a\u0004\bX\u0010OR\u001b\u0010\\\u001a\u00020=8BX\u0082\u0084\u0002¢\u0006\f\n\u0004\bZ\u0010M\u001a\u0004\b[\u0010OR\u001b\u0010_\u001a\u00020=8BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b]\u0010M\u001a\u0004\b^\u0010OR\u001b\u0010b\u001a\u00020=8BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b`\u0010M\u001a\u0004\ba\u0010OR\u001b\u0010e\u001a\u00020=8BX\u0082\u0084\u0002¢\u0006\f\n\u0004\bc\u0010M\u001a\u0004\bd\u0010OR\u001b\u0010h\u001a\u00020=8BX\u0082\u0084\u0002¢\u0006\f\n\u0004\bf\u0010M\u001a\u0004\bg\u0010OR\u001b\u0010k\u001a\u00020=8BX\u0082\u0084\u0002¢\u0006\f\n\u0004\bi\u0010M\u001a\u0004\bj\u0010OR\u001b\u0010p\u001a\u00020l8BX\u0082\u0084\u0002¢\u0006\f\n\u0004\bm\u0010M\u001a\u0004\bn\u0010oR\u001b\u0010s\u001a\u00020l8BX\u0082\u0084\u0002¢\u0006\f\n\u0004\bq\u0010M\u001a\u0004\br\u0010oR\u001b\u0010x\u001a\u00020t8BX\u0082\u0084\u0002¢\u0006\f\n\u0004\bu\u0010M\u001a\u0004\bv\u0010wR\u001b\u0010}\u001a\u00020y8BX\u0082\u0084\u0002¢\u0006\f\n\u0004\bz\u0010M\u001a\u0004\b{\u0010|R\u001c\u0010\u0080\u0001\u001a\u00020t8BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b~\u0010M\u001a\u0004\b\u007f\u0010wR \u0010\u0085\u0001\u001a\u00030\u0081\u00018BX\u0082\u0084\u0002¢\u0006\u000f\n\u0005\b\u0082\u0001\u0010M\u001a\u0006\b\u0083\u0001\u0010\u0084\u0001¨\u0006\u0089\u0001"}, d2 = {"Lcom/yandex/go/taxi/order/cancel/v2/mvp/OrderCancelModalView;", "Lru/yandex/taxi/widget/SlideableBindingModalView;", "Lfl70;", "Landroid/content/Context;", "context", "Lwk70;", "presenter", "Lyiz0;", "titleStyleDelegate", "<init>", "(Landroid/content/Context;Lwk70;Lyiz0;)V", "", "screenName", "()Ljava/lang/String;", "Landroid/view/LayoutInflater;", "inflater", "Landroid/view/ViewGroup;", "parent", "bindingFactory", "(Landroid/view/LayoutInflater;Landroid/view/ViewGroup;)Lfl70;", "Lru/yandex/taxi/theme/ThemeType;", "themeType", "Lzy11;", "applyTheme", "(Lru/yandex/taxi/theme/ThemeType;)V", "onAttachedToWindow", "()V", "onDetachedFromWindow", "", "settlingLayoutChanges", "()Z", "Ltl70;", "image", "renderImage", "(Lfl70;Ltl70;)V", "processEmptyImageState", "(Lfl70;)V", "caption", "processLoadingImageState", "(Lfl70;Ljava/lang/String;)V", "Lcom/yandex/go/taxi/order/cancel/v2/domain/models/OrderCancelUiState$HeaderImage$Content;", "processContentImageState", "(Lfl70;Lcom/yandex/go/taxi/order/cancel/v2/domain/models/OrderCancelUiState$HeaderImage$Content;)V", "text", "updateCaption", "title", "renderTitle", "renderText", "", "Lol70;", "actionItems", "renderActions", "(Lfl70;Ljava/util/List;)V", "Lql70;", "buttons", "renderButtons", "(Lfl70;Lql70;)V", "synchronizeButtonsSize", "setButtonsMargins", "Lpl70;", "buttonModel", "", "index", "Lru/yandex/taxi/common_models/net/Orientation;", "orientation", "isLastButton", "Lru/yandex/taxi/design/ListItemComponent;", "createButton", "(Lpl70;ILru/yandex/taxi/common_models/net/Orientation;Z)Lru/yandex/taxi/design/ListItemComponent;", "setButtonsOrientation", "(Lfl70;Lru/yandex/taxi/common_models/net/Orientation;)V", "Lwk70;", "Lyiz0;", "Lcom/yandex/go/taxi/order/cancel/v2/ui/adapter/a;", "cancelActionItemsAdapter", "Lcom/yandex/go/taxi/order/cancel/v2/ui/adapter/a;", "titleTopMarginSmall$delegate", "Li3y;", "getTitleTopMarginSmall", "()I", "titleTopMarginSmall", "titleTopMarginMedium$delegate", "getTitleTopMarginMedium", "titleTopMarginMedium", "titleTopMarginBig$delegate", "getTitleTopMarginBig", "titleTopMarginBig", "horizontalButtonsBottomMargin$delegate", "getHorizontalButtonsBottomMargin", "horizontalButtonsBottomMargin", "verticalButtonsBottomMargin$delegate", "getVerticalButtonsBottomMargin", "verticalButtonsBottomMargin", "horizontalButtonsTopMargin$delegate", "getHorizontalButtonsTopMargin", "horizontalButtonsTopMargin", "verticalButtonsTopMargin$delegate", "getVerticalButtonsTopMargin", "verticalButtonsTopMargin", "buttonsMargin$delegate", "getButtonsMargin", "buttonsMargin", "imageSizeSmall$delegate", "getImageSizeSmall", "imageSizeSmall", "imageSizeBig$delegate", "getImageSizeBig", "imageSizeBig", "", "buttonTitleTextSize$delegate", "getButtonTitleTextSize", "()F", "buttonTitleTextSize", "buttonSubtitleTextSize$delegate", "getButtonSubtitleTextSize", "buttonSubtitleTextSize", "Landroid/widget/ImageView;", "leadingIcon$delegate", "getLeadingIcon", "()Landroid/widget/ImageView;", "leadingIcon", "Lcom/yandex/go/taxi/order/cancel/v2/ui/CircleBadgeIcon;", "centerIcon$delegate", "getCenterIcon", "()Lcom/yandex/go/taxi/order/cancel/v2/ui/CircleBadgeIcon;", "centerIcon", "fullSizeImage$delegate", "getFullSizeImage", "fullSizeImage", "Lru/yandex/taxi/widget/ShimmeringBar;", "shimmer$delegate", "getShimmer", "()Lru/yandex/taxi/widget/ShimmeringBar;", ShimmerDivHandler.EXTENSION_ID, "Companion", "dl70", "cl70", "impl"}, k = 1, mv = {2, 4, 0}, xi = 48)
/* loaded from: classes14.dex */
public final class OrderCancelModalView extends SlideableBindingModalView<fl70> {
    public static final int $stable = 8;
    private static final cl70 Companion = new cl70();

    @Deprecated
    public static final float LAST_BUTTON_LETTER_SPACING = -0.005f;

    @Deprecated
    public static final float TITLE_LETTER_SPACING = -0.01f;

    /* renamed from: buttonSubtitleTextSize$delegate, reason: from kotlin metadata */
    private final i3y buttonSubtitleTextSize;

    /* renamed from: buttonTitleTextSize$delegate, reason: from kotlin metadata */
    private final i3y buttonTitleTextSize;

    /* renamed from: buttonsMargin$delegate, reason: from kotlin metadata */
    private final i3y buttonsMargin;
    private a cancelActionItemsAdapter;

    /* renamed from: centerIcon$delegate, reason: from kotlin metadata */
    private final i3y centerIcon;

    /* renamed from: fullSizeImage$delegate, reason: from kotlin metadata */
    private final i3y fullSizeImage;

    /* renamed from: horizontalButtonsBottomMargin$delegate, reason: from kotlin metadata */
    private final i3y horizontalButtonsBottomMargin;

    /* renamed from: horizontalButtonsTopMargin$delegate, reason: from kotlin metadata */
    private final i3y horizontalButtonsTopMargin;

    /* renamed from: imageSizeBig$delegate, reason: from kotlin metadata */
    private final i3y imageSizeBig;

    /* renamed from: imageSizeSmall$delegate, reason: from kotlin metadata */
    private final i3y imageSizeSmall;

    /* renamed from: leadingIcon$delegate, reason: from kotlin metadata */
    private final i3y leadingIcon;
    private final wk70 presenter;

    /* renamed from: shimmer$delegate, reason: from kotlin metadata */
    private final i3y shimmer;
    private final yiz0 titleStyleDelegate;

    /* renamed from: titleTopMarginBig$delegate, reason: from kotlin metadata */
    private final i3y titleTopMarginBig;

    /* renamed from: titleTopMarginMedium$delegate, reason: from kotlin metadata */
    private final i3y titleTopMarginMedium;

    /* renamed from: titleTopMarginSmall$delegate, reason: from kotlin metadata */
    private final i3y titleTopMarginSmall;

    /* renamed from: verticalButtonsBottomMargin$delegate, reason: from kotlin metadata */
    private final i3y verticalButtonsBottomMargin;

    /* renamed from: verticalButtonsTopMargin$delegate, reason: from kotlin metadata */
    private final i3y verticalButtonsTopMargin;

    public OrderCancelModalView(final Context context, wk70 wk70Var, yiz0 yiz0Var) {
        super(context);
        this.presenter = wk70Var;
        this.titleStyleDelegate = yiz0Var;
        final int i = 8;
        sls slsVar = new sls(this) { // from class: al70
            public final /* synthetic */ OrderCancelModalView b;

            {
                this.b = this;
            }

            @Override // defpackage.sls
            public final Object invoke() {
                int titleTopMarginBig_delegate$lambda$0;
                int horizontalButtonsBottomMargin_delegate$lambda$0;
                int verticalButtonsBottomMargin_delegate$lambda$0;
                int horizontalButtonsTopMargin_delegate$lambda$0;
                int verticalButtonsTopMargin_delegate$lambda$0;
                int buttonsMargin_delegate$lambda$0;
                int imageSizeSmall_delegate$lambda$0;
                int imageSizeBig_delegate$lambda$0;
                int titleTopMarginSmall_delegate$lambda$0;
                float buttonTitleTextSize_delegate$lambda$0;
                float buttonSubtitleTextSize_delegate$lambda$0;
                int titleTopMarginMedium_delegate$lambda$0;
                int i2 = i;
                OrderCancelModalView orderCancelModalView = this.b;
                switch (i2) {
                    case 0:
                        titleTopMarginBig_delegate$lambda$0 = OrderCancelModalView.titleTopMarginBig_delegate$lambda$0(orderCancelModalView);
                        return Integer.valueOf(titleTopMarginBig_delegate$lambda$0);
                    case 1:
                        horizontalButtonsBottomMargin_delegate$lambda$0 = OrderCancelModalView.horizontalButtonsBottomMargin_delegate$lambda$0(orderCancelModalView);
                        return Integer.valueOf(horizontalButtonsBottomMargin_delegate$lambda$0);
                    case 2:
                        verticalButtonsBottomMargin_delegate$lambda$0 = OrderCancelModalView.verticalButtonsBottomMargin_delegate$lambda$0(orderCancelModalView);
                        return Integer.valueOf(verticalButtonsBottomMargin_delegate$lambda$0);
                    case 3:
                        horizontalButtonsTopMargin_delegate$lambda$0 = OrderCancelModalView.horizontalButtonsTopMargin_delegate$lambda$0(orderCancelModalView);
                        return Integer.valueOf(horizontalButtonsTopMargin_delegate$lambda$0);
                    case 4:
                        verticalButtonsTopMargin_delegate$lambda$0 = OrderCancelModalView.verticalButtonsTopMargin_delegate$lambda$0(orderCancelModalView);
                        return Integer.valueOf(verticalButtonsTopMargin_delegate$lambda$0);
                    case 5:
                        buttonsMargin_delegate$lambda$0 = OrderCancelModalView.buttonsMargin_delegate$lambda$0(orderCancelModalView);
                        return Integer.valueOf(buttonsMargin_delegate$lambda$0);
                    case 6:
                        imageSizeSmall_delegate$lambda$0 = OrderCancelModalView.imageSizeSmall_delegate$lambda$0(orderCancelModalView);
                        return Integer.valueOf(imageSizeSmall_delegate$lambda$0);
                    case 7:
                        imageSizeBig_delegate$lambda$0 = OrderCancelModalView.imageSizeBig_delegate$lambda$0(orderCancelModalView);
                        return Integer.valueOf(imageSizeBig_delegate$lambda$0);
                    case 8:
                        titleTopMarginSmall_delegate$lambda$0 = OrderCancelModalView.titleTopMarginSmall_delegate$lambda$0(orderCancelModalView);
                        return Integer.valueOf(titleTopMarginSmall_delegate$lambda$0);
                    case 9:
                        buttonTitleTextSize_delegate$lambda$0 = OrderCancelModalView.buttonTitleTextSize_delegate$lambda$0(orderCancelModalView);
                        return Float.valueOf(buttonTitleTextSize_delegate$lambda$0);
                    case 10:
                        buttonSubtitleTextSize_delegate$lambda$0 = OrderCancelModalView.buttonSubtitleTextSize_delegate$lambda$0(orderCancelModalView);
                        return Float.valueOf(buttonSubtitleTextSize_delegate$lambda$0);
                    default:
                        titleTopMarginMedium_delegate$lambda$0 = OrderCancelModalView.titleTopMarginMedium_delegate$lambda$0(orderCancelModalView);
                        return Integer.valueOf(titleTopMarginMedium_delegate$lambda$0);
                }
            }
        };
        LazyThreadSafetyMode lazyThreadSafetyMode = LazyThreadSafetyMode.NONE;
        this.titleTopMarginSmall = kotlin.a.b(lazyThreadSafetyMode, slsVar);
        final int i2 = 11;
        this.titleTopMarginMedium = kotlin.a.b(lazyThreadSafetyMode, new sls(this) { // from class: al70
            public final /* synthetic */ OrderCancelModalView b;

            {
                this.b = this;
            }

            @Override // defpackage.sls
            public final Object invoke() {
                int titleTopMarginBig_delegate$lambda$0;
                int horizontalButtonsBottomMargin_delegate$lambda$0;
                int verticalButtonsBottomMargin_delegate$lambda$0;
                int horizontalButtonsTopMargin_delegate$lambda$0;
                int verticalButtonsTopMargin_delegate$lambda$0;
                int buttonsMargin_delegate$lambda$0;
                int imageSizeSmall_delegate$lambda$0;
                int imageSizeBig_delegate$lambda$0;
                int titleTopMarginSmall_delegate$lambda$0;
                float buttonTitleTextSize_delegate$lambda$0;
                float buttonSubtitleTextSize_delegate$lambda$0;
                int titleTopMarginMedium_delegate$lambda$0;
                int i22 = i2;
                OrderCancelModalView orderCancelModalView = this.b;
                switch (i22) {
                    case 0:
                        titleTopMarginBig_delegate$lambda$0 = OrderCancelModalView.titleTopMarginBig_delegate$lambda$0(orderCancelModalView);
                        return Integer.valueOf(titleTopMarginBig_delegate$lambda$0);
                    case 1:
                        horizontalButtonsBottomMargin_delegate$lambda$0 = OrderCancelModalView.horizontalButtonsBottomMargin_delegate$lambda$0(orderCancelModalView);
                        return Integer.valueOf(horizontalButtonsBottomMargin_delegate$lambda$0);
                    case 2:
                        verticalButtonsBottomMargin_delegate$lambda$0 = OrderCancelModalView.verticalButtonsBottomMargin_delegate$lambda$0(orderCancelModalView);
                        return Integer.valueOf(verticalButtonsBottomMargin_delegate$lambda$0);
                    case 3:
                        horizontalButtonsTopMargin_delegate$lambda$0 = OrderCancelModalView.horizontalButtonsTopMargin_delegate$lambda$0(orderCancelModalView);
                        return Integer.valueOf(horizontalButtonsTopMargin_delegate$lambda$0);
                    case 4:
                        verticalButtonsTopMargin_delegate$lambda$0 = OrderCancelModalView.verticalButtonsTopMargin_delegate$lambda$0(orderCancelModalView);
                        return Integer.valueOf(verticalButtonsTopMargin_delegate$lambda$0);
                    case 5:
                        buttonsMargin_delegate$lambda$0 = OrderCancelModalView.buttonsMargin_delegate$lambda$0(orderCancelModalView);
                        return Integer.valueOf(buttonsMargin_delegate$lambda$0);
                    case 6:
                        imageSizeSmall_delegate$lambda$0 = OrderCancelModalView.imageSizeSmall_delegate$lambda$0(orderCancelModalView);
                        return Integer.valueOf(imageSizeSmall_delegate$lambda$0);
                    case 7:
                        imageSizeBig_delegate$lambda$0 = OrderCancelModalView.imageSizeBig_delegate$lambda$0(orderCancelModalView);
                        return Integer.valueOf(imageSizeBig_delegate$lambda$0);
                    case 8:
                        titleTopMarginSmall_delegate$lambda$0 = OrderCancelModalView.titleTopMarginSmall_delegate$lambda$0(orderCancelModalView);
                        return Integer.valueOf(titleTopMarginSmall_delegate$lambda$0);
                    case 9:
                        buttonTitleTextSize_delegate$lambda$0 = OrderCancelModalView.buttonTitleTextSize_delegate$lambda$0(orderCancelModalView);
                        return Float.valueOf(buttonTitleTextSize_delegate$lambda$0);
                    case 10:
                        buttonSubtitleTextSize_delegate$lambda$0 = OrderCancelModalView.buttonSubtitleTextSize_delegate$lambda$0(orderCancelModalView);
                        return Float.valueOf(buttonSubtitleTextSize_delegate$lambda$0);
                    default:
                        titleTopMarginMedium_delegate$lambda$0 = OrderCancelModalView.titleTopMarginMedium_delegate$lambda$0(orderCancelModalView);
                        return Integer.valueOf(titleTopMarginMedium_delegate$lambda$0);
                }
            }
        });
        final int i3 = 0;
        this.titleTopMarginBig = kotlin.a.b(lazyThreadSafetyMode, new sls(this) { // from class: al70
            public final /* synthetic */ OrderCancelModalView b;

            {
                this.b = this;
            }

            @Override // defpackage.sls
            public final Object invoke() {
                int titleTopMarginBig_delegate$lambda$0;
                int horizontalButtonsBottomMargin_delegate$lambda$0;
                int verticalButtonsBottomMargin_delegate$lambda$0;
                int horizontalButtonsTopMargin_delegate$lambda$0;
                int verticalButtonsTopMargin_delegate$lambda$0;
                int buttonsMargin_delegate$lambda$0;
                int imageSizeSmall_delegate$lambda$0;
                int imageSizeBig_delegate$lambda$0;
                int titleTopMarginSmall_delegate$lambda$0;
                float buttonTitleTextSize_delegate$lambda$0;
                float buttonSubtitleTextSize_delegate$lambda$0;
                int titleTopMarginMedium_delegate$lambda$0;
                int i22 = i3;
                OrderCancelModalView orderCancelModalView = this.b;
                switch (i22) {
                    case 0:
                        titleTopMarginBig_delegate$lambda$0 = OrderCancelModalView.titleTopMarginBig_delegate$lambda$0(orderCancelModalView);
                        return Integer.valueOf(titleTopMarginBig_delegate$lambda$0);
                    case 1:
                        horizontalButtonsBottomMargin_delegate$lambda$0 = OrderCancelModalView.horizontalButtonsBottomMargin_delegate$lambda$0(orderCancelModalView);
                        return Integer.valueOf(horizontalButtonsBottomMargin_delegate$lambda$0);
                    case 2:
                        verticalButtonsBottomMargin_delegate$lambda$0 = OrderCancelModalView.verticalButtonsBottomMargin_delegate$lambda$0(orderCancelModalView);
                        return Integer.valueOf(verticalButtonsBottomMargin_delegate$lambda$0);
                    case 3:
                        horizontalButtonsTopMargin_delegate$lambda$0 = OrderCancelModalView.horizontalButtonsTopMargin_delegate$lambda$0(orderCancelModalView);
                        return Integer.valueOf(horizontalButtonsTopMargin_delegate$lambda$0);
                    case 4:
                        verticalButtonsTopMargin_delegate$lambda$0 = OrderCancelModalView.verticalButtonsTopMargin_delegate$lambda$0(orderCancelModalView);
                        return Integer.valueOf(verticalButtonsTopMargin_delegate$lambda$0);
                    case 5:
                        buttonsMargin_delegate$lambda$0 = OrderCancelModalView.buttonsMargin_delegate$lambda$0(orderCancelModalView);
                        return Integer.valueOf(buttonsMargin_delegate$lambda$0);
                    case 6:
                        imageSizeSmall_delegate$lambda$0 = OrderCancelModalView.imageSizeSmall_delegate$lambda$0(orderCancelModalView);
                        return Integer.valueOf(imageSizeSmall_delegate$lambda$0);
                    case 7:
                        imageSizeBig_delegate$lambda$0 = OrderCancelModalView.imageSizeBig_delegate$lambda$0(orderCancelModalView);
                        return Integer.valueOf(imageSizeBig_delegate$lambda$0);
                    case 8:
                        titleTopMarginSmall_delegate$lambda$0 = OrderCancelModalView.titleTopMarginSmall_delegate$lambda$0(orderCancelModalView);
                        return Integer.valueOf(titleTopMarginSmall_delegate$lambda$0);
                    case 9:
                        buttonTitleTextSize_delegate$lambda$0 = OrderCancelModalView.buttonTitleTextSize_delegate$lambda$0(orderCancelModalView);
                        return Float.valueOf(buttonTitleTextSize_delegate$lambda$0);
                    case 10:
                        buttonSubtitleTextSize_delegate$lambda$0 = OrderCancelModalView.buttonSubtitleTextSize_delegate$lambda$0(orderCancelModalView);
                        return Float.valueOf(buttonSubtitleTextSize_delegate$lambda$0);
                    default:
                        titleTopMarginMedium_delegate$lambda$0 = OrderCancelModalView.titleTopMarginMedium_delegate$lambda$0(orderCancelModalView);
                        return Integer.valueOf(titleTopMarginMedium_delegate$lambda$0);
                }
            }
        });
        final int i4 = 1;
        this.horizontalButtonsBottomMargin = kotlin.a.b(lazyThreadSafetyMode, new sls(this) { // from class: al70
            public final /* synthetic */ OrderCancelModalView b;

            {
                this.b = this;
            }

            @Override // defpackage.sls
            public final Object invoke() {
                int titleTopMarginBig_delegate$lambda$0;
                int horizontalButtonsBottomMargin_delegate$lambda$0;
                int verticalButtonsBottomMargin_delegate$lambda$0;
                int horizontalButtonsTopMargin_delegate$lambda$0;
                int verticalButtonsTopMargin_delegate$lambda$0;
                int buttonsMargin_delegate$lambda$0;
                int imageSizeSmall_delegate$lambda$0;
                int imageSizeBig_delegate$lambda$0;
                int titleTopMarginSmall_delegate$lambda$0;
                float buttonTitleTextSize_delegate$lambda$0;
                float buttonSubtitleTextSize_delegate$lambda$0;
                int titleTopMarginMedium_delegate$lambda$0;
                int i22 = i4;
                OrderCancelModalView orderCancelModalView = this.b;
                switch (i22) {
                    case 0:
                        titleTopMarginBig_delegate$lambda$0 = OrderCancelModalView.titleTopMarginBig_delegate$lambda$0(orderCancelModalView);
                        return Integer.valueOf(titleTopMarginBig_delegate$lambda$0);
                    case 1:
                        horizontalButtonsBottomMargin_delegate$lambda$0 = OrderCancelModalView.horizontalButtonsBottomMargin_delegate$lambda$0(orderCancelModalView);
                        return Integer.valueOf(horizontalButtonsBottomMargin_delegate$lambda$0);
                    case 2:
                        verticalButtonsBottomMargin_delegate$lambda$0 = OrderCancelModalView.verticalButtonsBottomMargin_delegate$lambda$0(orderCancelModalView);
                        return Integer.valueOf(verticalButtonsBottomMargin_delegate$lambda$0);
                    case 3:
                        horizontalButtonsTopMargin_delegate$lambda$0 = OrderCancelModalView.horizontalButtonsTopMargin_delegate$lambda$0(orderCancelModalView);
                        return Integer.valueOf(horizontalButtonsTopMargin_delegate$lambda$0);
                    case 4:
                        verticalButtonsTopMargin_delegate$lambda$0 = OrderCancelModalView.verticalButtonsTopMargin_delegate$lambda$0(orderCancelModalView);
                        return Integer.valueOf(verticalButtonsTopMargin_delegate$lambda$0);
                    case 5:
                        buttonsMargin_delegate$lambda$0 = OrderCancelModalView.buttonsMargin_delegate$lambda$0(orderCancelModalView);
                        return Integer.valueOf(buttonsMargin_delegate$lambda$0);
                    case 6:
                        imageSizeSmall_delegate$lambda$0 = OrderCancelModalView.imageSizeSmall_delegate$lambda$0(orderCancelModalView);
                        return Integer.valueOf(imageSizeSmall_delegate$lambda$0);
                    case 7:
                        imageSizeBig_delegate$lambda$0 = OrderCancelModalView.imageSizeBig_delegate$lambda$0(orderCancelModalView);
                        return Integer.valueOf(imageSizeBig_delegate$lambda$0);
                    case 8:
                        titleTopMarginSmall_delegate$lambda$0 = OrderCancelModalView.titleTopMarginSmall_delegate$lambda$0(orderCancelModalView);
                        return Integer.valueOf(titleTopMarginSmall_delegate$lambda$0);
                    case 9:
                        buttonTitleTextSize_delegate$lambda$0 = OrderCancelModalView.buttonTitleTextSize_delegate$lambda$0(orderCancelModalView);
                        return Float.valueOf(buttonTitleTextSize_delegate$lambda$0);
                    case 10:
                        buttonSubtitleTextSize_delegate$lambda$0 = OrderCancelModalView.buttonSubtitleTextSize_delegate$lambda$0(orderCancelModalView);
                        return Float.valueOf(buttonSubtitleTextSize_delegate$lambda$0);
                    default:
                        titleTopMarginMedium_delegate$lambda$0 = OrderCancelModalView.titleTopMarginMedium_delegate$lambda$0(orderCancelModalView);
                        return Integer.valueOf(titleTopMarginMedium_delegate$lambda$0);
                }
            }
        });
        final int i5 = 2;
        this.verticalButtonsBottomMargin = kotlin.a.b(lazyThreadSafetyMode, new sls(this) { // from class: al70
            public final /* synthetic */ OrderCancelModalView b;

            {
                this.b = this;
            }

            @Override // defpackage.sls
            public final Object invoke() {
                int titleTopMarginBig_delegate$lambda$0;
                int horizontalButtonsBottomMargin_delegate$lambda$0;
                int verticalButtonsBottomMargin_delegate$lambda$0;
                int horizontalButtonsTopMargin_delegate$lambda$0;
                int verticalButtonsTopMargin_delegate$lambda$0;
                int buttonsMargin_delegate$lambda$0;
                int imageSizeSmall_delegate$lambda$0;
                int imageSizeBig_delegate$lambda$0;
                int titleTopMarginSmall_delegate$lambda$0;
                float buttonTitleTextSize_delegate$lambda$0;
                float buttonSubtitleTextSize_delegate$lambda$0;
                int titleTopMarginMedium_delegate$lambda$0;
                int i22 = i5;
                OrderCancelModalView orderCancelModalView = this.b;
                switch (i22) {
                    case 0:
                        titleTopMarginBig_delegate$lambda$0 = OrderCancelModalView.titleTopMarginBig_delegate$lambda$0(orderCancelModalView);
                        return Integer.valueOf(titleTopMarginBig_delegate$lambda$0);
                    case 1:
                        horizontalButtonsBottomMargin_delegate$lambda$0 = OrderCancelModalView.horizontalButtonsBottomMargin_delegate$lambda$0(orderCancelModalView);
                        return Integer.valueOf(horizontalButtonsBottomMargin_delegate$lambda$0);
                    case 2:
                        verticalButtonsBottomMargin_delegate$lambda$0 = OrderCancelModalView.verticalButtonsBottomMargin_delegate$lambda$0(orderCancelModalView);
                        return Integer.valueOf(verticalButtonsBottomMargin_delegate$lambda$0);
                    case 3:
                        horizontalButtonsTopMargin_delegate$lambda$0 = OrderCancelModalView.horizontalButtonsTopMargin_delegate$lambda$0(orderCancelModalView);
                        return Integer.valueOf(horizontalButtonsTopMargin_delegate$lambda$0);
                    case 4:
                        verticalButtonsTopMargin_delegate$lambda$0 = OrderCancelModalView.verticalButtonsTopMargin_delegate$lambda$0(orderCancelModalView);
                        return Integer.valueOf(verticalButtonsTopMargin_delegate$lambda$0);
                    case 5:
                        buttonsMargin_delegate$lambda$0 = OrderCancelModalView.buttonsMargin_delegate$lambda$0(orderCancelModalView);
                        return Integer.valueOf(buttonsMargin_delegate$lambda$0);
                    case 6:
                        imageSizeSmall_delegate$lambda$0 = OrderCancelModalView.imageSizeSmall_delegate$lambda$0(orderCancelModalView);
                        return Integer.valueOf(imageSizeSmall_delegate$lambda$0);
                    case 7:
                        imageSizeBig_delegate$lambda$0 = OrderCancelModalView.imageSizeBig_delegate$lambda$0(orderCancelModalView);
                        return Integer.valueOf(imageSizeBig_delegate$lambda$0);
                    case 8:
                        titleTopMarginSmall_delegate$lambda$0 = OrderCancelModalView.titleTopMarginSmall_delegate$lambda$0(orderCancelModalView);
                        return Integer.valueOf(titleTopMarginSmall_delegate$lambda$0);
                    case 9:
                        buttonTitleTextSize_delegate$lambda$0 = OrderCancelModalView.buttonTitleTextSize_delegate$lambda$0(orderCancelModalView);
                        return Float.valueOf(buttonTitleTextSize_delegate$lambda$0);
                    case 10:
                        buttonSubtitleTextSize_delegate$lambda$0 = OrderCancelModalView.buttonSubtitleTextSize_delegate$lambda$0(orderCancelModalView);
                        return Float.valueOf(buttonSubtitleTextSize_delegate$lambda$0);
                    default:
                        titleTopMarginMedium_delegate$lambda$0 = OrderCancelModalView.titleTopMarginMedium_delegate$lambda$0(orderCancelModalView);
                        return Integer.valueOf(titleTopMarginMedium_delegate$lambda$0);
                }
            }
        });
        final int i6 = 3;
        this.horizontalButtonsTopMargin = kotlin.a.b(lazyThreadSafetyMode, new sls(this) { // from class: al70
            public final /* synthetic */ OrderCancelModalView b;

            {
                this.b = this;
            }

            @Override // defpackage.sls
            public final Object invoke() {
                int titleTopMarginBig_delegate$lambda$0;
                int horizontalButtonsBottomMargin_delegate$lambda$0;
                int verticalButtonsBottomMargin_delegate$lambda$0;
                int horizontalButtonsTopMargin_delegate$lambda$0;
                int verticalButtonsTopMargin_delegate$lambda$0;
                int buttonsMargin_delegate$lambda$0;
                int imageSizeSmall_delegate$lambda$0;
                int imageSizeBig_delegate$lambda$0;
                int titleTopMarginSmall_delegate$lambda$0;
                float buttonTitleTextSize_delegate$lambda$0;
                float buttonSubtitleTextSize_delegate$lambda$0;
                int titleTopMarginMedium_delegate$lambda$0;
                int i22 = i6;
                OrderCancelModalView orderCancelModalView = this.b;
                switch (i22) {
                    case 0:
                        titleTopMarginBig_delegate$lambda$0 = OrderCancelModalView.titleTopMarginBig_delegate$lambda$0(orderCancelModalView);
                        return Integer.valueOf(titleTopMarginBig_delegate$lambda$0);
                    case 1:
                        horizontalButtonsBottomMargin_delegate$lambda$0 = OrderCancelModalView.horizontalButtonsBottomMargin_delegate$lambda$0(orderCancelModalView);
                        return Integer.valueOf(horizontalButtonsBottomMargin_delegate$lambda$0);
                    case 2:
                        verticalButtonsBottomMargin_delegate$lambda$0 = OrderCancelModalView.verticalButtonsBottomMargin_delegate$lambda$0(orderCancelModalView);
                        return Integer.valueOf(verticalButtonsBottomMargin_delegate$lambda$0);
                    case 3:
                        horizontalButtonsTopMargin_delegate$lambda$0 = OrderCancelModalView.horizontalButtonsTopMargin_delegate$lambda$0(orderCancelModalView);
                        return Integer.valueOf(horizontalButtonsTopMargin_delegate$lambda$0);
                    case 4:
                        verticalButtonsTopMargin_delegate$lambda$0 = OrderCancelModalView.verticalButtonsTopMargin_delegate$lambda$0(orderCancelModalView);
                        return Integer.valueOf(verticalButtonsTopMargin_delegate$lambda$0);
                    case 5:
                        buttonsMargin_delegate$lambda$0 = OrderCancelModalView.buttonsMargin_delegate$lambda$0(orderCancelModalView);
                        return Integer.valueOf(buttonsMargin_delegate$lambda$0);
                    case 6:
                        imageSizeSmall_delegate$lambda$0 = OrderCancelModalView.imageSizeSmall_delegate$lambda$0(orderCancelModalView);
                        return Integer.valueOf(imageSizeSmall_delegate$lambda$0);
                    case 7:
                        imageSizeBig_delegate$lambda$0 = OrderCancelModalView.imageSizeBig_delegate$lambda$0(orderCancelModalView);
                        return Integer.valueOf(imageSizeBig_delegate$lambda$0);
                    case 8:
                        titleTopMarginSmall_delegate$lambda$0 = OrderCancelModalView.titleTopMarginSmall_delegate$lambda$0(orderCancelModalView);
                        return Integer.valueOf(titleTopMarginSmall_delegate$lambda$0);
                    case 9:
                        buttonTitleTextSize_delegate$lambda$0 = OrderCancelModalView.buttonTitleTextSize_delegate$lambda$0(orderCancelModalView);
                        return Float.valueOf(buttonTitleTextSize_delegate$lambda$0);
                    case 10:
                        buttonSubtitleTextSize_delegate$lambda$0 = OrderCancelModalView.buttonSubtitleTextSize_delegate$lambda$0(orderCancelModalView);
                        return Float.valueOf(buttonSubtitleTextSize_delegate$lambda$0);
                    default:
                        titleTopMarginMedium_delegate$lambda$0 = OrderCancelModalView.titleTopMarginMedium_delegate$lambda$0(orderCancelModalView);
                        return Integer.valueOf(titleTopMarginMedium_delegate$lambda$0);
                }
            }
        });
        final int i7 = 4;
        this.verticalButtonsTopMargin = kotlin.a.b(lazyThreadSafetyMode, new sls(this) { // from class: al70
            public final /* synthetic */ OrderCancelModalView b;

            {
                this.b = this;
            }

            @Override // defpackage.sls
            public final Object invoke() {
                int titleTopMarginBig_delegate$lambda$0;
                int horizontalButtonsBottomMargin_delegate$lambda$0;
                int verticalButtonsBottomMargin_delegate$lambda$0;
                int horizontalButtonsTopMargin_delegate$lambda$0;
                int verticalButtonsTopMargin_delegate$lambda$0;
                int buttonsMargin_delegate$lambda$0;
                int imageSizeSmall_delegate$lambda$0;
                int imageSizeBig_delegate$lambda$0;
                int titleTopMarginSmall_delegate$lambda$0;
                float buttonTitleTextSize_delegate$lambda$0;
                float buttonSubtitleTextSize_delegate$lambda$0;
                int titleTopMarginMedium_delegate$lambda$0;
                int i22 = i7;
                OrderCancelModalView orderCancelModalView = this.b;
                switch (i22) {
                    case 0:
                        titleTopMarginBig_delegate$lambda$0 = OrderCancelModalView.titleTopMarginBig_delegate$lambda$0(orderCancelModalView);
                        return Integer.valueOf(titleTopMarginBig_delegate$lambda$0);
                    case 1:
                        horizontalButtonsBottomMargin_delegate$lambda$0 = OrderCancelModalView.horizontalButtonsBottomMargin_delegate$lambda$0(orderCancelModalView);
                        return Integer.valueOf(horizontalButtonsBottomMargin_delegate$lambda$0);
                    case 2:
                        verticalButtonsBottomMargin_delegate$lambda$0 = OrderCancelModalView.verticalButtonsBottomMargin_delegate$lambda$0(orderCancelModalView);
                        return Integer.valueOf(verticalButtonsBottomMargin_delegate$lambda$0);
                    case 3:
                        horizontalButtonsTopMargin_delegate$lambda$0 = OrderCancelModalView.horizontalButtonsTopMargin_delegate$lambda$0(orderCancelModalView);
                        return Integer.valueOf(horizontalButtonsTopMargin_delegate$lambda$0);
                    case 4:
                        verticalButtonsTopMargin_delegate$lambda$0 = OrderCancelModalView.verticalButtonsTopMargin_delegate$lambda$0(orderCancelModalView);
                        return Integer.valueOf(verticalButtonsTopMargin_delegate$lambda$0);
                    case 5:
                        buttonsMargin_delegate$lambda$0 = OrderCancelModalView.buttonsMargin_delegate$lambda$0(orderCancelModalView);
                        return Integer.valueOf(buttonsMargin_delegate$lambda$0);
                    case 6:
                        imageSizeSmall_delegate$lambda$0 = OrderCancelModalView.imageSizeSmall_delegate$lambda$0(orderCancelModalView);
                        return Integer.valueOf(imageSizeSmall_delegate$lambda$0);
                    case 7:
                        imageSizeBig_delegate$lambda$0 = OrderCancelModalView.imageSizeBig_delegate$lambda$0(orderCancelModalView);
                        return Integer.valueOf(imageSizeBig_delegate$lambda$0);
                    case 8:
                        titleTopMarginSmall_delegate$lambda$0 = OrderCancelModalView.titleTopMarginSmall_delegate$lambda$0(orderCancelModalView);
                        return Integer.valueOf(titleTopMarginSmall_delegate$lambda$0);
                    case 9:
                        buttonTitleTextSize_delegate$lambda$0 = OrderCancelModalView.buttonTitleTextSize_delegate$lambda$0(orderCancelModalView);
                        return Float.valueOf(buttonTitleTextSize_delegate$lambda$0);
                    case 10:
                        buttonSubtitleTextSize_delegate$lambda$0 = OrderCancelModalView.buttonSubtitleTextSize_delegate$lambda$0(orderCancelModalView);
                        return Float.valueOf(buttonSubtitleTextSize_delegate$lambda$0);
                    default:
                        titleTopMarginMedium_delegate$lambda$0 = OrderCancelModalView.titleTopMarginMedium_delegate$lambda$0(orderCancelModalView);
                        return Integer.valueOf(titleTopMarginMedium_delegate$lambda$0);
                }
            }
        });
        final int i8 = 5;
        this.buttonsMargin = kotlin.a.b(lazyThreadSafetyMode, new sls(this) { // from class: al70
            public final /* synthetic */ OrderCancelModalView b;

            {
                this.b = this;
            }

            @Override // defpackage.sls
            public final Object invoke() {
                int titleTopMarginBig_delegate$lambda$0;
                int horizontalButtonsBottomMargin_delegate$lambda$0;
                int verticalButtonsBottomMargin_delegate$lambda$0;
                int horizontalButtonsTopMargin_delegate$lambda$0;
                int verticalButtonsTopMargin_delegate$lambda$0;
                int buttonsMargin_delegate$lambda$0;
                int imageSizeSmall_delegate$lambda$0;
                int imageSizeBig_delegate$lambda$0;
                int titleTopMarginSmall_delegate$lambda$0;
                float buttonTitleTextSize_delegate$lambda$0;
                float buttonSubtitleTextSize_delegate$lambda$0;
                int titleTopMarginMedium_delegate$lambda$0;
                int i22 = i8;
                OrderCancelModalView orderCancelModalView = this.b;
                switch (i22) {
                    case 0:
                        titleTopMarginBig_delegate$lambda$0 = OrderCancelModalView.titleTopMarginBig_delegate$lambda$0(orderCancelModalView);
                        return Integer.valueOf(titleTopMarginBig_delegate$lambda$0);
                    case 1:
                        horizontalButtonsBottomMargin_delegate$lambda$0 = OrderCancelModalView.horizontalButtonsBottomMargin_delegate$lambda$0(orderCancelModalView);
                        return Integer.valueOf(horizontalButtonsBottomMargin_delegate$lambda$0);
                    case 2:
                        verticalButtonsBottomMargin_delegate$lambda$0 = OrderCancelModalView.verticalButtonsBottomMargin_delegate$lambda$0(orderCancelModalView);
                        return Integer.valueOf(verticalButtonsBottomMargin_delegate$lambda$0);
                    case 3:
                        horizontalButtonsTopMargin_delegate$lambda$0 = OrderCancelModalView.horizontalButtonsTopMargin_delegate$lambda$0(orderCancelModalView);
                        return Integer.valueOf(horizontalButtonsTopMargin_delegate$lambda$0);
                    case 4:
                        verticalButtonsTopMargin_delegate$lambda$0 = OrderCancelModalView.verticalButtonsTopMargin_delegate$lambda$0(orderCancelModalView);
                        return Integer.valueOf(verticalButtonsTopMargin_delegate$lambda$0);
                    case 5:
                        buttonsMargin_delegate$lambda$0 = OrderCancelModalView.buttonsMargin_delegate$lambda$0(orderCancelModalView);
                        return Integer.valueOf(buttonsMargin_delegate$lambda$0);
                    case 6:
                        imageSizeSmall_delegate$lambda$0 = OrderCancelModalView.imageSizeSmall_delegate$lambda$0(orderCancelModalView);
                        return Integer.valueOf(imageSizeSmall_delegate$lambda$0);
                    case 7:
                        imageSizeBig_delegate$lambda$0 = OrderCancelModalView.imageSizeBig_delegate$lambda$0(orderCancelModalView);
                        return Integer.valueOf(imageSizeBig_delegate$lambda$0);
                    case 8:
                        titleTopMarginSmall_delegate$lambda$0 = OrderCancelModalView.titleTopMarginSmall_delegate$lambda$0(orderCancelModalView);
                        return Integer.valueOf(titleTopMarginSmall_delegate$lambda$0);
                    case 9:
                        buttonTitleTextSize_delegate$lambda$0 = OrderCancelModalView.buttonTitleTextSize_delegate$lambda$0(orderCancelModalView);
                        return Float.valueOf(buttonTitleTextSize_delegate$lambda$0);
                    case 10:
                        buttonSubtitleTextSize_delegate$lambda$0 = OrderCancelModalView.buttonSubtitleTextSize_delegate$lambda$0(orderCancelModalView);
                        return Float.valueOf(buttonSubtitleTextSize_delegate$lambda$0);
                    default:
                        titleTopMarginMedium_delegate$lambda$0 = OrderCancelModalView.titleTopMarginMedium_delegate$lambda$0(orderCancelModalView);
                        return Integer.valueOf(titleTopMarginMedium_delegate$lambda$0);
                }
            }
        });
        final int i9 = 6;
        this.imageSizeSmall = kotlin.a.b(lazyThreadSafetyMode, new sls(this) { // from class: al70
            public final /* synthetic */ OrderCancelModalView b;

            {
                this.b = this;
            }

            @Override // defpackage.sls
            public final Object invoke() {
                int titleTopMarginBig_delegate$lambda$0;
                int horizontalButtonsBottomMargin_delegate$lambda$0;
                int verticalButtonsBottomMargin_delegate$lambda$0;
                int horizontalButtonsTopMargin_delegate$lambda$0;
                int verticalButtonsTopMargin_delegate$lambda$0;
                int buttonsMargin_delegate$lambda$0;
                int imageSizeSmall_delegate$lambda$0;
                int imageSizeBig_delegate$lambda$0;
                int titleTopMarginSmall_delegate$lambda$0;
                float buttonTitleTextSize_delegate$lambda$0;
                float buttonSubtitleTextSize_delegate$lambda$0;
                int titleTopMarginMedium_delegate$lambda$0;
                int i22 = i9;
                OrderCancelModalView orderCancelModalView = this.b;
                switch (i22) {
                    case 0:
                        titleTopMarginBig_delegate$lambda$0 = OrderCancelModalView.titleTopMarginBig_delegate$lambda$0(orderCancelModalView);
                        return Integer.valueOf(titleTopMarginBig_delegate$lambda$0);
                    case 1:
                        horizontalButtonsBottomMargin_delegate$lambda$0 = OrderCancelModalView.horizontalButtonsBottomMargin_delegate$lambda$0(orderCancelModalView);
                        return Integer.valueOf(horizontalButtonsBottomMargin_delegate$lambda$0);
                    case 2:
                        verticalButtonsBottomMargin_delegate$lambda$0 = OrderCancelModalView.verticalButtonsBottomMargin_delegate$lambda$0(orderCancelModalView);
                        return Integer.valueOf(verticalButtonsBottomMargin_delegate$lambda$0);
                    case 3:
                        horizontalButtonsTopMargin_delegate$lambda$0 = OrderCancelModalView.horizontalButtonsTopMargin_delegate$lambda$0(orderCancelModalView);
                        return Integer.valueOf(horizontalButtonsTopMargin_delegate$lambda$0);
                    case 4:
                        verticalButtonsTopMargin_delegate$lambda$0 = OrderCancelModalView.verticalButtonsTopMargin_delegate$lambda$0(orderCancelModalView);
                        return Integer.valueOf(verticalButtonsTopMargin_delegate$lambda$0);
                    case 5:
                        buttonsMargin_delegate$lambda$0 = OrderCancelModalView.buttonsMargin_delegate$lambda$0(orderCancelModalView);
                        return Integer.valueOf(buttonsMargin_delegate$lambda$0);
                    case 6:
                        imageSizeSmall_delegate$lambda$0 = OrderCancelModalView.imageSizeSmall_delegate$lambda$0(orderCancelModalView);
                        return Integer.valueOf(imageSizeSmall_delegate$lambda$0);
                    case 7:
                        imageSizeBig_delegate$lambda$0 = OrderCancelModalView.imageSizeBig_delegate$lambda$0(orderCancelModalView);
                        return Integer.valueOf(imageSizeBig_delegate$lambda$0);
                    case 8:
                        titleTopMarginSmall_delegate$lambda$0 = OrderCancelModalView.titleTopMarginSmall_delegate$lambda$0(orderCancelModalView);
                        return Integer.valueOf(titleTopMarginSmall_delegate$lambda$0);
                    case 9:
                        buttonTitleTextSize_delegate$lambda$0 = OrderCancelModalView.buttonTitleTextSize_delegate$lambda$0(orderCancelModalView);
                        return Float.valueOf(buttonTitleTextSize_delegate$lambda$0);
                    case 10:
                        buttonSubtitleTextSize_delegate$lambda$0 = OrderCancelModalView.buttonSubtitleTextSize_delegate$lambda$0(orderCancelModalView);
                        return Float.valueOf(buttonSubtitleTextSize_delegate$lambda$0);
                    default:
                        titleTopMarginMedium_delegate$lambda$0 = OrderCancelModalView.titleTopMarginMedium_delegate$lambda$0(orderCancelModalView);
                        return Integer.valueOf(titleTopMarginMedium_delegate$lambda$0);
                }
            }
        });
        final int i10 = 7;
        this.imageSizeBig = kotlin.a.b(lazyThreadSafetyMode, new sls(this) { // from class: al70
            public final /* synthetic */ OrderCancelModalView b;

            {
                this.b = this;
            }

            @Override // defpackage.sls
            public final Object invoke() {
                int titleTopMarginBig_delegate$lambda$0;
                int horizontalButtonsBottomMargin_delegate$lambda$0;
                int verticalButtonsBottomMargin_delegate$lambda$0;
                int horizontalButtonsTopMargin_delegate$lambda$0;
                int verticalButtonsTopMargin_delegate$lambda$0;
                int buttonsMargin_delegate$lambda$0;
                int imageSizeSmall_delegate$lambda$0;
                int imageSizeBig_delegate$lambda$0;
                int titleTopMarginSmall_delegate$lambda$0;
                float buttonTitleTextSize_delegate$lambda$0;
                float buttonSubtitleTextSize_delegate$lambda$0;
                int titleTopMarginMedium_delegate$lambda$0;
                int i22 = i10;
                OrderCancelModalView orderCancelModalView = this.b;
                switch (i22) {
                    case 0:
                        titleTopMarginBig_delegate$lambda$0 = OrderCancelModalView.titleTopMarginBig_delegate$lambda$0(orderCancelModalView);
                        return Integer.valueOf(titleTopMarginBig_delegate$lambda$0);
                    case 1:
                        horizontalButtonsBottomMargin_delegate$lambda$0 = OrderCancelModalView.horizontalButtonsBottomMargin_delegate$lambda$0(orderCancelModalView);
                        return Integer.valueOf(horizontalButtonsBottomMargin_delegate$lambda$0);
                    case 2:
                        verticalButtonsBottomMargin_delegate$lambda$0 = OrderCancelModalView.verticalButtonsBottomMargin_delegate$lambda$0(orderCancelModalView);
                        return Integer.valueOf(verticalButtonsBottomMargin_delegate$lambda$0);
                    case 3:
                        horizontalButtonsTopMargin_delegate$lambda$0 = OrderCancelModalView.horizontalButtonsTopMargin_delegate$lambda$0(orderCancelModalView);
                        return Integer.valueOf(horizontalButtonsTopMargin_delegate$lambda$0);
                    case 4:
                        verticalButtonsTopMargin_delegate$lambda$0 = OrderCancelModalView.verticalButtonsTopMargin_delegate$lambda$0(orderCancelModalView);
                        return Integer.valueOf(verticalButtonsTopMargin_delegate$lambda$0);
                    case 5:
                        buttonsMargin_delegate$lambda$0 = OrderCancelModalView.buttonsMargin_delegate$lambda$0(orderCancelModalView);
                        return Integer.valueOf(buttonsMargin_delegate$lambda$0);
                    case 6:
                        imageSizeSmall_delegate$lambda$0 = OrderCancelModalView.imageSizeSmall_delegate$lambda$0(orderCancelModalView);
                        return Integer.valueOf(imageSizeSmall_delegate$lambda$0);
                    case 7:
                        imageSizeBig_delegate$lambda$0 = OrderCancelModalView.imageSizeBig_delegate$lambda$0(orderCancelModalView);
                        return Integer.valueOf(imageSizeBig_delegate$lambda$0);
                    case 8:
                        titleTopMarginSmall_delegate$lambda$0 = OrderCancelModalView.titleTopMarginSmall_delegate$lambda$0(orderCancelModalView);
                        return Integer.valueOf(titleTopMarginSmall_delegate$lambda$0);
                    case 9:
                        buttonTitleTextSize_delegate$lambda$0 = OrderCancelModalView.buttonTitleTextSize_delegate$lambda$0(orderCancelModalView);
                        return Float.valueOf(buttonTitleTextSize_delegate$lambda$0);
                    case 10:
                        buttonSubtitleTextSize_delegate$lambda$0 = OrderCancelModalView.buttonSubtitleTextSize_delegate$lambda$0(orderCancelModalView);
                        return Float.valueOf(buttonSubtitleTextSize_delegate$lambda$0);
                    default:
                        titleTopMarginMedium_delegate$lambda$0 = OrderCancelModalView.titleTopMarginMedium_delegate$lambda$0(orderCancelModalView);
                        return Integer.valueOf(titleTopMarginMedium_delegate$lambda$0);
                }
            }
        });
        final int i11 = 9;
        this.buttonTitleTextSize = kotlin.a.b(lazyThreadSafetyMode, new sls(this) { // from class: al70
            public final /* synthetic */ OrderCancelModalView b;

            {
                this.b = this;
            }

            @Override // defpackage.sls
            public final Object invoke() {
                int titleTopMarginBig_delegate$lambda$0;
                int horizontalButtonsBottomMargin_delegate$lambda$0;
                int verticalButtonsBottomMargin_delegate$lambda$0;
                int horizontalButtonsTopMargin_delegate$lambda$0;
                int verticalButtonsTopMargin_delegate$lambda$0;
                int buttonsMargin_delegate$lambda$0;
                int imageSizeSmall_delegate$lambda$0;
                int imageSizeBig_delegate$lambda$0;
                int titleTopMarginSmall_delegate$lambda$0;
                float buttonTitleTextSize_delegate$lambda$0;
                float buttonSubtitleTextSize_delegate$lambda$0;
                int titleTopMarginMedium_delegate$lambda$0;
                int i22 = i11;
                OrderCancelModalView orderCancelModalView = this.b;
                switch (i22) {
                    case 0:
                        titleTopMarginBig_delegate$lambda$0 = OrderCancelModalView.titleTopMarginBig_delegate$lambda$0(orderCancelModalView);
                        return Integer.valueOf(titleTopMarginBig_delegate$lambda$0);
                    case 1:
                        horizontalButtonsBottomMargin_delegate$lambda$0 = OrderCancelModalView.horizontalButtonsBottomMargin_delegate$lambda$0(orderCancelModalView);
                        return Integer.valueOf(horizontalButtonsBottomMargin_delegate$lambda$0);
                    case 2:
                        verticalButtonsBottomMargin_delegate$lambda$0 = OrderCancelModalView.verticalButtonsBottomMargin_delegate$lambda$0(orderCancelModalView);
                        return Integer.valueOf(verticalButtonsBottomMargin_delegate$lambda$0);
                    case 3:
                        horizontalButtonsTopMargin_delegate$lambda$0 = OrderCancelModalView.horizontalButtonsTopMargin_delegate$lambda$0(orderCancelModalView);
                        return Integer.valueOf(horizontalButtonsTopMargin_delegate$lambda$0);
                    case 4:
                        verticalButtonsTopMargin_delegate$lambda$0 = OrderCancelModalView.verticalButtonsTopMargin_delegate$lambda$0(orderCancelModalView);
                        return Integer.valueOf(verticalButtonsTopMargin_delegate$lambda$0);
                    case 5:
                        buttonsMargin_delegate$lambda$0 = OrderCancelModalView.buttonsMargin_delegate$lambda$0(orderCancelModalView);
                        return Integer.valueOf(buttonsMargin_delegate$lambda$0);
                    case 6:
                        imageSizeSmall_delegate$lambda$0 = OrderCancelModalView.imageSizeSmall_delegate$lambda$0(orderCancelModalView);
                        return Integer.valueOf(imageSizeSmall_delegate$lambda$0);
                    case 7:
                        imageSizeBig_delegate$lambda$0 = OrderCancelModalView.imageSizeBig_delegate$lambda$0(orderCancelModalView);
                        return Integer.valueOf(imageSizeBig_delegate$lambda$0);
                    case 8:
                        titleTopMarginSmall_delegate$lambda$0 = OrderCancelModalView.titleTopMarginSmall_delegate$lambda$0(orderCancelModalView);
                        return Integer.valueOf(titleTopMarginSmall_delegate$lambda$0);
                    case 9:
                        buttonTitleTextSize_delegate$lambda$0 = OrderCancelModalView.buttonTitleTextSize_delegate$lambda$0(orderCancelModalView);
                        return Float.valueOf(buttonTitleTextSize_delegate$lambda$0);
                    case 10:
                        buttonSubtitleTextSize_delegate$lambda$0 = OrderCancelModalView.buttonSubtitleTextSize_delegate$lambda$0(orderCancelModalView);
                        return Float.valueOf(buttonSubtitleTextSize_delegate$lambda$0);
                    default:
                        titleTopMarginMedium_delegate$lambda$0 = OrderCancelModalView.titleTopMarginMedium_delegate$lambda$0(orderCancelModalView);
                        return Integer.valueOf(titleTopMarginMedium_delegate$lambda$0);
                }
            }
        });
        final int i12 = 10;
        this.buttonSubtitleTextSize = kotlin.a.b(lazyThreadSafetyMode, new sls(this) { // from class: al70
            public final /* synthetic */ OrderCancelModalView b;

            {
                this.b = this;
            }

            @Override // defpackage.sls
            public final Object invoke() {
                int titleTopMarginBig_delegate$lambda$0;
                int horizontalButtonsBottomMargin_delegate$lambda$0;
                int verticalButtonsBottomMargin_delegate$lambda$0;
                int horizontalButtonsTopMargin_delegate$lambda$0;
                int verticalButtonsTopMargin_delegate$lambda$0;
                int buttonsMargin_delegate$lambda$0;
                int imageSizeSmall_delegate$lambda$0;
                int imageSizeBig_delegate$lambda$0;
                int titleTopMarginSmall_delegate$lambda$0;
                float buttonTitleTextSize_delegate$lambda$0;
                float buttonSubtitleTextSize_delegate$lambda$0;
                int titleTopMarginMedium_delegate$lambda$0;
                int i22 = i12;
                OrderCancelModalView orderCancelModalView = this.b;
                switch (i22) {
                    case 0:
                        titleTopMarginBig_delegate$lambda$0 = OrderCancelModalView.titleTopMarginBig_delegate$lambda$0(orderCancelModalView);
                        return Integer.valueOf(titleTopMarginBig_delegate$lambda$0);
                    case 1:
                        horizontalButtonsBottomMargin_delegate$lambda$0 = OrderCancelModalView.horizontalButtonsBottomMargin_delegate$lambda$0(orderCancelModalView);
                        return Integer.valueOf(horizontalButtonsBottomMargin_delegate$lambda$0);
                    case 2:
                        verticalButtonsBottomMargin_delegate$lambda$0 = OrderCancelModalView.verticalButtonsBottomMargin_delegate$lambda$0(orderCancelModalView);
                        return Integer.valueOf(verticalButtonsBottomMargin_delegate$lambda$0);
                    case 3:
                        horizontalButtonsTopMargin_delegate$lambda$0 = OrderCancelModalView.horizontalButtonsTopMargin_delegate$lambda$0(orderCancelModalView);
                        return Integer.valueOf(horizontalButtonsTopMargin_delegate$lambda$0);
                    case 4:
                        verticalButtonsTopMargin_delegate$lambda$0 = OrderCancelModalView.verticalButtonsTopMargin_delegate$lambda$0(orderCancelModalView);
                        return Integer.valueOf(verticalButtonsTopMargin_delegate$lambda$0);
                    case 5:
                        buttonsMargin_delegate$lambda$0 = OrderCancelModalView.buttonsMargin_delegate$lambda$0(orderCancelModalView);
                        return Integer.valueOf(buttonsMargin_delegate$lambda$0);
                    case 6:
                        imageSizeSmall_delegate$lambda$0 = OrderCancelModalView.imageSizeSmall_delegate$lambda$0(orderCancelModalView);
                        return Integer.valueOf(imageSizeSmall_delegate$lambda$0);
                    case 7:
                        imageSizeBig_delegate$lambda$0 = OrderCancelModalView.imageSizeBig_delegate$lambda$0(orderCancelModalView);
                        return Integer.valueOf(imageSizeBig_delegate$lambda$0);
                    case 8:
                        titleTopMarginSmall_delegate$lambda$0 = OrderCancelModalView.titleTopMarginSmall_delegate$lambda$0(orderCancelModalView);
                        return Integer.valueOf(titleTopMarginSmall_delegate$lambda$0);
                    case 9:
                        buttonTitleTextSize_delegate$lambda$0 = OrderCancelModalView.buttonTitleTextSize_delegate$lambda$0(orderCancelModalView);
                        return Float.valueOf(buttonTitleTextSize_delegate$lambda$0);
                    case 10:
                        buttonSubtitleTextSize_delegate$lambda$0 = OrderCancelModalView.buttonSubtitleTextSize_delegate$lambda$0(orderCancelModalView);
                        return Float.valueOf(buttonSubtitleTextSize_delegate$lambda$0);
                    default:
                        titleTopMarginMedium_delegate$lambda$0 = OrderCancelModalView.titleTopMarginMedium_delegate$lambda$0(orderCancelModalView);
                        return Integer.valueOf(titleTopMarginMedium_delegate$lambda$0);
                }
            }
        });
        this.leadingIcon = kotlin.a.b(lazyThreadSafetyMode, new sls() { // from class: bl70
            @Override // defpackage.sls
            public final Object invoke() {
                ImageView leadingIcon_delegate$lambda$0;
                CircleBadgeIcon centerIcon_delegate$lambda$0;
                int i13 = i3;
                OrderCancelModalView orderCancelModalView = this;
                Context context2 = context;
                switch (i13) {
                    case 0:
                        leadingIcon_delegate$lambda$0 = OrderCancelModalView.leadingIcon_delegate$lambda$0(context2, orderCancelModalView);
                        return leadingIcon_delegate$lambda$0;
                    default:
                        centerIcon_delegate$lambda$0 = OrderCancelModalView.centerIcon_delegate$lambda$0(context2, orderCancelModalView);
                        return centerIcon_delegate$lambda$0;
                }
            }
        });
        this.centerIcon = kotlin.a.b(lazyThreadSafetyMode, new sls() { // from class: bl70
            @Override // defpackage.sls
            public final Object invoke() {
                ImageView leadingIcon_delegate$lambda$0;
                CircleBadgeIcon centerIcon_delegate$lambda$0;
                int i13 = i4;
                OrderCancelModalView orderCancelModalView = this;
                Context context2 = context;
                switch (i13) {
                    case 0:
                        leadingIcon_delegate$lambda$0 = OrderCancelModalView.leadingIcon_delegate$lambda$0(context2, orderCancelModalView);
                        return leadingIcon_delegate$lambda$0;
                    default:
                        centerIcon_delegate$lambda$0 = OrderCancelModalView.centerIcon_delegate$lambda$0(context2, orderCancelModalView);
                        return centerIcon_delegate$lambda$0;
                }
            }
        });
        this.fullSizeImage = kotlin.a.b(lazyThreadSafetyMode, new qd00(context, i5));
        this.shimmer = kotlin.a.b(lazyThreadSafetyMode, new qd00(context, i6));
        qdb1.b(this, new sf30(26, this));
        getBinding().h.setLetterSpacing(-0.01f);
        b.q(getBinding().h, true);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final float buttonSubtitleTextSize_delegate$lambda$0(OrderCancelModalView orderCancelModalView) {
        return c.d(mrg0.component_text_size_caption, orderCancelModalView);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final float buttonTitleTextSize_delegate$lambda$0(OrderCancelModalView orderCancelModalView) {
        return c.d(mrg0.component_text_size_body, orderCancelModalView);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final int buttonsMargin_delegate$lambda$0(OrderCancelModalView orderCancelModalView) {
        return c.h(4, orderCancelModalView);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final CircleBadgeIcon centerIcon_delegate$lambda$0(Context context, OrderCancelModalView orderCancelModalView) {
        CircleBadgeIcon circleBadgeIcon = new CircleBadgeIcon(context, null, 0, 6, null);
        FrameLayout.LayoutParams layoutParams = new FrameLayout.LayoutParams(-2, -2);
        layoutParams.gravity = 1;
        layoutParams.setMargins(0, tje.r(mrg0.go_design_m_space, circleBadgeIcon.getContext()), 0, 0);
        circleBadgeIcon.setLayoutParams(layoutParams);
        circleBadgeIcon.setImageSize(orderCancelModalView.getImageSizeBig());
        circleBadgeIcon.setImportantForAccessibility(1);
        return circleBadgeIcon;
    }

    private final ListItemComponent createButton(pl70 buttonModel, int index, Orientation orientation, boolean isLastButton) {
        LinearLayout.LayoutParams layoutParams;
        ListItemComponent listItemComponent = new ListItemComponent(getContext(), null, 0, 6, null);
        int i = isLastButton ? 3 : 0;
        int i2 = isLastButton ? 3 : 0;
        if (isLastButton) {
            listItemComponent.title().setLetterSpacing(-0.005f);
        }
        Integer num = buttonModel.c;
        String str = buttonModel.b;
        kdc kdcVar = buttonModel.d;
        kdc kdcVar2 = buttonModel.e;
        listItemComponent.setTitleTextColor(kdcVar);
        listItemComponent.setSubtitleTextColor(kdcVar2);
        listItemComponent.setTitleTypeface(i);
        listItemComponent.setSubtitleTypeface(i2);
        if (num != null) {
            int intValue = num.intValue();
            float r = tje.r(mrg0.button_component_default_rounded_corners_radius, listItemComponent.getContext());
            int argb = Color.argb((int) (Color.alpha(intValue) * 0.5f), Color.red(intValue), Color.green(intValue), Color.blue(intValue));
            vbb vbbVar = new vbb(intValue, r);
            vbbVar.X(argb);
            vbbVar.Y(lhc.c(intValue) < 0.75d ? Color.argb(225, 255, 255, 255) : Color.argb(225, 0, 0, 0));
            listItemComponent.setBackground((Drawable) vbbVar.b);
        }
        if (str != null && str.length() != 0) {
            listItemComponent.setSubtitleTextSizePx((int) getButtonSubtitleTextSize());
            listItemComponent.setSubtitleAlignment(1);
            listItemComponent.setSubtitleMaxLines(1);
            listItemComponent.setSubTitleEllipsizeMode(1);
            listItemComponent.setSubtitle(str);
        }
        listItemComponent.setTitleAlignment(1);
        listItemComponent.setTitleTextSizePx((int) getButtonTitleTextSize());
        listItemComponent.setTitleEllipsizeMode(1);
        listItemComponent.setTitleMaxLines(2);
        listItemComponent.setTitle(buttonModel.a);
        listItemComponent.setVerticalPadding(0);
        int r2 = tje.r(mrg0.button_component_size_L, listItemComponent.getContext());
        int[] iArr = el70.b;
        int i3 = iArr[orientation.ordinal()];
        if (i3 == 1) {
            layoutParams = new LinearLayout.LayoutParams(0, -2);
        } else {
            if (i3 != 2) {
                w511.b();
                return null;
            }
            layoutParams = new LinearLayout.LayoutParams(-1, -2);
        }
        listItemComponent.setMinHeight(r2);
        layoutParams.weight = 1.0f;
        listItemComponent.setLayoutParams(layoutParams);
        if (index != 0) {
            int i4 = iArr[orientation.ordinal()];
            if (i4 == 1) {
                xw31.F(listItemComponent, Integer.valueOf(getButtonsMargin()), null, null, null);
            } else {
                if (i4 != 2) {
                    w511.b();
                    return null;
                }
                xw31.E(listItemComponent, null, Integer.valueOf(getButtonsMargin()), null, null);
            }
        }
        listItemComponent.setDebounceClickListener(new sd30(9, this, buttonModel));
        return listItemComponent;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void createButton$lambda$0$0(OrderCancelModalView orderCancelModalView, pl70 pl70Var) {
        orderCancelModalView.presenter.Kg(pl70Var.f);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final ImageView fullSizeImage_delegate$lambda$0(Context context) {
        ImageView imageView = new ImageView(context);
        imageView.setLayoutParams(new FrameLayout.LayoutParams(-1, -2));
        imageView.setImportantForAccessibility(2);
        return imageView;
    }

    private final float getButtonSubtitleTextSize() {
        return ((Number) this.buttonSubtitleTextSize.getValue()).floatValue();
    }

    private final float getButtonTitleTextSize() {
        return ((Number) this.buttonTitleTextSize.getValue()).floatValue();
    }

    private final int getButtonsMargin() {
        return ((Number) this.buttonsMargin.getValue()).intValue();
    }

    private final CircleBadgeIcon getCenterIcon() {
        return (CircleBadgeIcon) this.centerIcon.getValue();
    }

    private final ImageView getFullSizeImage() {
        return (ImageView) this.fullSizeImage.getValue();
    }

    private final int getHorizontalButtonsBottomMargin() {
        return ((Number) this.horizontalButtonsBottomMargin.getValue()).intValue();
    }

    private final int getHorizontalButtonsTopMargin() {
        return ((Number) this.horizontalButtonsTopMargin.getValue()).intValue();
    }

    private final int getImageSizeBig() {
        return ((Number) this.imageSizeBig.getValue()).intValue();
    }

    private final int getImageSizeSmall() {
        return ((Number) this.imageSizeSmall.getValue()).intValue();
    }

    private final ImageView getLeadingIcon() {
        return (ImageView) this.leadingIcon.getValue();
    }

    private final ShimmeringBar getShimmer() {
        return (ShimmeringBar) this.shimmer.getValue();
    }

    private final int getTitleTopMarginBig() {
        return ((Number) this.titleTopMarginBig.getValue()).intValue();
    }

    private final int getTitleTopMarginMedium() {
        return ((Number) this.titleTopMarginMedium.getValue()).intValue();
    }

    private final int getTitleTopMarginSmall() {
        return ((Number) this.titleTopMarginSmall.getValue()).intValue();
    }

    private final int getVerticalButtonsBottomMargin() {
        return ((Number) this.verticalButtonsBottomMargin.getValue()).intValue();
    }

    private final int getVerticalButtonsTopMargin() {
        return ((Number) this.verticalButtonsTopMargin.getValue()).intValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final int horizontalButtonsBottomMargin_delegate$lambda$0(OrderCancelModalView orderCancelModalView) {
        return c.d(mrg0.go_design_m_space, orderCancelModalView);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final int horizontalButtonsTopMargin_delegate$lambda$0(OrderCancelModalView orderCancelModalView) {
        return c.d(mrg0.go_design_m_space, orderCancelModalView);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final int imageSizeBig_delegate$lambda$0(OrderCancelModalView orderCancelModalView) {
        return c.d(wug0.cancel_modal_view_image_size_big, orderCancelModalView);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final int imageSizeSmall_delegate$lambda$0(OrderCancelModalView orderCancelModalView) {
        return c.d(wug0.cancel_modal_view_image_size_small, orderCancelModalView);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final ImageView leadingIcon_delegate$lambda$0(Context context, OrderCancelModalView orderCancelModalView) {
        ImageView imageView = new ImageView(context);
        FrameLayout.LayoutParams layoutParams = new FrameLayout.LayoutParams(orderCancelModalView.getImageSizeSmall(), orderCancelModalView.getImageSizeSmall());
        layoutParams.gravity = 8388611;
        int u = tje.u(10, imageView.getContext());
        int u2 = tje.u(8, imageView.getContext());
        layoutParams.setMarginStart(u);
        ((ViewGroup.MarginLayoutParams) layoutParams).topMargin = u2;
        layoutParams.setMarginEnd(0);
        ((ViewGroup.MarginLayoutParams) layoutParams).bottomMargin = 0;
        imageView.setLayoutParams(layoutParams);
        imageView.setImportantForAccessibility(1);
        return imageView;
    }

    private final void processContentImageState(fl70 fl70Var, OrderCancelUiState$HeaderImage$Content orderCancelUiState$HeaderImage$Content) {
        String str = orderCancelUiState$HeaderImage$Content.d;
        UiStateDrawableWrapper uiStateDrawableWrapper = orderCancelUiState$HeaderImage$Content.b;
        String p = str != null ? g8e.p(getContext().getString(kyh0.driver_rating), " ", str) : null;
        GoFrameLayout goFrameLayout = fl70Var.e;
        RobotoTextView robotoTextView = fl70Var.h;
        goFrameLayout.removeAllViews();
        int i = el70.a[orderCancelUiState$HeaderImage$Content.a.ordinal()];
        if (i == 1) {
            goFrameLayout.addView(getCenterIcon());
            getCenterIcon().setImage(uiStateDrawableWrapper != null ? uiStateDrawableWrapper.getDrawable() : null);
            getCenterIcon().setBadgeText(str);
            getCenterIcon().setContentDescription(p);
            xw31.E(robotoTextView, null, Integer.valueOf(getTitleTopMarginMedium()), null, null);
        } else if (i == 2) {
            goFrameLayout.addView(getLeadingIcon());
            getLeadingIcon().setImageDrawable(uiStateDrawableWrapper != null ? uiStateDrawableWrapper.getDrawable() : null);
            getLeadingIcon().setContentDescription(p);
            xw31.E(robotoTextView, null, Integer.valueOf(getTitleTopMarginSmall()), null, null);
        } else if (i != 3) {
            w511.b();
            return;
        } else {
            goFrameLayout.addView(getFullSizeImage());
            getFullSizeImage().setImageDrawable(uiStateDrawableWrapper != null ? uiStateDrawableWrapper.getDrawable() : null);
            xw31.E(robotoTextView, null, Integer.valueOf(getTitleTopMarginBig()), null, null);
        }
        updateCaption(fl70Var, orderCancelUiState$HeaderImage$Content.c);
    }

    private final void processEmptyImageState(fl70 fl70Var) {
        fl70Var.e.removeAllViews();
        updateCaption(fl70Var, null);
        xw31.E(fl70Var.h, null, Integer.valueOf(getTitleTopMarginBig()), null, null);
    }

    private final void processLoadingImageState(fl70 fl70Var, String str) {
        fl70Var.e.removeAllViews();
        fl70Var.e.addView(getShimmer());
        getShimmer().setShimmering(true);
        updateCaption(fl70Var, str);
        xw31.E(fl70Var.h, null, Integer.valueOf(getTitleTopMarginBig()), null, null);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void renderActions(fl70 fl70Var, List<ol70> list) {
        boolean isEmpty = list.isEmpty();
        fl70Var.f.setVisibility(!isEmpty ? 0 : 8);
        fl70Var.d.setVisibility(isEmpty ? 8 : 0);
        a aVar = this.cancelActionItemsAdapter;
        if (aVar != null) {
            aVar.submitList(list, null);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void renderButtons(fl70 fl70Var, ql70 ql70Var) {
        fl70Var.b.removeAllViews();
        setButtonsOrientation(fl70Var, ql70Var.a);
        GoLinearLayout goLinearLayout = fl70Var.b;
        List list = ql70Var.b;
        goLinearLayout.setWeightSum(list.size());
        int i = 0;
        for (Object obj : list) {
            int i2 = i + 1;
            if (i < 0) {
                scc.m();
                throw null;
            }
            goLinearLayout.addView(createButton((pl70) obj, i, ql70Var.a, i == scc.f(list)), i);
            i = i2;
        }
        synchronizeButtonsSize(fl70Var);
        setButtonsMargins(fl70Var, ql70Var);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void renderImage(fl70 fl70Var, tl70 tl70Var) {
        if (jl40.l(tl70Var, rl70.a)) {
            processEmptyImageState(fl70Var);
            return;
        }
        if (tl70Var instanceof sl70) {
            processLoadingImageState(fl70Var, ((sl70) tl70Var).a);
        } else if (tl70Var instanceof OrderCancelUiState$HeaderImage$Content) {
            processContentImageState(fl70Var, (OrderCancelUiState$HeaderImage$Content) tl70Var);
        } else {
            w511.b();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void renderText(fl70 fl70Var, String str) {
        fl70Var.g.setText(str);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void renderTitle(fl70 fl70Var, String str) {
        fl70Var.h.setText(str);
    }

    private final void setButtonsMargins(fl70 fl70Var, ql70 ql70Var) {
        Pair pair = ql70Var.a == Orientation.HORIZONTAL ? new Pair(Integer.valueOf(getHorizontalButtonsBottomMargin()), Integer.valueOf(getHorizontalButtonsTopMargin())) : new Pair(Integer.valueOf(getVerticalButtonsBottomMargin()), Integer.valueOf(getVerticalButtonsTopMargin()));
        int intValue = ((Number) pair.getFirst()).intValue();
        int intValue2 = ((Number) pair.getSecond()).intValue();
        xw31.E(fl70Var.b, null, null, null, Integer.valueOf(intValue));
        xw31.E(fl70Var.b, null, Integer.valueOf(intValue2), null, null);
    }

    private final void setButtonsOrientation(fl70 fl70Var, Orientation orientation) {
        GoLinearLayout goLinearLayout = fl70Var.b;
        int i = el70.b[orientation.ordinal()];
        int i2 = 1;
        if (i == 1) {
            i2 = 0;
        } else if (i != 2) {
            w511.b();
            return;
        }
        goLinearLayout.setOrientation(i2);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final ShimmeringBar shimmer_delegate$lambda$0(Context context) {
        ShimmeringBar shimmeringBar = new ShimmeringBar(context, null, 0, 0, 14, null);
        FrameLayout.LayoutParams layoutParams = new FrameLayout.LayoutParams(-1, tje.u(48, shimmeringBar.getContext()));
        layoutParams.setMargins(tje.u(20, shimmeringBar.getContext()), tje.u(24, shimmeringBar.getContext()), tje.u(20, shimmeringBar.getContext()), tje.u(16, shimmeringBar.getContext()));
        shimmeringBar.setLayoutParams(layoutParams);
        shimmeringBar.setImportantForAccessibility(2);
        return shimmeringBar;
    }

    private final void synchronizeButtonsSize(fl70 fl70Var) {
        fl70Var.b.post(new sf30(25, fl70Var));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void synchronizeButtonsSize$lambda$0(fl70 fl70Var) {
        GoLinearLayout goLinearLayout = fl70Var.b;
        if (!(goLinearLayout.getChildCount() > 0)) {
            ny61.p();
            return;
        }
        int i = 0 + 1;
        View childAt = goLinearLayout.getChildAt(0);
        if (childAt == null) {
            ny61.s();
            return;
        }
        if (i < goLinearLayout.getChildCount()) {
            int height = childAt.getHeight();
            while (true) {
                int i2 = i + 1;
                View childAt2 = goLinearLayout.getChildAt(i);
                if (childAt2 == null) {
                    ny61.s();
                    return;
                }
                int height2 = childAt2.getHeight();
                if (height < height2) {
                    childAt = childAt2;
                    height = height2;
                }
                if (!(i2 < goLinearLayout.getChildCount())) {
                    break;
                } else {
                    i = i2;
                }
            }
        }
        int height3 = childAt.getHeight();
        GoLinearLayout goLinearLayout2 = fl70Var.b;
        int i3 = 0;
        while (true) {
            if (!(i3 < goLinearLayout2.getChildCount())) {
                return;
            }
            int i4 = i3 + 1;
            View childAt3 = goLinearLayout2.getChildAt(i3);
            if (childAt3 == null) {
                ny61.s();
                return;
            } else {
                if (childAt3.getHeight() != height3) {
                    c.D(childAt3.getLayoutParams().width, height3, childAt3);
                }
                i3 = i4;
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final int titleTopMarginBig_delegate$lambda$0(OrderCancelModalView orderCancelModalView) {
        return c.h(20, orderCancelModalView);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final int titleTopMarginMedium_delegate$lambda$0(OrderCancelModalView orderCancelModalView) {
        return c.d(mrg0.go_design_m_space, orderCancelModalView);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final int titleTopMarginSmall_delegate$lambda$0(OrderCancelModalView orderCancelModalView) {
        return c.d(mrg0.go_design_s_space, orderCancelModalView);
    }

    private final void updateCaption(fl70 fl70Var, String str) {
        if (str == null) {
            fl70Var.c.setVisibility(8);
        } else {
            fl70Var.c.setText(str);
            fl70Var.c.setVisibility(0);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final int verticalButtonsBottomMargin_delegate$lambda$0(OrderCancelModalView orderCancelModalView) {
        return c.d(mrg0.go_design_s_space, orderCancelModalView);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final int verticalButtonsTopMargin_delegate$lambda$0(OrderCancelModalView orderCancelModalView) {
        return c.d(mrg0.go_design_m_space, orderCancelModalView);
    }

    @Override // ru.yandex.taxi.widget.SlideableModalView, ru.yandex.taxi.widget.ModalView, defpackage.nwy0
    public void applyTheme(ThemeType themeType) {
        super.applyTheme(themeType);
        getBinding().h.setTextColor(qje.t(xng0.textMain, getContext()));
        getBinding().g.setTextColor(qje.t(xng0.textMain, getContext()));
        getBinding().d.setBackgroundTintList(ColorStateList.valueOf(qje.t(xng0.line, getContext())));
    }

    /* JADX WARN: Can't rename method to resolve collision */
    @Override // ru.yandex.taxi.widget.SlideableBindingModalView
    public fl70 bindingFactory(LayoutInflater inflater, ViewGroup parent) {
        View inflate = inflater.inflate(zkh0.order_cancel_modal_view, parent, false);
        int i = p8h0.buttons;
        GoLinearLayout goLinearLayout = (GoLinearLayout) cma1.O(i, inflate);
        if (goLinearLayout != null) {
            i = p8h0.caption;
            RobotoTextView robotoTextView = (RobotoTextView) cma1.O(i, inflate);
            if (robotoTextView != null) {
                i = p8h0.divider_action_items;
                DividerWithColorView dividerWithColorView = (DividerWithColorView) cma1.O(i, inflate);
                if (dividerWithColorView != null) {
                    i = p8h0.image_container;
                    GoFrameLayout goFrameLayout = (GoFrameLayout) cma1.O(i, inflate);
                    if (goFrameLayout != null) {
                        i = p8h0.rv_action_items;
                        RecyclerView recyclerView = (RecyclerView) cma1.O(i, inflate);
                        if (recyclerView != null) {
                            i = p8h0.text;
                            RobotoTextView robotoTextView2 = (RobotoTextView) cma1.O(i, inflate);
                            if (robotoTextView2 != null) {
                                i = p8h0.title;
                                RobotoTextView robotoTextView3 = (RobotoTextView) cma1.O(i, inflate);
                                if (robotoTextView3 != null) {
                                    return new fl70((GoLinearLayout) inflate, goLinearLayout, robotoTextView, dividerWithColorView, goFrameLayout, recyclerView, robotoTextView2, robotoTextView3);
                                }
                            }
                        }
                    }
                }
            }
        }
        ny61.t("Missing required view with ID: ".concat(inflate.getResources().getResourceName(i)));
        return null;
    }

    @Override // ru.yandex.taxi.widget.SlideableModalView, ru.yandex.taxi.widget.ModalView, android.view.ViewGroup, android.view.View
    public void onAttachedToWindow() {
        super.onAttachedToWindow();
        this.cancelActionItemsAdapter = new a(getContext(), new OrderCancelModalView$onAttachedToWindow$1(1, this.presenter, wk70.class, "triggerAction", "triggerAction(Lcom/yandex/go/taxi/order/cancel/v2/domain/models/OrderCancelAction;)V", 0));
        getBinding().f.setLayoutManager(new LinearLayoutManager(getContext(), 1, false));
        getBinding().f.setAdapter(this.cancelActionItemsAdapter);
        getBinding().h.setTypeface(this.titleStyleDelegate.a(getContext()));
        RobotoTextView robotoTextView = getBinding().h;
        this.titleStyleDelegate.getClass();
        robotoTextView.setTextSize(24.0f);
        RobotoTextView robotoTextView2 = getBinding().h;
        this.titleStyleDelegate.getClass();
        robotoTextView2.setLineHeight(tje.v(getContext(), 27.0f));
        wk70 wk70Var = this.presenter;
        dl70 dl70Var = new dl70(this);
        wk70Var.Bg(dl70Var);
        com.yandex.go.coroutines.b.g(wk70Var.Jg(), null, null, new OrderCancelModalPresenter$attachView$1(wk70Var, dl70Var, null), 3);
        com.yandex.go.coroutines.b.g(wk70Var.Jg(), null, null, new OrderCancelModalPresenter$attachView$2(wk70Var, null), 3);
    }

    @Override // ru.yandex.taxi.widget.SlideableModalView, ru.yandex.taxi.widget.ModalView, android.view.ViewGroup, android.view.View
    public void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        this.presenter.Cg();
    }

    @Override // ru.yandex.taxi.widget.ModalView, defpackage.u45
    /* renamed from: screenName */
    public String getModalScreenName() {
        return "OrderCancelModalView";
    }

    @Override // ru.yandex.taxi.widget.SlideableModalView
    public boolean settlingLayoutChanges() {
        return false;
    }
}
