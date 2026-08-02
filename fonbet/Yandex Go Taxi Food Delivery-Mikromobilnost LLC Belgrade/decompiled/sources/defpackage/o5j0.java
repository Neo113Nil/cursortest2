package defpackage;

import android.hardware.camera2.CaptureRequest;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

/* loaded from: classes10.dex */
public final class o5j0 implements j8j0 {
    public final List a;
    public final v5c0 b;
    public final int c;
    public final int d;

    public o5j0(int i, int i2, ArrayList arrayList, HashMap hashMap) {
        this.a = arrayList;
        this.c = i;
        this.d = i2;
        q7j0 q7j0Var = new q7j0();
        for (CaptureRequest.Key key : hashMap.keySet()) {
            q7j0Var.b(key, hashMap.get(key));
        }
        this.b = q7j0Var.a();
    }

    @Override // defpackage.j8j0
    public final szd getParameters() {
        return this.b;
    }

    @Override // defpackage.j8j0
    public final List getTargetOutputConfigIds() {
        return this.a;
    }

    @Override // defpackage.j8j0
    public final int getTemplateId() {
        return this.c;
    }
}
