package com.yandex.plus.home.feature.panel.internal.sections;

import android.content.Context;
import android.view.View;
import com.yandex.fintechsdk.adapters.flex.sdk.impl.divkit.DivkitThemeChangeListener;
import com.yandex.plus.core.strings.PlusSdkBrandType;
import com.yandex.plus.home.common.utils.c;
import com.yandex.plus.home.feature.panel.internal.base.PanelChainLayout;
import com.yandex.plus.home.feature.panel.internal.sections.PlusPanelSectionView;
import com.yandex.plus.home.repository.api.model.panel.Section;
import com.yandex.plus.home.repository.api.model.panel.Shortcut;
import com.yandex.plus.home.repository.api.model.panel.ShortcutAction;
import com.yandex.plus.ui.core.theme.PlusTheme;
import defpackage.ard0;
import defpackage.b5d0;
import defpackage.cb90;
import defpackage.db90;
import defpackage.h8;
import defpackage.hb90;
import defpackage.i3y;
import defpackage.jl40;
import defpackage.jse;
import defpackage.k4o;
import defpackage.m7d0;
import defpackage.n4u0;
import defpackage.ovy0;
import defpackage.q7d0;
import defpackage.rld0;
import defpackage.rol0;
import defpackage.sls;
import defpackage.tls;
import defpackage.tpd0;
import defpackage.tse;
import defpackage.wp81;
import defpackage.ycc;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import kotlin.Metadata;
import kotlin.Pair;
import kotlin.enums.a;
import ru.cprocsp.ACSP.tools.config.ConfigConstants;
import ru.yandex.common.clid.ClidProvider;

@Metadata(d1 = {"\u0000´\u0001\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010$\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010!\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\f\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0016\n\u0002\u0018\u0002\n\u0002\b\f\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\n\b \u0018\u00002\u00020\u0001:\u0001sBc\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\f\u0010\b\u001a\b\u0012\u0004\u0012\u00020\u00070\u0006\u0012\u0006\u0010\n\u001a\u00020\t\u0012\u0006\u0010\f\u001a\u00020\u000b\u0012\b\u0010\u000e\u001a\u0004\u0018\u00010\r\u0012\u0006\u0010\u0010\u001a\u00020\u000f\u0012\u0006\u0010\u0012\u001a\u00020\u0011\u0012\u0012\u0010\u0016\u001a\u000e\u0012\u0004\u0012\u00020\u0014\u0012\u0004\u0012\u00020\u00150\u0013¢\u0006\u0004\b\u0017\u0010\u0018J=\u0010!\u001a\u00020\u00152\u0006\u0010\u001a\u001a\u00020\u00192$\u0010 \u001a \u0012\f\u0012\n\u0012\u0006\b\u0001\u0012\u00020\u001d0\u001c\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u001d0\u001e0\u001bj\u0002`\u001fH\u0002¢\u0006\u0004\b!\u0010\"J9\u0010%\u001a\u00020$* \u0012\f\u0012\n\u0012\u0006\b\u0001\u0012\u00020\u001d0\u001c\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u001d0\u001e0\u001bj\u0002`\u001f2\u0006\u0010#\u001a\u00020\rH\u0002¢\u0006\u0004\b%\u0010&J-\u0010'\u001a \u0012\f\u0012\n\u0012\u0006\b\u0001\u0012\u00020\u001d0\u001c\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u001d0\u001e0\u001bj\u0002`\u001fH\u0002¢\u0006\u0004\b'\u0010(J\u001f\u0010-\u001a\u00020\u00152\u0006\u0010*\u001a\u00020)2\u0006\u0010,\u001a\u00020+H\u0002¢\u0006\u0004\b-\u0010.J\u000f\u0010/\u001a\u00020\u0015H\u0002¢\u0006\u0004\b/\u00100J\u001d\u00101\u001a\u00020\u00152\u0006\u0010*\u001a\u00020)2\u0006\u0010,\u001a\u00020+¢\u0006\u0004\b1\u0010.J\r\u00102\u001a\u00020\u0015¢\u0006\u0004\b2\u00100J\u0015\u00104\u001a\u00020\u00152\u0006\u00103\u001a\u00020\u0007¢\u0006\u0004\b4\u00105JE\u00106\u001a\u00020\u00152\u0006\u0010*\u001a\u00020)2\u0006\u0010,\u001a\u00020+2$\u0010 \u001a \u0012\f\u0012\n\u0012\u0006\b\u0001\u0012\u00020\u001d0\u001c\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u001d0\u001e0\u001bj\u0002`\u001fH$¢\u0006\u0004\b6\u00107J5\u0010<\u001a\u0004\u0018\u00010;2\b\u00109\u001a\u0004\u0018\u0001082\u0014\b\u0004\u0010:\u001a\u000e\u0012\u0004\u0012\u000208\u0012\u0004\u0012\u00020\u00150\u0013H\u0084\bø\u0001\u0000¢\u0006\u0004\b<\u0010=J@\u0010?\u001a\u0004\u0018\u00018\u0000\"\n\b\u0000\u0010>\u0018\u0001*\u00020\u001d* \u0012\f\u0012\n\u0012\u0006\b\u0001\u0012\u00020\u001d0\u001c\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u001d0\u001e0\u001bj\u0002`\u001fH\u0084\b¢\u0006\u0004\b?\u0010@R\u001a\u0010\u0005\u001a\u00020\u00048\u0004X\u0084\u0004¢\u0006\f\n\u0004\b\u0005\u0010A\u001a\u0004\bB\u0010CR \u0010\b\u001a\b\u0012\u0004\u0012\u00020\u00070\u00068\u0004X\u0084\u0004¢\u0006\f\n\u0004\b\b\u0010D\u001a\u0004\bE\u0010FR\u001a\u0010\n\u001a\u00020\t8\u0004X\u0084\u0004¢\u0006\f\n\u0004\b\n\u0010G\u001a\u0004\bH\u0010IR\u001a\u0010\f\u001a\u00020\u000b8\u0004X\u0084\u0004¢\u0006\f\n\u0004\b\f\u0010J\u001a\u0004\bK\u0010LR\u0016\u0010\u000e\u001a\u0004\u0018\u00010\r8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u000e\u0010MR\u001a\u0010\u0010\u001a\u00020\u000f8\u0004X\u0084\u0004¢\u0006\f\n\u0004\b\u0010\u0010N\u001a\u0004\bO\u0010PR \u0010\u0016\u001a\u000e\u0012\u0004\u0012\u00020\u0014\u0012\u0004\u0012\u00020\u00150\u00138\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0016\u0010QR\u0016\u0010S\u001a\u00020R8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\bS\u0010TR\"\u00103\u001a\u00020\u00078\u0004@\u0004X\u0084\u000e¢\u0006\u0012\n\u0004\b3\u0010U\u001a\u0004\bV\u0010W\"\u0004\bX\u00105R\"\u0010Y\u001a\u00020\u00028\u0004@\u0004X\u0084\u000e¢\u0006\u0012\n\u0004\bY\u0010Z\u001a\u0004\b[\u0010\\\"\u0004\b]\u0010^R\u001a\u0010`\u001a\u00020_8\u0004X\u0084\u0004¢\u0006\f\n\u0004\b`\u0010a\u001a\u0004\bb\u0010cR!\u0010h\u001a\b\u0012\u0004\u0012\u00020e0d8DX\u0084\u0084\u0002¢\u0006\f\n\u0004\bf\u0010g\u001a\u0004\bh\u0010iR\u0014\u0010k\u001a\u00020j8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bk\u0010lR\u0011\u0010m\u001a\u00020e8F¢\u0006\u0006\u001a\u0004\bm\u0010nR\u0011\u0010o\u001a\u00020e8F¢\u0006\u0006\u001a\u0004\bo\u0010nR\u0014\u0010r\u001a\u00020\u00198$X¤\u0004¢\u0006\u0006\u001a\u0004\bp\u0010q\u0082\u0002\u0007\n\u0005\b\u009920\u0001¨\u0006t"}, d2 = {"Lcom/yandex/plus/home/feature/panel/internal/sections/PlusPanelSectionView;", "Lcom/yandex/plus/home/feature/panel/internal/base/PanelChainLayout;", "Landroid/content/Context;", "context", "Lb5d0;", "imageLoader", "Ln4u0;", "Lcom/yandex/plus/ui/core/theme/PlusTheme;", "themeStateFlow", "Lovy0;", "themeContextConverter", "Lcom/yandex/plus/core/strings/PlusSdkBrandType;", "brandType", "Lhb90;", "loadingAnimationProvider", "Lard0;", "shortcutViewAwarenessDetector", "Ljse;", "mainDispatcher", "Lkotlin/Function1;", "", "Lzy11;", "onShortcutAnalyticsEvent", "<init>", "(Landroid/content/Context;Lb5d0;Ln4u0;Lovy0;Lcom/yandex/plus/core/strings/PlusSdkBrandType;Lhb90;Lard0;Ljse;Ltls;)V", "Lm7d0;", ConfigConstants.CONFIG, "", "Ljava/lang/Class;", "Landroid/view/View;", "", "Lcom/yandex/plus/home/feature/panel/internal/sections/SectionViews;", "views", "addStubShortcuts", "(Lm7d0;Ljava/util/Map;)V", "animationProvider", "Lcom/yandex/plus/home/feature/panel/internal/sections/PlusPanelStubView;", "extractStubView", "(Ljava/util/Map;Lhb90;)Lcom/yandex/plus/home/feature/panel/internal/sections/PlusPanelStubView;", "getSectionViews", "()Ljava/util/Map;", "Lcb90;", "panel", "Lcom/yandex/plus/home/repository/api/model/panel/Section;", "section", "startPanelAnalytics", "(Lcb90;Lcom/yandex/plus/home/repository/api/model/panel/Section;)V", "resetSection", "()V", "show", "showStub", DivkitThemeChangeListener.THEME_VARIABLE_NAME, "onThemeChanged", "(Lcom/yandex/plus/ui/core/theme/PlusTheme;)V", "addShortcuts", "(Lcb90;Lcom/yandex/plus/home/repository/api/model/panel/Section;Ljava/util/Map;)V", "Lcom/yandex/plus/home/repository/api/model/panel/ShortcutAction;", "action", "block", "Landroid/view/View$OnClickListener;", "getOnClickListener", "(Lcom/yandex/plus/home/repository/api/model/panel/ShortcutAction;Ltls;)Landroid/view/View$OnClickListener;", "T", "popView", "(Ljava/util/Map;)Landroid/view/View;", "Lb5d0;", "getImageLoader", "()Lb5d0;", "Ln4u0;", "getThemeStateFlow", "()Ln4u0;", "Lovy0;", "getThemeContextConverter", "()Lovy0;", "Lcom/yandex/plus/core/strings/PlusSdkBrandType;", "getBrandType", "()Lcom/yandex/plus/core/strings/PlusSdkBrandType;", "Lhb90;", "Lard0;", "getShortcutViewAwarenessDetector", "()Lard0;", "Ltls;", "Lcom/yandex/plus/home/feature/panel/internal/sections/PlusPanelSectionView$State;", ClidProvider.STATE, "Lcom/yandex/plus/home/feature/panel/internal/sections/PlusPanelSectionView$State;", "Lcom/yandex/plus/ui/core/theme/PlusTheme;", "getTheme", "()Lcom/yandex/plus/ui/core/theme/PlusTheme;", "setTheme", "themedContext", "Landroid/content/Context;", "getThemedContext", "()Landroid/content/Context;", "setThemedContext", "(Landroid/content/Context;)V", "Lq7d0;", "themeResolver", "Lq7d0;", "getThemeResolver", "()Lq7d0;", "Lkotlin/Function0;", "", "isNightModeProvider$delegate", "Li3y;", "isNightModeProvider", "()Lsls;", "Ltse;", "mainCoroutineScope", "Ltse;", "isStub", "()Z", "isEmpty", "getStubConfig", "()Lm7d0;", "stubConfig", "State", "plus-home-feature-panel_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
/* loaded from: classes2.dex */
public abstract class PlusPanelSectionView extends PanelChainLayout {
    private final PlusSdkBrandType brandType;
    private final b5d0 imageLoader;

    /* renamed from: isNightModeProvider$delegate, reason: from kotlin metadata */
    private final i3y isNightModeProvider;
    private final hb90 loadingAnimationProvider;
    private final tse mainCoroutineScope;
    private final tls onShortcutAnalyticsEvent;
    private final ard0 shortcutViewAwarenessDetector;
    private State state;
    private PlusTheme theme;
    private final ovy0 themeContextConverter;
    private final q7d0 themeResolver;
    private final n4u0 themeStateFlow;
    private Context themedContext;

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\u0004\b\u0082\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001j\u0002\b\u0002j\u0002\b\u0003j\u0002\b\u0004¨\u0006\u0005"}, d2 = {"Lcom/yandex/plus/home/feature/panel/internal/sections/PlusPanelSectionView$State;", "", "EMPTY", "FULL", "STUB", "plus-home-feature-panel_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final class State {
        private static final /* synthetic */ k4o $ENTRIES;
        private static final /* synthetic */ State[] $VALUES;
        public static final State EMPTY;
        public static final State FULL;
        public static final State STUB;

        static {
            State state = new State("EMPTY", 0);
            EMPTY = state;
            State state2 = new State("FULL", 1);
            FULL = state2;
            State state3 = new State("STUB", 2);
            STUB = state3;
            State[] stateArr = {state, state2, state3};
            $VALUES = stateArr;
            $ENTRIES = a.a(stateArr);
        }

        public static State valueOf(String str) {
            return (State) Enum.valueOf(State.class, str);
        }

        public static State[] values() {
            return (State[]) $VALUES.clone();
        }
    }

    public PlusPanelSectionView(Context context, b5d0 b5d0Var, n4u0 n4u0Var, ovy0 ovy0Var, PlusSdkBrandType plusSdkBrandType, hb90 hb90Var, ard0 ard0Var, jse jseVar, tls tlsVar) {
        super(context, null, 0, 0, 14, null);
        this.imageLoader = b5d0Var;
        this.themeStateFlow = n4u0Var;
        this.themeContextConverter = ovy0Var;
        this.brandType = plusSdkBrandType;
        this.shortcutViewAwarenessDetector = ard0Var;
        this.onShortcutAnalyticsEvent = tlsVar;
        this.state = State.EMPTY;
        this.theme = (PlusTheme) n4u0Var.getValue();
        throw null;
    }

    private final void addStubShortcuts(m7d0 config, Map<Class<? extends View>, ? extends List<View>> views) {
    }

    private final PlusPanelStubView extractStubView(Map<Class<? extends View>, ? extends List<View>> map, hb90 hb90Var) {
        List<View> list = map.get(PlusPanelStubView.class);
        View view = list != null ? (View) ycc.A(list) : null;
        if (!(view instanceof PlusPanelStubView)) {
            view = null;
        }
        PlusPanelStubView plusPanelStubView = (PlusPanelStubView) view;
        if (plusPanelStubView != null) {
            return plusPanelStubView;
        }
        Context context = this.themedContext;
        hb90Var.a();
        return new PlusPanelStubView(context, null);
    }

    private final Map<Class<? extends View>, List<View>> getSectionViews() {
        HashMap hashMap = new HashMap();
        h8 h8Var = new h8(3, this);
        while (h8Var.hasNext()) {
            Object next = h8Var.next();
            Class<?> cls = ((View) next).getClass();
            Object obj = hashMap.get(cls);
            if (obj == null) {
                obj = new ArrayList();
                hashMap.put(cls, obj);
            }
            ((List) obj).add(next);
        }
        return hashMap;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final sls isNightModeProvider_delegate$lambda$1(final PlusPanelSectionView plusPanelSectionView) {
        final int i = 1;
        return new sls(plusPanelSectionView) { // from class: f7d0
            public final /* synthetic */ PlusPanelSectionView b;

            {
                this.b = plusPanelSectionView;
            }

            @Override // defpackage.sls
            public final Object invoke() {
                sls isNightModeProvider_delegate$lambda$1;
                boolean isNightModeProvider_delegate$lambda$1$lambda$0;
                int i2 = i;
                PlusPanelSectionView plusPanelSectionView2 = this.b;
                switch (i2) {
                    case 0:
                        isNightModeProvider_delegate$lambda$1 = PlusPanelSectionView.isNightModeProvider_delegate$lambda$1(plusPanelSectionView2);
                        return isNightModeProvider_delegate$lambda$1;
                    default:
                        isNightModeProvider_delegate$lambda$1$lambda$0 = PlusPanelSectionView.isNightModeProvider_delegate$lambda$1$lambda$0(plusPanelSectionView2);
                        return Boolean.valueOf(isNightModeProvider_delegate$lambda$1$lambda$0);
                }
            }
        };
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final boolean isNightModeProvider_delegate$lambda$1$lambda$0(PlusPanelSectionView plusPanelSectionView) {
        return tpd0.a(plusPanelSectionView.themedContext, plusPanelSectionView.theme);
    }

    private final void resetSection() {
        removeAllViews();
    }

    private final void startPanelAnalytics(final cb90 panel, final Section section) {
        rol0 f;
        PlusPanelSectionView plusPanelSectionView = this;
        List<Shortcut> shortcuts = section.getShortcuts();
        h8 h8Var = new h8(3, plusPanelSectionView);
        Iterator<T> it = shortcuts.iterator();
        while (h8Var.hasNext() && it.hasNext()) {
            Pair pair = new Pair(h8Var.next(), it.next());
            final View view = (View) pair.getFirst();
            final Shortcut shortcut = (Shortcut) pair.getSecond();
            if (view.isAttachedToWindow()) {
                db90 childParams = plusPanelSectionView.getChildParams(view);
                String id = section.getId();
                String name = section.getName();
                String id2 = shortcut.getId();
                String name2 = shortcut.getName();
                if (childParams == null) {
                    i3y i3yVar = db90.e;
                    childParams = wp81.c();
                }
                plusPanelSectionView.onShortcutAnalyticsEvent.invoke(new rld0(null, null, id, name, id2, name2, childParams));
            } else {
                final PlusPanelSectionView plusPanelSectionView2 = plusPanelSectionView;
                View.OnAttachStateChangeListener onAttachStateChangeListener = new View.OnAttachStateChangeListener() { // from class: com.yandex.plus.home.feature.panel.internal.sections.PlusPanelSectionView$startPanelAnalytics$lambda$7$$inlined$doOnAttach$1
                    @Override // android.view.View.OnAttachStateChangeListener
                    public void onViewAttachedToWindow(View view2) {
                        view.removeOnAttachStateChangeListener(this);
                        db90 childParams2 = plusPanelSectionView2.getChildParams(view);
                        Section section2 = section;
                        Shortcut shortcut2 = shortcut;
                        String id3 = section2.getId();
                        String name3 = section2.getName();
                        String id4 = shortcut2.getId();
                        String name4 = shortcut2.getName();
                        if (childParams2 == null) {
                            i3y i3yVar2 = db90.e;
                            childParams2 = wp81.c();
                        }
                        plusPanelSectionView2.onShortcutAnalyticsEvent.invoke(new rld0(null, null, id3, name3, id4, name4, childParams2));
                    }

                    @Override // android.view.View.OnAttachStateChangeListener
                    public void onViewDetachedFromWindow(View view2) {
                    }
                };
                view = view;
                plusPanelSectionView = plusPanelSectionView2;
                shortcut = shortcut;
                view.addOnAttachStateChangeListener(onAttachStateChangeListener);
            }
            f = ((com.yandex.plus.home.feature.panel.internalapi.a) plusPanelSectionView.shortcutViewAwarenessDetector).f(view, false);
            c.c(f, plusPanelSectionView.mainCoroutineScope, new PlusPanelSectionView$startPanelAnalytics$1$2(plusPanelSectionView, view, panel, section, shortcut, null));
            plusPanelSectionView = this;
        }
    }

    public abstract void addShortcuts(cb90 panel, Section section, Map<Class<? extends View>, ? extends List<View>> views);

    public final PlusSdkBrandType getBrandType() {
        return this.brandType;
    }

    public final b5d0 getImageLoader() {
        return this.imageLoader;
    }

    public final View.OnClickListener getOnClickListener(final ShortcutAction action, final tls block) {
        if (action != null) {
            return new View.OnClickListener() { // from class: com.yandex.plus.home.feature.panel.internal.sections.PlusPanelSectionView$getOnClickListener$1$1
                @Override // android.view.View.OnClickListener
                public final void onClick(View view) {
                    tls.this.invoke(action);
                }
            };
        }
        return null;
    }

    public final ard0 getShortcutViewAwarenessDetector() {
        return this.shortcutViewAwarenessDetector;
    }

    public abstract m7d0 getStubConfig();

    public final PlusTheme getTheme() {
        return this.theme;
    }

    public final ovy0 getThemeContextConverter() {
        return this.themeContextConverter;
    }

    public final q7d0 getThemeResolver() {
        return this.themeResolver;
    }

    public final n4u0 getThemeStateFlow() {
        return this.themeStateFlow;
    }

    public final Context getThemedContext() {
        return this.themedContext;
    }

    public final boolean isEmpty() {
        return this.state == State.EMPTY;
    }

    public final sls isNightModeProvider() {
        return (sls) this.isNightModeProvider.getValue();
    }

    public final boolean isStub() {
        return this.state == State.STUB;
    }

    public final void onThemeChanged(PlusTheme theme) {
        this.theme = theme;
        ovy0 ovy0Var = this.themeContextConverter;
        getContext();
        ovy0Var.getClass();
        throw null;
    }

    public final <T extends View> T popView(Map<Class<? extends View>, ? extends List<View>> map) {
        jl40.P();
        throw null;
    }

    public final void setTheme(PlusTheme plusTheme) {
        this.theme = plusTheme;
    }

    public final void setThemedContext(Context context) {
        this.themedContext = context;
    }

    public final void show(cb90 panel, Section section) {
        this.state = State.FULL;
        Map<Class<? extends View>, List<View>> sectionViews = getSectionViews();
        resetSection();
        addShortcuts(panel, section, sectionViews);
        startPanelAnalytics(panel, section);
    }

    public final void showStub() {
        this.state = State.STUB;
        getSectionViews();
        resetSection();
        this.state = State.EMPTY;
    }
}
