package com.ybsdk.feature.savings.internal.screens.diffrate;

import com.ybsdk.core.analytics.generated.AppAnalyticsReporter;
import com.ybsdk.core.analytics.generated.PlusStatusDiffRate;
import com.ybsdk.core.analytics.generated.delegates.DiffRateEvents$BottomsheetDiffRateCalendarButtonClickButton;
import com.ybsdk.core.utils.dto.common.FailDataException;
import com.ybsdk.core.utils.text.Text;
import com.ybsdk.core.utils.text.d;
import com.ybsdk.di.modules.features.p;
import defpackage.acj;
import defpackage.bij;
import defpackage.ds31;
import defpackage.eij;
import defpackage.fdm0;
import defpackage.g5;
import defpackage.g8e;
import defpackage.gdm0;
import defpackage.gh91;
import defpackage.lij;
import defpackage.r8j0;
import defpackage.rt1;
import defpackage.s8j0;
import defpackage.sij;
import defpackage.tfl0;
import defpackage.tje;
import defpackage.u8j0;
import defpackage.uc5;
import defpackage.vij;
import java.util.LinkedHashMap;
import ru.rt.ebs.cryptosdk.core.metadata.entities.MetaDataField;

/* loaded from: classes3.dex */
public final class a extends uc5 {
    public final tfl0 B;
    public final com.ybsdk.feature.savings.internal.data.a C;
    public final fdm0 D;
    public final g5 E;
    public final AppAnalyticsReporter F;
    public final p G;
    public boolean H;
    public boolean I;
    public String J;

    public a(tfl0 tfl0Var, com.ybsdk.feature.savings.internal.data.a aVar, fdm0 fdm0Var, g5 g5Var, AppAnalyticsReporter appAnalyticsReporter, p pVar, sij sijVar) {
        super(new acj(5), sijVar);
        this.B = tfl0Var;
        this.C = aVar;
        this.D = fdm0Var;
        this.E = g5Var;
        this.F = appAnalyticsReporter;
        this.G = pVar;
        tje.N(ds31.a(this), null, null, new DiffRateCalendarViewModel$loadData$1(this, null), 3);
    }

    public final void b0() {
        rt1 rt1Var = this.F.u;
        String str = this.J;
        if (str == null) {
            str = "";
        }
        PlusStatusDiffRate plusStatusDiffRate = this.H ? PlusStatusDiffRate.ACTIVE : PlusStatusDiffRate.INACTIVE;
        LinkedHashMap w = g8e.w(2, "min_date", str);
        w.put("plus_status", plusStatusDiffRate.getOriginalValue());
        rt1Var.a.a("bottomsheet.diff_rate.calendar.closed", w);
        this.B.e();
    }

    public final void c0(long j) {
        bij bijVar;
        vij vijVar;
        u8j0 u8j0Var = ((eij) X()).a;
        r8j0 r8j0Var = u8j0Var instanceof r8j0 ? (r8j0) u8j0Var : null;
        if (r8j0Var == null || (bijVar = (bij) r8j0Var.a) == null || (vijVar = (vij) bijVar.a.get(Long.valueOf(j))) == null) {
            return;
        }
        Text text = vijVar.c;
        Text text2 = vijVar.d;
        if (d.d(text) && d.d(text2)) {
            return;
        }
        rt1 rt1Var = this.F.u;
        DiffRateEvents$BottomsheetDiffRateCalendarButtonClickButton diffRateEvents$BottomsheetDiffRateCalendarButtonClickButton = DiffRateEvents$BottomsheetDiffRateCalendarButtonClickButton.DATE;
        String b = gh91.b(j);
        boolean z = vijVar.e;
        LinkedHashMap linkedHashMap = new LinkedHashMap(3);
        linkedHashMap.put("button", diffRateEvents$BottomsheetDiffRateCalendarButtonClickButton.getOriginalValue());
        linkedHashMap.put(MetaDataField.DATE_FIELD, b);
        linkedHashMap.put("diff_rate_status", Boolean.valueOf(z));
        rt1Var.a.a("bottomsheet.diff_rate.calendar.button.click", linkedHashMap);
        if (text == null) {
            text = Text.Empty.INSTANCE;
        }
        if (text2 == null) {
            text2 = Text.Empty.INSTANCE;
        }
        Z(new lij(text, text2));
    }

    public final void d0() {
        u8j0 u8j0Var = ((eij) X()).a;
        s8j0 s8j0Var = u8j0Var instanceof s8j0 ? (s8j0) u8j0Var : null;
        Throwable th = s8j0Var != null ? s8j0Var.a : null;
        FailDataException failDataException = th instanceof FailDataException ? (FailDataException) th : null;
        String supportUrl = failDataException != null ? failDataException.getSupportUrl() : null;
        if (this.E.b(supportUrl)) {
            return;
        }
        ((gdm0) this.D).a(supportUrl);
    }

    public final void e0(String str) {
        String str2 = this.J;
        if (str2 == null || str.compareTo(str2) < 0) {
            this.J = str;
        }
    }

    public final void f0() {
        tje.N(ds31.a(this), null, null, new DiffRateCalendarViewModel$loadData$1(this, null), 3);
    }
}
