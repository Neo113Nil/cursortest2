package xsna;

import one.video.controls.view.seekbar.ProgressSeekBarView;

/* compiled from: R8$$SyntheticClass */
/* loaded from: classes3.dex */
public final /* synthetic */ class ix70 implements o7j {
    public final /* synthetic */ int b;
    public final /* synthetic */ Object c;

    public /* synthetic */ ix70(Object obj, int i) {
        this.b = i;
        this.c = obj;
    }

    @Override // xsna.o7j
    public final void accept(Object obj) {
        switch (this.b) {
            case 0:
                com.vk.media.ok.b bVar = (com.vk.media.ok.b) this.c;
                boolean booleanValue = ((Boolean) obj).booleanValue();
                if (bVar.u) {
                    bVar.C = booleanValue;
                    bVar.z();
                }
                bVar.G.setHeadsets(booleanValue);
                break;
            default:
                ProgressSeekBarView progressSeekBarView = (ProgressSeekBarView) this.c;
                g3e0 g3e0Var = (g3e0) obj;
                int i = ProgressSeekBarView.e;
                if (!g3e0Var.b) {
                    progressSeekBarView.setVisibility(!g3e0Var.a ? 4 : 0);
                    break;
                }
                break;
        }
    }
}
