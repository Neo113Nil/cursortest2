package io.appmetrica.analytics.impl;

import android.text.TextUtils;
import android.util.Base64;
import io.appmetrica.analytics.protobuf.nano.MessageNano;

/* loaded from: classes8.dex */
public final class Xf implements Do {
    /* JADX WARN: Removed duplicated region for block: B:15:0x0025 A[Catch: all -> 0x004a, TryCatch #0 {all -> 0x004a, blocks: (B:7:0x0009, B:9:0x0011, B:12:0x0015, B:13:0x001c, B:15:0x0025, B:16:0x002c, B:21:0x0043, B:24:0x0028), top: B:6:0x0009 }] */
    /* JADX WARN: Removed duplicated region for block: B:18:0x003f  */
    /* JADX WARN: Removed duplicated region for block: B:24:0x0028 A[Catch: all -> 0x004a, TryCatch #0 {all -> 0x004a, blocks: (B:7:0x0009, B:9:0x0011, B:12:0x0015, B:13:0x001c, B:15:0x0025, B:16:0x002c, B:21:0x0043, B:24:0x0028), top: B:6:0x0009 }] */
    @Override // io.appmetrica.analytics.impl.Do
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final byte[] a(Z8 z8, C5224uh c5224uh) {
        C5298xg c5298xg;
        int ordinal;
        if (!TextUtils.isEmpty(z8.b)) {
            try {
                byte[] decode = Base64.decode(z8.b, 0);
                if (decode != null && decode.length != 0) {
                    c5298xg = new C5298xg(decode);
                    C4835fg c4835fg = new C4835fg();
                    String str = c5298xg.a;
                    c4835fg.a = str != null ? new byte[0] : str.getBytes();
                    c4835fg.c = c5298xg.b;
                    c4835fg.b = c5298xg.c;
                    ordinal = c5298xg.d.ordinal();
                    int i = 1;
                    if (ordinal != 1) {
                        i = 2;
                        if (ordinal != 2) {
                            i = 0;
                        }
                    }
                    c4835fg.d = i;
                    return MessageNano.toByteArray(c4835fg);
                }
                c5298xg = null;
                C4835fg c4835fg2 = new C4835fg();
                String str2 = c5298xg.a;
                c4835fg2.a = str2 != null ? new byte[0] : str2.getBytes();
                c4835fg2.c = c5298xg.b;
                c4835fg2.b = c5298xg.c;
                ordinal = c5298xg.d.ordinal();
                int i2 = 1;
                if (ordinal != 1) {
                }
                c4835fg2.d = i2;
                return MessageNano.toByteArray(c4835fg2);
            } catch (Throwable unused) {
            }
        }
        return new byte[0];
    }
}
