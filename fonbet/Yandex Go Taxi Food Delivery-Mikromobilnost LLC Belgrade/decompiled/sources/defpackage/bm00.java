package defpackage;

import java.util.function.BiFunction;

/* loaded from: classes9.dex */
public final /* synthetic */ class bm00 implements BiFunction {
    public final /* synthetic */ int a;
    public final /* synthetic */ wls b;

    public /* synthetic */ bm00(wls wlsVar, int i) {
        this.a = i;
        this.b = wlsVar;
    }

    @Override // java.util.function.BiFunction
    public final Object apply(Object obj, Object obj2) {
        int i = this.a;
        wls wlsVar = this.b;
        switch (i) {
        }
        return wlsVar.invoke(obj, obj2);
    }
}
