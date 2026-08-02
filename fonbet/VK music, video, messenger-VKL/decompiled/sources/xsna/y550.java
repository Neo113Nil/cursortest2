package xsna;

import android.content.ComponentCallbacks2;
import android.content.DialogInterface;
import android.os.Bundle;
import androidx.fragment.app.FragmentActivity;
import com.ironsource.X3;
import com.vk.music.player.PlaySourceMeta;
import com.vk.music.player.PlaybackActionMeta;
import com.vk.music.player.playback.PlayableType;
import com.vk.music.player.playback.PlaybackLaunchMeta;
import com.vk.newsfeed.impl.writebar.overlay.WriteBarOverlayFragment;
import com.vk.writebar.WriteBar;

/* compiled from: R8$$SyntheticClass */
/* loaded from: classes3.dex */
public final /* synthetic */ class y550 implements DialogInterface.OnShowListener {
    public final /* synthetic */ int b;
    public final /* synthetic */ Object c;

    public /* synthetic */ y550(Object obj, int i) {
        this.b = i;
        this.c = obj;
    }

    @Override // android.content.DialogInterface.OnShowListener
    public final void onShow(DialogInterface dialogInterface) {
        ww50<?> Y;
        switch (this.b) {
            case 0:
                z550 z550Var = (z550) this.c;
                ComponentCallbacks2 componentCallbacks2 = z550Var.h;
                Bundle bundle = null;
                ey50 ey50Var = componentCallbacks2 instanceof ey50 ? (ey50) componentCallbacks2 : null;
                if (ey50Var != null && (Y = ey50Var.Y()) != null) {
                    Y.S(z550Var);
                }
                z550Var.n().c();
                z550Var.o().k(new bck0(new kx40(null, z550Var.i, null, new PlaybackLaunchMeta(z550Var.j, z550Var.k, PlayableType.SNIPPET, PlaySourceMeta.Default.b, null, 16, null), new PlaybackActionMeta(-2, 0L, 2, null), true, z550Var.i.a0, 389), bundle, 6));
                break;
            default:
                WriteBarOverlayFragment writeBarOverlayFragment = (WriteBarOverlayFragment) this.c;
                final u3g0 u3g0Var = writeBarOverlayFragment.T;
                if (u3g0Var != null) {
                    Bundle arguments = writeBarOverlayFragment.getArguments();
                    final int i = arguments != null ? arguments.getInt(X3.i.L, -1) : -1;
                    if (i != -1) {
                        gzs gzsVar = new gzs() { // from class: xsna.j1y0
                            @Override // xsna.gzs
                            public final Object invoke() {
                                int i2 = WriteBarOverlayFragment.a0;
                                ysg0.b.a(new o1y0(i, u3g0Var.h()));
                                return s3q0.a;
                            }
                        };
                        WriteBar writeBar = u3g0Var.e;
                        if (writeBar != null) {
                            awt0.t(writeBar, gzsVar);
                        }
                    }
                }
                u3g0 u3g0Var2 = writeBarOverlayFragment.T;
                if (u3g0Var2 != null) {
                    c3g0.gg(u3g0Var2, null, 3);
                }
                FragmentActivity activity = writeBarOverlayFragment.getActivity();
                writeBarOverlayFragment.ho((activity == null || !iah0.s(activity)) ? 0L : 160L, new kt4(writeBarOverlayFragment, 5));
                break;
        }
    }
}
