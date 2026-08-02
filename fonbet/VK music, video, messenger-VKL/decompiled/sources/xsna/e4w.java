package xsna;

import android.content.Context;
import android.view.View;
import com.unity3d.services.UnityAdsConstants;
import com.vk.core.tips.Tooltip;
import com.vk.core.tips.c;
import com.vk.dto.hints.Hint;
import com.vk.dto.hints.HintId;
import com.vkontakte.android.R;
import java.lang.ref.WeakReference;
import java.util.concurrent.TimeUnit;
import kotlin.NoWhenBranchMatchedException;
import xsna.e3m;

/* compiled from: ImHintsManager.kt */
/* loaded from: classes2.dex */
public final class e4w {
    public final mxv a;
    public final wvw b;
    public com.vk.core.tips.b c;

    static {
        TimeUnit timeUnit = TimeUnit.DAYS;
        timeUnit.toMillis(14L);
        timeUnit.toMillis(14L);
    }

    public e4w(zdw zdwVar) {
        this.a = zdwVar.d();
        this.b = zdwVar.g.getValue();
    }

    public final void a() {
        com.vk.core.tips.b bVar = this.c;
        if (bVar != null) {
            bVar.b(false);
        }
        this.c = null;
    }

    public final boolean b(View view) {
        this.a.getClass();
        wvw wvwVar = this.b;
        l7v b = wvwVar.b();
        HintId hintId = HintId.IM_MSG_SEND_CONFIG;
        int i = 0;
        if (!b.m(hintId)) {
            return false;
        }
        Context context = view.getContext();
        boolean M = dhr0.M();
        if (M) {
            e3m.a aVar = e3m.a;
            i = context.getColor(R.color.vk_white_alpha15);
        } else if (M) {
            throw new NoWhenBranchMatchedException();
        }
        String string = context.getString(R.string.vkim_expire_msg_send_tooltip);
        l7v b2 = wvwVar.b();
        String id = hintId.getId();
        b2.getClass();
        b1y b1yVar = new b1y(id);
        this.c = Tooltip.l(new Tooltip(context, "", string, Tooltip.WindowStyle.FULLSCREEN, new oa6(this, 6), null, b1yVar, 0, 0, null, 0.8f, null, 0, false, null, 0, false, null, null, new c.b(i), null, null, null, null, null, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, null, null, false, 0, null, null, null, null, -525408, 15), context, bwt0.G(view), false, false, false, false, 252);
        view.addOnAttachStateChangeListener(new c4w(view, this));
        wvwVar.b().b(hintId.getId());
        return true;
    }

    public final void c(View view) {
        com.vk.core.tips.b k;
        wvw wvwVar = this.b;
        l7v b = wvwVar.b();
        HintId hintId = HintId.IM_TAP_TO_RECORD_VIDEO;
        Hint p = b.p(hintId.getId());
        if (p != null) {
            Context context = view.getContext();
            String str = p.d;
            l7v b2 = wvwVar.b();
            String str2 = p.b;
            b2.getClass();
            k = new Tooltip(context, "", str, null, new wcd(this, 5), null, new b1y(str2), 0, 0, null, 0.8f, null, 0, false, null, 0, false, null, null, new c.C0781c(0), null, null, null, null, null, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, null, null, false, 0, new WeakReference(view), null, null, null, 2146958248, 15).k(context, (r15 & 2) != 0, true, (r15 & 8) != 0, true, false, new yqf(view, 25), r7);
            this.c = k;
            view.addOnAttachStateChangeListener(new a(view, this));
            wvwVar.b().b(hintId.getId());
        }
    }

    /* compiled from: ViewExt.kt */
    public static final class a implements View.OnAttachStateChangeListener {
        public final /* synthetic */ View b;
        public final /* synthetic */ e4w c;

        public a(View view, e4w e4wVar) {
            this.b = view;
            this.c = e4wVar;
        }

        @Override // android.view.View.OnAttachStateChangeListener
        public final void onViewDetachedFromWindow(View view) {
            this.b.removeOnAttachStateChangeListener(this);
            this.c.a();
        }

        @Override // android.view.View.OnAttachStateChangeListener
        public final void onViewAttachedToWindow(View view) {
        }
    }
}
