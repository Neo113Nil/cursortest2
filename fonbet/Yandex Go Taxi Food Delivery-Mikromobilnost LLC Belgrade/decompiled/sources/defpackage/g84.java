package defpackage;

import androidx.camera.core.impl.DeferrableSurface;
import defpackage.gyq0;
import java.util.List;

/* loaded from: classes10.dex */
public final class g84 extends gyq0.a {
    public DeferrableSurface a;
    public List b;
    public String c;
    public Integer d;
    public Integer e;
    public q8n f;

    public final h84 a() {
        String str = this.a == null ? " surface" : "";
        if (this.b == null) {
            str = str.concat(" sharedSurfaces");
        }
        if (this.d == null) {
            str = str.concat(" mirrorMode");
        }
        if (this.e == null) {
            str = str.concat(" surfaceGroupId");
        }
        if (this.f == null) {
            str = str.concat(" dynamicRange");
        }
        if (str.isEmpty()) {
            return new h84(this.a, this.b, this.c, this.d.intValue(), this.e.intValue(), this.f);
        }
        ny61.r("Missing required properties:".concat(str));
        return null;
    }
}
