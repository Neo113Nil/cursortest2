package xsna;

import android.content.ContentResolver;
import android.net.Uri;
import com.facebook.common.memory.PooledByteBuffer;
import com.facebook.imagepipeline.core.DownsampleMode;
import com.facebook.imagepipeline.request.ImageRequest;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.Set;

/* compiled from: ProducerSequenceFactory.kt */
/* loaded from: classes.dex */
public final class aid0 {
    public final ContentResolver a;
    public final xhd0 b;
    public final oi6 c;
    public final boolean d;
    public final sqo0 e;
    public final DownsampleMode f;
    public final boolean g;
    public final gmw h;
    public final Set<rnk> i;
    public final LinkedHashMap j = new LinkedHashMap();
    public final LinkedHashMap k = new LinkedHashMap();
    public final bpn0 l;
    public final bpn0 m;
    public final bpn0 n;
    public final bpn0 o;
    public final bpn0 p;
    public final bpn0 q;
    public final bpn0 r;
    public final bpn0 s;
    public final bpn0 t;
    public final bpn0 u;
    public final bpn0 v;
    public final bpn0 w;
    public final bpn0 x;
    public final bpn0 y;
    public final bpn0 z;

    /* compiled from: ProducerSequenceFactory.kt */
    public static final class a {
        public static final String a(Uri uri) {
            String uri2 = uri.toString();
            return uri2.length() > 30 ? uri2.substring(0, 30).concat("...") : uri2;
        }
    }

    public aid0(ContentResolver contentResolver, xhd0 xhd0Var, oi6 oi6Var, boolean z, sqo0 sqo0Var, DownsampleMode downsampleMode, boolean z2, gmw gmwVar, Set set) {
        this.a = contentResolver;
        this.b = xhd0Var;
        this.c = oi6Var;
        this.d = z;
        this.e = sqo0Var;
        this.f = downsampleMode;
        this.g = z2;
        this.h = gmwVar;
        this.i = set;
        new LinkedHashMap();
        new bpn0(new g67(this, 6));
        new bpn0(new sb8(this, 7));
        new bpn0(new zf6(this, 12));
        this.l = new bpn0(new ag6(this, 9));
        this.m = new bpn0(new bg6(this, 11));
        this.n = new bpn0(new xsa(this, 9));
        this.o = new bpn0(new ib8(this, 11));
        this.p = new bpn0(new jb8(this, 8));
        this.q = new bpn0(new kb8(this, 8));
        this.r = new bpn0(new lb8(this, 2));
        this.s = new bpn0(new egv(this, 4));
        this.t = new bpn0(new sz2(this, 6));
        this.u = new bpn0(new bia(this, 8));
        this.v = new bpn0(new m15(this, 10));
        this.w = new bpn0(new cia(this, 9));
        this.x = new bpn0(new dia(this, 7));
        this.y = new bpn0(new eia(this, 5));
        this.z = new bpn0(new rb8(this, 4));
    }

    public final thd0<uvf<svf>> a(ImageRequest imageRequest) {
        thd0<uvf<svf>> thd0Var;
        boolean d = lhs.d();
        bpn0 bpn0Var = this.l;
        bpn0 bpn0Var2 = this.s;
        bpn0 bpn0Var3 = this.u;
        bpn0 bpn0Var4 = this.y;
        bpn0 bpn0Var5 = this.x;
        bpn0 bpn0Var6 = this.z;
        bpn0 bpn0Var7 = this.w;
        bpn0 bpn0Var8 = this.t;
        ContentResolver contentResolver = this.a;
        Set<rnk> set = this.i;
        if (!d) {
            Uri l = imageRequest.l();
            int m = imageRequest.m();
            if (m == 0) {
                return (thd0) bpn0Var.getValue();
            }
            switch (m) {
                case 2:
                    return imageRequest.d() ? d() : (thd0) bpn0Var8.getValue();
                case 3:
                    return imageRequest.d() ? d() : (thd0) bpn0Var2.getValue();
                case 4:
                    return imageRequest.d() ? d() : k020.b(contentResolver.getType(l)) ? (thd0) bpn0Var8.getValue() : (thd0) bpn0Var3.getValue();
                case 5:
                    return (thd0) bpn0Var4.getValue();
                case 6:
                    return (thd0) bpn0Var5.getValue();
                case 7:
                    return (thd0) bpn0Var6.getValue();
                case 8:
                    return (thd0) bpn0Var7.getValue();
                default:
                    if (set != null) {
                        Iterator<rnk> it = set.iterator();
                        while (it.hasNext()) {
                            it.next().getClass();
                        }
                    }
                    throw new IllegalArgumentException(go9.b("Unsupported uri scheme! Uri is: ", a.a(l)));
            }
        }
        lhs.a("ProducerSequenceFactory#getBasicDecodedImageSequence");
        try {
            Uri l2 = imageRequest.l();
            int m2 = imageRequest.m();
            if (m2 != 0) {
                switch (m2) {
                    case 2:
                        if (!imageRequest.d()) {
                            thd0Var = (thd0) bpn0Var8.getValue();
                            break;
                        } else {
                            thd0<uvf<svf>> d2 = d();
                            lhs.b();
                            return d2;
                        }
                    case 3:
                        if (!imageRequest.d()) {
                            thd0Var = (thd0) bpn0Var2.getValue();
                            break;
                        } else {
                            thd0<uvf<svf>> d3 = d();
                            lhs.b();
                            return d3;
                        }
                    case 4:
                        if (!imageRequest.d()) {
                            if (!k020.b(contentResolver.getType(l2))) {
                                thd0Var = (thd0) bpn0Var3.getValue();
                                break;
                            } else {
                                thd0<uvf<svf>> thd0Var2 = (thd0) bpn0Var8.getValue();
                                lhs.b();
                                return thd0Var2;
                            }
                        } else {
                            thd0<uvf<svf>> d4 = d();
                            lhs.b();
                            return d4;
                        }
                    case 5:
                        thd0Var = (thd0) bpn0Var4.getValue();
                        break;
                    case 6:
                        thd0Var = (thd0) bpn0Var5.getValue();
                        break;
                    case 7:
                        thd0Var = (thd0) bpn0Var6.getValue();
                        break;
                    case 8:
                        thd0Var = (thd0) bpn0Var7.getValue();
                        break;
                    default:
                        if (set != null) {
                            Iterator<rnk> it2 = set.iterator();
                            while (it2.hasNext()) {
                                it2.next().getClass();
                            }
                        }
                        throw new IllegalArgumentException("Unsupported uri scheme! Uri is: " + a.a(l2));
                }
            } else {
                thd0Var = (thd0) bpn0Var.getValue();
            }
            lhs.b();
            return thd0Var;
        } catch (Throwable th) {
            lhs.b();
            throw th;
        }
    }

    public final thd0<Void> b(ImageRequest imageRequest) {
        thd0<Void> thd0Var;
        thd0<uvf<svf>> a2 = a(imageRequest);
        synchronized (this) {
            thd0Var = (thd0) this.k.get(a2);
            if (thd0Var == null) {
                this.b.getClass();
                thd0Var = new jln0<>(a2);
                this.k.put(a2, thd0Var);
            }
        }
        return thd0Var;
    }

    public final thd0<Void> c(ImageRequest imageRequest) {
        if (!(imageRequest.e().h() <= ImageRequest.RequestLevel.ENCODED_MEMORY_CACHE.h())) {
            throw new IllegalArgumentException();
        }
        int m = imageRequest.m();
        if (m == 0) {
            return (thd0) this.n.getValue();
        }
        if (m == 2 || m == 3) {
            return (thd0) this.p.getValue();
        }
        throw new IllegalArgumentException(go9.b("Unsupported uri scheme for encoded image fetch! Uri is: ", a.a(imageRequest.l())));
    }

    public final thd0<uvf<svf>> d() {
        return (thd0) this.v.getValue();
    }

    public final synchronized thd0<uvf<svf>> e(thd0<uvf<svf>> thd0Var) {
        thd0<uvf<svf>> thd0Var2;
        thd0Var2 = (thd0) this.j.get(thd0Var);
        if (thd0Var2 == null) {
            xhd0 xhd0Var = this.b;
            ltc0 ltc0Var = new ltc0(thd0Var, xhd0Var.o, xhd0Var.i.a());
            xhd0 xhd0Var2 = this.b;
            itc0 itc0Var = new itc0(xhd0Var2.m, xhd0Var2.n, ltc0Var);
            this.j.put(thd0Var, itc0Var);
            thd0Var2 = itc0Var;
        }
        return thd0Var2;
    }

    public final thd0<uvf<svf>> f(thd0<uvf<svf>> thd0Var) {
        xhd0 xhd0Var = this.b;
        n220<ww8, svf> n220Var = xhd0Var.m;
        ecl eclVar = xhd0Var.n;
        return new mc7(xhd0Var.m, eclVar, new rqo0(new oc7(eclVar, new pc7(n220Var, eclVar, thd0Var)), this.e));
    }

    public final thd0<uvf<svf>> g(thd0<rip> thd0Var) {
        boolean d = lhs.d();
        xhd0 xhd0Var = this.b;
        if (!d) {
            return f(xhd0Var.a(thd0Var));
        }
        lhs.a("ProducerSequenceFactory#newBitmapCacheGetToDecodeSequence");
        try {
            return f(xhd0Var.a(thd0Var));
        } finally {
            lhs.b();
        }
    }

    public final thd0 h(luz luzVar, uso0[] uso0VarArr) {
        pl0 pl0Var = new pl0(j(luzVar));
        xhd0 xhd0Var = this.b;
        gmw gmwVar = this.h;
        return g(new za8(xhd0Var.c(new rso0(uso0VarArr), true, gmwVar), new aso0(xhd0Var.i.d(), xhd0Var.c(pl0Var, true, gmwVar))));
    }

    public final synchronized v9g0 i(oi6 oi6Var) {
        try {
            boolean z = false;
            if (!lhs.d()) {
                xhd0 xhd0Var = this.b;
                pl0 pl0Var = new pl0(j(new i360(xhd0Var.j, xhd0Var.d, oi6Var)));
                xhd0 xhd0Var2 = this.b;
                if (this.d && this.f != DownsampleMode.NEVER) {
                    z = true;
                }
                return xhd0Var2.c(pl0Var, z, this.h);
            }
            lhs.a("ProducerSequenceFactory#createCommonNetworkFetchToEncodedMemorySequence");
            try {
                xhd0 xhd0Var3 = this.b;
                pl0 pl0Var2 = new pl0(j(new i360(xhd0Var3.j, xhd0Var3.d, oi6Var)));
                xhd0 xhd0Var4 = this.b;
                if (this.d && this.f != DownsampleMode.NEVER) {
                    z = true;
                }
                v9g0 c = xhd0Var4.c(pl0Var2, z, this.h);
                lhs.b();
                return c;
            } catch (Throwable th) {
                lhs.b();
                throw th;
            }
        } catch (Throwable th2) {
            throw th2;
        }
    }

    public final oip j(thd0 thd0Var) {
        boolean z = this.g;
        xhd0 xhd0Var = this.b;
        if (z) {
            if (lhs.d()) {
                lhs.a("ProducerSequenceFactory#newDiskCacheSequence");
                try {
                    yhn0<fbn> yhn0Var = xhd0Var.k;
                    ecl eclVar = xhd0Var.n;
                    thd0Var = new com.facebook.imagepipeline.producers.a(yhn0Var, eclVar, new com.facebook.imagepipeline.producers.b(yhn0Var, eclVar, thd0Var));
                } finally {
                    lhs.b();
                }
            } else {
                yhn0<fbn> yhn0Var2 = xhd0Var.k;
                ecl eclVar2 = xhd0Var.n;
                thd0Var = new com.facebook.imagepipeline.producers.a(yhn0Var2, eclVar2, new com.facebook.imagepipeline.producers.b(yhn0Var2, eclVar2, thd0Var));
            }
        }
        n220<ww8, PooledByteBuffer> n220Var = xhd0Var.l;
        ecl eclVar3 = xhd0Var.n;
        return new oip(eclVar3, new tip(n220Var, eclVar3, thd0Var));
    }
}
