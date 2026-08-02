package xsna;

import android.view.View;

/* compiled from: ViewExt.kt */
/* loaded from: classes16.dex */
public final class k6b implements View.OnLayoutChangeListener {
    public final /* synthetic */ View b;
    public final /* synthetic */ com.vk.channels.impl.channel_screen.send_msg.a c;

    public k6b(View view, com.vk.channels.impl.channel_screen.send_msg.a aVar) {
        this.b = view;
        this.c = aVar;
    }

    @Override // android.view.View.OnLayoutChangeListener
    public final void onLayoutChange(View view, int i, int i2, int i3, int i4, int i5, int i6, int i7, int i8) {
        view.removeOnLayoutChangeListener(this);
        View view2 = this.b;
        if (bwt0.K(view2)) {
            this.c.H.c(view2);
        }
    }
}
