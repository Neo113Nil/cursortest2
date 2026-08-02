package sg.bigo.ads.j;

import android.view.View;
import android.view.ViewGroup;
import android.view.animation.TranslateAnimation;
import android.widget.TextView;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import com.unity3d.services.UnityAdsConstants;
import sg.bigo.ads.R;

/* loaded from: classes9.dex */
public class s extends b {
    private View x;
    private TextView y;

    public s(@NonNull sg.bigo.ads.y.b bVar, int i, @NonNull sg.bigo.ads.ai.o oVar, @NonNull sg.bigo.ads.r.b bVar2, @Nullable sg.bigo.ads.n.c cVar) {
        super(bVar, i, oVar, bVar2, cVar);
    }

    public static /* synthetic */ void b(s sVar) {
        View view = sVar.x;
        if (view == null || sVar.y == null) {
            return;
        }
        int[] iArr = new int[2];
        view.getLocationOnScreen(iArr);
        int[] iArr2 = new int[2];
        sVar.y.getLocationOnScreen(iArr2);
        ViewGroup.LayoutParams layoutParams = sVar.y.getLayoutParams();
        layoutParams.width = (iArr[0] - iArr2[0]) - sg.bigo.ads.common.utils.f.a(sVar.l.getContext(), 28);
        sVar.y.setLayoutParams(layoutParams);
        sVar.y.setLayerType(1, null);
    }

    @Override // sg.bigo.ads.j.b
    public void g(sg.bigo.ads.ad.interstitial.r rVar) {
        super.g(rVar);
        this.x = rVar != null ? rVar.q(R.id.inter_btn_close) : null;
        TextView textView = (TextView) this.l.findViewById(R.id.inter_title);
        this.y = textView;
        this.p.b(textView);
        this.p.b(this.m);
        if (l()) {
            this.s.setVisibility(8);
            ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) this.m.getLayoutParams();
            marginLayoutParams.topMargin = sg.bigo.ads.common.utils.f.a(this.m.getContext(), 0);
            this.m.setLayoutParams(marginLayoutParams);
        }
    }

    @Override // sg.bigo.ads.j.a
    public int h() {
        return R.layout.bigo_ad_activity_interstitial_rich_video_end_6;
    }

    @Override // sg.bigo.ads.j.a
    public final void a(View view) {
        View findViewById;
        if (view == null || this.h == null || (findViewById = view.findViewById(R.id.inter_media_ad_extra)) == null) {
            return;
        }
        this.h.a(findViewById, 0);
    }

    @Override // sg.bigo.ads.j.a
    public void a(@NonNull sg.bigo.ads.ad.interstitial.r rVar, int i) {
        super.a(rVar, i);
        final View findViewById = this.l.findViewById(R.id.inter_media_ad_desc);
        if (findViewById == null) {
            return;
        }
        findViewById.setVisibility(4);
        if (i < 0) {
            return;
        }
        findViewById.postDelayed(new Runnable() { // from class: sg.bigo.ads.j.s.1
            @Override // java.lang.Runnable
            public final void run() {
                if (sg.bigo.ads.d.c.a((sg.bigo.ads.d.c) s.this.f)) {
                    return;
                }
                findViewById.setVisibility(0);
                s.b(s.this);
                TranslateAnimation translateAnimation = new TranslateAnimation(1, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, 1, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, 1, -1.625f, 1, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT);
                translateAnimation.setDuration(600L);
                findViewById.startAnimation(translateAnimation);
            }
        }, i * 1000);
    }
}
