package defpackage;

import android.content.Context;
import android.content.ContextWrapper;
import android.graphics.Bitmap;
import android.graphics.drawable.Drawable;
import android.view.View;
import android.widget.ImageView;
import androidx.lifecycle.Lifecycle;
import coil.memory.MemoryCache$Key;
import coil.request.CachePolicy;
import coil.view.InterfaceC0134a;
import coil.view.Precision;
import coil.view.Scale;
import defpackage.dd90;
import java.util.LinkedHashMap;
import java.util.List;
import kotlin.collections.EmptyList;
import ru.yandex.video.m3.list_player_manager.impl.image.GlideBitmapDownloader;

/* loaded from: classes10.dex */
public final class bev {
    public rjs0 A;
    public Scale B;
    public final Context a;
    public tih b;
    public Object c;
    public jax0 d;
    public fev e;
    public MemoryCache$Key f;
    public String g;
    public Bitmap.Config h;
    public Precision i;
    public List j;
    public qx01 k;
    public keu l;
    public LinkedHashMap m;
    public boolean n;
    public Boolean o;
    public final boolean p;
    public jse q;
    public dd90.a r;
    public Integer s;
    public Drawable t;
    public Integer u;
    public Drawable v;
    public Integer w;
    public rjs0 x;
    public Scale y;
    public Lifecycle z;

    public bev(hev hevVar, Context context) {
        this.a = context;
        this.b = hevVar.H;
        this.c = hevVar.b;
        this.d = hevVar.c;
        this.e = hevVar.d;
        this.f = hevVar.e;
        this.g = hevVar.f;
        aph aphVar = hevVar.G;
        this.h = aphVar.f;
        this.i = aphVar.e;
        this.j = hevVar.i;
        this.k = aphVar.d;
        this.l = hevVar.k.d();
        this.m = new LinkedHashMap(hevVar.l.a);
        this.n = hevVar.m;
        this.o = aphVar.g;
        this.p = hevVar.p;
        this.q = aphVar.c;
        dd90 dd90Var = hevVar.A;
        dd90Var.getClass();
        this.r = new dd90.a(dd90Var);
        this.s = hevVar.B;
        this.t = hevVar.C;
        this.u = hevVar.D;
        this.v = hevVar.E;
        this.w = hevVar.F;
        this.x = aphVar.a;
        this.y = aphVar.b;
        if (hevVar.a == context) {
            this.z = hevVar.x;
            this.A = hevVar.y;
            this.B = hevVar.z;
        } else {
            this.z = null;
            this.A = null;
            this.B = null;
        }
    }

    public static void m(bev bevVar, String str, Object obj) {
        String obj2 = obj.toString();
        dd90.a aVar = bevVar.r;
        if (aVar == null) {
            aVar = new dd90.a();
            bevVar.r = aVar;
        }
        aVar.a.put(str, new gd90(obj, obj2));
    }

    public final void a() {
        keu keuVar = this.l;
        if (keuVar == null) {
            keuVar = new keu();
            this.l = keuVar;
        }
        keuVar.a(GlideBitmapDownloader.ACCEPT_HEADER, "image/webp,image/jpeg,image/png");
    }

    public final void b() {
        this.n = true;
    }

    public final void c(boolean z) {
        this.o = Boolean.valueOf(z);
    }

    public final hev d() {
        jse jseVar;
        Object obj;
        View view;
        rjs0 rjs0Var;
        Object obj2 = this.c;
        if (obj2 == null) {
            obj2 = xpb1.L;
        }
        Object obj3 = obj2;
        jax0 jax0Var = this.d;
        fev fevVar = this.e;
        MemoryCache$Key memoryCache$Key = this.f;
        String str = this.g;
        Bitmap.Config config = this.h;
        if (config == null) {
            config = this.b.g;
        }
        Bitmap.Config config2 = config;
        Precision precision = this.i;
        if (precision == null) {
            precision = this.b.f;
        }
        Precision precision2 = precision;
        List list = this.j;
        qx01 qx01Var = this.k;
        if (qx01Var == null) {
            qx01Var = this.b.e;
        }
        qx01 qx01Var2 = qx01Var;
        keu keuVar = this.l;
        meu d = keuVar != null ? keuVar.d() : null;
        if (d == null) {
            d = m.c;
        } else {
            Bitmap.Config[] configArr = m.a;
        }
        meu meuVar = d;
        LinkedHashMap linkedHashMap = this.m;
        u7x0 u7x0Var = linkedHashMap != null ? new u7x0(uh6.Q(linkedHashMap)) : null;
        if (u7x0Var == null) {
            u7x0Var = u7x0.b;
        }
        u7x0 u7x0Var2 = u7x0Var;
        boolean z = this.n;
        Boolean bool = this.o;
        boolean booleanValue = bool != null ? bool.booleanValue() : this.b.h;
        tih tihVar = this.b;
        boolean z2 = tihVar.i;
        CachePolicy cachePolicy = tihVar.m;
        CachePolicy cachePolicy2 = tihVar.n;
        CachePolicy cachePolicy3 = tihVar.o;
        jse jseVar2 = tihVar.a;
        jse jseVar3 = this.q;
        if (jseVar3 == null) {
            jseVar3 = tihVar.b;
        }
        jse jseVar4 = jseVar3;
        jse jseVar5 = tihVar.c;
        jse jseVar6 = tihVar.d;
        Lifecycle lifecycle = this.z;
        Context context = this.a;
        if (lifecycle == null) {
            jax0 jax0Var2 = this.d;
            jseVar = jseVar5;
            Object context2 = jax0Var2 instanceof nv31 ? ((nv31) jax0Var2).getView().getContext() : context;
            while (true) {
                if (context2 instanceof pey) {
                    lifecycle = ((pey) context2).getLifecycle();
                    break;
                }
                if (!(context2 instanceof ContextWrapper)) {
                    lifecycle = null;
                    break;
                }
                context2 = ((ContextWrapper) context2).getBaseContext();
            }
            if (lifecycle == null) {
                lifecycle = xit.b;
            }
        } else {
            jseVar = jseVar5;
        }
        Lifecycle lifecycle2 = lifecycle;
        rjs0 rjs0Var2 = this.x;
        if (rjs0Var2 == null && (rjs0Var2 = this.A) == null) {
            jax0 jax0Var3 = this.d;
            if (jax0Var3 instanceof nv31) {
                View view2 = ((nv31) jax0Var3).getView();
                if (view2 instanceof ImageView) {
                    ImageView.ScaleType scaleType = ((ImageView) view2).getScaleType();
                    obj = obj3;
                    if (scaleType == ImageView.ScaleType.CENTER || scaleType == ImageView.ScaleType.MATRIX) {
                        rjs0Var = new jdi0(wis0.c);
                        rjs0Var2 = rjs0Var;
                    }
                } else {
                    obj = obj3;
                }
                rjs0Var = new qdi0(view2);
                rjs0Var2 = rjs0Var;
            } else {
                obj = obj3;
                rjs0Var2 = new n0k(context);
            }
        } else {
            obj = obj3;
        }
        Scale scale = this.y;
        if (scale == null && (scale = this.B) == null) {
            rjs0 rjs0Var3 = this.x;
            InterfaceC0134a interfaceC0134a = rjs0Var3 instanceof InterfaceC0134a ? (InterfaceC0134a) rjs0Var3 : null;
            if (interfaceC0134a == null || (view = ((qdi0) interfaceC0134a).a) == null) {
                jax0 jax0Var4 = this.d;
                nv31 nv31Var = jax0Var4 instanceof nv31 ? (nv31) jax0Var4 : null;
                view = nv31Var != null ? nv31Var.getView() : null;
            }
            if (view instanceof ImageView) {
                Bitmap.Config[] configArr2 = m.a;
                ImageView.ScaleType scaleType2 = ((ImageView) view).getScaleType();
                int i = scaleType2 == null ? -1 : l.a[scaleType2.ordinal()];
                scale = (i == 1 || i == 2 || i == 3 || i == 4) ? Scale.FIT : Scale.FILL;
            } else {
                scale = Scale.FIT;
            }
        }
        Scale scale2 = scale;
        dd90.a aVar = this.r;
        dd90 dd90Var = aVar != null ? new dd90(uh6.Q(aVar.a)) : null;
        if (dd90Var == null) {
            dd90Var = dd90.b;
        }
        return new hev(context, obj, jax0Var, fevVar, memoryCache$Key, str, config2, precision2, list, qx01Var2, meuVar, u7x0Var2, z, booleanValue, z2, this.p, cachePolicy, cachePolicy2, cachePolicy3, jseVar2, jseVar4, jseVar, jseVar6, lifecycle2, rjs0Var2, scale2, dd90Var, this.s, this.t, this.u, this.v, this.w, new aph(this.x, this.y, this.q, this.k, this.i, this.h, this.o), this.b);
    }

    public final void e() {
        this.k = new pcf(100, 2);
    }

    public final void f(Object obj) {
        this.c = obj;
    }

    public final void g(tih tihVar) {
        this.b = tihVar;
        this.B = null;
    }

    public final void h(fev fevVar) {
        this.e = fevVar;
    }

    public final void i(String str) {
        this.f = str != null ? new MemoryCache$Key(str, null, 2, null) : null;
    }

    public final void j(int i) {
        this.s = Integer.valueOf(i);
        this.t = null;
    }

    public final void k(Drawable drawable) {
        this.t = drawable;
        this.s = 0;
    }

    public final void l() {
        this.z = null;
        this.A = null;
        this.B = null;
    }

    public final void n(wis0 wis0Var) {
        this.x = new jdi0(wis0Var);
        l();
    }

    public final void o(ImageView imageView) {
        this.d = new sgv(imageView);
        l();
    }

    public final void p(pw01... pw01VarArr) {
        this.j = uh6.P(j73.d0(pw01VarArr));
    }

    public bev(Context context) {
        this.a = context;
        this.b = i.a;
        this.c = null;
        this.d = null;
        this.e = null;
        this.f = null;
        this.g = null;
        this.h = null;
        this.i = null;
        this.j = EmptyList.a;
        this.k = null;
        this.l = null;
        this.m = null;
        this.n = true;
        this.o = null;
        this.p = true;
        this.q = null;
        this.r = null;
        this.s = null;
        this.t = null;
        this.u = null;
        this.v = null;
        this.w = null;
        this.x = null;
        this.y = null;
        this.z = null;
        this.A = null;
        this.B = null;
    }
}
