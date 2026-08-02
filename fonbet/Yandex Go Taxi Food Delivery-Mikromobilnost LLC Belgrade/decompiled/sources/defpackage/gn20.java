package defpackage;

import java.util.List;
import java.util.Map;
import java.util.function.BiFunction;

/* loaded from: classes8.dex */
public final /* synthetic */ class gn20 implements BiFunction {
    public final /* synthetic */ int a;
    public final /* synthetic */ wls b;

    public /* synthetic */ gn20(wls wlsVar, int i) {
        this.a = i;
        this.b = wlsVar;
    }

    @Override // java.util.function.BiFunction
    public final Object apply(Object obj, Object obj2) {
        int i = this.a;
        wls wlsVar = this.b;
        switch (i) {
            case 0:
                return (Map) ((fn20) wlsVar).invoke(obj, obj2);
            default:
                return (List) ((jid) wlsVar).invoke(obj, obj2);
        }
    }
}
