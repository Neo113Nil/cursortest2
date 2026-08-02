package xsna;

import com.vk.api.generated.likes.dto.LikesGetListExtendedFilterDto;
import com.vk.api.generated.likes.dto.LikesGetListExtendedFriendsOnlyDto;
import com.vk.api.generated.wall.dto.WallGetCommentResponseDto;
import com.vk.dto.common.data.VKList;
import com.vk.dto.common.id.UserId;
import com.vk.dto.reactions.ItemReactions;
import com.vk.dto.reactions.ReactionSet;
import com.vk.dto.user.ReactionUserProfile;
import java.util.List;
import kotlin.Pair;
import kotlin.jvm.internal.FunctionReferenceImpl;
import org.json.JSONObject;

/* compiled from: GetReactedUsersBatches.kt */
/* loaded from: classes15.dex */
public final class zz50 extends com.vk.api.request.rx.batch.c<VKList<ReactionUserProfile>, VKList<ReactionUserProfile>, VKList<ReactionUserProfile>, WallGetCommentResponseDto, rtt> {
    public final int v;
    public final int w;
    public final int x;

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

    /* compiled from: GetReactedUsersBatches.kt */
    public static final /* synthetic */ class c extends FunctionReferenceImpl implements izs<JSONObject, VKList<ReactionUserProfile>> {
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
    public zz50(String str, UserId userId, long j, int i, int i2, int i3) {
        super(yfb.z(r1, new a(1, r5, stt.class, "likesResponseLegacyMapper", "likesResponseLegacyMapper(Lorg/json/JSONObject;)Lcom/vk/dto/common/data/VKList;", 0)), yfb.z(k0x.f(new k0x(4), str, userId, Integer.valueOf(r11), LikesGetListExtendedFilterDto.COPIES, null, Integer.valueOf(i3), null, r20, 808), new b(1, r5, stt.class, "likesResponseLegacyMapper", "likesResponseLegacyMapper(Lorg/json/JSONObject;)Lcom/vk/dto/common/data/VKList;", 0)), yfb.z(k0x.f(new k0x(4), str, userId, Integer.valueOf(r11), null, LikesGetListExtendedFriendsOnlyDto.TYPE_1, Integer.valueOf(i2), null, r20, 792), new c(1, r5, stt.class, "likesResponseLegacyMapper", "likesResponseLegacyMapper(Lorg/json/JSONObject;)Lcom/vk/dto/common/data/VKList;", 0)), yfb.x(lax0.a(new max0(), r11, userId, null, 60)));
        k0x k0xVar = new k0x(4);
        int i4 = (int) j;
        List<String> list = utt.a;
        xy2 f = k0x.f(k0xVar, str, userId, Integer.valueOf(i4), null, null, Integer.valueOf(i), null, list, 824);
        stt sttVar = stt.a;
        this.v = i;
        this.w = i2;
        this.x = i3;
    }

    @Override // com.vk.api.request.rx.batch.c
    public final rtt K0(bv6<VKList<ReactionUserProfile>> bv6Var, bv6<VKList<ReactionUserProfile>> bv6Var2, bv6<VKList<ReactionUserProfile>> bv6Var3, bv6<WallGetCommentResponseDto> bv6Var4) {
        stt.a.getClass();
        Pair e = stt.e(bv6Var4);
        return new rtt(stt.d(bv6Var, this.v), stt.d(bv6Var3, this.w), stt.d(bv6Var2, this.x), e != null ? (ReactionSet) e.i() : null, e != null ? (ItemReactions) e.j() : null);
    }
}
