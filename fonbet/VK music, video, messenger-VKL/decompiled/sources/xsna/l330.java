package xsna;

import com.vk.api.generated.account.dto.AccountGetModelsResponseDto;
import com.vk.api.generated.account.dto.AccountModelDto;
import com.vk.log.L;
import com.vk.ml.MLFeatures;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import kotlin.collections.EmptyList;
import xsna.yb00;

/* compiled from: R8$$SyntheticClass */
/* loaded from: classes3.dex */
public final /* synthetic */ class l330 implements izs {
    public final /* synthetic */ com.vk.ml.b b;
    public final /* synthetic */ List c;
    public final /* synthetic */ int d;
    public final /* synthetic */ yb00.b e;
    public final /* synthetic */ ArrayList f;

    public /* synthetic */ l330(com.vk.ml.b bVar, List list, int i, yb00.b bVar2, ArrayList arrayList) {
        this.b = bVar;
        this.c = list;
        this.d = i;
        this.e = bVar2;
        this.f = arrayList;
    }

    @Override // xsna.izs
    public final Object invoke(Object obj) {
        com.vk.ml.b bVar = this.b;
        List<MLFeatures.MLFeature> list = this.c;
        int i = this.d;
        yb00.b bVar2 = this.e;
        ArrayList arrayList = this.f;
        AccountGetModelsResponseDto accountGetModelsResponseDto = (AccountGetModelsResponseDto) obj;
        bVar.c = true;
        List<AccountModelDto> d = accountGetModelsResponseDto.d();
        if (list != null) {
            List<AccountModelDto> list2 = d;
            int e = on00.e(c5g.u(list2, 10));
            if (e < 16) {
                e = 16;
            }
            LinkedHashMap linkedHashMap = new LinkedHashMap(e);
            for (Object obj2 : list2) {
                linkedHashMap.put(rp.a((AccountModelDto) obj2), obj2);
            }
            LinkedHashMap linkedHashMap2 = new LinkedHashMap(linkedHashMap);
            ArrayList arrayList2 = new ArrayList();
            for (MLFeatures.MLFeature mLFeature : list) {
                if (linkedHashMap2.containsKey(mLFeature)) {
                    arrayList2.add(pn00.h(mLFeature, linkedHashMap2));
                    linkedHashMap2.remove(mLFeature);
                }
            }
            Iterator it = linkedHashMap2.values().iterator();
            while (it.hasNext()) {
                arrayList2.add((AccountModelDto) it.next());
            }
            d = arrayList2;
        }
        StringBuilder sb = new StringBuilder("getModelsRequest loaded response=");
        List<AccountModelDto> d2 = accountGetModelsResponseDto.d();
        ArrayList arrayList3 = new ArrayList(c5g.u(d2, 10));
        Iterator<T> it2 = d2.iterator();
        while (it2.hasNext()) {
            arrayList3.add(rp.a((AccountModelDto) it2.next()));
        }
        sb.append(arrayList3);
        sb.append(" prioritizedFeatureDtos=");
        List<AccountModelDto> list3 = d;
        ArrayList arrayList4 = new ArrayList(c5g.u(list3, 10));
        Iterator<T> it3 = list3.iterator();
        while (it3.hasNext()) {
            arrayList4.add(rp.a((AccountModelDto) it3.next()));
        }
        sb.append(arrayList4);
        L.e("ModelsManager", sb.toString());
        j330 j330Var = bVar.d;
        for (zb00 zb00Var : j330Var != null ? j330Var.d(null, null) : EmptyList.b) {
            if (!(list3 instanceof Collection) || !list3.isEmpty()) {
                Iterator<T> it4 = list3.iterator();
                while (it4.hasNext()) {
                    if (brm0.w(((AccountModelDto) it4.next()).g(), zb00Var.a, true)) {
                        break;
                    }
                }
            }
            j330 j330Var2 = bVar.d;
            if (j330Var2 != null) {
                j330Var2.e(zb00Var.a, true);
            }
        }
        bVar.j(d, i, bVar2, arrayList);
        return s3q0.a;
    }
}
