package xsna;

import android.os.Bundle;
import android.os.Parcelable;
import com.unity3d.services.UnityAdsConstants;
import com.vk.sharing.api.dto.Target;
import com.vk.sharing.core.cancellation.TargetSharingTask;
import com.vk.sharing.core.view.l;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import kotlin.Pair;

/* compiled from: CancellationDelegate.kt */
/* loaded from: classes5.dex */
public final class pq9 {
    public final com.vk.sharing.core.view.l a;
    public final bin0<Pair<l.a, ecj0>> b;
    public final HashMap c = new HashMap();
    public final io.reactivex.rxjava3.subjects.f<Target> d = new io.reactivex.rxjava3.subjects.f<>();
    public final io.reactivex.rxjava3.subjects.f<vup> e = new io.reactivex.rxjava3.subjects.f<>();

    public pq9(com.vk.sharing.core.view.f fVar, bin0 bin0Var) {
        this.a = fVar;
        this.b = bin0Var;
    }

    public final void a() {
        for (TargetSharingTask targetSharingTask : j5g.O0(this.c.values())) {
            targetSharingTask.getClass();
            i0q0.g(targetSharingTask);
            targetSharingTask.run();
        }
    }

    public final nhi0 b() {
        Pair<l.a, ecj0> pair = this.b.get();
        return new nhi0(pair.i(), pair.j());
    }

    public final void c(Target target, nhi0 nhi0Var, Integer num) {
        l.a aVar = nhi0Var.a;
        ecj0 ecj0Var = nhi0Var.b;
        TargetSharingTask targetSharingTask = (TargetSharingTask) this.c.remove(new icj0(target.k, target.c, target.l));
        if (targetSharingTask != null) {
            com.vk.core.utils.newtork.b.a.getClass();
            if (!com.vk.core.utils.newtork.b.d()) {
                ecj0Var.d(target.c);
                aVar.K2(target, num != null ? num.intValue() : 0);
                this.e.onNext(new vup(new Throwable("Connection lost")));
            } else {
                String str = targetSharingTask.d;
                ecj0Var.d.add(target);
                aVar.u2(target, num != null ? num.intValue() : 0, str);
                this.d.onNext(target);
            }
        }
    }

    public final boolean d(Target target) {
        TargetSharingTask targetSharingTask = (TargetSharingTask) this.c.get(new icj0(target.k, target.c, target.l));
        return (targetSharingTask != null ? Math.min(((float) (System.currentTimeMillis() - targetSharingTask.b)) / ((float) 3500), 1.0f) : -1.0f) >= UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT;
    }

    public final void e(Bundle bundle) {
        if (bundle != Bundle.EMPTY) {
            Parcelable[] parcelableArray = bundle.getParcelableArray("cancellation_tasks_storage");
            if (parcelableArray == null) {
                parcelableArray = null;
            }
            if (parcelableArray != null) {
                ArrayList arrayList = new ArrayList();
                for (Parcelable parcelable : parcelableArray) {
                    if (parcelable instanceof TargetSharingTask) {
                        arrayList.add(parcelable);
                    }
                }
                Iterator it = arrayList.iterator();
                while (it.hasNext()) {
                    TargetSharingTask targetSharingTask = (TargetSharingTask) it.next();
                    long currentTimeMillis = System.currentTimeMillis() - targetSharingTask.b;
                    if (currentTimeMillis > 3500) {
                        c(targetSharingTask.c, b(), targetSharingTask.e);
                    } else {
                        TargetSharingTask targetSharingTask2 = new TargetSharingTask(targetSharingTask.b, targetSharingTask.c, this.a.getCommentText(), targetSharingTask.e, 3500 - currentTimeMillis, new nq9(this, targetSharingTask, b(), 0));
                        Target target = targetSharingTask2.c;
                        this.c.put(new icj0(target.k, target.c, target.l), targetSharingTask2);
                        i0q0.d(targetSharingTask2.f, targetSharingTask2);
                    }
                }
            }
        }
    }
}
