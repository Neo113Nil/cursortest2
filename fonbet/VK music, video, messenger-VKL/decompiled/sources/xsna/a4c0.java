package xsna;

import android.view.KeyEvent;
import com.vk.common.links.AwayLink;
import com.vk.feed.core.models.Description;
import com.vk.newsfeed.common.views.header.PostHeaderSubtitleTextView;
import com.vk.story.viewer.impl.presentation.stories.b;
import xsna.qjc;

/* compiled from: R8$$SyntheticClass */
/* loaded from: classes4.dex */
public final /* synthetic */ class a4c0 implements qjc.a, b.l {
    public final /* synthetic */ int b;
    public final /* synthetic */ int c;
    public final /* synthetic */ KeyEvent.Callback d;
    public final /* synthetic */ Object e;

    public /* synthetic */ a4c0(PostHeaderSubtitleTextView postHeaderSubtitleTextView, Description description, int i, int i2) {
        this.d = postHeaderSubtitleTextView;
        this.e = description;
        this.b = i;
        this.c = i2;
    }

    @Override // xsna.qjc.a
    public void I(AwayLink awayLink) {
        PostHeaderSubtitleTextView postHeaderSubtitleTextView = (PostHeaderSubtitleTextView) this.d;
        Description description = (Description) this.e;
        int i = PostHeaderSubtitleTextView.D;
        postHeaderSubtitleTextView.f(description, this.b, this.c);
    }

    public /* synthetic */ a4c0(com.vk.story.viewer.impl.presentation.stories.c cVar, int i, int i2, pkk pkkVar) {
        this.d = cVar;
        this.b = i;
        this.c = i2;
        this.e = pkkVar;
    }
}
