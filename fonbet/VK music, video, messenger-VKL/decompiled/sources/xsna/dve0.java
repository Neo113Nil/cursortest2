package xsna;

import android.view.View;
import com.vk.catalog2.feature.music.holders.RadioStationVh;

/* compiled from: RadioStationVh.kt */
/* loaded from: classes16.dex */
public final class dve0 implements View.OnAttachStateChangeListener {
    public final /* synthetic */ RadioStationVh b;

    public dve0(RadioStationVh radioStationVh) {
        this.b = radioStationVh;
    }

    @Override // android.view.View.OnAttachStateChangeListener
    public final void onViewAttachedToWindow(View view) {
        RadioStationVh radioStationVh = this.b;
        radioStationVh.b.P0(radioStationVh.m, false);
    }

    @Override // android.view.View.OnAttachStateChangeListener
    public final void onViewDetachedFromWindow(View view) {
        RadioStationVh radioStationVh = this.b;
        radioStationVh.l.b(null);
        radioStationVh.b.n0(radioStationVh.m);
    }
}
