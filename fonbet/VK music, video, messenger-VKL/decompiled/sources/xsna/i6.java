package xsna;

import com.vk.dto.common.Good;
import com.vk.ecomm.design.compose.productattaches.ProductVideoAttach;
import com.vk.libvideo.bottomsheet.about.delegate.AboutVideoItem;
import com.vk.libvideo.bottomsheet.about.delegate.f;
import com.vk.stat.scheme.CommonMarketStat$TypeRefSource;
import java.util.LinkedHashMap;
import java.util.LinkedHashSet;
import java.util.List;
import xsna.a4b0;
import xsna.b4;
import xsna.h3b0;

/* compiled from: R8$$SyntheticClass */
/* loaded from: classes2.dex */
public final /* synthetic */ class i6 implements izs {
    public final /* synthetic */ int b;
    public final /* synthetic */ Object c;
    public final /* synthetic */ Object d;
    public final /* synthetic */ Object e;
    public final /* synthetic */ Object f;
    public final /* synthetic */ Object g;

    public /* synthetic */ i6(Object obj, Object obj2, Object obj3, Object obj4, Object obj5, int i) {
        this.b = i;
        this.c = obj;
        this.d = obj2;
        this.e = obj3;
        this.f = obj4;
        this.g = obj5;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // xsna.izs
    public final Object invoke(Object obj) {
        switch (this.b) {
            case 0:
                List list = (List) this.c;
                com.vk.libvideo.bottomsheet.about.delegate.f fVar = (com.vk.libvideo.bottomsheet.about.delegate.f) this.d;
                LinkedHashMap linkedHashMap = (LinkedHashMap) this.e;
                f.a aVar = (f.a) this.f;
                AboutVideoItem.h hVar = (AboutVideoItem.h) this.g;
                ProductVideoAttach productVideoAttach = (ProductVideoAttach) list.get(((Integer) obj).intValue());
                LinkedHashSet linkedHashSet = fVar.e;
                if (!linkedHashSet.contains(productVideoAttach)) {
                    linkedHashSet.add(productVideoAttach);
                    Good good = (Good) linkedHashMap.get(productVideoAttach);
                    if (good != null) {
                        aVar.l.d(new b4.f.b(new rz00(good, CommonMarketStat$TypeRefSource.VIDEO_ATTACHED_ITEMS, null, null, null, null, null, null, null, null, null, null, null, null, null, null, 65532), hVar.m.indexOf(good)));
                    }
                    break;
                } else {
                    break;
                }
            default:
                izs izsVar = (izs) this.c;
                yvj yvjVar = (yvj) this.d;
                wh50 wh50Var = (wh50) this.e;
                dlv0 dlv0Var = (dlv0) this.f;
                String str = (String) this.g;
                if (((Boolean) obj).booleanValue()) {
                    izsVar.invoke(h3b0.e.b);
                } else if (!((Boolean) wh50Var.getValue()).booleanValue()) {
                    myc0.h(yvjVar, null, null, new a4b0.a(dlv0Var, str, null), 3);
                }
                break;
        }
        return s3q0.a;
    }
}
