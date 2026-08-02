package xsna;

import com.vk.api.generated.likes.dto.LikesAddResponseDto;
import com.vk.api.generated.likes.dto.LikesDeleteResponseDto;
import com.vk.api.generated.likes.dto.LikesItemReactionDto;
import com.vk.api.generated.likes.dto.LikesItemReactionsDto;
import com.vk.dto.common.id.UserId;
import com.vk.dto.reactions.ItemReaction;
import com.vk.dto.reactions.ItemReactions;
import java.util.ArrayList;
import java.util.List;
import kotlin.NoWhenBranchMatchedException;
import xsna.wab;

/* compiled from: ChannelMessageSetReactionApiCmd.kt */
/* loaded from: classes2.dex */
public final class z1b extends nx2<a> {
    public final String b = "post";
    public final int c;
    public final UserId d;
    public final wab e;

    /* compiled from: ChannelMessageSetReactionApiCmd.kt */
    public static final class a {
        public final ItemReactions a;

        public a(ItemReactions itemReactions) {
            this.a = itemReactions;
        }

        public final ItemReactions a() {
            return this.a;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof a) && epx.f(this.a, ((a) obj).a);
        }

        public final int hashCode() {
            return this.a.hashCode();
        }

        public final String toString() {
            return "Result(reactions=" + this.a + ')';
        }
    }

    public z1b(int i, UserId userId, wab wabVar) {
        this.c = i;
        this.d = userId;
        this.e = wabVar;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof z1b)) {
            return false;
        }
        z1b z1bVar = (z1b) obj;
        return epx.f(this.b, z1bVar.b) && this.c == z1bVar.c && epx.f(this.d, z1bVar.d) && epx.f(this.e, z1bVar.e);
    }

    @Override // xsna.nx2
    public final a f(l7r0 l7r0Var) {
        LikesItemReactionsDto d;
        ArrayList arrayList;
        List<LikesItemReactionDto> d2;
        wab wabVar = this.e;
        if (wabVar instanceof wab.a) {
            d = ((LikesAddResponseDto) bz2.l(k0x.d(new k0x(4), this.b, this.c, this.d, Integer.valueOf(((wab.a) wabVar).a), null, null, null, null, 1008), true)).d();
        } else {
            if (!(wabVar instanceof wab.b)) {
                throw new NoWhenBranchMatchedException();
            }
            d = ((LikesDeleteResponseDto) bz2.l(k0x.e(new k0x(4), this.b, this.c, this.d, null, null, null, 248), true)).d();
        }
        if (d == null || (d2 = d.d()) == null) {
            arrayList = new ArrayList();
        } else {
            List<LikesItemReactionDto> list = d2;
            ArrayList arrayList2 = new ArrayList(c5g.u(list, 10));
            for (LikesItemReactionDto likesItemReactionDto : list) {
                arrayList2.add(new ItemReaction(likesItemReactionDto.getId(), likesItemReactionDto.getCount()));
            }
            arrayList = p4g.q(arrayList2);
        }
        return new a(new ItemReactions(arrayList, d != null ? d.getCount() : 0, 0, d != null ? d.e() : null));
    }

    public final int hashCode() {
        return this.e.hashCode() + bh10.a(shy.a(this.c, this.b.hashCode() * 31, 31), 31, this.d.b);
    }

    public final String toString() {
        return "ChannelMessageSetReactionApiCmd(type=" + this.b + ", postId=" + this.c + ", ownerId=" + this.d + ", mode=" + this.e + ')';
    }
}
