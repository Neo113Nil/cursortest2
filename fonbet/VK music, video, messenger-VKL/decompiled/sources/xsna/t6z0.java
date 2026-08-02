package xsna;

import android.content.Context;
import android.content.Intent;
import android.graphics.Bitmap;
import android.net.Uri;
import android.view.View;
import android.widget.Button;
import android.widget.FrameLayout;
import android.widget.ImageView;
import com.ironsource.C4572u;
import com.ironsource.mediationsdk.utils.IronSourceConstants;
import com.my.target.common.MyTargetActivity;
import java.lang.ref.WeakReference;
import xsna.hjz0;
import xsna.hox;
import xsna.ijg0;
import xsna.mbz0;

/* compiled from: r8-map-id-8a00ff42af949b1913775377e888ba3d64200bdaff78f642603b0d3aafb83a92 */
/* loaded from: classes14.dex */
public final class t6z0 extends euy0 implements pcz0 {
    public final suy0 k;
    public final s4z0 l;
    public final mez0 m;
    public izy0 n;
    public WeakReference o;

    public t6z0(ff6 ff6Var, s4z0 s4z0Var, hjz0.a aVar, hjz0.b bVar) {
        super(aVar, ff6Var, bVar);
        this.l = s4z0Var;
        this.k = suy0.a(s4z0Var.a, new m3z0(1, aVar, s4z0Var));
        this.m = mez0.a(ff6Var.a.a);
    }

    @Override // com.my.target.common.MyTargetActivity.a
    public final void a() {
        mbz0 mbz0Var;
        this.d = true;
        WeakReference weakReference = this.o;
        if (weakReference == null || (mbz0Var = (mbz0) weakReference.get()) == null) {
            return;
        }
        b9z0 b9z0Var = mbz0Var.b;
        izy0 izy0Var = this.n;
        if (izy0Var != null) {
            izy0Var.f(b9z0Var);
        }
        suy0 suy0Var = this.k;
        suy0Var.b(b9z0Var);
        suy0Var.c();
        mbz0Var.resume();
    }

    @Override // xsna.jaz0.a
    public final void b(xey0 xey0Var, String str, int i, fiz0 fiz0Var, Context context) {
        mez0 mez0Var = this.m;
        s4z0 s4z0Var = this.l;
        mez0Var.c(s4z0Var, i, fiz0Var, context);
        String str2 = s4z0Var.F;
        this.a.g(new hox.a());
    }

    @Override // xsna.jaz0.a
    public final void f(xey0 xey0Var) {
        xey0Var.T.d(1, IronSourceConstants.errorCode_showInProgress);
        h8z0.e(xey0Var.a, "closedByUser", 999, new or20(this, 28));
        q();
    }

    @Override // xsna.euy0, com.my.target.common.MyTargetActivity.a
    public final void g(MyTargetActivity myTargetActivity, Intent intent, FrameLayout frameLayout) {
        Bitmap a;
        super.g(myTargetActivity, intent, frameLayout);
        s4z0 s4z0Var = this.l;
        giy0 giy0Var = s4z0Var.T;
        oly0 oly0Var = s4z0Var.c0;
        giy0Var.d(1, 5000);
        mbz0 mbz0Var = new mbz0(s4z0Var, this.c.g, this, new woy0(this, s4z0Var), frameLayout.getContext());
        b9z0 b9z0Var = mbz0Var.b;
        frameLayout.addView(b9z0Var);
        int i = mbz0Var.i;
        if (i == -1) {
            tdz0 tdz0Var = s4z0Var.d0;
            if (tdz0Var == null) {
                mbz0Var.f();
            } else if (i == -1) {
                t7z0 t7z0Var = b9z0Var.b;
                if (t7z0Var.getParent() == null) {
                    b9z0Var.i.addView(t7z0Var, -1, -1);
                }
                mbz0Var.i = 0;
                sgz0 sgz0Var = tdz0Var.g;
                if (sgz0Var != null && mbz0Var.g != null) {
                    t7z0 videoView = b9z0Var.getVideoView();
                    loy0 videoPlayer = videoView.getVideoPlayer();
                    dvy0 adVideoView = videoView.getAdVideoView();
                    ImageView adIcon = videoView.getAdIcon();
                    Button ctaButton = videoView.getCtaButton();
                    auy0 volumeButton = videoView.getVolumeButton();
                    adIcon.setOnClickListener(new n14(mbz0Var, 10));
                    gdy0 progressView = videoView.getProgressView();
                    progressView.setMaxTime(tdz0Var.h);
                    kwy0 kwy0Var = mbz0Var.g;
                    t6z0 t6z0Var = mbz0Var.c;
                    videoView.setPlayableVideoListener(new mbz0.b(progressView, kwy0Var, t6z0Var));
                    if (tdz0Var.e) {
                        videoPlayer.f();
                    }
                    videoPlayer.A(adVideoView);
                    adVideoView.b(sgz0Var.b, sgz0Var.c);
                    videoPlayer.B(adVideoView.getContext(), Uri.parse(sgz0Var.a));
                    kiw kiwVar = tdz0Var.d;
                    if (kiwVar != null) {
                        adIcon.setImageBitmap(kiwVar.a());
                    }
                    ctaButton.setBackgroundColor(oly0Var.a);
                    ctaButton.setTextColor(oly0Var.c);
                    ctaButton.setText(s4z0Var.n());
                    ctaButton.setOnClickListener(new a9z0(1, mbz0Var));
                    if (tdz0Var.e) {
                        volumeButton.getContext();
                        a = nhz0.a(420, "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");
                    } else {
                        volumeButton.getContext();
                        a = nhz0.a(420, "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");
                    }
                    volumeButton.a(a, false);
                    volumeButton.setOnClickListener(new hpg(5, videoPlayer, volumeButton));
                    mbz0Var.b(tdz0Var.c);
                    t6z0Var.j(s4z0Var, videoView);
                }
            }
            wty0 wty0Var = s4z0Var.L;
            if (wty0Var != null) {
                b9z0Var.getAdChoicesButton().setOnClickListener(new th4(4, mbz0Var, wty0Var));
                if (wty0Var.c != null) {
                    fvy0 fvy0Var = new fvy0(wty0Var, new mnh0());
                    mbz0Var.j = fvy0Var;
                    fvy0Var.d = new l340(mbz0Var, 26);
                }
            }
            b9z0Var.setBackgroundColor(oly0Var.d);
        }
        this.o = new WeakReference(mbz0Var);
    }

    @Override // xsna.jaz0.a
    public final void j(xey0 xey0Var, View view) {
        izy0 izy0Var = this.n;
        if (izy0Var != null) {
            izy0Var.h();
        }
        s4z0 s4z0Var = this.l;
        izy0 b = izy0.b(s4z0Var.b, s4z0Var.a, new hl30(this, 27));
        this.n = b;
        if (this.d) {
            b.f(view);
        }
        qjk0.a(new StringBuilder("InterstitialAdImagineEngine: Ad shown, banner Id = "), xey0Var.F, null);
    }

    @Override // xsna.euy0, com.my.target.common.MyTargetActivity.a
    public final void l() {
        mbz0 mbz0Var;
        super.l();
        WeakReference weakReference = this.o;
        if (weakReference == null || (mbz0Var = (mbz0) weakReference.get()) == null) {
            return;
        }
        mbz0Var.destroy();
    }

    @Override // com.my.target.common.MyTargetActivity.a
    public final void m() {
        mbz0 mbz0Var;
        this.d = false;
        izy0 izy0Var = this.n;
        if (izy0Var != null) {
            izy0Var.h();
        }
        this.k.b(null);
        WeakReference weakReference = this.o;
        if (weakReference == null || (mbz0Var = (mbz0) weakReference.get()) == null) {
            return;
        }
        mbz0Var.pause();
    }

    @Override // xsna.euy0
    public final boolean r() {
        mbz0 mbz0Var;
        WeakReference weakReference = this.o;
        if (weakReference == null || (mbz0Var = (mbz0) weakReference.get()) == null) {
            return true;
        }
        return mbz0Var.i == 2 && mbz0Var.b.h.getVisibility() == 0;
    }

    public final void s() {
        if (this.e) {
            return;
        }
        this.e = true;
        ijg0.c cVar = this.i;
        if (cVar != null) {
            h8z0.e(this.l.a, C4572u.j, 999, new xhb0(this, 22));
            cVar.a(new fvr());
        }
    }

    @Override // xsna.jaz0.a
    public final void a(double d) {
        this.a.f();
    }
}
