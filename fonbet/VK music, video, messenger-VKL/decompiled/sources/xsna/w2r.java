package xsna;

import android.view.View;
import com.vk.ecomm.design.view.feed.FeedProductPinView;
import kotlin.jvm.internal.Ref$IntRef;

/* compiled from: View.kt */
/* loaded from: classes18.dex */
public final class w2r implements View.OnLayoutChangeListener {
    public final /* synthetic */ FeedProductPinView b;
    public final /* synthetic */ Ref$IntRef c;
    public final /* synthetic */ Ref$IntRef d;

    public w2r(FeedProductPinView feedProductPinView, Ref$IntRef ref$IntRef, Ref$IntRef ref$IntRef2) {
        this.b = feedProductPinView;
        this.c = ref$IntRef;
        this.d = ref$IntRef2;
    }

    @Override // android.view.View.OnLayoutChangeListener
    public final void onLayoutChange(View view, int i, int i2, int i3, int i4, int i5, int i6, int i7, int i8) {
        view.removeOnLayoutChangeListener(this);
        FeedProductPinView feedProductPinView = this.b;
        feedProductPinView.e.setX(this.c.element);
        feedProductPinView.e.setY(this.d.element);
        feedProductPinView.getClass();
        feedProductPinView.getClass();
    }
}
