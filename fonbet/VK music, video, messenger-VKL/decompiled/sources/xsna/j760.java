package xsna;

import android.app.Activity;
import android.view.OrientationEventListener;

/* compiled from: NewEditorScreenFactoryImpl.kt */
/* loaded from: classes15.dex */
public final class j760 extends OrientationEventListener {
    public final /* synthetic */ Object a;
    public final /* synthetic */ s4p b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public j760(Activity activity, Object obj, s4p s4pVar) {
        super(activity);
        this.a = obj;
        this.b = s4pVar;
    }

    @Override // android.view.OrientationEventListener
    public final void onOrientationChanged(int i) {
        disable();
        i0q0.e(new kw6(7, this.a, this.b));
    }
}
