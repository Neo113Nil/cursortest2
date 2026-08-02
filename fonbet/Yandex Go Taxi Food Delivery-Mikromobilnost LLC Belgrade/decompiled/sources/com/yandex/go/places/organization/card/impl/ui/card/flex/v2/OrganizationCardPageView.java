package com.yandex.go.places.organization.card.impl.ui.card.flex.v2;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Path;
import android.graphics.Rect;
import android.graphics.RectF;
import android.view.LayoutInflater;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewConfiguration;
import android.view.ViewGroup;
import android.view.ViewParent;
import android.widget.FrameLayout;
import com.google.android.material.shape.MaterialShapeDrawable;
import com.google.android.material.shape.b;
import com.yandex.go.design.view.GoLinearLayout;
import com.yandex.go.places.organization.card.impl.ui.card.flex.v2.bottom_panel.OrganizationCardBottomPanelView;
import com.yandex.urbanads.internal.navigation.UrbanAdsBottomSheetFragment;
import defpackage.fug0;
import defpackage.jhr0;
import defpackage.jl40;
import defpackage.nwy0;
import defpackage.ny61;
import defpackage.qje;
import defpackage.tje;
import defpackage.tls;
import defpackage.vuh0;
import defpackage.xng0;
import kotlin.Metadata;
import ru.CryptoPro.JCPRequest.ca20.status.CA20Status;
import ru.CryptoPro.JCSP.tools.common.window.ipc.RemoteBioParameters;
import ru.yandex.taxi.theme.ThemeType;
import ru.yandex.video.m3.ott.data.local.db.DatabaseHelper;

@Metadata(d1 = {"\u0000\u009a\u0001\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\b\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010\u0007\n\u0002\b\f\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\t\n\u0002\b\t\n\u0002\u0018\u0002\n\u0002\b\f\n\u0002\u0018\u0002\n\u0002\b\u001b\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0014\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0007\u0018\u00002\u00020\u00012\u00020\u0002B\u000f\u0012\u0006\u0010\u0004\u001a\u00020\u0003¢\u0006\u0004\b\u0005\u0010\u0006J\u0015\u0010\n\u001a\u00020\t2\u0006\u0010\b\u001a\u00020\u0007¢\u0006\u0004\b\n\u0010\u000bJ\u0017\u0010\u000e\u001a\u00020\t2\b\u0010\r\u001a\u0004\u0018\u00010\f¢\u0006\u0004\b\u000e\u0010\u000fJ\r\u0010\u0010\u001a\u00020\f¢\u0006\u0004\b\u0010\u0010\u0011J\u000f\u0010\u0013\u001a\u0004\u0018\u00010\u0012¢\u0006\u0004\b\u0013\u0010\u0014J\u0017\u0010\u0016\u001a\u00020\t2\b\u0010\u0015\u001a\u0004\u0018\u00010\u0012¢\u0006\u0004\b\u0016\u0010\u0017J\u001d\u0010\u001b\u001a\u00020\t2\u0006\u0010\u0019\u001a\u00020\u00182\u0006\u0010\u001a\u001a\u00020\u0018¢\u0006\u0004\b\u001b\u0010\u001cJ\u0015\u0010\u001e\u001a\u00020\t2\u0006\u0010\u001d\u001a\u00020\u0018¢\u0006\u0004\b\u001e\u0010\u001fJ\u0017\u0010\"\u001a\u00020\u00072\u0006\u0010!\u001a\u00020 H\u0016¢\u0006\u0004\b\"\u0010#J\u0017\u0010&\u001a\u00020\t2\u0006\u0010%\u001a\u00020$H\u0016¢\u0006\u0004\b&\u0010'JI\u0010-\u001a\u00020\t2\n\b\u0002\u0010(\u001a\u0004\u0018\u00010\u00182\n\b\u0002\u0010)\u001a\u0004\u0018\u00010\u00182\n\b\u0002\u0010*\u001a\u0004\u0018\u00010\u00182\n\b\u0002\u0010,\u001a\u0004\u0018\u00010+2\n\b\u0002\u0010\u001d\u001a\u0004\u0018\u00010\u0018¢\u0006\u0004\b-\u0010.J\u001f\u00101\u001a\u00020\t2\u0006\u0010/\u001a\u00020\u00182\u0006\u00100\u001a\u00020\u0018H\u0014¢\u0006\u0004\b1\u0010\u001cJ7\u00106\u001a\u00020\t2\u0006\u00102\u001a\u00020\u00072\u0006\u00103\u001a\u00020\u00182\u0006\u00104\u001a\u00020\u00182\u0006\u00105\u001a\u00020\u00182\u0006\u0010\u001a\u001a\u00020\u0018H\u0014¢\u0006\u0004\b6\u00107J\u0017\u0010:\u001a\u00020\t2\u0006\u00109\u001a\u000208H\u0014¢\u0006\u0004\b:\u0010;J'\u0010?\u001a\u00020\u00072\u0006\u00109\u001a\u0002082\u0006\u0010<\u001a\u00020\f2\u0006\u0010>\u001a\u00020=H\u0014¢\u0006\u0004\b?\u0010@J\u000f\u0010A\u001a\u00020\tH\u0002¢\u0006\u0004\bA\u0010BJ\u000f\u0010C\u001a\u00020\tH\u0002¢\u0006\u0004\bC\u0010BJ<\u0010I\u001a\u00020\u0007\"\u0004\b\u0000\u0010D2\b\u0010E\u001a\u0004\u0018\u00018\u00002\u0006\u0010F\u001a\u00028\u00002\u0012\u0010H\u001a\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00020\t0GH\u0082\b¢\u0006\u0004\bI\u0010JJ\u0019\u0010K\u001a\u00020\u00072\b\u0010,\u001a\u0004\u0018\u00010+H\u0002¢\u0006\u0004\bK\u0010LJ\u0017\u0010N\u001a\u00020\t2\u0006\u0010M\u001a\u00020+H\u0002¢\u0006\u0004\bN\u0010OJ\u0019\u0010P\u001a\u00020\u00072\b\u0010\u001d\u001a\u0004\u0018\u00010\u0018H\u0002¢\u0006\u0004\bP\u0010QJ\u001f\u0010U\u001a\u00020T2\u0006\u0010R\u001a\u00020+2\u0006\u0010S\u001a\u00020+H\u0002¢\u0006\u0004\bU\u0010VJ\u0017\u0010W\u001a\u00020\u00182\u0006\u0010*\u001a\u00020\u0018H\u0002¢\u0006\u0004\bW\u0010XJ\u0017\u0010Y\u001a\u00020\t2\u0006\u0010!\u001a\u00020 H\u0002¢\u0006\u0004\bY\u0010ZJ!\u0010]\u001a\u0004\u0018\u00010\f2\u0006\u0010[\u001a\u00020+2\u0006\u0010\\\u001a\u00020+H\u0002¢\u0006\u0004\b]\u0010^J)\u0010`\u001a\u0004\u0018\u00010\f2\u0006\u0010_\u001a\u00020\f2\u0006\u0010[\u001a\u00020+2\u0006\u0010\\\u001a\u00020+H\u0002¢\u0006\u0004\b`\u0010aJ#\u0010b\u001a\u00020\u0007*\u00020\f2\u0006\u0010[\u001a\u00020+2\u0006\u0010\\\u001a\u00020+H\u0002¢\u0006\u0004\bb\u0010cR\u0014\u0010d\u001a\u00020\u00018\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bd\u0010eR\u0014\u0010f\u001a\u00020\f8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bf\u0010gR\u0018\u0010h\u001a\u0004\u0018\u00010\u00128\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\bh\u0010iR\u0018\u0010j\u001a\u0004\u0018\u00010\f8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\bj\u0010gR\u0014\u0010k\u001a\u00020+8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bk\u0010lR\u0014\u0010m\u001a\u00020+8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bm\u0010lR\u0014\u0010n\u001a\u00020+8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bn\u0010lR\u0016\u0010o\u001a\u00020+8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\bo\u0010lR\u0018\u0010q\u001a\u0004\u0018\u00010p8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\bq\u0010rR\u0016\u0010s\u001a\u00020T8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\bs\u0010tR\u0014\u0010u\u001a\u00020p8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bu\u0010rR\u0014\u0010w\u001a\u00020v8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bw\u0010xR\u0014\u0010z\u001a\u00020y8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bz\u0010{R\u0014\u0010}\u001a\u00020|8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b}\u0010~R\u0017\u0010\u007f\u001a\u00020\u00188\u0002@\u0002X\u0082\u000e¢\u0006\u0007\n\u0005\b\u007f\u0010\u0080\u0001R\u0019\u0010\u0081\u0001\u001a\u00020\u00188\u0002@\u0002X\u0082\u000e¢\u0006\b\n\u0006\b\u0081\u0001\u0010\u0080\u0001R\u0019\u0010\u0082\u0001\u001a\u00020\u00188\u0002@\u0002X\u0082\u000e¢\u0006\b\n\u0006\b\u0082\u0001\u0010\u0080\u0001R\u0019\u0010\u0083\u0001\u001a\u00020\u00188\u0002@\u0002X\u0082\u000e¢\u0006\b\n\u0006\b\u0083\u0001\u0010\u0080\u0001R\u0019\u0010\u0084\u0001\u001a\u00020\u00078\u0002@\u0002X\u0082\u000e¢\u0006\b\n\u0006\b\u0084\u0001\u0010\u0085\u0001R\u0019\u0010\u0086\u0001\u001a\u00020\u00188\u0002@\u0002X\u0082\u000e¢\u0006\b\n\u0006\b\u0086\u0001\u0010\u0080\u0001R\u0019\u0010\u0087\u0001\u001a\u00020\u00188\u0002@\u0002X\u0082\u000e¢\u0006\b\n\u0006\b\u0087\u0001\u0010\u0080\u0001R\u0019\u0010\u0088\u0001\u001a\u00020\u00188\u0002@\u0002X\u0082\u000e¢\u0006\b\n\u0006\b\u0088\u0001\u0010\u0080\u0001R\u0019\u0010\u0089\u0001\u001a\u00020\u00188\u0002@\u0002X\u0082\u000e¢\u0006\b\n\u0006\b\u0089\u0001\u0010\u0080\u0001R\u0019\u0010\u008a\u0001\u001a\u00020\u00188\u0002@\u0002X\u0082\u000e¢\u0006\b\n\u0006\b\u008a\u0001\u0010\u0080\u0001R\u0019\u0010\u008b\u0001\u001a\u00020\u00188\u0002@\u0002X\u0082\u000e¢\u0006\b\n\u0006\b\u008b\u0001\u0010\u0080\u0001R\u0017\u0010\u008c\u0001\u001a\u00020\u00188\u0002X\u0082\u0004¢\u0006\b\n\u0006\b\u008c\u0001\u0010\u0080\u0001R\u0018\u0010\u008d\u0001\u001a\u00020+8\u0002@\u0002X\u0082\u000e¢\u0006\u0007\n\u0005\b\u008d\u0001\u0010lR\u0018\u0010\u008e\u0001\u001a\u00020+8\u0002@\u0002X\u0082\u000e¢\u0006\u0007\n\u0005\b\u008e\u0001\u0010lR\u001a\u0010\u008f\u0001\u001a\u0004\u0018\u00010\f8\u0002@\u0002X\u0082\u000e¢\u0006\u0007\n\u0005\b\u008f\u0001\u0010gR\u001a\u0010\u0090\u0001\u001a\u0004\u0018\u00010\f8\u0002@\u0002X\u0082\u000e¢\u0006\u0007\n\u0005\b\u0090\u0001\u0010gR\u0018\u0010\u0092\u0001\u001a\u00030\u0091\u00018\u0002X\u0082\u0004¢\u0006\b\n\u0006\b\u0092\u0001\u0010\u0093\u0001¨\u0006\u0094\u0001"}, d2 = {"Lcom/yandex/go/places/organization/card/impl/ui/card/flex/v2/OrganizationCardPageView;", "Landroid/widget/FrameLayout;", "Lnwy0;", "Landroid/content/Context;", "context", "<init>", "(Landroid/content/Context;)V", "", "isVisible", "Lzy11;", "setLoadingShimmerVisible", "(Z)V", "Landroid/view/View;", "flexContent", "attachFlexContent", "(Landroid/view/View;)V", "getScrollableContainer", "()Landroid/view/View;", "Lcom/yandex/go/places/organization/card/impl/ui/card/flex/v2/bottom_panel/OrganizationCardBottomPanelView;", "getBottomPanel", "()Lcom/yandex/go/places/organization/card/impl/ui/card/flex/v2/bottom_panel/OrganizationCardBottomPanelView;", "panel", "setBottomPanel", "(Lcom/yandex/go/places/organization/card/impl/ui/card/flex/v2/bottom_panel/OrganizationCardBottomPanelView;)V", "", "horizontal", "bottom", "setCardMargins", "(II)V", "bottomPadding", "setPanelBottomPadding", "(I)V", "Landroid/view/MotionEvent;", DatabaseHelper.OttTrackingTable.COLUMN_EVENT, "dispatchTouchEvent", "(Landroid/view/MotionEvent;)Z", "Lru/yandex/taxi/theme/ThemeType;", "themeType", "applyTheme", "(Lru/yandex/taxi/theme/ThemeType;)V", "marginHorizontal", "marginBottom", "height", "", "bottomRadius", "updateCardState", "(Ljava/lang/Integer;Ljava/lang/Integer;Ljava/lang/Integer;Ljava/lang/Float;Ljava/lang/Integer;)V", "widthMeasureSpec", "heightMeasureSpec", "onMeasure", "changed", "left", "top", "right", "onLayout", "(ZIIII)V", "Landroid/graphics/Canvas;", "canvas", "onDraw", "(Landroid/graphics/Canvas;)V", "child", "", "drawingTime", "drawChild", "(Landroid/graphics/Canvas;Landroid/view/View;J)Z", "clearPreviousBottomPanel", "()V", "updateShadowViewShape", "T", "newValue", "currentValue", "Lkotlin/Function1;", "update", "updateIfChanged", "(Ljava/lang/Object;Ljava/lang/Object;Ltls;)Z", "updateBottomRadius", "(Ljava/lang/Float;)Z", "radius", "applyBottomRadius", "(F)V", "updatePanelPadding", "(Ljava/lang/Integer;)Z", "topCornerRadius", "bottomCornerRadius", "Lcom/google/android/material/shape/b;", "buildShapeAppearanceModel", "(FF)Lcom/google/android/material/shape/b;", "getActualHeight", "(I)I", "handleHorizontalScrollableTouch", "(Landroid/view/MotionEvent;)V", RemoteBioParameters.X, RemoteBioParameters.Y, "findHorizontalScrollableTarget", "(FF)Landroid/view/View;", "view", "findHorizontalScrollableDescendant", "(Landroid/view/View;FF)Landroid/view/View;", "isReusableHorizontalScrollableTarget", "(Landroid/view/View;FF)Z", "flexContentContainer", "Landroid/widget/FrameLayout;", "loadingShimmer", "Landroid/view/View;", "bottomPanel", "Lcom/yandex/go/places/organization/card/impl/ui/card/flex/v2/bottom_panel/OrganizationCardBottomPanelView;", "shadowView", UrbanAdsBottomSheetFragment.CORNER_RADIUS, "F", "panelTopCornerRadius", "panelElevation", "currentBottomCornerRadius", "Lcom/google/android/material/shape/MaterialShapeDrawable;", "shadowShapeDrawable", "Lcom/google/android/material/shape/MaterialShapeDrawable;", "shapeAppearanceModel", "Lcom/google/android/material/shape/b;", "backgroundDrawable", "Landroid/graphics/Path;", "shapePath", "Landroid/graphics/Path;", "Ljhr0;", "shapePathProvider", "Ljhr0;", "Landroid/graphics/RectF;", "rectF", "Landroid/graphics/RectF;", "targetHeight", CA20Status.STATUS_USER_I, "targetMarginHorizontal", "targetMarginBottom", "cachedActualHeight", "isPathDirty", "Z", "cachedBoundsLeft", "cachedBoundsTop", "cachedBoundsRight", "cachedBoundsBottom", "cachedShadowWidth", "cachedShadowHeight", "touchSlop", "initialTouchX", "initialTouchY", "activeHorizontalScrollableTarget", "lastHorizontalScrollableTarget", "Landroid/graphics/Rect;", "targetHitRect", "Landroid/graphics/Rect;", "impl"}, k = 1, mv = {2, 4, 0}, xi = 48)
/* loaded from: classes13.dex */
public final class OrganizationCardPageView extends FrameLayout implements nwy0 {
    public static final int $stable = 8;
    private View activeHorizontalScrollableTarget;
    private final MaterialShapeDrawable backgroundDrawable;
    private OrganizationCardBottomPanelView bottomPanel;
    private int cachedActualHeight;
    private int cachedBoundsBottom;
    private int cachedBoundsLeft;
    private int cachedBoundsRight;
    private int cachedBoundsTop;
    private int cachedShadowHeight;
    private int cachedShadowWidth;
    private final float cornerRadius;
    private float currentBottomCornerRadius;
    private final FrameLayout flexContentContainer;
    private float initialTouchX;
    private float initialTouchY;
    private boolean isPathDirty;
    private View lastHorizontalScrollableTarget;
    private final View loadingShimmer;
    private final float panelElevation;
    private final float panelTopCornerRadius;
    private final RectF rectF;
    private MaterialShapeDrawable shadowShapeDrawable;
    private View shadowView;
    private com.google.android.material.shape.b shapeAppearanceModel;
    private final Path shapePath;
    private final jhr0 shapePathProvider;
    private int targetHeight;
    private final Rect targetHitRect;
    private int targetMarginBottom;
    private int targetMarginHorizontal;
    private final int touchSlop;

    public OrganizationCardPageView(Context context) {
        super(context);
        float r = tje.r(fug0.discovery_organizations_card_content_container_corner_round_size, context);
        this.cornerRadius = r;
        this.panelTopCornerRadius = context.getResources().getDimensionPixelSize(fug0.places_card_bottom_panel_top_corners);
        this.panelElevation = context.getResources().getDimensionPixelSize(fug0.places_card_bottom_panel_elevation);
        this.currentBottomCornerRadius = r;
        this.shapePath = new Path();
        this.shapePathProvider = new jhr0();
        this.rectF = new RectF();
        this.targetHeight = -1;
        this.isPathDirty = true;
        this.touchSlop = ViewConfiguration.get(context).getScaledTouchSlop();
        this.targetHitRect = new Rect();
        this.shapeAppearanceModel = buildShapeAppearanceModel(r, r);
        MaterialShapeDrawable materialShapeDrawable = new MaterialShapeDrawable(this.shapeAppearanceModel);
        materialShapeDrawable.setTint(qje.u(context.getTheme(), xng0.bgMain));
        this.backgroundDrawable = materialShapeDrawable;
        setWillNotDraw(false);
        setClipChildren(false);
        FrameLayout frameLayout = new FrameLayout(context);
        frameLayout.setLayoutParams(new FrameLayout.LayoutParams(-1, -1));
        this.flexContentContainer = frameLayout;
        addView(frameLayout);
        View inflate = LayoutInflater.from(context).inflate(vuh0.organization_cards_slider_shimmer_view, (ViewGroup) this, false);
        if (inflate == null) {
            ny61.t("rootView");
            throw null;
        }
        View view = (GoLinearLayout) inflate;
        this.loadingShimmer = view;
        addView(view);
    }

    private final void applyBottomRadius(float radius) {
        com.google.android.material.shape.b buildShapeAppearanceModel = buildShapeAppearanceModel(this.cornerRadius, radius);
        this.shapeAppearanceModel = buildShapeAppearanceModel;
        this.backgroundDrawable.setShapeAppearanceModel(buildShapeAppearanceModel);
        OrganizationCardBottomPanelView organizationCardBottomPanelView = this.bottomPanel;
        if (organizationCardBottomPanelView != null) {
            organizationCardBottomPanelView.setBottomCornersRadius(radius);
        }
        updateShadowViewShape();
    }

    private final com.google.android.material.shape.b buildShapeAppearanceModel(float topCornerRadius, float bottomCornerRadius) {
        b.a aVar = new b.a();
        aVar.j(topCornerRadius);
        aVar.l(topCornerRadius);
        aVar.f(bottomCornerRadius);
        aVar.h(bottomCornerRadius);
        return aVar.a();
    }

    private final void clearPreviousBottomPanel() {
        OrganizationCardBottomPanelView organizationCardBottomPanelView = this.bottomPanel;
        if (organizationCardBottomPanelView != null) {
            removeView(organizationCardBottomPanelView);
        }
        View view = this.shadowView;
        if (view != null) {
            removeView(view);
        }
        this.bottomPanel = null;
        this.shadowView = null;
        this.shadowShapeDrawable = null;
    }

    private final View findHorizontalScrollableDescendant(View view, float x, float y) {
        View findHorizontalScrollableDescendant;
        if (!view.isShown()) {
            return null;
        }
        if (view instanceof ViewGroup) {
            ViewGroup viewGroup = (ViewGroup) view;
            for (int childCount = viewGroup.getChildCount() - 1; -1 < childCount; childCount--) {
                View childAt = viewGroup.getChildAt(childCount);
                float left = (x - childAt.getLeft()) + viewGroup.getScrollX();
                float top = (y - childAt.getTop()) + viewGroup.getScrollY();
                if (0.0f <= left && left <= childAt.getWidth() && 0.0f <= top && top <= childAt.getHeight() && (findHorizontalScrollableDescendant = findHorizontalScrollableDescendant(childAt, left, top)) != null) {
                    return findHorizontalScrollableDescendant;
                }
            }
        }
        if (view == this || !(view.canScrollHorizontally(-1) || view.canScrollHorizontally(1))) {
            return null;
        }
        return view;
    }

    private final View findHorizontalScrollableTarget(float x, float y) {
        View view = this.lastHorizontalScrollableTarget;
        if (view != null) {
            if (!isReusableHorizontalScrollableTarget(view, x, y)) {
                view = null;
            }
            if (view != null) {
                return view;
            }
        }
        View findHorizontalScrollableDescendant = findHorizontalScrollableDescendant(this, x, y);
        if (findHorizontalScrollableDescendant == null) {
            return null;
        }
        this.lastHorizontalScrollableTarget = findHorizontalScrollableDescendant;
        return findHorizontalScrollableDescendant;
    }

    private final int getActualHeight(int height) {
        int i = this.targetHeight;
        return i == -1 ? height - this.targetMarginBottom : i;
    }

    private final void handleHorizontalScrollableTouch(MotionEvent event) {
        ViewParent parent;
        int actionMasked = event.getActionMasked();
        if (actionMasked == 0) {
            this.initialTouchX = event.getX();
            this.initialTouchY = event.getY();
            View findHorizontalScrollableTarget = findHorizontalScrollableTarget(event.getX(), event.getY());
            this.activeHorizontalScrollableTarget = findHorizontalScrollableTarget;
            if (findHorizontalScrollableTarget == null || (parent = getParent()) == null) {
                return;
            }
            parent.requestDisallowInterceptTouchEvent(true);
            return;
        }
        if (actionMasked != 1) {
            if (actionMasked == 2) {
                View view = this.activeHorizontalScrollableTarget;
                if (view == null) {
                    return;
                }
                float x = event.getX() - this.initialTouchX;
                float y = event.getY() - this.initialTouchY;
                if (Math.abs(x) > this.touchSlop || Math.abs(y) > this.touchSlop) {
                    boolean z = Math.abs(x) > Math.abs(y) && view.canScrollHorizontally((int) Math.signum(-x));
                    ViewParent parent2 = getParent();
                    if (parent2 != null) {
                        parent2.requestDisallowInterceptTouchEvent(z);
                        return;
                    }
                    return;
                }
                return;
            }
            if (actionMasked != 3) {
                return;
            }
        }
        this.activeHorizontalScrollableTarget = null;
        ViewParent parent3 = getParent();
        if (parent3 != null) {
            parent3.requestDisallowInterceptTouchEvent(false);
        }
    }

    private final boolean isReusableHorizontalScrollableTarget(View view, float f, float f2) {
        if (!view.isShown() || !view.isAttachedToWindow()) {
            return false;
        }
        if (!view.canScrollHorizontally(-1) && !view.canScrollHorizontally(1)) {
            return false;
        }
        view.getHitRect(this.targetHitRect);
        offsetDescendantRectToMyCoords(view, this.targetHitRect);
        return this.targetHitRect.contains((int) f, (int) f2);
    }

    private final boolean updateBottomRadius(Float bottomRadius) {
        if (bottomRadius == null) {
            return false;
        }
        float floatValue = bottomRadius.floatValue();
        this.currentBottomCornerRadius = floatValue;
        applyBottomRadius(floatValue);
        return true;
    }

    public static /* synthetic */ void updateCardState$default(OrganizationCardPageView organizationCardPageView, Integer num, Integer num2, Integer num3, Float f, Integer num4, int i, Object obj) {
        if ((i & 1) != 0) {
            num = null;
        }
        if ((i & 2) != 0) {
            num2 = null;
        }
        if ((i & 4) != 0) {
            num3 = null;
        }
        if ((i & 8) != 0) {
            f = null;
        }
        if ((i & 16) != 0) {
            num4 = null;
        }
        organizationCardPageView.updateCardState(num, num2, num3, f, num4);
    }

    private final <T> boolean updateIfChanged(T newValue, T currentValue, tls update) {
        if (newValue == null || jl40.l(currentValue, newValue)) {
            return false;
        }
        update.invoke(newValue);
        return true;
    }

    private final boolean updatePanelPadding(Integer bottomPadding) {
        if (bottomPadding == null) {
            return false;
        }
        int intValue = bottomPadding.intValue();
        OrganizationCardBottomPanelView organizationCardBottomPanelView = this.bottomPanel;
        if (organizationCardBottomPanelView == null) {
            return true;
        }
        organizationCardBottomPanelView.setBottomPadding(intValue);
        return true;
    }

    private final void updateShadowViewShape() {
        MaterialShapeDrawable materialShapeDrawable = this.shadowShapeDrawable;
        if (materialShapeDrawable != null) {
            b.a aVar = new b.a();
            aVar.j(this.panelTopCornerRadius);
            aVar.l(this.panelTopCornerRadius);
            aVar.f(0.0f);
            aVar.h(0.0f);
            materialShapeDrawable.setShapeAppearanceModel(aVar.a());
        }
    }

    @Override // defpackage.nwy0
    /* renamed from: allowTraverse */
    public /* bridge */ boolean getIsTrackingsRedesignEnabled() {
        return true;
    }

    @Override // defpackage.nwy0
    public void applyTheme(ThemeType themeType) {
        this.backgroundDrawable.setTint(qje.t(xng0.bgMain, getContext()));
        MaterialShapeDrawable materialShapeDrawable = this.shadowShapeDrawable;
        if (materialShapeDrawable != null) {
            materialShapeDrawable.setTint(qje.t(xng0.bgMain, getContext()));
        }
        OrganizationCardBottomPanelView organizationCardBottomPanelView = this.bottomPanel;
        if (organizationCardBottomPanelView != null) {
            organizationCardBottomPanelView.applyTheme(themeType);
        }
        View view = this.shadowView;
        if (view != null) {
            view.invalidate();
        }
        invalidate();
    }

    @Override // defpackage.nwy0
    public /* bridge */ boolean applyThemeForChildrenByDefault() {
        return true;
    }

    public final void attachFlexContent(View flexContent) {
        this.flexContentContainer.removeAllViews();
        if (flexContent != null) {
            ViewParent parent = flexContent.getParent();
            ViewGroup viewGroup = parent instanceof ViewGroup ? (ViewGroup) parent : null;
            if (viewGroup != null) {
                viewGroup.removeView(flexContent);
            }
            this.flexContentContainer.addView(flexContent, new FrameLayout.LayoutParams(-1, -1));
        }
    }

    @Override // android.view.ViewGroup, android.view.View
    public boolean dispatchTouchEvent(MotionEvent event) {
        handleHorizontalScrollableTouch(event);
        return super.dispatchTouchEvent(event);
    }

    @Override // android.view.ViewGroup
    public boolean drawChild(Canvas canvas, View child, long drawingTime) {
        if (!jl40.l(child, this.flexContentContainer)) {
            if (!jl40.l(child, this.shadowView) && !jl40.l(child, this.bottomPanel)) {
                return super.drawChild(canvas, child, drawingTime);
            }
            float f = this.targetMarginHorizontal;
            float width = getWidth() - this.targetMarginHorizontal;
            float f2 = -this.panelElevation;
            float height = getHeight();
            int save = canvas.save();
            canvas.clipRect(f, f2, width, height);
            boolean drawChild = super.drawChild(canvas, child, drawingTime);
            canvas.restoreToCount(save);
            return drawChild;
        }
        float f3 = this.targetMarginHorizontal;
        float width2 = getWidth() - this.targetMarginHorizontal;
        float f4 = this.cachedActualHeight;
        if (this.isPathDirty) {
            this.rectF.set(f3, 0.0f, width2, f4);
            this.shapePath.reset();
            this.shapePathProvider.a(this.shapeAppearanceModel, this.rectF, this.shapePath);
            this.isPathDirty = false;
        }
        int save2 = canvas.save();
        canvas.clipPath(this.shapePath);
        boolean drawChild2 = super.drawChild(canvas, child, drawingTime);
        canvas.restoreToCount(save2);
        return drawChild2;
    }

    public final OrganizationCardBottomPanelView getBottomPanel() {
        return this.bottomPanel;
    }

    public final View getScrollableContainer() {
        return this.flexContentContainer;
    }

    @Override // android.view.View
    public void onDraw(Canvas canvas) {
        super.onDraw(canvas);
        this.backgroundDrawable.draw(canvas);
    }

    @Override // android.widget.FrameLayout, android.view.ViewGroup, android.view.View
    public void onLayout(boolean changed, int left, int top, int right, int bottom) {
        int i = this.targetMarginHorizontal;
        int width = getWidth() - this.targetMarginHorizontal;
        int actualHeight = getActualHeight(getHeight());
        this.cachedActualHeight = actualHeight;
        this.flexContentContainer.layout(i, 0, width, actualHeight);
        this.loadingShimmer.layout(i, 0, width, actualHeight);
        OrganizationCardBottomPanelView organizationCardBottomPanelView = this.bottomPanel;
        int measuredHeight = organizationCardBottomPanelView != null ? organizationCardBottomPanelView.getMeasuredHeight() : 0;
        FrameLayout frameLayout = this.flexContentContainer;
        if (frameLayout.getPaddingBottom() != measuredHeight) {
            frameLayout.setPadding(frameLayout.getPaddingLeft(), frameLayout.getPaddingTop(), frameLayout.getPaddingRight(), measuredHeight);
        }
        if (measuredHeight > 0) {
            int i2 = actualHeight - measuredHeight;
            int i3 = (int) this.panelTopCornerRadius;
            View view = this.shadowView;
            if (view != null) {
                view.layout(i, i2, width, i2 + i3);
            }
            int i4 = width - i;
            if (i4 != this.cachedShadowWidth || i3 != this.cachedShadowHeight) {
                MaterialShapeDrawable materialShapeDrawable = this.shadowShapeDrawable;
                if (materialShapeDrawable != null) {
                    materialShapeDrawable.setBounds(0, 0, i4, i3);
                }
                View view2 = this.shadowView;
                if (view2 != null) {
                    view2.invalidate();
                }
                this.cachedShadowWidth = i4;
                this.cachedShadowHeight = i3;
            }
            OrganizationCardBottomPanelView organizationCardBottomPanelView2 = this.bottomPanel;
            if (organizationCardBottomPanelView2 != null) {
                organizationCardBottomPanelView2.layout(i, i2, width, actualHeight);
            }
        }
        int i5 = this.targetMarginHorizontal;
        int width2 = getWidth() - this.targetMarginHorizontal;
        if (i5 == this.cachedBoundsLeft && this.cachedBoundsTop == 0 && width2 == this.cachedBoundsRight && actualHeight == this.cachedBoundsBottom) {
            return;
        }
        this.backgroundDrawable.setBounds(i5, 0, width2, actualHeight);
        this.cachedBoundsLeft = i5;
        this.cachedBoundsTop = 0;
        this.cachedBoundsRight = width2;
        this.cachedBoundsBottom = actualHeight;
    }

    @Override // android.widget.FrameLayout, android.view.View
    public void onMeasure(int widthMeasureSpec, int heightMeasureSpec) {
        int size = View.MeasureSpec.getSize(widthMeasureSpec);
        int size2 = View.MeasureSpec.getSize(heightMeasureSpec);
        measureChildren(View.MeasureSpec.makeMeasureSpec(size - (this.targetMarginHorizontal * 2), 1073741824), View.MeasureSpec.makeMeasureSpec(getActualHeight(size2), 1073741824));
        setMeasuredDimension(size, size2);
    }

    public final void setBottomPanel(OrganizationCardBottomPanelView panel) {
        clearPreviousBottomPanel();
        this.bottomPanel = panel;
        if (panel == null) {
            this.shadowView = null;
            this.shadowShapeDrawable = null;
            return;
        }
        View view = new View(getContext());
        b.a aVar = new b.a();
        aVar.j(this.panelTopCornerRadius);
        aVar.l(this.panelTopCornerRadius);
        MaterialShapeDrawable materialShapeDrawable = new MaterialShapeDrawable(aVar.a());
        materialShapeDrawable.setTint(qje.t(xng0.bgMain, view.getContext()));
        this.shadowShapeDrawable = materialShapeDrawable;
        view.setBackground(materialShapeDrawable);
        this.shadowView = view;
        addView(view, new FrameLayout.LayoutParams(-1, (int) this.panelTopCornerRadius));
        addView(panel, new FrameLayout.LayoutParams(-1, -2));
        panel.setBottomCornersRadius(this.currentBottomCornerRadius);
    }

    public final void setCardMargins(int horizontal, int bottom) {
        boolean z;
        boolean z2 = false;
        if (this.targetMarginHorizontal != horizontal) {
            this.targetMarginHorizontal = horizontal;
            z = true;
        } else {
            z = false;
        }
        if (this.targetMarginBottom != bottom) {
            this.targetMarginBottom = bottom;
            z2 = true;
        }
        if (z || z2) {
            this.isPathDirty = true;
            requestLayout();
        }
    }

    public final void setLoadingShimmerVisible(boolean isVisible) {
        this.loadingShimmer.setVisibility(isVisible ? 0 : 8);
        this.flexContentContainer.setVisibility(isVisible ? 8 : 0);
    }

    public final void setPanelBottomPadding(int bottomPadding) {
        OrganizationCardBottomPanelView organizationCardBottomPanelView = this.bottomPanel;
        if (organizationCardBottomPanelView != null) {
            organizationCardBottomPanelView.setBottomPadding(bottomPadding);
        }
        requestLayout();
    }

    public final void updateCardState(Integer marginHorizontal, Integer marginBottom, Integer height, Float bottomRadius, Integer bottomPadding) {
        boolean z;
        boolean z2;
        boolean z3;
        Integer valueOf = Integer.valueOf(this.targetMarginHorizontal);
        boolean z4 = true;
        if (marginHorizontal == null || valueOf.equals(marginHorizontal)) {
            z = false;
        } else {
            this.targetMarginHorizontal = marginHorizontal.intValue();
            z = true;
        }
        Integer valueOf2 = Integer.valueOf(this.targetMarginBottom);
        if (marginBottom == null || valueOf2.equals(marginBottom)) {
            z2 = false;
        } else {
            this.targetMarginBottom = marginBottom.intValue();
            z2 = true;
        }
        Integer valueOf3 = Integer.valueOf(this.targetHeight);
        if (height == null || valueOf3.equals(height)) {
            z3 = false;
        } else {
            this.targetHeight = height.intValue();
            z3 = true;
        }
        boolean updateBottomRadius = updateBottomRadius(bottomRadius);
        boolean updatePanelPadding = updatePanelPadding(bottomPadding);
        if (!z && !z2 && !z3 && !updatePanelPadding) {
            z4 = false;
        }
        this.isPathDirty = z4;
        if (z4) {
            requestLayout();
        } else if (updateBottomRadius) {
            invalidate();
        }
    }
}
