package xsna;

import android.content.Context;
import android.content.res.ColorStateList;
import android.view.View;
import android.widget.LinearLayout;
import com.google.android.material.slider.BaseSlider;
import com.google.android.material.slider.Slider;
import com.mbridge.msdk.playercommon.exoplayer2.C;
import com.unity3d.services.UnityAdsConstants;
import com.vk.core.view.components.text.VkText;
import com.vkontakte.android.R;
import java.util.Arrays;

/* compiled from: LiveSeekView.kt */
/* loaded from: classes2.dex */
public final class klz extends LinearLayout implements flz {
    public final ColorStateList b;
    public final ColorStateList c;
    public elz d;
    public a e;
    public final VkText f;
    public final Slider g;
    public final VkText h;
    public boolean i;

    /* compiled from: LiveSeekView.kt */
    public interface a {
    }

    public klz(Context context) {
        super(context, null);
        this.b = anj.b(R.color.vk_red_nice, context);
        this.c = ColorStateList.valueOf(-1);
        setVisibility(8);
        setOrientation(0);
        setGravity(16);
        View.inflate(context, R.layout.live_seek, this);
        this.f = (VkText) findViewById(R.id.live_seek_elapsed_time);
        Slider slider = (Slider) findViewById(R.id.live_seek_slider);
        this.g = slider;
        VkText vkText = (VkText) findViewById(R.id.live_seek_badge);
        this.h = vkText;
        slider.o.add(new jlz(this));
        slider.a(new Slider.a() { // from class: xsna.ilz
            @Override // xsna.ti6
            public final void F0(BaseSlider baseSlider, float f, boolean z) {
                Slider slider2 = (Slider) baseSlider;
                if (z) {
                    klz klzVar = klz.this;
                    elz elzVar = klzVar.d;
                    klzVar.a((elzVar == null || !elzVar.o()) ? -((long) slider2.getValueFrom()) : (long) slider2.getValueTo(), (long) f, z);
                }
            }
        });
        bwt0.i0(vkText, new f2s(this, 15));
    }

    @Override // xsna.flz
    public final void E0() {
        f4m.j(this.f);
        f4m.j(this.h);
        int a2 = iah0.a(6);
        Slider slider = this.g;
        slider.setThumbRadius(a2);
        slider.setTrackHeight(iah0.a(2));
    }

    @Override // xsna.flz
    public final void G0(long j, boolean z) {
        if (this.i || j <= 0) {
            return;
        }
        elz elzVar = this.d;
        Slider slider = this.g;
        if (elzVar == null || !elzVar.o()) {
            slider.setValueFrom(-j);
        } else {
            slider.setValueFrom(UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT);
            slider.setValueTo(j);
        }
        elz elzVar2 = this.d;
        if (elzVar2 == null || !elzVar2.o()) {
            slider.setValue(swe0.f(slider.getValue(), slider.getValueFrom(), slider.getValueTo()));
        } else {
            long value = (long) slider.getValue();
            elz elzVar3 = this.d;
            if (elzVar3 != null && elzVar3.o() && j < 600000 && z) {
                value = (long) (j * 0.99d);
            }
            slider.setValue(swe0.f(value, slider.getValueFrom(), slider.getValueTo()));
        }
        a(j, (long) slider.getValue(), false);
    }

    public final void a(long j, long j2, boolean z) {
        elz elzVar;
        if ((j > 0 && j2 <= 0) || (elzVar = this.d) == null || elzVar.o()) {
            elz elzVar2 = this.d;
            if (elzVar2 != null && elzVar2.o()) {
                j2 = j - j2;
            }
            elz elzVar3 = this.d;
            int abs = (int) Math.abs((elzVar3 == null || !elzVar3.i() || z) ? j2 / 1000 : 0L);
            gpt0 gpt0Var = gpt0.a;
            this.f.setText(String.format("-%s", Arrays.copyOf(new Object[]{z8s.a(abs)}, 1)));
        }
    }

    @Override // xsna.rr6
    public Context getViewContext() {
        return getContext();
    }

    @Override // xsna.flz
    public final void h1(boolean z) {
        ColorStateList colorStateList = z ? this.b : this.c;
        if (colorStateList != null) {
            this.g.setTrackActiveTintList(colorStateList);
        }
    }

    @Override // xsna.flz
    public final void hide() {
        a aVar = this.e;
        if (aVar != null) {
            ((h8) aVar).b(false);
        }
        setVisibility(8);
    }

    @Override // xsna.flz
    public final void m3(long j, long j2, boolean z) {
        if (this.i) {
            return;
        }
        elz elzVar = this.d;
        if (elzVar != null && elzVar.o() && j2 == C.TIME_UNSET) {
            return;
        }
        elz elzVar2 = this.d;
        long j3 = (elzVar2 == null || !elzVar2.o()) ? 0L : j;
        elz elzVar3 = this.d;
        if (elzVar3 != null && elzVar3.o() && j < 600000 && z) {
            j2 = (long) (j * 0.99d);
        }
        if (j2 <= j3) {
            j3 = j2;
        }
        this.g.setValue(j3);
        G0(j, z);
        h1(z);
        VkText vkText = this.h;
        vkText.setEnabled(!z);
        vkText.setActivated(z);
    }

    @Override // xsna.rr6
    public final void pause() {
        elz elzVar = this.d;
        if (elzVar != null) {
            elzVar.pause();
        }
    }

    @Override // xsna.rr6
    public final void release() {
        elz elzVar = this.d;
        if (elzVar != null) {
            elzVar.release();
        }
    }

    @Override // xsna.rr6
    public final void resume() {
        elz elzVar = this.d;
        if (elzVar != null) {
            elzVar.resume();
        }
    }

    public final void setShowChangeListener(a aVar) {
        this.e = aVar;
    }

    @Override // xsna.flz
    public final void show() {
        a aVar = this.e;
        if (aVar != null) {
            ((h8) aVar).b(true);
        }
        setVisibility(0);
        bringToFront();
    }

    @Override // xsna.rr6
    public elz getPresenter() {
        elz elzVar = this.d;
        if (elzVar != null) {
            return elzVar;
        }
        throw new IllegalStateException("Presenter not yet initialized.");
    }

    @Override // xsna.rr6
    public void setPresenter(elz elzVar) {
        this.d = elzVar;
    }

    @Override // xsna.flz
    public View getActualView() {
        return this;
    }

    @Override // xsna.rr6
    public View getView() {
        return this;
    }
}
