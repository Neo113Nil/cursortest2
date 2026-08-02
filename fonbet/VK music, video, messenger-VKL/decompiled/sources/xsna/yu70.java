package xsna;

import android.app.Activity;
import android.graphics.Rect;
import com.unity3d.services.UnityAdsConstants;
import java.util.LinkedHashMap;
import java.util.List;
import kotlin.Pair;
import xsna.hv70;
import xsna.xnt0;
import xsna.yqi;

/* compiled from: R8$$SyntheticClass */
/* loaded from: classes3.dex */
public final /* synthetic */ class yu70 implements wzs {
    public final /* synthetic */ int b;
    public final /* synthetic */ Object c;
    public final /* synthetic */ Object d;
    public final /* synthetic */ Object e;

    public /* synthetic */ yu70(Object obj, izs izsVar, xzs xzsVar, int i, int i2) {
        this.b = i2;
        this.d = obj;
        this.c = izsVar;
        this.e = xzsVar;
    }

    @Override // xsna.wzs
    public final Object invoke(Object obj, Object obj2) {
        Pair pair;
        switch (this.b) {
            case 0:
                ((Integer) obj2).getClass();
                cv70.a((hv70.a) this.d, (izs) this.c, (gzs) this.e, (androidx.compose.runtime.a) obj, ne7.I(385));
                break;
            case 1:
                ((Integer) obj2).getClass();
                com.vk.catalog2.common.ui.mvp.holder.search.section_navigator_vh.a.b((com.vk.catalog2.common.ui.mvp.holder.search.section_navigator_vh.b) this.d, (izs) this.c, (izs) this.e, (androidx.compose.runtime.a) obj, ne7.I(1));
                break;
            case 2:
                ((Integer) obj2).getClass();
                ((lvn0) this.d).i((yqi.a) this.e, (izs) this.c, (androidx.compose.runtime.a) obj, ne7.I(513));
                break;
            case 3:
                gzs gzsVar = (gzs) this.e;
                w6s0 w6s0Var = (w6s0) this.d;
                Activity activity = (Activity) this.c;
                androidx.compose.runtime.a aVar = (androidx.compose.runtime.a) obj;
                int intValue = ((Integer) obj2).intValue();
                if (aVar.t(intValue & 1, (intValue & 3) != 2)) {
                    if (androidx.compose.runtime.b.d()) {
                        androidx.compose.runtime.b.f(-1445872855, intValue, -1, "com.vk.libvideo.bottomsheet.VideoBottomSheetRedesign.VideoBottomSheetScreen.<anonymous> (VideoBottomSheetRedesign.kt:100)");
                    }
                    b5v0.a(gzsVar, null, null, null, kai.c(341935590, new g8k(w6s0Var, activity, gzsVar, 5), aVar), null, false, false, null, aVar, 14180352, 302);
                    if (androidx.compose.runtime.b.d()) {
                        androidx.compose.runtime.b.e();
                    }
                } else {
                    aVar.h();
                }
                break;
            default:
                List<xnt0.b> list = (List) this.d;
                LinkedHashMap linkedHashMap = (LinkedHashMap) this.c;
                xnt0 xnt0Var = (xnt0) this.e;
                Rect rect = (Rect) obj;
                Float f = (Float) obj2;
                Float valueOf = Float.valueOf(UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT);
                for (xnt0.b bVar : list) {
                    Object obj3 = linkedHashMap.get(bVar);
                    if (obj3 == null) {
                        Pair pair2 = new Pair(bVar.getRect(), Float.valueOf(bVar.p()));
                        linkedHashMap.put(bVar, pair2);
                        obj3 = pair2;
                    }
                    Pair pair3 = (Pair) obj3;
                    Rect rect2 = (Rect) pair3.d();
                    float floatValue = ((Number) pair3.g()).floatValue();
                    if (iah0.s(xnt0Var.a.getContext())) {
                        pair = new Pair(valueOf, Float.valueOf(Math.min(-(((1.0f - f.floatValue()) * ((rect2.top - rect.bottom) - floatValue)) + rect2.height()), floatValue)));
                    } else {
                        int right = bVar.getRight() - rect.right;
                        Integer valueOf2 = Integer.valueOf(right);
                        if (right <= 0) {
                            valueOf2 = null;
                        }
                        pair = new Pair(Float.valueOf((-(1.0f - f.floatValue())) * (valueOf2 != null ? valueOf2.intValue() : 0)), valueOf);
                    }
                    float floatValue2 = ((Number) pair.d()).floatValue();
                    float floatValue3 = ((Number) pair.g()).floatValue();
                    bVar.o(floatValue2);
                    bVar.n(floatValue3);
                }
                break;
        }
        return s3q0.a;
    }

    public /* synthetic */ yu70(List list, LinkedHashMap linkedHashMap, xnt0 xnt0Var) {
        this.b = 4;
        this.d = list;
        this.c = linkedHashMap;
        this.e = xnt0Var;
    }

    public /* synthetic */ yu70(gzs gzsVar, w6s0 w6s0Var, Activity activity) {
        this.b = 3;
        this.e = gzsVar;
        this.d = w6s0Var;
        this.c = activity;
    }

    public /* synthetic */ yu70(lvn0 lvn0Var, yqi.a aVar, izs izsVar, int i) {
        this.b = 2;
        this.d = lvn0Var;
        this.e = aVar;
        this.c = izsVar;
    }
}
