package xsna;

import androidx.recyclerview.widget.m;
import com.vk.catalog2.common.dto.api.CatalogExtendedData;
import com.vk.catalog2.common.dto.api.CatalogFilterData;
import com.vk.catalog2.common.dto.api.CatalogViewType;
import com.vk.catalog2.common.dto.api.ui.UIBlock;
import com.vk.catalog2.common.dto.ui.UIBlockHeader;
import com.vk.catalog2.common.dto.ui.UIBlockList;
import com.vk.catalog2.common.dto.ui.UIBlockPlaceholder;
import com.vk.catalog2.common.dto.ui.UIBlockSeparator;
import com.vk.catalog2.common.dto.ui.UIBlockShimmer;
import com.vk.catalog2.common.dto.ui.actions.UIBlockActionFilter;
import com.vk.catalog2.common.ui.core.util.EditorMode;
import com.vk.catalog2.common.ui.holders.api.CatalogPaginatedListViewHolder;
import com.vk.core.apps.BuildInfo;
import com.vkontakte.android.VKApplication;
import io.reactivex.rxjava3.internal.functions.a;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.collections.EmptyList;
import xsna.oap;
import xsna.u4a;

/* compiled from: CatalogSectionPresenter.kt */
/* loaded from: classes16.dex */
public class kea extends tba<hda> implements tnk {
    public static final a Q = new a();
    public static final b R = new b();
    public io.reactivex.rxjava3.disposables.c A;
    public io.reactivex.rxjava3.disposables.c B;
    public io.reactivex.rxjava3.disposables.c C;
    public final f0q D;
    public final z0a E;
    public vgb0 F;
    public orf G;
    public prf H;
    public qk I;
    public oe5 J;
    public tx K;
    public volatile boolean L;
    public CatalogExtendedData M;
    public qda N;
    public final lea O;
    public final jge0 P;
    public final gda g;
    public final jda h;
    public final u4a i;
    public final vd7 j;
    public final boolean k;
    public UIBlockList l;
    public final String m;
    public final boolean n;
    public final boolean o;
    public final String p;
    public final eda q;
    public final io.reactivex.rxjava3.core.w r;
    public final zda s;
    public final gzs<s3q0> t;
    public final gzs<Boolean> u;
    public final boolean v;
    public final wzs<UIBlockList, CatalogExtendedData, s3q0> w;
    public volatile boolean x;
    public boolean y;
    public boolean z;

    /* compiled from: CatalogSectionPresenter.kt */
    public static final class a implements qda {
        @Override // xsna.qda
        public final boolean a(UIBlock uIBlock, boolean z) {
            return false;
        }
    }

    /* compiled from: CatalogSectionPresenter.kt */
    public static final class b implements qda {
        @Override // xsna.qda
        public final boolean a(UIBlock uIBlock, boolean z) {
            return true;
        }
    }

    /* compiled from: CatalogSectionPresenter.kt */
    public static final /* synthetic */ class c {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;

        static {
            int[] iArr = new int[EditorMode.values().length];
            try {
                iArr[EditorMode.ENTER_EDITOR_MODE.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[EditorMode.EXIT_EDITOR_MODE.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[EditorMode.EXIT_EDITOR_MODE_DISCARD.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            $EnumSwitchMapping$0 = iArr;
        }
    }

    /* compiled from: CatalogSectionPresenter.kt */
    public static final class d implements qda {
        public final /* synthetic */ String a;
        public final /* synthetic */ n3a b;

        public d(String str, n3a n3aVar) {
            this.a = str;
            this.b = n3aVar;
        }

        @Override // xsna.qda
        public final boolean a(UIBlock uIBlock, boolean z) {
            izs<Boolean, Boolean> izsVar;
            if (!uIBlock.h.contains(this.a)) {
                n3a n3aVar = this.b;
                qon0 qon0Var = n3aVar instanceof qon0 ? (qon0) n3aVar : null;
                if (qon0Var == null || (izsVar = qon0Var.a) == null || !izsVar.invoke(Boolean.valueOf(z)).booleanValue()) {
                    return false;
                }
            }
            return true;
        }
    }

    public kea() {
        throw null;
    }

    public kea(gda gdaVar, jda jdaVar, u4a u4aVar, vd7 vd7Var, boolean z, UIBlockList uIBlockList, String str, boolean z2, String str2, eda edaVar, zda zdaVar, gzs gzsVar, Cnew cnew, boolean z3, wzs wzsVar, int i) {
        UIBlockList uIBlockList2 = (i & 32) != 0 ? null : uIBlockList;
        String str3 = (i & 64) != 0 ? null : str;
        boolean z4 = (i & 128) != 0 ? true : z2;
        boolean z5 = (i & 256) == 0;
        String str4 = (i & 512) != 0 ? null : str2;
        eda edaVar2 = (i & 1024) != 0 ? null : edaVar;
        io.reactivex.rxjava3.core.w b2 = io.reactivex.rxjava3.android.schedulers.a.b();
        zda zdaVar2 = (i & 4096) != 0 ? null : zdaVar;
        gzs gzsVar2 = (i & 8192) != 0 ? null : gzsVar;
        Cnew cnew2 = (i & 16384) != 0 ? null : cnew;
        boolean z6 = (i & 32768) != 0 ? false : z3;
        wzs wzsVar2 = (i & 65536) != 0 ? null : wzsVar;
        this.g = gdaVar;
        this.h = jdaVar;
        this.i = u4aVar;
        this.j = vd7Var;
        this.k = z;
        this.l = uIBlockList2;
        this.m = str3;
        this.n = z4;
        this.o = z5;
        this.p = str4;
        this.q = edaVar2;
        this.r = b2;
        this.s = zdaVar2;
        this.t = gzsVar2;
        this.u = cnew2;
        this.v = z6;
        this.w = wzsVar2;
        this.z = true;
        u4a.a aVar = u4aVar.b;
        this.D = aVar.x;
        z0a z0aVar = aVar.D;
        this.E = z0aVar;
        this.O = new lea(this);
        this.P = new jge0();
        if (uIBlockList2 != null) {
            z0a.b(z0aVar, uIBlockList2.y, 0, 6);
            if (zdaVar2 != null) {
                zdaVar2.k(uIBlockList2);
            }
        }
    }

    public static gea r(kea keaVar) {
        return new gea(keaVar, true);
    }

    public static qda s(n3a n3aVar) {
        String str;
        if ((n3aVar instanceof qon0) || (n3aVar instanceof oon0)) {
            boolean z = n3aVar instanceof oon0;
            oon0 oon0Var = z ? (oon0) n3aVar : null;
            boolean z2 = oon0Var != null ? oon0Var.d : true;
            oon0 oon0Var2 = z ? (oon0) n3aVar : null;
            if (oon0Var2 == null || (str = oon0Var2.a) == null) {
                str = "";
            }
            if (z2) {
                return new d(str, n3aVar);
            }
        }
        return Q;
    }

    public static void u(ArrayList arrayList) {
        Iterator it = arrayList.iterator();
        loop0: while (true) {
            boolean z = false;
            while (it.hasNext()) {
                if (it.next() instanceof UIBlockSeparator) {
                    if (z) {
                        it.remove();
                    }
                    z = true;
                }
            }
        }
        if (j5g.k0(arrayList) instanceof UIBlockSeparator) {
            arrayList.remove(e43.h(arrayList));
        }
    }

    public static void w(kea keaVar, boolean z, qda qdaVar, boolean z2, int i) {
        if ((i & 1) != 0) {
            z = false;
        }
        if ((i & 2) != 0) {
            qdaVar = Q;
        }
        if ((i & 4) != 0) {
            z2 = true;
        }
        keaVar.x = true;
        keaVar.z = z2;
        keaVar.y = z;
        CatalogPaginatedListViewHolder catalogPaginatedListViewHolder = keaVar.c;
        keaVar.N = catalogPaginatedListViewHolder != null ? catalogPaginatedListViewHolder.td() : null;
        CatalogPaginatedListViewHolder catalogPaginatedListViewHolder2 = keaVar.c;
        if (catalogPaginatedListViewHolder2 != null) {
            catalogPaginatedListViewHolder2.Pl(qdaVar);
        }
        com.vk.lists.c cVar = keaVar.d;
        if (cVar != null) {
            cVar.p(false);
        }
    }

    @Override // xsna.tnk
    public final void a() {
        io.reactivex.rxjava3.disposables.c cVar = this.B;
        if (cVar != null) {
            cVar.dispose();
        }
    }

    @Override // xsna.tba
    public void b(CatalogPaginatedListViewHolder catalogPaginatedListViewHolder) {
        UIBlockList uIBlockList;
        ArrayList<UIBlock> arrayList;
        this.c = catalogPaginatedListViewHolder;
        u4a u4aVar = this.i;
        u4a.b bVar = u4aVar.c;
        u4a.a aVar = u4aVar.b;
        mzp0 mzp0Var = bVar.g;
        if (mzp0Var != null) {
            mzp0Var.a();
        }
        if (this.n) {
            v();
        }
        this.A = aVar.e.a().a0(this.r).subscribe(new w00(new tl0(this, 21), 5), new y00(new ak(6), 8));
        UIBlockList uIBlockList2 = this.l;
        if (uIBlockList2 != null) {
            catalogPaginatedListViewHolder.Cm(aVar.F.invoke(uIBlockList2));
        }
        o25.a().b0(this.O);
        String str = this.p;
        if (str == null || (uIBlockList = this.l) == null || (arrayList = uIBlockList.y) == null) {
            return;
        }
        if (!arrayList.isEmpty()) {
            Iterator<T> it = arrayList.iterator();
            while (it.hasNext()) {
                if (((UIBlock) it.next()) instanceof UIBlockShimmer) {
                    return;
                }
            }
        }
        Iterator<UIBlock> it2 = arrayList.iterator();
        int i = 0;
        while (true) {
            if (!it2.hasNext()) {
                i = -1;
                break;
            } else if (epx.f(it2.next().m, str)) {
                break;
            } else {
                i++;
            }
        }
        if (i > 0 && (arrayList.get(i - 1) instanceof UIBlockHeader)) {
            i--;
        }
        CatalogPaginatedListViewHolder catalogPaginatedListViewHolder2 = this.c;
        if (catalogPaginatedListViewHolder2 != null) {
            catalogPaginatedListViewHolder2.g(i, 32);
        }
    }

    @Override // xsna.tba
    public final void c() {
        this.l = null;
        com.vk.lists.c cVar = this.d;
        if (cVar != null) {
            cVar.s(null);
        }
    }

    @Override // xsna.tba
    public void d(CatalogPaginatedListViewHolder catalogPaginatedListViewHolder) {
        if (catalogPaginatedListViewHolder.equals(this.c)) {
            this.c = null;
            com.vk.lists.c cVar = this.d;
            if (cVar != null) {
                cVar.v();
            }
            this.d = null;
            e();
            io.reactivex.rxjava3.disposables.c cVar2 = this.A;
            if (cVar2 != null) {
                cVar2.dispose();
            }
            io.reactivex.rxjava3.disposables.c cVar3 = this.B;
            if (cVar3 != null) {
                cVar3.dispose();
            }
            io.reactivex.rxjava3.disposables.c cVar4 = this.C;
            if (cVar4 != null) {
                cVar4.dispose();
            }
            o25.a().B(this.O);
        }
    }

    @Override // xsna.tba
    public final String f() {
        String str = this.m;
        if (str != null) {
            return str;
        }
        UIBlockList uIBlockList = this.l;
        if (uIBlockList != null) {
            return uIBlockList.f;
        }
        return null;
    }

    @Override // xsna.tba
    public final boolean h() {
        Object obj;
        Object obj2;
        eda edaVar;
        UIBlockList uIBlockList = this.l;
        if (uIBlockList == null) {
            return false;
        }
        ArrayList<UIBlock> arrayList = uIBlockList.y;
        ArrayList arrayList2 = new ArrayList();
        for (Object obj3 : arrayList) {
            if (obj3 instanceof UIBlockPlaceholder) {
                arrayList2.add(obj3);
            }
        }
        if (arrayList2.size() == 1 && !o25.a().b()) {
            com.vk.lists.c cVar = this.d;
            if (cVar != null) {
                cVar.o();
            }
            return true;
        }
        Iterator<T> it = uIBlockList.y.iterator();
        loop1: while (true) {
            obj = null;
            if (!it.hasNext()) {
                obj2 = null;
                break;
            }
            obj2 = it.next();
            UIBlock uIBlock = (UIBlock) obj2;
            if ((uIBlock instanceof UIBlockList) && uIBlock.d == CatalogViewType.SLIDER) {
                ArrayList<UIBlock> arrayList3 = ((UIBlockList) uIBlock).y;
                if (arrayList3 != null && arrayList3.isEmpty()) {
                    break;
                }
                Iterator<T> it2 = arrayList3.iterator();
                while (it2.hasNext()) {
                    if (!(((UIBlock) it2.next()) instanceof UIBlockActionFilter)) {
                        break;
                    }
                }
                break loop1;
            }
        }
        UIBlock uIBlock2 = (UIBlock) obj2;
        if (uIBlock2 == null || (edaVar = this.q) == null) {
            return false;
        }
        ArrayList<UIBlock> arrayList4 = ((UIBlockList) uIBlock2).y;
        ArrayList arrayList5 = new ArrayList();
        for (Object obj4 : arrayList4) {
            if (obj4 instanceof UIBlockActionFilter) {
                arrayList5.add(obj4);
            }
        }
        Iterator it3 = arrayList5.iterator();
        while (true) {
            if (!it3.hasNext()) {
                break;
            }
            Object next = it3.next();
            if (((UIBlockActionFilter) next).z.e) {
                obj = next;
                break;
            }
        }
        UIBlockActionFilter uIBlockActionFilter = (UIBlockActionFilter) obj;
        if (uIBlockActionFilter == null) {
            return false;
        }
        CatalogFilterData catalogFilterData = uIBlockActionFilter.z;
        io.reactivex.rxjava3.disposables.c cVar2 = this.B;
        if (cVar2 != null) {
            cVar2.dispose();
        }
        this.B = epx.f(uIBlockActionFilter.B, "section_filter") ? edaVar.d(uIBlockList.c, catalogFilterData.b, new oap.b(new io.reactivex.rxjava3.core.u() { // from class: xsna.fea
            @Override // io.reactivex.rxjava3.core.u
            public final io.reactivex.rxjava3.core.t a(io.reactivex.rxjava3.core.q qVar) {
                io.reactivex.rxjava3.core.q g;
                com.vk.lists.c cVar3 = kea.this.d;
                return (cVar3 == null || (g = cVar3.g(qVar, true, true)) == null) ? qVar : g;
            }
        })) : eda.c(edaVar, catalogFilterData.b, new oap.b(r(this)), this.l, 8);
        return true;
    }

    @Override // xsna.tba, com.vk.lists.c.k
    public final io.reactivex.rxjava3.core.q<hda> hj(com.vk.lists.c cVar, boolean z) {
        CatalogPaginatedListViewHolder catalogPaginatedListViewHolder = this.c;
        this.N = catalogPaginatedListViewHolder != null ? catalogPaginatedListViewHolder.td() : null;
        CatalogPaginatedListViewHolder catalogPaginatedListViewHolder2 = this.c;
        if (catalogPaginatedListViewHolder2 != null) {
            catalogPaginatedListViewHolder2.Pl(R);
        }
        return super.hj(cVar, z);
    }

    @Override // xsna.tba
    public io.reactivex.rxjava3.core.q i(Integer num, String str, boolean z) {
        UIBlockList uIBlockList = this.l;
        io.reactivex.rxjava3.core.q d2 = this.g.d(uIBlockList != null ? uIBlockList.b : null, str, null, z, num);
        a.l lVar = io.reactivex.rxjava3.internal.functions.a.d;
        a.k kVar = io.reactivex.rxjava3.internal.functions.a.c;
        if (str == null && num == null && !z) {
            b60 b60Var = new b60(new t9(this, 14), 8);
            d2.getClass();
            d2 = new io.reactivex.rxjava3.internal.operators.observable.c0(d2, b60Var, kVar).E(new n20(new com.vk.im.engine.internal.storage.delegates.messages.b(this, 19), 12), lVar, kVar, kVar).F(new f60(new za(this, 19), 10));
        } else if (z) {
            com.vk.im.ui.components.dialogs_list.b bVar = new com.vk.im.ui.components.dialogs_list.b(new g60(this, 18), 12);
            d2.getClass();
            d2 = new io.reactivex.rxjava3.internal.operators.observable.c0(d2, bVar, kVar).E(new t00(new t40(this, 9), 7), lVar, kVar, kVar).F(new l50(new op1(this, 13), 7));
        }
        return d2.a0(this.r);
    }

    @Override // xsna.tba
    public final io.reactivex.rxjava3.disposables.c m(io.reactivex.rxjava3.core.q<hda> qVar, boolean z, com.vk.lists.c cVar) {
        this.D.getClass();
        BuildInfo.Client client = BuildInfo.a;
        VKApplication vKApplication = com.vk.core.apps.a.a;
        return new io.reactivex.rxjava3.internal.operators.observable.a0(qVar, new f3a(this, 1)).subscribe(new ea(new j68(this, z, cVar), 10), new ga(new com.vk.movika.sdk.base.logic.interactor.d(this, 21), 12));
    }

    @Override // xsna.tba
    public void n() {
        if (this.n) {
            return;
        }
        v();
    }

    public final void q(UIBlockList uIBlockList) {
        List<? extends UIBlock> list;
        ArrayList<UIBlock> arrayList = uIBlockList.y;
        UIBlockList uIBlockList2 = this.l;
        if (uIBlockList2 == null || (list = uIBlockList2.zb().y) == null) {
            list = EmptyList.b;
        }
        m.d a2 = androidx.recyclerview.widget.m.a(new if7(list, arrayList), true);
        z0a.b(this.E, arrayList, 0, 6);
        this.l = uIBlockList;
        CatalogPaginatedListViewHolder catalogPaginatedListViewHolder = this.c;
        if (catalogPaginatedListViewHolder != null) {
            catalogPaginatedListViewHolder.dj(a2, list, arrayList, uIBlockList);
        }
    }

    public final boolean t(UIBlockList uIBlockList) {
        UIBlock uIBlock;
        UIBlockList uIBlockList2 = this.l;
        z0a z0aVar = this.E;
        int i = 1;
        if (uIBlockList2 == null) {
            z0a.b(z0aVar, uIBlockList.y, 0, 6);
            this.l = uIBlockList;
            return true;
        }
        ArrayList<UIBlock> arrayList = uIBlockList2.y;
        if (arrayList != null && (uIBlock = (UIBlock) j5g.k0(arrayList)) != null) {
            i = 1 + uIBlock.t;
        }
        z0a.b(z0aVar, uIBlockList.y, i, 4);
        UIBlockList uIBlockList3 = this.l;
        if (uIBlockList3 != null) {
            uIBlockList3.A = uIBlockList.A;
            uIBlockList3.y.addAll(uIBlockList.y);
        }
        return false;
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(qjg.a(this));
        sb.append('<');
        UIBlockList uIBlockList = this.l;
        sb.append(uIBlockList != null ? uIBlockList.z : null);
        sb.append(".dt=");
        UIBlockList uIBlockList2 = this.l;
        sb.append(uIBlockList2 != null ? uIBlockList2.e : null);
        sb.append(".vt=");
        UIBlockList uIBlockList3 = this.l;
        sb.append(uIBlockList3 != null ? uIBlockList3.d : null);
        sb.append(">@");
        sb.append(hashCode());
        return sb.toString();
    }

    public final void v() {
        String str;
        if (this.d != null) {
            return;
        }
        CatalogPaginatedListViewHolder catalogPaginatedListViewHolder = this.c;
        com.vk.lists.c cVar = null;
        if (catalogPaginatedListViewHolder != null) {
            if (this.x) {
                str = "0";
            } else {
                UIBlockList uIBlockList = this.l;
                str = uIBlockList != null ? uIBlockList.A : null;
            }
            cVar = catalogPaginatedListViewHolder.Wi(str, this.k, true, this.x ? null : this.l, true, new u40(this, 9), this.v);
        }
        this.d = cVar;
    }
}
