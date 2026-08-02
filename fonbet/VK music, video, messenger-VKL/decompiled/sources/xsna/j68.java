package xsna;

import android.content.Context;
import android.os.SystemClock;
import com.vk.catalog2.common.dto.api.CatalogExtendedData;
import com.vk.catalog2.common.dto.api.ui.UIBlock;
import com.vk.catalog2.common.dto.ui.UIBlockCatalog;
import com.vk.catalog2.common.dto.ui.UIBlockList;
import com.vk.catalog2.common.ui.holders.api.CatalogPaginatedListViewHolder;
import com.vk.core.apps.BuildInfo;
import com.vk.core.serialize.Serializer;
import com.vk.dto.photo.Photo;
import com.vk.stat.model.DevNullEventKey;
import com.vk.stat.scheme.SchemeStat$TypeDevNullItem;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/* compiled from: R8$$SyntheticClass */
/* loaded from: classes6.dex */
public final /* synthetic */ class j68 implements izs {
    public final /* synthetic */ int b = 1;
    public final /* synthetic */ boolean c;
    public final /* synthetic */ Object d;
    public final /* synthetic */ Object e;

    public /* synthetic */ j68(m68 m68Var, Context context, boolean z) {
        this.d = m68Var;
        this.e = context;
        this.c = z;
    }

    @Override // xsna.izs
    public final Object invoke(Object obj) {
        Object obj2;
        zda zdaVar;
        String str;
        Long l;
        CatalogPaginatedListViewHolder catalogPaginatedListViewHolder;
        switch (this.b) {
            case 0:
                ((m68) this.d).g((Context) this.e, (Photo) obj, this.c);
                return s3q0.a;
            default:
                kea keaVar = (kea) this.d;
                boolean z = this.c;
                com.vk.lists.c cVar = (com.vk.lists.c) this.e;
                hda hdaVar = (hda) obj;
                mzp0 mzp0Var = keaVar.i.c.g;
                boolean z2 = false;
                if (mzp0Var != null) {
                    mzp0Var.c(false);
                }
                keaVar.M = hdaVar.b;
                if (z && ((!keaVar.x || keaVar.y) && (catalogPaginatedListViewHolder = keaVar.c) != null)) {
                    catalogPaginatedListViewHolder.s();
                }
                keaVar.y = false;
                List a = jda.a(keaVar.h, hdaVar.a, hdaVar.b, epx.f(cVar.j(), "0"), false, 8);
                Object a0 = j5g.a0(a);
                UIBlockCatalog uIBlockCatalog = a0 instanceof UIBlockCatalog ? (UIBlockCatalog) a0 : null;
                List list = uIBlockCatalog != null ? uIBlockCatalog.A : null;
                if (list == null) {
                    list = a;
                }
                Iterator it = list.iterator();
                while (true) {
                    if (it.hasNext()) {
                        obj2 = it.next();
                        if (((UIBlock) obj2) instanceof UIBlockList) {
                        }
                    } else {
                        obj2 = null;
                    }
                }
                UIBlockList uIBlockList = obj2 instanceof UIBlockList ? (UIBlockList) obj2 : null;
                if (uIBlockList == null) {
                    if (BuildInfo.h()) {
                        throw new RuntimeException(go9.c("Can't find UIBlockList from blocks: ", a));
                    }
                    Serializer.c<UIBlockList> cVar2 = UIBlockList.CREATOR;
                    uIBlockList = UIBlockList.a.a();
                }
                wzs<UIBlockList, CatalogExtendedData, s3q0> wzsVar = keaVar.w;
                if (wzsVar != null) {
                    wzsVar.invoke(uIBlockList, hdaVar.b);
                }
                if (keaVar.x) {
                    UIBlockList uIBlockList2 = keaVar.l;
                    ArrayList<UIBlock> arrayList = uIBlockList2 != null ? uIBlockList2.y : null;
                    if (arrayList != null && !arrayList.isEmpty()) {
                        z2 = true;
                    }
                }
                if (z2 && !keaVar.z) {
                    keaVar.c();
                    keaVar.t(uIBlockList);
                    Integer invoke = keaVar.i.b.F.invoke(uIBlockList);
                    CatalogPaginatedListViewHolder catalogPaginatedListViewHolder2 = keaVar.c;
                    if (catalogPaginatedListViewHolder2 != null) {
                        catalogPaginatedListViewHolder2.Cm(invoke);
                    }
                    CatalogPaginatedListViewHolder catalogPaginatedListViewHolder3 = keaVar.c;
                    if (catalogPaginatedListViewHolder3 != null) {
                        catalogPaginatedListViewHolder3.N6(uIBlockList);
                    }
                } else if (z2) {
                    keaVar.q(uIBlockList);
                } else if (keaVar.t(uIBlockList) || epx.f(cVar.j(), "0")) {
                    if (epx.f(cVar.j(), "0")) {
                        keaVar.l = uIBlockList;
                    }
                    Integer invoke2 = keaVar.i.b.F.invoke(uIBlockList);
                    CatalogPaginatedListViewHolder catalogPaginatedListViewHolder4 = keaVar.c;
                    if (catalogPaginatedListViewHolder4 != null) {
                        catalogPaginatedListViewHolder4.Cm(invoke2);
                    }
                    CatalogPaginatedListViewHolder catalogPaginatedListViewHolder5 = keaVar.c;
                    if (catalogPaginatedListViewHolder5 != null) {
                        catalogPaginatedListViewHolder5.N6(uIBlockList);
                    }
                } else {
                    CatalogPaginatedListViewHolder catalogPaginatedListViewHolder6 = keaVar.c;
                    if (catalogPaginatedListViewHolder6 != null) {
                        catalogPaginatedListViewHolder6.N5(uIBlockList);
                    }
                }
                if (z) {
                    keaVar.i.b.f.a(new sa80(uIBlockList));
                    UIBlockList uIBlockList3 = keaVar.l;
                    if (uIBlockList3 != null && (str = uIBlockList3.M) != null) {
                        jge0 jge0Var = keaVar.P;
                        if (epx.f((String) jge0Var.c, str) && (l = (Long) jge0Var.b) != null) {
                            long longValue = l.longValue();
                            jge0Var.b = null;
                            long elapsedRealtime = SystemClock.elapsedRealtime() - longValue;
                            l5m l5mVar = new l5m(null, null, 3);
                            l5mVar.g = new SchemeStat$TypeDevNullItem(DevNullEventKey.CATALOG_PULL_TO_REFRESH_DURATION.h(), null, String.valueOf(elapsedRealtime), null, str, null, "OLD CATALOG PTR DURATION", null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, -86, 3, null);
                            l5mVar.q();
                        }
                    }
                }
                com.vk.lists.c cVar3 = keaVar.d;
                if (cVar3 != null) {
                    cVar3.s(hdaVar.c);
                }
                UIBlockList uIBlockList4 = keaVar.l;
                if (uIBlockList4 != null && (zdaVar = keaVar.s) != null) {
                    zdaVar.k(uIBlockList4);
                }
                return s3q0.a;
        }
    }

    public /* synthetic */ j68(kea keaVar, boolean z, com.vk.lists.c cVar) {
        this.d = keaVar;
        this.c = z;
        this.e = cVar;
    }
}
