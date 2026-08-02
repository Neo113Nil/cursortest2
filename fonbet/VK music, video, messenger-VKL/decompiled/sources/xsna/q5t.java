package xsna;

import android.graphics.Canvas;
import android.graphics.Path;
import android.view.View;
import android.view.ViewGroup;
import com.unity3d.services.UnityAdsConstants;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import xsna.ror;

/* compiled from: GalvitaFlexCornerClippingDecoration.kt */
/* loaded from: classes4.dex */
public final class q5t implements ror.b, cvj {
    public final float a;
    public final float b;
    public final HashMap<View, float[]> c = new HashMap<>();
    public final HashMap<View, Path> d = new HashMap<>();

    public q5t(float f, float f2) {
        this.a = f;
        this.b = f2;
    }

    @Override // xsna.cvj
    public final void a(View view, u0u0 u0u0Var) {
        ViewGroup.LayoutParams layoutParams = view.getLayoutParams();
        ror.c cVar = layoutParams instanceof ror.c ? (ror.c) layoutParams : null;
        if (cVar == null) {
            return;
        }
        uzt0 uzt0Var = cVar.a.a;
        boolean z = uzt0Var.a;
        float f = this.b;
        float f2 = this.a;
        d(view, z ? f2 : f, uzt0Var.b ? f2 : f, uzt0Var.c ? f2 : f, uzt0Var.d ? f2 : f, u0u0Var);
    }

    @Override // xsna.cvj
    public final void b(View view) {
        this.c.remove(view);
        this.d.remove(view);
    }

    @Override // xsna.ror.b
    public final boolean c(Canvas canvas, View view, oor oorVar) {
        int save = canvas.save();
        Iterator<Map.Entry<View, Path>> it = this.d.entrySet().iterator();
        while (true) {
            if (!it.hasNext()) {
                break;
            }
            Map.Entry<View, Path> next = it.next();
            View key = next.getKey();
            Path value = next.getValue();
            if (view.equals(key)) {
                canvas.clipPath(value);
                break;
            }
        }
        boolean booleanValue = ((Boolean) oorVar.invoke()).booleanValue();
        canvas.restoreToCount(save);
        return booleanValue;
    }

    @Override // xsna.cvj
    public final void clear() {
        this.c.clear();
        this.d.clear();
    }

    @Override // xsna.cvj
    public final void d(View view, float f, float f2, float f3, float f4, u0u0 u0u0Var) {
        HashMap<View, float[]> hashMap = this.c;
        float[] fArr = hashMap.get(view);
        if (fArr == null) {
            fArr = new float[8];
        }
        if (f > UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT) {
            fArr[0] = f;
            fArr[1] = f;
        }
        if (f2 > UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT) {
            fArr[2] = f2;
            fArr[3] = f2;
        }
        if (f3 > UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT) {
            fArr[4] = f3;
            fArr[5] = f3;
        }
        if (f4 > UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT) {
            fArr[6] = f4;
            fArr[7] = f4;
        }
        HashMap<View, Path> hashMap2 = this.d;
        Path path = hashMap2.get(view);
        if (path == null) {
            path = new Path();
        }
        hlc0.a(path, view, fArr, u0u0Var);
        hashMap2.put(view, path);
        hashMap.put(view, fArr);
    }

    @Override // xsna.cvj
    public final void g(View view) {
        float[] fArr;
        Path path;
        HashMap<View, Path> hashMap = this.d;
        if (hashMap.containsKey(view)) {
            HashMap<View, float[]> hashMap2 = this.c;
            if (!hashMap2.containsKey(view) || (fArr = hashMap2.get(view)) == null || (path = hashMap.get(view)) == null) {
                return;
            }
            hlc0.a(path, view, fArr, null);
        }
    }

    @Override // xsna.cvj
    public final void h(View view) {
        this.c.put(view, new float[8]);
        this.d.put(view, new Path());
    }

    @Override // xsna.ror.b
    public final void e(View view, Canvas canvas) {
    }

    @Override // xsna.ror.b
    public final void f(Canvas canvas, ror rorVar) {
    }
}
