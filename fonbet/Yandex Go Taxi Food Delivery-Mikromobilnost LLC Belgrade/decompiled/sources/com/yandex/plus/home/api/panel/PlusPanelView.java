package com.yandex.plus.home.api.panel;

import android.content.Context;
import android.view.ContextThemeWrapper;
import android.view.View;
import androidx.appcompat.widget.LinearLayoutCompat;
import com.yandex.fintechsdk.adapters.flex.sdk.impl.divkit.DivkitThemeChangeListener;
import com.yandex.plus.core.strings.PlusSdkBrandType;
import com.yandex.plus.home.feature.panel.internal.sections.PlusPanelFullDailySectionView;
import com.yandex.plus.home.feature.panel.internal.sections.PlusPanelMiniDailySectionView;
import com.yandex.plus.home.feature.panel.internal.sections.PlusPanelPlusCardSectionView;
import com.yandex.plus.home.feature.panel.internal.sections.PlusPanelSectionView;
import com.yandex.plus.home.repository.api.model.panel.Section;
import com.yandex.plus.log.api.LogPriority;
import com.yandex.plus.ui.core.theme.PlusTheme;
import defpackage.ard0;
import defpackage.b2d0;
import defpackage.b5d0;
import defpackage.c1i0;
import defpackage.cb90;
import defpackage.hb90;
import defpackage.jl40;
import defpackage.jr31;
import defpackage.jse;
import defpackage.n4u0;
import defpackage.nvg0;
import defpackage.oo4;
import defpackage.ovy0;
import defpackage.pgz;
import defpackage.r7d0;
import defpackage.s5r;
import defpackage.s7d0;
import defpackage.tls;
import defpackage.u9h0;
import defpackage.w511;
import defpackage.wbp;
import defpackage.wls;
import defpackage.ycc;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import kotlin.Metadata;
import ru.CryptoPro.JCPRequest.ca20.status.CA20Status;

@Metadata(d1 = {"\u0000Æ\u0001\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010$\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010!\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\b\n\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0010\n\u0002\u0010\b\n\u0002\b\u0005\b\u0007\u0018\u0000 a2\u00020\u0001:\u0001bB·\u0001\b\u0000\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\f\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004\u0012\u0006\u0010\b\u001a\u00020\u0007\u0012\b\u0010\n\u001a\u0004\u0018\u00010\t\u0012\u0006\u0010\f\u001a\u00020\u000b\u0012\u0006\u0010\u000e\u001a\u00020\r\u0012\u0006\u0010\u0010\u001a\u00020\u000f\u0012\u0006\u0010\u0012\u001a\u00020\u0011\u0012\u0006\u0010\u0014\u001a\u00020\u0013\u0012\u0006\u0010\u0016\u001a\u00020\u0015\u0012\u0006\u0010\u0017\u001a\u00020\u0015\u0012\u0006\u0010\u0019\u001a\u00020\u0018\u0012\u0014\u0010\u001d\u001a\u0010\u0012\u0006\u0012\u0004\u0018\u00010\u001b\u0012\u0004\u0012\u00020\u001c0\u001a\u0012\u001a\u0010\u001f\u001a\u0016\u0012\u0006\u0012\u0004\u0018\u00010\u001b\u0012\u0004\u0012\u00020\u0013\u0012\u0004\u0012\u00020\u001c0\u001e\u0012\u0012\u0010!\u001a\u000e\u0012\u0004\u0012\u00020 \u0012\u0004\u0012\u00020\u001c0\u001a¢\u0006\u0004\b\"\u0010#J9\u0010,\u001a\u00020+* \u0012\f\u0012\n\u0012\u0006\b\u0001\u0012\u00020&0%\u0012\n\u0012\b\u0012\u0004\u0012\u00020&0'0$j\u0002`(2\u0006\u0010*\u001a\u00020)H\u0002¢\u0006\u0004\b,\u0010-J\u000f\u0010/\u001a\u00020.H\u0002¢\u0006\u0004\b/\u00100J\u000f\u00102\u001a\u000201H\u0002¢\u0006\u0004\b2\u00103J\u000f\u00105\u001a\u000204H\u0002¢\u0006\u0004\b5\u00106J@\u00108\u001a\u0004\u0018\u00018\u0000\"\n\b\u0000\u00107\u0018\u0001*\u00020&* \u0012\f\u0012\n\u0012\u0006\b\u0001\u0012\u00020&0%\u0012\n\u0012\b\u0012\u0004\u0012\u00020&0'0$j\u0002`(H\u0082\b¢\u0006\u0004\b8\u00109J\u000f\u0010<\u001a\u00020\u001cH\u0000¢\u0006\u0004\b:\u0010;J\u0017\u0010A\u001a\u00020\u001c2\u0006\u0010>\u001a\u00020=H\u0000¢\u0006\u0004\b?\u0010@J\u001f\u0010E\u001a\u00020\u001c2\u0006\u0010>\u001a\u00020=2\u0006\u0010B\u001a\u00020\u0005H\u0000¢\u0006\u0004\bC\u0010DJ\u000f\u0010G\u001a\u00020\u001cH\u0000¢\u0006\u0004\bF\u0010;J\u0017\u0010L\u001a\u00020\u001c2\u0006\u0010I\u001a\u00020HH\u0000¢\u0006\u0004\bJ\u0010KJ\u0017\u0010Q\u001a\u00020\u001c2\u0006\u0010N\u001a\u00020MH\u0000¢\u0006\u0004\bO\u0010PR\u001a\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0006\u0010RR\u0014\u0010\b\u001a\u00020\u00078\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\b\u0010SR\u0016\u0010\n\u001a\u0004\u0018\u00010\t8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\n\u0010TR\u0014\u0010\f\u001a\u00020\u000b8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\f\u0010UR\u0014\u0010\u000e\u001a\u00020\r8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u000e\u0010VR\u0014\u0010\u0010\u001a\u00020\u000f8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0010\u0010WR\u0014\u0010\u0012\u001a\u00020\u00118\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0012\u0010XR\u0014\u0010\u0014\u001a\u00020\u00138\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0014\u0010YR\u0014\u0010\u0016\u001a\u00020\u00158\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0016\u0010ZR\u0014\u0010\u0017\u001a\u00020\u00158\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0017\u0010ZR\u0014\u0010\u0019\u001a\u00020\u00188\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0019\u0010[R\"\u0010\u001d\u001a\u0010\u0012\u0006\u0012\u0004\u0018\u00010\u001b\u0012\u0004\u0012\u00020\u001c0\u001a8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001d\u0010\\R(\u0010\u001f\u001a\u0016\u0012\u0006\u0012\u0004\u0018\u00010\u001b\u0012\u0004\u0012\u00020\u0013\u0012\u0004\u0012\u00020\u001c0\u001e8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001f\u0010]R \u0010!\u001a\u000e\u0012\u0004\u0012\u00020 \u0012\u0004\u0012\u00020\u001c0\u001a8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b!\u0010\\R\u0014\u0010_\u001a\u00020^8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b_\u0010`¨\u0006c"}, d2 = {"Lcom/yandex/plus/home/api/panel/PlusPanelView;", "Landroidx/appcompat/widget/LinearLayoutCompat;", "Landroid/content/Context;", "context", "Ln4u0;", "Lcom/yandex/plus/ui/core/theme/PlusTheme;", "themeStateFlow", "Lovy0;", "themeContextConverter", "Lhb90;", "loadingAnimationProvider", "Lb5d0;", "imageLoader", "Lard0;", "awarenessDetector", "Lcom/yandex/plus/core/strings/PlusSdkBrandType;", "brandType", "Lb2d0;", "dailyViewStat", "", "isDailyWidgetAnimationEnabled", "Ljse;", "mainDispatcher", "ioDispatcher", "Lpgz;", "logger", "Lkotlin/Function1;", "Lcom/yandex/plus/home/repository/api/model/panel/ShortcutAction;", "Lzy11;", "onShortcutClicked", "Lkotlin/Function2;", "onFamilyShortcutClicked", "", "onShortcutAnalyticsEvent", "<init>", "(Landroid/content/Context;Ln4u0;Lovy0;Lhb90;Lb5d0;Lard0;Lcom/yandex/plus/core/strings/PlusSdkBrandType;Lb2d0;ZLjse;Ljse;Lpgz;Ltls;Lwls;Ltls;)V", "", "Ljava/lang/Class;", "Landroid/view/View;", "", "Lcom/yandex/plus/home/api/panel/PanelViews;", "Lcom/yandex/plus/home/repository/api/model/panel/Section$Type;", "sectionType", "Lcom/yandex/plus/home/feature/panel/internal/sections/PlusPanelSectionView;", "extractView", "(Ljava/util/Map;Lcom/yandex/plus/home/repository/api/model/panel/Section$Type;)Lcom/yandex/plus/home/feature/panel/internal/sections/PlusPanelSectionView;", "Lcom/yandex/plus/home/feature/panel/internal/sections/PlusPanelPlusCardSectionView;", "createPlusCardSectionView", "()Lcom/yandex/plus/home/feature/panel/internal/sections/PlusPanelPlusCardSectionView;", "Lcom/yandex/plus/home/feature/panel/internal/sections/PlusPanelFullDailySectionView;", "createFullDailySectionView", "()Lcom/yandex/plus/home/feature/panel/internal/sections/PlusPanelFullDailySectionView;", "Lcom/yandex/plus/home/feature/panel/internal/sections/PlusPanelMiniDailySectionView;", "createMiniDailySectionView", "()Lcom/yandex/plus/home/feature/panel/internal/sections/PlusPanelMiniDailySectionView;", "T", "popView", "(Ljava/util/Map;)Landroid/view/View;", "showNoPanel$plus_home_feature_panel_release", "()V", "showNoPanel", "Lcb90;", "panel", "showPanel$plus_home_feature_panel_release", "(Lcb90;)V", "showPanel", DivkitThemeChangeListener.THEME_VARIABLE_NAME, "updatePanelTheme$plus_home_feature_panel_release", "(Lcb90;Lcom/yandex/plus/ui/core/theme/PlusTheme;)V", "updatePanelTheme", "showPanelStub$plus_home_feature_panel_release", "showPanelStub", "Loo4;", "balanceState", "showBalance$plus_home_feature_panel_release", "(Loo4;)V", "showBalance", "Lwbp;", "familyState", "showFamily$plus_home_feature_panel_release", "(Lwbp;)V", "showFamily", "Ln4u0;", "Lovy0;", "Lhb90;", "Lb5d0;", "Lard0;", "Lcom/yandex/plus/core/strings/PlusSdkBrandType;", "Lb2d0;", "Z", "Ljse;", "Lpgz;", "Ltls;", "Lwls;", "", "gap", CA20Status.STATUS_USER_I, "Companion", "r7d0", "plus-home-feature-panel_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
/* loaded from: classes2.dex */
public final class PlusPanelView extends LinearLayoutCompat {
    private static final r7d0 Companion = new r7d0();
    private static final String TAG = "PlusPanelView";
    private final ard0 awarenessDetector;
    private final PlusSdkBrandType brandType;
    private final b2d0 dailyViewStat;
    private final int gap;
    private final b5d0 imageLoader;
    private final jse ioDispatcher;
    private final boolean isDailyWidgetAnimationEnabled;
    private final hb90 loadingAnimationProvider;
    private final pgz logger;
    private final jse mainDispatcher;
    private final wls onFamilyShortcutClicked;
    private final tls onShortcutAnalyticsEvent;
    private final tls onShortcutClicked;
    private final ovy0 themeContextConverter;
    private final n4u0 themeStateFlow;

    public static final class a implements tls {
        public static final a a = new a();

        @Override // defpackage.tls
        public final Object invoke(Object obj) {
            return Boolean.valueOf(obj instanceof PlusPanelPlusCardSectionView);
        }
    }

    public static final class b implements tls {
        public static final b a = new b();

        @Override // defpackage.tls
        public final Object invoke(Object obj) {
            return Boolean.valueOf(obj instanceof PlusPanelPlusCardSectionView);
        }
    }

    public PlusPanelView(Context context, n4u0 n4u0Var, ovy0 ovy0Var, hb90 hb90Var, b5d0 b5d0Var, ard0 ard0Var, PlusSdkBrandType plusSdkBrandType, b2d0 b2d0Var, boolean z, jse jseVar, jse jseVar2, pgz pgzVar, tls tlsVar, wls wlsVar, tls tlsVar2) {
        super(new ContextThemeWrapper(context, c1i0.PlusSDK_Widget_Panel));
        this.themeStateFlow = n4u0Var;
        this.themeContextConverter = ovy0Var;
        this.imageLoader = b5d0Var;
        this.awarenessDetector = ard0Var;
        this.brandType = plusSdkBrandType;
        this.dailyViewStat = b2d0Var;
        this.isDailyWidgetAnimationEnabled = z;
        this.mainDispatcher = jseVar;
        this.ioDispatcher = jseVar2;
        this.logger = pgzVar;
        this.onShortcutClicked = tlsVar;
        this.onFamilyShortcutClicked = wlsVar;
        this.onShortcutAnalyticsEvent = tlsVar2;
        this.gap = getResources().getDimensionPixelSize(nvg0.plus_sdk_panel_flow_gap);
        setId(u9h0.plus_sdk_plus_panel_view);
        setOrientation(1);
        setImportantForAccessibility(2);
    }

    private final PlusPanelFullDailySectionView createFullDailySectionView() {
        return new PlusPanelFullDailySectionView(getContext(), this.imageLoader, this.brandType, this.themeStateFlow, this.themeContextConverter, this.awarenessDetector, this.dailyViewStat, null, this.isDailyWidgetAnimationEnabled, this.mainDispatcher, this.logger, this.ioDispatcher, this.onShortcutClicked, this.onShortcutAnalyticsEvent);
    }

    private final PlusPanelMiniDailySectionView createMiniDailySectionView() {
        return new PlusPanelMiniDailySectionView(getContext(), this.imageLoader, this.brandType, this.themeStateFlow, this.themeContextConverter, this.awarenessDetector, this.dailyViewStat, null, this.isDailyWidgetAnimationEnabled, this.logger, this.mainDispatcher, this.ioDispatcher, this.onShortcutClicked, this.onShortcutAnalyticsEvent);
    }

    private final PlusPanelPlusCardSectionView createPlusCardSectionView() {
        return new PlusPanelPlusCardSectionView(getContext(), this.imageLoader, this.brandType, this.themeStateFlow, this.themeContextConverter, null, this.awarenessDetector, this.mainDispatcher, this.logger, this.onShortcutClicked, this.onFamilyShortcutClicked, this.onShortcutAnalyticsEvent);
    }

    private final PlusPanelSectionView extractView(Map<Class<? extends View>, ? extends List<View>> map, Section.Type type) {
        int i = s7d0.a[type.ordinal()];
        if (i == 1) {
            List<View> list = map.get(PlusPanelPlusCardSectionView.class);
            View view = list != null ? (View) ycc.A(list) : null;
            PlusPanelPlusCardSectionView plusPanelPlusCardSectionView = (PlusPanelPlusCardSectionView) (view instanceof PlusPanelPlusCardSectionView ? view : null);
            pgz pgzVar = this.logger;
            LogPriority logPriority = LogPriority.DEBUG;
            if (pgzVar.e(logPriority)) {
                pgzVar.a(logPriority, TAG, "popView() " + plusPanelPlusCardSectionView);
            }
            return plusPanelPlusCardSectionView == null ? createPlusCardSectionView() : plusPanelPlusCardSectionView;
        }
        if (i == 2) {
            List<View> list2 = map.get(PlusPanelFullDailySectionView.class);
            View view2 = list2 != null ? (View) ycc.A(list2) : null;
            PlusPanelFullDailySectionView plusPanelFullDailySectionView = (PlusPanelFullDailySectionView) (view2 instanceof PlusPanelFullDailySectionView ? view2 : null);
            pgz pgzVar2 = this.logger;
            LogPriority logPriority2 = LogPriority.DEBUG;
            if (pgzVar2.e(logPriority2)) {
                pgzVar2.a(logPriority2, TAG, "popView() " + plusPanelFullDailySectionView);
            }
            return plusPanelFullDailySectionView == null ? createFullDailySectionView() : plusPanelFullDailySectionView;
        }
        if (i != 3) {
            w511.b();
            return null;
        }
        List<View> list3 = map.get(PlusPanelMiniDailySectionView.class);
        View view3 = list3 != null ? (View) ycc.A(list3) : null;
        PlusPanelMiniDailySectionView plusPanelMiniDailySectionView = (PlusPanelMiniDailySectionView) (view3 instanceof PlusPanelMiniDailySectionView ? view3 : null);
        pgz pgzVar3 = this.logger;
        LogPriority logPriority3 = LogPriority.DEBUG;
        if (pgzVar3.e(logPriority3)) {
            pgzVar3.a(logPriority3, TAG, "popView() " + plusPanelMiniDailySectionView);
        }
        return plusPanelMiniDailySectionView == null ? createMiniDailySectionView() : plusPanelMiniDailySectionView;
    }

    private final <T extends View> T popView(Map<Class<? extends View>, ? extends List<View>> map) {
        jl40.P();
        throw null;
    }

    public final void showBalance$plus_home_feature_panel_release(oo4 balanceState) {
        s5r s5rVar = new s5r(kotlin.sequences.b.g(new jr31(this, 0), a.a));
        while (s5rVar.hasNext()) {
            ((PlusPanelPlusCardSectionView) s5rVar.next()).setBalance(balanceState);
        }
    }

    public final void showFamily$plus_home_feature_panel_release(wbp familyState) {
        s5r s5rVar = new s5r(kotlin.sequences.b.g(new jr31(this, 0), b.a));
        while (s5rVar.hasNext()) {
            ((PlusPanelPlusCardSectionView) s5rVar.next()).handleFamilyState(familyState);
        }
    }

    public final void showNoPanel$plus_home_feature_panel_release() {
        removeAllViews();
    }

    public final void showPanel$plus_home_feature_panel_release(cb90 panel) {
        HashMap hashMap = new HashMap();
        int i = 0;
        while (true) {
            if (!(i < getChildCount())) {
                removeAllViews();
                pgz pgzVar = this.logger;
                LogPriority logPriority = LogPriority.DEBUG;
                if (!pgzVar.e(logPriority)) {
                    throw null;
                }
                pgzVar.a(logPriority, TAG, "showPanel() configId=".concat(null));
                throw null;
            }
            int i2 = i + 1;
            View childAt = getChildAt(i);
            if (childAt == null) {
                throw new IndexOutOfBoundsException();
            }
            Class<?> cls = childAt.getClass();
            Object obj = hashMap.get(cls);
            if (obj == null) {
                obj = new ArrayList();
                hashMap.put(cls, obj);
            }
            ((List) obj).add(childAt);
            i = i2;
        }
    }

    public final void showPanelStub$plus_home_feature_panel_release() {
        removeAllViews();
        PlusPanelPlusCardSectionView createPlusCardSectionView = createPlusCardSectionView();
        addView(createPlusCardSectionView, -1, -2);
        createPlusCardSectionView.showStub();
    }

    public final void updatePanelTheme$plus_home_feature_panel_release(cb90 panel, PlusTheme theme) {
        pgz pgzVar = this.logger;
        LogPriority logPriority = LogPriority.DEBUG;
        if (pgzVar.e(logPriority)) {
            pgzVar.a(logPriority, TAG, "updatePanelTheme() theme=" + theme);
        }
        throw null;
    }
}
