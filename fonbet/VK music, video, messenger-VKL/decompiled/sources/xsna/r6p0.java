package xsna;

import android.content.Context;
import android.graphics.Rect;
import android.view.View;
import android.view.ViewTreeObserver;
import com.vk.dto.hints.HintId;
import com.vk.movika.impl.view.full.tooltip.TooltipOverlay;
import com.vkontakte.android.R;
import kotlin.LazyThreadSafetyMode;
import xsna.evs;

/* compiled from: TooltipsController.kt */
/* loaded from: classes3.dex */
public final class r6p0 {
    public final Context a;
    public final TooltipOverlay b;
    public final qzg c;
    public final evs.a d;
    public ikv0 e;
    public final Object f = msy.a(LazyThreadSafetyMode.NONE, new odc0(this, 22));

    /* compiled from: TooltipsController.kt */
    public final class a implements ViewTreeObserver.OnScrollChangedListener, ViewTreeObserver.OnGlobalFocusChangeListener, ViewTreeObserver.OnWindowFocusChangeListener {
        public final View b;

        public a(View view) {
            this.b = view;
        }

        public final void a() {
            View view = this.b;
            view.getViewTreeObserver().removeOnScrollChangedListener(this);
            view.getViewTreeObserver().removeOnGlobalFocusChangeListener(this);
            view.getViewTreeObserver().removeOnWindowFocusChangeListener(this);
        }

        @Override // android.view.ViewTreeObserver.OnGlobalFocusChangeListener
        public final void onGlobalFocusChanged(View view, View view2) {
            a();
            r6p0.this.a();
        }

        @Override // android.view.ViewTreeObserver.OnScrollChangedListener
        public final void onScrollChanged() {
            a();
            r6p0.this.a();
        }

        @Override // android.view.ViewTreeObserver.OnWindowFocusChangeListener
        public final void onWindowFocusChanged(boolean z) {
            if (z) {
                return;
            }
            r6p0.this.a();
        }
    }

    public r6p0(Context context, TooltipOverlay tooltipOverlay, qzg qzgVar, evs.a aVar) {
        this.a = context;
        this.b = tooltipOverlay;
        this.c = qzgVar;
        this.d = aVar;
        tooltipOverlay.setVisibility(0);
    }

    public static /* synthetic */ void d(r6p0 r6p0Var, String str, Rect rect, View view, int i, int i2, int i3) {
        if ((i3 & 16) != 0) {
            i = 1;
        }
        r6p0Var.c(str, rect, view, 48, i, i2, null, null);
    }

    public final void a() {
        int i = TooltipOverlay.f;
        this.b.a(true);
    }

    public final void b(boolean z, View view, gzs<s3q0> gzsVar, gzs<s3q0> gzsVar2) {
        String string = this.a.getString(R.string.interactive_is_in_progress);
        if (z || pla.e().b().m(HintId.INFO_VIDEO_INTERACTIVE_STATUS_INDICATOR)) {
            pla.e().b().b(HintId.INFO_VIDEO_INTERACTIVE_STATUS_INDICATOR.getId());
            c(string, bwt0.C(view), view, 3, 16, cn70.b(10), gzsVar, gzsVar2);
        }
    }

    public final void c(String str, Rect rect, View view, int i, int i2, int i3, gzs<s3q0> gzsVar, gzs<s3q0> gzsVar2) {
        a aVar = new a(view);
        a();
        ikv0 ikv0Var = this.e;
        if (ikv0Var != null) {
            ikv0Var.a();
        }
        this.e = null;
        this.b.c(str, rect, new TooltipOverlay.b(i, i2, i3), new wrl0(aVar, 10), new q2m0(3, aVar, gzsVar2));
        if (gzsVar == null) {
            gzsVar = this.d;
        }
        gzsVar.invoke();
    }
}
