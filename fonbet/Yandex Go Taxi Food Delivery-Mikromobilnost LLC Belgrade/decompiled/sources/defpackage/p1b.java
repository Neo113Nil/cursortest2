package defpackage;

import android.content.Context;
import android.content.res.ColorStateList;
import android.graphics.Bitmap;
import android.graphics.drawable.BitmapDrawable;
import android.net.Uri;
import android.util.Log;
import com.google.android.gms.tasks.Task;
import com.google.firebase.crashlytics.internal.common.a;
import com.yandex.div.core.images.BitmapSource;
import com.yandex.mapkit.RequestPointType;
import com.yandex.mapkit.navigation.transport.layer.RequestPointStyleProvider;
import com.yandex.mapkit.styling.PlacemarkStyle;
import com.yandex.messaging.core.net.entities.ChatData;
import com.yandex.messaging.core.net.entities.UserData;
import com.yandex.messaging.internal.entities.Message;
import com.yandex.plus.pay.ui.feature.tarifficator.mobile.internal.ui.TarifficatorScenarioActivity;
import com.ybsdk.core.analytics.generated.AppAnalyticsReporter;
import com.ybsdk.core.analytics.generated.delegates.PinEvents$ChangePinCheckPinTokenFromNewCodeResult;
import com.ybsdk.core.analytics.generated.delegates.PinEvents$ForgotPinCheckPinTokenResult;
import com.ybsdk.core.analytics.generated.delegates.PinEvents$ReissuePinCheckPinTokenResult;
import com.ybsdk.core.analytics.generated.delegates.PinEvents$SetupPinCheckPinTokenResult;
import com.ybsdk.core.utils.ColorModel;
import com.ybsdk.core.utils.ext.ViewState;
import com.ybsdk.feature.pin.api.entities.PinScenario;
import java.io.File;
import java.io.InputStream;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.Properties;
import java.util.concurrent.ConcurrentHashMap;
import java.util.zip.ZipFile;
import kotlin.Result;
import kotlin.Triple;
import kotlin.sequences.b;
import kotlin.text.Regex;
import kotlinx.serialization.KSerializer;
import ru.CryptoPro.JCP.tools.pref_store.AndroidPrefStore;
import ru.CryptoPro.JCSP.CSPConfig;
import ru.CryptoPro.JCSP.CSPConfigBase;
import ru.CryptoPro.ssl.util.TLSSettings;
import ru.rt.ebs.cryptosdk.core.security.entities.exceptions.InitializationSecurityEbsException;
import ru.rt.ebs.cryptosdk.core.security.entities.exceptions.VerifySecurityEbsException;
import ru.yandex.taxi.logistics.childrouter.api.ButtonType;
import ru.yandex.taxi.logistics.sdk.confirmation_modal_view.ui.c;
import ru.yandex.taxi.logistics.sdk.confirmation_modal_view.ui.e;
import ru.yandex.taxi.logistics.sdk.tracking.impl.domain.i;
import ru.yandextaxi.flutter_yandex_mapkit.styles.models.RequestPointStyleData;

/* loaded from: classes5.dex */
public final class p1b implements ho3, m8b, kab, fev, wfd, pd90, h3v0, RequestPointStyleProvider, jfp {
    public final Object a;
    public Object b;

    public p1b(zzf zzfVar, c0g c0gVar, rfp rfpVar) {
        this.a = n3w.a(new etu(new rw8(c0gVar.U)));
        this.b = new z9n((xvf0) c0gVar.o0, (xvf0) this.a, (v7p) n3w.a(new itu(new ho9(zzfVar.Ze, zzfVar.U, c0gVar.J9, c0gVar.Bu))), (xvf0) new c7n(zzfVar.C, 29), 22);
    }

    @Override // defpackage.go3
    public void D(Object obj) {
        ((u1b) ((an8) this.a).c).h((ChatData) obj, (UserData) this.b);
    }

    @Override // defpackage.wfd
    public zfd a(Object obj, chd chdVar) {
        agd agdVar = new agd(obj, chdVar);
        agdVar.c = ((yt11) this.a).a();
        ((tls) this.b).invoke(agdVar);
        return agdVar.a();
    }

    public ColorStateList b(Context context) {
        vbb[] vbbVarArr = (vbb[]) this.a;
        ColorStateList colorStateList = (ColorStateList) this.b;
        if (colorStateList != null) {
            return colorStateList;
        }
        int length = vbbVarArr.length;
        int[][] iArr = new int[length][];
        for (int i = 0; i < length; i++) {
            ViewState[] viewStateArr = (ViewState[]) vbbVarArr[i].b;
            int length2 = viewStateArr.length;
            int[] iArr2 = new int[length2];
            for (int i2 = 0; i2 < length2; i2++) {
                iArr2[i2] = viewStateArr[i2].getAttrRes();
            }
            iArr[i] = iArr2;
        }
        int length3 = vbbVarArr.length;
        int[] iArr3 = new int[length3];
        for (int i3 = 0; i3 < length3; i3++) {
            iArr3[i3] = ((ColorModel.Attr) vbbVarArr[i3].a).get(context);
        }
        ColorStateList colorStateList2 = new ColorStateList(iArr, iArr3);
        this.b = colorStateList2;
        return colorStateList2;
    }

    @Override // defpackage.ho3
    /* renamed from: c */
    public boolean mo103c(int i) {
        return false;
    }

    public String d(fqc fqcVar) {
        if (fqcVar == null || fqcVar.equals(bqc.e)) {
            return null;
        }
        boolean equals = fqcVar.equals(bqc.c);
        as21 as21Var = (as21) this.a;
        if (equals) {
            return as21Var.c("LAST_KNOWN_SUPPORT_EMERGENCY_BOT_GUID");
        }
        Map map = (Map) as21Var.d("LAST_KNOWN_SUPPORT_SERVICES_BOT_GUID", uiw0.a);
        if (map != null) {
            return (String) map.get(fqcVar.a());
        }
        return null;
    }

    public void e(Context context) {
        try {
            if (!CSPConfigBase.isInitiated()) {
                int init = CSPConfig.init(context);
                TLSSettings.init(new AndroidPrefStore(context));
                if (init == 12) {
                    throw new VerifySecurityEbsException("App integrity check failed");
                }
                if (init != 0) {
                    throw new InitializationSecurityEbsException((String) cdf.a.getOrDefault(Integer.valueOf(init), "Failed to initialize CSPConfig"));
                }
                cdf.a();
            }
            System.setProperty(TLSSettings.TLS_PROHIBIT_DISABLED_VALIDATION_PREF_NAME, String.valueOf(true));
            System.setProperty("com.sun.security.enableCRLDP", String.valueOf(true));
            System.setProperty("com.ibm.security.enableCRLDP", String.valueOf(true));
            TLSSettings.setDefaultEnableRevocation(true);
        } catch (Exception e) {
            throw new InitializationSecurityEbsException(e);
        }
    }

    @Override // defpackage.pd90
    public Object f(lfx lfxVar, ArrayList arrayList) {
        Object failure;
        Object putIfAbsent;
        ConcurrentHashMap concurrentHashMap = (ConcurrentHashMap) this.b;
        Class a = ((zzb) lfxVar).a();
        Object obj = concurrentHashMap.get(a);
        if (obj == null && (putIfAbsent = concurrentHashMap.putIfAbsent(a, (obj = new od90()))) != null) {
            obj = putIfAbsent;
        }
        od90 od90Var = (od90) obj;
        ArrayList arrayList2 = new ArrayList(tcc.n(arrayList, 10));
        Iterator it = arrayList.iterator();
        while (it.hasNext()) {
            arrayList2.add(new pgx((mgx) it.next()));
        }
        ConcurrentHashMap concurrentHashMap2 = od90Var.a;
        Object obj2 = concurrentHashMap2.get(arrayList2);
        if (obj2 == null) {
            try {
                failure = (KSerializer) ((wls) this.a).invoke(lfxVar, arrayList);
            } catch (Throwable th) {
                failure = new Result.Failure(th);
            }
            Result result = new Result(failure);
            Object putIfAbsent2 = concurrentHashMap2.putIfAbsent(arrayList2, result);
            obj2 = putIfAbsent2 == null ? result : putIfAbsent2;
        }
        return ((Result) obj2).getValue();
    }

    @Override // defpackage.h3v0
    public Task g(Object obj) {
        Boolean bool = (Boolean) obj;
        a aVar = (a) this.b;
        if (bool.booleanValue()) {
            Log.isLoggable("FirebaseCrashlytics", 3);
            boolean booleanValue = bool.booleanValue();
            uo2 uo2Var = aVar.b;
            if (booleanValue) {
                ((atx0) uo2Var.z).c(null);
                return ((Task) this.a).q(aVar.e.a, new yfa(this));
            }
            uo2Var.getClass();
            ny61.r("An invalid data collection token was used.");
            return null;
        }
        Log.isLoggable("FirebaseCrashlytics", 2);
        q1r q1rVar = aVar.g;
        Iterator it = q1r.f(q1rVar.c.listFiles(a.s)).iterator();
        while (it.hasNext()) {
            ((File) it.next()).delete();
        }
        q1r q1rVar2 = aVar.m.b.b;
        g3f.a(q1r.f(q1rVar2.e.listFiles()));
        g3f.a(q1r.f(q1rVar2.f.listFiles()));
        g3f.a(q1r.f(q1rVar2.g.listFiles()));
        aVar.q.c(null);
        return udq0.p(null);
    }

    public boolean h(String str) {
        String c;
        as21 as21Var = (as21) this.a;
        return jl40.l(as21Var.c("LAST_KNOWN_SUPPORT_MODE"), "web_view_with_messenger") && (c = as21Var.c("LAST_KNOWN_SUPPORT_URL")) != null && c.length() > 0 && ((spc) this.b).a(str);
    }

    /* JADX WARN: Code restructure failed: missing block: B:68:0x0226, code lost:
    
        if (((r5 != null ? r5.c : null) instanceof defpackage.nn) == false) goto L68;
     */
    /* JADX WARN: Removed duplicated region for block: B:13:0x000f A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:73:0x0230  */
    /* JADX WARN: Removed duplicated region for block: B:9:0x039b A[SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public ArrayList i(List list, boolean z, boolean z2, boolean z3, int i, Map map) {
        mtb mtbVar;
        mtb mtbVar2;
        mtb mtbVar3;
        boolean z4;
        ArrayList arrayList = new ArrayList();
        Iterator it = list.iterator();
        while (it.hasNext()) {
            nr nrVar = (nr) it.next();
            l7x0 l7x0Var = (l7x0) this.a;
            if (nrVar instanceof zn) {
                String str = ((zn) nrVar).a;
                mtbVar = new mtb(str, null, null, Integer.valueOf(vzg0.ic_tracking_call), str, null, null, !z, z, new ktb(nrVar), 486);
            } else if (nrVar instanceof kn) {
                String str2 = ((kn) nrVar).a;
                mtbVar = new mtb(str2, null, null, Integer.valueOf(vzg0.ic_tracking_order_cancel), str2, null, null, !z2, false, new ktb(nrVar), 1510);
            } else if (nrVar instanceof mn) {
                String str3 = ((mn) nrVar).a;
                mtbVar = new mtb(str3, null, null, Integer.valueOf(vzg0.ic_tracking_order_cancel), str3, null, null, !z2, false, new ktb(nrVar), 1510);
            } else if (nrVar instanceof qn) {
                String str4 = ((qn) nrVar).a;
                mtbVar = new mtb(str4, null, null, Integer.valueOf(vzg0.ic_tracking_order_cancel), str4, null, null, !z2, false, new ktb(nrVar), 1510);
            } else if (nrVar instanceof eo) {
                String str5 = ((eo) nrVar).a;
                mtbVar = new mtb(str5, null, null, Integer.valueOf(vzg0.ic_tracking_basket), str5, null, null, false, false, new ktb(nrVar), 2022);
            } else {
                if (nrVar instanceof go) {
                    go goVar = (go) nrVar;
                    String str6 = goVar.c;
                    mtbVar2 = new mtb(goVar.a, null, str6 != null ? l7x0Var.a(str6) : null, Integer.valueOf(vzg0.ic_tracking_support), goVar.a, null, null, false, false, new ktb(nrVar), 2018);
                } else if (nrVar instanceof bo) {
                    String str7 = ((bo) nrVar).a;
                    mtbVar = new mtb(str7, null, null, Integer.valueOf(vzg0.ic_tracking_order_share), str7, null, null, false, false, new ktb(nrVar), 2022);
                } else if (nrVar instanceof yn) {
                    String str8 = ((yn) nrVar).a;
                    mtbVar = new mtb(str8, null, null, Integer.valueOf(vzg0.ic_tracking_plus), str8, null, null, false, false, new ktb(nrVar), 2022);
                } else if (nrVar instanceof xn) {
                    xn xnVar = (xn) nrVar;
                    mtbVar2 = new mtb(xnVar.a, null, l7x0Var.a(xnVar.d), null, xnVar.a, null, null, false, false, new ktb(nrVar), 2026);
                } else if (nrVar instanceof un) {
                    un unVar = (un) nrVar;
                    ((i) this.b).getClass();
                    String str9 = unVar.c;
                    String a = str9 != null ? l7x0Var.a(str9) : null;
                    String str10 = unVar.a;
                    int i2 = vzg0.ic_tracking_open_chat;
                    Integer valueOf = Integer.valueOf(i);
                    if (i <= 0) {
                        valueOf = null;
                    }
                    mtbVar2 = new mtb(str10, valueOf != null ? String.valueOf(valueOf.intValue()) : null, a, Integer.valueOf(i2), str10, new ldc(dl51.t), new ldc(dl51.a), false, false, new ktb(unVar), 1632);
                } else {
                    if (nrVar instanceof nn) {
                        nn nnVar = (nn) nrVar;
                        String str11 = nnVar.a;
                        mtbVar3 = new mtb(str11, nnVar.b, null, Integer.valueOf(vzg0.ic_tracking_change_date), str11, new ldc(dl51.t), new ldc(dl51.a), !z3, z3, new ktb(nnVar), 100);
                    } else if (nrVar instanceof pn) {
                        pn pnVar = (pn) nrVar;
                        if (z3) {
                            jw40 jw40Var = pnVar.d;
                            if (!(jw40Var.c.c instanceof nn)) {
                                kw40 kw40Var = jw40Var.d;
                            }
                            z4 = false;
                            String str12 = pnVar.c;
                            String a2 = str12 != null ? l7x0Var.a(str12) : null;
                            String str13 = pnVar.a;
                            mtbVar = new mtb(str13, pnVar.b, a2, null, str13, new ldc(dl51.t), new ldc(dl51.a), z4, z3, new ktb(pnVar), 104);
                        }
                        z4 = true;
                        String str122 = pnVar.c;
                        String a22 = str122 != null ? l7x0Var.a(str122) : null;
                        String str132 = pnVar.a;
                        mtbVar = new mtb(str132, pnVar.b, a22, null, str132, new ldc(dl51.t), new ldc(dl51.a), z4, z3, new ktb(pnVar), 104);
                    } else if (nrVar instanceof rn) {
                        rn rnVar = (rn) nrVar;
                        String str14 = rnVar.a;
                        String str15 = rnVar.b;
                        String str16 = rnVar.c;
                        mtbVar = new mtb(str14, str15, str16 != null ? l7x0Var.a(str16) : null, Integer.valueOf(vzg0.ic_tracking_edit), rnVar.a, new ldc(dl51.t), new ldc(dl51.a), !z3, z3, new ktb(rnVar), 96);
                    } else {
                        mtbVar = null;
                        if (nrVar instanceof sn) {
                            sn snVar = (sn) nrVar;
                            String str17 = snVar.a;
                            mtbVar3 = new mtb(str17, snVar.b, null, Integer.valueOf(vzg0.ic_extend_expiration_date), str17, new ldc(dl51.t), new ldc(dl51.a), false, false, new ktb(snVar), 1636);
                        } else if (nrVar instanceof on) {
                            on onVar = (on) nrVar;
                            String str18 = onVar.b;
                            String str19 = onVar.d;
                            mtbVar2 = new mtb(str18, onVar.c, str19 != null ? l7x0Var.a(str19) : null, null, onVar.b, new ldc(dl51.t), new ldc(dl51.a), false, false, new ktb(nrVar), 1640);
                        } else {
                            if (nrVar instanceof vn) {
                                vn vnVar = (vn) nrVar;
                                String str20 = vnVar.g;
                                c3s c3sVar = (c3s) map.get(vnVar.e);
                                boolean z5 = (c3sVar == null || (c3sVar instanceof a3s)) ? false : true;
                                String str21 = str20 == null ? "" : str20;
                                String str22 = vnVar.j;
                                mtbVar = new mtb(str21, vnVar.h, str22 != null ? l7x0Var.a(str22) : null, null, str20 == null ? "" : str20, new ldc(dl51.t), new ldc(dl51.a), !z5, z5, new ktb(nrVar), 104);
                            } else if (!(nrVar instanceof fo) && !(nrVar instanceof ho) && !(nrVar instanceof tn) && !(nrVar instanceof ln) && !(nrVar instanceof wn) && !(nrVar instanceof ao) && !(nrVar instanceof co) && !(nrVar instanceof cx) && !jl40.l(nrVar, cr.a)) {
                                w511.b();
                                return null;
                            }
                            if (mtbVar == null) {
                                arrayList.add(mtbVar);
                            }
                        }
                    }
                    mtbVar = mtbVar3;
                    if (mtbVar == null) {
                    }
                }
                mtbVar = mtbVar2;
                if (mtbVar == null) {
                }
            }
            if (mtbVar == null) {
            }
        }
        return arrayList;
    }

    public void j(f030 f030Var, ButtonType buttonType, sls slsVar, sls slsVar2, sls slsVar3, sls slsVar4) {
        czh create = ((gzh) this.a).create();
        yfa yfaVar = (yfa) this.b;
        v3e v3eVar = new v3e(f030Var);
        y3e y3eVar = new y3e(slsVar3, slsVar, create, slsVar2);
        v920 v920Var = (v920) yfaVar.a;
        v920Var.getClass();
        qcp0 qcp0Var = (qcp0) v920Var.b;
        q5z.h(qcp0Var);
        Context context = (Context) v920Var.a;
        q5z.h(context);
        hwy0 hwy0Var = (hwy0) v920Var.c;
        q5z.h(hwy0Var);
        l7x0 l7x0Var = (l7x0) v920Var.w;
        q5z.h(l7x0Var);
        q8s q8sVar = (q8s) v920Var.y;
        q5z.h(q8sVar);
        e eVar = new e(v3eVar, y3eVar, hwy0Var, new c(q8sVar, l7x0Var));
        dci dciVar = (dci) v920Var.x;
        q5z.h(dciVar);
        czh.a(create, new izh(new w3e(qcp0Var, new an8(context, eVar, hwy0Var, dciVar, 23), v3eVar, y3eVar), buttonType, null, null, new z3e(slsVar4), null, 7674));
    }

    public void k(boolean z) {
        AppAnalyticsReporter appAnalyticsReporter = (AppAnalyticsReporter) this.b;
        int i = s6f.a[((PinScenario) this.a).ordinal()];
        if (i == 1) {
            em3 em3Var = appAnalyticsReporter.S;
            PinEvents$SetupPinCheckPinTokenResult pinEvents$SetupPinCheckPinTokenResult = z ? PinEvents$SetupPinCheckPinTokenResult.OK : PinEvents$SetupPinCheckPinTokenResult.ERROR;
            LinkedHashMap linkedHashMap = new LinkedHashMap(1);
            linkedHashMap.put(TarifficatorScenarioActivity.RESULT_KEY, pinEvents$SetupPinCheckPinTokenResult.getOriginalValue());
            em3Var.a.a("setup_pin.check_pin_token", linkedHashMap);
            return;
        }
        if (i == 2) {
            em3 em3Var2 = appAnalyticsReporter.S;
            PinEvents$ForgotPinCheckPinTokenResult pinEvents$ForgotPinCheckPinTokenResult = z ? PinEvents$ForgotPinCheckPinTokenResult.OK : PinEvents$ForgotPinCheckPinTokenResult.ERROR;
            LinkedHashMap linkedHashMap2 = new LinkedHashMap(1);
            linkedHashMap2.put(TarifficatorScenarioActivity.RESULT_KEY, pinEvents$ForgotPinCheckPinTokenResult.getOriginalValue());
            em3Var2.a.a("forgot_pin.check_pin_token", linkedHashMap2);
            return;
        }
        if (i == 3) {
            em3 em3Var3 = appAnalyticsReporter.S;
            PinEvents$ReissuePinCheckPinTokenResult pinEvents$ReissuePinCheckPinTokenResult = z ? PinEvents$ReissuePinCheckPinTokenResult.OK : PinEvents$ReissuePinCheckPinTokenResult.ERROR;
            LinkedHashMap linkedHashMap3 = new LinkedHashMap(1);
            linkedHashMap3.put(TarifficatorScenarioActivity.RESULT_KEY, pinEvents$ReissuePinCheckPinTokenResult.getOriginalValue());
            em3Var3.a.a("reissue_pin.check_pin_token", linkedHashMap3);
            return;
        }
        if (i != 4) {
            return;
        }
        em3 em3Var4 = appAnalyticsReporter.S;
        PinEvents$ChangePinCheckPinTokenFromNewCodeResult pinEvents$ChangePinCheckPinTokenFromNewCodeResult = z ? PinEvents$ChangePinCheckPinTokenFromNewCodeResult.OK : PinEvents$ChangePinCheckPinTokenFromNewCodeResult.ERROR;
        LinkedHashMap linkedHashMap4 = new LinkedHashMap(1);
        linkedHashMap4.put(TarifficatorScenarioActivity.RESULT_KEY, pinEvents$ChangePinCheckPinTokenFromNewCodeResult.getOriginalValue());
        em3Var4.a.a("change_pin.check_pin_token_from_new_code", linkedHashMap4);
    }

    public void l() {
        AppAnalyticsReporter appAnalyticsReporter = (AppAnalyticsReporter) this.b;
        int i = s6f.a[((PinScenario) this.a).ordinal()];
        if (i == 1) {
            appAnalyticsReporter.S.a.a("setup_pin.start", null);
        } else if (i == 2) {
            appAnalyticsReporter.S.a.a("forgot_pin.start", null);
        } else {
            if (i != 3) {
                return;
            }
            appAnalyticsReporter.S.a.a("reissue_pin.start_reissue", null);
        }
    }

    public void m() {
        AppAnalyticsReporter appAnalyticsReporter = (AppAnalyticsReporter) this.b;
        int i = s6f.a[((PinScenario) this.a).ordinal()];
        if (i == 1) {
            appAnalyticsReporter.S.a.a("setup_pin.show_2fa", null);
        } else if (i == 2) {
            appAnalyticsReporter.S.a.a("forgot_pin.show_2fa", null);
        } else {
            if (i != 3) {
                return;
            }
            appAnalyticsReporter.S.a.a("reissue_pin.show_2fa", null);
        }
    }

    public void n() {
        AppAnalyticsReporter appAnalyticsReporter = (AppAnalyticsReporter) this.b;
        int i = s6f.a[((PinScenario) this.a).ordinal()];
        if (i == 1) {
            appAnalyticsReporter.S.a.a("setup_pin.show_create_code", null);
            return;
        }
        if (i == 2) {
            appAnalyticsReporter.S.a.a("forgot_pin.show_create_code", null);
        } else if (i == 3) {
            appAnalyticsReporter.S.a.a("reissue_pin.show_create_code", null);
        } else {
            if (i != 4) {
                return;
            }
            appAnalyticsReporter.S.a.a("change_pin.show_create_code", null);
        }
    }

    public void o(String str) {
        vbb vbbVar = (vbb) this.b;
        try {
            Properties properties = new Properties();
            Context context = ((me0) ((u3v) vbbVar.b)).a;
            InputStream openRawResource = context.getResources().openRawResource(context.getResources().getIdentifier(str, "raw", context.getPackageName()));
            try {
                properties.load(openRawResource);
                openRawResource.close();
                ZipFile zipFile = new ZipFile(((Context) vbbVar.a).getPackageCodePath());
                List s = b.s(b.i(new yw01(kotlin.sequences.a.b(new ucc(zipFile.entries())), new f89(new Regex("classes([]0-9]*)\\.dex"), properties, zipFile, vbbVar))));
                ArrayList arrayList = new ArrayList();
                for (Object obj : s) {
                    if (!((Boolean) ((Triple) obj).g()).booleanValue()) {
                        arrayList.add(obj);
                    }
                }
                if (arrayList.isEmpty()) {
                    return;
                }
                throw new VerifySecurityEbsException("App integrity check failed, files: [" + kotlin.collections.a.X(arrayList, null, null, null, new a5f(4), 31) + "]");
            } finally {
            }
        } catch (Exception e) {
            if (!(e instanceof VerifySecurityEbsException)) {
                throw new VerifySecurityEbsException(e);
            }
            throw e;
        }
    }

    @Override // defpackage.fev
    public void onCancel(hev hevVar) {
    }

    @Override // defpackage.fev
    public void onError(hev hevVar, n9o n9oVar) {
        ((btk) this.a).c();
    }

    @Override // defpackage.fev
    public void onStart(hev hevVar) {
    }

    @Override // defpackage.fev
    public void onSuccess(hev hevVar, u3v0 u3v0Var) {
        BitmapSource bitmapSource;
        btk btkVar = (btk) this.a;
        Bitmap bitmap = ((BitmapDrawable) u3v0Var.a).getBitmap();
        Uri uri = (Uri) this.b;
        int i = lac.a[u3v0Var.c.ordinal()];
        if (i == 1) {
            bitmapSource = BitmapSource.MEMORY;
        } else if (i == 2) {
            bitmapSource = BitmapSource.MEMORY;
        } else if (i == 3) {
            bitmapSource = BitmapSource.DISK;
        } else {
            if (i != 4) {
                w511.b();
                return;
            }
            bitmapSource = BitmapSource.NETWORK;
        }
        btkVar.g(new bd7(bitmap, null, uri, bitmapSource));
    }

    public void p() {
        try {
            if (!CSPConfigBase.isInitiated()) {
                throw new VerifySecurityEbsException("CSPConfig is not initialized");
            }
            int check = CSPConfigBase.getCSPProviderInfo().getIntegrity().check(true);
            if (check == 0) {
                return;
            }
            throw new VerifySecurityEbsException("Core integrity check failed with state " + check);
        } catch (Exception e) {
            if (!(e instanceof VerifySecurityEbsException)) {
                throw new VerifySecurityEbsException(e);
            }
            throw e;
        }
    }

    @Override // com.yandex.mapkit.navigation.transport.layer.RequestPointStyleProvider
    public void provideIconsStyle(int i, int i2, RequestPointType requestPointType, String str, float f, boolean z, boolean z2, PlacemarkStyle placemarkStyle) {
        RequestPointStyleData requestPointStyleData = (RequestPointStyleData) this.b;
        if (requestPointStyleData == null) {
            return;
        }
        requestPointStyleData.a((ssr) this.a, i, i2, f, z, z2, placemarkStyle);
    }

    @Override // defpackage.kab
    public void v(r3z r3zVar) {
        ((oab) this.a).b((Message) this.b);
    }

    public /* synthetic */ p1b(Object obj, Object obj2) {
        this.a = obj;
        this.b = obj2;
    }

    public /* synthetic */ p1b(Object obj, Object obj2, boolean z) {
        this.b = obj;
        this.a = obj2;
    }

    public p1b(cdf cdfVar, adf adfVar, ycf ycfVar, ddf ddfVar, vbb vbbVar) {
        this.a = ddfVar;
        this.b = vbbVar;
    }

    public p1b(o61 o61Var) {
        this.a = o61Var;
        this.b = "";
    }

    public p1b(n5t0 n5t0Var, o1b0 o1b0Var, i720 i720Var) {
        this.a = o1b0Var;
        this.b = i720Var;
    }

    public p1b(wls wlsVar) {
        this.a = wlsVar;
        this.b = new ConcurrentHashMap();
    }

    public /* synthetic */ p1b(Object obj) {
        this.a = obj;
    }
}
