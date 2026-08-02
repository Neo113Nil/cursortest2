package defpackage;

import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.graphics.Bitmap;
import android.media.MediaCodec;
import android.media.MediaFormat;
import android.net.Uri;
import android.os.Bundle;
import android.os.Handler;
import android.os.Looper;
import android.view.Surface;
import com.adjust.sdk.Constants;
import com.squareup.moshi.JsonReader;
import com.yandex.mobile.ads.common.AdActivity;
import com.yandex.payment.sdk.core.data.PaymentSdkEnvironment;
import com.ybsdk.core.analytics.generated.AppAnalyticsReporter;
import com.ybsdk.rconfig.YbWebPostMessagesDeeplinks;
import java.io.ByteArrayInputStream;
import java.nio.ByteBuffer;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.concurrent.Executor;
import java.util.concurrent.atomic.AtomicInteger;
import kotlin.Pair;
import kotlin.Result;
import kotlin.collections.a;
import kotlin.collections.b;
import kotlin.jvm.internal.Ref$ObjectRef;
import kotlin.text.Regex;
import kotlinx.coroutines.channels.BufferOverflow;
import kotlinx.coroutines.flow.e;
import kotlinx.coroutines.flow.n0;
import org.json.JSONObject;
import ru.cprocsp.ACSP.tools.common.ACSPConstants;
import yads.hm2;
import yads.jk3;
import yads.me;
import yads.tl0;
import yads.uj1;
import yads.w4;
import yads.xz;

/* loaded from: classes7.dex */
public final class mj31 implements ca41, ku71, mb71, fj81, wf81, f291, ss81, on61, hz61 {
    public final /* synthetic */ int a;
    public Object b;
    public Object c;
    public Object w;

    public mj31(Context context, int i) {
        h0w h0wVar;
        ys81 ys81Var;
        this.a = i;
        switch (i) {
            case 19:
                h0w h0wVar2 = jaa1.b;
                if (h0wVar2 == null) {
                    synchronized (h0w.w) {
                        Context applicationContext = context.getApplicationContext();
                        applicationContext = applicationContext == null ? context : applicationContext;
                        h0wVar = jaa1.b;
                        if (h0wVar == null) {
                            h0wVar = new h0w(applicationContext);
                            jaa1.b = h0wVar;
                        }
                    }
                    h0wVar2 = h0wVar;
                }
                et71 et71Var = new et71();
                gg71 gg71Var = new gg71(context);
                this.b = h0wVar2;
                this.c = et71Var;
                this.w = gg71Var;
                return;
            default:
                ys81 ys81Var2 = ys81.b;
                if (ys81Var2 == null) {
                    synchronized (ys81.a) {
                        ys81Var = ys81.b;
                        if (ys81Var == null) {
                            ys81Var = new ys81();
                            ys81.b = ys81Var;
                        }
                    }
                    ys81Var2 = ys81Var;
                }
                this.c = ys81Var2;
                int i2 = cs71.b;
                String obj = toString();
                this.w = obj == null ? "" : obj;
                this.b = context.getApplicationContext();
                return;
        }
    }

    private final void v() {
    }

    @Override // defpackage.f291, defpackage.hz61
    /* renamed from: a, reason: collision with other method in class */
    public void mo492a() {
        switch (this.a) {
            case 20:
                mc3 mc3Var = (mc3) this.b;
                s421 s421Var = (s421) this.w;
                if (!((ArrayList) s421Var.x).isEmpty()) {
                    ArrayList arrayList = (ArrayList) s421Var.x;
                    j18 j18Var = mc3Var.b;
                    if (j18Var.t() instanceof mf60) {
                        j18Var.resumeWith(new fg71(arrayList));
                        break;
                    }
                } else {
                    String message = new tl0().getMessage();
                    if (message == null) {
                        message = "Ad request completed successfully, but there are no ads available.";
                    }
                    vuz vuzVar = new vuz(message);
                    j18 j18Var2 = mc3Var.b;
                    if (j18Var2.t() instanceof mf60) {
                        j18Var2.resumeWith(new bd71(vuzVar));
                        break;
                    }
                }
                break;
            case 22:
                d881 d881Var = (d881) this.c;
                xrr xrrVar = (xrr) this.w;
                fe81 fe81Var = (fe81) xrrVar.z;
                ai71 ai71Var = new ai71();
                mj31 mj31Var = (mj31) xrrVar.x;
                Context context = (Context) this.b;
                mj31Var.q(context, d881Var, (nr41) xrrVar.A);
                mj31Var.getClass();
                Map f = b.f();
                if (!ym11.h(f)) {
                    f = null;
                }
                if (f == null) {
                    new LinkedHashMap();
                }
                hn71 d = ai71Var.d(fe81Var, d881Var, null);
                d.r("success", ACSPConstants.STATUS);
                mj31Var.s(context, d881Var, hm2.g, d);
                break;
            case 27:
                break;
            default:
                d881 d881Var2 = (d881) this.c;
                xrr xrrVar2 = (xrr) this.w;
                fe81 fe81Var2 = (fe81) xrrVar2.z;
                ai71 ai71Var2 = new ai71();
                mj31 mj31Var2 = (mj31) xrrVar2.x;
                Context context2 = (Context) this.b;
                mj31Var2.q(context2, d881Var2, (nr41) xrrVar2.A);
                mj31Var2.getClass();
                Map f2 = b.f();
                if (!ym11.h(f2)) {
                    f2 = null;
                }
                if (f2 == null) {
                    new LinkedHashMap();
                }
                hn71 d2 = ai71Var2.d(fe81Var2, d881Var2, null);
                d2.r("success", ACSPConstants.STATUS);
                mj31Var2.s(context2, d881Var2, hm2.g, d2);
                break;
        }
    }

    @Override // defpackage.ss81
    public int b() {
        return ((MediaCodec) this.b).dequeueInputBuffer(0L);
    }

    @Override // defpackage.hz61
    public void c() {
        Object failure;
        nr41 nr41Var = (nr41) this.w;
        AdActivity adActivity = (AdActivity) this.b;
        lk81 lk81Var = (lk81) this.c;
        nr41Var.getClass();
        cf71 cf71Var = (cf71) nr41Var.b;
        z181 z181Var = lk81Var.e;
        if (z181Var == null) {
            return;
        }
        try {
            adActivity.startActivityForResult(z181Var.a, 0);
            failure = zy11.a;
            hn71 a = ((f571) cf71Var.c).a(lk81Var.b, lk81Var.a);
            Map map = (Map) a.b;
            ((ge71) cf71Var.b).c(new zj71("activity_result_opened", new LinkedHashMap(map), (no61) a.c));
            z181Var.b.invoke();
            adActivity.finish();
        } catch (Throwable th) {
            failure = new Result.Failure(th);
        }
        Throwable a2 = Result.a(failure);
        if (a2 != null) {
            adActivity.finish();
            ((ge71) cf71Var.b).d("Failed to register ActivityResult", a2);
            z181Var.c.invoke(a2);
        }
    }

    @Override // defpackage.ss81
    public void d(boolean z, int i) {
        ((MediaCodec) this.b).releaseOutputBuffer(i, z);
    }

    @Override // defpackage.ss81
    public ByteBuffer e(int i) {
        return rf71.a >= 21 ? ((MediaCodec) this.b).getInputBuffer(i) : ((ByteBuffer[]) this.c)[i];
    }

    @Override // defpackage.on61
    public void f(dl81 dl81Var) {
        long a;
        long j;
        lo61 lo61Var = (lo61) this.c;
        if (lo61Var == null) {
            ny61.k();
            return;
        }
        int i = rf71.a;
        synchronized (lo61Var) {
            try {
                long j2 = lo61Var.c;
                a = j2 != -9223372036854775807L ? j2 + lo61Var.b : lo61Var.a();
            } catch (Throwable th) {
                throw th;
            }
        }
        lo61 lo61Var2 = (lo61) this.c;
        synchronized (lo61Var2) {
            j = lo61Var2.b;
        }
        if (a == -9223372036854775807L || j == -9223372036854775807L) {
            return;
        }
        qd81 qd81Var = (qd81) this.b;
        if (j != qd81Var.I) {
            da81 da81Var = new da81(qd81Var);
            da81Var.o = j;
            qd81 qd81Var2 = new qd81(da81Var);
            this.b = qd81Var2;
            ((fb81) this.w).k(qd81Var2);
        }
        int i2 = dl81Var.c - dl81Var.b;
        ((fb81) this.w).a(i2, dl81Var);
        ((fb81) this.w).b(a, 1, i2, 0, null);
    }

    @Override // defpackage.ss81
    public void flush() {
        ((MediaCodec) this.b).flush();
    }

    @Override // defpackage.on61
    public void g(lo61 lo61Var, yg71 yg71Var, xi11 xi11Var) {
        this.c = lo61Var;
        xi11Var.a();
        xi11Var.b();
        fb81 l = yg71Var.l(xi11Var.d, 5);
        this.w = l;
        l.k((qd81) this.b);
    }

    @Override // defpackage.ss81
    public void h(int i, l271 l271Var, long j) {
        ((MediaCodec) this.b).queueSecureInputBuffer(i, 0, l271Var.i, j, 0);
    }

    @Override // defpackage.ss81
    public void i(uj1 uj1Var, Handler handler) {
        ((MediaCodec) this.b).setOnFrameRenderedListener(new w871(this, uj1Var, 0), handler);
    }

    @Override // defpackage.wf81
    public void j(jk3 jk3Var) {
        switch (this.a) {
            case 11:
                uio0 uio0Var = (uio0) this.b;
                HashMap hashMap = (HashMap) this.c;
                if (((AtomicInteger) uio0Var.e).decrementAndGet() == 0) {
                    ((wb71) uio0Var.b).a(hashMap);
                    break;
                }
                break;
            default:
                ((lc71) this.c).a();
                break;
        }
    }

    @Override // defpackage.ss81
    public int k(MediaCodec.BufferInfo bufferInfo) {
        int dequeueOutputBuffer;
        MediaCodec mediaCodec = (MediaCodec) this.b;
        do {
            dequeueOutputBuffer = mediaCodec.dequeueOutputBuffer(bufferInfo, 0L);
            if (dequeueOutputBuffer == -3 && rf71.a < 21) {
                this.w = mediaCodec.getOutputBuffers();
            }
        } while (dequeueOutputBuffer == -3);
        return dequeueOutputBuffer;
    }

    @Override // defpackage.ss81
    public void l(int i, int i2, long j, int i3) {
        ((MediaCodec) this.b).queueInputBuffer(i, 0, i2, j, i3);
    }

    @Override // defpackage.ss81
    public ByteBuffer m(int i) {
        return rf71.a >= 21 ? ((MediaCodec) this.b).getOutputBuffer(i) : ((ByteBuffer[]) this.w)[i];
    }

    @Override // defpackage.f291
    public void n(qb71 qb71Var) {
        switch (this.a) {
            case 22:
                d881 d881Var = (d881) this.c;
                xrr xrrVar = (xrr) this.w;
                fe81 fe81Var = (fe81) xrrVar.z;
                ai71 ai71Var = new ai71();
                mj31 mj31Var = (mj31) xrrVar.x;
                Context context = (Context) this.b;
                mj31Var.q(context, d881Var, (nr41) xrrVar.A);
                mj31Var.getClass();
                Map f = b.f();
                if ((ym11.h(f) ? f : null) == null) {
                    new LinkedHashMap();
                }
                hn71 d = ai71Var.d(fe81Var, d881Var, qb71Var);
                d.r("success", ACSPConstants.STATUS);
                mj31Var.s(context, d881Var, hm2.g, d);
                break;
            default:
                d881 d881Var2 = (d881) this.c;
                xrr xrrVar2 = (xrr) this.w;
                fe81 fe81Var2 = (fe81) xrrVar2.z;
                ai71 ai71Var2 = new ai71();
                mj31 mj31Var2 = (mj31) xrrVar2.x;
                Context context2 = (Context) this.b;
                mj31Var2.q(context2, d881Var2, (nr41) xrrVar2.A);
                mj31Var2.getClass();
                Map f2 = b.f();
                if ((ym11.h(f2) ? f2 : null) == null) {
                    new LinkedHashMap();
                }
                hn71 d2 = ai71Var2.d(fe81Var2, d881Var2, qb71Var);
                d2.r("success", ACSPConstants.STATUS);
                mj31Var2.s(context2, d881Var2, hm2.g, d2);
                break;
        }
    }

    @Override // defpackage.hz61
    public void o() {
    }

    @Override // defpackage.ss81
    public void p(Surface surface) {
        ((MediaCodec) this.b).setOutputSurface(surface);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public void q(Context context, d881 d881Var, nr41 nr41Var) {
        hn71 hn71Var = new hn71(3, (HashMap) (0 == true ? 1 : 0));
        if (nr41Var != null) {
            List list = (List) ((fe81) nr41Var.b).b.w;
            List list2 = list.isEmpty() ? null : list;
            ((Map) hn71Var.b).putAll(list2 != null ? gw00.e(new Pair("image_sizes", a.J0(list2))) : b.f());
        }
        s(context, d881Var, hm2.f, hn71Var);
    }

    @Override // defpackage.ku71
    public void r(gr71 gr71Var, boolean z) {
        uio0 uio0Var = (uio0) this.b;
        HashMap hashMap = (HashMap) this.c;
        String str = ((cu81) this.w).c;
        Bitmap bitmap = gr71Var.a;
        if (bitmap != null) {
            hashMap.put(str, bitmap);
            ((wb71) uio0Var.b).l(bitmap, str);
            if (((AtomicInteger) uio0Var.e).decrementAndGet() == 0) {
                ((wb71) uio0Var.b).a(hashMap);
            }
        }
    }

    @Override // defpackage.ss81
    public void release() {
        this.c = null;
        this.w = null;
        ((MediaCodec) this.b).release();
    }

    public void s(Context context, d881 d881Var, hm2 hm2Var, hn71 hn71Var) {
        v981 v981Var = (v981) this.c;
        hn71 a = ((pf71) this.w).a(((fe81) this.b).e);
        a.r(d881Var.e, "ad_unit_id");
        String str = g771.a;
        a.r(str, "adapter");
        xz xzVar = d881Var.a;
        a.r(xzVar != null ? xzVar.b : null, "ad_type");
        qb71 qb71Var = (qb71) d881Var.q;
        if (qb71Var != null) {
            se71 se71Var = (se71) a.R(qb71Var.a);
            String str2 = se71Var != null ? se71Var.a.b : null;
            if (str2 == null) {
                str2 = "";
            }
            a.r(str2, "native_ad_type");
        }
        a.r(d881Var.k, "ad_source");
        hn71 a2 = fga1.a(a, hn71Var);
        Map map = (Map) a2.b;
        no61 no61Var = (no61) a2.c;
        String str3 = hm2Var.b;
        LinkedHashMap linkedHashMap = new LinkedHashMap(map);
        zj71 zj71Var = new zj71(str3, linkedHashMap, no61Var);
        v981Var.getClass();
        wfa1.b(context, new m771(((n291) v981Var).a)).c(zj71Var);
        new mj31(context, 19).t(hm2Var, linkedHashMap, str, null);
    }

    /* JADX WARN: Removed duplicated region for block: B:30:0x00bc  */
    /* JADX WARN: Removed duplicated region for block: B:33:? A[RETURN, SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public void t(hm2 hm2Var, Map map, String str, w4 w4Var) {
        int ordinal;
        lp71 lp71Var;
        gg71 gg71Var = (gg71) this.w;
        gg81 a = gg71Var.a.a(gg71Var.b);
        boolean z = (a == null || a.s0) ? false : true;
        a081 a081Var = gg71Var.a;
        synchronized (a081.f) {
            a081Var.getClass();
        }
        if (!gg71Var.a() || z) {
            return;
        }
        ((et71) this.c).getClass();
        lp71 lp71Var2 = null;
        try {
            ordinal = hm2Var.ordinal();
        } catch (Throwable unused) {
        }
        if (ordinal == 0) {
            lp71Var = new lp71(me.e, et71.d(str, map));
        } else if (ordinal == 4) {
            lp71Var = new lp71(me.d, et71.a(str, map));
        } else if (ordinal == 8) {
            me meVar = me.c;
            JSONObject jSONObject = new JSONObject();
            Object obj = map.get("ad_type");
            if (obj == null) {
                obj = JSONObject.NULL;
            }
            jSONObject.put("ad_type", obj);
            Object obj2 = map.get("ad_unit_id");
            if (obj2 == null) {
                obj2 = JSONObject.NULL;
            }
            jSONObject.put("ad_unit_id", obj2);
            Object obj3 = map.get("sdk_version");
            if (obj3 == null) {
                obj3 = JSONObject.NULL;
            }
            jSONObject.put("sdk_version", obj3);
            lp71Var = new lp71(meVar, jSONObject);
        } else if (ordinal == 21) {
            lp71Var = new lp71(me.f, et71.b(map, w4Var, str));
        } else if (ordinal == 26) {
            lp71Var = new lp71(me.g, et71.c(str, map));
        } else {
            if (ordinal != 35) {
                if (lp71Var2 == null) {
                    h0w h0wVar = (h0w) this.b;
                    ((Executor) h0wVar.c).execute(new bo31(25, h0wVar, lp71Var2));
                    return;
                }
                return;
            }
            lp71Var = new lp71(me.h, et71.e(str, map));
        }
        lp71Var2 = lp71Var;
        if (lp71Var2 == null) {
        }
    }

    public boolean u(Context context, fe81 fe81Var, d881 d881Var, cl81 cl81Var, String str) {
        br81 br81Var = br81.c;
        if (br81Var == null) {
            synchronized (br81.b) {
                br81Var = br81.c;
                if (br81Var == null) {
                    br81Var = new br81();
                    br81.c = br81Var;
                }
            }
        }
        br81 br81Var2 = br81Var;
        long andIncrement = zh71.a.getAndIncrement();
        ((egz) this.w).getClass();
        Intent intent = new Intent(context, (Class<?>) AdActivity.class);
        intent.putExtra("window_type", "window_type_browser");
        intent.putExtra("extra_browser_url", str);
        if (!(context instanceof Activity)) {
            intent.addFlags(402653184);
        }
        intent.putExtra("data_identifier", andIncrement);
        lk81 lk81Var = new lk81(d881Var, fe81Var, cl81Var, (v981) this.b, null, 112);
        synchronized (br81.b) {
            br81Var2.a.put(Long.valueOf(andIncrement), lk81Var);
        }
        try {
            context.startActivity(intent);
            return true;
        } catch (Exception e) {
            br81Var2.a(andIncrement);
            e.toString();
            ((ge71) this.c).d("Failed to show Browser", e);
            return false;
        }
    }

    public pbj w(Context context) {
        return new pbj((AppAnalyticsReporter) this.b, (dj51) this.c, context, ((w4o) ((eg01) this.w).a) instanceof t4o);
    }

    public eci0 x() {
        return (eci0) this.w;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:40:0x008f  */
    /* JADX WARN: Removed duplicated region for block: B:53:? A[RETURN, SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public void y(String str) {
        iee0 iee0Var;
        JsonReader of;
        T t;
        nee0 nee0Var = (nee0) this.w;
        nee0Var.getClass();
        Ref$ObjectRef ref$ObjectRef = new Ref$ObjectRef();
        try {
            yp6 yp6Var = new yp6();
            yp6Var.G(new ByteArrayInputStream(str.getBytes(uza.a)));
            of = JsonReader.of(yp6Var);
            try {
            } finally {
            }
        } catch (Throwable unused) {
            x4c.g("Exception occurred while parsing PostMessage", null, str, null, 10);
        }
        if (of.peek() == JsonReader.Token.BEGIN_OBJECT) {
            of.beginObject();
            String str2 = null;
            Object obj = null;
            while (of.hasNext()) {
                int selectName = of.selectName(nee0Var.a);
                if (selectName == -1) {
                    of.skipName();
                    of.skipValue();
                } else if (selectName == 0) {
                    str2 = of.nextString();
                } else if (selectName == 1) {
                    obj = nee0Var.b.fromJson(of);
                }
            }
            if (str2 != null) {
                Map map = (Map) obj;
                if (map == null) {
                    map = b.f();
                }
                t = new iee0(str2, map);
            } else {
                t = 0;
            }
            ref$ObjectRef.element = t;
            of.endObject();
            of.close();
            iee0Var = (iee0) ref$ObjectRef.element;
            if (iee0Var != null) {
                return;
            }
            com.ybsdk.rconfig.b bVar = ((if8) ((um41) this.c)).a;
            String str3 = ((YbWebPostMessagesDeeplinks) bVar.d(bVar.i.n).getData()).getDeeplinksMap().get(iee0Var.a);
            if (str3 == null) {
                return;
            }
            Map map2 = iee0Var.b;
            if (!map2.isEmpty()) {
                for (Map.Entry entry : map2.entrySet()) {
                    String str4 = (String) entry.getKey();
                    String str5 = (String) entry.getValue();
                    String p = oyr.p("{{", str4, "}}");
                    Regex regex = gtu0.a;
                    str3 = cvu0.v(str3, p, Uri.encode(str5), false);
                }
            }
            h791.e((j3h) this.b, str3, false, null, 14);
            return;
        }
        of.close();
        iee0Var = null;
        if (iee0Var != null) {
        }
    }

    public void z(Object obj) {
        s421 s421Var = (s421) this.w;
        ((u371) s421Var.w).getClass();
        rr41 a = u371.a((List) obj);
        ((ArrayList) s421Var.x).addAll((List) a.b);
        List list = (List) a.c;
        if (list.isEmpty()) {
            mo492a();
        } else {
            ((tpq0) s421Var.c).a((Context) s421Var.b, list, this, this.c);
        }
    }

    @Override // defpackage.hz61
    public boolean d() {
        return true;
    }

    @Override // defpackage.hz61
    /* renamed from: b, reason: collision with other method in class */
    public void mo493b() {
    }

    @Override // defpackage.ss81
    public void b(int i) {
        ((MediaCodec) this.b).setVideoScalingMode(i);
    }

    @Override // defpackage.hz61
    public void g() {
    }

    public /* synthetic */ mj31(Object obj, Object obj2, Object obj3, boolean z, int i) {
        this.a = i;
        this.w = obj;
        this.b = obj2;
        this.c = obj3;
    }

    public mj31(xrr xrrVar, Context context, d881 d881Var) {
        this.a = 22;
        this.w = xrrVar;
        this.c = d881Var;
        this.b = context.getApplicationContext();
    }

    @Override // defpackage.ss81
    public void c(int i, long j) {
        ((MediaCodec) this.b).releaseOutputBuffer(i, j);
    }

    public mj31(xrr xrrVar, Context context, d881 d881Var, byte b) {
        this.a = 28;
        this.w = xrrVar;
        this.c = d881Var;
        this.b = context.getApplicationContext();
    }

    public /* synthetic */ mj31(int i, Object obj, Object obj2, Object obj3) {
        this.a = i;
        this.b = obj;
        this.c = obj2;
        this.w = obj3;
    }

    public mj31(Context context, lq71 lq71Var) {
        this.a = 10;
        ji41 ji41Var = new ji41(context, 17);
        l181 l181Var = new l181();
        this.b = lq71Var;
        this.c = ji41Var;
        this.w = l181Var;
    }

    @Override // defpackage.hz61
    public void f() {
    }

    public mj31(Context context, v981 v981Var) {
        this.a = 12;
        pf71 pf71Var = new pf71();
        v981Var.getClass();
        ge71 b = wfa1.b(context, new m771(((n291) v981Var).a));
        pi71 pi71Var = new pi71();
        this.b = pf71Var;
        this.c = b;
        this.w = pi71Var;
    }

    public mj31(Context context, fe81 fe81Var, v981 v981Var) {
        this.a = 29;
        this.c = v981Var;
        this.w = fe81Var;
        Context applicationContext = context.getApplicationContext();
        this.b = applicationContext != null ? applicationContext : context;
    }

    public mj31(Context context, fe81 fe81Var, n291 n291Var, e971 e971Var) {
        this.a = 15;
        Handler handler = new Handler(Looper.getMainLooper());
        xrr xrrVar = new xrr(context, fe81Var, e971Var, n291Var);
        this.b = handler;
        this.c = xrrVar;
    }

    public mj31(Context context, bs81 bs81Var) {
        this.a = 25;
        vi61 vi61Var = new vi61(bs81Var);
        u371 u371Var = new u371();
        hlx0 hlx0Var = new hlx0(context, bs81Var);
        this.b = vi61Var;
        this.c = u371Var;
        this.w = hlx0Var;
    }

    public mj31(MediaCodec mediaCodec) {
        this.a = 23;
        this.b = mediaCodec;
        if (rf71.a < 21) {
            this.c = mediaCodec.getInputBuffers();
            this.w = mediaCodec.getOutputBuffers();
        }
    }

    public mj31(AdActivity adActivity, lk81 lk81Var, v981 v981Var) {
        this.a = 27;
        Context context = ((n291) v981Var).a;
        nr41 nr41Var = new nr41(wha1.c(context, context));
        this.b = adActivity;
        this.c = lk81Var;
        this.w = nr41Var;
    }

    public mj31(p671 p671Var, c171 c171Var) {
        this.a = 14;
        this.b = c171Var;
        this.c = p671Var;
        this.w = scc.g(Constants.SMALL, "medium", Constants.LARGE);
    }

    public mj31(String str) {
        this.a = 24;
        da81 da81Var = new da81();
        da81Var.k = str;
        this.b = new qd81(da81Var);
    }

    public mj31(j181 j181Var, aj81 aj81Var, zg71 zg71Var, f171 f171Var) {
        this.a = 13;
        this.b = j181Var;
        this.c = aj81Var;
        this.w = zg71Var;
    }

    public mj31(v981 v981Var) {
        this.a = 21;
        n291 n291Var = (n291) v981Var;
        Context context = n291Var.a;
        ge71 c = wha1.c(context, context);
        n291Var.getClass();
        new ij61();
        egz egzVar = new egz();
        this.b = v981Var;
        this.c = c;
        this.w = egzVar;
    }

    public mj31(fe81 fe81Var, v981 v981Var) {
        this.a = 26;
        pf71 pf71Var = new pf71();
        new hl71();
        new ch71();
        this.b = fe81Var;
        this.c = v981Var;
        this.w = pf71Var;
    }

    public mj31(Context context, PaymentSdkEnvironment paymentSdkEnvironment, rwo rwoVar, int i) {
        this.a = i;
        switch (i) {
            case 8:
                this.b = context;
                this.c = paymentSdkEnvironment;
                this.w = rwoVar;
                mfr mfrVar = kd51.a;
                kd51.a = new e0a0();
                break;
            default:
                this.b = context;
                this.c = rwoVar;
                this.w = kotlin.a.a(new hh31(18, this, paymentSdkEnvironment));
                break;
        }
    }

    public mj31(sls slsVar) {
        this.a = 2;
        this.b = slsVar;
        n0 b = ffx.b(0, 1, BufferOverflow.DROP_OLDEST);
        this.c = b;
        this.w = e.c(b);
    }

    @Override // defpackage.ss81
    public MediaFormat a() {
        return ((MediaCodec) this.b).getOutputFormat();
    }

    @Override // defpackage.fj81
    public void a(Object obj) {
        s421 s421Var = (s421) this.w;
        ((y381) s421Var.c).a.a("YmadOmSdkJs", (String) obj);
        y381 y381Var = (y381) s421Var.c;
        y381Var.a.a("YmadOmSdkJsUrl", (String) this.b);
        ((lc71) this.c).a();
    }

    @Override // defpackage.ss81
    public void a(Bundle bundle) {
        ((MediaCodec) this.b).setParameters(bundle);
    }

    @Override // defpackage.mb71
    public void a(Context context) {
        ((j181) this.b).a();
        ((aj81) this.c).a(context);
    }

    @Override // defpackage.mb71
    public void a(Context context, d881 d881Var) {
        ((aj81) this.c).b(context, (zg71) this.w);
    }
}
