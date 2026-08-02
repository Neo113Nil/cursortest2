package xsna;

import android.content.ClipData;
import android.content.Context;
import android.media.projection.MediaProjection;
import com.ironsource.S1;
import com.vk.log.L;
import com.vk.navigation.NavigationDelegateActivity;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.Result;
import kotlin.collections.EmptyList;
import ru.ok.android.webrtc.SharedLocalMediaStreamSource;
import ru.ok.android.webrtc.SharedPeerConnectionFactory;
import xsna.chj;

/* compiled from: R8$$SyntheticClass */
/* loaded from: classes14.dex */
public final /* synthetic */ class y63 implements Runnable {
    public final /* synthetic */ int b;
    public final /* synthetic */ Object c;
    public final /* synthetic */ Object d;
    public final /* synthetic */ Object e;

    public /* synthetic */ y63(Object obj, Object obj2, Object obj3, int i) {
        this.b = i;
        this.c = obj;
        this.d = obj2;
        this.e = obj3;
    }

    @Override // java.lang.Runnable
    public final void run() {
        Iterable<ClipData.Item> iterable;
        Object obj;
        Object failure;
        wjg0 a;
        int i = this.b;
        int i2 = 0;
        Object obj2 = this.e;
        Object obj3 = this.d;
        Object obj4 = this.c;
        switch (i) {
            case 0:
                d73 d73Var = (d73) obj4;
                g73 g73Var = (g73) d73Var.h.getValue();
                p73 p73Var = new p73();
                z63 z63Var = new z63(d73Var, (NavigationDelegateActivity) obj3, (mq2) obj2, i2);
                g73Var.a();
                bpn0 bpn0Var = g73Var.f;
                ((eqo) bpn0Var.getValue()).h(new j73(g73Var, z63Var));
                L.e("[ExternalAdsDynamicLibLoader]", "Start loading AppLovin dynamic lib");
                ((eqo) bpn0Var.getValue()).d(p73Var);
                break;
            case 1:
                S1.c.a((S1) obj4, (String) obj3, (S1.d) obj2);
                break;
            case 2:
                ((SharedPeerConnectionFactory) obj4).a((SharedLocalMediaStreamSource) obj3, (MediaProjection) obj2);
                break;
            default:
                d7v0 d7v0Var = (d7v0) obj4;
                Context context = (Context) obj3;
                chj chjVar = (chj) obj2;
                int i3 = 2;
                List l = e43.l(new bqc(), new cqc(context));
                if (chjVar == null) {
                    iterable = EmptyList.b;
                } else {
                    chj.e eVar = chjVar.a;
                    ArrayList arrayList = new ArrayList(eVar.a().getItemCount());
                    int itemCount = eVar.a().getItemCount();
                    for (int i4 = 0; i4 < itemCount; i4++) {
                        arrayList.add(eVar.a().getItemAt(i4));
                    }
                    iterable = arrayList;
                }
                ArrayList arrayList2 = new ArrayList();
                for (ClipData.Item item : iterable) {
                    Iterator it = l.iterator();
                    while (true) {
                        if (it.hasNext()) {
                            obj = it.next();
                            if (((dqc) obj).b(item)) {
                            }
                        } else {
                            obj = null;
                        }
                    }
                    dqc dqcVar = (dqc) obj;
                    L.e("Transformer [" + dqcVar + "] suitable for item = " + item);
                    if (dqcVar != null) {
                        try {
                            a = dqcVar.a(item);
                        } catch (Throwable th) {
                            failure = new Result.Failure(th);
                        }
                    } else {
                        a = null;
                    }
                    failure = a;
                    Throwable a2 = Result.a(failure);
                    if (a2 != null) {
                        L.j(a2, "Transformation failed with exception");
                        i2 = 1;
                    }
                    wjg0 wjg0Var = (wjg0) (failure instanceof Result.Failure ? null : failure);
                    if (wjg0Var != null) {
                        arrayList2.add(wjg0Var);
                    }
                }
                Iterator it2 = arrayList2.iterator();
                while (it2.hasNext()) {
                    wjg0 wjg0Var2 = (wjg0) it2.next();
                    L.e("Clip item transformed to rich content = " + wjg0Var2);
                    i0q0.f(new pk(23, d7v0Var, wjg0Var2));
                }
                if (i2 != 0) {
                    i0q0.f(new yl40(context, i3));
                    break;
                }
                break;
        }
    }
}
