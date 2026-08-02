package xsna;

import android.content.Context;
import java.util.LinkedHashMap;
import java.util.concurrent.Callable;

/* compiled from: R8$$SyntheticClass */
/* loaded from: classes7.dex */
public final /* synthetic */ class ota implements Callable {
    public final /* synthetic */ int b;
    public final /* synthetic */ Object c;

    public /* synthetic */ ota(Object obj, int i) {
        this.b = i;
        this.c = obj;
    }

    @Override // java.util.concurrent.Callable
    public final Object call() {
        int i = this.b;
        Object obj = this.c;
        switch (i) {
            case 0:
                return ((uvs0) obj).invoke();
            default:
                LinkedHashMap linkedHashMap = uyj.a;
                Context context = ((fbl) obj).a;
                bpn0 bpn0Var = t65.a;
                return uyj.a(context, ply.a());
        }
    }
}
