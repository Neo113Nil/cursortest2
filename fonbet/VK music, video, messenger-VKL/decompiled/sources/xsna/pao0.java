package xsna;

import android.content.Context;
import com.vk.auth.main.TermsLink;
import com.vkontakte.android.R;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/* compiled from: TermsTextDelegate.kt */
/* loaded from: classes15.dex */
public final class pao0 {
    public final int a;
    public final int b;
    public final int c;
    public gzs<? extends List<TermsLink>> d;

    public pao0() {
        this(7);
    }

    public final String a(Context context, String str) {
        if (this.d.invoke().isEmpty()) {
            return context.getString(this.c, str);
        }
        List<TermsLink> invoke = this.d.invoke();
        ArrayList arrayList = new ArrayList(c5g.u(invoke, 10));
        for (TermsLink termsLink : invoke) {
            arrayList.add(String.format("<a href=%s>%s</a>", Arrays.copyOf(new Object[]{termsLink.d, termsLink.c}, 2)));
        }
        if (arrayList.size() > 1) {
            return context.getString(this.a, str, j5g.g0(j5g.T(1, arrayList), null, null, null, 0, null, 63), j5g.i0(arrayList));
        }
        return context.getString(this.b, str, j5g.Y(arrayList));
    }

    public /* synthetic */ pao0(int i) {
        this(0, 0, (i & 4) != 0 ? 0 : R.string.join_to_call_terms);
    }

    public pao0(int i, int i2, int i3) {
        this.a = i;
        this.b = i2;
        this.c = i3;
        r55 r55Var = r55.a;
        this.d = r55.h().k();
    }
}
