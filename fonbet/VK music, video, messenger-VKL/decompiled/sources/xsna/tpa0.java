package xsna;

import com.vk.stories.design.view.editor.PipetteColorPicker;

/* compiled from: R8$$SyntheticClass */
/* loaded from: classes6.dex */
public final /* synthetic */ class tpa0 implements Runnable {
    public final /* synthetic */ int b;
    public final /* synthetic */ int c;
    public final /* synthetic */ Object d;

    public /* synthetic */ tpa0(Object obj, int i, int i2) {
        this.b = i2;
        this.d = obj;
        this.c = i;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.b) {
            case 0:
                PipetteColorPicker.b((PipetteColorPicker) this.d, this.c);
                break;
            default:
                ((yads.rq2) this.d).a(this.c);
                break;
        }
    }
}
