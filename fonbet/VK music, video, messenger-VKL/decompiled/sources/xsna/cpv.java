package xsna;

import android.graphics.Bitmap;
import com.vk.log.L;
import com.vk.log.LoggerOutputTarget;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.atomic.AtomicInteger;
import kotlin.LazyThreadSafetyMode;

/* compiled from: Icon.kt */
/* loaded from: classes2.dex */
public final class cpv implements md7 {
    public static final long m = gqr.a(0.5f, 0.5f);
    public final String a;
    public final boolean b;
    public int c;
    public final Bitmap d;
    public final long e;
    public final boolean f;
    public final boolean g;
    public final CharSequence h;
    public final CharSequence i;
    public final Object j;
    public volatile boolean k;
    public final AtomicInteger l;

    /* compiled from: Icon.kt */
    public static final class b implements gzs<rv50> {
        public b() {
        }

        @Override // xsna.gzs
        public final rv50 invoke() {
            ConcurrentHashMap<Integer, RuntimeException> concurrentHashMap = vc7.a;
            Bitmap bitmap = cpv.this.d;
            vc7.a(bitmap);
            return new rv50(znk0.k(bitmap));
        }
    }

    public cpv(String str, boolean z, int i, Bitmap bitmap, long j, boolean z2, boolean z3, CharSequence charSequence, CharSequence charSequence2) {
        this.a = str;
        this.b = z;
        this.c = i;
        this.d = bitmap;
        this.e = j;
        this.f = z2;
        this.g = z3;
        this.h = charSequence;
        this.i = charSequence2;
        this.j = msy.a(LazyThreadSafetyMode.PUBLICATION, new b());
        this.l = new AtomicInteger(0);
    }

    /* JADX WARN: Type inference failed for: r0v3, types: [java.lang.Object, kotlin.Lazy] */
    /* JADX WARN: Type inference failed for: r0v5, types: [java.lang.Object, kotlin.Lazy] */
    @Override // xsna.md7
    public final void a() {
        if (this.l.get() <= 0) {
            ConcurrentHashMap<Integer, RuntimeException> concurrentHashMap = vc7.a;
            if (this.j.isInitialized()) {
                tb7 tb7Var = ((rv50) this.j.getValue()).a;
                return;
            }
            return;
        }
        this.k = true;
        L l = L.a;
        l.getClass();
        if (L.m(LoggerOutputTarget.NONE)) {
            return;
        }
        L.u(l, L.LogType.w, new Object[]{"try to recycle count = " + this.l.get() + " #" + this.a});
    }

    public final cpv b() {
        int i = this.c;
        Bitmap bitmap = this.d;
        Bitmap.Config config = bitmap.getConfig();
        if (config == null) {
            config = Bitmap.Config.ARGB_8888;
        }
        return new cpv(this.a, this.b, i, bitmap.copy(config, false), this.e, this.f, this.g, this.i, 128);
    }

    public final void c() {
        if (this.l.decrementAndGet() == 0 && this.k) {
            a();
        }
    }

    @Override // xsna.md7
    public final Bitmap getBitmap() {
        return this.d;
    }

    /* compiled from: Icon.kt */
    public static final class a implements md7 {
        public final Bitmap a;
        public final float b;
        public final float c;
        public final boolean d;
        public final boolean e;
        public final CharSequence f;
        public final CharSequence g;

        public a(Bitmap bitmap, float f, float f2, boolean z, boolean z2, CharSequence charSequence, CharSequence charSequence2) {
            this.a = bitmap;
            this.b = f;
            this.c = f2;
            this.d = z;
            this.e = z2;
            this.f = charSequence;
            this.g = charSequence2;
        }

        @Override // xsna.md7
        public final void a() {
            this.a.recycle();
        }

        public final cpv b(String str, boolean z, int i, CharSequence charSequence, CharSequence charSequence2) {
            long a = gqr.a(this.b, this.c);
            CharSequence charSequence3 = this.f;
            CharSequence charSequence4 = charSequence3 == null ? charSequence : charSequence3;
            CharSequence charSequence5 = this.g;
            return new cpv(str, z, i, this.a, a, this.d, this.e, charSequence4, charSequence5 == null ? charSequence2 : charSequence5);
        }

        @Override // xsna.md7
        public final Bitmap getBitmap() {
            return this.a;
        }

        public /* synthetic */ a(Bitmap bitmap, float f, int i) {
            this(bitmap, 0.5f, f, false, false, null, null);
        }
    }

    public /* synthetic */ cpv(String str, boolean z, int i, Bitmap bitmap, long j, boolean z2, boolean z3, CharSequence charSequence, int i2) {
        this(str, z, i, bitmap, (i2 & 16) != 0 ? m : j, (i2 & 32) != 0 ? false : z2, (i2 & 64) != 0 ? false : z3, (CharSequence) null, (i2 & 256) != 0 ? null : charSequence);
    }
}
