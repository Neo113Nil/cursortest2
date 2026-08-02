package xsna;

import android.app.Activity;
import android.app.Fragment;
import android.app.PendingIntent;
import android.content.Intent;
import android.content.IntentSender;
import android.os.Bundle;
import android.os.Looper;
import android.os.SystemClock;
import android.util.Log;
import android.util.SparseArray;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import com.google.android.gms.common.api.ApiException;
import com.google.android.gms.common.api.ResolvableApiException;
import com.google.android.gms.common.api.Status;
import com.google.android.gms.tasks.OnCompleteListener;
import com.google.android.gms.tasks.Task;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicInteger;

/* compiled from: com.google.android.gms:play-services-wallet@@18.0.0 */
/* loaded from: classes13.dex */
public final class fj5 {
    public static final long a = TimeUnit.MINUTES.toMillis(10);
    public static final long b = SystemClock.elapsedRealtime();
    public static final /* synthetic */ int c = 0;

    /* compiled from: com.google.android.gms:play-services-wallet@@18.0.0 */
    public static class a<TResult extends dj5> implements OnCompleteListener<TResult>, Runnable {
        public static final com.google.android.gms.internal.wallet.zzf e = new com.google.android.gms.internal.wallet.zzf(Looper.getMainLooper());
        public static final SparseArray<a<?>> f = new SparseArray<>(2);
        public static final AtomicInteger g = new AtomicInteger();
        public int b;
        public b c;
        public Task<TResult> d;

        public final void a() {
            if (this.d == null || this.c == null) {
                return;
            }
            f.delete(this.b);
            e.removeCallbacks(this);
            b bVar = this.c;
            Task<TResult> task = this.d;
            int i = b.e;
            bVar.a(task);
        }

        @Override // com.google.android.gms.tasks.OnCompleteListener
        public final void onComplete(@NonNull Task<TResult> task) {
            this.d = task;
            a();
        }

        @Override // java.lang.Runnable
        public final void run() {
            f.delete(this.b);
        }
    }

    /* compiled from: com.google.android.gms:play-services-wallet@@18.0.0 */
    public static class b extends Fragment {
        public static final /* synthetic */ int e = 0;
        public int b;
        public a<?> c;
        public boolean d;

        public final void a(@Nullable Task<? extends dj5> task) {
            if (this.d) {
                return;
            }
            int i = 1;
            this.d = true;
            Activity activity = getActivity();
            activity.getFragmentManager().beginTransaction().remove(this).commit();
            if (task == null) {
                int i2 = this.b;
                Intent intent = new Intent();
                int i3 = fj5.c;
                PendingIntent createPendingResult = activity.createPendingResult(i2, intent, 1073741824);
                if (createPendingResult == null) {
                    return;
                }
                try {
                    createPendingResult.send(0);
                    return;
                } catch (PendingIntent.CanceledException e2) {
                    if (Log.isLoggable("AutoResolveHelper", 6)) {
                        Log.e("AutoResolveHelper", "Exception sending pending result", e2);
                        return;
                    }
                    return;
                }
            }
            int i4 = this.b;
            int i5 = fj5.c;
            if (activity.isFinishing()) {
                return;
            }
            if (task.getException() instanceof ResolvableApiException) {
                try {
                    ((ResolvableApiException) task.getException()).h(activity, i4);
                    return;
                } catch (IntentSender.SendIntentException e3) {
                    if (Log.isLoggable("AutoResolveHelper", 6)) {
                        Log.e("AutoResolveHelper", "Error starting pending intent!", e3);
                        return;
                    }
                    return;
                }
            }
            Intent intent2 = new Intent();
            if (task.isSuccessful()) {
                task.getResult().a(intent2);
                i = -1;
            } else if (task.getException() instanceof ApiException) {
                ApiException apiException = (ApiException) task.getException();
                intent2.putExtra("com.google.android.gms.common.api.AutoResolveHelper.status", new Status(apiException.g(), apiException.getMessage(), (PendingIntent) null));
            } else {
                if (Log.isLoggable("AutoResolveHelper", 6)) {
                    Log.e("AutoResolveHelper", "Unexpected non API exception!", task.getException());
                }
                intent2.putExtra("com.google.android.gms.common.api.AutoResolveHelper.status", new Status(8, "Unexpected non API exception when trying to deliver the task result to an activity!"));
            }
            PendingIntent createPendingResult2 = activity.createPendingResult(i4, intent2, 1073741824);
            if (createPendingResult2 == null) {
                return;
            }
            try {
                createPendingResult2.send(i);
            } catch (PendingIntent.CanceledException e4) {
                if (Log.isLoggable("AutoResolveHelper", 6)) {
                    Log.e("AutoResolveHelper", "Exception sending pending result", e4);
                }
            }
        }

        @Override // android.app.Fragment
        public final void onCreate(@Nullable Bundle bundle) {
            super.onCreate(bundle);
            this.b = getArguments().getInt("requestCode");
            if (fj5.b != getArguments().getLong("initializationElapsedRealtime")) {
                this.c = null;
            } else {
                this.c = a.f.get(getArguments().getInt("resolveCallId"));
            }
            this.d = bundle != null && bundle.getBoolean("delivered");
        }

        @Override // android.app.Fragment
        public final void onPause() {
            super.onPause();
            a<?> aVar = this.c;
            if (aVar == null || aVar.c != this) {
                return;
            }
            aVar.c = null;
        }

        @Override // android.app.Fragment
        public final void onResume() {
            super.onResume();
            a<?> aVar = this.c;
            if (aVar == null) {
                a(null);
            } else {
                aVar.c = this;
                aVar.a();
            }
        }

        @Override // android.app.Fragment
        public final void onSaveInstanceState(Bundle bundle) {
            super.onSaveInstanceState(bundle);
            bundle.putBoolean("delivered", this.d);
            a<?> aVar = this.c;
            if (aVar == null || aVar.c != this) {
                return;
            }
            aVar.c = null;
        }
    }
}
