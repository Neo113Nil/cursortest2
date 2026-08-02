package xsna;

import com.vk.catalog2.common.dto.ui.UIBlockSearchQuickFilter;
import com.vk.catalog2.common.ui.mvp.holder.group.CommunitiesCatalogRootVh;
import com.vk.dto.search.SearchQuickFilterItem;
import com.vk.dto.search.SearchQuickInnerFilterItem;
import com.vk.search.params.api.City;
import com.vk.search.params.api.VkGroupsSearchParams;
import java.util.Iterator;
import java.util.List;
import kotlin.jvm.internal.FunctionReferenceImpl;
import kotlin.jvm.internal.Ref$ObjectRef;
import xsna.foa0;

/* compiled from: CommunitiesCatalogRootVh.kt */
/* loaded from: classes16.dex */
public final /* synthetic */ class cog extends FunctionReferenceImpl implements wzs {
    public final /* synthetic */ int b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ cog(int i, Object obj, Class cls, String str, String str2, int i2, int i3) {
        super(i, obj, cls, str, str2, i2);
        this.b = i3;
    }

    /* JADX WARN: Failed to restore switch over string. Please report as a decompilation issue */
    @Override // xsna.wzs
    public final Object invoke(Object obj, Object obj2) {
        Integer num;
        VkGroupsSearchParams.SortType sortType;
        Integer num2;
        boolean h;
        switch (this.b) {
            case 0:
                UIBlockSearchQuickFilter uIBlockSearchQuickFilter = (UIBlockSearchQuickFilter) obj;
                izs izsVar = (izs) obj2;
                CommunitiesCatalogRootVh communitiesCatalogRootVh = (CommunitiesCatalogRootVh) this.receiver;
                VkGroupsSearchParams vkGroupsSearchParams = communitiesCatalogRootVh.C;
                if (uIBlockSearchQuickFilter == null) {
                    vkGroupsSearchParams.reset();
                    izsVar.invoke(Boolean.TRUE);
                } else {
                    SearchQuickFilterItem searchQuickFilterItem = uIBlockSearchQuickFilter.A;
                    List<SearchQuickInnerFilterItem> list = searchQuickFilterItem.n;
                    boolean z = searchQuickFilterItem.h;
                    SearchQuickInnerFilterItem searchQuickInnerFilterItem = (SearchQuickInnerFilterItem) j5g.a0(list);
                    String str = searchQuickFilterItem.d;
                    switch (str.hashCode()) {
                        case -1620378525:
                            if (str.equals("has_services")) {
                                vkGroupsSearchParams.i = !z;
                                break;
                            }
                            break;
                        case -669086178:
                            if (str.equals("only_official")) {
                                vkGroupsSearchParams.g = !z;
                                break;
                            }
                            break;
                        case -208628006:
                            if (str.equals("high_rating")) {
                                vkGroupsSearchParams.h = !z;
                                break;
                            }
                            break;
                        case 3536286:
                            if (str.equals("sort") && searchQuickInnerFilterItem != null && (num = searchQuickInnerFilterItem.f) != null) {
                                int intValue = num.intValue();
                                VkGroupsSearchParams.SortType.Companion.getClass();
                                Iterator<E> it = VkGroupsSearchParams.SortType.h().iterator();
                                while (true) {
                                    if (it.hasNext()) {
                                        sortType = (VkGroupsSearchParams.SortType) it.next();
                                        if (intValue == sortType.i()) {
                                        }
                                    } else {
                                        sortType = VkGroupsSearchParams.n;
                                    }
                                }
                                vkGroupsSearchParams.d = sortType;
                                break;
                            }
                            break;
                        case 59224433:
                            if (str.equals("has_goods")) {
                                vkGroupsSearchParams.j = !z;
                                break;
                            }
                            break;
                        case 140706703:
                            if (str.equals("has_ozon")) {
                                vkGroupsSearchParams.k = !z;
                                break;
                            }
                            break;
                        case 785439855:
                            if (str.equals("city_id") && searchQuickInnerFilterItem != null && (num2 = searchQuickInnerFilterItem.f) != null) {
                                vkGroupsSearchParams.b = new City(num2.intValue(), searchQuickInnerFilterItem.b, null, null, 12, null);
                                break;
                            }
                            break;
                        case 2118846457:
                            if (str.equals("has_delivery")) {
                                vkGroupsSearchParams.l = !z;
                                break;
                            }
                            break;
                    }
                    izsVar.invoke(Boolean.valueOf(vkGroupsSearchParams.I()));
                }
                communitiesCatalogRootVh.B.g = vkGroupsSearchParams.copy();
                return s3q0.a;
            default:
                xwr xwrVar = (xwr) obj;
                xwr xwrVar2 = (xwr) obj2;
                nxr nxrVar = (nxr) this.receiver;
                if (nxrVar.o && (h = xwrVar2.h()) != xwrVar.h()) {
                    izs<Boolean, s3q0> izsVar2 = nxrVar.s;
                    if (izsVar2 != null) {
                        izsVar2.invoke(Boolean.valueOf(h));
                    }
                    if (h) {
                        myc0.h(nxrVar.W1(), null, null, new oxr(nxrVar, null), 3);
                        Ref$ObjectRef ref$ObjectRef = new Ref$ObjectRef();
                        ir70.a(nxrVar, new u14(ref$ObjectRef, nxrVar));
                        foa0 foa0Var = (foa0) ref$ObjectRef.element;
                        nxrVar.u = foa0Var != null ? foa0Var.a() : null;
                        tny tnyVar = nxrVar.v;
                        if (tnyVar != null && tnyVar.e() && nxrVar.m2() != null) {
                            throw null;
                        }
                    } else {
                        foa0.a aVar = nxrVar.u;
                        if (aVar != null) {
                            aVar.release();
                        }
                        nxrVar.u = null;
                        if (nxrVar.m2() != null) {
                            throw null;
                        }
                    }
                    itl.f(nxrVar).R();
                    sg50 sg50Var = nxrVar.r;
                    if (sg50Var != null) {
                        if (h) {
                            pvr pvrVar = nxrVar.t;
                            if (pvrVar != null) {
                                nxrVar.l2(sg50Var, new qvr(pvrVar));
                                nxrVar.t = null;
                            }
                            pvr pvrVar2 = new pvr();
                            nxrVar.l2(sg50Var, pvrVar2);
                            nxrVar.t = pvrVar2;
                        } else {
                            pvr pvrVar3 = nxrVar.t;
                            if (pvrVar3 != null) {
                                nxrVar.l2(sg50Var, new qvr(pvrVar3));
                                nxrVar.t = null;
                            }
                        }
                    }
                }
                return s3q0.a;
        }
    }
}
