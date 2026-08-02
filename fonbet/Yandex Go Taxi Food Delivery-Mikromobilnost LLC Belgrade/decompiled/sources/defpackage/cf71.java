package defpackage;

import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.Point;
import android.net.Uri;
import android.os.Bundle;
import android.os.Handler;
import android.util.DisplayMetrics;
import android.util.SparseArray;
import android.view.Display;
import android.view.View;
import android.view.WindowManager;
import android.widget.TextView;
import com.google.android.gms.tasks.Task;
import com.google.android.play.integrity.internal.e;
import com.yandex.div.core.images.BitmapSource;
import io.appmetrica.analytics.coreutils.internal.StringUtils;
import java.lang.ref.WeakReference;
import java.lang.reflect.Constructor;
import java.util.Collection;
import java.util.Collections;
import java.util.HashMap;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.concurrent.atomic.AtomicBoolean;
import kotlin.collections.EmptyList;
import kotlin.collections.b;
import ru.cprocsp.ACSP.tools.common.ACSPConstants;
import yads.h72;
import yads.hm2;
import yads.ie0;
import yads.im2;
import yads.je0;
import yads.jk3;
import yads.ke0;
import yads.oy1;
import yads.q91;
import yads.qp1;
import yads.r0;
import yads.t32;

/* loaded from: classes7.dex */
public final class cf71 implements fj81, kg61, on61, ku71, io71, fh81, lo81, wx60, ku81 {
    public final /* synthetic */ int a;
    public final Object b;
    public Object c;

    public cf71(Context context, du71 du71Var, bq71 bq71Var, d881 d881Var, qp1 qp1Var) {
        this.a = 2;
        fe81 fe81Var = bq71Var.b;
        v981 v981Var = bq71Var.c;
        gr81 gr81Var = new gr81(fe81Var);
        z581 z581Var = new z581(fe81Var, v981Var, d881Var);
        aj81 aj81Var = new aj81(context, fe81Var, bq71Var.a, new za71(), z581Var, new aj31(29, new s1n(qp1Var.b, gr81Var, z581Var, (cf71) null, 24)), new i371(du71Var, qp1Var));
        new ui61();
        new an61();
        l871 l871Var = new l871();
        Context applicationContext = context.getApplicationContext();
        applicationContext = applicationContext == null ? context : applicationContext;
        new WeakReference(du71Var);
        new WeakReference(bq71Var.d);
        new LinkedHashMap();
        new LinkedHashMap();
        new vb71(applicationContext);
        Display defaultDisplay = ((WindowManager) applicationContext.getSystemService("window")).getDefaultDisplay();
        DisplayMetrics displayMetrics = new DisplayMetrics();
        defaultDisplay.getRealMetrics(displayMetrics);
        new Point(displayMetrics.widthPixels, displayMetrics.heightPixels);
        new eh81();
        applicationContext.getApplicationContext();
        new tl81();
        new zp61();
        this.b = aj81Var;
        this.c = l871Var;
    }

    @Override // defpackage.fj81
    public void a(Object obj) {
        Bitmap bitmap = (Bitmap) obj;
        z4m0 z4m0Var = (z4m0) this.c;
        String str = (String) this.b;
        ((h72) ((i971) z4m0Var.c).b).put(str, bitmap);
        lo71 lo71Var = (lo71) ((HashMap) z4m0Var.w).remove(str);
        if (lo71Var != null) {
            lo71Var.b = bitmap;
            ((HashMap) z4m0Var.x).put(str, lo71Var);
            if (((h3s0) z4m0Var.z) == null) {
                h3s0 h3s0Var = new h3s0(14, z4m0Var);
                z4m0Var.z = h3s0Var;
                ((Handler) z4m0Var.y).postDelayed(h3s0Var, 100L);
            }
        }
    }

    @Override // defpackage.fh81
    public long b(int i) {
        if (i < 0) {
            w511.q();
            return 0L;
        }
        long[] jArr = (long[]) this.c;
        if (i < jArr.length) {
            return jArr[i];
        }
        w511.q();
        return 0L;
    }

    @Override // defpackage.ku81
    public void c(o081 o081Var, vi71 vi71Var) {
        this.c = o081Var;
        se71 se71Var = (se71) this.b;
        vi71 vi71Var2 = new vi71(11, o081Var, vi71Var, se71Var.f);
        for (uy71 uy71Var : se71Var.b) {
            i281 a = o081Var.a(uy71Var);
            if (a == null) {
                a = null;
            }
            if (a != null) {
                a.c(uy71Var.c);
                a.a(uy71Var, vi71Var2);
            }
        }
        r581 r581Var = o081Var.c.e;
        kgx kgxVar = ao61.g[4];
        List list = (List) r581Var.a.get();
        if (list != null) {
            Iterator it = list.iterator();
            if (it.hasNext()) {
                throw unr0.i(it);
            }
        }
    }

    @Override // defpackage.fh81
    public List d(long j) {
        r871 r871Var;
        int t = rf71.t((long[]) this.c, j, false);
        return (t == -1 || (r871Var = ((r871[]) this.b)[t]) == r871.K) ? Collections.EMPTY_LIST : Collections.singletonList(r871Var);
    }

    @Override // defpackage.ku81
    public void e(o081 o081Var) {
        o081Var.b();
    }

    @Override // defpackage.on61
    public void f(dl81 dl81Var) {
        ur71 ur71Var = (ur71) this.c;
        SparseArray sparseArray = ur71Var.g;
        uh81 uh81Var = (uh81) this.b;
        if (dl81Var.s() == 0 && (dl81Var.s() & 128) != 0) {
            dl81Var.m(dl81Var.b + 6);
            int i = (dl81Var.c - dl81Var.b) / 4;
            for (int i2 = 0; i2 < i; i2++) {
                dl81Var.d(0, 4, uh81Var.a);
                uh81Var.f(0);
                int a = uh81Var.a(16);
                uh81Var.h(3);
                if (a == 0) {
                    uh81Var.h(13);
                } else {
                    int a2 = uh81Var.a(13);
                    if (sparseArray.get(a2) == null) {
                        sparseArray.put(a2, new vy61(new s1n(ur71Var, a2)));
                        ur71Var.m++;
                    }
                }
            }
            if (ur71Var.a != 2) {
                sparseArray.remove(0);
            }
        }
    }

    @Override // defpackage.on61
    public void g(lo61 lo61Var, yg71 yg71Var, xi11 xi11Var) {
    }

    @Override // defpackage.io71
    public Object h(View view, xh71 xh71Var, r0 r0Var) {
        d391 d391Var = ((st81) this.c).a;
        d391Var.a.post(new c391(d391Var, 0));
        vmn0 vmn0Var = (vmn0) this.b;
        ((ge71) vmn0Var.w).c(vmn0Var.b(hm2.s, new HashMap()));
        return new b391(false);
    }

    public n771 i(Object... objArr) {
        Constructor d;
        synchronized (((AtomicBoolean) this.c)) {
            if (!((AtomicBoolean) this.c).get()) {
                try {
                    d = ((yx61) this.b).d();
                } catch (ClassNotFoundException unused) {
                    ((AtomicBoolean) this.c).set(true);
                } catch (Exception e) {
                    throw new RuntimeException("Error instantiating extension", e);
                }
            }
            d = null;
        }
        if (d == null) {
            return null;
        }
        try {
            return (n771) d.newInstance(objArr);
        } catch (Exception e2) {
            ny61.h("Unexpected error creating extractor", e2);
            return null;
        }
    }

    @Override // defpackage.wf81
    public void j(jk3 jk3Var) {
        ((btk) this.c).c();
    }

    public xg81 k(View view, do71 do71Var) {
        ((hk81) this.c).getClass();
        pk61 pk61Var = new pk61(view);
        TextView h = do71Var.h(view);
        LinkedHashMap linkedHashMap = pk61Var.d;
        linkedHashMap.put("age", h);
        linkedHashMap.put("body", do71Var.a(view));
        linkedHashMap.put("call_to_action", do71Var.g(view));
        linkedHashMap.put("domain", do71Var.r(view));
        linkedHashMap.put("favicon", do71Var.j(view));
        linkedHashMap.put("feedback", do71Var.o(view));
        linkedHashMap.put("icon", do71Var.t(view));
        linkedHashMap.put("media", do71Var.e(view));
        pk61Var.b = do71Var.b(view);
        pk61Var.c = do71Var.p(view);
        linkedHashMap.put("price", do71Var.c(view));
        View n = do71Var.n(view);
        if (!(n instanceof kp81)) {
            n = null;
        }
        linkedHashMap.put("rating", n);
        linkedHashMap.put("review_count", do71Var.w(view));
        linkedHashMap.put("sponsored", do71Var.u(view));
        linkedHashMap.put("title", do71Var.m(view));
        linkedHashMap.put("warning", do71Var.f(view));
        for (String str : (Collection) this.b) {
            View k = do71Var.k(view, str);
            if (k != null) {
                linkedHashMap.put(str, k);
            }
        }
        return new xg81(pk61Var);
    }

    public void l() {
        String str;
        m881 a;
        tb81 tb81Var = (tb81) this.b;
        r191 r191Var = (r191) this.c;
        r191Var.getClass();
        try {
            str = r191Var.b.q();
        } catch (Throwable unused) {
            str = null;
        }
        if (str == null) {
            throw new q91("Incorrect AppMetrica Integration. The minimum supported version of AppMetrica SDK is 8.0.0 (inclusive) and the maximum supported version is 9.0.0 (exclusive). Please, check your AppMetrica integration.");
        }
        tb81Var.getClass();
        m881 a2 = tb81.a("8.0.0");
        if (a2 == null || (a = tb81.a("9.0.0")) == null) {
            return;
        }
        m881 a3 = tb81.a(str);
        if (a3 == null || a3.compareTo(a2) < 0 || a3.compareTo(a) >= 0) {
            throw new q91("Incorrect AppMetrica Version. The minimum supported version of AppMetrica SDK is 8.0.0 (inclusive) and the maximum supported version is 9.0.0 (exclusive). And the current version of AppMetrica SDK is ".concat(str));
        }
    }

    public void m(int i, Bundle bundle) {
        cl81 cl81Var = (cl81) this.c;
        if (cl81Var != null) {
            cl81Var.a(i, bundle);
        }
    }

    public void n(d881 d881Var, q481 q481Var, f291 f291Var) {
        qb71 qb71Var = (qb71) d881Var.q;
        if (qb71Var == null) {
            q481Var.b(so61.c);
            f291Var.mo492a();
            return;
        }
        f291Var.n(qb71Var);
        ph71 ph71Var = (ph71) this.b;
        uj61 uj61Var = new uj61();
        v981 v981Var = ph71Var.a;
        ck61 ck61Var = new ck61(new ji41(19, d881Var), new l171(v981Var), uj61Var, new uio0(v981Var, d881Var), new ba81());
        ji41 ji41Var = new ji41(15, q481Var);
        w381 w381Var = (w381) this.c;
        tje.N(w381Var.d, null, null, new oy1(w381Var, d881Var, qb71Var, ck61Var, ji41Var, null), 3);
    }

    public void o() {
        int i = this.a;
        Object obj = this.b;
        switch (i) {
            case 14:
                ((ie0) ((r181) obj).f).invoke((nl61) this.c);
                break;
            case 21:
                ((je0) ((r181) obj).f).invoke((nl61) this.c);
                break;
            default:
                ((ke0) ((r181) obj).f).invoke((nl61) this.c);
                break;
        }
    }

    @Override // defpackage.wx60
    public void onComplete(Task task) {
        e eVar = (e) this.b;
        atx0 atx0Var = (atx0) this.c;
        synchronized (eVar.f) {
            eVar.e.remove(atx0Var);
        }
    }

    @Override // defpackage.ku71
    public void r(gr71 gr71Var, boolean z) {
        Bitmap bitmap = gr71Var.a;
        if (bitmap != null) {
            ((btk) this.c).g(new bd7(bitmap, null, Uri.parse((String) this.b), z ? BitmapSource.MEMORY : BitmapSource.NETWORK));
        }
    }

    @Override // defpackage.lo81
    /* renamed from: a, reason: collision with other method in class */
    public Map mo105a(long j) {
        Map f = b.f();
        if (!ym11.h(f)) {
            f = null;
        }
        if (f == null) {
            f = new LinkedHashMap();
        }
        String str = (String) this.b;
        if (str == null) {
            f.put("adapter", StringUtils.UNDEFINED);
        } else {
            f.put("adapter", str);
        }
        String str2 = ((im2) this.c).b;
        if (str2 == null) {
            f.put(ACSPConstants.STATUS, StringUtils.UNDEFINED);
        } else {
            f.put(ACSPConstants.STATUS, str2);
        }
        f.put("duration", Long.valueOf(j));
        return f;
    }

    @Override // defpackage.kg61
    public void a(Context context, d881 d881Var) {
        ((aj81) this.b).b(context, (l871) this.c);
    }

    @Override // defpackage.fh81
    public int a(long j) {
        long[] jArr = (long[]) this.c;
        int f = rf71.f(jArr, j, false);
        if (f < jArr.length) {
            return f;
        }
        return -1;
    }

    @Override // defpackage.fh81
    public int a() {
        return ((long[]) this.c).length;
    }

    public /* synthetic */ cf71(Object obj, Object obj2, boolean z, int i) {
        this.a = i;
        this.b = obj;
        this.c = obj2;
    }

    public cf71(int i, Set set) {
        this.a = 10;
        Collection collection = (i & 1) != 0 ? EmptyList.a : set;
        hk81 hk81Var = new hk81();
        this.b = collection;
        this.c = hk81Var;
    }

    public cf71(hlx0 hlx0Var) {
        this.a = 3;
        xf81 xf81Var = new xf81();
        this.b = hlx0Var;
        this.c = xf81Var;
    }

    public cf71(rr41 rr41Var) {
        this.a = 8;
        this.b = rr41Var;
        this.c = null;
    }

    public cf71(Context context) {
        this.a = 4;
        tb81 tb81Var = new tb81();
        r191 a = bv81.a(context);
        this.b = tb81Var;
        this.c = a;
    }

    public cf71(Context context, ge71 ge71Var) {
        this.a = 9;
        t281 t281Var = new t281();
        eo61 eo61Var = new eo61(context, ge71Var);
        this.b = t281Var;
        this.c = eo61Var;
    }

    public cf71(Context context, cf71 cf71Var) {
        this.a = 20;
        this.b = cf71Var;
        this.c = context.getApplicationContext();
    }

    public /* synthetic */ cf71(int i, Object obj, Object obj2) {
        this.a = i;
        this.c = obj;
        this.b = obj2;
    }

    public cf71(Context context, fe81 fe81Var, e971 e971Var, v981 v981Var) {
        this.a = 19;
        Context context2 = ((n291) v981Var).a;
        qx71 qx71Var = new qx71(0, wha1.c(context2, context2));
        qhw0 a = jl40.a();
        sjh sjhVar = uyj.a;
        ike a2 = bvf0.a(cvw.U(a, mdh.b).plus(qx71Var));
        Context applicationContext = context.getApplicationContext();
        ph71 ph71Var = new ph71(v981Var);
        w381 w381Var = new w381(applicationContext, a2, fe81Var, e971Var, v981Var);
        this.b = ph71Var;
        this.c = w381Var;
        fe81Var.f = t32.c;
    }

    public cf71(Context context, fe81 fe81Var, v981 v981Var, d881 d881Var) {
        this.a = 27;
        v981Var.getClass();
        ge71 b = wfa1.b(context, new m771(((n291) v981Var).a));
        ip71 ip71Var = new ip71(fe81Var, d881Var);
        this.b = b;
        this.c = ip71Var;
    }

    public cf71(yx61 yx61Var) {
        this.a = 1;
        this.b = yx61Var;
        this.c = new AtomicBoolean(false);
    }

    public cf71(ge71 ge71Var) {
        this.a = 15;
        f571 f571Var = new f571();
        this.b = ge71Var;
        this.c = f571Var;
    }

    public cf71(se71 se71Var) {
        this.a = 29;
        this.b = se71Var;
    }

    public cf71(jn71 jn71Var) {
        this.a = 28;
        gm71 a = rc71.a(false);
        this.b = jn71Var;
        this.c = a;
    }

    public cf71(ur71 ur71Var) {
        this.a = 7;
        this.c = ur71Var;
        uh81 uh81Var = new uh81();
        uh81Var.a = new byte[4];
        uh81Var.d = 4;
        this.b = uh81Var;
    }

    public cf71(v981 v981Var) {
        this.a = 24;
        k671 k671Var = new k671();
        this.b = v981Var;
        this.c = k671Var;
    }
}
