package defpackage;

import android.content.Context;
import android.content.pm.PackageManager;
import android.content.res.Resources;
import android.os.Build;
import androidx.compose.ui.b;
import androidx.compose.ui.node.d;
import com.google.ar.core.ImageMetadata;
import com.yandex.payment.sdk.core.data.ConsoleLoggingMode;
import com.yandex.payment.sdk.core.data.Merchant;
import com.yandex.payment.sdk.core.data.Payer;
import com.yandex.payment.sdk.core.data.PaymentSdkEnvironment;
import com.yandex.xplat.payment.sdk.ClientPlatform;
import io.appmetrica.analytics.AppMetrica;
import java.net.URL;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import java.util.Locale;
import ru.CryptoPro.JCSP.MSCAPI.HProv;
import ru.yandex.taxi.logistics.sdk.ui.component.control.a;
import ru.yandex.video.m3.player.utils.DRMInfoProvider;

/* loaded from: classes2.dex */
public abstract class dha1 {
    public static final void a(pd5 pd5Var, List list, boolean z, tls tlsVar, sls slsVar, sls slsVar2, sls slsVar3, fid fidVar, int i) {
        bts btsVar = (bts) fidVar;
        btsVar.g0(-999346103);
        int i2 = i | (btsVar.k(pd5Var) ? 4 : 2) | (btsVar.e(list) ? 32 : 16) | (btsVar.a(z) ? 256 : 128) | (btsVar.e(tlsVar) ? 2048 : 1024) | (btsVar.e(slsVar) ? 16384 : 8192) | (btsVar.e(slsVar2) ? 131072 : 65536) | (btsVar.e(slsVar3) ? 1048576 : 524288);
        if (!btsVar.V(i2 & 1, (599187 & i2) != 599186)) {
            btsVar.Y();
        } else if (pd5Var == null) {
            btsVar.e0(1193845387);
            c(btsVar, 0);
            btsVar.t(false);
        } else {
            btsVar.e0(1193905372);
            b(pd5Var, list, z, tlsVar, slsVar, slsVar2, slsVar3, btsVar, i2 & 4194302);
            btsVar.t(false);
        }
        aii0 v = btsVar.v();
        if (v != null) {
            v.d = new wo1(pd5Var, list, z, tlsVar, slsVar, slsVar2, slsVar3, i);
        }
    }

    public static final void b(pd5 pd5Var, List list, boolean z, tls tlsVar, sls slsVar, sls slsVar2, sls slsVar3, fid fidVar, int i) {
        int i2;
        bts btsVar;
        c530 c530Var;
        bts btsVar2 = (bts) fidVar;
        btsVar2.g0(-1819707592);
        if ((i & 6) == 0) {
            i2 = (btsVar2.k(pd5Var) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= btsVar2.e(list) ? 32 : 16;
        }
        if ((i & 384) == 0) {
            i2 |= btsVar2.a(z) ? 256 : 128;
        }
        if ((i & HProv.ALG_TYPE_SECURECHANNEL) == 0) {
            i2 |= btsVar2.e(tlsVar) ? 2048 : 1024;
        }
        if ((i & HProv.ALG_CLASS_DATA_ENCRYPT) == 0) {
            i2 |= btsVar2.e(slsVar) ? 16384 : 8192;
        }
        if ((196608 & i) == 0) {
            i2 |= btsVar2.e(slsVar2) ? 131072 : 65536;
        }
        if ((1572864 & i) == 0) {
            i2 |= btsVar2.e(slsVar3) ? 1048576 : 524288;
        }
        if (btsVar2.V(i2 & 1, (599187 & i2) != 599186)) {
            sic a = qic.a(lr20.c, x4c.G, btsVar2, 0);
            int hashCode = Long.hashCode(btsVar2.T);
            r1b0 o = btsVar2.o();
            c530 c530Var2 = c530.a;
            f530 d = b.d(btsVar2, c530Var2);
            ohd.G1.getClass();
            sls slsVar4 = d.b;
            if (btsVar2.a == null) {
                cma1.b0();
                throw null;
            }
            btsVar2.i0();
            if (btsVar2.S) {
                btsVar2.n(slsVar4);
            } else {
                btsVar2.r0();
            }
            qje.W(btsVar2, d.f, a);
            qje.W(btsVar2, d.e, o);
            wls wlsVar = d.g;
            if (btsVar2.S || !jl40.l(btsVar2.Q(), Integer.valueOf(hashCode))) {
                b64.z(hashCode, btsVar2, hashCode, wlsVar);
            }
            qje.W(btsVar2, d.d, d);
            oeb1.c(btsVar2, ljs0.e(c530Var2, 20.0f));
            d(pd5Var.a, pd5Var.b, btsVar2, 0);
            oeb1.c(btsVar2, ljs0.e(c530Var2, 20.0f));
            CharSequence charSequence = pd5Var.c;
            CharSequence charSequence2 = pd5Var.e;
            CharSequence charSequence3 = pd5Var.d;
            CharSequence charSequence4 = pd5Var.f;
            boolean z2 = !z;
            boolean e = ((i2 & 7168) == 2048) | btsVar2.e(list);
            Object Q = btsVar2.Q();
            o430 o430Var = did.a;
            if (e || Q == o430Var) {
                c530Var = c530Var2;
                Q = new ymj(29, tlsVar, list);
                btsVar2.o0(Q);
            } else {
                c530Var = c530Var2;
            }
            int i3 = 1;
            e(charSequence, charSequence2, charSequence3, charSequence4, (sls) Q, slsVar, z2, btsVar2, (i2 << 3) & ImageMetadata.JPEG_GPS_COORDINATES);
            btsVar = btsVar2;
            ly3.B(c530Var, 8.0f, btsVar, true);
            boolean z3 = ((3670016 & i2) == 1048576) | ((i2 & ImageMetadata.JPEG_GPS_COORDINATES) == 131072);
            Object Q2 = btsVar.Q();
            if (z3 || Q2 == o430Var) {
                Q2 = new ts4(i3, slsVar2, slsVar3);
                btsVar.o0(Q2);
            }
            zpn.a(zy11.a, (tls) Q2, btsVar);
        } else {
            btsVar = btsVar2;
            btsVar.Y();
        }
        aii0 v = btsVar.v();
        if (v != null) {
            v.d = new nub(pd5Var, list, z, tlsVar, slsVar, slsVar2, slsVar3, i);
        }
    }

    public static final void c(fid fidVar, int i) {
        bts btsVar = (bts) fidVar;
        btsVar.g0(1223899232);
        if (btsVar.V(i & 1, i != 0)) {
            c530 c530Var = c530.a;
            f530 m = an91.m(c530Var, 24.0f, 0.0f, 2);
            sic a = qic.a(lr20.c, x4c.G, btsVar, 0);
            int hashCode = Long.hashCode(btsVar.T);
            r1b0 o = btsVar.o();
            f530 d = b.d(btsVar, m);
            ohd.G1.getClass();
            sls slsVar = d.b;
            if (btsVar.a == null) {
                cma1.b0();
                throw null;
            }
            btsVar.i0();
            if (btsVar.S) {
                btsVar.n(slsVar);
            } else {
                btsVar.r0();
            }
            qje.W(btsVar, d.f, a);
            qje.W(btsVar, d.e, o);
            wls wlsVar = d.g;
            if (btsVar.S || !jl40.l(btsVar.Q(), Integer.valueOf(hashCode))) {
                b64.z(hashCode, btsVar, hashCode, wlsVar);
            }
            qje.W(btsVar, d.d, d);
            oeb1.c(btsVar, ljs0.e(c530Var, 32.0f));
            mdb1.a(295.0f, null, btsVar, 54, 4);
            oeb1.c(btsVar, ljs0.e(c530Var, 24.0f));
            mdb1.a(231.0f, null, btsVar, 54, 4);
            ly3.B(c530Var, 16.0f, btsVar, true);
        } else {
            btsVar.Y();
        }
        aii0 v = btsVar.v();
        if (v != null) {
            v.d = new txk(i, 20);
        }
    }

    public static final void d(CharSequence charSequence, CharSequence charSequence2, fid fidVar, int i) {
        CharSequence charSequence3;
        CharSequence charSequence4;
        bts btsVar = (bts) fidVar;
        btsVar.g0(-902112482);
        int i2 = (btsVar.e(charSequence) ? 4 : 2) | i | (btsVar.e(charSequence2) ? 32 : 16);
        if (btsVar.V(i2 & 1, (i2 & 19) != 18)) {
            c530 c530Var = c530.a;
            f530 o = an91.o(ljs0.c(c530Var, 1.0f), 16.0f, 0.0f, 16.0f, 0.0f, 10);
            sic a = qic.a(lr20.c, x4c.G, btsVar, 0);
            int hashCode = Long.hashCode(btsVar.T);
            r1b0 o2 = btsVar.o();
            f530 d = b.d(btsVar, o);
            ohd.G1.getClass();
            sls slsVar = d.b;
            if (btsVar.a == null) {
                cma1.b0();
                throw null;
            }
            btsVar.i0();
            if (btsVar.S) {
                btsVar.n(slsVar);
            } else {
                btsVar.r0();
            }
            qje.W(btsVar, d.f, a);
            qje.W(btsVar, d.e, o2);
            wls wlsVar = d.g;
            if (btsVar.S || !jl40.l(btsVar.Q(), Integer.valueOf(hashCode))) {
                b64.z(hashCode, btsVar, hashCode, wlsVar);
            }
            qje.W(btsVar, d.d, d);
            zgb1.a(charSequence, null, 3, false, null, null, false, null, btsVar, (i2 & 14) | 384, 250);
            if (charSequence2 == null) {
                btsVar.e0(-978662836);
                btsVar.t(false);
                charSequence4 = charSequence2;
                charSequence3 = charSequence;
            } else {
                tse0.s(btsVar, -978662835, c530Var, 12.0f, btsVar);
                charSequence4 = charSequence2;
                charSequence3 = charSequence;
                zgb1.a(charSequence4, null, 3, false, null, null, false, null, btsVar, 384, 250);
                btsVar.t(false);
            }
            btsVar.t(true);
        } else {
            charSequence3 = charSequence;
            charSequence4 = charSequence2;
            btsVar.Y();
        }
        aii0 v = btsVar.v();
        if (v != null) {
            v.d = new zga(i, 3, charSequence3, charSequence4);
        }
    }

    public static final void e(CharSequence charSequence, CharSequence charSequence2, CharSequence charSequence3, CharSequence charSequence4, sls slsVar, sls slsVar2, boolean z, fid fidVar, int i) {
        int i2;
        bts btsVar;
        int i3;
        c530 c530Var;
        bts btsVar2;
        bts btsVar3 = (bts) fidVar;
        btsVar3.g0(1352841742);
        if ((i & 6) == 0) {
            i2 = (btsVar3.e(charSequence) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= btsVar3.e(charSequence2) ? 32 : 16;
        }
        if ((i & 384) == 0) {
            i2 |= btsVar3.e(charSequence3) ? 256 : 128;
        }
        if ((i & HProv.ALG_TYPE_SECURECHANNEL) == 0) {
            i2 |= btsVar3.e(charSequence4) ? 2048 : 1024;
        }
        if ((i & HProv.ALG_CLASS_DATA_ENCRYPT) == 0) {
            i2 |= btsVar3.e(slsVar) ? 16384 : 8192;
        }
        if ((196608 & i) == 0) {
            i2 |= btsVar3.e(slsVar2) ? 131072 : 65536;
        }
        if ((1572864 & i) == 0) {
            i2 |= btsVar3.a(z) ? 1048576 : 524288;
        }
        if (btsVar3.V(i2 & 1, (599187 & i2) != 599186)) {
            c530 c530Var2 = c530.a;
            f530 m = an91.m(c530Var2, 8.0f, 0.0f, 2);
            lhl0 a = khl0.a(lr20.a, x4c.D, btsVar3, 0);
            int hashCode = Long.hashCode(btsVar3.T);
            r1b0 o = btsVar3.o();
            f530 d = b.d(btsVar3, m);
            ohd.G1.getClass();
            sls slsVar3 = d.b;
            if (btsVar3.a == null) {
                cma1.b0();
                throw null;
            }
            btsVar3.i0();
            if (btsVar3.S) {
                btsVar3.n(slsVar3);
            } else {
                btsVar3.r0();
            }
            qje.W(btsVar3, d.f, a);
            qje.W(btsVar3, d.e, o);
            wls wlsVar = d.g;
            if (btsVar3.S || !jl40.l(btsVar3.Q(), Integer.valueOf(hashCode))) {
                b64.z(hashCode, btsVar3, hashCode, wlsVar);
            }
            qje.W(btsVar3, d.d, d);
            if (charSequence3 == null) {
                btsVar3.e0(-1936553949);
                btsVar3.t(false);
                btsVar2 = btsVar3;
                i3 = 0;
                c530Var = c530Var2;
            } else {
                btsVar3.e0(-1936553948);
                i3 = 0;
                c530Var = c530Var2;
                a.b(slsVar2, ljs0.c(ljs0.e(c530Var2, 56.0f), 0.5f), null, 0L, 0L, null, null, null, false, charSequence3.toString(), null, null, wwg.S(1894140643, true, new mfa(charSequence3, charSequence4, 1), btsVar3), btsVar3, (i2 >> 15) & 14, 384, 3580);
                btsVar2 = btsVar3;
                nnm.s(c530Var, 2.0f, btsVar2, false);
            }
            bts btsVar4 = btsVar2;
            a.a(slsVar, ljs0.c(ljs0.e(c530Var, 56.0f), 1.0f), null, 0L, 0L, null, z, charSequence.toString(), null, null, wwg.S(-323037293, true, new cwo(i3, charSequence, charSequence2, z), btsVar2), btsVar4, ((i2 >> 12) & 14) | ((i2 << 6) & 234881024), 3324);
            btsVar = btsVar4;
            btsVar.t(true);
        } else {
            btsVar = btsVar3;
            btsVar.Y();
        }
        aii0 v = btsVar.v();
        if (v != null) {
            v.d = new nub(charSequence, charSequence2, charSequence3, charSequence4, slsVar, slsVar2, z, i);
        }
    }

    public static a081 f() {
        a081 a081Var;
        a081 a081Var2 = a081.g;
        if (a081Var2 != null) {
            return a081Var2;
        }
        synchronized (a081.f) {
            a081Var = a081.g;
            if (a081Var == null) {
                a081Var = new a081();
                a081.g = a081Var;
            }
        }
        return a081Var;
    }

    public static final nhj g(pcy pcyVar, String str, ConsoleLoggingMode consoleLoggingMode, String str2, rwo rwoVar, vv50 vv50Var, Context context, Payer payer, boolean z, String str3) {
        PaymentSdkEnvironment paymentSdkEnvironment = pcyVar.a;
        int i = 0;
        int i2 = 1;
        kfh kfhVar = new kfh(new yow(14, pcyVar), new gq50(consoleLoggingMode.isConsoleLoggingEnabled(paymentSdkEnvironment), bwa1.a(paymentSdkEnvironment == PaymentSdkEnvironment.TESTING), Collections.singletonList(new wh4())), new qdh(), new h1(rwoVar, i2), new i1(i2, rwoVar));
        qdh qdhVar = new qdh();
        nf4 nf4Var = new nf4(context, payer, z, paymentSdkEnvironment.getIsDebug(), rwoVar);
        int i3 = 2;
        ArrayList i4 = scc.i(vv50Var, new f7j0());
        pl60 pl60Var = new pl60(str, i3);
        pl60 pl60Var2 = new pl60(str2, i2);
        ArrayList i5 = scc.i(pl60Var, new pl60(str3, 3));
        i5.add(new mu2(i3, new mhj(nf4Var, i)));
        i5.add(pl60Var2);
        return new nhj(new e100(26, new xv50(kfhVar, lu91.a(i4, i5)), qdhVar, new ohj()), rwoVar);
    }

    public static final qs20 h(Context context, Payer payer, Merchant merchant, boolean z, boolean z2, String str, pcy pcyVar, ConsoleLoggingMode consoleLoggingMode, String str2, rwo rwoVar, vv50 vv50Var, String str3, String str4, Boolean bool, od51 od51Var) {
        String str5;
        PaymentSdkEnvironment paymentSdkEnvironment = pcyVar.a;
        qv90.a.getClass();
        char c = 0;
        wj00 wj00Var = new wj00(0);
        wj00Var.k("integration_profile_id", str3 == null ? "default" : str3);
        wj00Var.k(DRMInfoProvider.MediaDRMKeys.PLUGIN_DESCRIPTION, "Сервис передал id интеграционного профиля");
        ((y22) rwoVar).a(y891.c("integration_profile_from_service", wj00Var));
        kfh kfhVar = new kfh(new URL(pcyVar.a()), new gq50(consoleLoggingMode.isConsoleLoggingEnabled(paymentSdkEnvironment), bwa1.a(paymentSdkEnvironment == PaymentSdkEnvironment.TESTING), Collections.singletonList(new wh4())), new qdh(), new h1(rwoVar, c), new i1(c, rwoVar));
        vr vrVar = new vr(context, c);
        mum mumVar = new mum(bool);
        qdh qdhVar = new qdh();
        String serviceToken = merchant.getServiceToken();
        nf4 nf4Var = new nf4(context, payer, z, paymentSdkEnvironment.getIsDebug(), rwoVar);
        ClientPlatform clientPlatform = ClientPlatform.f102android;
        String deviceId = AppMetrica.getDeviceId(context.getApplicationContext());
        ArrayList i = scc.i(vv50Var, new f7j0());
        String str6 = Build.MANUFACTURER;
        String str7 = Build.MODEL;
        kw kwVar = new kw(Build.VERSION.RELEASE.toString(), String.valueOf(Build.VERSION.SDK_INT), String.valueOf(Resources.getSystem().getDisplayMetrics().widthPixels), String.valueOf(Resources.getSystem().getDisplayMetrics().heightPixels));
        Context applicationContext = context.getApplicationContext();
        PackageManager packageManager = applicationContext.getPackageManager();
        String packageName = applicationContext.getPackageName();
        try {
            str5 = packageManager.getPackageInfo(packageName, 0).versionName;
        } catch (PackageManager.NameNotFoundException unused) {
            str5 = null;
        }
        int i2 = 3;
        rbh rbhVar = new rbh(str5, packageName, i2);
        int i3 = 1;
        ArrayList i4 = scc.i(new ts20(new mhj(nf4Var, i3), serviceToken, deviceId), new mu2(i2, clientPlatform), new ns20(z2, str3, mumVar, od51Var, Locale.getDefault().getLanguage()), new pl60(str, 2), new pl60(str2, i3), new pl60(str4, i2));
        i4.add(new mu2(i3, kwVar));
        i4.add(new mu2(c, rbhVar));
        i4.add(new mu2(4, new m020(7, vrVar)));
        Iterator it = i.iterator();
        while (it.hasNext()) {
            i4.add((vv50) it.next());
        }
        return new qs20(new e100(26, new xv50(kfhVar, i4), qdhVar, new fl10(new mhj(nf4Var, 2))), rwoVar);
    }
}
