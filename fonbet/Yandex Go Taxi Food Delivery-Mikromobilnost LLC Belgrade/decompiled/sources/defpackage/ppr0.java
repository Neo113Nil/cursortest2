package defpackage;

import android.content.ActivityNotFoundException;
import android.content.Context;
import android.content.Intent;
import android.content.SharedPreferences;
import android.net.Uri;
import android.os.Build;
import androidx.lifecycle.Lifecycle;
import com.yandex.go.address.models.Address;
import com.yandex.go.places.impl.ui.notifications.favorites.ShowFavoritesNotification;
import com.yandex.go.places.impl.ui.notifications.favorites.a;
import com.yandex.go.preorder.lifecycle.p;
import com.yandex.go.shortcuts.impl.advertisement.ShortcutInfoModalView;
import com.yandex.go.shortcuts.impl.view.adapter.t;
import com.yandex.go.slot.ui.view.SlotItemViewComponent;
import com.yandex.go.zone.model.Zone;
import com.yandex.plus.pay.ui.core.tarifficator.api.data.common.PlusTarifficatorPurchase;
import com.yandex.plus.pay.ui.feature.tarifficator.mobile.internal.ui.silent.b;
import com.ybsdk.core.common.domain.entities.ThemedImageUrlEntity;
import com.ybsdk.feature.divkit.api.domain.LocalVariableName;
import com.ybsdk.feature.split.deposit.internal.ui.autotopup.status.PartnerSelectionSavingState;
import com.ybsdk.feature.split.deposit.internal.ui.autotopup.status.SplitDepositAutoTopupStatusScreenParams;
import com.ybsdk.feature.split.deposit.internal.ui.payment.status.SplitDepositPaymentStatusFragment;
import java.io.InputStream;
import java.util.ArrayList;
import java.util.function.Consumer;
import kotlin.Result;
import kotlin.collections.EmptyList;
import kotlinx.coroutines.flow.r0;
import ru.CryptoPro.JCP.tools.SelfTester_JCP;
import ru.yandex.taxi.address.repository.AddressResolveRepository;
import ru.yandex.taxi.preorder.source.data.TaxiMainControlElementEvent;
import ru.yandex.taxi.preorder.source.domain.v;
import ru.yandex.yx_platform_api.SimCardManager$SimCardStreamHandler$onDataEnabledCallback$2$1;

/* loaded from: classes13.dex */
public final /* synthetic */ class ppr0 implements sls {
    public final /* synthetic */ int a;
    public final /* synthetic */ Object b;
    public final /* synthetic */ Object c;

    public /* synthetic */ ppr0(int i, Object obj, Object obj2) {
        this.a = i;
        this.b = obj;
        this.c = obj2;
    }

    @Override // defpackage.sls
    public final Object invoke() {
        bys adapter_delegate$lambda$0;
        Object obj;
        zy11 renderLead$lambda$0;
        bii0 bii0Var;
        zy11 renderNewChallengeWebView$lambda$9$lambda$6;
        int i = this.a;
        int i2 = 2;
        int i3 = 0;
        rst0 rst0Var = null;
        zy11 zy11Var = zy11.a;
        Object obj2 = this.c;
        Object obj3 = this.b;
        switch (i) {
            case 0:
                ((SharedPreferences) obj3).unregisterOnSharedPreferenceChangeListener((opr0) obj2);
                return zy11Var;
            case 1:
                ((tls) obj3).invoke(new isr0(((lrr0) obj2).c));
                return zy11Var;
            case 2:
                ((Consumer) obj3).accept((nc6) obj2);
                return zy11Var;
            case 3:
                adapter_delegate$lambda$0 = ShortcutInfoModalView.adapter_delegate$lambda$0((ShortcutInfoModalView) obj3, (Context) obj2);
                return adapter_delegate$lambda$0;
            case 4:
                ((tls) obj3).invoke(((u0s0) obj2).e);
                return zy11Var;
            case 5:
                wys wysVar = (wys) obj3;
                t tVar = (t) obj2;
                if (wysVar.F() != -1) {
                    tVar.c.a(tVar.getItem(wysVar.F()));
                }
                return zy11Var;
            case 6:
                ((ymj) obj3).invoke();
                ((a) obj2).b.c(ShowFavoritesNotification.NOTIFICATION_ID);
                return zy11Var;
            case 7:
                try {
                    InputStream openInputStream = ((ras0) obj3).a.openInputStream((Uri) obj2);
                    if (openInputStream != null) {
                        try {
                            Object R = rzo.R(openInputStream);
                            openInputStream.close();
                            obj = R;
                        } finally {
                        }
                    } else {
                        obj = null;
                    }
                } catch (Throwable th) {
                    obj = new Result.Failure(th);
                }
                return (byte[]) (obj instanceof Result.Failure ? null : obj);
            case 8:
                b bVar = (b) obj3;
                PlusTarifficatorPurchase plusTarifficatorPurchase = ((ind0) obj2).b;
                bVar.D.b();
                r0 r0Var = bVar.E;
                qcs0 qcs0Var = new qcs0(bVar.W(plusTarifficatorPurchase));
                r0Var.getClass();
                r0Var.m(null, qcs0Var);
                return zy11Var;
            case 9:
                ucs0 ucs0Var = (ucs0) obj3;
                tcs0 tcs0Var = (tcs0) obj2;
                if (Build.VERSION.SDK_INT >= 31) {
                    return new SimCardManager$SimCardStreamHandler$onDataEnabledCallback$2$1(ucs0Var, tcs0Var);
                }
                return null;
            case 10:
                ((f28) obj3).r(new pc((bd) obj2, i2));
                return zy11Var;
            case 11:
                ((Lifecycle) obj3).d((wj6) obj2);
                return zy11Var;
            case 12:
                return Float.valueOf(((Number) ((androidx.compose.animation.core.a) obj3).e()).floatValue() + ((tx40) obj2).getFloatValue());
            case 13:
                ((tls) obj3).invoke(((xss0) obj2).d);
                return zy11Var;
            case 14:
                ((tls) obj3).invoke(((nss0) obj2).c);
                return zy11Var;
            case 15:
                ((tls) obj3).invoke(((mss0) obj2).c);
                return zy11Var;
            case 16:
                renderLead$lambda$0 = SlotItemViewComponent.renderLead$lambda$0((SlotItemViewComponent) obj3, (gss0) obj2);
                return renderLead$lambda$0;
            case 17:
                ((tls) obj3).invoke(((cqs0) obj2).g);
                return zy11Var;
            case 18:
                ((tls) obj3).invoke(((zus0) obj2).b);
                return zy11Var;
            case 19:
                ((tls) obj3).invoke(((gvs0) obj2).c);
                return zy11Var;
            case 20:
                yd00 yd00Var = (yd00) obj3;
                if (System.currentTimeMillis() - ((iy40) obj2).getLongValue() > 2000) {
                    yd00Var.a("image/*");
                }
                return zy11Var;
            case 21:
                yx40 yx40Var = (yx40) obj2;
                if (System.currentTimeMillis() - ((iy40) obj3).getLongValue() > 2000) {
                    int intValue = yx40Var.getIntValue();
                    if (intValue == 1) {
                        i2 = 0;
                    } else if (intValue == 2) {
                        i2 = 1;
                    }
                    yx40Var.setIntValue(i2);
                }
                return zy11Var;
            case 22:
                ((tls) obj3).invoke(((azs0) obj2).e);
                return zy11Var;
            case 23:
                o0t0 o0t0Var = (o0t0) obj3;
                e8p e8pVar = (e8p) obj2;
                if (!jl40.l(o0t0Var, e8pVar.a)) {
                    ycc.w(e8pVar.b, new quq0(23, o0t0Var), true);
                    aii0 aii0Var = e8pVar.c;
                    if (aii0Var != null && (bii0Var = aii0Var.a) != null) {
                        bii0Var.a(aii0Var, null);
                    }
                }
                return zy11Var;
            case 24:
                dht0 dht0Var = (dht0) obj3;
                oce0 oce0Var = (oce0) obj2;
                dht0Var.a.c = null;
                cht0 cht0Var = (cht0) dht0Var.j.get();
                vvx0 vvx0Var = cht0Var.a;
                vvx0Var.a.g(TaxiMainControlElementEvent.SHOW);
                if (cht0Var.b.d()) {
                    vvx0Var.a();
                } else {
                    Address address = oce0Var.f;
                    boolean a = oce0Var.a();
                    cht0Var.c.b(AddressResolveRepository.State.LOADED);
                    jpv0 b = cht0Var.e.b();
                    b.getClass();
                    if (!(b instanceof hpv0)) {
                        if (a) {
                            cht0Var.d.c(address, new tb(12, oce0Var, cht0Var));
                        } else if (oce0Var.k) {
                            cht0Var.a();
                        }
                    }
                    vvx0Var.a();
                    v vVar = cht0Var.g;
                    jjt0 jjt0Var = vVar.e;
                    Zone c = vVar.a.c();
                    Zone zone = (Zone) vVar.c.a.getValue();
                    if (c != null) {
                        jjt0Var.a(c, null);
                    } else if (zone != null) {
                        jjt0Var.a(zone, null);
                    }
                    cht0Var.h.a.c = false;
                }
                return zy11Var;
            case 25:
                qmp0 qmp0Var = (qmp0) obj3;
                p pVar = (p) obj2;
                qmp0Var.i.invoke();
                if (qmp0Var.f instanceof vnv0) {
                    ((qht0) pVar.g).b.r(new qu(9));
                } else {
                    ((qht0) pVar.g).b.Z();
                }
                return zy11Var;
            case 26:
                Context context = ((hnt0) obj3).b;
                try {
                    Intent intent = new Intent("android.intent.action.VIEW", Uri.parse(((gnt0) obj2).c));
                    intent.setFlags(SelfTester_JCP.IMITA);
                    context.startActivity(intent);
                } catch (ActivityNotFoundException unused) {
                }
                return zy11Var;
            case 27:
                spt0 spt0Var = (spt0) obj3;
                spt0Var.a.a = (Uri) obj2;
                set0 set0Var = spt0Var.d;
                set0Var.g.a(new pet0(set0Var, i3));
                return zy11Var;
            case 28:
                SplitDepositAutoTopupStatusScreenParams splitDepositAutoTopupStatusScreenParams = (SplitDepositAutoTopupStatusScreenParams) obj2;
                ctt0 ctt0Var = ((itt0) obj3).a;
                ttt0 ttt0Var = ctt0Var.a;
                rtt0 rtt0Var = ttt0Var != null ? ttt0Var.b : null;
                Iterable iterable = ctt0Var.b;
                if (iterable == null) {
                    iterable = EmptyList.a;
                }
                PartnerSelectionSavingState partnerSelectionSavingState = PartnerSelectionSavingState.Pending;
                if (rtt0Var != null) {
                    ptt0 ptt0Var = rtt0Var.a;
                    rst0Var = new rst0(ptt0Var.a, ptt0Var.b, ptt0Var.c, ptt0Var.d);
                }
                rst0 rst0Var2 = rst0Var;
                ThemedImageUrlEntity logo = splitDepositAutoTopupStatusScreenParams.getLogo();
                ArrayList arrayList = new ArrayList();
                for (Object obj4 : iterable) {
                    if (!jl40.l(((c5z) obj4).a, LocalVariableName.AUTO_TOPUP_PAYMENT_METHOD_ID.getVarName())) {
                        arrayList.add(obj4);
                    }
                }
                return new sst0(partnerSelectionSavingState, rst0Var2, logo, kotlin.collections.a.o0(arrayList, new c5z(LocalVariableName.AUTO_TOPUP_PAYMENT_METHOD_ID.getVarName(), splitDepositAutoTopupStatusScreenParams.getPaymentMethodId())), true);
            default:
                renderNewChallengeWebView$lambda$9$lambda$6 = SplitDepositPaymentStatusFragment.renderNewChallengeWebView$lambda$9$lambda$6((SplitDepositPaymentStatusFragment) obj3, (u861) obj2);
                return renderNewChallengeWebView$lambda$9$lambda$6;
        }
    }
}
