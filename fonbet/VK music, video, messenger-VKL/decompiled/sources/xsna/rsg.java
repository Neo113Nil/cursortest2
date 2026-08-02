package xsna;

import android.graphics.Outline;
import android.view.View;
import android.view.ViewOutlineProvider;
import androidx.cardview.widget.CardView;

/* compiled from: CommunityBaseLiveCoverHeaderItem.kt */
/* loaded from: classes5.dex */
public final class rsg extends ViewOutlineProvider {
    public final /* synthetic */ CardView a;

    public rsg(CardView cardView) {
        this.a = cardView;
    }

    @Override // android.view.ViewOutlineProvider
    public final void getOutline(View view, Outline outline) {
        CardView cardView = this.a;
        outline.setRoundRect(0, -((int) cardView.getRadius()), view.getWidth(), view.getHeight(), cardView.getRadius());
    }
}
