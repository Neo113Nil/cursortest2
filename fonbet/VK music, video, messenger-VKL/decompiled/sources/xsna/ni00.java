package xsna;

import com.vk.api.generated.base.dto.BaseBoolIntDto;
import com.vk.api.generated.groups.dto.GroupsFieldsDto;
import com.vk.api.generated.groups.dto.GroupsFilterDto;
import com.vk.api.generated.groups.dto.GroupsGetObjectExtendedResponseDto;
import com.vk.api.generated.groups.dto.GroupsGroupFullDto;
import com.vk.api.generated.groups.dto.GroupsGroupIsClosedDto;
import com.vk.api.generated.groups.dto.GroupsGroupTypeDto;
import com.vk.core.serialize.Serializer;
import com.vk.dto.common.Peer;
import com.vk.dto.common.im.Image;
import com.vk.dto.common.im.ImageList;
import com.vk.im.engine.models.groups.ManagedGroup;
import java.util.ArrayList;
import java.util.List;
import kotlin.collections.builders.ListBuilder;

/* compiled from: ManagedGroupsGetAllApiCmd.kt */
/* loaded from: classes2.dex */
public final class ni00 extends nx2<List<? extends ManagedGroup>> {
    public final boolean b;

    /* compiled from: ManagedGroupsGetAllApiCmd.kt */
    public static final /* synthetic */ class a {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;
        public static final /* synthetic */ int[] $EnumSwitchMapping$1;

        static {
            int[] iArr = new int[GroupsGroupTypeDto.values().length];
            try {
                iArr[GroupsGroupTypeDto.EVENT.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[GroupsGroupTypeDto.PAGE.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            $EnumSwitchMapping$0 = iArr;
            int[] iArr2 = new int[GroupsGroupIsClosedDto.values().length];
            try {
                iArr2[GroupsGroupIsClosedDto.OPEN.ordinal()] = 1;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                iArr2[GroupsGroupIsClosedDto.CLOSED.ordinal()] = 2;
            } catch (NoSuchFieldError unused4) {
            }
            $EnumSwitchMapping$1 = iArr2;
        }
    }

    public ni00(boolean z) {
        this.b = z;
    }

    @Override // xsna.nx2
    public final List<? extends ManagedGroup> f(l7r0 l7r0Var) {
        List<GroupsGroupFullDto> e = ((GroupsGetObjectExtendedResponseDto) l7r0Var.e(bz2.n(xqu.h(new zqu(), null, e43.l(GroupsFilterDto.EDITOR, GroupsFilterDto.WITH_MESSAGES), e43.l(GroupsFieldsDto.MSG_PUSH_ALLOWED, GroupsFieldsDto.UNREAD_COUNT, GroupsFieldsDto.ACTIVITY), null, 1000, 41), new d0w(this, 4)))).e();
        ArrayList arrayList = new ArrayList(c5g.u(e, 10));
        for (GroupsGroupFullDto groupsGroupFullDto : e) {
            GroupsGroupTypeDto L2 = groupsGroupFullDto.L2();
            int i = L2 == null ? -1 : a.$EnumSwitchMapping$0[L2.ordinal()];
            ManagedGroup.Type type = i != 1 ? i != 2 ? ManagedGroup.Type.GROUP : ManagedGroup.Type.PUBLIC : ManagedGroup.Type.EVENT;
            GroupsGroupIsClosedDto u3 = groupsGroupFullDto.u3();
            int i2 = u3 != null ? a.$EnumSwitchMapping$1[u3.ordinal()] : -1;
            ManagedGroup.Access access = i2 != 1 ? i2 != 2 ? ManagedGroup.Access.PRIVATE : ManagedGroup.Access.CLOSED : ManagedGroup.Access.OPEN;
            ListBuilder e2 = e43.e();
            String a2 = cqm0.a(groupsGroupFullDto.V1());
            if (a2 != null) {
                m900<String, Image> m900Var = Image.g;
                e2.add(new Image(480, 480, a2, true));
            }
            if (e2.isEmpty()) {
                String a3 = cqm0.a(groupsGroupFullDto.R1());
                if (a3 != null) {
                    m900<String, Image> m900Var2 = Image.g;
                    e2.add(Image.a.a(50, a3));
                }
                String a4 = cqm0.a(groupsGroupFullDto.B1());
                if (a4 != null) {
                    m900<String, Image> m900Var3 = Image.g;
                    e2.add(Image.a.a(100, a4));
                }
                String a5 = cqm0.a(groupsGroupFullDto.D1());
                if (a5 != null) {
                    m900<String, Image> m900Var4 = Image.g;
                    e2.add(Image.a.a(200, a5));
                }
                String a6 = cqm0.a(groupsGroupFullDto.E1());
                if (a6 != null) {
                    m900<String, Image> m900Var5 = Image.g;
                    e2.add(Image.a.a(200, a6));
                }
                String a7 = cqm0.a(groupsGroupFullDto.L1());
                if (a7 != null) {
                    m900<String, Image> m900Var6 = Image.g;
                    e2.add(Image.a.a(400, a7));
                }
                String a8 = cqm0.a(groupsGroupFullDto.N1());
                if (a8 != null) {
                    m900<String, Image> m900Var7 = Image.g;
                    e2.add(Image.a.a(400, a8));
                }
            }
            ImageList imageList = new ImageList((List<Image>) rdi.g(e2.g()));
            Serializer.c<Peer> cVar = Peer.CREATOR;
            Peer.Group c = Peer.a.c(groupsGroupFullDto.P0().b);
            String y1 = groupsGroupFullDto.y1();
            String str = y1 == null ? "" : y1;
            String e3 = groupsGroupFullDto.e();
            String str2 = e3 == null ? "" : e3;
            boolean f = epx.f(groupsGroupFullDto.N3(), Boolean.TRUE);
            int i3 = 0;
            boolean z = groupsGroupFullDto.x1() == BaseBoolIntDto.NO;
            Integer M2 = groupsGroupFullDto.M2();
            if (M2 != null) {
                i3 = M2.intValue();
            }
            arrayList.add(new ManagedGroup(c, str, type, access, imageList, f, z, i3, str2));
        }
        return arrayList;
    }
}
