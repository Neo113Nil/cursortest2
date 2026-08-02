package xsna;

import java.util.HashSet;

/* compiled from: com.google.android.play:feature-delivery@@2.1.0 */
/* loaded from: classes.dex */
public final class cn01 implements wn01 {
    public final /* synthetic */ klk0 a;

    public cn01(klk0 klk0Var) {
        this.a = klk0Var;
    }

    @Override // xsna.wn01
    public final HashSet zza() {
        HashSet hashSet;
        klk0 klk0Var = this.a;
        synchronized (klk0Var.c) {
            hashSet = new HashSet(klk0Var.c);
        }
        return hashSet;
    }
}
