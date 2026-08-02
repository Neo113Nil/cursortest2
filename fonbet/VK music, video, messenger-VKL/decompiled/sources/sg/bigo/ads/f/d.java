package sg.bigo.ads.f;

import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import sg.bigo.ads.R;
import sg.bigo.ads.ad.interstitial.t;
import sg.bigo.ads.common.utils.v;

/* loaded from: classes9.dex */
public final class d {

    @NonNull
    public final a a;

    @Nullable
    public b b;

    public interface a {
        @Nullable
        ViewGroup a();

        void a(int i);

        void a(@Nullable View view);

        void a(@Nullable View view, @Nullable View view2);

        int b();

        void c();

        void d();

        void e();

        @Nullable
        sg.bigo.ads.n.c f();

        void g();

        @Nullable
        t h();
    }

    public d(@NonNull a aVar) {
        this.a = aVar;
    }

    @Nullable
    public final ViewGroup a(@NonNull String str) {
        StringBuilder sb;
        String str2;
        ViewGroup a2 = this.a.a();
        if (a2 == null) {
            sb = new StringBuilder();
            sb.append(str);
            str2 = "nativeAdView is null";
        } else {
            int b = this.a.b();
            if (b != 0 && b != 10 && b != 4) {
                sb = new StringBuilder();
                sb.append(str);
                sb.append("current page not main/midpage/loading, cur=");
                sb.append(b);
                sg.bigo.ads.bn.a.a(0, "PlayablePagePresenter", sb.toString());
                return null;
            }
            this.a.c();
            this.a.d();
            this.a.e();
            sg.bigo.ads.common.utils.a.a(a2.getContext(), R.layout.bigo_ad_activity_interstitial_rich_video_empty_end, a2, true);
            ViewGroup viewGroup = (ViewGroup) a2.findViewById(R.id.inter_layout_end_page);
            if (viewGroup == null) {
                sb = new StringBuilder();
                sb.append(str);
                str2 = "playContainer is null";
            } else {
                ViewGroup viewGroup2 = (ViewGroup) viewGroup.findViewById(R.id.inter_end_page);
                if (viewGroup2 != null) {
                    sg.bigo.ads.n.c f = this.a.f();
                    if (f != null) {
                        f.a(viewGroup, 4);
                    }
                    a2.setTag(19);
                    return viewGroup2;
                }
                sb = new StringBuilder();
                sb.append(str);
                str2 = "playableSlot is null";
            }
        }
        sb.append(str2);
        sg.bigo.ads.bn.a.a(0, "PlayablePagePresenter", sb.toString());
        return null;
    }

    public final void a() {
        t h = this.a.h();
        if (h == null || h.K() == null || h.K().D() == null) {
            return;
        }
        h.K().D().bringToFront();
    }

    public final void a(int i) {
        t h = this.a.h();
        if (h != null) {
            sg.bigo.ads.da.b.a((sg.bigo.ads.api.core.b) h.f(), 5, i);
        }
        this.a.a(i);
    }

    public final boolean a(int i, @NonNull c cVar) {
        View view = cVar.o.k;
        if (!cVar.b()) {
            sg.bigo.ads.bn.a.a(0, "PlayablePagePresenter", "playableAdCompanion is not ResourceReady");
            cVar.o.f();
            return false;
        }
        if (view == null) {
            sg.bigo.ads.bn.a.a(0, "PlayablePagePresenter", "playableView == null.");
            return false;
        }
        ViewGroup a2 = a("");
        if (a2 == null) {
            return false;
        }
        cVar.g();
        ViewGroup a3 = this.a.a();
        v.a(view, a2, new FrameLayout.LayoutParams(-1, -1, 17), -1);
        view.setTag(19);
        this.a.a(view, a3);
        this.a.g();
        this.a.a(view);
        cVar.a(1);
        a();
        a(i);
        return true;
    }

    public static boolean a(@Nullable sg.bigo.ads.d.c cVar, @Nullable c cVar2) {
        sg.bigo.ads.api.core.b f;
        return (cVar == null || cVar2 == null || !cVar2.a || (f = cVar.f()) == null || f.ay() != 1) ? false : true;
    }
}
