package com.yandex.go.movista.nfc;

import defpackage.bvf0;
import defpackage.cvw;
import defpackage.d6w;
import defpackage.dtb1;
import defpackage.f73;
import defpackage.ike;
import defpackage.j73;
import defpackage.jl40;
import defpackage.mdh;
import defpackage.n3f;
import defpackage.nyj0;
import defpackage.qhw0;
import defpackage.sjh;
import defpackage.tje;
import defpackage.uyj;
import java.nio.ByteBuffer;
import java.nio.charset.StandardCharsets;
import java.util.Arrays;

/* loaded from: classes12.dex */
public final class a {
    public final ike a;
    public byte[] b;
    public boolean c;

    public a() {
        qhw0 a = jl40.a();
        sjh sjhVar = uyj.a;
        this.a = bvf0.a(cvw.U(a, mdh.b));
    }

    public static byte[] a(byte[] bArr) {
        int[] iArr = n3f.a;
        int i = 65535;
        for (byte b : bArr) {
            i = ((i << 8) ^ n3f.a[((b & 255) ^ (i >>> 8)) & 255]) & 65535;
        }
        return f73.r(bArr, ByteBuffer.allocate(2).putShort((short) i).array());
    }

    public static boolean b(String str, byte[] bArr) {
        String concat = "ccbc".concat(str);
        d6w d6wVar = new d6w(0, 2, 1);
        if (bArr.length > d6wVar.b) {
            return Arrays.equals(dtb1.a(concat), j73.Y(bArr, d6wVar));
        }
        return false;
    }

    public static byte[] f(String str) {
        return dtb1.a("ccbc".concat(str));
    }

    public final byte[] c(byte[] bArr) {
        this.b = bArr;
        return a(f73.r(f73.r(f("ad"), ByteBuffer.allocate(2).putShort((short) bArr.length).array()), bArr));
    }

    public final byte[] d(String str) {
        e(new nyj0(this.c, null, str, 2));
        byte[] bytes = str.getBytes(StandardCharsets.UTF_8);
        return a(f73.r(f73.r(f73.r(f("ee"), new byte[]{1}), ByteBuffer.allocate(2).putShort((short) bytes.length).array()), bytes));
    }

    public final void e(nyj0 nyj0Var) {
        this.b = null;
        tje.N(this.a, null, null, new NfcValidationUseCase$finishWithResult$1(nyj0Var, null), 3);
    }
}
