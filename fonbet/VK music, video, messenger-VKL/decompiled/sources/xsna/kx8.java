package xsna;

import android.app.Activity;
import com.vk.core.ui.themes.VKTheme;
import java.util.List;
import java.util.concurrent.ConcurrentHashMap;
import kotlin.collections.EmptyList;
import xsna.mx8;
import xsna.v7s0;

/* compiled from: R8$$SyntheticClass */
/* loaded from: classes2.dex */
public final /* synthetic */ class kx8 implements io.reactivex.rxjava3.functions.a {
    public final /* synthetic */ int b;
    public final /* synthetic */ Object c;
    public final /* synthetic */ Object d;
    public final /* synthetic */ Object e;

    public /* synthetic */ kx8(Object obj, Object obj2, Object obj3, int i) {
        this.b = i;
        this.c = obj;
        this.d = obj2;
        this.e = obj3;
    }

    @Override // io.reactivex.rxjava3.functions.a
    public final void run() {
        switch (this.b) {
            case 0:
                mx8 mx8Var = (mx8) this.c;
                ay8 ay8Var = (ay8) this.d;
                mx8.a aVar = (mx8.a) this.e;
                v7s0 v7s0Var = mx8Var.a;
                r7s0 r7s0Var = ay8Var.e;
                ConcurrentHashMap<r7s0, List<v7s0.a>> concurrentHashMap = v7s0Var.d;
                List<v7s0.a> list = concurrentHashMap.get(r7s0Var);
                if (list == null) {
                    list = EmptyList.b;
                }
                concurrentHashMap.put(r7s0Var, j5g.s0(list, aVar));
                break;
            default:
                VKTheme vKTheme = (VKTheme) this.c;
                Activity activity = (Activity) this.d;
                float[] fArr = (float[]) this.e;
                dhr0 dhr0Var = dhr0.a;
                dhr0Var.getClass();
                if (!epx.f(vKTheme, dhr0.n(activity)) || !dhr0.n(activity).equals((VKTheme) dhr0.m.a())) {
                    dhr0.m.b();
                    dhr0.p0(dhr0Var, activity, dhr0.n(activity), fArr, 8);
                    break;
                }
                break;
        }
    }
}
