package xsna;

import com.vk.catalog2.common.ui.mvp.holder.video.assistant.a;
import com.vk.ecomm.design.compose.product_info.f;
import com.vk.ecomm.onlinebooking.impl.calendar.a;
import com.vk.music.playlist.display.domain.a;
import com.vk.music.stickyplayer.domain.PlayerContext;
import xsna.ofk;
import xsna.rv9;
import xsna.sx40;
import xsna.w2p0;

/* compiled from: R8$$SyntheticClass */
/* loaded from: classes16.dex */
public final /* synthetic */ class cc1 implements gzs {
    public final /* synthetic */ int b;
    public final /* synthetic */ izs c;

    public /* synthetic */ cc1(izs izsVar, int i) {
        this.b = i;
        this.c = izsVar;
    }

    @Override // xsna.gzs
    public final Object invoke() {
        switch (this.b) {
            case 0:
                this.c.invoke(a.c.a);
                break;
            case 1:
                this.c.invoke(a.C0953a.b);
                break;
            case 2:
                this.c.invoke(rv9.k.b);
                break;
            case 3:
                this.c.invoke(w2p0.c.b);
                break;
            case 4:
                this.c.invoke(ofk.e.b);
                break;
            case 5:
                this.c.invoke(f.d.a);
                break;
            case 6:
                this.c.invoke(a.b.d.b);
                break;
            case 7:
                this.c.invoke(new sx40.m0(false, PlayerContext.MINI_STANDALONE));
                break;
            case 8:
                this.c.invoke(new fiq0(true));
                break;
            default:
                this.c.invoke(sx40.d.b);
                break;
        }
        return s3q0.a;
    }
}
