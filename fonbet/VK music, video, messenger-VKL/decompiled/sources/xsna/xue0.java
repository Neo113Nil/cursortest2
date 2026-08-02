package xsna;

import android.view.View;
import com.vk.catalog2.feature.music.holders.RadioStationCellVh;

/* compiled from: RadioStationCellVh.kt */
/* loaded from: classes16.dex */
public final class xue0 implements View.OnAttachStateChangeListener {
    public final /* synthetic */ RadioStationCellVh b;

    public xue0(RadioStationCellVh radioStationCellVh) {
        this.b = radioStationCellVh;
    }

    @Override // android.view.View.OnAttachStateChangeListener
    public final void onViewAttachedToWindow(View view) {
        RadioStationCellVh radioStationCellVh = this.b;
        radioStationCellVh.b.P0(radioStationCellVh.i, false);
    }

    @Override // android.view.View.OnAttachStateChangeListener
    public final void onViewDetachedFromWindow(View view) {
        RadioStationCellVh radioStationCellVh = this.b;
        radioStationCellVh.h.b(null);
        radioStationCellVh.b.n0(radioStationCellVh.i);
    }
}
