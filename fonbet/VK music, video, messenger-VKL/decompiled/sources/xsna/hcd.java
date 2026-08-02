package xsna;

import android.content.Context;
import android.net.Uri;
import android.view.View;
import com.vk.core.view.components.picture.VkImageSimple;
import com.vk.dto.common.TimelineThumbs;
import kotlin.LazyThreadSafetyMode;
import xsna.hfd;

/* compiled from: ClipSeekBarControllerImpl.kt */
/* loaded from: classes17.dex */
public final class hcd implements vut0 {
    public final Object b;
    public final /* synthetic */ dcd c;

    /* compiled from: ClipSeekBarControllerImpl.kt */
    public static final class a implements vut0 {
        public final Object b;
        public final /* synthetic */ dcd c;

        public a(Context context, dcd dcdVar) {
            this.c = dcdVar;
            this.b = msy.a(LazyThreadSafetyMode.NONE, new yg(context, 21));
        }

        /* JADX WARN: Type inference failed for: r2v0, types: [java.lang.Object, kotlin.Lazy] */
        @Override // xsna.vut0
        public final void c(rzt0 rzt0Var) {
            d80 d80Var = this.c.f;
            boolean z = rzt0Var instanceof jfd;
            ?? r2 = this.b;
            if (!z) {
                if (rzt0Var instanceof ifd) {
                    qcy<Object> qcyVar = dcd.j[0];
                    d80Var.g(null);
                    ((VkImageSimple) r2.getValue()).setImageDrawable(null);
                    return;
                }
                return;
            }
            jfd jfdVar = (jfd) rzt0Var;
            if (jfdVar.a.length() == 0) {
                qcy<Object> qcyVar2 = dcd.j[0];
                d80Var.g(null);
                ((VkImageSimple) r2.getValue()).setImageDrawable(null);
            } else {
                io.reactivex.rxjava3.internal.operators.observable.b2 h0 = mcr0.h(Uri.parse(jfdVar.a)).h0(2L);
                asu0 asu0Var = asu0.a;
                io.reactivex.rxjava3.disposables.c subscribe = h0.r0(asu0Var.c()).a0(asu0Var.d()).subscribe(new h60(new a8(this, 26), 13), new xf1(new com.vk.movika.sdk.base.observable.a(this, 28), 12));
                qcy<Object> qcyVar3 = dcd.j[0];
                d80Var.g(subscribe);
            }
        }

        /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, kotlin.Lazy] */
        @Override // xsna.vut0
        public final View getView() {
            return (VkImageSimple) this.b.getValue();
        }
    }

    public hcd(Context context, dcd dcdVar) {
        this.c = dcdVar;
        this.b = msy.a(LazyThreadSafetyMode.NONE, new hc1(6, context, dcdVar));
    }

    /* JADX WARN: Type inference failed for: r2v0, types: [java.lang.Object, kotlin.Lazy] */
    @Override // xsna.vut0
    public final void c(rzt0 rzt0Var) {
        dcd dcdVar;
        TimelineThumbs timelineThumbs;
        Float f;
        if (!(rzt0Var instanceof kcd) || (timelineThumbs = (dcdVar = this.c).h) == null || (f = dcdVar.d) == null) {
            return;
        }
        ((hfd) this.b.getValue()).setConfig(new hfd.a(new hfd.a.C2992a(timelineThumbs.b, timelineThumbs.c, timelineThumbs.d, timelineThumbs.e, timelineThumbs.f, timelineThumbs.g, timelineThumbs.h, timelineThumbs.i), (int) ((kcd) rzt0Var).a, (int) f.floatValue()));
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, kotlin.Lazy] */
    @Override // xsna.vut0
    public final View getView() {
        return (hfd) this.b.getValue();
    }
}
