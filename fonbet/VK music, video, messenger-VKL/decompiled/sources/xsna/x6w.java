package xsna;

import com.vk.newsfeed.presentation.model.actions.NewsfeedExternalAction;
import com.vkontakte.android.R;
import xsna.ds60;
import xsna.l6w;
import xsna.v6w;
import xsna.yo60;

/* compiled from: R8$$SyntheticClass */
/* loaded from: classes2.dex */
public final /* synthetic */ class x6w implements io.reactivex.rxjava3.functions.a {
    public final /* synthetic */ int b;
    public final /* synthetic */ evg0 c;
    public final /* synthetic */ hn50 d;

    public /* synthetic */ x6w(evg0 evg0Var, hn50 hn50Var, int i) {
        this.b = i;
        this.c = evg0Var;
        this.d = hn50Var;
    }

    @Override // io.reactivex.rxjava3.functions.a
    public final void run() {
        switch (this.b) {
            case 0:
                ((d7w) this.c).c(new l6w.b.o(((v6w.a.C3870a) ((v6w.a) this.d)).b));
                break;
            default:
                rq60 rq60Var = (rq60) this.c;
                ds60.c.a aVar = (ds60.c.a) this.d;
                rq60Var.a(new ds60.b(new NewsfeedExternalAction.c.u(aVar.c)));
                rq60Var.a(new ds60.b(new NewsfeedExternalAction.c.r(aVar.b)));
                rq60Var.c(new yo60.g.b.C4121b(R.string.newsfeed_item_ignored_snackbar_message));
                break;
        }
    }
}
