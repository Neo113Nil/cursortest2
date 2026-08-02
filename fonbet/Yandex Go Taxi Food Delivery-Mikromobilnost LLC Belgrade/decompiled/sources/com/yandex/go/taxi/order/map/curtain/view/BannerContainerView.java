package com.yandex.go.taxi.order.map.curtain.view;

import android.content.Context;
import android.util.AttributeSet;
import android.view.View;
import android.view.ViewPropertyAnimator;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.LinearLayout;
import androidx.core.view.b;
import defpackage.jmz;
import defpackage.js4;
import defpackage.k7x0;
import defpackage.ks4;
import defpackage.ls4;
import defpackage.lz70;
import defpackage.m7x0;
import defpackage.nac;
import defpackage.nwy0;
import defpackage.ny61;
import defpackage.pav;
import defpackage.qje;
import defpackage.tje;
import defpackage.tp11;
import defpackage.wug0;
import defpackage.xng0;
import java.util.WeakHashMap;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import ru.CryptoPro.JCPRequest.ca20.status.CA20Status;
import ru.yandex.common.clid.ClidProvider;
import ru.yandex.taxi.design.ClickableImageView;
import ru.yandex.taxi.design.ListHeaderComponent;
import ru.yandex.taxi.design.ListItemComponent;
import ru.yandex.taxi.theme.ThemeType;

@Metadata(d1 = {"\u0000|\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\f\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0007\b\u0007\u0018\u0000 B2\u00020\u00012\u00020\u0002:\u0002+CB'\b\u0007\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u0005\u0012\b\b\u0002\u0010\b\u001a\u00020\u0007¢\u0006\u0004\b\t\u0010\nJ\u001f\u0010\u0010\u001a\u00020\u000f2\u0006\u0010\f\u001a\u00020\u000b2\u0006\u0010\u000e\u001a\u00020\rH\u0002¢\u0006\u0004\b\u0010\u0010\u0011J\u0017\u0010\u0013\u001a\u00020\u00122\u0006\u0010\u0004\u001a\u00020\u0003H\u0002¢\u0006\u0004\b\u0013\u0010\u0014J\u0017\u0010\u0016\u001a\u00020\u00152\u0006\u0010\u0004\u001a\u00020\u0003H\u0002¢\u0006\u0004\b\u0016\u0010\u0017J\u0015\u0010\u001a\u001a\u00020\u000f2\u0006\u0010\u0019\u001a\u00020\u0018¢\u0006\u0004\b\u001a\u0010\u001bJ\u0015\u0010\u001e\u001a\u00020\u000f2\u0006\u0010\u001d\u001a\u00020\u001c¢\u0006\u0004\b\u001e\u0010\u001fJ\u0015\u0010\"\u001a\u00020\u000f2\u0006\u0010!\u001a\u00020 ¢\u0006\u0004\b\"\u0010#J\u0017\u0010&\u001a\u00020\u000f2\u0006\u0010%\u001a\u00020$H\u0016¢\u0006\u0004\b&\u0010'J\r\u0010(\u001a\u00020\u000f¢\u0006\u0004\b(\u0010)J\r\u0010*\u001a\u00020\u000f¢\u0006\u0004\b*\u0010)J\u0017\u0010-\u001a\u00020\u000f2\b\u0010,\u001a\u0004\u0018\u00010+¢\u0006\u0004\b-\u0010.R\u0014\u0010/\u001a\u00020\u00078\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b/\u00100R\u0014\u00101\u001a\u00020\u00078\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b1\u00100R\u0014\u00102\u001a\u00020\u00078\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b2\u00100R\u0014\u00103\u001a\u00020\u00078\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b3\u00100R\u0014\u00104\u001a\u00020\u00128\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b4\u00105R\u0014\u00106\u001a\u00020\u00158\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b6\u00107R\u0014\u00109\u001a\u0002088\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b9\u0010:R\u0018\u0010;\u001a\u0004\u0018\u00010+8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b;\u0010<R\u0018\u0010>\u001a\u0004\u0018\u00010=8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b>\u0010?R\u0018\u0010\u001d\u001a\u0004\u0018\u00010\u001c8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u001d\u0010@R\u0018\u0010!\u001a\u0004\u0018\u00010 8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b!\u0010A¨\u0006D"}, d2 = {"Lcom/yandex/go/taxi/order/map/curtain/view/BannerContainerView;", "Landroid/widget/FrameLayout;", "Lnwy0;", "Landroid/content/Context;", "context", "Landroid/util/AttributeSet;", "attrs", "", "defStyleAttr", "<init>", "(Landroid/content/Context;Landroid/util/AttributeSet;I)V", "Landroid/widget/ImageView;", "imageView", "", "iconTag", "Lzy11;", "setIcon", "(Landroid/widget/ImageView;Ljava/lang/String;)V", "Lru/yandex/taxi/design/ListHeaderComponent;", "createBannerHeader", "(Landroid/content/Context;)Lru/yandex/taxi/design/ListHeaderComponent;", "Lru/yandex/taxi/design/ListItemComponent;", "createBannerItem", "(Landroid/content/Context;)Lru/yandex/taxi/design/ListItemComponent;", "Ljmz;", ClidProvider.STATE, "render", "(Ljmz;)V", "Lpav;", "imageLoader", "setImageLoader", "(Lpav;)V", "Lk7x0;", "tagUrlFormatter", "setTagUrlFormatter", "(Lk7x0;)V", "Lru/yandex/taxi/theme/ThemeType;", "themeType", "applyTheme", "(Lru/yandex/taxi/theme/ThemeType;)V", "show", "()V", "hide", "Lls4;", "listener", "setContentHeightChangedListener", "(Lls4;)V", "topPadding", CA20Status.STATUS_USER_I, "size8dp", "size16dp", "size56dp", "bannerHeader", "Lru/yandex/taxi/design/ListHeaderComponent;", "bannerItem", "Lru/yandex/taxi/design/ListItemComponent;", "Landroid/widget/LinearLayout;", "contentLayout", "Landroid/widget/LinearLayout;", "contentHeightChangedListener", "Lls4;", "Landroid/view/ViewPropertyAnimator;", "appearanceAnimator", "Landroid/view/ViewPropertyAnimator;", "Lpav;", "Lk7x0;", "Companion", "ks4", "impl"}, k = 1, mv = {2, 4, 0}, xi = 48)
/* loaded from: classes14.dex */
public final class BannerContainerView extends FrameLayout implements nwy0 {
    public static final int $stable = 8;
    private static final ks4 Companion = new ks4();
    private static final float VIEW_ALPHA_OPAQUE = 1.0f;
    private static final float VIEW_ALPHA_TRANSPARENT = 0.0f;
    private static final long VIEW_APPEARANCE_ANIMATION_DURATION_MILLIS = 300;
    private ViewPropertyAnimator appearanceAnimator;
    private final ListHeaderComponent bannerHeader;
    private final ListItemComponent bannerItem;
    private ls4 contentHeightChangedListener;
    private final LinearLayout contentLayout;
    private pav imageLoader;
    private final int size16dp;
    private final int size56dp;
    private final int size8dp;
    private k7x0 tagUrlFormatter;
    private final int topPadding;

    public BannerContainerView(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        int w = (int) tje.w(108, getContext());
        this.topPadding = w;
        int w2 = (int) tje.w(8, getContext());
        this.size8dp = w2;
        int w3 = (int) tje.w(16, getContext());
        this.size16dp = w3;
        this.size56dp = (int) tje.w(56, getContext());
        ListHeaderComponent createBannerHeader = createBannerHeader(context);
        this.bannerHeader = createBannerHeader;
        ListItemComponent createBannerItem = createBannerItem(context);
        this.bannerItem = createBannerItem;
        LinearLayout linearLayout = new LinearLayout(context);
        this.contentLayout = linearLayout;
        setImportantForAccessibility(1);
        setClickable(true);
        setFocusable(true);
        linearLayout.setOrientation(1);
        linearLayout.setPadding(w2, w, w2, w3);
        linearLayout.addView(createBannerHeader, new FrameLayout.LayoutParams(-1, -2));
        linearLayout.addView(createBannerItem, new FrameLayout.LayoutParams(-1, -2));
        addView(linearLayout, new FrameLayout.LayoutParams(-1, -2));
        setBackgroundColor(qje.t(xng0.bgMinor, getContext()));
    }

    private final ListHeaderComponent createBannerHeader(Context context) {
        ListHeaderComponent listHeaderComponent = new ListHeaderComponent(context, null, 0, 6, null);
        listHeaderComponent.setLeadFrameMinimumWidth(tje.r(wug0.component_item_lead_image_padding, listHeaderComponent.getContext()));
        listHeaderComponent.setVerticalPadding(0);
        listHeaderComponent.setPadding(0, this.size8dp, 0, this.size16dp);
        return listHeaderComponent;
    }

    private final ListItemComponent createBannerItem(Context context) {
        ListItemComponent listItemComponent = new ListItemComponent(context, null, 0, 6, null);
        listItemComponent.setVerticalPadding(0);
        listItemComponent.setLeadImagePadding(tje.r(wug0.component_item_lead_image_padding, listItemComponent.getContext()));
        listItemComponent.setRoundedBackground(qje.t(xng0.bgMain, listItemComponent.getContext()));
        listItemComponent.setMinHeight(this.size56dp);
        return listItemComponent;
    }

    private final void setIcon(ImageView imageView, String iconTag) {
        k7x0 k7x0Var = this.tagUrlFormatter;
        if (k7x0Var == null) {
            ny61.g("Required value was null.");
            return;
        }
        pav pavVar = this.imageLoader;
        if (pavVar == null) {
            ny61.g("Required value was null.");
            return;
        }
        if (iconTag.length() <= 0) {
            imageView.setImageDrawable(null);
            imageView.setTag(null);
        } else {
            ((nac) pavVar.a(imageView)).c(((m7x0) k7x0Var).a(iconTag));
            imageView.setTag(iconTag);
        }
    }

    @Override // defpackage.nwy0
    /* renamed from: allowTraverse */
    public /* bridge */ boolean getIsTrackingsRedesignEnabled() {
        return true;
    }

    @Override // defpackage.nwy0
    public void applyTheme(ThemeType themeType) {
        setBackgroundColor(qje.t(xng0.bgMinor, getContext()));
        this.bannerItem.setRoundedBackground(qje.t(xng0.bgMain, getContext()));
        String str = (String) this.bannerItem.getLeadImageView().getTag();
        if (str != null) {
            setIcon(this.bannerItem.getLeadImageView(), str);
        }
    }

    @Override // defpackage.nwy0
    public /* bridge */ boolean applyThemeForChildrenByDefault() {
        return true;
    }

    public final void hide() {
        ls4 ls4Var = this.contentHeightChangedListener;
        int i = 0;
        if (ls4Var != null) {
            ((lz70) ls4Var).c(0);
        }
        ViewPropertyAnimator viewPropertyAnimator = this.appearanceAnimator;
        if (viewPropertyAnimator != null) {
            viewPropertyAnimator.cancel();
        }
        this.appearanceAnimator = animate().alpha(0.0f).setDuration(300L).withEndAction(new js4(i, this));
    }

    public final void render(jmz state) {
        this.bannerHeader.setTitle(state.a);
        Boolean bool = tp11.a;
        tp11.a(3, 0, this.bannerHeader.title());
        this.bannerItem.setTitle(state.b);
        ClickableImageView leadImageView = this.bannerItem.getLeadImageView();
        String str = state.c;
        leadImageView.setTag(str);
        if (str != null) {
            setIcon(this.bannerItem.getLeadImageView(), str);
        }
        WeakHashMap weakHashMap = b.a;
        if (!isLaidOut() || isLayoutRequested()) {
            addOnLayoutChangeListener(new View.OnLayoutChangeListener() { // from class: com.yandex.go.taxi.order.map.curtain.view.BannerContainerView$render$$inlined$doOnLayout$1
                @Override // android.view.View.OnLayoutChangeListener
                public void onLayoutChange(View view, int left, int top, int right, int bottom, int oldLeft, int oldTop, int oldRight, int oldBottom) {
                    view.removeOnLayoutChangeListener(this);
                    ls4 ls4Var = BannerContainerView.this.contentHeightChangedListener;
                    if (ls4Var != null) {
                        ((lz70) ls4Var).c(BannerContainerView.this.contentLayout.getHeight());
                    }
                }
            });
            return;
        }
        ls4 ls4Var = this.contentHeightChangedListener;
        if (ls4Var != null) {
            ((lz70) ls4Var).c(this.contentLayout.getHeight());
        }
    }

    public final void setContentHeightChangedListener(ls4 listener) {
        this.contentHeightChangedListener = listener;
    }

    public final void setImageLoader(pav imageLoader) {
        this.imageLoader = imageLoader;
    }

    public final void setTagUrlFormatter(k7x0 tagUrlFormatter) {
        this.tagUrlFormatter = tagUrlFormatter;
    }

    public final void show() {
        setAlpha(0.0f);
        setVisibility(0);
        ViewPropertyAnimator viewPropertyAnimator = this.appearanceAnimator;
        if (viewPropertyAnimator != null) {
            viewPropertyAnimator.cancel();
        }
        this.appearanceAnimator = animate().alpha(1.0f).setDuration(300L).setListener(null);
    }

    public BannerContainerView(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0, 4, null);
    }

    public BannerContainerView(Context context) {
        this(context, null, 0, 6, null);
    }

    public /* synthetic */ BannerContainerView(Context context, AttributeSet attributeSet, int i, int i2, DefaultConstructorMarker defaultConstructorMarker) {
        this(context, (i2 & 2) != 0 ? null : attributeSet, (i2 & 4) != 0 ? 0 : i);
    }
}
