package xsna;

import android.R;
import android.view.View;
import xsna.av20;

/* compiled from: ClipsDownloadLauncherImpl.kt */
/* loaded from: classes16.dex */
public final class qrd implements av20.b<e520> {
    public final /* synthetic */ lrd a;
    public final /* synthetic */ ord b;

    public qrd(lrd lrdVar, ord ordVar) {
        this.a = lrdVar;
        this.b = ordVar;
    }

    @Override // xsna.av20.b
    public final void a(View view, Object obj, int i, wmg wmgVar) {
        this.a.invoke((e520) obj);
        view.postDelayed(new sm9(this.b, 3), view.getContext().getResources().getInteger(R.integer.config_shortAnimTime));
    }
}
