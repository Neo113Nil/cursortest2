package xsna;

import com.vk.clips.sdk.shared.item.clips_grid_block.presentation.ClipsGridBlockAction;
import java.util.Collection;
import kotlin.jvm.internal.AdaptedFunctionReference;

/* compiled from: ClipsGridBlockMviView.kt */
/* loaded from: classes17.dex */
public final /* synthetic */ class nbe extends AdaptedFunctionReference implements izs {
    public final /* synthetic */ int b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ nbe(int i, Object obj, Class cls, String str, String str2, int i2, int i3) {
        super(i, obj, cls, str, str2, i2);
        this.b = i3;
    }

    @Override // xsna.izs
    public final Object invoke(Object obj) {
        switch (this.b) {
            case 0:
                ((com.vk.clips.sdk.shared.item.clips_grid_block.presentation.a) this.receiver).C((ClipsGridBlockAction) obj);
                break;
            default:
                ((hpm) this.receiver).c0(-1, (Collection) obj);
                break;
        }
        return s3q0.a;
    }
}
