package xsna;

import android.graphics.drawable.Drawable;
import android.util.TypedValue;
import com.vk.avatar.api.border.AvatarBorderType;
import xsna.cq5;

/* compiled from: AvatarImageConfig.kt */
@ozl
/* loaded from: classes15.dex */
public final class kr5 {
    public final AvatarBorderType a;
    public final cq5 b;
    public final Drawable c;
    public final izs<Integer, String> d;

    /* compiled from: AvatarImageConfig.kt */
    public static final class a {
        public final pjw a;
        public String b;
        public cq5 c;
        public Drawable d;
        public int e;

        public a(pjw pjwVar) {
            this.a = pjwVar;
        }

        public final kr5 a() {
            Drawable drawable;
            AvatarBorderType avatarBorderType = AvatarBorderType.CIRCLE;
            cq5 cq5Var = this.c;
            if (cq5Var == null) {
                cq5Var = cq5.b.a;
            }
            if (this.e != 0) {
                TypedValue typedValue = krv0.a;
                dhr0 dhr0Var = krv0.b;
                drawable = dhr0Var != null ? dhr0Var.F(this.e) : null;
            } else {
                drawable = this.d;
            }
            return new kr5(avatarBorderType, cq5Var, drawable, new j9(this, 5));
        }

        public final void b(int i) {
            this.e = i;
            TypedValue typedValue = krv0.a;
            dhr0 dhr0Var = krv0.b;
            this.d = dhr0Var != null ? dhr0Var.F(i) : null;
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public kr5() {
        this((AvatarBorderType) null, (h2z) (0 == true ? 1 : 0), (izs) (0 == true ? 1 : 0), 15);
    }

    public static kr5 a(kr5 kr5Var, Drawable drawable, izs izsVar, int i) {
        AvatarBorderType avatarBorderType = kr5Var.a;
        cq5 cq5Var = kr5Var.b;
        if ((i & 4) != 0) {
            drawable = kr5Var.c;
        }
        if ((i & 8) != 0) {
            izsVar = kr5Var.d;
        }
        kr5Var.getClass();
        return new kr5(avatarBorderType, cq5Var, drawable, (izs<? super Integer, String>) izsVar);
    }

    public final String b(int i) {
        return this.d.invoke(Integer.valueOf(i));
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof kr5)) {
            return false;
        }
        kr5 kr5Var = (kr5) obj;
        return this.a == kr5Var.a && epx.f(this.b, kr5Var.b) && epx.f(this.c, kr5Var.c) && epx.f(this.d, kr5Var.d);
    }

    public final int hashCode() {
        int hashCode = (this.b.hashCode() + (this.a.hashCode() * 31)) * 31;
        Drawable drawable = this.c;
        return this.d.hashCode() + ((hashCode + (drawable == null ? 0 : drawable.hashCode())) * 31);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("AvatarImageConfig(borderType=");
        sb.append(this.a);
        sb.append(", borderState=");
        sb.append(this.b);
        sb.append(", placeholder=");
        sb.append(this.c);
        sb.append(", urlProvider=");
        return up.c(sb, this.d, ')');
    }

    /* JADX WARN: Multi-variable type inference failed */
    public kr5(AvatarBorderType avatarBorderType, cq5 cq5Var, Drawable drawable, izs<? super Integer, String> izsVar) {
        this.a = avatarBorderType;
        this.b = cq5Var;
        this.c = drawable;
        this.d = izsVar;
    }

    public /* synthetic */ kr5(AvatarBorderType avatarBorderType, h2z h2zVar, izs izsVar, int i) {
        this((i & 1) != 0 ? AvatarBorderType.CIRCLE : avatarBorderType, cq5.b.a, (i & 4) != 0 ? null : h2zVar, (izs<? super Integer, String>) ((i & 8) != 0 ? kg1.e : izsVar));
    }
}
