package xsna;

import android.content.Context;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import com.unity3d.services.UnityAdsConstants;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.TreeSet;

/* compiled from: r8-map-id-8a00ff42af949b1913775377e888ba3d64200bdaff78f642603b0d3aafb83a92 */
/* loaded from: classes14.dex */
public final class c8x extends t46 {
    public final Context e;
    public final i620 f;
    public final String g;
    public rez0 h;
    public p7z0 i;
    public d8x j;
    public e8x k;
    public c l;
    public int m;
    public float[] n;
    public float o;
    public float p;

    /* compiled from: r8-map-id-8a00ff42af949b1913775377e888ba3d64200bdaff78f642603b0d3aafb83a92 */
    public static final class a {
        public final float a;
        public final boolean b;
        public final float c;
        public final int d;
        public final int e;
        public final boolean f;
        public final boolean g;
        public final boolean h;

        @NonNull
        public final String i;

        @NonNull
        public final String j;

        @NonNull
        public final ArrayList k;

        @Nullable
        public final String l;

        @Nullable
        public final String m;

        @Nullable
        public final String n;
        public final ka9 o;
        public final int p;

        @NonNull
        public final String q;

        @NonNull
        public final String r;

        @Nullable
        public final kiw s;

        @Nullable
        public final List<rej0> t;

        public a(String str, boolean z, float f, float f2, int i, int i2, boolean z2, boolean z3, ArrayList arrayList, boolean z4, String str2, String str3, String str4, ka9 ka9Var, int i3, kiw kiwVar, ArrayList arrayList2, String str5, String str6, String str7) {
            this.i = str;
            this.b = z;
            this.c = f;
            this.a = f2;
            this.e = i2;
            this.d = i;
            this.g = z2;
            this.h = z3;
            this.k = arrayList;
            this.f = z4;
            this.j = str2;
            this.m = str3;
            this.n = str4;
            this.o = ka9Var;
            this.p = i3;
            this.s = kiwVar;
            this.t = arrayList2;
            this.l = str5;
            this.q = str6;
            this.r = str7;
        }

        @NonNull
        public final String toString() {
            StringBuilder sb = new StringBuilder("InstreamAdBanner{duration=");
            sb.append(this.a);
            sb.append(", allowClose=");
            sb.append(this.b);
            sb.append(", allowCloseDelay=");
            sb.append(this.c);
            sb.append(", videoWidth=");
            sb.append(this.d);
            sb.append(", videoHeight=");
            sb.append(this.e);
            sb.append(", hasAdChoices=");
            sb.append(this.f);
            sb.append(", allowPause=");
            sb.append(this.g);
            sb.append(", hasShoppable=");
            sb.append(this.h);
            sb.append(", id='");
            sb.append(this.i);
            sb.append("', advertisingLabel='");
            sb.append(this.j);
            sb.append("', companionBanners=");
            sb.append(this.k);
            sb.append(", aboutCompany=");
            sb.append(this.m);
            sb.append(", marker=");
            sb.append(this.n);
            sb.append(", callToActionData='");
            sb.append(this.o);
            sb.append("', postViewDuration='");
            sb.append(this.p);
            sb.append("', bundleId='");
            sb.append(this.l);
            sb.append("', disclaimer='");
            sb.append(this.q);
            sb.append("', ageRestrictions='");
            sb.append(this.r);
            sb.append("', adChoicesIcon=");
            sb.append(this.s);
            sb.append(", shoppableAdsItems=");
            return ms9.a('}', sb, this.t);
        }
    }

    /* compiled from: r8-map-id-8a00ff42af949b1913775377e888ba3d64200bdaff78f642603b0d3aafb83a92 */
    public static final class b {
        public final int a;
        public final int b;
        public final int c;
        public final int d;
        public final int e;
        public final int f;
        public final boolean g;

        @Nullable
        public final String h;

        @Nullable
        public final String i;

        @Nullable
        public final String j;

        @Nullable
        public final String k;

        @Nullable
        public final String l;

        @Nullable
        public final String m;

        @Nullable
        public final String n;

        public b(int i, int i2, int i3, int i4, int i5, int i6, boolean z, String str, String str2, String str3, String str4, String str5, String str6, String str7) {
            this.a = i;
            this.b = i2;
            this.c = i3;
            this.d = i4;
            this.e = i5;
            this.f = i6;
            this.g = z;
            this.h = str;
            this.i = str2;
            this.j = str3;
            this.k = str4;
            this.l = str5;
            this.m = str6;
            this.n = str7;
        }

        @NonNull
        public final String toString() {
            StringBuilder sb = new StringBuilder("InstreamAdCompanionBanner{width=");
            sb.append(this.a);
            sb.append(", height=");
            sb.append(this.b);
            sb.append(", assetWidth=");
            sb.append(this.c);
            sb.append(", assetHeight=");
            sb.append(this.d);
            sb.append(", expandedWidth=");
            sb.append(this.e);
            sb.append(", expandedHeight=");
            sb.append(this.f);
            sb.append(", isClickable=");
            sb.append(this.g);
            sb.append(", staticResource='");
            sb.append(this.h);
            sb.append("', iframeResource='");
            sb.append(this.i);
            sb.append("', htmlResource='");
            sb.append(this.j);
            sb.append("', apiFramework='");
            sb.append(this.k);
            sb.append("', adSlotID='");
            sb.append(this.l);
            sb.append("', required='");
            sb.append(this.m);
            sb.append("', bundleId='");
            return i5s.a(sb, this.n, "'}");
        }
    }

    /* compiled from: r8-map-id-8a00ff42af949b1913775377e888ba3d64200bdaff78f642603b0d3aafb83a92 */
    public interface c {
        void a(float f, float f2);

        void b();

        void c();

        void d(@NonNull d dVar);

        void e();

        void f();

        void g();

        void h(@NonNull a aVar);

        void i();

        void j(@NonNull a aVar);

        void k();

        void onComplete(@NonNull String str);

        void onError();
    }

    /* compiled from: r8-map-id-8a00ff42af949b1913775377e888ba3d64200bdaff78f642603b0d3aafb83a92 */
    public static final class d {
        public final float a;
        public final boolean b;
        public final float c;
        public final boolean d;

        @NonNull
        public final String e;

        @NonNull
        public final vws0 f;

        @Nullable
        public final kiw g;

        @Nullable
        public final String h;

        public d(String str, boolean z, float f, float f2, boolean z2, kiw kiwVar, vws0 vws0Var, String str2) {
            this.e = str;
            this.b = z;
            this.c = f;
            this.a = f2;
            this.d = z2;
            this.g = kiwVar;
            this.f = vws0Var;
            this.h = str2;
        }

        @NonNull
        public final String toString() {
            StringBuilder sb = new StringBuilder("InstreamAdVideoMotionBanner{duration=");
            sb.append(this.a);
            sb.append(", allowClose=");
            sb.append(this.b);
            sb.append(", allowCloseDelay=");
            sb.append(this.c);
            sb.append(", hasAdChoices=");
            sb.append(this.d);
            sb.append(", id='");
            sb.append(this.e);
            sb.append("', videoMotionData=");
            sb.append(this.f);
            sb.append(", adChoicesIcon=");
            sb.append(this.g);
            sb.append(", bundleId='");
            return i5s.a(sb, this.h, "'}");
        }
    }

    public c8x(int i, @NonNull i620 i620Var, @NonNull Context context) {
        super(context, i, "instreamads");
        this.m = 10;
        this.p = 1.0f;
        this.e = context;
        this.f = i620Var;
        this.g = null;
        String str = gt50.a;
        gu8.d("Instream ad created with slotId. Version - 5.50.2");
    }

    public final void c(rez0 rez0Var, xla xlaVar) {
        c cVar = this.l;
        if (cVar == null) {
            return;
        }
        iaz0 iaz0Var = (iaz0) xlaVar.b;
        if (rez0Var == null) {
            if (iaz0Var == null) {
                iaz0 iaz0Var2 = iaz0.c;
            }
            cVar.g();
            return;
        }
        for (pjz0 pjz0Var : rez0Var.b.values()) {
            if (!pjz0Var.d.isEmpty() || !pjz0Var.f.isEmpty() || !pjz0Var.e.isEmpty()) {
                this.h = rez0Var;
                p7z0 p7z0Var = new p7z0(this, rez0Var, this.a, this.b, this.f);
                this.i = p7z0Var;
                p7z0Var.u = this.m;
                float f = this.p;
                ihz0 ihz0Var = p7z0Var.d;
                d8x d8xVar = ihz0Var.g;
                if (d8xVar != null) {
                    d8xVar.setVolume(f);
                }
                ihz0Var.l = f;
                d8x d8xVar2 = this.j;
                if (d8xVar2 != null) {
                    this.i.b(d8xVar2);
                }
                e8x e8xVar = this.k;
                if (e8xVar != null) {
                    n0z0 n0z0Var = this.i.e;
                    n0z0Var.b = e8xVar;
                    e8xVar.f(n0z0Var);
                }
                e(this.o);
                p7z0 p7z0Var2 = this.i;
                if (p7z0Var2 != null) {
                    p7z0Var2.r.getClass();
                }
                this.l.c();
                return;
            }
        }
        c cVar2 = this.l;
        if (iaz0Var == null) {
            iaz0 iaz0Var3 = iaz0.c;
        }
        cVar2.g();
    }

    public final void d(String str) {
        p7z0 p7z0Var = this.i;
        if (p7z0Var == null) {
            gu8.c(null, "InstreamAd: Unable to start ad - not loaded yet");
            return;
        }
        if (p7z0Var.d.g == null) {
            gu8.c(null, "InstreamAd: Unable to start ad - player has not set");
            return;
        }
        p7z0Var.d(p7z0Var.j);
        pjz0 b2 = p7z0Var.b.b(str);
        if (b2 == null) {
            gu8.c(null, "InstreamAdEngine: No section with name ".concat(str));
        } else {
            p7z0Var.v.b(b2, -1.0f, p7z0Var.c.j, p7z0Var.w, new tje(p7z0Var, b2));
        }
    }

    public final void e(float f) {
        pjz0 b2;
        float a2;
        if (f <= UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT) {
            gu8.c(null, "InstreamAd: Midpoints are not configured, duration is not set or <= zero");
            return;
        }
        if (this.n != null) {
            gu8.c(null, "InstreamAd: Midpoints already configured");
            return;
        }
        this.o = f;
        rez0 rez0Var = this.h;
        if (rez0Var == null || (b2 = rez0Var.b("midroll")) == null) {
            return;
        }
        TreeSet treeSet = new TreeSet();
        for (lgz0 lgz0Var : b2.i()) {
            float t = lgz0Var.t();
            float u = lgz0Var.u();
            if (u >= UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT && u <= 100.0f) {
                t = (u / 100.0f) * f;
            } else if (t < UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT || t > f) {
                if (t == -1.0f && u == -1.0f) {
                    t = f * 0.5f;
                } else {
                    gu8.c(null, "MediaUtils: Midroll banner " + lgz0Var.r() + " excluded, had point=" + t + ", pointP=" + u + ", content duration=" + f);
                }
            }
            float round = Math.round(t * 10.0f) / 10.0f;
            lgz0Var.s(round);
            treeSet.add(Float.valueOf(round));
        }
        for (jkz0 jkz0Var : b2.j()) {
            float a3 = jkz0Var.a();
            float b3 = jkz0Var.b();
            if (b3 >= UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT && b3 <= 100.0f) {
                a2 = (b3 / 100.0f) * f;
            } else if (a3 < UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT || a3 > f) {
                gu8.c(null, "MediaUtils: Midroll service " + jkz0Var.f() + " excluded, had point=" + a3 + ", pointP=" + b3 + ", content duration=" + f);
            } else {
                a2 = jkz0Var.a();
            }
            float round2 = Math.round(a2 * 10.0f) / 10.0f;
            jkz0Var.d(round2);
            treeSet.add(Float.valueOf(round2));
        }
        float[] fArr = new float[treeSet.size()];
        Iterator it = treeSet.iterator();
        int i = 0;
        while (it.hasNext()) {
            fArr[i] = ((Float) it.next()).floatValue();
            i++;
        }
        this.n = fArr;
        p7z0 p7z0Var = this.i;
        if (p7z0Var != null) {
            p7z0Var.s = fArr;
        }
    }

    public final void f(@Nullable d8x d8xVar) {
        this.j = d8xVar;
        p7z0 p7z0Var = this.i;
        if (p7z0Var != null) {
            p7z0Var.b(d8xVar);
        }
    }

    public c8x(@NonNull String str, @NonNull i620 i620Var, @NonNull Context context) {
        super(context, 0, "instreamads");
        this.m = 10;
        this.p = 1.0f;
        this.e = context;
        this.f = i620Var;
        this.g = str;
        String str2 = gt50.a;
        gu8.d("Instream ad created with json. Version - 5.50.2");
    }
}
