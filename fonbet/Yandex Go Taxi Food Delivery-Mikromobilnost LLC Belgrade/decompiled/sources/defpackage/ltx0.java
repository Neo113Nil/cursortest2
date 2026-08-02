package defpackage;

import android.app.PendingIntent;
import android.content.Context;
import android.content.Intent;
import androidx.activity.result.IntentSenderRequest;
import com.google.android.gms.common.api.ApiException;
import com.google.android.gms.common.api.ResolvableApiException;
import com.google.android.gms.common.api.Status;
import com.google.android.gms.tasks.Task;

/* loaded from: classes11.dex */
public abstract class ltx0 extends x40 {
    public Status a;
    public PendingIntent b;

    @Override // defpackage.x40
    public final Intent a(Context context, Object obj) {
        return new Intent("androidx.activity.result.contract.action.INTENT_SENDER_REQUEST").putExtra("androidx.activity.result.contract.extra.INTENT_SENDER_REQUEST", new IntentSenderRequest(this.b.getIntentSender(), null, 0, 0));
    }

    @Override // defpackage.x40
    public final w40 b(Context context, Object obj) {
        Task task = (Task) obj;
        if (!task.n()) {
            ny61.g("The task has to be executed before using this API to resolve its result.");
            return null;
        }
        Exception j = task.j();
        if (j instanceof ApiException) {
            this.a = ((ApiException) j).a();
            if (j instanceof ResolvableApiException) {
                this.b = ((ResolvableApiException) j).c();
            }
        }
        if (this.b == null) {
            return new w40(d(task));
        }
        return null;
    }

    public abstract ko2 d(Task task);
}
