package xsna;

import android.view.View;
import android.widget.ImageView;

/* compiled from: ViewExt.kt */
/* loaded from: classes16.dex */
public final class i6b implements View.OnLayoutChangeListener {
    public final /* synthetic */ ImageView b;
    public final /* synthetic */ com.vk.channels.impl.channel_screen.send_msg.a c;

    public i6b(ImageView imageView, com.vk.channels.impl.channel_screen.send_msg.a aVar) {
        this.b = imageView;
        this.c = aVar;
    }

    @Override // android.view.View.OnLayoutChangeListener
    public final void onLayoutChange(View view, int i, int i2, int i3, int i4, int i5, int i6, int i7, int i8) {
        view.removeOnLayoutChangeListener(this);
        ImageView imageView = this.b;
        if (bwt0.K(imageView)) {
            com.vk.channels.impl.channel_screen.send_msg.a aVar = this.c;
            a6b a6bVar = (a6b) aVar.N.getValue();
            boolean z = aVar.h;
            j6b j6bVar = new j6b(aVar, 0);
            q7v0 q7v0Var = a6bVar.a;
            if (a6bVar.b) {
                return;
            }
            q7v0Var.init();
            q7v0Var.c(new x5b(z, a6bVar, imageView, j6bVar));
        }
    }
}
