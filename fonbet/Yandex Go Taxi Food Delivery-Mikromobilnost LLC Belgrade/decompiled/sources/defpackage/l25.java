package defpackage;

import android.view.View;
import com.yandex.messaging.internal.view.custom.ProgressIndicator;
import com.yandex.messaging.internal.view.timeline.MessageImageLoader$GifCompressStrategy;
import com.yandex.messaging.internal.view.timeline.MessageImageLoader$GifLoadingStrategy;
import com.yandex.messaging.internal.view.timeline.c;
import com.yandex.messaging.internal.view.timeline.m;
import com.yandex.messaging.views.LimitedRoundImageView;

/* loaded from: classes15.dex */
public abstract class l25 extends c {
    public final ProgressIndicator B2;
    public final mt10 C2;
    public final LimitedRoundImageView x2;
    public final int y2;

    public l25(boolean z, View view, jwf jwfVar) {
        super(z, view, jwfVar);
        LimitedRoundImageView limitedRoundImageView = (LimitedRoundImageView) view.findViewById(e9h0.dialog_item_image);
        this.x2 = limitedRoundImageView;
        this.y2 = 10;
        ProgressIndicator progressIndicator = (ProgressIndicator) view.findViewById(e9h0.progress_indicator);
        this.B2 = progressIndicator;
        this.C2 = new mt10(limitedRoundImageView, progressIndicator, (xav) this.K0.getValue(), (x22) jwfVar.a, new zo1(this, z, 2), MessageImageLoader$GifLoadingStrategy.ONLY_TINY, MessageImageLoader$GifCompressStrategy.TIMELINE, 1792);
        this.L0.p();
    }

    @Override // com.yandex.messaging.internal.view.timeline.c
    public final int B0() {
        return this.y2;
    }

    @Override // com.yandex.messaging.internal.view.timeline.c
    public final /* bridge */ /* synthetic */ View C0() {
        return this.x2;
    }

    @Override // com.yandex.messaging.internal.view.timeline.c
    public final void J0(String str, boolean z) {
        String z0 = z0(this.a.getContext().getString(oyh0.messenger_message_with_image), z);
        LimitedRoundImageView limitedRoundImageView = this.x2;
        limitedRoundImageView.setContentDescription(z0);
        y0(limitedRoundImageView);
    }

    @Override // defpackage.qdz0
    public final boolean W() {
        return this.v2.b();
    }

    @Override // com.yandex.messaging.internal.view.timeline.c, com.yandex.messaging.internal.view.timeline.e
    public void X(yab yabVar, vb5 vb5Var) {
        super.X(yabVar, vb5Var);
        boolean z = this.k0;
        this.C2.l = z;
        if (!z) {
            ProgressIndicator.setLoadingState$default(this.B2, 0, 1, null);
        }
        this.v2.a(this.t0, yabVar, e0().f);
    }

    @Override // com.yandex.messaging.internal.view.timeline.c, com.yandex.messaging.internal.view.timeline.e
    public void f0() {
        zf0 zf0Var = this.T;
        zf0Var.a = false;
        zf0Var.b();
        this.v2.e();
        super.f0();
    }

    @Override // com.yandex.messaging.internal.view.timeline.e
    public final void g0() {
        this.C2.a();
        this.x2.cleanup();
        f0();
    }

    @Override // com.yandex.messaging.internal.view.timeline.e
    public final m l0() {
        return e0().a;
    }
}
