package defpackage;

import com.yandex.mapkit.map.MapObject;

/* loaded from: classes6.dex */
public abstract class lvu0 extends u15 {
    public float i;

    public lvu0(Class cls, Object obj) {
        super(cls, obj);
        this.i = 5.0f;
    }

    @Override // defpackage.u15, defpackage.ap00
    public void f() {
        super.f();
        q(this.g, this.i);
    }

    public final void p(float f) {
        this.i = f;
        q(this.g, f);
    }

    public abstract void q(MapObject mapObject, float f);
}
