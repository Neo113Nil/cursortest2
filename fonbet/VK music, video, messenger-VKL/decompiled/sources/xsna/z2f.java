package xsna;

import android.content.Context;
import com.vk.clips.viewer.api.routing.ClipsRouter;
import com.vk.dto.shortvideo.ClipGridParams;

/* compiled from: ClipsSdkGridRouterImpl.kt */
/* loaded from: classes17.dex */
public final class z2f implements y2f {
    public final pkd a;

    public z2f(pkd pkdVar) {
        this.a = pkdVar;
    }

    @Override // xsna.y2f
    public final void a(Context context, String str) {
        ClipsRouter.j(this.a.a(), context, new ClipGridParams.OnlyId.Hashtag(str), false, null, null, 60);
    }
}
