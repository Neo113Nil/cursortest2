package xsna;

/* compiled from: DialogsListEduBannerSettingGetCmd.kt */
/* loaded from: classes2.dex */
public final class lsm extends le6<Boolean> {
    @Override // xsna.le6
    public final Boolean e(w2w w2wVar) {
        return Boolean.valueOf(avz.a(w2wVar, "edu_switch_account"));
    }

    public final boolean equals(Object obj) {
        return obj instanceof lsm;
    }

    @Override // xsna.le6, xsna.e1w
    public final int hashCode() {
        return 0;
    }

    @Override // xsna.e1w
    public final String toString() {
        return "DialogsListEduBannerSettingGetCmd";
    }
}
