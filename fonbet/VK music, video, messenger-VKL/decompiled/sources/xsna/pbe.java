package xsna;

import com.vk.clips.sdk.shared.item.clips_grid_block.presentation.ClipsGridBlockAction;
import kotlin.jvm.internal.AdaptedFunctionReference;

/* compiled from: ClipsGridBlockMviView.kt */
/* loaded from: classes17.dex */
public final /* synthetic */ class pbe extends AdaptedFunctionReference implements izs {
    public final /* synthetic */ int b = 0;

    public /* synthetic */ pbe(int i, Object obj, Class cls, String str, String str2, int i2) {
        super(i, obj, cls, str, str2, i2);
    }

    @Override // xsna.izs
    public final Object invoke(Object obj) {
        switch (this.b) {
            case 0:
                ((com.vk.clips.sdk.shared.item.clips_grid_block.presentation.a) this.receiver).C((ClipsGridBlockAction) obj);
                break;
            default:
                ((gnu) this.receiver).C((vmu) obj);
                break;
        }
        return s3q0.a;
    }

    public pbe(vk50 vk50Var) {
        super(1, vk50Var, gnu.class, "sendAction", "sendAction([Lcom/vk/mvi/core/data/MviAction;)V", 0);
    }
}
