package xsna;

import java.io.IOException;

/* compiled from: DiskLruCache.kt */
/* loaded from: classes8.dex */
public final class lbn extends c5o0 {
    public final /* synthetic */ jbn e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public lbn(jbn jbnVar, String str) {
        super(str, true);
        this.e = jbnVar;
    }

    @Override // xsna.c5o0
    public final long a() {
        jbn jbnVar = this.e;
        synchronized (jbnVar) {
            if (!jbnVar.m || jbnVar.n) {
                return -1L;
            }
            try {
                jbnVar.y();
            } catch (IOException unused) {
                jbnVar.o = true;
            }
            try {
                if (jbnVar.r()) {
                    jbnVar.w();
                    jbnVar.j = 0;
                }
            } catch (IOException unused2) {
                jbnVar.p = true;
                jbnVar.h = new d8f0(new zd7());
            }
            return -1L;
        }
    }
}
