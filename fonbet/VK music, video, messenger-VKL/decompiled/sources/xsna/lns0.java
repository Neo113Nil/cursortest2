package xsna;

import android.content.Context;
import com.vk.api.comments.CommentsOrder;
import com.vk.api.generated.base.dto.BaseBoolIntDto;
import com.vk.api.generated.base.dto.BaseLikesInfoDto;
import com.vk.api.generated.comment.dto.CommentThreadDto;
import com.vk.api.generated.groups.dto.GroupsGroupFullDto;
import com.vk.api.generated.users.dto.UsersUserFullDto;
import com.vk.api.generated.video.dto.VideoGetCommentsExtendedResponseDto;
import com.vk.api.generated.video.dto.VideoGetCommentsExtendedSortDto;
import com.vk.api.generated.wall.dto.WallWallCommentDto;
import com.vk.api.generated.wall.dto.WallWallpostAttachmentDto;
import com.vk.dto.common.Attachment;
import com.vk.dto.common.Image;
import com.vk.dto.common.id.UserId;
import com.vk.dto.newsfeed.Owner;
import com.vk.dto.newsfeed.PostAuthor;
import com.vk.dto.user.ImageStatus;
import com.vk.libvideo.autoplay.b;
import com.vk.newsfeed.api.data.CommentThread;
import com.vk.newsfeed.api.data.NewsComment;
import com.vk.toggle.Features;
import com.vkontakte.android.R;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;

/* compiled from: VideoGetCommentsExtendedMapper.kt */
/* loaded from: classes4.dex */
public final class lns0 {
    public final pax0 a;
    public final vbs0 b;
    public final boolean c;
    public final b590 d;
    public final List<CommentsOrder.Item> e;

    /* compiled from: VideoGetCommentsExtendedMapper.kt */
    public static final class a implements taz, g0t {
        public final /* synthetic */ m1g b;

        public a(m1g m1gVar) {
            this.b = m1gVar;
        }

        @Override // xsna.taz
        public final /* synthetic */ void a(long j) {
            this.b.invoke(Long.valueOf(j));
        }

        public final boolean equals(Object obj) {
            if ((obj instanceof taz) && (obj instanceof g0t)) {
                return epx.f(getFunctionDelegate(), ((g0t) obj).getFunctionDelegate());
            }
            return false;
        }

        @Override // xsna.g0t
        public final xzs<?> getFunctionDelegate() {
            return this.b;
        }

        public final int hashCode() {
            return getFunctionDelegate().hashCode();
        }
    }

    public lns0(pax0 pax0Var, vbs0 vbs0Var) {
        this.a = pax0Var;
        this.b = vbs0Var;
        Features.Type type = Features.Type.VIDEO_COMMENT_TAB_INTEREST;
        type.getClass();
        this.c = com.vk.toggle.b.A.a(type);
        this.d = new b590();
        String i = VideoGetCommentsExtendedSortDto.MOST_INTERESTING_COMMENTS_FIRST.i();
        Context context = e43.a;
        CommentsOrder.Item item = new CommentsOrder.Item(i, (context == null ? null : context).getString(R.string.tab_popular));
        String i2 = VideoGetCommentsExtendedSortDto.NEWEST_COMMENT_FIRST.i();
        Context context2 = e43.a;
        CommentsOrder.Item item2 = new CommentsOrder.Item(i2, (context2 == null ? null : context2).getString(R.string.tab_new));
        String i3 = VideoGetCommentsExtendedSortDto.OLDEST_COMMENT_FIRST.i();
        Context context3 = e43.a;
        this.e = e43.l(item, item2, new CommentsOrder.Item(i3, (context3 != null ? context3 : null).getString(R.string.tab_old)));
    }

    public final NewsComment a(WallWallCommentDto wallWallCommentDto, UserId userId, VideoGetCommentsExtendedResponseDto videoGetCommentsExtendedResponseDto) {
        Object obj;
        GroupsGroupFullDto groupsGroupFullDto;
        String y1;
        String y12;
        String y13;
        ArrayList<Attachment> arrayList;
        CommentThread commentThread;
        ImageStatus imageStatus;
        ArrayList arrayList2;
        yg5 yg5Var;
        Object obj2;
        int i = 3;
        LinkedHashMap a2 = b590.a(this.d, null, videoGetCommentsExtendedResponseDto.k(), videoGetCommentsExtendedResponseDto.e(), 3);
        Iterator<T> it = videoGetCommentsExtendedResponseDto.k().iterator();
        while (true) {
            if (!it.hasNext()) {
                obj = null;
                break;
            }
            obj = it.next();
            if (((UsersUserFullDto) obj).s1().b == wallWallCommentDto.k().b) {
                break;
            }
        }
        UsersUserFullDto usersUserFullDto = (UsersUserFullDto) obj;
        if (fkq0.b(wallWallCommentDto.k())) {
            Iterator<T> it2 = videoGetCommentsExtendedResponseDto.e().iterator();
            while (true) {
                if (!it2.hasNext()) {
                    obj2 = null;
                    break;
                }
                obj2 = it2.next();
                if (((GroupsGroupFullDto) obj2).P0().b == fkq0.a(wallWallCommentDto.k()).b) {
                    break;
                }
            }
            groupsGroupFullDto = (GroupsGroupFullDto) obj2;
        } else {
            groupsGroupFullDto = null;
        }
        Owner owner = (Owner) a2.get(wallWallCommentDto.k());
        NewsComment newsComment = new NewsComment(2);
        String C = wallWallCommentDto.C();
        bpn0 bpn0Var = com.vk.libvideo.autoplay.b.B;
        xh5 xh5Var = b.C1208b.a().c;
        newsComment.Cb(C, false, true, (xh5Var == null || (yg5Var = xh5Var.a) == null) ? 0 : (int) (yg5Var.getDuration() / 1000), new a(new m1g(this, wallWallCommentDto.getId(), i)));
        if (owner == null || (y1 = owner.c) == null) {
            y1 = groupsGroupFullDto != null ? groupsGroupFullDto.y1() : null;
        }
        newsComment.c = y1;
        if (usersUserFullDto == null || (y12 = usersUserFullDto.K0()) == null) {
            y12 = groupsGroupFullDto != null ? groupsGroupFullDto.y1() : null;
        }
        newsComment.d = y12;
        newsComment.e = "";
        newsComment.f = wallWallCommentDto.g();
        if (usersUserFullDto == null || (y13 = usersUserFullDto.J2()) == null) {
            y13 = groupsGroupFullDto != null ? groupsGroupFullDto.y1() : null;
        }
        newsComment.g = y13;
        newsComment.h = owner != null ? owner.f(200) : null;
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
        Boolean i2 = wallWallCommentDto.i();
        newsComment.s = i2 != null ? i2.booleanValue() : false;
        newsComment.u = false;
        newsComment.v = false;
        BaseLikesInfoDto l3 = wallWallCommentDto.l();
        newsComment.n = (l3 != null ? l3.e() : null) == baseBoolIntDto;
        List<WallWallpostAttachmentDto> d = wallWallCommentDto.d();
        if (d != null) {
            List<WallWallpostAttachmentDto> list = d;
            ArrayList arrayList3 = new ArrayList(c5g.u(list, 10));
            Iterator<T> it3 = list.iterator();
            while (it3.hasNext()) {
                arrayList3.add(this.a.a((WallWallpostAttachmentDto) it3.next(), a2));
            }
            arrayList = p4g.q(arrayList3);
        } else {
            arrayList = new ArrayList<>();
        }
        newsComment.J = arrayList;
        List<Integer> n = wallWallCommentDto.n();
        newsComment.l = n != null ? j5g.N0(n) : null;
        newsComment.O = null;
        newsComment.M = null;
        newsComment.P = null;
        newsComment.Q = null;
        newsComment.R = owner != null ? Boolean.valueOf(owner.q) : null;
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
                List<WallWallCommentDto> list2 = g;
                ArrayList arrayList4 = new ArrayList(c5g.u(list2, 10));
                Iterator<T> it4 = list2.iterator();
                while (it4.hasNext()) {
                    arrayList4.add(a((WallWallCommentDto) it4.next(), userId, videoGetCommentsExtendedResponseDto));
                }
                arrayList2 = new ArrayList(arrayList4);
            } else {
                arrayList2 = new ArrayList();
            }
            ArrayList arrayList5 = arrayList2;
            String i3 = D.i();
            Boolean d2 = D.d();
            commentThread = new CommentThread(count, booleanValue, booleanValue2, booleanValue3, arrayList5, null, i3, d2 != null ? d2.booleanValue() : false, null);
        } else {
            commentThread = null;
        }
        newsComment.L = commentThread;
        newsComment.A = wallWallCommentDto.k().b == userId.b;
        BaseLikesInfoDto l4 = wallWallCommentDto.l();
        newsComment.B = l4 != null ? epx.f(l4.d(), Boolean.TRUE) : false;
        Owner owner2 = (Owner) a2.get(userId);
        Image image = (owner2 == null || (imageStatus = owner2.k) == null) ? null : imageStatus.d;
        Owner owner3 = (Owner) a2.get(userId);
        newsComment.E = new PostAuthor(userId, image, owner3 != null ? owner3.f(200) : null);
        newsComment.z = wallWallCommentDto.f() == BaseBoolIntDto.YES;
        Boolean Q = wallWallCommentDto.Q();
        newsComment.D = Q != null ? Q.booleanValue() : false;
        return newsComment;
    }
}
