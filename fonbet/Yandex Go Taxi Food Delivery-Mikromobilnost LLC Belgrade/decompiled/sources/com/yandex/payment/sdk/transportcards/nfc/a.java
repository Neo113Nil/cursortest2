package com.yandex.payment.sdk.transportcards.nfc;

import android.content.IntentFilter;
import android.nfc.NfcAdapter;
import android.nfc.tech.MifareClassic;
import android.util.Base64;
import androidx.appcompat.app.AppCompatActivity;
import androidx.lifecycle.p;
import com.yandex.payment.sdk.flex.api.actions.FlexActionParameters$STRATEGY;
import com.yandex.payment.sdk.transportcards.nfc.callbacks.NfcReaderCallback;
import com.yandex.payment.sdk.transportcards.nfc.exception.DecodeCardNumberException;
import com.yandex.payment.sdk.transportcards.ui.TransportCardsActivity;
import defpackage.bvf0;
import defpackage.c1x0;
import defpackage.dl01;
import defpackage.eg01;
import defpackage.hpo0;
import defpackage.i511;
import defpackage.igr;
import defpackage.jgr;
import defpackage.jl01;
import defpackage.kcz0;
import defpackage.kgr;
import defpackage.lz40;
import defpackage.mdh;
import defpackage.mgr;
import defpackage.pf11;
import defpackage.q211;
import defpackage.qf11;
import defpackage.qv90;
import defpackage.rf11;
import defpackage.rub1;
import defpackage.rwo;
import defpackage.scc;
import defpackage.sjh;
import defpackage.sls;
import defpackage.sv90;
import defpackage.t511;
import defpackage.t601;
import defpackage.tf11;
import defpackage.tje;
import defpackage.uyj;
import defpackage.vb11;
import defpackage.vfc;
import defpackage.w511;
import defpackage.wj00;
import defpackage.y22;
import defpackage.y891;
import defpackage.zr01;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import kotlin.Pair;
import ru.CryptoPro.JCP.ASN.Gost_CryptoPro_PrivateKey._Gost_CryptoPro_PrivateKeyValues;
import ru.CryptoPro.reprov.x509.CRLReasonCodeExtension;
import ru.yandex.video.m3.player.utils.DRMInfoProvider;

/* loaded from: classes2.dex */
public final class a {
    public final eg01 a;
    public rwo b;
    public final WeakReference c;
    public NfcAdapter d;
    public MifareClassic e;
    public NfcReaderCallback f;
    public p g;
    public rub1 h;
    public final NfcStateReceiver i = new NfcStateReceiver(new c1x0(this));

    public a(TransportCardsActivity transportCardsActivity, eg01 eg01Var) {
        this.a = eg01Var;
        this.c = new WeakReference(transportCardsActivity);
    }

    public static final void a(a aVar, mgr mgrVar) {
        aVar.getClass();
        if (!(mgrVar instanceof jgr)) {
            if (mgrVar instanceof igr) {
                igr igrVar = (igr) mgrVar;
                aVar.h = new pf11(igrVar);
                aVar.f(igrVar);
                return;
            } else {
                if (!(mgrVar instanceof kgr)) {
                    aVar.h = null;
                    return;
                }
                kgr kgrVar = (kgr) mgrVar;
                aVar.h = new rf11(kgrVar);
                aVar.i(kgrVar);
                return;
            }
        }
        aVar.h = new qf11((jgr) mgrVar);
        eg01 eg01Var = aVar.a;
        AppCompatActivity b = aVar.b();
        if (b != null) {
            NfcStateReceiver nfcStateReceiver = aVar.i;
            NfcStateReceiver.Companion.getClass();
            b.registerReceiver(nfcStateReceiver, new IntentFilter("android.nfc.action.ADAPTER_STATE_CHANGED"));
            NfcAdapter nfcAdapter = aVar.d;
            if (nfcAdapter != null) {
                eg01Var.w(nfcAdapter.isEnabled());
                if (!nfcAdapter.isEnabled()) {
                    ((TransportCardsActivity) eg01Var.a).showNfcDialog();
                }
            }
        }
        aVar.e(new zr01(12, aVar, mgrVar));
    }

    public final AppCompatActivity b() {
        return (AppCompatActivity) this.c.get();
    }

    public final void c(rwo rwoVar, p pVar, lz40 lz40Var, t511 t511Var, i511 i511Var, vb11 vb11Var, q211 q211Var) {
        this.g = pVar;
        this.b = rwoVar;
        AppCompatActivity b = b();
        if (b != null) {
            this.d = NfcAdapter.getDefaultAdapter(b);
        }
        t511Var.a = new TroikaNfcController$init$1(1, this, a.class, "setState", "setState(Lcom/yandex/payment/sdk/flex/api/actions/FlexActionParameters;)V", 0);
        i511Var.a = new TroikaNfcController$init$2(1, this, a.class, "setState", "setState(Lcom/yandex/payment/sdk/flex/api/actions/FlexActionParameters;)V", 0);
        vb11Var.a = new TroikaNfcController$init$3(1, this, a.class, "setState", "setState(Lcom/yandex/payment/sdk/flex/api/actions/FlexActionParameters;)V", 0);
        q211Var.a = new jl01(25, this);
        tje.N(pVar, null, null, new TroikaNfcController$init$5(lz40Var, this, null), 3);
    }

    public final boolean d() {
        rwo rwoVar = this.b;
        if (rwoVar != null) {
            sv90 sv90Var = qv90.a;
            boolean z = this.d != null;
            sv90Var.getClass();
            String concat = "NFC модуль на устройстве ".concat(z ? "доступен" : "не доступен");
            wj00 wj00Var = new wj00(0);
            wj00Var.k(DRMInfoProvider.MediaDRMKeys.PLUGIN_DESCRIPTION, concat);
            wj00Var.i("value", z);
            ((y22) rwoVar).a(y891.c("nfc_available_on_device", wj00Var));
        }
        return this.d != null;
    }

    public final void e(sls slsVar) {
        NfcAdapter nfcAdapter;
        this.f = new NfcReaderCallback(new dl01(16, this, slsVar));
        AppCompatActivity b = b();
        if (b == null || (nfcAdapter = this.d) == null) {
            return;
        }
        nfcAdapter.enableReaderMode(b, this.f, 15, null);
    }

    public final void f(igr igrVar) {
        p pVar = this.g;
        if (pVar != null) {
            if (!bvf0.D(pVar)) {
                pVar = null;
            }
            if (pVar != null) {
                sjh sjhVar = uyj.a;
                tje.N(pVar, mdh.b, null, new TroikaNfcController$readBlocksAction$2(this, igrVar, null), 2);
            }
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:10:0x014d  */
    /* JADX WARN: Removed duplicated region for block: B:19:0x0167  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x014a  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void g(jgr jgrVar) {
        String str;
        boolean z;
        MifareClassic mifareClassic = this.e;
        rwo rwoVar = this.b;
        kcz0 kcz0Var = new kcz0();
        kcz0Var.a = rwoVar;
        kcz0Var.b = new tf11();
        if (rwoVar != null) {
            ((y22) rwoVar).a(vfc.f(qv90.a, 0, DRMInfoProvider.MediaDRMKeys.PLUGIN_DESCRIPTION, "Начало чтения номера карты", "nfc_read_card_number_start"));
        }
        int i = 8;
        if (mifareClassic != null) {
            try {
                ArrayList arrayList = new ArrayList();
                for (Pair pair : scc.g(new Pair(4, Base64.decode("cwaPEYwT", 2)), new Pair(7, Base64.decode("rj1lo9rU", 2)), new Pair(8, Base64.decode("pz9dwdMz", 2)))) {
                    byte[] t = kcz0Var.t(mifareClassic, ((Number) pair.c()).intValue(), (byte[]) pair.f());
                    if (t.length != 0) {
                        arrayList.add(t);
                    }
                }
                Iterator it = arrayList.iterator();
                while (true) {
                    if (!it.hasNext()) {
                        str = null;
                        break;
                    }
                    byte[] bArr = (byte[]) it.next();
                    ((tf11) kcz0Var.b).getClass();
                    if (2 >= bArr.length) {
                        str = null;
                    } else {
                        int i2 = 32;
                        int i3 = 0;
                        int i4 = 2;
                        int i5 = 4;
                        while (i2 > 0) {
                            int i6 = 8 - i5;
                            int min = Math.min(i2, i6);
                            i3 = (i3 << min) | (((((1 << i6) - 1) - ((1 << r16) - 1)) & bArr[i4]) >> (i6 - min));
                            i2 -= min;
                            i5 = 0;
                            i4++;
                        }
                        long j = i3;
                        if (j < 0) {
                            j &= _Gost_CryptoPro_PrivateKeyValues.maxDWORD;
                        }
                        str = String.format("%010d", Arrays.copyOf(new Object[]{Long.valueOf(j)}, 1));
                    }
                    if (str != null) {
                        break;
                    }
                }
            } catch (Exception e) {
                if (rwoVar != null) {
                    sv90 sv90Var = qv90.a;
                    String valueOf = String.valueOf(e.getMessage());
                    sv90Var.getClass();
                    ((y22) rwoVar).a(sv90.z(valueOf));
                }
            }
            if (str == null) {
                throw new DecodeCardNumberException();
            }
            if (rwoVar != null) {
                qv90.a.getClass();
                String concat = "Успешное чтение номера карты: ".concat(str);
                wj00 wj00Var = new wj00(0);
                wj00Var.k(DRMInfoProvider.MediaDRMKeys.PLUGIN_DESCRIPTION, concat);
                ((y22) rwoVar).a(y891.c("nfc_read_card_number_success", wj00Var));
            }
            z = str != null;
            if (!z) {
                if (jgrVar.a == FlexActionParameters$STRATEGY.NFC_BIND) {
                    h();
                }
                AppCompatActivity b = b();
                if (b != null) {
                    b.runOnUiThread(new hpo0(17, this, str, jgrVar));
                    return;
                }
                return;
            }
            if (z) {
                w511.b();
                return;
            }
            h();
            AppCompatActivity b2 = b();
            if (b2 != null) {
                b2.runOnUiThread(new t601(i, this, jgrVar));
                return;
            }
            return;
        }
        str = null;
        if (str != null) {
        }
        if (!z) {
        }
    }

    public final void h() {
        try {
            MifareClassic mifareClassic = this.e;
            if (mifareClassic != null) {
                mifareClassic.close();
            }
            this.e = null;
        } catch (Exception e) {
            rwo rwoVar = this.b;
            if (rwoVar != null) {
                sv90 sv90Var = qv90.a;
                String valueOf = String.valueOf(e.getMessage());
                sv90Var.getClass();
                ((y22) rwoVar).a(y891.c("nfc_close_error", vfc.i(0, DRMInfoProvider.MediaDRMKeys.PLUGIN_DESCRIPTION, "Ошибка закрытия потока чтения/записи NFC модуля: ".concat(valueOf), CRLReasonCodeExtension.REASON, valueOf)));
            }
        }
    }

    public final void i(kgr kgrVar) {
        p pVar = this.g;
        if (pVar != null) {
            if (!bvf0.D(pVar)) {
                pVar = null;
            }
            if (pVar != null) {
                sjh sjhVar = uyj.a;
                tje.N(pVar, mdh.b, null, new TroikaNfcController$writeBlocksAction$2(this, kgrVar, null), 2);
            }
        }
    }
}
