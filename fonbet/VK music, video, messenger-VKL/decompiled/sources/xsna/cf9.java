package xsna;

import android.hardware.camera2.CameraCaptureSession;
import android.util.ArrayMap;
import androidx.annotation.NonNull;
import androidx.camera.core.impl.f;
import java.util.ArrayList;
import java.util.HashSet;
import xsna.fs9;

/* compiled from: Camera2CaptureOptionUnpacker.java */
/* loaded from: classes11.dex */
public class cf9 implements f.b {
    public static final cf9 a = new cf9();

    @Override // androidx.camera.core.impl.f.b
    public void a(@NonNull androidx.camera.core.impl.u<?> uVar, @NonNull f.a aVar) {
        androidx.camera.core.impl.f x = uVar.x();
        androidx.camera.core.impl.o oVar = androidx.camera.core.impl.o.u;
        androidx.camera.core.impl.a aVar2 = androidx.camera.core.impl.f.g;
        HashSet hashSet = new HashSet();
        androidx.camera.core.impl.n z = androidx.camera.core.impl.n.z();
        ArrayList arrayList = new ArrayList();
        ai50 b = ai50.b();
        ArrayList arrayList2 = new ArrayList(hashSet);
        androidx.camera.core.impl.o y = androidx.camera.core.impl.o.y(z);
        d0o0 d0o0Var = d0o0.b;
        ArrayMap arrayMap = new ArrayMap();
        for (String str : b.a.keySet()) {
            arrayMap.put(str, b.a(str));
        }
        int i = -1;
        new androidx.camera.core.impl.f(arrayList2, y, -1, arrayList, false, new d0o0(arrayMap));
        if (x != null) {
            i = x.c;
            aVar.a(x.d);
            oVar = x.b;
        }
        aVar.b = androidx.camera.core.impl.n.A(oVar);
        aVar.c = ((Integer) uVar.g(if9.t, Integer.valueOf(i))).intValue();
        aVar.b(new cs9((CameraCaptureSession.CaptureCallback) uVar.g(if9.w, new bf9())));
        fs9.a aVar3 = new fs9.a();
        uVar.b(new rr2(aVar3, uVar));
        aVar.c(new fs9(androidx.camera.core.impl.o.y(aVar3.a)));
    }
}
