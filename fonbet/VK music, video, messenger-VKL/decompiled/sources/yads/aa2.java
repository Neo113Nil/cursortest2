package yads;

import android.content.Context;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.CountDownLatch;
import org.json.JSONObject;
import xsna.bdn;
import xsna.gcy0;
import xsna.myc0;
import xsna.spj;
import xsna.wgl;

/* loaded from: classes10.dex */
public final class aa2 {
    public final wr1 a;
    public final Object b;

    public /* synthetic */ aa2(yp1 yp1Var) {
        this(new wr1(yp1Var));
    }

    public final Object a(Context context, e13 e13Var, List list, spj spjVar) {
        ArrayList arrayList = new ArrayList(list.size());
        CountDownLatch countDownLatch = new CountDownLatch(list.size());
        ep epVar = new ep();
        Iterator it = list.iterator();
        while (it.hasNext()) {
            ep epVar2 = epVar;
            this.a.a(context, e13Var, (rr1) it.next(), epVar2, new gcy0(this, countDownLatch, arrayList));
            epVar = epVar2;
        }
        bdn bdnVar = bdn.a;
        return myc0.k(wgl.c, new z92(this, countDownLatch, arrayList, epVar, null), spjVar);
    }

    public aa2(wr1 wr1Var) {
        this.a = wr1Var;
        this.b = new Object();
    }

    public static final void a(aa2 aa2Var, CountDownLatch countDownLatch, ArrayList arrayList, JSONObject jSONObject) {
        if (jSONObject != null) {
            synchronized (aa2Var.b) {
                arrayList.add(jSONObject);
            }
        }
        countDownLatch.countDown();
    }
}
