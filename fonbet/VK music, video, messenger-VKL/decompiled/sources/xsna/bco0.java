package xsna;

import com.vk.dto.stories.model.TextBackgroundInfo;

/* compiled from: TextBackgroundStyles.java */
/* loaded from: classes15.dex */
public abstract class bco0 implements ix5 {
    public int a;
    public TextBackgroundInfo.Outline b;
    public int c;

    @Override // xsna.b7l0
    public final void b(imo0 imo0Var) {
        imo0Var.h = getId();
        TextBackgroundInfo textBackgroundInfo = imo0Var.k;
        textBackgroundInfo.a = this.b;
        textBackgroundInfo.i = this.c;
        b5j0 b5j0Var = imo0Var.l;
        b5j0Var.getClass();
        int i = imo0Var.g;
        b5j0Var.b = i != -16777216 ? l8g.g(i, 255) : -6337555;
        if (this.b == TextBackgroundInfo.Outline.NONE) {
            imo0Var.f = imo0Var.g;
        } else {
            textBackgroundInfo.f = imo0Var.g;
            imo0Var.f = j(imo0Var);
        }
        imo0Var.n = i();
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof bco0) && getId() == ((bco0) obj).getId();
    }

    @Override // xsna.ix5
    public final int h() {
        return this.a;
    }

    public final int hashCode() {
        return getId();
    }

    public abstract String i();

    public int j(imo0 imo0Var) {
        return l8g.e(imo0Var.g) < 0.75f ? -1 : -16777216;
    }
}
