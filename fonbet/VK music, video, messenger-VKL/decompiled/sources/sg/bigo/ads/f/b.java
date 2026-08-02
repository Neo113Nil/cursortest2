package sg.bigo.ads.f;

import android.content.Context;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.ProgressBar;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import sg.bigo.ads.R;
import sg.bigo.ads.common.utils.v;
import sg.bigo.ads.f.c;

/* loaded from: classes9.dex */
public final class b {

    @NonNull
    final c a;

    @Nullable
    ViewGroup b;

    @Nullable
    c.InterfaceC2484c c;

    @Nullable
    public a d;
    boolean e;
    boolean f;

    @Nullable
    private View g;

    @Nullable
    private ProgressBar h;

    @Nullable
    private Runnable i;
    private boolean j;
    private int k = 0;

    public interface a {
        void a();
    }

    public b(@NonNull c cVar) {
        this.a = cVar;
    }

    @Nullable
    public final View a(@NonNull ViewGroup viewGroup, @NonNull Context context) {
        if (this.e) {
            return null;
        }
        if (this.j) {
            return this.g;
        }
        this.j = true;
        this.b = viewGroup;
        View a2 = sg.bigo.ads.common.utils.a.a(viewGroup.getContext(), R.layout.bigo_ad_webview_loading, viewGroup, false);
        this.g = a2;
        if (a2 == null) {
            sg.bigo.ads.bn.a.a(0, "ForcePlayableFallback", "show: failed to inflate loading view");
        } else {
            v.a(a2, viewGroup, new FrameLayout.LayoutParams(-1, -1, 17), -1);
            this.g.setVisibility(0);
            this.h = (ProgressBar) this.g.findViewById(R.id.bigo_ad_webview_loading_progress);
            a(this.a.o.f);
        }
        Runnable runnable = new Runnable() { // from class: sg.bigo.ads.f.b.1
            @Override // java.lang.Runnable
            public final void run() {
                final b bVar = b.this;
                if (bVar.e || bVar.f) {
                    return;
                }
                sg.bigo.ads.bh.d.b(new Runnable() { // from class: sg.bigo.ads.f.b.3
                    /* JADX WARN: Removed duplicated region for block: B:14:0x0056  */
                    /* JADX WARN: Removed duplicated region for block: B:17:? A[RETURN, SYNTHETIC] */
                    @Override // java.lang.Runnable
                    /*
                        Code decompiled incorrectly, please refer to instructions dump.
                    */
                    public final void run() {
                        String str;
                        a aVar;
                        b bVar2 = b.this;
                        if (bVar2.e || bVar2.f) {
                            return;
                        }
                        bVar2.f = true;
                        c.InterfaceC2484c interfaceC2484c = bVar2.c;
                        if (interfaceC2484c != null) {
                            bVar2.a.a(interfaceC2484c);
                            b.this.c = null;
                        }
                        b.this.a();
                        b bVar3 = b.this;
                        ViewGroup viewGroup2 = bVar3.b;
                        if (viewGroup2 == null) {
                            str = "attachPlayableView: playable slot is null";
                        } else {
                            View view = bVar3.a.o.k;
                            if (view != null) {
                                v.b(view);
                                v.a(view, viewGroup2, new FrameLayout.LayoutParams(-1, -1, 17), -1);
                                b.this.a.a(1);
                                aVar = b.this.d;
                                if (aVar == null) {
                                    aVar.a();
                                    return;
                                }
                                return;
                            }
                            str = "attachPlayableView: adCompanionView is null after onLoaded";
                        }
                        sg.bigo.ads.bn.a.a(0, "ForcePlayableFallback", str);
                        b.this.a.a(1);
                        aVar = b.this.d;
                        if (aVar == null) {
                        }
                    }
                });
            }
        };
        this.i = runnable;
        this.a.d = runnable;
        c.InterfaceC2484c interfaceC2484c = new c.InterfaceC2484c() { // from class: sg.bigo.ads.f.b.2
            @Override // sg.bigo.ads.f.c.InterfaceC2484c
            public final void a(final int i) {
                sg.bigo.ads.bh.d.b(new Runnable() { // from class: sg.bigo.ads.f.b.2.1
                    @Override // java.lang.Runnable
                    public final void run() {
                        b bVar = b.this;
                        if (bVar.e || bVar.f) {
                            return;
                        }
                        bVar.a(i);
                    }
                });
            }
        };
        this.c = interfaceC2484c;
        c cVar = this.a;
        cVar.f = interfaceC2484c;
        cVar.b(context);
        return this.g;
    }

    public final void b() {
        if (this.e) {
            return;
        }
        this.e = true;
        Runnable runnable = this.i;
        if (runnable != null) {
            this.a.a(runnable);
            this.i = null;
        }
        c.InterfaceC2484c interfaceC2484c = this.c;
        if (interfaceC2484c != null) {
            this.a.a(interfaceC2484c);
            this.c = null;
        }
        a();
        this.b = null;
        this.d = null;
        this.j = false;
    }

    public final void a() {
        View view = this.g;
        if (view != null) {
            view.setVisibility(8);
            v.b(this.g);
            this.g = null;
        }
        this.h = null;
    }

    public final void a(int i) {
        int min;
        if (this.h != null && (min = Math.min(i, 95)) > this.k) {
            this.k = min;
            this.h.setProgress(min);
        }
    }
}
