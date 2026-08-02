package xsna;

import com.vk.im.engine.exception.ImEngineIncorrectUsage;
import kotlin.coroutines.jvm.internal.ContinuationImpl;

/* compiled from: ImCmdCoroutinesExecutorStub.kt */
/* loaded from: classes2.dex */
public final class hzv implements ezv {
    @Override // xsna.ezv
    public final Object a(Object obj, e1w e1wVar, ContinuationImpl continuationImpl) {
        throw new ImEngineIncorrectUsage("ImEngine is used in an incorrect place. Make sure you have added ImCmdCoroutinesExecutorComponent inside of the DI graph.");
    }
}
