package xsna;

import one.video.calls.sdk.internal.upload.config.BitrateDumpGatheringConfig;
import ru.ok.android.externcalls.sdk.factory.internal.CidLogger;

/* compiled from: BitrateDumpGatheringConfigCacherImpl.kt */
/* loaded from: classes8.dex */
public final class pd7<T> implements io.reactivex.rxjava3.functions.f {
    public final /* synthetic */ rd7 b;

    public pd7(rd7 rd7Var) {
        this.b = rd7Var;
    }

    @Override // io.reactivex.rxjava3.functions.f
    public final void accept(Object obj) {
        BitrateDumpGatheringConfig bitrateDumpGatheringConfig = (BitrateDumpGatheringConfig) obj;
        rd7 rd7Var = this.b;
        ((CidLogger) rd7Var.b).log("BitrateDumpGatheringConfigCacherImpl", "Got remote bitrate dump config, caching it " + bitrateDumpGatheringConfig);
        ((sd7) ((vd7) rd7Var.a).b).put("bitrate_config_key", bitrateDumpGatheringConfig);
    }
}
