package defpackage;

import com.yandex.go.preorder.map.a;
import com.yandex.mapkit.map.Map;

/* loaded from: classes13.dex */
public final /* synthetic */ class g0l0 implements Map.CameraCallback {
    public final /* synthetic */ a a;
    public final /* synthetic */ boolean b;
    public final /* synthetic */ boolean c;

    public /* synthetic */ g0l0(a aVar, boolean z, boolean z2) {
        this.a = aVar;
        this.b = z;
        this.c = z2;
    }

    @Override // com.yandex.mapkit.map.Map.CameraCallback
    public final void onMoveFinished(boolean z) {
        a aVar = this.a;
        if (aVar.n) {
            jpv0 b = aVar.h.b();
            b.getClass();
            if (!(b instanceof hpv0) || aVar.d.f.a()) {
                return;
            }
            aVar.i.b((!z || this.b) && !aVar.j.a() && this.c);
        }
    }
}
