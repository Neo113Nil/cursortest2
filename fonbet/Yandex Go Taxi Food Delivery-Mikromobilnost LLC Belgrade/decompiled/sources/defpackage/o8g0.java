package defpackage;

import android.content.Context;
import android.content.res.Resources;
import android.net.Uri;
import android.os.Build;
import android.os.Bundle;
import android.view.View;
import android.view.ViewGroup;
import androidx.core.app.n0;
import androidx.core.app.s0;
import androidx.media3.common.ParserException;
import com.adjust.sdk.Constants;
import com.google.common.collect.ImmutableList;
import com.yandex.go.feedback_common.data.model.QuestionInfo;
import com.yandex.go.routestops.RouteStopsModalView;
import com.yandex.go.taxi.order.details.v2.ui.view.recycler.adapter.holder.o;
import com.yandex.go.taxi.order.recenter.n;
import com.yandex.messaging.core.net.entities.Bucket;
import com.yandex.messaging.core.net.entities.RestrictionsBucket;
import com.yandex.payment.sdk.core.data.PaymentKitError;
import com.yandex.plus.pay.ui.feature.tarifficator.mobile.internal.ui.TarifficatorScenarioActivity;
import com.ybsdk.core.analytics.generated.AppAnalyticsReporter;
import com.ybsdk.core.analytics.generated.SavingsDragAndDropWidgetTypeSavings;
import com.ybsdk.core.analytics.generated.delegates.SavingsEvents$SavingsDashboardAccountType;
import com.ybsdk.core.analytics.generated.delegates.SavingsEvents$SavingsDashboardDragAndDropInitiatedType;
import com.ybsdk.core.analytics.generated.delegates.SavingsEvents$SavingsDashboardDragAndDropMovedType;
import com.ybsdk.core.analytics.generated.delegates.SavingsEvents$SavingsDashboardLoadedResult;
import com.ybsdk.core.common.domain.entities.ActionButtonEntity;
import com.ybsdk.core.common.domain.entities.ThemedImageUrlEntity;
import com.ybsdk.core.utils.ColorModel;
import com.ybsdk.core.utils.ext.ViewState;
import com.ybsdk.core.utils.text.Text;
import com.ybsdk.feature.qr.payments.api.data.PageImageHeaderEntity;
import com.ybsdk.feature.qr.payments.api.data.ProductType;
import com.ybsdk.feature.qr.payments.internal.domain.v2.result.Funding;
import com.ybsdk.feature.qr.payments.internal.screens.presentation.AmountScreenStatus;
import com.ybsdk.feature.qr.payments.internal.screens.presentation.view.OperationStatusView;
import com.ybsdk.feature.qr.payments.internal.screens.result.data.entities.ResultStatus;
import com.ybsdk.feature.savings.internal.data.b;
import com.ybsdk.feature.savings.internal.entities.CellType;
import com.ybsdk.feature.savings.internal.entities.SavingProductType;
import com.ybsdk.feature.savings.internal.entities.SavingsDivEntity$ProductType;
import com.ybsdk.widgets.common.OperationProgressView;
import com.ybsdk.widgets.common.YbButtonView;
import com.ybsdk.widgets.common.k;
import com.ybsdk.widgets.common.l;
import java.io.IOException;
import java.lang.ref.WeakReference;
import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.Collection;
import java.util.Collections;
import java.util.Date;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.concurrent.TimeUnit;
import kotlin.collections.EmptyList;
import kotlin.collections.a;
import org.altbeacon.beacon.Beacon;
import org.altbeacon.beacon.Region;
import ru.CryptoPro.JCP.tools.HexString;

/* loaded from: classes3.dex */
public final class o8g0 implements ev31, al7, eo3, wtq, d5p, ggi0, ryj0 {
    public final Object a;
    public final Object b;

    public o8g0(ViewGroup viewGroup) {
        this.a = new WeakReference(viewGroup);
        this.b = new rwj0();
    }

    public static qz40 a() {
        qz40 qz40Var = new qz40();
        qz40Var.b = true;
        return qz40Var;
    }

    @Override // defpackage.d5p
    public void A() {
        hjl0 hjl0Var = (hjl0) this.b;
        hjl0Var.b.post(new ejl0(hjl0Var, 0));
    }

    @Override // defpackage.d5p
    public g001 B(int i, int i2) {
        return (uyl0) this.a;
    }

    public boolean b() {
        long j = ((b) this.b).b.a.a.getLong("savings_dashboard_balance_animation_timestamp", -1L);
        if (j <= 0) {
            return true;
        }
        Date b = bzk0.b(new Date(j));
        Calendar calendar = Calendar.getInstance();
        calendar.setTime(b);
        calendar.add(5, 1);
        return bzk0.b(new Date(System.currentTimeMillis())).after(calendar.getTime());
    }

    public boolean c() {
        if (((Boolean) pd51.a.getValue()).booleanValue()) {
            Context context = (Context) this.a;
            return pd51.a(10020, context) && pd51.a(24, context) && pd51.a(10021, context);
        }
        int i = Build.VERSION.SDK_INT;
        if (i < 34) {
            return true;
        }
        s0 s0Var = (s0) this.b;
        return i < 34 ? s0Var.a.checkSelfPermission("android.permission.USE_FULL_SCREEN_INTENT") == 0 : n0.a(s0Var.b);
    }

    @Override // defpackage.eo3
    public void d() {
        ((sxj0) this.b).d = wfz.z;
    }

    @Override // defpackage.wtq
    public void e(QuestionInfo questionInfo) {
        String str = questionInfo.a;
        String str2 = questionInfo.b;
        q9k0 q9k0Var = new q9k0(str, str2);
        p9y0 p9y0Var = ((o) this.a).S;
        akk0 akk0Var = ((uik0) this.b).d;
        akk0Var.c.put("question_id", str);
        akk0Var.c.put("answer_id", str2);
        p9y0Var.a(q9k0Var, akk0Var);
    }

    @Override // defpackage.ggi0
    public void f(fi6 fi6Var, List list) {
        ArrayList arrayList = (ArrayList) this.b;
        if (arrayList.isEmpty()) {
            ArrayList arrayList2 = ((n) this.a).a.c;
            if (arrayList2.isEmpty()) {
                arrayList2 = null;
            }
            List J0 = arrayList2 != null ? a.J0(arrayList2) : null;
            if (J0 != null) {
                Iterator it = J0.iterator();
                while (it.hasNext()) {
                    arrayList.add(cwa1.d((zzs) it.next()));
                }
            }
        }
        fi6Var.e(arrayList);
    }

    public void g(int i, int i2) {
        idl0 idl0Var;
        View view = (View) this.a;
        Resources resources = view.getResources();
        int i3 = kyh0.reorder_stops_result;
        Integer valueOf = Integer.valueOf(i2 + 1);
        pcl0 pcl0Var = (pcl0) this.b;
        view.announceForAccessibility(resources.getString(i3, valueOf, Integer.valueOf(pcl0Var.h())));
        ((mdl0) pcl0Var.b).b(i, i2);
        idl0Var = ((RouteStopsModalView) ((sue0) pcl0Var.w).b).presenter;
        mdl0 mdl0Var = idl0Var.J;
        if (mdl0Var != null) {
            ArrayList arrayList = (ArrayList) mdl0Var.z;
            ArrayList arrayList2 = new ArrayList(arrayList.size());
            Iterator it = arrayList.iterator();
            while (it.hasNext()) {
                ((zfu0) it.next()).a(arrayList2);
            }
            idl0Var.E.g(arrayList2);
        }
        pcl0Var.notifyDataSetChanged();
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Code restructure failed: missing block: B:60:0x0119, code lost:
    
        if (r8.equals("L8") == false) goto L14;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public void h(yxf0 yxf0Var) {
        bjl0 bjl0Var = (bjl0) this.b;
        qjl0 qjl0Var = qjl0.c;
        String str = (String) ((czq0) yxf0Var.b).a.get("range");
        if (str != null) {
            try {
                qjl0Var = qjl0.a(str);
            } catch (ParserException e) {
                bjl0Var.a.f("SDP format error.", e);
                return;
            }
        }
        Uri uri = bjl0Var.A;
        czq0 czq0Var = (czq0) yxf0Var.b;
        ImmutableList.a aVar = new ImmutableList.a();
        int i = 0;
        while (true) {
            char c = 1;
            if (i >= czq0Var.b.size()) {
                ImmutableList g = aVar.g();
                boolean isEmpty = g.isEmpty();
                ngg nggVar = bjl0Var.a;
                if (isEmpty) {
                    nggVar.f("No playable track.", null);
                    return;
                }
                long j = qjl0Var.b;
                hjl0 hjl0Var = (hjl0) nggVar.b;
                for (int i2 = 0; i2 < g.size(); i2++) {
                    gjl0 gjl0Var = new gjl0(hjl0Var, (jjl0) g.get(i2), i2, hjl0Var.A);
                    hjl0Var.x.add(gjl0Var);
                    gjl0Var.b.g(gjl0Var.a.b, hjl0Var.c, 0);
                }
                ijl0 ijl0Var = (ijl0) hjl0Var.z.b;
                ijl0Var.E = tw21.W(j - qjl0Var.a);
                ijl0Var.F = !(j == -9223372036854775807L);
                ijl0Var.G = j == -9223372036854775807L;
                ijl0Var.H = false;
                ijl0Var.i();
                bjl0Var.I = true;
                return;
            }
            nd10 nd10Var = (nd10) czq0Var.b.get(i);
            String h = f0b1.h(nd10Var.j.b);
            h.getClass();
            switch (h.hashCode()) {
                case -1922091719:
                    if (h.equals("MPEG4-GENERIC")) {
                        c = 0;
                        break;
                    }
                    c = 65535;
                    break;
                case 2412:
                    break;
                case 64593:
                    if (h.equals("AC3")) {
                        c = 2;
                        break;
                    }
                    c = 65535;
                    break;
                case 64934:
                    if (h.equals("AMR")) {
                        c = 3;
                        break;
                    }
                    c = 65535;
                    break;
                case 74609:
                    if (h.equals("L16")) {
                        c = 4;
                        break;
                    }
                    c = 65535;
                    break;
                case 85182:
                    if (h.equals("VP8")) {
                        c = 5;
                        break;
                    }
                    c = 65535;
                    break;
                case 85183:
                    if (h.equals("VP9")) {
                        c = 6;
                        break;
                    }
                    c = 65535;
                    break;
                case 2194728:
                    if (h.equals("H264")) {
                        c = 7;
                        break;
                    }
                    c = 65535;
                    break;
                case 2194729:
                    if (h.equals("H265")) {
                        c = '\b';
                        break;
                    }
                    c = 65535;
                    break;
                case 2433087:
                    if (h.equals("OPUS")) {
                        c = '\t';
                        break;
                    }
                    c = 65535;
                    break;
                case 2450119:
                    if (h.equals("PCMA")) {
                        c = '\n';
                        break;
                    }
                    c = 65535;
                    break;
                case 2450139:
                    if (h.equals("PCMU")) {
                        c = 11;
                        break;
                    }
                    c = 65535;
                    break;
                case 1061166827:
                    if (h.equals("MP4A-LATM")) {
                        c = '\f';
                        break;
                    }
                    c = 65535;
                    break;
                case 1934494802:
                    if (h.equals("AMR-WB")) {
                        c = HexString.LF;
                        break;
                    }
                    c = 65535;
                    break;
                case 1959269366:
                    if (h.equals("MP4V-ES")) {
                        c = 14;
                        break;
                    }
                    c = 65535;
                    break;
                case 2137188397:
                    if (h.equals("H263-1998")) {
                        c = 15;
                        break;
                    }
                    c = 65535;
                    break;
                case 2137209252:
                    if (h.equals("H263-2000")) {
                        c = 16;
                        break;
                    }
                    c = 65535;
                    break;
                default:
                    c = 65535;
                    break;
            }
            switch (c) {
                case 0:
                case 1:
                case 2:
                case 3:
                case 4:
                case 5:
                case 6:
                case 7:
                case '\b':
                case '\t':
                case '\n':
                case 11:
                case '\f':
                case '\r':
                case 14:
                case 15:
                case 16:
                    aVar.a(new jjl0((djl0) yxf0Var.a, nd10Var, uri));
                    break;
            }
            i++;
        }
    }

    @Override // defpackage.ryj0
    public void i(Object obj) {
        ((x6f0) ((y6f0) this.a)).d(new hyj0((PaymentKitError) obj));
    }

    @Override // defpackage.eo3
    public void j(Bucket bucket) {
        ((sxj0) this.b).b((RestrictionsBucket) bucket);
    }

    @Override // defpackage.eo3
    public void k() {
        ((sxj0) this.b).a(0, (String) this.a);
    }

    public void l() {
        bjl0 bjl0Var = (bjl0) this.b;
        d6z.x(bjl0Var.H == 2);
        bjl0Var.H = 1;
        bjl0Var.K = false;
        long j = bjl0Var.L;
        if (j != -9223372036854775807L) {
            bjl0Var.k(tw21.l0(j));
        }
    }

    public void m(String str, List list, int i, int i2, SavingsDivEntity$ProductType savingsDivEntity$ProductType, int i3) {
        SavingsEvents$SavingsDashboardDragAndDropMovedType savingsEvents$SavingsDashboardDragAndDropMovedType;
        rt1 rt1Var = ((AppAnalyticsReporter) this.a).f0;
        int i4 = savingsDivEntity$ProductType == null ? -1 : v2m0.c[savingsDivEntity$ProductType.ordinal()];
        if (i4 != -1) {
            if (i4 == 1) {
                savingsEvents$SavingsDashboardDragAndDropMovedType = SavingsEvents$SavingsDashboardDragAndDropMovedType.SAVER;
            } else if (i4 == 2) {
                savingsEvents$SavingsDashboardDragAndDropMovedType = SavingsEvents$SavingsDashboardDragAndDropMovedType.DEPOSIT;
            } else if (i4 == 3) {
                savingsEvents$SavingsDashboardDragAndDropMovedType = SavingsEvents$SavingsDashboardDragAndDropMovedType.FUND;
            } else if (i4 != 4) {
                w511.b();
                return;
            }
            rt1.L(rt1Var, str, i, i2, savingsEvents$SavingsDashboardDragAndDropMovedType, i3, list, SavingsDragAndDropWidgetTypeSavings.ACCOUNT, 64);
        }
        savingsEvents$SavingsDashboardDragAndDropMovedType = SavingsEvents$SavingsDashboardDragAndDropMovedType.NONE;
        rt1.L(rt1Var, str, i, i2, savingsEvents$SavingsDashboardDragAndDropMovedType, i3, list, SavingsDragAndDropWidgetTypeSavings.ACCOUNT, 64);
    }

    public void n(int i, String str, SavingsDivEntity$ProductType savingsDivEntity$ProductType) {
        SavingsEvents$SavingsDashboardDragAndDropInitiatedType savingsEvents$SavingsDashboardDragAndDropInitiatedType;
        rt1 rt1Var = ((AppAnalyticsReporter) this.a).f0;
        int i2 = savingsDivEntity$ProductType == null ? -1 : v2m0.c[savingsDivEntity$ProductType.ordinal()];
        if (i2 != -1) {
            if (i2 == 1) {
                savingsEvents$SavingsDashboardDragAndDropInitiatedType = SavingsEvents$SavingsDashboardDragAndDropInitiatedType.SAVER;
            } else if (i2 == 2) {
                savingsEvents$SavingsDashboardDragAndDropInitiatedType = SavingsEvents$SavingsDashboardDragAndDropInitiatedType.DEPOSIT;
            } else if (i2 == 3) {
                savingsEvents$SavingsDashboardDragAndDropInitiatedType = SavingsEvents$SavingsDashboardDragAndDropInitiatedType.FUND;
            } else if (i2 != 4) {
                w511.b();
                return;
            }
            rt1.K(rt1Var, str, i, savingsEvents$SavingsDashboardDragAndDropInitiatedType, SavingsDragAndDropWidgetTypeSavings.ACCOUNT, 8);
        }
        savingsEvents$SavingsDashboardDragAndDropInitiatedType = SavingsEvents$SavingsDashboardDragAndDropInitiatedType.NONE;
        rt1.K(rt1Var, str, i, savingsEvents$SavingsDashboardDragAndDropInitiatedType, SavingsDragAndDropWidgetTypeSavings.ACCOUNT, 8);
    }

    public void o(String str, CellType cellType, SavingProductType savingProductType) {
        SavingsEvents$SavingsDashboardAccountType savingsEvents$SavingsDashboardAccountType;
        AppAnalyticsReporter appAnalyticsReporter = (AppAnalyticsReporter) this.a;
        switch (v2m0.b[cellType.ordinal()]) {
            case 1:
            case 2:
                rt1 rt1Var = appAnalyticsReporter.f0;
                int i = savingProductType == null ? -1 : v2m0.a[savingProductType.ordinal()];
                if (i == -1) {
                    savingsEvents$SavingsDashboardAccountType = null;
                } else if (i == 1) {
                    savingsEvents$SavingsDashboardAccountType = SavingsEvents$SavingsDashboardAccountType.SAVER;
                } else if (i == 2) {
                    savingsEvents$SavingsDashboardAccountType = SavingsEvents$SavingsDashboardAccountType.DEPOSIT;
                } else if (i != 3) {
                    w511.b();
                    break;
                } else {
                    savingsEvents$SavingsDashboardAccountType = SavingsEvents$SavingsDashboardAccountType.FUND;
                }
                LinkedHashMap w = g8e.w(2, Constants.DEEPLINK, str);
                if (savingsEvents$SavingsDashboardAccountType != null) {
                    w.put("type", savingsEvents$SavingsDashboardAccountType.getOriginalValue());
                }
                rt1Var.a.a("savings.dashboard.account", w);
                break;
            case 3:
                appAnalyticsReporter.f0.a.a("savings.dashboard.new_account", g8e.w(2, Constants.DEEPLINK, str));
                break;
            case 4:
            case 5:
            case 6:
                break;
            default:
                w511.b();
                break;
        }
    }

    @Override // defpackage.al7
    public void onFailure(yf7 yf7Var, IOException iOException) {
        ydi0.e((ydi0) this.a, iOException, null, 6);
    }

    /* JADX WARN: Code restructure failed: missing block: B:28:0x0098, code lost:
    
        if (r11 == null) goto L30;
     */
    /* JADX WARN: Code restructure failed: missing block: B:32:0x00a0, code lost:
    
        r9 = r7;
     */
    /* JADX WARN: Code restructure failed: missing block: B:49:0x00cb, code lost:
    
        if (r13 == null) goto L30;
     */
    @Override // defpackage.al7
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public void onResponse(yf7 yf7Var, kvj0 kvj0Var) {
        y9t0 source;
        uis0 e;
        int intValue;
        try {
            k5t0 b = ((ydi0) this.a).b(kvj0Var);
            meu meuVar = kvj0Var.y;
            int size = meuVar.size();
            int i = 0;
            int i2 = 0;
            boolean z = false;
            boolean z2 = false;
            boolean z3 = false;
            boolean z4 = false;
            Integer num = null;
            Integer num2 = null;
            while (i2 < size) {
                if (meuVar.b(i2).equalsIgnoreCase("Sec-WebSocket-Extensions")) {
                    String f = meuVar.f(i2);
                    int i3 = i;
                    while (i3 < f.length()) {
                        meu meuVar2 = meuVar;
                        int f2 = yf61.f(f, HexString.CHAR_COMMA, i3, i, 4);
                        int e2 = yf61.e(f, ';', i3, f2);
                        String q = yf61.q(i3, e2, f);
                        int i4 = e2 + 1;
                        if (q.equalsIgnoreCase("permessage-deflate")) {
                            if (z) {
                                z4 = true;
                            }
                            i3 = i4;
                            while (i3 < f2) {
                                int e3 = yf61.e(f, ';', i3, f2);
                                int e4 = yf61.e(f, '=', i3, e3);
                                String q2 = yf61.q(i3, e4, f);
                                String T = e4 < e3 ? evu0.T(yf61.q(e4 + 1, e3, f), "\"", "\"") : null;
                                int i5 = e3 + 1;
                                int i6 = f2;
                                if (q2.equalsIgnoreCase("client_max_window_bits")) {
                                    if (num != null) {
                                        z4 = true;
                                    }
                                    num = T != null ? bvu0.l(10, T) : null;
                                } else if (q2.equalsIgnoreCase("client_no_context_takeover")) {
                                    if (z2) {
                                        z4 = true;
                                    }
                                    if (T != null) {
                                        z4 = true;
                                    }
                                    i3 = i5;
                                    z2 = true;
                                } else {
                                    if (q2.equalsIgnoreCase("server_max_window_bits")) {
                                        if (num2 != null) {
                                            z4 = true;
                                        }
                                        num2 = T != null ? bvu0.l(10, T) : null;
                                    } else if (q2.equalsIgnoreCase("server_no_context_takeover")) {
                                        if (z3) {
                                            z4 = true;
                                        }
                                        if (T != null) {
                                            z4 = true;
                                        }
                                        i3 = i5;
                                        z3 = true;
                                    }
                                    i3 = i5;
                                    z4 = true;
                                }
                                f2 = i6;
                            }
                            meuVar = meuVar2;
                            z = true;
                        } else {
                            i3 = i4;
                            meuVar = meuVar2;
                            z4 = true;
                        }
                        i = 0;
                    }
                }
                i2++;
                meuVar = meuVar;
                i = 0;
            }
            ((ydi0) this.a).e = new dk41(z, num, z2, num2, z3, z4);
            if (z4 || num != null || (num2 != null && (8 > (intValue = num2.intValue()) || intValue >= 16))) {
                ydi0 ydi0Var = (ydi0) this.a;
                synchronized (ydi0Var) {
                    ydi0Var.q.clear();
                    ydi0Var.c(1010, "unexpected Sec-WebSocket-Extensions in response header");
                }
            }
            String str = bg61.b + " WebSocket " + ((d5j0) this.b).a.k();
            ydi0 ydi0Var2 = (ydi0) this.a;
            jb7 jb7Var = new jb7(b);
            dk41 dk41Var = ydi0Var2.e;
            synchronized (ydi0Var2) {
                try {
                    ydi0Var2.n = str;
                    ydi0Var2.o = jb7Var;
                    ydi0Var2.l = new kk41((ici0) jb7Var.w, ydi0Var2.c, dk41Var.a, dk41Var.c, ydi0Var2.f);
                    ydi0Var2.j = new xdi0(ydi0Var2);
                    long j = ydi0Var2.d;
                    if (j != 0) {
                        long nanos = TimeUnit.MILLISECONDS.toNanos(j);
                        htx0 htx0Var = ydi0Var2.m;
                        String concat = str.concat(" ping");
                        uc2 uc2Var = new uc2(ydi0Var2, nanos, 3);
                        htx0Var.getClass();
                        htx0Var.d(new xdi0(uc2Var, concat), nanos);
                    }
                    if (!ydi0Var2.q.isEmpty()) {
                        ydi0Var2.g();
                    }
                } catch (Throwable th) {
                    throw th;
                }
            }
            ydi0Var2.k = new jk41((jci0) jb7Var.c, ydi0Var2, dk41Var.a, dk41Var.e);
            ydi0 ydi0Var3 = (ydi0) this.a;
            try {
                ydi0Var3.b.g(kvj0Var);
                while (ydi0Var3.t == -1) {
                    ydi0Var3.k.a();
                }
            } catch (Exception e5) {
                ydi0.e(ydi0Var3, e5, null, 6);
            } finally {
                ydi0Var3.f();
            }
        } catch (IOException e6) {
            ydi0.e((ydi0) this.a, e6, kvj0Var, 4);
            yf61.b(kvj0Var);
            k5t0 k5t0Var = kvj0Var.A;
            if (k5t0Var != null && (e = k5t0Var.e()) != null) {
                yf61.b(e);
            }
            k5t0 k5t0Var2 = kvj0Var.A;
            if (k5t0Var2 == null || (source = k5t0Var2.getSource()) == null) {
                return;
            }
            yf61.b(source);
        }
    }

    @Override // defpackage.ryj0
    public void onSuccess(Object obj) {
        y6f0 y6f0Var = (y6f0) this.a;
        List<lp4> list = (List) obj;
        String str = (String) this.b;
        ArrayList arrayList = new ArrayList(tcc.n(list, 10));
        for (lp4 lp4Var : list) {
            String str2 = lp4Var.a;
            String uri = lp4Var.g.toString();
            String str3 = lp4Var.b;
            arrayList.add(new fq4(str2, uri, jl40.l(str, str3), false, str3, lp4Var.f));
        }
        ((x6f0) y6f0Var).d(new kyj0(arrayList));
    }

    public void p(boolean z, boolean z2, boolean z3, boolean z4, boolean z5, ArrayList arrayList) {
        SavingsEvents$SavingsDashboardLoadedResult savingsEvents$SavingsDashboardLoadedResult = z ? SavingsEvents$SavingsDashboardLoadedResult.ERROR : SavingsEvents$SavingsDashboardLoadedResult.OK;
        rt1 rt1Var = ((AppAnalyticsReporter) this.a).f0;
        Boolean valueOf = Boolean.valueOf(z4);
        Boolean valueOf2 = Boolean.valueOf(z3);
        Boolean valueOf3 = Boolean.valueOf(z5);
        LinkedHashMap linkedHashMap = new LinkedHashMap(6);
        linkedHashMap.put(TarifficatorScenarioActivity.RESULT_KEY, savingsEvents$SavingsDashboardLoadedResult.getOriginalValue());
        linkedHashMap.put("has_pending_accounts", Boolean.valueOf(z2));
        linkedHashMap.put("has_saver", valueOf);
        linkedHashMap.put("has_deposit", valueOf2);
        linkedHashMap.put("has_fund", valueOf3);
        if (arrayList != null) {
            linkedHashMap.put("savers_list", arrayList);
        }
        rt1Var.a.a("savings.dashboard.loaded", linkedHashMap);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:100:0x01c0  */
    /* JADX WARN: Removed duplicated region for block: B:190:0x04cf  */
    /* JADX WARN: Removed duplicated region for block: B:209:0x05ce  */
    /* JADX WARN: Removed duplicated region for block: B:223:0x05fc  */
    /* JADX WARN: Removed duplicated region for block: B:237:0x0612  */
    /* JADX WARN: Removed duplicated region for block: B:238:0x0615  */
    /* JADX WARN: Removed duplicated region for block: B:241:0x05ea  */
    /* JADX WARN: Removed duplicated region for block: B:248:0x05b8  */
    /* JADX WARN: Removed duplicated region for block: B:53:0x01d5  */
    /* JADX WARN: Removed duplicated region for block: B:56:0x01e2  */
    /* JADX WARN: Removed duplicated region for block: B:68:0x022f  */
    /* JADX WARN: Removed duplicated region for block: B:70:0x0236  */
    /* JADX WARN: Removed duplicated region for block: B:73:0x0241  */
    /* JADX WARN: Removed duplicated region for block: B:76:0x024e  */
    /* JADX WARN: Removed duplicated region for block: B:89:0x028c  */
    /* JADX WARN: Removed duplicated region for block: B:90:0x0246  */
    /* JADX WARN: Removed duplicated region for block: B:91:0x023b  */
    /* JADX WARN: Removed duplicated region for block: B:92:0x0233  */
    /* JADX WARN: Removed duplicated region for block: B:94:0x0229  */
    /* JADX WARN: Removed duplicated region for block: B:95:0x01d8  */
    /* JADX WARN: Removed duplicated region for block: B:99:0x01ba  */
    /* JADX WARN: Type inference failed for: r14v19, types: [java.util.ArrayList] */
    /* JADX WARN: Type inference failed for: r14v2, types: [java.util.List] */
    /* JADX WARN: Type inference failed for: r14v3, types: [java.util.List] */
    @Override // defpackage.ev31
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public Object q(Object obj) {
        OperationStatusView.Status status;
        OperationProgressView.StatusIcon statusIcon;
        ?? singletonList;
        Integer valueOf;
        YbButtonView.a aVar;
        YbButtonView.a aVar2;
        int i;
        int i2;
        rr51 rr51Var;
        String str;
        ResultStatus resultStatus;
        com.ybsdk.feature.qr.payments.internal.screens.presentation.view.a aVar3;
        js10 js10Var;
        int[] iArr;
        List list;
        int i3;
        String str2;
        String str3;
        int i4;
        String str4;
        u1v0 u1v0Var;
        v1v0 v1v0Var;
        ActionButtonEntity actionButtonEntity;
        Text text;
        Text text2;
        wvz0 b;
        wvz0 wvz0Var;
        rr51 rr51Var2;
        kgy0 kgy0Var;
        ArrayList arrayList;
        ka6 ka6Var;
        ArrayList arrayList2;
        ArrayList arrayList3;
        Set entrySet;
        ArrayList arrayList4;
        Set entrySet2;
        String str5;
        String str6;
        g9g0 g9g0Var = ((h9g0) obj).a;
        if (g9g0Var instanceof c9g0) {
            return new s9g0(new lfv(null, null, null, null, null));
        }
        if (g9g0Var instanceof z8g0) {
            return new r9g0(null, r501.a(((z8g0) g9g0Var).c, null, null, null, null, null, null, null, null, null, null, null, null, 65534), new lfv(null, null, null, null, null));
        }
        if (g9g0Var instanceof a9g0) {
            o8p o8pVar = ((a9g0) g9g0Var).c;
            return new r9g0(new k(new l(OperationProgressView.StatusIcon.ERROR), (o8pVar == null || (str6 = o8pVar.a) == null) ? unr0.h(Text.Companion, dzh0.ybsdk_qr_payment_payment_failed) : new Text.Constant(str6), null, (o8pVar == null || (str5 = o8pVar.b) == null) ? unr0.h(Text.Companion, dzh0.ybsdk_qr_payment_credlim_payment_failed_description) : new Text.Constant(str5), unr0.h(Text.Companion, dzh0.ybsdk_qr_payment_payment_consent), null, null, 228), null, new lfv(null, null, null, null, null));
        }
        int i5 = 26;
        if (g9g0Var instanceof d9g0) {
            x7g0 x7g0Var = (x7g0) this.a;
            d9g0 d9g0Var = (d9g0) g9g0Var;
            x7g0Var.getClass();
            AmountScreenStatus amountScreenStatus = d9g0Var.k;
            v031 v031Var = d9g0Var.n;
            rbv f = job1.f(d9g0Var.a, new gdf0(23));
            if (f == null) {
                f = new nbv(iyg0.ybsdk_ic_merchant_logo_placeholder, null);
            }
            com.ybsdk.feature.qr.payments.internal.screens.presentation.view.a aVar4 = new com.ybsdk.feature.qr.payments.internal.screens.presentation.view.a(f, OperationStatusView.Status.HIDDEN, null);
            String b2 = ((w530) x7g0Var.a.b).b(d9g0Var.b);
            String str7 = b2 == null ? "" : b2;
            BigDecimal bigDecimal = d9g0Var.g;
            String str8 = d9g0Var.c;
            PageImageHeaderEntity pageImageHeaderEntity = d9g0Var.d;
            rbv f2 = job1.f(pageImageHeaderEntity.getTitleImage(), new gdf0(25));
            ThemedImageUrlEntity cornerImage = pageImageHeaderEntity.getCornerImage();
            lfv lfvVar = new lfv(f2, cornerImage != null ? job1.f(cornerImage, new gdf0(i5)) : null, null, null, null);
            bcp0 bcp0Var = d9g0Var.j;
            int i6 = w7g0.a[amountScreenStatus.ordinal()];
            if (i6 == 1) {
                text2 = bcp0Var.b.getText();
            } else {
                if (i6 != 2) {
                    w511.b();
                    return null;
                }
                text2 = bcp0Var.a.getText();
            }
            Text text3 = text2;
            boolean z = v031Var instanceof r031;
            YbButtonView.a aVar5 = new YbButtonView.a(text3, null, null, null, null, null, null, false, z, null, 3070);
            AmountScreenStatus amountScreenStatus2 = d9g0Var.k;
            boolean z2 = d9g0Var.l;
            String str9 = d9g0Var.e;
            rr51 rr51Var3 = d9g0Var.m;
            AmountScreenStatus amountScreenStatus3 = AmountScreenStatus.SELECT_AGREEMENT;
            rr51 rr51Var4 = amountScreenStatus2 == amountScreenStatus3 ? rr51Var3 : null;
            o031 o031Var = o031.a;
            if (!jl40.l(v031Var, o031Var) && !(v031Var instanceof n031)) {
                if (z) {
                    xvz0 xvz0Var = ((r031) v031Var).b;
                    if (xvz0Var != null) {
                        b = x7g0.b(xvz0Var);
                        wvz0Var = b;
                    }
                } else if (v031Var instanceof l031) {
                    xvz0 xvz0Var2 = ((l031) v031Var).b;
                    if (xvz0Var2 != null) {
                        b = x7g0.b(xvz0Var2);
                        wvz0Var = b;
                    }
                } else {
                    if (!(v031Var instanceof q031)) {
                        w511.b();
                        return null;
                    }
                    xvz0 xvz0Var3 = ((q031) v031Var).a;
                    if (xvz0Var3 != null) {
                        b = x7g0.b(xvz0Var3);
                        wvz0Var = b;
                    }
                }
                if (jl40.l(v031Var, o031Var) || (v031Var instanceof n031)) {
                    rr51Var2 = null;
                } else if (!z) {
                    rr51Var2 = ((r031) v031Var).c;
                } else if (v031Var instanceof l031) {
                    rr51Var2 = ((l031) v031Var).d;
                } else {
                    if (!(v031Var instanceof q031)) {
                        w511.b();
                        return null;
                    }
                    rr51Var2 = ((q031) v031Var).b;
                }
                rr51 rr51Var5 = amountScreenStatus == amountScreenStatus3 ? rr51Var2 : null;
                List a = x7g0.a(v031Var);
                kgy0Var = d9g0Var.i;
                if (kgy0Var != null) {
                    Map map = kgy0Var.b;
                    if (map == null || (entrySet2 = map.entrySet()) == null) {
                        x4c.g("Term field from plans is null", null, null, null, 14);
                        arrayList4 = null;
                    } else {
                        Set<Map.Entry> set = entrySet2;
                        arrayList4 = new ArrayList(tcc.n(set, 10));
                        for (Map.Entry entry : set) {
                            arrayList4.add(new c5z((String) entry.getKey(), (String) entry.getValue()));
                        }
                    }
                    arrayList = arrayList4;
                } else {
                    arrayList = null;
                }
                l031 l031Var = v031Var instanceof l031 ? (l031) v031Var : null;
                String str10 = l031Var != null ? l031Var.g : null;
                yj1 yj1Var = d9g0Var.f;
                ProductType productType = yj1Var != null ? yj1Var.b : null;
                boolean z3 = d9g0Var.o;
                ka6Var = d9g0Var.p;
                if (ka6Var != null) {
                    Map map2 = ka6Var.b;
                    if (map2 == null || (entrySet = map2.entrySet()) == null) {
                        arrayList3 = null;
                    } else {
                        Set<Map.Entry> set2 = entrySet;
                        arrayList3 = new ArrayList(tcc.n(set2, 10));
                        for (Map.Entry entry2 : set2) {
                            arrayList3.add(new c5z((String) entry2.getKey(), (String) entry2.getValue()));
                        }
                    }
                    arrayList2 = arrayList3;
                } else {
                    arrayList2 = null;
                }
                return new t9g0(aVar4, str7, bigDecimal, lfvVar, aVar5, str9, rr51Var5, productType, str8, amountScreenStatus2, z2, rr51Var4, a, arrayList, str10, wvz0Var, z3, arrayList2);
            }
            wvz0Var = null;
            if (jl40.l(v031Var, o031Var)) {
                if (!z) {
                }
                if (amountScreenStatus == amountScreenStatus3) {
                }
                List a2 = x7g0.a(v031Var);
                kgy0Var = d9g0Var.i;
                if (kgy0Var != null) {
                }
                if (v031Var instanceof l031) {
                }
                if (l031Var != null) {
                }
                yj1 yj1Var2 = d9g0Var.f;
                if (yj1Var2 != null) {
                }
                boolean z32 = d9g0Var.o;
                ka6Var = d9g0Var.p;
                if (ka6Var != null) {
                }
                return new t9g0(aVar4, str7, bigDecimal, lfvVar, aVar5, str9, rr51Var5, productType, str8, amountScreenStatus2, z2, rr51Var4, a2, arrayList, str10, wvz0Var, z32, arrayList2);
            }
            rr51Var2 = null;
            if (amountScreenStatus == amountScreenStatus3) {
            }
            List a22 = x7g0.a(v031Var);
            kgy0Var = d9g0Var.i;
            if (kgy0Var != null) {
            }
            if (v031Var instanceof l031) {
            }
            if (l031Var != null) {
            }
            yj1 yj1Var22 = d9g0Var.f;
            if (yj1Var22 != null) {
            }
            boolean z322 = d9g0Var.o;
            ka6Var = d9g0Var.p;
            if (ka6Var != null) {
            }
            return new t9g0(aVar4, str7, bigDecimal, lfvVar, aVar5, str9, rr51Var5, productType, str8, amountScreenStatus2, z2, rr51Var4, a22, arrayList, str10, wvz0Var, z322, arrayList2);
        }
        if (!(g9g0Var instanceof e9g0)) {
            w511.b();
            return null;
        }
        lag0 lag0Var = (lag0) this.b;
        e9g0 e9g0Var = (e9g0) g9g0Var;
        lag0Var.getClass();
        String str11 = e9g0Var.b;
        rzj0 rzj0Var = e9g0Var.i;
        ThemedImageUrlEntity themedImageUrlEntity = e9g0Var.a;
        tzj0 tzj0Var = e9g0Var.k;
        rbv f3 = job1.f(themedImageUrlEntity, new gdf0(29));
        if (f3 == null) {
            f3 = new nbv(iyg0.ybsdk_ic_merchant_logo_placeholder, null);
        }
        ResultStatus resultStatus2 = tzj0Var.a;
        uzj0 uzj0Var = tzj0Var.d;
        vzj0 vzj0Var = tzj0Var.c;
        int[] iArr2 = kag0.a;
        int i7 = iArr2[resultStatus2.ordinal()];
        if (i7 == 1 || i7 == 2) {
            status = OperationStatusView.Status.FAILURE;
        } else if (i7 == 3) {
            status = OperationStatusView.Status.SUCCESS;
        } else if (i7 == 4) {
            status = OperationStatusView.Status.TIMEOUT;
        } else {
            if (i7 != 5) {
                w511.b();
                return null;
            }
            status = OperationStatusView.Status.LOADING;
        }
        int i8 = iArr2[resultStatus2.ordinal()];
        if (i8 == 1 || i8 == 2) {
            statusIcon = OperationProgressView.StatusIcon.ERROR;
        } else if (i8 == 3) {
            Funding funding = vzj0Var != null ? vzj0Var.e : null;
            int i9 = funding == null ? -1 : kag0.b[funding.ordinal()];
            if (i9 == -1) {
                statusIcon = OperationProgressView.StatusIcon.SUCCESS;
            } else {
                if (i9 != 1) {
                    w511.b();
                    return null;
                }
                statusIcon = OperationProgressView.StatusIcon.BOOST_FUNDED;
            }
        } else if (i8 == 4) {
            statusIcon = OperationProgressView.StatusIcon.TIMEOUT;
        } else {
            if (i8 != 5) {
                w511.b();
                return null;
            }
            statusIcon = null;
        }
        com.ybsdk.feature.qr.payments.internal.screens.presentation.view.a aVar6 = new com.ybsdk.feature.qr.payments.internal.screens.presentation.view.a(f3, status, statusIcon);
        String b3 = ((w530) lag0Var.b.b).b(str11);
        String str12 = b3 != null ? b3 : "";
        BigDecimal bigDecimal2 = e9g0Var.g;
        int i10 = iArr2[resultStatus2.ordinal()];
        if (i10 == 1 || i10 == 2 || i10 == 3 || i10 == 4) {
            com.ybsdk.core.utils.text.b bVar = Text.Companion;
            String str13 = e9g0Var.c;
            bVar.getClass();
            singletonList = Collections.singletonList(new Text.Constant(str13));
        } else {
            if (i10 != 5) {
                w511.b();
                return null;
            }
            List list2 = rzj0Var.a.a;
            singletonList = new ArrayList(tcc.n(list2, 10));
            Iterator it = list2.iterator();
            while (it.hasNext()) {
                singletonList.add(new Text.Constant((CharSequence) it.next()));
            }
        }
        js10 js10Var2 = new js10(singletonList, resultStatus2 == ResultStatus.PROCESSING);
        fbg0 fbg0Var = lag0Var.a;
        PageImageHeaderEntity pageImageHeaderEntity2 = e9g0Var.d;
        BigDecimal bigDecimal3 = e9g0Var.g;
        fbg0Var.getClass();
        boolean z4 = resultStatus2 == ResultStatus.SUCCESS;
        nbv nbvVar = z4 ? new nbv(txg0.ybsdk_ic_status_success, rev.h) : null;
        Text.Resource h = z4 ? unr0.h(Text.Companion, dzh0.ybsdk_dashboard_transaction_status_success) : null;
        rbv f4 = job1.f(pageImageHeaderEntity2.getTitleImage(), new cbg0(1));
        ThemedImageUrlEntity cornerImage2 = pageImageHeaderEntity2.getCornerImage();
        String str14 = str12;
        lfv lfvVar2 = new lfv(f4, cornerImage2 != null ? job1.f(cornerImage2, new gdf0(26)) : null, g8e.i(Text.Companion, w530.a(fbg0Var.a, bigDecimal3, str11, false, null, false, 60)), nbvVar, h);
        if (vzj0Var == null || (actionButtonEntity = vzj0Var.d) == null || (text = actionButtonEntity.getText()) == null) {
            if ((vzj0Var != null ? vzj0Var.b : null) != null) {
                valueOf = Integer.valueOf(dzh0.ybsdk_qr_payment_button_back_to_the_store);
            } else {
                int i11 = kag0.a[resultStatus2.ordinal()];
                if (i11 == 1 || i11 == 2) {
                    valueOf = Integer.valueOf(dzh0.ybsdk_qr_payment_button_got_it);
                } else if (i11 == 3) {
                    valueOf = Integer.valueOf(dzh0.ybsdk_qr_payment_button_done);
                } else if (i11 == 4) {
                    valueOf = Integer.valueOf(dzh0.ybsdk_qr_payment_button_agree);
                } else {
                    if (i11 != 5) {
                        w511.b();
                        return null;
                    }
                    valueOf = null;
                }
            }
            if (valueOf == null) {
                aVar = null;
                String str15 = e9g0Var.e;
                rr51 rr51Var6 = e9g0Var.n;
                int[] iArr3 = kag0.a;
                i = iArr3[resultStatus2.ordinal()];
                i2 = 1;
                if (i == 1) {
                    if (i != 2) {
                        if (i == 3) {
                            if (vzj0Var == null || (v1v0Var = vzj0Var.a) == null) {
                                rr51Var = rr51Var6;
                                str = str15;
                                resultStatus = resultStatus2;
                                aVar3 = aVar6;
                                js10Var = js10Var2;
                                iArr = iArr3;
                                u1v0Var = null;
                            } else {
                                boolean z5 = v1v0Var.d;
                                boolean z6 = v1v0Var.c;
                                boolean z7 = v1v0Var.e;
                                ColorModel.Attr attr = new ColorModel.Attr(ung0.ybColor_textIcon_primary);
                                rr51Var = rr51Var6;
                                ColorModel.Attr attr2 = new ColorModel.Attr(ung0.ybColor_textIcon_secondary);
                                str = str15;
                                ColorModel.Attr attr3 = new ColorModel.Attr(ung0.ybColor_fill_default_50);
                                int i12 = ung0.ybColor_control_activeDark;
                                int i13 = ung0.ybColor_other_separator;
                                resultStatus = resultStatus2;
                                aVar3 = aVar6;
                                ColorModel.Attr attr4 = new ColorModel.Attr(i12);
                                ViewState viewState = ViewState.CHECKED;
                                js10Var = js10Var2;
                                ViewState viewState2 = ViewState.ENABLED;
                                iArr = iArr3;
                                vbb vbbVar = new vbb(attr4, new ViewState[]{viewState, viewState2});
                                ColorModel.Attr attr5 = new ColorModel.Attr(i13);
                                ViewState viewState3 = ViewState.DISABLED;
                                u1v0Var = new u1v0(new x1v0(new Text.Constant(v1v0Var.a), new Text.Constant(v1v0Var.b), z6, z5, attr3, attr, attr2, new p1b(new vbb[]{vbbVar, new vbb(attr5, new ViewState[]{viewState, viewState3}), new vbb(new ColorModel.Attr(i13), new ViewState[]{ViewState.UNCHECKED, viewState2}), new vbb(new ColorModel.Attr(i13), new ViewState[]{viewState3})}), z7));
                            }
                            i2 = 1;
                            list = j73.A(new gc5[]{u1v0Var, vzj0Var != null ? vzj0Var.c : null});
                            i3 = iArr[resultStatus.ordinal()];
                            if (i3 == i2 && i3 != 2) {
                                if (i3 != 3) {
                                    if (i3 == 4) {
                                        str2 = rzj0Var.b.b;
                                    } else if (i3 != 5) {
                                        w511.b();
                                        return null;
                                    }
                                }
                                str3 = null;
                                i4 = iArr[resultStatus.ordinal()];
                                if (i4 != 1 || i4 == 2) {
                                    str4 = uzj0Var == null ? uzj0Var.b : rzj0Var.c.b;
                                } else {
                                    if (i4 != 3 && i4 != 4 && i4 != 5) {
                                        w511.b();
                                        return null;
                                    }
                                    str4 = null;
                                }
                                return new u9g0(aVar3, str14, bigDecimal2, lfvVar2, aVar, str, rr51Var, js10Var, list, str3, str4);
                            }
                            if (uzj0Var != null || (str2 = uzj0Var.a) == null) {
                                str2 = rzj0Var.c.a;
                            }
                            str3 = str2;
                            i4 = iArr[resultStatus.ordinal()];
                            if (i4 != 1) {
                            }
                            if (uzj0Var == null) {
                            }
                            return new u9g0(aVar3, str14, bigDecimal2, lfvVar2, aVar, str, rr51Var, js10Var, list, str3, str4);
                        }
                        if (i != 4 && i != 5) {
                            w511.b();
                            return null;
                        }
                    }
                    rr51Var = rr51Var6;
                    str = str15;
                    resultStatus = resultStatus2;
                    aVar3 = aVar6;
                    js10Var = js10Var2;
                    iArr = iArr3;
                    i2 = 1;
                } else {
                    rr51Var = rr51Var6;
                    str = str15;
                    resultStatus = resultStatus2;
                    aVar3 = aVar6;
                    js10Var = js10Var2;
                    iArr = iArr3;
                }
                list = EmptyList.a;
                i3 = iArr[resultStatus.ordinal()];
                if (i3 == i2) {
                }
                if (uzj0Var != null) {
                }
                str2 = rzj0Var.c.a;
                str3 = str2;
                i4 = iArr[resultStatus.ordinal()];
                if (i4 != 1) {
                }
                if (uzj0Var == null) {
                }
                return new u9g0(aVar3, str14, bigDecimal2, lfvVar2, aVar, str, rr51Var, js10Var, list, str3, str4);
            }
            aVar2 = new YbButtonView.a(new Text.Resource(valueOf.intValue()), null, null, null, null, null, null, false, false, null, 4094);
        } else {
            aVar2 = new YbButtonView.a(text, null, null, null, null, null, null, false, false, null, 4094);
        }
        aVar = aVar2;
        String str152 = e9g0Var.e;
        rr51 rr51Var62 = e9g0Var.n;
        int[] iArr32 = kag0.a;
        i = iArr32[resultStatus2.ordinal()];
        i2 = 1;
        if (i == 1) {
        }
        list = EmptyList.a;
        i3 = iArr[resultStatus.ordinal()];
        if (i3 == i2) {
        }
        if (uzj0Var != null) {
        }
        str2 = rzj0Var.c.a;
        str3 = str2;
        i4 = iArr[resultStatus.ordinal()];
        if (i4 != 1) {
        }
        if (uzj0Var == null) {
        }
        return new u9g0(aVar3, str14, bigDecimal2, lfvVar2, aVar, str, rr51Var, js10Var, list, str3, str4);
    }

    public Bundle r() {
        Bundle bundle = new Bundle();
        bundle.putSerializable("region", (Region) this.b);
        ArrayList arrayList = new ArrayList();
        Iterator it = ((Collection) this.a).iterator();
        while (it.hasNext()) {
            arrayList.add((Beacon) it.next());
        }
        bundle.putSerializable("beacons", arrayList);
        return bundle;
    }

    @Override // defpackage.d5p
    public void w(f7q0 f7q0Var) {
    }

    public /* synthetic */ o8g0(Object obj, Object obj2, boolean z) {
        this.b = obj;
        this.a = obj2;
    }

    public /* synthetic */ o8g0(Object obj, Object obj2) {
        this.a = obj;
        this.b = obj2;
    }

    public o8g0(n nVar) {
        this.a = nVar;
        this.b = new ArrayList();
    }

    public o8g0(Context context) {
        this.a = context;
        this.b = new s0(context);
    }

    public o8g0(Collection collection, Region region) {
        synchronized (collection) {
            this.a = collection;
        }
        this.b = region;
    }

    public o8g0(bjl0 bjl0Var) {
        this.b = bjl0Var;
        this.a = tw21.n(null);
    }
}
