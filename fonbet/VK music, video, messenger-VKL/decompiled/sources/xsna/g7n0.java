package xsna;

import androidx.recyclerview.widget.RecyclerView;
import com.vk.core.ui.tracking.UiTracker;
import com.vk.log.L;
import com.vk.log.LoggerOutputTarget;
import com.vk.stat.scheme.CommonStat$TypeTrackCodeItem;
import com.vk.stat.scheme.MobileOfficialAppsCoreNavStat$EventScreen;
import com.vk.stat.scheme.MobileOfficialAppsMiniappsStat$TypeGameAppView;
import com.vk.stat.scheme.SchemeStat$EventItem;
import com.vk.stat.scheme.SchemeStat$SuperappItem;
import com.vk.stat.scheme.SchemeStat$SuperappMenuItem;
import com.vk.stat.scheme.SchemeStat$TypeClick;
import com.vk.stat.scheme.SchemeStat$TypeSuperappScreenItem;
import com.vk.stat.scheme.SchemeStat$TypeSuperappWidgetItem;
import com.vk.stat.scheme.SchemeStat$TypeView;
import com.vk.superapp.SuperAppFeatures;
import com.vk.superapp.api.dto.menu.WidgetSettings;
import com.vk.superapp.api.dto.widgets.actions.WebAction;
import com.vk.superapp.api.dto.widgets.actions.WebActionOpenVkApp;
import com.vk.superapp.dto.WidgetsLoadingState;
import com.vk.superapp.ui.widgets.SuperAppShowcaseExpandableServiceMenu;
import com.vk.superapp.ui.widgets.SuperAppShowcaseScrollWidget;
import com.vk.superapp.ui.widgets.SuperAppWidget;
import com.vk.superapp.ui.widgets.menu.ExpandableMenuState;
import com.vk.superapp.ui.widgets.miniwidgets.MiniWidgetItem;
import com.vk.superapp.ui.widgets.tile.SuperAppWidgetTile;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Map;
import java.util.Objects;
import kotlin.Pair;
import xsna.hzp0;
import xsna.jc3;
import xsna.udn0;

/* compiled from: SuperAppAnalyticsImpl.kt */
/* loaded from: classes6.dex */
public final class g7n0 {
    public rcn0 a;
    public b b;
    public jc3 c;
    public ArrayList d;
    public final int e = com.vk.toggle.d.b();

    /* compiled from: SuperAppAnalyticsImpl.kt */
    public static final class a {
        public static final SchemeStat$EventItem a(f9n0 f9n0Var) {
            return new SchemeStat$EventItem(SchemeStat$EventItem.Type.SUPERAPP_WIDGET, null, null, null, f9n0Var != null ? f9n0Var.d() : null, null, 46, null);
        }

        public static final SchemeStat$TypeSuperappWidgetItem.Id b(f9n0 f9n0Var) {
            if (f9n0Var instanceof fan0) {
                return SchemeStat$TypeSuperappWidgetItem.Id.MINI_WIDGETS;
            }
            if (f9n0Var instanceof men0) {
                return SchemeStat$TypeSuperappWidgetItem.Id.TILE;
            }
            if (f9n0Var instanceof qdn0) {
                return SchemeStat$TypeSuperappWidgetItem.Id.PROMO;
            }
            if (f9n0Var instanceof ldn0) {
                return SchemeStat$TypeSuperappWidgetItem.Id.UNIVERSAL_FULL_WIDTH;
            }
            if (f9n0Var instanceof vdn0) {
                return SchemeStat$TypeSuperappWidgetItem.Id.SCROLL;
            }
            if (f9n0Var instanceof lan0) {
                return SchemeStat$TypeSuperappWidgetItem.Id.ONBOARDING_PANEL;
            }
            if (f9n0Var instanceof xdn0) {
                return SchemeStat$TypeSuperappWidgetItem.Id.SECTION_POSTER;
            }
            if (f9n0Var instanceof den0) {
                return SchemeStat$TypeSuperappWidgetItem.Id.SECTION_SCROLL;
            }
            if (f9n0Var instanceof ien0) {
                return SchemeStat$TypeSuperappWidgetItem.Id.SUBSCRIBE_TILE;
            }
            if (f9n0Var instanceof tdn0) {
                return SchemeStat$TypeSuperappWidgetItem.Id.HALF_TILE;
            }
            if (f9n0Var instanceof gen0) {
                return SchemeStat$TypeSuperappWidgetItem.Id.HALF_TILE;
            }
            if (f9n0Var instanceof ndn0) {
                return SchemeStat$TypeSuperappWidgetItem.Id.HALF_TILE;
            }
            if (f9n0Var instanceof wcn0) {
                return SchemeStat$TypeSuperappWidgetItem.Id.MARKET_TILE;
            }
            if (f9n0Var instanceof ycn0) {
                return SchemeStat$TypeSuperappWidgetItem.Id.ACTION_TILE;
            }
            return null;
        }
    }

    /* compiled from: SuperAppAnalyticsImpl.kt */
    public static final class b implements wbn0 {
        public final RecyclerView a;
        public final int b;
        public SchemeStat$TypeSuperappScreenItem.Action c;
        public Integer d;
        public Integer e;
        public z8n0 f;
        public WidgetsLoadingState g;
        public boolean h;
        public boolean j;
        public ExpandableMenuState k;
        public String l;
        public SchemeStat$TypeSuperappScreenItem m;
        public final ArrayList<z8n0> i = new ArrayList<>();
        public final ArrayList n = new ArrayList();

        /* compiled from: SuperAppAnalyticsImpl.kt */
        public static final /* synthetic */ class a {
            public static final /* synthetic */ int[] $EnumSwitchMapping$0;

            static {
                int[] iArr = new int[WidgetsLoadingState.values().length];
                try {
                    iArr[WidgetsLoadingState.SKELETON.ordinal()] = 1;
                } catch (NoSuchFieldError unused) {
                }
                try {
                    iArr[WidgetsLoadingState.CACHE.ordinal()] = 2;
                } catch (NoSuchFieldError unused2) {
                }
                try {
                    iArr[WidgetsLoadingState.NETWORK.ordinal()] = 3;
                } catch (NoSuchFieldError unused3) {
                }
                $EnumSwitchMapping$0 = iArr;
            }
        }

        public b(RecyclerView recyclerView, int i) {
            this.a = recyclerView;
            this.b = i;
        }

        @Override // xsna.wbn0
        public final void a(z8n0 z8n0Var, Integer num, Integer num2) {
            f(z8n0Var, num, num2, null);
            SchemeStat$TypeClick b = SchemeStat$TypeClick.a.b(a.a(z8n0Var instanceof f9n0 ? (f9n0) z8n0Var : null), this.m, 2);
            UiTracker uiTracker = UiTracker.a;
            MobileOfficialAppsCoreNavStat$EventScreen c = UiTracker.c();
            uzp0 uzp0Var = UiTracker.h;
            uzp0Var.getClass();
            new bjc(c, b, uzp0Var.a).q();
        }

        public final SchemeStat$EventItem c() {
            SchemeStat$EventItem schemeStat$EventItem;
            SchemeStat$EventItem schemeStat$EventItem2;
            if (this.j) {
                schemeStat$EventItem = a.a(null);
            } else {
                ExpandableMenuState expandableMenuState = this.k;
                if (expandableMenuState == ExpandableMenuState.EXPANDED) {
                    schemeStat$EventItem2 = new SchemeStat$EventItem(SchemeStat$EventItem.Type.SUPERAPP_MENU, null, null, null, null, null, 62, null);
                } else if (expandableMenuState == ExpandableMenuState.COLLAPSED) {
                    schemeStat$EventItem2 = new SchemeStat$EventItem(SchemeStat$EventItem.Type.SUPERAPP_MENU_COLLAPSED, null, null, null, null, null, 62, null);
                } else {
                    schemeStat$EventItem = null;
                }
                schemeStat$EventItem = schemeStat$EventItem2;
            }
            this.j = false;
            this.k = null;
            return schemeStat$EventItem;
        }

        public final ArrayList d() {
            SchemeStat$TypeSuperappScreenItem schemeStat$TypeSuperappScreenItem = this.m;
            if (schemeStat$TypeSuperappScreenItem == null) {
                schemeStat$TypeSuperappScreenItem = e();
            }
            ArrayList o = e43.o(schemeStat$TypeSuperappScreenItem);
            ArrayList arrayList = this.n;
            o.addAll(arrayList);
            this.h = this.g != WidgetsLoadingState.NETWORK;
            this.m = null;
            this.c = null;
            this.d = null;
            this.e = null;
            this.f = null;
            arrayList.clear();
            return o;
        }

        /* JADX WARN: Multi-variable type inference failed */
        public final SchemeStat$TypeSuperappScreenItem e() {
            SchemeStat$TypeSuperappScreenItem.LoadingType loadingType;
            Integer num;
            SuperAppShowcaseExpandableServiceMenu.Payload.MenuItem menuItem;
            WidgetSettings e;
            int i = 0;
            ArrayList<z8n0> arrayList = this.i;
            int e2 = on00.e(c5g.u(arrayList, 10));
            if (e2 < 16) {
                e2 = 16;
            }
            LinkedHashMap linkedHashMap = new LinkedHashMap(e2);
            Iterator<z8n0> it = arrayList.iterator();
            while (true) {
                loadingType = null;
                if (!it.hasNext()) {
                    break;
                }
                linkedHashMap.put(it.next(), null);
            }
            LinkedHashMap linkedHashMap2 = new LinkedHashMap(linkedHashMap);
            bh5 bh5Var = new bh5(linkedHashMap2, 14);
            int i2 = this.b;
            RecyclerView recyclerView = this.a;
            bkj0.a(recyclerView, bh5Var, arrayList, i2, recyclerView, 0);
            ArrayList arrayList2 = new ArrayList();
            ArrayList arrayList3 = new ArrayList();
            ArrayList arrayList4 = new ArrayList();
            ArrayList arrayList5 = new ArrayList();
            Integer num2 = null;
            for (Map.Entry entry : linkedHashMap2.entrySet()) {
                z8n0 z8n0Var = (z8n0) entry.getKey();
                Integer num3 = (Integer) entry.getValue();
                if (!(z8n0Var instanceof d9n0)) {
                    if (z8n0Var instanceof fan0) {
                        Iterator it2 = ((fan0) z8n0Var).e.p.iterator();
                        while (it2.hasNext()) {
                            arrayList5.add(((MiniWidgetItem) it2.next()).g());
                        }
                        if (epx.f(z8n0Var, this.f)) {
                            num2 = this.d;
                            this.d = null;
                        }
                    } else if (z8n0Var instanceof den0) {
                        if (epx.f(z8n0Var, this.f)) {
                            num2 = Integer.valueOf(arrayList4.size());
                        } else {
                            List<SuperAppWidget> list = ((den0) z8n0Var).e.o.f;
                            if (list != null) {
                                List<SuperAppWidget> list2 = list;
                                z8n0 z8n0Var2 = this.f;
                                f9n0 f9n0Var = z8n0Var2 instanceof f9n0 ? (f9n0) z8n0Var2 : null;
                                if (j5g.P(list2, f9n0Var != null ? f9n0Var.c() : null)) {
                                    num2 = Integer.valueOf(arrayList4.size());
                                }
                            }
                        }
                        den0 den0Var = (den0) z8n0Var;
                        SchemeStat$SuperappItem schemeStat$SuperappItem = new SchemeStat$SuperappItem(den0Var.c, null, null, num3, null, 22, null);
                        SchemeStat$TypeSuperappWidgetItem.Id b = a.b((f9n0) z8n0Var);
                        if (b != null) {
                            arrayList4.add(new SchemeStat$TypeSuperappWidgetItem(b, den0Var.f(), schemeStat$SuperappItem, null, 8, null));
                        }
                    } else if (z8n0Var instanceof f9n0) {
                        f9n0 f9n0Var2 = (f9n0) z8n0Var;
                        SuperAppWidget c = f9n0Var2.c();
                        if (((c == null || (e = c.e()) == null) ? i : e.d) == 0) {
                            if (epx.f(z8n0Var, this.f) && f9n0Var2.g()) {
                                num2 = Integer.valueOf(arrayList4.size());
                            }
                            SchemeStat$SuperappItem schemeStat$SuperappItem2 = new SchemeStat$SuperappItem(f9n0Var2.d(), null, null, num3, null, 22, null);
                            SchemeStat$TypeSuperappWidgetItem.Id b2 = a.b(f9n0Var2);
                            if (b2 != null) {
                                SchemeStat$TypeSuperappWidgetItem schemeStat$TypeSuperappWidgetItem = new SchemeStat$TypeSuperappWidgetItem(b2, f9n0Var2.f(), schemeStat$SuperappItem2, null, 8, null);
                                if (f9n0Var2.g()) {
                                    arrayList4.add(schemeStat$TypeSuperappWidgetItem);
                                }
                            }
                        }
                    } else if (z8n0Var instanceof obn0) {
                        if (epx.f(z8n0Var, this.f)) {
                            num2 = Integer.valueOf(arrayList2.size());
                        }
                        obn0 obn0Var = (obn0) z8n0Var;
                        arrayList2.add(new SchemeStat$SuperappMenuItem(vsk0.a(obn0Var.c().c), obn0Var.c().d, new SchemeStat$SuperappItem(obn0Var.c().e, obn0Var.c().d, null, Integer.valueOf(num3 != null ? num3.intValue() : i), null, 20, null)));
                    } else if (z8n0Var instanceof c8n0) {
                        int i3 = i;
                        for (Object obj : ((c8n0) z8n0Var).c) {
                            int i4 = i3 + 1;
                            if (i3 < 0) {
                                e43.t();
                                throw null;
                            }
                            SuperAppShowcaseExpandableServiceMenu.Payload.MenuItem menuItem2 = (SuperAppShowcaseExpandableServiceMenu.Payload.MenuItem) obj;
                            String str = menuItem2.c;
                            String str2 = menuItem2.c;
                            z8n0 z8n0Var3 = this.f;
                            j8q j8qVar = z8n0Var3 instanceof j8q ? (j8q) z8n0Var3 : null;
                            if (str.equals((j8qVar == null || (menuItem = j8qVar.b) == null) ? null : menuItem.c)) {
                                num2 = Integer.valueOf(i3);
                            }
                            SchemeStat$SuperappItem schemeStat$SuperappItem3 = new SchemeStat$SuperappItem(menuItem2.e, str2, null, Integer.valueOf(num3 != null ? num3.intValue() : 0), null, 20, null);
                            String str3 = menuItem2.b == SuperAppShowcaseExpandableServiceMenu.Payload.ExpandableMenuItemType.MORE_ITEM ? "more" : menuItem2.d;
                            if (str3 == null) {
                                str3 = "";
                            }
                            arrayList2.add(new SchemeStat$SuperappMenuItem(vsk0.a(str3), str2, schemeStat$SuperappItem3));
                            i3 = i4;
                        }
                    } else {
                        continue;
                    }
                }
                i = 0;
            }
            SchemeStat$TypeSuperappScreenItem.Action action = this.c;
            if (action == SchemeStat$TypeSuperappScreenItem.Action.NAVBAR) {
                this.d = 0;
                num = 0;
            } else {
                num = num2;
            }
            Integer num4 = this.d;
            Integer num5 = this.e;
            int intValue = num5 != null ? num5.intValue() : -1;
            String a2 = q7n0.a().getCache().a(SuperAppFeatures.RequestName.GET_SHOWCASE);
            boolean i5 = r6m.i();
            WidgetsLoadingState widgetsLoadingState = this.g;
            int i6 = widgetsLoadingState != null ? a.$EnumSwitchMapping$0[widgetsLoadingState.ordinal()] : -1;
            if (i6 == 1) {
                loadingType = SchemeStat$TypeSuperappScreenItem.LoadingType.SKELETON;
            } else if (i6 == 2) {
                loadingType = SchemeStat$TypeSuperappScreenItem.LoadingType.CACHE;
            } else if (i6 == 3) {
                loadingType = SchemeStat$TypeSuperappScreenItem.LoadingType.DEFAULT;
            }
            return new SchemeStat$TypeSuperappScreenItem(arrayList2, null, null, arrayList3, null, arrayList4, null, null, arrayList5, null, null, action, num, Integer.valueOf(intValue), num4, null, a2, Boolean.FALSE, null, Boolean.valueOf(i5), loadingType, this.l, 296662, null);
        }

        public final void f(z8n0 z8n0Var, Integer num, Integer num2, ExpandableMenuState expandableMenuState) {
            SchemeStat$TypeSuperappScreenItem.Action action;
            if (z8n0Var instanceof fan0) {
                this.j = true;
                action = SchemeStat$TypeSuperappScreenItem.Action.MINI_WIDGET;
            } else if (z8n0Var instanceof f9n0) {
                this.j = true;
                action = SchemeStat$TypeSuperappScreenItem.Action.WIDGET;
            } else if (z8n0Var instanceof a9n0) {
                action = SchemeStat$TypeSuperappScreenItem.Action.MENU;
            } else if (z8n0Var instanceof kbn0) {
                this.k = expandableMenuState;
                action = SchemeStat$TypeSuperappScreenItem.Action.MENU;
            } else {
                com.vk.metrics.eventtracking.b.a.q(new IllegalArgumentException("Unknown type " + z8n0Var));
                action = null;
            }
            this.c = action;
            this.d = num;
            this.e = num2;
            this.f = z8n0Var;
            this.m = e();
        }

        public final void g() {
            this.c = SchemeStat$TypeSuperappScreenItem.Action.NAVBAR;
            this.j = false;
            this.k = null;
            this.d = 0;
            this.e = null;
            this.f = null;
            this.m = e();
        }

        public final void h(ArrayList arrayList, WidgetsLoadingState widgetsLoadingState) {
            ArrayList<z8n0> arrayList2 = this.i;
            arrayList2.clear();
            ArrayList arrayList3 = new ArrayList();
            Iterator it = arrayList.iterator();
            while (it.hasNext()) {
                z8n0 z8n0Var = (z8n0) it.next();
                g5g.y(z8n0Var instanceof g9n0 ? ((g9n0) z8n0Var).d() : Collections.singletonList(z8n0Var), arrayList3);
            }
            arrayList2.addAll(arrayList3);
            if (widgetsLoadingState != null) {
                this.g = widgetsLoadingState;
            }
        }
    }

    /* compiled from: SuperAppAnalyticsImpl.kt */
    public static final class c extends d680<Object> {
        public final bbb0 b;

        public c(bbb0 bbb0Var) {
            this.b = bbb0Var;
        }

        @Override // xsna.d680
        public final List j(Object obj) {
            Integer num;
            Integer num2;
            if (!(obj instanceof f9n0)) {
                return null;
            }
            ArrayList arrayList = new ArrayList(1);
            ArrayList arrayList2 = ((g7n0) this.b.c).d;
            if (arrayList2 != null) {
                ArrayList arrayList3 = new ArrayList();
                for (Object obj2 : arrayList2) {
                    z8n0 z8n0Var = (z8n0) obj2;
                    if ((z8n0Var instanceof f9n0) && !(z8n0Var instanceof d9n0) && !(z8n0Var instanceof fan0)) {
                        arrayList3.add(obj2);
                    }
                }
                num = Integer.valueOf(arrayList3.indexOf(obj));
            } else {
                num = null;
            }
            if (num != null && num.intValue() == -1) {
                L l = L.a;
                l.getClass();
                if (!L.m(LoggerOutputTarget.NONE)) {
                    L.u(l, L.LogType.d, new Object[]{cqi.c(obj, "Failed to find widget number for type_view: widget=")});
                }
                num2 = null;
            } else {
                num2 = num;
            }
            f9n0 f9n0Var = (f9n0) obj;
            SchemeStat$SuperappItem schemeStat$SuperappItem = new SchemeStat$SuperappItem(f9n0Var.d(), null, num2, 100, null, 18, null);
            SchemeStat$EventItem a = a.a(f9n0Var);
            SchemeStat$TypeSuperappWidgetItem.Id b = a.b(f9n0Var);
            SchemeStat$TypeSuperappWidgetItem schemeStat$TypeSuperappWidgetItem = b != null ? new SchemeStat$TypeSuperappWidgetItem(b, f9n0Var.f(), schemeStat$SuperappItem, null, 8, null) : null;
            hzp0.m0 m0Var = new hzp0.m0(a);
            m0Var.g = schemeStat$TypeSuperappWidgetItem;
            arrayList.add(m0Var);
            return arrayList;
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:17:0x0034, code lost:
    
        if (xsna.epx.f(r3.j, com.vk.api.generated.exploreWidgets.dto.ExploreWidgetsBaseActionTypeDto.OPEN_GAME.i()) != false) goto L35;
     */
    /* JADX WARN: Code restructure failed: missing block: B:38:0x0061, code lost:
    
        if (xsna.epx.f(r3.j, com.vk.api.generated.exploreWidgets.dto.ExploreWidgetsBaseActionTypeDto.OPEN_GAME.i()) != false) goto L35;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static Pair f(RecyclerView.e0 e0Var) {
        WebActionOpenVkApp webActionOpenVkApp;
        SuperAppWidgetTile c2;
        SuperAppWidgetTile.Payload payload;
        SuperAppShowcaseScrollWidget.Payload.ScrollItem scrollItem;
        if ((e0Var instanceof jcn0) || (e0Var instanceof kcn0) || (e0Var instanceof hcn0)) {
            men0 men0Var = (men0) ((fcn0) e0Var).o;
            WebAction webAction = (men0Var == null || (c2 = men0Var.c()) == null || (payload = c2.o) == null) ? null : payload.e;
            if (webAction instanceof WebActionOpenVkApp) {
                webActionOpenVkApp = (WebActionOpenVkApp) webAction;
            }
            webActionOpenVkApp = null;
        } else {
            if (e0Var instanceof udn0.a) {
                udn0.b bVar = (udn0.b) ((udn0.a) e0Var).o;
                WebAction webAction2 = (bVar == null || (scrollItem = bVar.a) == null) ? null : scrollItem.e;
                if (webAction2 instanceof WebActionOpenVkApp) {
                    webActionOpenVkApp = (WebActionOpenVkApp) webAction2;
                }
            }
            webActionOpenVkApp = null;
        }
        if (webActionOpenVkApp == null) {
            return null;
        }
        String str = webActionOpenVkApp.g;
        if (str == null) {
            str = "";
        }
        return new Pair(str, Integer.valueOf((int) webActionOpenVkApp.d));
    }

    public static void h(String str) {
        q7n0.a().b().a(str);
    }

    public final void a() {
        rcn0 rcn0Var = this.a;
        if (rcn0Var != null) {
            rcn0Var.a();
            s3q0 s3q0Var = s3q0.a;
        }
    }

    public final void b() {
        jc3 jc3Var = this.c;
        if (jc3Var != null) {
            RecyclerView recyclerView = jc3Var.a;
            jc3.c cVar = jc3Var.i;
            recyclerView.removeOnScrollListener(cVar);
            LinkedHashSet linkedHashSet = jc3Var.j;
            Iterator it = linkedHashSet.iterator();
            while (it.hasNext()) {
                ((RecyclerView) it.next()).removeOnScrollListener(cVar);
            }
            linkedHashSet.clear();
            jc3Var.d.clear();
            jc3Var.e.clear();
        }
        this.c = null;
    }

    public final void c() {
        rcn0 rcn0Var = this.a;
        if (rcn0Var != null) {
            rcn0Var.b();
            s3q0 s3q0Var = s3q0.a;
        }
    }

    public final b d() {
        return this.b;
    }

    public final void e(RecyclerView recyclerView, int i) {
        this.b = new b(recyclerView, i);
        c cVar = new c(new bbb0(this, 26));
        this.a = new rcn0(recyclerView, cVar, true, new oac(cVar, 16), new qcn0(com.vk.metrics.eventtracking.b.a), 16);
        if (com.vk.toggle.d.E("superapp")) {
            jc3 jc3Var = new jc3(recyclerView, i35.k(com.vk.toggle.d.b() / 100.0f, 2));
            this.c = jc3Var;
            jc3Var.k = new wgm0(this, 2);
            jc3Var.l = new th3(this, 10);
        }
    }

    public final void g(int i, String str, boolean z) {
        MobileOfficialAppsMiniappsStat$TypeGameAppView.Type type;
        if (z) {
            type = MobileOfficialAppsMiniappsStat$TypeGameAppView.Type.APP_VIEW_PART;
            Objects.toString(type);
        } else {
            type = MobileOfficialAppsMiniappsStat$TypeGameAppView.Type.APP_VIEW;
            Objects.toString(type);
        }
        MobileOfficialAppsMiniappsStat$TypeGameAppView.Type type2 = type;
        UiTracker uiTracker = UiTracker.a;
        new bvt0(UiTracker.c(), SchemeStat$TypeView.a.b(new SchemeStat$EventItem(SchemeStat$EventItem.Type.SUPERAPP_WIDGET, null, null, null, null, null, 62, null), "0", "0", null, new MobileOfficialAppsMiniappsStat$TypeGameAppView(type2, i, new CommonStat$TypeTrackCodeItem(str), null, z ? Integer.valueOf(this.e) : null, 8, null), 8)).q();
    }
}
