package xsna;

import androidx.compose.runtime.a;
import com.vkontakte.android.R;
import java.util.Date;
import java.util.concurrent.TimeUnit;
import xsna.q630;

/* compiled from: DatePickerDialogContent.kt */
/* loaded from: classes17.dex */
public final class cyk {
    public static final void a(Long l, izs izsVar, q630 q630Var, androidx.compose.runtime.a aVar, int i) {
        q630 q630Var2;
        androidx.compose.runtime.a M = aVar.M(-664327673);
        int i2 = i | (M.J(l) ? 4 : 2) | (M.y(izsVar) ? 32 : 16) | 384;
        if (M.t(i2 & 1, (i2 & 147) != 146)) {
            if (androidx.compose.runtime.b.d()) {
                androidx.compose.runtime.b.f(-664327673, i2, -1, "com.vk.clips.upload.ui.impl.compose.features.delayed_publish.DatePickerDialogContent (DatePickerDialogContent.kt:19)");
            }
            Date date = new Date();
            Date date2 = new Date(TimeUnit.DAYS.toMillis(90L) + date.getTime());
            Date date3 = l != null ? new Date(l.longValue()) : new Date(TimeUnit.HOURS.toMillis(4L) + date.getTime());
            String N = d370.N(R.string.clips_publish_date_selector_title, 0, M);
            Object x = M.x();
            a.C0011a.C0012a c0012a = a.C0011a.a;
            if (x == c0012a) {
                x = new ci3(20);
                M.R(x);
            }
            com.vk.core.compose.component.semantics.a a = com.vk.core.compose.component.semantics.b.a(null, (izs) x, 3);
            int i3 = i2 & 112;
            boolean z = i3 == 32;
            Object x2 = M.x();
            if (z || x2 == c0012a) {
                x2 = new lyg(izsVar, 1);
                M.R(x2);
            }
            izs izsVar2 = (izs) x2;
            boolean z2 = i3 == 32;
            Object x3 = M.x();
            if (z2 || x3 == c0012a) {
                x3 = new dn7(izsVar, 1);
                M.R(x3);
            }
            gzs gzsVar = (gzs) x3;
            boolean z3 = i3 == 32;
            Object x4 = M.x();
            if (z3 || x4 == c0012a) {
                x4 = new vpd(izsVar, 1);
                M.R(x4);
            }
            q630.a aVar2 = q630.a.a;
            eyk.a(N, izsVar2, aVar2, a, date3, date, date2, gzsVar, (gzs) x4, M, 384, 16);
            if (androidx.compose.runtime.b.d()) {
                androidx.compose.runtime.b.e();
            }
            q630Var2 = aVar2;
        } else {
            M.h();
            q630Var2 = q630Var;
        }
        androidx.compose.runtime.f s = M.s();
        if (s != null) {
            s.d = new l8c(i, 3, l, izsVar, q630Var2);
        }
    }
}
