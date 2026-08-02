package xsna;

import com.vk.api.generated.groups.dto.GroupsGroupFullMemberStatusDto;

/* compiled from: CallParticipantsDtoToCallMemberInfoTransformer.kt */
/* loaded from: classes7.dex */
public final class g89 {
    public final com.vk.voip.b a;
    public final eu2 b;

    /* compiled from: CallParticipantsDtoToCallMemberInfoTransformer.kt */
    public static final /* synthetic */ class a {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;

        static {
            int[] iArr = new int[GroupsGroupFullMemberStatusDto.values().length];
            try {
                iArr[GroupsGroupFullMemberStatusDto.NOT_A_MEMBER.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[GroupsGroupFullMemberStatusDto.DECLINED.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            $EnumSwitchMapping$0 = iArr;
        }
    }

    public g89(com.vk.voip.b bVar, eu2 eu2Var) {
        this.a = bVar;
        this.b = eu2Var;
    }
}
