package xsna;

import com.vk.catalog2.common.dto.api.ui.UIBlock;
import kotlin.jvm.internal.FunctionReferenceImpl;

/* compiled from: CatalogCommand.kt */
/* loaded from: classes16.dex */
public final class jwp0 extends n3a {
    public final UIBlock a;
    public final FunctionReferenceImpl b;

    /* JADX WARN: Multi-variable type inference failed */
    public jwp0(UIBlock uIBlock, wzs<? super UIBlock, ? super UIBlock, ? extends UIBlock> wzsVar) {
        this.a = uIBlock;
        this.b = (FunctionReferenceImpl) wzsVar;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof jwp0)) {
            return false;
        }
        jwp0 jwp0Var = (jwp0) obj;
        return epx.f(this.a, jwp0Var.a) && epx.f(this.b, jwp0Var.b);
    }

    public final int hashCode() {
        return this.b.hashCode() + (this.a.hashCode() * 31);
    }

    public final String toString() {
        return "UIBlockChangedCmd(newUIBlock=" + this.a + ", mergeFunction=" + this.b + ')';
    }
}
