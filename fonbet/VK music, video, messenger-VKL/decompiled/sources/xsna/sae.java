package xsna;

import android.view.View;
import android.view.animation.PathInterpolator;
import com.unity3d.services.UnityAdsConstants;
import com.vkontakte.android.R;
import java.util.ArrayList;
import java.util.List;

/* compiled from: ClipsGridBlockAnimationDelegate.kt */
/* loaded from: classes17.dex */
public final class sae {
    public final mbe a;
    public final List<View> b;
    public final long c;
    public final long d;
    public final long e;
    public final PathInterpolator f;
    public final PathInterpolator g;
    public final float h;
    public final float i;
    public final ArrayList j;

    public sae(View view, mbe mbeVar) {
        this.a = mbeVar;
        List<View> l = e43.l(view.findViewById(R.id.top_left_clip_item), view.findViewById(R.id.top_right_clip_item), view.findViewById(R.id.bottom_left_clip_item), view.findViewById(R.id.bottom_right_clip_item));
        this.b = l;
        this.c = 83L;
        this.d = 83L;
        this.e = 83L;
        this.f = new PathInterpolator(0.5f, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, 0.7f, 1.0f);
        this.g = new PathInterpolator(0.2f, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, 0.4f, 1.0f);
        this.h = 0.98f;
        this.i = 1.0f;
        List<View> list = l;
        ArrayList arrayList = new ArrayList(c5g.u(list, 10));
        int i = 0;
        for (Object obj : list) {
            int i2 = i + 1;
            if (i < 0) {
                e43.t();
                throw null;
            }
            arrayList.add(Long.valueOf(this.c * i));
            i = i2;
        }
        this.j = arrayList;
    }
}
