package xsna;

import android.content.Context;
import android.content.res.Resources;
import android.media.AudioManager;
import android.media.Spatializer;
import android.media.Spatializer$OnSpatializerStateChangedListener;
import android.os.Build;
import android.os.Handler;
import android.os.Looper;
import android.text.TextUtils;
import android.util.Pair;
import android.util.SparseArray;
import android.util.SparseBooleanArray;
import androidx.annotation.Nullable;
import androidx.media3.exoplayer.k;
import com.google.common.collect.ImmutableList;
import com.ironsource.Z3;
import com.mbridge.msdk.playercommon.exoplayer2.C;
import com.mbridge.msdk.playercommon.exoplayer2.util.MimeTypes;
import io.appmetrica.analytics.coreutils.internal.StringUtils;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Objects;
import java.util.RandomAccess;
import java.util.Set;
import xsna.ahp0;
import xsna.chp0;
import xsna.d7q;
import xsna.gk0;
import xsna.ln00;

/* compiled from: DefaultTrackSelector.java */
/* loaded from: classes12.dex */
public class npl extends ln00 implements k.a {
    public static final yx80<Integer> k = new v6i(new fpl(0));
    public final Object c;

    @Nullable
    public final Context d;
    public final d7q.b e;
    public d f;

    @Nullable
    public Thread g;

    @Nullable
    public f h;
    public nc4 i;
    public Boolean j;

    /* compiled from: DefaultTrackSelector.java */
    public static final class a extends h<a> implements Comparable<a> {
        public final int f;
        public final boolean g;

        @Nullable
        public final String h;
        public final d i;
        public final boolean j;
        public final int k;
        public final int l;
        public final int m;
        public final int n;
        public final boolean o;
        public final boolean p;
        public final int q;
        public final int r;
        public final boolean s;
        public final int t;
        public final int u;
        public final int v;
        public final int w;
        public final boolean x;
        public final boolean y;
        public final boolean z;

        /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
        /* JADX WARN: Removed duplicated region for block: B:38:0x00f0 A[LOOP:1: B:36:0x00ed->B:38:0x00f0, LOOP_END] */
        /* JADX WARN: Removed duplicated region for block: B:43:0x00ff  */
        /* JADX WARN: Removed duplicated region for block: B:50:0x011a  */
        /* JADX WARN: Removed duplicated region for block: B:58:0x0137  */
        /* JADX WARN: Removed duplicated region for block: B:61:0x0142  */
        /* JADX WARN: Removed duplicated region for block: B:84:0x0144  */
        /* JADX WARN: Removed duplicated region for block: B:85:0x0139  */
        /* JADX WARN: Removed duplicated region for block: B:89:0x012f A[SYNTHETIC] */
        /* JADX WARN: Removed duplicated region for block: B:90:0x010d A[SYNTHETIC] */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
        */
        public a(int i, pfp0 pfp0Var, int i2, d dVar, int i3, boolean z, mpl mplVar, int i4) {
            super(i, pfp0Var, i2);
            int i5;
            int i6;
            boolean z2;
            String[] split;
            int i7;
            int i8;
            int i9;
            int i10;
            boolean z3;
            d dVar2;
            boolean z4;
            ahp0.a aVar;
            boolean z5;
            this.i = dVar;
            boolean z6 = dVar.C;
            ImmutableList<String> immutableList = dVar.p;
            ImmutableList<String> immutableList2 = dVar.l;
            int i11 = z6 ? 24 : 16;
            int i12 = 0;
            this.o = false;
            this.h = npl.o(this.e.d);
            this.j = androidx.media3.exoplayer.k.m(i3, false);
            int i13 = 0;
            while (true) {
                i5 = Integer.MAX_VALUE;
                if (i13 >= immutableList2.size()) {
                    i6 = 0;
                    i13 = Integer.MAX_VALUE;
                    break;
                } else {
                    i6 = npl.l(this.e, immutableList2.get(i13), false);
                    if (i6 > 0) {
                        break;
                    } else {
                        i13++;
                    }
                }
            }
            this.l = i13;
            this.k = i6;
            int i14 = this.e.f;
            this.m = (i14 == 0 || i14 != 0) ? Integer.bitCount(0) : Integer.MAX_VALUE;
            this.n = npl.j(this.e, dVar.m);
            androidx.media3.common.a aVar2 = this.e;
            int i15 = aVar2.f;
            this.p = i15 == 0 || (i15 & 1) != 0;
            this.s = (aVar2.e & 1) != 0;
            String str = aVar2.n;
            if (str != null) {
                switch (str.hashCode()) {
                    case -2123537834:
                        if (str.equals(MimeTypes.AUDIO_E_AC3_JOC)) {
                            z5 = false;
                            break;
                        }
                        z5 = -1;
                        break;
                    case 187078297:
                        if (str.equals("audio/ac4")) {
                            z5 = true;
                            break;
                        }
                        z5 = -1;
                        break;
                    case 1504698186:
                        if (str.equals("audio/iamf")) {
                            z5 = 2;
                            break;
                        }
                        z5 = -1;
                        break;
                    default:
                        z5 = -1;
                        break;
                }
                switch (z5) {
                    case false:
                    case true:
                    case true:
                        z2 = true;
                        break;
                }
                this.z = z2;
                int i16 = aVar2.F;
                this.t = i16;
                this.u = aVar2.G;
                int i17 = aVar2.j;
                this.v = i17;
                this.g = (i17 != -1 || i17 <= dVar.o) && (i16 == -1 || i16 <= dVar.n) && mplVar.apply(aVar2);
                split = Resources.getSystem().getConfiguration().getLocales().toLanguageTags().split(StringUtils.COMMA, -1);
                for (i7 = 0; i7 < split.length; i7++) {
                    split[i7] = y2r0.T(split[i7]);
                }
                i8 = 0;
                while (true) {
                    if (i8 >= split.length) {
                        i9 = npl.l(this.e, split[i8], false);
                        if (i9 <= 0) {
                            i8++;
                        }
                    } else {
                        i9 = 0;
                        i8 = Integer.MAX_VALUE;
                    }
                }
                this.q = i8;
                this.r = i9;
                i10 = 0;
                while (true) {
                    if (i10 < immutableList.size()) {
                        String str2 = this.e.n;
                        if (str2 == null || !str2.equals(immutableList.get(i10))) {
                            i10++;
                        } else {
                            i5 = i10;
                        }
                    }
                }
                this.w = i5;
                this.x = (i3 & 384) != 128;
                this.y = (i3 & 64) != 64;
                z3 = this.g;
                dVar2 = this.i;
                z4 = dVar2.E;
                aVar = dVar2.q;
                if (androidx.media3.exoplayer.k.m(i3, z4) && (z3 || dVar2.B)) {
                    aVar.getClass();
                    i12 = (androidx.media3.exoplayer.k.m(i3, false) || !z3 || this.e.j == -1 || dVar2.v || (!dVar2.F && z) || (i11 & i3) == 0) ? 1 : 2;
                }
                this.f = i12;
            }
            z2 = false;
            this.z = z2;
            int i162 = aVar2.F;
            this.t = i162;
            this.u = aVar2.G;
            int i172 = aVar2.j;
            this.v = i172;
            this.g = (i172 != -1 || i172 <= dVar.o) && (i162 == -1 || i162 <= dVar.n) && mplVar.apply(aVar2);
            split = Resources.getSystem().getConfiguration().getLocales().toLanguageTags().split(StringUtils.COMMA, -1);
            while (i7 < split.length) {
            }
            i8 = 0;
            while (true) {
                if (i8 >= split.length) {
                }
                i8++;
            }
            this.q = i8;
            this.r = i9;
            i10 = 0;
            while (true) {
                if (i10 < immutableList.size()) {
                }
                i10++;
            }
            this.w = i5;
            this.x = (i3 & 384) != 128;
            this.y = (i3 & 64) != 64;
            z3 = this.g;
            dVar2 = this.i;
            z4 = dVar2.E;
            aVar = dVar2.q;
            if (androidx.media3.exoplayer.k.m(i3, z4)) {
                aVar.getClass();
                if (androidx.media3.exoplayer.k.m(i3, false)) {
                }
            }
            this.f = i12;
        }

        @Override // xsna.npl.h
        public final int a() {
            return this.f;
        }

        @Override // xsna.npl.h
        public final boolean b(a aVar) {
            int i;
            String str;
            a aVar2 = aVar;
            androidx.media3.common.a aVar3 = aVar2.e;
            this.i.getClass();
            androidx.media3.common.a aVar4 = this.e;
            int i2 = aVar4.F;
            if (i2 == -1 || i2 != aVar3.F) {
                return false;
            }
            return (this.o || ((str = aVar4.n) != null && TextUtils.equals(str, aVar3.n))) && (i = aVar4.G) != -1 && i == aVar3.G && this.x == aVar2.x && this.y == aVar2.y;
        }

        @Override // java.lang.Comparable
        /* renamed from: c, reason: merged with bridge method [inline-methods] */
        public final int compareTo(a aVar) {
            boolean z = this.j;
            boolean z2 = this.g;
            Object d = (z2 && z) ? npl.k : npl.k.d();
            boolean z3 = aVar.j;
            int i = aVar.v;
            c7i d2 = c7i.a.d(z, z3);
            Integer valueOf = Integer.valueOf(this.l);
            Integer valueOf2 = Integer.valueOf(aVar.l);
            hw50.b.getClass();
            bgg0 bgg0Var = bgg0.b;
            c7i c = d2.c(valueOf, valueOf2, bgg0Var).a(this.k, aVar.k).a(this.m, aVar.m).c(Integer.valueOf(this.n), Integer.valueOf(aVar.n), bgg0Var).d(this.s, aVar.s).d(this.p, aVar.p).c(Integer.valueOf(this.q), Integer.valueOf(aVar.q), bgg0Var).a(this.r, aVar.r).d(z2, aVar.g).c(Integer.valueOf(this.w), Integer.valueOf(aVar.w), bgg0Var);
            this.i.getClass();
            c7i c2 = c.d(this.x, aVar.x).d(this.y, aVar.y).d(this.z, aVar.z).c(Integer.valueOf(this.t), Integer.valueOf(aVar.t), d).c(Integer.valueOf(this.u), Integer.valueOf(aVar.u), d);
            if (Objects.equals(this.h, aVar.h)) {
                c2 = c2.c(Integer.valueOf(this.v), Integer.valueOf(i), d);
            }
            return c2.f();
        }
    }

    /* compiled from: DefaultTrackSelector.java */
    public static final class b extends h<b> implements Comparable<b> {
        public final int f;
        public final int g;

        public b(int i, pfp0 pfp0Var, int i2, d dVar, int i3) {
            super(i, pfp0Var, i2);
            this.f = androidx.media3.exoplayer.k.m(i3, dVar.E) ? 1 : 0;
            this.g = this.e.b();
        }

        @Override // xsna.npl.h
        public final int a() {
            return this.f;
        }

        @Override // xsna.npl.h
        public final /* bridge */ /* synthetic */ boolean b(b bVar) {
            return false;
        }

        @Override // java.lang.Comparable
        public final int compareTo(b bVar) {
            return Integer.compare(this.g, bVar.g);
        }
    }

    /* compiled from: DefaultTrackSelector.java */
    public static final class c implements Comparable<c> {
        public final boolean b;
        public final boolean c;

        public c(int i, androidx.media3.common.a aVar) {
            this.b = (aVar.e & 1) != 0;
            this.c = androidx.media3.exoplayer.k.m(i, false);
        }

        @Override // java.lang.Comparable
        public final int compareTo(c cVar) {
            c cVar2 = cVar;
            return c7i.a.d(this.c, cVar2.c).d(this.b, cVar2.b).f();
        }
    }

    /* compiled from: DefaultTrackSelector.java */
    public static final class e {
        static {
            y2r0.L(0);
            y2r0.L(1);
            y2r0.L(2);
        }

        public final boolean equals(@Nullable Object obj) {
            if (this == obj) {
                return true;
            }
            if (obj != null && e.class == obj.getClass()) {
                if (Arrays.equals((int[]) null, (int[]) null)) {
                    return true;
                }
            }
            return false;
        }

        public final int hashCode() {
            return Arrays.hashCode((int[]) null) * 31;
        }
    }

    /* compiled from: DefaultTrackSelector.java */
    public static class f {

        @Nullable
        public final Spatializer a;
        public final boolean b;

        @Nullable
        public final Handler c;

        @Nullable
        public final a d;

        /* compiled from: DefaultTrackSelector.java */
        public class a implements Spatializer$OnSpatializerStateChangedListener {
            public final /* synthetic */ npl a;

            public a(npl nplVar) {
                this.a = nplVar;
            }

            public final void onSpatializerAvailableChanged(Spatializer spatializer, boolean z) {
                yx80<Integer> yx80Var = npl.k;
                this.a.n();
            }

            public final void onSpatializerEnabledChanged(Spatializer spatializer, boolean z) {
                yx80<Integer> yx80Var = npl.k;
                this.a.n();
            }
        }

        public f(@Nullable Context context, npl nplVar, @Nullable Boolean bool) {
            Spatializer spatializer;
            int immersiveAudioLevel;
            AudioManager a2 = context == null ? null : hq4.a(context);
            if (a2 == null || (bool != null && bool.booleanValue())) {
                this.a = null;
                this.b = false;
                this.c = null;
                this.d = null;
                return;
            }
            spatializer = a2.getSpatializer();
            this.a = spatializer;
            immersiveAudioLevel = spatializer.getImmersiveAudioLevel();
            this.b = immersiveAudioLevel != 0;
            a aVar = new a(nplVar);
            this.d = aVar;
            Looper myLooper = Looper.myLooper();
            myLooper.getClass();
            Handler handler = new Handler(myLooper);
            this.c = handler;
            spatializer.addOnSpatializerStateChangedListener(new az4(handler), aVar);
        }
    }

    /* compiled from: DefaultTrackSelector.java */
    public static final class g extends h<g> implements Comparable<g> {
        public final int f;
        public final boolean g;
        public final boolean h;
        public final boolean i;
        public final int j;
        public final int k;
        public final int l;
        public final int m;
        public final int n;
        public final boolean o;

        public g(int i, pfp0 pfp0Var, int i2, d dVar, int i3, @Nullable String str, @Nullable String str2) {
            super(i, pfp0Var, i2);
            int i4;
            int i5 = 0;
            this.g = androidx.media3.exoplayer.k.m(i3, false);
            int i6 = this.e.e;
            dVar.getClass();
            ImmutableList<String> immutableList = dVar.r;
            this.h = (i6 & 1) != 0;
            this.i = (i6 & 2) != 0;
            ImmutableList<String> p = str2 != null ? ImmutableList.p(str2) : immutableList.isEmpty() ? ImmutableList.p("") : immutableList;
            int i7 = 0;
            while (true) {
                if (i7 >= p.size()) {
                    i4 = 0;
                    i7 = Integer.MAX_VALUE;
                    break;
                } else {
                    i4 = npl.l(this.e, p.get(i7), dVar.u);
                    if (i4 > 0) {
                        break;
                    } else {
                        i7++;
                    }
                }
            }
            this.j = i7;
            this.k = i4;
            int i8 = str2 != null ? 1088 : 0;
            int i9 = this.e.f;
            yx80<Integer> yx80Var = npl.k;
            int bitCount = (i9 == 0 || i9 != i8) ? Integer.bitCount(i8 & i9) : Integer.MAX_VALUE;
            this.l = bitCount;
            androidx.media3.common.a aVar = this.e;
            this.o = (1088 & aVar.f) != 0;
            int j = npl.j(aVar, dVar.s);
            this.m = j;
            int l = npl.l(this.e, str, npl.o(str) == null);
            this.n = l;
            boolean z = i4 > 0 || (immutableList.isEmpty() && bitCount > 0) || ((immutableList.isEmpty() && j != Integer.MAX_VALUE) || this.h || (this.i && l > 0));
            if (androidx.media3.exoplayer.k.m(i3, dVar.E) && z) {
                i5 = 1;
            }
            this.f = i5;
        }

        @Override // xsna.npl.h
        public final int a() {
            return this.f;
        }

        @Override // xsna.npl.h
        public final /* bridge */ /* synthetic */ boolean b(g gVar) {
            return false;
        }

        /* JADX WARN: Multi-variable type inference failed */
        /* JADX WARN: Type inference failed for: r4v0, types: [java.util.Comparator, xsna.bgg0] */
        @Override // java.lang.Comparable
        /* renamed from: c, reason: merged with bridge method [inline-methods] */
        public final int compareTo(g gVar) {
            c7i d = c7i.a.d(this.g, gVar.g);
            Integer valueOf = Integer.valueOf(this.j);
            Integer valueOf2 = Integer.valueOf(gVar.j);
            hw50 hw50Var = hw50.b;
            hw50Var.getClass();
            ?? r4 = bgg0.b;
            c7i c = d.c(valueOf, valueOf2, r4);
            int i = gVar.k;
            int i2 = this.k;
            c7i a = c.a(i2, i);
            int i3 = gVar.l;
            int i4 = this.l;
            c7i d2 = a.a(i4, i3).c(Integer.valueOf(this.m), Integer.valueOf(gVar.m), r4).d(this.h, gVar.h);
            Boolean valueOf3 = Boolean.valueOf(this.i);
            Boolean valueOf4 = Boolean.valueOf(gVar.i);
            if (i2 != 0) {
                hw50Var = r4;
            }
            c7i a2 = d2.c(valueOf3, valueOf4, hw50Var).a(this.n, gVar.n);
            if (i4 == 0) {
                a2 = a2.e(this.o, gVar.o);
            }
            return a2.f();
        }
    }

    /* compiled from: DefaultTrackSelector.java */
    public static abstract class h<T extends h<T>> {
        public final int b;
        public final pfp0 c;
        public final int d;
        public final androidx.media3.common.a e;

        /* compiled from: DefaultTrackSelector.java */
        public interface a<T extends h<T>> {
            com.google.common.collect.g a(int i, pfp0 pfp0Var, int[] iArr);
        }

        public h(int i, pfp0 pfp0Var, int i2) {
            this.b = i;
            this.c = pfp0Var;
            this.d = i2;
            this.e = pfp0Var.d[i2];
        }

        public abstract int a();

        public abstract boolean b(T t);
    }

    /* compiled from: DefaultTrackSelector.java */
    public static final class i extends h<i> {
        public final boolean f;
        public final d g;
        public final boolean h;
        public final boolean i;
        public final boolean j;
        public final int k;
        public final int l;
        public final int m;
        public final int n;
        public final int o;
        public final int p;
        public final int q;
        public final boolean r;
        public final int s;
        public final boolean t;
        public final int u;
        public final boolean v;
        public final boolean w;
        public final int x;

        /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
        /* JADX WARN: Removed duplicated region for block: B:127:0x011f  */
        /* JADX WARN: Removed duplicated region for block: B:128:0x0114  */
        /* JADX WARN: Removed duplicated region for block: B:132:0x0100 A[EDGE_INSN: B:132:0x0100->B:72:0x0100 BREAK  A[LOOP:1: B:64:0x00e5->B:130:0x00fd], SYNTHETIC] */
        /* JADX WARN: Removed duplicated region for block: B:133:0x00db  */
        /* JADX WARN: Removed duplicated region for block: B:136:0x00ac A[SYNTHETIC] */
        /* JADX WARN: Removed duplicated region for block: B:41:0x007b  */
        /* JADX WARN: Removed duplicated region for block: B:47:0x009a  */
        /* JADX WARN: Removed duplicated region for block: B:53:0x00ba A[ADDED_TO_REGION] */
        /* JADX WARN: Removed duplicated region for block: B:57:0x00ca  */
        /* JADX WARN: Removed duplicated region for block: B:62:0x00d9  */
        /* JADX WARN: Removed duplicated region for block: B:66:0x00eb  */
        /* JADX WARN: Removed duplicated region for block: B:74:0x0112  */
        /* JADX WARN: Removed duplicated region for block: B:77:0x011d  */
        /* JADX WARN: Removed duplicated region for block: B:80:0x012a  */
        /* JADX WARN: Removed duplicated region for block: B:90:0x0184  */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
        */
        public i(int i, pfp0 pfp0Var, int i2, d dVar, int i3, @Nullable String str, int i4, boolean z) {
            super(i, pfp0Var, i2);
            boolean z2;
            boolean z3;
            int i5;
            int i6;
            int i7;
            int i8;
            androidx.media3.common.a aVar;
            String str2;
            int i9;
            boolean z4;
            d dVar2;
            boolean z5;
            androidx.media3.common.a aVar2;
            int i10;
            int i11;
            float f;
            int i12;
            androidx.media3.common.a aVar3;
            int i13;
            int i14;
            int i15;
            this.g = dVar;
            boolean z6 = dVar.A;
            ImmutableList<String> immutableList = dVar.i;
            ImmutableList<String> immutableList2 = dVar.k;
            int i16 = z6 ? 24 : 16;
            int i17 = 0;
            this.t = false;
            if (z && (((i13 = (aVar3 = this.e).u) == -1 || i13 <= dVar.a) && ((i14 = aVar3.v) == -1 || i14 <= dVar.b))) {
                float f2 = aVar3.y;
                if ((f2 == -1.0f || f2 <= dVar.c) && ((i15 = aVar3.j) == -1 || i15 <= dVar.d)) {
                    z2 = true;
                    this.f = z2;
                    if (z && (((i10 = (aVar2 = this.e).u) == -1 || i10 >= 0) && ((i11 = aVar2.v) == -1 || i11 >= 0))) {
                        f = aVar2.y;
                        if ((f != -1.0f || f >= 0) && ((i12 = aVar2.j) == -1 || i12 >= 0)) {
                            z3 = true;
                            this.h = z3;
                            this.i = androidx.media3.exoplayer.k.m(i3, false);
                            androidx.media3.common.a aVar4 = this.e;
                            float f3 = aVar4.y;
                            this.j = f3 == -1.0f && f3 >= 10.0f;
                            this.k = aVar4.j;
                            this.l = aVar4.b();
                            i5 = 0;
                            while (true) {
                                i6 = Integer.MAX_VALUE;
                                if (i5 < immutableList2.size()) {
                                    i7 = 0;
                                    i5 = Integer.MAX_VALUE;
                                    break;
                                } else {
                                    i7 = npl.l(this.e, immutableList2.get(i5), false);
                                    if (i7 > 0) {
                                        break;
                                    } else {
                                        i5++;
                                    }
                                }
                            }
                            this.n = i5;
                            this.o = i7;
                            int i18 = this.e.f;
                            yx80<Integer> yx80Var = npl.k;
                            this.p = (i18 == 0 && i18 == 0) ? Integer.MAX_VALUE : Integer.bitCount(0);
                            int i19 = this.e.f;
                            this.r = (i19 == 0 && (i19 & 1) == 0) ? false : true;
                            this.s = npl.l(this.e, str, npl.o(str) != null);
                            i8 = 0;
                            while (true) {
                                if (i8 < immutableList.size()) {
                                    String str3 = this.e.n;
                                    if (str3 != null && str3.equals(immutableList.get(i8))) {
                                        i6 = i8;
                                        break;
                                    }
                                    i8++;
                                } else {
                                    break;
                                }
                            }
                            this.m = i6;
                            this.q = npl.j(this.e, dVar.j);
                            this.v = (i3 & 384) != 128;
                            this.w = (i3 & 64) != 64;
                            aVar = this.e;
                            str2 = aVar.n;
                            if (str2 != null) {
                                i9 = 4;
                                switch (str2.hashCode()) {
                                    case -1851077871:
                                        if (str2.equals("video/dolby-vision")) {
                                            z5 = false;
                                            break;
                                        }
                                        z5 = -1;
                                        break;
                                    case -1662735862:
                                        if (str2.equals(com.unity3d.services.core.device.MimeTypes.VIDEO_AV1)) {
                                            z5 = true;
                                            break;
                                        }
                                        z5 = -1;
                                        break;
                                    case -1662541442:
                                        if (str2.equals("video/hevc")) {
                                            z5 = 2;
                                            break;
                                        }
                                        z5 = -1;
                                        break;
                                    case 1331836730:
                                        if (str2.equals("video/avc")) {
                                            z5 = 3;
                                            break;
                                        }
                                        z5 = -1;
                                        break;
                                    case 1599127257:
                                        if (str2.equals(MimeTypes.VIDEO_VP9)) {
                                            z5 = 4;
                                            break;
                                        }
                                        z5 = -1;
                                        break;
                                    default:
                                        z5 = -1;
                                        break;
                                }
                                switch (z5) {
                                    case false:
                                        i9 = 5;
                                        break;
                                    case true:
                                        i9 = 3;
                                        break;
                                    case true:
                                        i9 = 1;
                                        break;
                                    case true:
                                        i9 = 2;
                                        break;
                                }
                                this.x = i9;
                                z4 = this.f;
                                dVar2 = this.g;
                                if ((aVar.f & 16384) == 0 && androidx.media3.exoplayer.k.m(i3, dVar2.E) && (z4 || dVar2.z)) {
                                    i17 = (androidx.media3.exoplayer.k.m(i3, false) || !this.h || !z4 || aVar.j == -1 || dVar2.v || (i16 & i3) == 0) ? 1 : 2;
                                }
                                this.u = i17;
                            }
                            i9 = 0;
                            this.x = i9;
                            z4 = this.f;
                            dVar2 = this.g;
                            if ((aVar.f & 16384) == 0) {
                                if (androidx.media3.exoplayer.k.m(i3, false)) {
                                }
                            }
                            this.u = i17;
                        }
                    }
                    z3 = false;
                    this.h = z3;
                    this.i = androidx.media3.exoplayer.k.m(i3, false);
                    androidx.media3.common.a aVar42 = this.e;
                    float f32 = aVar42.y;
                    this.j = f32 == -1.0f && f32 >= 10.0f;
                    this.k = aVar42.j;
                    this.l = aVar42.b();
                    i5 = 0;
                    while (true) {
                        i6 = Integer.MAX_VALUE;
                        if (i5 < immutableList2.size()) {
                        }
                        i5++;
                    }
                    this.n = i5;
                    this.o = i7;
                    int i182 = this.e.f;
                    yx80<Integer> yx80Var2 = npl.k;
                    this.p = (i182 == 0 && i182 == 0) ? Integer.MAX_VALUE : Integer.bitCount(0);
                    int i192 = this.e.f;
                    this.r = (i192 == 0 && (i192 & 1) == 0) ? false : true;
                    this.s = npl.l(this.e, str, npl.o(str) != null);
                    i8 = 0;
                    while (true) {
                        if (i8 < immutableList.size()) {
                        }
                        i8++;
                    }
                    this.m = i6;
                    this.q = npl.j(this.e, dVar.j);
                    this.v = (i3 & 384) != 128;
                    this.w = (i3 & 64) != 64;
                    aVar = this.e;
                    str2 = aVar.n;
                    if (str2 != null) {
                    }
                    i9 = 0;
                    this.x = i9;
                    z4 = this.f;
                    dVar2 = this.g;
                    if ((aVar.f & 16384) == 0) {
                    }
                    this.u = i17;
                }
            }
            z2 = false;
            this.f = z2;
            if (z) {
                f = aVar2.y;
                if (f != -1.0f) {
                }
                z3 = true;
                this.h = z3;
                this.i = androidx.media3.exoplayer.k.m(i3, false);
                androidx.media3.common.a aVar422 = this.e;
                float f322 = aVar422.y;
                this.j = f322 == -1.0f && f322 >= 10.0f;
                this.k = aVar422.j;
                this.l = aVar422.b();
                i5 = 0;
                while (true) {
                    i6 = Integer.MAX_VALUE;
                    if (i5 < immutableList2.size()) {
                    }
                    i5++;
                }
                this.n = i5;
                this.o = i7;
                int i1822 = this.e.f;
                yx80<Integer> yx80Var22 = npl.k;
                this.p = (i1822 == 0 && i1822 == 0) ? Integer.MAX_VALUE : Integer.bitCount(0);
                int i1922 = this.e.f;
                this.r = (i1922 == 0 && (i1922 & 1) == 0) ? false : true;
                this.s = npl.l(this.e, str, npl.o(str) != null);
                i8 = 0;
                while (true) {
                    if (i8 < immutableList.size()) {
                    }
                    i8++;
                }
                this.m = i6;
                this.q = npl.j(this.e, dVar.j);
                this.v = (i3 & 384) != 128;
                this.w = (i3 & 64) != 64;
                aVar = this.e;
                str2 = aVar.n;
                if (str2 != null) {
                }
                i9 = 0;
                this.x = i9;
                z4 = this.f;
                dVar2 = this.g;
                if ((aVar.f & 16384) == 0) {
                }
                this.u = i17;
            }
            z3 = false;
            this.h = z3;
            this.i = androidx.media3.exoplayer.k.m(i3, false);
            androidx.media3.common.a aVar4222 = this.e;
            float f3222 = aVar4222.y;
            this.j = f3222 == -1.0f && f3222 >= 10.0f;
            this.k = aVar4222.j;
            this.l = aVar4222.b();
            i5 = 0;
            while (true) {
                i6 = Integer.MAX_VALUE;
                if (i5 < immutableList2.size()) {
                }
                i5++;
            }
            this.n = i5;
            this.o = i7;
            int i18222 = this.e.f;
            yx80<Integer> yx80Var222 = npl.k;
            this.p = (i18222 == 0 && i18222 == 0) ? Integer.MAX_VALUE : Integer.bitCount(0);
            int i19222 = this.e.f;
            this.r = (i19222 == 0 && (i19222 & 1) == 0) ? false : true;
            this.s = npl.l(this.e, str, npl.o(str) != null);
            i8 = 0;
            while (true) {
                if (i8 < immutableList.size()) {
                }
                i8++;
            }
            this.m = i6;
            this.q = npl.j(this.e, dVar.j);
            this.v = (i3 & 384) != 128;
            this.w = (i3 & 64) != 64;
            aVar = this.e;
            str2 = aVar.n;
            if (str2 != null) {
            }
            i9 = 0;
            this.x = i9;
            z4 = this.f;
            dVar2 = this.g;
            if ((aVar.f & 16384) == 0) {
            }
            this.u = i17;
        }

        public static int c(i iVar, i iVar2) {
            c7i d = c7i.a.d(iVar.i, iVar2.i);
            Integer valueOf = Integer.valueOf(iVar.n);
            Integer valueOf2 = Integer.valueOf(iVar2.n);
            hw50.b.getClass();
            bgg0 bgg0Var = bgg0.b;
            c7i c = d.c(valueOf, valueOf2, bgg0Var).a(iVar.o, iVar2.o).a(iVar.p, iVar2.p).c(Integer.valueOf(iVar.q), Integer.valueOf(iVar2.q), bgg0Var).d(iVar.r, iVar2.r).a(iVar.s, iVar2.s).d(iVar.j, iVar2.j).d(iVar.f, iVar2.f).d(iVar.h, iVar2.h).c(Integer.valueOf(iVar.m), Integer.valueOf(iVar2.m), bgg0Var);
            boolean z = iVar.v;
            c7i d2 = c.d(z, iVar2.v);
            boolean z2 = iVar.w;
            c7i d3 = d2.d(z2, iVar2.w);
            if (z && z2) {
                d3 = d3.a(iVar.x, iVar2.x);
            }
            return d3.f();
        }

        @Override // xsna.npl.h
        public final int a() {
            return this.u;
        }

        @Override // xsna.npl.h
        public final boolean b(i iVar) {
            i iVar2 = iVar;
            if (!this.t && !Objects.equals(this.e.n, iVar2.e.n)) {
                return false;
            }
            this.g.getClass();
            return this.v == iVar2.v && this.w == iVar2.w;
        }
    }

    public npl(ahp0 ahp0Var, d7q.b bVar, @Nullable Context context) {
        this.c = new Object();
        this.d = context != null ? context.getApplicationContext() : null;
        this.e = bVar;
        if (ahp0Var instanceof d) {
            this.f = (d) ahp0Var;
        } else {
            d dVar = d.I;
            dVar.getClass();
            d.a aVar = new d.a(dVar);
            aVar.c(ahp0Var);
            this.f = new d(aVar);
        }
        this.i = nc4.c;
        if (this.f.D && context == null) {
            ahn.F("Audio channel count constraints cannot be applied without reference to Context. Build the track selector instance with one of the non-deprecated constructors that take a Context argument.");
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static int j(androidx.media3.common.a aVar, ImmutableList immutableList) {
        for (int i2 = 0; i2 < immutableList.size(); i2++) {
            for (int i3 = 0; i3 < aVar.c.size(); i3++) {
                if (((zky) aVar.c.get(i3)).b.equals(immutableList.get(i2))) {
                    return i2;
                }
            }
        }
        return Integer.MAX_VALUE;
    }

    public static void k(qfp0 qfp0Var, d dVar, HashMap hashMap) {
        for (int i2 = 0; i2 < qfp0Var.a; i2++) {
            zgp0 zgp0Var = dVar.w.get(qfp0Var.a(i2));
            if (zgp0Var != null) {
                pfp0 pfp0Var = zgp0Var.a;
                zgp0 zgp0Var2 = (zgp0) hashMap.get(Integer.valueOf(pfp0Var.c));
                if (zgp0Var2 == null || (zgp0Var2.b.isEmpty() && !zgp0Var.b.isEmpty())) {
                    hashMap.put(Integer.valueOf(pfp0Var.c), zgp0Var);
                }
            }
        }
    }

    public static int l(androidx.media3.common.a aVar, @Nullable String str, boolean z) {
        if (!TextUtils.isEmpty(str) && str.equals(aVar.d)) {
            return 4;
        }
        String o = o(str);
        String o2 = o(aVar.d);
        if (o2 == null || o == null) {
            return (z && o2 == null) ? 1 : 0;
        }
        if (o2.startsWith(o) || o.startsWith(o2)) {
            return 3;
        }
        String str2 = y2r0.a;
        return o2.split("-", 2)[0].equals(o.split("-", 2)[0]) ? 2 : 0;
    }

    @Nullable
    public static String o(@Nullable String str) {
        if (TextUtils.isEmpty(str) || TextUtils.equals(str, C.LANGUAGE_UNDETERMINED)) {
            return null;
        }
        return str;
    }

    @Nullable
    public static Pair p(int i2, ln00.a aVar, int[][][] iArr, h.a aVar2, Comparator comparator) {
        int i3;
        RandomAccess randomAccess;
        ln00.a aVar3 = aVar;
        ArrayList arrayList = new ArrayList();
        int i4 = aVar3.a;
        int i5 = 0;
        while (i5 < i4) {
            if (i2 == aVar3.b[i5]) {
                qfp0 qfp0Var = aVar3.c[i5];
                for (int i6 = 0; i6 < qfp0Var.a; i6++) {
                    pfp0 a2 = qfp0Var.a(i6);
                    com.google.common.collect.g a3 = aVar2.a(i5, a2, iArr[i5][i6]);
                    int i7 = a2.a;
                    boolean[] zArr = new boolean[i7];
                    int i8 = 0;
                    while (i8 < i7) {
                        h hVar = (h) a3.get(i8);
                        int a4 = hVar.a();
                        if (zArr[i8] || a4 == 0) {
                            i3 = i4;
                        } else {
                            if (a4 == 1) {
                                randomAccess = ImmutableList.p(hVar);
                            } else {
                                ArrayList arrayList2 = new ArrayList();
                                arrayList2.add(hVar);
                                int i9 = i8 + 1;
                                while (i9 < i7) {
                                    h hVar2 = (h) a3.get(i9);
                                    int i10 = i4;
                                    if (hVar2.a() == 2 && hVar.b(hVar2)) {
                                        arrayList2.add(hVar2);
                                        zArr[i9] = true;
                                    }
                                    i9++;
                                    i4 = i10;
                                }
                                randomAccess = arrayList2;
                            }
                            i3 = i4;
                            arrayList.add(randomAccess);
                        }
                        i8++;
                        i4 = i3;
                    }
                }
            }
            i5++;
            aVar3 = aVar;
            i4 = i4;
        }
        if (arrayList.isEmpty()) {
            return null;
        }
        List list = (List) Collections.max(arrayList, comparator);
        int[] iArr2 = new int[list.size()];
        for (int i11 = 0; i11 < list.size(); i11++) {
            iArr2[i11] = ((h) list.get(i11)).d;
        }
        h hVar3 = (h) list.get(0);
        return Pair.create(new d7q.a(0, hVar3.c, iArr2), Integer.valueOf(hVar3.b));
    }

    @Override // xsna.chp0
    public final boolean d() {
        return true;
    }

    @Override // xsna.chp0
    public final void f() {
        f fVar;
        f.a aVar;
        synchronized (this.c) {
            try {
                Thread thread = this.g;
                if (thread != null) {
                    fxc0.A(thread == Thread.currentThread(), "DefaultTrackSelector is accessed on the wrong thread.");
                }
            } catch (Throwable th) {
                throw th;
            }
        }
        if (Build.VERSION.SDK_INT >= 32 && (fVar = this.h) != null) {
            Handler handler = fVar.c;
            Spatializer spatializer = fVar.a;
            if (spatializer != null && (aVar = fVar.d) != null && handler != null) {
                spatializer.removeOnSpatializerStateChangedListener(aVar);
                handler.removeCallbacksAndMessages(null);
            }
            this.h = null;
        }
        super.f();
    }

    @Override // xsna.chp0
    public final void h(nc4 nc4Var) {
        if (this.i.equals(nc4Var)) {
            return;
        }
        this.i = nc4Var;
        n();
    }

    @Override // xsna.chp0
    public final void i(ahp0 ahp0Var) {
        if (ahp0Var instanceof d) {
            q((d) ahp0Var);
        }
        d.a aVar = new d.a(a());
        aVar.c(ahp0Var);
        q(new d(aVar));
    }

    @Override // xsna.chp0
    /* renamed from: m, reason: merged with bridge method [inline-methods] */
    public final d a() {
        d dVar;
        synchronized (this.c) {
            dVar = this.f;
        }
        return dVar;
    }

    public final void n() {
        boolean z;
        chp0.b bVar;
        f fVar;
        synchronized (this.c) {
            try {
                z = this.f.D && Build.VERSION.SDK_INT >= 32 && (fVar = this.h) != null && fVar.b;
            } catch (Throwable th) {
                throw th;
            }
        }
        if (!z || (bVar = this.a) == null) {
            return;
        }
        bVar.onTrackSelectionsInvalidated();
    }

    public final void q(d dVar) {
        boolean equals;
        dVar.getClass();
        synchronized (this.c) {
            equals = this.f.equals(dVar);
            this.f = dVar;
        }
        if (equals) {
            return;
        }
        if (dVar.D && this.d == null) {
            ahn.F("Audio channel count constraints cannot be applied without reference to Context. Build the track selector instance with one of the non-deprecated constructors that take a Context argument.");
        }
        chp0.b bVar = this.a;
        if (bVar != null) {
            bVar.onTrackSelectionsInvalidated();
        }
    }

    /* compiled from: DefaultTrackSelector.java */
    public static final class d extends ahp0 {
        public static final d I = new d(new a());
        public final boolean A;
        public final boolean B;
        public final boolean C;
        public final boolean D;
        public final boolean E;
        public final boolean F;
        public final SparseArray<Map<qfp0, e>> G;
        public final SparseBooleanArray H;
        public final boolean z;

        static {
            cq.h(1000, 1001, 1002, 1003, 1004);
            cq.h(1005, 1006, 1007, 1008, 1009);
            cq.h(1010, 1011, 1012, Z3.i, Z3.j);
            y2r0.L(1015);
            y2r0.L(Z3.l);
            y2r0.L(1017);
            y2r0.L(1018);
        }

        public d(a aVar) {
            super(aVar);
            this.z = aVar.y;
            this.A = aVar.z;
            this.B = aVar.A;
            this.C = aVar.B;
            this.D = aVar.C;
            this.E = aVar.D;
            this.F = aVar.E;
            this.G = aVar.F;
            this.H = aVar.G;
        }

        @Override // xsna.ahp0
        public final ahp0.b a() {
            return new a(this);
        }

        @Override // xsna.ahp0
        public final boolean equals(@Nullable Object obj) {
            if (this == obj) {
                return true;
            }
            if (obj != null && d.class == obj.getClass()) {
                d dVar = (d) obj;
                if (super.equals(dVar) && this.z == dVar.z && this.A == dVar.A && this.B == dVar.B && this.C == dVar.C && this.D == dVar.D && this.E == dVar.E && this.F == dVar.F) {
                    SparseBooleanArray sparseBooleanArray = dVar.H;
                    SparseBooleanArray sparseBooleanArray2 = this.H;
                    int size = sparseBooleanArray2.size();
                    if (sparseBooleanArray.size() == size) {
                        int i = 0;
                        while (true) {
                            if (i >= size) {
                                SparseArray<Map<qfp0, e>> sparseArray = dVar.G;
                                SparseArray<Map<qfp0, e>> sparseArray2 = this.G;
                                int size2 = sparseArray2.size();
                                if (sparseArray.size() == size2) {
                                    for (int i2 = 0; i2 < size2; i2++) {
                                        int indexOfKey = sparseArray.indexOfKey(sparseArray2.keyAt(i2));
                                        if (indexOfKey >= 0) {
                                            Map<qfp0, e> valueAt = sparseArray2.valueAt(i2);
                                            Map<qfp0, e> valueAt2 = sparseArray.valueAt(indexOfKey);
                                            if (valueAt2.size() == valueAt.size()) {
                                                for (Map.Entry<qfp0, e> entry : valueAt.entrySet()) {
                                                    qfp0 key = entry.getKey();
                                                    if (valueAt2.containsKey(key) && Objects.equals(entry.getValue(), valueAt2.get(key))) {
                                                    }
                                                }
                                            }
                                        }
                                    }
                                    return true;
                                }
                            } else {
                                if (sparseBooleanArray.indexOfKey(sparseBooleanArray2.keyAt(i)) < 0) {
                                    break;
                                }
                                i++;
                            }
                        }
                    }
                }
            }
            return false;
        }

        @Override // xsna.ahp0
        public final int hashCode() {
            return (((((((((((((((super.hashCode() + 31) * 31) + (this.z ? 1 : 0)) * 961) + (this.A ? 1 : 0)) * 961) + (this.B ? 1 : 0)) * 28629151) + (this.C ? 1 : 0)) * 31) + (this.D ? 1 : 0)) * 31) + (this.E ? 1 : 0)) * 961) + (this.F ? 1 : 0)) * 31;
        }

        /* compiled from: DefaultTrackSelector.java */
        public static final class a extends ahp0.b {
            public final boolean A;
            public final boolean B;
            public boolean C;
            public final boolean D;
            public final boolean E;
            public final SparseArray<Map<qfp0, e>> F;
            public final SparseBooleanArray G;
            public final boolean y;
            public final boolean z;

            public a(d dVar) {
                c(dVar);
                this.y = dVar.z;
                this.z = dVar.A;
                this.A = dVar.B;
                this.B = dVar.C;
                this.C = dVar.D;
                this.D = dVar.E;
                this.E = dVar.F;
                SparseArray<Map<qfp0, e>> sparseArray = dVar.G;
                SparseArray<Map<qfp0, e>> sparseArray2 = new SparseArray<>();
                for (int i = 0; i < sparseArray.size(); i++) {
                    sparseArray2.put(sparseArray.keyAt(i), new HashMap(sparseArray.valueAt(i)));
                }
                this.F = sparseArray2;
                this.G = dVar.H.clone();
            }

            @Override // xsna.ahp0.b
            public final ahp0 a() {
                return new d(this);
            }

            @Override // xsna.ahp0.b
            public final ahp0.b e(Set set) {
                super.e(set);
                return this;
            }

            @Override // xsna.ahp0.b
            public final ahp0.b f(zgp0 zgp0Var) {
                super.f(zgp0Var);
                return this;
            }

            @Override // xsna.ahp0.b
            public final ahp0.b g(String[] strArr) {
                super.g(strArr);
                return this;
            }

            public final void i(int i) {
                super.b(i);
            }

            public final void j(zgp0 zgp0Var) {
                super.f(zgp0Var);
            }

            public final void k(boolean z) {
                super.h(3, z);
            }

            public a() {
                this.F = new SparseArray<>();
                this.G = new SparseBooleanArray();
                this.y = true;
                this.z = true;
                this.A = true;
                this.B = true;
                this.C = true;
                this.D = true;
                this.E = true;
            }
        }
    }

    public npl(Context context) {
        this(context, new gk0.b());
    }

    public npl(Context context, d7q.b bVar) {
        this(d.I, bVar, context);
    }

    @Override // xsna.chp0
    @Nullable
    public final k.a b() {
        return this;
    }
}
