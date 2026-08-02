package xsna;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import com.google.android.gms.tasks.OnCanceledListener;
import com.google.android.gms.tasks.OnFailureListener;
import com.google.android.gms.tasks.OnSuccessListener;
import com.google.android.gms.tasks.Task;
import com.google.android.gms.tasks.Tasks;
import com.mbridge.msdk.playercommon.exoplayer2.C;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.util.HashMap;
import java.util.concurrent.Callable;
import java.util.concurrent.CountDownLatch;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.Executor;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.TimeoutException;
import org.json.JSONException;
import org.json.JSONObject;

/* compiled from: ConfigCacheClient.java */
/* loaded from: classes.dex */
public final class ixi {
    public static final HashMap d = new HashMap();
    public static final ddk e = new ddk();
    public final Executor a;
    public final uxi b;

    @Nullable
    public Task<com.google.firebase.remoteconfig.internal.a> c = null;

    /* compiled from: ConfigCacheClient.java */
    /* loaded from: classes13.dex */
    public static class a<TResult> implements OnSuccessListener<TResult>, OnFailureListener, OnCanceledListener {
        public final CountDownLatch a = new CountDownLatch(1);

        public final boolean a() throws InterruptedException {
            return this.a.await(5L, TimeUnit.SECONDS);
        }

        @Override // com.google.android.gms.tasks.OnCanceledListener
        public final void onCanceled() {
            this.a.countDown();
        }

        @Override // com.google.android.gms.tasks.OnFailureListener
        public final void onFailure(@NonNull Exception exc) {
            this.a.countDown();
        }

        @Override // com.google.android.gms.tasks.OnSuccessListener
        public final void onSuccess(TResult tresult) {
            this.a.countDown();
        }
    }

    public ixi(Executor executor, uxi uxiVar) {
        this.a = executor;
        this.b = uxiVar;
    }

    public static Object a(Task task) throws ExecutionException, InterruptedException, TimeoutException {
        TimeUnit timeUnit = TimeUnit.SECONDS;
        a aVar = new a();
        Executor executor = e;
        task.addOnSuccessListener(executor, aVar);
        task.addOnFailureListener(executor, aVar);
        task.addOnCanceledListener(executor, aVar);
        if (!aVar.a()) {
            throw new TimeoutException("Task await timed out.");
        }
        if (task.isSuccessful()) {
            return task.getResult();
        }
        throw new ExecutionException(task.getException());
    }

    public final synchronized Task<com.google.firebase.remoteconfig.internal.a> b() {
        try {
            Task<com.google.firebase.remoteconfig.internal.a> task = this.c;
            if (task != null) {
                if (task.isComplete() && !this.c.isSuccessful()) {
                }
            }
            Executor executor = this.a;
            final uxi uxiVar = this.b;
            this.c = Tasks.call(executor, new Callable() { // from class: xsna.fxi
                @Override // java.util.concurrent.Callable
                public final Object call() {
                    FileInputStream fileInputStream;
                    Throwable th;
                    uxi uxiVar2 = uxi.this;
                    synchronized (uxiVar2) {
                        try {
                            fileInputStream = uxiVar2.a.openFileInput(uxiVar2.b);
                        } catch (FileNotFoundException | JSONException unused) {
                            fileInputStream = null;
                        } catch (Throwable th2) {
                            fileInputStream = null;
                            th = th2;
                        }
                        try {
                            int available = fileInputStream.available();
                            byte[] bArr = new byte[available];
                            fileInputStream.read(bArr, 0, available);
                            com.google.firebase.remoteconfig.internal.a a2 = com.google.firebase.remoteconfig.internal.a.a(new JSONObject(new String(bArr, C.UTF8_NAME)));
                            fileInputStream.close();
                            return a2;
                        } catch (FileNotFoundException | JSONException unused2) {
                            if (fileInputStream != null) {
                                fileInputStream.close();
                            }
                            return null;
                        } catch (Throwable th3) {
                            th = th3;
                            if (fileInputStream != null) {
                                fileInputStream.close();
                            }
                            throw th;
                        }
                    }
                }
            });
        } catch (Throwable th) {
            throw th;
        }
        return this.c;
    }
}
