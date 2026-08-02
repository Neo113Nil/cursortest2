package one.video.calls.sdk_private;

import com.huawei.hms.support.hianalytics.HiAnalyticsConstant;
import com.ironsource.X3;
import com.ironsource.mediationsdk.logger.IronSourceError;
import io.appmetrica.analytics.coreutils.internal.StringUtils;
import java.nio.ByteBuffer;
import java.security.InvalidKeyException;
import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;
import java.security.PublicKey;
import java.security.SecureRandom;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import java.util.Objects;
import java.util.Random;
import java.util.function.Consumer;
import java.util.function.Predicate;
import java.util.stream.Collectors;
import javax.crypto.Mac;
import javax.crypto.spec.SecretKeySpec;
import one.video.calls.sdk_private.C5381ab;
import one.video.calls.sdk_private.b;
import one.video.calls.sdk_private.f;
import xsna.ame0;
import xsna.bdy0;
import xsna.h6r0;
import xsna.lhg;
import xsna.ncy0;
import xsna.nwg0;
import xsna.ocy0;
import xsna.pcy0;
import xsna.pt50;
import xsna.qw80;
import xsna.rvp0;
import xsna.scy0;
import xsna.sky;
import xsna.ss9;
import xsna.wgq;
import xsna.wse0;
import xsna.xy9;
import xsna.y7x0;
import xsna.zr;

/* compiled from: ClientHello.java */
/* renamed from: one.video.calls.sdk_private.ab, reason: case insensitive filesystem */
/* loaded from: classes8.dex */
public final class C5381ab extends bdy0 {
    public static final SecureRandom e;
    public final byte[] a;
    public final byte[] b;
    public final List<f.b> c;
    public final ArrayList d;

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    /* compiled from: ClientHello.java */
    /* renamed from: one.video.calls.sdk_private.ab$a */
    public static final class a {
        public static final a a;
        public static final a b;
        public static final a c;
        public static final a d;
        private static final /* synthetic */ a[] e;

        static {
            a aVar = new a("none", 0);
            a = aVar;
            a aVar2 = new a("PSKonly", 1);
            b = aVar2;
            a aVar3 = new a("PSKwithDHE", 2);
            c = aVar3;
            a aVar4 = new a("both", 3);
            d = aVar4;
            e = new a[]{aVar, aVar2, aVar3, aVar4};
        }

        public a() {
            throw null;
        }

        public static a valueOf(String str) {
            return (a) Enum.valueOf(a.class, str);
        }

        public static a[] values() {
            return (a[]) e.clone();
        }
    }

    /* compiled from: ClientHello.java */
    /* renamed from: one.video.calls.sdk_private.ab$b */
    public static /* synthetic */ class b {
        public static final /* synthetic */ int[] a;

        static {
            int[] iArr = new int[a.values().length];
            a = iArr;
            try {
                iArr[a.b.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                a[a.c.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                a[a.d.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
        }
    }

    static {
        Object[] objArr = {f.b.TLS_AES_128_GCM_SHA256};
        ArrayList arrayList = new ArrayList(1);
        Object obj = objArr[0];
        Objects.requireNonNull(obj);
        arrayList.add(obj);
        Collections.unmodifiableList(arrayList);
        Object[] objArr2 = {f.g.rsa_pss_rsae_sha256};
        ArrayList arrayList2 = new ArrayList(1);
        Object obj2 = objArr2[0];
        Objects.requireNonNull(obj2);
        arrayList2.add(obj2);
        Collections.unmodifiableList(arrayList2);
        new Random();
        e = new SecureRandom();
    }

    public C5381ab(String str, PublicKey publicKey, ArrayList arrayList, List list, f.e eVar, ArrayList arrayList2, wgq wgqVar, a aVar) {
        wse0 wse0Var;
        new ArrayList();
        this.c = arrayList;
        ByteBuffer allocate = ByteBuffer.allocate(IronSourceError.ERROR_CAPPING_VALIDATION_FAILED);
        allocate.put((byte) 1);
        allocate.put(new byte[3]);
        allocate.put((byte) 3);
        allocate.put((byte) 3);
        byte[] bArr = new byte[32];
        this.b = bArr;
        e.nextBytes(bArr);
        allocate.put(bArr);
        byte[] bArr2 = new byte[0];
        allocate.put((byte) bArr2.length);
        if (bArr2.length > 0) {
            allocate.put(bArr2);
        }
        allocate.putShort((short) (arrayList.size() << 1));
        Iterator it = arrayList.iterator();
        while (it.hasNext()) {
            allocate.putShort(((f.b) it.next()).f);
        }
        allocate.put(new byte[]{1, 0});
        nwg0 nwg0Var = new nwg0();
        nwg0Var.a = str;
        f.d dVar = f.d.client_hello;
        y7x0 y7x0Var = new y7x0(dVar);
        h6r0 h6r0Var = new h6r0(eVar);
        rvp0 rvp0Var = new rvp0();
        new ArrayList();
        rvp0Var.a = list;
        one.video.calls.sdk_private.b bVar = new one.video.calls.sdk_private.b();
        ArrayList arrayList3 = new ArrayList();
        bVar.b = arrayList3;
        bVar.a = dVar;
        if (!one.video.calls.sdk_private.b.d.contains(eVar)) {
            throw new IllegalArgumentException("Named group " + eVar + "not supported");
        }
        arrayList3.add(new b.C2172b(eVar, publicKey));
        pt50[] pt50VarArr = {nwg0Var, y7x0Var, h6r0Var, rvp0Var, bVar};
        ArrayList arrayList4 = new ArrayList();
        this.d = arrayList4;
        ArrayList arrayList5 = new ArrayList(5);
        for (int i = 0; i < 5; i++) {
            pt50 pt50Var = pt50VarArr[i];
            Objects.requireNonNull(pt50Var);
            arrayList5.add(pt50Var);
        }
        arrayList4.addAll(Collections.unmodifiableList(arrayList5));
        if (aVar != a.a) {
            ArrayList arrayList6 = this.d;
            int i2 = b.a[aVar.ordinal()];
            if (i2 == 1) {
                wse0Var = new wse0(f.EnumC2174f.psk_ke);
            } else if (i2 == 2) {
                wse0Var = new wse0(f.EnumC2174f.psk_dhe_ke);
            } else {
                if (i2 != 3) {
                    throw new IllegalArgumentException();
                }
                wse0Var = new wse0(f.EnumC2174f.psk_ke, f.EnumC2174f.psk_dhe_ke);
            }
            arrayList6.add(wse0Var);
        }
        this.d.addAll(arrayList2);
        allocate.putShort((short) this.d.stream().mapToInt(new ncy0()).sum());
        Iterator it2 = this.d.iterator();
        sky skyVar = null;
        int i3 = -1;
        while (it2.hasNext()) {
            pt50 pt50Var2 = (pt50) it2.next();
            if (pt50Var2 instanceof sky) {
                skyVar = (sky) pt50Var2;
                i3 = allocate.position();
            }
            allocate.put(pt50Var2.b());
        }
        int position = allocate.position();
        allocate.putShort(2, (short) (position - 4));
        byte[] bArr3 = new byte[position];
        this.a = bArr3;
        allocate.get(bArr3);
        if (skyVar != null) {
            if (wgqVar == null) {
                throw new IllegalArgumentException("BinderCalculator cannot be null when ClientHelloPreSharedKeyExtension is present");
            }
            byte[] bArr4 = new byte[skyVar.c + i3];
            ByteBuffer.wrap(bArr3).get(bArr4);
            ArrayList arrayList7 = skyVar.b;
            MessageDigest messageDigest = wgqVar.a;
            short s = wgqVar.e;
            String a2 = lhg.a(s << 3, "HmacSHA");
            try {
                messageDigest.reset();
                messageDigest.update(bArr4);
                byte[] digest = messageDigest.digest();
                SecretKeySpec secretKeySpec = new SecretKeySpec(wgqVar.a(wgqVar.k, "finished", "".getBytes(wgq.u), s), a2);
                Mac mac = Mac.getInstance(a2);
                mac.init(secretKeySpec);
                mac.update(digest);
                arrayList7.set(0, new sky.a(mac.doFinal()));
                allocate.put(skyVar.b());
                allocate.get(bArr3);
            } catch (InvalidKeyException unused) {
                throw new RuntimeException();
            } catch (NoSuchAlgorithmException unused2) {
                throw new RuntimeException(zr.a("Missing ", a2, " support"));
            }
        }
    }

    @Override // xsna.bdy0
    public final f.d c() {
        return f.d.client_hello;
    }

    @Override // xsna.bdy0
    public final byte[] d() {
        return this.a;
    }

    public final String toString() {
        return ss9.a("ClientHello[", (String) this.c.stream().map(new ocy0(0)).collect(Collectors.joining(StringUtils.COMMA)), HiAnalyticsConstant.REPORT_VAL_SEPARATOR, (String) this.d.stream().map(new pcy0()).collect(Collectors.joining(StringUtils.COMMA)), X3.j.e);
    }

    public C5381ab(ByteBuffer byteBuffer, qw80 qw80Var) throws g, n {
        this.c = new ArrayList();
        int position = byteBuffer.position();
        if (byteBuffer.remaining() < 4) {
            throw new j("message underflow");
        }
        if (byteBuffer.remaining() < 47) {
            throw new j("message underflow");
        }
        if (byteBuffer.get() != f.d.client_hello.i) {
            throw new RuntimeException();
        }
        if (byteBuffer.remaining() < (((byteBuffer.get() & 255) << 16) | ((byteBuffer.get() & 255) << 8) | (byteBuffer.get() & 255))) {
            throw new j("message underflow");
        }
        if (byteBuffer.getShort() != 771) {
            throw new j("legacy version must be 0303");
        }
        byte[] bArr = new byte[32];
        this.b = bArr;
        byteBuffer.get(bArr);
        int i = byteBuffer.get();
        if (i > 0) {
            byteBuffer.get(new byte[i]);
        }
        short s = byteBuffer.getShort();
        for (int i2 = 0; i2 < s; i2 += 2) {
            final short s2 = byteBuffer.getShort();
            Arrays.stream(f.b.values()).filter(new Predicate() { // from class: xsna.qcy0
                @Override // java.util.function.Predicate
                public final boolean test(Object obj) {
                    return ((f.b) obj).f == s2;
                }
            }).findFirst().ifPresent(new Consumer() { // from class: xsna.rcy0
                @Override // java.util.function.Consumer
                public final void accept(Object obj) {
                    C5381ab.this.c.add((f.b) obj);
                }
            });
        }
        byte b2 = byteBuffer.get();
        byte b3 = byteBuffer.get();
        if (b2 != 1 || b3 != 0) {
            throw new n("Invalid legacy compression method");
        }
        int position2 = byteBuffer.position();
        ArrayList b4 = bdy0.b(byteBuffer, f.d.client_hello, qw80Var);
        this.d = b4;
        if (b4.stream().anyMatch(new scy0())) {
            int i3 = byteBuffer.getShort() & 65535;
            while (i3 > 4) {
                byteBuffer.position();
                byteBuffer.getShort();
                int i4 = byteBuffer.getShort() & 65535;
                byteBuffer.get(new byte[i4]);
                i3 -= i4 + 4;
            }
            if (!(xy9.b(1, this.d) instanceof ame0)) {
                throw new n("pre_shared_key extension MUST be the last extension in the ClientHello");
            }
        }
        byte[] bArr2 = new byte[byteBuffer.position() - position];
        this.a = bArr2;
        byteBuffer.get(bArr2);
    }
}
