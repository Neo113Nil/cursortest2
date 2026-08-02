package xsna;

import android.app.Activity;
import android.content.Context;
import android.view.View;
import com.vkontakte.android.R;
import xsna.av20;
import xsna.h30;
import xsna.h7u0;

/* compiled from: ActionLinksSnippetPresenter.kt */
/* loaded from: classes3.dex */
public final class j30 implements av20.b<h30.a> {
    public final /* synthetic */ h30 a;
    public final /* synthetic */ Context b;

    public j30(h30 h30Var, Activity activity) {
        this.a = h30Var;
        this.b = activity;
    }

    @Override // xsna.av20.b
    public final void a(View view, Object obj, int i, wmg wmgVar) {
        h30 h30Var = this.a;
        h30Var.getClass();
        int h = ((h30.a) obj).h();
        if (h == R.id.live_action_link_goto) {
            h30Var.a();
        } else if (h == R.id.live_action_link_change) {
            h30Var.c();
        } else if (h == R.id.live_action_link_delete) {
            Context context = h30Var.b;
            h7u0.a aVar = new h7u0.a(context);
            aVar.a.f = context.getString(R.string.live_broadcast_delete_link_titile);
            aVar.c0(R.string.live_yes, new e30(h30Var, 0));
            aVar.W(R.string.cancel, new f30(0));
            aVar.m();
        }
        view.postDelayed(new g0(h30Var, 1), this.b.getResources().getInteger(android.R.integer.config_shortAnimTime));
    }
}
