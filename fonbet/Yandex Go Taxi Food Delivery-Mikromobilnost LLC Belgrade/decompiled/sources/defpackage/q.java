package defpackage;

import android.content.Context;
import android.util.Base64;
import androidx.compose.ui.semantics.f;
import com.yandex.go.requirements.comment.summary.ui.v3.domain.a;
import com.yandex.go.requirements.comment.summary.ui.v3.domain.b;
import com.yandex.go.taxi.order.models.api.car.CopyInfoType;
import com.yandex.go.user_profile.ui.am.u;
import com.yandex.passport.api.a3;
import com.yandex.passport.api.b3;
import com.yandex.passport.api.w2;
import com.yandex.passport.api.z2;
import com.yandex.xplat.common.c;
import defpackage.n12;
import defpackage.t;
import defpackage.tje;
import defpackage.tse;
import defpackage.x12;
import defpackage.y0;
import defpackage.zy11;
import java.security.Signature;
import java.util.List;
import kotlinx.coroutines.flow.e;
import kotlinx.coroutines.flow.r0;
import ru.CryptoPro.JCP.ASN.Gost_CryptoPro_PrivateKey._Gost_CryptoPro_PrivateKeyValues;
import ru.CryptoPro.reprov.x509.X509CertImpl;
import ru.yandex.taxi.HapticController$Effect;
import ru.yandex.taxi.linked_order.modals.ambulance.domain.d;
import ru.yandex.taxi.models.CopySource;
import ru.yandex.taxi.widget.RobotoTextView;
import ru.yandex.video.m3.player.utils.DRMInfoProvider;

/* loaded from: classes3.dex */
public final /* synthetic */ class q implements tls {
    public final /* synthetic */ int a;
    public final /* synthetic */ Object b;
    public final /* synthetic */ Object c;
    public final /* synthetic */ Object w;

    public /* synthetic */ q(int i, Object obj, Object obj2, Object obj3) {
        this.a = i;
        this.b = obj;
        this.c = obj2;
        this.w = obj3;
    }

    @Override // defpackage.tls
    public final Object invoke(Object obj) {
        int i = this.a;
        int i2 = 4;
        int i3 = 18;
        int i4 = 2;
        final int i5 = 0;
        final int i6 = 1;
        Object obj2 = null;
        zy11 zy11Var = zy11.a;
        Object obj3 = this.w;
        Object obj4 = this.c;
        Object obj5 = this.b;
        switch (i) {
            case 0:
                final t tVar = (t) obj5;
                final a aVar = (a) obj3;
                yfd yfdVar = (yfd) obj;
                final s sVar = new s(tVar);
                ((agd) yfdVar).c = ((b) obj4).a();
                agd agdVar = (agd) yfdVar;
                agdVar.e = new tls() { // from class: com.yandex.go.requirements.comment.summary.ui.v3.ui.router.a
                    @Override // defpackage.tls
                    public final Object invoke(Object obj6) {
                        tje.N(t.this.o(), null, null, new AIRequirementsCommentModalRouter$content$1$1$1(aVar, (y0) obj6, sVar, null), 3);
                        return zy11.a;
                    }
                };
                t1d.a.getClass();
                agdVar.g = t1d.b;
                break;
            case 1:
                r8i0 r8i0Var = (r8i0) obj5;
                tm tmVar = (tm) obj4;
                boolean z = !r8i0Var.c;
                r8i0Var.c = z;
                qg qgVar = tmVar.S;
                qgVar.a = z;
                qgVar.sendAccessibilityEvent(tmVar.N, 2048);
                tmVar.X(z, true);
                ((s8i0) obj3).c(r8i0Var.a, r8i0Var.c);
                qke.E(tmVar.a.getContext(), HapticController$Effect.CLICK_MEDIUM, false, 8);
                break;
            case 2:
                ph0 ph0Var = (ph0) obj5;
                tls tlsVar = (tls) obj4;
                tls tlsVar2 = (tls) obj3;
                jh0 jh0Var = (jh0) obj;
                if (!(jh0Var instanceof eh0)) {
                    if (!(jh0Var instanceof ch0)) {
                        tlsVar.invoke(jh0Var);
                        tlsVar2.invoke(jh0Var);
                        break;
                    } else {
                        String str = ph0Var.c;
                        if (str != null) {
                            fh0 fh0Var = new fh0(str);
                            tlsVar.invoke(fh0Var);
                            tlsVar2.invoke(fh0Var);
                            break;
                        }
                    }
                } else {
                    String str2 = ph0Var.c;
                    if (str2 != null) {
                        gh0 gh0Var = new gh0(str2);
                        tlsVar.invoke(gh0Var);
                        tlsVar2.invoke(gh0Var);
                        break;
                    }
                }
                break;
            case 3:
                String str3 = (String) obj;
                ((oz40) obj3).setValue(str3);
                ((wls) obj5).invoke(str3, ((hw0) obj4).i);
                break;
            case 4:
                ((r61) obj5).f.a((b0k0) obj4, new w41((qv0) obj));
                ((sls) obj3).invoke();
                break;
            case 5:
                dv8.c(((r61) obj5).a, c51.a, (ju0) obj4, (vu0) obj3, (sls) obj, 8);
                break;
            case 6:
                vc1 vc1Var = (vc1) obj4;
                final kcz0 a = ((com.yandex.go.urbanads.b) obj5).a(vc1Var.a, vc1Var.b, vc1Var.c);
                ((oz40) obj3).setValue(new sls() { // from class: ic1
                    @Override // defpackage.sls
                    public final Object invoke() {
                        int i7 = i5;
                        zy11 zy11Var2 = zy11.a;
                        kcz0 kcz0Var = a;
                        switch (i7) {
                            case 0:
                                ((vf21) kcz0Var.b).a.n();
                                break;
                            default:
                                ((vf21) kcz0Var.b).a.n();
                                break;
                        }
                        return zy11Var2;
                    }
                });
                break;
            case 7:
                wc1 wc1Var = (wc1) obj4;
                final kcz0 a2 = ((com.yandex.go.urbanads.b) obj5).a(wc1Var.a, wc1Var.b, wc1Var.c);
                ((oz40) obj3).setValue(new sls() { // from class: ic1
                    @Override // defpackage.sls
                    public final Object invoke() {
                        int i7 = i6;
                        zy11 zy11Var2 = zy11.a;
                        kcz0 kcz0Var = a2;
                        switch (i7) {
                            case 0:
                                ((vf21) kcz0Var.b).a.n();
                                break;
                            default:
                                ((vf21) kcz0Var.b).a.n();
                                break;
                        }
                        return zy11Var2;
                    }
                });
                break;
            case 8:
                ((ru.yandex.taxi.layers.domain.a) obj5).d.remove((String) obj4, (pzt0) obj3);
                break;
            case 9:
                tls tlsVar3 = (tls) obj4;
                oz40 oz40Var = (oz40) obj3;
                b3 b3Var = (b3) obj;
                ((u) obj5).getClass();
                if (jl40.l(b3Var, a3.a)) {
                    obj2 = d12.a;
                } else if (b3Var instanceof z2) {
                    obj2 = c12.a;
                } else if (b3Var instanceof w2) {
                    obj2 = b12.a;
                }
                if (obj2 == null) {
                    tlsVar3.invoke(b3Var);
                    break;
                } else {
                    oz40Var.setValue(obj2);
                    break;
                }
            case 10:
                final n12 n12Var = (n12) obj5;
                mrj mrjVar = (mrj) obj4;
                final y12 y12Var = (y12) obj3;
                yfd yfdVar2 = (yfd) obj;
                final m12 m12Var = new m12(n12Var);
                r1s r1sVar = (r1s) mrjVar.c;
                tpr t = e.t(new ru.yandex.taxi.linked_order.modals.ambulance.domain.b(new mth(new d(((qoy) r1sVar.b).a(((mf1) r1sVar.c).b), (ru.yandex.taxi.linked_order.mapper.a) r1sVar.w), 6), mrjVar));
                ((tt2) mrjVar.b).getClass();
                ((agd) yfdVar2).c = e.F(t, uyj.a);
                agd agdVar2 = (agd) yfdVar2;
                agdVar2.e = new tls() { // from class: ru.yandex.taxi.linked_order.router.ambulance.a
                    @Override // defpackage.tls
                    public final Object invoke(Object obj6) {
                        tje.N(n12.this.o(), null, null, new AmbulanceLinkedOrderRouter$content$1$1$1(y12Var, (x12) obj6, m12Var, null), 3);
                        return zy11.a;
                    }
                };
                p2d.a.getClass();
                agdVar2.g = p2d.b;
                break;
            case 11:
                tls tlsVar4 = (tls) obj3;
                Integer num = (Integer) obj;
                m33 m33Var = ((j33) ((List) obj4).get(num.intValue())).b;
                s33 s33Var = ((g400) obj5).b;
                if (s33Var != null) {
                    s33Var.L = true;
                    s33Var.M = m33Var;
                    com.yandex.smartcamera.arscene.ar_core.helpers.b bVar = s33Var.c0;
                    bVar.c = m33Var;
                    bVar.c();
                }
                tlsVar4.invoke(num);
                break;
            case 12:
                tls tlsVar5 = (tls) obj4;
                he3 he3Var = (he3) obj3;
                mnq0 mnq0Var = (mnq0) obj;
                f.n(mnq0Var, 1);
                xd3 xd3Var = ((ee3) obj5).a;
                ie3 ie3Var = xd3Var.b;
                nif nifVar = ie3Var != null ? new nif(new mw2(i4, tlsVar5, ie3Var), xd3Var.c) : null;
                xd3 xd3Var2 = he3Var.a;
                ie3 ie3Var2 = xd3Var2.b;
                f.m(mnq0Var, j73.A(new nif[]{nifVar, ie3Var2 != null ? new nif(new mw2(i4, tlsVar5, ie3Var2), xd3Var2.c) : null}));
                break;
            case 13:
                uy21 uy21Var = (uy21) obj4;
                ((com.ybsdk.feature.autotopup.internal.presentation.setup.v2.b) obj5).J.z(uy21Var);
                break;
            case 14:
                uy21 uy21Var2 = (uy21) obj4;
                mu3 mu3Var = (mu3) obj3;
                ((com.ybsdk.feature.autotopup.internal.presentation.setup.v2.b) obj5).J.z(uy21Var2);
                ou3 ou3Var = mu3Var.a;
                List list = uy21Var2.b;
                break;
            case 15:
                final tse tseVar = (tse) obj4;
                final svz0 svz0Var = (svz0) obj3;
                f.h((mnq0) obj, (String) obj5, new sls() { // from class: androidx.compose.material3.internal.b
                    @Override // defpackage.sls
                    public final Object invoke() {
                        tje.N(tse.this, null, null, new BasicTooltipKt$anchorSemantics$1$1$1(svz0Var, null), 3);
                        return Boolean.TRUE;
                    }
                });
                break;
            case 16:
                ((RobotoTextView) obj).setText(q5b1.j((Context) obj5, (f611) obj4, (auy0) obj3));
                break;
            case 17:
                vq5 vq5Var = (vq5) obj5;
                tls tlsVar6 = (tls) obj4;
                pz40 pz40Var = (pz40) obj3;
                u6y u6yVar = (u6y) obj;
                bpl0 bpl0Var = vq5Var.a;
                List list2 = bpl0Var.a;
                wls wlsVar = bpl0Var.b;
                ((m6y) u6yVar).f(list2.size(), wlsVar != null ? new qq5(0, wlsVar, list2) : null, new qc0(list2, i2), new androidx.compose.runtime.internal.a(1891899975, new com.yandex.go.rida.bids.ui.e(list2, tlsVar6, pz40Var, vq5Var), true));
                break;
            case 18:
                bt5 bt5Var = (bt5) obj4;
                String str4 = ((rka0) obj5).a;
                goz0 goz0Var = ((ynz0) obj).b;
                tu20 tu20Var = new tu20(str4, goz0Var.b, bt5Var.q, (String) obj3, goz0Var.a);
                qs20 qs20Var = bt5Var.e;
                break;
            case 19:
                bt5 bt5Var2 = (bt5) obj5;
                break;
            case 20:
                break;
            case 21:
                bx5 bx5Var = (bx5) obj5;
                n560 n560Var = (n560) obj4;
                hh5 hh5Var = (hh5) obj3;
                y22 y22Var = bx5Var.m;
                String str5 = ((n931) obj).a;
                y22Var.b.b("bind_card_purchase_token", str5);
                rwo rwoVar = bx5Var.l;
                qv90.a.getClass();
                y22 y22Var2 = (y22) rwoVar;
                y22Var2.a(y891.c("bind_new_card_verify_completed", vfc.i(0, "bind_card_purchase_id", str5, DRMInfoProvider.MediaDRMKeys.PLUGIN_DESCRIPTION, "Завершение верификации: bind_card_purchase_id = ".concat(str5))));
                boolean z2 = bx5Var.k;
                String concat = "Поллинг верификационного платежа для новой карты: ".concat(z2 ? "включен" : "выключен");
                wj00 wj00Var = new wj00(0);
                wj00Var.i("use_verification_polling", z2);
                wj00Var.k(DRMInfoProvider.MediaDRMKeys.PLUGIN_DESCRIPTION, concat);
                iho c = y891.c("bind_new_card_verify_polling_status", wj00Var);
                md51 d = z2 ? bx5Var.d(n560Var.a, str5, new yeb(hh5Var, rwoVar)) : bx5Var.c(str5, new yeb(hh5Var, rwoVar));
                y22Var2.b(c, d);
                break;
            case 22:
                bx5 bx5Var2 = (bx5) obj5;
                String str6 = (String) obj4;
                hh5 hh5Var2 = (hh5) obj3;
                y22 y22Var3 = bx5Var2.m;
                rwo rwoVar2 = bx5Var2.l;
                String str7 = ((n931) obj).a;
                y22Var3.b.b("bind_card_purchase_token", str7);
                if (!bx5Var2.k) {
                    break;
                } else {
                    break;
                }
            case 23:
                rwo rwoVar3 = ((fx5) obj5).a;
                dke dkeVar = (dke) obj4;
                byte[] bArr = (byte[]) obj3;
                try {
                    Signature signature = ((ay5) obj).a;
                    if (signature != null) {
                        signature.update(bArr);
                        String encodeToString = Base64.encodeToString(signature.sign(), 2);
                        qv90.a.getClass();
                        String concat2 = c.d(0, 10, encodeToString).concat("***");
                        String concat3 = "Успешное формирование подписи: ".concat(concat2);
                        sv90 sv90Var = qv90.a;
                        ((y22) rwoVar3).a(y891.c("biometry_signature_success", vfc.i(0, DRMInfoProvider.MediaDRMKeys.PLUGIN_DESCRIPTION, concat3, X509CertImpl.SIGNATURE, concat2)));
                        dkeVar.invoke(encodeToString);
                        break;
                    }
                } catch (Exception e) {
                    sv90 sv90Var2 = qv90.a;
                    String valueOf = String.valueOf(e.getMessage());
                    sv90Var2.getClass();
                    ((y22) rwoVar3).a(sv90.f(valueOf));
                    dkeVar.invoke(null);
                    break;
                }
                break;
            case 24:
                tls tlsVar7 = (tls) obj3;
                Boolean bool = (Boolean) obj;
                bool.getClass();
                ((gd7) obj5).b.setActionHandler((y6k) obj4);
                if (tlsVar7 != null) {
                    tlsVar7.invoke(bool);
                    break;
                }
                break;
            case 25:
                break;
            case 26:
                n70 n70Var = (n70) obj;
                n70Var.W(new lc0((tls) obj3, (Object) n70Var, obj5, obj4, 7));
                break;
            case 27:
                q48 q48Var = (q48) obj4;
                CopySource copySource = (CopySource) obj3;
                CopyInfoType copyInfoType = (CopyInfoType) obj;
                r48 r48Var = ((ru.yandex.taxi.superapp.orders.ui.c) obj5).e;
                if (r48Var != null) {
                    r48Var.e(web1.g(q48Var, copyInfoType), copyInfoType, copySource);
                    break;
                }
                break;
            case 28:
                yb8 yb8Var = (yb8) obj5;
                lh8 lh8Var = (lh8) obj4;
                lh8 lh8Var2 = (lh8) obj3;
                ynz0 ynz0Var = (ynz0) obj;
                goz0 goz0Var2 = ynz0Var.b;
                String str8 = goz0Var2.a;
                String str9 = goz0Var2.b;
                if (str8 != null && !evu0.J(str8) && str9 != null && !evu0.J(str9)) {
                    foz0 foz0Var = new foz0(ynz0Var.a, str8, str9);
                    yb8Var.a.b = yb8Var.c;
                    shb1.e(new u08(5, lh8Var2, foz0Var));
                    break;
                } else {
                    yb8Var.a.b = yb8Var.c;
                    shb1.e(new rk6(i3, lh8Var));
                    break;
                }
                break;
            default:
                oz40 oz40Var2 = (oz40) obj4;
                rzx rzxVar = (rzx) obj;
                zii0 j = gwk0.o(rzxVar).j(rzxVar, true);
                a2y a2yVar = ((ru.yandex.logistics.sdk.cargo_form.impl.ui.c) obj5).A;
                zii0 zii0Var = new zii0(j.a, ((Number) oz40Var2.getValue()).floatValue() + j.b, j.c, j.d - ((Number) ((oz40) obj3).getValue()).floatValue());
                r0 r0Var = a2yVar.a;
                r0Var.getClass();
                r0Var.m(null, zii0Var);
                a2yVar.c = ((Number) oz40Var2.getValue()).floatValue() + Float.intBitsToFloat((int) (rzxVar.v(0L) & _Gost_CryptoPro_PrivateKeyValues.maxDWORD));
                break;
        }
        return zy11Var;
        return zy11Var;
    }
}
