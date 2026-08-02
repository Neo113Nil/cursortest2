package com.yandex.go.taxi.main;

import android.content.Context;
import android.graphics.Color;
import android.graphics.drawable.GradientDrawable;
import android.view.View;
import com.yandex.go.navigation.screen.api.Screen;
import defpackage.avj0;
import defpackage.b7p0;
import defpackage.cma1;
import defpackage.dai;
import defpackage.dai0;
import defpackage.evu0;
import defpackage.g18;
import defpackage.h3y;
import defpackage.hst;
import defpackage.i130;
import defpackage.jst;
import defpackage.k8h0;
import defpackage.ka00;
import defpackage.kyh0;
import defpackage.l30;
import defpackage.m30;
import defpackage.mmp0;
import defpackage.n2s0;
import defpackage.nwy0;
import defpackage.pzr0;
import defpackage.qje;
import defpackage.quq0;
import defpackage.r0s0;
import defpackage.r330;
import defpackage.sq40;
import defpackage.t1w;
import defpackage.tje;
import defpackage.u45;
import defpackage.ukh0;
import defpackage.uni0;
import defpackage.unr0;
import defpackage.v3s0;
import defpackage.w6r;
import defpackage.xng0;
import defpackage.xw0;
import defpackage.xw31;
import defpackage.y4k0;
import defpackage.y700;
import java.lang.ref.WeakReference;
import java.util.function.Consumer;
import kotlin.Metadata;
import kotlinx.coroutines.flow.k;
import ru.CryptoPro.JCPRequest.ca20.status.CA20Status;
import ru.yandex.taxi.address.models.SourcePicker;
import ru.yandex.taxi.analytics.j;
import ru.yandex.taxi.design.ListItemComponent;
import ru.yandex.taxi.multiexit.MultiexitModalView;
import ru.yandex.taxi.preorder.mainscreen.MainScreen;
import ru.yandex.taxi.preorder.mainscreen.MainScreenView;
import ru.yandex.taxi.search.address.view.PointType;
import ru.yandex.taxi.theme.ThemeType;
import ru.yandex.taxi.widget.ModalView;
import ru.yandex.taxi.widget.SlideableModalView;
import ru.yandex.taxi.widget.address.AddressItemBuilder$AddressType;
import ru.yandex.taxi.widget.modalview.ModalViewCoordinator$StackChangeType;
import ru.yandex.taxi.widget.modalview.ModalViewProcessing$ProcessingState;

@Metadata(d1 = {"\u0000¬\u0001\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u000b\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u000b\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\b\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0011\b\u0007\u0018\u00002\u00020\u00012\u00020\u0002:\u0001jBW\b\u0007\u0012\b\b\u0001\u0010\u0004\u001a\u00020\u0003\u0012\u0006\u0010\u0006\u001a\u00020\u0005\u0012\u0006\u0010\b\u001a\u00020\u0007\u0012\f\u0010\u000b\u001a\b\u0012\u0004\u0012\u00020\n0\t\u0012\u0006\u0010\r\u001a\u00020\f\u0012\f\u0010\u000f\u001a\b\u0012\u0004\u0012\u00020\u000e0\t\u0012\u0006\u0010\u0011\u001a\u00020\u0010\u0012\u0006\u0010\u0013\u001a\u00020\u0012¢\u0006\u0004\b\u0014\u0010\u0015J\u000f\u0010\u0017\u001a\u00020\u0016H\u0014¢\u0006\u0004\b\u0017\u0010\u0018J\u000f\u0010\u0019\u001a\u00020\u0016H\u0014¢\u0006\u0004\b\u0019\u0010\u0018J\u000f\u0010\u001b\u001a\u00020\u0016H\u0000¢\u0006\u0004\b\u001a\u0010\u0018J\u001d\u0010 \u001a\u00020\u00162\u0006\u0010\u001d\u001a\u00020\u001c2\u0006\u0010\u001f\u001a\u00020\u001e¢\u0006\u0004\b \u0010!J\u001d\u0010'\u001a\u00020\u00162\f\u0010$\u001a\b\u0012\u0004\u0012\u00020#0\"H\u0000¢\u0006\u0004\b%\u0010&J\r\u0010)\u001a\u00020(¢\u0006\u0004\b)\u0010*J\u000f\u0010+\u001a\u00020\u0016H\u0016¢\u0006\u0004\b+\u0010\u0018J\u000f\u0010,\u001a\u00020\u0016H\u0016¢\u0006\u0004\b,\u0010\u0018J\u000f\u0010-\u001a\u00020\u0016H\u0016¢\u0006\u0004\b-\u0010\u0018J\u000f\u0010.\u001a\u00020\u0016H\u0016¢\u0006\u0004\b.\u0010\u0018J\u000f\u0010/\u001a\u00020\u0016H\u0016¢\u0006\u0004\b/\u0010\u0018J\u0017\u00102\u001a\u00020\u00162\u0006\u00101\u001a\u000200H\u0016¢\u0006\u0004\b2\u00103J\u000f\u00104\u001a\u00020\u0016H\u0016¢\u0006\u0004\b4\u0010\u0018J\u0017\u00107\u001a\u00020\u00162\u0006\u00106\u001a\u000205H\u0016¢\u0006\u0004\b7\u00108J\u000f\u00109\u001a\u00020(H\u0016¢\u0006\u0004\b9\u0010*J\u000f\u0010;\u001a\u00020\u0016H\u0000¢\u0006\u0004\b:\u0010\u0018J\u000f\u0010=\u001a\u00020\u0016H\u0000¢\u0006\u0004\b<\u0010\u0018J\u000f\u0010?\u001a\u00020\u0016H\u0000¢\u0006\u0004\b>\u0010\u0018J\u000f\u0010@\u001a\u00020\u0016H\u0002¢\u0006\u0004\b@\u0010\u0018J\u000f\u0010B\u001a\u00020AH\u0002¢\u0006\u0004\bB\u0010CR\u0014\u0010\u0006\u001a\u00020\u00058\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0006\u0010DR\u0014\u0010\b\u001a\u00020\u00078\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\b\u0010ER\u001a\u0010\u000b\u001a\b\u0012\u0004\u0012\u00020\n0\t8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u000b\u0010FR\u0014\u0010\r\u001a\u00020\f8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\r\u0010GR\u001a\u0010\u000f\u001a\b\u0012\u0004\u0012\u00020\u000e0\t8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u000f\u0010FR\u0014\u0010\u0011\u001a\u00020\u00108\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0011\u0010HR\u0014\u0010J\u001a\u00020I8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bJ\u0010KR\u0014\u0010M\u001a\u00020L8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bM\u0010NR\u001a\u0010P\u001a\u00020O8\u0000X\u0080\u0004¢\u0006\f\n\u0004\bP\u0010Q\u001a\u0004\bR\u0010SR\u0016\u0010U\u001a\u00020T8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\bU\u0010VR\u0018\u00101\u001a\u0004\u0018\u0001008\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b1\u0010WR\u0018\u0010X\u001a\u0004\u0018\u00010#8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\bX\u0010YR\u0016\u0010[\u001a\u00020Z8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b[\u0010\\R\u0016\u0010]\u001a\u00020Z8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b]\u0010\\R\u001a\u0010^\u001a\u00020(8\u0000X\u0080\u0004¢\u0006\f\n\u0004\b^\u0010_\u001a\u0004\b`\u0010*R\u0014\u0010c\u001a\u00020\u000e8VX\u0096\u0004¢\u0006\u0006\u001a\u0004\ba\u0010bR\u0011\u0010d\u001a\u00020(8F¢\u0006\u0006\u001a\u0004\bd\u0010*R\u0011\u0010e\u001a\u00020(8F¢\u0006\u0006\u001a\u0004\be\u0010*R\u0011\u0010f\u001a\u00020(8F¢\u0006\u0006\u001a\u0004\bf\u0010*R\u0014\u0010i\u001a\u00020T8VX\u0096\u0004¢\u0006\u0006\u001a\u0004\bg\u0010h¨\u0006k"}, d2 = {"Lcom/yandex/go/taxi/main/ShortcutsMainScreen;", "Lru/yandex/taxi/preorder/mainscreen/MainScreenView;", "Lnwy0;", "Landroid/content/Context;", "context", "Lcom/yandex/go/taxi/main/h;", "presenter", "Li130;", "modalViewCoordinatorProvider", "Lh3y;", "Lr0s0;", "shortcutModalViewFactory", "Luni0;", "referralGiftParentInteractor", "Lv3s0;", "transitionCoordinatorLazy", "Lw6r;", "finalSuggestScreenRepository", "Ly4k0;", "ridaAppDelegate", "<init>", "(Landroid/content/Context;Lcom/yandex/go/taxi/main/h;Li130;Lh3y;Luni0;Lh3y;Lw6r;Ly4k0;)V", "Lzy11;", "onAttachedToWindow", "()V", "onDetachedFromWindow", "onSourceAddressSet$impl", "onSourceAddressSet", "Lru/yandex/taxi/address/models/SourcePicker;", "sourcePicker", "Lru/yandex/taxi/search/address/view/PointType;", "pointType", "showAddressesPicker", "(Lru/yandex/taxi/address/models/SourcePicker;Lru/yandex/taxi/search/address/view/PointType;)V", "Ljava/util/function/Consumer;", "Ly700;", "onAppear", "ensureMainModalView$impl", "(Ljava/util/function/Consumer;)V", "ensureMainModalView", "", "modalViewShown", "()Z", "onAfterInflate", "disableControlElements", "enableControlElements", "pause", "resume", "Lru/yandex/taxi/preorder/mainscreen/MainScreen$MainScreenMode;", "mode", "setMode", "(Lru/yandex/taxi/preorder/mainscreen/MainScreen$MainScreenMode;)V", "dismiss", "Lru/yandex/taxi/theme/ThemeType;", "themeType", "applyTheme", "(Lru/yandex/taxi/theme/ThemeType;)V", "applyThemeForChildrenByDefault", "minimizeMainModalView$impl", "minimizeMainModalView", "ensureAutolocateButton$impl", "ensureAutolocateButton", "removeAutolocateButton$impl", "removeAutolocateButton", "dismissMainModalView", "Landroid/graphics/drawable/GradientDrawable;", "createTopGradientDrawable", "()Landroid/graphics/drawable/GradientDrawable;", "Lcom/yandex/go/taxi/main/h;", "Li130;", "Lh3y;", "Luni0;", "Lw6r;", "Landroid/view/View;", "topFade", "Landroid/view/View;", "Lru/yandex/taxi/design/ListItemComponent;", "addressView", "Lru/yandex/taxi/design/ListItemComponent;", "Lru/yandex/taxi/widget/address/b;", "addressOnMapController", "Lru/yandex/taxi/widget/address/b;", "getAddressOnMapController$impl", "()Lru/yandex/taxi/widget/address/b;", "", "topFadeHeight", CA20Status.STATUS_USER_I, "Lru/yandex/taxi/preorder/mainscreen/MainScreen$MainScreenMode;", "mainModalView", "Ly700;", "Lg18;", "mainScreenCancellable", "Lg18;", "mainModalViewShowCancellable", "isAddressViewVisible", "Z", "isAddressViewVisible$impl", "getTransitionCoordinator", "()Lv3s0;", "transitionCoordinator", "isProcessing", "isStickOut", "isExpanded", "getBottomContentHeight", "()I", "bottomContentHeight", "n2s0", "impl"}, k = 1, mv = {2, 4, 0}, xi = 48)
/* loaded from: classes14.dex */
public final class ShortcutsMainScreen extends MainScreenView implements nwy0 {
    private final ru.yandex.taxi.widget.address.b addressOnMapController;
    private final ListItemComponent addressView;
    private final w6r finalSuggestScreenRepository;
    private final boolean isAddressViewVisible;
    private y700 mainModalView;
    private g18 mainModalViewShowCancellable;
    private g18 mainScreenCancellable;
    private final i130 modalViewCoordinatorProvider;
    private MainScreen.MainScreenMode mode;
    private final h presenter;
    private final uni0 referralGiftParentInteractor;
    private final h3y shortcutModalViewFactory;
    private final View topFade;
    private int topFadeHeight;
    private final h3y transitionCoordinatorLazy;

    public ShortcutsMainScreen(Context context, h hVar, i130 i130Var, h3y h3yVar, uni0 uni0Var, h3y h3yVar2, w6r w6rVar, y4k0 y4k0Var) {
        super(context, null, 0, 6, null);
        this.presenter = hVar;
        this.modalViewCoordinatorProvider = i130Var;
        this.shortcutModalViewFactory = h3yVar;
        this.referralGiftParentInteractor = uni0Var;
        this.transitionCoordinatorLazy = h3yVar2;
        this.finalSuggestScreenRepository = w6rVar;
        ru.yandex.taxi.design.utils.c.q(this, ukh0.address_search_main_screen_layout_content, true);
        View findViewById = findViewById(k8h0.map_top_fade);
        this.topFade = findViewById;
        ListItemComponent a = new xw0(this).a(AddressItemBuilder$AddressType.TAXI);
        this.addressView = a;
        this.addressOnMapController = new ru.yandex.taxi.widget.address.b(a, findViewById);
        dai daiVar = g18.u1;
        this.mainScreenCancellable = daiVar;
        this.mainModalViewShowCancellable = daiVar;
        y4k0Var.getClass();
        this.isAddressViewVisible = true;
        addView(a);
        tje.j(new quq0(7, this), findViewById);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final boolean _init_$lambda$0(ShortcutsMainScreen shortcutsMainScreen, t1w t1wVar) {
        xw31.L(t1wVar.b, shortcutsMainScreen.addressView);
        if (!shortcutsMainScreen.topFade.isLaidOut()) {
            return false;
        }
        if (shortcutsMainScreen.topFadeHeight == 0) {
            shortcutsMainScreen.topFadeHeight = shortcutsMainScreen.topFade.getHeight();
        }
        ru.yandex.taxi.design.utils.c.C(shortcutsMainScreen.topFadeHeight + t1wVar.b, shortcutsMainScreen.topFade);
        return false;
    }

    private final GradientDrawable createTopGradientDrawable() {
        GradientDrawable.Orientation orientation = GradientDrawable.Orientation.BOTTOM_TOP;
        int t = qje.t(xng0.bgMain, getContext());
        int argb = Color.argb((int) (Color.alpha(t) * 0.0f), Color.red(t), Color.green(t), Color.blue(t));
        int t2 = qje.t(xng0.bgMain, getContext());
        return new GradientDrawable(orientation, new int[]{argb, Color.argb((int) (Color.alpha(t2) * 1.0f), Color.red(t2), Color.green(t2), Color.blue(t2))});
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void dismissMainModalView() {
        if (this.mainModalView == null) {
            return;
        }
        this.modalViewCoordinatorProvider.a().l((ModalView) this.mainModalView);
        this.mainModalViewShowCancellable.cancel();
        ((ShortcutsMainScreen) getTransitionCoordinator().S.get()).removeAutolocateButton$impl();
        this.mainModalView = null;
        jst.e.getClass();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void ensureMainModalView$lambda$0(ShortcutsMainScreen shortcutsMainScreen, Consumer consumer, u45 u45Var, u45 u45Var2, ModalViewCoordinator$StackChangeType modalViewCoordinator$StackChangeType) {
        if (u45Var2 instanceof y700) {
            shortcutsMainScreen.presenter.B.c();
            consumer.accept(u45Var2);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void onAttachedToWindow$lambda$0(ShortcutsMainScreen shortcutsMainScreen) {
        h hVar = shortcutsMainScreen.presenter;
        ((j) hVar.B.c).n("Main.ChangeAddress");
        hVar.Lg();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final SlideableModalView onAttachedToWindow$lambda$1(ShortcutsMainScreen shortcutsMainScreen) {
        r330 r330Var = shortcutsMainScreen.mainModalView;
        if (r330Var instanceof SlideableModalView) {
            return (SlideableModalView) r330Var;
        }
        return null;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void onAttachedToWindow$lambda$2(ShortcutsMainScreen shortcutsMainScreen, u45 u45Var, u45 u45Var2, ModalViewCoordinator$StackChangeType modalViewCoordinator$StackChangeType) {
        if ((u45Var instanceof y700) && !modalViewCoordinator$StackChangeType.getIsStackIncreased() && u45Var == shortcutsMainScreen.mainModalView) {
            ((ShortcutsMainScreen) shortcutsMainScreen.getTransitionCoordinator().S.get()).removeAutolocateButton$impl();
            shortcutsMainScreen.mainModalView = null;
            shortcutsMainScreen.mainModalViewShowCancellable.cancel();
            hst hstVar = jst.e;
            new Throwable();
            unr0.C(new Object[]{"MainScreen"}, 1, "%s: onstack changed remove modal view field", hstVar);
        }
    }

    @Override // defpackage.nwy0
    /* renamed from: allowTraverse */
    public /* bridge */ boolean getIsTrackingsRedesignEnabled() {
        return true;
    }

    @Override // defpackage.nwy0
    public void applyTheme(ThemeType themeType) {
        this.topFade.setBackground(createTopGradientDrawable());
    }

    @Override // defpackage.nwy0
    public boolean applyThemeForChildrenByDefault() {
        return false;
    }

    @Override // ru.yandex.taxi.preorder.mainscreen.MainScreenView, ru.yandex.taxi.preorder.mainscreen.MainScreen
    public void disableControlElements() {
    }

    @Override // ru.yandex.taxi.preorder.mainscreen.MainScreenView
    public void dismiss() {
        dismissMainModalView();
    }

    @Override // ru.yandex.taxi.preorder.mainscreen.MainScreenView, ru.yandex.taxi.preorder.mainscreen.MainScreen
    public void enableControlElements() {
    }

    public final void ensureAutolocateButton$impl() {
        y700 y700Var = this.mainModalView;
        if (y700Var != null) {
            y700Var.addLocateButton();
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final void ensureMainModalView$impl(Consumer<y700> onAppear) {
        if (getTransitionCoordinator().b.a().i(MultiexitModalView.class) != null || this.mode == MainScreen.MainScreenMode.TAXI_FUNCTIONALITY_DISABLED || getTransitionCoordinator().B.a()) {
            return;
        }
        y700 y700Var = this.mainModalView;
        if (y700Var != 0) {
            View view = (View) y700Var;
            if (view.getParent() != null) {
                cma1.J(view);
                y700Var.setProcessingState(ModalViewProcessing$ProcessingState.DONE);
                onAppear.accept(y700Var);
                return;
            }
        }
        this.mainModalViewShowCancellable.cancel();
        this.mainModalViewShowCancellable = this.modalViewCoordinatorProvider.a().g(new sq40(1, this, onAppear));
        w6r w6rVar = this.finalSuggestScreenRepository;
        Screen screen = Screen.MAIN;
        ru.yandex.taxi.persuggest.source.f fVar = (ru.yandex.taxi.persuggest.source.f) w6rVar;
        fVar.getClass();
        fVar.c(dai0.z(screen));
        r0s0 r0s0Var = (r0s0) this.shortcutModalViewFactory.get();
        r0s0Var.getClass();
        this.mainModalView = r0s0Var.a(SourcePicker.SHORTCUT_REQUESTED_FROM_HOME, PointType.SOURCE);
    }

    /* renamed from: getAddressOnMapController$impl, reason: from getter */
    public final ru.yandex.taxi.widget.address.b getAddressOnMapController() {
        return this.addressOnMapController;
    }

    @Override // ru.yandex.taxi.preorder.mainscreen.MainScreenView, ru.yandex.taxi.preorder.mainscreen.MainScreen
    public int getBottomContentHeight() {
        y700 y700Var = this.mainModalView;
        if (y700Var != null) {
            return y700Var.contentTop();
        }
        return 0;
    }

    @Override // ru.yandex.taxi.preorder.mainscreen.MainScreenView, ru.yandex.taxi.preorder.mainscreen.MainScreen
    public v3s0 getTransitionCoordinator() {
        return (v3s0) this.transitionCoordinatorLazy.get();
    }

    /* renamed from: isAddressViewVisible$impl, reason: from getter */
    public final boolean getIsAddressViewVisible() {
        return this.isAddressViewVisible;
    }

    public final boolean isExpanded() {
        y700 y700Var = this.mainModalView;
        return y700Var != null && y700Var.isModalViewExpanded();
    }

    public final boolean isProcessing() {
        y700 y700Var = this.mainModalView;
        return y700Var != null && y700Var.isProcessing();
    }

    public final boolean isStickOut() {
        y700 y700Var = this.mainModalView;
        return y700Var != null && y700Var.isStickOut();
    }

    public final void minimizeMainModalView$impl() {
        y700 y700Var = this.mainModalView;
        if (y700Var == null || y700Var.isModalViewExpanded()) {
            return;
        }
        y700Var.setProcessingState(ModalViewProcessing$ProcessingState.MINIMIZED);
    }

    public final boolean modalViewShown() {
        Object obj = this.mainModalView;
        if (obj == null) {
            return false;
        }
        View view = (View) obj;
        return view.getParent() != null && view.getVisibility() == 0;
    }

    @Override // ru.yandex.taxi.preorder.mainscreen.MainScreenView
    public void onAfterInflate() {
    }

    @Override // android.view.ViewGroup, android.view.View
    public void onAttachedToWindow() {
        super.onAttachedToWindow();
        h hVar = this.presenter;
        n2s0 n2s0Var = new n2s0(this);
        hVar.Bg(n2s0Var);
        tje.N(hVar.Jg(), null, null, new ShortcutsMainScreenPresenter$attachView$$inlined$safeCollectIn$1(hVar.C.f(), null, hVar), 3);
        tje.N(hVar.Jg(), null, null, new ShortcutsMainScreenPresenter$attachView$$inlined$safeCollectIn$2(hVar.z.b, null, hVar, n2s0Var), 3);
        tje.N(hVar.Jg(), null, null, new ShortcutsMainScreenPresenter$attachView$$inlined$safeCollectIn$3(new k(ru.yandex.taxi.experiments.d.b(hVar.K.a), new ShortcutsMainScreenPresenter$attachView$3(hVar, null)), null, hVar), 3);
        tje.N(hVar.Jg(), null, null, new ShortcutsMainScreenPresenter$attachView$$inlined$safeCollectIn$4(hVar.H.b, null, n2s0Var), 3);
        tje.N(hVar.Jg(), null, null, new ShortcutsMainScreenPresenter$attachView$$inlined$safeCollectIn$5(hVar.I.b, null, hVar), 3);
        m30 m30Var = hVar.N;
        pzr0 pzr0Var = (pzr0) hVar.E.get();
        m30Var.getClass();
        m30Var.a = new WeakReference(pzr0Var);
        hVar.O = new l30(0, m30Var, pzr0Var);
        this.addressOnMapController.b(new mmp0(18, this));
        ((com.yandex.go.promocodes.referral.impl.ui.b) this.referralGiftParentInteractor).f = new b7p0(26, this);
        this.mainScreenCancellable = this.modalViewCoordinatorProvider.a().g(new ka00(2, this));
    }

    @Override // android.view.ViewGroup, android.view.View
    public void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        this.presenter.Cg();
        this.mainScreenCancellable.cancel();
        this.mainModalViewShowCancellable.cancel();
        this.addressOnMapController.b(null);
        getTransitionCoordinator().J.getClass();
    }

    public final void onSourceAddressSet$impl() {
        ru.yandex.taxi.widget.address.b bVar = this.addressOnMapController;
        h hVar = this.presenter;
        String a = hVar.J.a();
        if (a == null || evu0.J(a)) {
            a = ((avj0) hVar.x).h(kyh0.select_address_from);
        }
        bVar.a.setTitle(a);
        ru.yandex.taxi.widget.address.b bVar2 = this.addressOnMapController;
        String b = this.presenter.J.b();
        if (b == null) {
            b = "";
        }
        bVar2.e = b;
        ru.yandex.taxi.widget.address.b bVar3 = this.addressOnMapController;
        bVar3.d = false;
        bVar3.a.stopSubtitleProgressAnimation();
        if (this.isAddressViewVisible) {
            this.topFade.setVisibility(0);
        }
    }

    @Override // ru.yandex.taxi.preorder.mainscreen.MainScreenView
    public void pause() {
        if (this.mainModalView != null) {
            getTransitionCoordinator().W = this.mainModalView.getProcessingState();
        } else {
            getTransitionCoordinator().W = ModalViewProcessing$ProcessingState.DONE;
        }
        this.presenter.pause();
    }

    public final void removeAutolocateButton$impl() {
        y700 y700Var = this.mainModalView;
        if (y700Var != null) {
            y700Var.removeLocateButton();
        }
    }

    @Override // ru.yandex.taxi.preorder.mainscreen.MainScreenView
    public void resume() {
        this.presenter.resume();
    }

    @Override // ru.yandex.taxi.preorder.mainscreen.MainScreenView
    public void setMode(MainScreen.MainScreenMode mode) {
        this.mode = mode;
        v3s0 transitionCoordinator = getTransitionCoordinator();
        transitionCoordinator.L = mode;
        transitionCoordinator.p6(false, transitionCoordinator.q4());
        if (mode == MainScreen.MainScreenMode.TAXI_FUNCTIONALITY_DISABLED) {
            dismiss();
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final void showAddressesPicker(SourcePicker sourcePicker, PointType pointType) {
        y700 y700Var = this.mainModalView;
        if (y700Var == 0) {
            this.mainModalView = ((r0s0) this.shortcutModalViewFactory.get()).a(sourcePicker, pointType);
        } else {
            cma1.J((View) y700Var);
            y700Var.showEditAddress(pointType);
        }
    }
}
