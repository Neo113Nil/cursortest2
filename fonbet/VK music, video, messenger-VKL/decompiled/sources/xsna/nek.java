package xsna;

import android.graphics.Bitmap;
import android.opengl.GLES20;
import android.opengl.GLES31;
import android.webkit.WebView;
import android.widget.ImageView;
import com.ironsource.C4405kb;
import com.unity3d.mediation.LevelPlayAdInfo;
import com.vk.core.fragments.FragmentImpl;
import com.vk.knet.cornet.CronetHttpLogger$DebugType;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import ru.mail.libverify.controls.VerificationController;
import ru.mail.libverify.controls.VerificationListener;
import ru.ok.gl.objects.GLComputerProgram;
import ru.ok.gl.objects.GLSSBO;
import ru.ok.gl.util.ThreadHelper;
import xsna.iv00;
import xsna.j1s;
import xsna.zjn0;

/* compiled from: R8$$SyntheticClass */
/* loaded from: classes2.dex */
public final /* synthetic */ class nek implements Runnable {
    public final /* synthetic */ int b;
    public final /* synthetic */ Object c;
    public final /* synthetic */ Object d;

    public /* synthetic */ nek(int i, Object obj, Object obj2) {
        this.b = i;
        this.c = obj;
        this.d = obj2;
    }

    @Override // java.lang.Runnable
    public final void run() {
        int i = 1;
        switch (this.b) {
            case 0:
                oek oekVar = (oek) this.c;
                oekVar.c.add((jek) this.d);
                CronetHttpLogger$DebugType cronetHttpLogger$DebugType = CronetHttpLogger$DebugType.EXEC_POOL;
                Object[] objArr = {lhg.a(oekVar.c.size(), "recycle ")};
                qek qekVar = vek.a;
                if (qekVar != null) {
                    qekVar.a(cronetHttpLogger$DebugType, Arrays.copyOf(objArr, 1));
                    break;
                }
                break;
            case 1:
                j1s j1sVar = (j1s) this.c;
                FragmentImpl fragmentImpl = ((j1s.c) this.d).b;
                j1s.b bVar = j1s.E;
                j1sVar.p.replaceAll(new f1q0(fragmentImpl));
                break;
            case 2:
                iv00 iv00Var = (iv00) this.c;
                List list = (List) this.d;
                iv00.b bVar2 = iv00Var.j1;
                if (bVar2 != null) {
                    ArrayList arrayList = new ArrayList();
                    for (Object obj : list) {
                        if (((vv00) obj).e == 0) {
                            arrayList.add(obj);
                        }
                    }
                    bVar2.setItems(arrayList);
                }
                iv00Var.n1 = true;
                break;
            case 3:
                ((v5d0) ((zjn0.h) this.c)).a((bo5) this.d);
                break;
            case 4:
                qao0 qao0Var = (qao0) this.c;
                rfx rfxVar = (rfx) this.d;
                GLComputerProgram gLComputerProgram = qao0Var.a;
                if (gLComputerProgram != null) {
                    gLComputerProgram.useProgram();
                }
                GLSSBO glssbo = qao0Var.b;
                if (glssbo != null) {
                    glssbo.bind(2);
                }
                GLSSBO glssbo2 = qao0Var.c;
                if (glssbo2 != null) {
                    glssbo2.bind(1);
                }
                GLES31.glDispatchCompute(128, 128, 1);
                s3q0 s3q0Var = s3q0.a;
                GLES20.glFinish();
                long currentTimeMillis = System.currentTimeMillis();
                for (int i2 = 1; i2 < 11; i2++) {
                    GLComputerProgram gLComputerProgram2 = qao0Var.a;
                    if (gLComputerProgram2 != null) {
                        gLComputerProgram2.setIntUniform("index", i2);
                    }
                    GLES31.glDispatchCompute(128, 128, 1);
                    s3q0 s3q0Var2 = s3q0.a;
                }
                GLES20.glFinish();
                GLSSBO glssbo3 = qao0Var.b;
                if (glssbo3 != null) {
                    glssbo3.unbind();
                }
                GLSSBO glssbo4 = qao0Var.c;
                if (glssbo4 != null) {
                    glssbo4.unbind();
                }
                GLComputerProgram gLComputerProgram3 = qao0Var.a;
                if (gLComputerProgram3 != null) {
                    gLComputerProgram3.resetProgram();
                }
                ThreadHelper.queueOnMain(new ohf0(rfxVar, System.currentTimeMillis() - currentTimeMillis, i));
                qao0Var.b();
                break;
            case 5:
                ((jlq0) this.c).a(((spp) this.d).a);
                break;
            case 6:
                ((VerificationController) this.c).lambda$setListener$9((VerificationListener) this.d);
                break;
            case 7:
                com.mbridge.msdk.config.dynamic.utils.image.b.d((Bitmap) this.c, (ImageView) this.d);
                break;
            case 8:
                ((yads.dd0) this.c).b((yads.nx0) this.d);
                break;
            case 9:
                C4405kb.b((C4405kb) this.c, (LevelPlayAdInfo) this.d);
                break;
            default:
                com.vungle.ads.internal.ui.z.b((com.vungle.ads.internal.ui.z) this.c, (WebView) this.d);
                break;
        }
    }
}
