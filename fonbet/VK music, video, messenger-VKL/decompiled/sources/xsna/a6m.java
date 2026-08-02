package xsna;

import android.content.Context;
import android.content.pm.PackageInfo;
import android.content.pm.ProviderInfo;
import android.database.Cursor;
import android.net.Uri;
import com.unity3d.ads.core.domain.HandleInvocationsFromAdViewer;
import com.vk.log.L;
import com.vk.log.LoggerOutputTarget;
import java.util.ArrayList;
import java.util.Iterator;
import kotlin.Result;
import kotlin.collections.EmptyList;

/* compiled from: DeviceIdContentResolver.kt */
/* loaded from: classes18.dex */
public final class a6m {
    public static final a6m a = new a6m();

    public static boolean a(Cursor cursor, String str) {
        if (cursor == null) {
            L l = L.a;
            l.getClass();
            if (!L.m(LoggerOutputTarget.NONE)) {
                L.u(l, L.LogType.w, new Object[]{fo8.a(str, ": cannot query data")});
                return false;
            }
        } else if (cursor.getCount() == 0) {
            L l2 = L.a;
            l2.getClass();
            if (!L.m(LoggerOutputTarget.NONE)) {
                L.u(l2, L.LogType.i, new Object[]{fo8.a(str, ": cursor is empty, has device id generated yet?")});
                return false;
            }
        } else {
            if (cursor.getCount() <= 1) {
                return true;
            }
            L l3 = L.a;
            l3.getClass();
            if (!L.m(LoggerOutputTarget.NONE)) {
                L.u(l3, L.LogType.w, new Object[]{fo8.a(str, ": cursor returned more than one entry, refusing to use it")});
                return false;
            }
        }
        return false;
    }

    /* JADX WARN: Removed duplicated region for block: B:54:0x0146 A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:57:? A[LOOP:2: B:42:0x0093->B:57:?, LOOP_END, SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static String b(Context context) {
        Object failure;
        a6m a6mVar;
        String str;
        Cursor query;
        ProviderInfo providerInfo;
        try {
            failure = j5g.D0(new z5m(0), context.getPackageManager().getInstalledPackages(8));
        } catch (Throwable th) {
            failure = new Result.Failure(th);
        }
        Throwable a2 = Result.a(failure);
        if (a2 != null) {
            L.g("Something wrong with querying installed packages", a2);
        }
        EmptyList emptyList = EmptyList.b;
        if (failure instanceof Result.Failure) {
            failure = emptyList;
        }
        ArrayList arrayList = new ArrayList();
        Iterator it = ((Iterable) failure).iterator();
        while (true) {
            boolean hasNext = it.hasNext();
            a6mVar = a;
            String str2 = null;
            if (!hasNext) {
                break;
            }
            PackageInfo packageInfo = (PackageInfo) it.next();
            String str3 = packageInfo.packageName;
            if (!str3.equals(context.getPackageName())) {
                a6mVar.getClass();
                String concat = str3.concat(".DeviceIdContentProvider");
                ProviderInfo[] providerInfoArr = packageInfo.providers;
                if (providerInfoArr != null) {
                    int length = providerInfoArr.length;
                    int i = 0;
                    while (true) {
                        if (i < length) {
                            providerInfo = providerInfoArr[i];
                            if (epx.f(providerInfo != null ? providerInfo.authority : null, concat) && !str3.equals(context.getPackageName())) {
                                break;
                            }
                            i++;
                        } else {
                            providerInfo = null;
                            break;
                        }
                    }
                    if (providerInfo != null) {
                        str2 = providerInfo.packageName;
                    }
                }
            }
            if (str2 != null) {
                arrayList.add(str2);
            }
        }
        Iterator it2 = arrayList.iterator();
        while (it2.hasNext()) {
            String str4 = (String) it2.next();
            try {
                query = context.getContentResolver().query(Uri.withAppendedPath(new Uri.Builder().scheme(HandleInvocationsFromAdViewer.KEY_PRIVACY_UPDATE_CONTENT).authority(str4 + ".DeviceIdContentProvider").build(), "state"), new String[]{"device_id"}, null, null, null, null);
                try {
                    a6mVar.getClass();
                } catch (Throwable th2) {
                    try {
                        throw th2;
                    } catch (Throwable th3) {
                        ro.e(query, th2);
                        throw th3;
                    }
                }
            } catch (Exception unused) {
                L l = L.a;
                l.getClass();
                if (!L.m(LoggerOutputTarget.NONE)) {
                    L.u(l, L.LogType.w, new Object[]{fo8.a(str4, ": content resolver threw an exception")});
                }
            }
            if (a(query, str4)) {
                query.moveToFirst();
                int columnIndex = query.getColumnIndex("device_id");
                if (columnIndex == -1) {
                    L l2 = L.a;
                    l2.getClass();
                    if (!L.m(LoggerOutputTarget.NONE)) {
                        L.u(l2, L.LogType.w, new Object[]{fo8.a(str4, ": no device_id column")});
                    }
                    str = null;
                } else {
                    str = query.getString(columnIndex);
                }
                query.close();
                if (str == null) {
                }
            } else {
                ro.e(query, null);
                str = null;
                if (str == null) {
                    return str;
                }
            }
        }
        return null;
    }
}
