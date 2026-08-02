package one.video.calls.sdk_private;

import java.math.BigInteger;
import java.nio.ByteBuffer;
import java.security.AlgorithmParameters;
import java.security.KeyFactory;
import java.security.NoSuchAlgorithmException;
import java.security.PublicKey;
import java.security.interfaces.ECPublicKey;
import java.security.spec.ECGenParameterSpec;
import java.security.spec.ECParameterSpec;
import java.security.spec.ECPoint;
import java.security.spec.ECPublicKeySpec;
import java.security.spec.InvalidKeySpecException;
import java.security.spec.InvalidParameterSpecException;
import java.security.spec.NamedParameterSpec;
import java.util.AbstractMap;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Objects;
import java.util.Optional;
import one.video.calls.sdk_private.f;
import xsna.cqi;
import xsna.go9;
import xsna.h690;
import xsna.hdy0;
import xsna.i690;
import xsna.j690;
import xsna.m78;
import xsna.pt50;
import xsna.tc1;
import xsna.uze;
import xsna.v6h;
import xsna.wuy0;
import xsna.yto;
import xsna.zil0;

/* compiled from: KeyShareExtension.java */
/* loaded from: classes8.dex */
public final class b extends pt50 {
    public static final Map<f.e, Integer> c;
    public static final List<f.e> d;
    public f.d a;
    public ArrayList b;

    /* compiled from: KeyShareExtension.java */
    public static class a extends C2172b {
        public final ECPublicKey c;

        public a(f.e eVar, ECPublicKey eCPublicKey) {
            super(eVar, eCPublicKey);
            this.a = eVar;
            this.c = eCPublicKey;
        }

        @Override // one.video.calls.sdk_private.b.C2172b
        public final /* bridge */ /* synthetic */ PublicKey a() {
            return this.c;
        }
    }

    /* compiled from: KeyShareExtension.java */
    /* renamed from: one.video.calls.sdk_private.b$b, reason: collision with other inner class name */
    public static class C2172b {
        public f.e a;
        public final PublicKey b;

        public C2172b(f.e eVar, PublicKey publicKey) {
            this.a = eVar;
            this.b = publicKey;
        }

        public PublicKey a() {
            return this.b;
        }
    }

    static {
        f.e eVar = f.e.secp256r1;
        f.e eVar2 = f.e.x25519;
        f.e eVar3 = f.e.x448;
        AbstractMap.SimpleEntry simpleEntry = new AbstractMap.SimpleEntry(eVar, 65);
        AbstractMap.SimpleEntry simpleEntry2 = new AbstractMap.SimpleEntry(eVar2, 32);
        AbstractMap.SimpleEntry simpleEntry3 = new AbstractMap.SimpleEntry(eVar3, 56);
        Map.Entry[] entryArr = {simpleEntry, simpleEntry2, simpleEntry3};
        HashMap hashMap = new HashMap(3);
        for (int i = 0; i < 3; i++) {
            Map.Entry entry = entryArr[i];
            Object key = entry.getKey();
            Objects.requireNonNull(key);
            Object value = entry.getValue();
            Objects.requireNonNull(value);
            if (hashMap.put(key, value) != null) {
                throw new IllegalArgumentException(cqi.c(key, "duplicate key: "));
            }
        }
        c = Collections.unmodifiableMap(hashMap);
        Object[] objArr = {f.e.secp256r1, f.e.x25519};
        ArrayList arrayList = new ArrayList(2);
        for (int i2 = 0; i2 < 2; i2++) {
            Object obj = objArr[i2];
            Objects.requireNonNull(obj);
            arrayList.add(obj);
        }
        d = Collections.unmodifiableList(arrayList);
    }

    public static ECParameterSpec d(String str) {
        try {
            AlgorithmParameters algorithmParameters = AlgorithmParameters.getInstance("EC");
            algorithmParameters.init(new ECGenParameterSpec(str));
            return (ECParameterSpec) algorithmParameters.getParameterSpec(ECParameterSpec.class);
        } catch (NoSuchAlgorithmException unused) {
            throw new RuntimeException("Missing support for EC algorithm");
        } catch (InvalidParameterSpecException unused2) {
            throw new RuntimeException("Inappropriate parameter specification");
        }
    }

    public static void e(ByteBuffer byteBuffer, byte[] bArr) {
        if (bArr.length == 32) {
            byteBuffer.put(bArr);
            return;
        }
        if (bArr.length < 32) {
            for (int i = 0; i < 32 - bArr.length; i++) {
                byteBuffer.put((byte) 0);
            }
            byteBuffer.put(bArr, 0, bArr.length);
            return;
        }
        if (bArr.length > 32) {
            for (int i2 = 0; i2 < bArr.length - 32; i2++) {
                if (bArr[i2] != 0) {
                    throw new RuntimeException(go9.b("W Affine more then 32 bytes, leading bytes not 0 ", hdy0.a(bArr)));
                }
            }
            byteBuffer.put(bArr, bArr.length - 32, 32);
        }
    }

    public static void f(byte[] bArr) {
        int length = bArr.length - 1;
        for (int i = 0; length > i; i++) {
            byte b = bArr[length];
            bArr[length] = bArr[i];
            bArr[i] = b;
            length--;
        }
    }

    @Override // xsna.pt50
    public final byte[] b() {
        BigInteger u;
        ArrayList arrayList = this.b;
        short sum = (short) arrayList.stream().map(new h690(0)).mapToInt(new i690()).map(new j690()).sum();
        f.d dVar = this.a;
        f.d dVar2 = f.d.client_hello;
        short s = dVar == dVar2 ? (short) (sum + 2) : sum;
        ByteBuffer allocate = ByteBuffer.allocate(s + 4);
        allocate.putShort(f.c.key_share.k);
        allocate.putShort(s);
        if (dVar == dVar2) {
            allocate.putShort(sum);
        }
        Iterator it = arrayList.iterator();
        while (it.hasNext()) {
            C2172b c2172b = (C2172b) it.next();
            allocate.putShort(c2172b.a.f);
            f.e eVar = c2172b.a;
            Map<f.e, Integer> map = c;
            allocate.putShort(map.get(eVar).shortValue());
            f.e eVar2 = c2172b.a;
            if (eVar2 == f.e.secp256r1) {
                allocate.put((byte) 4);
                e(allocate, ((ECPublicKey) c2172b.a()).getW().getAffineX().toByteArray());
                e(allocate, ((ECPublicKey) c2172b.a()).getW().getAffineY().toByteArray());
            } else {
                if (eVar2 != f.e.x25519 && eVar2 != f.e.x448) {
                    throw new RuntimeException();
                }
                u = m78.c(c2172b.a()).getU();
                byte[] byteArray = u.toByteArray();
                if (byteArray.length > map.get(c2172b.a).intValue()) {
                    throw new RuntimeException("Invalid " + c2172b.a + " key length: " + byteArray.length);
                }
                if (byteArray.length < map.get(c2172b.a).intValue()) {
                    f(byteArray);
                    byteArray = Arrays.copyOf(byteArray, map.get(c2172b.a).intValue());
                } else {
                    f(byteArray);
                }
                allocate.put(byteArray);
            }
        }
        return allocate.array();
    }

    public final int c(ByteBuffer byteBuffer) throws g {
        ArrayList arrayList = this.b;
        int position = byteBuffer.position();
        if (byteBuffer.remaining() < 4) {
            throw new j("extension underflow");
        }
        Optional findFirst = Arrays.stream(f.e.values()).filter(new wuy0(byteBuffer.getShort())).findFirst();
        int i = byteBuffer.getShort();
        if (byteBuffer.remaining() < i) {
            throw new j("extension underflow");
        }
        if (findFirst.isPresent() && d.contains(findFirst.get())) {
            f.e eVar = (f.e) findFirst.get();
            if (i != c.get(eVar).intValue()) {
                throw new j(zil0.a(i, "Invalid ", eVar.name(), " key length: "));
            }
            if (eVar == f.e.secp256r1) {
                if (byteBuffer.get() != 4) {
                    throw new j("EC keys must be in legacy form");
                }
                int i2 = i - 1;
                byte[] bArr = new byte[i2];
                byteBuffer.get(bArr);
                try {
                    arrayList.add(new a(eVar, (ECPublicKey) KeyFactory.getInstance("EC").generatePublic(new ECPublicKeySpec(new ECPoint(new BigInteger(1, Arrays.copyOfRange(bArr, 0, i2 / 2)), new BigInteger(1, Arrays.copyOfRange(bArr, i2 / 2, i2))), d(eVar.name())))));
                } catch (NoSuchAlgorithmException unused) {
                    throw new RuntimeException("Missing support for EC algorithm");
                } catch (InvalidKeySpecException unused2) {
                    throw new RuntimeException("Inappropriate parameter specification");
                }
            } else if (eVar == f.e.x25519 || eVar == f.e.x448) {
                byte[] bArr2 = new byte[i];
                byteBuffer.get(bArr2);
                try {
                    f(bArr2);
                    BigInteger bigInteger = new BigInteger(bArr2);
                    KeyFactory keyFactory = KeyFactory.getInstance("XDH");
                    uze.d();
                    NamedParameterSpec d2 = yto.d(eVar.name().toUpperCase());
                    tc1.d();
                    arrayList.add(new C2172b(eVar, keyFactory.generatePublic(v6h.d(d2, bigInteger))));
                } catch (NoSuchAlgorithmException unused3) {
                    throw new RuntimeException("Missing support for EC algorithm");
                } catch (InvalidKeySpecException unused4) {
                    throw new RuntimeException("Inappropriate parameter specification");
                }
            }
        } else {
            byteBuffer.get(new byte[i]);
        }
        return byteBuffer.position() - position;
    }
}
