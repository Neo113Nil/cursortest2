package xsna;

import kotlin.jvm.internal.Lambda;
import xsna.wlp0;

/* compiled from: Crossfade.kt */
/* loaded from: classes11.dex */
public final class kjk extends Lambda implements yzs<wlp0.b<Object>, androidx.compose.runtime.a, Integer, phr<Float>> {
    final /* synthetic */ phr<Float> $animationSpec;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public kjk(phr<Float> phrVar) {
        super(3);
        this.$animationSpec = phrVar;
    }

    @Override // xsna.yzs
    public final phr<Float> invoke(wlp0.b<Object> bVar, androidx.compose.runtime.a aVar, Integer num) {
        androidx.compose.runtime.a aVar2 = aVar;
        int intValue = num.intValue();
        aVar2.K(955869654);
        if (androidx.compose.runtime.b.d()) {
            androidx.compose.runtime.b.f(955869654, intValue, -1, "androidx.compose.animation.Crossfade.<anonymous>.<anonymous>.<anonymous> (Crossfade.kt:126)");
        }
        phr<Float> phrVar = this.$animationSpec;
        if (androidx.compose.runtime.b.d()) {
            androidx.compose.runtime.b.e();
        }
        aVar2.j();
        return phrVar;
    }
}
