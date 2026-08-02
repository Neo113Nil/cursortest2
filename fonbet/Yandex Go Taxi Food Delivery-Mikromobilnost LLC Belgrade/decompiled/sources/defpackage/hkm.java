package defpackage;

import com.yandex.mapkit.map.Map;

/* loaded from: classes12.dex */
public final /* synthetic */ class hkm implements Map.CameraCallback {
    public final /* synthetic */ int a;
    public final /* synthetic */ ikm b;

    public /* synthetic */ hkm(ikm ikmVar, int i) {
        this.a = i;
        this.b = ikmVar;
    }

    @Override // com.yandex.mapkit.map.Map.CameraCallback
    public final void onMoveFinished(boolean z) {
        int i = this.a;
        ikm ikmVar = this.b;
        switch (i) {
            case 0:
                ikmVar.F.a();
                break;
            default:
                ikmVar.F.a();
                break;
        }
    }
}
