package defpackage;

import android.text.SpannableStringBuilder;
import com.yandex.messaging.core.net.entities.proto.message.LocalizedData;
import com.yandex.messaging.domain.user.UserNameType;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Objects;

/* loaded from: classes15.dex */
public final class ij10 {
    public final rp21 a;
    public final z5z b;
    public final h3y c;

    public ij10(rp21 rp21Var, z5z z5zVar, h3y h3yVar) {
        this.a = rp21Var;
        this.b = z5zVar;
        this.c = h3yVar;
    }

    public final hdu a(String str) {
        int i;
        LocalizedData a;
        List b = if90.b(str);
        SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder(str);
        ArrayList arrayList = new ArrayList(b.size());
        Iterator it = b.iterator();
        while (true) {
            if (!it.hasNext()) {
                break;
            }
            cj10 cj10Var = (cj10) it.next();
            spannableStringBuilder.setSpan(new hj10(cj10Var.a), cj10Var.b, cj10Var.c, 0);
            arrayList.add(cj10Var.a);
        }
        for (hj10 hj10Var : (hj10[]) spannableStringBuilder.getSpans(0, spannableStringBuilder.length(), hj10.class)) {
            iv21 iv21Var = (iv21) this.c.get();
            Objects.requireNonNull(iv21Var);
            String displayName = (!iv21Var.c || (a = this.b.a(hj10Var.a)) == null) ? null : a.getDisplayName();
            if (displayName == null) {
                String str2 = hj10Var.a;
                rp21 rp21Var = this.a;
                long c = rp21Var.b.c();
                in21 a2 = rp21Var.a.a().a(str2);
                displayName = (a2 == null ? new qp21(null, UserNameType.NOT_FOUND) : rp21Var.c.a(a2, c)).a;
                if (displayName == null) {
                    displayName = "";
                }
            }
            spannableStringBuilder.replace(spannableStringBuilder.getSpanStart(hj10Var), spannableStringBuilder.getSpanEnd(hj10Var), (CharSequence) displayName);
        }
        return new hdu(spannableStringBuilder.toString(), arrayList);
    }
}
