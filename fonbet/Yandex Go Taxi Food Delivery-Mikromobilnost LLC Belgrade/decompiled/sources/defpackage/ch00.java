package defpackage;

import com.yandex.mapkit.map.Map;

/* loaded from: classes12.dex */
public final /* synthetic */ class ch00 implements Map.CameraCallback {
    public final /* synthetic */ int a;
    public final /* synthetic */ tls b;

    public /* synthetic */ ch00(int i, tls tlsVar) {
        this.a = i;
        this.b = tlsVar;
    }

    @Override // com.yandex.mapkit.map.Map.CameraCallback
    public final void onMoveFinished(boolean z) {
        int i = this.a;
        tls tlsVar = this.b;
        switch (i) {
            case 0:
                tlsVar.invoke(Boolean.valueOf(z));
                break;
            default:
                tlsVar.invoke(Boolean.valueOf(z));
                break;
        }
    }
}
