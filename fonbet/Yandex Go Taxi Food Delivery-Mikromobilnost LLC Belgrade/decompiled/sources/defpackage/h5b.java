package defpackage;

import com.squareup.moshi.Moshi;
import com.yandex.messaging.core.net.entities.Metadata;

/* loaded from: classes15.dex */
public final class h5b implements qb7, rb7, e1k {
    public final g5b a;
    public final long b;
    public final String c;
    public final boolean w;
    public final e1k x;
    public final /* synthetic */ l5b y;

    public h5b(l5b l5bVar, g5b g5bVar, long j, String str, int i) {
        boolean z = (i & 16) != 0;
        this.y = l5bVar;
        this.a = g5bVar;
        this.b = j;
        this.c = str;
        this.w = z;
        kse.a(l5bVar.g);
        z83.i();
        l5bVar.a.a(this);
        g5bVar.f(B());
        l5bVar.e.c();
        String str2 = l5bVar.d.c;
        this.x = (!z || str2 == null) ? e1k.M1 : xn21.a(l5bVar.f, str2);
    }

    /* JADX WARN: Code restructure failed: missing block: B:37:0x0073, code lost:
    
        if (r5 == null) goto L37;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Metadata B() {
        Boolean bool;
        long j = this.b;
        boolean z = this.w;
        l5b l5bVar = this.y;
        if (!z) {
            return l5bVar.b.n(j);
        }
        k020 k020Var = l5bVar.b;
        String str = l5bVar.d.c;
        if (str != null) {
            Metadata n = k020Var.n(j);
            Metadata a = k020Var.b.y().a(str, k020Var.i, (Moshi) k020Var.h.get());
            if (n == null && a == null) {
                n = null;
            } else if (n == null) {
                n = a;
            } else if (a != null) {
                Boolean bool2 = n.allowUnsafeMiniapp;
                if (bool2 == null) {
                    bool2 = a.allowUnsafeMiniapp;
                }
                Metadata metadata = new Metadata();
                Metadata.Chatbar chatbar = n.chatbar;
                if (chatbar == null) {
                    chatbar = a.chatbar;
                }
                metadata.chatbar = chatbar;
                Metadata.CallsSettings callsSettings = n.callsSettings;
                if (callsSettings == null) {
                    callsSettings = a.callsSettings;
                }
                metadata.callsSettings = callsSettings;
                String[] strArr = n.complainAction;
                if (strArr == null) {
                    strArr = a.complainAction;
                }
                metadata.complainAction = strArr;
                String str2 = n.miniappUrl;
                if (str2 == null) {
                    str2 = a.miniappUrl;
                }
                metadata.miniappUrl = str2;
                if (bool2 != null) {
                    bool = tga1.e(l5bVar.h) ? bool2 : null;
                }
                bool = Boolean.TRUE;
                metadata.allowUnsafeMiniapp = bool;
                metadata.viewImportantsList = n.viewImportantsList && a.viewImportantsList;
                n = metadata;
            }
            if (n != null) {
                return n;
            }
        }
        return k020Var.n(j);
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public final void close() {
        this.y.a.b(this);
        this.x.close();
    }

    @Override // defpackage.qb7
    public final void e(String str) {
        if (str.equals(this.c)) {
            this.a.f(B());
        }
    }

    @Override // defpackage.rb7
    public final void o(String str) {
        if (str.equals(this.y.d.c) && this.w) {
            this.a.f(B());
        }
    }
}
