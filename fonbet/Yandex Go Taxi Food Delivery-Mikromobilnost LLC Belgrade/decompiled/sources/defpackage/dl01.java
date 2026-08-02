package defpackage;

import android.graphics.drawable.Drawable;
import android.nfc.Tag;
import android.nfc.tech.MifareClassic;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.appcompat.widget.AppCompatImageView;
import androidx.compose.foundation.gestures.b0;
import androidx.compose.ui.semantics.f;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.core.view.b;
import com.yandex.go.taxi.order.models.api.TaxiOrder;
import com.yandex.go.user_profile.main_menu.profile.models.UserProfileStyle;
import com.yandex.payment.sdk.transportcards.nfc.a;
import com.yandex.payment.sdk.transportcards.nfc.exception.MifareClassicException;
import com.yandex.plus.pay.api.model.PlusPayCompositeUpsale;
import com.ybsdk.core.utils.dto.common.FailDataException;
import com.ybsdk.core.utils.text.Text;
import com.ybsdk.core.utils.text.d;
import com.ybsdk.core.utils.ui.RequestStatus$Data$Source;
import com.ybsdk.feature.transfer.version2.internal.screens.common.TransferListItemData$PartnerWithAction$Status;
import com.ybsdk.feature.transfer.version2.internal.screens.main.presentation.BottomSheetState$SelectAccount$Type;
import com.ybsdk.feature.transfer.version2.internal.screens.phone.c;
import com.ybsdk.feature.transfer.version2.internal.screens.phone.domain.entities.PartnerWithActionEntity;
import com.ybsdk.feature.transfer.version2.internal.screens.phone.receivername.TransferReceiverNameFragment;
import com.ybsdk.widgets.common.chip.ChipListView;
import com.ybsdk.widgets.common.g;
import defpackage.tje;
import defpackage.tse;
import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import kotlin.Pair;
import kotlin.Result;
import kotlin.jvm.internal.Ref$ObjectRef;
import kotlinx.coroutines.flow.r0;
import ru.CryptoPro.reprov.x509.CRLReasonCodeExtension;
import ru.yandex.common.clid.ClidProvider;
import ru.yandex.video.m3.player.utils.DRMInfoProvider;

/* loaded from: classes3.dex */
public final /* synthetic */ class dl01 implements tls {
    public final /* synthetic */ int a;
    public final /* synthetic */ Object b;
    public final /* synthetic */ Object c;

    public /* synthetic */ dl01(int i, Object obj, Object obj2) {
        this.a = i;
        this.b = obj;
        this.c = obj2;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r14v8, types: [st21] */
    /* JADX WARN: Type inference failed for: r1v10, types: [dqg] */
    @Override // defpackage.tls
    public final Object invoke(Object obj) {
        Pair pair;
        Object obj2;
        ak1 ak1Var;
        String str;
        ak1 a;
        wjq0 wjq0Var;
        wjq0 cjq0Var;
        g render$lambda$6;
        MifareClassic mifareClassic;
        int i = 0;
        RequestStatus$Data$Source requestStatus$Data$Source = null;
        String Y1 = null;
        switch (this.a) {
            case 0:
                BigDecimal bigDecimal = (BigDecimal) this.b;
                wjq0 wjq0Var2 = (wjq0) this.c;
                wk01 wk01Var = (wk01) obj;
                if (wjq0Var2 == null) {
                    wjq0Var2 = wk01Var.i;
                }
                return wk01.b(wk01Var, null, bigDecimal, null, null, null, null, wjq0Var2, null, null, null, null, null, null, false, false, null, null, false, null, false, null, null, null, null, null, null, null, -265, 15);
            case 1:
                tg6 tg6Var = (tg6) this.b;
                return wk01.b((wk01) obj, null, null, null, null, null, new tg6((sl) this.c, tg6Var.b, tg6Var.c, tg6Var.w, tg6Var.x), null, null, null, null, null, null, null, false, false, null, null, false, null, false, null, null, null, null, null, null, null, -129, 15);
            case 2:
                cf6 cf6Var = (cf6) this.b;
                return wk01.b((wk01) obj, null, null, null, cf6Var, null, new tg6((sl) this.c, cf6Var.getTitle(), cf6Var.getSubtitle(), cf6Var.c(), BottomSheetState$SelectAccount$Type.SUBJECT), null, null, null, null, null, null, null, false, false, null, null, false, null, false, null, null, null, null, null, null, null, -161, 15);
            case 3:
                wk01 wk01Var2 = (wk01) this.b;
                List list = (List) this.c;
                String str2 = wk01Var2.G;
                ak1 ak1Var2 = wk01Var2.g;
                wjq0 wjq0Var3 = wk01Var2.i;
                List list2 = list;
                int d = gw00.d(tcc.n(list2, 10));
                if (d < 16) {
                    d = 16;
                }
                LinkedHashMap linkedHashMap = new LinkedHashMap(d);
                for (Object obj3 : list2) {
                    linkedHashMap.put(((web) obj3).a, obj3);
                }
                if (wjq0Var3 != null) {
                    eh01 c = dt01.c(linkedHashMap, wjq0Var3.b());
                    if (wjq0Var3 instanceof ujq0) {
                        wjq0Var = ujq0.c((ujq0) wjq0Var3, c);
                    } else if (wjq0Var3 instanceof vjq0) {
                        wjq0Var = vjq0.c((vjq0) wjq0Var3, c);
                    } else {
                        if (wjq0Var3 instanceof jjq0) {
                            jjq0 jjq0Var = (jjq0) wjq0Var3;
                            cjq0Var = new jjq0(c, jjq0Var.b, jjq0Var.c);
                        } else if (wjq0Var3 instanceof ajq0) {
                            ajq0 ajq0Var = (ajq0) wjq0Var3;
                            cjq0Var = new ajq0(c, ajq0Var.b, ajq0Var.c);
                        } else if (wjq0Var3 instanceof djq0) {
                            djq0 djq0Var = (djq0) wjq0Var3;
                            wjq0Var = new djq0(c, djq0Var.b, djq0Var.c, djq0Var.d);
                        } else if (wjq0Var3 instanceof cjq0) {
                            cjq0 cjq0Var2 = (cjq0) wjq0Var3;
                            cjq0Var = new cjq0(c, cjq0Var2.b, cjq0Var2.c, cjq0Var2.d, cjq0Var2.e, cjq0Var2.f, cjq0Var2.g);
                        } else {
                            if (!(wjq0Var3 instanceof ijq0) && !(wjq0Var3 instanceof ljq0) && !(wjq0Var3 instanceof njq0) && !(wjq0Var3 instanceof ojq0) && !(wjq0Var3 instanceof pjq0) && !(wjq0Var3 instanceof rjq0) && !(wjq0Var3 instanceof tjq0) && !(wjq0Var3 instanceof hjq0) && !(wjq0Var3 instanceof gjq0) && !(wjq0Var3 instanceof kjq0)) {
                                w511.b();
                                return null;
                            }
                            wjq0Var = wjq0Var3;
                        }
                        wjq0Var = cjq0Var;
                    }
                    pair = new Pair(c, wjq0Var);
                } else {
                    pair = new Pair(null, null);
                }
                eh01 eh01Var = (eh01) pair.getFirst();
                wjq0 wjq0Var4 = (wjq0) pair.getSecond();
                List<ak1> list3 = wk01Var2.m;
                ArrayList arrayList = new ArrayList(tcc.n(list3, 10));
                for (ak1 ak1Var3 : list3) {
                    web webVar = (web) linkedHashMap.get(ak1Var3.a);
                    if (webVar != null) {
                        String str3 = webVar.b;
                        String str4 = webVar.d;
                        String str5 = ak1Var3.l;
                        if (str5 == null) {
                            str4 = null;
                        }
                        String str6 = str4 == null ? str3 : str4;
                        String str7 = webVar.c;
                        if (str7 == null) {
                            str7 = ak1Var3.k;
                        }
                        a = ak1.a(ak1Var3, str6, dt01.a(eh01Var, linkedHashMap, ak1Var3), str4 == null ? str3 : str4, str7, str4 != null ? str5 : null, 29591);
                    } else {
                        a = ak1.a(ak1Var3, null, dt01.a(eh01Var, linkedHashMap, ak1Var3), null, null, null, 32735);
                    }
                    arrayList.add(a);
                }
                Iterator it = arrayList.iterator();
                while (true) {
                    if (it.hasNext()) {
                        obj2 = it.next();
                        if (jl40.l(((ak1) obj2).a, ak1Var2.a)) {
                        }
                    } else {
                        obj2 = null;
                    }
                }
                ak1 ak1Var4 = (ak1) obj2;
                if (ak1Var4 == null) {
                    x4c.g("can't find selected agreement among all agreements", null, null, Collections.singletonList(orp0.e), 6);
                    ak1Var = ak1Var2;
                } else {
                    ak1Var = ak1Var4;
                }
                web webVar2 = (web) linkedHashMap.get(ak1Var.a);
                return wk01.b(wk01Var2, null, null, null, null, ak1Var, null, wjq0Var4, ak1Var.n, null, null, arrayList, null, null, false, false, null, null, false, null, false, null, null, null, (!(wjq0Var3 instanceof cjq0) || webVar2 == null || (str = webVar2.c) == null) ? str2 : str, null, null, null, -4929, 14);
            case 4:
                ?? r1 = (dqg) this.b;
                c cVar = (c) this.c;
                in01 in01Var = (in01) obj;
                if (r1 instanceof bqg) {
                    cVar.i0().a(((bqg) r1).a);
                    return in01.a(in01Var, null, null, new s8j0(new FailDataException((ct11) r1)), null, null, null, null, null, null, null, 8187);
                }
                if (!(r1 instanceof cqg)) {
                    w511.b();
                    return null;
                }
                zm01 i0 = cVar.i0();
                bbv0 bbv0Var = (bbv0) ((cqg) r1).a;
                ArrayList arrayList2 = bbv0Var.a;
                ArrayList arrayList3 = new ArrayList(tcc.n(arrayList2, 10));
                Iterator it2 = arrayList2.iterator();
                while (it2.hasNext()) {
                    arrayList3.add(((PartnerWithActionEntity) it2.next()).getTitle());
                }
                i0.k(arrayList3);
                String str8 = bbv0Var.b;
                ArrayList arrayList4 = bbv0Var.a;
                ArrayList arrayList5 = new ArrayList(tcc.n(arrayList4, 10));
                Iterator it3 = arrayList4.iterator();
                while (it3.hasNext()) {
                    arrayList5.add(new wi01((PartnerWithActionEntity) it3.next(), TransferListItemData$PartnerWithAction$Status.DEFAULT));
                }
                return in01.a(in01Var, null, null, new r8j0(arrayList5, requestStatus$Data$Source, 14), str8, null, null, null, null, null, null, 8179);
            case 5:
                render$lambda$6 = TransferReceiverNameFragment.render$lambda$6((TransferReceiverNameFragment) this.b, (zn01) this.c, (g) obj);
                return render$lambda$6;
            case 6:
                n70 n70Var = (n70) this.b;
                vq01 vq01Var = (vq01) this.c;
                q961 q961Var = (q961) n70Var.N;
                int i2 = ((xqj0) n70Var.Z()).c ? ung0.ybColor_textIcon_negative : ung0.ybColor_textIcon_secondary;
                List g = scc.g(new pqb(0, Boolean.valueOf(jl40.l(((xqj0) n70Var.Z()).b, Boolean.FALSE)), unr0.h(Text.Companion, dzh0.ybsdk_transfer_requisite_legal_chips_without_nds_title)), new pqb(1, Boolean.valueOf(jl40.l(((xqj0) n70Var.Z()).b, Boolean.TRUE)), new Text.Resource(dzh0.ybsdk_transfer_requisite_legal_chips_with_nds_title)));
                TextView textView = q961Var.c;
                ChipListView chipListView = q961Var.b;
                textView.setTextColor(rje.a(n70Var.P, i2));
                chipListView.render(new hqb(g));
                chipListView.setOnButtonClickListener(new yp01(vq01Var, i));
                return zy11.a;
            case 7:
                n70 n70Var2 = (n70) this.b;
                vq01 vq01Var2 = (vq01) this.c;
                Object Z = n70Var2.Z();
                zo31 zo31Var = n70Var2.N;
                wqj0 wqj0Var = (wqj0) Z;
                Drawable t = vng.t(((wqj0) n70Var2.Z()).b ? txg0.ybsdk_ic_selected_payment_method : txg0.ybsdk_ic_unselected_payment_method, n70Var2.P);
                s961 s961Var = (s961) zo31Var;
                ConstraintLayout constraintLayout = s961Var.a;
                ImageView imageView = s961Var.b;
                b.p(constraintLayout, new fi(((wqj0) n70Var2.Z()).b, i));
                Text.Resource resource = wqj0Var.c;
                imageView.setVisibility(0);
                imageView.setImageDrawable(t);
                s961Var.c.setText(d.a(constraintLayout.getContext(), ((wqj0) n70Var2.Z()).c));
                constraintLayout.setOnClickListener(new y7z0(7, vq01Var2, n70Var2));
                return zy11.a;
            case 8:
                ((uq01) this.b).invoke(((vqj0) ((n70) this.c).Z()).a, (String) obj);
                return zy11.a;
            case 9:
                uq01 uq01Var = (uq01) this.b;
                uq01 uq01Var2 = (uq01) this.c;
                n70 n70Var3 = (n70) obj;
                Ref$ObjectRef ref$ObjectRef = new Ref$ObjectRef();
                Ref$ObjectRef ref$ObjectRef2 = new Ref$ObjectRef();
                n70Var3.W(new u50(n70Var3, ref$ObjectRef, uq01Var, ref$ObjectRef2, uq01Var2, 25));
                n70Var3.b0(new wp01(i, n70Var3, ref$ObjectRef, ref$ObjectRef2));
                return zy11.a;
            case 10:
                n70 n70Var4 = (n70) this.b;
                dk01 dk01Var = (dk01) this.c;
                da61 da61Var = (da61) n70Var4.N;
                String obj4 = d.a(n70Var4.P, ((un01) n70Var4.Z()).a).toString();
                da61Var.b.setBackgroundResource(vxg0.ybsdk_ic_circle_gray);
                AppCompatImageView appCompatImageView = da61Var.b;
                appCompatImageView.setScaleType(ImageView.ScaleType.FIT_CENTER);
                v4b1.k(((un01) n70Var4.Z()).b, appCompatImageView, null, null, 6);
                da61Var.c.setText(obj4);
                ConstraintLayout constraintLayout2 = da61Var.a;
                constraintLayout2.setContentDescription(obj4);
                tja1.b(constraintLayout2);
                constraintLayout2.setOnClickListener(new y7z0(8, dk01Var, n70Var4));
                return zy11.a;
            case 11:
                zx01 zx01Var = (zx01) this.b;
                tx01 tx01Var = (tx01) this.c;
                zx01Var.i.add(tx01Var);
                return new te4(21, zx01Var, tx01Var);
            case 12:
                final tse tseVar = (tse) this.b;
                final androidx.compose.foundation.lazy.b bVar = (androidx.compose.foundation.lazy.b) this.c;
                f.i((mnq0) obj, new wls() { // from class: com.yandex.go.masstransit.design.compose.route.a
                    @Override // defpackage.wls
                    public final Object invoke(Object obj5, Object obj6) {
                        ((Float) obj5).getClass();
                        tje.N(tse.this, null, null, new TransportRouteListKt$TransportRouteList$8$1$1$1$1(bVar, ((Float) obj6).floatValue(), null), 3);
                        return Boolean.TRUE;
                    }
                });
                return zy11.a;
            case 13:
                return new te4(22, (f811) this.b, (g811) this.c);
            case 14:
                ((wls) this.b).invoke(((ia11) ((la11) this.c)).f, (fvx0) obj);
                return zy11.a;
            case 15:
                ((tls) this.b).invoke(new v911(((ja11) ((la11) this.c)).a));
                return zy11.a;
            case 16:
                a aVar = (a) this.b;
                sls slsVar = (sls) this.c;
                Tag tag = (Tag) obj;
                try {
                    rwo rwoVar = aVar.b;
                    if (rwoVar != null) {
                        qv90.a.getClass();
                        wj00 wj00Var = new wj00(0);
                        wj00Var.k(DRMInfoProvider.MediaDRMKeys.PLUGIN_DESCRIPTION, "Начало подключения к NFC карте");
                        ((y22) rwoVar).a(y891.c("nfc_connect_start", wj00Var));
                    }
                    mifareClassic = MifareClassic.get(tag);
                    aVar.e = mifareClassic;
                } catch (MifareClassicException e) {
                    rwo rwoVar2 = aVar.b;
                    if (rwoVar2 != null) {
                        sv90 sv90Var = qv90.a;
                        String valueOf = String.valueOf(e.getMessage());
                        sv90Var.getClass();
                        ((y22) rwoVar2).a(y891.c("nfc_connect_error", vfc.i(0, DRMInfoProvider.MediaDRMKeys.PLUGIN_DESCRIPTION, "Ошибка подключения к NFC карте: ".concat(valueOf), CRLReasonCodeExtension.REASON, valueOf)));
                    }
                }
                if (mifareClassic == null) {
                    throw new MifareClassicException();
                }
                mifareClassic.setTimeout(10000);
                MifareClassic mifareClassic2 = aVar.e;
                if (mifareClassic2 != null) {
                    mifareClassic2.connect();
                }
                slsVar.invoke();
                return zy11.a;
            case 17:
                op11 op11Var = (op11) this.b;
                np11 np11Var = (np11) this.c;
                rp11 rp11Var = (rp11) obj;
                synchronized (op11Var.a) {
                    try {
                        boolean c2 = rp11Var.c();
                        mzz mzzVar = op11Var.b;
                        if (c2) {
                        }
                    } catch (Throwable th) {
                        throw th;
                    }
                }
                return zy11.a;
            case 18:
                return new ru.yandex.taxi.messenger.unreadcount.a((z221) this.b, (String) this.c);
            case 19:
                b0 b0Var = (b0) this.b;
                tls tlsVar = (tls) this.c;
                ((Long) obj).getClass();
                float f = b0Var.e;
                b0Var.e = 0.0f;
                tlsVar.invoke(Float.valueOf(f));
                return zy11.a;
            case 20:
                z0f z0fVar = (z0f) this.b;
                n351 n351Var = (n351) this.c;
                kcz0 kcz0Var = (kcz0) z0fVar.c;
                od21 od21Var = (od21) n351Var;
                c0k0 c0k0Var = od21Var.c;
                kcz0Var.r(od21Var.g, "Removed");
                ((ru.yandex.taxi.logistics.sdk.photocomments.domain.a) kcz0Var.a).d.c((String) obj, new r5s(c0k0Var));
                return zy11.a;
            case 21:
                com.yandex.plus.pay.ui.feature.tarifficator.mobile.internal.ui.upsale.b bVar2 = (com.yandex.plus.pay.ui.feature.tarifficator.mobile.internal.ui.upsale.b) this.b;
                PlusPayCompositeUpsale plusPayCompositeUpsale = (PlusPayCompositeUpsale) this.c;
                String str9 = ((spd0) obj).a;
                bVar2.H.a(plusPayCompositeUpsale.getOffer(), str9);
                r0 r0Var = bVar2.I;
                ke21 ke21Var = new ke21(str9);
                r0Var.getClass();
                r0Var.m(null, ke21Var);
                return zy11.a;
            case 22:
                ((ll21) this.b).b.c((oll0) obj, (ArrayList) this.c);
                return zy11.a;
            case 23:
                ((wl21) this.b).b.c((oll0) obj, (ArrayList) this.c);
                return zy11.a;
            case 24:
                com.yandex.go.taxi.order.feedback.domain.b bVar3 = (com.yandex.go.taxi.order.feedback.domain.b) this.b;
                String str10 = (String) this.c;
                TaxiOrder a2 = bVar3.b.a(str10);
                return bvf0.c(a2 != null ? jsq.a(a2) : jsq.b(str10));
            case 25:
                return Long.valueOf(((lp21) this.b).b.e((oll0) obj, (mp21) this.c));
            case 26:
                oep0 oep0Var = (oep0) this.b;
                ht21 ht21Var = (ht21) this.c;
                Object value = ((Result) obj).getValue();
                if (!(value instanceof Result.Failure)) {
                    ((pep0) oep0Var).f((m950) ht21Var.b.get(), new ym10(UserProfileStyle.V2, true, true), hxx.a);
                }
                return zy11.a;
            case 27:
                String str11 = (String) this.b;
                ot21 ot21Var = (ot21) this.c;
                ull0 T0 = ((oll0) obj).T0("SELECT * FROM statuses WHERE guid = ?");
                try {
                    T0.g1(1, str11);
                    int r = eja1.r(T0, "id");
                    int r2 = eja1.r(T0, "guid");
                    int r3 = eja1.r(T0, ClidProvider.TIMESTAMP);
                    int r4 = eja1.r(T0, "availability");
                    int r5 = eja1.r(T0, "notificationMode");
                    int r6 = eja1.r(T0, "duration");
                    int r7 = eja1.r(T0, "custom_text");
                    int r8 = eja1.r(T0, "custom_emoji");
                    int r9 = eja1.r(T0, "custom_icon");
                    int r10 = eja1.r(T0, "locales");
                    if (T0.q()) {
                        long j = T0.getLong(r);
                        String Y12 = T0.Y1(r2);
                        long j2 = T0.getLong(r3);
                        int i3 = (int) T0.getLong(r4);
                        int i4 = (int) T0.getLong(r5);
                        int i5 = (int) T0.getLong(r6);
                        String Y13 = T0.isNull(r7) ? null : T0.Y1(r7);
                        String Y14 = T0.isNull(r8) ? null : T0.Y1(r8);
                        String Y15 = T0.isNull(r9) ? null : T0.Y1(r9);
                        if (!T0.isNull(r10)) {
                            Y1 = T0.Y1(r10);
                        }
                        requestStatus$Data$Source = new st21(j, Y12, j2, i3, i4, i5, Y13, Y14, Y15, (Map) ((fuu0) ot21Var.c.getValue()).l(Y1));
                    }
                    return requestStatus$Data$Source;
                } finally {
                    T0.close();
                }
            case 28:
                return Long.valueOf(((ot21) this.b).b.e((oll0) obj, (st21) this.c));
            default:
                return Long.valueOf(((bv21) this.b).b.e((oll0) obj, (bm21) this.c));
        }
    }
}
