package defpackage;

import android.graphics.Matrix;
import android.graphics.Rect;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.concurrent.Executor;

/* loaded from: classes10.dex */
public abstract class b8x0 {
    public int a;
    public final HashMap b;

    public b8x0() {
        this.a = new u38().a == null ? 0 : 1;
        this.b = new HashMap();
    }

    public abstract Executor a();

    public abstract int b();

    public abstract Rect c();

    public abstract t8v d();

    public abstract int e();

    public abstract u8v f();

    public abstract r1s g();

    public abstract int h();

    public abstract r1s i();

    public abstract Matrix j();

    public abstract List k();

    public final boolean l() {
        Iterator it = this.b.entrySet().iterator();
        while (it.hasNext()) {
            if (!((Boolean) ((Map.Entry) it.next()).getValue()).booleanValue()) {
                return false;
            }
        }
        return true;
    }

    public abstract boolean m();

    public final void n(int i) {
        Integer valueOf = Integer.valueOf(i);
        HashMap hashMap = this.b;
        if (hashMap.containsKey(valueOf)) {
            hashMap.put(Integer.valueOf(i), Boolean.TRUE);
        } else {
            sgb1.d("TakePictureRequest", "The format is not supported in simultaneous capture");
        }
    }
}
