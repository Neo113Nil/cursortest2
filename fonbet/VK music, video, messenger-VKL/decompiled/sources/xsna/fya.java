package xsna;

import android.content.Context;
import com.vkontakte.android.R;
import com.vungle.ads.internal.protos.Sdk;
import kotlin.NoWhenBranchMatchedException;
import xsna.eya;

/* compiled from: ChannelDonutSupportReducer.kt */
/* loaded from: classes16.dex */
public final class fya extends dm50<iya, eya, hya> {

    /* compiled from: ChannelDonutSupportReducer.kt */
    public static final class a {
        public static String a(int i) {
            String valueOf = String.valueOf(i);
            StringBuilder sb = new StringBuilder();
            int i2 = 0;
            for (int length = valueOf.length() - 1; -1 < length; length--) {
                char charAt = valueOf.charAt(length);
                if (Character.isDigit(charAt)) {
                    if (i2 > 0 && i2 % 3 == 0) {
                        sb.append(' ');
                    }
                    i2++;
                }
                sb.append(charAt);
            }
            return sb.reverse().toString();
        }
    }

    @Override // xsna.dm50
    public final hya c(hya hyaVar, eya eyaVar) {
        hya hyaVar2 = hyaVar;
        eya eyaVar2 = eyaVar;
        if (eyaVar2 instanceof eya.c) {
            return hya.a(hyaVar2, true, false, null, null, null, 125);
        }
        if (eyaVar2 instanceof eya.g) {
            return hya.a(hyaVar2, false, true, null, null, null, 123);
        }
        if (eyaVar2 instanceof eya.d) {
            f0o f0oVar = ((eya.d) eyaVar2).b;
            Context context = e43.a;
            if (context == null) {
                context = null;
            }
            return hya.a(hyaVar2, false, false, context.getString(R.string.vkim_channels_donut_support_name_placeholder), null, f0oVar, 85);
        }
        if (eyaVar2 instanceof eya.e) {
            return hya.a(hyaVar2, false, false, ((eya.e) eyaVar2).b, null, null, 55);
        }
        if (eyaVar2 instanceof eya.h) {
            return hya.a(hyaVar2, false, false, null, ((eya.h) eyaVar2).b, null, 47);
        }
        if (eyaVar2 instanceof eya.b) {
            return hya.a(hyaVar2, false, false, null, null, null, Sdk.SDKError.Reason.TPAT_ERROR_VALUE);
        }
        if (eyaVar2 instanceof eya.f) {
            return hya.a(hyaVar2, false, false, null, null, null, 123);
        }
        if (eyaVar2 instanceof eya.a) {
            return hya.a(hyaVar2, false, false, null, null, null, 123);
        }
        throw new NoWhenBranchMatchedException();
    }

    @Override // xsna.dm50
    public final iya d() {
        return new iya(e(new go1(this, 17)));
    }

    @Override // xsna.dm50
    public final void h(hya hyaVar, iya iyaVar) {
        f(iyaVar.a, hyaVar);
    }
}
