package xsna;

import androidx.coordinatorlayout.widget.CoordinatorLayout;
import com.unity3d.services.UnityAdsConstants;
import com.vk.stories.design.view.HashtagHintsView;
import java.util.ArrayList;
import java.util.List;

/* compiled from: StoryHashtagViewController.kt */
/* loaded from: classes16.dex */
public final class w4m0 implements env {
    public final ivu a;
    public HashtagHintsView b;

    public w4m0(ivu ivuVar) {
        this.a = ivuVar;
    }

    @Override // xsna.env
    public final void a(ArrayList arrayList, List list) {
        HashtagHintsView hashtagHintsView = this.b;
        if (hashtagHintsView != null) {
            hashtagHintsView.a(list, arrayList);
        }
    }

    @Override // xsna.env
    public final HashtagHintsView b(CoordinatorLayout coordinatorLayout) {
        HashtagHintsView hashtagHintsView = new HashtagHintsView(coordinatorLayout.getContext());
        CoordinatorLayout.f fVar = new CoordinatorLayout.f(hashtagHintsView.getLayoutParams());
        fVar.c = 80;
        hashtagHintsView.setLayoutParams(fVar);
        hashtagHintsView.setOnClick(new b4t(this.a));
        this.b = hashtagHintsView;
        return hashtagHintsView;
    }

    @Override // xsna.env
    public final void hide() {
        HashtagHintsView hashtagHintsView = this.b;
        if (hashtagHintsView != null) {
            hashtagHintsView.setAlpha(UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT);
        }
    }
}
