package defpackage;

import android.graphics.Bitmap;
import android.view.View;
import android.widget.ImageView;
import com.yandex.go.scooters.discovery.ScootersDiscoveryModalView;

/* loaded from: classes13.dex */
public final class kin0 implements min0 {
    public final /* synthetic */ ScootersDiscoveryModalView a;

    public kin0(ScootersDiscoveryModalView scootersDiscoveryModalView) {
        this.a = scootersDiscoveryModalView;
    }

    @Override // defpackage.min0
    public final void W5(zzs zzsVar) {
        ah00 ah00Var;
        ah00Var = this.a.mapController;
        ((gh00) ah00Var).G(zzsVar);
    }

    @Override // defpackage.min0
    public final void Y1(Bitmap bitmap) {
        View view;
        ImageView imageView;
        ScootersDiscoveryModalView scootersDiscoveryModalView = this.a;
        view = scootersDiscoveryModalView.logotypeContainer;
        if (view != null) {
            view.setVisibility(0);
        }
        imageView = scootersDiscoveryModalView.logotype;
        if (imageView != null) {
            imageView.setImageBitmap(bitmap);
        }
    }

    @Override // defpackage.min0
    public final void vf(boolean z) {
        this.a.updateAnchorHeight(z);
    }

    @Override // defpackage.min0
    public final void we(boolean z) {
        whn0 whn0Var;
        whn0Var = this.a.topButtonContainer;
        if (whn0Var != null) {
            whn0Var.b.setVisibility(z ? 0 : 8);
        }
    }
}
