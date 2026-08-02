package xsna;

import android.os.Parcelable;
import com.vk.external.miniapp.net.app.WebApiApplication;
import com.vk.lists.RecyclerPaginatedView;
import com.vk.lists.c;
import com.vk.superapp.api.dto.app.AppsSection;
import com.vk.superapp.catalog.impl.v1.model.Placement;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.jvm.internal.FunctionReferenceImpl;
import xsna.zen0;

/* compiled from: SuperappMiniAppsPresenter.kt */
/* loaded from: classes6.dex */
public final class ihn0 extends zo6 {
    public com.vk.lists.c g;
    public boolean h;
    public final b i;
    public final c j;

    /* compiled from: SuperappMiniAppsPresenter.kt */
    public static final /* synthetic */ class a {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;

        static {
            int[] iArr = new int[AppsSection.ViewType.values().length];
            try {
                iArr[AppsSection.ViewType.CAROUSEL.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[AppsSection.ViewType.CAROUSEL_BANNER_COLOR.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[AppsSection.ViewType.LIST_CAROUSEL.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                iArr[AppsSection.ViewType.CAROUSEL_BANNER_IMAGE.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            $EnumSwitchMapping$0 = iArr;
        }
    }

    /* compiled from: SuperappMiniAppsPresenter.kt */
    public static final class b implements c.m<List<? extends AppsSection>> {
        public final /* synthetic */ String b;
        public final /* synthetic */ ihn0 c;

        /* compiled from: SuperappMiniAppsPresenter.kt */
        public static final /* synthetic */ class a extends FunctionReferenceImpl implements izs<List<? extends AppsSection>, List<? extends d56>> {
            @Override // xsna.izs
            public final List<? extends d56> invoke(List<? extends AppsSection> list) {
                String str;
                ihn0 ihn0Var = (ihn0) this.receiver;
                ihn0Var.getClass();
                ArrayList arrayList = new ArrayList();
                boolean z = false;
                for (AppsSection appsSection : list) {
                    lxu lxuVar = new lxu(appsSection);
                    List<WebApiApplication> list2 = appsSection.c;
                    if (z) {
                        lxuVar.a = Placement.TOP;
                    } else {
                        z = true;
                    }
                    if (!list2.isEmpty() && ((str = ihn0Var.a) == null || drm0.N(str))) {
                        arrayList.add(lxuVar);
                    }
                    int i = a.$EnumSwitchMapping$0[appsSection.f.ordinal()];
                    if (i == 1) {
                        wu9 wu9Var = new wu9(list2);
                        wu9Var.c = 2;
                        arrayList.add(wu9Var);
                    } else if (i == 2) {
                        arrayList.add(new ju9(list2));
                    } else if (i == 3) {
                        eez eezVar = new eez(list2);
                        eezVar.c = 4;
                        arrayList.add(eezVar);
                    } else if (i != 4) {
                        Iterator<T> it = list2.iterator();
                        while (it.hasNext()) {
                            arrayList.add(new q53((WebApiApplication) it.next()));
                        }
                    } else {
                        arrayList.add(new ju9(list2));
                    }
                    d56 d56Var = (d56) j5g.k0(arrayList);
                    if (d56Var != null) {
                        d56Var.a = Placement.BOTTOM;
                    }
                }
                return arrayList;
            }
        }

        public b(String str, ihn0 ihn0Var) {
            this.b = str;
            this.c = ihn0Var;
        }

        public static io.reactivex.rxjava3.core.q a(String str) {
            Parcelable.Creator<WebApiApplication> creator = WebApiApplication.CREATOR;
            List a2 = WebApiApplication.a.a();
            wdx0 wdx0Var = e370.f;
            if (wdx0Var == null) {
                wdx0Var = null;
            }
            if (wdx0Var.k()) {
                vdx0 vdx0Var = e370.e;
                return (vdx0Var != null ? vdx0Var : null).d().F(str, a2);
            }
            vdx0 vdx0Var2 = e370.e;
            return (vdx0Var2 != null ? vdx0Var2 : null).d().R(str, a2);
        }

        @Override // com.vk.lists.c.m
        public final io.reactivex.rxjava3.core.q<List<? extends AppsSection>> O9(String str, com.vk.lists.c cVar) {
            return a(this.b);
        }

        @Override // com.vk.lists.c.k
        public final io.reactivex.rxjava3.core.q<List<AppsSection>> hj(com.vk.lists.c cVar, boolean z) {
            return a(this.b);
        }

        @Override // com.vk.lists.c.k
        public final void wd(io.reactivex.rxjava3.core.q<List<AppsSection>> qVar, boolean z, com.vk.lists.c cVar) {
            ihn0 ihn0Var = this.c;
            ihn0Var.e.b(qVar.U(new mau(new a(1, ihn0Var, ihn0.class, "mapSections", "mapSections(Ljava/util/List;)Ljava/util/List;", 0), 15)).F(new nf1(new t50(xgx0.a, 3), 6)).subscribe(new l50(new vs(ihn0Var, 9), 4), new tp0(new zx0(ihn0Var, 9), 3)));
            cVar.s(null);
        }
    }

    /* compiled from: SuperappMiniAppsPresenter.kt */
    public static final class c implements c.l<of3> {
        public String b = "";

        public c() {
        }

        @Override // com.vk.lists.c.k
        public final io.reactivex.rxjava3.core.q<of3> hj(com.vk.lists.c cVar, boolean z) {
            wdx0 wdx0Var = e370.f;
            if (wdx0Var == null) {
                wdx0Var = null;
            }
            if (wdx0Var.k()) {
                vdx0 vdx0Var = e370.e;
                return zen0.a.c((vdx0Var != null ? vdx0Var : null).d(), this.b, 0, 22);
            }
            vdx0 vdx0Var2 = e370.e;
            return zen0.a.d((vdx0Var2 != null ? vdx0Var2 : null).d(), this.b, 0, 6);
        }

        @Override // com.vk.lists.c.l
        public final io.reactivex.rxjava3.core.q<of3> ui(int i, com.vk.lists.c cVar) {
            wdx0 wdx0Var = e370.f;
            if (wdx0Var == null) {
                wdx0Var = null;
            }
            if (wdx0Var.k()) {
                vdx0 vdx0Var = e370.e;
                return zen0.a.c((vdx0Var != null ? vdx0Var : null).d(), this.b, i, 18);
            }
            vdx0 vdx0Var2 = e370.e;
            return zen0.a.d((vdx0Var2 != null ? vdx0Var2 : null).d(), this.b, i, 2);
        }

        @Override // com.vk.lists.c.k
        public final void wd(io.reactivex.rxjava3.core.q<of3> qVar, boolean z, com.vk.lists.c cVar) {
            ihn0 ihn0Var = ihn0.this;
            ihn0Var.e.b(qVar.subscribe(new vom0(new jhn0(ihn0Var, z, cVar), 2), new b0y(new u2k0(ihn0Var, 10), 29)));
        }
    }

    public ihn0(String str, lgn0 lgn0Var) {
        super(str, lgn0Var);
        this.i = new b(str, this);
        this.j = new c();
    }

    @Override // xsna.ehn0
    public final void a(wo6 wo6Var) {
        this.d = wo6Var;
        c.h hVar = new c.h(this.i);
        RecyclerPaginatedView recyclerPaginatedView = wo6Var.k;
        if (recyclerPaginatedView == null) {
            recyclerPaginatedView = null;
        }
        this.c = com.vk.lists.f.a(hVar, recyclerPaginatedView);
        RecyclerPaginatedView recyclerPaginatedView2 = wo6Var.k;
        this.g = new com.vk.lists.c(this.j, null, (recyclerPaginatedView2 != null ? recyclerPaginatedView2 : null).getDataInfoProvider(), null, true, 3, true, 3, 1073741823, null, "0", null, null, null, false, false, true, true, true);
    }

    @Override // xsna.ehn0
    public final void b(String str) {
        if (str.length() > 0) {
            this.j.b = str;
            if (!this.h) {
                this.h = true;
                com.vk.lists.c cVar = this.c;
                if (cVar == null) {
                    cVar = null;
                }
                cVar.v();
                wo6 wo6Var = this.d;
                if (wo6Var != null) {
                    wo6Var.Bk();
                    com.vk.lists.c cVar2 = this.g;
                    com.vk.lists.c cVar3 = cVar2 == null ? null : cVar2;
                    RecyclerPaginatedView recyclerPaginatedView = wo6Var.k;
                    cVar3.b(recyclerPaginatedView != null ? recyclerPaginatedView : null, false, false, 0L, null);
                }
            }
            com.vk.lists.c cVar4 = this.g;
            (cVar4 != null ? cVar4 : null).p(false);
            return;
        }
        if (this.h) {
            this.h = false;
            com.vk.lists.c cVar5 = this.g;
            if (cVar5 == null) {
                cVar5 = null;
            }
            cVar5.v();
            wo6 wo6Var2 = this.d;
            if (wo6Var2 != null) {
                wo6Var2.B5();
                com.vk.lists.c cVar6 = this.c;
                com.vk.lists.c cVar7 = cVar6 != null ? cVar6 : null;
                RecyclerPaginatedView recyclerPaginatedView2 = wo6Var2.k;
                cVar7.b(recyclerPaginatedView2 != null ? recyclerPaginatedView2 : null, false, false, 0L, null);
            }
            com.vk.lists.c cVar8 = this.c;
            (cVar8 != null ? cVar8 : null).p(false);
        }
    }

    @Override // xsna.ehn0
    public final void c() {
        com.vk.lists.c cVar = this.g;
        if (cVar == null) {
            cVar = null;
        }
        cVar.v();
        this.d = null;
        com.vk.lists.c cVar2 = this.c;
        (cVar2 != null ? cVar2 : null).v();
        yo6 yo6Var = this.f;
        if (yo6Var != null) {
            q55 q55Var = q55.a;
            q55.e(yo6Var);
        }
        this.e.e();
    }
}
