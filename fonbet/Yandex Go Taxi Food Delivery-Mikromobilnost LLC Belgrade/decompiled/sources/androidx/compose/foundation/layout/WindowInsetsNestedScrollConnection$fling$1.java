package androidx.compose.foundation.layout;

import defpackage.mvg;
import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import ru.CryptoPro.JCSP.tools.common.window.id.IDialogId;

@Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
@mvg(c = "androidx.compose.foundation.layout.WindowInsetsNestedScrollConnection", f = "WindowInsetsConnection.android.kt", l = {IDialogId.DIALOG_PIN_WND_IDD_PASSWORD, 327, 352}, m = "fling-huYlsQE", v = 1)
/* loaded from: classes10.dex */
public final class WindowInsetsNestedScrollConnection$fling$1 extends ContinuationImpl {
    float F$0;
    long J$0;
    Object L$0;
    int label;
    /* synthetic */ Object result;
    final /* synthetic */ WindowInsetsNestedScrollConnection this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public WindowInsetsNestedScrollConnection$fling$1(WindowInsetsNestedScrollConnection windowInsetsNestedScrollConnection, Continuation continuation) {
        super(continuation);
        this.this$0 = windowInsetsNestedScrollConnection;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        Object m31flinghuYlsQE;
        this.result = obj;
        this.label |= Integer.MIN_VALUE;
        m31flinghuYlsQE = this.this$0.m31flinghuYlsQE(0L, 0.0f, false, this);
        return m31flinghuYlsQE;
    }
}
