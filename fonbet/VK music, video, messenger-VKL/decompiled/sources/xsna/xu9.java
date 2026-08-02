package xsna;

import android.view.View;
import android.view.ViewGroup;
import com.google.android.material.carousel.CarouselLayoutManager;
import com.vk.comments.impl.marketitem.commentlist.presentation.MarketItemCommentsFragment;
import com.vk.writebar.WriteBar;

/* compiled from: R8$$SyntheticClass */
/* loaded from: classes13.dex */
public final /* synthetic */ class xu9 implements View.OnLayoutChangeListener {
    public final /* synthetic */ int b;
    public final /* synthetic */ Object c;

    public /* synthetic */ xu9(Object obj, int i) {
        this.b = i;
        this.c = obj;
    }

    @Override // android.view.View.OnLayoutChangeListener
    public final void onLayoutChange(View view, int i, int i2, int i3, int i4, int i5, int i6, int i7, int i8) {
        ViewGroup bottomSheetContainer;
        switch (this.b) {
            case 0:
                CarouselLayoutManager carouselLayoutManager = (CarouselLayoutManager) this.c;
                if (i != i5 || i2 != i6 || i3 != i7 || i4 != i8) {
                    view.post(new b04(carouselLayoutManager, 2));
                    break;
                }
            default:
                WriteBar writeBar = ((MarketItemCommentsFragment) this.c).T;
                if (writeBar != null && (bottomSheetContainer = writeBar.getBottomSheetContainer()) != null) {
                    f4m.v(writeBar.getHeight(), bottomSheetContainer);
                    break;
                }
                break;
        }
    }
}
