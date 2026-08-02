package xsna;

import android.annotation.SuppressLint;
import android.content.Context;
import android.net.Uri;
import android.provider.Settings;
import com.unity3d.services.UnityAdsConstants;
import com.vk.cachecontrol.api.CacheTarget;
import com.vk.log.L;
import com.vk.media.qrcode.core.ui.SvgDrawable;
import com.vk.rlottie.RLottieDrawable;
import com.vkontakte.android.R;
import java.io.BufferedReader;
import java.io.File;
import java.io.InputStreamReader;
import java.io.OutputStream;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.atomic.AtomicLong;
import java.util.function.LongUnaryOperator;
import org.chromium.base.TimeUtils;
import xsna.gx8;
import xsna.hg1;
import xsna.l9r;
import xsna.wst;

/* compiled from: ImReactionAssetsRepoImpl.kt */
/* loaded from: classes2.dex */
public final class cbw implements zaw, gx8.a {
    public final a1w b;
    public final yab c;
    public final AtomicLong d = new AtomicLong(0);
    public final a0f0 e = new a0f0();
    public final m900<Integer, String> f = new m900<>(10);
    public int g;
    public List<Integer> h;
    public volatile HashMap i;
    public volatile yaw j;

    public cbw(a1w a1wVar, yab yabVar, gx8 gx8Var) {
        this.b = a1wVar;
        this.c = yabVar;
        cew.b.getClass();
        this.g = cew.h().getInt("reactions_assets_version", 1);
        ArrayList J = f370.J(cqm0.i(cew.h().getString("reactions_available_ids", "[]")));
        this.h = (List) (J.isEmpty() ? jll.a : J);
        this.i = l();
        gx8Var.c(this);
        new io.reactivex.rxjava3.internal.operators.observable.i0(a1wVar.l.a(), new hg1.z1()).U(new hg1.y1()).U(new s7(new c2u(this, 3), 18)).subscribe();
    }

    public static yaw k(int i, wst.a.C3957a c3957a) {
        yaw yawVar = jll.b.get(Integer.valueOf(i));
        int i2 = yawVar != null ? yawVar.b : R.raw.msg_reaction_svg_404;
        int i3 = yawVar != null ? yawVar.d : R.color.vk_gray_100;
        Integer num = jll.c.get(Integer.valueOf(i));
        return new yaw(i, i2, num != null ? num.intValue() : R.string.im_msg_reaction_unknown_content_description, i3, yawVar != null ? yawVar.e : null, yawVar != null ? yawVar.f : null, c3957a != null ? c3957a.c : null, c3957a != null ? c3957a.b : null, c3957a != null ? c3957a.a : null);
    }

    public static String p(int i, Context context) {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(context.getResources().openRawResource(i), emb.b), 8192);
        try {
            String b = a0a.b(bufferedReader);
            bufferedReader.close();
            return b;
        } finally {
        }
    }

    @Override // xsna.gx8.a
    public final CacheTarget a() {
        return CacheTarget.OTHER;
    }

    /* JADX WARN: Code restructure failed: missing block: B:22:0x0060, code lost:
    
        if (r1 != null) goto L23;
     */
    @Override // xsna.zaw
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final SvgDrawable b(Context context, boolean z, int i, int i2) {
        String str;
        m900<Integer, String> m900Var = this.f;
        String str2 = m900Var.get(Integer.valueOf(i));
        if (z) {
            if (str2 != null) {
                return new SvgDrawable(str2, i2, i2);
            }
            throw new IllegalArgumentException("Required value was null.");
        }
        if (str2 != null) {
            return new SvgDrawable(str2, i2, i2);
        }
        yaw n = n(i);
        File file = this.e.a().get(lhg.a(i, "static_"));
        if (file == null) {
            r();
            o(e43.m(this.i.get(Integer.valueOf(i))));
        }
        if (file != null) {
            try {
                str = nbr.r(file, emb.b);
            } catch (Exception e) {
                L.g("Asset file loading error ", e);
                str = null;
            }
        }
        str = p(n.b, context);
        m900Var.put(Integer.valueOf(i), str);
        return new SvgDrawable(str, i2, i2);
    }

    @Override // xsna.zaw
    public final String c(int i, Context context) {
        return context.getString(n(i).c);
    }

    @Override // xsna.zaw
    public final boolean d(int i) {
        r();
        if (this.i.containsKey(Integer.valueOf(i))) {
            return true;
        }
        return i == -2 && this.j != null;
    }

    @Override // xsna.gx8.a
    public final void dispose() {
        j();
    }

    /* JADX WARN: Code restructure failed: missing block: B:23:0x0072, code lost:
    
        if (r0 != null) goto L23;
     */
    /* JADX WARN: Removed duplicated region for block: B:17:0x0085  */
    @Override // xsna.zaw
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final RLottieDrawable e(Context context, boolean z, int i, int i2) {
        String str;
        String str2;
        if (Settings.Global.getFloat(context.getContentResolver(), "animator_duration_scale", 1.0f) != UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT) {
            yaw n = n(i);
            StringBuilder sb = new StringBuilder("animation");
            sb.append(z ? "_big" : "");
            sb.append('_');
            sb.append(i);
            File file = this.e.a().get(sb.toString());
            Integer num = z ? n.f : n.e;
            if (file == null) {
                r();
                o(e43.m(this.i.get(Integer.valueOf(i))));
            }
            if (file != null) {
                try {
                    str = nbr.r(file, emb.b);
                } catch (Exception e) {
                    L.g("Asset file loading error ", e);
                    str = null;
                }
            }
            if (num != null) {
                str = p(num.intValue(), context);
                str2 = str;
                if (str2 != null) {
                    return new RLottieDrawable(str2, "reaction" + i + '-' + i2 + '-' + z, i2, i2, null, false, false, null, 496);
                }
            } else {
                str2 = null;
                if (str2 != null) {
                }
            }
        }
        return null;
    }

    @Override // xsna.zaw
    public final List<yaw> f() {
        List<yaw> b = this.c.b(i());
        yaw yawVar = this.j;
        if (yawVar == null) {
            return b;
        }
        return j5g.u0(b, Collections.singletonList(yawVar));
    }

    @Override // xsna.b0f0
    public final void g(int i, String str, String str2, String str3) {
        a0f0 a0f0Var = this.e;
        a0f0Var.getClass();
        String str4 = "static_" + i;
        String a = lhg.a(i, "animation_");
        String a2 = lhg.a(i, "animation_big_");
        bpn0 bpn0Var = a0f0Var.c;
        File a3 = ((wel) bpn0Var.getValue()).a(Uri.parse(str), str4 + ".tmp");
        File a4 = ((wel) bpn0Var.getValue()).a(Uri.parse(str2), a + ".tmp");
        File a5 = ((wel) bpn0Var.getValue()).a(Uri.parse(str3), a2 + ".tmp");
        l9r.a aVar = (l9r.a) a0f0Var.a().a(str4);
        OutputStream c = aVar.e.c(0);
        try {
            s3q0 s3q0Var = s3q0.a;
            ro.e(c, null);
            a3.renameTo(aVar.commit());
            l9r.a aVar2 = (l9r.a) a0f0Var.a().a(a);
            ro.e(aVar2.e.c(0), null);
            a4.renameTo(aVar2.commit());
            l9r.a aVar3 = (l9r.a) a0f0Var.a().a(a2);
            ro.e(aVar3.e.c(0), null);
            a5.renameTo(aVar3.commit());
        } finally {
        }
    }

    @Override // xsna.gx8.a
    public final String getDescription() {
        return "ImReactionAssetsRepo";
    }

    @Override // xsna.zaw
    public final SvgDrawable h(int i, int i2, Context context) {
        return new SvgDrawable(p(i, context), i2, i2);
    }

    @Override // xsna.zaw
    public final ArrayList i() {
        List<Integer> list = this.h;
        ArrayList arrayList = new ArrayList();
        Iterator<T> it = list.iterator();
        while (it.hasNext()) {
            int intValue = ((Number) it.next()).intValue();
            r();
            yaw yawVar = (yaw) this.i.get(Integer.valueOf(intValue));
            if (yawVar != null) {
                arrayList.add(yawVar);
            }
        }
        return arrayList;
    }

    public final void j() {
        this.e.a().c();
        this.c.c();
        this.d.set(0L);
        q(1, jll.a);
        this.i = l();
    }

    public final HashMap l() {
        HashMap hashMap = new HashMap();
        Iterator<Integer> it = this.h.iterator();
        while (it.hasNext()) {
            int intValue = it.next().intValue();
            hashMap.put(Integer.valueOf(intValue), k(intValue, null));
        }
        return hashMap;
    }

    public final long m() {
        return z4g.g((File) this.e.a.getValue());
    }

    public final yaw n(int i) {
        r();
        yaw yawVar = (yaw) this.i.get(Integer.valueOf(i));
        return yawVar == null ? new yaw(i, R.raw.msg_reaction_svg_404, R.string.im_msg_reaction_unknown_content_description, R.color.vk_gray_100, null, null, 496) : yawVar;
    }

    public final void o(List<yaw> list) {
        if (list.isEmpty()) {
            return;
        }
        this.b.C(this, new p9o(list, this.g)).q(asu0.a.c()).subscribe();
    }

    public final void q(int i, List<Integer> list) {
        this.g = i;
        this.h = list;
        cew.b.getClass();
        cew.h().edit().putInt("reactions_assets_version", i).apply();
        cew.h().edit().putString("reactions_available_ids", kvf.a(list).toString()).apply();
    }

    @SuppressLint({"CheckResult"})
    public final void r() {
        final long currentTimeMillis = System.currentTimeMillis();
        if (currentTimeMillis > this.d.getAndUpdate(new LongUnaryOperator() { // from class: xsna.abw
            @Override // java.util.function.LongUnaryOperator
            public final long applyAsLong(long j) {
                long j2 = currentTimeMillis;
                return j2 > j ? j2 + TimeUtils.MILLISECONDS_PER_DAY : j;
            }
        })) {
            a1w a1wVar = this.b;
            if (a1wVar.u()) {
                this.f.evictAll();
                a1wVar.C(this, new xst()).q(asu0.a.c()).subscribe(new jsv(new bbw(this, 0), 2), new n3t(new f2s(this, 12), 5));
            }
        }
    }

    @Override // xsna.gx8.a
    public final long u() {
        return z4g.g((File) this.e.a.getValue());
    }
}
