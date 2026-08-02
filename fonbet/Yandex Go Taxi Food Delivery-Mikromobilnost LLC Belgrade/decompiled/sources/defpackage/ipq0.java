package defpackage;

import android.os.Handler;
import android.os.Looper;
import com.yandex.messaging.ChatRequest;
import java.util.LinkedHashMap;
import java.util.Random;

/* loaded from: classes15.dex */
public final class ipq0 extends ky4 {
    public final String y;
    public final long z;

    public ipq0(ChatRequest chatRequest, String str, long j) {
        super(chatRequest);
        this.y = str;
        this.z = j;
    }

    @Override // defpackage.b9b
    public final void k(j3b j3bVar, s020 s020Var) {
        m8g m8gVar = (m8g) s020Var;
        rbi0 rbi0Var = (rbi0) m8gVar.d.H0.get();
        naz0 f = m8gVar.f();
        String str = this.y;
        if (str == null) {
            str = f.a.b;
        }
        LinkedHashMap linkedHashMap = rbi0Var.b;
        Object obj = linkedHashMap.get(str);
        if (obj == null) {
            obj = new qbi0(rbi0Var, str);
            linkedHashMap.put(str, obj);
        }
        qbi0 qbi0Var = (qbi0) obj;
        Handler handler = qbi0Var.b;
        z83.g(null, handler.getLooper(), Looper.myLooper());
        qbi0Var.c.put(this.z, qbi0Var);
        if (qbi0Var.d == null && qbi0Var.e == null) {
            pbi0 pbi0Var = new pbi0(qbi0Var, 1);
            handler.postDelayed(pbi0Var, new Random().nextInt(9000) + 1000);
            qbi0Var.d = pbi0Var;
        }
        h();
    }
}
