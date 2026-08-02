package xsna;

import android.content.Context;
import android.os.Bundle;
import com.vk.api.comments.CommentsOrder;
import com.vk.api.generated.base.dto.BaseBoolIntDto;
import com.vk.api.generated.base.dto.BaseLikesInfoDto;
import com.vk.api.generated.comment.dto.CommentThreadDto;
import com.vk.api.generated.groups.dto.GroupsGroupFullDto;
import com.vk.api.generated.users.dto.UsersSubscriptionsItemDto;
import com.vk.api.generated.users.dto.UsersUserFullDto;
import com.vk.api.generated.video.dto.VideoCommentOrderDto;
import com.vk.api.generated.video.dto.VideoCommentOrdersDto;
import com.vk.api.generated.video.dto.VideoGetCommentsExtendedResponseDto;
import com.vk.api.generated.wall.dto.WallWallCommentDto;
import com.vk.api.generated.wall.dto.WallWallpostAttachmentDto;
import com.vk.dto.common.Attachment;
import com.vk.dto.common.Image;
import com.vk.dto.common.data.LikeInfo;
import com.vk.dto.common.data.VKList;
import com.vk.dto.common.id.UserId;
import com.vk.dto.newsfeed.Owner;
import com.vk.dto.newsfeed.PostAuthor;
import com.vk.dto.user.ImageStatus;
import com.vk.newsfeed.api.data.CommentThread;
import com.vk.newsfeed.api.data.NewsComment;
import com.vk.newsfeed.api.data.VideoStatistic;
import com.vk.newsfeed.api.data.WallNegativeRepliesPlaceholder;
import com.vkontakte.android.R;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import kotlin.Lazy;
import kotlin.NoWhenBranchMatchedException;
import kotlin.collections.EmptyList;
import xsna.vqt;

/* compiled from: ClipsGetCommentsExtendedMapper.kt */
/* loaded from: classes4.dex */
public final class fae {
    public final Object a;
    public final k2r0 b = new k2r0();

    public fae(Lazy<pax0> lazy) {
        this.a = lazy;
    }

    public static vqt b(fae faeVar, VideoGetCommentsExtendedResponseDto videoGetCommentsExtendedResponseDto, UserId userId, VideoStatistic videoStatistic, boolean z, int i) {
        EmptyList emptyList = EmptyList.b;
        if ((i & 32) != 0) {
            z = false;
        }
        return faeVar.a(videoGetCommentsExtendedResponseDto, userId, videoStatistic, emptyList, false, z);
    }

    /* JADX WARN: Removed duplicated region for block: B:15:0x006e A[LOOP:1: B:13:0x0068->B:15:0x006e, LOOP_END] */
    /* JADX WARN: Removed duplicated region for block: B:19:0x008c  */
    /* JADX WARN: Removed duplicated region for block: B:22:0x009d  */
    /* JADX WARN: Removed duplicated region for block: B:25:0x00aa  */
    /* JADX WARN: Removed duplicated region for block: B:28:0x00ba  */
    /* JADX WARN: Removed duplicated region for block: B:30:0x00c3  */
    /* JADX WARN: Removed duplicated region for block: B:34:0x00df  */
    /* JADX WARN: Removed duplicated region for block: B:49:0x011f  */
    /* JADX WARN: Removed duplicated region for block: B:51:0x0128  */
    /* JADX WARN: Removed duplicated region for block: B:53:0x0131  */
    /* JADX WARN: Removed duplicated region for block: B:55:0x013a  */
    /* JADX WARN: Removed duplicated region for block: B:58:0x014d  */
    /* JADX WARN: Removed duplicated region for block: B:61:0x015a  */
    /* JADX WARN: Removed duplicated region for block: B:64:0x0164  */
    /* JADX WARN: Removed duplicated region for block: B:65:0x0153  */
    /* JADX WARN: Removed duplicated region for block: B:66:0x0136  */
    /* JADX WARN: Removed duplicated region for block: B:67:0x012d  */
    /* JADX WARN: Removed duplicated region for block: B:68:0x0124  */
    /* JADX WARN: Removed duplicated region for block: B:69:0x00c7  */
    /* JADX WARN: Removed duplicated region for block: B:70:0x00c0  */
    /* JADX WARN: Removed duplicated region for block: B:71:0x00af  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final vqt a(VideoGetCommentsExtendedResponseDto videoGetCommentsExtendedResponseDto, UserId userId, VideoStatistic videoStatistic, List<? extends UsersSubscriptionsItemDto> list, boolean z, boolean z2) {
        CommentsOrder commentsOrder;
        Iterator<T> it;
        LikeInfo likeInfo;
        VideoCommentOrdersDto i = videoGetCommentsExtendedResponseDto.i();
        if (i != null) {
            if (!z) {
                i = null;
            }
            if (i != null) {
                String i2 = i.d().i();
                List<VideoCommentOrderDto> e = i.e();
                ArrayList arrayList = new ArrayList(c5g.u(e, 10));
                for (VideoCommentOrderDto videoCommentOrderDto : e) {
                    arrayList.add(new CommentsOrder.Item(videoCommentOrderDto.d().i(), videoCommentOrderDto.e()));
                }
                commentsOrder = new CommentsOrder(i2, arrayList);
                List<WallWallCommentDto> f = videoGetCommentsExtendedResponseDto.f();
                ArrayList arrayList2 = new ArrayList(c5g.u(f, 10));
                it = f.iterator();
                while (it.hasNext()) {
                    arrayList2.add(c((WallWallCommentDto) it.next(), userId, videoGetCommentsExtendedResponseDto.k(), videoGetCommentsExtendedResponseDto.e()));
                }
                Collection collection = arrayList2;
                if (z2) {
                    collection = j5g.y0(arrayList2);
                }
                VKList vKList = new VKList(collection);
                if (videoGetCommentsExtendedResponseDto.getCount() > 0) {
                    vKList.o(videoGetCommentsExtendedResponseDto.getCount());
                }
                Integer d = videoGetCommentsExtendedResponseDto.d();
                int intValue = d == null ? d.intValue() : videoGetCommentsExtendedResponseDto.getCount();
                Integer l = videoGetCommentsExtendedResponseDto.l();
                int intValue2 = l == null ? l.intValue() : 0;
                String str = commentsOrder == null ? commentsOrder.b : null;
                List<? extends UsersSubscriptionsItemDto> list2 = list;
                ArrayList arrayList3 = new ArrayList(c5g.u(list2, 10));
                for (UsersSubscriptionsItemDto usersSubscriptionsItemDto : list2) {
                    Bundle bundle = new Bundle();
                    if (usersSubscriptionsItemDto instanceof UsersSubscriptionsItemDto.UsersUserFullDto) {
                        bundle.putString("photo", ((UsersSubscriptionsItemDto.UsersUserFullDto) usersSubscriptionsItemDto).o());
                        likeInfo = new LikeInfo(1, bundle, false);
                    } else {
                        if (!(usersSubscriptionsItemDto instanceof UsersSubscriptionsItemDto.GroupsGroupFullDto)) {
                            throw new NoWhenBranchMatchedException();
                        }
                        bundle.putString("photo", ((UsersSubscriptionsItemDto.GroupsGroupFullDto) usersSubscriptionsItemDto).p());
                        likeInfo = new LikeInfo(2, bundle, false);
                    }
                    arrayList3.add(likeInfo);
                }
                vqt.a aVar = new vqt.a(arrayList3, videoStatistic == null ? videoStatistic.b : 0, videoStatistic == null ? videoStatistic.d : 0, videoStatistic == null ? videoStatistic.c : 0, videoStatistic != null ? videoStatistic.e : false, null, null);
                Integer g = videoGetCommentsExtendedResponseDto.g();
                return new vqt(vKList, intValue, intValue2, null, null, commentsOrder, str, aVar, g == null ? g.toString() : null, videoGetCommentsExtendedResponseDto.g() == null ? new WallNegativeRepliesPlaceholder("", null, null) : null, 0);
            }
        }
        commentsOrder = null;
        List<WallWallCommentDto> f2 = videoGetCommentsExtendedResponseDto.f();
        ArrayList arrayList22 = new ArrayList(c5g.u(f2, 10));
        it = f2.iterator();
        while (it.hasNext()) {
        }
        Collection collection2 = arrayList22;
        if (z2) {
        }
        VKList vKList2 = new VKList(collection2);
        if (videoGetCommentsExtendedResponseDto.getCount() > 0) {
        }
        Integer d2 = videoGetCommentsExtendedResponseDto.d();
        if (d2 == null) {
        }
        Integer l2 = videoGetCommentsExtendedResponseDto.l();
        if (l2 == null) {
        }
        if (commentsOrder == null) {
        }
        List<? extends UsersSubscriptionsItemDto> list22 = list;
        ArrayList arrayList32 = new ArrayList(c5g.u(list22, 10));
        while (r2.hasNext()) {
        }
        vqt.a aVar2 = new vqt.a(arrayList32, videoStatistic == null ? videoStatistic.b : 0, videoStatistic == null ? videoStatistic.d : 0, videoStatistic == null ? videoStatistic.c : 0, videoStatistic != null ? videoStatistic.e : false, null, null);
        Integer g2 = videoGetCommentsExtendedResponseDto.g();
        return new vqt(vKList2, intValue, intValue2, null, null, commentsOrder, str, aVar2, g2 == null ? g2.toString() : null, videoGetCommentsExtendedResponseDto.g() == null ? new WallNegativeRepliesPlaceholder("", null, null) : null, 0);
    }

    /* JADX WARN: Type inference failed for: r15v3, types: [java.lang.Object, kotlin.Lazy] */
    public final NewsComment c(WallWallCommentDto wallWallCommentDto, UserId userId, List<UsersUserFullDto> list, List<GroupsGroupFullDto> list2) {
        UsersUserFullDto usersUserFullDto;
        GroupsGroupFullDto groupsGroupFullDto;
        String str;
        Object obj;
        String sb;
        String r2;
        String D1;
        ArrayList<Attachment> arrayList;
        CommentThread commentThread;
        ImageStatus imageStatus;
        ArrayList arrayList2;
        Object obj2;
        Object obj3;
        UserId k = wallWallCommentDto.k();
        if (!fkq0.d(k)) {
            k = null;
        }
        if (k != null) {
            Iterator<T> it = list.iterator();
            while (true) {
                if (!it.hasNext()) {
                    obj3 = null;
                    break;
                }
                obj3 = it.next();
                if (((UsersUserFullDto) obj3).s1().b == k.b) {
                    break;
                }
            }
            usersUserFullDto = (UsersUserFullDto) obj3;
        } else {
            usersUserFullDto = null;
        }
        UserId k2 = wallWallCommentDto.k();
        if (!fkq0.b(k2)) {
            k2 = null;
        }
        if (k2 != null) {
            Iterator<T> it2 = list2.iterator();
            while (true) {
                if (!it2.hasNext()) {
                    obj2 = null;
                    break;
                }
                obj2 = it2.next();
                if (Math.abs(((GroupsGroupFullDto) obj2).P0().b) == Math.abs(k2.b)) {
                    break;
                }
            }
            groupsGroupFullDto = (GroupsGroupFullDto) obj2;
        } else {
            groupsGroupFullDto = null;
        }
        LinkedHashMap b = this.b.b(list);
        UserId B = wallWallCommentDto.B();
        if (B == null || !fkq0.b(B)) {
            UserId B2 = wallWallCommentDto.B();
            if (B2 != null && fkq0.d(B2)) {
                Iterator<T> it3 = list.iterator();
                while (true) {
                    if (!it3.hasNext()) {
                        obj = null;
                        break;
                    }
                    obj = it3.next();
                    UsersUserFullDto usersUserFullDto2 = (UsersUserFullDto) obj;
                    UserId B3 = wallWallCommentDto.B();
                    if (B3 != null && usersUserFullDto2.s1().b == B3.b) {
                        break;
                    }
                }
                UsersUserFullDto usersUserFullDto3 = (UsersUserFullDto) obj;
                if (usersUserFullDto3 != null) {
                    str = usersUserFullDto3.J2();
                }
            }
            str = null;
        } else {
            Context context = e43.a;
            if (context == null) {
                context = null;
            }
            str = context.getString(R.string.comment_to_community);
        }
        Owner owner = (Owner) b.get(wallWallCommentDto.k());
        ImageStatus imageStatus2 = owner != null ? owner.k : null;
        NewsComment newsComment = new NewsComment();
        newsComment.Bb(wallWallCommentDto.C(), true);
        if (groupsGroupFullDto == null || (sb = groupsGroupFullDto.y1()) == null) {
            StringBuilder sb2 = new StringBuilder();
            sb2.append(usersUserFullDto != null ? usersUserFullDto.D0() : null);
            sb2.append(' ');
            sb2.append(usersUserFullDto != null ? usersUserFullDto.x1() : null);
            sb = sb2.toString();
        }
        newsComment.c = sb;
        newsComment.d = usersUserFullDto != null ? usersUserFullDto.K0() : null;
        newsComment.e = "";
        newsComment.f = wallWallCommentDto.g();
        newsComment.g = str;
        if (groupsGroupFullDto == null || (r2 = groupsGroupFullDto.V1()) == null) {
            r2 = usersUserFullDto != null ? usersUserFullDto.r2() : null;
        }
        if (r2 == null || (D1 = js5.a(100, r2)) == null) {
            D1 = groupsGroupFullDto != null ? groupsGroupFullDto.D1() : null;
            if (D1 == null) {
                D1 = usersUserFullDto != null ? usersUserFullDto.i2() : null;
            }
        }
        newsComment.h = D1;
        newsComment.i = wallWallCommentDto.getId();
        newsComment.j = wallWallCommentDto.k();
        Integer u = wallWallCommentDto.u();
        newsComment.k = u != null ? u.intValue() : 0;
        BaseBoolIntDto e = wallWallCommentDto.e();
        BaseBoolIntDto baseBoolIntDto = BaseBoolIntDto.YES;
        newsComment.m = e == baseBoolIntDto;
        BaseLikesInfoDto l = wallWallCommentDto.l();
        newsComment.p = l != null ? l.getCount() : 0;
        BaseLikesInfoDto l2 = wallWallCommentDto.l();
        newsComment.q = (l2 != null ? l2.i() : null) == baseBoolIntDto;
        Boolean i = wallWallCommentDto.i();
        newsComment.s = i != null ? i.booleanValue() : false;
        newsComment.u = false;
        newsComment.v = false;
        BaseLikesInfoDto l3 = wallWallCommentDto.l();
        newsComment.n = (l3 != null ? l3.e() : null) == baseBoolIntDto;
        List<WallWallpostAttachmentDto> d = wallWallCommentDto.d();
        if (d != null) {
            List<WallWallpostAttachmentDto> list3 = d;
            ArrayList arrayList3 = new ArrayList(c5g.u(list3, 10));
            Iterator<T> it4 = list3.iterator();
            while (it4.hasNext()) {
                arrayList3.add(((pax0) this.a.getValue()).a((WallWallpostAttachmentDto) it4.next(), b));
            }
            arrayList = p4g.q(arrayList3);
        } else {
            arrayList = new ArrayList<>();
        }
        newsComment.J = arrayList;
        List<Integer> n = wallWallCommentDto.n();
        newsComment.l = n != null ? j5g.N0(n) : null;
        newsComment.O = imageStatus2;
        newsComment.M = null;
        newsComment.P = null;
        newsComment.Q = null;
        newsComment.R = usersUserFullDto != null ? usersUserFullDto.n1() : null;
        newsComment.V = null;
        newsComment.W = null;
        CommentThreadDto D = wallWallCommentDto.D();
        if (D != null) {
            int count = D.getCount();
            Boolean e2 = D.e();
            boolean booleanValue = e2 != null ? e2.booleanValue() : true;
            Boolean f = D.f();
            boolean booleanValue2 = f != null ? f.booleanValue() : false;
            Boolean j = D.j();
            boolean booleanValue3 = j != null ? j.booleanValue() : false;
            List<WallWallCommentDto> g = D.g();
            if (g != null) {
                List<WallWallCommentDto> list4 = g;
                ArrayList arrayList4 = new ArrayList(c5g.u(list4, 10));
                Iterator<T> it5 = list4.iterator();
                while (it5.hasNext()) {
                    arrayList4.add(c((WallWallCommentDto) it5.next(), userId, list, list2));
                }
                arrayList2 = new ArrayList(arrayList4);
            } else {
                arrayList2 = new ArrayList();
            }
            ArrayList arrayList5 = arrayList2;
            String i2 = D.i();
            Boolean d2 = D.d();
            commentThread = new CommentThread(count, booleanValue, booleanValue2, booleanValue3, arrayList5, null, i2, d2 != null ? d2.booleanValue() : false, null);
        } else {
            commentThread = null;
        }
        newsComment.L = commentThread;
        newsComment.A = fxc0.B().J().h0() ? epx.f(wallWallCommentDto.F(), Boolean.TRUE) || epx.f(userId, wallWallCommentDto.k()) : epx.f(wallWallCommentDto.F(), Boolean.TRUE);
        BaseLikesInfoDto l4 = wallWallCommentDto.l();
        newsComment.B = l4 != null ? epx.f(l4.d(), Boolean.TRUE) : false;
        Owner owner2 = (Owner) b.get(userId);
        Image image = (owner2 == null || (imageStatus = owner2.k) == null) ? null : imageStatus.d;
        Owner owner3 = (Owner) b.get(userId);
        newsComment.E = new PostAuthor(userId, image, owner3 != null ? owner3.f(200) : null);
        newsComment.z = wallWallCommentDto.f() == BaseBoolIntDto.YES;
        Boolean Q = wallWallCommentDto.Q();
        newsComment.D = Q != null ? Q.booleanValue() : false;
        return newsComment;
    }
}
