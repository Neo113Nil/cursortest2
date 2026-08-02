package defpackage;

import android.content.Context;
import android.content.res.Resources;
import android.graphics.drawable.Drawable;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import androidx.compose.foundation.text.TextContextMenuItems;
import androidx.compose.foundation.text.selection.j;
import androidx.compose.ui.b;
import androidx.compose.ui.node.d;
import com.yandex.go.design.compose.colors.AppColor$Palette;
import com.yandex.go.design.compose.modal.bottomsheet.c;
import com.yandex.go.design.view.GoLinearLayout;
import com.yandex.go.design.view.GoView;
import com.yandex.go.summary.ui.compose.common.tariffcell.a;
import com.yandex.go.tariffcard.ui.MultiTariffOption$LeadIconType;
import com.yandex.go.tariffcard.ui.view.TariffLeadView;
import com.yandex.go.transfer_requirement.ui.date_selector.TransferDateSelectorView;
import defpackage.asy0;
import defpackage.hly0;
import defpackage.sls;
import defpackage.tje;
import defpackage.ts4;
import defpackage.tse;
import defpackage.xky0;
import defpackage.xy40;
import defpackage.yp90;
import defpackage.zy11;
import java.util.Collections;
import java.util.List;
import kotlinx.coroutines.CoroutineStart;
import ru.CryptoPro.JCP.ASN.Gost_CryptoPro_PrivateKey._Gost_CryptoPro_PrivateKeyValues;
import ru.CryptoPro.JCSP.MSCAPI.HProv;
import ru.yandex.taxi.design.ButtonComponent;
import ru.yandex.taxi.logistics.sdk.ui.theme.YandexShapes;
import ru.yandex.taxi.masstransit.trains.schedule.h;

/* loaded from: classes11.dex */
public final /* synthetic */ class hex0 implements wls {
    public final /* synthetic */ int a;
    public final /* synthetic */ Object b;
    public final /* synthetic */ Object c;

    public /* synthetic */ hex0(int i, int i2, f530 f530Var, Object obj) {
        this.a = i2;
        this.b = f530Var;
        this.c = obj;
    }

    @Override // defpackage.wls
    public final Object invoke(Object obj, Object obj2) {
        zy11 zy11Var;
        zy11 dateSelectorAdapter$lambda$0;
        int i = this.a;
        int i2 = 17;
        c530 c530Var = c530.a;
        o430 o430Var = did.a;
        asy0 asy0Var = null;
        int i3 = 3;
        zy11 zy11Var2 = zy11.a;
        Object obj3 = this.b;
        Object obj4 = this.c;
        switch (i) {
            case 0:
                ((Integer) obj2).getClass();
                a.c((y1f) obj4, (f530) obj3, (fid) obj, vng.O(1));
                return zy11Var2;
            case 1:
                ((Integer) obj2).getClass();
                a.h((ogx0) obj4, (f530) obj3, (fid) obj, vng.O(1));
                return zy11Var2;
            case 2:
                ((Integer) obj2).getClass();
                a.e((d1f0) obj4, (f530) obj3, (fid) obj, vng.O(1));
                return zy11Var2;
            case 3:
                ((Integer) obj2).getClass();
                a.d((oco) obj4, (f530) obj3, (fid) obj, vng.O(1));
                return zy11Var2;
            case 4:
                ((Integer) obj2).getClass();
                pkb1.d((qor) obj4, (sls) obj3, (fid) obj, vng.O(1));
                return zy11Var2;
            case 5:
                zy11Var = TariffLeadView.setup$lambda$0((TariffLeadView) obj4, (MultiTariffOption$LeadIconType) obj3, (ImageView) obj, (Drawable) obj2);
                return zy11Var;
            case 6:
                ((Integer) obj2).getClass();
                ((gly0) obj4).i((Drawable) obj3, (fid) obj, vng.O(49));
                return zy11Var2;
            case 7:
                zls zlsVar = (zls) obj4;
                zmy0 zmy0Var = (zmy0) obj3;
                fid fidVar = (fid) obj;
                int intValue = ((Integer) obj2).intValue();
                bts btsVar = (bts) fidVar;
                if (btsVar.V(intValue & 1, (intValue & 3) != 2)) {
                    zlsVar.invoke(zmy0Var, btsVar, 6);
                } else {
                    btsVar.Y();
                }
                return zy11Var2;
            case 8:
                oz40 oz40Var = (oz40) obj4;
                j690 j690Var = (j690) obj3;
                fid fidVar2 = (fid) obj;
                int intValue2 = ((Integer) obj2).intValue();
                bts btsVar2 = (bts) fidVar2;
                if (btsVar2.V(intValue2 & 1, (intValue2 & 3) != 2)) {
                    f530 h = pj91.h(c530Var, "border");
                    long j = ((cjs0) oz40Var.getValue()).a;
                    int i4 = yx80.a;
                    f530 i5 = bb1.i(h, new j5y(j, j690Var, 4));
                    z910 d = pi6.d(x4c.b, true);
                    int S = cma1.S(btsVar2);
                    r1b0 o = btsVar2.o();
                    f530 d2 = b.d(btsVar2, i5);
                    ohd.G1.getClass();
                    sls slsVar = d.b;
                    if (btsVar2.a == null) {
                        cma1.b0();
                        throw null;
                    }
                    btsVar2.i0();
                    if (btsVar2.S) {
                        btsVar2.n(slsVar);
                    } else {
                        btsVar2.r0();
                    }
                    qje.W(btsVar2, d.f, d);
                    qje.W(btsVar2, d.e, o);
                    wls wlsVar = d.g;
                    if (btsVar2.S || !jl40.l(btsVar2.Q(), Integer.valueOf(S))) {
                        b64.z(S, btsVar2, S, wlsVar);
                    }
                    qje.W(btsVar2, d.d, d2);
                    btsVar2.e0(-1295979683);
                    btsVar2.t(false);
                    btsVar2.t(true);
                } else {
                    btsVar2.Y();
                }
                return zy11Var2;
            case 9:
                final j jVar = (j) obj4;
                final tse tseVar = (tse) obj3;
                xky0 xky0Var = (xky0) obj;
                final Context context = (Context) obj2;
                boolean k = jVar.k();
                kk2 n = jVar.n();
                String str = n != null ? n.b : null;
                asy0 asy0Var2 = jVar.w;
                if (asy0Var2 != null) {
                    long j2 = asy0Var2.a;
                    iv60 iv60Var = jVar.b;
                    asy0Var = new asy0(eja1.c(iv60Var.r((int) (j2 >> 32)), iv60Var.r((int) (j2 & _Gost_CryptoPro_PrivateKeyValues.maxDWORD))));
                }
                cwc0.a(xky0Var, context, k, str, asy0Var, jVar.j, new tls() { // from class: androidx.compose.foundation.text.selection.l
                    @Override // defpackage.tls
                    public final Object invoke(Object obj5) {
                        xky0 xky0Var2 = (xky0) obj5;
                        xky0Var2.a();
                        xy40 xy40Var = xky0Var2.a;
                        TextContextMenuItems textContextMenuItems = TextContextMenuItems.Cut;
                        final j jVar2 = j.this;
                        final int i6 = 0;
                        final int i7 = 1;
                        boolean z = (asy0.c(jVar2.o().b) || !jVar2.k() || (jVar2.f instanceof yp90) || jVar2.h == null) ? false : true;
                        final TextFieldSelectionManager_androidKt$addBasicTextFieldTextContextMenuComponents$1$2$1$1 textFieldSelectionManager_androidKt$addBasicTextFieldTextContextMenuComponents$1$2$1$1 = new TextFieldSelectionManager_androidKt$addBasicTextFieldTextContextMenuComponents$1$2$1$1(jVar2, null);
                        final tse tseVar2 = tseVar;
                        sls slsVar2 = new sls() { // from class: androidx.compose.foundation.text.selection.k
                            @Override // defpackage.sls
                            public final Object invoke() {
                                tje.N(tse.this, null, CoroutineStart.UNDISPATCHED, new TextFieldSelectionManager_androidKt$addBasicTextFieldTextContextMenuComponents$1$textFieldSuspendItem$1$1(textFieldSelectionManager_androidKt$addBasicTextFieldTextContextMenuComponents$1$2$1$1, null), 1);
                                return zy11.a;
                            }
                        };
                        Context context2 = context;
                        Resources resources = context2.getResources();
                        ts4 ts4Var = new ts4(3, slsVar2, null);
                        if (z) {
                            xy40Var.g(new hly0(resources.getString(textContextMenuItems.getStringId()), ts4Var, textContextMenuItems.getDrawableId(), textContextMenuItems.getKey()));
                        }
                        TextContextMenuItems textContextMenuItems2 = TextContextMenuItems.Copy;
                        boolean z2 = (asy0.c(jVar2.o().b) || (jVar2.f instanceof yp90) || jVar2.h == null) ? false : true;
                        final TextFieldSelectionManager_androidKt$addBasicTextFieldTextContextMenuComponents$1$2$1$2 textFieldSelectionManager_androidKt$addBasicTextFieldTextContextMenuComponents$1$2$1$2 = new TextFieldSelectionManager_androidKt$addBasicTextFieldTextContextMenuComponents$1$2$1$2(jVar2, null);
                        sls slsVar3 = new sls() { // from class: androidx.compose.foundation.text.selection.k
                            @Override // defpackage.sls
                            public final Object invoke() {
                                tje.N(tse.this, null, CoroutineStart.UNDISPATCHED, new TextFieldSelectionManager_androidKt$addBasicTextFieldTextContextMenuComponents$1$textFieldSuspendItem$1$1(textFieldSelectionManager_androidKt$addBasicTextFieldTextContextMenuComponents$1$2$1$2, null), 1);
                                return zy11.a;
                            }
                        };
                        Resources resources2 = context2.getResources();
                        ts4 ts4Var2 = new ts4(3, slsVar3, null);
                        if (z2) {
                            xy40Var.g(new hly0(resources2.getString(textContextMenuItems2.getStringId()), ts4Var2, textContextMenuItems2.getDrawableId(), textContextMenuItems2.getKey()));
                        }
                        TextContextMenuItems textContextMenuItems3 = TextContextMenuItems.Paste;
                        boolean z3 = jVar2.k() && ((Boolean) jVar2.x.getValue()).booleanValue() && jVar2.h != null;
                        final TextFieldSelectionManager_androidKt$addBasicTextFieldTextContextMenuComponents$1$2$1$3 textFieldSelectionManager_androidKt$addBasicTextFieldTextContextMenuComponents$1$2$1$3 = new TextFieldSelectionManager_androidKt$addBasicTextFieldTextContextMenuComponents$1$2$1$3(jVar2, null);
                        sls slsVar4 = new sls() { // from class: androidx.compose.foundation.text.selection.k
                            @Override // defpackage.sls
                            public final Object invoke() {
                                tje.N(tse.this, null, CoroutineStart.UNDISPATCHED, new TextFieldSelectionManager_androidKt$addBasicTextFieldTextContextMenuComponents$1$textFieldSuspendItem$1$1(textFieldSelectionManager_androidKt$addBasicTextFieldTextContextMenuComponents$1$2$1$3, null), 1);
                                return zy11.a;
                            }
                        };
                        Resources resources3 = context2.getResources();
                        ts4 ts4Var3 = new ts4(3, slsVar4, null);
                        if (z3) {
                            xy40Var.g(new hly0(resources3.getString(textContextMenuItems3.getStringId()), ts4Var3, textContextMenuItems3.getDrawableId(), textContextMenuItems3.getKey()));
                        }
                        TextContextMenuItems textContextMenuItems4 = TextContextMenuItems.SelectAll;
                        boolean z4 = asy0.d(jVar2.o().b) != jVar2.o().a.b.length();
                        sls slsVar5 = new sls() { // from class: eoy0
                            @Override // defpackage.sls
                            public final Object invoke() {
                                int i8 = i6;
                                zy11 zy11Var3 = zy11.a;
                                j jVar3 = jVar2;
                                switch (i8) {
                                    case 0:
                                        break;
                                    case 1:
                                        hoy0 e = j.e(jVar3.o().a, eja1.c(0, jVar3.o().a.b.length()));
                                        jVar3.c.invoke(e);
                                        long j3 = e.b;
                                        jVar3.w = new asy0(j3);
                                        jVar3.u = hoy0.a(jVar3.u, null, j3, 5);
                                        jVar3.h(true);
                                        break;
                                    default:
                                        sls slsVar6 = jVar3.g;
                                        if (slsVar6 != null) {
                                            slsVar6.invoke();
                                            break;
                                        }
                                        break;
                                }
                                return zy11Var3;
                            }
                        };
                        sls slsVar6 = new sls() { // from class: eoy0
                            @Override // defpackage.sls
                            public final Object invoke() {
                                int i8 = i7;
                                zy11 zy11Var3 = zy11.a;
                                j jVar3 = jVar2;
                                switch (i8) {
                                    case 0:
                                        break;
                                    case 1:
                                        hoy0 e = j.e(jVar3.o().a, eja1.c(0, jVar3.o().a.b.length()));
                                        jVar3.c.invoke(e);
                                        long j3 = e.b;
                                        jVar3.w = new asy0(j3);
                                        jVar3.u = hoy0.a(jVar3.u, null, j3, 5);
                                        jVar3.h(true);
                                        break;
                                    default:
                                        sls slsVar62 = jVar3.g;
                                        if (slsVar62 != null) {
                                            slsVar62.invoke();
                                            break;
                                        }
                                        break;
                                }
                                return zy11Var3;
                            }
                        };
                        Resources resources4 = context2.getResources();
                        ts4 ts4Var4 = new ts4(3, slsVar6, slsVar5);
                        if (z4) {
                            xy40Var.g(new hly0(resources4.getString(textContextMenuItems4.getStringId()), ts4Var4, textContextMenuItems4.getDrawableId(), textContextMenuItems4.getKey()));
                        }
                        TextContextMenuItems textContextMenuItems5 = TextContextMenuItems.Autofill;
                        if (jVar2.k() && asy0.c(jVar2.o().b)) {
                            i6 = 1;
                        }
                        final int i8 = 2;
                        sls slsVar7 = new sls() { // from class: eoy0
                            @Override // defpackage.sls
                            public final Object invoke() {
                                int i82 = i8;
                                zy11 zy11Var3 = zy11.a;
                                j jVar3 = jVar2;
                                switch (i82) {
                                    case 0:
                                        break;
                                    case 1:
                                        hoy0 e = j.e(jVar3.o().a, eja1.c(0, jVar3.o().a.b.length()));
                                        jVar3.c.invoke(e);
                                        long j3 = e.b;
                                        jVar3.w = new asy0(j3);
                                        jVar3.u = hoy0.a(jVar3.u, null, j3, 5);
                                        jVar3.h(true);
                                        break;
                                    default:
                                        sls slsVar62 = jVar3.g;
                                        if (slsVar62 != null) {
                                            slsVar62.invoke();
                                            break;
                                        }
                                        break;
                                }
                                return zy11Var3;
                            }
                        };
                        Resources resources5 = context2.getResources();
                        ts4 ts4Var5 = new ts4(3, slsVar7, null);
                        if (i6 != 0) {
                            xy40Var.g(new hly0(resources5.getString(textContextMenuItems5.getStringId()), ts4Var5, textContextMenuItems5.getDrawableId(), textContextMenuItems5.getKey()));
                        }
                        xky0Var2.a();
                        return zy11.a;
                    }
                });
                return zy11Var2;
            case 10:
                hwo0.c((hwo0) ((lw0) obj4).e, (String) obj, (tky0) obj2, false, ((jpy0) ((n351) obj3)).o, 4);
                return zy11Var2;
            case 11:
                ((Integer) obj2).getClass();
                ru.yandex.taxi.communications.ticket.ui.component.b.d((f530) obj3, (u2z0) obj4, (fid) obj, vng.O(1));
                return zy11Var2;
            case 12:
                s9z0 s9z0Var = (s9z0) obj4;
                tls tlsVar = (tls) obj3;
                fid fidVar3 = (fid) obj;
                int intValue3 = ((Integer) obj2).intValue();
                bts btsVar3 = (bts) fidVar3;
                if (!btsVar3.V(intValue3 & 1, (intValue3 & 3) != 2)) {
                    btsVar3.Y();
                } else if (s9z0Var != null) {
                    btsVar3.e0(642967414);
                    ldc ldcVar = s9z0Var.c;
                    long j3 = ldcVar != null ? ldcVar.a : dl51.a;
                    f530 e = ljs0.e(c530Var, 32.0f);
                    byk0 a = ((YandexShapes) btsVar3.m(qm51.a)).a();
                    boolean k2 = btsVar3.k(tlsVar) | btsVar3.k(s9z0Var);
                    Object Q = btsVar3.Q();
                    if (k2 || Q == o430Var) {
                        Q = new i5y0(i2, tlsVar, s9z0Var);
                        btsVar3.o0(Q);
                    }
                    ru.yandex.taxi.logistics.sdk.ui.component.control.a.b((sls) Q, e, a, j3, 0L, null, null, null, false, null, null, null, wwg.S(734431002, true, new jvx0(8, s9z0Var), btsVar3), btsVar3, 48, 384, 4080);
                    btsVar3.t(false);
                } else {
                    btsVar3.e0(643590700);
                    btsVar3.t(false);
                }
                return zy11Var2;
            case 13:
                ((Integer) obj2).getClass();
                eqb1.a((adz0) obj4, (f530) obj3, (fid) obj, vng.O(49));
                return zy11Var2;
            case 14:
                psz0 psz0Var = (psz0) obj4;
                tls tlsVar2 = (tls) obj3;
                fid fidVar4 = (fid) obj;
                int intValue4 = ((Integer) obj2).intValue();
                bts btsVar4 = (bts) fidVar4;
                if (btsVar4.V(intValue4 & 1, (intValue4 & 3) != 2)) {
                    erb1.a(psz0Var, null, tlsVar2, btsVar4, 0);
                } else {
                    btsVar4.Y();
                }
                return zy11Var2;
            case 15:
                oz40 oz40Var2 = (oz40) obj4;
                wls wlsVar2 = (wls) obj3;
                fid fidVar5 = (fid) obj;
                int intValue5 = ((Integer) obj2).intValue();
                bts btsVar5 = (bts) fidVar5;
                if (btsVar5.V(intValue5 & 1, (intValue5 & 3) != 2)) {
                    Object Q2 = btsVar5.Q();
                    if (Q2 == o430Var) {
                        Q2 = new uny0(i3, oz40Var2);
                        btsVar5.o0(Q2);
                    }
                    f530 y = eja1.y(c530Var, (tls) Q2);
                    z910 d3 = pi6.d(x4c.b, false);
                    int S2 = cma1.S(btsVar5);
                    r1b0 o2 = btsVar5.o();
                    f530 d4 = b.d(btsVar5, y);
                    ohd.G1.getClass();
                    sls slsVar2 = d.b;
                    if (btsVar5.a == null) {
                        cma1.b0();
                        throw null;
                    }
                    btsVar5.i0();
                    if (btsVar5.S) {
                        btsVar5.n(slsVar2);
                    } else {
                        btsVar5.r0();
                    }
                    qje.W(btsVar5, d.f, d3);
                    qje.W(btsVar5, d.e, o2);
                    wls wlsVar3 = d.g;
                    if (btsVar5.S || !jl40.l(btsVar5.Q(), Integer.valueOf(S2))) {
                        b64.z(S2, btsVar5, S2, wlsVar3);
                    }
                    qje.W(btsVar5, d.d, d4);
                    xvz.u(0, wlsVar2, btsVar5, true);
                } else {
                    btsVar5.Y();
                }
                return zy11Var2;
            case 16:
                h701 h701Var = (h701) obj4;
                qkg qkgVar = (qkg) obj3;
                fid fidVar6 = (fid) obj;
                int intValue6 = ((Integer) obj2).intValue();
                bts btsVar6 = (bts) fidVar6;
                if (btsVar6.V(intValue6 & 1, (intValue6 & 3) != 2)) {
                    h701Var.c.a(qkgVar, null, 6.0f, 0L, true, false, null, btsVar6, 16802176, 106);
                } else {
                    btsVar6.Y();
                }
                return zy11Var2;
            case 17:
                tls tlsVar3 = (tls) obj4;
                tls tlsVar4 = (tls) obj3;
                View inflate = ((LayoutInflater) obj).inflate(uqh0.mt_trains_buttons_view_holder, (ViewGroup) obj2, false);
                int i6 = reh0.lead;
                GoView goView = (GoView) cma1.O(i6, inflate);
                if (goView != null) {
                    i6 = reh0.schedule_button;
                    ButtonComponent buttonComponent = (ButtonComponent) cma1.O(i6, inflate);
                    if (buttonComponent != null) {
                        i6 = reh0.tickets_button;
                        ButtonComponent buttonComponent2 = (ButtonComponent) cma1.O(i6, inflate);
                        if (buttonComponent2 != null) {
                            return new xa01(new wi40((GoLinearLayout) inflate, goView, buttonComponent, buttonComponent2), tlsVar3, tlsVar4);
                        }
                    }
                }
                ny61.t("Missing required view with ID: ".concat(inflate.getResources().getResourceName(i6)));
                return null;
            case 18:
                ebp0 ebp0Var = (ebp0) obj4;
                CharSequence charSequence = (CharSequence) obj3;
                fid fidVar7 = (fid) obj;
                int intValue7 = ((Integer) obj2).intValue();
                bts btsVar7 = (bts) fidVar7;
                if (btsVar7.V(intValue7 & 1, (intValue7 & 3) != 2)) {
                    AppColor$Palette appColor$Palette = AppColor$Palette.TextMinor;
                    m9b1.a(ebp0Var, charSequence, c530.a, appColor$Palette, xya1.e(btsVar7).h.a, 2, Integer.MAX_VALUE, "", appColor$Palette, xya1.e(btsVar7).h.a, 2, Integer.MAX_VALUE, null, btsVar7, HProv.ALG_TYPE_SECURECHANNEL, 0, 64);
                } else {
                    btsVar7.Y();
                }
                return zy11Var2;
            case 19:
                ((Integer) obj2).getClass();
                h.b((sb01) obj4, (tls) obj3, (fid) obj, vng.O(1));
                return zy11Var2;
            case 20:
                dateSelectorAdapter$lambda$0 = TransferDateSelectorView.dateSelectorAdapter$lambda$0((TransferDateSelectorView) obj4, (Context) obj3, ((Integer) obj).intValue(), (wh01) obj2);
                return dateSelectorAdapter$lambda$0;
            case 21:
                c711 c711Var = (c711) obj4;
                ety0 ety0Var = (ety0) obj3;
                fid fidVar8 = (fid) obj;
                int intValue8 = ((Integer) obj2).intValue();
                bts btsVar8 = (bts) fidVar8;
                if (btsVar8.V(intValue8 & 1, (intValue8 & 3) != 2)) {
                    jeb1.f(c711Var.c, null, AppColor$Palette.TextMinor, 0L, 0L, null, null, 0L, 0, false, 0, 0, null, ety0Var, btsVar8, 384, 0, 16378);
                } else {
                    btsVar8.Y();
                }
                return zy11Var2;
            case 22:
                d711 d711Var = (d711) obj4;
                ety0 ety0Var2 = (ety0) obj3;
                fid fidVar9 = (fid) obj;
                int intValue9 = ((Integer) obj2).intValue();
                bts btsVar9 = (bts) fidVar9;
                if (btsVar9.V(intValue9 & 1, (intValue9 & 3) != 2)) {
                    sic a2 = qic.a(lr20.c, x4c.G, btsVar9, 0);
                    int hashCode = Long.hashCode(btsVar9.T);
                    r1b0 o3 = btsVar9.o();
                    c530 c530Var2 = c530.a;
                    f530 d5 = b.d(btsVar9, c530Var2);
                    ohd.G1.getClass();
                    sls slsVar3 = d.b;
                    if (btsVar9.a == null) {
                        cma1.b0();
                        throw null;
                    }
                    btsVar9.i0();
                    if (btsVar9.S) {
                        btsVar9.n(slsVar3);
                    } else {
                        btsVar9.r0();
                    }
                    qje.W(btsVar9, d.f, a2);
                    qje.W(btsVar9, d.e, o3);
                    qje.W(btsVar9, d.g, Integer.valueOf(hashCode));
                    qje.M(btsVar9, d.h);
                    qje.W(btsVar9, d.d, d5);
                    String str2 = d711Var.a;
                    AppColor$Palette appColor$Palette2 = AppColor$Palette.Text;
                    jeb1.f(str2, null, appColor$Palette2, 0L, 0L, null, null, 0L, 0, false, 0, 0, null, ety0Var2, btsVar9, 384, 0, 16378);
                    qgy.b(d711Var.b, null, an91.m(c530Var2, 0.0f, 2.0f, 1), appColor$Palette2, 0L, 0L, null, 0L, 0, 0, 0, xya1.e(btsVar9).h.b, null, btsVar9, 3456, 0, 12274);
                    CharSequence charSequence2 = d711Var.e;
                    if (charSequence2 == null) {
                        btsVar9.e0(-247763458);
                        btsVar9.t(false);
                    } else {
                        btsVar9.e0(-247763457);
                        qgy.b(charSequence2, null, an91.o(c530Var2, 0.0f, 6.0f, 0.0f, 2.0f, 5), null, 0L, 0L, null, 0L, 0, 0, 0, xya1.e(btsVar9).h.b, null, btsVar9, 0, 0, 12282);
                        btsVar9.t(false);
                    }
                    btsVar9.t(true);
                } else {
                    btsVar9.Y();
                }
                return zy11Var2;
            case 23:
                e711 e711Var = (e711) obj4;
                ety0 ety0Var3 = (ety0) obj3;
                fid fidVar10 = (fid) obj;
                int intValue10 = ((Integer) obj2).intValue();
                bts btsVar10 = (bts) fidVar10;
                if (btsVar10.V(intValue10 & 1, (intValue10 & 3) != 2)) {
                    jeb1.f(e711Var.a, null, AppColor$Palette.TextMinor, 0L, 0L, null, null, 0L, 0, false, 0, 0, null, ety0Var3, btsVar10, 384, 0, 16378);
                } else {
                    btsVar10.Y();
                }
                return zy11Var2;
            case 24:
                tls tlsVar5 = (tls) obj4;
                ab11 ab11Var = (ab11) obj3;
                fid fidVar11 = (fid) obj;
                int intValue11 = ((Integer) obj2).intValue();
                bts btsVar11 = (bts) fidVar11;
                if (btsVar11.V(intValue11 & 1, (intValue11 & 3) != 2)) {
                    androidx.compose.foundation.lazy.b a3 = a7y.a(0, 3, btsVar11);
                    c.a(null, com.yandex.go.design.compose.modal.bottomsheet.b.a(false, 150.0f, null, false, null, null, null, null, btsVar11, 24960, 0, 8171), null, false, false, null, null, wwg.S(-1612088871, true, new ays0(18, tlsVar5, ab11Var), btsVar11), null, null, wwg.S(751879319, true, new ls40(28, ab11Var, a3, tlsVar5), btsVar11), wwg.S(895956203, true, new dhj0(ab11Var, a3, tlsVar5, 19), btsVar11), btsVar11, 12582912, 54, 893);
                } else {
                    btsVar11.Y();
                }
                return zy11Var2;
            case 25:
                ((Integer) obj2).getClass();
                a8a1.h((a0x0) obj4, (wp2) obj3, (fid) obj, vng.O(1));
                return zy11Var2;
            case 26:
                ru.yandex.logistics.sdk.cargo_form.impl.ui.widgets.vertical_stack.a aVar = (ru.yandex.logistics.sdk.cargo_form.impl.ui.widgets.vertical_stack.a) obj4;
                n351 n351Var = (n351) obj3;
                fid fidVar12 = (fid) obj;
                int intValue12 = ((Integer) obj2).intValue();
                bts btsVar12 = (bts) fidVar12;
                if (btsVar12.V(intValue12 & 1, (intValue12 & 3) != 2)) {
                    tgg tggVar = (tgg) aVar.b.get();
                    List list = ((jg31) n351Var).c;
                    long j4 = ldc.l;
                    tggVar.a(new qkg(Collections.singletonList(new g2q0(list, null, null, null, false, null, null, new zh4(Collections.singletonList(new ug4(new ldc(j4)))), null, 894)), null, null, null, 30), null, 0.0f, j4, true, true, null, btsVar12, 17001472, 70);
                } else {
                    btsVar12.Y();
                }
                return zy11Var2;
            case 27:
                ki31 ki31Var = (ki31) obj4;
                tls tlsVar6 = (tls) obj3;
                fid fidVar13 = (fid) obj;
                int intValue13 = ((Integer) obj2).intValue();
                bts btsVar13 = (bts) fidVar13;
                if (!btsVar13.V(intValue13 & 1, (intValue13 & 3) != 2)) {
                    btsVar13.Y();
                } else if (ki31Var.b != null) {
                    btsVar13.e0(680787591);
                    fg31 fg31Var = ki31Var.b;
                    Object Q3 = btsVar13.Q();
                    if (Q3 == o430Var) {
                        Q3 = new ke31(5);
                        btsVar13.o0(Q3);
                    }
                    com.yandex.go.summary.ui.compose.common.selector.a.i(fg31Var, null, un91.b(tlsVar6, (tls) Q3, btsVar13), btsVar13, 0);
                    btsVar13.t(false);
                } else {
                    btsVar13.e0(681027841);
                    btsVar13.t(false);
                }
                return zy11Var2;
            case 28:
                ((Integer) obj2).getClass();
                zf91.a((f530) obj3, (m3u0) obj4, (fid) obj, vng.O(1));
                return zy11Var2;
            default:
                o341 o341Var = (o341) obj4;
                tls tlsVar7 = (tls) obj3;
                fid fidVar14 = (fid) obj;
                int intValue14 = ((Integer) obj2).intValue();
                bts btsVar14 = (bts) fidVar14;
                if (btsVar14.V(intValue14 & 1, (intValue14 & 3) != 2)) {
                    lhl0 a4 = khl0.a(lr20.a, x4c.E, btsVar14, 48);
                    int hashCode2 = Long.hashCode(btsVar14.T);
                    r1b0 o4 = btsVar14.o();
                    f530 d6 = b.d(btsVar14, c530Var);
                    ohd.G1.getClass();
                    sls slsVar4 = d.b;
                    if (btsVar14.a == null) {
                        cma1.b0();
                        throw null;
                    }
                    btsVar14.i0();
                    if (btsVar14.S) {
                        btsVar14.n(slsVar4);
                    } else {
                        btsVar14.r0();
                    }
                    qje.W(btsVar14, d.f, a4);
                    qje.W(btsVar14, d.e, o4);
                    qje.W(btsVar14, d.g, Integer.valueOf(hashCode2));
                    qje.M(btsVar14, d.h);
                    qje.W(btsVar14, d.d, d6);
                    if (o341Var.f.a) {
                        btsVar14.e0(-1523689207);
                        float f = o341Var.f.b;
                        boolean k3 = btsVar14.k(tlsVar7);
                        Object Q4 = btsVar14.Q();
                        if (k3 || Q4 == o430Var) {
                            Q4 = new fc01(i2, tlsVar7);
                            btsVar14.o0(Q4);
                        }
                        uob1.a(f, null, (sls) Q4, btsVar14, 0);
                        btsVar14.t(false);
                    } else {
                        btsVar14.e0(-1523473943);
                        btsVar14.t(false);
                    }
                    int i7 = s241.a[o341Var.g.ordinal()];
                    if (i7 == 1) {
                        btsVar14.e0(-1523360607);
                        boolean k4 = btsVar14.k(tlsVar7);
                        Object Q5 = btsVar14.Q();
                        if (k4 || Q5 == o430Var) {
                            Q5 = new fc01(18, tlsVar7);
                            btsVar14.o0(Q5);
                        }
                        xqa1.c(0, btsVar14, (sls) Q5, null);
                        btsVar14.t(false);
                    } else {
                        if (i7 != 2) {
                            throw unr0.y(1890519466, btsVar14, false);
                        }
                        btsVar14.e0(-1523125069);
                        boolean k5 = btsVar14.k(tlsVar7);
                        Object Q6 = btsVar14.Q();
                        if (k5 || Q6 == o430Var) {
                            Q6 = new fc01(19, tlsVar7);
                            btsVar14.o0(Q6);
                        }
                        jra1.e(0, btsVar14, (sls) Q6, null);
                        btsVar14.t(false);
                    }
                    btsVar14.t(true);
                } else {
                    btsVar14.Y();
                }
                return zy11Var2;
        }
    }

    public /* synthetic */ hex0(int i, Object obj, Object obj2) {
        this.a = i;
        this.c = obj;
        this.b = obj2;
    }

    public /* synthetic */ hex0(Object obj, Object obj2, int i, int i2) {
        this.a = i2;
        this.c = obj;
        this.b = obj2;
    }
}
