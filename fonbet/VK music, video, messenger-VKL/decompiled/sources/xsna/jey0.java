package xsna;

import java.security.SecureRandom;
import java.util.concurrent.ConcurrentHashMap;
import one.video.calls.sdk_private.aB;
import one.video.calls.sdk_private.aF;

/* compiled from: ConnectionIdManager.java */
/* loaded from: classes8.dex */
public final class jey0 {
    public final int a;
    public final one.video.calls.sdk_private.x b;
    public final zfy0 c;
    public final lby0 d;
    public final hby0 e;
    public final byte[] f;
    public final byte[] g;
    public volatile int h = 2;
    public volatile byte[] i;

    public jey0(one.video.calls.sdk_private.x xVar, zfy0 zfy0Var, sp spVar) {
        this.b = xVar;
        lby0 lby0Var = new lby0(null, spVar);
        this.d = lby0Var;
        this.a = lby0Var.d;
        this.f = lby0Var.b;
        this.c = zfy0Var;
        byte[] bArr = new byte[8];
        this.g = bArr;
        new SecureRandom().nextBytes(bArr);
        hby0 hby0Var = new hby0(8, spVar);
        hby0Var.b = bArr;
        hby0Var.a.put(0, new gey0(0, bArr, aB.b));
        this.e = hby0Var;
    }

    public final void a() {
        lby0 lby0Var = this.d;
        ConcurrentHashMap concurrentHashMap = lby0Var.a;
        int intValue = ((Integer) concurrentHashMap.keySet().stream().max(new xlk0(1)).get()).intValue() + 1;
        byte[] bArr = new byte[lby0Var.d];
        lby0Var.c.nextBytes(bArr);
        concurrentHashMap.put(Integer.valueOf(intValue), new gey0(intValue, bArr, aB.a));
        tgy0 tgy0Var = new tgy0();
        tgy0Var.b = intValue;
        tgy0Var.c = 0;
        tgy0Var.d = bArr;
        byte[] bArr2 = new byte[16];
        tgy0Var.e = bArr2;
        tgy0.f.nextBytes(bArr2);
        this.b.f(tgy0Var, aF.d, new hey0(this, 0));
    }
}
