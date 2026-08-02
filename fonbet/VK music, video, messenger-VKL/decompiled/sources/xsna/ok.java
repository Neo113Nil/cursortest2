package xsna;

import com.unity3d.services.UnityAdsConstants;
import com.vk.voip.ui.accessibility.AccessibilityEvents;
import java.util.ArrayList;
import java.util.LinkedHashMap;
import java.util.List;
import xsna.tra0;

/* compiled from: R8$$SyntheticClass */
/* loaded from: classes7.dex */
public final /* synthetic */ class ok implements izs {
    public final /* synthetic */ int b = 0;
    public final /* synthetic */ ArrayList c;
    public final /* synthetic */ int d;
    public final /* synthetic */ Object e;
    public final /* synthetic */ Object f;
    public final /* synthetic */ Object g;
    public final /* synthetic */ Object h;
    public final /* synthetic */ Object i;

    public /* synthetic */ ok(AccessibilityEvents accessibilityEvents, ka kaVar, int i, AccessibilityEvents.Event event, ArrayList arrayList, AccessibilityEvents.b bVar, LinkedHashMap linkedHashMap) {
        this.e = accessibilityEvents;
        this.f = kaVar;
        this.d = i;
        this.g = event;
        this.c = arrayList;
        this.h = bVar;
        this.i = linkedHashMap;
    }

    @Override // xsna.izs
    public final Object invoke(Object obj) {
        switch (this.b) {
            case 0:
                AccessibilityEvents accessibilityEvents = (AccessibilityEvents) this.e;
                ka kaVar = (ka) this.f;
                AccessibilityEvents.Event event = (AccessibilityEvents.Event) this.g;
                AccessibilityEvents.b bVar = (AccessibilityEvents.b) this.h;
                LinkedHashMap linkedHashMap = (LinkedHashMap) this.i;
                accessibilityEvents.getClass();
                List<AccessibilityEvents.a> list = (List) obj;
                for (AccessibilityEvents.a aVar : list) {
                    accessibilityEvents.m.put(aVar.a, aVar);
                }
                kaVar.invoke(new AccessibilityEvents.g(this.d, event, this.c, j5g.u0(list, bVar.a), linkedHashMap));
                return s3q0.a;
            default:
                tra0 tra0Var = (tra0) this.e;
                ArrayList arrayList = (ArrayList) this.f;
                y190 y190Var = (y190) this.g;
                o6j o6jVar = (o6j) this.h;
                ztm0 ztm0Var = (ztm0) this.i;
                tra0.a aVar2 = (tra0.a) obj;
                ArrayList arrayList2 = this.c;
                int i = 0;
                for (Object obj2 : arrayList2) {
                    int i2 = i + 1;
                    if (i < 0) {
                        e43.t();
                        throw null;
                    }
                    long j = ((h9x) obj2).a;
                    aVar2.q((tra0) arrayList.get(i), (int) (j >> 32), (int) (j & 4294967295L), UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT);
                    i = i2;
                }
                if (tra0Var != null) {
                    tra0.a.w(aVar2, tra0Var, y190Var.a(o6jVar.a, tra0Var, arrayList2, arrayList, this.d, ztm0Var.getLayoutDirection()));
                }
                return s3q0.a;
        }
    }

    public /* synthetic */ ok(ArrayList arrayList, tra0 tra0Var, ArrayList arrayList2, y190 y190Var, o6j o6jVar, int i, ztm0 ztm0Var) {
        this.c = arrayList;
        this.e = tra0Var;
        this.f = arrayList2;
        this.g = y190Var;
        this.h = o6jVar;
        this.d = i;
        this.i = ztm0Var;
    }
}
