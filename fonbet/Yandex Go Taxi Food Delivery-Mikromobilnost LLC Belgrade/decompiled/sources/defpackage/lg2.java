package defpackage;

import androidx.compose.runtime.g;
import com.yandex.mob.utils.a;
import com.yandex.quark.utils.Disposable;
import com.yandex.quark.webchat.js.d;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.Set;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.jvm.internal.Ref$ObjectRef;

/* loaded from: classes.dex */
public final class lg2 implements vpr {
    public final /* synthetic */ int a;
    public final /* synthetic */ Object b;
    public final /* synthetic */ Object c;
    public final /* synthetic */ Object w;

    public /* synthetic */ lg2(int i, Object obj, Object obj2, Object obj3) {
        this.a = i;
        this.b = obj;
        this.c = obj2;
        this.w = obj3;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r15v11, types: [T, java.lang.Object, mo20] */
    @Override // defpackage.vpr
    public final Object emit(Object obj, Continuation continuation) {
        int i = this.a;
        zy11 zy11Var = zy11.a;
        Object obj2 = this.w;
        Object obj3 = this.c;
        Object obj4 = this.b;
        switch (i) {
            case 0:
                zx01 zx01Var = (zx01) obj3;
                ((g) ((w6f0) obj4)).setValue(Boolean.valueOf(((Boolean) obj).booleanValue() ? ((Boolean) ((wls) ((m3u0) obj2).getValue()).invoke(zx01Var.c(), zx01Var.d.getValue())).booleanValue() : false));
                return zy11Var;
            case 1:
                ?? r15 = (mo20) obj;
                vpr vprVar = (vpr) obj2;
                a aVar = (a) obj3;
                Ref$ObjectRef ref$ObjectRef = (Ref$ObjectRef) obj4;
                if (!(r15 instanceof mo20)) {
                    w511.b();
                    return null;
                }
                mo20 mo20Var = (mo20) ref$ObjectRef.element;
                if (mo20Var != null) {
                    double d = mo20Var.a;
                    double d2 = mo20Var.b;
                    double d3 = r15.a;
                    double d4 = r15.b;
                    aVar.getClass();
                    double radians = Math.toRadians(d3 - d);
                    double pow = (Math.pow(Math.sin(Math.toRadians(d4 - d2) / 2.0d), 2.0d) * Math.cos(Math.toRadians(d3)) * Math.cos(Math.toRadians(d))) + Math.pow(Math.sin(radians / 2.0d), 2.0d);
                    if (Math.atan2(Math.sqrt(pow), Math.sqrt(1.0d - pow)) * 2.0d * 6371000.0d < 5000.0d) {
                        return zy11Var;
                    }
                }
                ref$ObjectRef.element = r15;
                Object emit = vprVar.emit(r15, continuation);
                return emit == CoroutineSingletons.COROUTINE_SUSPENDED ? emit : zy11Var;
            default:
                Set set = (Set) obj;
                LinkedHashMap linkedHashMap = (LinkedHashMap) obj4;
                Iterator it = v4r0.g(linkedHashMap.keySet(), set).iterator();
                while (it.hasNext()) {
                    Disposable disposable = (Disposable) linkedHashMap.remove(it.next());
                    if (disposable != null) {
                        disposable.dispose();
                    }
                }
                for (Object obj5 : v4r0.g(set, linkedHashMap.keySet())) {
                    linkedHashMap.put(obj5, (Disposable) ((lyj0) ((d) obj3).b.b((uc41) obj2, (u28) obj5)).a);
                }
                return zy11Var;
        }
    }
}
