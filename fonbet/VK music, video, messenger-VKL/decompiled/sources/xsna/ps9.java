package xsna;

import android.content.AsyncQueryHandler;
import android.content.BroadcastReceiver;
import android.content.ContentResolver;
import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;
import android.database.Cursor;
import android.net.Uri;
import android.os.Build;
import android.util.Log;
import com.unity3d.ads.core.domain.HandleInvocationsFromAdViewer;
import com.vk.catalog2.common.ui.mvp.auto.VKAndroidAutoCatalogMediaService;

/* compiled from: CarConnectionTypeLiveData.java */
/* loaded from: classes11.dex */
public final class ps9 extends androidx.lifecycle.n<Integer> {
    public static final Uri o = new Uri.Builder().scheme(HandleInvocationsFromAdViewer.KEY_PRIVACY_UPDATE_CONTENT).authority("androidx.car.app.connection").build();
    public final VKAndroidAutoCatalogMediaService l;
    public final c m;
    public final b n = new b();

    /* compiled from: CarConnectionTypeLiveData.java */
    public static class a {
        public static void a(Context context, BroadcastReceiver broadcastReceiver, IntentFilter intentFilter) {
            context.registerReceiver(broadcastReceiver, intentFilter, 2);
        }
    }

    /* compiled from: CarConnectionTypeLiveData.java */
    public class b extends BroadcastReceiver {
        public b() {
        }

        @Override // android.content.BroadcastReceiver
        public final void onReceive(Context context, Intent intent) {
            ps9.this.m.startQuery(42, null, ps9.o, new String[]{"CarConnectionState"}, null, null, null);
        }
    }

    /* compiled from: CarConnectionTypeLiveData.java */
    public class c extends AsyncQueryHandler {
        public c(ContentResolver contentResolver) {
            super(contentResolver);
        }

        @Override // android.content.AsyncQueryHandler
        public final void onQueryComplete(int i, Object obj, Cursor cursor) {
            ps9 ps9Var = ps9.this;
            if (cursor == null) {
                ps9Var.i(0);
                return;
            }
            int columnIndex = cursor.getColumnIndex("CarConnectionState");
            if (columnIndex < 0) {
                Log.e("CarApp.Conn", "Connection to car response is missing the connection type, treating as disconnected");
                ps9Var.i(0);
            } else if (cursor.moveToNext()) {
                ps9Var.i(Integer.valueOf(cursor.getInt(columnIndex)));
            } else {
                Log.e("CarApp.Conn", "Connection to car response is empty, treating as disconnected");
                ps9Var.i(0);
            }
        }
    }

    public ps9(VKAndroidAutoCatalogMediaService vKAndroidAutoCatalogMediaService) {
        this.l = vKAndroidAutoCatalogMediaService;
        this.m = new c(vKAndroidAutoCatalogMediaService.getContentResolver());
    }

    @Override // androidx.lifecycle.n
    public final void g() {
        IntentFilter intentFilter = new IntentFilter("androidx.car.app.connection.action.CAR_CONNECTION_UPDATED");
        int i = Build.VERSION.SDK_INT;
        b bVar = this.n;
        VKAndroidAutoCatalogMediaService vKAndroidAutoCatalogMediaService = this.l;
        if (i >= 33) {
            a.a(vKAndroidAutoCatalogMediaService, bVar, intentFilter);
        } else {
            vKAndroidAutoCatalogMediaService.registerReceiver(bVar, intentFilter);
        }
        this.m.startQuery(42, null, o, new String[]{"CarConnectionState"}, null, null, null);
    }

    @Override // androidx.lifecycle.n
    public final void h() {
        this.l.unregisterReceiver(this.n);
        this.m.cancelOperation(42);
    }
}
