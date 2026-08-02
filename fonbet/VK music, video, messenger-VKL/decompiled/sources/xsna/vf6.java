package xsna;

import android.graphics.Bitmap;
import com.facebook.imagepipeline.nativecode.NativeBlurFilter;
import com.unity3d.services.UnityAdsConstants;
import com.vk.log.L;
import com.vk.media.MediaUtils;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import kotlin.Triple;
import kotlin.jvm.internal.Ref$BooleanRef;
import ru.ok.proto.PublisherConfiguration;
import xsna.mny;
import xsna.nov;

/* compiled from: LayersProvider.kt */
/* loaded from: classes3.dex */
public class vf6 implements mny {
    public final wzs<Float, Boolean, MediaUtils.d> b;
    public final gzs<fn2> c;
    public final gzs<Boolean> d;
    public final izs<tam0, Bitmap> e;
    public int f;

    /* JADX WARN: Multi-variable type inference failed */
    public vf6(wzs<? super Float, ? super Boolean, ? extends MediaUtils.d> wzsVar, gzs<? extends fn2> gzsVar, gzs<Boolean> gzsVar2, izs<? super tam0, Bitmap> izsVar) {
        this.b = wzsVar;
        this.c = gzsVar;
        this.d = gzsVar2;
        this.e = izsVar;
    }

    public static yv5 h(Bitmap bitmap, MediaUtils.d dVar) {
        Bitmap b = kd7.b(bitmap, dVar.a, dVar.b, false, false);
        if (b == null) {
            b = Bitmap.createBitmap(dVar.a, dVar.b, Bitmap.Config.ARGB_8888);
        }
        yv5 yv5Var = new yv5(b);
        nov.a.f(yv5Var, 1.05f, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT);
        return yv5Var;
    }

    @Override // xsna.mny
    public final Triple<List<uq10>, MediaUtils.d, Float> a(tam0 tam0Var, boolean z, MediaUtils.d dVar, boolean z2, boolean z3) {
        MediaUtils.d dVar2;
        Ref$BooleanRef ref$BooleanRef;
        gzs<fn2> gzsVar;
        boolean z4;
        float f;
        wlo wloVar;
        nov novVar;
        boolean z5;
        boolean z6;
        lbm0 lbm0Var;
        wlo wloVar2 = tam0Var.i;
        zcl0 zcl0Var = tam0Var.h;
        if (this.d.invoke().booleanValue()) {
            return null;
        }
        MediaUtils.d i = i(dVar, tam0Var.e());
        if (zcl0Var.p() || zcl0Var.o() || zcl0Var.r()) {
            dVar2 = i;
        } else {
            com.vk.stories.b.a.getClass();
            dVar2 = this.b.invoke(Float.valueOf(0.5625f), Boolean.valueOf(tam0Var.e()));
        }
        ArrayList arrayList = new ArrayList();
        ArrayList arrayList2 = new ArrayList(zcl0Var.a);
        ArrayList arrayList3 = new ArrayList();
        Ref$BooleanRef ref$BooleanRef2 = new Ref$BooleanRef();
        yv5 h = h(f(tam0Var, dVar2.b(), null), dVar2);
        gzs<fn2> gzsVar2 = this.c;
        if (z) {
            gzsVar = gzsVar2;
            z4 = false;
            ref$BooleanRef = ref$BooleanRef2;
            arrayList.add(new lbm0(new zcl0((List<nov>) Collections.singletonList(h)), wlo.i, gzsVar2.invoke(), dVar2, "backVideoLayer", true));
        } else {
            ref$BooleanRef = ref$BooleanRef2;
            gzsVar = gzsVar2;
            z4 = false;
            arrayList2.add(0, h);
        }
        Iterator it = arrayList2.iterator();
        boolean z7 = z4;
        while (it.hasNext()) {
            nov novVar2 = (nov) it.next();
            if ((!(novVar2 instanceof yv5) && !(novVar2 instanceof qx5)) || !z2) {
                arrayList3.add(novVar2);
                if (novVar2.z0()) {
                    z7 = true;
                }
                boolean z8 = novVar2 instanceof htp0;
                if (z8) {
                    ((htp0) novVar2).setDrawTopLayer(z4);
                }
                if ((novVar2 instanceof grt0) || (novVar2 instanceof r4g0)) {
                    if (novVar2.getStickerLayerType() < 4 || ref$BooleanRef.element) {
                        wloVar = wlo.i;
                    } else {
                        ref$BooleanRef.element = true;
                        wloVar = wloVar2;
                    }
                    zcl0 zcl0Var2 = new zcl0(arrayList3);
                    if (wloVar == null) {
                        wloVar = wlo.i;
                    }
                    boolean z9 = arrayList.size() == 0 ? true : z4;
                    if (ref$BooleanRef.element) {
                        novVar = novVar2;
                        z5 = z8;
                        z6 = true;
                        lbm0Var = new lbm0(zcl0Var2, tam0Var.j, gzsVar.invoke(), dVar2, "frontVideoLayer", z9);
                    } else {
                        novVar = novVar2;
                        z5 = z8;
                        z6 = true;
                        lbm0Var = new lbm0(zcl0Var2, wloVar, gzsVar.invoke(), dVar2, "frontVideoLayer", z9);
                    }
                    arrayList.add(lbm0Var);
                    arrayList3.clear();
                } else {
                    novVar = novVar2;
                    z6 = true;
                    z5 = z8;
                }
                if (z5) {
                    htp0 htp0Var = (htp0) ((htp0) novVar).C0();
                    htp0Var.setDrawTopLayer(z6);
                    arrayList3.add(htp0Var);
                }
                z4 = false;
            }
        }
        zcl0 zcl0Var3 = arrayList3.isEmpty() ? null : new zcl0(arrayList3);
        if (ref$BooleanRef.element) {
            wloVar2 = null;
        }
        if (zcl0Var3 != null || wloVar2 != null) {
            if (zcl0Var3 == null) {
                zcl0Var3 = zcl0.e;
            }
            zcl0 zcl0Var4 = zcl0Var3;
            arrayList.add(wloVar2 != null ? new lbm0(zcl0Var4, tam0Var.j, gzsVar.invoke(), dVar2, "frontVideoLayer", false) : new lbm0(zcl0Var4, wloVar2 == null ? wlo.i : wloVar2, gzsVar.invoke(), dVar2, "frontVideoLayer", false));
            ref$BooleanRef.element = true;
        }
        if (z3) {
            arrayList.add(new vnm0(i));
        }
        if (z7) {
            f = dVar2.b();
        } else {
            com.vk.stories.b.a.getClass();
            f = 0.5625f;
        }
        return new Triple<>(arrayList, dVar2, Float.valueOf(f));
    }

    @Override // xsna.mny
    public final yo9 b(tam0 tam0Var, MediaUtils.d dVar) {
        if (this.d.invoke().booleanValue()) {
            return null;
        }
        if (dVar == null || dVar.d()) {
            com.vk.stories.b.a.getClass();
            dVar = this.b.invoke(Float.valueOf(0.5625f), Boolean.valueOf(tam0Var.e()));
        }
        lbm0 lbm0Var = new lbm0(tam0Var.h, tam0Var.j, this.c.invoke(), dVar, "overlayLayer", false);
        return !lbm0Var.k ? lbm0Var.j : lbm0Var.a(-1, -1);
    }

    @Override // xsna.mny
    public final int c() {
        return this.f;
    }

    @Override // xsna.mny
    public final Bitmap e(tam0 tam0Var, Bitmap bitmap, StringBuilder sb) {
        com.vk.stories.b bVar = com.vk.stories.b.a;
        boolean e = tam0Var != null ? tam0Var.e() : false;
        bVar.getClass();
        MediaUtils.d e2 = com.vk.stories.b.e(e);
        if (sb != null) {
            sb.append("targetSize: " + e2);
            sb.append('\n');
        }
        int i = e2.a;
        int i2 = e2.b;
        mny.a.getClass();
        int i3 = mny.a.b;
        Bitmap b = kd7.b(bitmap, i, i2, false, false);
        NativeBlurFilter.iterativeBoxBlur(b, 3, i3);
        return b;
    }

    /* JADX WARN: Removed duplicated region for block: B:20:0x0045  */
    /* JADX WARN: Removed duplicated region for block: B:25:0x0067 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:26:0x0068  */
    /* JADX WARN: Removed duplicated region for block: B:42:0x0055  */
    @Override // xsna.mny
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Bitmap f(tam0 tam0Var, float f, StringBuilder sb) {
        Bitmap bitmap;
        zcl0 zcl0Var = tam0Var.h;
        if (tam0Var.t == null || zcl0Var.p()) {
            if (sb != null) {
                sb.append("GBBFR");
                sb.append('\n');
            }
            if (tam0Var.f() || zcl0Var.p()) {
                yaa0 yaa0Var = tam0Var.a;
                if (yaa0Var != null) {
                    bitmap = yaa0Var.b;
                    if (bitmap != null || bitmap.getWidth() == 0 || bitmap.getHeight() == 0) {
                        if (sb != null) {
                            sb.append("Error! Bitmap preview = null or broken");
                            sb.append('\n');
                        }
                        L.l("LayersProvider", "Error! Bitmap preview = null or broken");
                        bitmap = null;
                    }
                    if (bitmap == null) {
                        return null;
                    }
                    if (sb != null) {
                        sb.append("for blur: " + bitmap.getWidth() + " x " + bitmap.getHeight());
                        sb.append('\n');
                    }
                    Bitmap e = e(tam0Var, bitmap, sb);
                    if (sb != null) {
                        StringBuilder sb2 = new StringBuilder("blurred: ");
                        sb2.append(e != null ? Integer.valueOf(e.getWidth()) : null);
                        sb2.append(" x ");
                        sb2.append(e != null ? Integer.valueOf(e.getHeight()) : null);
                        sb.append(sb2.toString());
                        sb.append('\n');
                    }
                    tam0Var.t = e;
                    tam0Var.u = e;
                }
                bitmap = null;
                if (bitmap != null) {
                }
                if (sb != null) {
                }
                L.l("LayersProvider", "Error! Bitmap preview = null or broken");
                bitmap = null;
                if (bitmap == null) {
                }
            } else {
                mat0 d = tam0Var.d();
                if (d == null || (bitmap = d.h) == null) {
                    izs<tam0, Bitmap> izsVar = this.e;
                    if (izsVar != null) {
                        bitmap = izsVar.invoke(tam0Var);
                    }
                    bitmap = null;
                }
                if (bitmap != null) {
                }
                if (sb != null) {
                }
                L.l("LayersProvider", "Error! Bitmap preview = null or broken");
                bitmap = null;
                if (bitmap == null) {
                }
            }
        }
        return tam0Var.t;
    }

    @Override // xsna.mny
    public final Triple<List<uq10>, MediaUtils.d, Float> g(tam0 tam0Var, MediaUtils.d dVar, boolean z) {
        ArrayList arrayList = new ArrayList();
        if (dVar.d()) {
            com.vk.stories.b.a.getClass();
            dVar = this.b.invoke(Float.valueOf(0.5625f), Boolean.valueOf(tam0Var.e()));
        }
        MediaUtils.d dVar2 = dVar;
        zcl0 zcl0Var = new zcl0(h(f(tam0Var, dVar2.b(), null), dVar2));
        wlo wloVar = wlo.i;
        gzs<fn2> gzsVar = this.c;
        arrayList.add(new lbm0(zcl0Var, wloVar, gzsVar.invoke(), dVar2, "backPhotoLayer", true));
        if (this.d.invoke().booleanValue()) {
            return new Triple<>(arrayList, dVar2, Float.valueOf(dVar2.b()));
        }
        arrayList.add(new lbm0(tam0Var.h, tam0Var.j, gzsVar.invoke(), dVar2, "frontPhotoLayer", false));
        if (z) {
            arrayList.add(new vnm0(dVar2));
        }
        return new Triple<>(arrayList, dVar2, Float.valueOf(dVar2.b()));
    }

    public MediaUtils.d i(MediaUtils.d dVar, boolean z) {
        if (dVar.a <= (z ? 1080 : PublisherConfiguration.DEFAULT_MAX_RES)) {
            return dVar;
        }
        com.vk.stories.b.a.getClass();
        return com.vk.stories.b.e(z);
    }
}
