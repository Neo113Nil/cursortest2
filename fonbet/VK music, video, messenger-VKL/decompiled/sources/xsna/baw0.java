package xsna;

import com.vk.vmoji.character.model.VmojiProductModel;
import java.util.List;

/* compiled from: VmojiProductsState.kt */
/* loaded from: classes7.dex */
public abstract class baw0 implements km50 {

    /* compiled from: VmojiProductsState.kt */
    public static final class a extends baw0 {
        public final String b;
        public final List<VmojiProductModel> c;
        public final VmojiProductModel d;
        public final AbstractC2601a e;

        /* compiled from: VmojiProductsState.kt */
        /* renamed from: xsna.baw0$a$a, reason: collision with other inner class name */
        public static abstract class AbstractC2601a {

            /* compiled from: VmojiProductsState.kt */
            /* renamed from: xsna.baw0$a$a$a, reason: collision with other inner class name */
            public static final class C2602a extends AbstractC2601a {
                public static final C2602a a = new C2602a();
            }

            /* compiled from: VmojiProductsState.kt */
            /* renamed from: xsna.baw0$a$a$b */
            public static final class b extends AbstractC2601a {
                public static final b a = new b();
            }
        }

        public a(String str, List<VmojiProductModel> list, VmojiProductModel vmojiProductModel, AbstractC2601a abstractC2601a) {
            this.b = str;
            this.c = list;
            this.d = vmojiProductModel;
            this.e = abstractC2601a;
        }

        public static a a(a aVar, String str, List list, VmojiProductModel vmojiProductModel, AbstractC2601a abstractC2601a, int i) {
            if ((i & 1) != 0) {
                str = aVar.b;
            }
            if ((i & 2) != 0) {
                list = aVar.c;
            }
            if ((i & 4) != 0) {
                vmojiProductModel = aVar.d;
            }
            if ((i & 8) != 0) {
                abstractC2601a = aVar.e;
            }
            aVar.getClass();
            return new a(str, list, vmojiProductModel, abstractC2601a);
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof a)) {
                return false;
            }
            a aVar = (a) obj;
            return epx.f(this.b, aVar.b) && epx.f(this.c, aVar.c) && epx.f(this.d, aVar.d) && epx.f(this.e, aVar.e);
        }

        public final int hashCode() {
            int a = fw3.a(this.b.hashCode() * 31, 31, this.c);
            VmojiProductModel vmojiProductModel = this.d;
            return this.e.hashCode() + ((a + (vmojiProductModel == null ? 0 : vmojiProductModel.hashCode())) * 31);
        }

        public final String toString() {
            return "Content(avatarId=" + this.b + ", vmojiProducts=" + this.c + ", selectedVmojiProduct=" + this.d + ", reloadState=" + this.e + ')';
        }

        public /* synthetic */ a(String str, List list) {
            this(str, list, null, AbstractC2601a.C2602a.a);
        }
    }
}
