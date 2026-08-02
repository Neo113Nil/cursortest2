package xsna;

import androidx.fragment.app.SpecialEffectsController;
import com.android.installreferrer.api.ReferrerDetails;

/* compiled from: R8$$SyntheticClass */
/* loaded from: classes.dex */
public final /* synthetic */ class qml implements Runnable {
    public final /* synthetic */ int b;
    public final /* synthetic */ Object c;
    public final /* synthetic */ Object d;

    public /* synthetic */ qml(int i, Object obj, Object obj2) {
        this.b = i;
        this.c = obj;
        this.d = obj2;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.b) {
            case 0:
                ((androidx.fragment.app.b) this.c).a((SpecialEffectsController.Operation) this.d);
                break;
            default:
                ((com.my.tracker.obfuscated.p0) this.c).b((ReferrerDetails) this.d);
                break;
        }
    }
}
