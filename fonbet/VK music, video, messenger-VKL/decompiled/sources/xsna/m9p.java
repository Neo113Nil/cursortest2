package xsna;

import ru.ok.gleffects.EffectHolder;
import ru.ok.media.utils.PeriodicTasksManager;
import ru.ok.tensorflow.customview.FpsView;

/* compiled from: R8$$SyntheticClass */
/* loaded from: classes9.dex */
public final /* synthetic */ class m9p implements Runnable {
    public final /* synthetic */ int b;
    public final /* synthetic */ boolean c;
    public final /* synthetic */ Object d;

    public /* synthetic */ m9p(Object obj, boolean z, int i) {
        this.b = i;
        this.d = obj;
        this.c = z;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.b) {
            case 0:
                ((EffectHolder) this.d).lambda$selectBeautyMode$27(this.c);
                break;
            case 1:
                FpsView fpsView = ((com.vk.media.ok.b) this.d).I0;
                if (fpsView != null) {
                    fpsView.updateQuality(this.c);
                    break;
                }
                break;
            default:
                ((PeriodicTasksManager) this.d).lambda$setPaused$0(this.c);
                break;
        }
    }
}
