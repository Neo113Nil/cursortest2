package xsna;

import xsna.gw5;

/* compiled from: com.google.android.gms:play-services-base@@18.10.0 */
/* loaded from: classes.dex */
public final class cmz0 implements gw5.a {
    public final /* synthetic */ d9u a;

    public cmz0(d9u d9uVar) {
        this.a = d9uVar;
    }

    @Override // xsna.gw5.a
    public final void a(boolean z) {
        Boolean valueOf = Boolean.valueOf(z);
        d9u d9uVar = this.a;
        d9uVar.o.sendMessage(d9uVar.o.obtainMessage(1, valueOf));
    }
}
