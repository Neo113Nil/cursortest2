package xsna;

import com.vk.api.generated.likes.dto.LikesGetListExtendedFilterDto;
import com.vk.api.generated.wall.dto.WallGetByIdResponseDto;
import com.vk.api.likes.LikesGetList;
import com.vk.dto.common.data.VKList;
import com.vk.dto.common.id.UserId;
import com.vk.dto.reactions.ItemReactions;
import com.vk.dto.reactions.ReactionSet;
import com.vk.dto.user.ReactionUserProfile;
import java.util.Collections;
import java.util.List;
import kotlin.Pair;
import kotlin.jvm.internal.FunctionReferenceImpl;
import org.json.JSONObject;

/* compiled from: GetReactedUsersBatches.kt */
/* loaded from: classes15.dex */
public final class b060 extends com.vk.api.request.rx.batch.b<VKList<ReactionUserProfile>, VKList<ReactionUserProfile>, WallGetByIdResponseDto, rtt> {
    public final int v;
    public final int w;

    /* compiled from: GetReactedUsersBatches.kt */
    public static final /* synthetic */ class a extends FunctionReferenceImpl implements izs<JSONObject, VKList<ReactionUserProfile>> {
        @Override // xsna.izs
        public final VKList<ReactionUserProfile> invoke(JSONObject jSONObject) {
            ((stt) this.receiver).getClass();
            return stt.a(jSONObject);
        }
    }

    /* compiled from: GetReactedUsersBatches.kt */
    public static final /* synthetic */ class b extends FunctionReferenceImpl implements izs<JSONObject, VKList<ReactionUserProfile>> {
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
    public b060(LikesGetList.Type type, UserId userId, long j, int i, int i2) {
        super(r3, r4, yfb.x(lax0.c(r5, Collections.singletonList(r6.toString()), null, null, 62)));
        k0x k0xVar = new k0x(4);
        String i3 = type.i();
        int i4 = (int) j;
        List<String> list = utt.a;
        xy2 f = k0x.f(k0xVar, i3, userId, Integer.valueOf(i4), null, null, Integer.valueOf(i), null, list, 824);
        stt sttVar = stt.a;
        hz2 z = yfb.z(f, new a(1, sttVar, stt.class, "likesResponseLegacyMapper", "likesResponseLegacyMapper(Lorg/json/JSONObject;)Lcom/vk/dto/common/data/VKList;", 0));
        hz2 z2 = yfb.z(k0x.f(new k0x(4), type.i(), userId, Integer.valueOf(i4), LikesGetListExtendedFilterDto.COPIES, null, Integer.valueOf(i2), null, list, 808), new b(1, sttVar, stt.class, "likesResponseLegacyMapper", "likesResponseLegacyMapper(Lorg/json/JSONObject;)Lcom/vk/dto/common/data/VKList;", 0));
        max0 max0Var = new max0();
        StringBuilder sb = new StringBuilder();
        sb.append(userId);
        sb.append('_');
        sb.append(j);
        this.v = i;
        this.w = i2;
    }

    @Override // com.vk.api.request.rx.batch.b
    public final rtt K0(bv6<VKList<ReactionUserProfile>> bv6Var, bv6<VKList<ReactionUserProfile>> bv6Var2, bv6<WallGetByIdResponseDto> bv6Var3) {
        stt.a.getClass();
        Pair f = stt.f(bv6Var3);
        return new rtt(stt.d(bv6Var, this.v), null, stt.d(bv6Var2, this.w), f != null ? (ReactionSet) f.i() : null, f != null ? (ItemReactions) f.j() : null);
    }
}
