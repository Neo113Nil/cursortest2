package xsna;

import com.mbridge.msdk.foundation.entity.CampaignEx;
import com.vk.api.generated.channels.dto.ChannelsCommentThreadDto;
import com.vk.api.generated.channels.dto.ChannelsGetCommentsResponseDto;
import com.vk.api.generated.channels.dto.ChannelsMessageCommentDto;
import com.vk.api.generated.likes.dto.LikesItemReactionDto;
import com.vk.api.generated.likes.dto.LikesItemReactionsDto;
import com.vk.api.generated.wall.dto.WallNegativeRepliesPlaceholderDto;
import com.vk.api.generated.wall.dto.WallWallpostAttachmentDto;
import com.vk.channels.api.CommentsHistory;
import com.vk.dto.common.id.UserId;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.collections.EmptyList;
import xsna.hag;

/* compiled from: CommentsApiMapper.kt */
/* loaded from: classes2.dex */
public final class xdg {

    /* compiled from: CommentsApiMapper.kt */
    public static final /* synthetic */ class a {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;

        static {
            int[] iArr = new int[CommentsHistory.Order.values().length];
            try {
                iArr[CommentsHistory.Order.ASC.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[CommentsHistory.Order.DESC.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            $EnumSwitchMapping$0 = iArr;
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r5v0, types: [kotlin.collections.EmptyList] */
    /* JADX WARN: Type inference failed for: r5v1 */
    /* JADX WARN: Type inference failed for: r5v3, types: [java.util.ArrayList] */
    public static final hag a(ChannelsMessageCommentDto channelsMessageCommentDto) {
        List list;
        CommentsHistory commentsHistory;
        int i;
        int i2;
        hag.b bVar;
        int id = channelsMessageCommentDto.getId();
        UserId i3 = channelsMessageCommentDto.i();
        String o = channelsMessageCommentDto.o();
        List<WallWallpostAttachmentDto> d = channelsMessageCommentDto.d();
        if (d != null) {
            List<WallWallpostAttachmentDto> list2 = d;
            list = new ArrayList(c5g.u(list2, 10));
            for (WallWallpostAttachmentDto wallWallpostAttachmentDto : list2) {
                list.add(new Object());
            }
        } else {
            list = EmptyList.b;
        }
        int f = channelsMessageCommentDto.f();
        ChannelsCommentThreadDto p = channelsMessageCommentDto.p();
        if (p != null) {
            List<ChannelsMessageCommentDto> d2 = p.d();
            commentsHistory = new CommentsHistory(d2 != null ? c(d2) : EmptyList.b, p.getCount(), CommentsHistory.Order.ASC, p.f(), d(p.e()), 32);
        } else {
            commentsHistory = CommentsHistory.h;
        }
        CommentsHistory commentsHistory2 = commentsHistory;
        List<Integer> j = channelsMessageCommentDto.j();
        if (j == null) {
            j = EmptyList.b;
        }
        Boolean g = channelsMessageCommentDto.g();
        boolean booleanValue = g != null ? g.booleanValue() : false;
        Boolean e = channelsMessageCommentDto.e();
        boolean booleanValue2 = e != null ? e.booleanValue() : false;
        UserId n = channelsMessageCommentDto.n();
        Integer l = channelsMessageCommentDto.l();
        LikesItemReactionsDto k = channelsMessageCommentDto.k();
        if (k != null) {
            int count = k.getCount();
            List<LikesItemReactionDto> d3 = k.d();
            ArrayList arrayList = new ArrayList(c5g.u(d3, 10));
            for (LikesItemReactionDto likesItemReactionDto : d3) {
                arrayList.add(new hag.a(likesItemReactionDto.getId(), likesItemReactionDto.getCount()));
                f = f;
                id = id;
            }
            i = f;
            i2 = id;
            bVar = new hag.b(count, arrayList, k.e());
        } else {
            i = f;
            i2 = id;
            bVar = null;
        }
        return new hag(i2, i3, o, list, i, commentsHistory2, j, booleanValue, booleanValue2, n, l, bVar, channelsMessageCommentDto.u(), false, false);
    }

    public static final CommentsHistory b(ChannelsGetCommentsResponseDto channelsGetCommentsResponseDto) {
        ArrayList c = c(channelsGetCommentsResponseDto.e());
        Integer d = channelsGetCommentsResponseDto.d();
        int intValue = d != null ? d.intValue() : 0;
        int count = channelsGetCommentsResponseDto.getCount();
        String i = channelsGetCommentsResponseDto.i();
        return new CommentsHistory(c, intValue, count, epx.f(i, "asc") ? CommentsHistory.Order.ASC : epx.f(i, CampaignEx.JSON_KEY_DESC) ? CommentsHistory.Order.DESC : CommentsHistory.Order.ASC, channelsGetCommentsResponseDto.g(), channelsGetCommentsResponseDto.j(), d(channelsGetCommentsResponseDto.f()));
    }

    public static final ArrayList c(List list) {
        List list2 = list;
        ArrayList arrayList = new ArrayList(c5g.u(list2, 10));
        Iterator it = list2.iterator();
        while (it.hasNext()) {
            arrayList.add(a((ChannelsMessageCommentDto) it.next()));
        }
        return arrayList;
    }

    public static final r060 d(WallNegativeRepliesPlaceholderDto wallNegativeRepliesPlaceholderDto) {
        if (wallNegativeRepliesPlaceholderDto == null) {
            return null;
        }
        String title = wallNegativeRepliesPlaceholderDto.getTitle();
        if (title == null) {
            title = "";
        }
        String e = wallNegativeRepliesPlaceholderDto.e();
        if (e == null) {
            e = "";
        }
        String d = wallNegativeRepliesPlaceholderDto.d();
        return new r060(title, e, d != null ? d : "");
    }
}
