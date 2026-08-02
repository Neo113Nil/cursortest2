package xsna;

import android.view.View;
import android.widget.FrameLayout;
import com.vkontakte.android.R;

/* compiled from: StoryStatisticsBottomMviView.kt */
/* loaded from: classes6.dex */
public final class eem0 implements gm50 {
    public final hem0 b;
    public final FrameLayout c;

    public eem0(View view, hem0 hem0Var) {
        this.b = hem0Var;
        this.c = (FrameLayout) view.findViewById(R.id.story_statistics_bottom_container);
    }

    @Override // xsna.gm50
    public final f5z getViewOwner() {
        return this.b;
    }
}
