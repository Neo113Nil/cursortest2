package xsna;

import java.nio.ByteBuffer;
import java.util.function.Function;

/* compiled from: R8$$SyntheticClass */
/* loaded from: classes8.dex */
public final /* synthetic */ class tby0 implements Function {
    public final /* synthetic */ wby0 a;

    public /* synthetic */ tby0(wby0 wby0Var) {
        this.a = wby0Var;
    }

    @Override // java.util.function.Function
    public final Object apply(Object obj) {
        wby0 wby0Var = this.a;
        int intValue = ((Integer) obj).intValue();
        int i = wby0Var.m - wby0Var.l;
        int min = Integer.min(i, intValue - 10);
        if (min == 0) {
            return null;
        }
        if (min < i) {
            wby0Var.e.b(new tby0(wby0Var), 10, wby0Var.b, new uby0(wby0Var, 0));
        }
        byte[] bArr = new byte[min];
        int i2 = 0;
        while (i2 < min) {
            int min2 = Integer.min(min - i2, ((ByteBuffer) wby0Var.j.get(0)).remaining());
            ((ByteBuffer) wby0Var.j.get(0)).get(bArr, i2, min2);
            if (((ByteBuffer) wby0Var.j.get(0)).remaining() == 0) {
                wby0Var.j.remove(0);
            }
            i2 += min2;
        }
        kgy0 kgy0Var = wby0Var.a.a;
        long j = wby0Var.l;
        one.video.calls.sdk_private.c cVar = new one.video.calls.sdk_private.c();
        cVar.b = j;
        cVar.d = bArr;
        cVar.c = min;
        ByteBuffer allocate = ByteBuffer.allocate(min + 12);
        alk.d(6, allocate);
        alk.g(j, allocate);
        alk.d(min, allocate);
        allocate.put(bArr);
        byte[] bArr2 = new byte[allocate.position()];
        allocate.get(bArr2);
        wby0Var.l += min;
        return cVar;
    }
}
