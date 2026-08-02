package sg.bigo.ads.dh;

import android.content.Context;
import android.os.SystemClock;
import android.text.TextUtils;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import com.coremedia.iso.boxes.FreeSpaceBox;
import com.mbridge.msdk.foundation.entity.CampaignEx;
import com.mbridge.msdk.playercommon.exoplayer2.util.MimeTypes;
import io.appmetrica.analytics.coreutils.internal.StringUtils;
import java.io.StringReader;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import javax.xml.parsers.DocumentBuilderFactory;
import org.w3c.dom.Node;
import org.xml.sax.InputSource;
import ru.ok.proto.PublisherConfiguration;
import sg.bigo.ads.common.utils.r;
import sg.bigo.ads.common.utils.s;
import sg.bigo.ads.dh.a;

/* loaded from: classes9.dex */
public final class k {
    private static final String[] f = {MimeTypes.VIDEO_MP4, "video/3gp", MimeTypes.VIDEO_H263};
    public int a;

    @Nullable
    public e d;

    @Nullable
    public List<n> e;
    private float g;
    private final int j;
    private int k;
    public long b = 0;
    public String c = "";
    private final List<sg.bigo.ads.di.b> h = new ArrayList();
    private a i = new a() { // from class: sg.bigo.ads.dh.k.1
        @Override // sg.bigo.ads.dh.k.a
        @Nullable
        public final String a(@NonNull Context context, @NonNull q qVar, @NonNull List<n> list) {
            return k.a(k.this, context, qVar, list);
        }
    };
    private String l = "";
    private final List<sg.bigo.ads.cv.a> m = new ArrayList();

    public interface a {
        @Nullable
        String a(@NonNull Context context, @NonNull q qVar, @NonNull List<n> list);
    }

    public k(int i, int i2) {
        this.g = 0.1f;
        this.k = 0;
        this.g = 30.0f;
        this.j = i;
        this.k = i2;
    }

    public static /* synthetic */ String a(k kVar, Context context, q qVar, List list) {
        String str;
        kVar.e = list;
        String k = qVar.k();
        if (r.a((CharSequence) k)) {
            sg.bigo.ads.bn.a.a(1, "VASTParser", "The redirect url from wrapper is invalid.");
            kVar.d = new e(10070, "The redirect url from wrapper is invalid.");
            return null;
        }
        int i = kVar.a;
        if (i >= 6) {
            sg.bigo.ads.bn.a.a(1, "VASTParser", "The wrapper redirects too much times.");
            kVar.d = new e(10071, "The wrapper redirects too much times");
            return null;
        }
        kVar.a = i + 1;
        kVar.c = k;
        sg.bigo.ads.bs.a aVar = new sg.bigo.ads.bs.a(new sg.bigo.ads.bs.d(k), context);
        aVar.l = sg.bigo.ads.bp.e.f();
        sg.bigo.ads.bo.c<sg.bigo.ads.bt.a> a2 = sg.bigo.ads.bo.g.a(aVar);
        sg.bigo.ads.bt.a aVar2 = a2.a;
        if (aVar2 != null) {
            return new sg.bigo.ads.bt.d(aVar2).a();
        }
        sg.bigo.ads.bn.a.a(1, "VASTParser", "The wrapper failed to redirect http request.");
        if (a2.b != null) {
            str = "The wrapper failed to redirect http request., code: " + a2.b.a + ", msg: " + a2.b.getMessage();
        } else {
            str = "The wrapper failed to redirect http request., response to string failed";
        }
        kVar.d = new e(10072, str);
        return null;
    }

    @Nullable
    private b a(Context context, @NonNull List<i> list) {
        i iVar;
        ArrayList arrayList = new ArrayList();
        if (list.isEmpty()) {
            this.d = new e(10065, " media file node can not found");
            return null;
        }
        Iterator<i> it = list.iterator();
        StringBuilder sb = null;
        while (it.hasNext()) {
            String a2 = it.next().a();
            if (!r.a((CharSequence) a2)) {
                ArrayList arrayList2 = new ArrayList(Arrays.asList(f));
                sg.bigo.ads.ai.j jVar = sg.bigo.ads.ai.k.a;
                if (jVar != null && jVar.h()) {
                    arrayList2.add("application/javascript");
                }
                if (!arrayList2.contains(a2.toLowerCase())) {
                }
            }
            it.remove();
            if (sb == null) {
                sb = new StringBuilder(" media file all mimetype unsupport, types are ");
            }
            sb.append(a2);
            sb.append(StringUtils.COMMA);
        }
        if (list.isEmpty()) {
            this.d = new e(10066, sb == null ? " media file all mimetype unsupport" : sb.toString());
            return null;
        }
        Iterator<i> it2 = list.iterator();
        while (it2.hasNext()) {
            if (r.a((CharSequence) it2.next().b())) {
                it2.remove();
            }
        }
        if (list.isEmpty()) {
            this.d = new e(10067, " though mimetype support but url is empty");
            return null;
        }
        Iterator<i> it3 = list.iterator();
        ArrayList arrayList3 = null;
        while (it3.hasNext()) {
            i next = it3.next();
            String a3 = next.a();
            String b = next.b();
            if (!r.a((CharSequence) b)) {
                int intValue = sg.bigo.ads.dg.a.d(next.a, "width").intValue();
                int intValue2 = sg.bigo.ads.dg.a.d(next.a, "height").intValue();
                if (intValue <= 0 || intValue2 <= 0) {
                    it3.remove();
                    if (arrayList3 == null) {
                        arrayList3 = new ArrayList();
                    }
                    arrayList3.add(next);
                } else {
                    int c = next.c();
                    int d = next.d();
                    String e = next.e();
                    int i = this.j;
                    if (i != 0) {
                        if (i == 1) {
                            if (intValue <= intValue2) {
                            }
                        } else if (i == 2 && intValue >= intValue2) {
                        }
                    }
                    arrayList.add(new b(intValue, intValue2, c, d, b, a3, e));
                }
            }
        }
        int i2 = 0;
        if (arrayList.isEmpty() && arrayList3 != null && !arrayList3.isEmpty() && (iVar = (i) arrayList3.get(0)) != null) {
            arrayList.add(new b(0, 0, iVar.c(), iVar.d(), iVar.b(), iVar.a(), iVar.e()));
        }
        if (arrayList.isEmpty()) {
            sg.bigo.ads.bn.a.a(1, "VASTParser", "Cannot find the best network media config.");
            this.d = new e(10068, "video width to height ratio is not suitable for its direction");
            return null;
        }
        if (arrayList.size() == 1) {
            arrayList.size();
            return (b) arrayList.get(0);
        }
        b bVar = (b) arrayList.get(0);
        ArrayList arrayList4 = new ArrayList(arrayList);
        if (arrayList4.size() <= 1) {
            return bVar;
        }
        int i3 = this.k;
        if (i3 == 0) {
            i2 = sg.bigo.ads.common.utils.f.b(context);
        } else if (i3 != 1) {
            if (i3 == 2) {
                i2 = PublisherConfiguration.DEFAULT_MAX_RES;
            } else if (i3 == 3) {
                i2 = 1080;
            }
        }
        return a(arrayList4, Math.min(i2, sg.bigo.ads.common.utils.f.b(context)));
    }

    private static b a(List<b> list, int i) {
        b bVar = null;
        int i2 = Integer.MAX_VALUE;
        for (b bVar2 : list) {
            int abs = Math.abs(Math.min(bVar2.a, bVar2.b) - i);
            if (abs < i2) {
                bVar = bVar2;
                i2 = abs;
            }
        }
        return bVar;
    }

    @Nullable
    public final p a(Context context, String str) {
        p pVar = null;
        this.d = null;
        this.a = 0;
        if (r.a((CharSequence) str)) {
            this.d = new e(10060, "invalidate delivery params");
            return null;
        }
        long elapsedRealtime = SystemClock.elapsedRealtime();
        try {
            pVar = a(context, str, this.i, new ArrayList());
            if (pVar != null) {
                a(pVar);
            }
            this.b = SystemClock.elapsedRealtime() - elapsedRealtime;
            return pVar;
        } catch (Throwable th) {
            sg.bigo.ads.bn.a.a(1, "VASTParser", "Parse vast xml failed: " + th.getCause());
            this.d = new e(10061, th.getMessage());
            return pVar;
        }
    }

    @Nullable
    private p a(@NonNull Context context, @NonNull String str, @NonNull a aVar, @NonNull List<n> list) {
        e eVar;
        this.e = list;
        m mVar = new m();
        mVar.a = DocumentBuilderFactory.newInstance().newDocumentBuilder().parse(new InputSource(new StringReader(str.replaceFirst("<\\?.*\\?>", ""))));
        list.addAll(mVar.b());
        List<d> a2 = mVar.a();
        if (a2.isEmpty()) {
            eVar = new e(10062, "not found ad node");
        } else {
            d dVar = a2.get(0);
            Node a3 = sg.bigo.ads.dg.a.a(dVar.a, "InLine");
            g gVar = a3 != null ? new g(a3) : null;
            if (gVar != null) {
                p a4 = a(context, gVar, list);
                this.h.addAll(gVar.a);
                if (a4 != null) {
                    return a4;
                }
                if (this.d == null) {
                    this.d = new e(10063, "not match media file found other reason");
                }
                return null;
            }
            Node a5 = sg.bigo.ads.dg.a.a(dVar.a, "Wrapper");
            q qVar = a5 != null ? new q(a5) : null;
            if (qVar != null) {
                String h = qVar.h();
                if (r.b((CharSequence) h)) {
                    this.l = h;
                }
                ArrayList arrayList = new ArrayList(list);
                arrayList.addAll(qVar.a());
                String a6 = aVar.a(context, qVar, arrayList);
                if (a6 == null) {
                    return null;
                }
                List<sg.bigo.ads.cv.a> j = qVar.j();
                if (j != null && j.size() > 0) {
                    this.m.addAll(j);
                }
                p a7 = a(context, a6, aVar, arrayList);
                if (a7 == null) {
                    return null;
                }
                a7.a(qVar.b());
                List<h> a8 = qVar.a("CompanionAds");
                this.h.addAll(qVar.a);
                Iterator<h> it = a8.iterator();
                while (it.hasNext()) {
                    a(it.next(), a7);
                }
                a(qVar, a7);
                int i = qVar.i();
                if (a7.v == -1) {
                    a7.v = i;
                }
                if (this.m.size() > 0) {
                    a7.C = this.m;
                }
                return a7;
            }
            eVar = new e(10064, "not found wrapper node");
        }
        this.d = eVar;
        return null;
    }

    @Nullable
    private p a(@NonNull Context context, @NonNull g gVar, @NonNull List<n> list) {
        h next;
        b a2;
        List<Node> c;
        List<h> a3 = gVar.a("CompanionAds");
        String h = gVar.h();
        if (r.b((CharSequence) h)) {
            this.l = h;
        }
        list.addAll(gVar.a());
        Iterator<h> it = a3.iterator();
        do {
            if (!it.hasNext()) {
                return null;
            }
            next = it.next();
            ArrayList arrayList = new ArrayList();
            Node a4 = sg.bigo.ads.dg.a.a(next.a, "MediaFiles");
            if (a4 != null && (c = sg.bigo.ads.dg.a.c(a4, "MediaFile")) != null) {
                Iterator<Node> it2 = c.iterator();
                while (it2.hasNext()) {
                    arrayList.add(new i(it2.next()));
                }
            }
            a2 = a(context, arrayList);
        } while (a2 == null);
        p pVar = new p();
        pVar.a(gVar.b());
        a(next, pVar);
        pVar.m = next.a();
        long i = next.i();
        if (i > 0) {
            pVar.s = i;
        }
        Node a5 = sg.bigo.ads.dg.a.a(next.a, "AdParameters");
        pVar.B = a5 != null ? new sg.bigo.ads.dj.a(TextUtils.equals(sg.bigo.ads.dg.a.e(a5, "xmlEncoded"), "true"), sg.bigo.ads.dg.a.b(a5)) : null;
        pVar.n = a2;
        int i2 = a2.a;
        int i3 = a2.b;
        pVar.x = i2;
        pVar.w = i3;
        pVar.p = gVar.f();
        pVar.q = gVar.g();
        pVar.r = this.l;
        pVar.v = gVar.i();
        long a6 = s.a();
        if (a6 > 0) {
            pVar.u = a6;
        }
        pVar.t = gVar.e() * 1000;
        pVar.k.addAll(list);
        a(gVar, pVar);
        List<sg.bigo.ads.cv.a> j = gVar.j();
        if (j != null && j.size() > 0) {
            this.m.addAll(j);
        }
        if (this.m.size() > 0) {
            pVar.C = this.m;
        }
        return pVar;
    }

    private static void a(@NonNull g gVar, @NonNull p pVar) {
        pVar.b(gVar.c());
        pVar.c(gVar.d());
    }

    private static void a(@NonNull h hVar, @NonNull p pVar) {
        pVar.l(hVar.h());
        pVar.k(hVar.g());
        pVar.d(hVar.a(CampaignEx.JSON_NATIVE_VIDEO_COMPLETE));
        pVar.e(hVar.a(FreeSpaceBox.TYPE));
        pVar.f(hVar.d());
        pVar.g(hVar.c());
        pVar.h(hVar.f());
        pVar.i(hVar.e());
        pVar.j(hVar.b());
    }

    private void a(p pVar) {
        a.C2478a c2478a;
        List<a.C2478a> list;
        List<sg.bigo.ads.di.b> list2 = this.h;
        if (sg.bigo.ads.common.utils.l.a((Collection) list2)) {
            return;
        }
        Iterator<sg.bigo.ads.di.b> it = list2.iterator();
        while (it.hasNext()) {
            List<sg.bigo.ads.di.d> a2 = it.next().a();
            if (!sg.bigo.ads.common.utils.l.a((Collection) a2)) {
                sg.bigo.ads.dh.a aVar = new sg.bigo.ads.dh.a();
                for (sg.bigo.ads.di.d dVar : a2) {
                    if (dVar != null) {
                        List<sg.bigo.ads.di.g> c = dVar.c();
                        if (!sg.bigo.ads.common.utils.l.a((Collection) c)) {
                            for (sg.bigo.ads.di.g gVar : c) {
                                if (gVar instanceof sg.bigo.ads.di.h) {
                                    sg.bigo.ads.di.h hVar = (sg.bigo.ads.di.h) gVar;
                                    String a3 = hVar.a();
                                    if (a3 != null && a3.contains("image/")) {
                                        c2478a = new a.C2478a(hVar.b(), dVar.a(), dVar.b(), a3, dVar.d());
                                        list = aVar.b;
                                        list.add(c2478a);
                                    }
                                } else if (gVar instanceof sg.bigo.ads.di.e) {
                                    c2478a = new a.C2478a(((sg.bigo.ads.di.e) gVar).a(), dVar.a(), dVar.b(), null, dVar.d());
                                    list = aVar.a;
                                    list.add(c2478a);
                                }
                            }
                            List<sg.bigo.ads.di.c> e = dVar.e();
                            if (!sg.bigo.ads.common.utils.l.a((Collection) e)) {
                                Iterator<sg.bigo.ads.di.c> it2 = e.iterator();
                                while (it2.hasNext()) {
                                    pVar.z.add(new n(it2.next().a()));
                                }
                            }
                            List<String> f2 = dVar.f();
                            if (!sg.bigo.ads.common.utils.l.a((Collection) f2)) {
                                Iterator<String> it3 = f2.iterator();
                                while (it3.hasNext()) {
                                    pVar.y.add(new n(it3.next()));
                                }
                            }
                        }
                    }
                }
                pVar.A.add(aVar);
            }
        }
    }
}
