package xsna;

import android.net.Uri;
import android.util.SparseArray;
import androidx.annotation.Nullable;
import androidx.media3.common.DrmInitData;
import androidx.media3.common.ParserException;
import androidx.media3.common.StreamKey;
import androidx.media3.common.a;
import androidx.media3.exoplayer.drm.a;
import androidx.media3.exoplayer.f;
import androidx.media3.exoplayer.hls.playlist.HlsPlaylistTracker;
import androidx.media3.exoplayer.hls.playlist.b;
import androidx.media3.exoplayer.hls.playlist.c;
import androidx.media3.exoplayer.source.h;
import androidx.media3.exoplayer.source.j;
import androidx.media3.exoplayer.source.q;
import androidx.media3.exoplayer.upstream.Loader;
import androidx.media3.exoplayer.upstream.b;
import com.google.common.collect.ImmutableList;
import com.ironsource.X3;
import com.mbridge.msdk.playercommon.exoplayer2.C;
import com.mbridge.msdk.playercommon.exoplayer2.util.MimeTypes;
import java.io.IOException;
import java.util.AbstractList;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashSet;
import java.util.IdentityHashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Objects;
import xsna.r9v;

/* compiled from: HlsMediaPeriod.java */
/* loaded from: classes12.dex */
public final class j9v implements androidx.media3.exoplayer.source.h, HlsPlaylistTracker.b {
    public final e9v b;
    public final HlsPlaylistTracker c;
    public final c9v d;

    @Nullable
    public final mjp0 e;
    public final androidx.media3.exoplayer.drm.b f;
    public final a.C0054a g;
    public final androidx.media3.exoplayer.upstream.b h;
    public final j.a i;
    public final xu1 j;
    public final IdentityHashMap<m0h0, Integer> k;
    public final e0a l;
    public final fz5 m;
    public final boolean n;
    public final int o;
    public final x1b0 p;
    public final a q = new a();

    @Nullable
    public h.a r;
    public int s;
    public qfp0 t;
    public r9v[] u;
    public r9v[] v;
    public int[][] w;
    public int x;
    public pui y;

    /* compiled from: HlsMediaPeriod.java */
    public class a implements q.a {
        public a() {
        }

        public final void a() {
            j9v j9vVar = j9v.this;
            int i = j9vVar.s - 1;
            j9vVar.s = i;
            if (i > 0) {
                return;
            }
            int i2 = 0;
            for (r9v r9vVar : j9vVar.u) {
                r9vVar.l();
                i2 += r9vVar.J.a;
            }
            pfp0[] pfp0VarArr = new pfp0[i2];
            int i3 = 0;
            for (r9v r9vVar2 : j9vVar.u) {
                r9vVar2.l();
                int i4 = r9vVar2.J.a;
                int i5 = 0;
                while (i5 < i4) {
                    r9vVar2.l();
                    pfp0VarArr[i3] = r9vVar2.J.a(i5);
                    i5++;
                    i3++;
                }
            }
            j9vVar.t = new qfp0(pfp0VarArr);
            j9vVar.r.b(j9vVar);
        }

        @Override // androidx.media3.exoplayer.source.q.a
        public final void d(androidx.media3.exoplayer.source.q qVar) {
            j9v j9vVar = j9v.this;
            j9vVar.r.d(j9vVar);
        }
    }

    public j9v(e9v e9vVar, HlsPlaylistTracker hlsPlaylistTracker, c9v c9vVar, @Nullable mjp0 mjp0Var, androidx.media3.exoplayer.drm.b bVar, a.C0054a c0054a, androidx.media3.exoplayer.upstream.b bVar2, j.a aVar, xu1 xu1Var, fz5 fz5Var, boolean z, int i, x1b0 x1b0Var) {
        this.b = e9vVar;
        this.c = hlsPlaylistTracker;
        this.d = c9vVar;
        this.e = mjp0Var;
        this.f = bVar;
        this.g = c0054a;
        this.h = bVar2;
        this.i = aVar;
        this.j = xu1Var;
        this.m = fz5Var;
        this.n = z;
        this.o = i;
        this.p = x1b0Var;
        fz5Var.getClass();
        ImmutableList.b bVar3 = ImmutableList.c;
        com.google.common.collect.g gVar = com.google.common.collect.g.f;
        this.y = new pui(gVar, gVar);
        this.k = new IdentityHashMap<>();
        this.l = new e0a(11);
        this.u = new r9v[0];
        this.v = new r9v[0];
        this.w = new int[0][];
    }

    public static androidx.media3.common.a g(androidx.media3.common.a aVar, @Nullable androidx.media3.common.a aVar2, boolean z) {
        fi20 fi20Var;
        int i;
        String str;
        String str2;
        ImmutableList immutableList;
        int i2;
        int i3;
        String str3;
        ImmutableList.b bVar = ImmutableList.c;
        com.google.common.collect.g gVar = com.google.common.collect.g.f;
        if (aVar2 != null) {
            str2 = aVar2.k;
            fi20Var = aVar2.l;
            i2 = aVar2.F;
            i = aVar2.e;
            i3 = aVar2.f;
            str = aVar2.d;
            str3 = aVar2.b;
            immutableList = aVar2.c;
        } else {
            String w = y2r0.w(aVar.k, 1);
            fi20Var = aVar.l;
            if (z) {
                i2 = aVar.F;
                i = aVar.e;
                i3 = aVar.f;
                str = aVar.d;
                str3 = aVar.b;
                str2 = w;
                immutableList = aVar.c;
            } else {
                i = 0;
                str = null;
                str2 = w;
                immutableList = gVar;
                i2 = -1;
                i3 = 0;
                str3 = null;
            }
        }
        String e = io20.e(str2);
        int i4 = z ? aVar.h : -1;
        int i5 = z ? aVar.i : -1;
        a.C0043a c0043a = new a.C0043a();
        c0043a.a = aVar.a;
        c0043a.b = str3;
        c0043a.c = ImmutableList.m(immutableList);
        c0043a.l = io20.q(aVar.m);
        c0043a.m = io20.q(e);
        c0043a.j = str2;
        c0043a.k = fi20Var;
        c0043a.h = i4;
        c0043a.i = i5;
        c0043a.E = i2;
        c0043a.e = i;
        c0043a.f = i3;
        c0043a.d = str;
        return new androidx.media3.common.a(c0043a);
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // androidx.media3.exoplayer.source.h
    public final long a(long j, o3i0 o3i0Var) {
        r9v[] r9vVarArr = this.v;
        int length = r9vVarArr.length;
        int i = 0;
        while (true) {
            if (i >= length) {
                break;
            }
            r9v r9vVar = r9vVarArr[i];
            if (r9vVar.B == 2) {
                b9v b9vVar = r9vVar.e;
                HlsPlaylistTracker hlsPlaylistTracker = b9vVar.g;
                int selectedIndex = b9vVar.r.getSelectedIndex();
                Uri[] uriArr = b9vVar.e;
                androidx.media3.exoplayer.hls.playlist.b B = (selectedIndex >= uriArr.length || selectedIndex == -1) ? null : hlsPlaylistTracker.B(uriArr[b9vVar.r.getSelectedIndexInTrackGroup()], true);
                if (B != null) {
                    ImmutableList immutableList = B.r;
                    if (!immutableList.isEmpty()) {
                        long C = B.h - hlsPlaylistTracker.C();
                        long j2 = j - C;
                        int c = y2r0.c(immutableList, Long.valueOf(j2), true);
                        long j3 = ((b.e) immutableList.get(c)).f;
                        return o3i0Var.a(j2, j3, (!B.c || c == immutableList.size() - 1) ? j3 : ((b.e) immutableList.get(c + 1)).f) + C;
                    }
                }
            } else {
                i++;
            }
        }
        return j;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // androidx.media3.exoplayer.hls.playlist.HlsPlaylistTracker.b
    public final void b() {
        for (r9v r9vVar : this.u) {
            Loader loader = r9vVar.k;
            b9v b9vVar = r9vVar.e;
            ArrayList<h9v> arrayList = r9vVar.o;
            if (!arrayList.isEmpty()) {
                h9v h9vVar = (h9v) sd9.k(arrayList);
                int b = b9vVar.b(h9vVar);
                int i = h9vVar.o;
                if (b == 1) {
                    if (!h9vVar.g()) {
                        fxc0.z(i != -1);
                        androidx.media3.exoplayer.hls.playlist.b B = b9vVar.g.B(b9vVar.e[b9vVar.h.a(h9vVar.d)], false);
                        B.getClass();
                        ImmutableList immutableList = B.r;
                        int i2 = (int) (h9vVar.j - B.k);
                        h9vVar.K = i2 < 0 ? 0L : ((b.c) (i2 < immutableList.size() ? ((b.e) immutableList.get(i2)).n : B.s).get(i)).d;
                    }
                } else if (b == 0) {
                    r9vVar.s.post(new i0(6, r9vVar, h9vVar));
                } else if (b == 2 && !r9vVar.U && loader.c()) {
                    loader.a();
                }
            }
        }
        this.r.d(this);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r14v1 */
    /* JADX WARN: Type inference failed for: r14v2, types: [int] */
    /* JADX WARN: Type inference failed for: r14v8 */
    @Override // androidx.media3.exoplayer.source.h
    public final List c(ArrayList arrayList) {
        int[] iArr;
        qfp0 qfp0Var;
        int i;
        int i2;
        androidx.media3.exoplayer.hls.playlist.c z = this.c.z();
        z.getClass();
        List<c.b> list = z.e;
        boolean isEmpty = list.isEmpty();
        boolean z2 = !isEmpty;
        int i3 = 0;
        if (isEmpty) {
            iArr = new int[0];
            qfp0Var = qfp0.d;
            i = 0;
        } else {
            r9v r9vVar = this.u[0];
            iArr = this.w[0];
            r9vVar.l();
            qfp0Var = r9vVar.J;
            i = r9vVar.M;
        }
        ArrayList arrayList2 = new ArrayList();
        Iterator it = arrayList.iterator();
        boolean z3 = false;
        boolean z4 = false;
        while (it.hasNext()) {
            d7q d7qVar = (d7q) it.next();
            pfp0 trackGroup = d7qVar.getTrackGroup();
            int b = qfp0Var.b(trackGroup);
            if (b == -1) {
                ?? r14 = z2;
                i2 = i3;
                while (true) {
                    r9v[] r9vVarArr = this.u;
                    if (r14 < r9vVarArr.length) {
                        r9v r9vVar2 = r9vVarArr[r14];
                        r9vVar2.l();
                        qfp0 qfp0Var2 = r9vVar2.J;
                        int b2 = qfp0Var2.b(trackGroup);
                        if (b2 != -1) {
                            int i4 = qfp0Var2.a(b2).c != 1 ? 2 : 1;
                            int[] iArr2 = this.w[r14];
                            for (int i5 = i2; i5 < d7qVar.length(); i5++) {
                                arrayList2.add(new StreamKey(i4, iArr2[d7qVar.getIndexInTrackGroup(i5)]));
                            }
                        } else {
                            r14++;
                        }
                    }
                }
            } else if (b == i) {
                for (int i6 = i3; i6 < d7qVar.length(); i6++) {
                    arrayList2.add(new StreamKey(i3, iArr[d7qVar.getIndexInTrackGroup(i6)]));
                }
                i2 = i3;
                z4 = true;
            } else {
                i2 = i3;
                z3 = true;
            }
            i3 = i2;
        }
        int i7 = i3;
        if (z3 && !z4) {
            int i8 = iArr[i7];
            int i9 = list.get(i8).b.j;
            for (int i10 = 1; i10 < iArr.length; i10++) {
                int i11 = list.get(iArr[i10]).b.j;
                if (i11 < i9) {
                    i8 = iArr[i10];
                    i9 = i11;
                }
            }
            arrayList2.add(new StreamKey(i7, i8));
        }
        return arrayList2;
    }

    /* JADX WARN: Removed duplicated region for block: B:18:0x0046  */
    /* JADX WARN: Removed duplicated region for block: B:33:0x0052 A[SYNTHETIC] */
    @Override // androidx.media3.exoplayer.hls.playlist.HlsPlaylistTracker.b
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final boolean d(Uri uri, b.c cVar, boolean z) {
        long j;
        int i;
        int indexOf;
        boolean z2;
        b.C0065b a2;
        boolean z3 = true;
        for (r9v r9vVar : this.u) {
            b9v b9vVar = r9vVar.e;
            Uri[] uriArr = b9vVar.e;
            if (y2r0.m(uriArr, uri)) {
                if (!z && (a2 = r9vVar.j.a(bhp0.b(b9vVar.r), cVar)) != null && a2.a == 2) {
                    j = a2.b;
                    i = 0;
                    while (true) {
                        if (i < uriArr.length) {
                            i = -1;
                            break;
                        }
                        if (uriArr[i].equals(uri)) {
                            break;
                        }
                        i++;
                    }
                    if (i != -1 && (indexOf = b9vVar.r.indexOf(i)) != -1) {
                        b9vVar.o = uri;
                        if (j != C.TIME_UNSET || !b9vVar.r.d(indexOf, j) || !b9vVar.g.D(j, uri)) {
                            z2 = false;
                            z3 &= z2;
                        }
                    }
                }
                j = C.TIME_UNSET;
                i = 0;
                while (true) {
                    if (i < uriArr.length) {
                    }
                    i++;
                }
                if (i != -1) {
                    b9vVar.o = uri;
                    if (j != C.TIME_UNSET) {
                    }
                    z2 = false;
                    z3 &= z2;
                }
            }
            z2 = true;
            z3 &= z2;
        }
        this.r.d(this);
        return z3;
    }

    @Override // androidx.media3.exoplayer.source.h
    public final void discardBuffer(long j, boolean z) {
        for (r9v r9vVar : this.v) {
            if (r9vVar.D && !r9vVar.t()) {
                int length = r9vVar.w.length;
                for (int i = 0; i < length; i++) {
                    r9vVar.w[i].j(j, z, r9vVar.O[i]);
                }
            }
        }
    }

    @Override // androidx.media3.exoplayer.source.h
    public final void e(h.a aVar, long j) {
        e9v e9vVar;
        boolean z;
        List<c.a> list;
        List<c.a> list2;
        int i;
        int i2;
        boolean z2;
        e9v e9vVar2;
        int i3;
        boolean z3;
        Uri[] uriArr;
        this.r = aVar;
        HlsPlaylistTracker hlsPlaylistTracker = this.c;
        hlsPlaylistTracker.E(this);
        androidx.media3.exoplayer.hls.playlist.c z4 = hlsPlaylistTracker.z();
        z4.getClass();
        List<c.a> list3 = z4.g;
        List<c.b> list4 = z4.e;
        Map<String, DrmInitData> map = Collections.EMPTY_MAP;
        boolean isEmpty = list4.isEmpty();
        List<c.a> list5 = z4.h;
        int i4 = 0;
        this.s = 0;
        ArrayList arrayList = new ArrayList();
        ArrayList arrayList2 = new ArrayList();
        e9v e9vVar3 = this.b;
        boolean z5 = this.n;
        if (isEmpty) {
            e9vVar = e9vVar3;
            z = z5;
            list = list3;
            list2 = list5;
        } else {
            androidx.media3.common.a aVar2 = z4.j;
            int size = list4.size();
            int[] iArr = new int[size];
            int i5 = 0;
            int i6 = 0;
            while (true) {
                list2 = list5;
                if (i5 >= list4.size()) {
                    break;
                }
                androidx.media3.common.a aVar3 = list4.get(i5).b;
                int i7 = aVar3.v;
                String str = aVar3.k;
                if (i7 > 0 || y2r0.w(str, 2) != null) {
                    iArr[i5] = 2;
                    i6++;
                } else if (y2r0.w(str, 1) != null) {
                    iArr[i5] = 1;
                    i4++;
                } else {
                    iArr[i5] = -1;
                }
                i5++;
                list5 = list2;
            }
            if (i6 > 0) {
                z3 = false;
                e9vVar2 = e9vVar3;
                i3 = i6;
                z2 = true;
            } else if (i4 < size) {
                z2 = false;
                e9vVar2 = e9vVar3;
                i3 = size - i4;
                z3 = true;
            } else {
                z2 = false;
                e9vVar2 = e9vVar3;
                i3 = size;
                z3 = false;
            }
            Uri[] uriArr2 = new Uri[i3];
            androidx.media3.common.a[] aVarArr = new androidx.media3.common.a[i3];
            int[] iArr2 = new int[i3];
            int i8 = 0;
            int i9 = 0;
            while (i8 < list4.size()) {
                if (z2) {
                    uriArr = uriArr2;
                    if (iArr[i8] != 2) {
                        i8++;
                        uriArr2 = uriArr;
                    }
                } else {
                    uriArr = uriArr2;
                }
                if (!z3 || iArr[i8] != 1) {
                    c.b bVar = list4.get(i8);
                    uriArr[i9] = bVar.a;
                    aVarArr[i9] = bVar.b;
                    iArr2[i9] = i8;
                    i9++;
                }
                i8++;
                uriArr2 = uriArr;
            }
            Uri[] uriArr3 = uriArr2;
            String str2 = aVarArr[0].k;
            int v = y2r0.v(2, str2);
            int v2 = y2r0.v(1, str2);
            boolean z6 = (v2 == 1 || (v2 == 0 && list3.isEmpty())) && v <= 1 && v2 + v > 0;
            e9vVar = e9vVar2;
            list = list3;
            z = z5;
            r9v f = f(X3.i.Z, (z2 || v2 <= 0) ? 0 : 1, uriArr3, aVarArr, z4.j, z4.k, map, j);
            arrayList.add(f);
            arrayList2.add(iArr2);
            if (z && z6) {
                ArrayList arrayList3 = new ArrayList();
                if (v > 0) {
                    androidx.media3.common.a[] aVarArr2 = new androidx.media3.common.a[i3];
                    int i10 = 0;
                    while (i10 < i3) {
                        androidx.media3.common.a aVar4 = aVarArr[i10];
                        String w = y2r0.w(aVar4.k, 2);
                        String e = io20.e(w);
                        a.C0043a c0043a = new a.C0043a();
                        c0043a.a = aVar4.a;
                        c0043a.b = aVar4.b;
                        c0043a.c = ImmutableList.m(aVar4.c);
                        c0043a.l = io20.q(aVar4.m);
                        c0043a.m = io20.q(e);
                        c0043a.j = w;
                        c0043a.k = aVar4.l;
                        c0043a.h = aVar4.h;
                        c0043a.i = aVar4.i;
                        c0043a.t = aVar4.u;
                        c0043a.u = aVar4.v;
                        c0043a.x = aVar4.y;
                        c0043a.e = aVar4.e;
                        c0043a.f = aVar4.f;
                        aVarArr2[i10] = new androidx.media3.common.a(c0043a);
                        i10++;
                        aVarArr = aVarArr;
                    }
                    androidx.media3.common.a[] aVarArr3 = aVarArr;
                    arrayList3.add(new pfp0(X3.i.Z, aVarArr2));
                    if (v2 > 0 && (aVar2 != null || list.isEmpty())) {
                        arrayList3.add(new pfp0("main:audio", g(aVarArr3[0], aVar2, false)));
                    }
                    List<androidx.media3.common.a> list6 = z4.k;
                    if (list6 != null) {
                        for (int i11 = 0; i11 < list6.size(); i11++) {
                            arrayList3.add(new pfp0(lhg.a(i11, "main:cc:"), ((rfl) e9vVar).c(list6.get(i11))));
                        }
                    }
                } else {
                    androidx.media3.common.a[] aVarArr4 = new androidx.media3.common.a[i3];
                    for (int i12 = 0; i12 < i3; i12++) {
                        aVarArr4[i12] = g(aVarArr[i12], aVar2, true);
                    }
                    arrayList3.add(new pfp0(X3.i.Z, aVarArr4));
                }
                a.C0043a c0043a2 = new a.C0043a();
                c0043a2.a = "ID3";
                c0043a2.m = io20.q(MimeTypes.APPLICATION_ID3);
                pfp0 pfp0Var = new pfp0("main:id3", new androidx.media3.common.a(c0043a2));
                arrayList3.add(pfp0Var);
                f.w((pfp0[]) arrayList3.toArray(new pfp0[0]), arrayList3.indexOf(pfp0Var));
            }
        }
        ArrayList arrayList4 = new ArrayList(list.size());
        ArrayList arrayList5 = new ArrayList(list.size());
        ArrayList arrayList6 = new ArrayList(list.size());
        HashSet hashSet = new HashSet();
        int i13 = 0;
        while (i13 < list.size()) {
            List<c.a> list7 = list;
            String str3 = list7.get(i13).c;
            if (hashSet.add(str3)) {
                arrayList4.clear();
                arrayList5.clear();
                arrayList6.clear();
                boolean z7 = true;
                for (int i14 = 0; i14 < list7.size(); i14++) {
                    if (str3.equals(list7.get(i14).c)) {
                        c.a aVar5 = list7.get(i14);
                        arrayList6.add(Integer.valueOf(i14));
                        Uri uri = aVar5.a;
                        androidx.media3.common.a aVar6 = aVar5.b;
                        arrayList4.add(uri);
                        arrayList5.add(aVar6);
                        z7 &= y2r0.v(1, aVar6.k) == 1;
                    }
                }
                String concat = "audio:".concat(str3);
                String str4 = y2r0.a;
                list = list7;
                i2 = i13;
                r9v f2 = f(concat, 1, (Uri[]) arrayList4.toArray(new Uri[0]), (androidx.media3.common.a[]) arrayList5.toArray(new androidx.media3.common.a[0]), null, Collections.EMPTY_LIST, map, j);
                arrayList2.add(ipx.x(arrayList6));
                arrayList.add(f2);
                if (z && z7) {
                    f2.w(new pfp0[]{new pfp0(concat, (androidx.media3.common.a[]) arrayList5.toArray(new androidx.media3.common.a[0]))}, new int[0]);
                }
            } else {
                i2 = i13;
                list = list7;
            }
            i13 = i2 + 1;
        }
        this.x = arrayList.size();
        ArrayList arrayList7 = new ArrayList(list2.size());
        ArrayList arrayList8 = new ArrayList(list2.size());
        ArrayList arrayList9 = new ArrayList(list2.size());
        HashSet hashSet2 = new HashSet();
        int i15 = 0;
        while (i15 < list2.size()) {
            List<c.a> list8 = list2;
            String str5 = list8.get(i15).c;
            if (hashSet2.add(str5)) {
                arrayList7.clear();
                arrayList8.clear();
                arrayList9.clear();
                for (int i16 = 0; i16 < list8.size(); i16++) {
                    if (str5.equals(list8.get(i16).c)) {
                        c.a aVar7 = list8.get(i16);
                        arrayList9.add(Integer.valueOf(i16));
                        arrayList7.add(aVar7.a);
                        arrayList8.add(aVar7.b);
                    }
                }
                String concat2 = "subtitle:".concat(str5);
                androidx.media3.common.a[] aVarArr5 = (androidx.media3.common.a[]) arrayList8.toArray(new androidx.media3.common.a[0]);
                String str6 = y2r0.a;
                Uri[] uriArr4 = (Uri[]) arrayList7.toArray(new Uri[0]);
                ImmutableList.b bVar2 = ImmutableList.c;
                list2 = list8;
                i = i15;
                r9v f3 = f(concat2, 3, uriArr4, aVarArr5, null, com.google.common.collect.g.f, map, j);
                arrayList2.add(ipx.x(arrayList9));
                arrayList.add(f3);
                int length = aVarArr5.length;
                androidx.media3.common.a[] aVarArr6 = new androidx.media3.common.a[length];
                for (int i17 = 0; i17 < length; i17++) {
                    aVarArr6[i17] = ((rfl) e9vVar).c(aVarArr5[i17]);
                }
                f3.w(new pfp0[]{new pfp0(concat2, aVarArr6)}, new int[0]);
            } else {
                i = i15;
                list2 = list8;
            }
            i15 = i + 1;
        }
        this.u = (r9v[]) arrayList.toArray(new r9v[0]);
        this.w = (int[][]) arrayList2.toArray(new int[0][]);
        this.s = this.u.length;
        for (int i18 = 0; i18 < this.x; i18++) {
            this.u[i18].e.l = true;
        }
        for (r9v r9vVar : this.u) {
            if (!r9vVar.E) {
                f.a aVar8 = new f.a();
                aVar8.a = r9vVar.Q;
                r9vVar.k(new androidx.media3.exoplayer.f(aVar8));
            }
        }
        this.v = this.u;
    }

    public final r9v f(String str, int i, Uri[] uriArr, androidx.media3.common.a[] aVarArr, @Nullable androidx.media3.common.a aVar, @Nullable List<androidx.media3.common.a> list, Map<String, DrmInitData> map, long j) {
        return new r9v(str, i, this.q, new b9v(this.b, this.c, uriArr, aVarArr, this.d, this.e, this.l, list, this.p), map, this.j, j, aVar, this.f, this.g, this.h, this.i, this.o, null);
    }

    @Override // androidx.media3.exoplayer.source.q
    public final long getBufferedPositionUs() {
        return this.y.getBufferedPositionUs();
    }

    @Override // androidx.media3.exoplayer.source.q
    public final long getNextLoadPositionUs() {
        return this.y.getNextLoadPositionUs();
    }

    @Override // androidx.media3.exoplayer.source.h
    public final qfp0 getTrackGroups() {
        qfp0 qfp0Var = this.t;
        qfp0Var.getClass();
        return qfp0Var;
    }

    /* JADX WARN: Code restructure failed: missing block: B:183:0x011e, code lost:
    
        if (r44 != r3.Q) goto L60;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:107:0x0289  */
    /* JADX WARN: Removed duplicated region for block: B:117:0x029e  */
    /* JADX WARN: Removed duplicated region for block: B:133:0x02d2  */
    /* JADX WARN: Removed duplicated region for block: B:151:0x0300  */
    /* JADX WARN: Removed duplicated region for block: B:154:0x01ec  */
    /* JADX WARN: Removed duplicated region for block: B:168:0x026b  */
    /* JADX WARN: Removed duplicated region for block: B:177:0x027e  */
    /* JADX WARN: Removed duplicated region for block: B:68:0x012e  */
    /* JADX WARN: Removed duplicated region for block: B:95:0x01a0  */
    /* JADX WARN: Type inference failed for: r10v17 */
    /* JADX WARN: Type inference failed for: r10v18 */
    /* JADX WARN: Type inference failed for: r10v19 */
    @Override // androidx.media3.exoplayer.source.h
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final long h(d7q[] d7qVarArr, boolean[] zArr, m0h0[] m0h0VarArr, boolean[] zArr2, long j) {
        IdentityHashMap<m0h0, Integer> identityHashMap;
        m0h0[] m0h0VarArr2;
        int[] iArr;
        boolean z;
        int i;
        b9v b9vVar;
        int i2;
        int i3;
        m0h0[] m0h0VarArr3;
        int i4;
        int[] iArr2;
        r9v[] r9vVarArr;
        r9v r9vVar;
        boolean z2;
        boolean z3;
        int i5;
        int i6;
        boolean z4;
        int i7;
        ?? r10;
        int i8;
        int i9;
        d7q[] d7qVarArr2;
        int[] iArr3 = new int[d7qVarArr.length];
        int[] iArr4 = new int[d7qVarArr.length];
        int i10 = 0;
        while (true) {
            int length = d7qVarArr.length;
            identityHashMap = this.k;
            if (i10 >= length) {
                break;
            }
            m0h0 m0h0Var = m0h0VarArr[i10];
            iArr3[i10] = m0h0Var == null ? -1 : identityHashMap.get(m0h0Var).intValue();
            iArr4[i10] = -1;
            d7q d7qVar = d7qVarArr[i10];
            if (d7qVar != null) {
                pfp0 trackGroup = d7qVar.getTrackGroup();
                int i11 = 0;
                while (true) {
                    r9v[] r9vVarArr2 = this.u;
                    if (i11 < r9vVarArr2.length) {
                        r9v r9vVar2 = r9vVarArr2[i11];
                        r9vVar2.l();
                        if (r9vVar2.J.b(trackGroup) != -1) {
                            iArr4[i10] = i11;
                            break;
                        }
                        i11++;
                    }
                }
            }
            i10++;
        }
        identityHashMap.clear();
        int length2 = d7qVarArr.length;
        m0h0[] m0h0VarArr4 = new m0h0[length2];
        int length3 = d7qVarArr.length;
        m0h0[] m0h0VarArr5 = new m0h0[length3];
        int length4 = d7qVarArr.length;
        d7q[] d7qVarArr3 = new d7q[length4];
        r9v[] r9vVarArr3 = new r9v[this.u.length];
        int i12 = length3;
        int i13 = 0;
        int i14 = 0;
        boolean z5 = false;
        while (i13 < this.u.length) {
            int i15 = length2;
            int i16 = 0;
            while (true) {
                m0h0VarArr2 = m0h0VarArr4;
                if (i16 >= d7qVarArr.length) {
                    break;
                }
                m0h0VarArr5[i16] = iArr3[i16] == i13 ? m0h0VarArr[i16] : null;
                d7qVarArr3[i16] = iArr4[i16] == i13 ? d7qVarArr[i16] : null;
                i16++;
                m0h0VarArr4 = m0h0VarArr2;
            }
            r9v r9vVar3 = this.u[i13];
            Loader loader = r9vVar3.k;
            int i17 = i13;
            b9v b9vVar2 = r9vVar3.e;
            Uri[] uriArr = b9vVar2.e;
            HlsPlaylistTracker hlsPlaylistTracker = b9vVar2.g;
            ArrayList<h9v> arrayList = r9vVar3.o;
            r9vVar3.l();
            int i18 = r9vVar3.F;
            m0h0[] m0h0VarArr6 = m0h0VarArr5;
            int i19 = 0;
            while (i19 < length4) {
                q9v q9vVar = (q9v) m0h0VarArr6[i19];
                if (q9vVar == null || (d7qVarArr3[i19] != null && zArr[i19])) {
                    i9 = i19;
                    d7qVarArr2 = d7qVarArr3;
                } else {
                    i9 = i19;
                    r9vVar3.F--;
                    d7qVarArr2 = d7qVarArr3;
                    if (q9vVar.d != -1) {
                        r9v r9vVar4 = q9vVar.c;
                        int i20 = q9vVar.b;
                        r9vVar4.l();
                        r9vVar4.L.getClass();
                        int i21 = r9vVar4.L[i20];
                        fxc0.z(r9vVar4.O[i21]);
                        r9vVar4.O[i21] = false;
                        q9vVar.d = -1;
                    }
                    m0h0VarArr6[i9] = null;
                }
                i19 = i9 + 1;
                d7qVarArr3 = d7qVarArr2;
            }
            d7q[] d7qVarArr4 = d7qVarArr3;
            boolean z6 = true;
            if (!z5) {
                if (!r9vVar3.T) {
                    iArr = iArr3;
                } else if (i18 != 0) {
                    iArr = iArr3;
                }
                z = false;
                d7q d7qVar2 = b9vVar2.r;
                boolean z7 = z;
                d7q d7qVar3 = d7qVar2;
                i = 0;
                while (i < length4) {
                    int i22 = i;
                    d7q d7qVar4 = d7qVarArr4[i22];
                    if (d7qVar4 == null) {
                        i8 = length4;
                    } else {
                        i8 = length4;
                        boolean z8 = z7;
                        int b = r9vVar3.J.b(d7qVar4.getTrackGroup());
                        if (b == r9vVar3.M) {
                            hlsPlaylistTracker.y(uriArr[b9vVar2.r.getSelectedIndexInTrackGroup()]);
                            b9vVar2.r = d7qVar4;
                            d7qVar3 = d7qVar4;
                        }
                        if (m0h0VarArr6[i22] == null) {
                            r9vVar3.F++;
                            q9v q9vVar2 = new q9v(r9vVar3, b);
                            m0h0VarArr6[i22] = q9vVar2;
                            zArr2[i22] = z6;
                            if (r9vVar3.L != null) {
                                q9vVar2.a();
                                if (!z8) {
                                    r9v.b bVar = r9vVar3.w[r9vVar3.L[b]];
                                    z7 = (bVar.t() == 0 || bVar.F(j, z6)) ? false : true;
                                }
                            }
                        }
                        z7 = z8;
                    }
                    i = i22 + 1;
                    length4 = i8;
                    z6 = true;
                }
                int i23 = length4;
                boolean z9 = z7;
                if (r9vVar3.F != 0) {
                    hlsPlaylistTracker.y(uriArr[b9vVar2.r.getSelectedIndexInTrackGroup()]);
                    b9vVar2.n = null;
                    r9vVar3.H = null;
                    r9vVar3.S = true;
                    arrayList.clear();
                    if (loader.c()) {
                        if (r9vVar3.D) {
                            for (r9v.b bVar2 : r9vVar3.w) {
                                bVar2.k();
                            }
                        }
                        loader.a();
                    } else {
                        r9vVar3.x();
                    }
                    int[] iArr5 = iArr4;
                    r9vVar = r9vVar3;
                    i5 = i12;
                    iArr2 = iArr5;
                    b9vVar = b9vVar2;
                    i3 = i15;
                    m0h0VarArr3 = m0h0VarArr2;
                    i4 = i17;
                    z3 = z9;
                    r9vVarArr = r9vVarArr3;
                } else {
                    boolean z10 = true;
                    if (arrayList.isEmpty() || Objects.equals(d7qVar3, d7qVar2)) {
                        b9vVar = b9vVar2;
                        i2 = i12;
                        i3 = i15;
                        m0h0VarArr3 = m0h0VarArr2;
                        i4 = i17;
                        iArr2 = iArr4;
                        r9vVarArr = r9vVarArr3;
                        r9vVar = r9vVar3;
                    } else {
                        if (r9vVar3.T) {
                            b9vVar = b9vVar2;
                            i2 = i12;
                            i3 = i15;
                            m0h0VarArr3 = m0h0VarArr2;
                            i4 = i17;
                            iArr2 = iArr4;
                            r9vVarArr = r9vVarArr3;
                            r9vVar = r9vVar3;
                        } else {
                            long j2 = j < 0 ? -j : 0L;
                            h9v r = r9vVar3.r();
                            long j3 = j2;
                            bq10[] a2 = b9vVar2.a(r, j);
                            b9vVar = b9vVar2;
                            List<h9v> list = r9vVar3.p;
                            i2 = i12;
                            i3 = i15;
                            m0h0VarArr3 = m0h0VarArr2;
                            i4 = i17;
                            iArr2 = iArr4;
                            r9vVarArr = r9vVarArr3;
                            r9vVar = r9vVar3;
                            d7q d7qVar5 = d7qVar3;
                            d7qVar5.g(j, j3, C.TIME_UNSET, list, a2);
                            if (d7qVar5.getSelectedIndexInTrackGroup() != b9vVar.h.a(r.d)) {
                                z10 = true;
                            } else {
                                z10 = true;
                            }
                        }
                        r9vVar.S = z10;
                        z2 = z10;
                        z3 = z2;
                        if (z3) {
                            i5 = i2;
                        } else {
                            r9vVar.y(j, z2);
                            int i24 = 0;
                            i5 = i2;
                            while (i24 < i5) {
                                if (m0h0VarArr6[i24] != null) {
                                    zArr2[i24] = z10;
                                }
                                i24++;
                                z10 = true;
                            }
                        }
                    }
                    z2 = z5;
                    z3 = z9;
                    if (z3) {
                    }
                }
                ArrayList<q9v> arrayList2 = r9vVar.t;
                arrayList2.clear();
                for (i6 = 0; i6 < i5; i6++) {
                    m0h0 m0h0Var2 = m0h0VarArr6[i6];
                    if (m0h0Var2 != null) {
                        arrayList2.add((q9v) m0h0Var2);
                    }
                }
                r9vVar.T = true;
                z4 = false;
                i7 = 0;
                while (i7 < d7qVarArr.length) {
                    m0h0 m0h0Var3 = m0h0VarArr6[i7];
                    int i25 = i4;
                    if (iArr2[i7] == i25) {
                        m0h0Var3.getClass();
                        r10 = m0h0VarArr3;
                        r10[i7] = m0h0Var3;
                        identityHashMap.put(m0h0Var3, Integer.valueOf(i25));
                        z4 = true;
                    } else {
                        r10 = m0h0VarArr3;
                        if (iArr[i7] == i25) {
                            fxc0.z(m0h0Var3 == null);
                        }
                    }
                    i7++;
                    m0h0VarArr3 = r10;
                    i4 = i25;
                }
                m0h0[] m0h0VarArr7 = m0h0VarArr3;
                int i26 = i4;
                if (!z4) {
                    int i27 = i14;
                    r9vVarArr[i27] = r9vVar;
                    i14 = i27 + 1;
                    if (i27 == 0) {
                        b9vVar.l = true;
                        if (!z3) {
                            r9v[] r9vVarArr4 = this.v;
                            if (r9vVarArr4.length != 0 && r9vVar == r9vVarArr4[0]) {
                            }
                        }
                        ((SparseArray) this.l.b).clear();
                        z5 = true;
                    } else {
                        b9vVar.l = i26 < this.x;
                    }
                }
                i13 = i26 + 1;
                m0h0VarArr4 = m0h0VarArr7;
                iArr4 = iArr2;
                iArr3 = iArr;
                r9vVarArr3 = r9vVarArr;
                m0h0VarArr5 = m0h0VarArr6;
                d7qVarArr3 = d7qVarArr4;
                length4 = i23;
                i12 = i5;
                length2 = i3;
            }
            iArr = iArr3;
            z = true;
            d7q d7qVar22 = b9vVar2.r;
            boolean z72 = z;
            d7q d7qVar32 = d7qVar22;
            i = 0;
            while (i < length4) {
            }
            int i232 = length4;
            boolean z92 = z72;
            if (r9vVar3.F != 0) {
            }
            ArrayList<q9v> arrayList22 = r9vVar.t;
            arrayList22.clear();
            while (i6 < i5) {
            }
            r9vVar.T = true;
            z4 = false;
            i7 = 0;
            while (i7 < d7qVarArr.length) {
            }
            m0h0[] m0h0VarArr72 = m0h0VarArr3;
            int i262 = i4;
            if (!z4) {
            }
            i13 = i262 + 1;
            m0h0VarArr4 = m0h0VarArr72;
            iArr4 = iArr2;
            iArr3 = iArr;
            r9vVarArr3 = r9vVarArr;
            m0h0VarArr5 = m0h0VarArr6;
            d7qVarArr3 = d7qVarArr4;
            length4 = i232;
            i12 = i5;
            length2 = i3;
        }
        System.arraycopy(m0h0VarArr4, 0, m0h0VarArr, 0, length2);
        r9v[] r9vVarArr5 = (r9v[]) y2r0.U(r9vVarArr3, i14);
        this.v = r9vVarArr5;
        com.google.common.collect.g n = ImmutableList.n(r9vVarArr5);
        AbstractList e = qhz.e(n, new rq(14));
        this.m.getClass();
        this.y = new pui(n, e);
        return j;
    }

    @Override // androidx.media3.exoplayer.source.q
    public final boolean isLoading() {
        return this.y.isLoading();
    }

    @Override // androidx.media3.exoplayer.source.q
    public final boolean k(androidx.media3.exoplayer.f fVar) {
        if (this.t != null) {
            return this.y.k(fVar);
        }
        for (r9v r9vVar : this.u) {
            if (!r9vVar.E) {
                f.a aVar = new f.a();
                aVar.a = r9vVar.Q;
                r9vVar.k(new androidx.media3.exoplayer.f(aVar));
            }
        }
        return false;
    }

    @Override // androidx.media3.exoplayer.source.h
    public final void maybeThrowPrepareError() throws IOException {
        for (r9v r9vVar : this.u) {
            r9vVar.v();
            if (r9vVar.U && !r9vVar.E) {
                throw ParserException.a(null, "Loading finished before preparation is complete.");
            }
        }
    }

    @Override // androidx.media3.exoplayer.source.h
    public final long readDiscontinuity() {
        return C.TIME_UNSET;
    }

    @Override // androidx.media3.exoplayer.source.q
    public final void reevaluateBuffer(long j) {
        this.y.reevaluateBuffer(j);
    }

    @Override // androidx.media3.exoplayer.source.h
    public final long seekToUs(long j) {
        r9v[] r9vVarArr = this.v;
        if (r9vVarArr.length > 0) {
            boolean y = r9vVarArr[0].y(j, false);
            int i = 1;
            while (true) {
                r9v[] r9vVarArr2 = this.v;
                if (i >= r9vVarArr2.length) {
                    break;
                }
                r9vVarArr2[i].y(j, y);
                i++;
            }
            if (y) {
                ((SparseArray) this.l.b).clear();
            }
        }
        return j;
    }
}
