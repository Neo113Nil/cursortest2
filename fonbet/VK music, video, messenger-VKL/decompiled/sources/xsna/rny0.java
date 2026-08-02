package xsna;

import com.ironsource.X3;
import java.time.Duration;
import java.time.Instant;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Objects;
import java.util.Optional;
import java.util.function.Consumer;
import one.video.calls.sdk_private.aF;

/* compiled from: PacketAssembler.java */
/* loaded from: classes8.dex */
public class rny0 {
    public static final iby0 h = new iby0(1);
    public final lgy0 a;
    public final aF b;
    public final gjy0 c;
    public final tdy0 d;
    public final sny0 e;
    public volatile boolean f;
    public iny0 g;

    /* compiled from: PacketAssembler.java */
    public static /* synthetic */ class a {
        public static final /* synthetic */ int[] a;

        static {
            int[] iArr = new int[aF.values().length];
            a = iArr;
            try {
                iArr[aF.c.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                a[aF.d.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                a[aF.b.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
        }
    }

    public rny0(lgy0 lgy0Var, aF aFVar, gjy0 gjy0Var, tdy0 tdy0Var) {
        this(lgy0Var, aFVar, gjy0Var, tdy0Var, new sny0());
    }

    /* JADX WARN: Removed duplicated region for block: B:14:0x003e A[Catch: all -> 0x0035, TryCatch #1 {all -> 0x0035, blocks: (B:4:0x0018, B:6:0x0020, B:8:0x0026, B:14:0x003e, B:15:0x0040), top: B:3:0x0018 }] */
    /* JADX WARN: Type inference failed for: r12v6, types: [xsna.qny0] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public Optional<uny0> a(int i, int i2, byte[] bArr, byte[] bArr2) {
        boolean z;
        boolean z2;
        yby0 yby0Var;
        Optional<uny0> of;
        iny0 iny0Var;
        int min = Integer.min(i, i2);
        tly0 b = b(bArr, bArr2);
        final ArrayList arrayList = new ArrayList();
        gjy0 gjy0Var = this.c;
        Instant instant = gjy0Var.a.instant();
        synchronized (gjy0Var.e) {
            try {
                Instant instant2 = gjy0Var.f;
                z = false;
                if (instant2 == null || (!instant.isAfter(instant2) && Duration.between(instant, gjy0Var.f).toMillis() >= 1)) {
                    z2 = false;
                    if (z2) {
                        gjy0Var.f = null;
                    }
                }
                z2 = true;
                if (z2) {
                }
            } catch (Throwable th) {
                throw th;
            }
        }
        if (z2 && this.d.e()) {
            yby0Var = this.d.f().get();
            if (b.b(yby0Var.a()) > i2) {
                gjy0 gjy0Var2 = this.c;
                synchronized (gjy0Var2.e) {
                    gjy0Var2.f = gjy0Var2.a.instant();
                }
                return Optional.empty();
            }
            b.i(yby0Var);
            arrayList.add(h);
            this.d.b(yby0Var, b.p().longValue());
        } else {
            yby0Var = null;
        }
        int a2 = (yby0Var != null || this.c.c.isEmpty() || !this.d.d() || (yby0Var = this.d.f().orElse(null)) == null) ? 0 : yby0Var.a();
        List list = (List) this.c.d.peekFirst();
        if (list != null && !list.isEmpty()) {
            List<ihy0> a3 = this.c.a();
            if (b.b(a3.stream().mapToInt(new pny0()).sum()) > i2) {
                fhy0 fhy0Var = new fhy0();
                if (b.b(1) > i2) {
                    return Optional.empty();
                }
                ArrayList arrayList2 = new ArrayList(1);
                Object obj = new Object[]{fhy0Var}[0];
                Objects.requireNonNull(obj);
                arrayList2.add(obj);
                a3 = Collections.unmodifiableList(arrayList2);
            }
            b.f = true;
            b.c.addAll(a3);
            return Optional.of(new uny0(b));
        }
        if (!this.c.c.isEmpty()) {
            int b2 = b.b(1000) - 1000;
            while (b2 < min) {
                int i3 = min - b2;
                int i4 = i3 - a2;
                Optional<ejy0> b3 = this.c.b(i4);
                if (b3.isPresent() || a2 <= 0) {
                    i3 = i4;
                } else {
                    b3 = this.c.b(i3);
                }
                if (!b3.isPresent()) {
                    break;
                }
                ihy0 a4 = b3.get().a(i3);
                if (a4 != null) {
                    if (a4.a() > i3) {
                        StringBuilder a5 = odj.a(a4.a(), i3, "supplier does not produce frame of right (max) size: ", " > ", " frame: ");
                        a5.append(a4);
                        throw new RuntimeException(a5.toString());
                    }
                    int a6 = a4.a() + b2;
                    b.i(a4);
                    arrayList.add(b3.get().b());
                    if (a2 <= 0 || a6 + a2 > min) {
                        b2 = a6;
                    } else {
                        b.i(yby0Var);
                        arrayList.add(h);
                        this.d.b(yby0Var, b.p().longValue());
                        b2 = yby0Var.a() + a6;
                        a2 = 0;
                    }
                }
            }
        }
        if (!this.c.d.isEmpty() && b.c.isEmpty()) {
            this.c.a();
            b.f = true;
            b.i(new fhy0());
            arrayList.add(h);
        }
        if (b.c.isEmpty()) {
            this.e.a--;
            of = Optional.empty();
        } else {
            if (b.c.size() != arrayList.size()) {
                throw new IllegalStateException();
            }
            of = Optional.of(new uny0(b, new Consumer() { // from class: xsna.qny0
                @Override // java.util.function.Consumer
                public final void accept(Object obj2) {
                    tly0 tly0Var = (tly0) obj2;
                    int i5 = 0;
                    while (true) {
                        ArrayList arrayList3 = arrayList;
                        if (i5 >= arrayList3.size()) {
                            return;
                        }
                        if (arrayList3.get(i5) != rny0.h) {
                            ((Consumer) arrayList3.get(i5)).accept((ihy0) tly0Var.c.get(i5));
                        }
                        i5++;
                    }
                }
            }));
        }
        if (this.f) {
            gjy0 gjy0Var3 = this.c;
            synchronized (gjy0Var3.e) {
                try {
                    if (gjy0Var3.c.isEmpty() && gjy0Var3.f == null) {
                        z = true;
                    }
                } catch (Throwable th2) {
                    throw th2;
                }
            }
            if (z && (iny0Var = this.g) != null) {
                iny0Var.accept(this);
                return of;
            }
        }
        return of;
    }

    public tly0 b(byte[] bArr, byte[] bArr2) {
        tly0 aly0Var;
        int i = a.a[this.b.ordinal()];
        if (i == 1) {
            aly0Var = new aly0(this.a.a, bArr, bArr2);
        } else if (i == 2) {
            kgy0 kgy0Var = this.a.a;
            aly0Var = new xly0();
            aly0Var.a = kgy0Var;
            aly0Var.e = bArr2;
            aly0Var.c = new ArrayList();
        } else {
            if (i != 3) {
                throw new RuntimeException();
            }
            aly0Var = new hmy0(this.a.a, bArr, bArr2);
        }
        sny0 sny0Var = this.e;
        long j = sny0Var.a;
        sny0Var.a = 1 + j;
        if (j < 0) {
            throw new IllegalArgumentException();
        }
        aly0Var.b = j;
        return aly0Var;
    }

    public final String toString() {
        return "PacketAssembler[" + this.b + X3.j.e;
    }

    public rny0(lgy0 lgy0Var, aF aFVar, gjy0 gjy0Var, tdy0 tdy0Var, sny0 sny0Var) {
        this.a = lgy0Var;
        this.b = aFVar;
        this.c = gjy0Var;
        this.d = tdy0Var;
        this.e = sny0Var;
    }
}
