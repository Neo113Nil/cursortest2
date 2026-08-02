package xsna;

import android.graphics.drawable.Drawable;
import android.widget.ImageView;
import com.vk.avatar.api.border.AvatarBorderType;
import xsna.cq5;
import xsna.f5h0;

/* compiled from: SuperappAvatarViewDelegate.kt */
/* loaded from: classes6.dex */
public interface hgn0 extends ts5 {

    /* compiled from: SuperappAvatarViewDelegate.kt */
    public static final class a {
        public static final a c = new a(0);
        public final AvatarBorderType a;
        public final cq5 b;

        public a() {
            this(0);
        }

        public static a a(a aVar, AvatarBorderType avatarBorderType, cq5 cq5Var, int i) {
            if ((i & 1) != 0) {
                avatarBorderType = aVar.a;
            }
            if ((i & 2) != 0) {
                cq5Var = aVar.b;
            }
            aVar.getClass();
            return new a(avatarBorderType, cq5Var);
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof a)) {
                return false;
            }
            a aVar = (a) obj;
            return this.a == aVar.a && epx.f(this.b, aVar.b);
        }

        public final int hashCode() {
            return this.b.hashCode() + (this.a.hashCode() * 31);
        }

        public final String toString() {
            return "BorderParams(borderType=" + this.a + ", borderState=" + this.b + ')';
        }

        public a(AvatarBorderType avatarBorderType, cq5 cq5Var) {
            this.a = avatarBorderType;
            this.b = cq5Var;
        }

        public /* synthetic */ a(int i) {
            this(AvatarBorderType.CIRCLE, cq5.b.a);
        }
    }

    void G(String str, a aVar);

    void H(int i, a aVar);

    void M(int i, a aVar);

    void N(Drawable drawable, a aVar);

    void P(Drawable drawable, f5h0.d dVar, a aVar);

    o9r0 getBorderConfig();

    int getRoundAvatarSize();

    void i(String str, a aVar);

    void setBorderConfig(o9r0 o9r0Var);

    void setOnLoadCallback(b780 b780Var);

    void setRoundAvatarSize(int i);

    void setScaleType(ImageView.ScaleType scaleType);

    void setupBorder(a aVar);

    default void setAvatarSize(int i) {
    }
}
