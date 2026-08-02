package xsna;

import android.graphics.Outline;
import android.view.View;
import android.view.ViewOutlineProvider;
import androidx.cardview.widget.CardView;

/* compiled from: CommunityLiveCoverHeaderRedesignItem.kt */
/* loaded from: classes5.dex */
public final class m8h extends ViewOutlineProvider {
    public final /* synthetic */ CardView a;

    public m8h(CardView cardView) {
        this.a = cardView;
    }

    @Override // android.view.ViewOutlineProvider
    public final void getOutline(View view, Outline outline) {
        CardView cardView = this.a;
        outline.setRoundRect(0, -((int) cardView.getRadius()), view.getWidth(), view.getHeight(), cardView.getRadius());
    }
}
