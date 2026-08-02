package xsna;

import android.graphics.Paint;
import android.graphics.Point;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.util.TypedValue;
import android.view.View;
import com.vk.feed.core.models.news.NewsEntry;
import com.vkontakte.android.R;
import com.vkontakte.android.attachments.DisclaimerData;
import com.vkontakte.android.attachments.DisclaimerType;
import java.util.HashMap;
import kotlin.LazyThreadSafetyMode;

/* compiled from: DisclaimersDelegateImplNew.kt */
/* loaded from: classes4.dex */
public final class h1n {
    public Drawable d;
    public Drawable e;
    public Drawable f;
    public Drawable g;
    public Drawable h;
    public final Object j;
    public final Object k;
    public final Object l;
    public final Object m;
    public final com.vk.channels.impl.channel_screen.send_msg.c a = new com.vk.channels.impl.channel_screen.send_msg.c(2);
    public final Paint b = new Paint();
    public final Rect c = new Rect();
    public final Point i = new Point();

    /* compiled from: DisclaimersDelegateImplNew.kt */
    public static final /* synthetic */ class a {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;

        static {
            int[] iArr = new int[DisclaimerType.values().length];
            try {
                iArr[DisclaimerType.DRUG.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[DisclaimerType.SUPPLEMENT.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[DisclaimerType.CREDITS.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                iArr[DisclaimerType.BANKRUPTCY.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                iArr[DisclaimerType.ENERGETICS.ordinal()] = 5;
            } catch (NoSuchFieldError unused5) {
            }
            $EnumSwitchMapping$0 = iArr;
        }
    }

    public h1n() {
        qe3 qe3Var = new qe3(20);
        LazyThreadSafetyMode lazyThreadSafetyMode = LazyThreadSafetyMode.NONE;
        this.j = msy.a(lazyThreadSafetyMode, qe3Var);
        this.k = msy.a(lazyThreadSafetyMode, new m1i(this, 6));
        this.l = msy.a(lazyThreadSafetyMode, new lk(15));
        this.m = msy.a(lazyThreadSafetyMode, new com.vk.movika.sdk.base.logic.interactor.l(19));
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v5, types: [java.lang.Object, kotlin.Lazy] */
    public final void a(View view, Point point, tsx0 tsx0Var) {
        DisclaimerData N3;
        if (tsx0Var == 0 || (N3 = tsx0Var.N3()) == null) {
            return;
        }
        NewsEntry newsEntry = tsx0Var instanceof NewsEntry ? (NewsEntry) tsx0Var : null;
        if (newsEntry == null) {
            return;
        }
        com.vk.channels.impl.channel_screen.send_msg.c cVar = this.a;
        Point point2 = (Point) ((HashMap) cVar.b).get(newsEntry);
        if (point2 != null) {
            point.y = point2.y;
            point.x = point2.x;
        } else {
            point.set(view.getWidth(), Math.max((int) ((view.getHeight() * N3.c) + e3m.a(R.dimen.disclaimer_strokes_offset, view.getContext()) + ((Number) this.m.getValue()).intValue()), (int) TypedValue.applyDimension(1, N3.d, view.getResources().getDisplayMetrics())));
            ((HashMap) cVar.b).put((NewsEntry) tsx0Var, new Point(point.x, point.y));
        }
    }
}
