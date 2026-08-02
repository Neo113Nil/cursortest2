package defpackage;

import android.net.Uri;
import android.os.SystemClock;
import androidx.media3.common.a;
import androidx.media3.exoplayer.source.BehindLiveWindowException;
import com.google.common.collect.ImmutableMap;
import java.util.List;
import ru.yandex.video.m3.player.impl.ErrorBehindLiveWindowFromPreloadedLiveDashManifest;
import ru.yandex.video.m3.player.impl.trackselection.SurfaceSizeDependAdaptiveTrackSelection;
import ru.yandex.video.m3.preload.PreloadHelper;

/* loaded from: classes10.dex */
public final class bl51 extends qd5 {
    public Integer B;
    public boolean C;

    public static String o(i9h i9hVar) {
        return "RepresentationHolder: height=" + i9hVar.c.a.v;
    }

    /* JADX WARN: Removed duplicated region for block: B:101:0x0310  */
    /* JADX WARN: Removed duplicated region for block: B:104:0x031d  */
    /* JADX WARN: Removed duplicated region for block: B:106:0x0320  */
    /* JADX WARN: Removed duplicated region for block: B:222:0x0312  */
    /* JADX WARN: Removed duplicated region for block: B:232:0x0304  */
    /* JADX WARN: Removed duplicated region for block: B:91:0x02ac  */
    @Override // defpackage.usb
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void h(xzy xzyVar, long j, List list, psb psbVar) {
        List list2;
        ib10 ib10Var;
        jzz jzzVar;
        i9h[] i9hVarArr;
        Object obj;
        Object obj2;
        osb osbVar;
        long j2;
        long j3;
        bl51 bl51Var;
        nsb createChunk;
        ra7 ra7Var;
        pb7 pb7Var;
        long j4;
        int i;
        Uri uri;
        w6i0 w6i0Var;
        i9h[] i9hVarArr2;
        int i2;
        Integer num;
        int i3;
        ra7 ra7Var2;
        pb7 pb7Var2;
        long j5;
        long j6;
        if (this.n != null) {
            return;
        }
        long j7 = xzyVar.a;
        long j8 = j - j7;
        long W = tw21.W(this.l.getPeriod(this.m).b) + tw21.W(this.l.availabilityStartTimeMs) + j;
        syc0 syc0Var = this.h;
        if (syc0Var != null && syc0Var.e.maybeRefreshManifestBeforeLoadingNextChunk(W)) {
            return;
        }
        long W2 = tw21.W(tw21.E(this.f));
        long k = k(W2);
        if (list.isEmpty()) {
            list2 = list;
            ib10Var = null;
        } else {
            list2 = list;
            ib10Var = (ib10) b64.c(1, list2);
        }
        int length = this.j.length();
        jb10[] jb10VarArr = new jb10[length];
        ib10 ib10Var2 = ib10Var;
        int i4 = 0;
        while (true) {
            jzzVar = jb10.J2;
            if (i4 >= length) {
                break;
            }
            jb10VarArr[i4] = jzzVar;
            i4++;
        }
        int i5 = 0;
        while (true) {
            i9hVarArr = this.i;
            if (i5 >= length) {
                break;
            }
            i9h i9hVar = i9hVarArr[i5];
            jb10[] jb10VarArr2 = jb10VarArr;
            if (i9hVar.e == null) {
                jb10VarArr2[i5] = jzzVar;
                j5 = j8;
            } else {
                long c = i9hVar.c(W2);
                long d = i9hVar.d(W2);
                if (ib10Var2 != null) {
                    j6 = ib10Var2.a();
                    j5 = j8;
                } else {
                    pgg pggVar = i9hVar.e;
                    d6z.z(pggVar);
                    j5 = j8;
                    j6 = tw21.j(pggVar.t(j, i9hVar.f) + i9hVar.g, c, d);
                }
                long j9 = j6;
                if (j9 < c) {
                    jb10VarArr2[i5] = jzzVar;
                } else {
                    jb10VarArr2[i5] = new j9h(j9, d, 2, m(i5));
                }
            }
            i5++;
            jb10VarArr = jb10VarArr2;
            j8 = j5;
        }
        this.j.updateSelectedTrack(j7, j8, j(W2, j7), list2, jb10VarArr);
        int selectedIndex = this.j.getSelectedIndex();
        SystemClock.elapsedRealtime();
        i9h m = m(selectedIndex);
        a selectedFormat = this.j.getSelectedFormat();
        int selectionReason = this.j.getSelectionReason();
        Object selectionData = this.j.getSelectionData();
        boolean z = this.C;
        kpg kpgVar = this.e;
        if (z) {
            obj = selectionData;
            h5z0.a.a("foundNotCachedSegment do not try found cached initial segment", new Object[0]);
        } else {
            if (this.B == null) {
                int length2 = i9hVarArr.length;
                int i6 = 0;
                int i7 = 0;
                while (true) {
                    if (i6 >= length2) {
                        i9hVarArr2 = i9hVarArr;
                        obj = selectionData;
                        num = null;
                        break;
                    }
                    i9h i9hVar2 = i9hVarArr[i6];
                    int i8 = i7 + 1;
                    s4j0 s4j0Var = i9hVar2.c;
                    i9hVarArr2 = i9hVarArr;
                    osb osbVar2 = i9hVar2.b;
                    w6i0 w6i0Var2 = (osbVar2 != null ? ((su6) osbVar2).B : null) == null ? s4j0Var.x : null;
                    w6i0 c2 = i9hVar2.e == null ? s4j0Var.c() : null;
                    if (w6i0Var2 != null || c2 != null) {
                        obj = selectionData;
                        PreloadHelper.Companion companion = PreloadHelper.INSTANCE;
                        i3 = length2;
                        npg buildInitDataSpec = companion.buildInitDataSpec(i9hVar2.c, w6i0Var2, c2);
                        boolean z2 = kpgVar instanceof al51;
                        al51 al51Var = z2 ? (al51) kpgVar : null;
                        if (al51Var == null || (ra7Var2 = al51Var.a) == null) {
                            eb7 eb7Var = kpgVar instanceof eb7 ? (eb7) kpgVar : null;
                            ra7Var2 = eb7Var != null ? eb7Var.a : null;
                        }
                        al51 al51Var2 = z2 ? (al51) kpgVar : null;
                        if (al51Var2 != null) {
                            pb7Var2 = al51Var2.x;
                        } else {
                            eb7 eb7Var2 = kpgVar instanceof eb7 ? (eb7) kpgVar : null;
                            pb7Var2 = eb7Var2 != null ? eb7Var2.x : null;
                        }
                        if (ra7Var2 != null && pb7Var2 != null && companion.isDataSpecPreloaded(ra7Var2, pb7Var2, buildInitDataSpec)) {
                            h5z0.a.a("preloaded representation holder founded: ".concat(o(i9hVar2)), new Object[0]);
                            num = Integer.valueOf(i7);
                            break;
                        }
                    } else {
                        h5z0.a.a(oyr.m(this.d, " pendingInitializationUri and pendingIndexUri are null", b64.t(i7, "[", "] trackType=")), new Object[0]);
                        obj = selectionData;
                        i3 = length2;
                    }
                    i6++;
                    i7 = i8;
                    i9hVarArr = i9hVarArr2;
                    selectionData = obj;
                    length2 = i3;
                }
                this.B = num;
            } else {
                i9hVarArr2 = i9hVarArr;
                obj = selectionData;
            }
            Integer num2 = this.B;
            if (num2 != null) {
                i9h i9hVar3 = i9hVarArr2[num2.intValue()];
                loo looVar = this.j;
                SurfaceSizeDependAdaptiveTrackSelection surfaceSizeDependAdaptiveTrackSelection = looVar instanceof SurfaceSizeDependAdaptiveTrackSelection ? (SurfaceSizeDependAdaptiveTrackSelection) looVar : null;
                if (surfaceSizeDependAdaptiveTrackSelection != null) {
                    surfaceSizeDependAdaptiveTrackSelection.lockSelectedIndex(this.B.intValue());
                }
                d5z0 d5z0Var = h5z0.a;
                d5z0Var.a("force to use " + o(i9hVar3) + ", lockSelectedIndex " + this.B, new Object[0]);
                if (m != i9hVar3) {
                    d5z0Var.a("switch to preloaded representationHolder. From: " + o(m) + " to " + o(i9hVar3), new Object[0]);
                    a format = this.j.getFormat(this.B.intValue());
                    if (selectedFormat.equals(format)) {
                        i2 = 0;
                    } else {
                        i2 = 0;
                        d5z0Var.a("switch format. From: " + selectedFormat + " to " + format, new Object[0]);
                        selectedFormat = format;
                    }
                    d5z0Var.a(oyr.i(selectionReason, "selectionReason = "), new Object[i2]);
                    m = i9hVar3;
                    obj2 = null;
                    a aVar = selectedFormat;
                    long j10 = m.f;
                    long j11 = m.g;
                    pgg pggVar2 = m.e;
                    ic5 ic5Var = m.d;
                    s4j0 s4j0Var2 = m.c;
                    osbVar = m.b;
                    if (osbVar == null) {
                        w6i0 w6i0Var3 = ((su6) osbVar).B == null ? s4j0Var2.x : null;
                        if (pggVar2 == null) {
                            w6i0Var = s4j0Var2.c();
                            j2 = j11;
                        } else {
                            j2 = j11;
                            w6i0Var = null;
                        }
                        if (w6i0Var3 != null || w6i0Var != null) {
                            if (w6i0Var3 != null) {
                                w6i0 a = w6i0Var3.a(w6i0Var, ic5Var.a);
                                if (a != null) {
                                    w6i0Var3 = a;
                                }
                            } else {
                                w6i0Var.getClass();
                                w6i0Var3 = w6i0Var;
                            }
                            psbVar.a = new swv(this.e, jd00.c(s4j0Var2, ic5Var.a, w6i0Var3, 0, ImmutableMap.f()), aVar, selectionReason, obj2, m.b);
                            return;
                        }
                    } else {
                        j2 = j11;
                    }
                    long j12 = -9223372036854775807L;
                    boolean z3 = j10 == -9223372036854775807L;
                    if (m.e() != 0) {
                        psbVar.b = z3;
                        return;
                    }
                    long c3 = m.c(W2);
                    long d2 = m.d(W2);
                    if (ib10Var2 != null) {
                        j3 = ib10Var2.a();
                    } else {
                        d6z.z(pggVar2);
                        j3 = tw21.j(pggVar2.t(j, j10) + j2, c3, d2);
                    }
                    if (j3 < c3) {
                        BehindLiveWindowException behindLiveWindowException = new BehindLiveWindowException();
                        this.n = behindLiveWindowException;
                        if (this.p && (kpgVar instanceof al51)) {
                            al51 al51Var3 = (al51) kpgVar;
                            ra7 ra7Var3 = al51Var3.a;
                            pb7 pb7Var3 = al51Var3.x;
                            String str = this.k;
                            if (str == null || (uri = Uri.parse(str)) == null) {
                                uri = Uri.EMPTY;
                            }
                            String buildCacheKey = pb7Var3.buildCacheKey(new npg(uri));
                            if (ra7Var3.getKeys().contains(buildCacheKey)) {
                                this.n = new ErrorBehindLiveWindowFromPreloadedLiveDashManifest(ra7Var3, buildCacheKey, behindLiveWindowException);
                                return;
                            }
                            return;
                        }
                        return;
                    }
                    if (j3 > d2 || (this.o && j3 >= d2)) {
                        psbVar.b = z3;
                        return;
                    }
                    if (z3 && m.g(j3) >= j10) {
                        psbVar.b = true;
                        return;
                    }
                    int min = (int) Math.min(this.g, (d2 - j3) + 1);
                    if (j10 != -9223372036854775807L) {
                        while (min > 1 && m.g((min + j3) - 1) >= j10) {
                            min--;
                        }
                    }
                    long j13 = list.isEmpty() ? j : -9223372036854775807L;
                    a selectedFormat2 = this.j.getSelectedFormat();
                    int selectionReason2 = this.j.getSelectionReason();
                    Object selectionData2 = this.j.getSelectionData();
                    int i9 = min;
                    s4j0 s4j0Var3 = m.c;
                    long g = m.g(j3);
                    d6z.z(pggVar2);
                    w6i0 G = pggVar2.G(j3 - j2);
                    kpg kpgVar2 = this.e;
                    int i10 = this.d;
                    if (osbVar == null) {
                        long f = m.f(j3);
                        if (m.h(j3, k)) {
                            j4 = j3;
                            i = 0;
                        } else {
                            j4 = j3;
                            i = 8;
                        }
                        createChunk = new xhs0(kpgVar2, n(s4j0Var3, ic5Var.a, G, i, ImmutableMap.f()), selectedFormat2, selectionReason2, selectionData2, g, f, j4, i10, selectedFormat2);
                        bl51Var = this;
                    } else {
                        long j14 = j3;
                        w6i0 w6i0Var4 = G;
                        int i11 = 1;
                        int i12 = 1;
                        while (i11 < i9) {
                            d6z.z(pggVar2);
                            w6i0 a2 = w6i0Var4.a(pggVar2.G((j14 + i11) - j2), ic5Var.a);
                            if (a2 == null) {
                                break;
                            }
                            i12++;
                            i11++;
                            w6i0Var4 = a2;
                        }
                        long j15 = (j14 + i12) - 1;
                        long f2 = m.f(j15);
                        if (j10 != -9223372036854775807L && j10 <= f2) {
                            j12 = j10;
                        }
                        int i13 = i12;
                        bl51Var = this;
                        npg n = bl51Var.n(s4j0Var3, ic5Var.a, w6i0Var4, m.h(j15, k) ? 0 : 8, ImmutableMap.f());
                        long j16 = -s4j0Var3.c;
                        if (eh20.n(selectedFormat2.n)) {
                            j16 += g;
                        }
                        createChunk = bl51Var.a.createChunk(kpgVar2, n, selectedFormat2, selectionReason2, selectionData2, g, f2, j13, j12, j14, i13, j16, m.b, false, i10);
                    }
                    nsb nsbVar = createChunk;
                    if (bl51Var.C) {
                        h5z0.a.a("skip check that media segment is preloaded because foundNotCachedSegment", new Object[0]);
                    } else {
                        d5z0 d5z0Var2 = h5z0.a;
                        d5z0Var2.a("check that media segment is preloaded", new Object[0]);
                        boolean z4 = kpgVar instanceof al51;
                        al51 al51Var4 = z4 ? (al51) kpgVar : null;
                        if (al51Var4 == null || (ra7Var = al51Var4.a) == null) {
                            eb7 eb7Var3 = kpgVar instanceof eb7 ? (eb7) kpgVar : null;
                            ra7Var = eb7Var3 != null ? eb7Var3.a : null;
                        }
                        al51 al51Var5 = z4 ? (al51) kpgVar : null;
                        if (al51Var5 != null) {
                            pb7Var = al51Var5.x;
                        } else {
                            eb7 eb7Var4 = kpgVar instanceof eb7 ? (eb7) kpgVar : null;
                            pb7Var = eb7Var4 != null ? eb7Var4.x : null;
                        }
                        if (ra7Var != null && pb7Var != null && !PreloadHelper.INSTANCE.isDataSpecPreloaded(ra7Var, pb7Var, nsbVar.b)) {
                            bl51Var.C = true;
                            loo looVar2 = bl51Var.j;
                            SurfaceSizeDependAdaptiveTrackSelection surfaceSizeDependAdaptiveTrackSelection2 = looVar2 instanceof SurfaceSizeDependAdaptiveTrackSelection ? (SurfaceSizeDependAdaptiveTrackSelection) looVar2 : null;
                            if (surfaceSizeDependAdaptiveTrackSelection2 != null) {
                                surfaceSizeDependAdaptiveTrackSelection2.unlockTrackSelection();
                            }
                            d5z0Var2.a("unlock track selection", new Object[0]);
                        }
                    }
                    psbVar.a = nsbVar;
                    return;
                }
            } else {
                h5z0.a.a("cachedRepresentationIndex is null", new Object[0]);
            }
        }
        obj2 = obj;
        a aVar2 = selectedFormat;
        long j102 = m.f;
        long j112 = m.g;
        pgg pggVar22 = m.e;
        ic5 ic5Var2 = m.d;
        s4j0 s4j0Var22 = m.c;
        osbVar = m.b;
        if (osbVar == null) {
        }
        long j122 = -9223372036854775807L;
        if (j102 == -9223372036854775807L) {
        }
        if (m.e() != 0) {
        }
    }
}
