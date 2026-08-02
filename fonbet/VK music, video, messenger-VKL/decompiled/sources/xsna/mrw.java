package xsna;

import android.content.Context;
import android.util.Log;
import androidx.appcompat.app.AppCompatActivity;
import com.google.android.gms.common.api.Status;
import com.google.android.gms.tasks.OnCanceledListener;
import com.google.android.gms.tasks.OnCompleteListener;
import com.google.android.gms.tasks.OnFailureListener;
import com.google.android.gms.tasks.OnSuccessListener;
import com.google.android.gms.tasks.Task;
import com.google.android.gms.tasks.TaskCompletionSource;
import com.google.android.gms.tasks.Tasks;
import com.google.android.play.core.review.ReviewException;
import com.google.android.play.core.review.ReviewInfo;
import com.vk.core.apps.VkBuildAppStore;
import com.vk.inappreview.ReviewActionResult$Failed;
import com.vk.log.L;
import java.util.HashMap;
import java.util.Locale;
import xsna.r100;

/* compiled from: InAppReviewManagerPlayServicesImpl.kt */
/* loaded from: classes2.dex */
public final class mrw implements crw {
    public final AppCompatActivity a;
    public final brw b;
    public com.google.android.play.core.review.b c;
    public ReviewInfo d;
    public final m1i e = new m1i(this, 20);
    public final eqq f = new eqq(this, 12);
    public final String g = VkBuildAppStore.GOOGLE.i();

    public mrw(AppCompatActivity appCompatActivity, brw brwVar) {
        this.a = appCompatActivity;
        this.b = brwVar;
    }

    public static ReviewActionResult$Failed a(ReviewException reviewException) {
        Integer valueOf = Integer.valueOf(reviewException.g());
        return new ReviewActionResult$Failed(valueOf.intValue() == -100 ? ReviewActionResult$Failed.ErrorReason.INTERNAL_ERROR : valueOf.intValue() == -1 ? ReviewActionResult$Failed.ErrorReason.STORE_NOT_FOUND : valueOf.intValue() == -2 ? ReviewActionResult$Failed.ErrorReason.INVALID_REQUEST : ReviewActionResult$Failed.ErrorReason.UNKNOWN);
    }

    @Override // xsna.crw
    public final void onCreate() {
        Task task;
        r100.a(this.g, "Google in-app review manager created");
        Context context = this.a;
        Context applicationContext = context.getApplicationContext();
        if (applicationContext != null) {
            context = applicationContext;
        }
        com.google.android.play.core.review.b bVar = new com.google.android.play.core.review.b(new kf01(context));
        this.c = bVar;
        kf01 kf01Var = bVar.a;
        lf01 lf01Var = kf01.c;
        lf01Var.a("requestInAppReview (%s)", kf01Var.b);
        if (kf01Var.a == null) {
            Object[] objArr = new Object[0];
            if (Log.isLoggable("PlayCore", 6)) {
                Log.e("PlayCore", lf01.b(lf01Var.a, "Play Store app is either not installed or not the official version", objArr));
            }
            Locale locale = Locale.getDefault();
            HashMap hashMap = etz0.a;
            task = Tasks.forException(new ReviewException(new Status(-1, String.format(locale, "Review Error(%d): %s", -1, !hashMap.containsKey(-1) ? "" : fw3.c((String) hashMap.get(-1), " (https://developer.android.com/reference/com/google/android/play/core/review/model/ReviewErrorCode.html#", (String) etz0.b.get(-1), ")")))));
        } else {
            final TaskCompletionSource taskCompletionSource = new TaskCompletionSource();
            final up01 up01Var = kf01Var.a;
            ja01 ja01Var = new ja01(kf01Var, taskCompletionSource, taskCompletionSource);
            synchronized (up01Var.f) {
                up01Var.e.add(taskCompletionSource);
                taskCompletionSource.getTask().addOnCompleteListener(new OnCompleteListener() { // from class: xsna.ri01
                    @Override // com.google.android.gms.tasks.OnCompleteListener
                    public final void onComplete(Task task2) {
                        up01 up01Var2 = up01.this;
                        TaskCompletionSource taskCompletionSource2 = taskCompletionSource;
                        synchronized (up01Var2.f) {
                            up01Var2.e.remove(taskCompletionSource2);
                        }
                    }
                });
            }
            synchronized (up01Var.f) {
                try {
                    if (up01Var.k.getAndIncrement() > 0) {
                        lf01 lf01Var2 = up01Var.b;
                        Object[] objArr2 = new Object[0];
                        if (Log.isLoggable("PlayCore", 3)) {
                            lf01.b(lf01Var2.a, "Already connected to the service.", objArr2);
                        } else {
                            lf01Var2.getClass();
                        }
                    }
                } catch (Throwable th) {
                    throw th;
                }
            }
            up01Var.a().post(new uk01(up01Var, taskCompletionSource, ja01Var));
            task = taskCompletionSource.getTask();
        }
        final wik wikVar = new wik(this, 17);
        task.addOnSuccessListener(new OnSuccessListener() { // from class: xsna.grw
            @Override // com.google.android.gms.tasks.OnSuccessListener
            public final void onSuccess(Object obj) {
                wik.this.invoke(obj);
            }
        }).addOnFailureListener(new OnFailureListener() { // from class: xsna.hrw
            @Override // com.google.android.gms.tasks.OnFailureListener
            public final void onFailure(Exception exc) {
                L.l("InAppReview", fo8.a(mrw.this.g, ": Request review flow error"), mnh0.A(new r100.a("InAppReviewException", exc)));
            }
        }).addOnCanceledListener(new OnCanceledListener() { // from class: xsna.irw
            @Override // com.google.android.gms.tasks.OnCanceledListener
            public final void onCanceled() {
                r100.a(mrw.this.g, "Request review flow canceled");
            }
        }).addOnCompleteListener(new OnCompleteListener() { // from class: xsna.jrw
            @Override // com.google.android.gms.tasks.OnCompleteListener
            public final void onComplete(Task task2) {
                mrw mrwVar = mrw.this;
                String str = mrwVar.g;
                if (task2.isSuccessful()) {
                    r100.a(str, "Request review flow completed successfully, result = " + task2.getResult());
                    mrwVar.d = (ReviewInfo) task2.getResult();
                    return;
                }
                Exception exception = task2.getException();
                String a = fo8.a(str, ": Request review flow completed with error");
                if (exception != null) {
                    L.l("InAppReview", a, mnh0.A(new r100.a("InAppReviewException", exception)));
                } else {
                    L.e("InAppReview", a);
                }
            }
        });
    }

    @Override // xsna.crw
    public final void onPause() {
        r100.a(this.g, "Google in-app review manager paused");
        brw brwVar = this.b;
        brwVar.h = null;
        brwVar.i = null;
    }

    @Override // xsna.crw
    public final void onResume() {
        r100.a(this.g, "Google in-app review manager resumed");
        m1i m1iVar = this.e;
        brw brwVar = this.b;
        brwVar.h = m1iVar;
        brwVar.i = this.f;
    }
}
