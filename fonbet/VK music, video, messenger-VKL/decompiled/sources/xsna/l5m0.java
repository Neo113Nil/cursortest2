package xsna;

import android.text.TextUtils;
import com.vk.api.generated.groups.dto.GroupsGroupAdminLevelDto;
import com.vk.core.apps.BuildInfo;
import com.vk.core.view.components.button.VkButton;
import com.vk.dto.common.id.UserId;
import com.vk.dto.group.Group;
import com.vk.dto.stories.model.StoryEntry;
import com.vk.dto.stories.model.clickable.ClickableMention;
import com.vk.dto.stories.model.clickable.ClickableSticker;
import com.vk.dto.stories.model.clickable.ClickableStickers;
import com.vk.dto.stories.model.clickable.ClickableVideo;
import com.vk.stories.design.view.viewer.StoryBottomViewGroup;
import com.vkontakte.android.R;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;

/* compiled from: StoryLinkButtonViewController.kt */
/* loaded from: classes6.dex */
public final class l5m0 {
    public final VkButton a;

    static {
        int[] iArr = VkButton.W;
    }

    public l5m0(StoryBottomViewGroup storyBottomViewGroup) {
        this.a = (VkButton) storyBottomViewGroup.findViewById(R.id.fl_link_button);
    }

    public static boolean b(StoryEntry storyEntry, nzl0 nzl0Var) {
        ClickableStickers clickableStickers;
        List<ClickableSticker> list;
        if (!BuildInfo.s() || nzl0Var.a(storyEntry.d) || !storyEntry.q || !storyEntry.D || (clickableStickers = storyEntry.X) == null || (list = clickableStickers.d) == null) {
            return false;
        }
        List<ClickableSticker> list2 = list;
        if ((list2 instanceof Collection) && list2.isEmpty()) {
            return false;
        }
        for (ClickableSticker clickableSticker : list2) {
            ClickableMention clickableMention = clickableSticker instanceof ClickableMention ? (ClickableMention) clickableSticker : null;
            if (clickableMention != null) {
                Group group = clickableMention.i;
                if (group == null) {
                    UserId userId = clickableMention.e;
                    if (userId != null && nzl0Var.a(userId)) {
                        return true;
                    }
                } else if (group.s > GroupsGroupAdminLevelDto.MODERATOR.i()) {
                    return true;
                }
            }
        }
        return false;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r4v1 */
    /* JADX WARN: Type inference failed for: r4v2 */
    /* JADX WARN: Type inference failed for: r4v3, types: [java.lang.Object] */
    public final void a(StoryEntry storyEntry, float f, nzl0 nzl0Var) {
        List<ClickableSticker> list;
        ?? r4;
        VkButton vkButton = this.a;
        if (vkButton == null) {
            return;
        }
        boolean isEmpty = TextUtils.isEmpty(storyEntry.T);
        ClickableStickers clickableStickers = storyEntry.X;
        if (clickableStickers != null && (list = clickableStickers.d) != null) {
            Iterator it = list.iterator();
            while (true) {
                if (!it.hasNext()) {
                    r4 = 0;
                    break;
                } else {
                    r4 = it.next();
                    if (r4 instanceof ClickableVideo) {
                        break;
                    }
                }
            }
            r3 = r4 instanceof ClickableVideo ? r4 : null;
        }
        if (b(storyEntry, nzl0Var)) {
            return;
        }
        if (isEmpty || r3 == null) {
            vkButton.setAlpha(f);
        }
    }
}
