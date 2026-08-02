package xsna;

import android.os.Looper;
import android.util.SparseIntArray;
import androidx.annotation.Nullable;
import com.google.android.gms.cast.MediaInfo;
import com.google.android.gms.cast.MediaStatus;
import com.google.android.gms.common.api.Status;
import com.google.android.gms.common.api.internal.BasePendingResult;
import com.google.android.gms.internal.cast.zzfk;
import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;
import xsna.lvf0;

/* compiled from: com.google.android.gms:play-services-cast-framework@@22.3.1 */
/* loaded from: classes12.dex */
public final class pv10 {
    public long b;
    public final lvf0 c;
    public ArrayList d;
    public final SparseIntArray e;
    public final cj01 f;
    public final ArrayList g;
    public final ArrayDeque h;
    public final zzfk i;
    public final mh01 j;

    @Nullable
    public BasePendingResult k;

    @Nullable
    public BasePendingResult l;
    public final Set m = Collections.synchronizedSet(new HashSet());
    public final o100 a = new o100("MediaQueue", null);

    /* compiled from: com.google.android.gms:play-services-cast-framework@@22.3.1 */
    public static abstract class a {
    }

    public pv10(lvf0 lvf0Var) {
        this.c = lvf0Var;
        Math.max(20, 1);
        this.d = new ArrayList();
        this.e = new SparseIntArray();
        this.g = new ArrayList();
        this.h = new ArrayDeque(20);
        this.i = new zzfk(Looper.getMainLooper());
        this.j = new mh01(this);
        lvf0Var.t(new am01(this));
        this.f = new cj01(this);
        this.b = e();
        b();
    }

    public final void a() {
        f();
        this.d.clear();
        this.e.clear();
        this.f.evictAll();
        this.g.clear();
        this.i.removeCallbacks(this.j);
        this.h.clear();
        BasePendingResult basePendingResult = this.l;
        if (basePendingResult != null) {
            basePendingResult.cancel();
            this.l = null;
        }
        BasePendingResult basePendingResult2 = this.k;
        if (basePendingResult2 != null) {
            basePendingResult2.cancel();
            this.k = null;
        }
        h();
        g();
    }

    public final void b() {
        BasePendingResult basePendingResult;
        BasePendingResult basePendingResult2;
        exc0.e("Must be called from the main thread.");
        if (this.b != 0 && (basePendingResult = this.l) == null) {
            if (basePendingResult != null) {
                basePendingResult.cancel();
                this.l = null;
            }
            BasePendingResult basePendingResult3 = this.k;
            if (basePendingResult3 != null) {
                basePendingResult3.cancel();
                this.k = null;
            }
            lvf0 lvf0Var = this.c;
            lvf0Var.getClass();
            exc0.e("Must be called from the main thread.");
            if (lvf0Var.H()) {
                hxz0 hxz0Var = new hxz0(lvf0Var);
                lvf0.J(hxz0Var);
                basePendingResult2 = hxz0Var;
            } else {
                basePendingResult2 = lvf0.G();
            }
            this.l = basePendingResult2;
            basePendingResult2.setResultCallback(new tdg0() { // from class: xsna.jl01
                @Override // xsna.tdg0
                public final void a(qdg0 qdg0Var) {
                    Status status = ((lvf0.c) qdg0Var).getStatus();
                    int i = status.b;
                    pv10 pv10Var = pv10.this;
                    if (i != 0) {
                        pv10Var.a.c(com.vk.movika.sdk.base.model.history.b.b(i, "Error fetching queue item ids, statusCode=", ", statusMessage=", status.c), new Object[0]);
                    }
                    pv10Var.l = null;
                    if (pv10Var.h.isEmpty()) {
                        return;
                    }
                    zzfk zzfkVar = pv10Var.i;
                    mh01 mh01Var = pv10Var.j;
                    zzfkVar.removeCallbacks(mh01Var);
                    zzfkVar.postDelayed(mh01Var, 500L);
                }
            });
        }
    }

    public final /* synthetic */ void c() {
        SparseIntArray sparseIntArray = this.e;
        sparseIntArray.clear();
        for (int i = 0; i < this.d.size(); i++) {
            sparseIntArray.put(((Integer) this.d.get(i)).intValue(), i);
        }
    }

    public final void d() {
        Set set = this.m;
        synchronized (set) {
            try {
                Iterator it = set.iterator();
                while (it.hasNext()) {
                    ((a) it.next()).getClass();
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public final long e() {
        MediaStatus h = this.c.h();
        if (h == null) {
            return 0L;
        }
        MediaInfo mediaInfo = h.b;
        int i = mediaInfo == null ? -1 : mediaInfo.c;
        int i2 = h.f;
        int i3 = h.g;
        int i4 = h.m;
        if (i2 == 1) {
            if (i3 != 1) {
                if (i3 != 2) {
                    if (i3 != 3) {
                        return 0L;
                    }
                } else if (i != 2) {
                    return 0L;
                }
            }
            if (i4 == 0) {
                return 0L;
            }
        }
        return h.c;
    }

    public final void f() {
        Set set = this.m;
        synchronized (set) {
            try {
                Iterator it = set.iterator();
                while (it.hasNext()) {
                    ((a) it.next()).getClass();
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public final void g() {
        Set set = this.m;
        synchronized (set) {
            try {
                Iterator it = set.iterator();
                while (it.hasNext()) {
                    ((a) it.next()).getClass();
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public final void h() {
        Set set = this.m;
        synchronized (set) {
            try {
                Iterator it = set.iterator();
                while (it.hasNext()) {
                    ((a) it.next()).getClass();
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }
}
