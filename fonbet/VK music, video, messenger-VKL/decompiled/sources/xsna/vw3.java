package xsna;

import android.os.Handler;
import android.os.Looper;
import android.util.Log;
import com.vk.stat.model.DevNullEventKey;
import com.vk.stat.scheme.SchemeStat$TypeDevNullItem;
import java.util.LinkedHashMap;
import java.util.LinkedHashSet;
import one.video.assertions.TrackedAssertionError;
import xsna.j8y;
import xsna.wcy;
import xsna.ww3;

/* compiled from: AssertionTracker.kt */
/* loaded from: classes8.dex */
public final class vw3 {
    public final String a;
    public final a b;
    public final boolean c;
    public ww3.c d;
    public final Handler e;
    public final LinkedHashSet f;
    public final Object g;
    public int h;
    public LinkedHashMap i;

    /* compiled from: AssertionTracker.kt */
    public static final class a {
        public final boolean a;
        public final long b;
        public final int c;

        public a() {
            this(7);
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof a)) {
                return false;
            }
            a aVar = (a) obj;
            return this.a == aVar.a && this.b == aVar.b && this.c == aVar.c;
        }

        public final int hashCode() {
            return Integer.hashCode(this.c) + bh10.a(Boolean.hashCode(this.a) * 31, 31, this.b);
        }

        public final String toString() {
            return "Config(throwAssertionError=" + this.a + ", sendTimeout=" + this.b + ", maxEvents=" + this.c + ")";
        }

        public a(int i) {
            this.a = false;
            this.b = 15000L;
            this.c = 1000;
        }
    }

    public vw3(String str, a aVar, boolean z) {
        this.a = str;
        this.b = aVar;
        this.c = z;
        Looper myLooper = Looper.myLooper();
        this.e = new Handler(myLooper == null ? Looper.getMainLooper() : myLooper);
        this.f = new LinkedHashSet();
        this.g = new Object();
        this.i = new LinkedHashMap();
    }

    public final void a(String str, gzs gzsVar, boolean z) {
        boolean z2;
        ww3.c cVar;
        if (!wn80.g || z) {
            return;
        }
        String str2 = (String) gzsVar.invoke();
        TrackedAssertionError trackedAssertionError = new TrackedAssertionError(this.a, str, str2);
        Log.e("AssertionTracker", str2, trackedAssertionError);
        if (this.c) {
            if (this.f.add(Integer.valueOf(mnh0.A(trackedAssertionError).hashCode())) && (cVar = this.d) != null) {
                cVar.getClass();
                sdi sdiVar = ww3.e;
                if (sdiVar != null) {
                    sdiVar.getClass();
                    com.vk.metrics.eventtracking.b.a.a(trackedAssertionError);
                }
            }
            synchronized (this.g) {
                try {
                    Integer num = (Integer) this.i.get(str);
                    this.i.put(str, Integer.valueOf((num != null ? num.intValue() : 0) + 1));
                    int i = this.h + 1;
                    this.h = i;
                    z2 = i >= this.b.c;
                } catch (Throwable th) {
                    throw th;
                }
            }
            this.e.removeCallbacksAndMessages(null);
            if (z2) {
                d();
            } else {
                this.e.postDelayed(new tw3(this, 0), this.b.b);
            }
        }
        if (this.b.a) {
            throw trackedAssertionError;
        }
    }

    public final <E extends Enum<E>> void b(boolean z, E e, gzs<String> gzsVar) {
        a(e.toString(), gzsVar, z);
    }

    public final void d() {
        LinkedHashMap linkedHashMap;
        int i;
        synchronized (this.g) {
            linkedHashMap = this.i;
            this.i = new LinkedHashMap();
            i = this.h;
            this.h = 0;
        }
        ww3.c cVar = this.d;
        if (cVar != null) {
            String str = this.a;
            j8y.a aVar = j8y.d;
            de deVar = aVar.b;
            int i2 = wcy.c;
            String b = aVar.b(s1v.p(deVar, fpf0.b(fpf0.g(wcy.a.a(fpf0.d(String.class)), wcy.a.a(fpf0.d(Integer.TYPE))))), linkedHashMap);
            cVar.getClass();
            sdi sdiVar = ww3.e;
            if (sdiVar != null) {
                sdiVar.getClass();
                SchemeStat$TypeDevNullItem schemeStat$TypeDevNullItem = new SchemeStat$TypeDevNullItem(DevNullEventKey.ASSERTIONS.h(), b, "events", Integer.valueOf(i), "ov_sdk", null, str, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, -96, 3, null);
                l5m l5mVar = new l5m(null, null, 3);
                l5mVar.g = schemeStat$TypeDevNullItem;
                l5mVar.q();
            }
        }
    }
}
