package one.video.calls.sdk_private;

import com.huawei.hms.framework.network.grs.GrsBaseInfo;
import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.nio.ByteBuffer;
import java.nio.charset.Charset;
import java.nio.charset.StandardCharsets;
import java.security.InvalidAlgorithmParameterException;
import java.security.InvalidKeyException;
import java.security.KeyPair;
import java.security.KeyPairGenerator;
import java.security.KeyStore;
import java.security.KeyStoreException;
import java.security.NoSuchAlgorithmException;
import java.security.PrivateKey;
import java.security.Signature;
import java.security.SignatureException;
import java.security.cert.CertPathBuilderException;
import java.security.cert.CertPathValidatorException;
import java.security.cert.CertificateEncodingException;
import java.security.cert.CertificateException;
import java.security.cert.X509Certificate;
import java.security.spec.ECGenParameterSpec;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Date;
import java.util.List;
import java.util.Objects;
import java.util.Optional;
import java.util.function.Consumer;
import java.util.function.Function;
import java.util.function.Predicate;
import java.util.stream.Collectors;
import java.util.stream.Stream;
import javax.net.ssl.TrustManagerFactory;
import javax.net.ssl.X509TrustManager;
import javax.security.auth.x500.X500Principal;
import one.video.calls.sdk_private.C5381ab;
import one.video.calls.sdk_private.bE;
import one.video.calls.sdk_private.bF;
import one.video.calls.sdk_private.f;
import xsna.ahz0;
import xsna.bjz0;
import xsna.cdy0;
import xsna.dgz0;
import xsna.eqk;
import xsna.fcy0;
import xsna.fq;
import xsna.g1t;
import xsna.gcd0;
import xsna.hdy0;
import xsna.jcz0;
import xsna.p4y0;
import xsna.pqk;
import xsna.q4y0;
import xsna.qby0;
import xsna.qlv;
import xsna.s4y0;
import xsna.sb00;
import xsna.sby0;
import xsna.soy0;
import xsna.tqk;
import xsna.uze;
import xsna.wby0;
import xsna.wgq;
import xsna.xcy0;
import xsna.yto;
import xsna.zto;

/* compiled from: TlsClientEngineImpl.java */
/* loaded from: classes8.dex */
public final class a extends zto implements bjz0 {
    public static final List<f.g> A;
    public static final Charset B;
    public final t e;
    public final bE f;
    public String g;
    public final ArrayList h;
    public f.e i;
    public f.b j;
    public final ArrayList k;
    public ArrayList l;
    public EnumC2171a m;
    public C5381ab n;
    public g1t o;
    public List<f.g> p;
    public X509Certificate q;
    public List<X509Certificate> r;
    public X509TrustManager s;
    public ahz0 t;
    public final ArrayList u;
    public boolean v;
    public boolean w;
    public List<X500Principal> x;
    public Function<List<X500Principal>, jcz0> y;
    public List<f.g> z;

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    /* compiled from: TlsClientEngineImpl.java */
    /* renamed from: one.video.calls.sdk_private.a$a, reason: collision with other inner class name */
    public static final class EnumC2171a {
        public static final EnumC2171a a;
        public static final EnumC2171a b;
        public static final EnumC2171a c;
        public static final EnumC2171a d;
        public static final EnumC2171a e;
        public static final EnumC2171a f;
        public static final EnumC2171a g;
        public static final EnumC2171a h;
        private static final /* synthetic */ EnumC2171a[] i;

        static {
            EnumC2171a enumC2171a = new EnumC2171a("Start", 0);
            a = enumC2171a;
            EnumC2171a enumC2171a2 = new EnumC2171a("WaitServerHello", 1);
            b = enumC2171a2;
            EnumC2171a enumC2171a3 = new EnumC2171a("WaitEncryptedExtensions", 2);
            c = enumC2171a3;
            EnumC2171a enumC2171a4 = new EnumC2171a("WaitCertificateRequest", 3);
            d = enumC2171a4;
            EnumC2171a enumC2171a5 = new EnumC2171a("WaitCertificate", 4);
            e = enumC2171a5;
            EnumC2171a enumC2171a6 = new EnumC2171a("WaitCertificateVerify", 5);
            f = enumC2171a6;
            EnumC2171a enumC2171a7 = new EnumC2171a("WaitFinished", 6);
            g = enumC2171a7;
            EnumC2171a enumC2171a8 = new EnumC2171a("Connected", 7);
            h = enumC2171a8;
            i = new EnumC2171a[]{enumC2171a, enumC2171a2, enumC2171a3, enumC2171a4, enumC2171a5, enumC2171a6, enumC2171a7, enumC2171a8};
        }

        public EnumC2171a() {
            throw null;
        }

        public static EnumC2171a valueOf(String str) {
            return (EnumC2171a) Enum.valueOf(EnumC2171a.class, str);
        }

        public static EnumC2171a[] values() {
            return (EnumC2171a[]) i.clone();
        }
    }

    static {
        Object[] objArr = {f.g.rsa_pss_rsae_sha256, f.g.rsa_pss_rsae_sha384, f.g.rsa_pss_rsae_sha512, f.g.ecdsa_secp256r1_sha256, f.g.ecdsa_secp384r1_sha384, f.g.ecdsa_secp521r1_sha512};
        ArrayList arrayList = new ArrayList(6);
        for (int i = 0; i < 6; i++) {
            Object obj = objArr[i];
            Objects.requireNonNull(obj);
            arrayList.add(obj);
        }
        A = Collections.unmodifiableList(arrayList);
        B = Charset.forName("ISO-8859-1");
    }

    public a(t tVar, bE bEVar) {
        this.d = qlv.a == 2 ? new qlv.a() : new qlv.b();
        this.m = EnumC2171a.a;
        this.r = Collections.EMPTY_LIST;
        this.v = false;
        this.e = tVar;
        this.f = bEVar;
        this.h = new ArrayList();
        this.k = new ArrayList();
        this.t = new dgz0();
        this.u = new ArrayList();
        this.y = new pqk(0);
    }

    public final void e(f.e eVar, List<f.g> list) throws IOException {
        KeyPairGenerator keyPairGenerator;
        if (this.m != EnumC2171a.a) {
            throw new IllegalStateException("Handshake already started");
        }
        if (!b.d.contains(eVar)) {
            throw new IllegalArgumentException("Named group " + eVar + " not supported");
        }
        if (list.stream().anyMatch(new eqk(0))) {
            ArrayList arrayList = new ArrayList(list);
            arrayList.removeAll(A);
            throw new IllegalArgumentException("Unsupported signature scheme(s): " + arrayList);
        }
        this.p = list;
        this.i = eVar;
        try {
            if (eVar != f.e.secp256r1 && eVar != f.e.secp384r1 && eVar != f.e.secp521r1) {
                if (eVar != f.e.x25519 && eVar != f.e.x448) {
                    throw new RuntimeException("unsupported group " + eVar);
                }
                keyPairGenerator = KeyPairGenerator.getInstance("XDH");
                uze.d();
                keyPairGenerator.initialize(yto.d(eVar.toString().toUpperCase()));
                KeyPair genKeyPair = keyPairGenerator.genKeyPair();
                this.b = genKeyPair.getPrivate();
                this.a = genKeyPair.getPublic();
                if (this.g != null || this.h.isEmpty()) {
                    throw new IllegalStateException("not all mandatory properties are set");
                }
                C5381ab c5381ab = new C5381ab(this.g, this.a, this.h, this.p, eVar, this.k, this.c, C5381ab.a.c);
                this.n = c5381ab;
                this.l = c5381ab.d;
                if (this.c != null) {
                    this.o.b(c5381ab);
                    wgq wgqVar = this.c;
                    g1t g1tVar = wgqVar.r;
                    f.d dVar = f.d.client_hello;
                    g1tVar.getClass();
                    wgqVar.a(wgqVar.j, "c e traffic", g1tVar.c(g1t.f(dVar)), wgqVar.e);
                    this.f.getClass();
                }
                t tVar = this.e;
                C5381ab c5381ab2 = this.n;
                wby0 b = tVar.a.b(aF.a);
                b.c(c5381ab2);
                tVar.a.p = bF.f.b;
                tVar.a.e.e = c5381ab2.b;
                b.a(b.h);
                tVar.a.V = c5381ab2;
                this.m = EnumC2171a.b;
                return;
            }
            keyPairGenerator = KeyPairGenerator.getInstance("EC");
            keyPairGenerator.initialize(new ECGenParameterSpec(eVar.toString()));
            KeyPair genKeyPair2 = keyPairGenerator.genKeyPair();
            this.b = genKeyPair2.getPrivate();
            this.a = genKeyPair2.getPublic();
            if (this.g != null) {
            }
            throw new IllegalStateException("not all mandatory properties are set");
        } catch (InvalidAlgorithmParameterException unused) {
            throw new RuntimeException();
        } catch (NoSuchAlgorithmException unused2) {
            throw new RuntimeException("missing key pair generator algorithm EC");
        }
    }

    public final void f(fcy0 fcy0Var, e eVar) throws g {
        boolean z;
        if (eVar != e.b) {
            throw new q("incorrect protection level");
        }
        if (this.m != EnumC2171a.f) {
            throw new q("unexpected certificate verify message");
        }
        f.g gVar = fcy0Var.a;
        if (gVar == null || !this.p.contains(gVar)) {
            throw new n("signature scheme does not match");
        }
        byte[] bArr = fcy0Var.b;
        X509Certificate x509Certificate = this.q;
        g1t g1tVar = this.o;
        f.d dVar = f.d.certificate;
        g1tVar.getClass();
        byte[] c = g1tVar.c(g1t.a(dVar, false));
        Charset charset = B;
        ByteBuffer allocate = ByteBuffer.allocate("TLS 1.3, server CertificateVerify".getBytes(charset).length + 65 + c.length);
        for (int i = 0; i < 64; i++) {
            allocate.put((byte) 32);
        }
        allocate.put("TLS 1.3, server CertificateVerify".getBytes(charset));
        allocate.put((byte) 0);
        allocate.put(c);
        try {
            Signature b = b(gVar);
            b.initVerify(x509Certificate);
            b.update(allocate.array());
            z = b.verify(bArr);
        } catch (InvalidKeyException | SignatureException unused) {
            z = false;
        }
        if (!z) {
            throw new k("signature verification fails");
        }
        List<X509Certificate> list = this.r;
        try {
            X509TrustManager x509TrustManager = this.s;
            if (x509TrustManager != null) {
                x509TrustManager.checkServerTrusted((X509Certificate[]) list.toArray(new X509Certificate[list.size()]), "RSA");
            } else {
                TrustManagerFactory trustManagerFactory = TrustManagerFactory.getInstance("PKIX");
                trustManagerFactory.init((KeyStore) null);
                ((X509TrustManager) trustManagerFactory.getTrustManagers()[0]).checkServerTrusted((X509Certificate[]) list.toArray(new X509Certificate[list.size()]), GrsBaseInfo.CountryCodeSource.UNKNOWN);
            }
            if (!this.t.verify(this.g, this.q)) {
                throw new i("servername does not match", f.a.certificate_unknown);
            }
            this.o.e(fcy0Var);
            this.m = EnumC2171a.g;
        } catch (KeyStoreException unused2) {
            throw new RuntimeException("keystore exception");
        } catch (NoSuchAlgorithmException unused3) {
            throw new RuntimeException("unsupported trust manager algorithm");
        } catch (CertificateException e) {
            Throwable cause = e.getCause();
            throw new h((String) (cause instanceof CertPathValidatorException ? Optional.of(cause.getMessage() + ": " + ((CertPathValidatorException) cause).getReason()) : cause instanceof CertPathBuilderException ? Optional.of(cause.getMessage()) : Optional.empty()).orElse("certificate validation failed"));
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final void g(xcy0 xcy0Var, e eVar) throws l, IOException {
        aF aFVar;
        List<X509Certificate> list;
        if (eVar != e.b) {
            throw new q("incorrect protection level");
        }
        if (this.m != EnumC2171a.g) {
            throw new q("unexpected finished message");
        }
        this.o.e(xcy0Var);
        g1t g1tVar = this.o;
        f.d dVar = f.d.certificate_verify;
        g1tVar.getClass();
        if (!Arrays.equals(xcy0Var.a, c(g1tVar.c(g1t.a(dVar, false)), this.c.m))) {
            throw new k("incorrect finished message");
        }
        if (this.w) {
            final jcz0 apply = this.y.apply(this.x);
            X509Certificate x509Certificate = apply != null ? apply.a : null;
            final s4y0 s4y0Var = new s4y0();
            s4y0Var.c = new ArrayList();
            s4y0Var.a = new byte[0];
            s4y0Var.b = x509Certificate;
            if (x509Certificate != null) {
                ArrayList arrayList = new ArrayList(1);
                Object obj = new Object[]{x509Certificate}[0];
                Objects.requireNonNull(obj);
                arrayList.add(obj);
                list = Collections.unmodifiableList(arrayList);
            } else {
                list = Collections.EMPTY_LIST;
            }
            s4y0Var.c = list;
            int size = s4y0Var.c.size();
            List list2 = (List) s4y0Var.c.stream().map(new Function() { // from class: xsna.o4y0
                @Override // java.util.function.Function
                public final Object apply(Object obj2) {
                    X509Certificate x509Certificate2 = (X509Certificate) obj2;
                    s4y0.this.getClass();
                    try {
                        return x509Certificate2.getEncoded();
                    } catch (CertificateEncodingException e) {
                        throw new RuntimeException(e);
                    }
                }
            }).collect(Collectors.toList());
            int sum = list2.stream().mapToInt(new p4y0()).sum() + (size * 5) + 8;
            ByteBuffer allocate = ByteBuffer.allocate(sum);
            f.d dVar2 = f.d.certificate;
            allocate.putInt((dVar2.i << 24) | (sum - 4));
            allocate.put((byte) 0);
            allocate.put((byte) 0);
            allocate.putShort((short) (sum - 8));
            list2.forEach(new q4y0(allocate, 0));
            s4y0Var.d = allocate.array();
            bE bEVar = this.e.a;
            aF aFVar2 = aF.c;
            wby0 b = bEVar.b(aFVar2);
            b.c(s4y0Var);
            b.a(b.h);
            this.o.d(s4y0Var);
            if (apply != null) {
                Stream<f.g> stream = this.z.stream();
                final List<f.g> list3 = this.p;
                Objects.requireNonNull(list3);
                f.g orElseThrow = stream.filter(new Predicate() { // from class: xsna.rqk
                    @Override // java.util.function.Predicate
                    public final boolean test(Object obj2) {
                        return list3.contains((f.g) obj2);
                    }
                }).filter(new Predicate() { // from class: xsna.sqk
                    @Override // java.util.function.Predicate
                    public final boolean test(Object obj2) {
                        f.g gVar = (f.g) obj2;
                        one.video.calls.sdk_private.a.this.getClass();
                        String sigAlgName = apply.a.getSigAlgName();
                        if (sigAlgName.toLowerCase().contains("withrsa")) {
                            Object[] objArr = {f.g.rsa_pss_rsae_sha256, f.g.rsa_pss_rsae_sha384};
                            ArrayList arrayList2 = new ArrayList(2);
                            for (int i = 0; i < 2; i++) {
                                Object obj3 = objArr[i];
                                Objects.requireNonNull(obj3);
                                arrayList2.add(obj3);
                            }
                            return Collections.unmodifiableList(arrayList2).contains(gVar);
                        }
                        if (!sigAlgName.toLowerCase().contains("withecdsa")) {
                            return false;
                        }
                        Object[] objArr2 = {f.g.ecdsa_secp256r1_sha256};
                        ArrayList arrayList3 = new ArrayList(1);
                        Object obj4 = objArr2[0];
                        Objects.requireNonNull(obj4);
                        arrayList3.add(obj4);
                        return Collections.unmodifiableList(arrayList3).contains(gVar);
                    }
                }).findFirst().orElseThrow(new tqk());
                PrivateKey privateKey = apply.b;
                g1t g1tVar2 = this.o;
                g1tVar2.getClass();
                byte[] c = g1tVar2.c(g1t.a(dVar2, true));
                ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
                try {
                    String c2 = fq.c(" ");
                    Charset charset = StandardCharsets.US_ASCII;
                    byteArrayOutputStream.write(c2.getBytes(charset));
                    byteArrayOutputStream.write("TLS 1.3, client CertificateVerify".getBytes(charset));
                    byteArrayOutputStream.write(0);
                    byteArrayOutputStream.write(c);
                    try {
                        Signature b2 = b(orElseThrow);
                        b2.initSign(privateKey);
                        b2.update(byteArrayOutputStream.toByteArray());
                        byte[] sign = b2.sign();
                        fcy0 fcy0Var = new fcy0();
                        fcy0Var.a = orElseThrow;
                        fcy0Var.b = sign;
                        int length = sign.length;
                        ByteBuffer allocate2 = ByteBuffer.allocate(length + 8);
                        allocate2.putInt((dVar.i << 24) | (length + 4));
                        allocate2.putShort(fcy0Var.a.g);
                        allocate2.putShort((short) length);
                        allocate2.put(fcy0Var.b);
                        fcy0Var.c = allocate2.array();
                        wby0 b3 = this.e.a.b(aFVar2);
                        b3.c(fcy0Var);
                        b3.a(b3.h);
                        this.o.d(fcy0Var);
                    } catch (InvalidKeyException unused) {
                        throw new o("invalid private key");
                    } catch (SignatureException unused2) {
                        throw new RuntimeException();
                    }
                } catch (IOException unused3) {
                    throw new RuntimeException();
                }
            }
        }
        g1t g1tVar3 = this.o;
        g1tVar3.getClass();
        byte[] c3 = c(g1tVar3.c(g1t.a(dVar, true)), this.c.n);
        xcy0 xcy0Var2 = new xcy0();
        xcy0Var2.a = c3;
        ByteBuffer allocate3 = ByteBuffer.allocate(c3.length + 4);
        f.d dVar3 = f.d.finished;
        allocate3.putInt((dVar3.i << 24) | xcy0Var2.a.length);
        allocate3.put(xcy0Var2.a);
        xcy0Var2.b = allocate3.array();
        wby0 b4 = this.e.a.b(aF.c);
        b4.c(xcy0Var2);
        b4.a(b4.h);
        this.o.d(xcy0Var2);
        wgq wgqVar = this.c;
        byte[] bArr = wgqVar.o;
        g1t g1tVar4 = wgqVar.r;
        g1tVar4.getClass();
        byte[] c4 = g1tVar4.c(g1t.a(dVar3, false));
        byte[] bArr2 = wgqVar.c;
        int i = wgqVar.e;
        byte[] a = wgqVar.a(bArr, "derived", bArr2, i);
        hdy0.a(a);
        byte[] f = wgqVar.b.f(a, new byte[i]);
        wgqVar.t = f;
        hdy0.a(f);
        byte[] a2 = wgqVar.a(wgqVar.t, "c ap traffic", c4, i);
        wgqVar.p = a2;
        hdy0.a(a2);
        byte[] a3 = wgqVar.a(wgqVar.t, "s ap traffic", c4, i);
        wgqVar.q = a3;
        hdy0.a(a3);
        byte[] bArr3 = wgqVar.p;
        short s = wgqVar.d;
        Charset charset2 = wgq.u;
        hdy0.a(wgqVar.a(bArr3, "key", "".getBytes(charset2), s));
        hdy0.a(wgqVar.a(wgqVar.q, "key", "".getBytes(charset2), s));
        hdy0.a(wgqVar.a(wgqVar.p, "iv", "".getBytes(charset2), (short) 12));
        hdy0.a(wgqVar.a(wgqVar.q, "iv", "".getBytes(charset2), (short) 12));
        wgq wgqVar2 = this.c;
        g1t g1tVar5 = wgqVar2.r;
        g1tVar5.getClass();
        byte[] a4 = wgqVar2.a(wgqVar2.t, "res master", g1tVar5.c(g1t.a(dVar3, true)), wgqVar2.e);
        wgqVar2.l = a4;
        hdy0.a(a4);
        this.m = EnumC2171a.h;
        final bE bEVar2 = this.f;
        sby0 sby0Var = bEVar2.e;
        a aVar = bEVar2.y;
        synchronized (sby0Var) {
            aFVar = aF.d;
            sby0Var.c(aFVar, sby0Var.a, sby0Var.b.a);
            wgq wgqVar3 = aVar.c;
            if (wgqVar3 == null) {
                throw new IllegalStateException("Traffic secret not yet available");
            }
            ((qby0) sby0Var.f[aFVar.ordinal()]).d(wgqVar3.p);
            wgq wgqVar4 = aVar.c;
            if (wgqVar4 == null) {
                throw new IllegalStateException("Traffic secret not yet available");
            }
            ((qby0) sby0Var.g[aFVar.ordinal()]).d(wgqVar4.q);
            if (sby0Var.h) {
                sby0Var.b("TRAFFIC_SECRET_0", aFVar);
            }
        }
        bEVar2.i = aFVar;
        synchronized (bEVar2.g) {
            try {
                bv bvVar = bEVar2.f;
                bv bvVar2 = bv.c;
                if (bvVar.ordinal() < bvVar2.ordinal()) {
                    bEVar2.f = bvVar2;
                    bEVar2.h.forEach(new Consumer() { // from class: xsna.cgy0
                        @Override // java.util.function.Consumer
                        public final void accept(Object obj2) {
                            ((uhy0) obj2).a(bE.this.f);
                        }
                    });
                } else {
                    Objects.toString(bEVar2.f);
                }
            } catch (Throwable th) {
                throw th;
            }
        }
        bEVar2.p = bF.f.c;
        bEVar2.L.countDown();
    }

    public final void h(cdy0 cdy0Var, e eVar) throws q {
        if (eVar != e.c) {
            throw new q("incorrect protection level");
        }
        wgq wgqVar = this.c;
        byte[] a = wgqVar.a(wgqVar.l, "resumption", cdy0Var.c, wgqVar.e);
        f.b bVar = this.j;
        soy0 soy0Var = new soy0();
        soy0Var.a = a;
        soy0Var.b = new Date();
        soy0Var.c = cdy0Var.a;
        soy0Var.d = cdy0Var.b;
        soy0Var.e = cdy0Var.d;
        soy0Var.f = bVar;
        sb00 sb00Var = cdy0Var.e;
        if (sb00Var != null) {
            sb00Var.a.getClass();
        }
        this.u.add(soy0Var);
        bE bEVar = this.f;
        bEVar.getClass();
        List<Object> list = bEVar.O;
        u uVar = bEVar.M;
        gcd0 gcd0Var = new gcd0(27);
        long j = uVar.b;
        list.add(gcd0Var);
    }
}
