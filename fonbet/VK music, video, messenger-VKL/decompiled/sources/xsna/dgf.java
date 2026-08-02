package xsna;

import com.vk.api.generated.groups.dto.GroupsFieldsDto;
import com.vk.api.generated.groups.dto.GroupsFilterDto;
import com.vk.api.generated.groups.dto.GroupsGetByIdObjectResponseDto;
import com.vk.api.generated.groups.dto.GroupsGetObjectExtendedResponseDto;
import com.vk.api.generated.groups.dto.GroupsGroupFullDto;
import com.vk.dto.common.id.UserId;
import com.vk.dto.group.Group;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import xsna.wqu;

/* compiled from: ClipsUploadGroupsInteractorImpl.kt */
/* loaded from: classes17.dex */
public final class dgf implements agf {
    public final bpn0 a = new bpn0(new qe3(13));
    public final bpn0 b = new bpn0(new com.vk.movika.sdk.base.ui.o0(10));

    /* JADX WARN: Removed duplicated region for block: B:13:0x00ed A[LOOP:0: B:11:0x00e5->B:13:0x00ed, LOOP_END] */
    /* JADX WARN: Removed duplicated region for block: B:14:0x0114 A[EDGE_INSN: B:14:0x0114->B:15:0x0114 BREAK  A[LOOP:0: B:11:0x00e5->B:13:0x00ed], SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:18:0x0123  */
    /* JADX WARN: Removed duplicated region for block: B:29:0x0146  */
    /* JADX WARN: Removed duplicated region for block: B:34:0x0165  */
    /* JADX WARN: Removed duplicated region for block: B:39:0x018c  */
    /* JADX WARN: Removed duplicated region for block: B:44:0x0160 A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:48:0x0044  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x002b  */
    @Override // xsna.agf
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object a(int i, UserId userId, ContinuationImpl continuationImpl) {
        cgf cgfVar;
        int i2;
        UserId userId2;
        Object obj;
        ArrayList arrayList;
        Iterator<T> it;
        boolean hasNext;
        bpn0 bpn0Var;
        Iterator it2;
        Iterator<T> it3;
        Object obj2;
        GroupsGroupFullDto groupsGroupFullDto;
        int i3 = i;
        if (continuationImpl instanceof cgf) {
            cgfVar = (cgf) continuationImpl;
            int i4 = cgfVar.label;
            if ((i4 & Integer.MIN_VALUE) != 0) {
                cgfVar.label = i4 - Integer.MIN_VALUE;
                Object obj3 = cgfVar.result;
                CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
                i2 = cgfVar.label;
                Group group = null;
                if (i2 != 0) {
                    kotlin.a.a(obj3);
                    List<String> b0 = drm0.b0("start_date,members_count,verified,screen_name,activity,trending,can_upload_story,trending,is_business_category,is_market_online_booking_setting_enabled,is_market_market_link_attachment_enabled,is_market_message_to_bc_attachment_enabled,age_mark,age_limits,donut,has_group_channel,vk_ticket,is_market_enabled,is_business", new char[]{','}, 0, 6);
                    ArrayList arrayList2 = new ArrayList();
                    for (String str : b0) {
                        Iterator<E> it4 = GroupsFieldsDto.j().iterator();
                        while (true) {
                            if (!it4.hasNext()) {
                                obj = null;
                                break;
                            }
                            obj = it4.next();
                            if (epx.f(((GroupsFieldsDto) obj).k(), str)) {
                                break;
                            }
                        }
                        GroupsFieldsDto groupsFieldsDto = (GroupsFieldsDto) obj;
                        if (groupsFieldsDto != null) {
                            arrayList2.add(groupsFieldsDto);
                        }
                    }
                    iz2 A = yfb.A(xqu.h((xqu) this.a.getValue(), null, e43.l(GroupsFilterDto.EDITOR, GroupsFilterDto.CAN_POST_CLIPS), arrayList2, new Integer(i3), new Integer(10), 33));
                    cgfVar.L$0 = userId;
                    cgfVar.L$1 = null;
                    cgfVar.I$0 = i3;
                    cgfVar.label = 1;
                    obj3 = evj.p(A, cgfVar);
                    if (obj3 == coroutineSingletons) {
                        return coroutineSingletons;
                    }
                    userId2 = userId;
                } else {
                    if (i2 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    i3 = cgfVar.I$0;
                    userId2 = (UserId) cgfVar.L$0;
                    kotlin.a.a(obj3);
                }
                GroupsGetObjectExtendedResponseDto groupsGetObjectExtendedResponseDto = (GroupsGetObjectExtendedResponseDto) obj3;
                List<GroupsGroupFullDto> e = groupsGetObjectExtendedResponseDto.e();
                arrayList = new ArrayList(c5g.u(e, 10));
                it = e.iterator();
                while (true) {
                    hasNext = it.hasNext();
                    bpn0Var = this.b;
                    if (hasNext) {
                        break;
                    }
                    GroupsGroupFullDto groupsGroupFullDto2 = (GroupsGroupFullDto) it.next();
                    dqu dquVar = (dqu) bpn0Var.getValue();
                    GroupsGroupFullDto a = GroupsGroupFullDto.a(groupsGroupFullDto2, fkq0.e(fkq0.a(groupsGroupFullDto2.P0())));
                    dquVar.getClass();
                    arrayList.add(dqu.a(a));
                }
                ArrayList arrayList3 = new ArrayList();
                it2 = arrayList.iterator();
                while (it2.hasNext()) {
                    Object next = it2.next();
                    if (!epx.f(((Group) next).c, userId2)) {
                        arrayList3.add(next);
                    }
                }
                it3 = groupsGetObjectExtendedResponseDto.e().iterator();
                while (true) {
                    if (it3.hasNext()) {
                        obj2 = null;
                        break;
                    }
                    obj2 = it3.next();
                    if (fkq0.e(fkq0.a(((GroupsGroupFullDto) obj2).P0())).equals(userId2)) {
                        break;
                    }
                }
                groupsGroupFullDto = (GroupsGroupFullDto) obj2;
                if (groupsGroupFullDto != null) {
                    dqu dquVar2 = (dqu) bpn0Var.getValue();
                    GroupsGroupFullDto a2 = GroupsGroupFullDto.a(groupsGroupFullDto, fkq0.e(fkq0.a(groupsGroupFullDto.P0())));
                    dquVar2.getClass();
                    Group a3 = dqu.a(a2);
                    if (i3 == 0) {
                        group = a3;
                    }
                }
                return new mbq0(arrayList3, group, groupsGetObjectExtendedResponseDto.e().size(), groupsGetObjectExtendedResponseDto.getCount() > i3 + 10);
            }
        }
        cgfVar = new cgf(this, continuationImpl);
        Object obj32 = cgfVar.result;
        CoroutineSingletons coroutineSingletons2 = CoroutineSingletons.COROUTINE_SUSPENDED;
        i2 = cgfVar.label;
        Group group2 = null;
        if (i2 != 0) {
        }
        GroupsGetObjectExtendedResponseDto groupsGetObjectExtendedResponseDto2 = (GroupsGetObjectExtendedResponseDto) obj32;
        List<GroupsGroupFullDto> e2 = groupsGetObjectExtendedResponseDto2.e();
        arrayList = new ArrayList(c5g.u(e2, 10));
        it = e2.iterator();
        while (true) {
            hasNext = it.hasNext();
            bpn0Var = this.b;
            if (hasNext) {
            }
            GroupsGroupFullDto groupsGroupFullDto22 = (GroupsGroupFullDto) it.next();
            dqu dquVar3 = (dqu) bpn0Var.getValue();
            GroupsGroupFullDto a4 = GroupsGroupFullDto.a(groupsGroupFullDto22, fkq0.e(fkq0.a(groupsGroupFullDto22.P0())));
            dquVar3.getClass();
            arrayList.add(dqu.a(a4));
        }
        ArrayList arrayList32 = new ArrayList();
        it2 = arrayList.iterator();
        while (it2.hasNext()) {
        }
        it3 = groupsGetObjectExtendedResponseDto2.e().iterator();
        while (true) {
            if (it3.hasNext()) {
            }
        }
        groupsGroupFullDto = (GroupsGroupFullDto) obj2;
        if (groupsGroupFullDto != null) {
        }
        return new mbq0(arrayList32, group2, groupsGetObjectExtendedResponseDto2.e().size(), groupsGetObjectExtendedResponseDto2.getCount() > i3 + 10);
    }

    /* JADX WARN: Removed duplicated region for block: B:20:0x0035  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0022  */
    @Override // xsna.agf
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object b(UserId userId, ContinuationImpl continuationImpl) {
        bgf bgfVar;
        int i;
        Object obj;
        List<GroupsGroupFullDto> d;
        GroupsGroupFullDto groupsGroupFullDto;
        if (continuationImpl instanceof bgf) {
            bgfVar = (bgf) continuationImpl;
            int i2 = bgfVar.label;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                bgfVar.label = i2 - Integer.MIN_VALUE;
                Object obj2 = bgfVar.result;
                CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
                i = bgfVar.label;
                if (i != 0) {
                    kotlin.a.a(obj2);
                    xqu xquVar = (xqu) this.a.getValue();
                    List singletonList = Collections.singletonList(fkq0.a(userId));
                    List<String> b0 = drm0.b0("start_date,members_count,verified,screen_name,activity,trending,can_upload_story,trending,is_business_category,is_market_online_booking_setting_enabled,is_market_market_link_attachment_enabled,is_market_message_to_bc_attachment_enabled,age_mark,age_limits,donut,has_group_channel,vk_ticket,is_market_enabled,is_business", new char[]{','}, 0, 6);
                    ArrayList arrayList = new ArrayList();
                    for (String str : b0) {
                        Iterator<E> it = GroupsFieldsDto.j().iterator();
                        while (true) {
                            if (!it.hasNext()) {
                                obj = null;
                                break;
                            }
                            obj = it.next();
                            if (epx.f(((GroupsFieldsDto) obj).k(), str)) {
                                break;
                            }
                        }
                        GroupsFieldsDto groupsFieldsDto = (GroupsFieldsDto) obj;
                        if (groupsFieldsDto != null) {
                            arrayList.add(groupsFieldsDto);
                        }
                    }
                    iz2 A = yfb.A(wqu.a.b(xquVar, singletonList, arrayList, null, 4));
                    bgfVar.L$0 = null;
                    bgfVar.label = 1;
                    obj2 = evj.p(A, bgfVar);
                    if (obj2 == coroutineSingletons) {
                        return coroutineSingletons;
                    }
                } else {
                    if (i != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    kotlin.a.a(obj2);
                }
                d = ((GroupsGetByIdObjectResponseDto) obj2).d();
                if (d != null || (groupsGroupFullDto = (GroupsGroupFullDto) j5g.Y(d)) == null) {
                    return null;
                }
                dqu dquVar = (dqu) this.b.getValue();
                GroupsGroupFullDto a = GroupsGroupFullDto.a(groupsGroupFullDto, fkq0.e(fkq0.a(groupsGroupFullDto.P0())));
                dquVar.getClass();
                return dqu.a(a);
            }
        }
        bgfVar = new bgf(this, continuationImpl);
        Object obj22 = bgfVar.result;
        CoroutineSingletons coroutineSingletons2 = CoroutineSingletons.COROUTINE_SUSPENDED;
        i = bgfVar.label;
        if (i != 0) {
        }
        d = ((GroupsGetByIdObjectResponseDto) obj22).d();
        if (d != null) {
        }
        return null;
    }
}
