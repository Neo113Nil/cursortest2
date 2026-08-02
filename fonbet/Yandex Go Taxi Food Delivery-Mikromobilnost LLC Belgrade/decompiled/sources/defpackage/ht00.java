package defpackage;

import com.yandex.mapkit.MapKitFactory;
import com.yandex.mapkit.map.MapWindow;
import com.yandex.mapkit.mapview.MapTexture;

/* loaded from: classes7.dex */
public final class ht00 implements gey, au00 {
    public final e40 a;
    public wsr b;
    public MapTexture c;

    public ht00(ssr ssrVar, e40 e40Var) {
        this.a = e40Var;
    }

    @Override // defpackage.au00
    public final MapWindow getMapWindow() {
        MapTexture mapTexture = this.c;
        if (mapTexture == null) {
            mapTexture = null;
        }
        return mapTexture.getMapWindow();
    }

    @Override // defpackage.gey
    public final void onStart() {
        MapKitFactory.getInstance().onStart();
        MapTexture mapTexture = this.c;
        if (mapTexture == null) {
            mapTexture = null;
        }
        mapTexture.onStart();
    }

    @Override // defpackage.gey
    public final void onStop() {
        MapTexture mapTexture = this.c;
        if (mapTexture == null) {
            mapTexture = null;
        }
        mapTexture.onStop();
        MapKitFactory.getInstance().onStop();
    }

    @Override // defpackage.au00
    public final void release() {
        MapTexture mapTexture = this.c;
        if (mapTexture == null) {
            mapTexture = null;
        }
        mapTexture.removeTexture();
        wsr wsrVar = this.b;
        (wsrVar != null ? wsrVar : null).release();
        this.a.a.remove(this);
    }
}
