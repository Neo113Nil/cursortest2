package xsna;

import com.vk.dto.common.Source;

/* compiled from: DialogPinnedCountCmd.kt */
/* loaded from: classes2.dex */
public final class mim extends le6<Integer> {
    public final Source b;

    public mim(Source source) {
        this.b = source;
    }

    @Override // xsna.le6
    public final Integer e(w2w w2wVar) {
        return Integer.valueOf(w2wVar.getExperiments().n() ? w2wVar.I0().j().g() : w2wVar.I0().b().e().e());
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof mim) && this.b == ((mim) obj).b;
    }

    @Override // xsna.le6, xsna.e1w
    public final int hashCode() {
        return this.b.hashCode();
    }

    @Override // xsna.e1w
    public final String toString() {
        return "DialogPinnedCountCmd(source=" + this.b + ')';
    }
}
