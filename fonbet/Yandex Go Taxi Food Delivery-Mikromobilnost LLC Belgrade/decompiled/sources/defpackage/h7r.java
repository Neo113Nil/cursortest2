package defpackage;

import com.yandex.mapkit.map.Map;
import ru.yandex.taxi.layers.actionrouter.a;

/* loaded from: classes5.dex */
public final class h7r implements Map.CameraCallback {
    public final /* synthetic */ a a;
    public final /* synthetic */ j18 b;

    public h7r(a aVar, j18 j18Var) {
        this.a = aVar;
        this.b = j18Var;
    }

    @Override // com.yandex.mapkit.map.Map.CameraCallback
    public final void onMoveFinished(boolean z) {
        this.a.d.a(true);
        this.b.resumeWith(zy11.a);
    }
}
