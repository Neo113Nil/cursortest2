package defpackage;

import androidx.preference.PreferenceHeaderFragmentCompat;
import androidx.slidingpanelayout.widget.SlidingPaneLayout;

/* loaded from: classes10.dex */
public final class l8 extends mx60 implements tps0 {
    public final /* synthetic */ int d = 1;
    public final Object e;

    public l8(PreferenceHeaderFragmentCompat preferenceHeaderFragmentCompat) {
        super(true);
        this.e = preferenceHeaderFragmentCompat;
        preferenceHeaderFragmentCompat.getSlidingPaneLayout().addPanelSlideListener(this);
    }

    @Override // defpackage.tps0
    public final void a() {
        switch (this.d) {
            case 0:
                h(false);
                break;
            default:
                h(false);
                break;
        }
    }

    @Override // defpackage.tps0
    public final void b() {
        switch (this.d) {
            case 0:
                h(true);
                break;
            default:
                h(true);
                break;
        }
    }

    @Override // defpackage.mx60
    public final void d() {
        switch (this.d) {
            case 0:
                ((SlidingPaneLayout) this.e).closePane();
                break;
            default:
                ((PreferenceHeaderFragmentCompat) this.e).getSlidingPaneLayout().closePane();
                break;
        }
    }

    public l8(SlidingPaneLayout slidingPaneLayout) {
        super(true);
        this.e = slidingPaneLayout;
        slidingPaneLayout.addPanelSlideListener(this);
    }
}
