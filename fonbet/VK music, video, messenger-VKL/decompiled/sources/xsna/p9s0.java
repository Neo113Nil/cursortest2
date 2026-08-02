package xsna;

import android.os.Bundle;
import com.vk.catalog.mvi.block.BlockId;
import com.vk.catalog2.common.ui.mvp.holder.video.VideoCatalogRootVh;
import com.vk.voip.ui.change_name.VoipChangeNameConfig;
import java.util.Iterator;
import ru.ok.android.externcalls.sdk.watch_together.listener.states.MovieStates;
import xsna.wqs0;

/* compiled from: R8$$SyntheticClass */
/* loaded from: classes16.dex */
public final /* synthetic */ class p9s0 implements gzs {
    public final /* synthetic */ int b;
    public final /* synthetic */ Object c;
    public final /* synthetic */ Object d;

    public /* synthetic */ p9s0(int i, Object obj, Object obj2) {
        this.b = i;
        this.c = obj;
        this.d = obj2;
    }

    @Override // xsna.gzs
    public final Object invoke() {
        int i = this.b;
        Object obj = this.d;
        Object obj2 = this.c;
        switch (i) {
            case 0:
                Bundle bundle = (Bundle) obj;
                int i2 = VideoCatalogRootVh.M0;
                ((VideoCatalogRootVh) obj2).m.b.getClass();
                return Boolean.valueOf(bundle != null ? bundle.getBoolean("can_add_video", true) : true);
            case 1:
                ((izs) obj2).invoke(new wqs0.q((BlockId.CompositeId) obj));
                return s3q0.a;
            case 2:
                ylw0 ylw0Var = (ylw0) obj;
                int i3 = ylw0.x1;
                return ((VoipChangeNameConfig) obj2).i instanceof VoipChangeNameConfig.OpenedFrom.ActiveCall ? ((rew0) ylw0Var.w1.getValue()).f() : o25.a().c();
            default:
                MovieStates movieStates = (MovieStates) obj;
                Iterator<ncx0> it = ((pcx0) obj2).b.iterator();
                while (it.hasNext()) {
                    it.next().onVideoStatesChanged(movieStates);
                }
                return s3q0.a;
        }
    }
}
