package defpackage;

import com.yandex.go.shortcuts.dto.response.TextStyleDto;
import com.yandex.plus.home.feature.webviews.internal.container.ModalContentViewContainer;

/* loaded from: classes13.dex */
public final class fa5 {
    public static final cdc e = new cdc(ModalContentViewContainer.BASE_SHADOW_COLOR);
    public final int a;
    public final TextStyleDto.HorizontalAlignment b;
    public final bdc c;
    public final kdc d;

    public fa5(int i, TextStyleDto.HorizontalAlignment horizontalAlignment, bdc bdcVar) {
        this.a = i;
        this.b = horizontalAlignment;
        this.c = bdcVar;
        this.d = bdcVar != null ? new bdc(bdcVar.a) : new cdc(i);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof fa5)) {
            return false;
        }
        fa5 fa5Var = (fa5) obj;
        return this.a == fa5Var.a && this.b == fa5Var.b && jl40.l(this.c, fa5Var.c);
    }

    public final int hashCode() {
        int hashCode = (this.b.hashCode() + (Integer.hashCode(this.a) * 31)) * 31;
        bdc bdcVar = this.c;
        return hashCode + (bdcVar == null ? 0 : Integer.hashCode(bdcVar.a));
    }

    public fa5() {
        this(0);
    }

    public /* synthetic */ fa5(int i) {
        this(0, TextStyleDto.HorizontalAlignment.LEADING, null);
    }
}
