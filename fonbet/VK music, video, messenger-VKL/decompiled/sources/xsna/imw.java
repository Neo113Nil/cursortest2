package xsna;

import com.ironsource.mediationsdk.logger.IronSourceError;
import com.unity3d.services.UnityAdsConstants;
import java.util.ArrayList;
import java.util.List;

/* compiled from: ImageVector.kt */
/* loaded from: classes11.dex */
public final class imw {
    public static int k;
    public static final b l = new b();
    public final String a;
    public final float b;
    public final float c;
    public final float d;
    public final float e;
    public final ilr0 f;
    public final long g;
    public final int h;
    public final boolean i;
    public final int j;

    /* compiled from: ImageVector.kt */
    public static final class a {
        public final String a;
        public final float b;
        public final float c;
        public final float d;
        public final float e;
        public final long f;
        public final int g;
        public final boolean h;
        public final ArrayList<C3062a> i;
        public final C3062a j;
        public boolean k;

        /* compiled from: ImageVector.kt */
        /* renamed from: xsna.imw$a$a, reason: collision with other inner class name */
        public static final class C3062a {
            public final String a;
            public final float b;
            public final float c;
            public final float d;
            public final float e;
            public final float f;
            public final float g;
            public final float h;
            public final List<? extends qq90> i;
            public final ArrayList j;

            public C3062a() {
                this(null, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, null, IronSourceError.ERROR_RV_SHOW_CALLED_WRONG_STATE);
            }

            public C3062a(String str, float f, float f2, float f3, float f4, float f5, float f6, float f7, List list, int i) {
                str = (i & 1) != 0 ? "" : str;
                f = (i & 2) != 0 ? 0.0f : f;
                f2 = (i & 4) != 0 ? 0.0f : f2;
                f3 = (i & 8) != 0 ? 0.0f : f3;
                f4 = (i & 16) != 0 ? 1.0f : f4;
                f5 = (i & 32) != 0 ? 1.0f : f5;
                f6 = (i & 64) != 0 ? 0.0f : f6;
                f7 = (i & 128) != 0 ? 0.0f : f7;
                list = (i & 256) != 0 ? jlr0.a : list;
                ArrayList arrayList = new ArrayList();
                this.a = str;
                this.b = f;
                this.c = f2;
                this.d = f3;
                this.e = f4;
                this.f = f5;
                this.g = f6;
                this.h = f7;
                this.i = list;
                this.j = arrayList;
            }
        }

        public a(String str, float f, float f2, float f3, float f4, long j, int i, boolean z, int i2) {
            str = (i2 & 1) != 0 ? "" : str;
            long j2 = (i2 & 32) != 0 ? l5g.k : j;
            int i3 = (i2 & 64) != 0 ? 5 : i;
            boolean z2 = (i2 & 128) != 0 ? false : z;
            this.a = str;
            this.b = f;
            this.c = f2;
            this.d = f3;
            this.e = f4;
            this.f = j2;
            this.g = i3;
            this.h = z2;
            ArrayList<C3062a> arrayList = new ArrayList<>();
            this.i = arrayList;
            C3062a c3062a = new C3062a(null, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, null, IronSourceError.ERROR_RV_SHOW_CALLED_WRONG_STATE);
            this.j = c3062a;
            arrayList.add(c3062a);
        }

        public static void a(a aVar, ArrayList arrayList, rek0 rek0Var) {
            if (aVar.k) {
                uzw.b("ImageVector.Builder is single use, create a new instance to create a new ImageVector");
            }
            ((C3062a) xy9.b(1, aVar.i)).j.add(new plr0("", arrayList, 0, rek0Var, 1.0f, null, 1.0f, 1.0f, 0, 2, 1.0f, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, 1.0f, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT));
        }

        public final imw b() {
            if (this.k) {
                uzw.b("ImageVector.Builder is single use, create a new instance to create a new ImageVector");
            }
            while (true) {
                ArrayList<C3062a> arrayList = this.i;
                if (arrayList.size() <= 1) {
                    C3062a c3062a = this.j;
                    imw imwVar = new imw(this.a, this.b, this.c, this.d, this.e, new ilr0(c3062a.a, c3062a.b, c3062a.c, c3062a.d, c3062a.e, c3062a.f, c3062a.g, c3062a.h, c3062a.i, c3062a.j), this.f, this.g, this.h);
                    this.k = true;
                    return imwVar;
                }
                if (this.k) {
                    uzw.b("ImageVector.Builder is single use, create a new instance to create a new ImageVector");
                }
                C3062a remove = arrayList.remove(arrayList.size() - 1);
                ((C3062a) xy9.b(1, arrayList)).j.add(new ilr0(remove.a, remove.b, remove.c, remove.d, remove.e, remove.f, remove.g, remove.h, remove.i, remove.j));
            }
        }
    }

    /* compiled from: ImageVector.kt */
    public static final class b {
    }

    public imw(String str, float f, float f2, float f3, float f4, ilr0 ilr0Var, long j, int i, boolean z) {
        int i2;
        synchronized (l) {
            i2 = k;
            k = i2 + 1;
        }
        this.a = str;
        this.b = f;
        this.c = f2;
        this.d = f3;
        this.e = f4;
        this.f = ilr0Var;
        this.g = j;
        this.h = i;
        this.i = z;
        this.j = i2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof imw)) {
            return false;
        }
        imw imwVar = (imw) obj;
        return epx.f(this.a, imwVar.a) && pco.b(this.b, imwVar.b) && pco.b(this.c, imwVar.c) && this.d == imwVar.d && this.e == imwVar.e && this.f.equals(imwVar.f) && l5g.d(this.g, imwVar.g) && this.h == imwVar.h && this.i == imwVar.i;
    }

    public final int hashCode() {
        int hashCode = (this.f.hashCode() + io.reactivex.rxjava3.subjects.b.a(this.e, io.reactivex.rxjava3.subjects.b.a(this.d, io.reactivex.rxjava3.subjects.b.a(this.c, io.reactivex.rxjava3.subjects.b.a(this.b, this.a.hashCode() * 31, 31), 31), 31), 31)) * 31;
        int i = l5g.l;
        return Boolean.hashCode(this.i) + shy.a(this.h, bh10.a(hashCode, 31, this.g), 31);
    }
}
