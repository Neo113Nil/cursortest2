package xsna;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import com.vk.voip.ui.ns.NoiseSuppressorFeature$State;
import com.vkontakte.android.R;

/* compiled from: NoiseSuppressorModeSelectorView.kt */
/* loaded from: classes7.dex */
public final class p570 {
    public final View a;
    public final View b;
    public final View c;
    public final View d;
    public final View e;
    public final View f;
    public final View g;
    public final View h;

    public p570(LayoutInflater layoutInflater, ViewGroup viewGroup, bfm bfmVar) {
        View inflate = layoutInflater.inflate(R.layout.voip_call_noise_suppressor_mode, viewGroup, false);
        this.a = inflate;
        View findViewById = inflate.findViewById(R.id.noise_suppressor_none);
        this.b = findViewById;
        View findViewById2 = inflate.findViewById(R.id.noise_suppressor_platform);
        this.c = findViewById2;
        View findViewById3 = inflate.findViewById(R.id.noise_suppressor_auto);
        this.d = findViewById3;
        View findViewById4 = inflate.findViewById(R.id.back);
        this.e = findViewById4;
        this.f = inflate.findViewById(R.id.noise_suppressor_none_icon);
        this.g = inflate.findViewById(R.id.noise_suppressor_platform_icon);
        this.h = inflate.findViewById(R.id.noise_suppressor_auto_icon);
        a();
        bwt0.i0(findViewById4, new k170(bfmVar, 1));
        mmb mmbVar = new mmb(4, this, bfmVar);
        bwt0.h0(mmbVar, findViewById);
        bwt0.h0(mmbVar, findViewById2);
        bwt0.h0(mmbVar, findViewById3);
    }

    public final void a() {
        com.vk.voip.ui.c.b.getClass();
        NoiseSuppressorFeature$State c = ((k570) com.vk.voip.ui.c.x0.getValue()).c();
        bwt0.p0(this.f, c == NoiseSuppressorFeature$State.NONE);
        bwt0.p0(this.g, c == NoiseSuppressorFeature$State.PLATFORM);
        bwt0.p0(this.h, c == NoiseSuppressorFeature$State.AUTO);
    }
}
