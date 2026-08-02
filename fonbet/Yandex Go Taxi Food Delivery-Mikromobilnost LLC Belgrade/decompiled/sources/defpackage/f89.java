package defpackage;

import android.app.RemoteAction;
import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.drawable.BitmapDrawable;
import android.graphics.drawable.Drawable;
import android.os.Build;
import android.view.View;
import android.view.textclassifier.TextClassification;
import androidx.compose.foundation.gestures.Orientation;
import androidx.compose.foundation.gestures.b0;
import androidx.compose.foundation.gestures.f;
import androidx.compose.foundation.gestures.y;
import androidx.compose.runtime.internal.a;
import androidx.compose.runtime.snapshots.SnapshotStateList;
import androidx.compose.ui.layout.k;
import androidx.compose.ui.layout.o;
import androidx.compose.ui.unit.LayoutDirection;
import com.adjust.sdk.Constants;
import com.yandex.go.chargers.passes.ui.b;
import com.yandex.go.chargers.station.presentation.details.components.ChargersStationAboutLocationView;
import com.yandex.go.charity.models.OpenCharitySource;
import com.yandex.go.design.view.GoImageView;
import com.yandex.go.places.impl.ui.common.chip.ChipView;
import com.yandex.messaging.internal.LocalMessageRef;
import com.yandex.messaging.internal.ServerMessageRef;
import com.yandex.payment.divkit.challenger.DKChallengerFragment;
import com.yandex.plus.core.config.Environment;
import com.yandex.plus.core.debug.panel.api.data.DebugPanelInfoItem$DebugPanelGeneralInfo$FieldKey;
import com.yandex.plus.core.debug.panel.internal.presentation.view.DebugPanelContainer;
import com.ybsdk.feature.webview.internal.browser.LaunchBrowserActivity;
import com.ybsdk.screens.registration.codeconfirmation.presentation.CodeConfirmationFragment;
import defpackage.ika;
import defpackage.ila;
import defpackage.tje;
import defpackage.uv6;
import defpackage.xob;
import defpackage.zy11;
import flex.section.divkit.DivkitSnippet;
import java.security.DigestInputStream;
import java.security.MessageDigest;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Map;
import java.util.Properties;
import java.util.Set;
import java.util.concurrent.CountDownLatch;
import java.util.concurrent.atomic.AtomicBoolean;
import java.util.concurrent.atomic.AtomicReference;
import java.util.zip.ZipEntry;
import java.util.zip.ZipFile;
import kotlin.Triple;
import kotlin.collections.EmptyList;
import kotlin.collections.builders.MapBuilder;
import kotlin.jvm.internal.Ref$BooleanRef;
import kotlin.jvm.internal.Ref$ObjectRef;
import kotlin.text.Regex;
import kotlinx.coroutines.flow.e;
import kotlinx.coroutines.flow.r0;
import ru.CryptoPro.JCP.ASN.Gost_CryptoPro_PrivateKey._Gost_CryptoPro_PrivateKeyValues;
import ru.CryptoPro.JCP.JCP;
import ru.cprocsp.ACSP.tools.common.HexString;
import ru.yandex.taxi.gopayments.model.PaymentMethod$Type;
import ru.yandex.taxi.requirements.interactor.e0;

/* loaded from: classes11.dex */
public final /* synthetic */ class f89 implements tls {
    public final /* synthetic */ int a;
    public final /* synthetic */ Object b;
    public final /* synthetic */ Object c;
    public final /* synthetic */ Object w;

    public /* synthetic */ f89(rqm rqmVar, sls slsVar, String str) {
        this.a = 28;
        this.b = rqmVar;
        this.w = slsVar;
        this.c = str;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r2v72, types: [kotlin.collections.EmptyList] */
    /* JADX WARN: Type inference failed for: r2v73, types: [java.util.List] */
    /* JADX WARN: Type inference failed for: r2v74, types: [java.util.ArrayList] */
    @Override // defpackage.tls
    public final Object invoke(Object obj) {
        boolean z;
        zy11 bindPhoto$lambda$0;
        zy11 render$lambda$17;
        float f;
        i28 i28Var;
        zy11 onViewCreated$lambda$0;
        zy11 showDialog$lambda$2;
        String str;
        String str2;
        String str3;
        Drawable bitmapDrawable;
        String str4;
        ?? r2;
        int i = this.a;
        int i2 = 4;
        int i3 = 3;
        int i4 = 6;
        boolean z2 = false;
        r11 = false;
        boolean z3 = false;
        z2 = false;
        zy11 zy11Var = zy11.a;
        Object obj2 = this.w;
        Object obj3 = this.c;
        Object obj4 = this.b;
        switch (i) {
            case 0:
                String str5 = (String) obj3;
                Ref$BooleanRef ref$BooleanRef = (Ref$BooleanRef) obj2;
                g89 g89Var = (g89) obj;
                ((j89) obj4).getClass();
                if (!jl40.l(g89Var.a.b.getA(), str5)) {
                    pyp0 pyp0Var = g89Var.a.b;
                    if (pyp0Var instanceof cvl) {
                        List list = ((cvl) pyp0Var).c;
                        if (!(list instanceof Collection) || !list.isEmpty()) {
                            Iterator it = list.iterator();
                            while (it.hasNext()) {
                                if (jl40.l(((DivkitSnippet) it.next()).a, str5)) {
                                }
                            }
                        }
                    }
                    z = false;
                    if (!ref$BooleanRef.element || (z && !g89Var.b.b)) {
                        z2 = true;
                    }
                    ref$BooleanRef.element = z2;
                    return Boolean.valueOf(z2);
                }
                z = true;
                if (!ref$BooleanRef.element) {
                }
                z2 = true;
                ref$BooleanRef.element = z2;
                return Boolean.valueOf(z2);
            case 1:
                ((tls) obj4).invoke(new ov9((ru9) obj3, ((Boolean) obj).booleanValue(), (ir9) obj2));
                return zy11Var;
            case 2:
                final ika ikaVar = (ika) obj4;
                final b bVar = (b) obj3;
                yfd yfdVar = (yfd) obj;
                final hka hkaVar = new hka(ikaVar);
                ((agd) yfdVar).e = new tls() { // from class: com.yandex.go.chargers.passes.b
                    @Override // defpackage.tls
                    public final Object invoke(Object obj5) {
                        tje.N(ika.this.o(), null, null, new ChargersPassesRouterImpl$content$1$1$1(bVar, (ila) obj5, hkaVar, null), 3);
                        return zy11.a;
                    }
                };
                ((agd) yfdVar).g = new a(869744664, new l0(10, (tla) obj2, ikaVar), true);
                return zy11Var;
            case 3:
                bindPhoto$lambda$0 = ChargersStationAboutLocationView.bindPhoto$lambda$0((GoImageView) obj4, (cqa) obj3, (ChargersStationAboutLocationView) obj2, (Drawable) obj);
                return bindPhoto$lambda$0;
            case 4:
                com.yandex.go.charity.a aVar = (com.yandex.go.charity.a) obj4;
                Map map = (Map) obj3;
                OpenCharitySource openCharitySource = (OpenCharitySource) obj2;
                String str6 = (String) obj;
                if (str6.length() > 0) {
                    aVar.P(aVar.D.a(openCharitySource, str6, "", map));
                }
                return zy11Var;
            case 5:
                kab kabVar = (kab) obj2;
                r3z c = ((oab) obj4).x.c((ServerMessageRef) obj3);
                if (c != null) {
                    kabVar.v(c);
                }
                return zy11Var;
            case 6:
                s2r s2rVar = (s2r) obj2;
                r3z b = ((oab) obj4).x.b((LocalMessageRef) obj3);
                if (b != null) {
                    s2rVar.v(b);
                }
                return zy11Var;
            case 7:
                final uv6 uv6Var = (uv6) obj4;
                sk7 sk7Var = (sk7) obj3;
                final yob yobVar = (yob) obj2;
                final yfd yfdVar2 = (yfd) obj;
                final job jobVar = new job(uv6Var, (iob) ((agd) yfdVar2).a);
                agd agdVar = (agd) yfdVar2;
                iob iobVar = (iob) agdVar.a;
                tpr t = e.t(new com.yandex.go.requirements.ui.selector.compound.child.b(e0.b((e0) sk7Var.c, iobVar.a), sk7Var, iobVar));
                ((tt2) sk7Var.b).getClass();
                agdVar.c = e.F(t, uyj.a);
                agdVar.e = new tls() { // from class: com.yandex.go.requirements.navigation.selector.compound.child.a
                    @Override // defpackage.tls
                    public final Object invoke(Object obj5) {
                        tje.N(uv6.this.o(), null, null, new ChildCompoundOptionSelectRouter$content$1$1$1(yobVar, (xob) obj5, jobVar, yfdVar2, null), 3);
                        return zy11.a;
                    }
                };
                q5d.a.getClass();
                agdVar.g = q5d.b;
                return zy11Var;
            case 8:
                return new com.yandex.go.places.impl.ui.organizations.chips.viewholders.a((ChipView) obj, (pav) obj4, (tt2) obj3, (tls) obj2);
            case 9:
                render$lambda$17 = CodeConfirmationFragment.render$lambda$17((CodeConfirmationFragment) obj4, (v9c) obj3, (p661) obj2, ((Character) obj).charValue());
                return render$lambda$17;
            case 10:
                View view = (View) obj4;
                qhd qhdVar = new qhd(view, (int[]) obj3, (oz40) obj2, z2 ? 1 : 0);
                view.getViewTreeObserver().addOnPreDrawListener(qhdVar);
                return new te4(4, view, qhdVar);
            case 11:
                s9e s9eVar = (s9e) obj;
                ((z5s) ((boj0) obj4).y).a((c0k0) obj3, new x41(s9eVar));
                ((tls) obj2).invoke(s9eVar);
                return zy11Var;
            case 12:
                f fVar = (f) obj4;
                l8x l8xVar = (l8x) obj3;
                clp0 clp0Var = (clp0) obj2;
                float floatValue = ((Float) obj).floatValue();
                f = fVar.c ? 1.0f : -1.0f;
                y yVar = fVar.b;
                long e = yVar.e(yVar.h(f * floatValue));
                y yVar2 = clp0Var.a;
                float g = yVar.g(yVar.e(yVar2.c(yVar2.k, e, 1))) * f;
                if (Math.abs(g) < Math.abs(floatValue)) {
                    l8xVar.a(uh6.b("Scroll animation cancelled because scroll was not consumed (" + g + " < " + floatValue + ')', null));
                }
                return zy11Var;
            case 13:
                oay oayVar = (oay) obj4;
                hoy0 hoy0Var = (hoy0) obj3;
                iv60 iv60Var = (iv60) obj2;
                qam qamVar = (qam) obj;
                ery0 d = oayVar.d();
                if (d != null) {
                    i28 q = qamVar.N().q();
                    long j = ((asy0) oayVar.A.getValue()).a;
                    long j2 = ((asy0) oayVar.B.getValue()).a;
                    dry0 dry0Var = d.a;
                    eb2 eb2Var = oayVar.y;
                    long j3 = oayVar.z;
                    if (!asy0.c(j)) {
                        eb2Var.f(j3);
                        int r = iv60Var.r(asy0.f(j));
                        int r3 = iv60Var.r(asy0.e(j));
                        if (r != r3) {
                            q.p(dry0Var.m(r, r3), eb2Var);
                        }
                    } else if (!asy0.c(j2)) {
                        long b2 = dry0Var.a.b.b();
                        ldc ldcVar = b2 == 16 ? null : new ldc(b2);
                        long j4 = ldcVar != null ? ldcVar.a : ldc.b;
                        eb2Var.f(ldc.b(j4, ldc.d(j4) * 0.2f, 0.0f, 0.0f, 0.0f, 14));
                        int r4 = iv60Var.r(asy0.f(j2));
                        int r5 = iv60Var.r(asy0.e(j2));
                        if (r4 != r5) {
                            q.p(dry0Var.m(r4, r5), eb2Var);
                        }
                    } else if (!asy0.c(hoy0Var.b)) {
                        eb2Var.f(j3);
                        long j5 = hoy0Var.b;
                        int r6 = iv60Var.r(asy0.f(j5));
                        int r7 = iv60Var.r(asy0.e(j5));
                        if (r6 != r7) {
                            q.p(dry0Var.m(r6, r7), eb2Var);
                        }
                    }
                    boolean f2 = dry0Var.f();
                    hm40 hm40Var = dry0Var.b;
                    cry0 cry0Var = dry0Var.a;
                    if (f2 && cry0Var.f != 3) {
                        z3 = true;
                    }
                    if (z3) {
                        long j6 = dry0Var.c;
                        zii0 b3 = wwg.b(0L, (Float.floatToRawIntBits((int) (j6 >> 32)) << 32) | (Float.floatToRawIntBits((int) (j6 & _Gost_CryptoPro_PrivateKeyValues.maxDWORD)) & _Gost_CryptoPro_PrivateKeyValues.maxDWORD));
                        q.save();
                        i28.g(q, b3);
                    }
                    bmt0 bmt0Var = cry0Var.b.a;
                    rly0 rly0Var = bmt0Var.m;
                    moy0 moy0Var = bmt0Var.a;
                    if (rly0Var == null) {
                        rly0Var = rly0.b;
                    }
                    rly0 rly0Var2 = rly0Var;
                    bgr0 bgr0Var = bmt0Var.n;
                    if (bgr0Var == null) {
                        bgr0Var = bgr0.d;
                    }
                    bgr0 bgr0Var2 = bgr0Var;
                    ram ramVar = bmt0Var.p;
                    if (ramVar == null) {
                        ramVar = i3r.a;
                    }
                    ram ramVar2 = ramVar;
                    try {
                        ml6 c2 = moy0Var.c();
                        loy0 loy0Var = loy0.a;
                        try {
                            if (c2 != null) {
                                i28Var = q;
                                hm40Var.j(i28Var, c2, moy0Var != loy0Var ? moy0Var.a() : 1.0f, bgr0Var2, rly0Var2, ramVar2);
                            } else {
                                i28Var = q;
                                hm40Var.i(i28Var, moy0Var != loy0Var ? moy0Var.b() : ldc.b, bgr0Var2, rly0Var2, ramVar2);
                            }
                            if (z3) {
                                i28Var.n();
                            }
                        } catch (Throwable th) {
                            th = th;
                            if (z3) {
                                q.n();
                            }
                            throw th;
                        }
                    } catch (Throwable th2) {
                        th = th2;
                    }
                }
                return zy11Var;
            case 14:
                Properties properties = (Properties) obj3;
                ZipFile zipFile = (ZipFile) obj2;
                ZipEntry zipEntry = (ZipEntry) obj;
                if (!((Regex) obj4).h(zipEntry.getName())) {
                    return null;
                }
                String property = properties.getProperty(zipEntry.getName());
                DigestInputStream digestInputStream = new DigestInputStream(zipFile.getInputStream(zipEntry), MessageDigest.getInstance(JCP.GOST_DIGEST_2012_256_NAME, "JCSP"));
                rzo.R(digestInputStream);
                byte[] digest = digestInputStream.getMessageDigest().digest();
                digestInputStream.close();
                return new Triple(zipEntry.getName(), Boolean.valueOf(property != null ? property.equals(HexString.toHex(digest)) : false), property == null ? "is null" : "is wrong");
            case 15:
                onViewCreated$lambda$0 = DKChallengerFragment.onViewCreated$lambda$0((Ref$ObjectRef) obj4, (fsf) obj3, (DKChallengerFragment) obj2, (View) obj);
                return onViewCreated$lambda$0;
            case 16:
                showDialog$lambda$2 = DebugPanelContainer.showDialog$lambda$2((tls) obj4, (sls) obj3, (DebugPanelContainer) obj2, (List) obj);
                return showDialog$lambda$2;
            case 17:
                j4n j4nVar = (j4n) obj4;
                vvq0 vvq0Var = (vvq0) obj3;
                u1w u1wVar = (u1w) obj2;
                hs6 hs6Var = (hs6) obj;
                x75 x75Var = (x75) j4nVar.c;
                DebugPanelInfoItem$DebugPanelGeneralInfo$FieldKey debugPanelInfoItem$DebugPanelGeneralInfo$FieldKey = DebugPanelInfoItem$DebugPanelGeneralInfo$FieldKey.USER_ID;
                com.yandex.plus.home.auth.b bVar2 = (com.yandex.plus.home.auth.b) j4nVar.b;
                bVar2.getClass();
                Long id = ((lj) bVar2.a.h.getValue()).getId();
                String str7 = "no_value";
                if (id == null || (str = id.toString()) == null) {
                    str = "no_value";
                }
                qvg qvgVar = new qvg(debugPanelInfoItem$DebugPanelGeneralInfo$FieldKey, str);
                DebugPanelInfoItem$DebugPanelGeneralInfo$FieldKey debugPanelInfoItem$DebugPanelGeneralInfo$FieldKey2 = DebugPanelInfoItem$DebugPanelGeneralInfo$FieldKey.SESSION_ID;
                String a = x75Var.a();
                if (a == null) {
                    a = "no_value";
                }
                qvg qvgVar2 = new qvg(debugPanelInfoItem$DebugPanelGeneralInfo$FieldKey2, a);
                qvg qvgVar3 = new qvg(DebugPanelInfoItem$DebugPanelGeneralInfo$FieldKey.DEVICE_ID, j4n.z());
                qvg qvgVar4 = new qvg(DebugPanelInfoItem$DebugPanelGeneralInfo$FieldKey.DEVICE_MODEL, j4n.z());
                qvg qvgVar5 = new qvg(DebugPanelInfoItem$DebugPanelGeneralInfo$FieldKey.OS_VERSION, Build.VERSION.RELEASE);
                qvg qvgVar6 = new qvg(DebugPanelInfoItem$DebugPanelGeneralInfo$FieldKey.SDK_VERSION, "110.0.2");
                DebugPanelInfoItem$DebugPanelGeneralInfo$FieldKey debugPanelInfoItem$DebugPanelGeneralInfo$FieldKey3 = DebugPanelInfoItem$DebugPanelGeneralInfo$FieldKey.METRICS_UUID;
                String b4 = x75Var.b();
                if (b4 == null) {
                    b4 = "no_value";
                }
                qvg qvgVar7 = new qvg(debugPanelInfoItem$DebugPanelGeneralInfo$FieldKey3, b4);
                qvg qvgVar8 = new qvg(DebugPanelInfoItem$DebugPanelGeneralInfo$FieldKey.ENVIRONMENT, ((Environment) j4nVar.z).name());
                qvg qvgVar9 = new qvg(DebugPanelInfoItem$DebugPanelGeneralInfo$FieldKey.WEB_VIEW_VERSION, "no_value");
                DebugPanelInfoItem$DebugPanelGeneralInfo$FieldKey debugPanelInfoItem$DebugPanelGeneralInfo$FieldKey4 = DebugPanelInfoItem$DebugPanelGeneralInfo$FieldKey.USER_AGENT;
                if (vvq0Var == null || (str2 = vvq0Var.a) == null) {
                    str2 = "no_value";
                }
                qvg qvgVar10 = new qvg(debugPanelInfoItem$DebugPanelGeneralInfo$FieldKey4, str2);
                DebugPanelInfoItem$DebugPanelGeneralInfo$FieldKey debugPanelInfoItem$DebugPanelGeneralInfo$FieldKey5 = DebugPanelInfoItem$DebugPanelGeneralInfo$FieldKey.ERROR_MESSAGE;
                if (vvq0Var != null && (str3 = vvq0Var.b) != null) {
                    str7 = str3;
                }
                hs6Var.a.addAll(scc.g(qvgVar, qvgVar2, qvgVar3, qvgVar4, qvgVar5, qvgVar6, qvgVar7, qvgVar8, qvgVar9, qvgVar10, new qvg(debugPanelInfoItem$DebugPanelGeneralInfo$FieldKey5, str7)));
                hs6Var.c = (r0) j4nVar.w;
                hs6Var.d = u1wVar;
                return zy11Var;
            case 18:
                ((AtomicReference) obj4).set((Throwable) obj);
                ((AtomicBoolean) obj3).set(true);
                ((CountDownLatch) obj2).countDown();
                return zy11Var;
            case 19:
                Context context = (Context) obj3;
                lly0 lly0Var = (lly0) obj2;
                zje zjeVar = (zje) obj;
                List list2 = ((zky0) obj4).a;
                int size = list2.size();
                int i5 = 0;
                while (i5 < size) {
                    yky0 yky0Var = (yky0) list2.get(i5);
                    if (yky0Var instanceof hly0) {
                        hly0 hly0Var = (hly0) yky0Var;
                        zje.b(zjeVar, new tbb(18, hly0Var), hly0Var.c == 0 ? null : new a(-1930700965, new bab(i3, hly0Var), true), new bmh(z2 ? 1 : 0, hly0Var, lly0Var), 6);
                    } else if (yky0Var instanceof mly0) {
                        mly0 mly0Var = (mly0) yky0Var;
                        if (context != null) {
                            int i6 = mly0Var.c;
                            TextClassification textClassification = mly0Var.b;
                            if (i6 < 0) {
                                but0 but0Var = new but0(13, textClassification);
                                Drawable icon = textClassification.getIcon();
                                zje.b(zjeVar, but0Var, icon != null ? new a(-1123224187, new bab(16, icon), true) : null, new i5y0(i2, context, textClassification), 6);
                            } else {
                                RemoteAction remoteAction = textClassification.getActions().get(i6);
                                int i7 = 17;
                                zje.b(zjeVar, new but0(14, remoteAction), ((i6 == 0) || remoteAction.shouldShowIcon()) ? new a(-1261173016, new bab(i7, remoteAction), true) : null, new oew0(i7, remoteAction), 6);
                            }
                        }
                    } else if (yky0Var instanceof kly0) {
                        SnapshotStateList snapshotStateList = zjeVar.b;
                        d6d.a.getClass();
                        snapshotStateList.add(d6d.c);
                    }
                    i5++;
                    i2 = 4;
                    i3 = 3;
                }
                return zy11Var;
            case 20:
                Integer num = (Integer) obj4;
                tls tlsVar = (tls) obj3;
                oz40 oz40Var = (oz40) obj2;
                hoy0 hoy0Var2 = (hoy0) obj;
                kk2 kk2Var = hoy0Var2.a;
                if (num == null) {
                    oz40Var.setValue(hoy0Var2);
                    tlsVar.invoke(kk2Var.b);
                } else if (kk2Var.b.length() <= num.intValue()) {
                    oz40Var.setValue(hoy0Var2);
                    tlsVar.invoke(kk2Var.b);
                }
                return zy11Var;
            case 21:
                ((yx40) obj2).setIntValue((int) ((((fwi) obj4).H((int) (((rzx) obj).e() & _Gost_CryptoPro_PrivateKeyValues.maxDWORD)) - ((y7m) ((oz40) obj3).getValue()).a) / 56.0f));
                return zy11Var;
            case 22:
                yoi yoiVar = (yoi) obj4;
                t0a0 t0a0Var = ((v8a0) obj3).b;
                PaymentMethod$Type paymentMethod$Type = (PaymentMethod$Type) obj2;
                Context context2 = (Context) obj;
                yoiVar.getClass();
                if (paymentMethod$Type == PaymentMethod$Type.CARD || !(paymentMethod$Type != PaymentMethod$Type.YB_WALLET || (str4 = t0a0Var.a) == null || str4.length() == 0)) {
                    tma0 tma0Var = yoiVar.f;
                    String str8 = t0a0Var.a;
                    Bitmap a2 = tma0.a(tma0Var, context2, str8 != null ? str8 : "");
                    bitmapDrawable = a2 != null ? new BitmapDrawable(context2.getResources(), a2) : (Drawable) t0a0Var.b.apply(context2);
                } else {
                    bitmapDrawable = (Drawable) t0a0Var.b.apply(context2);
                }
                if (bitmapDrawable != null) {
                    return bitmapDrawable;
                }
                ny61.g("Required value was null.");
                return null;
            case 23:
                yfj yfjVar = (yfj) obj4;
                tls tlsVar2 = (tls) obj2;
                mnq0 mnq0Var = (mnq0) obj;
                androidx.compose.ui.semantics.f.l(mnq0Var, (String) obj3);
                if (yfjVar != null) {
                    ArrayList arrayList = yfjVar.a;
                    r2 = new ArrayList(arrayList.size());
                    int size2 = arrayList.size();
                    for (int i8 = 0; i8 < size2; i8++) {
                        kfj kfjVar = (kfj) arrayList.get(i8);
                        r2.add(new nif(new pfj(tlsVar2, kfjVar, 1), kfjVar.a.toString()));
                    }
                } else {
                    r2 = EmptyList.a;
                }
                androidx.compose.ui.semantics.f.m(mnq0Var, r2);
                return zy11Var;
            case 24:
                nwj nwjVar = (nwj) obj2;
                w3j0 w3j0Var = (w3j0) obj;
                w3j0Var.d("type", (String) obj3);
                w3j0Var.d("search_query", ((String) obj4).toString());
                MapBuilder mapBuilder = new MapBuilder();
                mapBuilder.put("type", nwjVar.a);
                String str9 = nwjVar.b;
                if (str9 != null) {
                    mapBuilder.put(Constants.DEEPLINK, str9);
                }
                String str10 = nwjVar.c;
                if (str10 != null) {
                    mapBuilder.put("oid", str10);
                }
                String str11 = nwjVar.d;
                if (str11 != null) {
                    mapBuilder.put(LaunchBrowserActivity.KEY_URI, str11);
                }
                String str12 = nwjVar.e;
                if (str12 != null) {
                    mapBuilder.put("query", str12);
                }
                w3j0Var.f("action", mapBuilder.j());
                return zy11Var;
            case 25:
                evl evlVar = (evl) obj4;
                Set set = (Set) obj3;
                b5t0 b5t0Var = (b5t0) obj2;
                DivkitSnippet divkitSnippet = (DivkitSnippet) obj;
                ihu ihuVar = evlVar.k;
                String str13 = evlVar.g.a;
                LinkedHashMap linkedHashMap = ihuVar.a;
                Object obj5 = linkedHashMap.get(str13);
                Object obj6 = obj5;
                if (obj5 == null) {
                    LinkedHashSet linkedHashSet = new LinkedHashSet();
                    linkedHashMap.put(str13, linkedHashSet);
                    obj6 = linkedHashSet;
                }
                Set set2 = (Set) obj6;
                LinkedHashMap linkedHashMap2 = ihuVar.b;
                Object obj7 = linkedHashMap2.get(str13);
                Object obj8 = obj7;
                if (obj7 == null) {
                    LinkedHashSet linkedHashSet2 = new LinkedHashSet();
                    linkedHashMap2.put(str13, linkedHashSet2);
                    obj8 = linkedHashSet2;
                }
                b5t0 b5t0Var2 = new b5t0(set2, (Set) obj8);
                Set a3 = b5t0Var2.a();
                String str14 = divkitSnippet.a;
                String str15 = divkitSnippet.a;
                String str16 = divkitSnippet.h;
                return Boolean.valueOf(!(a3.contains(str14) || kotlin.collections.a.G(b5t0Var2.b(), str16) || !set.contains(str15)) || b5t0Var.a().contains(str15) || kotlin.collections.a.G(b5t0Var.b(), str16));
            case 26:
                dam damVar = (dam) obj3;
                o oVar = (o) obj2;
                o.a aVar2 = (o.a) obj;
                boolean d0 = ((k) obj4).d0();
                androidx.compose.foundation.gestures.e eVar = damVar.a;
                float f3 = d0 ? eVar.d().f(damVar.a.i.getValue()) : eVar.g();
                f = (qje.P(damVar).S == LayoutDirection.Rtl && damVar.c == Orientation.Horizontal) ? -1.0f : 1.0f;
                Orientation orientation = damVar.c;
                float f4 = orientation == Orientation.Horizontal ? f * f3 : 0.0f;
                if (orientation != Orientation.Vertical) {
                    f3 = 0.0f;
                }
                aVar2.a = true;
                aVar2.g(oVar, m810.b(f4), m810.b(f3), 0.0f);
                aVar2.a = false;
                return zy11Var;
            case 27:
                tls tlsVar3 = (tls) obj4;
                hoy0 hoy0Var3 = (hoy0) obj;
                ((oz40) obj2).setValue(hoy0Var3);
                kk2 kk2Var2 = hoy0Var3.a;
                if (!((String) obj3).equals(kk2Var2.b)) {
                    tlsVar3.invoke(kk2Var2.b);
                }
                return zy11Var;
            case 28:
                rqm rqmVar = (rqm) obj4;
                sls slsVar = (sls) obj2;
                String str17 = (String) obj3;
                mnq0 mnq0Var2 = (mnq0) obj;
                if ((rqmVar instanceof mqm) || (rqmVar instanceof pqm) || (rqmVar instanceof qqm)) {
                    androidx.compose.ui.semantics.f.p(mnq0Var2, 1);
                } else if (slsVar == null) {
                    androidx.compose.ui.semantics.f.l(mnq0Var2, str17);
                } else {
                    androidx.compose.ui.semantics.f.p(mnq0Var2, 0);
                    androidx.compose.ui.semantics.f.l(mnq0Var2, str17);
                }
                return zy11Var;
            default:
                o5n o5nVar = (o5n) obj3;
                ((tls) obj4).invoke(o5nVar);
                return new te4(i4, (tls) obj2, o5nVar);
        }
    }

    public /* synthetic */ f89(int i, Object obj, Object obj2, String str) {
        this.a = i;
        this.c = str;
        this.b = obj;
        this.w = obj2;
    }

    public /* synthetic */ f89(int i, Object obj, Object obj2, Object obj3) {
        this.a = i;
        this.b = obj;
        this.c = obj2;
        this.w = obj3;
    }

    public /* synthetic */ f89(f fVar, b0 b0Var, l8x l8xVar, clp0 clp0Var) {
        this.a = 12;
        this.b = fVar;
        this.c = l8xVar;
        this.w = clp0Var;
    }

    public /* synthetic */ f89(Regex regex, Properties properties, ZipFile zipFile, vbb vbbVar) {
        this.a = 14;
        this.b = regex;
        this.c = properties;
        this.w = zipFile;
    }
}
