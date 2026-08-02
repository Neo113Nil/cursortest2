package defpackage;

import android.graphics.Matrix;
import android.graphics.Rect;
import android.graphics.RectF;
import android.hardware.camera2.CameraCaptureSession;
import android.hardware.camera2.CameraDevice;
import android.util.Log;
import android.util.Pair;
import android.util.Range;
import android.util.Rational;
import android.util.Size;
import androidx.camera.core.ProcessingException;
import androidx.camera.core.impl.StreamUseCase;
import androidx.camera.core.j;
import androidx.camera.core.processing.DefaultSurfaceProcessor;
import androidx.camera.core.processing.SurfaceProcessorNode$Out;
import androidx.camera.core.processing.concurrent.DualSurfaceProcessor;
import androidx.camera.core.processing.concurrent.DualSurfaceProcessorNode$Out;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Objects;
import java.util.Set;

/* loaded from: classes10.dex */
public final class iru0 extends j {
    public dyq0 A;
    public dyq0 B;
    public eyq0 C;
    public final jru0 q;
    public final ax31 r;
    public final jud s;
    public final jud t;
    public cjw0 u;
    public q4g v;
    public enw0 w;
    public enw0 x;
    public enw0 y;
    public enw0 z;

    public iru0(br7 br7Var, br7 br7Var2, jud judVar, jud judVar2, HashSet hashSet, zi21 zi21Var) {
        super(M(hashSet));
        this.q = M(hashSet);
        this.s = judVar;
        this.t = judVar2;
        this.r = new ax31(br7Var, br7Var2, hashSet, zi21Var, new ykn0(28, this));
        HashSet hashSet2 = ((j) hashSet.iterator().next()).g;
        this.g = hashSet2 != null ? new HashSet(hashSet2) : null;
    }

    public static ArrayList L(j jVar) {
        ArrayList arrayList = new ArrayList();
        if (!(jVar instanceof iru0)) {
            arrayList.add(jVar.h.y());
            return arrayList;
        }
        Iterator it = ((iru0) jVar).r.a.iterator();
        while (it.hasNext()) {
            arrayList.add(((j) it.next()).h.y());
        }
        return arrayList;
    }

    public static jru0 M(HashSet hashSet) {
        yy40 b = yy40.b();
        new l7s0(b);
        b.w(eav.j2, 34);
        ArrayList arrayList = new ArrayList();
        Iterator it = hashSet.iterator();
        while (it.hasNext()) {
            j jVar = (j) it.next();
            if (jVar.h.d(xi21.t4)) {
                arrayList.add(jVar.h.y());
            } else {
                Log.e("StreamSharing", "A child does not have capture type.");
            }
        }
        b.w(jru0.b, arrayList);
        b.w(icv.q2, 2);
        b.w(xi21.y4, StreamUseCase.PREVIEW_VIDEO_STILL);
        return new jru0(ug70.a(b));
    }

    @Override // androidx.camera.core.j
    public final lru0 A(lru0 lru0Var, lru0 lru0Var2) {
        Objects.toString(lru0Var);
        Objects.toString(lru0Var2);
        sgb1.g(3, "StreamSharing");
        G(I(g(), k() == null ? null : k().f().c(), this.h, lru0Var, lru0Var2));
        r();
        return lru0Var;
    }

    @Override // androidx.camera.core.j
    public final void B() {
        H();
        ax31 ax31Var = this.r;
        Iterator it = ax31Var.a.iterator();
        while (it.hasNext()) {
            j jVar = (j) it.next();
            zw31 zw31Var = (zw31) ax31Var.c.get(jVar);
            Objects.requireNonNull(zw31Var);
            jVar.F(zw31Var);
        }
    }

    public final void H() {
        eyq0 eyq0Var = this.C;
        if (eyq0Var != null) {
            eyq0Var.b();
            this.C = null;
        }
        enw0 enw0Var = this.w;
        if (enw0Var != null) {
            enw0Var.c();
            this.w = null;
        }
        enw0 enw0Var2 = this.x;
        if (enw0Var2 != null) {
            enw0Var2.c();
            this.x = null;
        }
        enw0 enw0Var3 = this.y;
        if (enw0Var3 != null) {
            enw0Var3.c();
            this.y = null;
        }
        enw0 enw0Var4 = this.z;
        if (enw0Var4 != null) {
            enw0Var4.c();
            this.z = null;
        }
        cjw0 cjw0Var = this.u;
        if (cjw0Var != null) {
            cjw0Var.A();
            this.u = null;
        }
        q4g q4gVar = this.v;
        if (q4gVar != null) {
            ((DualSurfaceProcessor) q4gVar.b).release();
            tob1.g(new uhm(4, q4gVar));
            this.v = null;
        }
    }

    public final List I(String str, String str2, xi21 xi21Var, lru0 lru0Var, lru0 lru0Var2) {
        tob1.b();
        ax31 ax31Var = this.r;
        if (lru0Var2 == null) {
            enw0 J = J(str, str2, xi21Var, lru0Var, null);
            br7 e = e();
            Objects.requireNonNull(e);
            cjw0 cjw0Var = new cjw0(e, new DefaultSurfaceProcessor(lru0Var.b()));
            this.u = cjw0Var;
            boolean z = this.k != null;
            int n = n();
            ax31Var.getClass();
            HashMap hashMap = new HashMap();
            Iterator it = ax31Var.a.iterator();
            while (it.hasNext()) {
                j jVar = (j) it.next();
                fsj0 fsj0Var = ax31Var.D;
                br7 br7Var = ax31Var.y;
                ax31 ax31Var2 = ax31Var;
                boolean z2 = z;
                enw0 enw0Var = J;
                m74 s = ax31Var2.s(jVar, fsj0Var, br7Var, enw0Var, n, z2);
                int i = ax31Var2.y.c().i(((icv) jVar.h).n(0));
                zw31 zw31Var = (zw31) ax31Var2.c.get(jVar);
                Objects.requireNonNull(zw31Var);
                zw31Var.c.c = i;
                hashMap.put(jVar, s);
                J = enw0Var;
                z = z2;
                ax31Var = ax31Var2;
            }
            enw0 enw0Var2 = J;
            ax31 ax31Var3 = ax31Var;
            boolean z3 = z;
            SurfaceProcessorNode$Out C = cjw0Var.C(new u84(enw0Var2, new ArrayList(hashMap.values())));
            HashMap hashMap2 = new HashMap();
            for (Map.Entry entry : hashMap.entrySet()) {
                hashMap2.put((j) entry.getKey(), C.get(entry.getValue()));
            }
            ax31Var3.y(hashMap2, ax31Var3.v(enw0Var2, z3));
            Object[] objArr = {this.A.d()};
            ArrayList arrayList = new ArrayList(1);
            Object obj = objArr[0];
            Objects.requireNonNull(obj);
            arrayList.add(obj);
            return Collections.unmodifiableList(arrayList);
        }
        ax31 ax31Var4 = ax31Var;
        enw0 J2 = J(str, str2, xi21Var, lru0Var, lru0Var2);
        Matrix matrix = this.l;
        br7 k = k();
        Objects.requireNonNull(k);
        boolean q = k.q();
        Size f = lru0Var2.f();
        Rect rect = this.k;
        if (rect == null) {
            rect = new Rect(0, 0, f.getWidth(), f.getHeight());
        }
        Rect rect2 = rect;
        br7 k2 = k();
        Objects.requireNonNull(k2);
        int j = j(k2, false);
        br7 k3 = k();
        Objects.requireNonNull(k3);
        enw0 enw0Var3 = new enw0(3, 34, lru0Var2, matrix, q, rect2, j, -1, p(k3));
        this.x = enw0Var3;
        Objects.requireNonNull(k());
        this.z = enw0Var3;
        dyq0 K = K(this.x, xi21Var, lru0Var2);
        this.B = K;
        eyq0 eyq0Var = this.C;
        if (eyq0Var != null) {
            eyq0Var.b();
        }
        eyq0 eyq0Var2 = new eyq0(new hru0(this, str, str2, xi21Var, lru0Var, lru0Var2));
        this.C = eyq0Var2;
        K.f = eyq0Var2;
        enw0 enw0Var4 = this.z;
        this.v = new q4g(e(), k(), new DualSurfaceProcessor(lru0Var.b(), this.s, this.t));
        boolean z4 = this.k != null;
        int n2 = n();
        ax31Var4.getClass();
        HashMap hashMap3 = new HashMap();
        Iterator it2 = ax31Var4.a.iterator();
        while (it2.hasNext()) {
            j jVar2 = (j) it2.next();
            enw0 enw0Var5 = J2;
            ax31 ax31Var5 = ax31Var4;
            m74 s2 = ax31Var5.s(jVar2, ax31Var4.D, ax31Var4.y, enw0Var5, n2, z4);
            fsj0 fsj0Var2 = ax31Var5.E;
            Objects.requireNonNull(fsj0Var2);
            br7 br7Var2 = ax31Var5.z;
            Objects.requireNonNull(br7Var2);
            enw0 enw0Var6 = enw0Var4;
            m74 s3 = ax31Var5.s(jVar2, fsj0Var2, br7Var2, enw0Var6, n2, z4);
            int i2 = ax31Var5.y.c().i(((icv) jVar2.h).n(0));
            zw31 zw31Var2 = (zw31) ax31Var5.c.get(jVar2);
            Objects.requireNonNull(zw31Var2);
            zw31Var2.c.c = i2;
            hashMap3.put(jVar2, new a64(s2, s3));
            enw0Var4 = enw0Var6;
            J2 = enw0Var5;
            ax31Var4 = ax31Var5;
        }
        ax31 ax31Var6 = ax31Var4;
        enw0 enw0Var7 = J2;
        q4g q4gVar = this.v;
        c64 c64Var = new c64(enw0Var7, enw0Var4, new ArrayList(hashMap3.values()));
        q4gVar.getClass();
        tob1.b();
        DualSurfaceProcessor dualSurfaceProcessor = (DualSurfaceProcessor) q4gVar.b;
        Objects.toString(dualSurfaceProcessor);
        Objects.toString(c64Var.a);
        Objects.toString(c64Var.b);
        sgb1.g(3, "DualSurfaceProcessorNode");
        Iterator it3 = c64Var.c.iterator();
        while (it3.hasNext()) {
            Objects.toString((zum) it3.next());
            sgb1.g(3, "SurfaceProcessorNode");
        }
        q4gVar.y = c64Var;
        q4gVar.x = new HashMap<zum, enw0>() { // from class: androidx.camera.core.processing.concurrent.DualSurfaceProcessorNode$Out
        };
        c64 c64Var2 = (c64) q4gVar.y;
        enw0 enw0Var8 = c64Var2.a;
        enw0 enw0Var9 = c64Var2.b;
        Iterator it4 = c64Var2.c.iterator();
        while (it4.hasNext()) {
            zum zumVar = (zum) it4.next();
            DualSurfaceProcessorNode$Out dualSurfaceProcessorNode$Out = (DualSurfaceProcessorNode$Out) q4gVar.x;
            zr80 a = zumVar.a();
            Rect a2 = a.a();
            int c = a.c();
            Iterator it5 = it4;
            boolean g = a.g();
            HashMap hashMap4 = hashMap3;
            Matrix matrix2 = new Matrix(enw0Var8.b);
            matrix2.postConcat(lw01.a(new RectF(a2), lw01.j(a.d()), c, g));
            d6z.n(lw01.e(lw01.i(c, lw01.g(a2)), false, a.d()));
            Size d = a.d();
            Rect rect3 = new Rect(0, 0, d.getWidth(), d.getHeight());
            j4n i3 = enw0Var8.g.i();
            Size d2 = a.d();
            if (d2 == null) {
                ny61.t("Null resolution");
                return null;
            }
            i3.a = d2;
            dualSurfaceProcessorNode$Out.put(zumVar, new enw0(a.e(), a.b(), i3.k(), matrix2, false, rect3, enw0Var8.i - c, -1, enw0Var8.e != g));
            it4 = it5;
            hashMap3 = hashMap4;
        }
        HashMap hashMap5 = hashMap3;
        try {
            dualSurfaceProcessor.onInputSurface(enw0Var8.d((br7) q4gVar.c, true));
        } catch (ProcessingException e2) {
            sgb1.e("DualSurfaceProcessorNode", "Failed to send SurfaceRequest to SurfaceProcessor.", e2);
        }
        try {
            dualSurfaceProcessor.onInputSurface(enw0Var9.d((br7) q4gVar.w, false));
        } catch (ProcessingException e3) {
            sgb1.e("DualSurfaceProcessorNode", "Failed to send SurfaceRequest to SurfaceProcessor.", e3);
        }
        br7 br7Var3 = (br7) q4gVar.c;
        br7 br7Var4 = (br7) q4gVar.w;
        for (Map.Entry<zum, enw0> entry2 : ((DualSurfaceProcessorNode$Out) q4gVar.x).entrySet()) {
            enw0 enw0Var10 = enw0Var8;
            enw0 enw0Var11 = enw0Var9;
            q4gVar.b(br7Var3, br7Var4, enw0Var10, enw0Var11, entry2);
            enw0 value = entry2.getValue();
            br7 br7Var5 = br7Var4;
            br7 br7Var6 = br7Var3;
            q4g q4gVar2 = q4gVar;
            ue5 ue5Var = new ue5(q4gVar2, br7Var6, br7Var5, enw0Var10, enw0Var11, entry2, 2);
            q4gVar = q4gVar2;
            br7Var3 = br7Var6;
            br7Var4 = br7Var5;
            value.a(ue5Var);
            enw0Var8 = enw0Var10;
            enw0Var9 = enw0Var11;
        }
        DualSurfaceProcessorNode$Out dualSurfaceProcessorNode$Out2 = (DualSurfaceProcessorNode$Out) q4gVar.x;
        HashMap hashMap6 = new HashMap();
        for (Map.Entry entry3 : hashMap5.entrySet()) {
            hashMap6.put((j) entry3.getKey(), dualSurfaceProcessorNode$Out2.get(entry3.getValue()));
        }
        ax31Var6.y(hashMap6, ax31Var6.v(enw0Var7, z4));
        Object[] objArr2 = {this.A.d(), this.B.d()};
        ArrayList arrayList2 = new ArrayList(2);
        for (int i4 = 0; i4 < 2; i4++) {
            Object obj2 = objArr2[i4];
            Objects.requireNonNull(obj2);
            arrayList2.add(obj2);
        }
        return Collections.unmodifiableList(arrayList2);
    }

    public final enw0 J(String str, String str2, xi21 xi21Var, lru0 lru0Var, lru0 lru0Var2) {
        Matrix matrix = this.l;
        br7 e = e();
        Objects.requireNonNull(e);
        boolean q = e.q();
        Size f = lru0Var.f();
        Rect rect = this.k;
        if (rect == null) {
            rect = new Rect(0, 0, f.getWidth(), f.getHeight());
        }
        Rect rect2 = rect;
        br7 e2 = e();
        Objects.requireNonNull(e2);
        int j = j(e2, false);
        br7 e3 = e();
        Objects.requireNonNull(e3);
        enw0 enw0Var = new enw0(3, 34, lru0Var, matrix, q, rect2, j, -1, p(e3));
        this.w = enw0Var;
        Objects.requireNonNull(e());
        this.y = enw0Var;
        dyq0 K = K(this.w, xi21Var, lru0Var);
        this.A = K;
        eyq0 eyq0Var = this.C;
        if (eyq0Var != null) {
            eyq0Var.b();
        }
        eyq0 eyq0Var2 = new eyq0(new hru0(this, str, str2, xi21Var, lru0Var, lru0Var2));
        this.C = eyq0Var2;
        K.f = eyq0Var2;
        return this.y;
    }

    public final dyq0 K(enw0 enw0Var, xi21 xi21Var, lru0 lru0Var) {
        dyq0 e = dyq0.e(xi21Var, lru0Var.f());
        r38 r38Var = e.b;
        ax31 ax31Var = this.r;
        Iterator it = ax31Var.a.iterator();
        int i = -1;
        while (it.hasNext()) {
            int i2 = ((jyq0) ((j) it.next()).h.f(xi21.j4)).g.c;
            List list = jyq0.j;
            if (list.indexOf(Integer.valueOf(i)) < list.indexOf(Integer.valueOf(i2))) {
                i = i2;
            }
        }
        if (i != -1) {
            r38Var.c = i;
        }
        Size f = lru0Var.f();
        Iterator it2 = ax31Var.a.iterator();
        while (it2.hasNext()) {
            jyq0 d = dyq0.e(((j) it2.next()).h, f).d();
            s38 s38Var = d.g;
            r38Var.a(s38Var.e);
            List<uo7> list2 = d.e;
            ArrayList arrayList = e.e;
            for (uo7 uo7Var : list2) {
                r38Var.b(uo7Var);
                if (!arrayList.contains(uo7Var)) {
                    arrayList.add(uo7Var);
                }
            }
            for (CameraCaptureSession.StateCallback stateCallback : d.d) {
                ArrayList arrayList2 = e.d;
                if (!arrayList2.contains(stateCallback)) {
                    arrayList2.add(stateCallback);
                }
            }
            for (CameraDevice.StateCallback stateCallback2 : d.c) {
                ArrayList arrayList3 = e.c;
                if (!arrayList3.contains(stateCallback2)) {
                    arrayList3.add(stateCallback2);
                }
            }
            r38Var.c(s38Var.b);
        }
        enw0Var.getClass();
        tob1.b();
        enw0Var.b();
        d6z.y("Consumer can only be linked once.", !enw0Var.j);
        enw0Var.j = true;
        e.c(enw0Var.l, lru0Var.b(), -1);
        r38Var.b(ax31Var.A);
        if (lru0Var.d() != null) {
            e.b(lru0Var.d());
        }
        e.h = lru0Var.g();
        a(e, lru0Var);
        return e;
    }

    @Override // androidx.camera.core.j
    public final xi21 h(boolean z, zi21 zi21Var) {
        jru0 jru0Var = this.q;
        szd a = zi21Var.a(jru0Var.y(), 1);
        if (z) {
            a = szd.q(a, jru0Var.a);
        }
        if (a == null) {
            return null;
        }
        return ((l7s0) o(a)).e();
    }

    @Override // androidx.camera.core.j
    public final Set l(ar7 ar7Var) {
        HashSet hashSet = this.r.a;
        HashSet hashSet2 = null;
        if (hashSet.isEmpty()) {
            return null;
        }
        Iterator it = hashSet.iterator();
        while (it.hasNext()) {
            Set l = ((j) it.next()).l(ar7Var);
            if (l != null) {
                if (hashSet2 == null) {
                    hashSet2 = new HashSet(l);
                } else {
                    hashSet2.retainAll(l);
                }
            }
        }
        return hashSet2;
    }

    @Override // androidx.camera.core.j
    public final Set m() {
        HashSet hashSet = new HashSet();
        hashSet.add(3);
        return hashSet;
    }

    @Override // androidx.camera.core.j
    public final wi21 o(szd szdVar) {
        return new l7s0(yy40.p(szdVar));
    }

    @Override // androidx.camera.core.j
    public final void u() {
        ax31 ax31Var = this.r;
        Iterator it = ax31Var.a.iterator();
        while (it.hasNext()) {
            j jVar = (j) it.next();
            zw31 zw31Var = (zw31) ax31Var.c.get(jVar);
            Objects.requireNonNull(zw31Var);
            jVar.b(zw31Var, null, null, jVar.h(true, ax31Var.x));
        }
    }

    @Override // androidx.camera.core.j
    public final void v() {
        Iterator it = this.r.a.iterator();
        while (it.hasNext()) {
            ((j) it.next()).v();
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:146:0x0111, code lost:
    
        r17 = r10;
     */
    /* JADX WARN: Code restructure failed: missing block: B:147:0x0113, code lost:
    
        if (r14 != false) goto L51;
     */
    /* JADX WARN: Code restructure failed: missing block: B:86:0x01f1, code lost:
    
        if (r12 == false) goto L90;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:125:0x02c3  */
    /* JADX WARN: Removed duplicated region for block: B:66:0x0209  */
    /* JADX WARN: Removed duplicated region for block: B:72:0x020b  */
    /* JADX WARN: Removed duplicated region for block: B:93:0x0235  */
    @Override // androidx.camera.core.j
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final xi21 w(ar7 ar7Var, wi21 wi21Var) {
        xi21 xi21Var;
        Object obj;
        xi21 xi21Var2;
        xi21 xi21Var3;
        yy40 d = wi21Var.d();
        ax31 ax31Var = this.r;
        HashSet hashSet = ax31Var.B;
        fsj0 fsj0Var = ax31Var.D;
        List r = fsj0Var.f.r(34);
        HashSet hashSet2 = fsj0Var.d;
        Iterator it = hashSet2.iterator();
        while (it.hasNext()) {
            xi21 xi21Var4 = (xi21) it.next();
            if (!((Boolean) xi21Var4.g(xi21.s4, Boolean.FALSE)).booleanValue() && (xi21Var4 instanceof icv)) {
                ((icv) xi21Var4).s();
            }
        }
        xi21 xi21Var5 = null;
        List list = (List) d.g(icv.u2, null);
        if (list != null) {
            Iterator it2 = list.iterator();
            while (true) {
                if (!it2.hasNext()) {
                    r = new ArrayList();
                    break;
                }
                Pair pair = (Pair) it2.next();
                if (((Integer) pair.first).equals(34)) {
                    r = Arrays.asList((Size[]) pair.second);
                    break;
                }
            }
        }
        Rational rational = fsj0Var.c;
        ArrayList arrayList = new ArrayList();
        HashSet hashSet3 = new HashSet();
        Iterator it3 = hashSet2.iterator();
        while (it3.hasNext()) {
            hashSet3.addAll(fsj0Var.c((xi21) it3.next()));
        }
        Iterator it4 = hashSet3.iterator();
        while (true) {
            if (!it4.hasNext()) {
                break;
            }
            Size size = (Size) it4.next();
            Rational rational2 = x83.a;
            if (!x83.a(size, rational, vjs0.c)) {
                arrayList.addAll(fsj0Var.g(fsj0Var.b, r, false));
                break;
            }
        }
        int size2 = arrayList.size();
        if (hashSet2.isEmpty()) {
            xi21Var = null;
        } else {
            Iterator it5 = hashSet2.iterator();
            loop9: while (true) {
                if (!it5.hasNext()) {
                    xi21Var = xi21Var5;
                    size2 = 0;
                    break;
                }
                Iterator it6 = fsj0Var.c((xi21) it5.next()).iterator();
                boolean z = false;
                boolean z2 = false;
                while (true) {
                    if (!it6.hasNext()) {
                        break;
                    }
                    xi21Var = xi21Var5;
                    Size size3 = (Size) it6.next();
                    Rational rational3 = x83.a;
                    boolean a = x83.a(size3, rational, vjs0.c);
                    if (a) {
                        z = true;
                    }
                    if (z2 && a) {
                        break loop9;
                    }
                    if (!a) {
                        z2 = true;
                    }
                    xi21Var5 = xi21Var;
                }
                xi21Var5 = xi21Var;
            }
        }
        arrayList.addAll(size2, fsj0Var.g(rational, r, false));
        arrayList.addAll(fsj0Var.f(r, false));
        if (arrayList.isEmpty()) {
            sgb1.g(5, "ResolutionsMerger");
            arrayList.addAll(fsj0Var.f(r, true));
        }
        arrayList.toString();
        sgb1.g(3, "ResolutionsMerger");
        d.w(icv.z2, arrayList);
        x34 x34Var = xi21.n4;
        Iterator it7 = hashSet.iterator();
        int i = 0;
        while (it7.hasNext()) {
            i = Math.max(i, ((Integer) ((xi21) it7.next()).g(xi21.n4, 0)).intValue());
        }
        d.w(x34Var, Integer.valueOf(i));
        ArrayList arrayList2 = new ArrayList();
        Iterator it8 = hashSet.iterator();
        while (it8.hasNext()) {
            arrayList2.add(((xi21) it8.next()).o());
        }
        if (!arrayList2.isEmpty()) {
            q8n q8nVar = (q8n) arrayList2.get(0);
            Integer valueOf = Integer.valueOf(q8nVar.a);
            Integer valueOf2 = Integer.valueOf(q8nVar.b);
            int i2 = 1;
            while (i2 < arrayList2.size()) {
                q8n q8nVar2 = (q8n) arrayList2.get(i2);
                Integer valueOf3 = Integer.valueOf(q8nVar2.a);
                if (!valueOf.equals(0)) {
                    xi21Var2 = valueOf;
                    if (!valueOf3.equals(0)) {
                        if (!valueOf.equals(2) || valueOf3.equals(1)) {
                            if (valueOf3.equals(2)) {
                                boolean equals = valueOf.equals(1);
                                xi21Var2 = valueOf;
                            }
                            boolean equals2 = valueOf.equals(valueOf3);
                            xi21Var2 = valueOf;
                            if (!equals2) {
                                xi21Var2 = xi21Var;
                            }
                        }
                    }
                    Integer valueOf4 = Integer.valueOf(q8nVar2.b);
                    if (valueOf2.equals(0)) {
                        xi21Var3 = valueOf2;
                        if (!valueOf4.equals(0)) {
                            boolean equals3 = valueOf2.equals(valueOf4);
                            xi21Var3 = valueOf2;
                            if (!equals3) {
                                xi21Var3 = xi21Var;
                            }
                        }
                    } else {
                        xi21Var3 = valueOf4;
                    }
                    if (xi21Var2 != null && xi21Var3 != null) {
                        i2++;
                        valueOf2 = xi21Var3;
                        valueOf = xi21Var2;
                    }
                }
                xi21Var2 = valueOf3;
                Integer valueOf42 = Integer.valueOf(q8nVar2.b);
                if (valueOf2.equals(0)) {
                }
                if (xi21Var2 != null) {
                    i2++;
                    valueOf2 = xi21Var3;
                    valueOf = xi21Var2;
                }
            }
            obj = new q8n(valueOf.intValue(), valueOf2.intValue());
            if (obj != null) {
                ny61.g("Failed to merge child dynamic ranges, can not find a dynamic range that satisfies all children.");
                return xi21Var;
            }
            d.w(eav.l2, obj);
            x34 x34Var2 = xi21.p4;
            Range range = lru0.a;
            Iterator it9 = hashSet.iterator();
            while (it9.hasNext()) {
                Range range2 = (Range) ((xi21) it9.next()).g(xi21.p4, range);
                Objects.requireNonNull(range2);
                if (lru0.a.equals(range)) {
                    range = range2;
                } else {
                    try {
                        range = range.intersect(range2);
                    } catch (IllegalArgumentException unused) {
                        Objects.toString(range);
                        range2.toString();
                        sgb1.g(3, "VirtualCameraAdapter");
                        range = range.extend(range2);
                    }
                }
            }
            d.w(x34Var2, range);
            Iterator it10 = ax31Var.a.iterator();
            while (it10.hasNext()) {
                xi21 xi21Var6 = (xi21) ax31Var.C.get((j) it10.next());
                Objects.requireNonNull(xi21Var6);
                if (xi21Var6.l() != 0) {
                    d.w(xi21.w4, Integer.valueOf(xi21Var6.l()));
                }
                if (xi21Var6.m() != 0) {
                    d.w(xi21.u4, Integer.valueOf(xi21Var6.m()));
                }
            }
            return wi21Var.e();
        }
        obj = xi21Var;
        if (obj != null) {
        }
    }

    @Override // androidx.camera.core.j
    public final void x() {
        this.a = true;
        Iterator it = this.r.a.iterator();
        while (it.hasNext()) {
            ((j) it.next()).x();
        }
    }

    @Override // androidx.camera.core.j
    public final void y() {
        this.a = false;
        Iterator it = this.r.a.iterator();
        while (it.hasNext()) {
            ((j) it.next()).y();
        }
    }

    @Override // androidx.camera.core.j
    public final o84 z(szd szdVar) {
        this.A.b.c(szdVar);
        Object[] objArr = {this.A.d()};
        ArrayList arrayList = new ArrayList(1);
        Object obj = objArr[0];
        Objects.requireNonNull(obj);
        arrayList.add(obj);
        G(Collections.unmodifiableList(arrayList));
        j4n i = this.i.i();
        i.z = szdVar;
        return i.k();
    }
}
