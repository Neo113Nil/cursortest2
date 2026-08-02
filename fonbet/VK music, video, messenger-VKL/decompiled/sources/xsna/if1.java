package xsna;

import com.vk.im.ui.components.chat_profile.interactors.UserProfileAvatarsInteractor;
import com.vk.photos.root.albumdetails.presentation.i;
import xsna.l2f;
import xsna.pl30;

/* compiled from: R8$$SyntheticClass */
/* loaded from: classes4.dex */
public final /* synthetic */ class if1 implements io.reactivex.rxjava3.functions.a {
    public final /* synthetic */ int b;
    public final /* synthetic */ Object c;

    public /* synthetic */ if1(Object obj, int i) {
        this.b = i;
        this.c = obj;
    }

    @Override // io.reactivex.rxjava3.functions.a
    public final void run() {
        switch (this.b) {
            case 0:
                ((gg1) this.c).p.b(i.e.a);
                break;
            case 1:
                ((l2f.a) this.c).a(Boolean.TRUE);
                break;
            case 2:
                ((sr80) this.c).a();
                break;
            case 3:
                ((UserProfileAvatarsInteractor.a) this.c).f = false;
                break;
            default:
                l5v0 l5v0Var = (l5v0) this.c;
                l5v0Var.r = false;
                l5v0Var.k.onNext(new pl30.a(false));
                break;
        }
    }
}
