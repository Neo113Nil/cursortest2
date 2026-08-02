package xsna;

import xsna.ink;

/* compiled from: CustomHttpDataSource.kt */
/* loaded from: classes8.dex */
public final class jnk implements ink.b {
    public final /* synthetic */ ink.a a;

    public jnk(ink.a aVar) {
        this.a = aVar;
    }

    @Override // xsna.ink.b
    public final void a(String str, String str2) {
        ink.a.InterfaceC3067a interfaceC3067a = this.a.b;
        if (interfaceC3067a != null) {
            interfaceC3067a.a(str, str2);
        }
    }

    @Override // xsna.ink.b
    public final void b(int i) {
        ink.a aVar = this.a;
        if (aVar.d || i <= 0) {
            return;
        }
        aVar.d = true;
        ink.a.InterfaceC3067a interfaceC3067a = aVar.b;
        if (interfaceC3067a != null) {
            interfaceC3067a.b();
        }
    }
}
