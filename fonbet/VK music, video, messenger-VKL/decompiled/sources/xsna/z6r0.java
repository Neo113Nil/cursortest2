package xsna;

import android.util.LruCache;

/* compiled from: R8$$SyntheticClass */
/* loaded from: classes14.dex */
public final /* synthetic */ class z6r0 implements izs {
    public final /* synthetic */ boolean b;
    public final /* synthetic */ String c;

    public /* synthetic */ z6r0(boolean z, String str) {
        this.b = z;
        this.c = str;
    }

    @Override // xsna.izs
    public final Object invoke(Object obj) {
        i700 i700Var = (i700) obj;
        if (!this.b) {
            bpn0 bpn0Var = c7r0.a;
            ((LruCache) c7r0.a.getValue()).put(this.c, i700Var);
        }
        return s3q0.a;
    }
}
