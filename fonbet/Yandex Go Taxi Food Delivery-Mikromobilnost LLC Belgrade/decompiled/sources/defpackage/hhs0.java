package defpackage;

import android.graphics.Bitmap;
import android.graphics.BitmapRegionDecoder;
import android.graphics.Point;
import android.graphics.Rect;
import android.util.Pair;
import android.util.Range;
import android.util.Size;
import androidx.camera.camera2.internal.y;
import androidx.camera.core.ImageCaptureException;
import androidx.camera.core.ProcessingException;
import androidx.camera.core.impl.StreamUseCase;
import androidx.camera.core.impl.SurfaceConfig$ConfigSource;
import androidx.camera.core.j;
import androidx.camera.core.processing.DefaultSurfaceProcessor;
import com.adjust.sdk.Constants;
import com.bumptech.glide.load.resource.bitmap.h;
import com.google.android.play.core.splitinstall.SplitInstallRequest;
import com.yandex.go.address.models.Address;
import com.yandex.go.payments.domain.r0;
import com.yandex.go.summary.interactor.common.state.SurgeWidgetUiStateInteractor$special$$inlined$start$1;
import com.yandex.go.taxi.tariffs.internal.repository.k;
import com.yandex.messaging.internal.LocalMessageRef;
import com.yandex.messaging.internal.entities.ImageMessageData;
import com.yandex.messaging.internal.images.b;
import com.yandex.messaging.ui.imageviewer.ImageViewerInfo;
import java.io.IOException;
import java.io.InputStream;
import java.math.BigDecimal;
import java.math.BigInteger;
import java.math.MathContext;
import java.math.RoundingMode;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.HashMap;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.Objects;
import java.util.TimeZone;
import java.util.concurrent.CancellationException;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.Semaphore;
import kotlin.collections.EmptyList;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlinx.coroutines.flow.e;
import org.bouncycastle.cms.CMSException;
import org.bouncycastle.tsp.TSPException;
import org.bouncycastle.tsp.TSPValidationException;
import ru.yandex.taxi.navigation.single_guidance_coordinator.GuidanceOwnerId;
import ru.yandex.taxi.superapp.orders.models.ActionType;

/* loaded from: classes4.dex */
public final class hhs0 implements j4u, e170, w7m, cz51, hhw0, iqs, xt {
    public final /* synthetic */ int a;
    public Object b;
    public Object c;

    public hhs0(InputStream inputStream) {
        this.a = 29;
        try {
            l8z0 m = l8z0.m(new j2(inputStream).n());
            this.b = m;
            ige igeVar = m.b;
            if (igeVar != null) {
                try {
                    this.c = new m8z0(new u87(igeVar));
                } catch (CMSException e) {
                    throw new TSPException("TSP parsing error: " + e.getMessage(), e.getCause());
                }
            }
        } catch (ClassCastException e2) {
            throw new TSPException("malformed timestamp response: " + e2, e2);
        } catch (IllegalArgumentException e3) {
            throw new TSPException("malformed timestamp response: " + e3, e3);
        }
    }

    public static void c(hhs0 hhs0Var, BitmapRegionDecoder bitmapRegionDecoder) {
        synchronized (hhs0Var) {
            for (Map.Entry entry : ((ConcurrentHashMap) hhs0Var.c).entrySet()) {
                if (bitmapRegionDecoder == entry.getKey()) {
                    if (((Boolean) entry.getValue()).booleanValue()) {
                        entry.setValue(Boolean.FALSE);
                        ((Semaphore) hhs0Var.b).release();
                        return;
                    }
                    return;
                }
            }
        }
    }

    public static BigDecimal m(BigDecimal bigDecimal) {
        return x(bigDecimal.multiply(BigDecimal.valueOf(0.017453292519943295d)));
    }

    public static Calendar r(BigDecimal bigDecimal, Calendar calendar) {
        if (bigDecimal == null) {
            return null;
        }
        Calendar calendar2 = (Calendar) calendar.clone();
        BigDecimal bigDecimal2 = BigDecimal.ZERO;
        if (bigDecimal.compareTo(bigDecimal2) == -1) {
            bigDecimal = bigDecimal.add(BigDecimal.valueOf(24.0d));
            calendar2.add(11, -24);
        }
        String[] split = bigDecimal.toPlainString().split("\\.");
        int parseInt = Integer.parseInt(split[0]);
        BigDecimal scale = new BigDecimal("0." + split[1]).multiply(BigDecimal.valueOf(60L)).setScale(0, RoundingMode.HALF_EVEN);
        if (scale.intValue() == 60) {
            parseInt++;
        } else {
            bigDecimal2 = scale;
        }
        if (parseInt == 24) {
            parseInt = 0;
        }
        calendar2.set(11, parseInt);
        calendar2.set(12, bigDecimal2.intValue());
        calendar2.set(13, 0);
        calendar2.set(14, 0);
        calendar2.setTimeZone(calendar.getTimeZone());
        return calendar2;
    }

    public static ArrayList s(List list, List list2) {
        Object obj;
        ArrayList arrayList = new ArrayList();
        Iterator it = list2.iterator();
        while (it.hasNext()) {
            tyx0 tyx0Var = (tyx0) it.next();
            Iterator it2 = list.iterator();
            while (true) {
                if (!it2.hasNext()) {
                    obj = null;
                    break;
                }
                obj = it2.next();
                if (tyx0Var.a == ((Address) obj).B().hashCode()) {
                    break;
                }
            }
            Address address = (Address) obj;
            if (address != null) {
                arrayList.add(address);
            }
        }
        return arrayList;
    }

    public static BigDecimal x(BigDecimal bigDecimal) {
        return bigDecimal.setScale(4, RoundingMode.HALF_EVEN);
    }

    @Override // defpackage.w7m
    public void a() {
        h hVar = (h) this.b;
        synchronized (hVar) {
            hVar.c = hVar.a.length;
        }
    }

    @Override // defpackage.cz51
    public Object b(Continuation continuation) {
        Double d;
        BigDecimal bigDecimal;
        pex0 m;
        qze0 qze0Var;
        fef fefVar;
        String str;
        k kVar = (k) ((wiq0) this.b);
        pex0 m2 = kVar.m();
        if (m2 != null) {
            if (m2.K0) {
                List list = m2.U;
                if (list != null) {
                    Iterator it = list.iterator();
                    if (!it.hasNext()) {
                        ny61.p();
                        return null;
                    }
                    Double d2 = ((pex0) it.next()).d();
                    double doubleValue = d2 != null ? d2.doubleValue() : 0.0d;
                    while (it.hasNext()) {
                        Double d3 = ((pex0) it.next()).d();
                        doubleValue = Math.max(doubleValue, d3 != null ? d3.doubleValue() : 0.0d);
                    }
                    d = Double.valueOf(doubleValue);
                } else {
                    d = null;
                }
            } else {
                d = m2.d();
            }
            if (d != null) {
                bigDecimal = new BigDecimal(String.valueOf(d.doubleValue()));
                if (bigDecimal == null || (m = kVar.m()) == null || (qze0Var = m.m) == null || (fefVar = qze0Var.c) == null || (str = fefVar.b) == null) {
                    return null;
                }
                return ((r0) this.c).a(bigDecimal, str, (ContinuationImpl) continuation);
            }
        }
        bigDecimal = null;
        if (bigDecimal == null) {
            return ((r0) this.c).a(bigDecimal, str, (ContinuationImpl) continuation);
        }
        return null;
    }

    @Override // defpackage.e170
    public void d(int i) {
        kt10 kt10Var;
        ImageMessageData imageMessageData = (ImageMessageData) this.c;
        lhs0 lhs0Var = (lhs0) this.b;
        if (lhs0Var.T2) {
            return;
        }
        lhs0Var.T2 = true;
        String f = b.f(imageMessageData.fileId);
        Point a = lhs0Var.V2.a(i - lhs0Var.X2, imageMessageData.width, imageMessageData.height);
        lhv lhvVar = ImageViewerInfo.Companion;
        LocalMessageRef localMessageRef = lhs0Var.g0;
        String f2 = b.f(imageMessageData.fileId);
        String str = imageMessageData.fileName;
        Integer num = imageMessageData.width;
        Integer num2 = imageMessageData.height;
        boolean z = imageMessageData.animated;
        Integer num3 = imageMessageData.fileSource;
        int i2 = a.x;
        int i3 = a.y;
        String str2 = imageMessageData.fileId;
        Long l = imageMessageData.imageSize;
        long longValue = l == null ? 0L : l.longValue();
        Integer valueOf = Integer.valueOf(i2);
        Integer valueOf2 = Integer.valueOf(i3);
        lhvVar.getClass();
        ImageViewerInfo c = lhv.c(f2, z, localMessageRef, num, num2, str, num3, valueOf, valueOf2, str2, longValue);
        lhs0Var.v3 = c;
        lhs0Var.x2.setTransitionName(c.getName());
        boolean z2 = imageMessageData.animated;
        int i4 = a.x;
        int i5 = a.y;
        if (z2) {
            Long l2 = imageMessageData.imageSize;
            kt10Var = new kt10(f, i4, i5, true, l2 != null ? l2.longValue() : 0L, null, imageMessageData.fileSource, Boolean.TRUE);
        } else {
            kt10Var = new kt10(f, i4, i5, false, 0L, null, imageMessageData.fileSource, Boolean.TRUE);
        }
        lhs0Var.C2.d(kt10Var, false);
    }

    public BitmapRegionDecoder e() {
        ((Semaphore) this.b).acquireUninterruptibly();
        synchronized (this) {
            for (Map.Entry entry : ((ConcurrentHashMap) this.c).entrySet()) {
                if (!((Boolean) entry.getValue()).booleanValue()) {
                    entry.setValue(Boolean.TRUE);
                    return (BitmapRegionDecoder) entry.getKey();
                }
            }
            return null;
        }
    }

    public void g(String str) {
        ((ArrayList) this.b).add(str);
    }

    @Override // defpackage.j4u
    public GuidanceOwnerId getId() {
        return (GuidanceOwnerId) this.b;
    }

    public SplitInstallRequest h() {
        return new SplitInstallRequest(this);
    }

    public mru0 i(int i, ar7 ar7Var, ArrayList arrayList, ArrayList arrayList2, jp7 jp7Var, Range range, boolean z) {
        int i2;
        Rect rect;
        ArrayList arrayList3 = new ArrayList();
        String c = ar7Var.c();
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        LinkedHashMap linkedHashMap2 = new LinkedHashMap();
        Iterator it = arrayList2.iterator();
        while (it.hasNext()) {
            j jVar = (j) it.next();
            lru0 lru0Var = jVar.i;
            if (lru0Var == null) {
                ny61.g("Attached stream spec cannot be null for already attached use cases.");
                return null;
            }
            qn7 qn7Var = (qn7) this.c;
            if (qn7Var == null) {
                ny61.r("Required value was null.");
                return null;
            }
            int inputFormat = jVar.h.getInputFormat();
            Size d = jVar.d();
            if (d == null) {
                ny61.g("Attached surface resolution cannot be null for already attached use cases.");
                return null;
            }
            StreamUseCase x = jVar.h.x();
            y yVar = (y) qn7Var.b.get(c);
            d6z.m("No such camera id in supported combination list: ".concat(c), yVar != null);
            x84 l = yVar.l(inputFormat);
            SurfaceConfig$ConfigSource surfaceConfig$ConfigSource = SurfaceConfig$ConfigSource.CAPTURE_SESSION_TABLES;
            StreamUseCase streamUseCase = anw0.e;
            anw0 d2 = xib1.d(inputFormat, d, l, i, surfaceConfig$ConfigSource, x);
            int inputFormat2 = jVar.h.getInputFormat();
            Size d3 = jVar.d();
            q8n b = lru0Var.b();
            ArrayList L = iru0.L(jVar);
            szd d4 = lru0Var.d();
            int intValue = ((Integer) jVar.h.g(xi21.o4, 0)).intValue();
            Range range2 = (Range) jVar.h.g(xi21.p4, lru0.a);
            if (range2 == null) {
                ny61.g("Required value was null.");
                return null;
            }
            Boolean bool = (Boolean) jVar.h.g(xi21.q4, Boolean.FALSE);
            Objects.requireNonNull(bool);
            i34 i34Var = new i34(d2, inputFormat2, d3, b, L, d4, intValue, range2, bool.booleanValue());
            arrayList3.add(i34Var);
            linkedHashMap2.put(i34Var, jVar);
            linkedHashMap.put(jVar, lru0Var);
        }
        Pair pair = new Pair(linkedHashMap, linkedHashMap2);
        Map map = (Map) pair.second;
        HashMap w = qt7.w(arrayList, (zi21) jp7Var.g(jp7.j1, zi21.a), (bo7) this.b, range);
        String c2 = ar7Var.c();
        LinkedHashMap linkedHashMap3 = new LinkedHashMap();
        if (arrayList.isEmpty()) {
            i2 = Integer.MAX_VALUE;
        } else {
            LinkedHashMap linkedHashMap4 = new LinkedHashMap();
            LinkedHashMap linkedHashMap5 = new LinkedHashMap();
            try {
                rect = ar7Var.n();
            } catch (NullPointerException unused) {
                rect = null;
            }
            a0j a0jVar = new a0j(ar7Var, rect != null ? lw01.g(rect) : null);
            Iterator it2 = arrayList.iterator();
            boolean z2 = false;
            while (it2.hasNext()) {
                j jVar2 = (j) it2.next();
                Object obj = w.get(jVar2);
                if (obj == null) {
                    ny61.g("Required value was null.");
                    return null;
                }
                pt7 pt7Var = (pt7) obj;
                HashMap hashMap = w;
                xi21 q = jVar2.q(ar7Var, pt7Var.a, pt7Var.b);
                linkedHashMap4.put(q, jVar2);
                linkedHashMap5.put(q, a0jVar.b(q));
                if (q.m() == 2) {
                    w = hashMap;
                    z2 = true;
                } else {
                    w = hashMap;
                }
            }
            qn7 qn7Var2 = (qn7) this.c;
            if (qn7Var2 == null) {
                ny61.r("Required value was null.");
                return null;
            }
            ArrayList arrayList4 = new ArrayList(map.keySet());
            boolean B = qt7.B(arrayList);
            d6z.m("No new use cases to be bound.", !linkedHashMap5.isEmpty());
            y yVar2 = (y) qn7Var2.b.get(c2);
            d6z.m("No such camera id in supported combination list: ".concat(c2), yVar2 != null);
            bow0 j = yVar2.j(i, arrayList4, linkedHashMap5, z2, B, z);
            HashMap hashMap2 = j.a;
            HashMap hashMap3 = j.b;
            i2 = j.c;
            for (Map.Entry entry : linkedHashMap4.entrySet()) {
                Object value = entry.getValue();
                Object obj2 = hashMap2.get(entry.getKey());
                if (obj2 == null) {
                    ny61.g("Required value was null.");
                    return null;
                }
                linkedHashMap3.put(value, obj2);
            }
            for (Map.Entry entry2 : hashMap3.entrySet()) {
                if (map.containsKey(entry2.getKey())) {
                    Object obj3 = map.get(entry2.getKey());
                    if (obj3 == null) {
                        ny61.g("Required value was null.");
                        return null;
                    }
                    linkedHashMap3.put(obj3, entry2.getValue());
                }
            }
        }
        return new mru0(kotlin.collections.b.n((Map) pair.first, linkedHashMap3), i2);
    }

    @Override // defpackage.xt
    public void j(String str, ActionType actionType) {
        ((com.yandex.go.taxi.order.superapp.orders.ui.b) this.b).U.accept(actionType, (q6y0) this.c);
    }

    public BigDecimal k(fc61 fc61Var, Calendar calendar, boolean z) {
        c9v c9vVar = (c9v) this.b;
        TimeZone timeZone = (TimeZone) this.c;
        calendar.setTimeZone(timeZone);
        BigDecimal valueOf = BigDecimal.valueOf(z ? 6 : 18);
        BigDecimal bigDecimal = (BigDecimal) c9vVar.c;
        BigDecimal valueOf2 = BigDecimal.valueOf(15L);
        RoundingMode roundingMode = RoundingMode.HALF_EVEN;
        BigDecimal x = x(new BigDecimal(calendar.get(6)).add(valueOf.subtract(bigDecimal.divide(valueOf2, 4, roundingMode)).divide(BigDecimal.valueOf(24L), 4, roundingMode)));
        BigDecimal x2 = x(x(new BigDecimal("0.9856").multiply(x)).subtract(new BigDecimal("3.289")));
        BigDecimal add = x2.add(x(new BigDecimal(Math.sin(m(x2).doubleValue())).multiply(new BigDecimal("1.916")))).add(x(new BigDecimal(Math.sin(x(m(x2).multiply(BigDecimal.valueOf(2L))).doubleValue())).multiply(new BigDecimal("0.020"))).add(new BigDecimal("282.634")));
        if (add.doubleValue() > 360.0d) {
            add = add.subtract(BigDecimal.valueOf(360L));
        }
        BigDecimal x3 = x(add);
        BigDecimal x4 = x(BigDecimal.valueOf(Math.sin(m(x3).doubleValue())).multiply(new BigDecimal("0.39782")));
        BigDecimal x5 = x(BigDecimal.valueOf(Math.cos(BigDecimal.valueOf(Math.asin(x4.doubleValue())).doubleValue())));
        BigDecimal valueOf3 = BigDecimal.valueOf(Math.cos(m(fc61Var.a).doubleValue()));
        BigDecimal bigDecimal2 = (BigDecimal) c9vVar.b;
        BigDecimal x6 = x(valueOf3.subtract(x4.multiply(BigDecimal.valueOf(Math.sin(m(bigDecimal2).doubleValue())))).divide(x5.multiply(BigDecimal.valueOf(Math.cos(m(bigDecimal2).doubleValue()))), 4, roundingMode));
        if (x6.doubleValue() < -1.0d || x6.doubleValue() > 1.0d) {
            return null;
        }
        BigDecimal x7 = x(x(BigDecimal.valueOf(Math.acos(x6.doubleValue()))).multiply(new BigDecimal(57.29577951308232d)));
        if (z) {
            x7 = BigDecimal.valueOf(360L).subtract(x7);
        }
        BigDecimal divide = x7.divide(BigDecimal.valueOf(15L), 4, roundingMode);
        BigDecimal x8 = x(x(new BigDecimal(Math.atan(m(x(x(new BigDecimal(Math.tan(m(x3).doubleValue())).multiply(new BigDecimal(57.29577951308232d))).multiply(new BigDecimal("0.91764")))).doubleValue())).multiply(new BigDecimal(57.29577951308232d))));
        if (x8.doubleValue() < 0.0d) {
            x8 = x8.add(BigDecimal.valueOf(360L));
        } else if (x8.doubleValue() > 360.0d) {
            x8 = x8.subtract(BigDecimal.valueOf(360L));
        }
        BigDecimal valueOf4 = BigDecimal.valueOf(90L);
        RoundingMode roundingMode2 = RoundingMode.FLOOR;
        BigDecimal subtract = divide.add(x8.add(x3.divide(valueOf4, 0, roundingMode2).multiply(valueOf4).subtract(x8.divide(valueOf4, 0, roundingMode2).multiply(valueOf4))).divide(BigDecimal.valueOf(15L), 4, roundingMode)).subtract(x.multiply(new BigDecimal("0.06571"))).subtract(new BigDecimal("6.622"));
        if (subtract.doubleValue() < 0.0d) {
            subtract = subtract.add(BigDecimal.valueOf(24L));
        } else if (subtract.doubleValue() > 24.0d) {
            subtract = subtract.subtract(BigDecimal.valueOf(24L));
        }
        BigDecimal add2 = x(subtract).subtract(((BigDecimal) c9vVar.c).divide(BigDecimal.valueOf(15L), 4, roundingMode)).add(new BigDecimal(calendar.get(15)).divide(new BigDecimal(Constants.ONE_HOUR), new MathContext(2)));
        if (timeZone.inDaylightTime(calendar.getTime())) {
            add2 = add2.add(BigDecimal.ONE);
        }
        return add2.doubleValue() > 24.0d ? add2.subtract(BigDecimal.valueOf(24L)) : add2;
    }

    @Override // defpackage.w7m
    public void l(b16 b16Var, Bitmap bitmap) {
        IOException iOException = ((kjo) this.c).b;
        if (iOException != null) {
            if (bitmap == null) {
                throw iOException;
            }
            b16Var.c(bitmap);
            throw iOException;
        }
    }

    public List n() {
        return (List) this.c;
    }

    public List o() {
        return (ArrayList) this.b;
    }

    @Override // defpackage.iqs
    public void onFailure(Throwable th) {
        switch (this.a) {
            case 18:
                int i = ((enw0) this.b).f;
                if (i != 2 || !(th instanceof CancellationException)) {
                    nkb1.a(i);
                    sgb1.g(5, "SurfaceProcessorNode");
                    break;
                } else {
                    sgb1.g(3, "SurfaceProcessorNode");
                    break;
                }
                break;
            default:
                z7x0 z7x0Var = (z7x0) this.c;
                md6 md6Var = (md6) this.b;
                if (!((n9j0) md6Var.c).g) {
                    int b = ((s38) ((ArrayList) md6Var.b).get(0)).b();
                    boolean z = th instanceof ImageCaptureException;
                    ycv ycvVar = z7x0Var.c;
                    if (z) {
                        y84 y84Var = new y84(b, (ImageCaptureException) th);
                        ycvVar.getClass();
                        tob1.b();
                        ycvVar.e.l.accept(y84Var);
                    } else {
                        y84 y84Var2 = new y84(b, new ImageCaptureException(2, "Failed to submit capture request", th));
                        ycvVar.getClass();
                        tob1.b();
                        ycvVar.e.l.accept(y84Var2);
                    }
                    z7x0Var.b.j();
                    break;
                }
                break;
        }
    }

    @Override // defpackage.iqs
    public void onSuccess(Object obj) {
        switch (this.a) {
            case 18:
                qnw0 qnw0Var = (qnw0) obj;
                qnw0Var.getClass();
                try {
                    ((DefaultSurfaceProcessor) ((cjw0) this.c).a).onOutputSurface(qnw0Var);
                    break;
                } catch (ProcessingException e) {
                    sgb1.e("SurfaceProcessorNode", "Failed to send SurfaceOutput to SurfaceProcessor.", e);
                    return;
                }
            default:
                ((z7x0) this.c).b.j();
                break;
        }
    }

    public c490 p() {
        s1 s1Var = ((l8z0) this.b).a.c;
        if (s1Var != null) {
            return new c490(s1Var.x(), s1Var.e());
        }
        return null;
    }

    public Integer q() {
        return (Integer) this.b;
    }

    @Override // defpackage.j4u
    public void stopGuidance() {
        ((ihs0) this.c).a.invoke();
    }

    public Integer t() {
        return (Integer) this.c;
    }

    public int u() {
        return ((l8z0) this.b).a.a.x().intValue();
    }

    public String v() {
        l8z0 l8z0Var = (l8z0) this.b;
        if (l8z0Var.a.b == null) {
            return null;
        }
        StringBuffer stringBuffer = new StringBuffer();
        d490 d490Var = l8z0Var.a.b;
        for (int i = 0; i != d490Var.a.size(); i++) {
            stringBuffer.append(((rqf) d490Var.a.A(i)).f());
        }
        return stringBuffer.toString();
    }

    public void w(cat0 cat0Var) {
        Object ibt0Var;
        cbt0 cbt0Var = (cbt0) this.c;
        mbt0 mbt0Var = (mbt0) this.b;
        mbt0Var.getClass();
        if (cat0Var.equals(bat0.a)) {
            ibt0Var = jbt0.a;
        } else {
            if (!(cat0Var instanceof aat0)) {
                w511.b();
                return;
            }
            ibt0Var = new ibt0(((aat0) cat0Var).a);
        }
        kotlinx.coroutines.flow.r0 r0Var = cbt0Var.a;
        r0Var.getClass();
        r0Var.m(null, ibt0Var);
    }

    public void y(String str) {
        zow0 zow0Var = (zow0) this.b;
        String str2 = (String) this.c;
        zow0Var.getClass();
        HashMap hashMap = new HashMap();
        hashMap.put("open_reason", str2);
        hashMap.put("button_name", str);
        zow0Var.a.a("SurgeCard.Tapped", hashMap, 1, new HashMap());
    }

    public void z(j8z0 j8z0Var) {
        i8z0 i8z0Var = j8z0Var.a;
        m8z0 m8z0Var = (m8z0) this.c;
        if (m8z0Var == null) {
            if (u() == 0 || u() == 1) {
                throw new TSPValidationException("no time stamp token found and one expected.");
            }
            return;
        }
        acs0 acs0Var = m8z0Var.b;
        zxs0 zxs0Var = m8z0Var.c;
        l2 l2Var = i8z0Var.c;
        BigInteger x = l2Var != null ? l2Var.x() : null;
        nt10 nt10Var = i8z0Var.b;
        if (x != null) {
            l2 l2Var2 = i8z0Var.c;
            BigInteger x2 = l2Var2 != null ? l2Var2.x() : null;
            l2 l2Var3 = ((p4x0) zxs0Var.a).A;
            if (!x2.equals(l2Var3 != null ? l2Var3.x() : null)) {
                throw new TSPValidationException("response contains wrong nonce value.");
            }
        }
        if (u() != 0 && u() != 1) {
            throw new TSPValidationException("time stamp token found in failed request.");
        }
        if (!rza1.c(rza1.b(nt10Var.b), rza1.b(((p4x0) zxs0Var.a).c.b))) {
            throw new TSPValidationException("response for different message imprint digest.");
        }
        if (!zxs0Var.p().q(nt10Var.a.a)) {
            throw new TSPValidationException("response for different message imprint algorithm.");
        }
        vc3 c = acs0Var.getSignedAttributes().c(b490.G3);
        vc3 c2 = acs0Var.getSignedAttributes().c(b490.I3);
        if (c == null && c2 == null) {
            throw new TSPValidationException("no signing certificate attribute present.");
        }
    }

    public /* synthetic */ hhs0(int i, Object obj, Object obj2) {
        this.a = i;
        this.b = obj;
        this.c = obj2;
    }

    public /* synthetic */ hhs0(Object obj, Object obj2, boolean z, int i) {
        this.a = i;
        this.c = obj;
        this.b = obj2;
    }

    public hhs0(zuj0 zuj0Var) {
        this.a = 24;
        kotlinx.coroutines.flow.r0 c = bvf0.c(new uyx0(((avj0) zuj0Var).h(kyh0.order_edit_route_point), 0, EmptyList.a));
        this.b = c;
        this.c = e.d(c);
    }

    public hhs0(trv0 trv0Var, jhu0 jhu0Var, tse tseVar) {
        this.a = 20;
        this.b = jhu0Var;
        this.c = com.yandex.go.coroutines.b.d(new com.yandex.go.summary.interactor.common.state.j(trv0Var.b(tseVar), this), new SurgeWidgetUiStateInteractor$special$$inlined$start$1(2, null));
    }

    public hhs0(ihs0 ihs0Var) {
        this.a = 0;
        this.c = ihs0Var;
        this.b = GuidanceOwnerId.AUTO_NAVIGATION;
    }

    public hhs0(bo7 bo7Var) {
        this.a = 10;
        this.b = bo7Var;
        this.c = null;
    }

    public hhs0(com.yandex.go.superapp.discovery.map.impl.domain.interactors.y yVar) {
        this.a = 13;
        this.c = yVar;
    }

    public hhs0(int i) {
        this.a = i;
        switch (i) {
            case 6:
                this.b = new ArrayList();
                this.c = new ArrayList();
                break;
            default:
                this.b = new Semaphore(0, true);
                this.c = new ConcurrentHashMap();
                break;
        }
    }
}
