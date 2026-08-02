package com.yandex.div.core;

import android.content.Context;
import android.content.ContextWrapper;
import android.os.Build;
import android.os.SystemClock;
import android.util.AttributeSet;
import android.view.ContextThemeWrapper;
import android.view.LayoutInflater;
import android.view.View;
import com.yandex.div.core.dagger.Div2Component;
import com.yandex.div.core.view2.Div2View;
import com.yandex.urbanads.internal.navigation.UrbanAdsBottomSheetFragment;
import defpackage.a3k;
import defpackage.dkt;
import defpackage.hxk;
import defpackage.i3y;
import defpackage.ibl;
import defpackage.igy0;
import defpackage.iva0;
import defpackage.jxi;
import defpackage.m0i0;
import defpackage.m6o;
import defpackage.oil;
import defpackage.omk;
import defpackage.pey;
import defpackage.rvo;
import defpackage.sls;
import defpackage.suz0;
import defpackage.udq0;
import defpackage.ujk;
import defpackage.v3c;
import defpackage.vt31;
import defpackage.w511;
import defpackage.w53;
import defpackage.wkk;
import defpackage.yt31;
import defpackage.zmk;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.concurrent.atomic.AtomicBoolean;
import kotlin.Metadata;
import kotlin.collections.EmptyList;
import kotlin.jvm.internal.DefaultConstructorMarker;

@Metadata(d1 = {"\u0000¤\u0001\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0007\b\u0016\u0018\u0000 X2\u00020\u0001:\u0002YZB%\b\u0003\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u0006¢\u0006\u0004\b\b\u0010\tB/\b\u0017\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u000b\u001a\u00020\n\u0012\b\b\u0003\u0010\r\u001a\u00020\f\u0012\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u0006¢\u0006\u0004\b\b\u0010\u000eB5\b\u0017\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u000b\u001a\u00020\n\u0012\b\b\u0001\u0010\r\u001a\u00020\f\u0012\u0006\u0010\u000f\u001a\u00020\f\u0012\b\u0010\u0011\u001a\u0004\u0018\u00010\u0010¢\u0006\u0004\b\b\u0010\u0012J\u0011\u0010\u0014\u001a\u0004\u0018\u00010\u0013H\u0012¢\u0006\u0004\b\u0014\u0010\u0015J\u0019\u0010\u0019\u001a\u0004\u0018\u00010\u00182\u0006\u0010\u0017\u001a\u00020\u0016H\u0016¢\u0006\u0004\b\u0019\u0010\u001aJ\u000f\u0010\u001c\u001a\u00020\u001bH\u0016¢\u0006\u0004\b\u001c\u0010\u001dJ)\u0010\"\u001a\u00020\u001b2\b\b\u0003\u0010\u001e\u001a\u00020\f2\u000e\b\u0002\u0010!\u001a\b\u0012\u0004\u0012\u00020 0\u001fH\u0016¢\u0006\u0004\b\"\u0010#J\u000f\u0010%\u001a\u00020$H\u0017¢\u0006\u0004\b%\u0010&J\u0017\u0010'\u001a\u00020\u00002\u0006\u0010\u0003\u001a\u00020\u0002H\u0016¢\u0006\u0004\b'\u0010(J\u0019\u0010'\u001a\u00020\u00002\b\u0010\u0007\u001a\u0004\u0018\u00010\u0006H\u0016¢\u0006\u0004\b'\u0010)J!\u0010'\u001a\u00020\u00002\u0006\u0010\u0003\u001a\u00020\u00022\b\u0010\u0007\u001a\u0004\u0018\u00010\u0006H\u0016¢\u0006\u0004\b'\u0010*J\u001f\u0010/\u001a\u00020.2\u0006\u0010,\u001a\u00020+2\u0006\u0010-\u001a\u00020 H\u0016¢\u0006\u0004\b/\u00100R\u0014\u0010\u0003\u001a\u00020\u00028\u0012X\u0092\u0004¢\u0006\u0006\n\u0004\b\u0003\u00101R\u001a\u0010\u0005\u001a\u00020\u00048\u0010X\u0090\u0004¢\u0006\f\n\u0004\b\u0005\u00102\u001a\u0004\b3\u00104R\u001c\u0010\u0007\u001a\u0004\u0018\u00010\u00068\u0010X\u0090\u0004¢\u0006\f\n\u0004\b\u0007\u00105\u001a\u0004\b6\u00107R!\u0010>\u001a\u0002088VX\u0097\u0084\u0002¢\u0006\u0012\n\u0004\b9\u0010:\u0012\u0004\b=\u0010\u001d\u001a\u0004\b;\u0010<R\u0018\u0010?\u001a\u0004\u0018\u00010\u00138\u0012@\u0012X\u0092\u000e¢\u0006\u0006\n\u0004\b?\u0010@R\u0014\u0010D\u001a\u00020A8VX\u0096\u0004¢\u0006\u0006\u001a\u0004\bB\u0010CR\u0014\u0010H\u001a\u00020E8VX\u0096\u0004¢\u0006\u0006\u001a\u0004\bF\u0010GR\u0014\u0010L\u001a\u00020I8VX\u0096\u0004¢\u0006\u0006\u001a\u0004\bJ\u0010KR$\u0010S\u001a\u00020M2\u0006\u0010N\u001a\u00020M8V@VX\u0096\u000e¢\u0006\f\u001a\u0004\bO\u0010P\"\u0004\bQ\u0010RR\u0014\u0010W\u001a\u00020T8VX\u0096\u0004¢\u0006\u0006\u001a\u0004\bU\u0010V¨\u0006["}, d2 = {"Lcom/yandex/div/core/Div2Context;", "Landroid/content/ContextWrapper;", "Landroid/view/ContextThemeWrapper;", "baseContext", "Lcom/yandex/div/core/dagger/Div2Component;", "div2Component", "Lpey;", "lifecycleOwner", "<init>", "(Landroid/view/ContextThemeWrapper;Lcom/yandex/div/core/dagger/Div2Component;Lpey;)V", "Lujk;", "configuration", "", UrbanAdsBottomSheetFragment.THEME_ID, "(Landroid/view/ContextThemeWrapper;Lujk;ILpey;)V", "mask", "Lkotlin/jvm/internal/DefaultConstructorMarker;", "marker", "(Landroid/view/ContextThemeWrapper;Lujk;IILkotlin/jvm/internal/DefaultConstructorMarker;)V", "Landroid/view/LayoutInflater;", "getLayoutInflater", "()Landroid/view/LayoutInflater;", "", "name", "", "getSystemService", "(Ljava/lang/String;)Ljava/lang/Object;", "Lzy11;", "warmUp", "()V", "flags", "", "Lzmk;", "tags", "reset", "(ILjava/util/List;)V", "", "cancelTooltips", "()Z", "childContext", "(Landroid/view/ContextThemeWrapper;)Lcom/yandex/div/core/Div2Context;", "(Lpey;)Lcom/yandex/div/core/Div2Context;", "(Landroid/view/ContextThemeWrapper;Lpey;)Lcom/yandex/div/core/Div2Context;", "Lomk;", "divData", "tag", "Lrvo;", "getExpressionResolver", "(Lomk;Lzmk;)Lrvo;", "Landroid/view/ContextThemeWrapper;", "Lcom/yandex/div/core/dagger/Div2Component;", "getDiv2Component$div_release", "()Lcom/yandex/div/core/dagger/Div2Component;", "Lpey;", "getLifecycleOwner$div_release", "()Lpey;", "Ldkt;", "globalVariableController$delegate", "Li3y;", "getGlobalVariableController", "()Ldkt;", "getGlobalVariableController$annotations", "globalVariableController", "inflater", "Landroid/view/LayoutInflater;", "Lcom/yandex/div/core/expression/variables/a;", "getDivVariableController", "()Lcom/yandex/div/core/expression/variables/a;", "divVariableController", "Liva0;", "getPerformanceDependentSessionProfiler", "()Liva0;", "performanceDependentSessionProfiler", "Lcom/yandex/div/internal/viewpool/optimization/a;", "getViewPreCreationProfileRepository", "()Lcom/yandex/div/internal/viewpool/optimization/a;", "viewPreCreationProfileRepository", "Lyt31;", "value", "getViewPreCreationProfile", "()Lyt31;", "setViewPreCreationProfile", "(Lyt31;)V", "viewPreCreationProfile", "Loil;", "getTooltipManager", "()Loil;", "tooltipManager", "Companion", "a3k", "Div2InflaterFactory", "div_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
/* loaded from: classes.dex */
public class Div2Context extends ContextWrapper {
    public static final a3k Companion = new a3k();
    private static final int RESET_ALL = 0;
    public static final int RESET_BITMAP_EFFECT_CACHE = 16;
    public static final int RESET_ERROR_COLLECTORS = 2;
    public static final int RESET_EXPRESSION_RUNTIMES = 1;
    public static final int RESET_SELECTED_STATES = 4;
    public static final int RESET_VISIBILITY_COUNTERS = 8;
    private final ContextThemeWrapper baseContext;
    private final Div2Component div2Component;

    /* renamed from: globalVariableController$delegate, reason: from kotlin metadata */
    private final i3y globalVariableController;
    private LayoutInflater inflater;
    private final pey lifecycleOwner;

    /* JADX WARN: Illegal instructions before constructor call */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public Div2Context(ContextThemeWrapper contextThemeWrapper, ujk ujkVar, int i, pey peyVar) {
        this(contextThemeWrapper, r0.build(), peyVar);
        Div2Component.Builder c = hxk.b.m(contextThemeWrapper).a.c();
        c.a(contextThemeWrapper);
        c.b(ujkVar);
        c.d(i);
        v3c.a.getClass();
        c.e(new wkk((Build.VERSION.SDK_INT < 35 ? System.nanoTime() : SystemClock.uptimeNanos()) / 1000));
        c.c(ujkVar.m);
    }

    @jxi
    public static /* synthetic */ void getGlobalVariableController$annotations() {
    }

    private LayoutInflater getLayoutInflater() {
        LayoutInflater layoutInflater;
        LayoutInflater layoutInflater2 = this.inflater;
        if (layoutInflater2 != null) {
            return layoutInflater2;
        }
        synchronized (this) {
            layoutInflater = this.inflater;
            if (layoutInflater == null) {
                layoutInflater = LayoutInflater.from(this.baseContext).cloneInContext(this);
                layoutInflater.setFactory2(new Div2InflaterFactory(this));
                this.inflater = layoutInflater;
            }
        }
        return layoutInflater;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ void reset$default(Div2Context div2Context, int i, List list, int i2, Object obj) {
        if (obj != null) {
            w511.x("Super calls with default arguments not supported in this target, function: reset");
            return;
        }
        if ((i2 & 1) != 0) {
            i = 0;
        }
        if ((i2 & 2) != 0) {
            list = EmptyList.a;
        }
        div2Context.reset(i, list);
    }

    @jxi
    public boolean cancelTooltips() {
        com.yandex.div.core.tooltip.b t = getDiv2Component().t();
        LinkedHashMap linkedHashMap = t.f;
        if (linkedHashMap.isEmpty()) {
            return false;
        }
        Iterator it = kotlin.collections.a.J0(linkedHashMap.values()).iterator();
        while (it.hasNext()) {
            t.c((suz0) it.next());
        }
        linkedHashMap.clear();
        return true;
    }

    public Div2Context childContext(ContextThemeWrapper baseContext) {
        return new Div2Context(baseContext, getDiv2Component(), getLifecycleOwner());
    }

    /* renamed from: getDiv2Component$div_release, reason: from getter */
    public Div2Component getDiv2Component() {
        return this.div2Component;
    }

    public com.yandex.div.core.expression.variables.a getDivVariableController() {
        return getDiv2Component().getDivVariableController();
    }

    public rvo getExpressionResolver(omk divData, zmk tag) {
        return getDiv2Component().c().b(tag, divData, null).l.a;
    }

    public dkt getGlobalVariableController() {
        return (dkt) this.globalVariableController.getValue();
    }

    /* renamed from: getLifecycleOwner$div_release, reason: from getter */
    public pey getLifecycleOwner() {
        return this.lifecycleOwner;
    }

    public iva0 getPerformanceDependentSessionProfiler() {
        return getDiv2Component().p();
    }

    @Override // android.content.ContextWrapper, android.content.Context
    public Object getSystemService(String name) {
        return "layout_inflater".equals(name) ? getLayoutInflater() : this.baseContext.getSystemService(name);
    }

    public oil getTooltipManager() {
        return getDiv2Component().y();
    }

    public yt31 getViewPreCreationProfile() {
        return getDiv2Component().g().d;
    }

    public com.yandex.div.internal.viewpool.optimization.a getViewPreCreationProfileRepository() {
        return getDiv2Component().s();
    }

    public void reset(int flags, List<? extends zmk> tags) {
        if ((flags & 1) != 0) {
            Map map = getDiv2Component().c().c;
            if (tags.isEmpty()) {
                map.clear();
            } else {
                Iterator<T> it = tags.iterator();
                while (it.hasNext()) {
                    map.remove(((zmk) it.next()).a);
                }
            }
        }
        if ((flags & 2) != 0) {
            m6o a = getDiv2Component().a();
            synchronized (a.a) {
                try {
                    if (tags.isEmpty()) {
                        a.a.clear();
                    } else {
                        Iterator<T> it2 = tags.iterator();
                        while (it2.hasNext()) {
                            a.a.remove(((zmk) it2.next()).a);
                        }
                    }
                } catch (Throwable th) {
                    throw th;
                }
            }
        }
        if ((flags & 4) != 0) {
            ibl stateManager = getDiv2Component().getStateManager();
            LinkedHashMap linkedHashMap = stateManager.d;
            igy0 igy0Var = stateManager.b;
            com.yandex.div.state.a aVar = stateManager.a;
            w53 w53Var = stateManager.c;
            if (tags.isEmpty()) {
                w53Var.clear();
                aVar.a.clear();
                aVar.b.clear();
                igy0Var.a.clear();
                linkedHashMap.clear();
            } else {
                for (zmk zmkVar : tags) {
                    w53Var.remove(zmkVar);
                    String str = zmkVar.a;
                    aVar.a(str);
                    synchronized (igy0Var.a) {
                    }
                    linkedHashMap.remove(str);
                }
            }
        }
        if ((flags & 8) != 0) {
            getDiv2Component().e().a(tags);
        }
        if ((flags & 16) != 0) {
            getDiv2Component().m().e();
        }
    }

    public void setViewPreCreationProfile(yt31 yt31Var) {
        com.yandex.div.core.view2.f g = getDiv2Component().g();
        vt31 vt31Var = g.b;
        vt31Var.a(yt31Var.b.a, "DIV2.TEXT_VIEW");
        vt31Var.a(yt31Var.c.a, "DIV2.IMAGE_VIEW");
        vt31Var.a(yt31Var.d.a, "DIV2.IMAGE_GIF_VIEW");
        vt31Var.a(yt31Var.e.a, "DIV2.OVERLAP_CONTAINER_VIEW");
        vt31Var.a(yt31Var.f.a, "DIV2.LINEAR_CONTAINER_VIEW");
        vt31Var.a(yt31Var.g.a, "DIV2.WRAP_CONTAINER_VIEW");
        vt31Var.a(yt31Var.h.a, "DIV2.GRID_VIEW");
        vt31Var.a(yt31Var.i.a, "DIV2.GALLERY_VIEW");
        vt31Var.a(yt31Var.j.a, "DIV2.PAGER_VIEW");
        vt31Var.a(yt31Var.k.a, "DIV2.TAB_VIEW");
        vt31Var.a(yt31Var.l.a, "DIV2.STATE");
        vt31Var.a(yt31Var.m.a, "DIV2.CUSTOM");
        vt31Var.a(yt31Var.n.a, "DIV2.INDICATOR");
        vt31Var.a(yt31Var.o.a, "DIV2.SLIDER");
        vt31Var.a(yt31Var.p.a, "DIV2.INPUT");
        vt31Var.a(yt31Var.q.a, "DIV2.SELECT");
        vt31Var.a(yt31Var.r.a, "DIV2.VIDEO");
        vt31Var.a(yt31Var.s.a, "DIV2.SWITCH");
        g.d = yt31Var;
    }

    public void warmUp() {
        getDiv2Component().v();
    }

    public Div2Context childContext(pey lifecycleOwner) {
        return new Div2Context(this.baseContext, getDiv2Component(), lifecycleOwner);
    }

    public Div2Context childContext(ContextThemeWrapper baseContext, pey lifecycleOwner) {
        return new Div2Context(baseContext, getDiv2Component(), lifecycleOwner);
    }

    @Metadata(d1 = {"\u00004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\b\b\u0002\u0018\u0000 \u00162\u00020\u0001:\u0001\u0017B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0017\u0010\t\u001a\u00020\b2\u0006\u0010\u0007\u001a\u00020\u0006H\u0002¢\u0006\u0004\b\t\u0010\nJ3\u0010\u0012\u001a\u0004\u0018\u00010\u000b2\b\u0010\f\u001a\u0004\u0018\u00010\u000b2\u0006\u0010\r\u001a\u00020\u00062\u0006\u0010\u000f\u001a\u00020\u000e2\u0006\u0010\u0011\u001a\u00020\u0010H\u0016¢\u0006\u0004\b\u0012\u0010\u0013J)\u0010\u0012\u001a\u0004\u0018\u00010\u000b2\u0006\u0010\r\u001a\u00020\u00062\u0006\u0010\u000f\u001a\u00020\u000e2\u0006\u0010\u0011\u001a\u00020\u0010H\u0016¢\u0006\u0004\b\u0012\u0010\u0014R\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0003\u0010\u0015¨\u0006\u0018"}, d2 = {"Lcom/yandex/div/core/Div2Context$Div2InflaterFactory;", "Landroid/view/LayoutInflater$Factory2;", "Lcom/yandex/div/core/Div2Context;", "div2Context", "<init>", "(Lcom/yandex/div/core/Div2Context;)V", "", "viewClassName", "", "isDiv2View", "(Ljava/lang/String;)Z", "Landroid/view/View;", "parent", "name", "Landroid/content/Context;", "context", "Landroid/util/AttributeSet;", "attrs", "onCreateView", "(Landroid/view/View;Ljava/lang/String;Landroid/content/Context;Landroid/util/AttributeSet;)Landroid/view/View;", "(Ljava/lang/String;Landroid/content/Context;Landroid/util/AttributeSet;)Landroid/view/View;", "Lcom/yandex/div/core/Div2Context;", "Companion", "com/yandex/div/core/b", "div_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
    /* loaded from: classes11.dex */
    public static final class Div2InflaterFactory implements LayoutInflater.Factory2 {
        public static final b Companion = new b();
        private static final String DIV_VIEW_CLASS_NAME = "com.yandex.div.core.view2.Div2View";
        private static final String DIV_VIEW_SIMPLE_CLASS_NAME = "Div2View";
        private final Div2Context div2Context;

        public Div2InflaterFactory(Div2Context div2Context) {
            this.div2Context = div2Context;
        }

        private final boolean isDiv2View(String viewClassName) {
            return DIV_VIEW_CLASS_NAME.equals(viewClassName) || DIV_VIEW_SIMPLE_CLASS_NAME.equals(viewClassName);
        }

        @Override // android.view.LayoutInflater.Factory
        public View onCreateView(String name, Context context, AttributeSet attrs) {
            if (!isDiv2View(name)) {
                return null;
            }
            return new Div2View(this.div2Context, attrs, 0, 4, null);
        }

        @Override // android.view.LayoutInflater.Factory2
        public View onCreateView(View parent, String name, Context context, AttributeSet attrs) {
            return onCreateView(name, context, attrs);
        }
    }

    public Div2Context(ContextThemeWrapper contextThemeWrapper, ujk ujkVar, int i) {
        this(contextThemeWrapper, ujkVar, i, null, 8, null);
    }

    public /* synthetic */ Div2Context(ContextThemeWrapper contextThemeWrapper, Div2Component div2Component, pey peyVar, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this(contextThemeWrapper, div2Component, (i & 4) != 0 ? null : peyVar);
    }

    private Div2Context(ContextThemeWrapper contextThemeWrapper, Div2Component div2Component, pey peyVar) {
        super(contextThemeWrapper);
        this.baseContext = contextThemeWrapper;
        this.div2Component = div2Component;
        this.lifecycleOwner = peyVar;
        this.globalVariableController = kotlin.a.a(new sls() { // from class: com.yandex.div.core.Div2Context$globalVariableController$2
            {
                super(0);
            }

            @Override // defpackage.sls
            public final Object invoke() {
                Div2Context.this.getDiv2Component().getClass();
                return new dkt(0);
            }
        });
        wkk f = getDiv2Component().f();
        if (f.a >= 0) {
            return;
        }
        AtomicBoolean atomicBoolean = wkk.e;
        f.a = udq0.t();
    }

    public /* synthetic */ Div2Context(ContextThemeWrapper contextThemeWrapper, ujk ujkVar, int i, pey peyVar, int i2, DefaultConstructorMarker defaultConstructorMarker) {
        this(contextThemeWrapper, ujkVar, (i2 & 4) != 0 ? m0i0.Div_Theme : i, (i2 & 8) != 0 ? null : peyVar);
    }

    public Div2Context(ContextThemeWrapper contextThemeWrapper, ujk ujkVar) {
        this(contextThemeWrapper, ujkVar, 0, null, 12, null);
    }

    @jxi
    public Div2Context(ContextThemeWrapper contextThemeWrapper, ujk ujkVar, int i, int i2, DefaultConstructorMarker defaultConstructorMarker) {
        this(contextThemeWrapper, ujkVar, i, null);
    }
}
