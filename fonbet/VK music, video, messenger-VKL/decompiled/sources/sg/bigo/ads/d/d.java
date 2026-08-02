package sg.bigo.ads.d;

import android.graphics.Rect;
import android.os.SystemClock;
import android.view.View;
import androidx.annotation.NonNull;
import com.unity3d.services.UnityAdsConstants;
import sg.bigo.ads.api.Ad;
import sg.bigo.ads.api.core.b;
import sg.bigo.ads.api.core.g;
import sg.bigo.ads.api.core.o;
import sg.bigo.ads.common.utils.r;
import sg.bigo.ads.common.utils.s;
import sg.bigo.ads.common.utils.v;

/* loaded from: classes9.dex */
public abstract class d<T extends Ad, U extends sg.bigo.ads.api.core.b> extends c<T, U> {

    @NonNull
    protected d<T, U>.a y;
    private boolean z;

    public final class a {
        private long f;
        private long g;
        private int h;
        private long i = 0;
        private long j = 0;
        private boolean k = false;
        int a = -1;
        boolean b = false;
        boolean c = false;
        private boolean l = false;
        final Runnable d = new Runnable() { // from class: sg.bigo.ads.d.d.a.1
            @Override // java.lang.Runnable
            public final void run() {
                View view;
                a aVar = a.this;
                d dVar = d.this;
                if (dVar.i || ((aVar.b && aVar.c) || (view = dVar.c) == null)) {
                    aVar.a();
                    return;
                }
                Rect rect = new Rect();
                boolean z = sg.bigo.ads.ca.a.a(view, rect) || (d.this.p() && sg.bigo.ads.api.core.a.b(d.this.q()));
                if (z) {
                    a aVar2 = a.this;
                    if (aVar2.a == -1) {
                        aVar2.a = v.a(view) ? 1 : 0;
                    }
                }
                if (z) {
                    a aVar3 = a.this;
                    if (!aVar3.b) {
                        a.a(aVar3, rect);
                    }
                    a aVar4 = a.this;
                    if (!aVar4.c) {
                        a.b(aVar4, rect);
                    }
                }
                a aVar5 = a.this;
                if (aVar5.b && aVar5.c) {
                    aVar5.a();
                } else {
                    sg.bigo.ads.bh.d.a(2, aVar5.d, 500L);
                }
            }
        };

        public a() {
        }

        private float a(@NonNull Rect rect) {
            d dVar = d.this;
            if (dVar.c == null || sg.bigo.ads.api.core.a.b(dVar.b.a.y())) {
                return UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT;
            }
            float height = d.this.c.getHeight() * 1.0f * d.this.c.getWidth();
            return height <= UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT ? UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT : ((rect.height() * 1.0f) * rect.width()) / height;
        }

        /* JADX WARN: Code restructure failed: missing block: B:18:0x004d, code lost:
        
            if (r0 != 12) goto L39;
         */
        /* JADX WARN: Removed duplicated region for block: B:21:0x008e  */
        /* JADX WARN: Removed duplicated region for block: B:24:? A[RETURN, SYNTHETIC] */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
        */
        public static /* synthetic */ void b(a aVar, Rect rect) {
            if (aVar.j == 0) {
                aVar.j = SystemClock.elapsedRealtime();
            }
            float a = aVar.a(rect);
            d dVar = d.this;
            View view = dVar.c;
            int q = dVar.q();
            int r = d.this.r();
            if (view != null && view.getMeasuredWidth() > 0 && view.getMeasuredHeight() > 0) {
                int width = view.getWidth() * view.getHeight();
                if (q != 1) {
                    if (q != 2) {
                        if (q != 3 && q != 4) {
                        }
                    } else if (width <= 242000) {
                    }
                    if (SystemClock.elapsedRealtime() - aVar.j >= aVar.g) {
                        d.this.d(r.a("%.4f", Float.valueOf(a)));
                        aVar.c = true;
                        return;
                    }
                    return;
                }
                if (r != 2) {
                }
                if (SystemClock.elapsedRealtime() - aVar.j >= aVar.g) {
                }
            }
            if (!sg.bigo.ads.api.core.a.b(d.this.q()) || d.this.h) {
                return;
            }
            if (SystemClock.elapsedRealtime() - aVar.j >= aVar.g) {
            }
        }

        public final void a() {
            sg.bigo.ads.bh.d.a(this.d);
            this.l = false;
        }

        public final void a(final View view, boolean z) {
            d.this.c = view;
            if (view == null) {
                return;
            }
            if (z) {
                sg.bigo.ads.bh.d.a(2, new Runnable() { // from class: sg.bigo.ads.d.d.a.2
                    @Override // java.lang.Runnable
                    public final void run() {
                        a.a(a.this);
                    }
                });
            } else {
                view.addOnAttachStateChangeListener(new View.OnAttachStateChangeListener() { // from class: sg.bigo.ads.d.d.a.3
                    @Override // android.view.View.OnAttachStateChangeListener
                    public final void onViewAttachedToWindow(View view2) {
                        a.a(a.this);
                        view.removeOnAttachStateChangeListener(this);
                    }

                    @Override // android.view.View.OnAttachStateChangeListener
                    public final void onViewDetachedFromWindow(View view2) {
                        a.this.a();
                    }
                });
            }
        }

        /* JADX WARN: Code restructure failed: missing block: B:23:0x0052, code lost:
        
            if (r2 != 2) goto L25;
         */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
        */
        public static /* synthetic */ void a(a aVar) {
            if (aVar.l) {
                return;
            }
            aVar.f = d.this.r() == 2 ? d.a(d.this) : d.b(d.this);
            aVar.h = d.this.r() == 2 ? d.c(d.this) : d.d(d.this);
            int q = d.this.q();
            int r = d.this.r();
            int i = 1000;
            if (q != 1) {
                if (q != 2 && q != 3) {
                    if (q != 4) {
                        if (q != 12) {
                            i = 0;
                        }
                    }
                    i = 2000;
                }
                aVar.g = i;
                sg.bigo.ads.bh.d.a(2, aVar.d);
                aVar.l = true;
            }
        }

        public static /* synthetic */ void a(a aVar, Rect rect) {
            float f;
            if (aVar.i == 0) {
                aVar.i = SystemClock.elapsedRealtime();
            }
            if (aVar.k) {
                f = 0.0f;
            } else {
                f = aVar.a(rect);
                View view = d.this.c;
                int i = aVar.h;
                if ((view != null && view.getMeasuredHeight() > 0 && view.getMeasuredWidth() > 0 && (i == 0 || i <= 100.0f * f)) || (sg.bigo.ads.api.core.a.b(d.this.q()) && !d.this.h)) {
                    aVar.k = true;
                }
            }
            long max = aVar.a == 1 ? Math.max(s.a.a(1), aVar.f) : aVar.f;
            if (!aVar.k || SystemClock.elapsedRealtime() - aVar.i < max) {
                return;
            }
            if (f == UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT) {
                f = aVar.a(rect);
            }
            d.this.a("show_proportion", r.a("%.4f", Float.valueOf(f)));
            d.this.a_();
            aVar.b = true;
        }
    }

    public d(@NonNull g gVar) {
        super(gVar);
        this.z = false;
        this.y = new a();
    }

    public static /* synthetic */ long a(d dVar) {
        o.b aI;
        sg.bigo.ads.api.core.b bVar = dVar.b.a;
        if (!(bVar instanceof o) || (aI = ((o) bVar).aI()) == null) {
            return 0L;
        }
        return aI.b();
    }

    public static /* synthetic */ long b(d dVar) {
        o.b aI;
        sg.bigo.ads.api.core.b bVar = dVar.b.a;
        if (!(bVar instanceof o) || (aI = ((o) bVar).aI()) == null) {
            return 0L;
        }
        return aI.d();
    }

    public static /* synthetic */ int c(d dVar) {
        o.b aI;
        sg.bigo.ads.api.core.b bVar = dVar.b.a;
        if (!(bVar instanceof o) || (aI = ((o) bVar).aI()) == null) {
            return 0;
        }
        return aI.a();
    }

    public static /* synthetic */ int d(d dVar) {
        o.b aI;
        sg.bigo.ads.api.core.b bVar = dVar.b.a;
        if (!(bVar instanceof o) || (aI = ((o) bVar).aI()) == null) {
            return 0;
        }
        return aI.c();
    }

    @Override // sg.bigo.ads.d.c
    public void destroyInMainThread() {
        super.destroyInMainThread();
        this.y.a();
    }

    @Override // sg.bigo.ads.d.c
    public final void m() {
        super.m();
        this.y.a();
    }

    @Override // sg.bigo.ads.d.c
    public void a() {
        super.a();
        this.y.a();
        this.z = false;
        this.y = new a();
    }

    public final void d(String str) {
        if (this.z) {
            return;
        }
        this.z = true;
        String j = j();
        int intValue = ((Integer) b("render_style", 0)).intValue();
        if (a("06002029")) {
            sg.bigo.ads.da.b.a(this, str, j, intValue);
        }
        sg.bigo.ads.aj.a aVar = this.aa;
        if (aVar != null) {
            aVar.a(str, j, intValue);
        }
    }

    public final void a(View view, boolean z) {
        this.y.a(view, z);
    }
}
