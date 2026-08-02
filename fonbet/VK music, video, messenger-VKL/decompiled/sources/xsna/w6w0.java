package xsna;

import com.vk.dto.common.id.UserId;
import com.vk.vmoji.character.model.CharacterContext;
import com.vk.vmoji.character.model.RecommendationsBlockModel;
import com.vk.vmoji.character.model.VmojiCharacterModel;
import com.vk.vmoji.character.model.VmojiStickerPacksModel;
import java.util.Collections;
import java.util.List;

/* compiled from: VmojiCharacterInteractor.kt */
/* loaded from: classes7.dex */
public final class w6w0 {
    public final u3r0 a;
    public final kcl0 b;
    public final UserId c;
    public final Integer d;
    public CharacterContext e;
    public final boolean f;

    /* compiled from: VmojiCharacterInteractor.kt */
    public static final class a {
        public final VmojiCharacterModel a;
        public final VmojiStickerPacksModel b;
        public final List<RecommendationsBlockModel> c;

        public a(VmojiCharacterModel vmojiCharacterModel, VmojiStickerPacksModel vmojiStickerPacksModel, List<RecommendationsBlockModel> list) {
            this.a = vmojiCharacterModel;
            this.b = vmojiStickerPacksModel;
            this.c = list;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof a)) {
                return false;
            }
            a aVar = (a) obj;
            return epx.f(this.a, aVar.a) && epx.f(this.b, aVar.b) && epx.f(this.c, aVar.c);
        }

        public final int hashCode() {
            return this.c.hashCode() + ((this.b.hashCode() + (this.a.hashCode() * 31)) * 31);
        }

        public final String toString() {
            StringBuilder sb = new StringBuilder("LoadResult(character=");
            sb.append(this.a);
            sb.append(", stickerPacks=");
            sb.append(this.b);
            sb.append(", recommendations=");
            return ms9.a(')', sb, this.c);
        }
    }

    /* compiled from: VmojiCharacterInteractor.kt */
    public static final /* synthetic */ class b {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;

        static {
            int[] iArr = new int[CharacterContext.values().length];
            try {
                iArr[CharacterContext.MY_CHARACTER.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[CharacterContext.OTHER_CHARACTER.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            $EnumSwitchMapping$0 = iArr;
        }
    }

    public w6w0(u3r0 u3r0Var, zq70 zq70Var, kcl0 kcl0Var, UserId userId, Integer num, CharacterContext characterContext, boolean z) {
        this.a = u3r0Var;
        this.b = kcl0Var;
        this.c = userId;
        this.d = num;
        this.e = characterContext;
        this.f = z;
    }

    public static io.reactivex.rxjava3.internal.operators.single.y d(w6w0 w6w0Var, Integer num, String str, String str2, int i) {
        List list = null;
        if ((i & 1) != 0) {
            num = null;
        }
        String str3 = (i & 2) != 0 ? null : str;
        String str4 = (i & 4) != 0 ? null : str2;
        if (num != null) {
            w6w0Var.getClass();
            list = Collections.singletonList(Integer.valueOf(num.intValue()));
        }
        w6w0Var.a.getClass();
        tfx tfxVar = new tfx("vmoji.getStickerPacks", new xul0(7), new bjn0(6));
        if (str4 != null) {
            tfx.o(tfxVar, "start_from", str4, 0, 0, 12);
        }
        if (list != null) {
            tfxVar.i("pack_ids", list);
        }
        if (str3 != null) {
            tfx.o(tfxVar, "character_id", str3, 0, 0, 12);
        }
        return rsg0.w0(yfb.x(tfxVar)).l(new oe40(new j6e0(21), 18));
    }

    public final io.reactivex.rxjava3.internal.operators.observable.m1 a(int i, Boolean bool) {
        this.a.getClass();
        tfx tfxVar = new tfx("vmoji.purchaseProduct", new hbn0(4), new rft0(1));
        tfx.l(tfxVar, "product_id", i, 0, 0, 12);
        if (bool != null) {
            tfxVar.j("confirm", bool.booleanValue());
        }
        return rsg0.T(yfb.x(tfxVar));
    }

    public final io.reactivex.rxjava3.internal.operators.single.y b(String str) {
        return rsg0.w0(yfb.x(u3r0.c(this.a, this.e == CharacterContext.MY_CHARACTER ? null : str, 61))).l(new i3u(new f1p0(5, this, str), 24));
    }

    public final io.reactivex.rxjava3.core.x<a> c(String str, String str2) {
        Integer num;
        UserId userId;
        int i = b.$EnumSwitchMapping$0[this.e.ordinal()];
        Integer num2 = this.d;
        if (i == 1) {
            num = null;
            userId = null;
        } else if (i != 2) {
            num = num2;
            userId = null;
        } else {
            UserId userId2 = this.c;
            if (userId2 == null || !fkq0.d(userId2)) {
                userId2 = null;
            }
            userId = userId2;
            num = num2;
        }
        io.reactivex.rxjava3.internal.operators.single.y b2 = b(str);
        io.reactivex.rxjava3.internal.operators.single.y d = d(this, num, str2, null, 4);
        this.a.getClass();
        tfx tfxVar = new tfx("vmoji.getStickerPacksRecommendationBlocks", new yul0(6), new ful0(6));
        if (num2 != null) {
            tfx.l(tfxVar, "ref_pack_id", num2.intValue(), 1, 0, 8);
        }
        if (userId != null) {
            tfx.n(tfxVar, "ref_user_id", userId, 0L, 0L, 8);
            tfxVar = tfxVar;
        }
        if (str2 != null) {
            tfx.o(tfxVar, "character_id", str2, 0, 0, 12);
        }
        return io.reactivex.rxjava3.core.x.A(b2, d, rsg0.w0(yfb.x(tfxVar)).l(new xw70(new av70(28), 16)), new nh40(new odi(6), 24));
    }

    public final io.reactivex.rxjava3.internal.operators.single.o e(String str, boolean z) {
        return new io.reactivex.rxjava3.internal.operators.single.o(rsg0.w0(yfb.x(this.a.g(str, z))).l(new vtg0(new o7j0(18), 15)), new xvq0(new v6w0(this, z), 10));
    }
}
