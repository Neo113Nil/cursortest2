package xsna;

import com.vk.camera.editor.stories.api.base.privacy.StoryPrivacyType;
import com.vk.dto.stories.model.StoryEntry;
import com.vkontakte.android.R;
import kotlin.NoWhenBranchMatchedException;
import kotlin.jvm.internal.FunctionReferenceImpl;
import xsna.igm0;
import xsna.khm0;

/* compiled from: StoryStatisticsReducer.kt */
/* loaded from: classes6.dex */
public final /* synthetic */ class mgm0 extends FunctionReferenceImpl implements izs<chm0, khm0.e> {
    @Override // xsna.izs
    public final khm0.e invoke(chm0 chm0Var) {
        chm0 chm0Var2 = chm0Var;
        ((igm0) this.receiver).getClass();
        StoryEntry b = chm0Var2.b();
        boolean z = true;
        boolean z2 = (b == null || !b.Mb() || b.F) ? false : true;
        StoryPrivacyType storyPrivacyType = chm0Var2.i;
        int i = storyPrivacyType == null ? -1 : igm0.a.$EnumSwitchMapping$0[storyPrivacyType.ordinal()];
        int i2 = R.drawable.vk_icon_lock_outline_20;
        int i3 = R.attr.vk_ui_icon_contrast;
        int i4 = R.string.story_statistics_privacy_all;
        int i5 = R.attr.vk_ui_text_contrast;
        switch (i) {
            case -1:
                z = false;
                break;
            case 0:
            default:
                throw new NoWhenBranchMatchedException();
            case 1:
                i2 = R.drawable.vk_icon_unlock_outline_20;
                break;
            case 2:
                i3 = R.attr.vk_ui_icon_accent;
                i5 = R.attr.vk_ui_text_accent;
                i4 = R.string.story_statistics_privacy_friends;
                break;
            case 3:
                i3 = R.attr.vk_ui_icon_positive;
                i5 = R.attr.vk_ui_text_positive;
                i4 = R.string.story_statistics_privacy_best_friend;
                break;
            case 4:
                i4 = R.string.story_statistics_privacy_me;
                break;
            case 5:
                i4 = R.string.story_statistics_privacy_friends_of_friends;
                break;
            case 6:
                i4 = R.string.story_statistics_privacy_some;
                break;
            case 7:
                break;
        }
        return new khm0.e(z2 ? false : z, i2, i3, i4, i5);
    }
}
