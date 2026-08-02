package xsna;

import android.graphics.Bitmap;
import android.view.View;
import android.webkit.WebView;
import android.widget.EditText;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.recyclerview.widget.RecyclerView;
import com.ironsource.C4405kb;
import com.vk.media.recorder.RecorderBase;
import com.vk.newsfeed.common.views.gallery.HorizontalGalleryView;
import one.video.exo.diskcache.Action;
import ru.ok.gl.objects.FrameBuffer;
import ru.ok.gl.objects.SimpleGLProgram;
import xsna.eeu0;
import xsna.mo9;
import xsna.z0d0;

/* compiled from: R8$$SyntheticClass */
/* loaded from: classes8.dex */
public final /* synthetic */ class ro2 implements Runnable {
    public final /* synthetic */ int b;
    public final /* synthetic */ Object c;
    public final /* synthetic */ Object d;

    public /* synthetic */ ro2(int i, Object obj, Object obj2) {
        this.b = i;
        this.c = obj;
        this.d = obj2;
    }

    @Override // java.lang.Runnable
    public final void run() {
        int ordinal;
        c6o0 c6o0Var;
        switch (this.b) {
            case 0:
                View view = (View) this.c;
                Runnable runnable = (Runnable) this.d;
                dp2.a(view, view.getAlpha(), view.getTranslationY());
                if (runnable != null) {
                    runnable.run();
                    return;
                }
                return;
            case 1:
                androidx.recyclerview.widget.o0 o0Var = (androidx.recyclerview.widget.o0) this.c;
                RecyclerView recyclerView = (RecyclerView) this.d;
                int i = HorizontalGalleryView.E;
                o0Var.attachToRecyclerView(recyclerView);
                return;
            case 2:
                cbn cbnVar = (cbn) this.c;
                z0d0.a aVar = ((z0d0) this.d).c;
                try {
                    try {
                        if (!cbnVar.h) {
                            cbnVar.d();
                            cbnVar.run();
                            cbnVar.get();
                            cbnVar.d();
                        }
                        ordinal = Action.ON_TASK_FINISHED.ordinal();
                        c6o0Var = new c6o0(cbnVar.d(), cbnVar.getClass());
                    } catch (Exception e) {
                        e.getMessage();
                        ordinal = Action.ON_TASK_FINISHED.ordinal();
                        c6o0Var = new c6o0(cbnVar.d(), cbnVar.getClass());
                    }
                    aVar.obtainMessage(ordinal, c6o0Var).sendToTarget();
                    return;
                } catch (Throwable th) {
                    aVar.obtainMessage(Action.ON_TASK_FINISHED.ordinal(), new c6o0(cbnVar.d(), cbnVar.getClass())).sendToTarget();
                    throw th;
                }
            case 3:
                RecorderBase recorderBase = (RecorderBase) this.c;
                nhf0 nhf0Var = (nhf0) this.d;
                mo9.b bVar = recorderBase.j;
                if (bVar != null) {
                    bVar.d(nhf0Var);
                    return;
                }
                return;
            case 4:
                ((SimpleGLProgram) this.c).lambda$copyTexture$0((FrameBuffer) this.d);
                return;
            case 5:
                eeu0.a.C2801a c2801a = (eeu0.a.C2801a) this.c;
                n3x n3xVar = (n3x) this.d;
                wzs<? super EditText, ? super TextView, s3q0> wzsVar = c2801a.s;
                if (wzsVar != null) {
                    wzsVar.invoke(n3xVar.getEtInput(), n3xVar.getButtonOk());
                    return;
                }
                return;
            case 6:
                com.mbridge.msdk.config.dynamic.utils.image.b.c((Bitmap) this.c, (ImageView) this.d);
                return;
            case 7:
                com.mbridge.msdk.config.component.common.util.c.a((String) this.c, (String) this.d);
                return;
            case 8:
                C4405kb.a((C4405kb) this.c, (String) this.d);
                return;
            default:
                com.vungle.ads.internal.ui.z.a((com.vungle.ads.internal.ui.z) this.c, (WebView) this.d);
                return;
        }
    }
}
