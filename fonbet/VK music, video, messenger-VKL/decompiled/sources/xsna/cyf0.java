package xsna;

import com.vk.media.MediaUtils;
import com.vk.media.render.RenderBase;
import ru.ok.android.externcalls.sdk.ui.TextureViewRenderer;

/* compiled from: R8$$SyntheticClass */
/* loaded from: classes3.dex */
public final /* synthetic */ class cyf0 implements Runnable {
    public final /* synthetic */ int b;
    public final /* synthetic */ int c;
    public final /* synthetic */ int d;
    public final /* synthetic */ Object e;

    public /* synthetic */ cyf0(int i, int i2, int i3, Object obj) {
        this.b = i3;
        this.e = obj;
        this.c = i;
        this.d = i2;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.b) {
            case 0:
                RenderBase renderBase = (RenderBase) this.e;
                MediaUtils.d dVar = renderBase.e;
                int i = dVar.a;
                int i2 = this.c;
                int i3 = this.d;
                if (i != i2 || dVar.b != i3) {
                    dVar.a = i2;
                    dVar.b = i3;
                    renderBase.c();
                    break;
                }
                break;
            default:
                TextureViewRenderer.updateFrameDimensionsAndReportEvents$lambda$0((TextureViewRenderer) this.e, this.c, this.d);
                break;
        }
    }
}
