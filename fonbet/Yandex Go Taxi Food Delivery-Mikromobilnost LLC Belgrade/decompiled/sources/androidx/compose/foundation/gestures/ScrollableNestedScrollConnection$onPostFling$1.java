package androidx.compose.foundation.gestures;

import defpackage.mvg;
import kotlin.Metadata;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import ru.cprocsp.NGate.tools.Constants;

@Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
@mvg(c = "androidx.compose.foundation.gestures.ScrollableNestedScrollConnection", f = "Scrollable.kt", l = {Constants.RESULT_CHECK_ERROR_KEY_NOT_FOUND}, m = "onPostFling-RZ2iAVY", v = 1)
/* loaded from: classes10.dex */
final class ScrollableNestedScrollConnection$onPostFling$1 extends ContinuationImpl {
    long J$0;
    int label;
    /* synthetic */ Object result;
    final /* synthetic */ v this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ScrollableNestedScrollConnection$onPostFling$1(v vVar, ContinuationImpl continuationImpl) {
        super(continuationImpl);
        this.this$0 = vVar;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        this.result = obj;
        this.label |= Integer.MIN_VALUE;
        return this.this$0.mo28onPostFlingRZ2iAVY(0L, 0L, this);
    }
}
