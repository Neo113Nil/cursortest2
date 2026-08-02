package xsna;

import androidx.recyclerview.widget.m;
import com.vk.catalog2.common.dto.api.CatalogViewType;
import com.vk.catalog2.common.dto.api.ui.UIBlock;
import com.vk.catalog2.common.dto.ui.UIBlockList;
import com.vk.catalog2.common.ui.holders.api.CatalogPaginatedListViewHolder;
import java.util.ArrayList;
import java.util.List;
import kotlin.jvm.internal.MutablePropertyReference1Impl;

/* compiled from: CatalogBlockListPresenter.kt */
/* loaded from: classes16.dex */
public final class y1a extends tba<hda> {
    public static final /* synthetic */ qcy<Object>[] n;
    public final q3a g;
    public final whu0 h;
    public final jda i;
    public final oda<UIBlockList> j;
    public UIBlockList k;
    public final pgn l = new pgn();
    public final bpn0 m = new bpn0(new cu1(3));

    /* compiled from: CatalogBlockListPresenter.kt */
    public static final /* synthetic */ class a {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;

        static {
            int[] iArr = new int[CatalogViewType.values().length];
            try {
                iArr[CatalogViewType.SLIDER_VERTICAL_VIDEOS_NO_AUTOPLAY.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[CatalogViewType.FLOOR_CLIPS.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[CatalogViewType.SEARCH_FLOOR_CLIPS.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            $EnumSwitchMapping$0 = iArr;
        }
    }

    static {
        MutablePropertyReference1Impl mutablePropertyReference1Impl = new MutablePropertyReference1Impl(y1a.class, "eventsDisposable", "getEventsDisposable()Lio/reactivex/rxjava3/disposables/Disposable;", 0);
        fpf0.a.getClass();
        n = new qcy[]{mutablePropertyReference1Impl};
    }

    public y1a(q3a q3aVar, whu0 whu0Var, jda jdaVar, ly8 ly8Var) {
        this.g = q3aVar;
        this.h = whu0Var;
        this.i = jdaVar;
        this.j = ly8Var;
    }

    @Override // xsna.tba
    public final void b(CatalogPaginatedListViewHolder catalogPaginatedListViewHolder) {
        CatalogPaginatedListViewHolder catalogPaginatedListViewHolder2;
        boolean z;
        CatalogPaginatedListViewHolder catalogPaginatedListViewHolder3 = this.c;
        if (catalogPaginatedListViewHolder3 != null && !catalogPaginatedListViewHolder3.equals(catalogPaginatedListViewHolder)) {
            d(null);
        }
        this.c = catalogPaginatedListViewHolder;
        UIBlockList uIBlockList = this.k;
        if (uIBlockList != null) {
            String str = uIBlockList.A;
            if (str != null) {
                int i = a.$EnumSwitchMapping$0[uIBlockList.d.ordinal()];
                if (i != 1 && i != 2 && i != 3) {
                    z = true;
                    catalogPaginatedListViewHolder2 = catalogPaginatedListViewHolder;
                    this.d = catalogPaginatedListViewHolder2.Wi(str, false, z, null, false, null, false);
                }
            }
            z = false;
            catalogPaginatedListViewHolder2 = catalogPaginatedListViewHolder;
            this.d = catalogPaginatedListViewHolder2.Wi(str, false, z, null, false, null, false);
        } else {
            catalogPaginatedListViewHolder2 = catalogPaginatedListViewHolder;
        }
        io.reactivex.rxjava3.disposables.c subscribe = this.g.a().a0(io.reactivex.rxjava3.android.schedulers.a.b()).subscribe(new com.vk.im.ui.components.dialogs_list.b(new fh1(3, this, catalogPaginatedListViewHolder2), 11));
        qcy<Object> qcyVar = n[0];
        this.l.b(subscribe);
    }

    @Override // xsna.tba
    public final void c() {
        e();
    }

    @Override // xsna.tba
    public final void d(CatalogPaginatedListViewHolder catalogPaginatedListViewHolder) {
        this.c = null;
        qcy<Object>[] qcyVarArr = n;
        qcy<Object> qcyVar = qcyVarArr[0];
        pgn pgnVar = this.l;
        io.reactivex.rxjava3.disposables.c cVar = (io.reactivex.rxjava3.disposables.c) pgnVar.b;
        if (cVar != null) {
            cVar.dispose();
        }
        qcy<Object> qcyVar2 = qcyVarArr[0];
        pgnVar.b(null);
        com.vk.lists.c cVar2 = this.d;
        if (cVar2 != null) {
            cVar2.v();
        }
        e();
    }

    @Override // xsna.tba
    public final String f() {
        UIBlockList uIBlockList = this.k;
        if (uIBlockList != null) {
            return uIBlockList.f;
        }
        return null;
    }

    @Override // xsna.tba
    public final io.reactivex.rxjava3.core.q i(Integer num, String str, boolean z) {
        String str2;
        UIBlockList uIBlockList = this.k;
        if (uIBlockList == null || (str2 = uIBlockList.b) == null) {
            str2 = "";
        }
        return this.h.d(str2, str, uIBlockList != null ? uIBlockList.Kb() : null, false, num);
    }

    @Override // xsna.tba
    public final io.reactivex.rxjava3.disposables.c m(io.reactivex.rxjava3.core.q<hda> qVar, boolean z, com.vk.lists.c cVar) {
        return qVar.subscribe(new eu0(new com.vk.im.ui.components.viewcontrollers.dialog_header.info.a(this, 14), 7), new fu0(new pt(13), 8));
    }

    public final void q(List list, ArrayList arrayList, UIBlockList uIBlockList) {
        UIBlockList uIBlockList2;
        String str;
        ArrayList<UIBlock> arrayList2;
        UIBlock uIBlock;
        z0a z0aVar = (z0a) this.m.getValue();
        ArrayList<UIBlock> arrayList3 = uIBlockList.y;
        UIBlockList uIBlockList3 = this.k;
        z0a.b(z0aVar, arrayList3, (uIBlockList3 == null || (arrayList2 = uIBlockList3.y) == null || (uIBlock = (UIBlock) j5g.k0(arrayList2)) == null) ? 1 : uIBlock.t, 4);
        m.d a2 = androidx.recyclerview.widget.m.a(new if7(list, arrayList), true);
        CatalogPaginatedListViewHolder catalogPaginatedListViewHolder = this.c;
        if (catalogPaginatedListViewHolder != null) {
            catalogPaginatedListViewHolder.dj(a2, list, arrayList, uIBlockList);
        }
        com.vk.lists.c cVar = this.d;
        com.vk.lists.c cVar2 = null;
        if ((cVar != null ? cVar.j() : null) != null || (str = uIBlockList.A) == null) {
            uIBlockList2 = uIBlockList;
        } else {
            CatalogPaginatedListViewHolder catalogPaginatedListViewHolder2 = this.c;
            if (catalogPaginatedListViewHolder2 != null) {
                int i = a.$EnumSwitchMapping$0[uIBlockList.d.ordinal()];
                uIBlockList2 = uIBlockList;
                cVar2 = catalogPaginatedListViewHolder2.Wi(str, false, (i == 1 || i == 2 || i == 3) ? false : true, uIBlockList2, false, null, false);
            } else {
                uIBlockList2 = uIBlockList;
            }
            this.d = cVar2;
        }
        com.vk.lists.c cVar3 = this.d;
        if (cVar3 != null) {
            cVar3.s(uIBlockList2.A);
        }
        this.k = uIBlockList2;
    }
}
