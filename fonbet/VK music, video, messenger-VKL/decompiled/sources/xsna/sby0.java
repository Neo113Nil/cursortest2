package xsna;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.StandardOpenOption;
import java.util.ArrayList;
import one.video.calls.sdk_private.aF;
import one.video.calls.sdk_private.aP;
import one.video.calls.sdk_private.bI;
import one.video.calls.sdk_private.f;
import ru.ok.proto.rtmp.amf.AmfConstants;

/* compiled from: ConnectionSecrets.java */
/* loaded from: classes8.dex */
public final class sby0 {
    public static final byte[] k = {-81, -65, -20, 40, -103, -109, -46, 76, -98, -105, -122, -15, -100, 97, 17, -32, 67, -112, -88, -103};
    public static final byte[] l = {56, 118, 44, -9, -11, 89, 52, -77, 77, 23, -102, -26, -92, -56, AmfConstants.TYPE_LONG_STRING_MARKER, -83, -52, -69, Byte.MAX_VALUE, 10};
    public static final byte[] m = {AmfConstants.TYPE_UNSUPPORTED_MARKER, -19, -29, -34, -9, 0, -90, -37, -127, -109, -127, -66, 110, 38, -99, -53, -7, -67, 46, -39};
    public f.b a;
    public final lgy0 b;
    public final bI c;
    public final sp d;
    public byte[] e;
    public boolean h;
    public byte[] i;
    public final nby0[] f = new nby0[aF.values().length];
    public final nby0[] g = new nby0[aF.values().length];
    public final boolean[] j = new boolean[aF.values().length];

    public sby0(lgy0 lgy0Var, bI bIVar, sp spVar) {
        this.b = lgy0Var;
        this.c = bIVar;
        this.d = spVar;
    }

    public final synchronized nby0 a(aF aFVar) throws aP {
        nby0 nby0Var;
        try {
            nby0Var = this.c == bI.a ? this.g[aFVar.ordinal()] : this.f[aFVar.ordinal()];
            if (nby0Var == null) {
                throw new aP(aFVar, this.j[aFVar.ordinal()]);
            }
        } catch (Throwable th) {
            throw th;
        }
        return nby0Var;
    }

    public final void b(String str, aF aFVar) {
        ArrayList arrayList = new ArrayList();
        String b = kq01.b(this.e);
        String b2 = kq01.b(((qby0) this.f[aFVar.ordinal()]).c);
        StringBuilder a = xe9.a("CLIENT_", str, " ", b, " ");
        a.append(b2);
        arrayList.add(a.toString());
        String b3 = kq01.b(this.e);
        String b4 = kq01.b(((qby0) this.g[aFVar.ordinal()]).c);
        StringBuilder a2 = xe9.a("SERVER_", str, " ", b3, " ");
        a2.append(b4);
        arrayList.add(a2.toString());
        try {
            Files.write((Path) null, arrayList, StandardOpenOption.APPEND);
        } catch (IOException unused) {
            this.h = false;
        }
    }

    public final void c(aF aFVar, f.b bVar, kgy0 kgy0Var) {
        qby0 rby0Var;
        qby0 rby0Var2;
        if (bVar == f.b.TLS_AES_128_GCM_SHA256) {
            rby0Var = new oby0(kgy0Var, bI.a, this.d);
            rby0Var2 = new oby0(kgy0Var, bI.b, this.d);
        } else if (bVar == f.b.TLS_AES_256_GCM_SHA384) {
            rby0Var = new pby0(kgy0Var, bI.a, this.d);
            rby0Var2 = new pby0(kgy0Var, bI.b, this.d);
        } else {
            if (bVar != f.b.TLS_CHACHA20_POLY1305_SHA256) {
                throw new IllegalStateException("unsupported cipher suite " + bVar);
            }
            rby0Var = new rby0(kgy0Var, bI.a, this.d);
            rby0Var2 = new rby0(kgy0Var, bI.b, this.d);
        }
        this.f[aFVar.ordinal()] = rby0Var;
        if (aFVar != aF.b) {
            this.g[aFVar.ordinal()] = rby0Var2;
        }
        rby0Var.p = rby0Var2;
        rby0Var2.p = rby0Var;
    }

    public final synchronized void d(byte[] bArr) {
        try {
            this.i = bArr;
            kgy0 kgy0Var = this.b.a;
            m6o0 e = m6o0.e();
            boolean z = true;
            if (kgy0Var.a != 1) {
                z = false;
            }
            byte[] f = e.f(z ? l : kgy0Var.b() ? m : k, this.i);
            nby0[] nby0VarArr = this.f;
            aF aFVar = aF.a;
            nby0VarArr[aFVar.ordinal()] = new oby0(kgy0Var, f, bI.a, this.d);
            this.g[aFVar.ordinal()] = new oby0(kgy0Var, f, bI.b, this.d);
        } catch (Throwable th) {
            throw th;
        }
    }

    public final synchronized nby0 e(aF aFVar) throws aP {
        nby0 nby0Var;
        try {
            nby0Var = this.c == bI.a ? this.f[aFVar.ordinal()] : this.g[aFVar.ordinal()];
            if (nby0Var == null) {
                throw new aP(aFVar, this.j[aFVar.ordinal()]);
            }
        } catch (Throwable th) {
            throw th;
        }
        return nby0Var;
    }
}
