package defpackage;

import com.yandex.mapkit.Animation;
import com.yandex.mapkit.map.BaseMapObjectCollection;
import com.yandex.mapkit.map.MapObject;
import com.yandex.mapkit.map.MapObjectTapListener;

/* loaded from: classes9.dex */
public abstract class ap00 {
    public final MapObject a;
    public boolean b;
    public float c;
    public Object d;
    public MapObjectTapListener e;
    public u35 f;
    public MapObject g;

    public ap00(Class cls) {
        MapObject mapObject = (MapObject) pwf0.c(cls);
        this.a = mapObject;
        this.b = true;
        this.g = mapObject;
    }

    public void a(BaseMapObjectCollection baseMapObjectCollection) {
        this.g = c(baseMapObjectCollection);
        f();
    }

    public final void b(u35 u35Var) {
        if (jl40.l(this.f, u35Var)) {
            return;
        }
        u35 u35Var2 = this.f;
        if (u35Var2 != null) {
            u35Var2.h.remove(this);
            e();
        }
        this.f = u35Var;
        if (u35Var != null) {
            u35Var.h.add(this);
            MapObject mapObject = u35Var.g;
            if (mapObject != u35Var.a) {
                a((BaseMapObjectCollection) mapObject);
            }
        }
    }

    public abstract MapObject c(BaseMapObjectCollection baseMapObjectCollection);

    public final void d() {
        u35 u35Var = this.f;
        if (u35Var != null) {
            u35Var.h.remove(this);
            e();
            this.f = null;
        }
    }

    public void e() {
        BaseMapObjectCollection parent = this.g.getParent();
        if (parent != null) {
            parent.remove(this.g);
        }
        this.g = this.a;
    }

    public void f() {
        this.g.setVisible(this.b);
        this.g.setUserData(this.d);
        this.g.setZIndex(this.c);
        MapObjectTapListener mapObjectTapListener = this.e;
        if (mapObjectTapListener != null) {
            this.g.addTapListener(mapObjectTapListener);
        }
    }

    public final void g(MapObjectTapListener mapObjectTapListener) {
        if (jl40.l(this.e, mapObjectTapListener)) {
            return;
        }
        MapObjectTapListener mapObjectTapListener2 = this.e;
        if (mapObjectTapListener2 != null) {
            this.g.removeTapListener(mapObjectTapListener2);
        }
        this.e = mapObjectTapListener;
        if (mapObjectTapListener != null) {
            this.g.addTapListener(mapObjectTapListener);
        }
    }

    public final void h(Object obj) {
        this.d = obj;
        this.g.setUserData(obj);
    }

    public final void i(boolean z) {
        if (this.b == z) {
            return;
        }
        this.b = z;
        this.g.setVisible(z);
    }

    public final void j(boolean z, Animation animation, a75 a75Var) {
        if (this.b == z) {
            return;
        }
        this.b = z;
        MapObject mapObject = this.g;
        if (mapObject != this.a) {
            mapObject.setVisible(z, animation, a75Var);
        } else if (a75Var != null) {
            a75Var.onTaskFinished();
        }
    }

    public final void k(float f) {
        this.c = f;
        this.g.setZIndex(f);
    }
}
