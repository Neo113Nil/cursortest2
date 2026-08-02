package xsna;

import com.vk.api.sdk.exceptions.VKApiExecutionException;
import com.vk.music.player.error.VkPlayerException;
import com.vkontakte.android.R;
import java.util.Iterator;
import java.util.List;
import xsna.zxd0;

/* compiled from: R8$$SyntheticClass */
/* loaded from: classes15.dex */
public final /* synthetic */ class f66 implements izs {
    public final /* synthetic */ int b;
    public final /* synthetic */ boolean c;
    public final /* synthetic */ Object d;

    public /* synthetic */ f66(Object obj, boolean z, int i) {
        this.b = i;
        this.d = obj;
        this.c = z;
    }

    @Override // xsna.izs
    public final Object invoke(Object obj) {
        switch (this.b) {
            case 0:
                p66 p66Var = (p66) this.d;
                p66Var.s0(p66Var.u + 1);
                if (this.c) {
                    p66Var.t0(p66Var.v + 1);
                }
                break;
            case 1:
                List list = (List) obj;
                ((com.vk.im.ui.components.chat_profile.a) this.d).t(this.c ? new zxd0.f(list) : new zxd0.g(list));
                break;
            default:
                w2b0 w2b0Var = (w2b0) this.d;
                Throwable th = (Throwable) obj;
                boolean z = (th instanceof VKApiExecutionException) && ((VKApiExecutionException) th).s() == -1;
                boolean z2 = this.c;
                if (z) {
                    w2b0Var.D(R.string.music_player_snack_bar_internet_connection_problems, z2);
                } else {
                    w2b0Var.D(R.string.music_player_snack_bar_common_error, z2);
                }
                VkPlayerException.NetworkError networkError = new VkPlayerException.NetworkError(th, z);
                Iterator it = w2b0Var.d.iterator();
                while (it.hasNext()) {
                    ((com.vk.music.player.e) it.next()).t3(networkError);
                }
                break;
        }
        return s3q0.a;
    }
}
