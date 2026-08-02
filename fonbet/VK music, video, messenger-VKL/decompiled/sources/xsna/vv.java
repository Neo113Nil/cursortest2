package xsna;

import com.vkontakte.android.R;
import xsna.ehz0;

/* compiled from: R8$$SyntheticClass */
/* loaded from: classes6.dex */
public final /* synthetic */ class vv implements Runnable {
    public final /* synthetic */ int b;
    public final /* synthetic */ int c;
    public final /* synthetic */ Object d;

    public /* synthetic */ vv(Object obj, int i, int i2) {
        this.b = i2;
        this.d = obj;
        this.c = i;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.b) {
            case 0:
                fw fwVar = (fw) this.d;
                int i = this.c;
                or1 or1Var = new or1(bwt0.u(fwVar.a.i0.getContext()));
                or1Var.a(R.string.story_hide_particular_reply, new fv(fwVar, i, 0));
                or1Var.b(new ov(fwVar, 0), fwVar.a.i0.getContext().getResources().getString(R.string.story_hide_all_replies, fwVar.a.i0.getDependencies().k.b(fwVar.a.i0.getStoriesContainer().b)));
                fwVar.c.e(or1Var.d(), null);
                break;
            default:
                ((ehz0.b) this.d).e.accept(Integer.valueOf(this.c));
                break;
        }
    }
}
