package com.adjust.sdk.scheduler;

import android.os.Handler;
import android.os.Looper;
import java.util.concurrent.Executors;

/* loaded from: classes.dex */
public abstract class AsyncTaskExecutor<Params, Result> {

    public class a implements Runnable {
        public final /* synthetic */ Object[] a;
        public final /* synthetic */ Handler b;

        /* renamed from: com.adjust.sdk.scheduler.AsyncTaskExecutor$a$a, reason: collision with other inner class name */
        public class RunnableC0030a implements Runnable {
            public final /* synthetic */ Object a;

            public RunnableC0030a(Object obj) {
                this.a = obj;
            }

            /* JADX WARN: Multi-variable type inference failed */
            @Override // java.lang.Runnable
            public final void run() {
                AsyncTaskExecutor.this.onPostExecute(this.a);
            }
        }

        public a(Object[] objArr, Handler handler) {
            this.a = objArr;
            this.b = handler;
        }

        /* JADX WARN: Multi-variable type inference failed */
        @Override // java.lang.Runnable
        public final void run() {
            this.b.post(new RunnableC0030a(AsyncTaskExecutor.this.doInBackground(this.a)));
        }
    }

    public abstract Result doInBackground(Params[] paramsArr);

    @SafeVarargs
    public final AsyncTaskExecutor<Params, Result> execute(Params... paramsArr) {
        onPreExecute();
        Executors.newSingleThreadExecutor().execute(new a(paramsArr, new Handler(Looper.getMainLooper())));
        return this;
    }

    public void onPostExecute(Result result) {
    }

    public void onPreExecute() {
    }
}
