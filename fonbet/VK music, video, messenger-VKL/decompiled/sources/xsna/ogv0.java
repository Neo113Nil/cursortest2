package xsna;

import com.vk.core.view.components.button.VkButton;

/* compiled from: VkRichCell.kt */
/* loaded from: classes17.dex */
public final class ogv0 {
    public final tlo0 a;
    public final gzs<s3q0> b;
    public final a c;
    public final a d;
    public final Integer e;
    public final VkButton.Size f;
    public final VkButton.Mode g;
    public final VkButton.Appearance h;
    public final boolean i;
    public final boolean j;

    /* compiled from: VkRichCell.kt */
    public static final class a {
        public final gko a;

        public a(gko gkoVar) {
            this.a = gkoVar;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof a) && this.a.equals(((a) obj).a);
        }

        public final int hashCode() {
            return Integer.hashCode(this.a.a) * 961;
        }

        public final String toString() {
            return "Icon(icon=" + this.a + ", iconSize=null, iconTint=null)";
        }
    }

    public ogv0(tlo0 tlo0Var, gzs<s3q0> gzsVar, a aVar, a aVar2, Integer num, VkButton.Size size, VkButton.Mode mode, VkButton.Appearance appearance, boolean z, boolean z2) {
        this.a = tlo0Var;
        this.b = gzsVar;
        this.c = aVar;
        this.d = aVar2;
        this.e = num;
        this.f = size;
        this.g = mode;
        this.h = appearance;
        this.i = z;
        this.j = z2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ogv0)) {
            return false;
        }
        ogv0 ogv0Var = (ogv0) obj;
        return epx.f(this.a, ogv0Var.a) && epx.f(this.b, ogv0Var.b) && epx.f(this.c, ogv0Var.c) && epx.f(this.d, ogv0Var.d) && epx.f(this.e, ogv0Var.e) && this.f == ogv0Var.f && this.g == ogv0Var.g && this.h == ogv0Var.h && this.i == ogv0Var.i && this.j == ogv0Var.j;
    }

    public final int hashCode() {
        int a2 = sf3.a(this.a.hashCode() * 31, 31, this.b);
        a aVar = this.c;
        int hashCode = (a2 + (aVar == null ? 0 : aVar.hashCode())) * 31;
        a aVar2 = this.d;
        int hashCode2 = (hashCode + (aVar2 == null ? 0 : aVar2.hashCode())) * 31;
        Integer num = this.e;
        return Boolean.hashCode(this.j) + qoy.b((this.h.hashCode() + ((this.g.hashCode() + ((this.f.hashCode() + ((hashCode2 + (num != null ? num.hashCode() : 0)) * 31)) * 31)) * 31)) * 31, 31, this.i);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("Button(text=");
        sb.append(this.a);
        sb.append(", onClick=");
        sb.append(this.b);
        sb.append(", icon=");
        sb.append(this.c);
        sb.append(", trailingIcon=");
        sb.append(this.d);
        sb.append(", count=");
        sb.append(this.e);
        sb.append(", buttonSize=");
        sb.append(this.f);
        sb.append(", buttonMode=");
        sb.append(this.g);
        sb.append(", buttonAppearance=");
        sb.append(this.h);
        sb.append(", isEnabled=");
        sb.append(this.i);
        sb.append(", isLoading=");
        return defpackage.q0.a(sb, this.j, ')');
    }

    public /* synthetic */ ogv0(tlo0 tlo0Var, gzs gzsVar, a aVar, VkButton.Size size, VkButton.Mode mode, VkButton.Appearance appearance, boolean z, boolean z2, int i) {
        this(tlo0Var, gzsVar, (i & 4) != 0 ? null : aVar, null, null, (i & 32) != 0 ? VkButton.Size.Small : size, mode, (i & 128) != 0 ? VkButton.Appearance.Accent : appearance, (i & 256) != 0 ? true : z, (i & 512) != 0 ? false : z2);
    }
}
