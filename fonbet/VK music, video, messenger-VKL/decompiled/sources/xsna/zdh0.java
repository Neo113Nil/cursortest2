package xsna;

import android.content.Context;
import android.database.ContentObserver;
import android.database.Cursor;
import android.net.Uri;
import com.vk.core.files.ExternalDirType;
import com.vk.permission.PermissionHelper;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.CopyOnWriteArrayList;
import java.util.concurrent.Executor;
import java.util.concurrent.locks.ReentrantLock;

/* compiled from: ScreenshotDetector.kt */
/* loaded from: classes5.dex */
public final class zdh0 {
    public final Context a;
    public final Executor b;
    public boolean c;
    public final CopyOnWriteArrayList<b> d = new CopyOnWriteArrayList<>();
    public final bpn0 e = new bpn0(new e550(this, 22));
    public final ReentrantLock f = new ReentrantLock(true);
    public volatile long g;

    /* compiled from: ScreenshotDetector.kt */
    public final class a extends ContentObserver {
        public final Uri a;

        public a(Uri uri) {
            super(null);
            this.a = uri;
        }

        @Override // android.database.ContentObserver
        public final void onChange(boolean z) {
            PermissionHelper permissionHelper = PermissionHelper.a;
            zdh0 zdh0Var = zdh0.this;
            Context context = zdh0Var.a;
            permissionHelper.getClass();
            if (PermissionHelper.q(context)) {
                zdh0Var.b.execute(new eo1(6, zdh0Var, this.a));
            }
        }
    }

    /* compiled from: ScreenshotDetector.kt */
    public interface b {
        void a(Throwable th);

        void b(Uri uri);
    }

    public zdh0(Executor executor, Context context) {
        this.a = context;
        this.b = executor;
    }

    public final synchronized void a(b bVar) {
        this.d.add(bVar);
        if (!this.c) {
            this.c = true;
            this.g = System.currentTimeMillis();
            for (a aVar : (List) this.e.getValue()) {
                this.a.getContentResolver().registerContentObserver(aVar.a, true, aVar);
            }
        }
    }

    public final void b(Uri uri) {
        Cursor query = this.a.getContentResolver().query(uri, new String[]{"_data", "_display_name", "title", "date_added"}, "date_added > " + (this.g / 1000), null, "date_added DESC");
        if (query != null) {
            while (query.moveToNext()) {
                try {
                    d(query);
                } finally {
                }
            }
            s3q0 s3q0Var = s3q0.a;
            query.close();
        }
    }

    public final io.reactivex.rxjava3.internal.operators.observable.q c() {
        return new io.reactivex.rxjava3.internal.operators.observable.q(new z250(this, 6));
    }

    public final void d(Cursor cursor) {
        String string = cursor.isNull(0) ? "" : cursor.getString(0);
        String string2 = cursor.isNull(1) ? "" : cursor.getString(1);
        String string3 = cursor.isNull(2) ? "" : cursor.getString(2);
        long j = cursor.isNull(3) ? -1L : cursor.getLong(3) * 1000;
        if (drm0.D(string, ExternalDirType.IMAGES.i(), false)) {
            return;
        }
        if ((drm0.D(string, "screenshot", true) || drm0.D(string2, "screenshot", true) || drm0.D(string3, "screenshot", true)) && j > 0) {
            this.g = j;
            Iterator<b> it = this.d.iterator();
            while (it.hasNext()) {
                it.next().b(Uri.parse(string));
            }
        }
    }

    public final synchronized void e(b bVar) {
        this.d.remove(bVar);
        if (this.c && this.d.isEmpty()) {
            this.c = false;
            Iterator it = ((List) this.e.getValue()).iterator();
            while (it.hasNext()) {
                this.a.getContentResolver().unregisterContentObserver((a) it.next());
            }
        }
    }
}
