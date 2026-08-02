package xsna;

import android.graphics.Outline;
import android.view.View;
import android.view.ViewOutlineProvider;
import com.vkontakte.android.R;

/* compiled from: ChipsOutlineProvider.kt */
/* loaded from: classes16.dex */
public final class ibc extends ViewOutlineProvider {
    @Override // android.view.ViewOutlineProvider
    public final void getOutline(View view, Outline outline) {
        float dimension = view.getResources().getDimension(R.dimen.video_catalog_chips_corner_radius);
        int y = bwt0.y(R.dimen.video_catalog_chips_outline_padding, view);
        outline.setRoundRect(y, y, view.getWidth() - y, view.getHeight() - y, dimension);
    }
}
