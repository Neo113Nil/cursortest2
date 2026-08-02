package ru.ok.android.externcalls.sdk.watch_together;

import io.reactivex.rxjava3.core.b;
import kotlin.jvm.internal.AdaptedFunctionReference;
import xsna.izs;
import xsna.s3q0;

/* compiled from: WatchTogetherPlayerAdapter.kt */
/* loaded from: classes9.dex */
public final /* synthetic */ class WatchTogetherPlayerAdapterKt$resumeCompletable$1$2 extends AdaptedFunctionReference implements izs<Throwable, s3q0> {
    public WatchTogetherPlayerAdapterKt$resumeCompletable$1$2(Object obj) {
        super(1, obj, b.class, "tryOnError", "tryOnError(Ljava/lang/Throwable;)Z", 8);
    }

    @Override // xsna.izs
    public /* bridge */ /* synthetic */ s3q0 invoke(Throwable th) {
        invoke2(th);
        return s3q0.a;
    }

    /* renamed from: invoke, reason: avoid collision after fix types in other method */
    public final void invoke2(Throwable th) {
        ((b) this.receiver).b(th);
    }
}
