package xsna;

import android.app.Activity;
import android.content.Context;
import android.graphics.Point;
import android.os.Handler;
import android.os.Looper;
import android.text.TextUtils;
import android.view.View;
import android.widget.LinearLayout;
import ru.ok.android.webrtc.stat.call.internal.ConnectivityTracker;
import xsna.igz0;

/* compiled from: r8-map-id-8a00ff42af949b1913775377e888ba3d64200bdaff78f642603b0d3aafb83a92 */
/* loaded from: classes14.dex */
public final class bzy0 implements jaz0 {
    public final Handler b = new Handler(Looper.getMainLooper());
    public final ic3 c;
    public final igz0.a d;
    public final p0z0 e;
    public final kpy0 f;
    public final w1z0 g;
    public long h;

    public bzy0(guy0 guy0Var, p0z0 p0z0Var, igz0.a aVar) {
        this.e = p0z0Var;
        this.d = aVar;
        Context context = guy0Var.b;
        w1z0 w1z0Var = new w1z0(new mzy0(context), new fbz0(context), new m0z0(context), this, guy0Var.b);
        this.g = w1z0Var;
        c();
        boolean z = p0z0Var.T.c;
        k6z0 k6z0Var = p0z0Var.v;
        w1z0Var.f = z;
        mzy0 mzy0Var = w1z0Var.b;
        if (z) {
            View.OnTouchListener onTouchListener = w1z0Var.n;
            w1z0Var.setOnTouchListener(onTouchListener);
            mzy0Var.setOnTouchListener(onTouchListener);
            kcz0 kcz0Var = w1z0Var.g;
            if (kcz0Var != null) {
                kcz0Var.getTitleTextView().setOnTouchListener(onTouchListener);
                w1z0Var.g.getDescriptionTextView().setOnTouchListener(onTouchListener);
                w1z0Var.g.getCtaButton().setOnTouchListener(onTouchListener);
                mzy0Var.getAdsIcon().setOnTouchListener(onTouchListener);
                if (w1z0Var.g.getDomainTextView() != null && w1z0Var.g.getLogoImageView() != null) {
                    w1z0Var.g.getLogoImageView().setOnTouchListener(onTouchListener);
                    w1z0Var.g.getDomainTextView().setOnTouchListener(onTouchListener);
                }
            }
        }
        boolean z2 = k6z0Var.m;
        boolean z3 = k6z0Var.j;
        boolean z4 = k6z0Var.g;
        if (z2) {
            w1z0Var.setOnClickListener(w1z0Var);
            mzy0Var.setOnClickListener(w1z0Var);
            mzy0Var.getAdsIcon().setOnClickListener(w1z0Var);
            kcz0 kcz0Var2 = w1z0Var.g;
            if (kcz0Var2 != null) {
                kcz0Var2.getTitleTextView().setOnClickListener(w1z0Var);
                w1z0Var.g.getDescriptionTextView().setOnClickListener(w1z0Var);
                w1z0Var.g.getCtaButton().setOnClickListener(w1z0Var);
                if (w1z0Var.g.getDomainTextView() != null && w1z0Var.g.getLogoImageView() != null) {
                    w1z0Var.g.getLogoImageView().setOnClickListener(w1z0Var);
                    w1z0Var.g.getDomainTextView().setOnClickListener(w1z0Var);
                }
            }
        } else {
            w1z0Var.setOnClickListener(k6z0Var.l ? w1z0Var : null);
            mzy0Var.setOnClickListener((k6z0Var.h || k6z0Var.i) ? w1z0Var : null);
            mzy0Var.getAdsIcon().setOnClickListener(k6z0Var.c ? w1z0Var : null);
            kcz0 kcz0Var3 = w1z0Var.g;
            if (kcz0Var3 != null) {
                kcz0Var3.getCtaButton().setOnClickListener(z4 ? w1z0Var : null);
                w1z0Var.g.getCtaButton().setEnabled(z4);
                w1z0Var.g.getTitleTextView().setOnClickListener(k6z0Var.a ? w1z0Var : null);
                w1z0Var.g.getDescriptionTextView().setOnClickListener(k6z0Var.b ? w1z0Var : null);
                if (w1z0Var.g.getDomainTextView() != null && w1z0Var.g.getLogoImageView() != null) {
                    w1z0Var.g.getLogoImageView().setOnClickListener(z3 ? w1z0Var : null);
                    w1z0Var.g.getDomainTextView().setOnClickListener(z3 ? w1z0Var : null);
                }
            }
        }
        this.c = new ic3(this, 15);
        wty0 wty0Var = p0z0Var.L;
        boolean z5 = true;
        if (wty0Var == null) {
            w1z0Var.setShowingChoiceButton(false);
        } else {
            w1z0Var.setShowingChoiceButton(true);
            if (wty0Var.c != null) {
                kpy0 kpy0Var = new kpy0(wty0Var, p0z0Var.i(), w1z0Var.getContext());
                this.f = kpy0Var;
                kpy0Var.e = new azy0(this, p0z0Var);
            }
        }
        if (p0z0Var.Y) {
            long j = (long) (p0z0Var.V * 1000.0f);
            this.h = j;
            if (j <= 0) {
                gu8.c(null, "InterstitialPresenterS4loseDelayState = CloseDelayState.DISABLED: Banner is allowed to close");
                a();
                aVar.a.j = z5;
                aVar.j(p0z0Var, w1z0Var);
            }
            gu8.c(null, "InterstitialPresenterS4: Banner will be allowed to close in " + this.h + " millis");
            b();
        } else {
            w1z0Var.d.getProgressFrame().setVisibility(8);
        }
        z5 = false;
        aVar.a.j = z5;
        aVar.j(p0z0Var, w1z0Var);
    }

    public final void a() {
        fbz0 fbz0Var = this.g.d;
        fbz0Var.getCloseButton().setVisibility(0);
        fbz0Var.getSkipButton().setVisibility(8);
        fbz0Var.getProgressFrame().setVisibility(8);
        this.b.removeCallbacks(this.c);
        igz0.a aVar = this.d;
        aVar.a(ConnectivityTracker.DEFAULT_UPLINK_BITRATE);
        aVar.a.j = true;
    }

    public final void b() {
        Handler handler = this.b;
        ic3 ic3Var = this.c;
        handler.removeCallbacks(ic3Var);
        handler.postDelayed(ic3Var, 200L);
        this.d.a(this.h / 1000.0d);
        this.g.setRemainingAllowCloseDelay((int) ((this.h / 1000) + 1));
    }

    /* JADX WARN: Code restructure failed: missing block: B:76:0x0096, code lost:
    
        if (r9 < r4) goto L22;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void c() {
        float f;
        int i;
        kcz0 kcz0Var;
        LinearLayout.LayoutParams layoutParams;
        LinearLayout.LayoutParams layoutParams2;
        p0z0 p0z0Var = this.e;
        kiw kiwVar = p0z0Var.d0;
        kiw kiwVar2 = p0z0Var.c0;
        w1z0 w1z0Var = this.g;
        w1z0Var.j = kiwVar;
        w1z0Var.i = kiwVar2;
        m0z0 m0z0Var = w1z0Var.k;
        Point q = c1z0.q(w1z0Var.getContext());
        int i2 = q.x;
        int i3 = q.y;
        if (i2 > 0 && i3 > 0) {
            kiw kiwVar3 = ((float) i2) / ((float) i3) > 1.0f ? w1z0Var.j : w1z0Var.i;
            if (kiwVar3 == null && (kiwVar3 = w1z0Var.j) == null) {
                kiwVar3 = w1z0Var.i;
            }
            if (kiwVar3 != null) {
                m0z0Var.getImageView().setImageData(kiwVar3);
                int i4 = kiwVar3.b;
                int i5 = kiwVar3.c;
                Point l = c1z0.l(w1z0Var.getContext());
                int i6 = l.x;
                int i7 = l.y;
                float f2 = i4;
                float f3 = f2 / i5;
                if (f3 == 1.0f) {
                    if (i6 >= i7) {
                        f = i7 / f3;
                        i6 = (int) f;
                    }
                    i7 = (int) (i6 / f3);
                } else {
                    if (w1z0Var.l == 2) {
                        f = c1z0.d(282, w1z0Var.getContext());
                        if (f3 > 1.0f) {
                            float f4 = (i6 / 3.0f) * 2.0f;
                            i6 = (int) (i7 * f3);
                            float f5 = i6;
                            if (f5 < f) {
                                i = (int) f;
                            } else if (f5 > f4) {
                                i = (int) f4;
                            }
                            i7 = (int) (i / f3);
                            i6 = i;
                        } else {
                            i6 = (int) (i7 * f3);
                        }
                    } else {
                        if (i5 > c1z0.d(693, w1z0Var.getContext())) {
                            float f6 = (i7 * 85.0f) / 100.0f;
                            i7 = (int) f6;
                            f = f6 * (f2 / f6);
                        }
                        i7 = (int) (i6 / f3);
                    }
                    i6 = (int) f;
                }
                LinearLayout linearLayout = w1z0Var.c;
                kcz0 kcz0Var2 = w1z0Var.g;
                if (kcz0Var2 != null) {
                    linearLayout.removeView(kcz0Var2);
                }
                Point q2 = c1z0.q(w1z0Var.getContext());
                int i8 = q2.x;
                int i9 = q2.y;
                if (i8 <= 0 || i9 <= 0) {
                    kcz0Var = null;
                } else {
                    int i10 = w1z0Var.getContext().getResources().getConfiguration().orientation;
                    if (((Activity) w1z0Var.getContext()).isInMultiWindowMode()) {
                        kcz0Var = new wbz0(w1z0Var.getContext());
                    } else if (i10 == 2) {
                        kcz0Var = i6 < (i8 / 3) * 2 ? new f4z0(w1z0Var.getContext()) : new zrz0(w1z0Var.getContext());
                    } else {
                        int i11 = i9 / 2;
                        kcz0Var = (i7 <= i11 || i7 >= (i9 / 4) * 3) ? i7 < i11 ? new f4z0(w1z0Var.getContext()) : new wbz0(w1z0Var.getContext()) : new f4z0(w1z0Var.getContext());
                    }
                }
                w1z0Var.g = kcz0Var;
                if (kcz0Var != null) {
                    if (((Activity) w1z0Var.getContext()).isInMultiWindowMode()) {
                        layoutParams2 = new LinearLayout.LayoutParams(-1, -2);
                    } else if (w1z0Var.l == 2) {
                        if (w1z0Var.g instanceof zrz0) {
                            layoutParams2 = new LinearLayout.LayoutParams(-1, -1);
                        } else {
                            layoutParams2 = new LinearLayout.LayoutParams(-2, -1);
                            layoutParams2.weight = 1.0f;
                        }
                    } else if (w1z0Var.g instanceof wbz0) {
                        layoutParams2 = new LinearLayout.LayoutParams(-1, -1);
                    } else {
                        layoutParams2 = new LinearLayout.LayoutParams(-1, -2);
                        layoutParams2.weight = 1.0f;
                    }
                    kcz0Var.setLayoutParams(layoutParams2);
                    linearLayout.addView(w1z0Var.g);
                }
                if (((Activity) w1z0Var.getContext()).isInMultiWindowMode()) {
                    layoutParams = new LinearLayout.LayoutParams(-1, 0);
                    layoutParams.weight = 1.0f;
                } else {
                    layoutParams = w1z0Var.l == 2 ? new LinearLayout.LayoutParams(i6, -1) : new LinearLayout.LayoutParams(-1, i7);
                }
                m0z0Var.setLayoutParams(layoutParams);
            }
        }
        wty0 wty0Var = p0z0Var.L;
        kiw kiwVar4 = wty0Var != null ? wty0Var.a : null;
        String i12 = p0z0Var.i();
        mzy0 mzy0Var = w1z0Var.b;
        mzy0Var.setVisibility((kiwVar4 == null && TextUtils.isEmpty(i12)) ? 8 : 0);
        mzy0Var.getAgeRestrictionsTextView().setText(i12);
        if (kiwVar4 != null) {
            mzy0Var.getAdsIcon().setImageBitmap(kiwVar4.a());
        }
        w1z0Var.setTitleAction(p0z0Var.n());
        w1z0Var.setTitle(p0z0Var.f);
        w1z0Var.setDescription(p0z0Var.c);
        kiw kiwVar5 = p0z0Var.u;
        String str = p0z0Var.o;
        m0z0 m0z0Var2 = w1z0Var.k;
        kcz0 kcz0Var3 = w1z0Var.g;
        if (kcz0Var3 instanceof wbz0) {
            if (TextUtils.isEmpty(str) && kiwVar5 == null) {
                m0z0Var2.getDomainContainer().setVisibility(8);
                return;
            }
            m0z0Var2.getDomainTextView().setVisibility(TextUtils.isEmpty(str) ? 8 : 0);
            m0z0Var2.getDomainTextView().setText(str);
            m0z0Var2.getLogoImageView().setVisibility(kiwVar5 == null ? 8 : 0);
            m0z0Var2.getLogoImageView().setImageData(kiwVar5);
            return;
        }
        if (kcz0Var3 != null) {
            if (kcz0Var3.getDomainTextView() != null) {
                w1z0Var.g.getDomainTextView().setVisibility(TextUtils.isEmpty(str) ? 8 : 0);
                w1z0Var.g.getDomainTextView().setText(str);
            }
            if (w1z0Var.g.getLogoImageView() != null) {
                w1z0Var.g.getLogoImageView().setVisibility(kiwVar5 == null ? 8 : 0);
                w1z0Var.g.getLogoImageView().setImageData(kiwVar5);
            }
        }
    }

    @Override // xsna.jaz0
    public final View getCloseButton() {
        return this.g.getCloseButton();
    }

    @Override // xsna.jaz0
    public final View i() {
        return this.g;
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
