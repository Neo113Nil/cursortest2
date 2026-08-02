package xsna;

import java.util.ArrayList;
import java.util.concurrent.CountDownLatch;
import org.json.JSONObject;

/* compiled from: R8$$SyntheticClass */
/* loaded from: classes10.dex */
public final /* synthetic */ class gcy0 implements yads.ur1 {
    public final /* synthetic */ yads.aa2 a;
    public final /* synthetic */ CountDownLatch b;
    public final /* synthetic */ ArrayList c;

    public /* synthetic */ gcy0(yads.aa2 aa2Var, CountDownLatch countDownLatch, ArrayList arrayList) {
        this.a = aa2Var;
        this.b = countDownLatch;
        this.c = arrayList;
    }

    public final void a(JSONObject jSONObject) {
        yads.aa2.a(this.a, this.b, this.c, jSONObject);
    }
}
