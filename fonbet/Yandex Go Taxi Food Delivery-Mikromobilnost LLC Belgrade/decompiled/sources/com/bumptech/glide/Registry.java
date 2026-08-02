package com.bumptech.glide;

import defpackage.bav;
import defpackage.bpg;
import defpackage.cit;
import defpackage.cpg;
import defpackage.epg;
import defpackage.gly0;
import defpackage.gxy;
import defpackage.jdj;
import defpackage.n6e0;
import defpackage.ng01;
import defpackage.nw60;
import defpackage.nzn;
import defpackage.og01;
import defpackage.ozn;
import defpackage.puj0;
import defpackage.q430;
import defpackage.qv10;
import defpackage.r430;
import defpackage.r501;
import defpackage.rtj0;
import defpackage.s430;
import defpackage.stj0;
import defpackage.t430;
import defpackage.ttj0;
import defpackage.ul40;
import defpackage.vtj0;
import defpackage.wtj0;
import defpackage.wyn;
import defpackage.x430;
import defpackage.xtj0;
import defpackage.z2a1;
import java.io.InputStream;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;

/* loaded from: classes10.dex */
public class Registry {
    public final t430 a;
    public final ozn b;
    public final ttj0 c;
    public final xtj0 d;
    public final epg e;
    public final og01 f;
    public final bav g;
    public final x430 h = new x430();
    public final gxy i = new gxy();
    public final jdj j;

    public static class MissingComponentException extends RuntimeException {
    }

    public static final class NoImageHeaderParserException extends MissingComponentException {
        public NoImageHeaderParserException() {
            super("Failed to find image header parser.");
        }
    }

    public static class NoModelLoaderAvailableException extends MissingComponentException {
    }

    public static class NoResultEncoderAvailableException extends MissingComponentException {
        public NoResultEncoderAvailableException(Class cls) {
            super(qv10.m(cls, "Failed to find result encoder for resource class: ", ", you may need to consider registering a new Encoder for the requested type or DiskCacheStrategy.DATA/DiskCacheStrategy.NONE if caching your transformed resource is unnecessary."));
        }
    }

    public static class NoSourceEncoderAvailableException extends MissingComponentException {
    }

    public Registry() {
        jdj jdjVar = new jdj(new n6e0(20), new r501(23), new gly0(), false, 24);
        this.j = jdjVar;
        this.a = new t430(jdjVar);
        this.b = new ozn();
        this.c = new ttj0();
        this.d = new xtj0();
        this.e = new epg();
        this.f = new og01();
        this.g = new bav();
        List asList = Arrays.asList("Animation", "Bitmap", "BitmapDrawable");
        ArrayList arrayList = new ArrayList(asList.size());
        arrayList.add("legacy_prepend_all");
        Iterator it = asList.iterator();
        while (it.hasNext()) {
            arrayList.add((String) it.next());
        }
        arrayList.add("legacy_append");
        ttj0 ttj0Var = this.c;
        synchronized (ttj0Var) {
            try {
                ArrayList arrayList2 = new ArrayList(ttj0Var.a);
                ttj0Var.a.clear();
                Iterator it2 = arrayList.iterator();
                while (it2.hasNext()) {
                    ttj0Var.a.add((String) it2.next());
                }
                Iterator it3 = arrayList2.iterator();
                while (it3.hasNext()) {
                    String str = (String) it3.next();
                    if (!arrayList.contains(str)) {
                        ttj0Var.a.add(str);
                    }
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public final void a(Class cls, wyn wynVar) {
        ozn oznVar = this.b;
        synchronized (oznVar) {
            oznVar.a.add(new nzn(cls, wynVar));
        }
    }

    public final void b(Class cls, vtj0 vtj0Var) {
        xtj0 xtj0Var = this.d;
        synchronized (xtj0Var) {
            xtj0Var.a.add(new wtj0(cls, vtj0Var));
        }
    }

    public final void c(Class cls, Class cls2, r430 r430Var) {
        t430 t430Var = this.a;
        synchronized (t430Var) {
            t430Var.a.a(cls, cls2, r430Var);
            t430Var.b.a.clear();
        }
    }

    public final void d(String str, Class cls, Class cls2, rtj0 rtj0Var) {
        ttj0 ttj0Var = this.c;
        synchronized (ttj0Var) {
            ttj0Var.a(str).add(new stj0(cls, cls2, rtj0Var));
        }
    }

    public final ArrayList e() {
        ArrayList arrayList;
        bav bavVar = this.g;
        synchronized (bavVar) {
            arrayList = bavVar.a;
        }
        if (arrayList.isEmpty()) {
            throw new NoImageHeaderParserException();
        }
        return arrayList;
    }

    public final List f(Object obj) {
        List list;
        t430 t430Var = this.a;
        t430Var.getClass();
        Class<?> cls = obj.getClass();
        synchronized (t430Var) {
            s430 s430Var = (s430) t430Var.b.a.get(cls);
            list = s430Var == null ? null : s430Var.a;
            if (list == null) {
                list = Collections.unmodifiableList(t430Var.a.d(cls));
                if (((s430) t430Var.b.a.put(cls, new s430(list))) != null) {
                    throw new IllegalStateException("Already cached loaders for model: " + cls);
                }
            }
        }
        if (list.isEmpty()) {
            throw new NoModelLoaderAvailableException("Failed to find any ModelLoaders registered for model class: " + obj.getClass());
        }
        int size = list.size();
        List list2 = Collections.EMPTY_LIST;
        boolean z = true;
        for (int i = 0; i < size; i++) {
            q430 q430Var = (q430) list.get(i);
            if (q430Var.b(obj)) {
                if (z) {
                    list2 = new ArrayList(size - i);
                    z = false;
                }
                list2.add(q430Var);
            }
        }
        if (!list2.isEmpty()) {
            return list2;
        }
        throw new NoModelLoaderAvailableException("Found ModelLoaders for model class: " + list + ", but none that handle this specific model instance: " + obj);
    }

    public final cpg g(Object obj) {
        cpg build;
        epg epgVar = this.e;
        synchronized (epgVar) {
            try {
                z2a1.d(obj);
                bpg bpgVar = (bpg) epgVar.a.get(obj.getClass());
                if (bpgVar == null) {
                    Iterator it = epgVar.a.values().iterator();
                    while (true) {
                        if (!it.hasNext()) {
                            break;
                        }
                        bpg bpgVar2 = (bpg) it.next();
                        if (bpgVar2.a().isAssignableFrom(obj.getClass())) {
                            bpgVar = bpgVar2;
                            break;
                        }
                    }
                }
                if (bpgVar == null) {
                    bpgVar = epg.b;
                }
                build = bpgVar.build(obj);
            } catch (Throwable th) {
                throw th;
            }
        }
        return build;
    }

    public final void h(bpg bpgVar) {
        epg epgVar = this.e;
        synchronized (epgVar) {
            epgVar.a.put(bpgVar.a(), bpgVar);
        }
    }

    public final void i(Class cls, Class cls2, puj0 puj0Var) {
        og01 og01Var = this.f;
        synchronized (og01Var) {
            og01Var.a.add(new ng01(cls, cls2, puj0Var));
        }
    }

    public final void j(nw60 nw60Var) {
        ArrayList f;
        t430 t430Var = this.a;
        synchronized (t430Var) {
            ul40 ul40Var = t430Var.a;
            synchronized (ul40Var) {
                f = ul40Var.f();
                ul40Var.a(cit.class, InputStream.class, nw60Var);
            }
            Iterator it = f.iterator();
            while (it.hasNext()) {
                ((r430) it.next()).getClass();
            }
            t430Var.b.a.clear();
        }
    }
}
