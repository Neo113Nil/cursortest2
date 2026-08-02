package xsna;

import com.vk.dto.common.id.UserId;
import com.vk.vmoji.character.model.CharacterContext;
import com.vk.vmoji.character.model.RecommendationsBlockModel;
import com.vk.vmoji.character.model.VmojiCharacterModel;
import com.vk.vmoji.character.model.VmojiProductModel;
import com.vk.vmoji.character.model.VmojiStickerPackPreviewModel;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;

/* compiled from: VmojiCharacterState.kt */
/* loaded from: classes7.dex */
public abstract class z7w0 implements km50 {

    /* compiled from: VmojiCharacterState.kt */
    public static final class a extends z7w0 {
        public final CharacterContext b;
        public final VmojiCharacterModel c;
        public final List<VmojiStickerPackPreviewModel> d;
        public final List<RecommendationsBlockModel> e;
        public final VmojiProductModel f;
        public final AbstractC4164a g;
        public final sf90 h;
        public final Map<String, sf90> i;

        /* compiled from: VmojiCharacterState.kt */
        /* renamed from: xsna.z7w0$a$a, reason: collision with other inner class name */
        public static abstract class AbstractC4164a {

            /* compiled from: VmojiCharacterState.kt */
            /* renamed from: xsna.z7w0$a$a$a, reason: collision with other inner class name */
            public static final class C4165a extends AbstractC4164a {
                public static final C4165a a = new C4165a();
            }

            /* compiled from: VmojiCharacterState.kt */
            /* renamed from: xsna.z7w0$a$a$b */
            public static final class b extends AbstractC4164a {
                public static final b a = new b();
            }
        }

        /* JADX WARN: Multi-variable type inference failed */
        public a(CharacterContext characterContext, VmojiCharacterModel vmojiCharacterModel, List<VmojiStickerPackPreviewModel> list, List<RecommendationsBlockModel> list2, VmojiProductModel vmojiProductModel, AbstractC4164a abstractC4164a, sf90 sf90Var, Map<String, ? extends sf90> map) {
            this.b = characterContext;
            this.c = vmojiCharacterModel;
            this.d = list;
            this.e = list2;
            this.f = vmojiProductModel;
            this.g = abstractC4164a;
            this.h = sf90Var;
            this.i = map;
        }

        /* JADX WARN: Multi-variable type inference failed */
        public static a a(a aVar, CharacterContext characterContext, VmojiCharacterModel vmojiCharacterModel, List list, List list2, VmojiProductModel vmojiProductModel, AbstractC4164a abstractC4164a, sf90 sf90Var, LinkedHashMap linkedHashMap, int i) {
            if ((i & 1) != 0) {
                characterContext = aVar.b;
            }
            CharacterContext characterContext2 = characterContext;
            if ((i & 2) != 0) {
                vmojiCharacterModel = aVar.c;
            }
            VmojiCharacterModel vmojiCharacterModel2 = vmojiCharacterModel;
            if ((i & 4) != 0) {
                list = aVar.d;
            }
            List list3 = list;
            if ((i & 8) != 0) {
                list2 = aVar.e;
            }
            List list4 = list2;
            if ((i & 16) != 0) {
                vmojiProductModel = aVar.f;
            }
            VmojiProductModel vmojiProductModel2 = vmojiProductModel;
            if ((i & 32) != 0) {
                abstractC4164a = aVar.g;
            }
            AbstractC4164a abstractC4164a2 = abstractC4164a;
            sf90 sf90Var2 = (i & 64) != 0 ? aVar.h : sf90Var;
            Map map = (i & 128) != 0 ? aVar.i : linkedHashMap;
            aVar.getClass();
            return new a(characterContext2, vmojiCharacterModel2, list3, list4, vmojiProductModel2, abstractC4164a2, sf90Var2, map);
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof a)) {
                return false;
            }
            a aVar = (a) obj;
            return this.b == aVar.b && epx.f(this.c, aVar.c) && epx.f(this.d, aVar.d) && epx.f(this.e, aVar.e) && epx.f(this.f, aVar.f) && epx.f(this.g, aVar.g) && epx.f(this.h, aVar.h) && epx.f(this.i, aVar.i);
        }

        public final int hashCode() {
            int a = fw3.a(fw3.a((this.c.hashCode() + (this.b.hashCode() * 31)) * 31, 31, this.d), 31, this.e);
            VmojiProductModel vmojiProductModel = this.f;
            return this.i.hashCode() + ((this.h.hashCode() + ((this.g.hashCode() + ((a + (vmojiProductModel == null ? 0 : vmojiProductModel.hashCode())) * 31)) * 31)) * 31);
        }

        public final String toString() {
            StringBuilder sb = new StringBuilder("Content(characterContext=");
            sb.append(this.b);
            sb.append(", character=");
            sb.append(this.c);
            sb.append(", stickerPacks=");
            sb.append(this.d);
            sb.append(", recommendationBlocks=");
            sb.append(this.e);
            sb.append(", selectedVmojiProduct=");
            sb.append(this.f);
            sb.append(", reloadState=");
            sb.append(this.g);
            sb.append(", pagingState=");
            sb.append(this.h);
            sb.append(", recommendationsPagingStates=");
            return cjl0.a(sb, this.i, ')');
        }
    }

    /* compiled from: VmojiCharacterState.kt */
    public static final class b extends z7w0 {
        public final Throwable b;

        public b(Throwable th) {
            this.b = th;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof b) && epx.f(this.b, ((b) obj).b);
        }

        public final int hashCode() {
            return this.b.hashCode();
        }

        public final String toString() {
            return oq.c(new StringBuilder("Error(throwable="), this.b, ')');
        }
    }

    /* compiled from: VmojiCharacterState.kt */
    public static final class c extends z7w0 {
        public final CharacterContext b;
        public final UserId c;

        public c(CharacterContext characterContext, UserId userId) {
            this.b = characterContext;
            this.c = userId;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof c)) {
                return false;
            }
            c cVar = (c) obj;
            return this.b == cVar.b && epx.f(this.c, cVar.c);
        }

        public final int hashCode() {
            int hashCode = this.b.hashCode() * 31;
            UserId userId = this.c;
            return hashCode + (userId == null ? 0 : Long.hashCode(userId.b));
        }

        public final String toString() {
            StringBuilder sb = new StringBuilder("Loading(characterContext=");
            sb.append(this.b);
            sb.append(", contextUserId=");
            return gp.b(sb, this.c, ')');
        }
    }
}
