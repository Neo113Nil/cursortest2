package xsna;

import com.vk.video.growth.api.TrapContentParams;
import com.vk.video.growth.impl.ui.entity.TrapState;
import com.vk.video.growth.impl.ui.entity.TrapViewState;
import com.vkontakte.android.R;
import java.util.List;
import java.util.Map;

/* compiled from: LazyGridDsl.kt */
/* loaded from: classes18.dex */
public final class fd10 implements izs {
    public final /* synthetic */ int b = 0;
    public final Object c;

    public fd10(cd10 cd10Var, List list) {
        this.c = list;
    }

    @Override // xsna.izs
    public final Object invoke(Object obj) {
        switch (this.b) {
            case 0:
                return ((Map.Entry) ((List) this.c).get(((Number) obj).intValue())).getKey();
            default:
                TrapState trapState = (TrapState) obj;
                lqm0 lqm0Var = (lqm0) this.c;
                TrapContentParams trapContentParams = trapState.b;
                return new TrapViewState(lqm0Var.a(trapContentParams.b), lqm0Var.a(trapContentParams.c), trapContentParams.d, lqm0Var.a(dy2.i("com.vk.vkvideo") ? R.string.watch_in_vk_video_btn : R.string.download_vk_video_btn), !dy2.i("com.vk.vkvideo") ? qdq.a(trapState.c.b) : null);
        }
    }

    public fd10(lqm0 lqm0Var) {
        this.c = lqm0Var;
    }
}
