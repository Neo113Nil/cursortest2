package xsna;

import com.vk.im.engine.exception.ImEngineIncorrectUsage;

/* compiled from: ImCmdDirectExecutorStub.kt */
/* loaded from: classes2.dex */
public final class kzv implements izv {
    @Override // xsna.izv
    public final pdg0 a(Object obj, le6 le6Var) {
        throw new ImEngineIncorrectUsage("ImEngine is used in an incorrect place. Make sure you have added ImCmdDirectExecutorComponent inside of the DI graph.");
    }

    @Override // xsna.izv
    public final mjx0 b(Object obj, le6 le6Var) {
        throw new ImEngineIncorrectUsage("ImEngine is used in an incorrect place. Make sure you have added ImCmdDirectExecutorComponent inside of the DI graph.");
    }
}
