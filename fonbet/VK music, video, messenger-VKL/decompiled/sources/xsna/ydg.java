package xsna;

import com.vk.api.generated.likes.dto.LikesGetListExtendedFilterDto;
import com.vk.api.generated.likes.dto.LikesGetListExtendedFriendsOnlyDto;
import com.vk.api.generated.wall.dto.WallGetCommentResponseDto;
import com.vk.dto.common.data.VKList;
import com.vk.dto.common.id.UserId;
import com.vk.dto.reactions.ItemReactions;
import com.vk.dto.reactions.ReactionSet;
import com.vk.dto.user.ReactionUserProfile;
import kotlin.Pair;
import kotlin.jvm.internal.FunctionReferenceImpl;
import org.json.JSONObject;

/* compiled from: GetReactedUsersBatches.kt */
/* loaded from: classes15.dex */
public final class ydg extends com.vk.api.request.rx.batch.a<VKList<ReactionUserProfile>, WallGetCommentResponseDto, rtt> {
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
    public ydg(String str, UserId userId, long j, boolean z, boolean z2, int i) {
        super(yfb.z(k0x.f(new k0x(4), str, userId, Integer.valueOf(r10), z2 ? LikesGetListExtendedFilterDto.COPIES : null, z ? LikesGetListExtendedFriendsOnlyDto.TYPE_1 : null, Integer.valueOf(i), null, utt.a, 776), new a(1, stt.a, stt.class, "likesResponseLegacyMapper", "likesResponseLegacyMapper(Lorg/json/JSONObject;)Lcom/vk/dto/common/data/VKList;", 0)), yfb.x(lax0.a(new max0(), r10, userId, null, 60)));
        int i2 = (int) j;
        this.v = i;
    }

    @Override // com.vk.api.request.rx.batch.a
    public final rtt K0(bv6<VKList<ReactionUserProfile>> bv6Var, bv6<WallGetCommentResponseDto> bv6Var2) {
        stt.a.getClass();
        Pair e = stt.e(bv6Var2);
        return new rtt(stt.d(bv6Var, this.v), null, null, e != null ? (ReactionSet) e.i() : null, e != null ? (ItemReactions) e.j() : null);
    }
}
