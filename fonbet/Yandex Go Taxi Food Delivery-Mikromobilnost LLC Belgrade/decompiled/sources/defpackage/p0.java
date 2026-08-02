package defpackage;

import android.view.ViewGroup;
import androidx.compose.animation.i;
import androidx.compose.animation.k;
import androidx.compose.ui.semantics.f;
import com.pdfview.subsamplincscaleimageview.SubsamplingScaleImageView;
import com.squareup.moshi.JsonDataException;
import com.squareup.moshi.JsonEncodingException;
import com.squareup.moshi.JsonReader;
import com.squareup.moshi.Moshi;
import com.yandex.mobile.drive.core.network.ResponseError;
import com.yandex.mobile.drive.core.network.b;
import com.yandex.mobile.drive.sdk.full.Environment;
import com.yandex.mobile.drive.sdk.full.internal.DriveException;
import com.yandex.mobile.drive.sdk.full.model.Car;
import com.yandex.mobile.drive.sdk.full.model.CarsMeta;
import com.yandex.mobile.drive.sdk.full.model.RideSession;
import com.yandex.mobile.drive.sdk.full.model.Segment;
import com.yandex.mobile.drive.sdk.full.model.Session;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.concurrent.ExecutorService;
import kotlin.Pair;
import kotlin.jvm.internal.Ref$ObjectRef;
import kotlin.text.Regex;
import kotlinx.coroutines.channels.BufferOverflow;
import kotlinx.serialization.modules.a;
import ru.CryptoPro.JCP.tools.CertReader.Extension;
import ru.yandex.taxi.design.ListItemComponent;
import ru.yandex.taxi.design.ListItemSwitchComponent;

/* loaded from: classes12.dex */
public final /* synthetic */ class p0 implements tls {
    public final /* synthetic */ int a;

    public /* synthetic */ p0(int i) {
        this.a = i;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r2v27 */
    /* JADX WARN: Type inference failed for: r2v28 */
    /* JADX WARN: Type inference failed for: r2v32, types: [r4u] */
    /* JADX WARN: Type inference failed for: r2v34 */
    /* JADX WARN: Type inference failed for: r3v16 */
    /* JADX WARN: Type inference failed for: r3v17 */
    @Override // defpackage.tls
    public final Object invoke(Object obj) {
        kwu kwuVar;
        String d;
        List<RideSession> sessions;
        Car car;
        Object obj2;
        Object obj3;
        ResponseError.Details details;
        int i = this.a;
        ?? r3 = 1;
        String str = null;
        int i2 = 0;
        zy11 zy11Var = zy11.a;
        switch (i) {
            case 0:
                f.d((mnq0) obj);
                return zy11Var;
            case 1:
                ExecutorService executorService = g1.a;
                t4j0 t4j0Var = new t4j0();
                String d2 = cha1.d();
                try {
                    jwu jwuVar = new jwu();
                    jwuVar.i(null, d2);
                    kwuVar = jwuVar.e();
                } catch (IllegalArgumentException unused) {
                    kwuVar = null;
                }
                jwu g = kwuVar != null ? kwuVar.g() : null;
                HashMap hashMap = new HashMap();
                if (g != null) {
                    Environment environment = (Environment) bfm.i.a.get();
                    if (environment == null) {
                        environment = Environment.STABLE;
                    }
                    if (environment == Environment.QA) {
                        g.d("backend_cluster", "qa");
                    }
                    for (Map.Entry entry : hashMap.entrySet()) {
                        String str2 = (String) entry.getKey();
                        String str3 = (String) entry.getValue();
                        if (str3 == null) {
                            str3 = "";
                        }
                        g.d(str2, str3);
                    }
                    d = g.e().i;
                } else {
                    d = cha1.d();
                    for (Map.Entry entry2 : hashMap.entrySet()) {
                        if (!cvu0.s(d, "?", false)) {
                            d = ((Object) d) + "?";
                        }
                        d = ((Object) d) + entry2.getKey() + "=" + entry2.getValue() + "&";
                    }
                }
                t4j0Var.h(d);
                for (Map.Entry entry3 : bfm.i.b().entrySet()) {
                    t4j0Var.a((String) entry3.getKey(), (String) entry3.getValue());
                }
                kvj0 execute = ((nci0) g1.b.newCall(new d5j0(t4j0Var))).execute();
                rvj0 rvj0Var = execute.z;
                int i3 = execute.w;
                if (rvj0Var != null) {
                    try {
                        String string = rvj0Var.string();
                        rvj0Var.close();
                        if (string != null) {
                            if (i3 != 200) {
                                throw new DriveException(i3, oyr.k(i3, "Incorrect status code. Status code: ", ". Body: ", string), null);
                            }
                            Session session = (Session) new u3u().c(Session.class, string);
                            if (session != null && (sessions = session.getSessions()) != null) {
                                for (RideSession rideSession : sessions) {
                                    List cars = session.getCars();
                                    if (cars != null) {
                                        Iterator it = cars.iterator();
                                        while (true) {
                                            if (it.hasNext()) {
                                                obj2 = it.next();
                                                String number = ((Car) obj2).getNumber();
                                                Segment segment = rideSession.getSegment();
                                                if (jl40.l(number, segment != null ? segment.getCarNumber() : null)) {
                                                }
                                            } else {
                                                obj2 = null;
                                            }
                                        }
                                        car = (Car) obj2;
                                    } else {
                                        car = null;
                                    }
                                    rideSession.getClass();
                                    if (car != null) {
                                        CarsMeta carsMeta = session.getCarsMeta();
                                        car.b(carsMeta != null ? carsMeta.getViews() : null);
                                    }
                                }
                            }
                            return session != null ? new f0k0(new Pair(session, string)) : new lzj0(new DriveException(200, "Response object is null and can't be parsed.", null));
                        }
                    } catch (Throwable th) {
                        try {
                            throw th;
                        } catch (Throwable th2) {
                            ooc.g(rvj0Var, th);
                            throw th2;
                        }
                    }
                }
                w511.s("Body is null.");
                return null;
            case 2:
                kvj0 kvj0Var = (kvj0) obj;
                d5j0 d5j0Var = kvj0Var.a;
                i3y i3yVar = b.a;
                if (kvj0Var.J) {
                    kvj0Var.close();
                    String str4 = d5j0Var.a.i;
                    return new gvj0();
                }
                rvj0 rvj0Var2 = kvj0Var.z;
                if (rvj0Var2 == null) {
                    ny61.g("only response from NetworkClient should be used");
                    return null;
                }
                String a = kvj0Var.y.a("Use-Custom-Compression");
                ?? r2 = a != null && Boolean.parseBoolean(a);
                qq6 source = rvj0Var2.source();
                if (r2 != false) {
                    source = new r4u(source);
                }
                try {
                    obj3 = ((Moshi) b.a.getValue()).adapter(ResponseError.class).fromJson(JsonReader.of(new jci0(source)));
                } catch (JsonDataException | JsonEncodingException unused2) {
                    obj3 = null;
                }
                ResponseError responseError = (ResponseError) obj3;
                int i4 = kvj0Var.w;
                String str5 = d5j0Var.a.i;
                long j = kvj0Var.E;
                long j2 = kvj0Var.F;
                fwj0 fwj0Var = new fwj0(j, j2, str5, i4);
                Pair pair = new Pair("url", str5);
                Pair pair2 = new Pair("http_code", Integer.valueOf(i4));
                Pair pair3 = new Pair("response_time", Long.valueOf((j2 - j) / 1000));
                if (responseError != null && (details = responseError.getDetails()) != null) {
                    str = details.getUiMessage();
                }
                HashMap h = kotlin.collections.b.h(pair, pair2, pair3, new Pair("error_message", str != null ? str : ""), new Pair("no_internet", Boolean.valueOf(responseError == null)));
                qgn0 qgn0Var = h2b1.c;
                if (qgn0Var != null) {
                    qgn0Var.n("response_error", h);
                }
                return new evj0(responseError, fwj0Var);
            case 3:
                return kp50.i();
            case 4:
                Pair pair4 = (Pair) obj;
                return ((String) pair4.getFirst()) + Extension.COLON_SPACE + pair4.getSecond();
            case 5:
                ((bl1) obj).a.r(new qu(9));
                return zy11Var;
            case 6:
                c2n0 c2n0Var = ((kox0) obj).a;
                c2n0Var.r(new qu(9));
                ((jox0) c2n0Var.F).invoke();
                return zy11Var;
            case 7:
                Regex regex = gtu0.a;
                return cvu0.v((String) obj, "\n", " ", false);
            case 8:
                return qoi0.a(((lt) obj).getClass());
            case 9:
                ListItemSwitchComponent listItemSwitchComponent = new ListItemSwitchComponent(((ViewGroup) obj).getContext(), null, 0, 6, null);
                listItemSwitchComponent.setLayoutParams(new ViewGroup.LayoutParams(-1, -2));
                return listItemSwitchComponent;
            case 10:
                ((a) obj).g(qoi0.a(nrq.class), new rx());
                return zy11Var;
            case 11:
                n70 n70Var = (n70) obj;
                Ref$ObjectRef ref$ObjectRef = new Ref$ObjectRef();
                n70Var.W(new y00(n70Var, ref$ObjectRef));
                n70Var.b0(new z00(i2, ref$ObjectRef));
                return zy11Var;
            case 12:
                return ((q5f) obj).getId();
            case 13:
                return ((l5f) obj).getId();
            case 14:
                ad0 ad0Var = (ad0) obj;
                return new Pair(ad0Var.a, ad0Var.b);
            case 15:
                ListItemComponent listItemComponent = new ListItemComponent(((ViewGroup) obj).getContext(), null, 0, 6, null);
                nzs.s(listItemComponent, -1, -2);
                return listItemComponent;
            case 16:
                return new wt((ListItemComponent) obj, r3 == true ? 1 : 0);
            case 17:
                ((sy60) obj).a();
                return zy11Var;
            case 18:
                ((sy60) obj).a();
                return zy11Var;
            case 19:
                ListItemComponent listItemComponent2 = new ListItemComponent(((ViewGroup) obj).getContext(), null, 0, 6, null);
                listItemComponent2.setLayoutParams(new ViewGroup.LayoutParams(-1, -2));
                listItemComponent2.setMinimumHeight(tje.u(56, listItemComponent2.getContext()));
                listItemComponent2.setSubtitle((CharSequence) null);
                listItemComponent2.setTitleEllipsizeMode(1);
                listItemComponent2.setTitleMaxLines(1);
                listItemComponent2.setTitleTextSizePx((int) tje.b0(listItemComponent2.getContext(), 16.0f));
                listItemComponent2.setTitleTypeface(0);
                listItemComponent2.setTrailMode(1);
                return listItemComponent2;
            case 20:
                ((kg0) obj).getClass();
                return zy11Var;
            case 21:
                return qoi0.a(((xh0) obj).getClass());
            case 22:
                return Integer.valueOf(-((Integer) obj).intValue());
            case 23:
                return new i(k.n(sb2.K(SubsamplingScaleImageView.ORIENTATION_180, 0, null, 6), new ur70(29)), k.s(sb2.K(SubsamplingScaleImageView.ORIENTATION_180, 0, null, 6), new p0(22)));
            case 24:
                yfd yfdVar = (yfd) obj;
                ((agd) yfdVar).e = new p0(25);
                fpb1.e(yfdVar, null);
                d2d.a.getClass();
                ((agd) yfdVar).g = d2d.b;
                return zy11Var;
            case 26:
                ((sy60) obj).a();
            case 25:
                return zy11Var;
            case 27:
                ((sy60) obj).a();
                return zy11Var;
            case 28:
                return ffx.b(0, 1, BufferOverflow.DROP_OLDEST);
            default:
                yfd yfdVar2 = (yfd) obj;
                ((agd) yfdVar2).f = me4.a;
                agd agdVar = (agd) yfdVar2;
                agdVar.c = new g92(2, zy11Var);
                agdVar.e = new j01(i2);
                h2d.a.getClass();
                agdVar.g = h2d.b;
                return zy11Var;
        }
    }
}
