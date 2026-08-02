package xsna;

import android.view.MotionEvent;
import android.view.View;
import com.unity3d.ads.adplayer.AndroidWebViewContainer;

/* compiled from: R8$$SyntheticClass */
/* loaded from: classes14.dex */
public final /* synthetic */ class qe2 implements View.OnTouchListener {
    public final /* synthetic */ int b;
    public final /* synthetic */ Object c;

    public /* synthetic */ qe2(Object obj, int i) {
        this.b = i;
        this.c = obj;
    }

    @Override // android.view.View.OnTouchListener
    public final boolean onTouch(View view, MotionEvent motionEvent) {
        boolean _init_$lambda$1;
        switch (this.b) {
            case 0:
                _init_$lambda$1 = AndroidWebViewContainer._init_$lambda$1((AndroidWebViewContainer) this.c, view, motionEvent);
                return _init_$lambda$1;
            default:
                return ((nah0) this.c).o.b(motionEvent);
        }
    }
}
