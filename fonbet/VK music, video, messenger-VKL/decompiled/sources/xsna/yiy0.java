package xsna;

import android.annotation.SuppressLint;
import android.content.Context;
import android.os.AsyncTask;
import java.io.FileInputStream;

/* loaded from: classes13.dex */
public final class yiy0 extends AsyncTask<Context, Integer, Boolean> {
    public static volatile boolean a = false;

    @SuppressLint({"NewApi"})
    public static void a() {
        if (a) {
            return;
        }
        Context context = rdi.j;
        if (context == null) {
            n34.b("yiy0");
            return;
        }
        a = true;
        long j = cxy0.a(context).getLong("lastCheckTime", 0L);
        long currentTimeMillis = System.currentTimeMillis();
        if (currentTimeMillis - j <= 432000000) {
            n34.b("yiy0");
            return;
        }
        cxy0.a(context).edit().putLong("lastCheckTime", currentTimeMillis).apply();
        n34.b("yiy0");
        new yiy0().executeOnExecutor(AsyncTask.THREAD_POOL_EXECUTOR, rdi.j);
    }

    @Override // android.os.AsyncTask
    public final Boolean doInBackground(Context[] contextArr) {
        FileInputStream fileInputStream;
        Context[] contextArr2 = contextArr;
        System.currentTimeMillis();
        try {
            fileInputStream = xd7.j(contextArr2[0]);
        } catch (Exception e) {
            n34.e("yiy0", "doInBackground: exception : " + e.getMessage());
            fileInputStream = null;
        }
        System.currentTimeMillis();
        if (fileInputStream == null) {
            return Boolean.FALSE;
        }
        s770.e(fileInputStream);
        return Boolean.TRUE;
    }

    @Override // android.os.AsyncTask
    public final void onPostExecute(Boolean bool) {
        if (bool.booleanValue()) {
            n34.b("yiy0");
        } else {
            n34.e("yiy0", "onPostExecute: upate failed");
        }
    }

    @Override // android.os.AsyncTask
    public final void onProgressUpdate(Integer[] numArr) {
        n34.b("yiy0");
    }

    @Override // android.os.AsyncTask
    public final void onPreExecute() {
    }
}
