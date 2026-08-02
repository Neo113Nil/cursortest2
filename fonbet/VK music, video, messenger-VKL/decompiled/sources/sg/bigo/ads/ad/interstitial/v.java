package sg.bigo.ads.ad.interstitial;

import android.graphics.Bitmap;
import android.graphics.drawable.BitmapDrawable;
import android.os.SystemClock;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewTreeObserver;
import android.webkit.ValueCallback;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import java.util.Iterator;
import java.util.WeakHashMap;
import sg.bigo.ads.ad.interstitial.d;
import sg.bigo.ads.ad.interstitial.u;
import sg.bigo.ads.api.NativeAd;
import sg.bigo.ads.bv.b;

/* loaded from: classes9.dex */
public abstract class v extends e {
    public static long c = 15;
    public static long d = 300;
    public static int e = 255;

    @NonNull
    public final sg.bigo.ads.y.b f;

    @NonNull
    public final sg.bigo.ads.ai.o g;
    public sg.bigo.ads.ax.b h;
    private long i = 0;
    private final WeakHashMap<Object, ValueCallback<Bitmap>> j = new WeakHashMap<>();

    public interface a {
        void a(View view);
    }

    public v(@NonNull sg.bigo.ads.y.b bVar, @NonNull sg.bigo.ads.ai.o oVar) {
        this.f = bVar;
        this.g = oVar;
    }

    public final void c(@NonNull r rVar) {
        if (this.j.isEmpty()) {
            return;
        }
        a(rVar, new ValueCallback<Bitmap>() { // from class: sg.bigo.ads.ad.interstitial.v.5
            @Override // android.webkit.ValueCallback
            public final /* synthetic */ void onReceiveValue(Bitmap bitmap) {
                Bitmap bitmap2 = bitmap;
                if (bitmap2 != null) {
                    synchronized (v.this.j) {
                        try {
                            Iterator it = v.this.j.values().iterator();
                            while (it.hasNext()) {
                                ((ValueCallback) it.next()).onReceiveValue(bitmap2);
                            }
                            v.this.j.clear();
                        } catch (Throwable th) {
                            throw th;
                        }
                    }
                }
            }
        });
    }

    public boolean d() {
        return false;
    }

    public abstract int e();

    public boolean f() {
        return false;
    }

    public static u a(@NonNull r rVar) {
        if (rVar != null) {
            return rVar.an();
        }
        return null;
    }

    public final sg.bigo.ads.an.p b(r rVar) {
        if (d()) {
            sg.bigo.ads.an.p h = a(rVar).h();
            if (h.a()) {
                return h;
            }
        }
        return s.a(this.f);
    }

    private static void a(View view, int i) {
        if (view == null) {
            return;
        }
        view.setBackgroundColor(i);
    }

    private void b(r rVar, final View view) {
        int i;
        if (rVar == null || view == null) {
            return;
        }
        if (d() && (i = a(rVar).j) != 0) {
            a(view, i);
            return;
        }
        Integer a2 = s.a((NativeAd) this.f);
        if (a2 != null) {
            a(view, a2.intValue());
        } else {
            a(rVar, new ValueCallback<Bitmap>() { // from class: sg.bigo.ads.ad.interstitial.v.3
                final /* synthetic */ d.a b = null;

                @Override // android.webkit.ValueCallback
                public final /* synthetic */ void onReceiveValue(Bitmap bitmap) {
                    Bitmap bitmap2 = bitmap;
                    if (bitmap2 == null) {
                        v.this.a(view, this);
                        return;
                    }
                    Integer a3 = sg.bigo.ads.bv.b.a(bitmap2);
                    if (a3 != null) {
                        d.a aVar = this.b;
                        final int a4 = aVar != null ? aVar.a() : a3.intValue();
                        view.post(new Runnable() { // from class: sg.bigo.ads.ad.interstitial.v.3.1
                            @Override // java.lang.Runnable
                            public final void run() {
                                final long j = v.a(v.this) ? v.d : 0L;
                                sg.bigo.ads.bv.b.a(view, a4, new b.a() { // from class: sg.bigo.ads.ad.interstitial.v.3.1.1
                                    @Override // sg.bigo.ads.bv.b.a
                                    public final long a() {
                                        return j;
                                    }
                                });
                            }
                        });
                    }
                }
            });
        }
    }

    public final void a(View view, ValueCallback<Bitmap> valueCallback) {
        if (view != null) {
            synchronized (this.j) {
                this.j.put(view, valueCallback);
            }
        }
    }

    public void a(@NonNull r rVar, final View view) {
        int i;
        Bitmap g;
        if (rVar == null || view == null) {
            return;
        }
        int e2 = e();
        if (e2 == 2) {
            i = -16777216;
        } else {
            if (e2 == 3) {
                b(rVar, view);
                return;
            }
            if (e2 == 4) {
                ValueCallback<Bitmap> valueCallback = new ValueCallback<Bitmap>() { // from class: sg.bigo.ads.ad.interstitial.v.4
                    final /* synthetic */ d.a b = null;

                    @Override // android.webkit.ValueCallback
                    public final /* synthetic */ void onReceiveValue(Bitmap bitmap) {
                        final Bitmap bitmap2 = bitmap;
                        v vVar = v.this;
                        if (bitmap2 == null) {
                            vVar.a(view, this);
                            return;
                        }
                        final long j = v.a(vVar) ? v.d : 0L;
                        final Bitmap b = sg.bigo.ads.common.utils.e.b(view.getContext(), bitmap2);
                        view.post(new Runnable() { // from class: sg.bigo.ads.ad.interstitial.v.4.1
                            @Override // java.lang.Runnable
                            public final void run() {
                                sg.bigo.ads.bv.b.a(view, new BitmapDrawable(view.getResources(), b), j);
                                if (AnonymousClass4.this.b != null) {
                                    sg.bigo.ads.bv.b.a(bitmap2);
                                }
                            }
                        });
                    }
                };
                if (!d() || (g = a(rVar).g()) == null) {
                    a(rVar, valueCallback);
                    return;
                } else {
                    valueCallback.onReceiveValue(g);
                    return;
                }
            }
            i = -1;
        }
        a(view, i);
    }

    public static void a(@NonNull r rVar, ValueCallback<Bitmap> valueCallback) {
        if (valueCallback == null) {
            return;
        }
        u a2 = a(rVar);
        if (a2 == null) {
            valueCallback.onReceiveValue(sg.bigo.ads.common.utils.e.a(1, 1, Bitmap.Config.ARGB_8888));
        } else {
            a2.a(valueCallback);
        }
    }

    public boolean a(@NonNull r rVar, @NonNull ViewGroup viewGroup, @NonNull View view, u.a aVar, int i, int i2, int i3, @Nullable View... viewArr) {
        u a2 = a(rVar);
        if (a2 == null) {
            return false;
        }
        a2.a(viewGroup, view, aVar, i, i2, i3, viewArr);
        sg.bigo.ads.common.utils.v.a(view, new ViewTreeObserver.OnGlobalLayoutListener() { // from class: sg.bigo.ads.ad.interstitial.v.1
            @Override // android.view.ViewTreeObserver.OnGlobalLayoutListener
            public final void onGlobalLayout() {
                v.this.i = SystemClock.elapsedRealtime();
            }
        });
        if (!f()) {
            return true;
        }
        u.b(view);
        return true;
    }

    public static /* synthetic */ boolean a(v vVar) {
        return (vVar.i != 0 ? SystemClock.elapsedRealtime() - vVar.i : 0L) > c;
    }

    public final boolean a(@NonNull sg.bigo.ads.y.b bVar, @NonNull r rVar, @NonNull ViewGroup viewGroup, @NonNull View view, u.a aVar, int i, int i2, int i3, @Nullable View... viewArr) {
        u a2 = a(rVar);
        if (a2 == null) {
            return false;
        }
        a2.c = bVar;
        a2.a(viewGroup, view, aVar, i, i2, i3, viewArr);
        sg.bigo.ads.common.utils.v.a(view, new ViewTreeObserver.OnGlobalLayoutListener() { // from class: sg.bigo.ads.ad.interstitial.v.2
            @Override // android.view.ViewTreeObserver.OnGlobalLayoutListener
            public final void onGlobalLayout() {
                v.this.i = SystemClock.elapsedRealtime();
            }
        });
        if (!f()) {
            return true;
        }
        u.b(view);
        return true;
    }
}
