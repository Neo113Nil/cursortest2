package xsna;

import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.nio.ByteBuffer;
import java.nio.charset.Charset;
import java.nio.charset.StandardCharsets;
import java.util.Optional;
import java.util.concurrent.ConcurrentLinkedQueue;
import java.util.concurrent.locks.ReentrantLock;
import java.util.function.BiConsumer;
import java.util.function.Consumer;
import java.util.function.Predicate;
import one.video.calls.sdk_private.b0;

/* compiled from: SessionImpl.java */
/* loaded from: classes8.dex */
public final class eqy0 implements npy0 {
    public final one.video.calls.sdk_private.a0 a;
    public final kry0 b;
    public final long c;
    public final vpy0 d;
    public volatile b e;
    public final Thread g;
    public Consumer<opy0> h;
    public Consumer<opy0> i;
    public BiConsumer<Long, String> j;
    public final ReentrantLock f = new ReentrantLock();
    public final ConcurrentLinkedQueue k = new ConcurrentLinkedQueue();
    public final ConcurrentLinkedQueue l = new ConcurrentLinkedQueue();

    /* compiled from: SessionImpl.java */
    public class a implements opy0 {
        public /* synthetic */ dry0 a;

        @Override // xsna.opy0
        public final OutputStream a() {
            return null;
        }

        @Override // xsna.opy0
        public final InputStream b() {
            return this.a.b();
        }
    }

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    /* compiled from: SessionImpl.java */
    public static final class b {
        public static final b a;
        public static final b b;
        public static final b c;
        public static final b d;
        private static final /* synthetic */ b[] e;

        static {
            b bVar = new b("CREATED", 0);
            a = bVar;
            b bVar2 = new b("OPEN", 1);
            b = bVar2;
            b bVar3 = new b("CLOSING", 2);
            c = bVar3;
            b bVar4 = new b("CLOSED", 3);
            d = bVar4;
            e = new b[]{bVar, bVar2, bVar3, bVar4};
        }

        public b() {
            throw null;
        }

        public static b valueOf(String str) {
            return (b) Enum.valueOf(b.class, str);
        }

        public static b[] values() {
            return (b[]) e.clone();
        }
    }

    public eqy0(one.video.calls.sdk_private.a0 a0Var, kry0 kry0Var, upy0 upy0Var, upy0 upy0Var2, vpy0 vpy0Var) {
        this.a = a0Var;
        this.b = kry0Var;
        long c = kry0Var.a.a.c();
        this.c = c;
        this.d = vpy0Var;
        this.e = b.a;
        this.h = (Consumer) Optional.ofNullable(upy0Var).orElse(new upy0());
        this.i = (Consumer) Optional.ofNullable(upy0Var2).orElse(new upy0());
        this.j = new xpy0();
        kry0Var.b.put(10307L, new zpy0());
        Thread thread = new Thread(new ls2(13, this, kry0Var), defpackage.k0.a(c, "webtransport-connectstream-"));
        this.g = thread;
        thread.start();
    }

    public final void a(long j, String str) throws IOException {
        if (c(b.c, new aqy0(), new eqk(2))) {
            if (j < 0 || j > 4294967295L) {
                throw new IllegalArgumentException("Application error code must be a 32-bit unsigned integer");
            }
            if (str.getBytes().length > 1024) {
                throw new IllegalArgumentException("Error message must not be longer than 1024 bytes");
            }
            int i = (int) j;
            Charset charset = StandardCharsets.UTF_8;
            if (str.getBytes(charset).length > 1024) {
                throw new IllegalArgumentException("Error message must not be longer than 1024 bytes");
            }
            b0.a aVar = this.b.a;
            b0.a.C2173a c2173a = aVar.b;
            byte[] bytes = str.getBytes(charset);
            int length = bytes.length + 4;
            ByteBuffer allocate = ByteBuffer.allocate(alk.e(length) + alk.e(10307L) + length);
            alk.d(10307, allocate);
            alk.d(length, allocate);
            allocate.putInt(i);
            allocate.put(bytes);
            c2173a.write(allocate.array(), 0, allocate.position());
            allocate.position();
            aVar.b.close();
            c(b.d, new hqk(1), new zmy0(1));
            this.k.forEach(new cqy0());
            this.l.forEach(new ypy0());
            this.g.interrupt();
            this.j.accept(Long.valueOf(j), str);
            this.d.b(this);
        }
    }

    public final void b(dry0 dry0Var) {
        if (dry0Var.d()) {
            if (this.e != b.b) {
                dry0Var.a(386759528L);
                return;
            }
            this.l.add(dry0Var);
            Consumer<opy0> consumer = this.h;
            a aVar = new a();
            aVar.a = dry0Var;
            consumer.accept(aVar);
            return;
        }
        if (this.e != b.b) {
            dry0Var.a(386759528L);
            dry0Var.b(386759528L);
            return;
        }
        this.k.add(dry0Var);
        this.l.add(dry0Var);
        Consumer<opy0> consumer2 = this.i;
        dqy0 dqy0Var = new dqy0();
        dqy0Var.a = dry0Var;
        consumer2.accept(dqy0Var);
    }

    public final boolean c(b bVar, Predicate<b> predicate, Predicate<b> predicate2) {
        this.f.lock();
        try {
            if (predicate2.test(this.e)) {
                this.f.unlock();
                return false;
            }
            if (predicate.test(this.e)) {
                this.e = bVar;
                this.f.unlock();
                return true;
            }
            throw new IllegalStateException("Invalid state transition from " + this.e + " to " + bVar);
        } catch (Throwable th) {
            this.f.unlock();
            throw th;
        }
    }

    public final void d(long j, String str) {
        if (c(b.c, new hqk(1), new iqk(2))) {
            c(b.d, new hqk(1), new zmy0(1));
            this.k.forEach(new cqy0());
            this.l.forEach(new ypy0());
            try {
                this.b.a.b.close();
            } catch (IOException unused) {
            }
            this.d.b(this);
            this.j.accept(Long.valueOf(j), str);
        }
    }
}
