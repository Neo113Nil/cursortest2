package xsna;

import android.view.ViewGroup;
import com.vk.camera.editor.stories.api.base.privacy.StoryPrivacyType;
import com.vkontakte.android.R;
import xsna.w9m0;

/* compiled from: StoryPrivacyCloseFriendsItemDelegate.kt */
/* loaded from: classes16.dex */
public final class e9m0 extends p1u0<w9m0.a> {
    public final svk0 a;

    public e9m0(svk0 svk0Var) {
        this.a = svk0Var;
    }

    @Override // xsna.p1u0
    public final vfz<? extends w9m0.a> b(ViewGroup viewGroup) {
        return new f9m0(s3j0.b(viewGroup, R.layout.layout_privacy_best_friends_story_option, viewGroup, false), this.a);
    }

    @Override // xsna.p1u0
    public final boolean c(hfz hfzVar) {
        return (hfzVar instanceof w9m0.a) && ((w9m0.a) hfzVar).b == StoryPrivacyType.BEST_FRIENDS;
    }
}
