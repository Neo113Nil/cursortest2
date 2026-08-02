package xsna;

import android.content.Context;
import android.os.Handler;
import android.os.Looper;
import android.text.TextUtils;
import android.view.View;
import ru.ok.android.webrtc.stat.call.internal.ConnectivityTracker;
import xsna.igz0;

/* compiled from: r8-map-id-8a00ff42af949b1913775377e888ba3d64200bdaff78f642603b0d3aafb83a92 */
/* loaded from: classes14.dex */
public final class huy0 implements jaz0 {
    public final sxy0 b;
    public final nxy0 c;
    public long d;
    public final Handler e = new Handler(Looper.getMainLooper());
    public final xqc f;
    public final kpy0 g;
    public final igz0.a h;

    public huy0(guy0 guy0Var, nxy0 nxy0Var, igz0.a aVar) {
        this.h = aVar;
        this.c = nxy0Var;
        Context context = guy0Var.b;
        sxy0 sxy0Var = new sxy0(new mzy0(context), new fbz0(context), new qty0(context), this, guy0Var.b);
        this.b = sxy0Var;
        sxy0Var.setHtmlSource(nxy0Var);
        wty0 wty0Var = nxy0Var.L;
        kiw kiwVar = wty0Var != null ? wty0Var.a : null;
        String b = b();
        boolean z = false;
        int i = (kiwVar == null && TextUtils.isEmpty(b)) ? 8 : 0;
        mzy0 mzy0Var = sxy0Var.c;
        mzy0Var.setVisibility(i);
        mzy0Var.getAgeRestrictionsTextView().setText(b);
        if (kiwVar != null) {
            mzy0Var.getAdsIcon().setImageBitmap(kiwVar.a());
        }
        boolean z2 = nxy0Var.T.c;
        k6z0 k6z0Var = nxy0Var.v;
        sxy0Var.f = z2;
        if (z2) {
            View.OnTouchListener onTouchListener = sxy0Var.g;
            sxy0Var.setOnTouchListener(onTouchListener);
            mzy0Var.setOnTouchListener(onTouchListener);
        }
        if (k6z0Var.m) {
            sxy0Var.setOnClickListener(sxy0Var);
        } else {
            sxy0Var.setOnClickListener(k6z0Var.l ? sxy0Var : null);
            mzy0Var.setOnClickListener((k6z0Var.h || k6z0Var.i) ? sxy0Var : null);
            mzy0Var.getAdsIcon().setOnClickListener(k6z0Var.c ? sxy0Var : null);
        }
        this.f = new xqc(this, 18);
        wty0 wty0Var2 = nxy0Var.L;
        if (wty0Var2 == null) {
            sxy0Var.setShowingChoiceButton(false);
        } else {
            sxy0Var.setShowingChoiceButton(true);
            if (wty0Var2.c != null) {
                kpy0 kpy0Var = new kpy0(wty0Var2, b(), sxy0Var.getContext());
                this.g = kpy0Var;
                kpy0Var.e = new o6y0(this, nxy0Var);
            }
        }
        if (nxy0Var.Y) {
            long j = (long) (nxy0Var.V * 1000.0f);
            this.d = j;
            if (j > 0) {
                gu8.c(null, "InterstitialPresenterS4: Banner will be allowed to close in " + this.d + " millis");
                c();
            } else {
                gu8.c(null, "InterstitialPresenterS4loseDelayState = CloseDelayState.DISABLED: Banner is allowed to close");
                a();
                z = true;
            }
        } else {
            sxy0Var.d.getProgressFrame().setVisibility(8);
        }
        aVar.a.j = z;
        aVar.j(nxy0Var, sxy0Var);
    }

    public final void a() {
        fbz0 fbz0Var = this.b.d;
        fbz0Var.getCloseButton().setVisibility(0);
        fbz0Var.getSkipButton().setVisibility(8);
        fbz0Var.getProgressFrame().setVisibility(8);
        this.e.removeCallbacks(this.f);
        igz0.a aVar = this.h;
        aVar.a(ConnectivityTracker.DEFAULT_UPLINK_BITRATE);
        aVar.a.j = true;
    }

    public final String b() {
        nxy0 nxy0Var = this.c;
        String str = "";
        if (!TextUtils.isEmpty(nxy0Var.r)) {
            str = "" + nxy0Var.r;
        }
        if (TextUtils.isEmpty(nxy0Var.h)) {
            return str;
        }
        if (!TextUtils.isEmpty(str)) {
            str = fo8.a(str, " ");
        }
        StringBuilder e = fw3.e(str);
        e.append(nxy0Var.h);
        return e.toString();
    }

    public final void c() {
        Handler handler = this.e;
        xqc xqcVar = this.f;
        handler.removeCallbacks(xqcVar);
        handler.postDelayed(xqcVar, 200L);
        this.h.a(this.d / 1000.0d);
        this.b.setRemainingAllowCloseDelay((int) ((this.d / 1000) + 1));
    }

    @Override // xsna.jaz0
    public final View getCloseButton() {
        return this.b.getCloseButton();
    }

    @Override // xsna.jaz0
    public final View i() {
        return this.b;
    }

    @Override // xsna.jaz0
    public final void destroy() {
    }

    @Override // xsna.jaz0
    public final void pause() {
    }

    @Override // xsna.jaz0
    public final void resume() {
    }

    @Override // xsna.jaz0
    public final void stop() {
    }
}
