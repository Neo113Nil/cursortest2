package xsna;

import android.os.Bundle;
import android.os.Parcelable;
import kotlin.LazyThreadSafetyMode;
import xsna.d2h0;
import xsna.u1h0;
import xsna.uic;
import xsna.v1h0;

/* compiled from: SavedStateInitializerImpl.kt */
/* loaded from: classes3.dex */
public final class u1h0<State extends Parcelable, Instance extends uic & d2h0<State>> implements kzw<Instance> {
    public final String a;
    public final xyt0 b;
    public final z1h0 c;
    public final izs<gzs<? extends State>, Instance> d;
    public final Object e = msy.a(LazyThreadSafetyMode.NONE, new hp30(this, 19));

    /* compiled from: SavedStateInitializerImpl.kt */
    public static final class a<State extends Parcelable, Instance extends uic & d2h0<State>> extends nyt0 {
        public final androidx.lifecycle.w b;
        public final String c;
        public final Instance d;

        public a(androidx.lifecycle.w wVar, String str, izs<? super gzs<? extends State>, ? extends Instance> izsVar) {
            this.b = wVar;
            this.c = str;
            this.d = izsVar.invoke(new so40(this, 18));
            wVar.a.b.put(str, new v1h0.b() { // from class: xsna.t1h0
                @Override // xsna.v1h0.b
                public final Bundle r() {
                    Bundle bundle = new Bundle();
                    u1h0.a aVar = u1h0.a.this;
                    bundle.putParcelable(aVar.c, (Parcelable) ((d2h0) aVar.d).e());
                    return bundle;
                }
            });
        }

        @Override // xsna.nyt0
        public final void h() {
            ((d2h0) this.d).e();
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public u1h0(String str, xyt0 xyt0Var, z1h0 z1h0Var, izs<? super gzs<? extends State>, ? extends Instance> izsVar) {
        this.a = str;
        this.b = xyt0Var;
        this.c = z1h0Var;
        this.d = izsVar;
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, kotlin.Lazy] */
    @Override // xsna.kzw
    public final uic getValue() {
        return (uic) this.e.getValue();
    }
}
