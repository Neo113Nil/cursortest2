package xsna;

import android.view.View;
import android.widget.FrameLayout;
import com.vk.dto.stickers.StickerStockItem;
import kotlin.jvm.internal.Ref$FloatRef;

/* compiled from: ViewExt.kt */
/* loaded from: classes6.dex */
public final class lgy implements View.OnLayoutChangeListener {
    public final /* synthetic */ StickerStockItem b;
    public final /* synthetic */ mgy c;
    public final /* synthetic */ Ref$FloatRef d;
    public final /* synthetic */ FrameLayout e;

    public lgy(StickerStockItem stickerStockItem, mgy mgyVar, Ref$FloatRef ref$FloatRef, FrameLayout frameLayout) {
        this.b = stickerStockItem;
        this.c = mgyVar;
        this.d = ref$FloatRef;
        this.e = frameLayout;
    }

    @Override // android.view.View.OnLayoutChangeListener
    public final void onLayoutChange(View view, int i, int i2, int i3, int i4, int i5, int i6, int i7, int i8) {
        view.removeOnLayoutChangeListener(this);
        if (epx.f(this.b, this.c.f)) {
            this.d.element = this.e.getX();
        }
    }
}
