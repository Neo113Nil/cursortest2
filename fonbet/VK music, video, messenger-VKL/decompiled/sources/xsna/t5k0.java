package xsna;

import com.vk.dto.masks.SmartMasksGetModelResponse;

/* compiled from: SmartMasksModelLoader.kt */
/* loaded from: classes3.dex */
public final class t5k0 {
    public final int a;

    public t5k0(int i) {
        this.a = i;
    }

    public final io.reactivex.rxjava3.core.q<SmartMasksGetModelResponse> a() {
        tfx tfxVar = new tfx("masks.getModel", new io.reactivex.rxjava3.internal.operators.observable.n0(27), new dr(21));
        int i = this.a;
        tfx.l(tfxVar, "engine_version", i, 0, 0, 8);
        io.reactivex.rxjava3.internal.operators.observable.m1 y0 = rsg0.y0(yfb.x(tfxVar), null, null, 3);
        tfx tfxVar2 = new tfx("masks.getAssetVersion", new br(22), new cr(18));
        tfx.l(tfxVar2, "engine_version", i, 0, 0, 8);
        return io.reactivex.rxjava3.core.q.I0(y0, rsg0.y0(yfb.x(tfxVar2), null, null, 3), new e4t(new j21(this), 13));
    }
}
