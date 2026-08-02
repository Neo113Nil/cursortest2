package xsna;

import com.vk.api.generated.base.dto.BaseBoolIntDto;
import com.vk.api.generated.base.dto.BaseLikesInfoDto;
import com.vk.api.generated.base.dto.BaseLinkButtonActionDto;
import com.vk.api.generated.base.dto.BaseLinkButtonDto;
import com.vk.api.generated.base.dto.BaseLinkButtonStyleDto;
import com.vk.api.generated.groups.dto.GroupsGroupFullMemberStatusDto;
import com.vk.api.generated.likes.dto.LikesItemReactionsDto;
import com.vk.api.generated.wall.dto.WallPostActivityDto;
import com.vk.api.generated.wall.dto.WallPostActivityEventEventDto;
import com.vk.api.generated.wall.dto.WallPostActivityLikesLikesDto;
import com.vk.api.generated.wall.dto.WallWallCommentDonutDto;
import com.vk.api.generated.wall.dto.WallWallCommentDonutPlaceholderDto;
import com.vk.api.generated.wall.dto.WallWallCommentDto;
import com.vk.api.generated.wall.dto.WallWallpostAttachmentDto;
import com.vk.dto.common.Attachment;
import com.vk.dto.common.LinkButton;
import com.vk.dto.common.actions.Action;
import com.vk.dto.common.id.UserId;
import com.vk.dto.newsfeed.CommentDonut;
import com.vk.dto.newsfeed.Owner;
import com.vk.dto.newsfeed.activities.Activity;
import com.vk.dto.newsfeed.activities.Comment;
import com.vk.dto.newsfeed.activities.CommentsActivity;
import com.vk.dto.newsfeed.activities.EventActivity;
import com.vk.dto.newsfeed.activities.LikesActivity;
import com.vk.dto.newsfeed.activities.RepostToStoryActivity;
import com.vk.dto.reactions.ItemReactions;
import com.vk.dto.reactions.ReactionSet;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import kotlin.NoWhenBranchMatchedException;
import kotlin.collections.EmptyList;

/* compiled from: WallPostActivityDtoToActivityMapper.kt */
/* loaded from: classes3.dex */
public final class u9x0 {
    public final oax0 a;

    /* compiled from: WallPostActivityDtoToActivityMapper.kt */
    public static final /* synthetic */ class a {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;
        public static final /* synthetic */ int[] $EnumSwitchMapping$1;

        static {
            int[] iArr = new int[WallPostActivityLikesLikesDto.TypeDto.values().length];
            try {
                iArr[WallPostActivityLikesLikesDto.TypeDto.ON_CONTENT.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[WallPostActivityLikesLikesDto.TypeDto.DEFAULT.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            $EnumSwitchMapping$0 = iArr;
            int[] iArr2 = new int[WallPostActivityDto.WallPostActivityReplyDto.DisplayTypeDto.values().length];
            try {
                iArr2[WallPostActivityDto.WallPostActivityReplyDto.DisplayTypeDto.ON_CONTENT.ordinal()] = 1;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                iArr2[WallPostActivityDto.WallPostActivityReplyDto.DisplayTypeDto.DEFAULT.ordinal()] = 2;
            } catch (NoSuchFieldError unused4) {
            }
            $EnumSwitchMapping$1 = iArr2;
        }
    }

    public u9x0(oax0 oax0Var) {
        this.a = oax0Var;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r4v3, types: [kotlin.collections.EmptyList] */
    /* JADX WARN: Type inference failed for: r4v4 */
    /* JADX WARN: Type inference failed for: r4v8, types: [java.util.ArrayList] */
    public final Activity a(WallPostActivityDto wallPostActivityDto, ReactionSet reactionSet, Map<UserId, Owner> map, boolean z) {
        GroupsGroupFullMemberStatusDto groupsGroupFullMemberStatusDto;
        String e;
        Integer j;
        List<UserId> f;
        ?? r4;
        List<UserId> f2;
        if (wallPostActivityDto instanceof WallPostActivityDto.WallPostActivityLikesDto) {
            WallPostActivityDto.WallPostActivityLikesDto wallPostActivityLikesDto = (WallPostActivityDto.WallPostActivityLikesDto) wallPostActivityDto;
            if (map == null) {
                map = jgp.b;
            }
            WallPostActivityLikesLikesDto d = wallPostActivityLikesDto.d();
            ArrayList arrayList = new ArrayList();
            if (d == null || (f2 = d.f()) == null) {
                r4 = EmptyList.b;
            } else {
                r4 = new ArrayList();
                for (UserId userId : f2) {
                    if (z) {
                        Owner owner = map.get(userId);
                        arrayList.add(owner != null ? owner.d : null);
                    } else {
                        Owner owner2 = map.get(userId);
                        arrayList.add(owner2 != null ? owner2.e : null);
                    }
                    Owner owner3 = map.get(userId);
                    if (owner3 != null) {
                        r4.add(owner3);
                    }
                }
            }
            List list = r4;
            WallPostActivityLikesLikesDto d2 = wallPostActivityLikesDto.d();
            WallPostActivityLikesLikesDto.TypeDto e2 = d2 != null ? d2.e() : null;
            int i = e2 == null ? -1 : a.$EnumSwitchMapping$0[e2.ordinal()];
            LikesActivity.Position position = i != 1 ? i != 2 ? LikesActivity.Position.DEFAULT : LikesActivity.Position.DEFAULT : LikesActivity.Position.ON_CONTENT;
            e = d != null ? d.d() : null;
            return new LikesActivity(e == null ? "" : e, arrayList, list, position, reactionSet);
        }
        if (wallPostActivityDto instanceof WallPostActivityDto.WallPostActivityReplyDto) {
            WallPostActivityDto.WallPostActivityReplyDto wallPostActivityReplyDto = (WallPostActivityDto.WallPostActivityReplyDto) wallPostActivityDto;
            return b(wallPostActivityReplyDto.d(), reactionSet, map, wallPostActivityReplyDto.f(), false, wallPostActivityReplyDto.e());
        }
        if (wallPostActivityDto instanceof WallPostActivityDto.WallPostActivityReplyInputDto) {
            return b(((WallPostActivityDto.WallPostActivityReplyInputDto) wallPostActivityDto).d(), reactionSet, map, null, true, null);
        }
        if (!(wallPostActivityDto instanceof WallPostActivityDto.WallPostActivityEventDto)) {
            if (wallPostActivityDto instanceof WallPostActivityDto.WallPostActivityShareToStoryDto) {
                return new RepostToStoryActivity();
            }
            if ((wallPostActivityDto instanceof WallPostActivityDto.WallPostActivityBottomExtensionDto) || (wallPostActivityDto instanceof WallPostActivityDto.WallPostActivityClassifiedsDetectedDto) || (wallPostActivityDto instanceof WallPostActivityDto.WallPostActivityClassifiedsBottomExtensionDto)) {
                return null;
            }
            throw new NoWhenBranchMatchedException();
        }
        WallPostActivityEventEventDto d3 = ((WallPostActivityDto.WallPostActivityEventDto) wallPostActivityDto).d();
        ArrayList arrayList2 = new ArrayList();
        if (map != null && d3 != null && (f = d3.f()) != null) {
            Iterator it = f.iterator();
            while (it.hasNext()) {
                Owner owner4 = map.get((UserId) it.next());
                arrayList2.add(owner4 != null ? owner4.e : null);
            }
        }
        int intValue = (d3 == null || (j = d3.j()) == null) ? 0 : j.intValue();
        String d4 = d3 != null ? d3.d() : null;
        String str = d4 == null ? "" : d4;
        if (d3 == null || (groupsGroupFullMemberStatusDto = d3.g()) == null) {
            groupsGroupFullMemberStatusDto = GroupsGroupFullMemberStatusDto.NOT_A_MEMBER;
        }
        int i2 = groupsGroupFullMemberStatusDto.i();
        String i3 = d3 != null ? d3.i() : null;
        String str2 = i3 == null ? "" : i3;
        e = d3 != null ? d3.e() : null;
        return new EventActivity(intValue, str, i2, str2, e == null ? "" : e, arrayList2);
    }

    public final CommentsActivity b(List<WallWallCommentDto> list, ReactionSet reactionSet, Map<UserId, Owner> map, UserId userId, boolean z, WallPostActivityDto.WallPostActivityReplyDto.DisplayTypeDto displayTypeDto) {
        List list2;
        Iterator it;
        WallWallCommentDto wallWallCommentDto;
        CommentDonut commentDonut;
        Owner owner;
        CommentDonut.Placeholder placeholder;
        LinkButton linkButton;
        Action b;
        int size = list != null ? list.size() : 0;
        ArrayList arrayList = new ArrayList(size);
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        ArrayList arrayList2 = new ArrayList(size);
        if (list != null) {
            Iterator it2 = list.iterator();
            while (it2.hasNext()) {
                WallWallCommentDto wallWallCommentDto2 = (WallWallCommentDto) it2.next();
                oax0 oax0Var = this.a;
                oax0Var.getClass();
                List<WallWallpostAttachmentDto> d = wallWallCommentDto2.d();
                if (d != null) {
                    ArrayList arrayList3 = new ArrayList();
                    Iterator<T> it3 = d.iterator();
                    while (it3.hasNext()) {
                        Attachment a2 = oax0Var.a.a((WallWallpostAttachmentDto) it3.next(), map);
                        if (a2 != null) {
                            arrayList3.add(a2);
                        }
                    }
                    list2 = rdi.g(arrayList3);
                } else {
                    list2 = null;
                }
                LikesItemReactionsDto o = wallWallCommentDto2.o();
                ItemReactions D = o != null ? l370.D(o, reactionSet) : null;
                int id = wallWallCommentDto2.getId();
                UserId k = wallWallCommentDto2.k();
                long g = wallWallCommentDto2.g();
                String C = wallWallCommentDto2.C();
                BaseLikesInfoDto l = wallWallCommentDto2.l();
                int count = l != null ? l.getCount() : 0;
                BaseLikesInfoDto l2 = wallWallCommentDto2.l();
                boolean z2 = (l2 != null ? l2.i() : null) == BaseBoolIntDto.YES;
                List<Integer> n = wallWallCommentDto2.n();
                int[] N0 = n != null ? j5g.N0(n) : null;
                WallWallCommentDonutDto j = wallWallCommentDto2.j();
                if (j != null) {
                    Boolean e = j.e();
                    boolean booleanValue = e != null ? e.booleanValue() : false;
                    WallWallCommentDonutPlaceholderDto d2 = j.d();
                    if (d2 != null) {
                        String e2 = d2.e();
                        BaseLinkButtonDto d3 = d2.d();
                        BaseLinkButtonActionDto e3 = d3.e();
                        it = it2;
                        if (e3 == null || (b = wf6.b(e3)) == null) {
                            wallWallCommentDto = wallWallCommentDto2;
                            linkButton = null;
                        } else {
                            wallWallCommentDto = wallWallCommentDto2;
                            String title = d3.getTitle();
                            if (title == null) {
                                title = "";
                            }
                            String str = title;
                            BaseLinkButtonStyleDto o2 = d3.o();
                            linkButton = new LinkButton(str, b, o2 != null ? o2.name() : null);
                        }
                        placeholder = new CommentDonut.Placeholder(e2, linkButton);
                    } else {
                        it = it2;
                        wallWallCommentDto = wallWallCommentDto2;
                        placeholder = null;
                    }
                    commentDonut = new CommentDonut(booleanValue, placeholder);
                } else {
                    it = it2;
                    wallWallCommentDto = wallWallCommentDto2;
                    commentDonut = null;
                }
                Boolean F = wallWallCommentDto.F();
                boolean booleanValue2 = F != null ? F.booleanValue() : false;
                BaseLikesInfoDto l3 = wallWallCommentDto.l();
                boolean f = l3 != null ? epx.f(l3.d(), Boolean.TRUE) : false;
                Boolean Q = wallWallCommentDto.Q();
                Comment comment = new Comment(id, k, null, 0, g, C, count, z2, list2, null, N0, commentDonut, reactionSet, D, false, booleanValue2, f, false, Q != null ? Q.booleanValue() : false, 516, null);
                arrayList.add(comment);
                if (map != null && (owner = map.get(comment.c)) != null) {
                    linkedHashMap.put(comment.c, owner);
                    arrayList2.add(owner.e);
                }
                it2 = it;
            }
        }
        int i = displayTypeDto == null ? -1 : a.$EnumSwitchMapping$1[displayTypeDto.ordinal()];
        return new CommentsActivity(arrayList, linkedHashMap, arrayList2, userId, z, i != 1 ? i != 2 ? CommentsActivity.Position.DEFAULT : CommentsActivity.Position.DEFAULT : CommentsActivity.Position.ON_CONTENT);
    }
}
