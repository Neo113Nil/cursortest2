package yads;

import android.content.Context;
import android.view.View;
import android.widget.CheckBox;
import android.widget.ProgressBar;
import android.widget.TextView;
import xsna.j5g;
import xsna.s3q0;

/* loaded from: classes10.dex */
public final class hl3 extends ll3 {
    public final v9 c;
    public final fl3 d;
    public final x72 e;
    public final el3 f;
    public final j72 g;
    public dl3 h;

    public hl3(ov2 ov2Var, g82 g82Var, ej3 ej3Var, d4 d4Var, v9 v9Var, a61 a61Var, f72 f72Var, i42 i42Var, g02 g02Var, nj2 nj2Var, qz2 qz2Var, fl3 fl3Var) {
        super(g82Var);
        this.c = v9Var;
        this.d = fl3Var;
        this.e = new x72(g82Var.getContext(), this, ej3Var, d4Var, ov2Var, v9Var, a61Var, f72Var, i42Var, nj2Var, qz2Var);
        this.f = new el3(((mv3) ov2Var).f());
        this.g = g02Var.a();
        a61Var.a(fl3Var);
    }

    @Override // yads.ll3
    public final void a(View view) {
        g82 g82Var = (g82) view;
        x72 x72Var = this.e;
        u72 u72Var = x72Var.e;
        if (u72Var != null) {
            bf2 bf2Var = u72Var.l;
            if (bf2Var != null) {
                bf2Var.b.stop();
                o62 o62Var = g82Var.c;
                i82 i82Var = bf2Var.c;
                hm1 hm1Var = o62Var.b;
                i82Var.getClass();
                if (hm1Var != null) {
                    CheckBox muteControl = hm1Var.getMuteControl();
                    if (muteControl != null) {
                        muteControl.setOnClickListener(null);
                        muteControl.setVisibility(8);
                    }
                    ProgressBar videoProgress = hm1Var.getVideoProgress();
                    if (videoProgress != null) {
                        videoProgress.setProgress(0);
                        videoProgress.setVisibility(8);
                    }
                    TextView countDownProgress = hm1Var.getCountDownProgress();
                    if (countDownProgress != null) {
                        countDownProgress.setText("");
                        countDownProgress.setVisibility(8);
                    }
                }
            }
            u72Var.f.b(g82Var);
        }
        h42 h42Var = x72Var.f;
        if (h42Var != null) {
            x72Var.a.a.remove(h42Var);
            x72Var.f = null;
        }
        g82Var.setOnAttachStateChangeListener(null);
        g82Var.setVisibility(8);
        g82Var.setOnClickListener(null);
        g82Var.setOnTouchListener(null);
        g82Var.setSelected(false);
    }

    @Override // yads.ll3
    public final void b(View view, Object obj) {
        g82 g82Var = (g82) view;
        we3 we3Var = (we3) obj;
        nf3 nf3Var = (nf3) j5g.Y(we3Var.a);
        dl3 a = this.f.a(g82Var.getContext(), nf3Var, qg3.e);
        this.h = a;
        this.d.a = a;
        j72 j72Var = this.g;
        Context context = g82Var.getContext();
        v9 v9Var = this.c;
        j72Var.getClass();
        String str = nf3Var.g;
        boolean a2 = qr0.a(context, pr0.c);
        r72[] r72VarArr = r72.b;
        if ("first_video_preloading_strategy".equals(v9Var.v) && a2) {
            iv0 iv0Var = j72Var.c;
            synchronized (iv0Var.d) {
                try {
                    b72 b72Var = iv0Var.b;
                    nj0 nj0Var = (nj0) b72Var.b.getValue();
                    if (nj0Var != null) {
                        nj0Var.c++;
                        nj0Var.a.obtainMessage(7, str).sendToTarget();
                    }
                    b72Var.c.remove(str);
                    s3q0 s3q0Var = s3q0.a;
                } catch (Throwable th) {
                    throw th;
                }
            }
        } else {
            j72Var.b.a(str);
        }
        this.e.a(g82Var, we3Var, a);
    }

    @Override // yads.ll3
    public final void a(oi oiVar, ol3 ol3Var, Object obj) {
        g82 g82Var;
        we3 we3Var = (we3) obj;
        g82 g82Var2 = (g82) b();
        if (g82Var2 != null) {
            ol3Var.a(g82Var2, oiVar);
            if (we3Var == null || this.h == null) {
                return;
            }
            nf3 nf3Var = (nf3) j5g.Y(we3Var.a);
            ol3Var.a(oiVar, new fi3(g82Var2, nf3Var.a));
            x72 x72Var = this.e;
            x72Var.c.getClass();
            int i = ((p72) nf3Var.d).c;
            g82Var2.setAspectRatio(i != 0 ? r5.b / i : 1.7777778f);
            u72 u72Var = x72Var.e;
            if (u72Var == null || (g82Var = (g82) u72Var.a.b()) == null) {
                return;
            }
            g82Var.setClickable(false);
        }
    }

    @Override // yads.ll3
    public final void a() {
        dl3 dl3Var = this.h;
        if (dl3Var != null) {
            dl3Var.k();
        }
        this.d.a = null;
    }

    @Override // yads.ll3
    public final /* bridge */ /* synthetic */ boolean a(View view, Object obj) {
        return true;
    }
}
