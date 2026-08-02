package defpackage;

import android.content.Context;
import android.os.Handler;
import android.os.Looper;
import android.text.TextUtils;
import androidx.exifinterface.media.a;
import com.yandex.go.chargers.analytics.ChargersAnalytics$ChargersTariffCardCloseReason;
import com.yandex.go.chargers.offer.ui.mvp.ChargersOfferBottomComponent;
import com.yandex.go.chargers.station.presentation.details.ChargersStationDetailsModalView;
import com.yandex.go.chargers.station.presentation.tariff.ChargersTariffModalView;
import com.yandex.go.modals.progress.impl.ui.CircularProgressModalView;
import com.yandex.go.payments.shared.business.accountcreation.corp.factory.CorpCreatingDraftModalView;
import com.yandex.go.requirements.modal.CompoundOptionSelectModalView;
import com.yandex.messaging.internal.view.chat.c;
import com.yandex.messaging.ui.timeline.b;
import com.ybsdk.widgets.common.communication.CommunicationFullScreenInfoView;
import com.ybsdk.widgets.common.communication.CommunicationFullScreenView;
import io.appmetrica.analytics.AppMetricaYandex;
import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import java.util.List;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.atomic.AtomicBoolean;
import kotlin.jvm.internal.Ref$ObjectRef;
import ru.yandex.taxi.design.ListItemInputComponent;
import ru.yandex.taxi.settings.main.MainMenuProcessor$MenuEntry;

/* loaded from: classes15.dex */
public final /* synthetic */ class l7a implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ Object b;
    public final /* synthetic */ Object c;

    public /* synthetic */ l7a(int i, Object obj, Object obj2) {
        this.a = i;
        this.b = obj;
        this.c = obj2;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r1v41, types: [byte[], java.io.Serializable] */
    @Override // java.lang.Runnable
    public final void run() {
        txa txaVar;
        int i;
        int i2 = this.a;
        int i3 = 8;
        int i4 = 0;
        zy11 zy11Var = null;
        r5 = null;
        y4a0 y4a0Var = null;
        Object obj = this.c;
        Object obj2 = this.b;
        switch (i2) {
            case 0:
                ChargersOfferBottomComponent.setButton$lambda$0$1((ChargersOfferBottomComponent) obj2, (uo9) obj);
                return;
            case 1:
                ChargersOfferBottomComponent.setPromoPlate$lambda$0$2((ChargersOfferBottomComponent) obj2, (a8a) obj);
                return;
            case 2:
                ChargersStationDetailsModalView.success$lambda$1((ChargersStationDetailsModalView) obj2, (cra) obj);
                return;
            case 3:
                txaVar = ((ChargersTariffModalView) obj2).chargersTariffModalPresenter;
                uo9 uo9Var = ((rxa) obj).b;
                uj9 uj9Var = uo9Var != null ? uo9Var.d : null;
                txaVar.getClass();
                io9 io9Var = txaVar.A;
                em9 em9Var = txaVar.x;
                if (jl40.l(uj9Var, jqa.a)) {
                    em9Var.r(ChargersAnalytics$ChargersTariffCardCloseReason.TakeCharger);
                    ((zxa) io9Var.a).r(new rfa(i3));
                    return;
                } else {
                    if (uj9Var == null) {
                        em9Var.r(ChargersAnalytics$ChargersTariffCardCloseReason.Back);
                        ((zxa) io9Var.a).r(new qu(9));
                        return;
                    }
                    return;
                }
            case 4:
                y4a0 y4a0Var2 = (y4a0) obj;
                c cVar = (c) ((md6) obj2).c;
                if (cVar != null) {
                    if (y4a0Var2 != null) {
                        yn50 yn50Var = cVar.P;
                        if (yn50Var != null) {
                            yn50Var.a();
                        }
                        cVar.P = null;
                        if (((Boolean) ((r3z) y4a0Var2.b).a(new io9(cVar))).booleanValue()) {
                            y4a0Var = y4a0Var2;
                        }
                    }
                    cVar.K = y4a0Var;
                    cVar.r();
                    return;
                }
                return;
            case 5:
                m9b m9bVar = (m9b) obj2;
                String str = (String) obj;
                b bVar = m9bVar.a;
                int length = str.length();
                bVar.getClass();
                bVar.c(new e8b(bVar, length, i4));
                pf4 pf4Var = m9bVar.H;
                if (pf4Var != null) {
                    pf4Var.close();
                    m9bVar.H = null;
                }
                m9bVar.D.setVisibility(0);
                m9bVar.C.setText(m9bVar.G);
                m9bVar.E.setEnabled(false);
                m9bVar.F.setEnabled(false);
                o9b o9bVar = m9bVar.z;
                m9bVar.H = new pf4(o9bVar.b, o9bVar, m9bVar.w, str, m9bVar);
                return;
            case 6:
                ((vtb) obj2).c((sls) obj);
                return;
            case 7:
                CircularProgressModalView.animateDismiss$lambda$0((sls) obj2, (Runnable) obj);
                return;
            case 8:
                qvb qvbVar = (qvb) obj2;
                qvbVar.a = true;
                ((Runnable) obj).run();
                sb0 sb0Var = qvbVar.b;
                if (sb0Var != null) {
                    sb0Var.invoke();
                }
                qvbVar.b = null;
                return;
            case 9:
                ((myb) obj2).K();
                ((qht0) ((nyb) obj).f).b(ghv0.a);
                return;
            case 10:
                myb mybVar = (myb) obj;
                if (((AtomicBoolean) obj2).get()) {
                    return;
                }
                mybVar.dismiss();
                return;
            case 11:
                ((u1c) obj2).b.invoke(obj);
                return;
            case 12:
                o7c o7cVar = (o7c) obj2;
                c5g0 c5g0Var = (c5g0) obj;
                z83.g(null, o7cVar.a.getLooper(), Looper.myLooper());
                z83.h(null, o7cVar.A);
                o7cVar.A = false;
                if (o7cVar.B) {
                    return;
                }
                o0x0 o0x0Var = o7cVar.w.a;
                Handler handler = o0x0Var.w;
                z83.g(null, handler.getLooper(), Looper.myLooper());
                o7c o7cVar2 = o0x0Var.H;
                if (o7cVar2 != null) {
                    o7cVar2.cancel();
                }
                o0x0Var.H = null;
                handler.removeCallbacksAndMessages(null);
                o0x0Var.K = new u6i0(15000L, 3600000L);
                if (o0x0Var.J) {
                    return;
                }
                xo3 xo3Var = o0x0Var.F;
                if (xo3Var != null) {
                    xo3Var.cancel();
                    o0x0Var.F = null;
                }
                String deviceId = AppMetricaYandex.getDeviceId(((gm51) o0x0Var.x).a);
                if (TextUtils.isEmpty(deviceId)) {
                    o0x0Var.e("empty_deviceId");
                    return;
                } else {
                    o0x0Var.g(c5g0Var, deviceId);
                    return;
                }
            case 13:
                ((o7c) obj2).a((Exception) obj);
                return;
            case 14:
                ilc ilcVar = (ilc) obj2;
                dlc[] dlcVarArr = (dlc[]) obj;
                qa50 qa50Var = ilcVar.a;
                if (qa50Var != null) {
                    ((hw2) qa50Var).b(dlcVarArr);
                    return;
                } else {
                    ilcVar.b.add(dlcVarArr);
                    return;
                }
            case 15:
                jlc jlcVar = (jlc) obj2;
                alc[] alcVarArr = (alc[]) obj;
                ra50 ra50Var = jlcVar.a;
                if (ra50Var != null) {
                    ra50Var.a(alcVarArr);
                    zy11Var = zy11.a;
                }
                if (zy11Var == null) {
                    jlcVar.b.add(alcVarArr);
                    return;
                }
                return;
            case 16:
                ((sqc) obj2).m0.j((ikx0) obj);
                return;
            case 17:
                CommunicationFullScreenInfoView.render$lambda$4$lambda$3((lrc) obj2, (w061) obj);
                return;
            case 18:
                CommunicationFullScreenView.render$lambda$9$lambda$8((vrc) obj2, (y061) obj);
                return;
            case 19:
                CompoundOptionSelectModalView.bindItem$lambda$0((CompoundOptionSelectModalView) obj2, (tud) obj);
                return;
            case 20:
                CompoundOptionSelectModalView.dismissInternal$lambda$0((Runnable) obj2, (CompoundOptionSelectModalView) obj);
                return;
            case 21:
                fwd fwdVar = (fwd) obj2;
                Context context = (Context) obj;
                List list = (List) fwdVar.c.b;
                byte[] bArr = (byte[]) list.get(0);
                int intValue = ((Integer) list.get(1)).intValue();
                int intValue2 = ((Integer) list.get(2)).intValue();
                int intValue3 = ((Integer) list.get(3)).intValue();
                int intValue4 = ((Integer) list.get(4)).intValue();
                boolean booleanValue = ((Boolean) list.get(5)).booleanValue();
                int intValue5 = ((Integer) list.get(6)).intValue();
                boolean booleanValue2 = ((Boolean) list.get(7)).booleanValue();
                int intValue6 = ((Integer) list.get(8)).intValue();
                if (booleanValue) {
                    try {
                        i4 = new a(new ByteArrayInputStream(bArr)).n();
                    } catch (Exception unused) {
                    }
                }
                if (i4 == 90 || i4 == 270) {
                    i = intValue;
                    intValue = intValue2;
                } else {
                    i = intValue2;
                }
                n7s n7sVar = (n7s) r7s.a.get(intValue5);
                if (n7sVar == null) {
                    qgb1.b("No support format.");
                    fwdVar.a(null);
                    return;
                }
                int i5 = intValue4 + i4;
                ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
                try {
                    try {
                        n7sVar.a(context, bArr, byteArrayOutputStream, intValue, i, intValue3, i5, booleanValue2, intValue6);
                        fwdVar.a(byteArrayOutputStream.toByteArray());
                    } catch (Exception unused2) {
                        fwdVar.a(null);
                    }
                    return;
                } finally {
                    byteArrayOutputStream.close();
                }
            case 22:
                dq60 dq60Var = (dq60) obj;
                try {
                    dq60Var.a(((w6e) obj2).a.b);
                    return;
                } catch (InterruptedException | ExecutionException e) {
                    dq60Var.onError(e);
                    return;
                }
            case 23:
                ((ffe) obj2).getClass();
                return;
            case 24:
                ((une) obj2).c.a();
                ((Runnable) obj).run();
                return;
            case 25:
                u500 u500Var = ((une) obj2).d;
                u500Var.getClass();
                u500Var.d(MainMenuProcessor$MenuEntry.FAMILY_GROUP, (String) obj);
                return;
            case 26:
                CorpCreatingDraftModalView.setupCloseListenerForInput$lambda$0((ListItemInputComponent) obj2, (CorpCreatingDraftModalView) obj);
                return;
            case 27:
                ((v2f) obj2).a((com.google.firebase.crashlytics.internal.settings.a) obj);
                return;
            case 28:
                s5t s5tVar = (s5t) obj;
                c9f c9fVar = ((androidx.credentials.playservices.controllers.BeginSignIn.a) obj2).f;
                (c9fVar != null ? c9fVar : null).onResult(s5tVar);
                return;
            default:
                Ref$ObjectRef ref$ObjectRef = (Ref$ObjectRef) obj;
                c9f c9fVar2 = ((androidx.credentials.playservices.controllers.BeginSignIn.a) obj2).f;
                (c9fVar2 != null ? c9fVar2 : null).c(ref$ObjectRef.element);
                return;
        }
    }
}
