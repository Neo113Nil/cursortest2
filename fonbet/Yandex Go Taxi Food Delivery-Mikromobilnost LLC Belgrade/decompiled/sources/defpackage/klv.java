package defpackage;

import com.yandex.go.feedback_common.services.FeedbackTask;
import java.util.LinkedList;

/* loaded from: classes12.dex */
public class klv implements qp60 {
    public final LinkedList a = new LinkedList();

    @Override // defpackage.qp60
    public final void f(FeedbackTask feedbackTask) {
        this.a.add(feedbackTask);
    }

    @Override // defpackage.qp60
    public final Object peek() {
        return this.a.peek();
    }

    @Override // defpackage.qp60
    public final void remove() {
        this.a.remove();
    }

    @Override // defpackage.qp60
    public final int size() {
        return this.a.size();
    }
}
