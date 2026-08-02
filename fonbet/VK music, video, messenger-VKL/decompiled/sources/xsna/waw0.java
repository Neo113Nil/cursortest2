package xsna;

import com.vk.vmoji.character.model.VmojiStickerPackPreviewModel;
import java.util.ArrayList;
import java.util.List;

/* compiled from: VmojiRecommendationsState.kt */
/* loaded from: classes7.dex */
public abstract class waw0 implements km50 {

    /* compiled from: VmojiRecommendationsState.kt */
    public static final class a extends waw0 {
        public final String b;
        public final String c;
        public final List<VmojiStickerPackPreviewModel> d;
        public final AbstractC3923a e;
        public final sf90 f;

        /* compiled from: VmojiRecommendationsState.kt */
        /* renamed from: xsna.waw0$a$a, reason: collision with other inner class name */
        public static abstract class AbstractC3923a {

            /* compiled from: VmojiRecommendationsState.kt */
            /* renamed from: xsna.waw0$a$a$a, reason: collision with other inner class name */
            public static final class C3924a extends AbstractC3923a {
                public static final C3924a a = new C3924a();
            }

            /* compiled from: VmojiRecommendationsState.kt */
            /* renamed from: xsna.waw0$a$a$b */
            public static final class b extends AbstractC3923a {
                public static final b a = new b();
            }
        }

        public a(String str, String str2, List<VmojiStickerPackPreviewModel> list, AbstractC3923a abstractC3923a, sf90 sf90Var) {
            this.b = str;
            this.c = str2;
            this.d = list;
            this.e = abstractC3923a;
            this.f = sf90Var;
        }

        /* JADX WARN: Multi-variable type inference failed */
        public static a a(a aVar, ArrayList arrayList, AbstractC3923a abstractC3923a, sf90 sf90Var, int i) {
            String str = aVar.b;
            String str2 = aVar.c;
            List list = arrayList;
            if ((i & 4) != 0) {
                list = aVar.d;
            }
            List list2 = list;
            if ((i & 8) != 0) {
                abstractC3923a = aVar.e;
            }
            AbstractC3923a abstractC3923a2 = abstractC3923a;
            if ((i & 16) != 0) {
                sf90Var = aVar.f;
            }
            aVar.getClass();
            return new a(str, str2, list2, abstractC3923a2, sf90Var);
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof a)) {
                return false;
            }
            a aVar = (a) obj;
            return epx.f(this.b, aVar.b) && epx.f(this.c, aVar.c) && epx.f(this.d, aVar.d) && epx.f(this.e, aVar.e) && epx.f(this.f, aVar.f);
        }

        public final int hashCode() {
            return this.f.hashCode() + ((this.e.hashCode() + fw3.a(urd0.a(this.b.hashCode() * 31, 31, this.c), 31, this.d)) * 31);
        }

        public final String toString() {
            return "Content(id=" + this.b + ", title=" + this.c + ", packs=" + this.d + ", reloadState=" + this.e + ", pagingState=" + this.f + ')';
        }
    }
}
