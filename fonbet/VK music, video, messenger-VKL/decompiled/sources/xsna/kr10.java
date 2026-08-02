package xsna;

import android.net.Uri;
import androidx.annotation.Nullable;
import androidx.media3.common.StreamKey;
import com.google.common.collect.ImmutableList;
import com.mbridge.msdk.playercommon.exoplayer2.C;
import com.unity3d.services.UnityAdsConstants;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Objects;

/* compiled from: MediaItem.java */
/* loaded from: classes12.dex */
public final class kr10 {
    public static final /* synthetic */ int h = 0;
    public final String a;

    @Nullable
    public final f b;

    @Nullable
    @Deprecated
    public final f c;
    public final e d;
    public final vr10 e;
    public final c f;
    public final g g;

    /* compiled from: MediaItem.java */
    public static final class a {

        @Nullable
        public String a;

        @Nullable
        public Uri b;

        @Nullable
        public String c;

        @Nullable
        public String g;

        @Nullable
        public vr10 j;
        public b.a d = new b.a();
        public d.a e = new d.a();
        public List<StreamKey> f = Collections.EMPTY_LIST;
        public ImmutableList<i> h = com.google.common.collect.g.f;
        public e.a k = new e.a();
        public g l = g.a;
        public long i = C.TIME_UNSET;

        public final kr10 a() {
            f fVar;
            this.e.getClass();
            Uri uri = this.b;
            if (uri != null) {
                String str = this.c;
                this.e.getClass();
                fVar = new f(uri, str, null, this.f, this.g, this.h, this.i);
            } else {
                fVar = null;
            }
            String str2 = this.a;
            if (str2 == null) {
                str2 = "";
            }
            String str3 = str2;
            b.a aVar = this.d;
            aVar.getClass();
            c cVar = new c(aVar);
            e.a aVar2 = this.k;
            aVar2.getClass();
            e eVar = new e(aVar2);
            vr10 vr10Var = this.j;
            if (vr10Var == null) {
                vr10Var = vr10.B;
            }
            return new kr10(str3, cVar, fVar, eVar, vr10Var, this.l);
        }

        public final void b(@Nullable String str) {
            this.g = str;
        }

        public final void c(String str) {
            str.getClass();
            this.a = str;
        }

        public final void d(@Nullable String str) {
            this.c = str;
        }

        public final void e(@Nullable List list) {
            this.f = (list == null || list.isEmpty()) ? Collections.EMPTY_LIST : Collections.unmodifiableList(new ArrayList(list));
        }

        public final void f(@Nullable Uri uri) {
            this.b = uri;
        }
    }

    /* compiled from: MediaItem.java */
    public static class b {
        public static final b f = new b(new a());
        public final long a;
        public final long b;
        public final long c;
        public final long d;
        public final boolean e;

        /* compiled from: MediaItem.java */
        public static final class a {
            public long a;
            public long b = Long.MIN_VALUE;
            public boolean c;

            @Deprecated
            public final c a() {
                return new c(this);
            }
        }

        static {
            cq.h(0, 1, 2, 3, 4);
            y2r0.L(5);
            y2r0.L(6);
            y2r0.L(7);
        }

        public b(a aVar) {
            this.a = y2r0.j0(aVar.a);
            this.c = y2r0.j0(aVar.b);
            this.b = aVar.a;
            this.d = aVar.b;
            this.e = aVar.c;
        }

        public final a a() {
            a aVar = new a();
            aVar.a = this.b;
            aVar.b = this.d;
            aVar.c = this.e;
            return aVar;
        }

        public final boolean equals(@Nullable Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof b)) {
                return false;
            }
            b bVar = (b) obj;
            return this.b == bVar.b && this.d == bVar.d && this.e == bVar.e;
        }

        public final int hashCode() {
            long j = this.b;
            int i = ((int) (j ^ (j >>> 32))) * 31;
            long j2 = this.d;
            return (((i + ((int) ((j2 >>> 32) ^ j2))) * 29791) + (this.e ? 1 : 0)) * 31;
        }
    }

    /* compiled from: MediaItem.java */
    @Deprecated
    public static final class c extends b {
        static {
            new b.a().a();
        }
    }

    /* compiled from: MediaItem.java */
    public static final class d {

        /* compiled from: MediaItem.java */
        public static final class a {
            public a() {
                com.google.common.collect.h hVar = com.google.common.collect.h.h;
                ImmutableList.b bVar = ImmutableList.c;
                com.google.common.collect.g gVar = com.google.common.collect.g.f;
            }
        }

        public final boolean equals(@Nullable Object obj) {
            throw null;
        }
    }

    /* compiled from: MediaItem.java */
    public static final class e {
        public final long a;
        public final long b;
        public final long c;
        public final float d;
        public final float e;

        /* compiled from: MediaItem.java */
        public static final class a {
            public long a = C.TIME_UNSET;
            public long b = C.TIME_UNSET;
            public long c = C.TIME_UNSET;
            public float d = -3.4028235E38f;
            public float e = -3.4028235E38f;

            public final e a() {
                return new e(this);
            }
        }

        static {
            new a().a();
            y2r0.L(0);
            y2r0.L(1);
            y2r0.L(2);
            y2r0.L(3);
            y2r0.L(4);
        }

        public e(a aVar) {
            long j = aVar.a;
            long j2 = aVar.b;
            long j3 = aVar.c;
            float f = aVar.d;
            float f2 = aVar.e;
            this.a = j;
            this.b = j2;
            this.c = j3;
            this.d = f;
            this.e = f2;
        }

        public final a a() {
            a aVar = new a();
            aVar.a = this.a;
            aVar.b = this.b;
            aVar.c = this.c;
            aVar.d = this.d;
            aVar.e = this.e;
            return aVar;
        }

        public final boolean equals(@Nullable Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof e)) {
                return false;
            }
            e eVar = (e) obj;
            return this.a == eVar.a && this.b == eVar.b && this.c == eVar.c && this.d == eVar.d && this.e == eVar.e;
        }

        public final int hashCode() {
            long j = this.a;
            long j2 = this.b;
            int i = ((((int) (j ^ (j >>> 32))) * 31) + ((int) (j2 ^ (j2 >>> 32)))) * 31;
            long j3 = this.c;
            int i2 = (i + ((int) ((j3 >>> 32) ^ j3))) * 31;
            float f = this.d;
            int floatToIntBits = (i2 + (f != UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT ? Float.floatToIntBits(f) : 0)) * 31;
            float f2 = this.e;
            return floatToIntBits + (f2 != UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT ? Float.floatToIntBits(f2) : 0);
        }
    }

    /* compiled from: MediaItem.java */
    public static final class f {
        public final Uri a;

        @Nullable
        public final String b;
        public final List<StreamKey> c;

        @Nullable
        public final String d;
        public final ImmutableList<i> e;
        public final long f;

        static {
            cq.h(0, 1, 2, 3, 4);
            y2r0.L(5);
            y2r0.L(6);
            y2r0.L(7);
        }

        public f() {
            throw null;
        }

        /* JADX WARN: Multi-variable type inference failed */
        public f(Uri uri, String str, d dVar, List list, String str2, ImmutableList immutableList, long j) {
            this.a = uri;
            this.b = io20.q(str);
            this.c = list;
            this.d = str2;
            this.e = immutableList;
            ImmutableList.b bVar = ImmutableList.c;
            ImmutableList.a aVar = new ImmutableList.a();
            for (int i = 0; i < immutableList.size(); i++) {
                ((i) immutableList.get(i)).getClass();
                aVar.c(new h());
            }
            aVar.g();
            this.f = j;
        }

        public final boolean equals(@Nullable Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof f)) {
                return false;
            }
            f fVar = (f) obj;
            if (!this.a.equals(fVar.a) || !Objects.equals(this.b, fVar.b) || !Objects.equals(null, null) || !this.c.equals(fVar.c) || !Objects.equals(this.d, fVar.d)) {
                return false;
            }
            ImmutableList<i> immutableList = fVar.e;
            ImmutableList<i> immutableList2 = this.e;
            immutableList2.getClass();
            return qhz.a(immutableList2, immutableList) && this.f == fVar.f;
        }

        public final int hashCode() {
            int hashCode = this.a.hashCode() * 31;
            String str = this.b;
            int hashCode2 = (this.c.hashCode() + ((hashCode + (str == null ? 0 : str.hashCode())) * 29791)) * 31;
            return (int) (((this.e.hashCode() + ((hashCode2 + (this.d != null ? r0.hashCode() : 0)) * 31)) * 31 * 31) + this.f);
        }
    }

    /* compiled from: MediaItem.java */
    public static final class g {
        public static final g a = new g();

        static {
            y2r0.L(0);
            y2r0.L(1);
            y2r0.L(2);
        }

        public final boolean equals(@Nullable Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof g)) {
                return false;
            }
            ((g) obj).getClass();
            return true;
        }

        public final int hashCode() {
            return 0;
        }
    }

    /* compiled from: MediaItem.java */
    @Deprecated
    public static final class h extends i {
    }

    /* compiled from: MediaItem.java */
    public static class i {
        static {
            cq.h(0, 1, 2, 3, 4);
            y2r0.L(5);
            y2r0.L(6);
        }

        public final boolean equals(@Nullable Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof i)) {
                return false;
            }
            ((i) obj).getClass();
            throw null;
        }

        public final int hashCode() {
            throw null;
        }
    }

    static {
        b.a aVar = new b.a();
        com.google.common.collect.h hVar = com.google.common.collect.h.h;
        ImmutableList.b bVar = ImmutableList.c;
        com.google.common.collect.g gVar = com.google.common.collect.g.f;
        List list = Collections.EMPTY_LIST;
        com.google.common.collect.g gVar2 = com.google.common.collect.g.f;
        e.a aVar2 = new e.a();
        g gVar3 = g.a;
        aVar.a();
        aVar2.a();
        vr10 vr10Var = vr10.B;
        cq.h(0, 1, 2, 3, 4);
        y2r0.L(5);
    }

    public kr10(String str, c cVar, f fVar, e eVar, vr10 vr10Var, g gVar) {
        this.a = str;
        this.b = fVar;
        this.c = fVar;
        this.d = eVar;
        this.e = vr10Var;
        this.f = cVar;
        this.g = gVar;
    }

    public static kr10 b(Uri uri) {
        b.a aVar = new b.a();
        com.google.common.collect.h hVar = com.google.common.collect.h.h;
        ImmutableList.b bVar = ImmutableList.c;
        com.google.common.collect.g gVar = com.google.common.collect.g.f;
        List list = Collections.EMPTY_LIST;
        com.google.common.collect.g gVar2 = com.google.common.collect.g.f;
        e.a aVar2 = new e.a();
        return new kr10("", new c(aVar), uri != null ? new f(uri, null, null, list, null, gVar2, C.TIME_UNSET) : null, new e(aVar2), vr10.B, g.a);
    }

    public final a a() {
        a aVar = new a();
        aVar.d = this.f.a();
        aVar.a = this.a;
        aVar.j = this.e;
        aVar.k = this.d.a();
        aVar.l = this.g;
        f fVar = this.b;
        if (fVar != null) {
            aVar.g = fVar.d;
            aVar.c = fVar.b;
            aVar.b = fVar.a;
            aVar.f = fVar.c;
            aVar.h = fVar.e;
            aVar.e = new d.a();
            aVar.i = fVar.f;
        }
        return aVar;
    }

    public final boolean equals(@Nullable Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof kr10)) {
            return false;
        }
        kr10 kr10Var = (kr10) obj;
        return Objects.equals(this.a, kr10Var.a) && this.f.equals(kr10Var.f) && Objects.equals(this.b, kr10Var.b) && this.d.equals(kr10Var.d) && Objects.equals(this.e, kr10Var.e) && Objects.equals(this.g, kr10Var.g);
    }

    public final int hashCode() {
        int hashCode = this.a.hashCode() * 31;
        f fVar = this.b;
        int hashCode2 = (this.e.hashCode() + ((this.f.hashCode() + ((this.d.hashCode() + ((hashCode + (fVar != null ? fVar.hashCode() : 0)) * 31)) * 31)) * 31)) * 31;
        this.g.getClass();
        return hashCode2;
    }
}
