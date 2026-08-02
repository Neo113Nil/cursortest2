package xsna;

import android.view.View;
import xsna.as30;

/* compiled from: R8$$SyntheticClass */
/* loaded from: classes2.dex */
public final /* synthetic */ class q4w implements View.OnLongClickListener {
    public final /* synthetic */ int b;
    public final /* synthetic */ Object c;

    public /* synthetic */ q4w(Object obj, int i) {
        this.b = i;
        this.c = obj;
    }

    @Override // android.view.View.OnLongClickListener
    public final boolean onLongClick(View view) {
        switch (this.b) {
            case 0:
                as30.a aVar = ((com.vk.im.video.g) this.c).s;
                if (aVar == null) {
                    aVar = null;
                }
                aVar.c();
                break;
            default:
                Object parent = ((li70) this.c).getParent();
                View view2 = parent instanceof View ? (View) parent : null;
                if (view2 == null || !view2.performLongClick()) {
                }
                break;
        }
        return true;
    }
}
