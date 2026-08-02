package xsna;

/* compiled from: ChannelsPinnedCountCmd.kt */
/* loaded from: classes2.dex */
public final class whb extends le6<Integer> {
    @Override // xsna.le6
    public final Integer e(w2w w2wVar) {
        return Integer.valueOf(w2wVar.getExperiments().n() ? w2wVar.I0().j().g() : w2wVar.I0().a().e());
    }

    public final boolean equals(Object obj) {
        return obj instanceof whb;
    }

    @Override // xsna.e1w
    public final String toString() {
        return "ChannelPinnedCountCmd";
    }
}
