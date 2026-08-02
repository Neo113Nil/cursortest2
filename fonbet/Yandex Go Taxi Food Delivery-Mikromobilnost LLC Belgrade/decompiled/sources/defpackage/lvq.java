package defpackage;

import android.content.Context;
import android.content.Intent;
import com.squareup.tape.Task;
import com.yandex.go.feedback_common.services.FeedbackQueueService;
import com.yandex.go.feedback_common.services.FeedbackTask;
import java.util.HashSet;
import java.util.Iterator;

/* loaded from: classes.dex */
public final class lvq implements qp60 {
    public final qp60 a;
    public final Context b;
    public final HashSet c;

    public lvq(qp60 qp60Var, Context context) {
        this.a = qp60Var;
        this.b = context;
        this.c = new HashSet(qp60Var.size());
        synchronized (this) {
            try {
                HashSet hashSet = new HashSet(qp60Var.size());
                FeedbackTask feedbackTask = (FeedbackTask) peek();
                while (feedbackTask != null) {
                    this.a.remove();
                    hashSet.add(feedbackTask);
                    this.c.add(feedbackTask.f());
                    feedbackTask = (FeedbackTask) peek();
                }
                Iterator it = hashSet.iterator();
                while (it.hasNext()) {
                    b((FeedbackTask) it.next());
                }
            } catch (Throwable th) {
                throw th;
            }
        }
        Context context2 = this.b;
        if (this.a.size() > 0) {
            ytq ytqVar = FeedbackQueueService.Companion;
            Intent intent = new Intent();
            ytqVar.getClass();
            ytq.a(context2, intent);
        }
    }

    @Override // defpackage.qp60
    /* renamed from: a, reason: merged with bridge method [inline-methods] */
    public final synchronized void f(FeedbackTask feedbackTask) {
        b(feedbackTask);
        this.c.add(feedbackTask.f());
        Context context = this.b;
        ytq ytqVar = FeedbackQueueService.Companion;
        Intent intent = new Intent();
        ytqVar.getClass();
        ytq.a(context, intent);
    }

    public final void b(FeedbackTask feedbackTask) {
        this.a.f(feedbackTask);
    }

    @Override // defpackage.qp60
    /* renamed from: c, reason: merged with bridge method [inline-methods] */
    public final Task peek() {
        return (Task) this.a.peek();
    }

    @Override // defpackage.qp60
    public final synchronized void remove() {
        if (this.a.size() > 0) {
            this.c.remove(((FeedbackTask) peek()).f());
            this.a.remove();
        }
    }

    @Override // defpackage.qp60
    public final int size() {
        return this.a.size();
    }
}
