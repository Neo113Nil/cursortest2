package xsna;

import android.util.Size;
import com.vk.photo.editor.features.collage.gl.GLCollageView;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import kotlin.collections.EmptyList;
import xsna.fer;
import xsna.l2g;
import xsna.moo0;
import xsna.qqa;
import xsna.uek0;
import xsna.w0g;

/* compiled from: GLCollageController.kt */
/* loaded from: classes4.dex */
public final class l1t {
    public final GLCollageView a;
    public final y1t b;
    public final we0 c;
    public final f2b0 d;
    public final gzs<p0u> e;
    public final u40 f;
    public HashMap<n2k0, m1t> g = new HashMap<>();
    public final Object h = new Object();
    public Object i;
    public Object j;
    public boolean k;
    public volatile yok0 l;
    public com.vk.photo.editor.features.colorgrading.a m;
    public o1t n;
    public volatile h1t o;
    public final h2t p;
    public final utk0 q;
    public final utk0 r;
    public final utk0 s;
    public final utk0 t;
    public final utk0 u;

    public l1t(GLCollageView gLCollageView, y1t y1tVar, h6 h6Var, we0 we0Var, f2b0 f2b0Var, l3g l3gVar, gzs gzsVar, ozf ozfVar, u40 u40Var) {
        this.a = gLCollageView;
        this.b = y1tVar;
        this.c = we0Var;
        this.d = f2b0Var;
        this.e = gzsVar;
        this.f = u40Var;
        jgp jgpVar = jgp.b;
        this.i = jgpVar;
        this.j = jgpVar;
        this.p = new h2t(h6Var, we0Var, l3gVar, u40Var);
        utk0 a = vtk0.a(-1);
        this.q = a;
        utk0 a2 = vtk0.a(EmptyList.b);
        this.r = a2;
        utk0 a3 = vtk0.a(null);
        this.s = a3;
        utk0 a4 = vtk0.a(null);
        this.t = a4;
        utk0 a5 = vtk0.a(null);
        this.u = a5;
        List<? extends moo0.a> l = e43.l(new uek0.a(we0Var, gzsVar, a), new l2g.a(a2, a3, we0Var, gzsVar, a4, ozfVar), new qqa.a(we0Var, gzsVar, a4), new fer.a(we0Var, gzsVar, a5));
        y1tVar.d = l;
        List<? extends moo0.a> list = l;
        ArrayList arrayList = new ArrayList(c5g.u(list, 10));
        Iterator<T> it = list.iterator();
        while (it.hasNext()) {
            arrayList.add(((moo0.a) it.next()).a(y1tVar.c));
        }
    }

    public static n1t a(com.vk.photo.editor.features.colorgrading.a aVar, o1t o1tVar) {
        aVar.getClass();
        return new n1t(o1tVar, aVar.a, aVar.b, aVar.c, aVar.d, aVar.e, aVar.f, aVar.g, aVar.h, aVar.i, aVar.j, aVar.k);
    }

    public final void b(ag5 ag5Var) {
        boolean z = this.k;
        this.k = ag5Var == null || !ag5Var.I();
        this.s.setValue(ag5Var);
        this.a.b();
        if (!this.k || z) {
            return;
        }
        Iterator<Map.Entry<n2k0, m1t>> it = this.g.entrySet().iterator();
        while (it.hasNext()) {
            m1t value = it.next().getValue();
            if (value.k == null) {
                this.p.c(new k1t(value.i, true, this));
            }
        }
    }

    public final void c(int i) {
        Integer valueOf = Integer.valueOf(i);
        utk0 utk0Var = this.q;
        utk0Var.getClass();
        utk0Var.i(null, valueOf);
        this.a.b();
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:42:0x00cc A[Catch: all -> 0x0059, TryCatch #1 {all -> 0x0059, blocks: (B:4:0x0005, B:5:0x0032, B:7:0x0038, B:9:0x0048, B:11:0x0050, B:12:0x005c, B:13:0x0061, B:16:0x0065, B:18:0x006d, B:19:0x0075, B:24:0x007b, B:25:0x0087, B:27:0x008d, B:32:0x00af, B:35:0x00b4, B:37:0x00bc, B:42:0x00cc, B:47:0x00f3, B:50:0x0127, B:54:0x0131, B:59:0x00ef, B:61:0x00e4, B:62:0x00d2, B:64:0x00da, B:67:0x0141, B:68:0x016a, B:76:0x018b, B:77:0x018c, B:78:0x0199, B:80:0x019f, B:83:0x01b4, B:88:0x01c0, B:96:0x01d7, B:97:0x01d8, B:70:0x016b, B:71:0x016f, B:73:0x0175, B:75:0x0189), top: B:3:0x0005, inners: #0 }] */
    /* JADX WARN: Removed duplicated region for block: B:49:0x0125  */
    /* JADX WARN: Removed duplicated region for block: B:58:0x00ed A[ADDED_TO_REGION] */
    /* JADX WARN: Removed duplicated region for block: B:62:0x00d2 A[Catch: all -> 0x0059, TryCatch #1 {all -> 0x0059, blocks: (B:4:0x0005, B:5:0x0032, B:7:0x0038, B:9:0x0048, B:11:0x0050, B:12:0x005c, B:13:0x0061, B:16:0x0065, B:18:0x006d, B:19:0x0075, B:24:0x007b, B:25:0x0087, B:27:0x008d, B:32:0x00af, B:35:0x00b4, B:37:0x00bc, B:42:0x00cc, B:47:0x00f3, B:50:0x0127, B:54:0x0131, B:59:0x00ef, B:61:0x00e4, B:62:0x00d2, B:64:0x00da, B:67:0x0141, B:68:0x016a, B:76:0x018b, B:77:0x018c, B:78:0x0199, B:80:0x019f, B:83:0x01b4, B:88:0x01c0, B:96:0x01d7, B:97:0x01d8, B:70:0x016b, B:71:0x016f, B:73:0x0175, B:75:0x0189), top: B:3:0x0005, inners: #0 }] */
    /* JADX WARN: Type inference failed for: r2v1, types: [java.lang.Object, java.util.Map] */
    /* JADX WARN: Type inference failed for: r2v2, types: [java.lang.Object, java.util.Map] */
    /* JADX WARN: Type inference failed for: r4v0, types: [java.lang.Object, java.util.Map] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void d(w0g w0gVar, g2g g2gVar) {
        boolean z;
        Map map;
        boolean z2;
        synchronized (this.h) {
            try {
                Map t = pn00.t(this.g);
                HashMap hashMap = new HashMap();
                Map t2 = pn00.t(this.j);
                HashMap hashMap2 = new HashMap();
                HashSet hashSet = new HashSet();
                HashMap<n2k0, m1t> hashMap3 = new HashMap<>();
                HashMap hashMap4 = new HashMap();
                Iterator it = t.entrySet().iterator();
                while (it.hasNext()) {
                    m1t m1tVar = (m1t) ((Map.Entry) it.next()).getValue();
                    f2t f2tVar = m1tVar.j;
                    if (f2tVar != null) {
                        e4p e4pVar = m1tVar.i;
                        Object obj = hashMap4.get(e4pVar);
                        if (obj == null) {
                            obj = new ArrayList();
                            hashMap4.put(e4pVar, obj);
                        }
                        ((ArrayList) obj).add(f2tVar);
                    }
                    f2t f2tVar2 = m1tVar.k;
                    if (f2tVar2 != null) {
                        e4p e4pVar2 = m1tVar.i;
                        Object obj2 = hashMap4.get(e4pVar2);
                        if (obj2 == null) {
                            obj2 = new ArrayList();
                            hashMap4.put(e4pVar2, obj2);
                        }
                        ((ArrayList) obj2).add(f2tVar2);
                    }
                }
                for (Map.Entry<n2k0, w0g.a> entry : w0gVar.a().entrySet()) {
                    n2k0 key = entry.getKey();
                    entry.getValue();
                    c2g c2gVar = g2gVar.a.get(key);
                    if (c2gVar != null && c2gVar.i != null) {
                        m1t m1tVar2 = (m1t) t.get(key);
                        if (m1tVar2 != null && epx.f(m1tVar2.i, c2gVar.i)) {
                            z = false;
                            if (z) {
                                Size size = (Size) t2.get(key);
                                if (size != null) {
                                    hashMap2.put(key, size);
                                }
                            } else {
                                hashSet.add(c2gVar.i);
                            }
                            map = t;
                            hashMap3.put(key, new m1t(c2gVar.a, c2gVar.b, c2gVar.c, c2gVar.d, c2gVar.e, c2gVar.f, c2gVar.g, c2gVar.h, c2gVar.i, (z || m1tVar2 == null) ? null : m1tVar2.j, (z || m1tVar2 == null) ? null : m1tVar2.k));
                            if (!z) {
                                if ((m1tVar2 != null ? m1tVar2.j : null) != null) {
                                    z2 = false;
                                    hashMap.put(key, Boolean.valueOf(z2));
                                    hashMap4.remove(c2gVar.i);
                                    t = map;
                                }
                            }
                            z2 = true;
                            hashMap.put(key, Boolean.valueOf(z2));
                            hashMap4.remove(c2gVar.i);
                            t = map;
                        }
                        z = true;
                        if (z) {
                        }
                        if (z) {
                            if (z) {
                                map = t;
                                hashMap3.put(key, new m1t(c2gVar.a, c2gVar.b, c2gVar.c, c2gVar.d, c2gVar.e, c2gVar.f, c2gVar.g, c2gVar.h, c2gVar.i, (z || m1tVar2 == null) ? null : m1tVar2.j, (z || m1tVar2 == null) ? null : m1tVar2.k));
                                if (!z) {
                                }
                                z2 = true;
                                hashMap.put(key, Boolean.valueOf(z2));
                                hashMap4.remove(c2gVar.i);
                                t = map;
                            }
                            map = t;
                            hashMap3.put(key, new m1t(c2gVar.a, c2gVar.b, c2gVar.c, c2gVar.d, c2gVar.e, c2gVar.f, c2gVar.g, c2gVar.h, c2gVar.i, (z || m1tVar2 == null) ? null : m1tVar2.j, (z || m1tVar2 == null) ? null : m1tVar2.k));
                            if (!z) {
                            }
                            z2 = true;
                            hashMap.put(key, Boolean.valueOf(z2));
                            hashMap4.remove(c2gVar.i);
                            t = map;
                        }
                        map = t;
                        hashMap3.put(key, new m1t(c2gVar.a, c2gVar.b, c2gVar.c, c2gVar.d, c2gVar.e, c2gVar.f, c2gVar.g, c2gVar.h, c2gVar.i, (z || m1tVar2 == null) ? null : m1tVar2.j, (z || m1tVar2 == null) ? null : m1tVar2.k));
                        if (!z) {
                        }
                        z2 = true;
                        hashMap.put(key, Boolean.valueOf(z2));
                        hashMap4.remove(c2gVar.i);
                        t = map;
                    }
                    map = t;
                    t = map;
                }
                this.g = hashMap3;
                this.i = hashMap;
                this.j = hashMap2;
                this.r.setValue(j5g.O0(hashMap3.values()));
                ArrayList v = c5g.v(hashMap4.values());
                l3g l3gVar = this.p.c;
                y1t y1tVar = (y1t) l3gVar.b;
                synchronized (y1tVar.g) {
                    try {
                        Iterator it2 = v.iterator();
                        while (it2.hasNext()) {
                            y1tVar.g.add(Integer.valueOf(((f2t) it2.next()).a));
                        }
                        s3q0 s3q0Var = s3q0.a;
                    } finally {
                    }
                }
                ((k3g) l3gVar.c).p.b();
                Iterator it3 = hashSet.iterator();
                while (it3.hasNext()) {
                    e4p e4pVar3 = (e4p) it3.next();
                    this.p.c(new k1t(e4pVar3, false, this));
                    if (this.k) {
                        this.p.c(new k1t(e4pVar3, true, this));
                    }
                }
                s3q0 s3q0Var2 = s3q0.a;
            } catch (Throwable th) {
                throw th;
            }
        }
        this.a.b();
        this.d.g(this.i);
        this.d.h(this.j);
    }
}
