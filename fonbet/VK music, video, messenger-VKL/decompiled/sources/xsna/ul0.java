package xsna;

import com.vkontakte.android.actionlinks.views.fragments.add.AddLinkPresenter;

/* compiled from: R8$$SyntheticClass */
/* loaded from: classes7.dex */
public final /* synthetic */ class ul0 implements io.reactivex.rxjava3.functions.a {
    public final /* synthetic */ int b;
    public final /* synthetic */ Object c;

    public /* synthetic */ ul0(Object obj, int i) {
        this.b = i;
        this.c = obj;
    }

    @Override // io.reactivex.rxjava3.functions.a
    public final void run() {
        switch (this.b) {
            case 0:
                ((AddLinkPresenter) this.c).j = null;
                break;
            case 1:
                ((a8c) this.c).getClass();
                break;
            case 2:
                ((und) this.c).l = false;
                break;
            case 3:
                ((kr70) this.c).j = false;
                break;
            case 4:
                ((b2e0) this.c).a();
                break;
            default:
                ((com.vk.voip.ui.hint.a) this.c).c();
                break;
        }
    }
}
