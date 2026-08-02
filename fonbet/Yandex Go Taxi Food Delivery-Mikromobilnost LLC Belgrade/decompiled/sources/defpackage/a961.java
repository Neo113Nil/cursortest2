package defpackage;

import android.view.View;
import com.ybsdk.core.stories.StoriesComponentView;
import com.ybsdk.feature.divkit.api.ui.YbDivView;
import com.ybsdk.widgets.common.CloseButtonView;
import com.ybsdk.widgets.common.ErrorView;
import com.ybsdk.widgets.common.communication.CommunicationFullScreenView;
import com.ybsdk.widgets.common.storybar.YbSdkStoryProgressBar;

/* loaded from: classes2.dex */
public final class a961 implements zo31 {
    public final StoriesComponentView a;
    public final View b;
    public final View c;
    public final CloseButtonView d;
    public final CommunicationFullScreenView e;
    public final YbDivView f;
    public final YbDivView g;
    public final ErrorView h;
    public final YbSdkStoryProgressBar i;
    public final View j;

    public a961(StoriesComponentView storiesComponentView, View view, View view2, CloseButtonView closeButtonView, CommunicationFullScreenView communicationFullScreenView, YbDivView ybDivView, YbDivView ybDivView2, ErrorView errorView, YbSdkStoryProgressBar ybSdkStoryProgressBar, View view3) {
        this.a = storiesComponentView;
        this.b = view;
        this.c = view2;
        this.d = closeButtonView;
        this.e = communicationFullScreenView;
        this.f = ybDivView;
        this.g = ybDivView2;
        this.h = errorView;
        this.i = ybSdkStoryProgressBar;
        this.j = view3;
    }

    @Override // defpackage.zo31
    public final View getRoot() {
        return this.a;
    }
}
