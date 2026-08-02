package xsna;

import java.util.HashMap;

/* compiled from: MlEnhanceParams.kt */
/* loaded from: classes4.dex */
public final class dc0 implements ct20 {
    public final HashMap a;

    public dc0(HashMap hashMap) {
        this.a = hashMap;
    }

    @Override // xsna.g5p
    public final boolean I() {
        return false;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof dc0) && this.a.equals(((dc0) obj).a);
    }

    @Override // xsna.g5p
    public final /* bridge */ /* synthetic */ f5p getId() {
        return ot20.a;
    }

    public final int hashCode() {
        return this.a.hashCode();
    }

    public final String toString() {
        return "ActualMlEnhanceParams(editorParamsSnapshot=" + this.a + ")";
    }
}
