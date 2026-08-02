package defpackage;

import android.graphics.drawable.Drawable;
import com.yandex.go.scooters.qr.preview.ScootersPreviewView;

/* loaded from: classes13.dex */
public final class ano0 implements kmo0 {
    public final /* synthetic */ ScootersPreviewView a;

    public ano0(ScootersPreviewView scootersPreviewView) {
        this.a = scootersPreviewView;
    }

    @Override // defpackage.kmo0
    public final void R(float f, float f2) {
        ScootersPreviewView scootersPreviewView = this.a;
        if (scootersPreviewView.getVisibility() == 0) {
            scootersPreviewView.animate().setDuration(75L).translationX(f).translationY(f2);
        } else {
            scootersPreviewView.setTranslationX(f);
            scootersPreviewView.setTranslationY(f2);
        }
    }

    @Override // defpackage.kmo0
    public final void hide() {
        this.a.hide();
    }

    @Override // defpackage.kmo0
    public final void o5(Drawable drawable) {
        ScootersPreviewView scootersPreviewView = this.a;
        scootersPreviewView.setBackground(drawable);
        scootersPreviewView.show();
    }

    @Override // defpackage.eyi0
    public final void render(Object obj) {
        ymo0 ymo0Var = (ymo0) obj;
        boolean z = ymo0Var instanceof smo0;
        ScootersPreviewView scootersPreviewView = this.a;
        if (z) {
            scootersPreviewView.error((smo0) ymo0Var);
            return;
        }
        if (ymo0Var instanceof tmo0) {
            scootersPreviewView.loading((tmo0) ymo0Var);
        } else if (ymo0Var instanceof xmo0) {
            scootersPreviewView.success((xmo0) ymo0Var);
        } else {
            w511.b();
        }
    }
}
