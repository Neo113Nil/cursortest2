package xsna;

import java.util.ArrayList;
import java.util.LinkedHashMap;

/* compiled from: ActivityResultRegistry.kt */
/* loaded from: classes.dex */
public final class nb0 extends hb0<Object> {
    public final /* synthetic */ lb0 a;
    public final /* synthetic */ String b;
    public final /* synthetic */ va0<Object, Object> c;

    public nb0(lb0 lb0Var, String str, va0<Object, Object> va0Var) {
        this.a = lb0Var;
        this.b = str;
        this.c = va0Var;
    }

    @Override // xsna.hb0
    public final void a(Object obj) {
        lb0 lb0Var = this.a;
        ArrayList arrayList = lb0Var.d;
        LinkedHashMap linkedHashMap = lb0Var.b;
        String str = this.b;
        Object obj2 = linkedHashMap.get(str);
        va0<Object, Object> va0Var = this.c;
        if (obj2 == null) {
            throw new IllegalStateException(("Attempting to launch an unregistered ActivityResultLauncher with contract " + va0Var + " and input " + obj + ". You must ensure the ActivityResultLauncher is registered before calling launch().").toString());
        }
        int intValue = ((Number) obj2).intValue();
        arrayList.add(str);
        try {
            lb0Var.b(intValue, va0Var, obj);
        } catch (Exception e) {
            arrayList.remove(str);
            throw e;
        }
    }

    public final void b() {
        this.a.f(this.b);
    }
}
