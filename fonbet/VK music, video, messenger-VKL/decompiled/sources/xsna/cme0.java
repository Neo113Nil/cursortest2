package xsna;

import android.content.Context;
import android.net.Uri;
import android.webkit.URLUtil;
import com.google.android.gms.common.GoogleApiAvailability;
import com.google.zxing.ResultPoint;
import com.google.zxing.client.result.EmailAddressParsedResult;
import com.google.zxing.client.result.ParsedResult;
import com.google.zxing.client.result.ParsedResultType;
import com.google.zxing.client.result.SMSParsedResult;
import com.google.zxing.client.result.URIParsedResult;
import com.mbridge.msdk.playercommon.exoplayer2.C;
import com.vk.log.L;
import com.vk.qrcode.QRStatsTracker;
import com.vk.qrcode.QRTypes$AddressBookQRAction;
import com.vk.qrcode.QRTypes$EmailQrAction;
import com.vk.qrcode.QRTypes$SmsQrAction;
import com.vk.qrcode.QRTypes$SubType;
import com.vk.qrcode.QRTypes$Type;
import com.vkontakte.android.R;
import com.vkontakte.android.data.b;
import io.appmetrica.analytics.coreutils.internal.StringUtils;
import java.net.URLEncoder;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.concurrent.TimeUnit;
import kotlin.text.Regex;
import xsna.ikv0;

/* compiled from: QRParser.kt */
/* loaded from: classes5.dex */
public final class cme0 implements znv {
    public static final long n = TimeUnit.SECONDS.toMillis(3);
    public static final long o = TimeUnit.DAYS.toMillis(1);
    public static final int p = 1500;
    public final Context a;
    public final gzs<Integer> b;
    public final izs<Boolean, s3q0> c;
    public final zzs<ResultPoint[], yne0, Boolean, izs<? super Integer, s3q0>, s3q0> d;
    public boolean e = true;
    public boolean f;
    public boolean g;
    public final boolean h;
    public int i;
    public long j;
    public final HashSet<String> k;
    public String l;
    public final HashMap<String, Long> m;

    /* compiled from: QRParser.kt */
    public static final /* synthetic */ class a {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;

        static {
            int[] iArr = new int[ParsedResultType.values().length];
            try {
                iArr[ParsedResultType.WIFI.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[ParsedResultType.GEO.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[ParsedResultType.ADDRESSBOOK.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                iArr[ParsedResultType.CALENDAR.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                iArr[ParsedResultType.TEXT.ordinal()] = 5;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                iArr[ParsedResultType.TEL.ordinal()] = 6;
            } catch (NoSuchFieldError unused6) {
            }
            try {
                iArr[ParsedResultType.SMS.ordinal()] = 7;
            } catch (NoSuchFieldError unused7) {
            }
            try {
                iArr[ParsedResultType.EMAIL_ADDRESS.ordinal()] = 8;
            } catch (NoSuchFieldError unused8) {
            }
            $EnumSwitchMapping$0 = iArr;
        }
    }

    public cme0(Context context, gzs gzsVar, k170 k170Var, aoe0 aoe0Var) {
        this.a = context;
        this.b = gzsVar;
        this.c = k170Var;
        this.d = aoe0Var;
        this.h = GoogleApiAvailability.getInstance().isGooglePlayServicesAvailable(context) == 0;
        this.k = new HashSet<>();
        this.l = "";
        this.m = new HashMap<>();
    }

    @Override // xsna.znv
    public final void a(ArrayList<rne0> arrayList) {
        e(arrayList, true);
    }

    @Override // xsna.znv
    public final void b() {
        this.g = true;
    }

    @Override // xsna.znv
    public final void c() {
        this.f = true;
    }

    public final boolean d(String str, boolean z) {
        Long l = this.m.get(str);
        if (l == null) {
            return false;
        }
        return z || System.currentTimeMillis() < l.longValue() + n;
    }

    public final void e(ArrayList<rne0> arrayList, boolean z) {
        if (!this.e || arrayList.isEmpty()) {
            return;
        }
        ResultPoint[] resultPointArr = new ResultPoint[arrayList.size() * 4];
        Iterator<rne0> it = arrayList.iterator();
        int i = 0;
        while (it.hasNext()) {
            rne0 next = it.next();
            int i2 = i + 1;
            if (i < 0) {
                e43.t();
                throw null;
            }
            ResultPoint[] resultPointArr2 = next.b;
            int length = resultPointArr2.length;
            int i3 = 0;
            int i4 = 0;
            while (i3 < length) {
                resultPointArr[(i * 4) + i4] = resultPointArr2[i3];
                i3++;
                i4++;
            }
            i = i2;
        }
        rne0 rne0Var = arrayList.get(0);
        zzs<ResultPoint[], yne0, Boolean, izs<? super Integer, s3q0>, s3q0> zzsVar = this.d;
        if (zzsVar != null) {
            zzsVar.invoke(resultPointArr, rne0Var.c, Boolean.valueOf(rne0Var.e), new vi6(arrayList, this, z));
        }
        if (this.h) {
            long currentTimeMillis = System.currentTimeMillis();
            int i5 = this.i;
            boolean z2 = i5 == 0;
            if (i5 != arrayList.size()) {
                this.j = currentTimeMillis;
            }
            this.i = arrayList.size();
            if (currentTimeMillis - this.j < p && !z2) {
                return;
            }
        }
        int size = arrayList.size();
        HashSet<String> hashSet = this.k;
        if (size <= 1) {
            hashSet.clear();
            f(rne0Var, z);
            return;
        }
        Iterator<rne0> it2 = arrayList.iterator();
        boolean z3 = true;
        while (it2.hasNext()) {
            if (!hashSet.contains(it2.next().d)) {
                z3 = false;
            }
        }
        if (z3) {
            return;
        }
        hashSet.clear();
        Iterator<rne0> it3 = arrayList.iterator();
        while (it3.hasNext()) {
            hashSet.add(it3.next().d);
        }
        QRStatsTracker qRStatsTracker = QRStatsTracker.a;
        ArrayList arrayList2 = new ArrayList(c5g.u(arrayList, 10));
        Iterator<rne0> it4 = arrayList.iterator();
        while (it4.hasNext()) {
            rne0 next2 = it4.next();
            QRStatsTracker qRStatsTracker2 = QRStatsTracker.a;
            ParsedResult parsedResult = next2.a;
            String str = next2.d;
            int i6 = QRStatsTracker.b.$EnumSwitchMapping$0[parsedResult.getType().ordinal()];
            if (i6 == 1) {
                str = QRStatsTracker.d(next2, str);
            } else if (i6 == 2 && !brm0.B(str, "MECARD", false)) {
                str = QRStatsTracker.c(str);
            }
            arrayList2.add(URLEncoder.encode(str, C.UTF8_NAME));
        }
        String k = p4g.k(arrayList2, StringUtils.COMMA, null);
        b.d dVar = new b.d("qr_decode_multi");
        dVar.b(k, "data_array");
        dVar.e();
    }

    /* JADX WARN: Removed duplicated region for block: B:25:0x0379  */
    /* JADX WARN: Removed duplicated region for block: B:27:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:54:0x0319  */
    /* JADX WARN: Removed duplicated region for block: B:62:0x034f  */
    /* JADX WARN: Removed duplicated region for block: B:71:0x0387  */
    /* JADX WARN: Type inference failed for: r5v36, types: [java.lang.Object, kotlin.Lazy] */
    /* JADX WARN: Type inference failed for: r5v40, types: [java.lang.Object, kotlin.Lazy] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void f(rne0 rne0Var, boolean z) {
        boolean z2;
        q76 q76Var;
        boolean z3;
        Uri parse;
        int i;
        boolean z4;
        q76 q76Var2;
        boolean i2;
        q76 q76Var3;
        q76 q76Var4;
        Uri parse2;
        String encodedFragment;
        Uri parse3;
        ParsedResult parsedResult = rne0Var.a;
        String str = rne0Var.d;
        String parsedResult2 = parsedResult.toString();
        if (((com.vk.qrcode.d.k != null || com.vk.qrcode.d.l) && !epx.f(this.l, parsedResult2)) || parsedResult2 == null || drm0.N(parsedResult2)) {
            return;
        }
        if (!this.f && d(parsedResult2, false)) {
            return;
        }
        StringBuilder a2 = t33.a("QR: ", parsedResult2, " type=");
        a2.append(parsedResult.getType());
        L.e(a2.toString());
        int i3 = 2;
        HashMap<String, Long> hashMap = this.m;
        if (z) {
            if (parsedResult.getType() != ParsedResultType.URI ? false : naz.C(parsedResult.toString())) {
                URIParsedResult uRIParsedResult = (URIParsedResult) rne0Var.a;
                new io.reactivex.rxjava3.internal.operators.observable.c0(rsg0.y0(new c4r0(uRIParsedResult.getURI(), null), null, null, 3), io.reactivex.rxjava3.internal.functions.a.d, new g39(i3, this, rne0Var)).subscribe(new qg60(new erh(uRIParsedResult, this, rne0Var, 3), 10), new hu50(new hn0(23, this, rne0Var), 11));
                String parsedResult3 = uRIParsedResult.toString();
                this.l = parsedResult3;
                if (parsedResult3.length() > 0) {
                    hashMap.put(this.l, Long.valueOf(System.currentTimeMillis()));
                }
                this.l = parsedResult2;
                if (parsedResult2.length() <= 0) {
                    hashMap.put(this.l, Long.valueOf(System.currentTimeMillis()));
                    return;
                }
                return;
            }
        }
        this.f = false;
        ParsedResultType type = parsedResult.getType();
        int i4 = type == null ? -1 : a.$EnumSwitchMapping$0[type.ordinal()];
        Context context = this.a;
        switch (i4) {
            case 1:
                z2 = false;
                q76Var3 = new mme0(context, parsedResult);
                z3 = true;
                q76Var2 = q76Var3;
                break;
            case 2:
                z2 = false;
                q76Var3 = new com.vk.qrcode.b(parsedResult);
                z3 = true;
                q76Var2 = q76Var3;
                break;
            case 3:
                z2 = false;
                q76Var3 = new QRTypes$AddressBookQRAction(parsedResult, brm0.B(str, "MECARD", false) ? QRTypes$Type.ME_CARD : QRTypes$Type.VC_CARD);
                z3 = true;
                q76Var2 = q76Var3;
                break;
            case 4:
                q76Var = new com.vk.qrcode.a(parsedResult);
                break;
            case 5:
                if (!(brm0.B(parsedResult2, "t=", false) && drm0.D(parsedResult2, "&n=1", false))) {
                    if (!drm0.D(parsedResult2, "mlbrand=1", false)) {
                        q76Var = new jme0(parsedResult);
                        break;
                    } else {
                        eme0 eme0Var = new eme0(parsedResult, false);
                        try {
                            Uri parse4 = Uri.parse(parsedResult.toString());
                            String encodedPath = parse4.getEncodedPath();
                            if (drm0.D(encodedPath, "?", false)) {
                                parse = Uri.parse(encodedPath);
                            } else {
                                parse = Uri.parse(parse4.getScheme() + ':' + parse4.getSchemeSpecificPart() + '?' + encodedPath);
                            }
                            eme0Var.g = parse.getQueryParameter("t");
                            eme0Var.h = parse.getQueryParameter("d");
                            eme0Var.i = parse.getQueryParameter("action_title");
                            String queryParameter = parse.getQueryParameter("brand_id");
                            bpn0 bpn0Var = cqm0.a;
                            try {
                                i = Integer.parseInt(queryParameter);
                            } catch (Throwable unused) {
                                i = 0;
                            }
                            eme0Var.k = i;
                        } catch (Exception e) {
                            L.C("unknown uri=", e);
                        }
                        eme0Var.j = new qkd0(eme0Var, 2);
                        am9 am9Var = new am9();
                        am9Var.b("brand_detected", new zl9(eme0Var.k, am9Var));
                        q76Var = eme0Var;
                        break;
                    }
                } else {
                    z2 = false;
                    q76Var3 = new fme0(parsedResult);
                    z3 = true;
                    q76Var2 = q76Var3;
                    break;
                }
                break;
            case 6:
                z4 = false;
                q76Var4 = new ime0(parsedResult);
                z2 = z4;
                q76Var3 = q76Var4;
                z3 = true;
                q76Var2 = q76Var3;
                break;
            case 7:
                z4 = false;
                QRTypes$SmsQrAction qRTypes$SmsQrAction = new QRTypes$SmsQrAction(parsedResult);
                SMSParsedResult sMSParsedResult = (SMSParsedResult) parsedResult;
                String[] numbers = sMSParsedResult.getNumbers();
                qRTypes$SmsQrAction.c = new QRTypes$SmsQrAction.a((numbers == null || numbers.length == 0 || drm0.N(numbers[0])) ? null : new QRTypes$SmsQrAction.b(numbers[0], QRTypes$SmsQrAction.FieldType.PHONE), new QRTypes$SmsQrAction.b(sMSParsedResult.getBody(), QRTypes$SmsQrAction.FieldType.BODY));
                q76Var4 = qRTypes$SmsQrAction;
                z2 = z4;
                q76Var3 = q76Var4;
                z3 = true;
                q76Var2 = q76Var3;
                break;
            case 8:
                z4 = false;
                QRTypes$EmailQrAction qRTypes$EmailQrAction = new QRTypes$EmailQrAction(parsedResult);
                EmailAddressParsedResult emailAddressParsedResult = (EmailAddressParsedResult) parsedResult;
                String[] tos = emailAddressParsedResult.getTos();
                QRTypes$EmailQrAction.b bVar = (tos == null || tos.length == 0 || drm0.N(tos[0])) ? null : new QRTypes$EmailQrAction.b(tos[0], QRTypes$EmailQrAction.FieldType.EMAIL);
                String subject = emailAddressParsedResult.getSubject();
                QRTypes$EmailQrAction.b bVar2 = subject != null ? new QRTypes$EmailQrAction.b(subject, QRTypes$EmailQrAction.FieldType.SUBJECT) : null;
                String body = emailAddressParsedResult.getBody();
                qRTypes$EmailQrAction.c = new QRTypes$EmailQrAction.a(bVar, bVar2, body != null ? new QRTypes$EmailQrAction.b(body, QRTypes$EmailQrAction.FieldType.BODY) : null);
                q76Var4 = qRTypes$EmailQrAction;
                z2 = z4;
                q76Var3 = q76Var4;
                z3 = true;
                q76Var2 = q76Var3;
                break;
            default:
                String parsedResult4 = parsedResult.toString();
                Object obj = naz.a;
                if (URLUtil.isNetworkUrl(parsedResult4) && drm0.D(parsedResult4, "/vkpay", false)) {
                    hme0 hme0Var = new hme0(parsedResult, this.g);
                    try {
                        parse2 = Uri.parse(parsedResult.toString());
                        encodedFragment = parse2.getEncodedFragment();
                    } catch (Exception e2) {
                        e = e2;
                        z4 = false;
                    }
                    try {
                        if (drm0.D(encodedFragment, "?", false)) {
                            z4 = false;
                            parse3 = Uri.parse(encodedFragment);
                        } else {
                            StringBuilder sb = new StringBuilder();
                            z4 = false;
                            sb.append(parse2.getScheme());
                            sb.append(':');
                            sb.append(parse2.getSchemeSpecificPart());
                            sb.append('?');
                            sb.append(encodedFragment);
                            parse3 = Uri.parse(sb.toString());
                        }
                        hme0Var.g = parse3.getQueryParameter("t");
                        hme0Var.h = parse3.getQueryParameter("d");
                        hme0Var.i = parse3.getQueryParameter("user_id");
                        q76Var4 = hme0Var;
                    } catch (Exception e3) {
                        e = e3;
                        L.C("unknown uri=", e);
                        q76Var4 = hme0Var;
                        z2 = z4;
                        q76Var3 = q76Var4;
                        z3 = true;
                        q76Var2 = q76Var3;
                        boolean d = d(parsedResult2, z3);
                        if (!(q76Var2 instanceof eme0)) {
                            break;
                        }
                        z3 = z2;
                        if (z3) {
                        }
                        i2 = q76Var2.i();
                        gzs<Integer> gzsVar = this.b;
                        if (i2) {
                        }
                    }
                } else {
                    z4 = false;
                    q76Var4 = ((Regex) laz.u.getValue()).a(parsedResult4) ? new kme0(parsedResult, this.g) : ((Regex) laz.v.getValue()).a(parsedResult4) ? new lme0(parsedResult, this.g) : new com.vk.qrcode.c(parsedResult, this.g);
                }
                z2 = z4;
                q76Var3 = q76Var4;
                z3 = true;
                q76Var2 = q76Var3;
                break;
        }
        z3 = true;
        z2 = false;
        q76Var2 = q76Var;
        boolean d2 = d(parsedResult2, z3);
        if (!(q76Var2 instanceof eme0) || (q76Var2 instanceof lme0)) {
            z3 = z2;
        }
        if (z3) {
            if (q76Var2.o() == QRTypes$SubType.LINK_INNER || q76Var2.o() == QRTypes$SubType.LINK_GROUP) {
                QRStatsTracker qRStatsTracker = QRStatsTracker.a;
                QRStatsTracker.b.offer(new QRStatsTracker.a(d2, rne0Var, this.g));
            } else {
                QRStatsTracker qRStatsTracker2 = QRStatsTracker.a;
                QRStatsTracker.e(q76Var2.q(), q76Var2.o(), d2, rne0Var, this.g);
            }
        }
        i2 = q76Var2.i();
        gzs<Integer> gzsVar2 = this.b;
        if (i2) {
            QRStatsTracker.a.b(str, "error");
            ikv0.a aVar = new ikv0.a(bwt0.u(context));
            aVar.u = new ikv0.d(context.getString(R.string.qr_scanner_error), (String) null, (ikv0.d.a) null, 6);
            aVar.o = Integer.valueOf(gzsVar2.invoke().intValue());
            aVar.e = 2000L;
            aVar.n();
            hashMap.put(parsedResult2, Long.valueOf(System.currentTimeMillis() + o));
            return;
        }
        if (q76Var2 instanceof kme0) {
            ((kme0) q76Var2).a();
        } else if (q76Var2 instanceof lme0) {
            ((lme0) q76Var2).a();
            izs<Boolean, s3q0> izsVar = this.c;
            if (izsVar != null) {
                izsVar.invoke(Boolean.FALSE);
            }
        } else {
            com.vk.qrcode.d dVar = com.vk.qrcode.d.b;
            com.vk.qrcode.d.j(context, this, q76Var2, gzsVar2);
        }
        this.l = parsedResult2;
        if (parsedResult2.length() <= 0) {
        }
    }
}
