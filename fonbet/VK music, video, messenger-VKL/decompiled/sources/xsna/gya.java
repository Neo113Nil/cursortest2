package xsna;

import com.vkontakte.android.R;
import kotlin.jvm.internal.FunctionReferenceImpl;
import xsna.fya;
import xsna.iya;
import xsna.tlo0;

/* compiled from: ChannelDonutSupportReducer.kt */
/* loaded from: classes16.dex */
public final /* synthetic */ class gya extends FunctionReferenceImpl implements izs<hya, iya.a.C3087a> {
    /* JADX WARN: Removed duplicated region for block: B:40:0x00d6  */
    /* JADX WARN: Removed duplicated region for block: B:47:0x006d  */
    @Override // xsna.izs
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final iya.a.C3087a invoke(hya hyaVar) {
        tlo0 tlo0Var;
        tlo0 b;
        hya hyaVar2 = hyaVar;
        ((fya) this.receiver).getClass();
        String str = hyaVar2.e;
        String str2 = hyaVar2.f;
        f0o f0oVar = hyaVar2.g;
        int i = f0oVar != null ? f0oVar.a : 64;
        int i2 = f0oVar != null ? f0oVar.c : 0;
        int i3 = f0oVar != null ? f0oVar.d : Integer.MAX_VALUE;
        String str3 = "";
        Integer m = arm0.m(10, brm0.y(str2, " ", ""));
        int intValue = m != null ? m.intValue() : 0;
        tlo0.g gVar = null;
        if (str.length() == 0) {
            b = tq.h(tlo0.Companion, R.string.vkim_channels_donut_support_name_error_empty);
        } else {
            if (str.length() <= i) {
                tlo0Var = null;
                if (str2.length() != 0) {
                    if (intValue < i2) {
                        tlo0.a aVar = tlo0.Companion;
                        Object[] objArr = {fya.a.a(i2)};
                        aVar.getClass();
                        gVar = tlo0.a.c(R.string.vkim_channels_donut_support_price_error_min, objArr);
                    } else if (intValue > i3) {
                        tlo0.a aVar2 = tlo0.Companion;
                        Object[] objArr2 = {fya.a.a(i3)};
                        aVar2.getClass();
                        gVar = tlo0.a.c(R.string.vkim_channels_donut_support_price_error_max, objArr2);
                    }
                }
                tlo0.g gVar2 = gVar;
                boolean z = ((str.length() <= 0 && str.length() <= i) || !(i2 > intValue && intValue <= i3 && str2.length() > 0) || hyaVar2.d) ? false : true;
                boolean z2 = hyaVar2.c;
                boolean z3 = hyaVar2.d;
                String str4 = hyaVar2.e;
                if (str2.length() != 0) {
                    Integer m2 = arm0.m(10, brm0.y(str2, " ", ""));
                    str3 = fya.a.a(m2 != null ? m2.intValue() : 0);
                }
                String str5 = str3;
                tlo0.a aVar3 = tlo0.Companion;
                Object[] objArr3 = {fya.a.a(i2)};
                aVar3.getClass();
                return new iya.a.C3087a(z2, z3, str4, str5, tlo0.a.c(R.string.vkim_channels_donut_support_price_hint_formatted, objArr3), tlo0.a.c(R.string.vkim_channels_donut_support_name_counter, Integer.valueOf(str.length()), Integer.valueOf(i)), tlo0Var, gVar2, z);
            }
            b = hq.b(tlo0.Companion, R.plurals.vkim_channels_donut_support_name_error_max_length, i);
        }
        tlo0Var = b;
        if (str2.length() != 0) {
        }
        tlo0.g gVar22 = gVar;
        if (str.length() <= 0 && str.length() <= i) {
        }
        boolean z22 = hyaVar2.c;
        boolean z32 = hyaVar2.d;
        String str42 = hyaVar2.e;
        if (str2.length() != 0) {
        }
        String str52 = str3;
        tlo0.a aVar32 = tlo0.Companion;
        Object[] objArr32 = {fya.a.a(i2)};
        aVar32.getClass();
        return new iya.a.C3087a(z22, z32, str42, str52, tlo0.a.c(R.string.vkim_channels_donut_support_price_hint_formatted, objArr32), tlo0.a.c(R.string.vkim_channels_donut_support_name_counter, Integer.valueOf(str.length()), Integer.valueOf(i)), tlo0Var, gVar22, z);
    }
}
