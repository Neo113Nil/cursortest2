package xsna;

import com.vk.clips.sdk.shared.item.clips_grid_block.presentation.ClipsGridBlockAction;
import com.vk.profile.community.impl.ui.profile.actions.CommunityProfileAction;
import java.util.Collection;
import kotlin.jvm.internal.AdaptedFunctionReference;

/* compiled from: ClipsGridBlockMviView.kt */
/* loaded from: classes17.dex */
public final /* synthetic */ class mbe extends AdaptedFunctionReference implements izs {
    public final /* synthetic */ int b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ mbe(int i, Object obj, Class cls, String str, String str2, int i2, int i3) {
        super(i, obj, cls, str, str2, i2);
        this.b = i3;
    }

    @Override // xsna.izs
    public final Object invoke(Object obj) {
        switch (this.b) {
            case 0:
                ((com.vk.clips.sdk.shared.item.clips_grid_block.presentation.a) this.receiver).C((ClipsGridBlockAction) obj);
                return s3q0.a;
            case 1:
                ((com.vk.profile.community.impl.ui.profile.a) this.receiver).C((CommunityProfileAction) obj);
                return s3q0.a;
            default:
                return ((hpm) this.receiver).M(-1, (Collection) obj);
        }
    }
}
