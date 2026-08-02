package xsna;

import com.vk.rlottie.RLottieDrawable;
import kotlin.Pair;

/* compiled from: R8$$SyntheticClass */
/* loaded from: classes4.dex */
public final /* synthetic */ class e880 implements izs {
    public final /* synthetic */ int b;

    public /* synthetic */ e880(int i) {
        this.b = i;
    }

    @Override // xsna.izs
    public final Object invoke(Object obj) {
        String str = (String) obj;
        int i = this.b;
        return new Pair(str, new RLottieDrawable(str, "animated_reaction_like_on_photo", i, i, null, false, false, null, 496));
    }
}
