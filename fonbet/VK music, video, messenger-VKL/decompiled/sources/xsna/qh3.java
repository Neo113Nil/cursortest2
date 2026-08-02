package xsna;

import com.vk.dto.photo.Photo;
import com.vk.video.ui.discovery.minimizable.n;
import com.vkontakte.android.R;
import java.util.Collections;
import xsna.mi3;
import xsna.zi3;

/* compiled from: R8$$SyntheticClass */
/* loaded from: classes4.dex */
public final /* synthetic */ class qh3 implements io.reactivex.rxjava3.functions.a {
    public final /* synthetic */ int b;
    public final /* synthetic */ Object c;
    public final /* synthetic */ Object d;

    public /* synthetic */ qh3(int i, Object obj, Object obj2) {
        this.b = i;
        this.c = obj;
        this.d = obj2;
    }

    @Override // io.reactivex.rxjava3.functions.a
    public final void run() {
        switch (this.b) {
            case 0:
                rh3 rh3Var = (rh3) this.c;
                rh3Var.T(new mi3.d(Collections.singleton(Integer.valueOf(((Photo) this.d).c))));
                rh3Var.o.b(new zi3.g(new j7k0(tq.h(tlo0.Companion, R.string.album_details_photo_delete_success), Integer.valueOf(R.drawable.vk_icon_check_circle_outline_28), Integer.valueOf(R.attr.vk_ui_icon_positive), null, null, null, 32)));
                break;
            case 1:
                muv muvVar = (muv) this.c;
                muvVar.d.remove((String) this.d);
                break;
            default:
                com.vk.video.ui.discovery.minimizable.g gVar = (com.vk.video.ui.discovery.minimizable.g) this.c;
                gVar.T(new n.a(com.vk.video.ui.discovery.minimizable.g.c1(gVar, (com.vk.video.ui.discovery.minimizable.q) this.d, Boolean.FALSE, null, 4)));
                break;
        }
    }
}
