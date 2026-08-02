package xsna;

import android.content.Context;
import android.view.View;
import com.unity3d.services.UnityAdsConstants;
import com.vk.clips.design.view.component.video.seekbar.ClipSeekBarView;
import com.vk.clips.sdk.shared.api.ui.ClipSeekBarController;
import com.vkontakte.android.R;

/* compiled from: ExternalSeekViewAdapter.kt */
/* loaded from: classes3.dex */
public final class ofq implements flz {
    public final gzs<ClipSeekBarController> b;
    public final r4k c;
    public glz d;
    public boolean e;
    public boolean f;
    public final a g = new a();

    /* compiled from: ExternalSeekViewAdapter.kt */
    public static final class a implements ClipSeekBarController.a {
        public a() {
        }

        @Override // com.vk.clips.sdk.shared.api.ui.ClipSeekBarController.a
        public final void a(float f, boolean z) {
            if (z) {
                ofq.this.h1(f == UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT);
            }
        }

        @Override // com.vk.clips.sdk.shared.api.ui.ClipSeekBarController.a
        public final void b(float f) {
            ofq ofqVar = ofq.this;
            ofqVar.e = false;
            glz glzVar = ofqVar.d;
            if (glzVar != null) {
                glzVar.b2((long) f);
            }
            r4k r4kVar = ofqVar.c;
            if (r4kVar != null) {
                ((gjz) r4kVar.b).d.g4(true, true);
            }
        }

        @Override // com.vk.clips.sdk.shared.api.ui.ClipSeekBarController.a
        public final void c() {
            ofq ofqVar = ofq.this;
            ofqVar.e = true;
            r4k r4kVar = ofqVar.c;
            if (r4kVar != null) {
                gjz gjzVar = (gjz) r4kVar.b;
                gjzVar.d.g4(false, true);
                flz liveSeekView = gjzVar.getLiveSeekView();
                if (liveSeekView != null) {
                    liveSeekView.h1(false);
                }
            }
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public ofq(gzs<? extends ClipSeekBarController> gzsVar, r4k r4kVar) {
        this.b = gzsVar;
        this.c = r4kVar;
    }

    @Override // xsna.flz
    public final void E0() {
        h1(false);
    }

    @Override // xsna.flz
    public final void G0(long j, boolean z) {
        ClipSeekBarController a2;
        if (!this.f || j <= 0 || (a2 = a()) == null) {
            return;
        }
        float f = a2.f();
        ClipSeekBarController a3 = a();
        if (a3 != null) {
            a3.e(f);
        }
    }

    public final ClipSeekBarController a() {
        if (this.f) {
            return this.b.invoke();
        }
        return null;
    }

    @Override // xsna.flz
    public final View getActualView() {
        ClipSeekBarController a2 = a();
        if (a2 != null) {
            return a2.getView();
        }
        return null;
    }

    @Override // xsna.rr6
    public final elz getPresenter() {
        return this.d;
    }

    @Override // xsna.rr6
    public final Context getViewContext() {
        ClipSeekBarView view;
        ClipSeekBarController a2 = a();
        Context context = (a2 == null || (view = a2.getView()) == null) ? null : view.getContext();
        if (context != null) {
            return context;
        }
        throw new IllegalArgumentException("Required value was null.");
    }

    @Override // xsna.flz
    public final void h1(boolean z) {
        ClipSeekBarController a2 = a();
        if (a2 != null) {
            Integer valueOf = Integer.valueOf(R.color.vk_red_nice);
            if (!z) {
                valueOf = null;
            }
            a2.d(new ClipSeekBarController.b(valueOf != null ? valueOf.intValue() : R.color.vk_white));
        }
    }

    @Override // xsna.flz
    public final void hide() {
        ClipSeekBarView view;
        ClipSeekBarController a2 = a();
        if (a2 == null || (view = a2.getView()) == null) {
            return;
        }
        f4m.j(view);
    }

    @Override // xsna.flz
    public final void m3(long j, long j2, boolean z) {
        float f;
        if (this.e || !this.f) {
            return;
        }
        h1(z);
        ClipSeekBarController a2 = a();
        if (a2 != null) {
            glz glzVar = this.d;
            if (glzVar == null || !glzVar.c.h()) {
                f = j2;
                if (f > UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT) {
                    f = 0.0f;
                }
            } else {
                f = j2;
            }
            a2.e(f);
            G0(j, z);
        }
    }

    @Override // xsna.rr6
    public final void pause() {
        ClipSeekBarController a2 = a();
        if (a2 != null) {
            a2.h(this.g);
        }
        this.f = false;
    }

    @Override // xsna.rr6
    public final void release() {
        ClipSeekBarController a2 = a();
        if (a2 != null) {
            a2.h(this.g);
        }
    }

    @Override // xsna.rr6
    public final void resume() {
        this.f = true;
        ClipSeekBarController a2 = a();
        if (a2 != null) {
            a2.e(UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT);
        }
        ClipSeekBarController a3 = a();
        if (a3 != null) {
            a3.k(null);
        }
        ClipSeekBarController a4 = a();
        if (a4 != null) {
            a4.g(this.g);
        }
    }

    @Override // xsna.rr6
    public final void setPresenter(elz elzVar) {
        this.d = (glz) elzVar;
    }

    @Override // xsna.flz
    public final void show() {
        ClipSeekBarView view;
        ClipSeekBarController a2 = a();
        if (a2 == null || (view = a2.getView()) == null) {
            return;
        }
        view.setVisibility(0);
    }
}
