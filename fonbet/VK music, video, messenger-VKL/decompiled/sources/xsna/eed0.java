package xsna;

import com.vk.newsfeed.posting.impl.domain.model.PostPrivacyData;
import com.vk.newsfeed.posting.impl.domain.model.PostingAction;
import com.vk.newsfeed.posting.impl.presentation.base.fragment.PostingFragment;
import com.vk.newsfeed.posting.privacy_picker.model.PrivacyPostType;
import xsna.xn50;

/* compiled from: PrivacyNavigatorDelegate.kt */
/* loaded from: classes4.dex */
public final class eed0 {
    public final PostingFragment a;
    public final PostingFragment b;
    public final a c;
    public boolean e;
    public PostPrivacyData g;
    public PrivacyPostType d = PrivacyPostType.AllUsers.b;
    public int f = -1;

    /* compiled from: PrivacyNavigatorDelegate.kt */
    public static final class a implements bfd0 {
        public final PostingFragment a;
        public final p00 b;

        public a(PostingFragment postingFragment, p00 p00Var) {
            this.a = postingFragment;
            this.b = p00Var;
        }

        @Override // xsna.bfd0
        public final void a(PostPrivacyData postPrivacyData, boolean z, int i) {
            if (z) {
                this.b.invoke(Integer.valueOf(i), postPrivacyData);
            } else {
                xn50.a.c(this.a, new PostingAction.Editing.PrivacySettingsChanged(postPrivacyData));
            }
        }
    }

    public eed0(PostingFragment postingFragment, PostingFragment postingFragment2) {
        this.a = postingFragment;
        this.b = postingFragment2;
        this.c = new a(postingFragment2, new p00(this, 7));
    }
}
