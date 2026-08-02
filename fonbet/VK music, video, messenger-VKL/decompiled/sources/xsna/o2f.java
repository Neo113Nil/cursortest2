package xsna;

import android.app.Activity;
import com.vk.core.compose.component.defaults.SpinnerMode;
import com.vk.core.compose.component.defaults.SpinnerState;

/* compiled from: ClipsScreenSpinnerView.kt */
/* loaded from: classes17.dex */
public final class o2f extends rpo0 {
    public final wh50 m;
    public final wh50 n;
    public final wh50 o;
    public final wh50 p;

    public o2f(Activity activity) {
        super(activity, null, 0);
        this.m = androidx.compose.runtime.k.b(SpinnerState.Loading);
        this.n = androidx.compose.runtime.k.b(null);
        this.o = androidx.compose.runtime.k.b(null);
        this.p = androidx.compose.runtime.k.b(Boolean.TRUE);
    }

    @Override // xsna.rpo0
    public final void A(int i, androidx.compose.runtime.a aVar) {
        androidx.compose.runtime.a M = aVar.M(-1277864256);
        int i2 = (M.y(this) ? 4 : 2) | i;
        if (M.t(i2 & 1, (i2 & 3) != 2)) {
            if (androidx.compose.runtime.b.d()) {
                androidx.compose.runtime.b.f(-1277864256, i2, -1, "com.vk.clips.viewer.impl.compose.dialog.content.ClipsScreenSpinnerView.ThemedContent (ClipsScreenSpinnerView.kt:35)");
            }
            zfr0.d(getSpinnerState(), null, SpinnerMode.Overlay, getSubtitle(), getOnCancelClick(), 0L, 0L, null, null, M, 384, 482);
            if (androidx.compose.runtime.b.d()) {
                androidx.compose.runtime.b.e();
            }
        } else {
            M.h();
        }
        androidx.compose.runtime.f s = M.s();
        if (s != null) {
            s.d = new bo3(this, i, 4);
        }
    }

    public final gzs<s3q0> getOnCancelClick() {
        return (gzs) ((zak0) this.n).getValue();
    }

    public final SpinnerState getSpinnerState() {
        return (SpinnerState) ((zak0) this.m).getValue();
    }

    public final String getSubtitle() {
        return (String) ((zak0) this.o).getValue();
    }

    public final void setDarkThemeEnabled(boolean z) {
        ((zak0) this.p).setValue(Boolean.valueOf(z));
    }

    public final void setOnCancelClick(gzs<s3q0> gzsVar) {
        ((zak0) this.n).setValue(gzsVar);
    }

    public final void setSpinnerState(SpinnerState spinnerState) {
        ((zak0) this.m).setValue(spinnerState);
    }

    public final void setSubtitle(String str) {
        ((zak0) this.o).setValue(str);
    }

    @Override // xsna.rpo0
    public final void z(int i, androidx.compose.runtime.a aVar, jai jaiVar) {
        int i2;
        androidx.compose.runtime.a M = aVar.M(-235728774);
        if ((i & 6) == 0) {
            i2 = (M.y(jaiVar) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= (i & 64) == 0 ? M.J(this) : M.y(this) ? 32 : 16;
        }
        if (M.t(i2 & 1, (i2 & 19) != 18)) {
            if (androidx.compose.runtime.b.d()) {
                androidx.compose.runtime.b.f(-235728774, i2, -1, "com.vk.clips.viewer.impl.compose.dialog.content.ClipsScreenSpinnerView.Theme (ClipsScreenSpinnerView.kt:28)");
            }
            rrv0.e(((Boolean) ((zak0) this.p).getValue()).booleanValue(), null, null, null, null, null, kai.c(-1364227849, new m2f(0, jaiVar), M), M, 1572864, 62);
            if (androidx.compose.runtime.b.d()) {
                androidx.compose.runtime.b.e();
            }
        } else {
            M.h();
        }
        androidx.compose.runtime.f s = M.s();
        if (s != null) {
            s.d = new n2f(this, jaiVar, i, 0);
        }
    }
}
