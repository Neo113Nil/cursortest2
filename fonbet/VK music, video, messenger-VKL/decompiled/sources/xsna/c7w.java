package xsna;

import com.vk.dto.photo.Photo;
import com.vk.photos.root.photoflow.presentation.d;
import com.vkontakte.android.R;
import xsna.b9a0;
import xsna.v6w;

/* compiled from: R8$$SyntheticClass */
/* loaded from: classes2.dex */
public final /* synthetic */ class c7w implements io.reactivex.rxjava3.functions.a {
    public final /* synthetic */ int b;
    public final /* synthetic */ Object c;
    public final /* synthetic */ Object d;

    public /* synthetic */ c7w(int i, Object obj, Object obj2) {
        this.b = i;
        this.c = obj;
        this.d = obj2;
    }

    @Override // io.reactivex.rxjava3.functions.a
    public final void run() {
        switch (this.b) {
            case 0:
                d7w d7wVar = (d7w) this.c;
                v6w v6wVar = (v6w) this.d;
                r8w r8wVar = d7wVar.k;
                r8wVar.a.d(((v6w.h) v6wVar).b);
                break;
            default:
                c8a0 c8a0Var = (c8a0) this.c;
                c8a0Var.e.invoke(new d.g((Photo) this.d));
                c8a0Var.g.invoke(new b9a0.k(new j7k0(tq.h(tlo0.Companion, R.string.photo_flow_photo_pin_success), Integer.valueOf(R.drawable.vk_icon_pin_outline_28), Integer.valueOf(R.attr.vk_ui_icon_accent), null, null, null, 56)));
                break;
        }
    }
}
