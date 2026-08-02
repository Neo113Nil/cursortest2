package xsna;

import android.app.Activity;
import android.os.Handler;
import android.os.Looper;
import com.vk.dto.common.id.UserId;
import com.vk.stories.design.view.stickers.StickersDrawingViewGroup;

/* compiled from: StoryMarketItemDelegate.kt */
/* loaded from: classes16.dex */
public final class z5m0 {
    public final Activity a;
    public final StickersDrawingViewGroup b;
    public final b96 c;
    public final u76 d;
    public final atd0 e;
    public final Handler f = new Handler(Looper.getMainLooper());
    public ysd0 g;

    public z5m0(Activity activity, StickersDrawingViewGroup stickersDrawingViewGroup, b96 b96Var, u76 u76Var, atd0 atd0Var) {
        this.a = activity;
        this.b = stickersDrawingViewGroup;
        this.c = b96Var;
        this.d = u76Var;
        this.e = atd0Var;
    }

    public final void a(no6 no6Var) {
        UserId userId = this.d.k3().e;
        dhr0.a.getClass();
        this.g = this.e.a(this.a, new g910(null, 1, null, userId, new y5m0(0, this, no6Var), dhr0.u().c, null, null, null, null, null, null, 16149));
        this.f.postDelayed(new rc4(this, 19), 700L);
    }
}
