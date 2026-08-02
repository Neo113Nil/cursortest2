package xsna;

import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import androidx.constraintlayout.widget.ConstraintLayout;
import com.vkontakte.android.R;

/* compiled from: MotionLayoutViewBinding.kt */
/* loaded from: classes7.dex */
public final class cb30 {
    public final ViewGroup a;
    public final of b;
    public final View c;
    public final ViewGroup d;
    public final FrameLayout e;
    public final f0b0 f;
    public final bgj g;
    public final txn0 h;

    public cb30(ViewGroup viewGroup) {
        this.a = viewGroup;
        this.b = (of) viewGroup.findViewById(R.id.minimizableMotionLayout);
        this.c = viewGroup.findViewById(R.id.mainFragmentContainerShadow);
        this.d = (ViewGroup) viewGroup.findViewById(R.id.dialogContainer);
        this.e = (FrameLayout) viewGroup.findViewById(R.id.bottomPromoContainer);
        this.f = new f0b0((ConstraintLayout) viewGroup.findViewById(R.id.playerContainer));
        this.g = new bgj((FrameLayout) viewGroup.findViewById(R.id.contentContainer));
        this.h = new txn0((FrameLayout) viewGroup.findViewById(R.id.tabletRecommendationsContainer));
    }
}
