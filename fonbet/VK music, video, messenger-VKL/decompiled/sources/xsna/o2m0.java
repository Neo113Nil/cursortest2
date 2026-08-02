package xsna;

import android.graphics.Matrix;
import android.net.Uri;
import android.util.SparseArray;
import com.vk.log.L;
import com.vk.media.MediaUtils;
import com.vk.media.model.CameraVideoEncoderParameters;
import java.io.File;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.CopyOnWriteArrayList;
import kotlin.Triple;
import xsna.mny;

/* compiled from: StoryEncoderParamsFactoryImp.kt */
/* loaded from: classes6.dex */
public final class o2m0 implements n2m0 {
    public final mny a;

    public o2m0(mny mnyVar) {
        this.a = mnyVar;
    }

    public static MediaUtils.d b(tam0 tam0Var) {
        mat0 d = tam0Var.d();
        Integer valueOf = d != null ? Integer.valueOf(d.b()) : null;
        if (valueOf == null) {
            com.vk.stories.b bVar = com.vk.stories.b.a;
            boolean e = tam0Var.e();
            bVar.getClass();
            return com.vk.stories.b.e(e);
        }
        com.vk.stories.b bVar2 = com.vk.stories.b.a;
        int intValue = valueOf.intValue();
        boolean e2 = tam0Var.e();
        bVar2.getClass();
        return com.vk.stories.b.d(intValue, e2);
    }

    /* JADX WARN: Removed duplicated region for block: B:5:0x0079  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x007c  */
    @Override // xsna.n2m0
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final CameraVideoEncoderParameters a(gzs gzsVar, tam0 tam0Var, boolean z) {
        Object obj;
        Uri uri;
        File u;
        Triple triple;
        nov novVar;
        int i;
        long j;
        long duration;
        tam0 tam0Var2;
        nov novVar2;
        if (tam0Var != null) {
            zcl0 zcl0Var = tam0Var.h;
            Iterator it = j5g.D0(new tbb0(2), zcl0Var.a).iterator();
            while (true) {
                if (!it.hasNext()) {
                    obj = null;
                    break;
                }
                obj = it.next();
                if (((nov) obj) instanceof oit0) {
                    break;
                }
            }
            oit0 oit0Var = obj instanceof oit0 ? (oit0) obj : null;
            if (oit0Var == null) {
                Iterator<nov> it2 = zcl0Var.a.iterator();
                while (true) {
                    if (!it2.hasNext()) {
                        novVar = null;
                        break;
                    }
                    novVar = it2.next();
                    if (novVar instanceof r4g0) {
                        break;
                    }
                }
                r4g0 r4g0Var = novVar instanceof r4g0 ? (r4g0) novVar : null;
                oit0Var = r4g0Var != null ? r4g0Var.getVideo() : null;
            }
            if (oit0Var != null && (uri = oit0Var.getUri()) != null && (u = up2.u(uri)) != null) {
                triple = new Triple(tam0Var, oit0Var, u);
                if (triple == null) {
                    tam0 tam0Var3 = (tam0) triple.d();
                    oit0 oit0Var2 = (oit0) triple.g();
                    File file = (File) triple.h();
                    MediaUtils.d b = b(tam0Var3);
                    Triple d = mny.d(this.a, tam0Var3, false, b, false, false, 24);
                    if (d != null) {
                        List list = (List) d.d();
                        MediaUtils.d dVar = (MediaUtils.d) d.g();
                        MediaUtils.d dVar2 = (MediaUtils.d) gzsVar.invoke();
                        Matrix l = oit0Var2.l(dVar2.a, dVar2.b, b);
                        float[] fArr = new float[9];
                        l.getValues(fArr);
                        mny.a.getClass();
                        fArr[6] = mny.a.b;
                        l.setValues(fArr);
                        wds0 videoData = oit0Var2.getVideoData();
                        if (videoData != null) {
                            long j2 = videoData.d;
                            i = (int) (j2 != 0 ? j2 - videoData.c : videoData.b);
                        } else {
                            i = 0;
                        }
                        mat0 d2 = tam0Var3.d();
                        if (d2 != null) {
                            j = d2.c;
                        } else {
                            wds0 videoData2 = oit0Var2.getVideoData();
                            j = videoData2 != null ? videoData2.c : 0L;
                        }
                        mat0 d3 = tam0Var3.d();
                        if (d3 != null) {
                            duration = d3.d;
                        } else {
                            wds0 videoData3 = oit0Var2.getVideoData();
                            duration = videoData3 != null ? videoData3.d : oit0Var2.getDuration();
                        }
                        List<uq10> list2 = list;
                        ArrayList arrayList = new ArrayList(c5g.u(list2, 10));
                        for (uq10 uq10Var : list2) {
                            SparseArray<uq10> sparseArray = ((r290) r290.b.getValue()).a;
                            oit0 oit0Var3 = oit0Var2;
                            int size = sparseArray.size() + 1;
                            sparseArray.put(size, uq10Var);
                            arrayList.add(Integer.valueOf(size));
                            oit0Var2 = oit0Var3;
                        }
                        oit0 oit0Var4 = oit0Var2;
                        int[] N0 = j5g.N0(arrayList);
                        MediaUtils.d b2 = b(tam0Var3);
                        zcl0 zcl0Var2 = tam0Var3.h;
                        CopyOnWriteArrayList<nov> copyOnWriteArrayList = zcl0Var2.a;
                        int i2 = 0;
                        while (true) {
                            if (i2 == copyOnWriteArrayList.size()) {
                                tam0Var2 = tam0Var3;
                                novVar2 = null;
                                break;
                            }
                            nov novVar3 = copyOnWriteArrayList.get(i2);
                            tam0Var2 = tam0Var3;
                            if ((novVar3 instanceof grt0) && !((grt0) novVar3).q()) {
                                novVar2 = copyOnWriteArrayList.get(i2);
                                break;
                            }
                            i2++;
                            tam0Var3 = tam0Var2;
                        }
                        boolean z2 = novVar2 != null;
                        r4g0 k = zcl0Var2.k();
                        if (k != null) {
                            z2 = z2 || !k.getVideo().q();
                        }
                        boolean z3 = !z2;
                        if (!file.exists()) {
                            com.vk.metrics.eventtracking.b.a.q(new Exception("CameraVideoEncoder input doesn't exist"));
                        }
                        CameraVideoEncoderParameters cameraVideoEncoderParameters = new CameraVideoEncoderParameters(file);
                        wds0 videoData4 = oit0Var4.getVideoData();
                        cameraVideoEncoderParameters.e = videoData4 != null ? videoData4.e : false;
                        cameraVideoEncoderParameters.f = z3;
                        int i3 = b2.a;
                        int i4 = b2.b;
                        cameraVideoEncoderParameters.h = i3;
                        cameraVideoEncoderParameters.g = i4;
                        float[] fArr2 = new float[9];
                        l.getValues(fArr2);
                        cameraVideoEncoderParameters.j = fArr2;
                        cameraVideoEncoderParameters.w = i;
                        cameraVideoEncoderParameters.i = N0;
                        cameraVideoEncoderParameters.l = duration;
                        cameraVideoEncoderParameters.k = j;
                        cameraVideoEncoderParameters.c = com.vk.core.files.a.r();
                        if (oit0Var4.getVideoRadius() > 0) {
                            cameraVideoEncoderParameters.m = an10.b((oit0Var4.getVideoRadius() / oit0Var4.getOriginalWidth()) * b2.a);
                        }
                        if (z) {
                            cameraVideoEncoderParameters.d = com.vk.stories.b.g(com.vk.stories.b.a, list, dVar, 0, com.vk.core.files.a.t());
                        }
                        StringBuilder sb = new StringBuilder("Source size: width = ");
                        mat0 d4 = tam0Var2.d();
                        sb.append(d4 != null ? Integer.valueOf(d4.c()) : null);
                        sb.append(", height = ");
                        mat0 d5 = tam0Var2.d();
                        sb.append(d5 != null ? Integer.valueOf(d5.b()) : null);
                        sb.append(",Story encoding params: width = ");
                        sb.append(cameraVideoEncoderParameters.h);
                        sb.append(", height = ");
                        sb.append(cameraVideoEncoderParameters.g);
                        L.p("StoryEditorVideoDelegate", sb.toString());
                        return cameraVideoEncoderParameters;
                    }
                }
                return null;
            }
        }
        triple = null;
        if (triple == null) {
        }
        return null;
    }
}
