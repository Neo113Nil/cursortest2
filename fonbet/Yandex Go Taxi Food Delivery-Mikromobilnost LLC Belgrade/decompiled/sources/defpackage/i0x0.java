package defpackage;

import android.os.Looper;
import com.yandex.messaging.internal.authorized.sync.g;
import java.util.ArrayList;

/* loaded from: classes15.dex */
public final class i0x0 implements e1k {
    public final boolean a;
    public final boolean b;
    public final /* synthetic */ g c;

    public i0x0(g gVar, boolean z, boolean z2) {
        this.c = gVar;
        this.a = z;
        this.b = z2;
        gVar.T.b(this);
        if (z) {
            sgx sgxVar = gVar.z;
            if (!sgxVar.B && !sgxVar.A) {
                sgxVar.y.a();
                sgxVar.F = new dhv(15, sgxVar);
                sgxVar.a();
            }
        }
        if (!z2 || gVar.V || gVar.U != null || gVar.y.d == null) {
            return;
        }
        gVar.d();
    }

    /* JADX WARN: Code restructure failed: missing block: B:23:0x0071, code lost:
    
        if (r7 == null) goto L33;
     */
    /* JADX WARN: Code restructure failed: missing block: B:24:0x0073, code lost:
    
        r1.z.d();
     */
    /* JADX WARN: Code restructure failed: missing block: B:26:0x007c, code lost:
    
        if (r2.isEmpty() == false) goto L71;
     */
    /* JADX WARN: Code restructure failed: missing block: B:27:0x007e, code lost:
    
        r1.P.reportEvent("tech_sync_socket_close");
        r1.E.a();
        r0 = r1.F;
        r2 = r0.c;
        r7 = ((java.lang.Number) androidx.room.util.a.b(r2.Y().a, true, false, new defpackage.rfa(24))).longValue();
        r9 = ((java.lang.Number) androidx.room.util.a.b(r2.c().a, true, false, new defpackage.teb(2))).longValue();
        r3 = r0.a;
        r0 = r0.b;
        r11 = r0.a.t();
        r0 = r0.b;
        r13 = r0.l;
     */
    /* JADX WARN: Code restructure failed: missing block: B:28:0x00c9, code lost:
    
        if (r13 != null) goto L38;
     */
    /* JADX WARN: Code restructure failed: missing block: B:29:0x00cb, code lost:
    
        r13 = null;
     */
    /* JADX WARN: Code restructure failed: missing block: B:30:0x00cc, code lost:
    
        r13 = r13.getDatabasePath(r0.D0().getDatabaseName()).length();
        r15 = r0.l;
     */
    /* JADX WARN: Code restructure failed: missing block: B:31:0x00de, code lost:
    
        if (r15 != null) goto L41;
     */
    /* JADX WARN: Code restructure failed: missing block: B:32:0x00e0, code lost:
    
        r15 = null;
     */
    /* JADX WARN: Code restructure failed: missing block: B:33:0x00e1, code lost:
    
        r0 = r15.getDatabasePath(r0.D0().getDatabaseName() + "-wal");
     */
    /* JADX WARN: Code restructure failed: missing block: B:34:0x0102, code lost:
    
        if (r0.exists() == false) goto L44;
     */
    /* JADX WARN: Code restructure failed: missing block: B:35:0x0105, code lost:
    
        r0 = null;
     */
    /* JADX WARN: Code restructure failed: missing block: B:36:0x0106, code lost:
    
        r16 = 0;
     */
    /* JADX WARN: Code restructure failed: missing block: B:37:0x0108, code lost:
    
        if (r0 == null) goto L48;
     */
    /* JADX WARN: Code restructure failed: missing block: B:38:0x010a, code lost:
    
        r18 = r0.length();
     */
    /* JADX WARN: Code restructure failed: missing block: B:39:0x0111, code lost:
    
        r3.reportEvent("cache size", kotlin.collections.b.i(new kotlin.Pair("db size", java.lang.Long.valueOf((r13 + r18) + r11)), new kotlin.Pair("number of chats", java.lang.Long.valueOf(r7)), new kotlin.Pair("number of hidden chats", java.lang.Long.valueOf(r9)), new kotlin.Pair("factor of hidden chats", java.lang.Float.valueOf(r9 / r7)), new kotlin.Pair("number of threads", java.lang.Long.valueOf(((java.lang.Number) androidx.room.util.a.b(r2.Y().a, true, false, new defpackage.rfa(28))).longValue())), new kotlin.Pair("number of messages", java.lang.Long.valueOf(((java.lang.Number) androidx.room.util.a.b(r2.b().a, true, false, new defpackage.rv10(4))).longValue()))));
        r0 = r1.G;
        r2 = r0.c;
        r3 = r0.w;
        defpackage.z83.g(null, r3.getLooper(), android.os.Looper.myLooper());
        r4 = new java.util.HashMap();
        r5 = r0.d();
        r4.put(com.yandex.messaging.core.net.entities.BackendConfig.Restrictions.ENABLED, java.lang.Boolean.valueOf(r5));
     */
    /* JADX WARN: Code restructure failed: missing block: B:40:0x01c3, code lost:
    
        if (r5 == false) goto L56;
     */
    /* JADX WARN: Code restructure failed: missing block: B:41:0x01c5, code lost:
    
        defpackage.z83.g(null, r3.getLooper(), android.os.Looper.myLooper());
        r4.put("logout_token", r2.getString("logout_token", null));
        defpackage.z83.g(null, r3.getLooper(), android.os.Looper.myLooper());
        r2 = r2.getString("push_token", null);
     */
    /* JADX WARN: Code restructure failed: missing block: B:42:0x01ea, code lost:
    
        if (r2 != null) goto L54;
     */
    /* JADX WARN: Code restructure failed: missing block: B:43:0x01ed, code lost:
    
        r2 = r2.getBytes();
        r16 = defpackage.drb1.e(r2.length, r2);
     */
    /* JADX WARN: Code restructure failed: missing block: B:44:0x01f6, code lost:
    
        r4.put("token_hash", java.lang.Long.valueOf(r16));
     */
    /* JADX WARN: Code restructure failed: missing block: B:45:0x01ff, code lost:
    
        r0.B.reportEvent("cloud push", r4);
        r0 = r1.a;
        r0.J.unregisterContentObserver(r0.L);
     */
    /* JADX WARN: Code restructure failed: missing block: B:46:0x0215, code lost:
    
        if (defpackage.ydz.a.a() == false) goto L59;
     */
    /* JADX WARN: Code restructure failed: missing block: B:47:0x0217, code lost:
    
        defpackage.ydz.a();
     */
    /* JADX WARN: Code restructure failed: missing block: B:48:0x021a, code lost:
    
        r0 = (defpackage.zbf) r1.O.get();
        r1 = r0.g;
        r2 = defpackage.zbf.h;
        r3 = r2[0];
     */
    /* JADX WARN: Code restructure failed: missing block: B:49:0x022e, code lost:
    
        if (((defpackage.e1k) r1.a()) != null) goto L62;
     */
    /* JADX WARN: Code restructure failed: missing block: B:50:0x0231, code lost:
    
        r2 = r2[0];
        r1.b(null);
        r0.a("go offline", new kotlin.Pair[0]);
     */
    /* JADX WARN: Code restructure failed: missing block: B:51:0x023e, code lost:
    
        return;
     */
    /* JADX WARN: Code restructure failed: missing block: B:53:?, code lost:
    
        return;
     */
    /* JADX WARN: Code restructure failed: missing block: B:54:0x010f, code lost:
    
        r18 = 0;
     */
    /* JADX WARN: Code restructure failed: missing block: B:55:?, code lost:
    
        return;
     */
    @Override // java.io.Closeable, java.lang.AutoCloseable
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void close() {
        boolean z;
        Object obj;
        g gVar = this.c;
        zq60 zq60Var = gVar.T;
        z83.g(null, gVar.S, Looper.myLooper());
        if (!gVar.B.d.get()) {
            zq60Var.d(this);
            zq60Var.getClass();
            ArrayList arrayList = zq60Var.a;
            zq60Var.b++;
            int size = arrayList.size();
            int i = 0;
            boolean z2 = false;
            while (true) {
                int i2 = i;
                while (i2 < size && arrayList.get(i2) == null) {
                    i2++;
                }
                if (i2 < size) {
                    z = true;
                } else {
                    if (!z2) {
                        zq60.a(zq60Var);
                        z2 = true;
                    }
                    z = false;
                }
                if (!z) {
                    obj = null;
                    break;
                }
                while (i < size && arrayList.get(i) == null) {
                    i++;
                }
                if (i >= size) {
                    if (!z2) {
                        zq60.a(zq60Var);
                    }
                    ny61.p();
                    return;
                } else {
                    int i3 = i + 1;
                    obj = arrayList.get(i);
                    if (((i0x0) obj).a) {
                        break;
                    } else {
                        i = i3;
                    }
                }
            }
        }
    }
}
