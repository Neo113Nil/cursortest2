package xsna;

import android.view.View;
import com.vk.clips.design.view.editor.TransformOverlayView;
import java.util.Collections;
import xsna.wn2;

/* compiled from: R8$$SyntheticClass */
/* loaded from: classes2.dex */
public final /* synthetic */ class mg7 implements View.OnLayoutChangeListener {
    public final /* synthetic */ int b;
    public final /* synthetic */ Object c;

    public /* synthetic */ mg7(Object obj, int i) {
        this.b = i;
        this.c = obj;
    }

    @Override // android.view.View.OnLayoutChangeListener
    public final void onLayoutChange(View view, int i, int i2, int i3, int i4, int i5, int i6, int i7, int i8) {
        switch (this.b) {
            case 0:
                ((ng7) this.c).c();
                break;
            default:
                s0e s0eVar = (s0e) this.c;
                if (i2 != i6 || i4 != i8) {
                    s0eVar.o();
                    wn2.a.a(s0eVar.c, s0eVar.i(), (View) s0eVar.n.getValue(), new wn2.b(true, true), Collections.singletonList((TransformOverlayView) s0eVar.o.getValue()), 16);
                    break;
                }
        }
    }
}
