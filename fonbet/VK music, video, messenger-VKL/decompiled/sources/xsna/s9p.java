package xsna;

import com.vk.story.archive.impl.presentation.StoryArchiveFragment;
import ru.ok.gleffects.impl.EffectNativeSink;

/* compiled from: R8$$SyntheticClass */
/* loaded from: classes9.dex */
public final /* synthetic */ class s9p implements Runnable {
    public final /* synthetic */ int b;
    public final /* synthetic */ boolean c;
    public final /* synthetic */ Object d;

    public /* synthetic */ s9p(Object obj, boolean z, int i) {
        this.b = i;
        this.d = obj;
        this.c = z;
    }

    @Override // java.lang.Runnable
    public final void run() {
        int i = this.b;
        boolean z = this.c;
        Object obj = this.d;
        switch (i) {
            case 0:
                ((EffectNativeSink) obj).lambda$registerForFrugalReceive$9(z);
                break;
            case 1:
                vky vkyVar = (vky) obj;
                vkyVar.e();
                if (z) {
                    vkyVar.h.quitSafely();
                    break;
                }
                break;
            default:
                int i2 = StoryArchiveFragment.h0;
                ((StoryArchiveFragment) obj).jo(z);
                break;
        }
    }
}
