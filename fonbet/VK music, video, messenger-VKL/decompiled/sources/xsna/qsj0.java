package xsna;

import android.content.Context;
import com.vk.dto.stories.entities.StoryCameraMode;
import com.vk.rlottie.RLottieDrawable;
import com.vk.superapp.api.dto.story.WebStickerType;
import java.util.EnumSet;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;
import xsna.fov;

/* compiled from: SimpleStickersBridgeImpl.kt */
/* loaded from: classes18.dex */
public final class qsj0 implements psj0 {
    public final s5m0 a;

    public qsj0(s5m0 s5m0Var) {
        this.a = s5m0Var;
    }

    @Override // xsna.psj0
    public final int a(WebStickerType webStickerType) {
        return o0m0.d(webStickerType);
    }

    @Override // xsna.psj0
    public final boolean b() {
        o0m0 o0m0Var = o0m0.b;
        bpn0 bpn0Var = yse0.a;
        return RLottieDrawable.s;
    }

    @Override // xsna.psj0
    public final int c() {
        o0m0 o0m0Var = o0m0.b;
        int J = o25.a().J();
        if (J <= 0) {
            return 5000;
        }
        return J;
    }

    @Override // xsna.psj0
    public final boolean d(WebStickerType webStickerType) {
        return o0m0.e(webStickerType);
    }

    @Override // xsna.psj0
    public final s5m0 e() {
        return this.a;
    }

    @Override // xsna.psj0
    public final int f() {
        o0m0 o0m0Var = o0m0.b;
        return 1;
    }

    @Override // xsna.psj0
    public final Set<WebStickerType> g(Set<? extends WebStickerType> set, k9l0 k9l0Var) {
        o0m0 o0m0Var = o0m0.b;
        EnumSet noneOf = EnumSet.noneOf(WebStickerType.class);
        Iterator<? extends WebStickerType> it = set.iterator();
        while (it.hasNext()) {
            WebStickerType next = it.next();
            int intValue = ((Number) ((izs) ((Map) o0m0.g.getValue()).getOrDefault(next, new d7l0(2))).invoke(k9l0Var)).intValue();
            if (o0m0.e(next)) {
                if ((next == WebStickerType.LINK ? 1 : o0m0.d(next)) > intValue) {
                    noneOf.add(next);
                }
            }
        }
        return noneOf;
    }

    @Override // xsna.psj0
    public final boolean h(StoryCameraMode storyCameraMode) {
        o0m0 o0m0Var = o0m0.b;
        return storyCameraMode == StoryCameraMode.STORY || storyCameraMode == StoryCameraMode.STORY_VIDEO || storyCameraMode == StoryCameraMode.PING_PONG || storyCameraMode == StoryCameraMode.CLIPS;
    }

    @Override // xsna.psj0
    public final fov i(Context context, boolean z, fov.a aVar) {
        return new ffi0(context, z, aVar);
    }
}
