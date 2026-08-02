package defpackage;

import android.content.Context;
import android.graphics.Matrix;
import android.graphics.Rect;
import android.graphics.RectF;
import android.location.LocationManager;
import android.net.Uri;
import android.util.Size;
import androidx.camera.core.ImageCaptureException;
import androidx.camera.core.ProcessingException;
import androidx.camera.core.processing.DefaultSurfaceProcessor;
import androidx.camera.core.processing.SurfaceProcessorNode$Out;
import com.adjust.sdk.Constants;
import com.yandex.delivery.mapper.model.TimelineItemStatus;
import com.yandex.go.due.data.api.dto.AllowedTimeInfo;
import com.yandex.go.due.data.api.dto.AsapTimeAppearance;
import com.yandex.go.due.data.api.dto.AsapTimeInfo;
import com.yandex.go.due.data.api.dto.TimeRange;
import com.yandex.go.taxi.order.details.v1.elements.support.experiment.SupportOnCompleteExperiment;
import com.yandex.go.taxi.tariffs.internal.repository.k;
import com.yandex.go.trusted_contacts.data.entities.network.TrustedContactsErrorActionButtonDto;
import com.yandex.go.trusted_contacts.data.entities.network.TrustedContactsErrorDto;
import com.yandex.go.trusted_contacts.ui.error.ErrorScreenAction;
import com.yandex.plus.home.feature.webviews.internal.treasury.c;
import java.io.BufferedInputStream;
import java.io.BufferedReader;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStreamReader;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.Collection;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.ListIterator;
import java.util.Locale;
import java.util.Map;
import java.util.Objects;
import java.util.TimeZone;
import javax.net.ssl.SSLSocketFactory;
import javax.net.ssl.X509TrustManager;
import kotlin.Result;
import kotlin.collections.a;
import kotlin.collections.builders.ListBuilder;
import kotlin.time.DurationUnit;
import kotlinx.coroutines.flow.e;
import kotlinx.coroutines.flow.j0;
import retrofit2.HttpException;
import retrofit2.Response;
import ru.rt.ebs.cryptosdk.core.security.entities.models.ITLSProvider;
import ru.yandex.common.model.OneResponseModel;
import ru.yandex.common.network.Request;
import ru.yandex.taxi.network.api.models.GoApiHttpException;
import ru.yandex.taxi.startup.launch.h;
import ru.yandex.taxi.summary.solid.interactor.TariffAccessibilityNotifyInteractor$notifyTariffFlow$$inlined$withPreviousEmit$1;
import ru.yandex.taxi.summary.solid.interactor.a0;
import ru.yandex.taxi.summary.solid.interactor.w;
import ru.yandex.taxi.summary.solid.interactor.y;

/* loaded from: classes5.dex */
public final class cjw0 implements ITLSProvider, u8v, c270 {
    public static cjw0 w;
    public Object a;
    public Object b;
    public Object c;

    public cjw0(w3c w3cVar) {
        this.a = w3cVar;
        this.b = new LinkedHashMap();
        this.c = new LinkedHashMap();
    }

    public static ListBuilder i(p6i p6iVar) {
        gv90 gv90Var;
        ListBuilder a = rcc.a();
        Iterator it = p6iVar.a.iterator();
        while (it.hasNext()) {
            for (uri uriVar : ((esi) it.next()).a) {
                if (uriVar instanceof lri) {
                    lri lriVar = (lri) uriVar;
                    gv90 gv90Var2 = lriVar.d;
                    if (gv90Var2 != null && (gv90Var2 instanceof mu90)) {
                        a.add(((mu90) gv90Var2).a);
                    }
                    gv90 gv90Var3 = lriVar.h;
                    if (gv90Var3 != null && (gv90Var3 instanceof mu90)) {
                        a.add(((mu90) gv90Var3).a);
                    }
                }
                if ((uriVar instanceof iri) && (gv90Var = ((iri) uriVar).f) != null && (gv90Var instanceof mu90)) {
                    a.add(((mu90) gv90Var).a);
                }
            }
        }
        return a.j();
    }

    public static cjw0 l(Context context) {
        if (w == null) {
            Context applicationContext = context.getApplicationContext();
            LocationManager locationManager = (LocationManager) applicationContext.getSystemService("location");
            cjw0 cjw0Var = new cjw0();
            cjw0Var.c = new p2v0();
            cjw0Var.a = applicationContext;
            cjw0Var.b = locationManager;
            w = cjw0Var;
        }
        return w;
    }

    public static h7z0 m(int i, Calendar calendar, Calendar calendar2) {
        int i2 = calendar.get(12);
        int i3 = calendar.get(13);
        o430 o430Var = e3n.b;
        DurationUnit durationUnit = DurationUnit.MINUTES;
        long U = kp50.U(i, durationUnit);
        DurationUnit durationUnit2 = DurationUnit.SECONDS;
        long o = e3n.o(U, durationUnit2);
        int i4 = (e3n.o(kp50.U(i2, durationUnit), durationUnit2) + ((long) i3)) % o == 0 ? 1 : 0;
        wf7 wf7Var = wf7.a;
        Calendar c = wf7.c(calendar, calendar.getTimeZone());
        c.set(12, 0);
        c.set(13, 0);
        c.add(12, ((i2 / i) + (i4 ^ 1)) * i);
        Calendar c2 = wf7.c(calendar2, calendar2.getTimeZone());
        c2.set(12, 0);
        c2.set(13, 0);
        long j = o * 1000;
        c2.add(14, ((int) ((calendar2.getTimeInMillis() - c2.getTimeInMillis()) / j)) * ((int) j));
        return new h7z0(c, c2);
    }

    public void A() {
        ((DefaultSurfaceProcessor) this.a).release();
        tob1.g(new lnv0(14, this));
    }

    public void B(String str) {
        Request[] requestArr;
        String str2 = (String) this.a;
        if (str2 == null) {
            this.a = str;
            throw null;
        }
        HashSet hashSet = (HashSet) this.c;
        if (hashSet == null) {
            return;
        }
        Iterator it = hashSet.iterator();
        while (it.hasNext()) {
            OneResponseModel oneResponseModel = ((b270) ((ey21) it.next())).a;
            requestArr = oneResponseModel.mRequest;
            requestArr[0].setUuid(str2);
            oneResponseModel.execute();
        }
        this.c = null;
    }

    public SurfaceProcessorNode$Out C(u84 u84Var) {
        boolean z;
        Rect rect;
        tob1.b();
        DefaultSurfaceProcessor defaultSurfaceProcessor = (DefaultSurfaceProcessor) this.a;
        Objects.toString(defaultSurfaceProcessor);
        enw0 enw0Var = u84Var.a;
        Objects.toString(enw0Var);
        sgb1.g(3, "SurfaceProcessorNode");
        List<zr80> list = u84Var.b;
        Iterator it = list.iterator();
        while (it.hasNext()) {
            Objects.toString((zr80) it.next());
            sgb1.g(3, "SurfaceProcessorNode");
        }
        this.c = new HashMap<zr80, enw0>() { // from class: androidx.camera.core.processing.SurfaceProcessorNode$Out
        };
        for (zr80 zr80Var : list) {
            SurfaceProcessorNode$Out surfaceProcessorNode$Out = (SurfaceProcessorNode$Out) this.c;
            Rect a = zr80Var.a();
            int c = zr80Var.c();
            boolean g = zr80Var.g();
            Matrix matrix = enw0Var.b;
            Rect rect2 = enw0Var.d;
            Matrix matrix2 = new Matrix(matrix);
            Matrix a2 = lw01.a(new RectF(a), lw01.j(zr80Var.d()), c, g);
            matrix2.postConcat(a2);
            d6z.n(lw01.e(lw01.i(c, lw01.g(a)), false, zr80Var.d()));
            if (zr80Var.h()) {
                d6z.m("Output crop rect " + zr80Var.a() + " must contain input crop rect " + rect2, zr80Var.a().contains(rect2));
                Rect rect3 = new Rect();
                RectF rectF = new RectF(rect2);
                a2.mapRect(rectF);
                rectF.round(rect3);
                rect = rect3;
                z = false;
            } else {
                Size d = zr80Var.d();
                z = false;
                rect = new Rect(0, 0, d.getWidth(), d.getHeight());
            }
            j4n i = enw0Var.g.i();
            Size d2 = zr80Var.d();
            if (d2 == null) {
                ny61.t("Null resolution");
                return null;
            }
            i.a = d2;
            surfaceProcessorNode$Out.put(zr80Var, new enw0(zr80Var.e(), zr80Var.b(), i.k(), matrix2, false, rect, enw0Var.i - c, -1, enw0Var.e != g ? true : z));
        }
        try {
            defaultSurfaceProcessor.onInputSurface(enw0Var.d((br7) this.b, true));
        } catch (ProcessingException e) {
            sgb1.e("SurfaceProcessorNode", "Failed to send SurfaceRequest to SurfaceProcessor.", e);
        }
        for (Map.Entry<zr80, enw0> entry : ((SurfaceProcessorNode$Out) this.c).entrySet()) {
            d(enw0Var, entry);
            entry.getValue().a(new hpo0(6, this, enw0Var, entry));
        }
        k9b k9bVar = new k9b(16, (SurfaceProcessorNode$Out) this.c);
        enw0Var.getClass();
        enw0Var.o.add(k9bVar);
        return (SurfaceProcessorNode$Out) this.c;
    }

    public void D() {
        b(((i6z0) this.a).b, kyh0.common_hour_sign);
    }

    public void E(boolean z) {
        StringBuilder sb = (StringBuilder) this.b;
        int length = sb.length();
        if (length > 0 && sb.charAt(length - 1) != '~') {
            sb.append(" ");
        }
        b(((i6z0) this.a).c, z ? kyh0.common_minutes_sign : 0);
    }

    public void a(ArrayList arrayList, Calendar calendar, Calendar calendar2, int i) {
        avj0 avj0Var;
        String format;
        cjw0 cjw0Var = this;
        dqe0 dqe0Var = (dqe0) cjw0Var.c;
        Calendar a = wf7.a(calendar);
        while (a.before(calendar2)) {
            zuj0 zuj0Var = (zuj0) cjw0Var.b;
            Calendar c = wf7.c(a, a.getTimeZone());
            int i2 = a.get(5);
            ArrayList arrayList2 = new ArrayList();
            do {
                Calendar c2 = wf7.c(a, a.getTimeZone());
                int i3 = a.get(11);
                ArrayList arrayList3 = new ArrayList();
                do {
                    Calendar c3 = wf7.c(a, a.getTimeZone());
                    SimpleDateFormat simpleDateFormat = new SimpleDateFormat("mm", Locale.getDefault());
                    TimeZone d = dqe0Var.d();
                    if (d == null) {
                        d = TimeZone.getDefault();
                    }
                    simpleDateFormat.setTimeZone(d);
                    avj0Var = (avj0) zuj0Var;
                    i7z0 i7z0Var = new i7z0(simpleDateFormat.format(a.getTime()), avj0Var.f(dwh0.date_format_minutes_left, a.get(12)), c3);
                    a.add(12, i);
                    arrayList3.add(i7z0Var);
                } while (i3 == a.get(11));
                SimpleDateFormat simpleDateFormat2 = new SimpleDateFormat("HH", Locale.getDefault());
                TimeZone d2 = dqe0Var.d();
                if (d2 == null) {
                    d2 = TimeZone.getDefault();
                }
                simpleDateFormat2.setTimeZone(d2);
                arrayList2.add(new g7z0(simpleDateFormat2.format(c2.getTime()), avj0Var.f(dwh0.date_format_hours_left, c2.get(11)), arrayList3, c2));
            } while (i2 == a.get(5));
            TimeZone d3 = dqe0Var.d();
            if (d3 == null) {
                d3 = TimeZone.getDefault();
            }
            if (wf7.e(c, Calendar.getInstance(d3))) {
                format = avj0Var.h(kyh0.date_today);
            } else {
                SimpleDateFormat simpleDateFormat3 = new SimpleDateFormat("EEE, d MMM", Locale.getDefault());
                TimeZone d4 = dqe0Var.d();
                if (d4 == null) {
                    d4 = TimeZone.getDefault();
                }
                simpleDateFormat3.setTimeZone(d4);
                format = simpleDateFormat3.format(c.getTime());
            }
            arrayList.add(new f7z0(c, format, arrayList2));
            cjw0Var = this;
        }
    }

    public void b(int i, int i2) {
        StringBuilder sb = (StringBuilder) this.b;
        if (i <= 0) {
            return;
        }
        sb.append(i);
        if (i2 != 0) {
            sb.append((char) 160);
            sb.append(((avj0) ((nw8) this.c).a).h(i2));
        }
    }

    public c c() {
        kqd0 kqd0Var = (kqd0) this.a;
        if (kqd0Var != null) {
            return new c(kqd0Var, (lzs) this.b, (jse) this.c);
        }
        return null;
    }

    public void d(enw0 enw0Var, Map.Entry entry) {
        enw0 enw0Var2 = (enw0) entry.getValue();
        Objects.toString(enw0Var2);
        sgb1.g(3, "SurfaceProcessorNode");
        onw0 onw0Var = null;
        s84 s84Var = new s84(enw0Var.g.f(), ((zr80) entry.getKey()).a(), enw0Var.c ? (br7) this.b : null, ((zr80) entry.getKey()).c(), ((zr80) entry.getKey()).g());
        int b = ((zr80) entry.getKey()).b();
        enw0Var2.getClass();
        tob1.b();
        enw0Var2.b();
        d6z.y("Consumer can only be linked once.", !enw0Var2.j);
        enw0Var2.j = true;
        dnw0 dnw0Var = enw0Var2.l;
        ni91.a(ni91.n(dnw0Var.c(), new gw70(enw0Var2, dnw0Var, b, s84Var, onw0Var), geb1.f()), new hhs0(this, enw0Var2, false, 18), geb1.f());
    }

    public long e(n940 n940Var) {
        o430 o430Var = e3n.b;
        return e3n.o(kp50.V(e3n.e(kp50.V(n940Var.a, DurationUnit.SECONDS)) - ((jtq0) this.b).d(), DurationUnit.MILLISECONDS), DurationUnit.MINUTES);
    }

    public tis0 f(int i, String str, List list) {
        if (list.isEmpty()) {
            return null;
        }
        n940 n940Var = (n940) a.R(list);
        String str2 = "";
        if (n940Var != null) {
            long j = n940Var.a;
            String str3 = n940Var.b;
            if (j > 0 && str3.length() != 0) {
                long e = e(n940Var);
                if (e > i) {
                    str = str3;
                } else if (e != 0 || str == null || str.length() == 0) {
                    if (e >= 0) {
                        if (e < 1) {
                            e = 1;
                        }
                        str = e + " " + ((avj0) ((zuj0) this.a)).h(kyh0.date_format_min);
                    }
                }
                str2 = str;
            }
            str = "";
            str2 = str;
        }
        boolean z = true;
        List<n940> J = a.J(list, 1);
        ArrayList arrayList = new ArrayList();
        ArrayList arrayList2 = new ArrayList();
        for (n940 n940Var2 : J) {
            if (e(n940Var2) <= i) {
                arrayList.add(n940Var2);
            } else {
                arrayList2.add(n940Var2);
            }
        }
        String a = !arrayList.isEmpty() ? ((kj40) this.c).a(arrayList.size(), arrayList) : null;
        String d = npb1.d(arrayList2);
        return new tis0(str2, a.X(j73.A(new String[]{a, d.length() != 0 ? d : null}), null, null, null, null, 63), z, 18);
    }

    public String g(SupportOnCompleteExperiment supportOnCompleteExperiment, String str) {
        String Hg = ((h) ((fn21) this.b)).Hg();
        if (Hg == null) {
            return null;
        }
        return cvu0.v(cvu0.v(cvu0.v(supportOnCompleteExperiment.c, "{language_code}", ((ko21) this.a).a().a(), false), "{user_id}", Hg, false), "{order_id}", str, false);
    }

    @Override // ru.rt.ebs.cryptosdk.core.security.entities.models.ITLSProvider
    public String[] getCiphers() {
        return (String[]) this.a;
    }

    @Override // ru.rt.ebs.cryptosdk.core.security.entities.models.ITLSProvider
    public SSLSocketFactory getSslSocketFactory() {
        return (SSLSocketFactory) this.c;
    }

    @Override // ru.rt.ebs.cryptosdk.core.security.entities.models.ITLSProvider
    public String getTlsVersion() {
        return "TLSv1.2";
    }

    @Override // ru.rt.ebs.cryptosdk.core.security.entities.models.ITLSProvider
    public X509TrustManager getTrustManager() {
        return (X509TrustManager) this.b;
    }

    public wg11 h() {
        return (wg11) ((i3y) this.c).getValue();
    }

    @Override // defpackage.u8v
    public void j(ImageCaptureException imageCaptureException) {
        ((FileOutputStream) this.a).close();
        ((kol0) this.b).resumeWith(new Result.Failure(new Exception()));
    }

    @Override // defpackage.u8v
    public void k(reu reuVar) {
        FileOutputStream fileOutputStream = (FileOutputStream) this.a;
        fileOutputStream.flush();
        fileOutputStream.close();
        kol0 kol0Var = (kol0) this.b;
        Uri uri = (Uri) reuVar.b;
        if (uri == null) {
            uri = (Uri) this.c;
        }
        kol0Var.resumeWith(uri);
    }

    public zoq0 n(long j) {
        return (zoq0) ((LinkedHashMap) this.c).get(Long.valueOf(j));
    }

    public boolean o() {
        if (((m3u0) this.a).getValue() != this.c) {
            return true;
        }
        cjw0 cjw0Var = (cjw0) this.b;
        return cjw0Var != null && cjw0Var.o();
    }

    public boolean p() {
        if (((k0b0) this.c).g()) {
            return !((ooe) ((noe) this.b)).c(((o2y0) this.a).b());
        }
        return false;
    }

    public w9z0 q(v9z0 v9z0Var, int i, int i2, boolean z) {
        lvi0 lvi0Var;
        String str;
        ldc ldcVar;
        s9z0 s9z0Var;
        q9z0 q9z0Var;
        int i3;
        zaz0 zaz0Var;
        xaz0 xaz0Var;
        boolean z2;
        String str2;
        lvi0 lvi0Var2;
        zez0 zez0Var;
        ru.yandex.taxi.logistics.sdk.tracking.impl.ui.common.mappers.a aVar = (ru.yandex.taxi.logistics.sdk.tracking.impl.ui.common.mappers.a) this.c;
        l7x0 l7x0Var = (l7x0) this.a;
        String str3 = v9z0Var.a;
        lvi0 lvi0Var3 = str3 != null ? new lvi0(l7x0Var.a(str3), null, null, null, null, 62) : null;
        String str4 = v9z0Var.b;
        r9z0 r9z0Var = v9z0Var.c;
        if (r9z0Var != null) {
            yuj0 yuj0Var = (yuj0) this.b;
            String str5 = r9z0Var.a;
            ldc d = aVar.b.d(r9z0Var.b);
            ldc d2 = aVar.b.d(r9z0Var.c);
            aqb1 aqb1Var = r9z0Var.d;
            if (aqb1Var instanceof m9z0) {
                m9z0 m9z0Var = (m9z0) aqb1Var;
                String str6 = m9z0Var.a;
                v9z0 v9z0Var2 = m9z0Var.b;
                ldcVar = null;
                w9z0 q = v9z0Var2 != null ? q(v9z0Var2, i, i2, z) : null;
                ArrayList arrayList = m9z0Var.c;
                w9z0 w9z0Var = q;
                ListIterator listIterator = arrayList.listIterator(arrayList.size());
                while (true) {
                    if (!listIterator.hasPrevious()) {
                        i3 = -1;
                        break;
                    }
                    ListIterator listIterator2 = listIterator;
                    if (((gj31) listIterator.previous()).c == TimelineItemStatus.PASSED) {
                        i3 = listIterator2.nextIndex();
                        break;
                    }
                    listIterator = listIterator2;
                }
                lvi0Var = lvi0Var3;
                ArrayList arrayList2 = new ArrayList(tcc.n(arrayList, 10));
                Iterator it = arrayList.iterator();
                int i4 = 0;
                while (it.hasNext()) {
                    Object next = it.next();
                    int i5 = i4 + 1;
                    if (i4 < 0) {
                        scc.m();
                        throw null;
                    }
                    Iterator it2 = it;
                    gj31 gj31Var = (gj31) next;
                    String str7 = str4;
                    int i6 = fcz0.a[gj31Var.c.ordinal()];
                    String str8 = str6;
                    if (i6 == 1) {
                        z2 = true;
                    } else {
                        if (i6 != 2 && i6 != 3) {
                            w511.b();
                            return null;
                        }
                        z2 = false;
                    }
                    String str9 = gj31Var.a;
                    String str10 = gj31Var.b;
                    String str11 = gj31Var.d;
                    if (str11 != null) {
                        String a = l7x0Var.a(str11);
                        if (z2) {
                            str2 = str10;
                            zez0Var = new zez0(aVar.d("textOnControl"));
                        } else {
                            str2 = str10;
                            zez0Var = new zez0(ldc.b);
                        }
                        lvi0Var2 = new lvi0(a, null, null, null, zez0Var, 46);
                    } else {
                        str2 = str10;
                        lvi0Var2 = null;
                    }
                    String str12 = gj31Var.e;
                    qfc qfcVar = gj31Var.f;
                    ldc a2 = qfcVar != null ? aVar.a(qfcVar, z) : null;
                    String str13 = gj31Var.g;
                    qfc qfcVar2 = gj31Var.h;
                    arrayList2.add(new hj31(str9, str2, z2, lvi0Var2, str12, a2, str13, qfcVar2 != null ? aVar.a(qfcVar2, z) : null, i4 == i3 ? yuj0Var.a(uzh0.for_accessibility_modal_screen_in_progress, new Object[0]) : z2 ? yuj0Var.a(uzh0.for_accessibility_modal_screen_done, new Object[0]) : yuj0Var.a(uzh0.for_accessibility_modal_screen_not_completed, new Object[0])));
                    str6 = str8;
                    i4 = i5;
                    it = it2;
                    str4 = str7;
                }
                str = str4;
                String str14 = str6;
                saz0 saz0Var = new saz0(m9z0Var.d.a);
                yaz0 yaz0Var = m9z0Var.e;
                if (yaz0Var != null) {
                    String str15 = yaz0Var.a;
                    cqb1 cqb1Var = yaz0Var.b;
                    if (cqb1Var == null) {
                        xaz0Var = null;
                    } else if (cqb1Var instanceof taz0) {
                        taz0 taz0Var = (taz0) cqb1Var;
                        xaz0Var = new vaz0(taz0Var.a, taz0Var.b);
                    } else {
                        if (!cqb1Var.equals(uaz0.a)) {
                            w511.b();
                            return null;
                        }
                        xaz0Var = waz0.a;
                    }
                    zaz0Var = new zaz0(str15, xaz0Var);
                } else {
                    zaz0Var = null;
                }
                q9z0Var = new o9z0(str14, w9z0Var, arrayList2, saz0Var, zaz0Var);
            } else {
                lvi0Var = lvi0Var3;
                str = str4;
                ldcVar = null;
                if (!jl40.l(aqb1Var, n9z0.a)) {
                    w511.b();
                    return null;
                }
                q9z0Var = p9z0.a;
            }
            s9z0Var = new s9z0(str5, d, d2, q9z0Var);
        } else {
            lvi0Var = lvi0Var3;
            str = str4;
            ldcVar = null;
            s9z0Var = null;
        }
        qfc qfcVar3 = v9z0Var.d;
        return new w9z0(i, i2, lvi0Var, str, s9z0Var, qfcVar3 != null ? aVar.a(qfcVar3, z) : ldcVar);
    }

    public mcz0 r(ncz0 ncz0Var, boolean z) {
        w9z0 w9z0Var;
        ArrayList arrayList = ncz0Var.a;
        ArrayList arrayList2 = new ArrayList(tcc.n(arrayList, 10));
        Iterator it = arrayList.iterator();
        while (true) {
            if (!it.hasNext()) {
                break;
            }
            sru sruVar = (sru) it.next();
            boolean z2 = sruVar.b == TimelineItemStatus.PASSED;
            String a = ((l7x0) this.a).a(z ? sruVar.d : sruVar.c);
            ru.yandex.taxi.logistics.sdk.tracking.impl.ui.common.mappers.a aVar = (ru.yandex.taxi.logistics.sdk.tracking.impl.ui.common.mappers.a) this.c;
            arrayList2.add(new tru(z2, new lvi0(a, null, null, null, new zez0(z2 ? aVar.d("textOnControl") : aVar.d("textOnControlMinor")), 46)));
        }
        adz0 adz0Var = new adz0(arrayList2);
        v9z0 v9z0Var = ncz0Var.c;
        if (v9z0Var != null) {
            int size = arrayList.size();
            Iterator it2 = arrayList.iterator();
            int i = 0;
            while (true) {
                if (!it2.hasNext()) {
                    i = -1;
                    break;
                }
                if (jl40.l(((sru) it2.next()).a, ncz0Var.b)) {
                    break;
                }
                i++;
            }
            w9z0Var = q(v9z0Var, size, i != -1 ? i : 0, z);
        } else {
            w9z0Var = null;
        }
        return new mcz0(adz0Var, w9z0Var);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r3v12, types: [wg11] */
    /* JADX WARN: Type inference failed for: r3v13, types: [wg11] */
    /* JADX WARN: Type inference failed for: r3v16 */
    /* JADX WARN: Type inference failed for: r3v17 */
    /* JADX WARN: Type inference failed for: r3v6, types: [wg11] */
    public wg11 s(Throwable th) {
        BufferedInputStream body;
        rvj0 rvj0Var;
        wnt wntVar = (wnt) this.a;
        if (th instanceof HttpException) {
            Response response = ((HttpException) th).a;
            if (response != null && (rvj0Var = response.c) != null) {
                try {
                    try {
                        this = v((TrustedContactsErrorDto) ((xnt) wntVar).c(rvj0Var.string(), TrustedContactsErrorDto.Companion.serializer()));
                        this = this;
                    } catch (Throwable unused) {
                        this = this.h();
                    }
                    return this;
                } catch (IOException unused2) {
                    return this.h();
                }
            }
            return h();
        }
        if ((th instanceof GoApiHttpException) && (body = ((GoApiHttpException) th).getBody()) != null) {
            try {
                BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(body, uza.a), 8192);
                try {
                    String x0 = cma1.x0(bufferedReader);
                    bufferedReader.close();
                    try {
                        this = v((TrustedContactsErrorDto) ((xnt) wntVar).c(x0, TrustedContactsErrorDto.Companion.serializer()));
                        return this;
                    } catch (Throwable unused3) {
                        return this.h();
                    }
                } finally {
                }
            } catch (IOException unused4) {
                return this.h();
            }
        }
        return h();
    }

    public tis0 t(wy30 wy30Var, int i, String str) {
        String str2;
        n940 n940Var;
        if (wy30Var instanceof ty30) {
            return f(i, str, a.J0(a.A0(((ty30) wy30Var).c, 3)));
        }
        int i2 = 18;
        boolean z = false;
        str2 = "";
        if (wy30Var instanceof uy30) {
            uy30 uy30Var = (uy30) wy30Var;
            String d = ((kj40) this.c).d(uy30Var);
            if (d == null) {
                d = "";
            }
            n940 n940Var2 = uy30Var.e;
            if (n940Var2 != null && (n940Var = uy30Var.f) != null) {
                str2 = ((avj0) ((zuj0) this.a)).i(kyh0.mt_interval_borders, n940Var2.b, n940Var.b);
            }
            return new tis0(d, str2, z, i2);
        }
        if (!(wy30Var instanceof vy30)) {
            if (wy30Var instanceof sy30) {
                return f(i, str, a.J0(a.A0(((sy30) wy30Var).c(), 3)));
            }
            w511.b();
            return null;
        }
        List J0 = a.J0(a.A0(((vy30) wy30Var).c, 3));
        if (J0.size() < 3) {
            return new tis0(npb1.d(J0), str2, z, i2);
        }
        n940 n940Var3 = (n940) a.R(J0);
        String str3 = n940Var3 != null ? n940Var3.b : null;
        return new tis0(str3 != null ? str3 : "", npb1.d(a.J(J0, 1)), z, i2);
    }

    public c301 u(x701 x701Var) {
        c301 c301Var;
        List<nr> list;
        String str;
        String str2;
        c301 c301Var2;
        c301 c301Var3;
        String str3;
        String str4;
        boolean z;
        String str5;
        if (!(x701Var instanceof t701)) {
            return null;
        }
        gri griVar = ((t701) x701Var).a;
        Object obj = griVar.i;
        Map map = obj instanceof Map ? (Map) obj : null;
        Object obj2 = map != null ? map.get("order_status") : null;
        String str6 = obj2 instanceof String ? (String) obj2 : null;
        if (str6 == null) {
            str6 = "unknown";
        }
        String str7 = str6;
        String str8 = griVar.a;
        Object obj3 = griVar.i;
        List list2 = griVar.d;
        boolean z2 = griVar.b.c;
        List list3 = griVar.e;
        uzc uzcVar = griVar.r;
        ((j00) this.b).getClass();
        ArrayList b = j00.b(griVar);
        ArrayList arrayList = new ArrayList();
        Iterator it = b.iterator();
        while (it.hasNext()) {
            Object next = it.next();
            if (next instanceof ho) {
                arrayList.add(next);
            }
        }
        ho hoVar = (ho) a.R(arrayList);
        String str9 = hoVar == null ? null : hoVar.c != null ? "tips_with_payment" : "tips";
        ListBuilder a = rcc.a();
        if (z2) {
            if ((uzcVar != null ? uzcVar.a : null) != null) {
                a.add("primary_button");
            }
        }
        if (z2) {
            if ((uzcVar != null ? uzcVar.b : null) != null) {
                a.add("secondary_button");
            }
        }
        List list4 = list2;
        boolean z3 = list4 instanceof Collection;
        if (!z3 || !list4.isEmpty()) {
            Iterator it2 = list4.iterator();
            while (true) {
                if (!it2.hasNext()) {
                    break;
                }
                if (((nr) it2.next()) instanceof kn) {
                    a.add("cancel");
                    break;
                }
            }
        }
        if (!z3 || !list4.isEmpty()) {
            Iterator it3 = list4.iterator();
            while (true) {
                if (!it3.hasNext()) {
                    break;
                }
                if (((nr) it3.next()) instanceof tn) {
                    a.add("feedback");
                    break;
                }
            }
        }
        if (!z3 || !list4.isEmpty()) {
            Iterator it4 = list4.iterator();
            while (it4.hasNext()) {
                c301Var = null;
                if (((nr) it4.next()) instanceof zn) {
                    a.add("call");
                    break;
                }
            }
        }
        c301Var = null;
        String str10 = "show_delivery_from_market_content";
        if (!z3 || !list4.isEmpty()) {
            Iterator it5 = list4.iterator();
            while (it5.hasNext()) {
                list = list4;
                if (((nr) it5.next()) instanceof eo) {
                    a.add("show_delivery_from_market_content");
                    break;
                }
                list4 = list;
            }
        }
        list = list4;
        String str11 = "share";
        if (!z3 || !list.isEmpty()) {
            Iterator it6 = list.iterator();
            while (it6.hasNext()) {
                str = str10;
                if (((nr) it6.next()) instanceof bo) {
                    a.add("share");
                    break;
                }
                str10 = str;
            }
        }
        str = str10;
        if (!z3 || !list.isEmpty()) {
            Iterator it7 = list.iterator();
            while (it7.hasNext()) {
                str2 = str11;
                if (((nr) it7.next()) instanceof go) {
                    a.add("show_support_from_service");
                    break;
                }
                str11 = str2;
            }
        }
        str2 = str11;
        String str12 = "pay_on_delivery";
        if (!z3 || !list.isEmpty()) {
            Iterator it8 = list.iterator();
            while (it8.hasNext()) {
                c301Var3 = c301Var2;
                if (((nr) it8.next()) instanceof cx) {
                    a.add("pay_on_delivery");
                    break;
                }
                c301Var2 = c301Var3;
            }
        }
        c301Var3 = c301Var2;
        if (!z3 || !list.isEmpty()) {
            Iterator it9 = list.iterator();
            while (it9.hasNext()) {
                str3 = str12;
                if (((nr) it9.next()) instanceof un) {
                    a.add("contact_courier");
                    break;
                }
                str12 = str3;
            }
        }
        str3 = str12;
        String str13 = "edit_order_details";
        if (!z3 || !list.isEmpty()) {
            Iterator it10 = list.iterator();
            while (true) {
                if (!it10.hasNext()) {
                    break;
                }
                Iterator it11 = it10;
                if (((nr) it10.next()) instanceof rn) {
                    a.add("edit_order_details");
                    break;
                }
                it10 = it11;
            }
        }
        if (!z3 || !list.isEmpty()) {
            Iterator it12 = list.iterator();
            while (it12.hasNext()) {
                str4 = str13;
                if (((nr) it12.next()) instanceof sn) {
                    a.add("extend_delivery_expiration_date");
                    break;
                }
                str13 = str4;
            }
        }
        str4 = str13;
        List list5 = list3;
        boolean z4 = list5 instanceof Collection;
        if (!z4 || !list5.isEmpty()) {
            Iterator it13 = list5.iterator();
            while (it13.hasNext()) {
                z = z4;
                if (((nr) it13.next()) instanceof sn) {
                    a.add("extend_delivery_expiration_date");
                    break;
                }
                z4 = z;
            }
        }
        z = z4;
        if (!z || !list5.isEmpty()) {
            Iterator it14 = list5.iterator();
            while (true) {
                if (!it14.hasNext()) {
                    break;
                }
                if (((nr) it14.next()) instanceof go) {
                    a.add("show_support_from_service");
                    break;
                }
            }
        }
        if (str9 != null) {
            a.add(str9);
        }
        for (nr nrVar : list) {
            if (nrVar instanceof on) {
                String str14 = ((on) nrVar).e;
                if (str14 == null) {
                    str14 = Constants.DEEPLINK;
                }
                a.add(str14);
            }
        }
        ListBuilder j = a.j();
        ArrayList m0 = a.m0(i(griVar.n), i(griVar.m));
        ArrayList arrayList2 = new ArrayList();
        Iterator it15 = m0.iterator();
        while (it15.hasNext()) {
            nr nrVar2 = (nr) it15.next();
            if ((nrVar2 instanceof kn) || (nrVar2 instanceof mn) || (nrVar2 instanceof rn)) {
                str5 = str4;
            } else if (nrVar2 instanceof sn) {
                str5 = "extend_delivery_expiration_date";
            } else if (nrVar2 instanceof tn) {
                str5 = "feedback";
            } else if (nrVar2 instanceof un) {
                str5 = "contact_courier";
            } else if (nrVar2 instanceof cx) {
                str5 = str3;
            } else if (nrVar2 instanceof zn) {
                str5 = "call";
            } else if (nrVar2 instanceof bo) {
                str5 = str2;
            } else if (nrVar2 instanceof eo) {
                str5 = str;
            } else if (nrVar2 instanceof go) {
                str5 = "show_support_from_service";
            } else if (nrVar2 instanceof ho) {
                str5 = ((ho) nrVar2).c != null ? "tips_with_payment" : "tips";
            } else {
                if (!(nrVar2 instanceof fo) && !(nrVar2 instanceof wn) && !(nrVar2 instanceof xn) && !(nrVar2 instanceof yn) && !(nrVar2 instanceof ln) && !(nrVar2 instanceof nn) && !(nrVar2 instanceof on) && !(nrVar2 instanceof pn) && !(nrVar2 instanceof ao) && !(nrVar2 instanceof co) && !(nrVar2 instanceof vn) && !(nrVar2 instanceof qn) && !jl40.l(nrVar2, cr.a)) {
                    w511.b();
                    return c301Var;
                }
                str5 = c301Var;
            }
            if (str5 != null) {
                arrayList2.add(str5);
            }
        }
        return new c301(str8, str7, obj3, j, arrayList2);
    }

    public wg11 v(TrustedContactsErrorDto trustedContactsErrorDto) {
        ErrorScreenAction errorScreenAction;
        String str = trustedContactsErrorDto.a;
        TrustedContactsErrorActionButtonDto trustedContactsErrorActionButtonDto = trustedContactsErrorDto.c;
        String str2 = trustedContactsErrorDto.b;
        if ((evu0.J(str) && evu0.J(str2)) || evu0.J(trustedContactsErrorActionButtonDto.a)) {
            return h();
        }
        String str3 = trustedContactsErrorDto.a;
        String str4 = trustedContactsErrorActionButtonDto.a;
        int i = tg11.a[trustedContactsErrorActionButtonDto.b.ordinal()];
        if (i == 1) {
            errorScreenAction = ErrorScreenAction.BACK;
        } else {
            if (i != 2) {
                w511.b();
                return null;
            }
            errorScreenAction = ErrorScreenAction.BACK_TO_CONTACT_SELECTION;
        }
        return new wg11(str3, str2, str4, errorScreenAction);
    }

    /* JADX WARN: Code restructure failed: missing block: B:22:0x007a, code lost:
    
        if (r9.b.after(r9.a) != false) goto L30;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public j7z0 w(AllowedTimeInfo allowedTimeInfo, boolean z) {
        cjw0 cjw0Var;
        int i;
        int i2;
        Calendar calendar;
        Calendar calendar2;
        h7z0 h7z0Var;
        dqe0 dqe0Var = (dqe0) this.c;
        AsapTimeInfo asapTimeInfo = allowedTimeInfo.g;
        int i3 = allowedTimeInfo.a;
        if ((asapTimeInfo != null ? asapTimeInfo.a : null) != null) {
            AsapTimeAppearance asapTimeAppearance = asapTimeInfo.a;
            String str = asapTimeAppearance.a;
            List list = asapTimeAppearance.b;
            if (str == null) {
                str = "";
            }
            xy40 xy40Var = new xy40(list.size());
            xy40Var.h(list);
            cjw0Var = new cjw0(str, xy40Var, asapTimeAppearance.c);
        } else {
            cjw0Var = null;
        }
        int i4 = i3 <= 0 ? 5 : i3;
        TimeZone d = dqe0Var.d();
        if (d == null) {
            d = TimeZone.getDefault();
        }
        List<TimeRange> list2 = allowedTimeInfo.c;
        ArrayList arrayList = new ArrayList();
        for (TimeRange timeRange : list2) {
            Calendar b = wf7.b(timeRange.a, d);
            Calendar b2 = wf7.b(timeRange.b, d);
            if (b != null && b2 != null) {
                h7z0Var = m(i4, b, b2);
            }
            h7z0Var = null;
            if (h7z0Var != null) {
                arrayList.add(h7z0Var);
            }
        }
        int i5 = i3 <= 0 ? 5 : i3;
        ArrayList arrayList2 = new ArrayList();
        if (arrayList.isEmpty()) {
            TimeZone d2 = dqe0Var.d();
            if (d2 == null) {
                d2 = TimeZone.getDefault();
            }
            Calendar calendar3 = Calendar.getInstance(d2);
            Calendar a = wf7.a(calendar3);
            a.add(6, 2);
            h7z0 m = m(i5, calendar3, a);
            a(arrayList2, m.a, m.b, i5);
        }
        Iterator it = arrayList.iterator();
        int i6 = 0;
        while (it.hasNext()) {
            Object next = it.next();
            int i7 = i6 + 1;
            if (i6 < 0) {
                scc.m();
                throw null;
            }
            h7z0 h7z0Var2 = (h7z0) next;
            if (z) {
                Calendar calendar4 = h7z0Var2.b;
                wf7 wf7Var = wf7.a;
                calendar = wf7.c(calendar4, calendar4.getTimeZone());
                o430 o430Var = e3n.b;
                int i8 = calendar.get(11);
                DurationUnit durationUnit = DurationUnit.HOURS;
                i = i7;
                long U = kp50.U(i8, durationUnit);
                DurationUnit durationUnit2 = DurationUnit.MINUTES;
                i2 = 12;
                calendar.add(12, ((int) ((e3n.o(kp50.U(24, durationUnit), durationUnit2) - (e3n.o(U, durationUnit2) + calendar.get(12))) / i5)) * i5);
            } else {
                i = i7;
                i2 = 12;
                calendar = h7z0Var2.b;
            }
            if (!z || i6 == 0) {
                calendar2 = h7z0Var2.a;
            } else {
                calendar2 = h7z0Var2.a;
                long j = calendar2.get(i2);
                o430 o430Var2 = e3n.b;
                int o = (int) ((e3n.o(kp50.U(calendar2.get(11), DurationUnit.HOURS), DurationUnit.MINUTES) + j) / i5);
                if (o != 0) {
                    wf7 wf7Var2 = wf7.a;
                    calendar2 = wf7.c(calendar2, calendar2.getTimeZone());
                    calendar2.add(12, (-o) * i5);
                }
            }
            a(arrayList2, calendar2, calendar, i5);
            i6 = i;
        }
        return new j7z0(arrayList2, arrayList, allowedTimeInfo.b, i5, cjw0Var);
    }

    public tpr x() {
        tpr t = e.t(new y(new a0(new mth(new j0(null, e.p(new w(((k) ((wiq0) this.b)).j.b(), this), 50L), new TariffAccessibilityNotifyInteractor$notifyTariffFlow$$inlined$withPreviousEmit$1(3, null)), 6), this)));
        ((tt2) this.c).getClass();
        return e.F(t, uyj.a);
    }

    public void y(zxs0 zxs0Var) {
        czh create = ((gzh) this.a).create();
        this.c = create;
        z4m0 z4m0Var = (z4m0) ((jhu0) this.b).a;
        z4m0Var.getClass();
        bbg bbgVar = new bbg(z4m0Var, 3);
        int i = 1;
        bbg bbgVar2 = new bbg(z4m0Var, i);
        int i2 = 0;
        cbg cbgVar = new cbg(zxs0Var, i2);
        cbg cbgVar2 = new cbg(zxs0Var, i);
        bbg bbgVar3 = new bbg(z4m0Var, 4);
        xvf0 b = i5m.b(new n2y0(aiu0.a, 24));
        bbg bbgVar4 = new bbg(z4m0Var, i2);
        int i3 = 6;
        bbg bbgVar5 = new bbg(z4m0Var, i3);
        lpy0 lpy0Var = (lpy0) i5m.b(new z6x0(bbgVar, i5m.b(new z6x0(bbgVar2, i5m.b(new rct0(cbgVar, cbgVar2, bbgVar3, b, new flx0(bbgVar4, new uzu0(new flx0(bbgVar5, new c1(bbgVar5, i3), 11), 29), 12))), new bbg(z4m0Var, 5), new bbg(z4m0Var, 2), 10)), cbgVar, cbgVar2, 9)).get();
        qcp0 qcp0Var = lpy0Var.a;
        spy0 spy0Var = lpy0Var.b;
        rpy0 rpy0Var = lpy0Var.c;
        ru.yandex.taxi.logistics.sdk.tracking.impl.ui.widgets.neuro_postcard.a aVar = lpy0Var.d;
        qcp0Var.getClass();
        czh.a(create, new izh(new cxm(new aoi(spy0Var, rpy0Var, aVar)), null, null, null, null, null, 8190));
    }

    public boolean z(long j, String str) {
        LinkedHashMap linkedHashMap = (LinkedHashMap) this.b;
        zoq0 zoq0Var = (zoq0) linkedHashMap.get(str);
        if (zoq0Var == null) {
            return false;
        }
        linkedHashMap.remove(str);
        ((LinkedHashMap) this.c).put(Long.valueOf(j), zoq0Var);
        ((w3c) this.a).getClass();
        zoq0Var.e = System.currentTimeMillis();
        return true;
    }

    public cjw0(ru.yandex.taxi.logistics.sdk.tracking.domain.impl.e eVar, j00 j00Var) {
        this.a = eVar;
        this.b = j00Var;
        this.c = new fzw(27, eVar.e, this);
    }

    public cjw0(nw8 nw8Var, i6z0 i6z0Var) {
        this.c = nw8Var;
        this.a = i6z0Var;
        this.b = new StringBuilder();
    }

    public cjw0(br7 br7Var, DefaultSurfaceProcessor defaultSurfaceProcessor) {
        this.b = br7Var;
        this.a = defaultSurfaceProcessor;
    }

    public /* synthetic */ cjw0(Object obj, Object obj2, Object obj3) {
        this.a = obj;
        this.b = obj2;
        this.c = obj3;
    }

    public cjw0(rp11 rp11Var, cjw0 cjw0Var) {
        this.a = rp11Var;
        this.b = cjw0Var;
        this.c = rp11Var.getValue();
    }
}
