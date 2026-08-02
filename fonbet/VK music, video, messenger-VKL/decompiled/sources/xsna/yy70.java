package xsna;

import java.util.LinkedHashSet;
import kotlin.jvm.internal.Lambda;

/* compiled from: OkioStorage.kt */
/* loaded from: classes.dex */
public final class yy70<T> implements mgl0<T> {
    public static final LinkedHashSet f = new LinkedHashSet();
    public static final gqo g = new gqo();
    public final tar a;
    public final ayc0 d;
    public final azc0 b = azc0.a;
    public final wzs<aq90, tar, uax> c = wy70.i;
    public final bpn0 e = new bpn0(new xy70(this));

    /* compiled from: OkioStorage.kt */
    public static final class a extends Lambda implements gzs<s3q0> {
        final /* synthetic */ yy70<T> this$0;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public a(yy70<T> yy70Var) {
            super(0);
            this.this$0 = yy70Var;
        }

        @Override // xsna.gzs
        public final s3q0 invoke() {
            gqo gqoVar = yy70.g;
            yy70<T> yy70Var = this.this$0;
            synchronized (gqoVar) {
                yy70.f.remove(((aq90) yy70Var.e.getValue()).b.A());
            }
            return s3q0.a;
        }
    }

    public yy70(tar tarVar, ayc0 ayc0Var) {
        this.a = tarVar;
        this.d = ayc0Var;
    }

    @Override // xsna.mgl0
    public final ogl0<T> a() {
        String A = ((aq90) this.e.getValue()).b.A();
        synchronized (g) {
            LinkedHashSet linkedHashSet = f;
            if (linkedHashSet.contains(A)) {
                throw new IllegalStateException(("There are multiple DataStores active for the same file: " + A + ". You should either maintain your DataStore as a singleton or confirm that there is no two DataStore's active on the same file (by confirming that the scope is cancelled).").toString());
            }
            linkedHashSet.add(A);
        }
        return new bz70(this.a, (aq90) this.e.getValue(), this.b, this.c.invoke((aq90) this.e.getValue(), this.a), new a(this));
    }
}
