package xsna;

import android.content.Context;
import android.os.Build;
import android.view.ViewGroup;
import android.view.ViewParent;
import androidx.appcompat.widget.AppCompatImageView;
import com.vkontakte.android.R;
import xsna.p2x0;

/* compiled from: VoipCallViewScreencastPreviewLayerDelegate.kt */
/* loaded from: classes7.dex */
public final class jkw0 {
    public final l7s a;
    public final ViewGroup b;
    public sqk0 c;
    public io.reactivex.rxjava3.disposables.c d;
    public io.reactivex.rxjava3.disposables.c e;
    public io.reactivex.rxjava3.disposables.c f;
    public rdh0 g;

    public jkw0(l7s l7sVar, ViewGroup viewGroup) {
        this.a = l7sVar;
        this.b = viewGroup;
        bwt0.p0(viewGroup, false);
    }

    public final void a(boolean z) {
        ViewGroup viewGroup;
        ViewGroup viewGroup2;
        ViewGroup viewGroup3 = this.b;
        ViewParent parent = viewGroup3.getParent();
        ViewGroup viewGroup4 = parent instanceof ViewGroup ? (ViewGroup) parent : null;
        if (viewGroup4 == null) {
            viewGroup4 = viewGroup3;
        }
        mk5 mk5Var = new mk5();
        mk5Var.g(0);
        zmp0.a(viewGroup4, mk5Var);
        if (!z) {
            sqk0 sqk0Var = this.c;
            if (sqk0Var != null) {
                rdh0 rdh0Var = this.g;
                int width = (rdh0Var == null || (viewGroup2 = rdh0Var.a) == null) ? 0 : viewGroup2.getWidth();
                rdh0 rdh0Var2 = this.g;
                sqk0Var.a(0, 0, width, (rdh0Var2 == null || (viewGroup = rdh0Var2.a) == null) ? 0 : viewGroup.getHeight());
            }
            this.g = null;
            io.reactivex.rxjava3.disposables.c cVar = this.f;
            if (cVar != null) {
                cVar.dispose();
            }
            this.f = null;
            io.reactivex.rxjava3.disposables.c cVar2 = this.e;
            if (cVar2 != null) {
                cVar2.dispose();
            }
            this.e = null;
            bwt0.p0(viewGroup3, false);
            viewGroup3.removeAllViews();
            return;
        }
        rdh0 rdh0Var3 = new rdh0(this.a);
        this.g = rdh0Var3;
        rdh0Var3.c = new xbj0(10);
        rdh0Var3.d = new sgt0(this, 8);
        bwt0.p0(viewGroup3, true);
        ViewGroup viewGroup5 = rdh0Var3.a;
        viewGroup3.addView(viewGroup5);
        io.reactivex.rxjava3.disposables.c cVar3 = this.f;
        if (cVar3 != null) {
            cVar3.dispose();
        }
        com.vk.voip.ui.c.b.getClass();
        this.f = io.reactivex.rxjava3.kotlin.c.e(com.vk.voip.ui.c.X().m(asu0.a.d()), new svk0(rdh0Var3, 22), new ptl0(rdh0Var3, 21));
        io.reactivex.rxjava3.disposables.c cVar4 = this.e;
        if (cVar4 != null) {
            cVar4.dispose();
        }
        rah0 rah0Var = com.vk.voip.ui.c.g;
        if (rah0Var == null) {
            rah0Var = null;
        }
        io.reactivex.rxjava3.subjects.d<Boolean> dVar = rah0Var.f;
        dVar.getClass();
        this.e = io.reactivex.rxjava3.kotlin.c.f(3, new io.reactivex.rxjava3.internal.operators.observable.y(new io.reactivex.rxjava3.internal.operators.observable.z0(dVar), io.reactivex.rxjava3.internal.functions.a.a, io.reactivex.rxjava3.internal.functions.b.a), null, null, new ubt0(rdh0Var3, 6));
        rah0 rah0Var2 = com.vk.voip.ui.c.g;
        (rah0Var2 != null ? rah0Var2 : null).getClass();
        boolean z2 = Build.VERSION.SDK_INT >= 29;
        AppCompatImageView appCompatImageView = rdh0Var3.e;
        if (z2) {
            Context context = appCompatImageView.getContext();
            p2x0 p2x0Var = new p2x0(new r2x0(Long.MAX_VALUE));
            new s2x0(context, p2x0Var, R.color.vk_white, R.color.vk_tip_background, 5000L, appCompatImageView);
            p2x0Var.c.onNext(new p2x0.b.C3489b("audio-share-button", context.getString(R.string.voip_audio_share_tooltip)));
        }
        appCompatImageView.setVisibility(z2 ? 0 : 8);
        r0u0.a(viewGroup5, new a0t() { // from class: xsna.ikw0
            @Override // xsna.a0t
            public final Object invoke(Object obj, Object obj2, Object obj3, Object obj4, Object obj5) {
                int intValue = ((Integer) obj2).intValue();
                int intValue2 = ((Integer) obj3).intValue();
                int intValue3 = ((Integer) obj4).intValue();
                int intValue4 = ((Integer) obj5).intValue();
                sqk0 sqk0Var2 = jkw0.this.c;
                if (sqk0Var2 != null) {
                    sqk0Var2.a(intValue, intValue2, intValue3, intValue4);
                }
                return s3q0.a;
            }
        });
    }

    public final void b(boolean z) {
        if (!z) {
            io.reactivex.rxjava3.disposables.c cVar = this.d;
            if (cVar != null) {
                cVar.dispose();
            }
            this.d = null;
            a(false);
            return;
        }
        io.reactivex.rxjava3.disposables.c cVar2 = this.d;
        if (cVar2 != null) {
            cVar2.dispose();
        }
        com.vk.voip.ui.c.b.getClass();
        rah0 rah0Var = com.vk.voip.ui.c.g;
        this.d = hg1.h((rah0Var != null ? rah0Var : null).c().a0(asu0.a.d()), new skj0(this, 24));
    }
}
