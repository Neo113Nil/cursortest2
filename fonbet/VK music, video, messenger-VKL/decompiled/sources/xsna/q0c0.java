package xsna;

import com.vk.api.generated.likes.dto.LikesGetListExtendedFilterDto;
import com.vk.api.generated.likes.dto.LikesGetListExtendedFriendsOnlyDto;
import com.vk.api.generated.wall.dto.WallGetByIdResponseDto;
import com.vk.api.likes.LikesGetList;
import com.vk.dto.common.data.VKList;
import com.vk.dto.common.id.UserId;
import com.vk.dto.reactions.ItemReactions;
import com.vk.dto.reactions.ReactionSet;
import com.vk.dto.user.ReactionUserProfile;
import java.util.Collections;
import kotlin.Pair;
import kotlin.jvm.internal.FunctionReferenceImpl;
import org.json.JSONObject;

/* compiled from: GetReactedUsersBatches.kt */
/* loaded from: classes15.dex */
public final class q0c0 extends com.vk.api.request.rx.batch.a<VKList<ReactionUserProfile>, WallGetByIdResponseDto, rtt> {
    public final int v;

    /* compiled from: GetReactedUsersBatches.kt */
    public static final /* synthetic */ class a extends FunctionReferenceImpl implements izs<JSONObject, VKList<ReactionUserProfile>> {
        @Override // xsna.izs
        public final VKList<ReactionUserProfile> invoke(JSONObject jSONObject) {
            ((stt) this.receiver).getClass();
            return stt.a(jSONObject);
        }
    }

    /* JADX WARN: Illegal instructions before constructor call */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public q0c0(LikesGetList.Type type, UserId userId, long j, boolean z, boolean z2, int i) {
        super(r14, yfb.x(lax0.c(r2, Collections.singletonList(r3.toString()), null, null, 62)));
        k0x k0xVar = new k0x(4);
        String i2 = type.i();
        int i3 = (int) j;
        hz2 z3 = yfb.z(k0x.f(k0xVar, i2, userId, Integer.valueOf(i3), z2 ? LikesGetListExtendedFilterDto.COPIES : null, z ? LikesGetListExtendedFriendsOnlyDto.TYPE_1 : null, Integer.valueOf(i), null, utt.a, 776), new a(1, stt.a, stt.class, "likesResponseLegacyMapper", "likesResponseLegacyMapper(Lorg/json/JSONObject;)Lcom/vk/dto/common/data/VKList;", 0));
        max0 max0Var = new max0();
        StringBuilder sb = new StringBuilder();
        sb.append(userId);
        sb.append('_');
        sb.append(j);
        this.v = i;
    }

    @Override // com.vk.api.request.rx.batch.a
    public final rtt K0(bv6<VKList<ReactionUserProfile>> bv6Var, bv6<WallGetByIdResponseDto> bv6Var2) {
        stt.a.getClass();
        Pair f = stt.f(bv6Var2);
        return new rtt(stt.d(bv6Var, this.v), null, null, f != null ? (ReactionSet) f.i() : null, f != null ? (ItemReactions) f.j() : null);
    }
}
