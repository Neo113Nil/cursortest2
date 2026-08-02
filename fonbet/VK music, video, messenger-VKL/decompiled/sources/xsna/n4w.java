package xsna;

import android.view.View;
import xsna.as30;

/* compiled from: R8$$SyntheticClass */
/* loaded from: classes2.dex */
public final /* synthetic */ class n4w implements View.OnLongClickListener {
    public final /* synthetic */ int b;
    public final /* synthetic */ Object c;

    public /* synthetic */ n4w(Object obj, int i) {
        this.b = i;
        this.c = obj;
    }

    @Override // android.view.View.OnLongClickListener
    public final boolean onLongClick(View view) {
        switch (this.b) {
            case 0:
                as30.a aVar = ((com.vk.im.video.e) this.c).h;
                if (aVar == null) {
                    aVar = null;
                }
                aVar.c();
                return true;
            default:
                return ((Boolean) ((izs) this.c).invoke(view)).booleanValue();
        }
    }
}
