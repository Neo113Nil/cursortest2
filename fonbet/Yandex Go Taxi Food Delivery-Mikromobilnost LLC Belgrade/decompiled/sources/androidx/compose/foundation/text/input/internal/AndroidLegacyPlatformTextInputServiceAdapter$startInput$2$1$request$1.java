package androidx.compose.foundation.text.input.internal;

import defpackage.cvw;
import defpackage.g9y;
import defpackage.n810;
import defpackage.rzx;
import defpackage.tls;
import defpackage.v9y;
import defpackage.zy11;
import kotlin.Metadata;
import kotlin.jvm.internal.FunctionReferenceImpl;

@Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes10.dex */
final /* synthetic */ class AndroidLegacyPlatformTextInputServiceAdapter$startInput$2$1$request$1 extends FunctionReferenceImpl implements tls {
    final /* synthetic */ v9y $node;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AndroidLegacyPlatformTextInputServiceAdapter$startInput$2$1$request$1(v9y v9yVar) {
        super(1, 0, cvw.class, "localToScreen", "startInput$localToScreen(Landroidx/compose/foundation/text/input/internal/LegacyPlatformTextInputServiceAdapter$LegacyPlatformTextInputNode;[F)V");
        this.$node = v9yVar;
    }

    @Override // defpackage.tls
    public final Object invoke(Object obj) {
        float[] fArr = ((n810) obj).a;
        rzx rzxVar = (rzx) ((g9y) this.$node).w.getValue();
        if (rzxVar != null) {
            if (!rzxVar.d()) {
                rzxVar = null;
            }
            if (rzxVar != null) {
                rzxVar.b0(fArr);
            }
        }
        return zy11.a;
    }
}
