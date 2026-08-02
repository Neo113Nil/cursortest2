package xsna;

import android.animation.ValueAnimator;
import android.graphics.Bitmap;
import android.view.animation.AccelerateInterpolator;
import android.view.animation.DecelerateInterpolator;
import com.vk.geo.impl.model.id.StringId;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;
import kotlin.Pair;

/* compiled from: BitmapScaleAnimator.kt */
/* loaded from: classes2.dex */
public final class zc7 {
    public final long a;
    public final boolean b;
    public final Map<StringId, Pair<ValueAnimator, cpv>> c;
    public final AccelerateInterpolator d;
    public final DecelerateInterpolator e;

    public zc7() {
        this(0);
    }

    public static final void a(zc7 zc7Var, cpv cpvVar, aw50 aw50Var, boolean z, Bitmap bitmap) {
        cpvVar.c();
        if (aw50Var.c) {
            return;
        }
        aw50Var.e(z);
        aw50Var.d(cpvVar);
        if (bitmap != cpvVar.d) {
            ConcurrentHashMap<Integer, RuntimeException> concurrentHashMap = vc7.a;
        }
        zc7Var.c.remove(new StringId(aw50Var.a()));
    }

    public final void b(String str) {
        if (str.equals("null")) {
            return;
        }
        StringId stringId = new StringId(str);
        Map<StringId, Pair<ValueAnimator, cpv>> map = this.c;
        if (map.containsKey(stringId)) {
            Pair<ValueAnimator, cpv> pair = map.get(new StringId(str));
            if (pair != null) {
                ValueAnimator d = pair.d();
                pair.g().c();
                d.removeAllListeners();
                d.cancel();
            }
            map.remove(new StringId(str));
        }
    }

    public zc7(int i) {
        this.a = 300L;
        this.b = true;
        this.c = sni.d(16, 2);
        this.d = new AccelerateInterpolator();
        this.e = new DecelerateInterpolator();
    }
}
