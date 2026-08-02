package xsna;

import android.content.Context;
import android.view.View;
import com.vk.clips.sdk.shared.api.ui.ClipSeekBarController;

/* compiled from: LiveSeekViewWrapper.kt */
/* loaded from: classes3.dex */
public final class llz implements flz {
    public klz b;
    public final ofq c;

    public llz(gzs<? extends ClipSeekBarController> gzsVar, r4k r4kVar) {
        this.c = gzsVar != null ? new ofq(gzsVar, r4kVar) : null;
    }

    @Override // xsna.flz
    public final void E0() {
        flz a = a();
        if (a != null) {
            a.E0();
        }
    }

    @Override // xsna.flz
    public final void G0(long j, boolean z) {
        View actualView;
        flz a;
        flz a2 = a();
        if (a2 == null || (actualView = a2.getActualView()) == null || actualView.getVisibility() != 0 || (a = a()) == null) {
            return;
        }
        a.G0(j, z);
    }

    public final flz a() {
        ofq ofqVar = this.c;
        return ofqVar == null ? this.b : ofqVar;
    }

    @Override // xsna.flz
    public final View getActualView() {
        flz a = a();
        if (a != null) {
            return a.getActualView();
        }
        return null;
    }

    @Override // xsna.rr6
    public final elz getPresenter() {
        flz a = a();
        if (a != null) {
            return a.getPresenter();
        }
        throw new IllegalArgumentException("Required value was null.");
    }

    @Override // xsna.rr6
    public final Context getViewContext() {
        flz a = a();
        if (a != null) {
            return a.getViewContext();
        }
        throw new IllegalArgumentException("Required value was null.");
    }

    @Override // xsna.flz
    public final void h1(boolean z) {
        flz a = a();
        if (a != null) {
            a.h1(false);
        }
    }

    @Override // xsna.flz
    public final void hide() {
        flz a = a();
        if (a != null) {
            a.hide();
        }
    }

    @Override // xsna.flz
    public final void m3(long j, long j2, boolean z) {
        View actualView;
        flz a;
        flz a2 = a();
        if (a2 == null || (actualView = a2.getActualView()) == null || actualView.getVisibility() != 0 || (a = a()) == null) {
            return;
        }
        a.m3(j, j2, z);
    }

    @Override // xsna.rr6
    public final void pause() {
        flz a = a();
        if (a != null) {
            a.pause();
        }
    }

    @Override // xsna.rr6
    public final void release() {
        flz a = a();
        if (a != null) {
            a.release();
        }
    }

    @Override // xsna.rr6
    public final void resume() {
        View actualView;
        flz a = a();
        if (a != null) {
            a.resume();
        }
        flz a2 = a();
        if (a2 == null || (actualView = a2.getActualView()) == null) {
            return;
        }
        actualView.setVisibility(0);
    }

    @Override // xsna.rr6
    public final void setPresenter(elz elzVar) {
        elz elzVar2 = elzVar;
        flz a = a();
        if (a != null) {
            a.setPresenter(elzVar2);
        }
    }

    @Override // xsna.flz
    public final void show() {
        flz a;
        if (a() == null || (a = a()) == null) {
            return;
        }
        a.show();
    }
}
