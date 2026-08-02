package sg.bigo.ads.ah;

import android.content.Context;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.ImageView;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import java.util.List;
import sg.bigo.ads.ah.c;
import sg.bigo.ads.ai.n;
import sg.bigo.ads.api.AdOptionsView;
import sg.bigo.ads.api.MediaView;
import sg.bigo.ads.common.utils.v;
import sg.bigo.ads.dh.p;
import sg.bigo.ads.h.c;

/* loaded from: classes9.dex */
public final class g implements c {
    public sg.bigo.ads.f.c b;
    public sg.bigo.ads.f.a c;
    public int g;

    @NonNull
    private final sg.bigo.ads.ad.splash.b h;

    @Nullable
    private sg.bigo.ads.f.b i;
    public int a = c.a.a;
    public boolean d = false;
    public int e = 1;
    public boolean f = false;

    public static class a implements sg.bigo.ads.ad.banner.h {
        private final int a = 13;
        private int b = 6;
        private final sg.bigo.ads.ad.splash.b c;

        public a(@NonNull sg.bigo.ads.ad.splash.b bVar) {
            this.c = bVar;
        }

        @Override // sg.bigo.ads.ad.banner.h
        public final void a() {
            this.c.a(this.b);
        }

        @Override // sg.bigo.ads.ad.banner.h
        public final void a(sg.bigo.ads.an.i iVar, sg.bigo.ads.api.core.e eVar) {
            this.c.z.a(iVar, this.a, this.b, eVar);
        }

        @Override // sg.bigo.ads.ad.banner.h
        public final void b() {
        }

        @Override // sg.bigo.ads.ad.banner.h
        public final void c() {
        }
    }

    public g(@NonNull final sg.bigo.ads.ad.splash.b bVar, @NonNull n nVar, @NonNull sg.bigo.ads.api.core.b bVar2) {
        p pVar;
        n nVar2;
        sg.bigo.ads.api.core.b bVar3;
        int i = 0;
        this.g = 0;
        this.h = bVar;
        sg.bigo.ads.y.b bVar4 = bVar.z;
        boolean z = bVar4 instanceof sg.bigo.ads.y.c;
        sg.bigo.ads.core.player.c cVar = z ? ((sg.bigo.ads.y.c) bVar4).I : null;
        if (z) {
            pVar = ((sg.bigo.ads.y.c) bVar4).J;
            bVar3 = bVar2;
            nVar2 = nVar;
        } else {
            pVar = null;
            nVar2 = nVar;
            bVar3 = bVar2;
        }
        sg.bigo.ads.f.c cVar2 = new sg.bigo.ads.f.c(bVar4, nVar2, bVar3, cVar, pVar);
        this.b = cVar2;
        sg.bigo.ads.api.core.b bVar5 = bVar3;
        sg.bigo.ads.f.a aVar = new sg.bigo.ads.f.a(cVar2.a, bVar4, nVar2, bVar5, z ? ((sg.bigo.ads.y.c) bVar4).I : null, z ? ((sg.bigo.ads.y.c) bVar4).J : null);
        this.c = aVar;
        if (this.b.a) {
            i = 1;
        } else if (aVar.a) {
            i = 2;
        }
        this.g = i;
        bVar5.d(i);
        bVar5.e((this.b.a || (this.c.b instanceof sg.bigo.ads.g.b)) ? 1 : 2);
        sg.bigo.ads.f.c cVar3 = this.b;
        if (cVar3 != null) {
            cVar3.n = 1;
            this.b.a(new a(bVar));
            this.b.a(bVar.b.f);
        }
        sg.bigo.ads.f.a aVar2 = this.c;
        if (aVar2 != null) {
            aVar2.a(new a(bVar));
            this.c.a(new c.a() { // from class: sg.bigo.ads.ah.g.1
                @Override // sg.bigo.ads.h.c.a
                public final void a(sg.bigo.ads.an.i iVar, sg.bigo.ads.api.core.e eVar) {
                    bVar.z.a(iVar, 15, 9, eVar);
                }
            });
            this.c.a(bVar.b.f);
        }
    }

    private boolean f() {
        sg.bigo.ads.f.c cVar = this.b;
        return (cVar == null || !cVar.a || !cVar.b() || this.b.b || this.b.o.k == null) ? false : true;
    }

    private boolean g() {
        sg.bigo.ads.f.c cVar = this.b;
        return cVar != null && cVar.a && !cVar.b && this.b.h();
    }

    private boolean h() {
        sg.bigo.ads.f.a aVar = this.c;
        return aVar != null && aVar.a && aVar.b() && this.c.a() != null;
    }

    @Override // sg.bigo.ads.ah.c
    public final void a() {
    }

    @Override // sg.bigo.ads.ah.c
    public final void c() {
        this.a = c.a.d;
        sg.bigo.ads.f.b bVar = this.i;
        if (bVar != null) {
            bVar.b();
            this.i = null;
        }
        sg.bigo.ads.f.c cVar = this.b;
        if (cVar != null) {
            cVar.e();
            this.b = null;
        }
        sg.bigo.ads.f.a aVar = this.c;
        if (aVar != null) {
            aVar.e();
            this.c = null;
        }
    }

    @Override // sg.bigo.ads.ah.c
    @NonNull
    public final int d() {
        return this.a;
    }

    public final boolean e() {
        return f() || g() || h();
    }

    public final void a(Runnable runnable) {
        sg.bigo.ads.f.c cVar = this.b;
        if (cVar != null) {
            cVar.a(runnable);
        }
    }

    @Override // sg.bigo.ads.ah.c
    public final void a(boolean z) {
        if (z) {
            if (this.f) {
                sg.bigo.ads.f.c cVar = this.b;
                if (cVar != null) {
                    cVar.o.c();
                    return;
                }
                return;
            }
            sg.bigo.ads.f.a aVar = this.c;
            if (aVar != null) {
                aVar.c();
                return;
            }
            return;
        }
        if (this.f) {
            sg.bigo.ads.f.c cVar2 = this.b;
            if (cVar2 != null) {
                cVar2.o.d();
                return;
            }
            return;
        }
        sg.bigo.ads.f.a aVar2 = this.c;
        if (aVar2 != null) {
            aVar2.d();
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:19:0x009c  */
    /* JADX WARN: Removed duplicated region for block: B:24:0x00a0  */
    /* JADX WARN: Type inference failed for: r0v13, types: [sg.bigo.ads.api.core.b] */
    @Override // sg.bigo.ads.ah.c
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void a(boolean z, @NonNull ViewGroup viewGroup, int i) {
        sg.bigo.ads.f.c cVar;
        int i2;
        this.a = z ? c.a.b : c.a.c;
        if (!z) {
            if (!this.f || (cVar = this.b) == null) {
                return;
            }
            cVar.a(2);
            this.f = false;
            return;
        }
        if (this.e == 2) {
            viewGroup.removeViewAt(1);
        }
        if (f()) {
            this.b.g();
            View view = this.b.o.k;
            viewGroup.addView(view, 1, new FrameLayout.LayoutParams(-1, -1));
            if (view != null) {
                view.setTag(19);
            }
            this.b.a(1);
        } else {
            if (!g()) {
                View a2 = this.c.a();
                viewGroup.addView(a2, 1, new FrameLayout.LayoutParams(-1, -1));
                if (a2 != null) {
                    a2.setTag(20);
                }
                this.c.a(1);
                this.d = true;
                i2 = 7;
                int i3 = this.e != 2 ? 9 : 8;
                sg.bigo.ads.da.b.a((sg.bigo.ads.api.core.b) this.h.z.f(), i2, i);
                this.h.z.a(viewGroup, (MediaView) null, (ImageView) null, (AdOptionsView) null, (List<View>) null, i3, null);
            }
            if (this.b != null) {
                Context context = viewGroup.getContext();
                FrameLayout frameLayout = new FrameLayout(context);
                frameLayout.setTag(19);
                v.a(frameLayout, viewGroup, new FrameLayout.LayoutParams(-1, -1), 1);
                sg.bigo.ads.f.b bVar = this.i;
                if (bVar != null) {
                    bVar.b();
                }
                sg.bigo.ads.f.b bVar2 = new sg.bigo.ads.f.b(this.b);
                this.i = bVar2;
                bVar2.a(frameLayout, context);
            }
        }
        this.d = true;
        this.f = true;
        i2 = 5;
        int i32 = this.e != 2 ? 9 : 8;
        sg.bigo.ads.da.b.a((sg.bigo.ads.api.core.b) this.h.z.f(), i2, i);
        this.h.z.a(viewGroup, (MediaView) null, (ImageView) null, (AdOptionsView) null, (List<View>) null, i32, null);
    }

    @Override // sg.bigo.ads.ah.c
    public final void b() {
    }
}
