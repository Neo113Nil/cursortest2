package xsna;

import androidx.activity.ComponentActivity;
import androidx.fragment.app.SpecialEffectsController;

/* compiled from: R8$$SyntheticClass */
/* loaded from: classes.dex */
public final /* synthetic */ class m8i implements Runnable {
    public final /* synthetic */ int b;
    public final /* synthetic */ Object c;
    public final /* synthetic */ Object d;

    public /* synthetic */ m8i(int i, Object obj, Object obj2) {
        this.b = i;
        this.c = obj;
        this.d = obj2;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.b) {
            case 0:
                ((ComponentActivity) this.c).addObserverForBackInvoker((p180) this.d);
                break;
            default:
                SpecialEffectsController specialEffectsController = (SpecialEffectsController) this.c;
                SpecialEffectsController.b bVar = (SpecialEffectsController.b) this.d;
                specialEffectsController.b.remove(bVar);
                specialEffectsController.c.remove(bVar);
                break;
        }
    }
}
