package xsna;

import android.content.Context;
import android.os.Bundle;
import com.vk.core.ui.tracking.UiTracker;
import com.vk.dto.common.id.UserId;
import com.vk.profile.community.api.router.CommunityMembersSource;
import com.vk.profile.community.api.widget.dto.CommunityWidgetPreviewArguments;
import com.vk.profile.community.impl.ui.members.GroupMembersFragment;
import com.vk.profile.community.impl.ui.widget.CommunityWidgetPreviewFragment;
import com.vk.stat.scheme.CommonCommunitiesStat$ClickEvent;
import kotlin.NoWhenBranchMatchedException;

/* compiled from: CommunityRouterImpl.kt */
/* loaded from: classes5.dex */
public final class e0i implements d0i {

    /* compiled from: CommunityRouterImpl.kt */
    public static final /* synthetic */ class a {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;

        static {
            int[] iArr = new int[CommunityMembersSource.values().length];
            try {
                iArr[CommunityMembersSource.MARKET.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[CommunityMembersSource.MARKETPLACE.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            $EnumSwitchMapping$0 = iArr;
        }
    }

    @Override // xsna.d0i
    public final void a(Context context, CommunityWidgetPreviewArguments communityWidgetPreviewArguments) {
        CommunityWidgetPreviewFragment.a aVar = new CommunityWidgetPreviewFragment.a(CommunityWidgetPreviewFragment.class, null, null);
        aVar.j.putParcelable("widget_preview_arguments", communityWidgetPreviewArguments);
        aVar.i(xa4.L(context), 113);
    }

    @Override // xsna.d0i
    public final void b(Context context, UserId userId, String str) {
        xg5.a().s(context, userId, (r13 & 4) != 0 ? null : "open_page", (r13 & 8) != 0 ? null : str, (r13 & 16) == 0 ? "co_owners" : null);
    }

    @Override // xsna.d0i
    public final void c(Context context, UserId userId, boolean z, CommunityMembersSource communityMembersSource, String str) {
        CommonCommunitiesStat$ClickEvent.Source source;
        if (userId.b >= 0) {
            return;
        }
        UserId e = fkq0.e(userId);
        GroupMembersFragment.a aVar = new GroupMembersFragment.a(GroupMembersFragment.class, null, null);
        Bundle bundle = aVar.j;
        bundle.putParcelable("gid", e);
        bundle.putBoolean("start_from_friends", z);
        if (str != null) {
            bundle.putString("title", str);
        }
        int i = a.$EnumSwitchMapping$0[communityMembersSource.ordinal()];
        if (i == 1) {
            source = CommonCommunitiesStat$ClickEvent.Source.MARKET;
        } else {
            if (i != 2) {
                throw new NoWhenBranchMatchedException();
            }
            source = CommonCommunitiesStat$ClickEvent.Source.MARKETPLACE;
        }
        bundle.putSerializable("source", source);
        UiTracker uiTracker = UiTracker.a;
        bundle.putSerializable("screen", UiTracker.c());
        aVar.k(context);
    }

    @Override // xsna.d0i
    public final void d(Context context, UserId userId) {
        cpu a2 = xg5.a();
        int i = cpu.a;
        a2.g(context, userId, null);
    }
}
