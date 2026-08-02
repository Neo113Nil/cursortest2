package xsna;

import android.content.Context;
import com.vk.dto.common.id.UserId;
import com.vk.profile.community.api.router.CommunityMembersSource;
import com.vk.profile.community.api.widget.dto.CommunityWidgetPreviewArguments;

/* compiled from: CommunityRouter.kt */
/* loaded from: classes5.dex */
public interface d0i {
    void a(Context context, CommunityWidgetPreviewArguments communityWidgetPreviewArguments);

    void b(Context context, UserId userId, String str);

    void c(Context context, UserId userId, boolean z, CommunityMembersSource communityMembersSource, String str);

    void d(Context context, UserId userId);
}
