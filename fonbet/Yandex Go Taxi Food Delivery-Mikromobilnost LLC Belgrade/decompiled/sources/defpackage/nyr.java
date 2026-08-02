package defpackage;

import android.content.ContentProviderClient;
import android.content.ContentUris;
import android.content.Context;
import android.content.pm.PackageManager;
import android.content.pm.ProviderInfo;
import android.content.pm.Signature;
import android.content.res.Resources;
import android.database.Cursor;
import android.graphics.Typeface;
import android.net.Uri;
import android.os.Build;
import android.os.RemoteException;
import android.os.Trace;
import androidx.core.provider.FontsContractCompat$Columns;
import com.adjust.sdk.Constants;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.Collections;
import java.util.List;
import ru.yandex.common.clid.ClidProvider;

/* loaded from: classes10.dex */
public abstract class nyr {
    public static final mzz a = new mzz(2);
    public static final y60 b = new y60(16);

    public static nzr a(Context context, List list) {
        String str;
        Typeface e;
        Trace.beginSection(ffx.f0("FontProvider.getFontFamilyResult"));
        try {
            ArrayList arrayList = new ArrayList();
            for (int i = 0; i < list.size(); i++) {
                pyr pyrVar = (pyr) list.get(i);
                if (Build.VERSION.SDK_INT < 31 || (e = ep11.e((str = pyrVar.f))) == null || ep11.f(e) == null) {
                    ProviderInfo b2 = b(context.getPackageManager(), pyrVar, context.getResources());
                    if (b2 == null) {
                        return new nzr();
                    }
                    arrayList.add(c(context, pyrVar, b2.authority));
                } else {
                    arrayList.add(new ozr[]{new ozr(str, pyrVar.g)});
                }
            }
            return new nzr(arrayList);
        } finally {
            Trace.endSection();
        }
    }

    public static ProviderInfo b(PackageManager packageManager, pyr pyrVar, Resources resources) {
        y60 y60Var = b;
        mzz mzzVar = a;
        Trace.beginSection(ffx.f0("FontProvider.getProvider"));
        try {
            List list = pyrVar.d;
            String str = pyrVar.a;
            String str2 = pyrVar.b;
            if (list == null) {
                list = jx81.H(resources, pyrVar.e);
            }
            myr myrVar = new myr();
            myrVar.a = str;
            myrVar.b = str2;
            myrVar.c = list;
            ProviderInfo providerInfo = (ProviderInfo) mzzVar.c(myrVar);
            if (providerInfo != null) {
                return providerInfo;
            }
            ProviderInfo resolveContentProvider = packageManager.resolveContentProvider(str, 0);
            if (resolveContentProvider == null) {
                throw new PackageManager.NameNotFoundException("No package found for authority: " + str);
            }
            if (!resolveContentProvider.packageName.equals(str2)) {
                throw new PackageManager.NameNotFoundException("Found content provider " + str + ", but package was not " + str2);
            }
            Signature[] signatureArr = packageManager.getPackageInfo(resolveContentProvider.packageName, 64).signatures;
            ArrayList arrayList = new ArrayList();
            for (Signature signature : signatureArr) {
                arrayList.add(signature.toByteArray());
            }
            Collections.sort(arrayList, y60Var);
            for (int i = 0; i < list.size(); i++) {
                ArrayList arrayList2 = new ArrayList((Collection) list.get(i));
                Collections.sort(arrayList2, y60Var);
                if (arrayList.size() == arrayList2.size()) {
                    for (int i2 = 0; i2 < arrayList.size(); i2++) {
                        if (!Arrays.equals((byte[]) arrayList.get(i2), (byte[]) arrayList2.get(i2))) {
                            break;
                        }
                    }
                    mzzVar.d(myrVar, resolveContentProvider);
                    return resolveContentProvider;
                }
            }
            Trace.endSection();
            return null;
        } finally {
            Trace.endSection();
        }
    }

    public static ozr[] c(Context context, pyr pyrVar, String str) {
        ContentProviderClient contentProviderClient;
        ContentProviderClient contentProviderClient2;
        ContentProviderClient contentProviderClient3;
        Uri withAppendedId;
        Trace.beginSection(ffx.f0("FontProvider.query"));
        try {
            ArrayList arrayList = new ArrayList();
            Uri build = new Uri.Builder().scheme("content").authority(str).build();
            Uri build2 = new Uri.Builder().scheme("content").authority(str).appendPath("file").build();
            ContentProviderClient acquireUnstableContentProviderClient = context.getContentResolver().acquireUnstableContentProviderClient(build);
            Cursor cursor = null;
            try {
                String[] strArr = {ClidProvider._ID, FontsContractCompat$Columns.FILE_ID, FontsContractCompat$Columns.TTC_INDEX, FontsContractCompat$Columns.VARIATION_SETTINGS, FontsContractCompat$Columns.WEIGHT, FontsContractCompat$Columns.ITALIC, FontsContractCompat$Columns.RESULT_CODE};
                Trace.beginSection(ffx.f0("ContentQueryWrapper.query"));
                try {
                    try {
                        String[] strArr2 = {pyrVar.c};
                        if (acquireUnstableContentProviderClient != null) {
                            try {
                                cursor = acquireUnstableContentProviderClient.query(build, strArr, "query = ?", strArr2, null, null);
                            } catch (RemoteException unused) {
                            }
                        }
                        if (cursor == null || cursor.getCount() <= 0) {
                            contentProviderClient2 = acquireUnstableContentProviderClient;
                        } else {
                            int columnIndex = cursor.getColumnIndex(FontsContractCompat$Columns.RESULT_CODE);
                            ArrayList arrayList2 = new ArrayList();
                            int columnIndex2 = cursor.getColumnIndex(ClidProvider._ID);
                            int columnIndex3 = cursor.getColumnIndex(FontsContractCompat$Columns.FILE_ID);
                            int columnIndex4 = cursor.getColumnIndex(FontsContractCompat$Columns.TTC_INDEX);
                            int columnIndex5 = cursor.getColumnIndex(FontsContractCompat$Columns.WEIGHT);
                            int columnIndex6 = cursor.getColumnIndex(FontsContractCompat$Columns.ITALIC);
                            while (cursor.moveToNext()) {
                                int i = columnIndex != -1 ? cursor.getInt(columnIndex) : 0;
                                int i2 = columnIndex4 != -1 ? cursor.getInt(columnIndex4) : 0;
                                if (columnIndex3 == -1) {
                                    contentProviderClient3 = acquireUnstableContentProviderClient;
                                    withAppendedId = ContentUris.withAppendedId(build, cursor.getLong(columnIndex2));
                                } else {
                                    contentProviderClient3 = acquireUnstableContentProviderClient;
                                    withAppendedId = ContentUris.withAppendedId(build2, cursor.getLong(columnIndex3));
                                }
                                arrayList2.add(new ozr(withAppendedId, i2, columnIndex5 != -1 ? cursor.getInt(columnIndex5) : Constants.MINIMAL_ERROR_STATUS_CODE, columnIndex6 != -1 && cursor.getInt(columnIndex6) == 1, i));
                                acquireUnstableContentProviderClient = contentProviderClient3;
                            }
                            contentProviderClient2 = acquireUnstableContentProviderClient;
                            arrayList = arrayList2;
                        }
                        if (cursor != null) {
                            cursor.close();
                        }
                        if (contentProviderClient2 != null) {
                            contentProviderClient2.close();
                        }
                        return (ozr[]) arrayList.toArray(new ozr[0]);
                    } finally {
                    }
                } catch (Throwable th) {
                    th = th;
                    contentProviderClient = context;
                    if (cursor != null) {
                        cursor.close();
                    }
                    if (contentProviderClient != null) {
                        contentProviderClient.close();
                    }
                    throw th;
                }
            } catch (Throwable th2) {
                th = th2;
                contentProviderClient = acquireUnstableContentProviderClient;
            }
        } finally {
            Trace.endSection();
        }
    }
}
