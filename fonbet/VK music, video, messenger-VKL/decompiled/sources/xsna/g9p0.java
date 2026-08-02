package xsna;

import android.content.Context;
import android.view.ViewGroup;
import com.unity3d.services.UnityAdsConstants;
import com.vk.dto.reactions.ReactionMeta;
import com.vk.feed.design.view.newsfeed.reactionstack.FeedMiniReactionsStack;
import com.vk.feed.design.view.newsfeed.reactionstack.FeedReactionsStack;
import com.vkontakte.android.R;
import java.util.ArrayList;

/* compiled from: TopReactionsStateController.kt */
/* loaded from: classes4.dex */
public final class g9p0 {
    public static final int j = cn70.b(20);
    public final c1c0 a;
    public final FeedReactionsStack b;
    public final h170 c;
    public boolean d;
    public c6z e;
    public q6s f;
    public Boolean g;
    public c6z h;
    public q6s i;

    public g9p0(c1c0 c1c0Var, FeedReactionsStack feedReactionsStack, h170 h170Var) {
        this.a = c1c0Var;
        this.b = feedReactionsStack;
        this.c = h170Var;
    }

    public final void a(int i) {
        String d;
        Context context = e43.a;
        if (context == null) {
            context = null;
        }
        String string = context.getResources().getString(R.string.reactions_preview, Integer.valueOf(i));
        FeedReactionsStack feedReactionsStack = this.b;
        feedReactionsStack.setStackContentDescription(string);
        if (iah0.f().widthPixels < 768) {
            long j2 = i;
            String[] strArr = uqm0.c;
            int i2 = 0;
            while (Math.abs(j2) >= 1000 && i2 < strArr.length - 1) {
                j2 /= 1000;
                i2++;
            }
            d = (j2 + strArr[i2]).toString();
        } else {
            d = uqm0.d(i);
        }
        feedReactionsStack.setText(d);
    }

    public final void b() {
        this.g = Boolean.FALSE;
        this.h = this.e;
        this.i = this.f;
        this.d = false;
        FeedReactionsStack feedReactionsStack = this.b;
        feedReactionsStack.h();
        FeedMiniReactionsStack feedMiniReactionsStack = feedReactionsStack.h;
        feedMiniReactionsStack.setScaleX(UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT);
        feedMiniReactionsStack.setScaleY(UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT);
        feedReactionsStack.i.setAlpha(UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT);
        bwt0.p0(feedReactionsStack.g, false);
        ViewGroup.LayoutParams layoutParams = feedReactionsStack.getLayoutParams();
        if (layoutParams != null) {
            layoutParams.height = feedReactionsStack.getMinimumHeight() != 0 ? -2 : 0;
        }
        bwt0.p0(feedReactionsStack, feedReactionsStack.getMinimumHeight() != 0);
        feedReactionsStack.requestLayout();
    }

    public final void c() {
        c6z c6zVar = this.e;
        ArrayList<ReactionMeta> arrayList = null;
        o2f0 o2f0Var = c6zVar instanceof o2f0 ? (o2f0) c6zVar : null;
        if (this.c.g()) {
            if (o2f0Var != null) {
                arrayList = o2f0Var.v8();
            }
        } else if (o2f0Var != null) {
            arrayList = o2f0Var.O8(3);
        }
        if (arrayList == null || arrayList.isEmpty()) {
            b();
        } else {
            d();
        }
    }

    public final void d() {
        this.h = this.e;
        this.i = this.f;
        this.g = Boolean.TRUE;
        this.d = false;
        FeedReactionsStack feedReactionsStack = this.b;
        FeedMiniReactionsStack feedMiniReactionsStack = feedReactionsStack.h;
        feedReactionsStack.h();
        bwt0.p0(feedReactionsStack, true);
        bwt0.p0(feedReactionsStack.g, true);
        ViewGroup.LayoutParams layoutParams = feedReactionsStack.getLayoutParams();
        if (layoutParams != null) {
            layoutParams.height = FeedReactionsStack.r + feedReactionsStack.p + feedReactionsStack.q;
        }
        feedMiniReactionsStack.setScaleX(1.0f);
        feedMiniReactionsStack.setScaleY(1.0f);
        feedReactionsStack.i.setAlpha(1.0f);
        feedReactionsStack.requestLayout();
    }
}
