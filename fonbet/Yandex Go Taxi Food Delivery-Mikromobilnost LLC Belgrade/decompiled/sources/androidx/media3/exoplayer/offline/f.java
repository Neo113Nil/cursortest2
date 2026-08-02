package androidx.media3.exoplayer.offline;

import android.os.Handler;
import android.util.SparseIntArray;
import defpackage.bo31;
import defpackage.d6z;
import defpackage.d7m;
import defpackage.dy31;
import defpackage.fe10;
import defpackage.ip4;
import defpackage.jy31;
import defpackage.jyi0;
import defpackage.loo;
import defpackage.nmh;
import defpackage.omh;
import defpackage.sf10;
import defpackage.tw21;
import defpackage.uf10;
import defpackage.vmh;
import defpackage.xv00;
import defpackage.y001;
import defpackage.yzz0;
import defpackage.z8z0;
import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import ru.yandex.video.m3.preload_manager.PreloadTrackInfoRepository$FetchRequest$launch$1;

/* loaded from: classes10.dex */
public final class f {
    public static final /* synthetic */ int o = 0;
    public final jyi0 a;
    public final uf10 b;
    public final vmh c;
    public final SparseIntArray d;
    public final Handler e;
    public final z8z0 f;
    public boolean g;
    public PreloadTrackInfoRepository$FetchRequest$launch$1 h;
    public YandexDownloadHelper$MediaPreparer i;
    public yzz0[] j;
    public xv00[] k;
    public List[][] l;
    public List[][] m;
    public final boolean n;

    static {
        omh omhVar = omh.F;
        omhVar.getClass();
        nmh nmhVar = new nmh(omhVar);
        nmhVar.s = true;
        nmhVar.z = false;
        new omh(nmhVar);
    }

    public f(fe10 fe10Var, uf10 uf10Var, jyi0 jyi0Var, vmh vmhVar, ip4 ip4Var, boolean z) {
        this.n = false;
        fe10Var.b.getClass();
        this.b = uf10Var;
        this.c = vmhVar;
        this.a = jyi0Var;
        this.d = new SparseIntArray();
        vmhVar.init(new dy31(11), ip4Var);
        this.e = tw21.o(null);
        this.f = new z8z0();
        this.n = z;
    }

    public static void a(f fVar) {
        vmh vmhVar = fVar.c;
        fVar.i.getClass();
        fVar.i.mediaPeriods.getClass();
        fVar.i.timeline.getClass();
        int length = fVar.i.mediaPeriods.length;
        jyi0 jyi0Var = fVar.a;
        int size = jyi0Var.size();
        boolean z = true;
        fVar.l = (List[][]) Array.newInstance((Class<?>) List.class, length, size);
        fVar.m = (List[][]) Array.newInstance((Class<?>) List.class, length, size);
        for (int i = 0; i < length; i++) {
            for (int i2 = 0; i2 < size; i2++) {
                fVar.l[i][i2] = new ArrayList();
                fVar.m[i][i2] = Collections.unmodifiableList(fVar.l[i][i2]);
            }
        }
        fVar.j = new yzz0[length];
        fVar.k = new xv00[length];
        int i3 = 0;
        while (i3 < length) {
            fVar.j[i3] = fVar.i.mediaPeriods[i3].getTrackGroups();
            SparseIntArray sparseIntArray = fVar.d;
            y001 selectTracks = vmhVar.selectTracks(jyi0Var.s(), fVar.j[i3], new sf10(fVar.i.timeline.m(i3)), fVar.i.timeline);
            for (int i4 = 0; i4 < selectTracks.a; i4++) {
                loo looVar = selectTracks.c[i4];
                if (looVar != null) {
                    List list = fVar.l[i3][i4];
                    int i5 = 0;
                    while (true) {
                        if (i5 >= list.size()) {
                            list.add(looVar);
                            break;
                        }
                        loo looVar2 = (loo) list.get(i5);
                        if (looVar2.getTrackGroup().equals(looVar.getTrackGroup())) {
                            sparseIntArray.clear();
                            for (int i6 = 0; i6 < looVar2.length(); i6++) {
                                sparseIntArray.put(looVar2.getIndexInTrackGroup(i6), 0);
                            }
                            for (int i7 = 0; i7 < looVar.length(); i7++) {
                                sparseIntArray.put(looVar.getIndexInTrackGroup(i7), 0);
                            }
                            int[] iArr = new int[sparseIntArray.size()];
                            for (int i8 = 0; i8 < sparseIntArray.size(); i8++) {
                                iArr[i8] = sparseIntArray.keyAt(i8);
                            }
                            list.set(i5, new d7m(looVar2.getTrackGroup(), iArr, 0, 2));
                        } else {
                            i5++;
                        }
                    }
                }
            }
            vmhVar.onSelectionActivated(selectTracks.e);
            xv00[] xv00VarArr = fVar.k;
            xv00 currentMappedTrackInfo = vmhVar.getCurrentMappedTrackInfo();
            currentMappedTrackInfo.getClass();
            xv00VarArr[i3] = currentMappedTrackInfo;
            i3++;
            z = true;
        }
        fVar.g = z;
        Handler handler = fVar.e;
        handler.getClass();
        handler.post(new jy31(11, fVar));
    }

    public final Object b() {
        if (this.b == null) {
            return null;
        }
        d6z.x(this.g);
        if (this.i.timeline.p() > 0) {
            return this.i.timeline.n(0, this.f, 0L).c;
        }
        return null;
    }

    public final void c(PreloadTrackInfoRepository$FetchRequest$launch$1 preloadTrackInfoRepository$FetchRequest$launch$1) {
        d6z.x(this.h == null);
        this.h = preloadTrackInfoRepository$FetchRequest$launch$1;
        uf10 uf10Var = this.b;
        if (uf10Var != null) {
            this.i = new YandexDownloadHelper$MediaPreparer(uf10Var, this, this.n);
        } else {
            this.e.post(new bo31(11, this, preloadTrackInfoRepository$FetchRequest$launch$1));
        }
    }

    public final void d() {
        YandexDownloadHelper$MediaPreparer yandexDownloadHelper$MediaPreparer = this.i;
        if (yandexDownloadHelper$MediaPreparer != null) {
            yandexDownloadHelper$MediaPreparer.release();
        }
        this.c.release();
        this.a.release();
    }
}
