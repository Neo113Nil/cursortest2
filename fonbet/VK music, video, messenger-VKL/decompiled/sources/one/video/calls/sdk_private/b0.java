package one.video.calls.sdk_private;

import com.mbridge.msdk.playercommon.exoplayer2.extractor.ts.PsExtractor;
import java.io.ByteArrayInputStream;
import java.io.EOFException;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.io.PushbackInputStream;
import java.nio.ByteBuffer;
import java.nio.charset.StandardCharsets;
import java.util.AbstractMap;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Objects;
import java.util.Optional;
import java.util.concurrent.CountDownLatch;
import java.util.concurrent.TimeUnit;
import java.util.function.BinaryOperator;
import java.util.function.Consumer;
import java.util.function.Function;
import java.util.stream.Collectors;
import one.video.calls.sdk_private.bE;
import one.video.calls.sdk_private.bF;
import ru.ok.proto.rtmp.amf.AmfConstants;
import xsna.alk;
import xsna.asy0;
import xsna.bhu;
import xsna.dky0;
import xsna.dry0;
import xsna.gry0;
import xsna.hqy0;
import xsna.jry0;
import xsna.kqy0;
import xsna.lhg;
import xsna.lry0;
import xsna.lvb0;
import xsna.mpy0;
import xsna.oqy0;
import xsna.ory0;
import xsna.pqy0;
import xsna.qlb0;
import xsna.qry0;
import xsna.rry0;
import xsna.sdy0;
import xsna.try0;
import xsna.wn4;
import xsna.wry0;
import xsna.xry0;

/* compiled from: Http3ConnectionImpl.java */
/* loaded from: classes8.dex */
public class b0 {
    public final bE b;
    public final HashMap c = new HashMap();
    public final hqy0 d;
    public final HashMap e;
    public final HashMap f;
    public final CountDownLatch g;
    public final List<Long> h;
    public final kqy0 i;

    /* compiled from: Http3ConnectionImpl.java */
    public class a implements dry0 {
        public final sdy0 a;
        public final C2173a b;
        public final b c;
        public final /* synthetic */ a0 d;

        public a(a0 a0Var, sdy0 sdy0Var) {
            this.d = a0Var;
            this.a = sdy0Var;
            this.b = new C2173a(sdy0Var);
            this.c = new b(sdy0Var);
        }

        @Override // xsna.dry0
        public final OutputStream a() {
            return this.b;
        }

        @Override // xsna.dry0
        public final InputStream b() {
            return this.c;
        }

        @Override // xsna.dry0
        public final boolean e() {
            return this.a.e();
        }

        /* compiled from: Http3ConnectionImpl.java */
        public class b extends InputStream {
            public ByteBuffer b;
            public final /* synthetic */ sdy0 c;

            public b(sdy0 sdy0Var) {
                this.c = sdy0Var;
            }

            @Override // java.io.InputStream
            public final int available() throws IOException {
                if (m()) {
                    return this.b.remaining();
                }
                return 0;
            }

            public final boolean m() throws IOException {
                byte[] bArr;
                ByteBuffer byteBuffer = this.b;
                if (byteBuffer != null && byteBuffer.position() != this.b.limit()) {
                    return this.b.position() < this.b.limit();
                }
                try {
                    wn4 a = a.this.d.a(this.c.a());
                    if (!(a instanceof lry0)) {
                        return false;
                    }
                    lry0 lry0Var = (lry0) a;
                    int limit = lry0Var.a.limit();
                    if (limit == lry0Var.a.array().length) {
                        bArr = lry0Var.a.array();
                    } else {
                        byte[] bArr2 = new byte[limit];
                        lry0Var.a.get(bArr2);
                        bArr = bArr2;
                    }
                    this.b = ByteBuffer.wrap(bArr);
                    return true;
                } catch (dj e) {
                    throw new IOException(e);
                }
            }

            @Override // java.io.InputStream
            public final int read() throws IOException {
                if (m()) {
                    return this.b.get();
                }
                return -1;
            }

            @Override // java.io.InputStream
            public final int read(byte[] bArr) throws IOException {
                if (!m()) {
                    return -1;
                }
                int min = Integer.min(this.b.remaining(), bArr.length);
                this.b.get(bArr, 0, min);
                return min;
            }

            @Override // java.io.InputStream
            public final int read(byte[] bArr, int i, int i2) throws IOException {
                if (!m()) {
                    return -1;
                }
                int min = Integer.min(this.b.remaining(), i2);
                this.b.get(bArr, i, min);
                return min;
            }
        }

        @Override // xsna.dry0
        public final void a(long j) {
            this.a.a(j);
        }

        @Override // xsna.dry0
        public final void b(long j) {
            this.a.b(j);
        }

        /* compiled from: Http3ConnectionImpl.java */
        /* renamed from: one.video.calls.sdk_private.b0$a$a, reason: collision with other inner class name */
        public class C2173a extends OutputStream {
            public final /* synthetic */ sdy0 b;

            public C2173a(sdy0 sdy0Var) {
                this.b = sdy0Var;
            }

            @Override // java.io.OutputStream, java.io.Closeable, java.lang.AutoCloseable
            public final void close() throws IOException {
                this.b.b().close();
            }

            @Override // java.io.OutputStream, java.io.Flushable
            public final void flush() throws IOException {
                this.b.b().flush();
            }

            @Override // java.io.OutputStream
            public final void write(int i) throws IOException {
                lvb0 b = this.b.b();
                ByteBuffer wrap = ByteBuffer.wrap(new byte[]{(byte) i});
                int limit = wrap.limit();
                ByteBuffer allocate = ByteBuffer.allocate(8);
                int d = alk.d(limit, allocate);
                int i2 = d + 1;
                byte[] bArr = new byte[i2 + limit];
                bArr[0] = 0;
                allocate.get(bArr, 1, d);
                wrap.get(bArr, i2, limit);
                b.write(bArr);
            }

            @Override // java.io.OutputStream
            public final void write(byte[] bArr) throws IOException {
                lvb0 b = this.b.b();
                ByteBuffer wrap = ByteBuffer.wrap(bArr);
                int limit = wrap.limit();
                ByteBuffer allocate = ByteBuffer.allocate(8);
                int d = alk.d(limit, allocate);
                int i = d + 1;
                byte[] bArr2 = new byte[i + limit];
                bArr2[0] = 0;
                allocate.get(bArr2, 1, d);
                wrap.get(bArr2, i, limit);
                b.write(bArr2);
            }

            @Override // java.io.OutputStream
            public final void write(byte[] bArr, int i, int i2) throws IOException {
                ByteBuffer wrap = ByteBuffer.wrap(bArr);
                lvb0 b = this.b.b();
                int limit = wrap.limit();
                ByteBuffer allocate = ByteBuffer.allocate(8);
                int d = alk.d(limit, allocate);
                int i3 = d + 1;
                byte[] bArr2 = new byte[i3 + limit];
                bArr2[0] = 0;
                allocate.get(bArr2, 1, d);
                wrap.get(bArr2, i3, limit);
                b.write(bArr2);
            }
        }
    }

    public b0(bE bEVar) {
        Object[] objArr = {1L, 7L, 8L};
        ArrayList arrayList = new ArrayList(3);
        for (int i = 0; i < 3; i++) {
            Object obj = objArr[i];
            Objects.requireNonNull(obj);
            arrayList.add(obj);
        }
        this.h = Collections.unmodifiableList(arrayList);
        this.b = bEVar;
        this.d = new hqy0();
        HashMap hashMap = new HashMap();
        this.e = hashMap;
        hashMap.put(1L, 0L);
        hashMap.put(7L, 0L);
        this.f = new HashMap();
        this.g = new CountDownLatch(1);
        final a0 a0Var = (a0) this;
        HashMap hashMap2 = a0Var.c;
        hashMap2.put(0L, new Consumer() { // from class: xsna.vry0
            @Override // java.util.function.Consumer
            public final void accept(Object obj2) {
                one.video.calls.sdk_private.a0 a0Var2 = one.video.calls.sdk_private.a0.this;
                bE bEVar2 = a0Var2.b;
                InputStream b = ((dry0) obj2).b();
                try {
                    if (alk.k(b) != 4) {
                        bEVar2.e(266L, bF.d.b, null);
                        bEVar2.r().h();
                    }
                    byte[] b2 = one.video.calls.sdk_private.b0.b(b, alk.h(b));
                    HashMap hashMap3 = new HashMap();
                    hashMap3.put(1L, 0L);
                    hashMap3.put(7L, 0L);
                    hashMap3.put(8L, 0L);
                    ByteBuffer wrap = ByteBuffer.wrap(b2);
                    while (wrap.remaining() > 0) {
                        try {
                            hashMap3.put(Long.valueOf(alk.l(wrap)), Long.valueOf(alk.l(wrap)));
                        } catch (one.video.calls.sdk_private.bq e) {
                            throw new IOException(e);
                        }
                    }
                    a0Var2.f.putAll(hashMap3);
                    a0Var2.g.countDown();
                } catch (IOException unused) {
                    bEVar2.e(260L, bF.d.b, null);
                    bEVar2.r().h();
                }
            }
        });
        hashMap2.put(2L, new wry0());
        hashMap2.put(3L, new xry0());
        hashMap2.put(1L, new try0());
        this.i = new kqy0();
    }

    public static byte[] b(InputStream inputStream, int i) throws IOException {
        byte[] bArr = new byte[i];
        int a2 = bhu.a(inputStream, bArr, i);
        if (a2 < i) {
            byte[] bArr2 = new byte[a2];
            System.arraycopy(bArr, 0, bArr2, 0, a2);
            bArr = bArr2;
        }
        if (bArr.length == i) {
            return bArr;
        }
        throw new EOFException("Stream closed by peer");
    }

    public final wn4 a(dky0 dky0Var) throws IOException, dj {
        boolean z;
        String str;
        Map.Entry simpleEntry;
        PushbackInputStream pushbackInputStream = new PushbackInputStream(dky0Var, 1);
        int read = pushbackInputStream.read();
        if (read == -1) {
            return null;
        }
        pushbackInputStream.unread(read);
        long k = alk.k(pushbackInputStream);
        int h = alk.h(pushbackInputStream);
        int i = (int) k;
        if (i == 0) {
            if (h > Long.MAX_VALUE) {
                throw new dj("max data size exceeded", 400);
            }
            lry0 lry0Var = new lry0();
            lry0Var.a = ByteBuffer.wrap(b(pushbackInputStream, h));
            return lry0Var;
        }
        if (i != 1) {
            if (i != 3) {
                if (i == 4) {
                    asy0 asy0Var = new asy0();
                    HashMap hashMap = new HashMap();
                    asy0Var.a = hashMap;
                    hashMap.put(1L, 0L);
                    hashMap.put(7L, 0L);
                    hashMap.put(8L, 0L);
                    ByteBuffer wrap = ByteBuffer.wrap(b(pushbackInputStream, h));
                    while (wrap.remaining() > 0) {
                        try {
                            asy0Var.a.put(Long.valueOf(alk.l(wrap)), Long.valueOf(alk.l(wrap)));
                        } catch (bq e) {
                            throw new IOException(e);
                        }
                    }
                    return asy0Var;
                }
                if (i != 5 && i != 7 && i != 13) {
                    pushbackInputStream.skip(h);
                    return new mpy0();
                }
            }
            throw new dy(qlb0.a(k, "Frame type ", " not yet implemented"));
        }
        if (h > Long.MAX_VALUE) {
            throw new dj("max header size exceeded", 414);
        }
        final rry0 rry0Var = new rry0();
        ByteArrayInputStream byteArrayInputStream = new ByteArrayInputStream(b(pushbackInputStream, h));
        hqy0 hqy0Var = this.d;
        ArrayList arrayList = hqy0Var.c;
        pqy0 pqy0Var = hqy0Var.b;
        PushbackInputStream pushbackInputStream2 = new PushbackInputStream(byteArrayInputStream, 16);
        ArrayList arrayList2 = new ArrayList();
        hqy0.a(8, pushbackInputStream2);
        hqy0.a(7, pushbackInputStream2);
        int read2 = pushbackInputStream2.read();
        pushbackInputStream2.unread(read2);
        while (read2 >= 0) {
            if ((read2 & 128) == 128) {
                byte d = hqy0.d(pushbackInputStream2);
                pushbackInputStream2.unread(d);
                z = (d & 64) == 64;
                int a2 = (int) hqy0.a(6, pushbackInputStream2);
                if (z) {
                    String[] strArr = pqy0Var.a;
                    if (strArr[a2] == null) {
                        throw new dQ();
                    }
                    simpleEntry = new AbstractMap.SimpleImmutableEntry(strArr[a2], pqy0Var.b[a2]);
                } else {
                    simpleEntry = a2 < arrayList.size() ? (Map.Entry) arrayList.get(a2) : null;
                }
            } else if ((read2 & PsExtractor.AUDIO_STREAM) == 64) {
                byte d2 = hqy0.d(pushbackInputStream2);
                pushbackInputStream2.unread(d2);
                z = (d2 & AmfConstants.TYPE_TYPED_OBJECT_MARKER) == 16;
                int a3 = (int) hqy0.a(4, pushbackInputStream2);
                if (!z) {
                    throw new dS("non static ref in parseLiteralHeaderFieldWithNameReference");
                }
                String str2 = pqy0Var.a[a3];
                if (str2 == null) {
                    throw new dQ();
                }
                simpleEntry = new AbstractMap.SimpleEntry(str2, hqy0Var.b(pushbackInputStream2));
            } else {
                if ((read2 & 224) != 32) {
                    throw new dS(lhg.a(read2, "Error: unknown instruction: "));
                }
                byte d3 = hqy0.d(pushbackInputStream2);
                pushbackInputStream2.unread(d3);
                z = (d3 & 8) == 8;
                byte[] bArr = new byte[(int) hqy0.a(3, pushbackInputStream2)];
                hqy0.c(pushbackInputStream2, bArr);
                if (z) {
                    hqy0Var.a.getClass();
                    str = oqy0.a(bArr);
                } else {
                    str = new String(bArr, StandardCharsets.ISO_8859_1);
                }
                simpleEntry = new AbstractMap.SimpleEntry(str, hqy0Var.b(pushbackInputStream2));
            }
            if (simpleEntry != null) {
                arrayList2.add(simpleEntry);
            }
            read2 = pushbackInputStream2.read();
            pushbackInputStream2.unread(read2);
        }
        Map map = (Map) arrayList2.stream().collect(Collectors.toMap(new gry0(), new Function() { // from class: xsna.mry0
            @Override // java.util.function.Function
            public final Object apply(Object obj) {
                rry0.this.getClass();
                Object[] objArr = {(String) ((Map.Entry) obj).getValue()};
                ArrayList arrayList3 = new ArrayList(1);
                Object obj2 = objArr[0];
                Objects.requireNonNull(obj2);
                arrayList3.add(obj2);
                return Collections.unmodifiableList(arrayList3);
            }
        }, new BinaryOperator() { // from class: xsna.nry0
            @Override // java.util.function.BiFunction
            public final Object apply(Object obj, Object obj2) {
                rry0.this.getClass();
                ArrayList arrayList3 = new ArrayList();
                arrayList3.addAll((List) obj);
                arrayList3.addAll((List) obj2);
                return arrayList3;
            }
        }));
        map.entrySet().stream().filter(new ory0(0)).forEach(new Consumer() { // from class: xsna.pry0
            @Override // java.util.function.Consumer
            public final void accept(Object obj) {
                Map.Entry entry = (Map.Entry) obj;
                rry0.this.a.put((String) entry.getKey(), (String) ((List) entry.getValue()).get(0));
            }
        });
        jry0.a(map, new qry0());
        return rry0Var;
    }

    public final Optional<Long> c(long j) {
        try {
            this.g.await(10L, TimeUnit.SECONDS);
            return Optional.ofNullable((Long) this.f.get(Long.valueOf(j)));
        } catch (InterruptedException unused) {
            return Optional.empty();
        }
    }

    public final void d() {
        bE bEVar = this.b;
        try {
            lvb0 lvb0Var = bEVar.c(false).g;
            lvb0Var.write(0);
            HashMap hashMap = new HashMap();
            hashMap.put(1L, 0L);
            hashMap.put(7L, 0L);
            hashMap.put(8L, 0L);
            hashMap.putAll(this.e);
            final ByteBuffer allocate = ByteBuffer.allocate(hashMap.size() << 4);
            hashMap.entrySet().stream().sorted(Map.Entry.comparingByKey()).forEach(new Consumer() { // from class: xsna.zry0
                @Override // java.util.function.Consumer
                public final void accept(Object obj) {
                    Map.Entry entry = (Map.Entry) obj;
                    if (((Long) entry.getKey()).longValue() != 8 || ((Long) entry.getValue()).longValue() == 1) {
                        long longValue = ((Long) entry.getKey()).longValue();
                        ByteBuffer byteBuffer = allocate;
                        alk.g(longValue, byteBuffer);
                        alk.g(((Long) entry.getValue()).longValue(), byteBuffer);
                    }
                }
            });
            int position = allocate.position();
            ByteBuffer allocate2 = ByteBuffer.allocate(alk.e(position) + 1 + position);
            allocate2.put((byte) 4);
            alk.d(position, allocate2);
            allocate2.put(allocate.array(), 0, position);
            lvb0Var.write(allocate2.array(), 0, allocate2.limit());
        } catch (IOException unused) {
            bEVar.e(260L, bF.d.b, null);
            bEVar.r().h();
        }
    }
}
