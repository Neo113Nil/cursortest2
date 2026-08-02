package com.yandex.go.tariffcard.ui;

import android.graphics.Typeface;
import android.graphics.drawable.Drawable;
import android.text.SpannableStringBuilder;
import android.text.SpannedString;
import com.yandex.go.tariffcard.ui.f;
import com.yandex.go.zone.dto.objects.ServiceLevelWidget$Invisible;
import com.yandex.go.zone.dto.objects.ServiceLevelWidget$SurgeAlert;
import com.yandex.go.zone.dto.objects.ServiceLevelWidget$SurgeBalance;
import com.yandex.go.zone.dto.objects.e5;
import com.yandex.go.zone.dto.objects.f5;
import defpackage.avj0;
import defpackage.b64;
import defpackage.cvu0;
import defpackage.evu0;
import defpackage.f0i0;
import defpackage.fbu;
import defpackage.fef;
import defpackage.gbu;
import defpackage.gvu0;
import defpackage.h1f0;
import defpackage.hbu;
import defpackage.i3y;
import defpackage.jbu;
import defpackage.jl40;
import defpackage.kbu;
import defpackage.lbu;
import defpackage.mbu;
import defpackage.ny61;
import defpackage.pex0;
import defpackage.qje;
import defpackage.qze0;
import defpackage.sls;
import defpackage.tcc;
import defpackage.v0f0;
import defpackage.w511;
import defpackage.xdf;
import defpackage.xhx0;
import defpackage.xng0;
import defpackage.zcx0;
import defpackage.zuj0;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.text.Regex;
import ru.CryptoPro.JCP.tools.CertReader.Extension;
import ru.yandex.taxi.common_models.net.FormattedText;
import ru.yandex.taxi.tariffs.model.PriceUpdate$PriceLoadingState;
import ru.yandex.taxi.utils.AbsoluteSizeSpanFix;
import ru.yandex.taxi.utils.CustomImageSpan;
import ru.yandex.taxi.utils.StyledTypefaceSpan;

/* loaded from: classes14.dex */
public final class f {
    public final zuj0 a;
    public final xdf b;
    public final ru.yandex.taxi.widget.utils.e c;
    public final ru.yandex.taxi.widget.c d;
    public final i3y e;
    public final i3y f;
    public final i3y g;

    public f(zuj0 zuj0Var, xdf xdfVar, ru.yandex.taxi.widget.utils.e eVar, ru.yandex.taxi.widget.c cVar) {
        this.a = zuj0Var;
        this.b = xdfVar;
        this.c = eVar;
        this.d = cVar;
        final int i = 0;
        this.e = kotlin.a.a(new sls(this) { // from class: whx0
            public final /* synthetic */ f b;

            {
                this.b = this;
            }

            @Override // defpackage.sls
            public final Object invoke() {
                int i2 = i;
                f fVar = this.b;
                switch (i2) {
                    case 0:
                        return tje.c0(f1h0.ic_chevron_next_bold, fVar.c.a);
                    case 1:
                        return Integer.valueOf(tje.u(24, ((avj0) fVar.a).a));
                    default:
                        return Integer.valueOf(tje.u(13, ((avj0) fVar.a).a));
                }
            }
        });
        final int i2 = 1;
        this.f = kotlin.a.a(new sls(this) { // from class: whx0
            public final /* synthetic */ f b;

            {
                this.b = this;
            }

            @Override // defpackage.sls
            public final Object invoke() {
                int i22 = i2;
                f fVar = this.b;
                switch (i22) {
                    case 0:
                        return tje.c0(f1h0.ic_chevron_next_bold, fVar.c.a);
                    case 1:
                        return Integer.valueOf(tje.u(24, ((avj0) fVar.a).a));
                    default:
                        return Integer.valueOf(tje.u(13, ((avj0) fVar.a).a));
                }
            }
        });
        final int i3 = 2;
        this.g = kotlin.a.a(new sls(this) { // from class: whx0
            public final /* synthetic */ f b;

            {
                this.b = this;
            }

            @Override // defpackage.sls
            public final Object invoke() {
                int i22 = i3;
                f fVar = this.b;
                switch (i22) {
                    case 0:
                        return tje.c0(f1h0.ic_chevron_next_bold, fVar.c.a);
                    case 1:
                        return Integer.valueOf(tje.u(24, ((avj0) fVar.a).a));
                    default:
                        return Integer.valueOf(tje.u(13, ((avj0) fVar.a).a));
                }
            }
        });
    }

    public static ru.yandex.taxi.common_models.net.o b(ru.yandex.taxi.common_models.net.o oVar, String str) {
        if (oVar instanceof FormattedText.h) {
            return FormattedText.h.e((FormattedText.h) oVar, null, null, str, 1983);
        }
        if (oVar instanceof FormattedText.d) {
            return FormattedText.d.e((FormattedText.d) oVar, str);
        }
        if (oVar instanceof FormattedText.e) {
            return FormattedText.e.e((FormattedText.e) oVar, str);
        }
        if (oVar instanceof FormattedText.g) {
            FormattedText.g gVar = (FormattedText.g) oVar;
            return FormattedText.g.e(gVar, (FormattedText.h) b(gVar.b, str));
        }
        if (!(oVar instanceof FormattedText.a)) {
            return oVar;
        }
        FormattedText.a aVar = (FormattedText.a) oVar;
        List list = aVar.b;
        ArrayList arrayList = new ArrayList(tcc.n(list, 10));
        Iterator it = list.iterator();
        while (it.hasNext()) {
            arrayList.add(b((ru.yandex.taxi.common_models.net.o) it.next(), str));
        }
        return FormattedText.a.e(aVar, arrayList);
    }

    /* JADX WARN: Code restructure failed: missing block: B:38:0x0073, code lost:
    
        if (java.lang.Character.isDigit(r9.charValue()) == true) goto L35;
     */
    /* JADX WARN: Removed duplicated region for block: B:24:0x0092  */
    /* JADX WARN: Removed duplicated region for block: B:27:0x009b  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static SpannedString e(f fVar, String str, int i) {
        boolean z;
        int intValue = ((Number) fVar.f.getValue()).intValue();
        int intValue2 = ((Number) fVar.g.getValue()).intValue();
        boolean z2 = (i & 8) == 0;
        SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder();
        int i2 = 0;
        int i3 = 0;
        while (i2 < str.length()) {
            char charAt = str.charAt(i2);
            int i4 = i3 + 1;
            if (!Character.isDigit(charAt)) {
                if (jl40.l(String.valueOf(charAt), ",") || jl40.l(String.valueOf(charAt), Extension.DOT_CHAR)) {
                    Character w0 = gvu0.w0(i3 - 1, str);
                    Character w02 = gvu0.w0(i4, str);
                    if (w0 != null) {
                        if (Character.isDigit(w0.charValue())) {
                            if (w02 != null) {
                            }
                        }
                    }
                }
                if (charAt != '-' && charAt != 8211 && charAt != '~' && charAt != 183) {
                    z = false;
                    spannableStringBuilder.append(charAt);
                    if (z) {
                        spannableStringBuilder.setSpan(new AbsoluteSizeSpanFix(intValue2, false), i3, i4, 33);
                        if (z2) {
                            spannableStringBuilder.setSpan(new StyledTypefaceSpan(Typeface.DEFAULT_BOLD, 0, 2, null), i3, i4, 33);
                        }
                    } else {
                        spannableStringBuilder.setSpan(new AbsoluteSizeSpanFix(intValue, false), i3, i4, 33);
                    }
                    i2++;
                    i3 = i4;
                }
            }
            z = true;
            spannableStringBuilder.append(charAt);
            if (z) {
            }
            i2++;
            i3 = i4;
        }
        return new SpannedString(spannableStringBuilder);
    }

    public final CharSequence a(CharSequence charSequence, String str) {
        if (str == null || evu0.J(str)) {
            return charSequence;
        }
        SpannedString e = e(this, " · ".concat(str), 6);
        SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder(charSequence);
        spannableStringBuilder.append((CharSequence) e);
        return spannableStringBuilder;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:13:0x00f1  */
    /* JADX WARN: Removed duplicated region for block: B:28:0x010a  */
    /* JADX WARN: Removed duplicated region for block: B:32:0x0062  */
    /* JADX WARN: Removed duplicated region for block: B:68:0x00df A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:69:0x00e0  */
    /* JADX WARN: Removed duplicated region for block: B:9:0x002f  */
    /* JADX WARN: Type inference failed for: r1v5, types: [int] */
    /* JADX WARN: Type inference failed for: r4v1, types: [com.yandex.go.tariffcard.ui.f] */
    /* JADX WARN: Type inference failed for: r4v10 */
    /* JADX WARN: Type inference failed for: r4v11 */
    /* JADX WARN: Type inference failed for: r8v1 */
    /* JADX WARN: Type inference failed for: r8v2, types: [boolean, int] */
    /* JADX WARN: Type inference failed for: r8v3 */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object c(pex0 pex0Var, PriceUpdate$PriceLoadingState priceUpdate$PriceLoadingState, Integer num, String str, ContinuationImpl continuationImpl) {
        TariffOptionsCardHeaderPriceFactory$createPrice$1 tariffOptionsCardHeaderPriceFactory$createPrice$1;
        ?? r4;
        int i;
        boolean z;
        ?? r8;
        int i2;
        zcx0 zcx0Var;
        int i3;
        PriceUpdate$PriceLoadingState priceUpdate$PriceLoadingState2 = priceUpdate$PriceLoadingState;
        if (continuationImpl instanceof TariffOptionsCardHeaderPriceFactory$createPrice$1) {
            tariffOptionsCardHeaderPriceFactory$createPrice$1 = (TariffOptionsCardHeaderPriceFactory$createPrice$1) continuationImpl;
            int i4 = tariffOptionsCardHeaderPriceFactory$createPrice$1.label;
            if ((i4 & Integer.MIN_VALUE) != 0) {
                tariffOptionsCardHeaderPriceFactory$createPrice$1.label = i4 - Integer.MIN_VALUE;
                r4 = this;
                TariffOptionsCardHeaderPriceFactory$createPrice$1 tariffOptionsCardHeaderPriceFactory$createPrice$12 = tariffOptionsCardHeaderPriceFactory$createPrice$1;
                Object obj = tariffOptionsCardHeaderPriceFactory$createPrice$12.result;
                CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
                i = tariffOptionsCardHeaderPriceFactory$createPrice$12.label;
                boolean z2 = false;
                if (i != 0) {
                    kotlin.b.b(obj);
                    qze0 qze0Var = pex0Var.m;
                    String str2 = qze0Var != null ? qze0Var.a : null;
                    fef fefVar = qze0Var != null ? qze0Var.c : null;
                    if (priceUpdate$PriceLoadingState2 == PriceUpdate$PriceLoadingState.LOADING && (str2 == null || evu0.J(str2))) {
                        return fbu.a;
                    }
                    f5 f5Var = pex0Var.w0;
                    if ((f5Var instanceof ServiceLevelWidget$SurgeBalance) || (f5Var instanceof ServiceLevelWidget$SurgeAlert)) {
                        z = true;
                    } else {
                        if (!(f5Var instanceof ServiceLevelWidget$Invisible) && !jl40.l(f5Var, e5.INSTANCE)) {
                            w511.b();
                            return null;
                        }
                        z = false;
                    }
                    if (pex0Var.u) {
                        qze0 qze0Var2 = pex0Var.m;
                        if (!(qze0Var2 != null ? qze0Var2.h : false)) {
                            r8 = 1;
                            v0f0 v0f0Var = (qze0Var != null || (zcx0Var = qze0Var.m) == null) ? null : zcx0Var.b;
                            tariffOptionsCardHeaderPriceFactory$createPrice$12.L$0 = null;
                            tariffOptionsCardHeaderPriceFactory$createPrice$12.L$1 = priceUpdate$PriceLoadingState2;
                            tariffOptionsCardHeaderPriceFactory$createPrice$12.L$2 = null;
                            tariffOptionsCardHeaderPriceFactory$createPrice$12.L$3 = null;
                            tariffOptionsCardHeaderPriceFactory$createPrice$12.L$4 = null;
                            tariffOptionsCardHeaderPriceFactory$createPrice$12.L$5 = null;
                            tariffOptionsCardHeaderPriceFactory$createPrice$12.L$6 = null;
                            tariffOptionsCardHeaderPriceFactory$createPrice$12.L$7 = null;
                            tariffOptionsCardHeaderPriceFactory$createPrice$12.I$0 = z ? 1 : 0;
                            tariffOptionsCardHeaderPriceFactory$createPrice$12.I$1 = r8;
                            tariffOptionsCardHeaderPriceFactory$createPrice$12.label = 1;
                            obj = r4.f(v0f0Var, str2, fefVar, r8, z, num, str, tariffOptionsCardHeaderPriceFactory$createPrice$12);
                            if (obj != coroutineSingletons) {
                                return coroutineSingletons;
                            }
                            i2 = r8;
                        }
                    }
                    r8 = 0;
                    if (qze0Var != null) {
                    }
                    tariffOptionsCardHeaderPriceFactory$createPrice$12.L$0 = null;
                    tariffOptionsCardHeaderPriceFactory$createPrice$12.L$1 = priceUpdate$PriceLoadingState2;
                    tariffOptionsCardHeaderPriceFactory$createPrice$12.L$2 = null;
                    tariffOptionsCardHeaderPriceFactory$createPrice$12.L$3 = null;
                    tariffOptionsCardHeaderPriceFactory$createPrice$12.L$4 = null;
                    tariffOptionsCardHeaderPriceFactory$createPrice$12.L$5 = null;
                    tariffOptionsCardHeaderPriceFactory$createPrice$12.L$6 = null;
                    tariffOptionsCardHeaderPriceFactory$createPrice$12.L$7 = null;
                    tariffOptionsCardHeaderPriceFactory$createPrice$12.I$0 = z ? 1 : 0;
                    tariffOptionsCardHeaderPriceFactory$createPrice$12.I$1 = r8;
                    tariffOptionsCardHeaderPriceFactory$createPrice$12.label = 1;
                    obj = r4.f(v0f0Var, str2, fefVar, r8, z, num, str, tariffOptionsCardHeaderPriceFactory$createPrice$12);
                    if (obj != coroutineSingletons) {
                    }
                } else {
                    if (i != 1) {
                        ny61.r("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    i2 = tariffOptionsCardHeaderPriceFactory$createPrice$12.I$1;
                    ?? r1 = tariffOptionsCardHeaderPriceFactory$createPrice$12.I$0;
                    PriceUpdate$PriceLoadingState priceUpdate$PriceLoadingState3 = (PriceUpdate$PriceLoadingState) tariffOptionsCardHeaderPriceFactory$createPrice$12.L$1;
                    kotlin.b.b(obj);
                    z = r1;
                    priceUpdate$PriceLoadingState2 = priceUpdate$PriceLoadingState3;
                }
                h1f0 h1f0Var = (h1f0) obj;
                CharSequence charSequence = h1f0Var.a;
                String str3 = h1f0Var.b;
                i3 = xhx0.a[priceUpdate$PriceLoadingState2.ordinal()];
                if (i3 != 1) {
                    return new gbu(charSequence, str3);
                }
                if (i3 != 2 && i3 != 3 && i3 != 4) {
                    w511.b();
                    return null;
                }
                if (z && i2 == 0) {
                    z2 = true;
                }
                return new hbu(z2, charSequence, str3);
            }
        }
        f fVar = this;
        tariffOptionsCardHeaderPriceFactory$createPrice$1 = new TariffOptionsCardHeaderPriceFactory$createPrice$1(fVar, continuationImpl);
        r4 = fVar;
        TariffOptionsCardHeaderPriceFactory$createPrice$1 tariffOptionsCardHeaderPriceFactory$createPrice$122 = tariffOptionsCardHeaderPriceFactory$createPrice$1;
        Object obj2 = tariffOptionsCardHeaderPriceFactory$createPrice$122.result;
        CoroutineSingletons coroutineSingletons2 = CoroutineSingletons.COROUTINE_SUSPENDED;
        i = tariffOptionsCardHeaderPriceFactory$createPrice$122.label;
        boolean z22 = false;
        if (i != 0) {
        }
        h1f0 h1f0Var2 = (h1f0) obj2;
        CharSequence charSequence2 = h1f0Var2.a;
        String str32 = h1f0Var2.b;
        i3 = xhx0.a[priceUpdate$PriceLoadingState2.ordinal()];
        if (i3 != 1) {
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:47:0x0044  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0022  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object d(pex0 pex0Var, PriceUpdate$PriceLoadingState priceUpdate$PriceLoadingState, boolean z, ContinuationImpl continuationImpl) {
        TariffOptionsCardHeaderPriceFactory$createPriceDetails$1 tariffOptionsCardHeaderPriceFactory$createPriceDetails$1;
        int i;
        v0f0 v0f0Var;
        zcx0 zcx0Var;
        CharSequence charSequence;
        String str;
        if (continuationImpl instanceof TariffOptionsCardHeaderPriceFactory$createPriceDetails$1) {
            tariffOptionsCardHeaderPriceFactory$createPriceDetails$1 = (TariffOptionsCardHeaderPriceFactory$createPriceDetails$1) continuationImpl;
            int i2 = tariffOptionsCardHeaderPriceFactory$createPriceDetails$1.label;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                tariffOptionsCardHeaderPriceFactory$createPriceDetails$1.label = i2 - Integer.MIN_VALUE;
                Object obj = tariffOptionsCardHeaderPriceFactory$createPriceDetails$1.result;
                CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
                i = tariffOptionsCardHeaderPriceFactory$createPriceDetails$1.label;
                if (i != 0) {
                    kotlin.b.b(obj);
                    if (priceUpdate$PriceLoadingState == PriceUpdate$PriceLoadingState.LOADING && pex0Var.m == null) {
                        return jbu.a;
                    }
                    qze0 qze0Var = pex0Var.m;
                    v0f0 v0f0Var2 = (qze0Var == null || (zcx0Var = qze0Var.m) == null) ? null : zcx0Var.c;
                    String str2 = z ? "#80FFFFFF" : null;
                    if (v0f0Var2 == null) {
                        v0f0Var2 = null;
                    } else if (str2 != null) {
                        List list = v0f0Var2.a.a;
                        ArrayList arrayList = new ArrayList(tcc.n(list, 10));
                        Iterator it = list.iterator();
                        while (it.hasNext()) {
                            arrayList.add(b((ru.yandex.taxi.common_models.net.o) it.next(), str2));
                        }
                        v0f0Var2 = new v0f0(v0f0Var2.b, new FormattedText(arrayList));
                    }
                    tariffOptionsCardHeaderPriceFactory$createPriceDetails$1.L$0 = null;
                    tariffOptionsCardHeaderPriceFactory$createPriceDetails$1.L$1 = priceUpdate$PriceLoadingState;
                    tariffOptionsCardHeaderPriceFactory$createPriceDetails$1.L$2 = null;
                    tariffOptionsCardHeaderPriceFactory$createPriceDetails$1.L$3 = null;
                    tariffOptionsCardHeaderPriceFactory$createPriceDetails$1.L$4 = v0f0Var2;
                    tariffOptionsCardHeaderPriceFactory$createPriceDetails$1.Z$0 = z;
                    tariffOptionsCardHeaderPriceFactory$createPriceDetails$1.label = 1;
                    obj = v0f0Var2 == null ? null : ru.yandex.taxi.widget.c.i(this.d, v0f0Var2.a, null, tariffOptionsCardHeaderPriceFactory$createPriceDetails$1, 30);
                    if (obj == coroutineSingletons) {
                        return coroutineSingletons;
                    }
                    v0f0Var = v0f0Var2;
                } else {
                    if (i != 1) {
                        ny61.r("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    v0f0Var = (v0f0) tariffOptionsCardHeaderPriceFactory$createPriceDetails$1.L$4;
                    priceUpdate$PriceLoadingState = (PriceUpdate$PriceLoadingState) tariffOptionsCardHeaderPriceFactory$createPriceDetails$1.L$1;
                    kotlin.b.b(obj);
                }
                charSequence = (CharSequence) obj;
                if (charSequence != null || evu0.J(charSequence)) {
                    return kbu.a;
                }
                int i3 = xhx0.a[priceUpdate$PriceLoadingState.ordinal()];
                if (i3 == 1) {
                    str = v0f0Var != null ? v0f0Var.b : null;
                    if (str == null || evu0.J(str)) {
                        str = charSequence.toString();
                    }
                    return new lbu(charSequence, str);
                }
                if (i3 != 2 && i3 != 3 && i3 != 4) {
                    w511.b();
                    return null;
                }
                str = v0f0Var != null ? v0f0Var.b : null;
                if (str == null || evu0.J(str)) {
                    str = charSequence.toString();
                }
                return new mbu(charSequence, str);
            }
        }
        tariffOptionsCardHeaderPriceFactory$createPriceDetails$1 = new TariffOptionsCardHeaderPriceFactory$createPriceDetails$1(this, continuationImpl);
        Object obj2 = tariffOptionsCardHeaderPriceFactory$createPriceDetails$1.result;
        CoroutineSingletons coroutineSingletons2 = CoroutineSingletons.COROUTINE_SUSPENDED;
        i = tariffOptionsCardHeaderPriceFactory$createPriceDetails$1.label;
        if (i != 0) {
        }
        charSequence = (CharSequence) obj2;
        if (charSequence != null) {
        }
        return kbu.a;
    }

    /* JADX WARN: Code restructure failed: missing block: B:15:0x00ab, code lost:
    
        if (r4 != null) goto L42;
     */
    /* JADX WARN: Removed duplicated region for block: B:12:0x00a3  */
    /* JADX WARN: Removed duplicated region for block: B:18:0x0100 A[ADDED_TO_REGION] */
    /* JADX WARN: Removed duplicated region for block: B:20:0x0105  */
    /* JADX WARN: Removed duplicated region for block: B:22:0x010a  */
    /* JADX WARN: Removed duplicated region for block: B:24:0x0158  */
    /* JADX WARN: Removed duplicated region for block: B:28:0x0162  */
    /* JADX WARN: Removed duplicated region for block: B:30:0x0165  */
    /* JADX WARN: Removed duplicated region for block: B:35:0x00bb  */
    /* JADX WARN: Removed duplicated region for block: B:42:0x0054  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x002a  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object f(v0f0 v0f0Var, String str, fef fefVar, boolean z, boolean z2, Integer num, String str2, ContinuationImpl continuationImpl) {
        TariffOptionsCardHeaderPriceFactory$getPriceWithDescription$1 tariffOptionsCardHeaderPriceFactory$getPriceWithDescription$1;
        int i;
        boolean z3;
        Integer num2;
        String str3;
        v0f0 v0f0Var2;
        fef fefVar2;
        String str4;
        String str5;
        CharSequence e;
        CharSequence a;
        Drawable drawable;
        String str6;
        String str7;
        if (continuationImpl instanceof TariffOptionsCardHeaderPriceFactory$getPriceWithDescription$1) {
            tariffOptionsCardHeaderPriceFactory$getPriceWithDescription$1 = (TariffOptionsCardHeaderPriceFactory$getPriceWithDescription$1) continuationImpl;
            int i2 = tariffOptionsCardHeaderPriceFactory$getPriceWithDescription$1.label;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                tariffOptionsCardHeaderPriceFactory$getPriceWithDescription$1.label = i2 - Integer.MIN_VALUE;
                Object obj = tariffOptionsCardHeaderPriceFactory$getPriceWithDescription$1.result;
                CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
                i = tariffOptionsCardHeaderPriceFactory$getPriceWithDescription$1.label;
                zuj0 zuj0Var = this.a;
                if (i != 0) {
                    kotlin.b.b(obj);
                    if (z) {
                        return new h1f0(((avj0) zuj0Var).h(f0i0.address_tariff_unavailable), "");
                    }
                    if (str == null || evu0.J(str)) {
                        return new h1f0("", "");
                    }
                    if (v0f0Var == null) {
                        z3 = z2;
                        num2 = num;
                        str3 = str2;
                        v0f0Var2 = v0f0Var;
                        fefVar2 = fefVar;
                        str4 = str;
                        if (fefVar2 != null) {
                            String d = this.b.d(fefVar2, false, "$SIGN$");
                            if (new Regex(b64.j(d, "\\d")).a(str4)) {
                                str5 = cvu0.v(str4, d, d + " ", false);
                                e = e(this, str5, 14);
                                a = a(e, str3);
                                drawable = (Drawable) this.e.getValue();
                                if (z3 && drawable != null) {
                                    drawable.setTint(num2 == null ? num2.intValue() : qje.t(xng0.textMain, ((avj0) zuj0Var).a));
                                    SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder();
                                    spannableStringBuilder.append(a);
                                    spannableStringBuilder.append((char) 160);
                                    CustomImageSpan customImageSpan = new CustomImageSpan(drawable, 2, false, true, null, 20, null);
                                    int length = spannableStringBuilder.length();
                                    spannableStringBuilder.append((CharSequence) "[chevron]");
                                    spannableStringBuilder.setSpan(customImageSpan, length, spannableStringBuilder.length(), 17);
                                    a = new SpannedString(spannableStringBuilder);
                                }
                                if (v0f0Var2 != null && (str6 = v0f0Var2.b) != null) {
                                    str7 = evu0.J(str6) ? null : str6;
                                    if (str7 != null) {
                                        str4 = str7;
                                    }
                                }
                                return new h1f0(a, a(str4, str3).toString());
                            }
                        }
                        str5 = str4;
                        e = e(this, str5, 14);
                        a = a(e, str3);
                        drawable = (Drawable) this.e.getValue();
                        if (z3) {
                            drawable.setTint(num2 == null ? num2.intValue() : qje.t(xng0.textMain, ((avj0) zuj0Var).a));
                            SpannableStringBuilder spannableStringBuilder2 = new SpannableStringBuilder();
                            spannableStringBuilder2.append(a);
                            spannableStringBuilder2.append((char) 160);
                            CustomImageSpan customImageSpan2 = new CustomImageSpan(drawable, 2, false, true, null, 20, null);
                            int length2 = spannableStringBuilder2.length();
                            spannableStringBuilder2.append((CharSequence) "[chevron]");
                            spannableStringBuilder2.setSpan(customImageSpan2, length2, spannableStringBuilder2.length(), 17);
                            a = new SpannedString(spannableStringBuilder2);
                        }
                        if (v0f0Var2 != null) {
                            if (evu0.J(str6)) {
                            }
                            if (str7 != null) {
                            }
                        }
                        return new h1f0(a, a(str4, str3).toString());
                    }
                    FormattedText formattedText = v0f0Var.a;
                    tariffOptionsCardHeaderPriceFactory$getPriceWithDescription$1.L$0 = v0f0Var;
                    tariffOptionsCardHeaderPriceFactory$getPriceWithDescription$1.L$1 = str;
                    tariffOptionsCardHeaderPriceFactory$getPriceWithDescription$1.L$2 = fefVar;
                    num2 = num;
                    tariffOptionsCardHeaderPriceFactory$getPriceWithDescription$1.L$3 = num2;
                    str3 = str2;
                    tariffOptionsCardHeaderPriceFactory$getPriceWithDescription$1.L$4 = str3;
                    tariffOptionsCardHeaderPriceFactory$getPriceWithDescription$1.L$5 = null;
                    tariffOptionsCardHeaderPriceFactory$getPriceWithDescription$1.Z$0 = z;
                    z3 = z2;
                    tariffOptionsCardHeaderPriceFactory$getPriceWithDescription$1.Z$1 = z3;
                    tariffOptionsCardHeaderPriceFactory$getPriceWithDescription$1.label = 1;
                    obj = ru.yandex.taxi.widget.c.i(this.d, formattedText, null, tariffOptionsCardHeaderPriceFactory$getPriceWithDescription$1, 30);
                    if (obj == coroutineSingletons) {
                        return coroutineSingletons;
                    }
                    v0f0Var2 = v0f0Var;
                    fefVar2 = fefVar;
                    str4 = str;
                } else {
                    if (i != 1) {
                        ny61.r("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    boolean z4 = tariffOptionsCardHeaderPriceFactory$getPriceWithDescription$1.Z$1;
                    String str8 = (String) tariffOptionsCardHeaderPriceFactory$getPriceWithDescription$1.L$4;
                    Integer num3 = (Integer) tariffOptionsCardHeaderPriceFactory$getPriceWithDescription$1.L$3;
                    fefVar2 = (fef) tariffOptionsCardHeaderPriceFactory$getPriceWithDescription$1.L$2;
                    str4 = (String) tariffOptionsCardHeaderPriceFactory$getPriceWithDescription$1.L$1;
                    v0f0 v0f0Var3 = (v0f0) tariffOptionsCardHeaderPriceFactory$getPriceWithDescription$1.L$0;
                    kotlin.b.b(obj);
                    str3 = str8;
                    num2 = num3;
                    z3 = z4;
                    v0f0Var2 = v0f0Var3;
                }
                e = (CharSequence) obj;
                if (e != null) {
                    if (evu0.J(e)) {
                        e = null;
                    }
                }
                if (fefVar2 != null) {
                }
                str5 = str4;
                e = e(this, str5, 14);
                a = a(e, str3);
                drawable = (Drawable) this.e.getValue();
                if (z3) {
                }
                if (v0f0Var2 != null) {
                }
                return new h1f0(a, a(str4, str3).toString());
            }
        }
        tariffOptionsCardHeaderPriceFactory$getPriceWithDescription$1 = new TariffOptionsCardHeaderPriceFactory$getPriceWithDescription$1(this, continuationImpl);
        Object obj2 = tariffOptionsCardHeaderPriceFactory$getPriceWithDescription$1.result;
        CoroutineSingletons coroutineSingletons2 = CoroutineSingletons.COROUTINE_SUSPENDED;
        i = tariffOptionsCardHeaderPriceFactory$getPriceWithDescription$1.label;
        zuj0 zuj0Var2 = this.a;
        if (i != 0) {
        }
        e = (CharSequence) obj2;
        if (e != null) {
        }
        if (fefVar2 != null) {
        }
        str5 = str4;
        e = e(this, str5, 14);
        a = a(e, str3);
        drawable = (Drawable) this.e.getValue();
        if (z3) {
        }
        if (v0f0Var2 != null) {
        }
        return new h1f0(a, a(str4, str3).toString());
    }
}
