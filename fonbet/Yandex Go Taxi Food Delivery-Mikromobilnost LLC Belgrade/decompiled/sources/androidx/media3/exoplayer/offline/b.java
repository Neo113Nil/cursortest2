package androidx.media3.exoplayer.offline;

import android.os.Handler;
import android.util.SparseIntArray;
import defpackage.d6z;
import defpackage.d7m;
import defpackage.e7m;
import defpackage.fe10;
import defpackage.gly0;
import defpackage.jyi0;
import defpackage.loo;
import defpackage.nmh;
import defpackage.omh;
import defpackage.r001;
import defpackage.sf10;
import defpackage.tw21;
import defpackage.uf10;
import defpackage.uxh;
import defpackage.vmh;
import defpackage.wqj;
import defpackage.xv00;
import defpackage.y001;
import defpackage.yzz0;
import defpackage.z8z0;
import defpackage.zgl;
import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import ru.yandex.video.m3.offline.ExoDownloadManager$prepareTrackVariants$1;

/* loaded from: classes10.dex */
public final class b {
    public static final /* synthetic */ int m = 0;
    public final uf10 a;
    public final vmh b;
    public final jyi0 c;
    public final SparseIntArray d;
    public final Handler e;
    public boolean f;
    public ExoDownloadManager$prepareTrackVariants$1.AnonymousClass1 g;
    public DownloadHelper$MediaPreparer h;
    public yzz0[] i;
    public xv00[] j;
    public List[][] k;
    public List[][] l;

    static {
        omh omhVar = omh.F;
        omhVar.getClass();
        nmh nmhVar = new nmh(omhVar);
        nmhVar.s = true;
        nmhVar.z = false;
        new omh(nmhVar);
    }

    public b(fe10 fe10Var, uf10 uf10Var, r001 r001Var, jyi0 jyi0Var) {
        fe10Var.b.getClass();
        this.a = uf10Var;
        vmh vmhVar = new vmh(r001Var, new gly0(), null);
        this.b = vmhVar;
        this.c = jyi0Var;
        this.d = new SparseIntArray();
        vmhVar.init(new zgl(14), new e7m());
        this.e = tw21.o(null);
        new z8z0();
    }

    public static void a(b bVar) {
        vmh vmhVar = bVar.b;
        bVar.h.getClass();
        bVar.h.mediaPeriods.getClass();
        bVar.h.timeline.getClass();
        int length = bVar.h.mediaPeriods.length;
        jyi0 jyi0Var = bVar.c;
        int size = jyi0Var.size();
        bVar.k = (List[][]) Array.newInstance((Class<?>) List.class, length, size);
        bVar.l = (List[][]) Array.newInstance((Class<?>) List.class, length, size);
        for (int i = 0; i < length; i++) {
            for (int i2 = 0; i2 < size; i2++) {
                bVar.k[i][i2] = new ArrayList();
                bVar.l[i][i2] = Collections.unmodifiableList(bVar.k[i][i2]);
            }
        }
        bVar.i = new yzz0[length];
        bVar.j = new xv00[length];
        for (int i3 = 0; i3 < length; i3++) {
            bVar.i[i3] = bVar.h.mediaPeriods[i3].getTrackGroups();
            SparseIntArray sparseIntArray = bVar.d;
            y001 selectTracks = vmhVar.selectTracks(jyi0Var.s(), bVar.i[i3], new sf10(bVar.h.timeline.m(i3)), bVar.h.timeline);
            for (int i4 = 0; i4 < selectTracks.a; i4++) {
                loo looVar = selectTracks.c[i4];
                if (looVar != null) {
                    List list = bVar.k[i3][i4];
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
                            list.set(i5, new d7m(looVar2.getTrackGroup(), iArr, 0, 0));
                        } else {
                            i5++;
                        }
                    }
                }
            }
            vmhVar.onSelectionActivated(selectTracks.e);
            xv00[] xv00VarArr = bVar.j;
            xv00 currentMappedTrackInfo = vmhVar.getCurrentMappedTrackInfo();
            currentMappedTrackInfo.getClass();
            xv00VarArr[i3] = currentMappedTrackInfo;
        }
        bVar.f = true;
        Handler handler = bVar.e;
        handler.getClass();
        handler.post(new uxh(23, bVar));
    }

    public final void b(ExoDownloadManager$prepareTrackVariants$1.AnonymousClass1 anonymousClass1) {
        d6z.x(this.g == null);
        this.g = anonymousClass1;
        uf10 uf10Var = this.a;
        if (uf10Var != null) {
            this.h = new DownloadHelper$MediaPreparer(uf10Var, this);
        } else {
            this.e.post(new wqj(6, this, anonymousClass1));
        }
    }

    public final void c() {
        DownloadHelper$MediaPreparer downloadHelper$MediaPreparer = this.h;
        if (downloadHelper$MediaPreparer != null) {
            downloadHelper$MediaPreparer.release();
        }
        this.b.release();
        this.c.release();
    }
}
