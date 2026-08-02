package xsna;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Set;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import xsna.p4p;

/* compiled from: DefaultEditorRender.kt */
/* loaded from: classes4.dex */
public final class zdl {
    public final t2l a;
    public final yce b;
    public final kbe c;
    public final t98 d;

    public zdl(t2l t2lVar, yce yceVar, kbe kbeVar, t98 t98Var) {
        this.a = t2lVar;
        this.b = yceVar;
        this.c = kbeVar;
        this.d = t98Var;
    }

    /* JADX WARN: Removed duplicated region for block: B:13:0x00ff  */
    /* JADX WARN: Removed duplicated region for block: B:23:0x004b  */
    /* JADX WARN: Removed duplicated region for block: B:9:0x0028  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object a(i4p i4pVar, Map map, Integer num, ContinuationImpl continuationImpl) {
        ydl ydlVar;
        int i;
        zi20 zi20Var;
        h5p renderer;
        g5p g5pVar;
        ota0 ota0Var;
        if (continuationImpl instanceof ydl) {
            ydlVar = (ydl) continuationImpl;
            int i2 = ydlVar.label;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                ydlVar.label = i2 - Integer.MIN_VALUE;
                ydl ydlVar2 = ydlVar;
                Object obj = ydlVar2.result;
                CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
                i = ydlVar2.label;
                ota0 ota0Var2 = null;
                if (i != 0) {
                    kotlin.a.a(obj);
                    kbe kbeVar = this.c;
                    zi20 zi20Var2 = new zi20(kbeVar, "BaseEditorRender");
                    zi20Var2.a("start");
                    Set<f5p> set = ((w3p) this.a.c).g;
                    if (set.isEmpty()) {
                        set = null;
                    }
                    if (set == null) {
                        set = map.keySet();
                    }
                    LinkedHashMap linkedHashMap = ((w3p) this.b.c).c;
                    ydlVar2.L$0 = null;
                    ydlVar2.L$1 = map;
                    ydlVar2.L$2 = null;
                    ydlVar2.L$3 = zi20Var2;
                    ydlVar2.L$4 = null;
                    ydlVar2.label = 1;
                    ArrayList arrayList = new ArrayList();
                    for (f5p f5pVar : set) {
                        d5p d5pVar = (d5p) linkedHashMap.get(f5pVar);
                        if (d5pVar != null && (renderer = d5pVar.getRenderer()) != null && (g5pVar = (g5p) map.get(f5pVar)) != null) {
                            arrayList.add(new p4p.a(f5pVar, renderer, g5pVar));
                        }
                    }
                    p4p p4pVar = new p4p(arrayList);
                    Iterator it = linkedHashMap.entrySet().iterator();
                    while (it.hasNext()) {
                        p4pVar = ((d5p) ((Map.Entry) it.next()).getValue()).j(p4pVar);
                    }
                    Object a = p4pVar.a(i4pVar, null, num, new zi20(kbeVar, "BaseEditorRender: Render Pipeline"), ydlVar2);
                    if (a == coroutineSingletons) {
                        return coroutineSingletons;
                    }
                    obj = a;
                    zi20Var = zi20Var2;
                } else {
                    if (i != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    zi20Var = (zi20) ydlVar2.L$3;
                    kotlin.a.a(obj);
                }
                ota0Var = (ota0) obj;
                zi20Var.a("applyRenderer finish in %d ms");
                if (ota0Var != null) {
                    Iterator it2 = ((w3p) ((enh) this.d.b).c).i.iterator();
                    ota0Var2 = ota0Var;
                    while (it2.hasNext()) {
                        ota0Var2 = ((h4p) it2.next()).a(ota0Var2);
                    }
                }
                zi20Var.a("applyPostProcessors finish in %d ms");
                return ota0Var2;
            }
        }
        ydlVar = new ydl(this, continuationImpl);
        ydl ydlVar22 = ydlVar;
        Object obj2 = ydlVar22.result;
        CoroutineSingletons coroutineSingletons2 = CoroutineSingletons.COROUTINE_SUSPENDED;
        i = ydlVar22.label;
        ota0 ota0Var22 = null;
        if (i != 0) {
        }
        ota0Var = (ota0) obj2;
        zi20Var.a("applyRenderer finish in %d ms");
        if (ota0Var != null) {
        }
        zi20Var.a("applyPostProcessors finish in %d ms");
        return ota0Var22;
    }
}
