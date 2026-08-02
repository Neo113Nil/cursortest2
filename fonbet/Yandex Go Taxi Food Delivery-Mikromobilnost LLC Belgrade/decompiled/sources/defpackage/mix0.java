package defpackage;

import com.yandex.go.design.divider.CardDivider;
import com.yandex.go.tariffcard.ui.HeaderType;
import com.yandex.go.tariffcard.ui.SectionSeparator$AnimationType;
import com.yandex.go.tariffcard.ui.model.SectionSeparatorMarginType;

/* loaded from: classes14.dex */
public final class mix0 {
    public final HeaderType a;
    public final t3q0 b;
    public boolean c;

    public mix0(HeaderType headerType, t3q0 t3q0Var) {
        this.a = headerType;
        this.b = t3q0Var;
    }

    public final r3q0 a() {
        t3q0 t3q0Var = this.b;
        boolean i = t3q0Var.a.i();
        if (i) {
            return null;
        }
        if (!i) {
            return t3q0Var.a(SectionSeparatorMarginType.NONE);
        }
        w511.b();
        return null;
    }

    public final r3q0 b(SectionSeparatorMarginType sectionSeparatorMarginType) {
        boolean z = this.c;
        r3q0 r3q0Var = null;
        t3q0 t3q0Var = this.b;
        if (!z) {
            this.c = true;
            t3q0Var.getClass();
            int i = s3q0.a[this.a.ordinal()];
            if (i == 1) {
                r3q0Var = new r3q0(CardDivider.Type.BOTH, t3q0Var.e, t3q0Var.f, t3q0Var.b(sectionSeparatorMarginType), SectionSeparator$AnimationType.ULTIMA_HEADER, 32);
            } else if (i == 2) {
                r3q0Var = new r3q0(CardDivider.Type.BOTH, t3q0Var.c, t3q0Var.d, t3q0Var.b(sectionSeparatorMarginType), SectionSeparator$AnimationType.STANDARD_HEADER, 32);
            } else {
                if (i != 3) {
                    w511.b();
                    return null;
                }
                r3q0Var = new r3q0(CardDivider.Type.BOTH, t3q0Var.c, t3q0Var.d, t3q0Var.b(sectionSeparatorMarginType), SectionSeparator$AnimationType.STANDARD_HEADER, 32);
            }
        }
        return r3q0Var == null ? t3q0Var.a(sectionSeparatorMarginType) : r3q0Var;
    }
}
