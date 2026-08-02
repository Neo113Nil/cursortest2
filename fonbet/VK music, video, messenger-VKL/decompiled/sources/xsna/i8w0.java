package xsna;

import com.vk.dto.stickers.VmojiAvatar;
import com.vk.vmoji.character.model.CharacterContext;
import com.vk.vmoji.character.model.VmojiProductModel;
import java.util.ArrayList;
import xsna.z7w0;

/* compiled from: VmojiCharacterViewState.kt */
/* loaded from: classes7.dex */
public final class i8w0 implements ao50 {
    public final fi50 a;
    public final fi50 b;
    public final fi50 c;

    /* compiled from: VmojiCharacterViewState.kt */
    public static final class a implements fm50<z7w0.a> {
        public final CharacterContext a;
        public final VmojiAvatar b;
        public final boolean c;
        public final ArrayList d;
        public final boolean e;
        public final VmojiProductModel f;

        public a(CharacterContext characterContext, VmojiAvatar vmojiAvatar, boolean z, ArrayList arrayList, boolean z2, VmojiProductModel vmojiProductModel) {
            this.a = characterContext;
            this.b = vmojiAvatar;
            this.c = z;
            this.d = arrayList;
            this.e = z2;
            this.f = vmojiProductModel;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof a)) {
                return false;
            }
            a aVar = (a) obj;
            return this.a == aVar.a && epx.f(this.b, aVar.b) && this.c == aVar.c && this.d.equals(aVar.d) && this.e == aVar.e && epx.f(this.f, aVar.f);
        }

        public final int hashCode() {
            int b = qoy.b(qr.a(this.d, qoy.b((this.b.hashCode() + (this.a.hashCode() * 31)) * 31, 31, this.c), 31), 31, this.e);
            VmojiProductModel vmojiProductModel = this.f;
            return b + (vmojiProductModel == null ? 0 : vmojiProductModel.hashCode());
        }

        public final String toString() {
            return "CharacterList(characterContext=" + this.a + ", avatar=" + this.b + ", isHideFromKeyboard=" + this.c + ", items=" + this.d + ", reloadingInBackground=" + this.e + ", selectedVmojiProduct=" + this.f + ')';
        }
    }

    /* compiled from: VmojiCharacterViewState.kt */
    public static final class b implements fm50<z7w0.a> {
        public final yzt0<a> a;

        public b(h0u0 h0u0Var) {
            this.a = h0u0Var;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof b) && epx.f(this.a, ((b) obj).a);
        }

        public final int hashCode() {
            return this.a.hashCode();
        }

        public final String toString() {
            return tr.c(new StringBuilder("Content(data="), this.a, ')');
        }
    }

    /* compiled from: VmojiCharacterViewState.kt */
    public static final class c implements fm50<z7w0.c> {
        public final yzt0<CharacterContext> a;

        public c(h0u0 h0u0Var) {
            this.a = h0u0Var;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof c) && epx.f(this.a, ((c) obj).a);
        }

        public final int hashCode() {
            return this.a.hashCode();
        }

        public final String toString() {
            return tr.c(new StringBuilder("Loading(characterContext="), this.a, ')');
        }
    }

    /* compiled from: VmojiCharacterViewState.kt */
    public static final class d implements fm50<z7w0.b> {
        public final yzt0<Throwable> a;

        public d(h0u0 h0u0Var) {
            this.a = h0u0Var;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof d) && epx.f(this.a, ((d) obj).a);
        }

        public final int hashCode() {
            return this.a.hashCode();
        }

        public final String toString() {
            return tr.c(new StringBuilder("LoadingError(throwable="), this.a, ')');
        }
    }

    public i8w0(fi50 fi50Var, fi50 fi50Var2, fi50 fi50Var3) {
        this.a = fi50Var;
        this.b = fi50Var2;
        this.c = fi50Var3;
    }
}
