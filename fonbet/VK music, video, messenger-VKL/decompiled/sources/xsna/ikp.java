package xsna;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import com.vkontakte.android.R;
import xsna.h7u0;

/* compiled from: EndBroadcastView.kt */
/* loaded from: classes16.dex */
public final class ikp extends LinearLayout implements xjp, gv5 {
    public final View b;
    public final View c;
    public final View d;
    public final View e;
    public androidx.appcompat.app.d f;
    public dw20 g;
    public wjp h;

    public ikp(Context context) {
        super(context, null, 0);
        View inflate = LayoutInflater.from(context).inflate(R.layout.live_end_broadcast_new, (ViewGroup) this, true);
        View findViewById = inflate.findViewById(R.id.live_end_broadcast_delete);
        this.b = findViewById;
        View findViewById2 = inflate.findViewById(R.id.live_end_broadcast_play);
        this.c = findViewById2;
        View findViewById3 = inflate.findViewById(R.id.live_end_broadcast_stat);
        this.d = findViewById3;
        View findViewById4 = inflate.findViewById(R.id.live_end_broadcast_publish);
        this.e = findViewById4;
        jjc.g(findViewById2, new pwk(this, 7));
        jjc.g(findViewById3, new iz0(this, 28));
        jjc.g(findViewById4, new wcg(this, 12));
        jjc.g(findViewById, new zxo(this, 1));
        setOrientation(1);
        setClickable(true);
        setBackgroundColor(getContext().getColor(R.color.vk_black_alpha60));
    }

    public final void a() {
        androidx.appcompat.app.d dVar = this.f;
        if (dVar != null) {
            dVar.dismiss();
        }
        int i = h7u0.p;
        h7u0.a c = h7u0.b.c(getContext());
        c.g0(R.string.live_broadcast_end_if_go_away_delete);
        c.U(R.string.live_broadcast_end_live_recover_not_possible);
        c.c0(R.string.live_broadcast_end_screen_dialog_exit, new ekp(this, 0));
        c.W(R.string.cancel, new fkp());
        this.f = c.m();
    }

    @Override // xsna.gv5
    public final boolean a0() {
        a();
        return true;
    }

    @Override // xsna.rr6
    public Context getViewContext() {
        return getContext();
    }

    @Override // xsna.rr6
    public final void pause() {
        wjp wjpVar = this.h;
        if (wjpVar != null) {
            wjpVar.pause();
        }
    }

    @Override // xsna.rr6
    public final void release() {
        wjp wjpVar = this.h;
        if (wjpVar != null) {
            wjpVar.release();
        }
    }

    @Override // xsna.rr6
    public final void resume() {
        wjp wjpVar = this.h;
        if (wjpVar != null) {
            wjpVar.resume();
        }
    }

    @Override // xsna.xjp
    public void setDeleteButtonVisibility(boolean z) {
        View view = this.b;
        if (view != null) {
            view.setVisibility(z ? 0 : 8);
        }
    }

    @Override // xsna.xjp
    public void setOpenButtonVisibility(boolean z) {
        View view = this.c;
        if (view != null) {
            view.setVisibility(z ? 0 : 8);
        }
    }

    @Override // xsna.xjp
    public void setPublishButtonVisibility(boolean z) {
        View view = this.e;
        if (view != null) {
            view.setVisibility(z ? 0 : 8);
        }
    }

    @Override // xsna.rr6
    public wjp getPresenter() {
        wjp wjpVar = this.h;
        if (wjpVar != null) {
            return wjpVar;
        }
        throw new IllegalStateException("set presenter before use getPresenter fun");
    }

    @Override // xsna.rr6
    public void setPresenter(wjp wjpVar) {
        this.h = wjpVar;
    }

    @Override // xsna.rr6
    public View getView() {
        return this;
    }

    @Override // xsna.xjp
    public void setPublishButtonText(String str) {
    }

    @Override // xsna.xjp
    public void setPublishSettings(String str) {
    }

    @Override // xsna.xjp
    public void setPublishSettingsVisibility(boolean z) {
    }
}
