package xsna;

import androidx.compose.ui.input.pointer.util.VelocityTracker1D;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import com.vk.catalog.mvi.block.CatalogBlockState;
import com.vk.catalog.mvi.section.ui.entity.CatalogBlockData;
import com.vk.dto.common.id.UserId;
import com.vk.stat.scheme.CommonStat$TypeTrackCodeItem;
import com.vk.stat.scheme.CommonVasStat$TypeIvasItemViews;
import com.vk.stat.scheme.SchemeStat$EventItem;
import com.vk.stickers.ContextUser;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import kotlin.Pair;
import xsna.hzp0;

/* compiled from: DifferentialVelocityTracker.kt */
/* loaded from: classes11.dex */
public final class wxm implements u4u0 {
    public final Object b;
    public final Object c;

    public wxm() {
        this.b = new VelocityTracker1D();
        this.c = new VelocityTracker1D();
    }

    public void a(List list, List list2, izs izsVar) {
        ArrayList arrayList = (ArrayList) this.b;
        Iterator it = arrayList.iterator();
        int i = 0;
        while (true) {
            if (!it.hasNext()) {
                i = -1;
                break;
            }
            Object next = it.next();
            if (i < 0) {
                e43.t();
                throw null;
            }
            if (list.contains(izsVar.invoke((CatalogBlockData) next))) {
                break;
            } else {
                i++;
            }
        }
        Integer valueOf = i != -1 ? Integer.valueOf(i) : null;
        if (valueOf != null) {
            int intValue = valueOf.intValue();
            g5g.D(arrayList, true, new isb0(3, list, izsVar));
            List<CatalogBlockState> list3 = list2;
            ArrayList arrayList2 = new ArrayList(c5g.u(list3, 10));
            for (CatalogBlockState catalogBlockState : list3) {
                CatalogBlockData catalogBlockData = (CatalogBlockData) ((LinkedHashMap) this.c).get(catalogBlockState.w());
                if (catalogBlockData != null) {
                    s1a<? super CatalogBlockState> s1aVar = catalogBlockData.c;
                    if (s1aVar != null) {
                        s1aVar.M(catalogBlockState);
                    }
                } else {
                    catalogBlockData = new CatalogBlockData(catalogBlockState);
                }
                arrayList2.add(catalogBlockData);
            }
            arrayList.addAll(intValue, arrayList2);
        }
    }

    @Override // xsna.u4u0
    public void e(int i, Object obj, boolean z) {
        UserId userId;
        hfz hfzVar = (hfz) obj;
        gbf0 gbf0Var = (gbf0) this.c;
        RecyclerView recyclerView = (RecyclerView) this.b;
        if (recyclerView.isAttachedToWindow()) {
            if (gbf0Var.l == null) {
                LinearLayoutManager linearLayoutManager = (LinearLayoutManager) recyclerView.getLayoutManager();
                int v = linearLayoutManager.v();
                int x = linearLayoutManager.x();
                gbf0Var.l = Integer.valueOf((v == -1 || x == -1) ? 0 : (x - v) + 1);
            }
            if (hfzVar instanceof odf0) {
                ArrayList arrayList = new ArrayList();
                CommonVasStat$TypeIvasItemViews.BlockType blockType = CommonVasStat$TypeIvasItemViews.BlockType.LIST;
                arrayList.add(Integer.valueOf(((odf0) hfzVar).b.b));
                String str = gbf0Var.e;
                Long l = null;
                CommonStat$TypeTrackCodeItem commonStat$TypeTrackCodeItem = str != null ? new CommonStat$TypeTrackCodeItem(str) : null;
                Integer valueOf = Integer.valueOf(i);
                Integer num = gbf0Var.l;
                Integer valueOf2 = Integer.valueOf(num != null ? num.intValue() : 0);
                int i2 = 1;
                ContextUser contextUser = gbf0Var.d;
                if (contextUser != null && (userId = contextUser.b) != null) {
                    l = Long.valueOf(userId.b);
                }
                new hzp0.w(new SchemeStat$EventItem(SchemeStat$EventItem.Type.STICKERS, null, null, null, null, null, 62, null), new CommonVasStat$TypeIvasItemViews(CommonVasStat$TypeIvasItemViews.ItemType.STICKER_PACK, arrayList, i2, blockType, null, valueOf, commonStat$TypeTrackCodeItem, valueOf2, l, null, null, null, 3600, null)).a();
            }
        }
    }

    public wxm(RecyclerView recyclerView, gbf0 gbf0Var) {
        this.b = recyclerView;
        this.c = gbf0Var;
    }

    public wxm(ArrayList arrayList) {
        this.b = arrayList;
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        ArrayList arrayList2 = new ArrayList(c5g.u(arrayList, 10));
        Iterator it = arrayList.iterator();
        while (it.hasNext()) {
            CatalogBlockData catalogBlockData = (CatalogBlockData) it.next();
            arrayList2.add(new Pair(catalogBlockData.g().w(), catalogBlockData));
        }
        pn00.p(linkedHashMap, arrayList2);
        this.c = linkedHashMap;
    }
}
