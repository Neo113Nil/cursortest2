package xsna;

import android.content.Context;
import android.graphics.Point;
import android.media.CamcorderProfile;
import com.vk.media.MediaUtils;
import com.vk.media.recorder.RecorderBase;
import com.vk.media.render.RenderBase;
import java.util.Iterator;
import java.util.TreeSet;
import java.util.concurrent.atomic.AtomicBoolean;
import kotlin.jvm.internal.FunctionReferenceImpl;
import ru.ok.gl.effects.media.controller.audio.ExtraAudioSupplier;
import xsna.doe0;
import xsna.jhu0;
import xsna.kk9;
import xsna.mo9;

/* compiled from: QualityCameraPreview.kt */
/* loaded from: classes13.dex */
public class xoe0 extends kk9 {
    public static final a K = new a();
    public static final TreeSet<Integer> L = oa01.b(0, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12, 13, 1);
    public final FunctionReferenceImpl G;
    public final FunctionReferenceImpl H;
    public final int I;
    public final AtomicBoolean J;

    /* compiled from: QualityCameraPreview.kt */
    public static final class a implements kk9.a {
        @Override // xsna.kk9.a
        public final boolean a() {
            return true;
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public xoe0(Context context, gzs gzsVar, gzs gzsVar2, int i, int i2, boolean z) {
        super(context, K, true);
        Object obj;
        Object obj2;
        this.G = (FunctionReferenceImpl) gzsVar;
        this.H = (FunctionReferenceImpl) gzsVar2;
        this.I = 4;
        this.J = new AtomicBoolean(false);
        aj9 aj9Var = ij9.a;
        kk9.e eVar = this.B;
        Context context2 = e43.a;
        Context context3 = context2 != null ? context2 : null;
        Point j = iah0.j(context2 == null ? null : context2);
        doe0.a aVar = doe0.a.a;
        asu0.a.getClass();
        mo9 mo9Var = new mo9(aj9Var, context3, eVar, j, aVar, asu0.h(), new eoz(context), z, false);
        this.l = new tw3(this, 21);
        mo9.b bVar = new mo9.b(mo9Var.g, new y6i(this), mo9Var.c, RecorderBase.RecordingType.ORIGINAL, mo9Var.i, false);
        mo9Var.r = bVar;
        bVar.f = ni9.b;
        if (!bVar.n) {
            bVar.n = true;
            com.vk.media.recorder.f fVar = bVar.a;
            if (fVar != null) {
                fVar.b(true);
            }
        }
        int i3 = i2 <= 0 ? Integer.MAX_VALUE : i2;
        bVar.g = i3;
        com.vk.media.recorder.f fVar2 = bVar.a;
        if (fVar2 != null) {
            fVar2.p(i3);
        }
        float f = i;
        bVar.l = f;
        com.vk.media.recorder.f fVar3 = bVar.a;
        if (fVar3 != null) {
            fVar3.o(f);
        }
        this.s = bVar;
        ExtraAudioSupplier extraAudioSupplier = bVar.h;
        rno rnoVar = new rno();
        mk9 mk9Var = mo9Var.g;
        mk9Var.getClass();
        mk9Var.G = null;
        mk9Var.I = extraAudioSupplier;
        mk9Var.J = null;
        mk9Var.Z = null;
        mk9Var.H = rnoVar;
        mk9Var.K = false;
        mo9Var.f = true;
        mo9Var.g.i = true;
        mo9Var.e = new yoe0();
        Integer num = this.n;
        if (num == null) {
            throw new IllegalArgumentException("CameraId is null!");
        }
        int intValue = num.intValue();
        TreeSet<Integer> qualitySet = getQualitySet();
        Iterator it = j5g.y0(p4g.q(qualitySet.headSet(4, true))).iterator();
        while (true) {
            if (!it.hasNext()) {
                obj = null;
                break;
            } else {
                obj = it.next();
                if (CamcorderProfile.hasProfile(intValue, ((Integer) obj).intValue())) {
                    break;
                }
            }
        }
        Integer num2 = (Integer) obj;
        if (num2 == null) {
            Iterator<T> it2 = qualitySet.tailSet(4, false).iterator();
            while (true) {
                if (!it2.hasNext()) {
                    obj2 = null;
                    break;
                } else {
                    obj2 = it2.next();
                    if (CamcorderProfile.hasProfile(intValue, ((Integer) obj2).intValue())) {
                        break;
                    }
                }
            }
            num2 = (Integer) obj2;
        }
        if (num2 != null) {
            CamcorderProfile camcorderProfile = CamcorderProfile.get(intValue, num2.intValue());
            mo9Var.a(new MediaUtils.e(camcorderProfile.videoFrameWidth, camcorderProfile.videoFrameHeight, camcorderProfile.videoBitRate, camcorderProfile.videoFrameRate, camcorderProfile.audioBitRate, camcorderProfile.audioSampleRate));
        }
        setCameraPreviewSurfaceHolder(mo9Var);
        zoe0 zoe0Var = new zoe0(this);
        RenderBase.d dVar = ((mo9) getCameraPreview()).g.l;
        if (dVar != null) {
            dVar.j = zoe0Var;
        }
    }

    public jhu0.a getAutoFocusCallback() {
        return b.b;
    }

    public final boolean getHasMoreThenOneCamera() {
        aj9 aj9Var = ij9.a;
        return ij9.a.f();
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [kotlin.jvm.internal.FunctionReferenceImpl, xsna.gzs<xsna.s3q0>] */
    public final gzs<s3q0> getOnCameraFirstFrameDrawnCallback() {
        return this.G;
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [kotlin.jvm.internal.FunctionReferenceImpl, xsna.gzs<xsna.s3q0>] */
    public final gzs<s3q0> getOnCameraReadyCallback() {
        return this.H;
    }

    public final int getPreferQuality() {
        return this.I;
    }

    public TreeSet<Integer> getQualitySet() {
        return L;
    }

    @Override // xsna.kk9
    public final void q() {
        p();
        jhu0 jhu0Var = this.m;
        sj9 e = jhu0Var != null ? ij9.a.e() : null;
        if (jhu0Var == null || e == null) {
            return;
        }
        ((tj9) e).o("continuous-video");
        jhu0Var.e(e);
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [kotlin.jvm.internal.FunctionReferenceImpl, xsna.gzs] */
    public void z() {
        ?? r0 = this.H;
        if (r0 != 0) {
            r0.invoke();
        }
        jhu0 jhu0Var = this.m;
        if (jhu0Var != null) {
            jhu0Var.i(getAutoFocusCallback());
        }
    }

    /* compiled from: QualityCameraPreview.kt */
    public static final class b implements jhu0.a {
        public static final b b = new b();

        @Override // xsna.jhu0.a
        public final void a(boolean z) {
        }
    }
}
