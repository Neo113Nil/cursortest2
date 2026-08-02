package defpackage;

import com.yandex.go.layers.api.model.MapObjectComponentType;
import com.yandex.mapkit.geometry.geo.XYPoint;
import java.util.Set;

/* loaded from: classes5.dex */
public final class lcv extends v35 {
    public final String h;
    public f4c0 i;

    public lcv(String str, if61 if61Var, String str2, Set set, XYPoint xYPoint, vm00 vm00Var, f4c0 f4c0Var) {
        super(if61Var, str2, xYPoint, set, MapObjectComponentType.IMAGE_OVERLAY, vm00Var);
        this.h = str;
        this.i = f4c0Var;
    }

    @Override // defpackage.ym00
    public final void d(f4c0 f4c0Var) {
        this.i = f4c0Var;
    }

    @Override // defpackage.ym00
    public final f4c0 g() {
        return this.i;
    }

    public final String i() {
        return this.h;
    }
}
