package xsna;

import com.facebook.common.internal.ImmutableSet;
import com.facebook.imagepipeline.common.Priority;
import com.facebook.imagepipeline.request.ImageRequest;
import com.unity3d.ads.BuildConfig;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Map;

/* compiled from: BaseProducerContext.java */
/* loaded from: classes12.dex */
public class tk6 implements uhd0 {
    public static final ImmutableSet n;
    public static final Object o;
    public final ImageRequest b;
    public final String c;
    public final yhd0 d;
    public final Object e;
    public final ImageRequest.RequestLevel f;
    public final HashMap g;
    public boolean h;
    public Priority i;
    public boolean j;
    public boolean k;
    public final ArrayList l;
    public final ukw m;

    static {
        int i = ImmutableSet.b;
        HashSet hashSet = new HashSet(2);
        Collections.addAll(hashSet, "id", "uri_source");
        n = new ImmutableSet(hashSet);
        o = new Object();
    }

    public tk6(ImageRequest imageRequest, String str, String str2, yhd0 yhd0Var, Object obj, ImageRequest.RequestLevel requestLevel, boolean z, boolean z2, Priority priority, ukw ukwVar) {
        this.b = imageRequest;
        this.c = str;
        HashMap hashMap = new HashMap();
        this.g = hashMap;
        hashMap.put("id", str);
        hashMap.put("uri_source", imageRequest == null ? "null-request" : imageRequest.b);
        this.d = yhd0Var;
        this.e = obj == null ? o : obj;
        this.f = requestLevel;
        this.h = z;
        this.i = priority;
        this.j = z2;
        this.k = false;
        this.l = new ArrayList();
        this.m = ukwVar;
    }

    public static void a(ArrayList arrayList) {
        if (arrayList == null) {
            return;
        }
        Iterator it = arrayList.iterator();
        while (it.hasNext()) {
            ((vhd0) it.next()).a();
        }
    }

    public static void d(ArrayList arrayList) {
        if (arrayList == null) {
            return;
        }
        Iterator it = arrayList.iterator();
        while (it.hasNext()) {
            ((vhd0) it.next()).d();
        }
    }

    public static void e(ArrayList arrayList) {
        if (arrayList == null) {
            return;
        }
        Iterator it = arrayList.iterator();
        while (it.hasNext()) {
            ((vhd0) it.next()).b();
        }
    }

    @Override // xsna.kuu
    public final void b(Map<String, ?> map) {
        if (map == null) {
            return;
        }
        for (Map.Entry<String, ?> entry : map.entrySet()) {
            h(entry.getValue(), entry.getKey());
        }
    }

    @Override // xsna.kuu
    public final <T> T c(String str) {
        return (T) this.g.get(str);
    }

    public final void f() {
        ArrayList arrayList;
        synchronized (this) {
            if (this.k) {
                arrayList = null;
            } else {
                this.k = true;
                arrayList = new ArrayList(this.l);
            }
        }
        if (arrayList == null) {
            return;
        }
        Iterator it = arrayList.iterator();
        while (it.hasNext()) {
            ((vhd0) it.next()).c();
        }
    }

    @Override // xsna.kuu
    public final Map<String, Object> getExtras() {
        return this.g;
    }

    @Override // xsna.uhd0
    public final String getId() {
        return this.c;
    }

    @Override // xsna.uhd0
    public final synchronized Priority getPriority() {
        return this.i;
    }

    @Override // xsna.kuu
    public final void h(Object obj, String str) {
        if (n.contains(str)) {
            return;
        }
        this.g.put(str, obj);
    }

    @Override // xsna.uhd0
    public final Object m() {
        return this.e;
    }

    @Override // xsna.uhd0
    public final ukw n() {
        return this.m;
    }

    @Override // xsna.uhd0
    public final synchronized boolean o() {
        return this.j;
    }

    @Override // xsna.uhd0
    public final void p(uk6 uk6Var) {
        boolean z;
        synchronized (this) {
            this.l.add(uk6Var);
            z = this.k;
        }
        if (z) {
            uk6Var.c();
        }
    }

    @Override // xsna.uhd0
    public final yhd0 q() {
        return this.d;
    }

    @Override // xsna.uhd0
    public final ImageRequest r() {
        return this.b;
    }

    @Override // xsna.uhd0
    public final void s(String str, String str2) {
        HashMap hashMap = this.g;
        hashMap.put("origin", str);
        hashMap.put("origin_sub", str2);
    }

    @Override // xsna.uhd0
    public final void t(String str) {
        s(str, BuildConfig.FLAVOR);
    }

    @Override // xsna.uhd0
    public final synchronized boolean v() {
        return this.h;
    }

    @Override // xsna.uhd0
    public final ImageRequest.RequestLevel w() {
        return this.f;
    }
}
