package xsna;

import android.content.Context;
import android.net.Uri;
import android.os.Parcelable;
import android.widget.Toast;
import androidx.recyclerview.widget.RecyclerView;
import com.vk.core.view.components.button.VkSimpleButton;
import com.vk.external.miniapp.net.app.AppFields;
import com.vk.external.miniapp.net.app.WebApiApplication;
import com.vk.superapp.api.dto.app.catalog.CustomItem;
import com.vk.superapp.api.dto.app.catalog.SectionAppItem;
import com.vk.superapp.api.dto.app.catalog.SectionHeader;
import com.vk.superapp.api.dto.app.catalog.footer.SectionFooter;
import com.vk.superapp.api.dto.app.catalog.footer.UserStackFooter;
import com.vk.superapp.api.dto.app.catalog.section.AppCard;
import com.vk.superapp.api.dto.app.catalog.section.AppCardSection;
import com.vk.superapp.api.dto.app.catalog.section.AppCardsSection;
import com.vk.superapp.api.dto.app.catalog.section.AppsCatalogSection;
import com.vk.superapp.api.dto.app.catalog.section.AppsCategoriesSection;
import com.vk.superapp.api.dto.app.catalog.section.AppsCategory;
import com.vk.superapp.api.dto.app.catalog.section.AppsHorizontalCellListSection;
import com.vk.superapp.api.dto.app.catalog.section.AppsHorizontalListSection;
import com.vk.superapp.api.dto.app.catalog.section.AppsPaginatedSection;
import com.vk.superapp.api.dto.menu.BadgeInfo;
import com.vk.superapp.api.dto.widgets.actions.WebAction;
import com.vk.superapp.api.dto.widgets.actions.WebActionOpenNativeApp;
import com.vk.superapp.api.dto.widgets.actions.WebActionOpenSection;
import com.vk.superapp.api.dto.widgets.actions.WebActionOpenUrl;
import com.vk.superapp.api.dto.widgets.actions.WebActionOpenVkApp;
import com.vk.superapp.bridges.SuperappUiRouterBridge;
import com.vk.superapp.browser_events.VkAppEvent;
import com.vk.superapp.catalog.api.v2.adapter.BlockType;
import com.vk.superapp.miniapps.impl.AppsCatalogCategoriesFragment;
import com.vk.superapp.miniapps.impl.AppsCatalogFragment;
import com.vkontakte.android.R;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.Set;
import kotlin.LazyThreadSafetyMode;
import kotlin.collections.EmptyList;
import xsna.v2a;
import xsna.x7a;
import xsna.z8r0;

/* compiled from: VKAppsCatalogPresenter.kt */
/* loaded from: classes6.dex */
public final class u8r0 implements k8r0 {
    public final p8r0 a;
    public com.vk.lists.c d;
    public int f;
    public ay1 h;
    public boolean i;
    public boolean k;
    public final io.reactivex.rxjava3.disposables.b b = new io.reactivex.rxjava3.disposables.b();
    public final Object c = msy.a(LazyThreadSafetyMode.NONE, new f880(this, 27));
    public final LinkedHashMap e = new LinkedHashMap();
    public volatile ArrayList<x7a> g = new ArrayList<>();
    public final bpn0 j = new bpn0(new g13(26));
    public final bpn0 l = new bpn0(new h6m0(this, 9));

    /* compiled from: VKAppsCatalogPresenter.kt */
    public static abstract class a {

        /* compiled from: VKAppsCatalogPresenter.kt */
        /* renamed from: xsna.u8r0$a$a, reason: collision with other inner class name */
        public static final class C3791a extends a {
            public final Throwable a;

            public C3791a(Throwable th) {
                this.a = th;
            }
        }

        /* compiled from: VKAppsCatalogPresenter.kt */
        public static abstract class b extends a {

            /* compiled from: VKAppsCatalogPresenter.kt */
            /* renamed from: xsna.u8r0$a$b$a, reason: collision with other inner class name */
            public static final class C3792a extends b {
                public final List<x7a> a;
                public final Map<Long, WebApiApplication> b;

                /* JADX WARN: Multi-variable type inference failed */
                public C3792a(List<? extends x7a> list, Map<Long, WebApiApplication> map) {
                    this.a = list;
                    this.b = map;
                }
            }

            /* compiled from: VKAppsCatalogPresenter.kt */
            /* renamed from: xsna.u8r0$a$b$b, reason: collision with other inner class name */
            public static final class C3793b extends b {
                public final ke3 a;

                public C3793b(ke3 ke3Var) {
                    this.a = ke3Var;
                }
            }
        }
    }

    /* compiled from: VKAppsCatalogPresenter.kt */
    public static final /* synthetic */ class b {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;

        static {
            int[] iArr = new int[VkAppEvent.values().length];
            try {
                iArr[VkAppEvent.VK_APP_FAVORITE_STATUS_CHANGED.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            $EnumSwitchMapping$0 = iArr;
        }
    }

    public u8r0(p8r0 p8r0Var) {
        this.a = p8r0Var;
    }

    public static final io.reactivex.rxjava3.internal.operators.observable.m1 g(u8r0 u8r0Var, Integer num) {
        io.reactivex.rxjava3.core.q p1Var;
        if (u8r0Var.i || u8r0Var.f != 0) {
            p1Var = new io.reactivex.rxjava3.internal.operators.observable.p1(u8r0Var.i(num), new osk0(new r9c0(u8r0Var, 18), 8));
        } else {
            v2a v2aVar = v2a.a;
            qr0 qr0Var = new qr0(1, u8r0Var, u8r0.class, "mapToCatalogItems", "mapToCatalogItems(Lcom/vk/superapp/api/dto/app/catalog/AppsCatalogSectionsResponse;)Ljava/util/List;", 0, 13);
            v2aVar.getClass();
            v2a.a.b bVar = v2a.b;
            p1Var = (bVar != null ? io.reactivex.rxjava3.core.q.T(new v2a.a.b(bVar.a, bVar.b)) : new io.reactivex.rxjava3.internal.operators.observable.o1(wmi0.a.l("key_mini_apps_catalog_first_page_cache_serialization", io.reactivex.rxjava3.android.schedulers.a.b()), new io.reactivex.rxjava3.internal.operators.mixed.k(new p60(9), 8)).L(new pj4(new mu1(5, v2aVar, qr0Var), 9), false)).L(new awi0(new hto0(1, u8r0Var, num), 4), false);
        }
        return p1Var.r0(io.reactivex.rxjava3.schedulers.a.b()).a0(io.reactivex.rxjava3.android.schedulers.a.b());
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r8v11, types: [xsna.x7a$a$a] */
    public static ArrayList l(ke3 ke3Var) {
        List list;
        ArrayList arrayList = new ArrayList();
        ArrayList arrayList2 = ke3Var.a;
        int size = arrayList2.size();
        for (int i = 0; i < size; i++) {
            AppsCatalogSection appsCatalogSection = (AppsCatalogSection) arrayList2.get(i);
            SectionHeader e = appsCatalogSection.e();
            if (e != null) {
                arrayList.add(appsCatalogSection.b.equals("apps_paginated") ? new x7a.b.a(appsCatalogSection.getId(), appsCatalogSection.r(), appsCatalogSection.f(), e, 0) : new x7a.b.c(appsCatalogSection.getId(), appsCatalogSection.r(), appsCatalogSection.f(), e, 1));
            }
            if (appsCatalogSection instanceof AppsPaginatedSection) {
                AppsPaginatedSection appsPaginatedSection = (AppsPaginatedSection) appsCatalogSection;
                list = Collections.singletonList(new x7a.d.C3981d(appsPaginatedSection.g, appsPaginatedSection.j, appsPaginatedSection.k, appsPaginatedSection.h));
            } else if (appsCatalogSection instanceof AppCardSection) {
                AppCardSection appCardSection = (AppCardSection) appsCatalogSection;
                list = Collections.singletonList(new x7a.d.a(appCardSection.k, appCardSection.h));
            } else if (appsCatalogSection instanceof AppCardsSection) {
                AppCardsSection appCardsSection = (AppCardsSection) appsCatalogSection;
                list = Collections.singletonList(new x7a.d.c.a(appCardsSection.g, appCardsSection.k, appCardsSection.h));
            } else if (appsCatalogSection instanceof AppsCategoriesSection) {
                AppsCategoriesSection appsCategoriesSection = (AppsCategoriesSection) appsCatalogSection;
                List<AppsCategory> list2 = appsCategoriesSection.j;
                ArrayList arrayList3 = new ArrayList(c5g.u(list2, 10));
                int i2 = 0;
                for (Object obj : list2) {
                    int i3 = i2 + 1;
                    if (i2 < 0) {
                        e43.t();
                        throw null;
                    }
                    arrayList3.add(new x7a.d.b((AppsCategory) obj, i2, appsCategoriesSection.h));
                    i2 = i3;
                }
                list = arrayList3;
            } else if (appsCatalogSection instanceof AppsHorizontalCellListSection) {
                AppsHorizontalCellListSection appsHorizontalCellListSection = (AppsHorizontalCellListSection) appsCatalogSection;
                list = Collections.singletonList(new x7a.d.c.b(appsHorizontalCellListSection.g, appsHorizontalCellListSection.j, appsHorizontalCellListSection.h));
            } else if (appsCatalogSection instanceof AppsHorizontalListSection) {
                AppsHorizontalListSection appsHorizontalListSection = (AppsHorizontalListSection) appsCatalogSection;
                list = Collections.singletonList(new x7a.d.c.b(appsHorizontalListSection.g, appsHorizontalListSection.j, appsHorizontalListSection.h));
            } else {
                list = EmptyList.b;
            }
            arrayList.addAll(list);
            SectionFooter d = appsCatalogSection.d();
            if (d != null) {
                Object k0 = j5g.k0(list);
                x7a.d.a aVar = k0 instanceof x7a.d.a ? (x7a.d.a) k0 : null;
                AppCard c3978a = d.b.equals("user_stack") ? new x7a.a.C3978a((UserStackFooter) d, aVar != null ? aVar.e : null) : null;
                if (c3978a != null) {
                    arrayList.add(c3978a);
                }
            }
            x7a.d dVar = (x7a.d) j5g.a0(list);
            if (dVar != null && appsCatalogSection.e() == null) {
                dVar.c = BlockType.TOP;
            }
            x7a.d dVar2 = (x7a.d) j5g.k0(list);
            if (dVar2 != null) {
                dVar2.b = appsCatalogSection.d() != null;
            }
        }
        return arrayList;
    }

    public static BadgeInfo o(BadgeInfo badgeInfo, BadgeInfo badgeInfo2) {
        if (badgeInfo != null) {
            return BadgeInfo.a(badgeInfo, badgeInfo2.b, badgeInfo2.c, badgeInfo2.d, badgeInfo2.e, badgeInfo2.g, 16);
        }
        if (!drm0.N(badgeInfo2.b) || badgeInfo2.c || badgeInfo2.d || badgeInfo2.e != 0 || badgeInfo2.g) {
            return badgeInfo2;
        }
        return null;
    }

    @Override // xsna.pka
    public final void a(AppsCategory appsCategory, String str, Integer num) {
        ay1 ay1Var = this.h;
        if (ay1Var != null) {
            ay1Var.a(num, str, false);
        }
        this.a.i(appsCategory.c, appsCategory.b);
        s7n0 b2 = bbq.b();
        if (b2 != null) {
            b2.g();
        }
    }

    @Override // xsna.k8r0
    public final void b() {
        VkSimpleButton vkSimpleButton = this.a.i;
        if (vkSimpleButton == null) {
            vkSimpleButton = null;
        }
        f4m.j(vkSimpleButton);
    }

    @Override // xsna.c23
    public final void c(SectionAppItem sectionAppItem, String str, Integer num) {
        ay1 ay1Var = this.h;
        if (ay1Var != null) {
            ay1Var.a(num, str, true);
        }
        this.a.h(sectionAppItem.b, sectionAppItem.c);
        s7n0 b2 = bbq.b();
        if (b2 != null) {
            b2.g();
        }
    }

    @Override // xsna.k8r0
    public final void d(CustomItem customItem, String str, int i) {
        f(customItem.j, null, str, Integer.valueOf(i));
        n(customItem.b, customItem.k);
    }

    @Override // xsna.k8r0
    public final void e(SectionAppItem sectionAppItem, String str, int i) {
        c(sectionAppItem, str, Integer.valueOf(i));
        n(sectionAppItem.d, sectionAppItem.e);
    }

    @Override // xsna.k8r0
    public final void f(WebAction webAction, String str, String str2, Integer num) {
        p8r0 p8r0Var = this.a;
        AppsCatalogFragment appsCatalogFragment = p8r0Var.a;
        ay1 ay1Var = this.h;
        if (ay1Var != null) {
            ay1Var.a(num, str2, webAction instanceof WebActionOpenVkApp);
        }
        if (webAction instanceof WebActionOpenVkApp) {
            WebActionOpenVkApp webActionOpenVkApp = (WebActionOpenVkApp) webAction;
            WebApiApplication webApiApplication = (WebApiApplication) this.e.get(Long.valueOf(webActionOpenVkApp.d));
            if (webApiApplication != null) {
                String str3 = webActionOpenVkApp.e;
                if (str3 == null && (str3 = webApiApplication.D) == null) {
                    str3 = "";
                }
                p8r0Var.h(webApiApplication, str3);
            } else {
                int i = (int) webActionOpenVkApp.d;
                vdx0 vdx0Var = e370.e;
                j().b((vdx0Var != null ? vdx0Var : null).d().X(String.valueOf(i)).subscribe(new r7a0(new vfo0(1, this, webAction), 17), new j990(new exi0(this, 18), 14)));
            }
        } else if (webAction instanceof WebActionOpenSection) {
            WebActionOpenSection webActionOpenSection = (WebActionOpenSection) webAction;
            if (epx.f(webActionOpenSection.c, "all")) {
                appsCatalogFragment.getClass();
                new AppsCatalogCategoriesFragment.a(AppsCatalogCategoriesFragment.class, null, null).l(appsCatalogFragment);
            } else {
                p8r0Var.i(webActionOpenSection.c, str);
            }
        } else if (webAction instanceof WebActionOpenNativeApp) {
            SuperappUiRouterBridge superappUiRouterBridge = e370.d;
            (superappUiRouterBridge != null ? superappUiRouterBridge : null).d0(((WebActionOpenNativeApp) webAction).d, new r8r0(webAction, this, str, str2, num));
        } else if (webAction instanceof WebActionOpenUrl) {
            String str4 = ((WebActionOpenUrl) webAction).c;
            rex0 rex0Var = e370.j;
            if (rex0Var == null) {
                rex0Var = null;
            }
            if (!rex0Var.c(appsCatalogFragment.requireContext(), str4)) {
                Uri parse = Uri.parse(str4);
                if (parse.getHost() != null) {
                    rex0 rex0Var2 = e370.j;
                    (rex0Var2 != null ? rex0Var2 : null).b(appsCatalogFragment.requireContext(), parse);
                } else {
                    Toast.makeText(appsCatalogFragment.requireContext(), R.string.vk_apps_invalid_url, 1).show();
                }
            }
        }
        s7n0 b2 = bbq.b();
        if (b2 != null) {
            b2.g();
        }
    }

    public final void h() {
        ArrayList<x7a> arrayList = this.g;
        ArrayList arrayList2 = new ArrayList();
        for (Object obj : arrayList) {
            if (obj instanceof x7a.d) {
                arrayList2.add(obj);
            }
        }
        ArrayList arrayList3 = new ArrayList(c5g.u(arrayList2, 10));
        Iterator it = arrayList2.iterator();
        while (it.hasNext()) {
            arrayList3.add(((x7a.d) it.next()).d);
        }
        Set<String> S0 = j5g.S0(arrayList3);
        ay1 ay1Var = this.h;
        if (ay1Var != null) {
            ay1Var.d(S0);
        }
        ArrayList<x7a> arrayList4 = this.g;
        ArrayList arrayList5 = new ArrayList();
        for (Object obj2 : arrayList4) {
            if (obj2 instanceof x7a.d.b) {
                arrayList5.add(obj2);
            }
        }
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        Iterator it2 = arrayList5.iterator();
        while (it2.hasNext()) {
            Object next = it2.next();
            String str = ((x7a.d) next).d;
            Object obj3 = linkedHashMap.get(str);
            if (obj3 == null) {
                obj3 = s5a.a(str, linkedHashMap);
            }
            ((List) obj3).add(next);
        }
        ay1 ay1Var2 = this.h;
        if (ay1Var2 != null) {
            ay1Var2.e(linkedHashMap);
        }
    }

    public final io.reactivex.rxjava3.core.q<a> i(Integer num) {
        Context context;
        Parcelable.Creator<WebApiApplication> creator = WebApiApplication.CREATOR;
        ArrayList arrayList = new ArrayList(WebApiApplication.a.a());
        arrayList.add(AppFields.SHORT_DESCRIPTION);
        arrayList.remove(AppFields.WEBVIEW_URL);
        try {
            context = this.a.a.requireContext();
        } catch (IllegalStateException unused) {
            context = null;
        }
        return m3r0.c(context).L(new fe60(new lq5(this, num, arrayList, 4), 15), false);
    }

    public final io.reactivex.rxjava3.disposables.b j() {
        return this.b;
    }

    public final void k(a.b.C3792a c3792a) {
        this.e.putAll(c3792a.b);
        List<x7a> list = c3792a.a;
        this.a.l(list, true, true);
        this.g.addAll(list);
        h();
        this.i = true;
        com.vk.lists.c cVar = this.d;
        if (cVar == null) {
            cVar = null;
        }
        cVar.r(false);
    }

    public final void m() {
        com.vk.core.utils.newtork.b.a.getClass();
        int i = 24;
        j().b(com.vk.core.utils.newtork.b.f().a0(io.reactivex.rxjava3.android.schedulers.a.b()).subscribe(new p350(new j5b0(this, i), i)));
        v2a.a.getClass();
        v2a.a.b bVar = v2a.b;
        if (bVar != null) {
            k(new a.b.C3792a(bVar.a, bVar.b));
        } else {
            p8r0 p8r0Var = this.a;
            RecyclerView recyclerView = p8r0Var.f;
            if (recyclerView == null) {
                recyclerView = null;
            }
            recyclerView.setVisibility(0);
            p8r0Var.j.x0();
            com.vk.lists.c cVar = this.d;
            if (cVar == null) {
                cVar = null;
            }
            cVar.p(false);
        }
        io.reactivex.rxjava3.disposables.c cVar2 = z8r0.b;
        if (cVar2 != null) {
            return;
        }
        if (cVar2 != null) {
            cVar2.dispose();
        }
        z8r0.b = null;
        z8r0.a(z8r0.a.b.a);
        Parcelable.Creator<WebApiApplication> creator = WebApiApplication.CREATOR;
        List<? extends AppFields> a2 = WebApiApplication.a.a();
        vdx0 vdx0Var = e370.e;
        vdx0 vdx0Var2 = vdx0Var != null ? vdx0Var : null;
        int i2 = 26;
        z8r0.b = new io.reactivex.rxjava3.internal.operators.observable.a0(vdx0Var2.d().l(a2).U(new sqk0(new quz(i2), 6)), new y8r0()).subscribe(new hmq0(new cd10(22), 1), new tmz(new z6u(i2), i));
    }

    public final void n(String str, BadgeInfo badgeInfo) {
        pq3 a2;
        if (str == null || drm0.N(str) || badgeInfo == null) {
            return;
        }
        if (badgeInfo.c || badgeInfo.d || badgeInfo.e != 0) {
            isb0 isb0Var = new isb0(9, this, str);
            dex0 dex0Var = e370.s;
            String str2 = (dex0Var == null || (a2 = dex0Var.a()) == null || !a2.g()) ? null : "PUkAEhcOSVZkR0sYVFkORHxJGhNHQgIFIxg2FVRACgopDDYbUFoeRGpJBRdMWx4SGR8QBlAWUURkR0sAUEYYDykFS0wESQ";
            vdx0 vdx0Var = e370.e;
            j().b((vdx0Var != null ? vdx0Var : null).u().b(str, str2).subscribe(new eeh0(isb0Var, 12), new xj50(new o99(xgx0.a, 13), 21)));
        }
    }

    public final void p(String str, Boolean bool, BadgeInfo badgeInfo) {
        x7a c3981d;
        if (drm0.N(str) || this.g.isEmpty()) {
            return;
        }
        ArrayList<x7a> arrayList = this.g;
        ArrayList arrayList2 = new ArrayList(c5g.u(arrayList, 10));
        for (x7a x7aVar : arrayList) {
            int i = x7aVar.a;
            if (i == 3) {
                x7a.d.C3981d c3981d2 = (x7a.d.C3981d) x7aVar;
                List<CustomItem> list = c3981d2.g;
                ArrayList arrayList3 = new ArrayList(c5g.u(list, 10));
                for (CustomItem customItem : list) {
                    if (customItem.b.equals(str)) {
                        customItem = CustomItem.a(customItem, o(customItem.k, badgeInfo));
                    }
                    arrayList3.add(customItem);
                }
                c3981d = new x7a.d.C3981d(c3981d2.e, c3981d2.f, arrayList3, c3981d2.d);
                c3981d.c = x7aVar.c;
                c3981d.b = x7aVar.b;
            } else if (i != 7) {
                arrayList2.add(x7aVar);
            } else {
                x7a.d.c.b bVar = (x7a.d.c.b) x7aVar;
                List<SectionAppItem> list2 = bVar.f;
                ArrayList arrayList4 = new ArrayList(c5g.u(list2, 10));
                for (SectionAppItem sectionAppItem : list2) {
                    if (epx.f(sectionAppItem.d, str)) {
                        BadgeInfo o = o(sectionAppItem.e, badgeInfo);
                        if (bool != null) {
                            sectionAppItem.b.R = bool;
                        }
                        sectionAppItem = new SectionAppItem(sectionAppItem.b, sectionAppItem.c, sectionAppItem.d, o, sectionAppItem.f, sectionAppItem.g);
                    }
                    arrayList4.add(sectionAppItem);
                }
                c3981d = new x7a.d.c.b(bVar.e, arrayList4, bVar.d);
                c3981d.c = x7aVar.c;
                c3981d.b = x7aVar.b;
            }
            x7aVar = c3981d;
            arrayList2.add(x7aVar);
        }
        ArrayList<x7a> q = p4g.q(arrayList2);
        qro0.c(new cg1(28, this, q));
        this.g = q;
    }
}
