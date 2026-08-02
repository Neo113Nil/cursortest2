package xsna;

import java.security.SecureRandom;
import java.util.List;
import java.util.concurrent.ConcurrentHashMap;
import java.util.stream.Collectors;
import one.video.calls.sdk_private.aB;

/* compiled from: ConnectionIdRegistry.java */
/* loaded from: classes8.dex */
public abstract class aby0 {
    public final ConcurrentHashMap a;
    public volatile byte[] b;
    public final SecureRandom c;
    public final int d;

    public aby0(Integer num, sp spVar) {
        ConcurrentHashMap concurrentHashMap = new ConcurrentHashMap();
        this.a = concurrentHashMap;
        int intValue = num != null ? num.intValue() : 8;
        this.d = intValue;
        SecureRandom secureRandom = new SecureRandom();
        this.c = secureRandom;
        byte[] bArr = new byte[intValue];
        secureRandom.nextBytes(bArr);
        this.b = bArr;
        concurrentHashMap.put(0, new gey0(0, this.b, aB.b));
    }

    public final byte[] a(int i) {
        Integer valueOf = Integer.valueOf(i);
        ConcurrentHashMap concurrentHashMap = this.a;
        if (!concurrentHashMap.containsKey(valueOf)) {
            return null;
        }
        gey0 gey0Var = (gey0) concurrentHashMap.get(Integer.valueOf(i));
        aB aBVar = gey0Var.c;
        aB aBVar2 = aB.d;
        if (aBVar.equals(aBVar2)) {
            return null;
        }
        gey0Var.c = aBVar2;
        return gey0Var.b;
    }

    public final List<byte[]> b() {
        return (List) this.a.values().stream().filter(new z0c0(1)).map(new abr(1)).collect(Collectors.toList());
    }
}
