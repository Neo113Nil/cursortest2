package xsna;

import android.annotation.SuppressLint;
import android.content.Context;
import android.content.res.Configuration;
import android.graphics.Bitmap;
import android.text.TextUtils;
import android.view.View;
import android.widget.FrameLayout;
import android.widget.LinearLayout;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import java.util.List;
import xsna.t5z0;

/* compiled from: r8-map-id-8a00ff42af949b1913775377e888ba3d64200bdaff78f642603b0d3aafb83a92 */
/* loaded from: classes14.dex */
public final class x4z0 extends x6z0 implements r3z0 {
    public final cez0 n;
    public final r0z0 o;

    public x4z0(mzy0 mzy0Var, fbz0 fbz0Var, cez0 cez0Var, a8z0 a8z0Var, t5z0.a aVar, r0z0 r0z0Var, Context context) {
        super(mzy0Var, fbz0Var, a8z0Var, aVar, context);
        this.o = r0z0Var;
        this.n = cez0Var;
        setLayoutParams(new LinearLayout.LayoutParams(-1, -1));
        rvy0 rvy0Var = this.i;
        setBackgroundColor(rvy0Var.a.get(rvy0.r));
        this.c.addView(cez0Var, 0);
    }

    @Override // xsna.r3z0
    @NonNull
    public cez0 getVideoContent() {
        return this.n;
    }

    @Override // xsna.r3z0
    @NonNull
    public loy0 getVideoPlayer() {
        return this.n.getVideoPlayer();
    }

    @Override // xsna.r3z0
    @NonNull
    public dvy0 getVideoView() {
        return this.n.getVideoView();
    }

    @Override // xsna.x6z0, android.view.View.OnClickListener
    public final void onClick(View view) {
        cez0 cez0Var = this.n;
        auy0 videoControlButton = cez0Var.getVideoControlView().getVideoControlButton();
        r0z0 r0z0Var = this.o;
        if (view == videoControlButton) {
            r0z0Var.c();
            return;
        }
        if (view == cez0Var.getVideoControlView().getSoundControlButton()) {
            r0z0Var.d();
            return;
        }
        dvy0 videoView = cez0Var.getVideoView();
        t5z0.a aVar = this.e;
        if (view == videoView) {
            aVar.c(1, this.g ? new viy0(8192, this.f) : new akz0());
            return;
        }
        if (view != cez0Var.getPreviewView() || cez0Var.getPreviewView().getVisibility() != 0) {
            if (this.g) {
                d(view);
                return;
            } else {
                e(view);
                return;
            }
        }
        k6z0 k6z0Var = this.l;
        if (k6z0Var == null || !k6z0Var.d) {
            return;
        }
        aVar.c(1, this.g ? new viy0(8, this.f) : new akz0());
    }

    @Override // xsna.x6z0, android.view.View
    public final void onConfigurationChanged(Configuration configuration) {
        super.onConfigurationChanged(configuration);
        rvy0 rvy0Var = this.i;
        this.n.setBackgroundColor(rvy0Var.a.get(rvy0.x));
    }

    @Override // xsna.x6z0, xsna.t5z0
    public void setBanner(@NonNull tez0 tez0Var) {
        LinearLayout.LayoutParams c;
        lgz0 lgz0Var = tez0Var.c0;
        if (lgz0Var == null) {
            return;
        }
        kiw kiwVar = lgz0Var.Z;
        cez0 cez0Var = this.n;
        if (kiwVar == null || kiwVar.a() == null) {
            c = c(lgz0Var.g(), lgz0Var.q());
        } else {
            Bitmap a = kiwVar.a();
            cez0Var.getPreviewView().setImageBitmap(a);
            c = c(a.getWidth(), a.getHeight());
        }
        cez0Var.setLayoutParams(c);
        cez0Var.getVideoView().b(lgz0Var.g(), lgz0Var.q());
        FrameLayout.LayoutParams layoutParams = cez0Var.getContext().getResources().getConfiguration().orientation == 2 ? new FrameLayout.LayoutParams(-1, -2) : new FrameLayout.LayoutParams(-2, -1);
        layoutParams.gravity = 17;
        cez0Var.c.setLayoutParams(layoutParams);
        super.setBanner(tez0Var);
    }

    @Override // xsna.x6z0
    @SuppressLint({"ClickableViewAccessibility"})
    public void setClickAreaActual(@NonNull k6z0 k6z0Var) {
        super.setClickAreaActual(k6z0Var);
        cez0 cez0Var = this.n;
        auy0 videoControlButton = cez0Var.getVideoControlView().getVideoControlButton();
        s8z0 s8z0Var = this.m;
        videoControlButton.setOnTouchListener(s8z0Var);
        cez0Var.getVideoControlView().getSoundControlButton().setOnTouchListener(s8z0Var);
        cez0Var.getVideoView().setOnTouchListener(s8z0Var);
        cez0Var.getPreviewView().setOnTouchListener(s8z0Var);
        cez0Var.getDomainTextView().setOnTouchListener(s8z0Var);
        boolean z = k6z0Var.m;
        boolean z2 = k6z0Var.n;
        if (!z) {
            cez0Var.getVideoControlView().getVideoControlButton().setOnClickListener(this);
            cez0Var.getVideoControlView().getSoundControlButton().setOnClickListener(this);
            cez0Var.getVideoView().setOnClickListener(z2 ? this : null);
            cez0Var.getPreviewView().setOnClickListener(k6z0Var.d ? this : null);
            cez0Var.getDomainTextView().setOnClickListener(k6z0Var.j ? this : null);
            return;
        }
        cez0Var.getVideoControlView().getVideoControlButton().setOnClickListener(this);
        cez0Var.getVideoControlView().getSoundControlButton().setOnClickListener(this);
        cez0Var.getDomainTextView().setOnClickListener(this);
        cez0Var.getPreviewView().setOnClickListener(this);
        if (z2) {
            cez0Var.getVideoView().setOnClickListener(this);
        }
    }

    @Override // xsna.x6z0
    public void setClickAreaLegacy(@NonNull k6z0 k6z0Var) {
        super.setClickAreaLegacy(k6z0Var);
        cez0 cez0Var = this.n;
        cez0Var.getVideoControlView().getVideoControlButton().setOnClickListener(this);
        cez0Var.getVideoControlView().getSoundControlButton().setOnClickListener(this);
        cez0Var.getVideoView().setOnClickListener((k6z0Var.n || k6z0Var.m) ? this : null);
        cez0Var.getPreviewView().setOnClickListener(k6z0Var.d ? this : null);
        cez0Var.getDomainTextView().setOnClickListener(k6z0Var.j ? this : null);
    }

    @Override // xsna.x6z0
    public void setDomain(@NonNull String str) {
        super.setDomain(str);
        kcz0 kcz0Var = this.h;
        boolean z = kcz0Var instanceof wbz0;
        cez0 cez0Var = this.n;
        if (z) {
            if (TextUtils.isEmpty(str)) {
                cez0Var.getDomainTextView().setVisibility(8);
            } else {
                cez0Var.getDomainTextView().setText(str);
                cez0Var.getDomainTextView().setVisibility(0);
            }
            cez0Var.getDomainContainer().setVisibility(0);
            return;
        }
        if (kcz0Var == null || kcz0Var.getDomainTextView() == null || TextUtils.isEmpty(str)) {
            return;
        }
        cez0Var.getDomainContainer().setVisibility(8);
    }

    @Override // xsna.x6z0
    public void setIcon(@Nullable kiw kiwVar) {
        super.setIcon(kiwVar);
        if (kiwVar == null || kiwVar.a() == null || !(this.h instanceof wbz0)) {
            return;
        }
        this.n.getLogoImageView().setImageBitmap(j6z0.a(kiwVar.a()));
    }

    @Override // xsna.t5z0
    public final View a() {
        return this;
    }

    @Override // xsna.x6z0, xsna.t5z0
    public void setDoubleBanners(@NonNull List<m6z0> list) {
    }
}
