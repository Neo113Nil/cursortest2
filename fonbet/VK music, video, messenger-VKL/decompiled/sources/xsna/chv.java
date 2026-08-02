package xsna;

import android.content.Context;
import android.view.ViewGroup;
import android.view.ViewParent;
import android.widget.FrameLayout;
import com.unity3d.services.UnityAdsConstants;
import com.vk.core.tool.view.SimpleRatioFrameLayout;
import com.vk.dto.newsfeed.entries.Html5Entry;
import com.vk.log.L;
import com.vkontakte.android.R;
import com.vkontakte.android.data.b;
import java.util.HashMap;
import xsna.qi6;

/* compiled from: Html5Holder.kt */
/* loaded from: classes4.dex */
public final class chv extends qi6<Html5Entry> {
    public final jhv C;
    public final FrameLayout D;
    public ihv E;
    public final SimpleRatioFrameLayout F;

    /* JADX WARN: Illegal instructions before constructor call */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public chv(ViewGroup viewGroup, jhv jhvVar) {
        super(r0);
        FrameLayout frameLayout = new FrameLayout(viewGroup.getContext());
        frameLayout.setId(R.id.entry_html5_container);
        frameLayout.setLayoutParams(new ViewGroup.LayoutParams(-1, -2));
        frameLayout.setMinimumHeight(gbg0.a(frameLayout.getResources(), 20.0f));
        this.C = jhvVar;
        int a = qi6.a.a(viewGroup.getContext());
        FrameLayout frameLayout2 = (FrameLayout) this.itemView.findViewById(R.id.entry_html5_container);
        this.D = frameLayout2;
        SimpleRatioFrameLayout simpleRatioFrameLayout = new SimpleRatioFrameLayout(viewGroup.getContext(), null, 6, 0);
        this.F = simpleRatioFrameLayout;
        simpleRatioFrameLayout.setLayoutParams(new FrameLayout.LayoutParams(-1, -2));
        simpleRatioFrameLayout.setOrientation(0);
        bwt0.b0(1, simpleRatioFrameLayout);
        simpleRatioFrameLayout.setMaxWidth(a);
        simpleRatioFrameLayout.setRatio(1.7777778f);
        simpleRatioFrameLayout.setVisibility(4);
        frameLayout2.addView(simpleRatioFrameLayout);
    }

    @Override // xsna.qi6
    public final void E6(Html5Entry html5Entry) {
        f4m.y(cn70.b(8), this.D);
        float f = html5Entry.w.f;
        if (f == UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT) {
            f = 1.7777778f;
        }
        this.F.setRatio(f);
    }

    public final void R6() {
        ihv ihvVar;
        Html5Entry html5Entry = (Html5Entry) this.p;
        if (html5Entry == null) {
            return;
        }
        jhv jhvVar = this.C;
        if (jhvVar != null) {
            Context context = this.itemView.getContext();
            HashMap<String, ihv> hashMap = jhvVar.a;
            StringBuilder sb = new StringBuilder();
            sb.append(html5Entry.i);
            sb.append('_');
            sb.append(html5Entry.j);
            String sb2 = sb.toString();
            if (!hashMap.containsKey(sb2)) {
                ihv ihvVar2 = new ihv(context, html5Entry);
                jhvVar.a(html5Entry);
                hashMap.put(sb2, ihvVar2);
            }
            ihvVar = hashMap.get(sb2);
        } else {
            ihvVar = null;
        }
        this.E = ihvVar;
        if (ihvVar != null) {
            ViewParent parent = ihvVar.getParent();
            if (parent != null) {
                L.l("The specified child already has a parent.");
            }
            ViewGroup viewGroup = parent instanceof ViewGroup ? (ViewGroup) parent : null;
            if (viewGroup != null) {
                viewGroup.removeView(ihvVar);
            }
            this.D.addView(ihvVar, 0);
        }
    }

    public final void T6() {
        ihv ihvVar;
        khv khvVar;
        if (((Html5Entry) this.p) == null || (ihvVar = this.E) == null || (khvVar = ihvVar.g) == null || !khvVar.j || khvVar.i || !khvVar.h || khvVar.f) {
            return;
        }
        khvVar.i = true;
        khvVar.h = false;
        khvVar.d("client_message_pause();");
        if (khvVar.n != 0) {
            xuo0.a.getClass();
            long c = xuo0.c() - khvVar.n;
            if (c >= 0) {
                khvVar.m += c;
            }
        }
        khvVar.n = 0L;
        Html5Entry html5Entry = khvVar.l;
        long j = khvVar.m;
        String str = com.vk.newsfeed.common.util.k.a;
        if (html5Entry == null) {
            return;
        }
        b.d dVar = new b.d("ads/html5_browser_paused");
        dVar.b(html5Entry.w.b, "track_code");
        dVar.b(Long.valueOf(j), "inapp_time");
        xuo0.a.getClass();
        dVar.b(Long.valueOf(xuo0.c()), "at");
        dVar.e();
    }

    public final void U6() {
        ihv ihvVar = this.E;
        if (ihvVar != null) {
            ViewParent parent = ihvVar.getParent();
            ViewGroup viewGroup = parent instanceof ViewGroup ? (ViewGroup) parent : null;
            if (viewGroup != null) {
                viewGroup.removeView(ihvVar);
            }
        }
        this.E = null;
    }
}
