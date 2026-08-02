package xsna;

import android.content.Context;
import com.vk.dto.hints.Hint;
import com.vk.dto.hints.HintId;
import java.util.Map;

/* compiled from: ImportContactsDetailsView.kt */
/* loaded from: classes2.dex */
public final class dqw extends rpo0 {
    public final wh50<Integer> m;
    public final wh50 n;

    public dqw(Context context) {
        super(context, null, 0);
        this.m = androidx.compose.runtime.k.b(0);
        this.n = androidx.compose.runtime.k.b(null);
    }

    @Override // xsna.rpo0
    public final void A(int i, androidx.compose.runtime.a aVar) {
        Map<String, String> map;
        androidx.compose.runtime.a M = aVar.M(-2009540965);
        int i2 = (M.y(this) ? 4 : 2) | i;
        if (M.t(i2 & 1, (i2 & 3) != 2)) {
            if (androidx.compose.runtime.b.d()) {
                androidx.compose.runtime.b.f(-2009540965, i2, -1, "com.vk.importcontacts.impl.presentation.details.view.ImportContactsDetailsView.ThemedContent (ImportContactsDetailsView.kt:57)");
            }
            Hint p = pla.e().b().p(HintId.REGISTRATION_IMPORT_CONTACT_DETAILS.getId());
            String str = (p == null || (map = p.e) == null) ? null : map.get("vk_icon_illustration_import_contacts_details");
            if (str == null) {
                str = "";
            }
            gqw.a(str, this.m, getOnAction(), M, 0);
            if (androidx.compose.runtime.b.d()) {
                androidx.compose.runtime.b.e();
            }
        } else {
            M.h();
        }
        androidx.compose.runtime.f s = M.s();
        if (s != null) {
            s.d = new nq1(this, i, 5);
        }
    }

    public final izs<cqw, s3q0> getOnAction() {
        return (izs) ((zak0) this.n).getValue();
    }

    public final void setOnAction(izs<? super cqw, s3q0> izsVar) {
        ((zak0) this.n).setValue(izsVar);
    }
}
