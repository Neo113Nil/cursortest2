package defpackage;

import android.util.Pair;
import com.yandex.go.point_selection_settings.PointSelectionSettingsInteractor$PointType;
import com.yandex.go.point_selection_settings.d;
import com.yandex.go.taxi.order.models.api.TaxiOrder;
import com.yandex.go.taxi.order.models.api.TaxiOrderLocalData;
import com.yandex.go.taxi.order.models.api.objects.PaymentChange;
import com.yandex.go.taxi.order.models.api.status.OrderStatusWindowNotification;
import com.yandex.go.taxi.tariffs.internal.repository.k;
import java.util.ArrayDeque;
import java.util.Iterator;
import java.util.concurrent.atomic.AtomicBoolean;
import kotlin.collections.a;
import kotlin.collections.builders.SetBuilder;
import ru.yandex.taxi.address.models.SourcePicker;
import ru.yandex.taxi.address.repository.AddressResolveRepository;
import ru.yandex.taxi.clarifypoint.b;
import ru.yandex.taxi.order.OrderNotification$OrderNotificationType;
import ru.yandex.taxi.persuggest.domain.model.RoutePointType;
import ru.yandex.taxi.preorder.source.ModalViewOrigin;
import ru.yandex.taxi.routeselector.analytics.RouteSelectorOpenReason;
import ru.yandex.taxi.routeselector.view.RouteSelectorModalView;
import ru.yandex.taxi.search.address.view.PointType;

/* loaded from: classes14.dex */
public final /* synthetic */ class nbb implements Runnable {
    public final /* synthetic */ int a = 3;
    public final /* synthetic */ int b;
    public final /* synthetic */ Object c;
    public final /* synthetic */ Object w;
    public final /* synthetic */ Object x;
    public final /* synthetic */ Object y;

    public /* synthetic */ nbb(int i, TaxiOrder taxiOrder, yx90 yx90Var, PaymentChange.Reason reason, o2y0 o2y0Var) {
        this.b = i;
        this.c = taxiOrder;
        this.w = yx90Var;
        this.x = reason;
        this.y = o2y0Var;
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Code restructure failed: missing block: B:100:0x0118, code lost:
    
        if (r2.equals("DEBT_ALLOWED") == false) goto L62;
     */
    /* JADX WARN: Code restructure failed: missing block: B:101:0x013a, code lost:
    
        r7 = ((defpackage.avj0) r2).h(defpackage.kyh0.payment_changes_dialog_subtitle);
     */
    /* JADX WARN: Code restructure failed: missing block: B:103:0x011f, code lost:
    
        if (r2.equals("UNKNOWN_CARD") == false) goto L62;
     */
    /* JADX WARN: Code restructure failed: missing block: B:105:0x0126, code lost:
    
        if (r2.equals("UNUSABLE_CARD") != false) goto L57;
     */
    /* JADX WARN: Code restructure failed: missing block: B:107:0x0137, code lost:
    
        if (r2.equals("DEBT_USER") == false) goto L62;
     */
    /* JADX WARN: Code restructure failed: missing block: B:33:0x0111, code lost:
    
        if (r2.equals("NEED_CVN") == false) goto L62;
     */
    /* JADX WARN: Code restructure failed: missing block: B:34:0x0128, code lost:
    
        r7 = ((defpackage.avj0) r2).h(defpackage.kyh0.payment_changes_dialog_subtitle);
     */
    /* JADX WARN: Code restructure failed: missing block: B:42:0x015b, code lost:
    
        if (r2.equals("NEED_CVN") == false) goto L86;
     */
    /* JADX WARN: Code restructure failed: missing block: B:43:0x0172, code lost:
    
        r7 = ((defpackage.avj0) r2).h(defpackage.kyh0.payment_changes_dialog_pay_by_another_card);
     */
    /* JADX WARN: Code restructure failed: missing block: B:49:0x01a9, code lost:
    
        if (r2.equals("NEED_CVN") == false) goto L108;
     */
    /* JADX WARN: Code restructure failed: missing block: B:50:0x01c0, code lost:
    
        r0 = ((defpackage.avj0) r2).h(defpackage.kyh0.overdraft_dialog_pay_cache_button);
     */
    /* JADX WARN: Code restructure failed: missing block: B:80:0x01b0, code lost:
    
        if (r2.equals("DEBT_ALLOWED") == false) goto L108;
     */
    /* JADX WARN: Code restructure failed: missing block: B:81:0x01d2, code lost:
    
        r0 = ((defpackage.avj0) r2).h(defpackage.kyh0.overdraft_dialog_pay_later_button);
     */
    /* JADX WARN: Code restructure failed: missing block: B:83:0x01b7, code lost:
    
        if (r2.equals("UNKNOWN_CARD") == false) goto L108;
     */
    /* JADX WARN: Code restructure failed: missing block: B:85:0x01be, code lost:
    
        if (r2.equals("UNUSABLE_CARD") != false) goto L103;
     */
    /* JADX WARN: Code restructure failed: missing block: B:87:0x01cf, code lost:
    
        if (r2.equals("DEBT_USER") == false) goto L108;
     */
    /* JADX WARN: Code restructure failed: missing block: B:90:0x0162, code lost:
    
        if (r2.equals("DEBT_ALLOWED") == false) goto L86;
     */
    /* JADX WARN: Code restructure failed: missing block: B:91:0x0184, code lost:
    
        r7 = ((defpackage.avj0) r2).h(defpackage.kyh0.payment_changes_dialog_pay_by_cash_or_another_card);
     */
    /* JADX WARN: Code restructure failed: missing block: B:93:0x0169, code lost:
    
        if (r2.equals("UNKNOWN_CARD") == false) goto L86;
     */
    /* JADX WARN: Code restructure failed: missing block: B:95:0x0170, code lost:
    
        if (r2.equals("UNUSABLE_CARD") != false) goto L81;
     */
    /* JADX WARN: Code restructure failed: missing block: B:97:0x0181, code lost:
    
        if (r2.equals("DEBT_USER") == false) goto L86;
     */
    /* JADX WARN: Failed to restore switch over string. Please report as a decompilation issue
    java.lang.NullPointerException
     */
    /* JADX WARN: Removed duplicated region for block: B:134:0x0342  */
    /* JADX WARN: Removed duplicated region for block: B:136:0x0347  */
    /* JADX WARN: Removed duplicated region for block: B:30:0x0105  */
    /* JADX WARN: Removed duplicated region for block: B:36:0x0149  */
    /* JADX WARN: Removed duplicated region for block: B:39:0x014f  */
    /* JADX WARN: Removed duplicated region for block: B:46:0x019d  */
    /* JADX WARN: Removed duplicated region for block: B:53:0x0200  */
    /* JADX WARN: Removed duplicated region for block: B:55:0x0209  */
    /* JADX WARN: Removed duplicated region for block: B:68:0x022c A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:78:0x0202  */
    @Override // java.lang.Runnable
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void run() {
        PointType pointType;
        PointType pointType2;
        zud0 zud0Var;
        String str;
        String str2;
        String str3;
        int i;
        String h;
        String str4;
        sdc sdcVar;
        tdj tdjVar;
        switch (this.a) {
            case 0:
                ((obb) this.c).a((yab) this.w, (iaz0) this.y, this.b, (yab) this.x);
                return;
            case 1:
                b bVar = (b) this.c;
                gyb gybVar = (gyb) this.w;
                int i2 = this.b;
                vbb vbbVar = (vbb) this.x;
                Runnable runnable = (Runnable) this.y;
                nyb nybVar = bVar.a;
                RoutePointType routePointType = gybVar.a;
                int i3 = jyb.a[routePointType.ordinal()];
                SourcePicker sourcePicker = i3 != 1 ? i3 != 2 ? i3 != 3 ? SourcePicker.A_FROM_SUMMARY : SourcePicker.ADDITIONAL_FROM_SUMMARY : SourcePicker.B_FROM_SUMMARY : SourcePicker.A_FROM_SUMMARY;
                nybVar.getClass();
                PointType.Companion.getClass();
                String str5 = gybVar.d;
                String str6 = gybVar.e;
                int i4 = ivd0.a[routePointType.ordinal()];
                if (i4 == 1) {
                    pointType = PointType.SOURCE;
                } else {
                    if (i4 != 2) {
                        pointType2 = null;
                        if (pointType2 != null) {
                            runnable.run();
                            return;
                        }
                        myb mybVar = new myb(nybVar, sourcePicker, gybVar, runnable, vbbVar);
                        if (pointType2 == PointType.DESTINATION) {
                            ((pep0) nybVar.e).f(new zsa(7, (qzi) nybVar.d.get(), new v4a(11, mybVar), new l7a(9, mybVar, nybVar)), new tzi(str6, str5, i2), hxx.a);
                            return;
                        }
                        uyb uybVar = nybVar.b;
                        uybVar.getClass();
                        AtomicBoolean atomicBoolean = new AtomicBoolean(false);
                        tyb tybVar = new tyb(mybVar, atomicBoolean, uybVar, (sourcePicker == SourcePicker.A_FROM_SUMMARY || sourcePicker == SourcePicker.B_FROM_SUMMARY) ? ModalViewOrigin.SUMMARY : ModalViewOrigin.HOME);
                        l7a l7aVar = new l7a(10, atomicBoolean, mybVar);
                        int i5 = ryb.a[routePointType.ordinal()];
                        PointSelectionSettingsInteractor$PointType pointSelectionSettingsInteractor$PointType = i5 != 1 ? (i5 == 2 || i5 == 3) ? PointSelectionSettingsInteractor$PointType.DESTINATION : null : PointSelectionSettingsInteractor$PointType.SOURCE;
                        if (pointSelectionSettingsInteractor$PointType != null) {
                            avd0 avd0Var = uybVar.h;
                            pex0 m = ((k) uybVar.g).m();
                            zud0Var = ((d) avd0Var).a(m != null ? m.l : null, pointSelectionSettingsInteractor$PointType);
                        } else {
                            zud0Var = null;
                        }
                        v9l0 v9l0Var = new v9l0(tybVar);
                        v9l0Var.b = sourcePicker;
                        v9l0Var.e = null;
                        v9l0Var.d = i2;
                        if (zud0Var != null && (str3 = zud0Var.a) != null) {
                            str6 = str3;
                        }
                        v9l0Var.g = str6;
                        if (zud0Var != null && (str2 = zud0Var.b) != null) {
                            str5 = str2;
                        }
                        v9l0Var.k = str5;
                        v9l0Var.i = true;
                        v9l0Var.h = true;
                        v9l0Var.n = gybVar.c;
                        v9l0Var.o = RouteSelectorOpenReason.OTHER;
                        v9l0Var.q = new v4a(12, uybVar);
                        if (zud0Var != null && (str = zud0Var.c) != null) {
                            v9l0Var.d = 0;
                            v9l0Var.e = str;
                        }
                        i6r i6rVar = uybVar.i;
                        x9l0 x9l0Var = new x9l0(v9l0Var);
                        hyb hybVar = uybVar.e;
                        AddressResolveRepository addressResolveRepository = uybVar.c;
                        i6rVar.getClass();
                        hybVar.getClass();
                        addressResolveRepository.getClass();
                        RouteSelectorModalView a = new t3g(i6rVar, x9l0Var, hybVar, addressResolveRepository).a();
                        uybVar.b.c();
                        a.setOnAppearingListener(new syb(0, uybVar, l7aVar));
                        uybVar.a.a().s(a, false);
                        return;
                    }
                    pointType = PointType.DESTINATION;
                }
                pointType2 = pointType;
                if (pointType2 != null) {
                }
                break;
            case 2:
                fg10 fg10Var = (fg10) this.c;
                Pair pair = (Pair) this.w;
                ((j5h) fg10Var.b.h).onLoadStarted(((Integer) pair.first).intValue(), (sf10) pair.second, (uwy) this.x, (he10) this.y, this.b);
                return;
            default:
                int i6 = this.b;
                TaxiOrder taxiOrder = (TaxiOrder) this.c;
                yx90 yx90Var = (yx90) this.w;
                PaymentChange.Reason reason = (PaymentChange.Reason) this.x;
                o2y0 o2y0Var = (o2y0) this.y;
                if (i6 <= taxiOrder.l.v) {
                    return;
                }
                lgb lgbVar = yx90Var.g;
                xh60 w = taxiOrder.l.w();
                if (!lgbVar.b) {
                    int i7 = 14;
                    if (w == null) {
                        a3y0.d(lgbVar.a, "ORDER.STATUS_WINDOW.IS_ABSENT", null, new n8a(i7, reason, "is null"), 2);
                        lgbVar.b = true;
                    } else {
                        SetBuilder k = eg3.k((OrderStatusWindowNotification) w.b);
                        if (!k.isEmpty()) {
                            a3y0.d(lgbVar.a, "ORDER.STATUS_WINDOW.IS_ABSENT", null, new n8a(i7, reason, a.X(k, null, null, null, null, 63)), 2);
                            lgbVar.b = true;
                        }
                    }
                }
                if (!yx90Var.d.b(false) || "SILENT".equals(reason.a)) {
                    if (yx90Var.h.add(new ib80(taxiOrder, reason))) {
                        String h2 = ((avj0) yx90Var.c).h(kyh0.notification_updated_requirements);
                        y180 y180Var = yx90Var.b;
                        String str7 = taxiOrder.a;
                        String p = taxiOrder.p();
                        y180Var.getClass();
                        OrderNotification$OrderNotificationType orderNotification$OrderNotificationType = OrderNotification$OrderNotificationType.UPDATE_REQUIREMENTS;
                        y180Var.a.g(new n280(y180.f(str7, orderNotification$OrderNotificationType), str7, p, h2, (String) null, y180Var.d.f, orderNotification$OrderNotificationType, 0L, false, 896));
                        return;
                    }
                    return;
                }
                pit pitVar = yx90Var.f;
                apf apfVar = pitVar.h;
                ib80 ib80Var = new ib80(o2y0Var.b(), reason);
                xx90 xx90Var = (xx90) pitVar.d.get();
                qpo qpoVar = new qpo(21, pitVar, o2y0Var);
                xx90Var.getClass();
                tdj tdjVar2 = new tdj(o2y0Var);
                tdjVar2.i = ib80Var;
                zuj0 zuj0Var = xx90Var.b;
                String str8 = reason.a;
                if (str8 != null) {
                    int hashCode = str8.hashCode();
                    i = i6;
                    if (hashCode == -901744194 ? str8.equals("UNUSABLE_CARD") : !(hashCode == 1027046917 ? !str8.equals("UNKNOWN_CARD") : !(hashCode == 1649572626 && str8.equals("NEED_CVN")))) {
                        h = ((avj0) zuj0Var).h(kyh0.payment_changes_dialog_title_cache);
                        tdjVar2.b = h;
                        if (str8 != null) {
                            switch (str8.hashCode()) {
                                case -1712092169:
                                    break;
                                case -901744194:
                                    break;
                                case 1027046917:
                                    break;
                                case 1329653212:
                                    break;
                                case 1649572626:
                                    break;
                            }
                            if (str4 == null) {
                                str4 = "";
                            }
                            tdjVar2.c = str4;
                            if (str8 != null) {
                                switch (str8.hashCode()) {
                                    case -1712092169:
                                        break;
                                    case -901744194:
                                        break;
                                    case 1027046917:
                                        break;
                                    case 1329653212:
                                        break;
                                    case 1649572626:
                                        break;
                                }
                                tdjVar2.g = r7;
                                if (str8 != null) {
                                    switch (str8.hashCode()) {
                                        case -1712092169:
                                            break;
                                        case -901744194:
                                            break;
                                        case 1027046917:
                                            break;
                                        case 1329653212:
                                            break;
                                        case 1649572626:
                                            break;
                                    }
                                    tdjVar2.h = r0;
                                    tdjVar2.f = new f83(qpoVar, reason, o2y0Var, xx90Var, 9);
                                    sdcVar = new sdc(7, ib80Var);
                                    tdjVar = (tdj) apfVar.w;
                                    if (!(tdjVar == null ? false : apf.r(tdjVar, ib80.class, sdcVar))) {
                                        Iterator it = ((ArrayDeque) apfVar.c).iterator();
                                        while (it.hasNext()) {
                                            if (apf.r((tdj) it.next(), ib80.class, sdcVar)) {
                                                it.remove();
                                            }
                                        }
                                        apfVar.l(tdjVar2);
                                    }
                                    synchronized (taxiOrder) {
                                        TaxiOrderLocalData taxiOrderLocalData = taxiOrder.l;
                                        taxiOrderLocalData.getClass();
                                        taxiOrder.l = TaxiOrderLocalData.b(taxiOrderLocalData, false, i, false, false, false, false, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, false, null, false, null, null, null, -2097153, 16777215);
                                    }
                                    yx90Var.a.g(taxiOrder);
                                    return;
                                }
                                String h3 = ((avj0) zuj0Var).h(kyh0.dialog_common_ok);
                                tdjVar2.h = h3;
                                tdjVar2.f = new f83(qpoVar, reason, o2y0Var, xx90Var, 9);
                                sdcVar = new sdc(7, ib80Var);
                                tdjVar = (tdj) apfVar.w;
                                if (!(tdjVar == null ? false : apf.r(tdjVar, ib80.class, sdcVar))) {
                                }
                                synchronized (taxiOrder) {
                                }
                            }
                            String h4 = ((avj0) zuj0Var).h(kyh0.bottom_sheet_change_payment_method);
                            tdjVar2.g = h4;
                            if (str8 != null) {
                            }
                            String h32 = ((avj0) zuj0Var).h(kyh0.dialog_common_ok);
                            tdjVar2.h = h32;
                            tdjVar2.f = new f83(qpoVar, reason, o2y0Var, xx90Var, 9);
                            sdcVar = new sdc(7, ib80Var);
                            tdjVar = (tdj) apfVar.w;
                            if (!(tdjVar == null ? false : apf.r(tdjVar, ib80.class, sdcVar))) {
                            }
                            synchronized (taxiOrder) {
                            }
                        }
                        str4 = reason.b;
                        if (str4 == null) {
                        }
                        tdjVar2.c = str4;
                        if (str8 != null) {
                        }
                        String h42 = ((avj0) zuj0Var).h(kyh0.bottom_sheet_change_payment_method);
                        tdjVar2.g = h42;
                        if (str8 != null) {
                        }
                        String h322 = ((avj0) zuj0Var).h(kyh0.dialog_common_ok);
                        tdjVar2.h = h322;
                        tdjVar2.f = new f83(qpoVar, reason, o2y0Var, xx90Var, 9);
                        sdcVar = new sdc(7, ib80Var);
                        tdjVar = (tdj) apfVar.w;
                        if (!(tdjVar == null ? false : apf.r(tdjVar, ib80.class, sdcVar))) {
                        }
                        synchronized (taxiOrder) {
                        }
                    }
                } else {
                    i = i6;
                }
                h = ((avj0) zuj0Var).h(kyh0.payment_changes_dialog_title);
                tdjVar2.b = h;
                if (str8 != null) {
                }
                str4 = reason.b;
                if (str4 == null) {
                }
                tdjVar2.c = str4;
                if (str8 != null) {
                }
                String h422 = ((avj0) zuj0Var).h(kyh0.bottom_sheet_change_payment_method);
                tdjVar2.g = h422;
                if (str8 != null) {
                }
                String h3222 = ((avj0) zuj0Var).h(kyh0.dialog_common_ok);
                tdjVar2.h = h3222;
                tdjVar2.f = new f83(qpoVar, reason, o2y0Var, xx90Var, 9);
                sdcVar = new sdc(7, ib80Var);
                tdjVar = (tdj) apfVar.w;
                if (!(tdjVar == null ? false : apf.r(tdjVar, ib80.class, sdcVar))) {
                }
                synchronized (taxiOrder) {
                }
                break;
        }
    }

    public /* synthetic */ nbb(obb obbVar, yab yabVar, iaz0 iaz0Var, int i, yab yabVar2) {
        this.c = obbVar;
        this.w = yabVar;
        this.y = iaz0Var;
        this.b = i;
        this.x = yabVar2;
    }

    public /* synthetic */ nbb(fg10 fg10Var, Pair pair, uwy uwyVar, he10 he10Var, int i) {
        this.c = fg10Var;
        this.w = pair;
        this.x = uwyVar;
        this.y = he10Var;
        this.b = i;
    }

    public /* synthetic */ nbb(b bVar, gyb gybVar, int i, vbb vbbVar, Runnable runnable) {
        this.c = bVar;
        this.w = gybVar;
        this.b = i;
        this.x = vbbVar;
        this.y = runnable;
    }
}
