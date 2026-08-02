package xsna;

import android.view.ViewGroup;
import com.vk.clips.sdk.shared.feed.model.FeedItem;
import com.vk.core.view.components.placeholder.main.VkPlaceholder;
import com.vkontakte.android.R;
import kotlin.NoWhenBranchMatchedException;
import xsna.tlo0;

/* compiled from: PaginationEmptyViewHolder.kt */
/* loaded from: classes17.dex */
public final class xd90 extends vfz<FeedItem.Pagination.Empty> {
    public final VkPlaceholder l;

    /* compiled from: PaginationEmptyViewHolder.kt */
    public static final /* synthetic */ class a {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;

        static {
            int[] iArr = new int[FeedItem.Pagination.Empty.EmptyType.values().length];
            try {
                iArr[FeedItem.Pagination.Empty.EmptyType.USER_SUBSCRIPTIONS.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[FeedItem.Pagination.Empty.EmptyType.PLAYLIST.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[FeedItem.Pagination.Empty.EmptyType.COAUTHOR_INVITATIONS.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                iArr[FeedItem.Pagination.Empty.EmptyType.DEFAULT.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            $EnumSwitchMapping$0 = iArr;
        }
    }

    public xd90(ViewGroup viewGroup) {
        super(new VkPlaceholder(viewGroup.getContext(), null, 6, 0));
        VkPlaceholder vkPlaceholder = (VkPlaceholder) this.itemView;
        this.l = vkPlaceholder;
        vkPlaceholder.setLayoutParams(new ViewGroup.LayoutParams(-1, -1));
        vkPlaceholder.setMode(VkPlaceholder.Mode.Overlay);
        vkPlaceholder.setImportantForAccessibility(2);
    }

    @Override // xsna.vfz
    public final void W5(FeedItem.Pagination.Empty empty) {
        int i = a.$EnumSwitchMapping$0[empty.b.ordinal()];
        VkPlaceholder vkPlaceholder = this.l;
        if (i == 1) {
            vkPlaceholder.setTop(new VkPlaceholder.c.b(new gko(R.drawable.vk_icon_user_add_outline_56), null, null, 14));
            vkPlaceholder.setMiddle(new VkPlaceholder.b(new VkPlaceholder.b.c(2, tq.h(tlo0.Companion, R.string.clip_feed_subscriptions_stub_title)), new VkPlaceholder.b.C0859b(14, new tlo0.f(R.string.clip_feed_subscriptions_stub_subtitle))));
            return;
        }
        if (i == 2) {
            vkPlaceholder.setTop(new VkPlaceholder.c.b(new gko(R.drawable.vk_icon_list_play_outline_56), null, null, 14));
            vkPlaceholder.setMiddle(new VkPlaceholder.b(new VkPlaceholder.b.c(2, tq.h(tlo0.Companion, R.string.clip_feed_playlist_stub_title)), new VkPlaceholder.b.C0859b(14, null)));
        } else if (i == 3) {
            vkPlaceholder.setTop(new VkPlaceholder.c.b(new gko(R.drawable.vk_icon_logo_clips_outline_56), null, null, 14));
            vkPlaceholder.setMiddle(new VkPlaceholder.b(new VkPlaceholder.b.c(2, tq.h(tlo0.Companion, R.string.clip_feed_coauthor_invites_stub_title)), new VkPlaceholder.b.C0859b(14, null)));
        } else {
            if (i != 4) {
                throw new NoWhenBranchMatchedException();
            }
            vkPlaceholder.setTop(new VkPlaceholder.c.b(new gko(R.drawable.vk_icon_logo_clips_outline_56), null, null, 14));
            vkPlaceholder.setMiddle(new VkPlaceholder.b(new VkPlaceholder.b.c(2, tq.h(tlo0.Companion, R.string.clip_feed_empty_accident_stub_title)), new VkPlaceholder.b.C0859b(14, new tlo0.f(R.string.clip_feed_empty_accident_stub_subtitle))));
        }
    }
}
