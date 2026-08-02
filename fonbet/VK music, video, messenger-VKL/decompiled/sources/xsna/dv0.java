package xsna;

import com.vk.core.view.AdsButton;

/* compiled from: R8$$SyntheticClass */
/* loaded from: classes17.dex */
public final /* synthetic */ class dv0 implements Runnable {
    public final /* synthetic */ AdsButton b;
    public final /* synthetic */ int c;

    public /* synthetic */ dv0(AdsButton adsButton, int i) {
        this.b = adsButton;
        this.c = i;
    }

    @Override // java.lang.Runnable
    public final void run() {
        AdsButton adsButton = this.b;
        AdsButton.c cVar = adsButton.h;
        int i = this.c;
        cVar.c(i);
        adsButton.i = i;
    }
}
