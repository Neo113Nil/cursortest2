package xsna;

import android.content.Context;
import androidx.annotation.Nullable;
import com.vk.dto.video.VideoOwner;
import com.vk.libvideo.api.ad.VideoAdvertisementsRepository;
import com.vk.libvideo.design.view.live.LiveView;
import com.vk.libvideo.live.api.base.LiveAnalyticsHandler;
import com.vk.log.L;
import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.TimeUnit;
import org.json.JSONException;
import org.json.JSONObject;
import ru.ok.android.webrtc.stat.call.internal.ConnectivityTracker;

/* compiled from: LiveSwipePresenter.java */
/* loaded from: classes3.dex */
public final class pmz implements lmz {

    @Nullable
    public zet0 A;

    @Nullable
    public com.vk.video.ui.share.api.b B;
    public VideoAdvertisementsRepository C;
    public String D;
    public double E;
    public double F;

    @Nullable
    public fjs0 G;
    public final mmz e;
    public Object f;
    public Object g;
    public nmz h;
    public boolean i;
    public nef0 j;
    public wh8 k;
    public io.reactivex.rxjava3.disposables.c l;
    public io.reactivex.rxjava3.disposables.c m;
    public omz n;
    public io.reactivex.rxjava3.disposables.c o;
    public boolean p;
    public int s;
    public List<VideoOwner> t;
    public List<VideoOwner> u;
    public ArrayList v;
    public String w;
    public String x;
    public VideoOwner y;
    public dlz z;
    public final HashSet b = new HashSet();
    public final anz c = fxc0.B().T();
    public final byp d = byp.b();
    public boolean q = false;
    public Long r = 0L;

    public pmz(mmz mmzVar) {
        this.e = mmzVar;
        a2();
    }

    public final void G1(niz nizVar) {
        this.f = nizVar;
    }

    public final void J0(boolean z) {
        if (this.i == z) {
            return;
        }
        this.i = z;
        nmz nmzVar = this.h;
        if (nmzVar != null) {
            nmzVar.b(z);
            W();
        }
    }

    public final void Q(vcf0 vcf0Var) {
        if (vcf0Var.isInited() || vcf0Var.getAdapter() == null) {
            return;
        }
        qef0 qef0Var = (qef0) vcf0Var.getAdapter();
        qef0Var.c = this.v;
        qef0Var.notifyDataSetChanged();
        vcf0Var.t1(true);
    }

    /* JADX WARN: Removed duplicated region for block: B:19:0x003a  */
    /* JADX WARN: Removed duplicated region for block: B:22:0x0046  */
    /* JADX WARN: Removed duplicated region for block: B:25:0x0054  */
    /* JADX WARN: Removed duplicated region for block: B:28:0x004b  */
    /* JADX WARN: Removed duplicated region for block: B:29:0x003f  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void W() {
        JSONObject jSONObject;
        String str;
        String str2;
        wh8 wh8Var;
        String str3;
        if (this.i) {
            String str4 = this.D;
            if (str4 == null || str4.equals("all") || (str3 = this.w) == null || !str3.equals("lives")) {
                jSONObject = null;
                str = null;
                str2 = null;
            } else {
                try {
                    jSONObject = new JSONObject();
                    try {
                        jSONObject.put("stream_type", this.D);
                    } catch (JSONException e) {
                        e = e;
                        L.i(e);
                        double d = this.E;
                        if (d == ConnectivityTracker.DEFAULT_UPLINK_BITRATE) {
                        }
                        double d2 = this.F;
                        if (d2 == ConnectivityTracker.DEFAULT_UPLINK_BITRATE) {
                        }
                        wh8Var = this.k;
                        if (wh8Var != null) {
                        }
                        this.j.Q(true);
                        io.reactivex.rxjava3.internal.operators.observable.c2 c2Var = new io.reactivex.rxjava3.internal.operators.observable.c2(new io.reactivex.rxjava3.internal.operators.observable.z1(this.c.N(null, jSONObject, str, str2), new n0g0(10000)), new ffg0());
                        wh8 wh8Var2 = new wh8(this);
                        c2Var.subscribe(wh8Var2);
                        this.k = wh8Var2;
                    }
                } catch (JSONException e2) {
                    e = e2;
                    jSONObject = null;
                }
                double d3 = this.E;
                str = d3 == ConnectivityTracker.DEFAULT_UPLINK_BITRATE ? String.valueOf(d3) : null;
                double d22 = this.F;
                str2 = d22 == ConnectivityTracker.DEFAULT_UPLINK_BITRATE ? String.valueOf(d22) : null;
            }
            wh8Var = this.k;
            if (wh8Var != null) {
                wh8Var.dispose();
            }
            this.j.Q(true);
            io.reactivex.rxjava3.internal.operators.observable.c2 c2Var2 = new io.reactivex.rxjava3.internal.operators.observable.c2(new io.reactivex.rxjava3.internal.operators.observable.z1(this.c.N(null, jSONObject, str, str2), new n0g0(10000)), new ffg0());
            wh8 wh8Var22 = new wh8(this);
            c2Var2.subscribe(wh8Var22);
            this.k = wh8Var22;
        }
    }

    public final void a2() {
        y2();
        TimeUnit timeUnit = TimeUnit.MILLISECONDS;
        io.reactivex.rxjava3.internal.operators.observable.w2 B0 = io.reactivex.rxjava3.core.q.B0(5000L, timeUnit);
        asu0 asu0Var = asu0.a;
        this.m = B0.r0(asu0Var.c()).a0(io.reactivex.rxjava3.android.schedulers.a.b()).subscribe(new uck(1));
        this.l = this.d.a(azi0.class, new lav(this, 4));
        if (fxc0.B().f()) {
            this.o = io.reactivex.rxjava3.core.q.B0(20000L, timeUnit).r0(asu0Var.c()).a0(io.reactivex.rxjava3.android.schedulers.a.b()).subscribe(new bf2(this, 25));
        }
    }

    @Override // xsna.lmz
    public final void b() {
        this.c.b();
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, xsna.niz] */
    public final niz d() {
        return this.f;
    }

    public final void e1(VideoOwner videoOwner) {
        this.y = videoOwner;
    }

    public final void h2(String str) {
        this.w = str;
    }

    @Override // xsna.lmz
    public final void k1() {
        this.c.w();
        fxc0.B().O();
        this.e.k2(true);
    }

    @Override // xsna.lmz
    public final void l1() {
        this.c.z(System.currentTimeMillis());
    }

    @Override // xsna.lmz
    public final void m1(int i) {
        VideoOwner videoOwner = this.u.get(i);
        azi0 azi0Var = new azi0();
        azi0Var.a = videoOwner.c;
        azi0Var.c = true;
        this.d.c(azi0Var);
    }

    @Override // xsna.lmz
    public final void o1() {
        try {
            z2();
        } catch (Exception e) {
            L.i(e);
        }
    }

    @Override // xsna.pk6
    public final void pause() {
        wh8 wh8Var = this.k;
        if (wh8Var != null) {
            wh8Var.dispose();
            this.k = null;
        }
        y2();
        LiveView curLiveView = this.h.o.getCurLiveView();
        if (curLiveView != null) {
            curLiveView.pause();
        }
    }

    @Override // xsna.pk6
    public final void release() {
        omz omzVar = this.n;
        if (omzVar != null) {
            omzVar.dispose();
            this.n = null;
        }
        io.reactivex.rxjava3.disposables.c cVar = this.m;
        if (cVar != null) {
            cVar.dispose();
            this.m = null;
        }
        wh8 wh8Var = this.k;
        if (wh8Var != null) {
            wh8Var.dispose();
            this.k = null;
        }
        io.reactivex.rxjava3.disposables.c cVar2 = this.l;
        if (cVar2 != null) {
            cVar2.dispose();
            this.l = null;
        }
        this.c.b();
        Iterator it = this.h.j.iterator();
        while (it.hasNext()) {
            ((LiveView) it.next()).release();
        }
    }

    @Override // xsna.pk6
    public final void resume() {
        W();
        a2();
        LiveView curLiveView = this.h.o.getCurLiveView();
        if (curLiveView != null) {
            curLiveView.resume();
        }
    }

    @Override // xsna.pk6
    public final void start() {
        this.u = Collections.singletonList(this.y);
        nmz nmzVar = new nmz();
        this.h = nmzVar;
        nmzVar.m = this.r.longValue();
        nmz nmzVar2 = this.h;
        nmzVar2.h = this.u;
        nmzVar2.f = this;
        nmzVar2.q = this.z;
        nmzVar2.s = this.A;
        nmzVar2.v = this.G;
        nmzVar2.t = this.B;
        nmzVar2.u = this.C;
        mmz mmzVar = this.e;
        nmzVar2.g = mmzVar;
        nmzVar2.k = this.w;
        nmzVar2.n = this.p;
        nmzVar2.p = this;
        nmzVar2.b(this.i);
        nmz nmzVar3 = this.h;
        nmzVar3.r = this.q;
        mmzVar.setPagerAdapter(nmzVar3);
        this.h.notifyDataSetChanged();
        this.j = new nef0(this.y.f, false, mmzVar.getRecommendedView());
        mmzVar.getRecommendedView().setPresenter(this.j);
        mmzVar.getRecommendedView().setProgressVisibility(false);
        mmzVar.getRecommendedView().setErrorVisibility(false);
        this.j.start();
        this.D = this.x;
        omz omzVar = this.n;
        if (omzVar != null) {
            omzVar.dispose();
            this.n = null;
        }
        if (mmzVar.getViewContext() != null) {
            sex0 sex0Var = e370.l;
            sex0 sex0Var2 = sex0Var != null ? sex0Var : null;
            Context viewContext = mmzVar.getViewContext();
            sex0Var2.getClass();
            io.reactivex.rxjava3.internal.operators.observable.m1 e = oxz.e(viewContext);
            omz omzVar2 = new omz(this);
            e.subscribe(omzVar2);
            this.n = omzVar2;
        }
        W();
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, xsna.sy80] */
    public final sy80 t() {
        return this.g;
    }

    public final void u2(LiveAnalyticsHandler liveAnalyticsHandler) {
        this.z = (dlz) liveAnalyticsHandler;
    }

    public final void v2(sy80 sy80Var) {
        this.g = sy80Var;
    }

    public final void w1(boolean z) {
        this.p = z;
    }

    public final void w2(String str) {
        this.x = str;
    }

    public final void x2() {
        this.r = 130L;
    }

    public final void y2() {
        io.reactivex.rxjava3.disposables.c cVar = this.m;
        if (cVar != null) {
            cVar.dispose();
            this.m = null;
        }
        io.reactivex.rxjava3.disposables.c cVar2 = this.l;
        if (cVar2 != null) {
            cVar2.dispose();
            this.l = null;
        }
        io.reactivex.rxjava3.disposables.c cVar3 = this.o;
        if (cVar3 != null) {
            cVar3.dispose();
            this.o = null;
        }
    }

    public final void z2() {
        List<VideoOwner> list;
        mmz mmzVar = this.e;
        if (!mmzVar.I0() || this.t == null) {
            return;
        }
        VideoOwner videoOwner = this.u.get(mmzVar.getCurrentPosition());
        HashMap hashMap = new HashMap();
        for (VideoOwner videoOwner2 : this.t) {
            hashMap.put(videoOwner2.c, videoOwner2);
        }
        List<VideoOwner> list2 = this.u;
        Object[] objArr = (Object[]) Array.newInstance((Class<?>) VideoOwner.class, 0);
        if (list2 instanceof Collection) {
            list = list2;
        } else {
            Iterator<T> it = list2.iterator();
            ArrayList arrayList = new ArrayList();
            lwx.a(arrayList, it);
            list = arrayList;
        }
        ArrayList o = e43.o((VideoOwner[]) list.toArray(objArr));
        Iterator it2 = o.iterator();
        while (it2.hasNext()) {
            VideoOwner videoOwner3 = (VideoOwner) it2.next();
            if (hashMap.get(videoOwner3.c) == null && !videoOwner.c.equals(videoOwner3.c)) {
                it2.remove();
                List<VideoOwner> l = e43.l((VideoOwner[]) o.toArray((Object[]) Array.newInstance((Class<?>) VideoOwner.class, 0)));
                this.u = l;
                nmz nmzVar = this.h;
                nmzVar.h = l;
                nmzVar.notifyDataSetChanged();
            }
        }
        HashMap hashMap2 = new HashMap();
        Iterator it3 = o.iterator();
        while (it3.hasNext()) {
            VideoOwner videoOwner4 = (VideoOwner) it3.next();
            hashMap2.put(videoOwner4.c, videoOwner4);
        }
        for (VideoOwner videoOwner5 : this.t) {
            if (hashMap2.get(videoOwner5.c) == null) {
                o.add(videoOwner5);
                List<VideoOwner> l2 = e43.l((VideoOwner[]) o.toArray((Object[]) Array.newInstance((Class<?>) VideoOwner.class, 0)));
                this.u = l2;
                nmz nmzVar2 = this.h;
                nmzVar2.h = l2;
                nmzVar2.notifyDataSetChanged();
            }
        }
        List<VideoOwner> list3 = this.u;
        ArrayList arrayList2 = new ArrayList();
        for (Object obj : list3) {
            if (((VideoOwner) obj).e != this.y.e) {
                arrayList2.add(obj);
            }
        }
        this.v = arrayList2;
        nef0 nef0Var = this.j;
        if (!nef0Var.n && nef0Var.f != null) {
            Q(this.j);
        }
        Iterator it4 = this.b.iterator();
        while (it4.hasNext()) {
            Q((vcf0) it4.next());
        }
        this.h.notifyDataSetChanged();
        this.t = null;
    }
}
