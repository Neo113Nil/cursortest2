package xsna;

import ru.ok.android.externcalls.sdk.factory.internal.CidLogger;

/* compiled from: BitrateDumpGatheringConfigCacherImpl.kt */
/* loaded from: classes8.dex */
public final class qd7<T> implements io.reactivex.rxjava3.functions.f {
    public final /* synthetic */ rd7 b;

    public qd7(rd7 rd7Var) {
        this.b = rd7Var;
    }

    @Override // io.reactivex.rxjava3.functions.f
    public final void accept(Object obj) {
        ((CidLogger) this.b.b).logException("BitrateDumpGatheringConfigCacherImpl", "Error getting remote bitrate dump config", (Throwable) obj);
    }
}
