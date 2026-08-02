package xsna;

import java.io.IOException;
import java.nio.BufferUnderflowException;
import java.nio.ByteBuffer;
import java.nio.charset.Charset;
import java.security.InvalidKeyException;
import java.security.NoSuchAlgorithmException;
import java.security.PublicKey;
import java.security.cert.X509Certificate;
import java.security.interfaces.ECPublicKey;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import java.util.Objects;
import java.util.Optional;
import java.util.Set;
import java.util.concurrent.ConcurrentHashMap;
import java.util.function.Consumer;
import java.util.function.Predicate;
import java.util.stream.Collectors;
import javax.crypto.KeyAgreement;
import one.video.calls.sdk_private.C5381ab;
import one.video.calls.sdk_private.a;
import one.video.calls.sdk_private.aF;
import one.video.calls.sdk_private.ap$a;
import one.video.calls.sdk_private.b;
import one.video.calls.sdk_private.bE;
import one.video.calls.sdk_private.bF;
import one.video.calls.sdk_private.bI;
import one.video.calls.sdk_private.bJ;
import one.video.calls.sdk_private.f;
import one.video.calls.sdk_private.u;
import xsna.zto;

/* compiled from: TlsMessageParser.java */
/* loaded from: classes8.dex */
public final class j {
    public final qw80 a;

    public j(qw80 qw80Var) {
        this.a = qw80Var;
    }

    public final bdy0 a(ByteBuffer byteBuffer, xjz0 xjz0Var, one.video.calls.sdk_private.e eVar) throws one.video.calls.sdk_private.g, IOException {
        int i;
        aF aFVar;
        KeyAgreement keyAgreement;
        byte b = byteBuffer.get();
        int i2 = ((byteBuffer.get() & 255) << 16) | ((byteBuffer.get() & 255) << 8) | (byteBuffer.get() & 255);
        f.d dVar = f.d.client_hello;
        if (b == dVar.i) {
            C5381ab c5381ab = new C5381ab(byteBuffer, this.a);
            if (xjz0Var == null) {
                return c5381ab;
            }
            throw new one.video.calls.sdk_private.q("no client hello expected");
        }
        f.d dVar2 = f.d.server_hello;
        if (b == dVar2.i) {
            fdy0 fdy0Var = new fdy0();
            fdy0Var.d = Collections.EMPTY_LIST;
            int i3 = i2 + 4;
            if (byteBuffer.remaining() < 44) {
                throw new one.video.calls.sdk_private.j("Message too short");
            }
            byteBuffer.getInt();
            byte b2 = byteBuffer.get();
            byte b3 = byteBuffer.get();
            if (b2 != 3 || b3 != 3) {
                throw new one.video.calls.sdk_private.n("Invalid version number (should be 0x0303)");
            }
            byte[] bArr = new byte[32];
            fdy0Var.b = bArr;
            byteBuffer.get(bArr);
            Arrays.equals(fdy0Var.b, fdy0.e);
            int i4 = byteBuffer.get() & 255;
            if (i4 > 32) {
                throw new one.video.calls.sdk_private.j("session id length exceeds 32");
            }
            byteBuffer.get(new byte[i4]);
            final short s = byteBuffer.getShort();
            Arrays.stream(f.b.values()).filter(new Predicate() { // from class: xsna.edy0
                @Override // java.util.function.Predicate
                public final boolean test(Object obj) {
                    return ((f.b) obj).f == s;
                }
            }).findFirst().ifPresent(new q4y0(fdy0Var, 1));
            if (byteBuffer.get() != 0) {
                throw new one.video.calls.sdk_private.j("Legacy compression method must have the value 0");
            }
            fdy0Var.d = bdy0.b(byteBuffer, dVar2, null);
            fdy0Var.a = new byte[i3];
            byteBuffer.get(fdy0Var.a);
            if (xjz0Var != null) {
                one.video.calls.sdk_private.a aVar = (one.video.calls.sdk_private.a) xjz0Var;
                if (aVar.m == a.EnumC2171a.b) {
                    boolean anyMatch = fdy0Var.d.stream().anyMatch(new gqk(0));
                    boolean anyMatch2 = fdy0Var.d.stream().anyMatch(new iqk(0));
                    if (!anyMatch || !anyMatch2) {
                        throw new one.video.calls.sdk_private.p();
                    }
                    if (((Short) fdy0Var.d.stream().filter(new jqk(0)).map(new kqk()).findFirst().get()).shortValue() != 772) {
                        throw new one.video.calls.sdk_private.n("invalid tls version");
                    }
                    if (fdy0Var.d.stream().filter(new lqk(aVar, 0)).anyMatch(new mqk())) {
                        throw new one.video.calls.sdk_private.n("illegal extension in server hello");
                    }
                    Optional<pt50> findFirst = fdy0Var.d.stream().filter(new nqk(0)).findFirst();
                    Optional empty = Optional.empty();
                    if (findFirst.isPresent()) {
                        empty = Optional.of((b.C2172b) findFirst.filter(new oqk(0)).map(new r9i(1)).orElseThrow(new qqk()));
                        if (((b.C2172b) empty.get()).a != aVar.i) {
                            throw new one.video.calls.sdk_private.n("server supplied key share does not match client supported named group");
                        }
                    }
                    Optional<pt50> findFirst2 = fdy0Var.d.stream().filter(new hqk(0)).findFirst();
                    if (!empty.isPresent() && !findFirst2.isPresent()) {
                        throw new one.video.calls.sdk_private.p(" either the pre_shared_key extension or the key_share extension must be present", f.a.missing_extension);
                    }
                    if (findFirst2.isPresent()) {
                        aVar.v = true;
                    }
                    if (!aVar.h.contains(fdy0Var.c)) {
                        throw new one.video.calls.sdk_private.n("cipher suite does not match");
                    }
                    aVar.j = fdy0Var.c;
                    if (aVar.c == null) {
                        aVar.o = new g1t(zto.a(aVar.j));
                        g1t g1tVar = aVar.o;
                        int i5 = zto.a.a[aVar.j.ordinal()];
                        int i6 = 16;
                        if (i5 != 1) {
                            if (i5 == 2 || i5 == 3) {
                                i6 = 32;
                            } else if (i5 != 4 && i5 != 5) {
                                throw new RuntimeException();
                            }
                        }
                        aVar.c = new wgq(g1tVar, null, i6, zto.a(aVar.j));
                        aVar.o.b(aVar.n);
                        wgq wgqVar = aVar.c;
                        g1t g1tVar2 = wgqVar.r;
                        g1tVar2.getClass();
                        wgqVar.a(wgqVar.j, "c e traffic", g1tVar2.c(g1t.f(dVar)), wgqVar.e);
                        aVar.f.getClass();
                    }
                    if (findFirst2.isPresent()) {
                        wgq wgqVar2 = aVar.c;
                        int i7 = ((orn0) findFirst2.get()).a;
                        wgqVar2.f = true;
                    } else {
                        wgq wgqVar3 = aVar.c;
                        if (wgqVar3.i != null && !wgqVar3.f) {
                            wgqVar3.b(new byte[wgqVar3.e]);
                        }
                    }
                    if (empty.isPresent()) {
                        wgq wgqVar4 = aVar.c;
                        wgqVar4.h = aVar.b;
                        wgqVar4.g = ((b.C2172b) empty.get()).a();
                        wgq wgqVar5 = aVar.c;
                        wgqVar5.getClass();
                        try {
                            PublicKey publicKey = wgqVar5.g;
                            if (publicKey instanceof ECPublicKey) {
                                keyAgreement = KeyAgreement.getInstance("ECDH");
                            } else {
                                if (!sw5.e(publicKey)) {
                                    throw new RuntimeException("Unsupported key type");
                                }
                                keyAgreement = KeyAgreement.getInstance("XDH");
                            }
                            keyAgreement.init(wgqVar5.h);
                            keyAgreement.doPhase(wgqVar5.g, true);
                            byte[] generateSecret = keyAgreement.generateSecret();
                            wgqVar5.s = generateSecret;
                            hdy0.a(generateSecret);
                        } catch (InvalidKeyException e) {
                            e = e;
                            throw new RuntimeException("Unsupported crypto: " + e);
                        } catch (NoSuchAlgorithmException e2) {
                            e = e2;
                            throw new RuntimeException("Unsupported crypto: " + e);
                        }
                    }
                    aVar.o.b(fdy0Var);
                    wgq wgqVar6 = aVar.c;
                    byte[] bArr2 = wgqVar6.j;
                    byte[] bArr3 = wgqVar6.c;
                    short s2 = wgqVar6.e;
                    byte[] a = wgqVar6.a(bArr2, "derived", bArr3, s2);
                    hdy0.a(a);
                    byte[] f = wgqVar6.b.f(a, wgqVar6.s);
                    wgqVar6.o = f;
                    hdy0.a(f);
                    g1t g1tVar3 = wgqVar6.r;
                    g1tVar3.getClass();
                    byte[] c = g1tVar3.c(g1t.f(dVar2));
                    byte[] a2 = wgqVar6.a(wgqVar6.o, "c hs traffic", c, s2);
                    wgqVar6.n = a2;
                    hdy0.a(a2);
                    byte[] a3 = wgqVar6.a(wgqVar6.o, "s hs traffic", c, s2);
                    wgqVar6.m = a3;
                    hdy0.a(a3);
                    byte[] bArr4 = wgqVar6.n;
                    short s3 = wgqVar6.d;
                    Charset charset = wgq.u;
                    hdy0.a(wgqVar6.a(bArr4, "key", "".getBytes(charset), s3));
                    hdy0.a(wgqVar6.a(wgqVar6.m, "key", "".getBytes(charset), s3));
                    hdy0.a(wgqVar6.a(wgqVar6.n, "iv", "".getBytes(charset), (short) 12));
                    hdy0.a(wgqVar6.a(wgqVar6.m, "iv", "".getBytes(charset), (short) 12));
                    aVar.m = a.EnumC2171a.c;
                    final bE bEVar = aVar.f;
                    sby0 sby0Var = bEVar.e;
                    one.video.calls.sdk_private.a aVar2 = bEVar.y;
                    f.b bVar = aVar2.j;
                    if (bVar == null) {
                        throw new IllegalStateException("No (valid) server hello received yet");
                    }
                    synchronized (sby0Var) {
                        sby0Var.a = bVar;
                        aFVar = aF.c;
                        sby0Var.c(aFVar, bVar, sby0Var.b.a);
                        wgq wgqVar7 = aVar2.c;
                        if (wgqVar7 == null) {
                            throw new IllegalStateException("Traffic secret not yet available");
                        }
                        ((qby0) sby0Var.f[aFVar.ordinal()]).d(wgqVar7.n);
                        wgq wgqVar8 = aVar2.c;
                        if (wgqVar8 == null) {
                            throw new IllegalStateException("Traffic secret not yet available");
                        }
                        ((qby0) sby0Var.g[aFVar.ordinal()]).d(wgqVar8.m);
                        if (sby0Var.h) {
                            sby0Var.b("HANDSHAKE_TRAFFIC_SECRET", aFVar);
                        }
                    }
                    bEVar.i = aFVar;
                    synchronized (bEVar.g) {
                        try {
                            one.video.calls.sdk_private.bv bvVar = bEVar.f;
                            one.video.calls.sdk_private.bv bvVar2 = one.video.calls.sdk_private.bv.b;
                            if ((bvVar.ordinal() < bvVar2.ordinal() ? 1 : 0) != 0) {
                                bEVar.f = bvVar2;
                                bEVar.h.forEach(new Consumer() { // from class: xsna.yfy0
                                    @Override // java.util.function.Consumer
                                    public final void accept(Object obj) {
                                        ((uhy0) obj).a(bE.this.f);
                                    }
                                });
                            }
                        } catch (Throwable th) {
                            throw th;
                        }
                    }
                    bEVar.k.add(new kyc(bEVar, 13));
                    return fdy0Var;
                }
            }
            return fdy0Var;
        }
        if (b == f.d.encrypted_extensions.i) {
            vcy0 vcy0Var = new vcy0();
            int i8 = i2 + 4;
            qw80 qw80Var = this.a;
            if (byteBuffer.remaining() < 6) {
                throw new one.video.calls.sdk_private.j("Message too short");
            }
            int position = byteBuffer.position();
            int i9 = byteBuffer.getInt() & 16777215;
            if (byteBuffer.remaining() < i9 || i9 < 2) {
                throw new one.video.calls.sdk_private.j("Incorrect message length");
            }
            vcy0Var.a = bdy0.b(byteBuffer, dVar2, qw80Var);
            vcy0Var.b = new byte[i8];
            byteBuffer.get(vcy0Var.b);
            if (xjz0Var != null) {
                one.video.calls.sdk_private.a aVar3 = (one.video.calls.sdk_private.a) xjz0Var;
                if (eVar != one.video.calls.sdk_private.e.b) {
                    throw new one.video.calls.sdk_private.q("incorrect protection level");
                }
                if (aVar3.m != a.EnumC2171a.c) {
                    throw new one.video.calls.sdk_private.q("unexpected encrypted extensions message");
                }
                if (!vcy0Var.a.stream().filter(new vqk(0)).allMatch(new wqk((List) aVar3.l.stream().map(new uqk(0)).collect(Collectors.toList()), 0))) {
                    throw new one.video.calls.sdk_private.r("extension response to missing request");
                }
                if (((Set) vcy0Var.a.stream().map(new xqk(0)).collect(Collectors.toSet())).size() != vcy0Var.a.size()) {
                    throw new one.video.calls.sdk_private.r("duplicate extensions not allowed");
                }
                aVar3.o.b(vcy0Var);
                aVar3.m = aVar3.v ? a.EnumC2171a.g : a.EnumC2171a.d;
                bE bEVar2 = aVar3.f;
                List<pt50> list = vcy0Var.a;
                bEVar2.getClass();
                for (pt50 pt50Var : list) {
                    if (pt50Var instanceof sb00) {
                        bEVar2.Q = bE.c.c;
                    } else if (pt50Var instanceof one.video.calls.sdk_private.y) {
                        try {
                            one.video.calls.sdk_private.u uVar = ((one.video.calls.sdk_private.y) pt50Var).d;
                            bEVar2.x(uVar);
                            byte[] bArr5 = uVar.n;
                            if (bArr5 == null || uVar.a == null) {
                                i = r8;
                                if (bArr5 == null) {
                                    bEVar2.m(ap$a.TRANSPORT_PARAMETER_ERROR.n, "missing initial_source_connection_id transport parameter");
                                } else {
                                    bEVar2.m(ap$a.TRANSPORT_PARAMETER_ERROR.n, "missing original_destination_connection_id transport parameter");
                                }
                            } else {
                                hby0 hby0Var = bEVar2.G.e;
                                if (!Arrays.equals(hby0Var != null ? hby0Var.b : new byte[r8], uVar.n)) {
                                    bEVar2.m(ap$a.PROTOCOL_VIOLATION.n, "initial_source_connection_id transport parameter does not match");
                                } else if (Arrays.equals(bEVar2.G.g, uVar.a)) {
                                    if (bEVar2.d == bF.g.b) {
                                        u.b bVar2 = uVar.r;
                                        if (bVar2 != null && bVar2.a.equals(bEVar2.a.a)) {
                                            bEVar2.d = bF.g.c;
                                            kgy0 kgy0Var = bEVar2.H;
                                            lgy0 lgy0Var = bEVar2.a;
                                            Objects.toString(kgy0Var);
                                            Objects.toString(lgy0Var);
                                        }
                                        Objects.toString(bEVar2.a);
                                        Objects.toString(bVar2);
                                        bEVar2.m(ap$a.VERSION_NEGOTIATION_ERROR.n, "Chosen version does not match packet version");
                                    }
                                    bEVar2.M = uVar;
                                    if (bEVar2.o == null) {
                                        i = r8;
                                        bEVar2.o = new vjy0(bI.a, bEVar2.M.c, bEVar2.M.d, bEVar2.M.e, bEVar2.M.f, bEVar2.c);
                                        bEVar2.E.d = bEVar2.o;
                                    } else {
                                        i = r8;
                                        bEVar2.o.c(bEVar2.M);
                                    }
                                    jey0 jey0Var = bEVar2.G;
                                    int i10 = bEVar2.M.m;
                                    jey0Var.getClass();
                                    jey0Var.h = Integer.min(i10, 6);
                                    bEVar2.d(bEVar2.F.b, bEVar2.M.b);
                                    jey0 jey0Var2 = bEVar2.G;
                                    byte[] bArr6 = bEVar2.M.q;
                                    ConcurrentHashMap concurrentHashMap = jey0Var2.e.a;
                                    Integer valueOf = Integer.valueOf(i);
                                    gey0 gey0Var = (gey0) concurrentHashMap.get(valueOf);
                                    concurrentHashMap.put(valueOf, new gey0(gey0Var.a, gey0Var.b, gey0Var.c, bArr6));
                                    if (bEVar2.W) {
                                        if (bEVar2.M.o != null) {
                                            if (Arrays.equals(bEVar2.G.i, bEVar2.M.o)) {
                                            }
                                        }
                                        throw new bJ(ap$a.TRANSPORT_PARAMETER_ERROR, "incorrect retry_source_connection_id transport parameter");
                                    }
                                    if (bEVar2.M.o != null) {
                                        throw new bJ(ap$a.TRANSPORT_PARAMETER_ERROR, "unexpected retry_source_connection_id transport parameter");
                                    }
                                    bEVar2.o(bEVar2.M);
                                } else {
                                    bEVar2.m(ap$a.PROTOCOL_VIOLATION.n, "original_destination_connection_id transport parameter does not match");
                                }
                                i = r8;
                            }
                            r8 = i;
                        } catch (bJ e3) {
                            throw new one.video.calls.sdk_private.g("Invalid transport parameters", e3);
                        }
                    } else {
                        continue;
                    }
                }
            }
            return vcy0Var;
        }
        f.d dVar3 = f.d.certificate;
        if (b == dVar3.i) {
            s4y0 s4y0Var = new s4y0();
            s4y0Var.c = new ArrayList();
            int position2 = byteBuffer.position();
            int a4 = s4y0Var.a(byteBuffer, dVar3, 13);
            try {
                int i11 = byteBuffer.get() & 255;
                if (i11 > 0) {
                    byte[] bArr7 = new byte[i11];
                    s4y0Var.a = bArr7;
                    byteBuffer.get(bArr7);
                } else {
                    s4y0Var.a = new byte[0];
                }
                s4y0Var.e(byteBuffer);
                s4y0Var.d = new byte[a4 + 4];
                byteBuffer.get(s4y0Var.d);
                if (xjz0Var == null) {
                    return s4y0Var;
                }
                one.video.calls.sdk_private.a aVar4 = (one.video.calls.sdk_private.a) xjz0Var;
                if (eVar != one.video.calls.sdk_private.e.b) {
                    throw new one.video.calls.sdk_private.q("incorrect protection level");
                }
                a.EnumC2171a enumC2171a = aVar4.m;
                if (enumC2171a != a.EnumC2171a.e && enumC2171a != a.EnumC2171a.d) {
                    throw new one.video.calls.sdk_private.q("unexpected certificate message");
                }
                if (s4y0Var.a.length > 0) {
                    throw new one.video.calls.sdk_private.n("certificate request context should be zero length");
                }
                X509Certificate x509Certificate = s4y0Var.b;
                if (x509Certificate == null) {
                    throw new one.video.calls.sdk_private.n("missing certificate");
                }
                aVar4.q = x509Certificate;
                aVar4.r = s4y0Var.c;
                aVar4.o.e(s4y0Var);
                aVar4.m = a.EnumC2171a.f;
                return s4y0Var;
            } catch (BufferUnderflowException unused) {
                throw new one.video.calls.sdk_private.j("message underflow");
            }
        }
        f.d dVar4 = f.d.certificate_request;
        if (b == dVar4.i) {
            x5y0 x5y0Var = new x5y0();
            int position3 = byteBuffer.position();
            int a5 = x5y0Var.a(byteBuffer, dVar4, 7);
            int i12 = byteBuffer.get();
            byte[] bArr8 = new byte[i12];
            if (i12 > 0) {
                byteBuffer.get(bArr8);
            }
            x5y0Var.a = bdy0.b(byteBuffer, dVar4, null);
            if (byteBuffer.position() - (position3 + 4) != a5) {
                throw new one.video.calls.sdk_private.j("inconsistent length");
            }
            x5y0Var.b = new byte[a5 + 4];
            byteBuffer.get(x5y0Var.b);
            if (xjz0Var == null) {
                return x5y0Var;
            }
            one.video.calls.sdk_private.a aVar5 = (one.video.calls.sdk_private.a) xjz0Var;
            if (eVar != one.video.calls.sdk_private.e.b) {
                throw new one.video.calls.sdk_private.q("incorrect protection level");
            }
            if (aVar5.m != a.EnumC2171a.d) {
                throw new one.video.calls.sdk_private.q("unexpected certificate request message");
            }
            aVar5.z = (List) x5y0Var.a.stream().filter(new yqk(0)).findFirst().map(new zqk()).orElseThrow(new ark());
            aVar5.o.b(x5y0Var);
            aVar5.x = (List) x5y0Var.a.stream().filter(new hn6(1)).findFirst().map(new fqk(0)).orElse(Collections.EMPTY_LIST);
            aVar5.w = true;
            aVar5.m = a.EnumC2171a.e;
            return x5y0Var;
        }
        f.d dVar5 = f.d.certificate_verify;
        if (b == dVar5.i) {
            fcy0 fcy0Var = new fcy0();
            int i13 = i2 + 4;
            int position4 = byteBuffer.position();
            int a6 = fcy0Var.a(byteBuffer, dVar5, 9);
            try {
                fcy0Var.a = (f.g) Arrays.stream(f.g.values()).filter(new uuy0(byteBuffer.getShort())).findFirst().orElse(null);
                byte[] bArr9 = new byte[byteBuffer.getShort() & 65535];
                fcy0Var.b = bArr9;
                byteBuffer.get(bArr9);
                if (byteBuffer.position() - position4 != a6 + 4) {
                    throw new one.video.calls.sdk_private.j("Incorrect message length");
                }
                fcy0Var.c = new byte[i13];
                byteBuffer.get(fcy0Var.c);
                if (xjz0Var != null) {
                    ((one.video.calls.sdk_private.a) xjz0Var).f(fcy0Var, eVar);
                }
                return fcy0Var;
            } catch (BufferUnderflowException unused2) {
                throw new one.video.calls.sdk_private.j("message underflow");
            }
        }
        f.d dVar6 = f.d.finished;
        if (b == dVar6.i) {
            xcy0 xcy0Var = new xcy0();
            byte[] bArr10 = new byte[xcy0Var.a(byteBuffer, dVar6, 36)];
            xcy0Var.a = bArr10;
            byteBuffer.get(bArr10);
            byte[] bArr11 = new byte[i2 + 4];
            xcy0Var.b = bArr11;
            byteBuffer.get(bArr11);
            if (xjz0Var != null) {
                ((one.video.calls.sdk_private.a) xjz0Var).g(xcy0Var, eVar);
            }
            return xcy0Var;
        }
        f.d dVar7 = f.d.new_session_ticket;
        if (b != dVar7.i) {
            throw new one.video.calls.sdk_private.g(tgw.b(b, "Invalid/unsupported message type (", ")"));
        }
        cdy0 cdy0Var = new cdy0();
        int a7 = cdy0Var.a(byteBuffer, dVar7, 17);
        int i14 = byteBuffer.getInt();
        cdy0Var.d = i14;
        if (i14 > 604800 || i14 < 0) {
            throw new one.video.calls.sdk_private.n("Invalid ticket lifetime");
        }
        cdy0Var.a = byteBuffer.getInt() & 4294967295L;
        int i15 = a7 - 8;
        byte[] e4 = cdy0.e(byteBuffer, 1, i15, "ticket nonce");
        cdy0Var.c = e4;
        cdy0Var.b = cdy0.e(byteBuffer, 2, i15 - (e4.length + 1), "ticket");
        Iterator it = bdy0.b(byteBuffer, dVar7, null).iterator();
        while (it.hasNext()) {
            pt50 pt50Var2 = (pt50) it.next();
            if (pt50Var2 instanceof sb00) {
                if (cdy0Var.e != null) {
                    throw new one.video.calls.sdk_private.j("repeated extension is not allowed");
                }
                cdy0Var.e = (sb00) pt50Var2;
            }
        }
        if (xjz0Var != null) {
            ((one.video.calls.sdk_private.a) xjz0Var).h(cdy0Var, eVar);
        }
        return cdy0Var;
    }
}
