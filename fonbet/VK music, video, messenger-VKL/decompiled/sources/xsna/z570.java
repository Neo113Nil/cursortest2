package xsna;

import com.google.android.gms.maps.model.LatLng;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.Set;
import ru.ok.android.webrtc.stat.call.internal.ConnectivityTracker;
import xsna.nlb0;
import xsna.uwf;

/* compiled from: NonHierarchicalDistanceBasedAlgorithm.java */
/* loaded from: classes13.dex */
public class z570<T extends uwf> extends nc {
    public final int c;
    public final LinkedHashSet d;
    public final nlb0<a<T>> e;

    /* compiled from: NonHierarchicalDistanceBasedAlgorithm.java */
    public static class a<T extends uwf> implements nlb0.a, kwf<T> {
        public final T a;
        public final dlb0 b;
        public final LatLng c;
        public final Set<T> d;

        public a() {
            throw null;
        }

        /* JADX WARN: Multi-variable type inference failed */
        public a(uwf uwfVar) {
            this.a = uwfVar;
            LatLng position = uwfVar.getPosition();
            this.c = position;
            double d = (position.c / 360.0d) + 0.5d;
            double sin = Math.sin(Math.toRadians(position.b));
            this.b = new dlb0(d * 1.0d, (((Math.log((sin + 1.0d) / (1.0d - sin)) * 0.5d) / (-6.283185307179586d)) + 0.5d) * 1.0d);
            this.d = Collections.singleton(uwfVar);
        }

        @Override // xsna.nlb0.a
        public final dlb0 a() {
            return this.b;
        }

        public final boolean equals(Object obj) {
            if (obj instanceof a) {
                return ((a) obj).a.equals(this.a);
            }
            return false;
        }

        @Override // xsna.kwf
        public final Collection getItems() {
            return this.d;
        }

        @Override // xsna.kwf
        public final LatLng getPosition() {
            return this.c;
        }

        @Override // xsna.kwf
        public final int getSize() {
            return 1;
        }

        public final int hashCode() {
            return this.a.hashCode();
        }
    }

    public z570() {
        super(0);
        this.c = 100;
        this.d = new LinkedHashSet();
        this.e = new nlb0<>(new z98(ConnectivityTracker.DEFAULT_UPLINK_BITRATE, 1.0d, ConnectivityTracker.DEFAULT_UPLINK_BITRATE, 1.0d), 0);
    }

    @Override // xsna.ys1
    public void I() {
        synchronized (this.e) {
            this.d.clear();
            nlb0<a<T>> nlb0Var = this.e;
            nlb0Var.d = null;
            LinkedHashSet linkedHashSet = nlb0Var.c;
            if (linkedHashSet != null) {
                linkedHashSet.clear();
            }
        }
    }

    @Override // xsna.ys1
    public Set<? extends kwf<T>> K(float f) {
        z570<T> z570Var = this;
        double d = 2.0d;
        double pow = (z570Var.c / Math.pow(2.0d, (int) f)) / 256.0d;
        HashSet hashSet = new HashSet();
        HashSet hashSet2 = new HashSet();
        HashMap hashMap = new HashMap();
        HashMap hashMap2 = new HashMap();
        synchronized (z570Var.e) {
            try {
                for (a aVar : z570Var.d) {
                    if (!hashSet.contains(aVar)) {
                        dlb0 dlb0Var = aVar.b;
                        double d2 = pow / d;
                        double d3 = dlb0Var.a;
                        double d4 = d3 - d2;
                        double d5 = d3 + d2;
                        double d6 = dlb0Var.b;
                        z98 z98Var = new z98(d4, d5, d6 - d2, d6 + d2);
                        nlb0<a<T>> nlb0Var = z570Var.e;
                        nlb0Var.getClass();
                        ArrayList arrayList = new ArrayList();
                        nlb0Var.b(z98Var, arrayList);
                        if (arrayList.size() == 1) {
                            hashSet2.add(aVar);
                            hashSet.add(aVar);
                            hashMap.put(aVar, Double.valueOf(ConnectivityTracker.DEFAULT_UPLINK_BITRATE));
                            d = 2.0d;
                        } else {
                            vxk0 vxk0Var = new vxk0(aVar.a.getPosition());
                            hashSet2.add(vxk0Var);
                            Iterator it = arrayList.iterator();
                            while (it.hasNext()) {
                                a aVar2 = (a) it.next();
                                Double d7 = (Double) hashMap.get(aVar2);
                                dlb0 dlb0Var2 = aVar2.b;
                                dlb0 dlb0Var3 = aVar.b;
                                double d8 = pow;
                                double d9 = dlb0Var2.a - dlb0Var3.a;
                                double d10 = d9 * d9;
                                double d11 = dlb0Var2.b - dlb0Var3.b;
                                double d12 = (d11 * d11) + d10;
                                if (d7 != null) {
                                    if (d7.doubleValue() < d12) {
                                        pow = d8;
                                    } else {
                                        ((vxk0) hashMap2.get(aVar2)).b.remove(aVar2.a);
                                    }
                                }
                                hashMap.put(aVar2, Double.valueOf(d12));
                                vxk0Var.b.add(aVar2.a);
                                hashMap2.put(aVar2, vxk0Var);
                                pow = d8;
                            }
                            hashSet.addAll(arrayList);
                            d = 2.0d;
                            z570Var = this;
                            pow = pow;
                        }
                    }
                }
            } catch (Throwable th) {
                throw th;
            }
        }
        return hashSet2;
    }

    @Override // xsna.ys1
    public boolean R(T t) {
        boolean add;
        a<T> aVar = new a<>(t);
        synchronized (this.e) {
            try {
                add = this.d.add(aVar);
                if (add) {
                    nlb0<a<T>> nlb0Var = this.e;
                    nlb0Var.getClass();
                    dlb0 dlb0Var = aVar.b;
                    if (nlb0Var.a.a(dlb0Var.a, dlb0Var.b)) {
                        nlb0Var.a(dlb0Var.a, dlb0Var.b, aVar);
                    }
                }
            } catch (Throwable th) {
                throw th;
            }
        }
        return add;
    }

    @Override // xsna.ys1
    public boolean a(Collection<T> collection) {
        Iterator<T> it = collection.iterator();
        boolean z = false;
        while (it.hasNext()) {
            if (R(it.next())) {
                z = true;
            }
        }
        return z;
    }

    @Override // xsna.ys1
    public int g() {
        return this.c;
    }

    @Override // xsna.ys1
    public Collection<T> getItems() {
        LinkedHashSet linkedHashSet = new LinkedHashSet();
        synchronized (this.e) {
            try {
                Iterator it = this.d.iterator();
                while (it.hasNext()) {
                    linkedHashSet.add(((a) it.next()).a);
                }
            } catch (Throwable th) {
                throw th;
            }
        }
        return linkedHashSet;
    }
}
