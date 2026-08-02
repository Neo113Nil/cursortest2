package xsna;

import android.graphics.drawable.Drawable;
import com.unity3d.services.UnityAdsConstants;
import com.vk.core.compose.component.semantics.SemanticsConfiguration;
import xsna.q630;

/* compiled from: TopImageImpl.kt */
/* loaded from: classes17.dex */
public final class u8p0 implements bsa0 {
    public final wh50 a;
    public final wh50 b;
    public final wh50 c;
    public final wh50 d;
    public final wh50 e;
    public final wh50 f;
    public final wh50 g;

    public u8p0(lg90 lg90Var, long j, Drawable drawable, d6g d6gVar, String str, wkj wkjVar, SemanticsConfiguration semanticsConfiguration) {
        this.a = androidx.compose.runtime.k.b(lg90Var);
        this.b = androidx.compose.runtime.k.b(new uco(j));
        this.c = androidx.compose.runtime.k.b(drawable);
        this.d = androidx.compose.runtime.k.b(d6gVar);
        this.e = androidx.compose.runtime.k.b(str);
        this.f = androidx.compose.runtime.k.b(wkjVar);
        this.g = androidx.compose.runtime.k.b(semanticsConfiguration);
    }

    @Override // xsna.bsa0
    public final void a(int i, androidx.compose.runtime.a aVar) {
        aVar.K(-394733279);
        if (androidx.compose.runtime.b.d()) {
            androidx.compose.runtime.b.f(-394733279, i, -1, "com.vk.core.compose.component.placeholder.TopImageImpl.Content (TopImageImpl.kt:41)");
        }
        SemanticsConfiguration semanticsConfiguration = (SemanticsConfiguration) ((zak0) this.g).getValue();
        q630.a aVar2 = q630.a.a;
        q630 b = com.vk.core.compose.component.semantics.b.b(aVar2, semanticsConfiguration);
        wh50 wh50Var = this.b;
        if (!uco.a(((uco) ((zak0) wh50Var).getValue()).a, 9205357640488583168L)) {
            b = b.g(txj0.r(((uco) ((zak0) wh50Var).getValue()).a, aVar2));
        }
        wh50 wh50Var2 = this.c;
        if (((Drawable) ((zak0) wh50Var2).getValue()) != null) {
            b = b.g(ng90.a(aVar2, new yjo((Drawable) ((zak0) wh50Var2).getValue()), null, null, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, null, 62));
        }
        lg90 lg90Var = (lg90) ((zak0) this.a).getValue();
        d6g d6gVar = (d6g) ((zak0) this.d).getValue();
        vjw.a(lg90Var, (String) ((zak0) this.e).getValue(), b, null, (wkj) ((zak0) this.f).getValue(), UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, d6gVar, aVar, 8, 40);
        if (androidx.compose.runtime.b.d()) {
            androidx.compose.runtime.b.e();
        }
        aVar.j();
    }
}
