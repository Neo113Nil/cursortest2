package xsna;

import com.vk.im.engine.exception.ImEngineIncorrectUsage;

/* compiled from: ImCmdRxExecutorStub.kt */
/* loaded from: classes2.dex */
public final class nzv implements lzv {
    @Override // xsna.lzv
    public final io.reactivex.rxjava3.disposables.c a(Object obj, le6 le6Var, io.reactivex.rxjava3.functions.f fVar, io.reactivex.rxjava3.functions.f fVar2) {
        throw new ImEngineIncorrectUsage("ImEngine is used in an incorrect place. Make sure you have added ImCmdRxExecutorComponent inside of the DI graph.");
    }

    @Override // xsna.lzv
    public final <V> io.reactivex.rxjava3.core.x<V> b(Object obj, e1w<V> e1wVar) {
        return io.reactivex.rxjava3.core.x.i(new ImEngineIncorrectUsage("ImEngine is used in an incorrect place. Make sure you have added ImCmdRxExecutorComponent inside of the DI graph."));
    }
}
