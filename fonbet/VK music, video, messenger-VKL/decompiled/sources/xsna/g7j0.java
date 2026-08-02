package xsna;

import android.app.Activity;
import android.content.Context;
import android.view.View;
import androidx.fragment.app.FragmentActivity;
import com.vk.dto.common.id.UserId;
import com.vk.dto.group.Group;
import com.vk.dto.music.MusicTrack;
import com.vk.dto.music.Playlist;
import com.vk.dto.stories.entities.StorySharingInfo;
import com.vk.dto.user.UserProfile;
import com.vk.feed.core.models.news.NewsEntry;
import com.vk.im.engine.models.ProfilesSimpleInfo;
import com.vk.im.engine.models.dialogs.Dialog;
import com.vk.sharing.api.dto.RepostAttachmentInfo;
import com.vk.sharing.api.dto.WallRepostSettings;
import xsna.ozv;

/* compiled from: ShareBridge.kt */
/* loaded from: classes5.dex */
public interface g7j0 {
    @ozl
    com.vk.im.ui.views.avatars.a a(Context context, String str);

    @ozl
    com.vk.im.ui.views.avatars.a b(Context context, long j, String str);

    ozv.a c(Group group);

    void d(Activity activity, View view, StorySharingInfo storySharingInfo);

    nax0 e(UserId userId, RepostAttachmentInfo repostAttachmentInfo, WallRepostSettings wallRepostSettings, String str, String str2, String str3, boolean z, boolean z2);

    UserProfile f(qtd0 qtd0Var);

    boolean g(String str);

    void h(FragmentActivity fragmentActivity, MusicTrack musicTrack);

    String i(Dialog dialog, ProfilesSimpleInfo profilesSimpleInfo);

    void j(Activity activity, Playlist playlist, NewsEntry newsEntry);

    nax0 k(UserId userId, RepostAttachmentInfo repostAttachmentInfo, WallRepostSettings wallRepostSettings, String str, String str2, String str3, boolean z, boolean z2);

    ozv.b l(UserProfile userProfile);

    String m(Dialog dialog, ProfilesSimpleInfo profilesSimpleInfo);
}
