package com.yandex.messaging.internal.view.timeline;

import android.graphics.drawable.Drawable;
import android.view.View;
import android.widget.ImageView;
import com.yandex.messaging.internal.entities.MessageData;
import com.yandex.messaging.internal.entities.VideoMessageData;
import com.yandex.messaging.internal.net.file.FileProgressObservable$Listener$Status;
import com.yandex.messaging.internal.view.custom.ProgressIndicator;
import com.yandex.messaging.views.LimitedRoundFrameLayout;
import defpackage.a1r;
import defpackage.ak51;
import defpackage.ase;
import defpackage.b4b;
import defpackage.e9h0;
import defpackage.gm31;
import defpackage.gvg0;
import defpackage.i3y;
import defpackage.jm31;
import defpackage.jwf;
import defpackage.l95;
import defpackage.ly4;
import defpackage.oyh0;
import defpackage.pzt0;
import defpackage.r6e;
import defpackage.tf;
import defpackage.tj91;
import defpackage.tje;
import defpackage.vb5;
import defpackage.w0r;
import defpackage.yab;
import defpackage.ymu;
import defpackage.z0r;
import defpackage.z9z0;
import defpackage.zf0;
import kotlinx.coroutines.flow.r0;

/* loaded from: classes15.dex */
public abstract class f extends c implements w0r {
    public static final /* synthetic */ int T3 = 0;
    public final r6e B2;
    public final i3y B3;
    public final LimitedRoundFrameLayout C2;
    public pzt0 C3;
    public final int H2;
    public boolean H3;
    public final i0 N2;
    public boolean N3;
    public final ImageView T2;
    public final ProgressIndicator V2;
    public final ImageView X2;
    public final int v3;
    public final a1r x2;
    public z0r y2;

    public f(boolean z, View view, jwf jwfVar) {
        super(z, view, jwfVar);
        this.x2 = (a1r) jwfVar.m;
        this.B2 = (r6e) jwfVar.y;
        LimitedRoundFrameLayout limitedRoundFrameLayout = (LimitedRoundFrameLayout) view.findViewById(e9h0.dialog_item_video_container);
        this.C2 = limitedRoundFrameLayout;
        this.H2 = 10;
        this.N2 = new i0(jwfVar, this.v0);
        this.T2 = (ImageView) view.findViewById(e9h0.dialog_item_image);
        this.V2 = (ProgressIndicator) view.findViewById(e9h0.progress_indicator);
        this.X2 = (ImageView) view.findViewById(e9h0.video_play_button);
        this.v3 = view.getResources().getDimensionPixelSize(gvg0.chat_image_bubble_offsets);
        this.B3 = kotlin.a.a(new l95(8, this));
        this.L0.p();
        limitedRoundFrameLayout.setOnClickListener(new tf(22, this));
        limitedRoundFrameLayout.setOnLongClickListener(new ly4(2, this));
    }

    @Override // com.yandex.messaging.internal.view.timeline.c
    public final Drawable A0(z9z0 z9z0Var, boolean z, boolean z2) {
        return z9z0Var.a(z, z2, this.R, this.v2.x.F, G0());
    }

    @Override // com.yandex.messaging.internal.view.timeline.c
    public final int B0() {
        return this.H2;
    }

    @Override // com.yandex.messaging.internal.view.timeline.c
    public final /* bridge */ /* synthetic */ View C0() {
        return this.C2;
    }

    @Override // com.yandex.messaging.internal.view.timeline.c
    public final ak51 F0() {
        return this.N2;
    }

    @Override // com.yandex.messaging.internal.view.timeline.c
    public final void J0(String str, boolean z) {
        View view = this.a;
        view.setContentDescription(z0(view.getContext().getString(oyh0.messenger_message_with_file), z));
    }

    public abstract ase K0(boolean z, boolean z2);

    @Override // defpackage.qdz0
    public final boolean W() {
        return this.v2.b();
    }

    @Override // com.yandex.messaging.internal.view.timeline.c, com.yandex.messaging.internal.view.timeline.e
    public void X(yab yabVar, vb5 vb5Var) {
        super.X(yabVar, vb5Var);
        MessageData R = yabVar.R();
        VideoMessageData videoMessageData = R instanceof VideoMessageData ? (VideoMessageData) R : null;
        if (videoMessageData == null) {
            return;
        }
        pzt0 pzt0Var = this.C3;
        if (pzt0Var != null) {
            pzt0Var.a(null);
        }
        this.C3 = tje.N(this.v0, null, null, new BaseVideoMessageViewHolder$startObservingUiState$1(this, null), 3);
        b4b b4bVar = (b4b) this.a;
        LimitedRoundFrameLayout limitedRoundFrameLayout = this.C2;
        b4bVar.addLimitedView(limitedRoundFrameLayout);
        limitedRoundFrameLayout.setOnViewLimitedCallback(new ymu(20, this, videoMessageData));
        this.v2.a(this.t0, yabVar, e0().f);
        if (this.d0 == null || yabVar.W0()) {
            return;
        }
        String str = this.d0;
        a1r a1rVar = this.x2;
        a1rVar.getClass();
        this.y2 = new z0r(a1rVar, str, this);
    }

    @Override // com.yandex.messaging.internal.view.timeline.e
    public boolean b0() {
        return true;
    }

    @Override // defpackage.w0r
    public final void f(long j, long j2) {
    }

    @Override // com.yandex.messaging.internal.view.timeline.c, com.yandex.messaging.internal.view.timeline.e
    public final void f0() {
        zf0 zf0Var = this.T;
        zf0Var.a = false;
        zf0Var.b();
        this.v2.e();
        z0r z0rVar = this.y2;
        if (z0rVar != null) {
            z0rVar.close();
        }
        this.y2 = null;
        this.H3 = false;
        super.f0();
    }

    @Override // com.yandex.messaging.internal.view.timeline.e
    public final void g0() {
        jm31 jm31Var = (jm31) this.B3.getValue();
        pzt0 pzt0Var = jm31Var.e;
        if (pzt0Var != null) {
            pzt0Var.a(null);
        }
        pzt0 pzt0Var2 = jm31Var.f;
        if (pzt0Var2 != null) {
            pzt0Var2.a(null);
        }
        r0 r0Var = jm31Var.c;
        r0Var.getClass();
        r0Var.m(null, gm31.a);
        pzt0 pzt0Var3 = this.C3;
        if (pzt0Var3 != null) {
            pzt0Var3.a(null);
        }
        this.T2.setImageDrawable(null);
        this.C2.cleanup();
        f0();
    }

    @Override // com.yandex.messaging.internal.view.timeline.e
    public final m l0() {
        return e0().a;
    }

    @Override // defpackage.w0r
    public final void q(FileProgressObservable$Listener$Status fileProgressObservable$Listener$Status) {
        if (this.k0 || fileProgressObservable$Listener$Status != FileProgressObservable$Listener$Status.UNKNOWN) {
            boolean z = fileProgressObservable$Listener$Status == FileProgressObservable$Listener$Status.ERROR;
            zf0 zf0Var = this.T;
            zf0Var.a = z;
            zf0Var.b();
        }
    }

    @Override // com.yandex.messaging.internal.view.timeline.e
    public final void w0(boolean z, boolean z2) {
        ase K0 = K0(z, z2);
        if (tj91.b(this.a)) {
            K0 = K0.a();
        }
        this.C2.setCornerRadiiDp(K0);
    }
}
