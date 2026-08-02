package defpackage;

import android.graphics.drawable.Drawable;
import android.view.View;
import com.yandex.messaging.internal.entities.ImageMessageData;
import com.yandex.messaging.internal.net.file.FileProgressObservable$Listener$Status;
import com.yandex.messaging.internal.view.timeline.i0;
import com.yandex.messaging.ui.imageviewer.ImageViewerInfo;
import com.yandex.messaging.views.LimitedRoundImageView;

/* loaded from: classes15.dex */
public abstract class lhs0 extends l25 implements w0r {
    public final View B3;
    public final i0 C3;
    public final a1r H2;
    public z0r N2;
    public boolean T2;
    public final r6e V2;
    public final int X2;
    public ImageViewerInfo v3;

    public lhs0(boolean z, View view, jwf jwfVar) {
        super(z, view, jwfVar);
        this.H2 = (a1r) jwfVar.m;
        this.V2 = (r6e) jwfVar.y;
        this.X2 = view.getResources().getDimensionPixelSize(gvg0.chat_image_bubble_offsets);
        this.B3 = this.y1.findViewById(e9h0.gif_indicator);
        this.C3 = new i0(jwfVar, this.v0);
        this.x2.setOnClickListener(new eaj0(20, this));
        this.x2.setOnLongClickListener(new ly4(9, this));
    }

    @Override // com.yandex.messaging.internal.view.timeline.c
    public final Drawable A0(z9z0 z9z0Var, boolean z, boolean z2) {
        return z9z0Var.a(z, z2, this.R, this.v2.x.F, G0());
    }

    @Override // com.yandex.messaging.internal.view.timeline.c
    public final ak51 F0() {
        return this.C3;
    }

    public abstract ase K0(boolean z, boolean z2);

    @Override // defpackage.l25, com.yandex.messaging.internal.view.timeline.c, com.yandex.messaging.internal.view.timeline.e
    public void X(yab yabVar, vb5 vb5Var) {
        super.X(yabVar, vb5Var);
        boolean z = false;
        this.T2 = false;
        ImageMessageData imageMessageData = (ImageMessageData) yabVar.R();
        if (imageMessageData.animated) {
            Long l = imageMessageData.imageSize;
            if ((l == null ? 0L : l.longValue()) < 10485760) {
                z = true;
            }
        }
        ai91.e(this.B3, z);
        b4b b4bVar = (b4b) this.a;
        LimitedRoundImageView limitedRoundImageView = this.x2;
        b4bVar.addLimitedView(limitedRoundImageView);
        if (imageMessageData.fileId == null || imageMessageData.fileName == null) {
            limitedRoundImageView.setOnViewLimitedCallback(new cjm0(28, this, imageMessageData));
        } else {
            limitedRoundImageView.setOnViewLimitedCallback(new hhs0(1, this, imageMessageData));
        }
        if (this.d0 == null || yabVar.W0()) {
            return;
        }
        String str = this.d0;
        a1r a1rVar = this.H2;
        a1rVar.getClass();
        this.N2 = new z0r(a1rVar, str, this);
    }

    @Override // com.yandex.messaging.internal.view.timeline.e
    public boolean b0() {
        return true;
    }

    @Override // defpackage.w0r
    public final void f(long j, long j2) {
    }

    @Override // defpackage.l25, com.yandex.messaging.internal.view.timeline.c, com.yandex.messaging.internal.view.timeline.e
    public final void f0() {
        super.f0();
        z0r z0rVar = this.N2;
        if (z0rVar != null) {
            z0rVar.close();
        }
        this.N2 = null;
        this.T2 = false;
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
        this.x2.setCornerRadiiDp(K0);
    }
}
