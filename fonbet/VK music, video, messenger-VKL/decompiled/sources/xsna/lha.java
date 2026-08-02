package xsna;

import android.view.View;
import com.vk.video.ui.discovery.minimizable.q;
import xsna.l4m;

/* compiled from: R8$$SyntheticClass */
/* loaded from: classes7.dex */
public final /* synthetic */ class lha implements View.OnClickListener {
    public final /* synthetic */ int b;
    public final /* synthetic */ Object c;
    public final /* synthetic */ Object d;

    public /* synthetic */ lha(int i, Object obj, Object obj2) {
        this.b = i;
        this.c = obj;
        this.d = obj2;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        switch (this.b) {
            case 0:
                ((izs) this.c).invoke(((q.a) this.d).a);
                break;
            default:
                l4m l4mVar = (l4m) this.c;
                l4mVar.h.f(((l4m.c) this.d).itemView.getContext(), l4mVar.g, "profile_module");
                break;
        }
    }
}
