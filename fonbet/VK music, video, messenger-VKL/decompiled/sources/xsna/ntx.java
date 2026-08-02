package xsna;

import com.vk.dto.actionlinks.ActionLink;

/* compiled from: ItemActionLink.kt */
/* loaded from: classes7.dex */
public interface ntx extends bux {
    /* JADX WARN: Multi-variable type inference failed */
    static /* synthetic */ void O3(ntx ntxVar, ActionLink actionLink, int i, int i2, gzs gzsVar, gzs gzsVar2, boolean z, boolean z2, boolean z3, int i3) {
        if ((i3 & 2) != 0) {
            i = 0;
        }
        if ((i3 & 4) != 0) {
            i2 = 0;
        }
        if ((i3 & 16) != 0) {
            gzsVar2 = null;
        }
        if ((i3 & 32) != 0) {
            z = false;
        }
        if ((i3 & 64) != 0) {
            z2 = false;
        }
        if ((i3 & 128) != 0) {
            z3 = true;
        }
        ntxVar.R5(actionLink, i, i2, gzsVar, gzsVar2, z, z2, z3);
    }

    void R5(ActionLink actionLink, int i, int i2, gzs<s3q0> gzsVar, gzs<s3q0> gzsVar2, boolean z, boolean z2, boolean z3);
}
