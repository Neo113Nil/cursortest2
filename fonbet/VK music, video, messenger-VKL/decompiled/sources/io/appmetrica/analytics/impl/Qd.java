package io.appmetrica.analytics.impl;

import io.appmetrica.analytics.coreapi.internal.backport.Function;
import io.appmetrica.analytics.coreutils.internal.io.Base64Utils;
import io.appmetrica.analytics.protobuf.nano.MessageNano;
import java.io.Closeable;
import java.io.File;
import java.io.FileInputStream;
import xsna.i7o0;

/* loaded from: classes8.dex */
public final class Qd implements Function {
    public final Sd a;
    public final Pd b;

    public Qd(Sd sd, Pd pd) {
        this.a = sd;
        this.b = pd;
    }

    /* JADX WARN: Removed duplicated region for block: B:13:0x0020 A[Catch: all -> 0x0041, TryCatch #0 {all -> 0x0041, blocks: (B:3:0x0001, B:5:0x0007, B:11:0x0015, B:13:0x0020, B:19:0x002c, B:29:0x001a), top: B:2:0x0001 }] */
    /* JADX WARN: Removed duplicated region for block: B:26:? A[RETURN, SYNTHETIC] */
    @Override // io.appmetrica.analytics.coreapi.internal.backport.Function
    /* renamed from: a, reason: merged with bridge method [inline-methods] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final String apply(File file) {
        byte[] bArr;
        FileInputStream fileInputStream;
        try {
            String absolutePath = file.getAbsolutePath();
            if (absolutePath != null) {
                try {
                    fileInputStream = new FileInputStream(new File(absolutePath));
                } catch (Throwable unused) {
                    fileInputStream = null;
                }
                try {
                    bArr = i7o0.h(fileInputStream);
                    vo.a((Closeable) fileInputStream);
                } catch (Throwable unused2) {
                    vo.a((Closeable) fileInputStream);
                    bArr = null;
                    if (bArr == null) {
                    }
                }
                if (bArr == null) {
                    return null;
                }
                if (bArr.length == 0) {
                    bArr = null;
                }
                if (bArr != null) {
                    return Base64Utils.compressBase64(MessageNano.toByteArray(this.b.fromModel(new Vd(bArr, this.a))));
                }
                return null;
            }
            bArr = null;
            if (bArr == null) {
            }
        } catch (Throwable unused3) {
            return null;
        }
    }
}
