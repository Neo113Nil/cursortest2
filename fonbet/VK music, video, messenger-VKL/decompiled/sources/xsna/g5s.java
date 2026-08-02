package xsna;

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
import com.ironsource.X3;
import com.unity3d.ads.core.domain.HandleInvocationsFromAdViewer;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.Objects;
import xsna.d6s;

/* compiled from: FontProvider.java */
/* loaded from: classes11.dex */
public final class g5s {
    public static final m900<a, ProviderInfo> a = new m900<>(2);
    public static final f5s b = new f5s();

    /* compiled from: FontProvider.java */
    public static class a {
        public String a;
        public String b;
        public List<List<byte[]>> c;

        public a() {
            throw null;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof a)) {
                return false;
            }
            a aVar = (a) obj;
            return Objects.equals(this.a, aVar.a) && Objects.equals(this.b, aVar.b) && Objects.equals(this.c, aVar.c);
        }

        public final int hashCode() {
            return Objects.hash(this.a, this.b, this.c);
        }
    }

    public static d6s.a a(Context context, List list) throws PackageManager.NameNotFoundException {
        String str;
        Typeface c;
        Trace.beginSection(ndp0.f("FontProvider.getFontFamilyResult"));
        try {
            ArrayList arrayList = new ArrayList();
            for (int i = 0; i < list.size(); i++) {
                j5s j5sVar = (j5s) list.get(i);
                if (Build.VERSION.SDK_INT < 31 || (c = aup0.c((str = j5sVar.e))) == null || aup0.d(c) == null) {
                    ProviderInfo b2 = b(context.getPackageManager(), j5sVar, context.getResources());
                    if (b2 == null) {
                        return new d6s.a();
                    }
                    arrayList.add(c(context, j5sVar, b2.authority));
                } else {
                    arrayList.add(new d6s.b[]{new d6s.b(str, j5sVar.f)});
                }
            }
            return new d6s.a(arrayList);
        } finally {
            Trace.endSection();
        }
    }

    public static ProviderInfo b(PackageManager packageManager, j5s j5sVar, Resources resources) throws PackageManager.NameNotFoundException {
        f5s f5sVar = b;
        m900<a, ProviderInfo> m900Var = a;
        Trace.beginSection(ndp0.f("FontProvider.getProvider"));
        try {
            List<List<byte[]>> list = j5sVar.d;
            String str = j5sVar.a;
            String str2 = j5sVar.b;
            if (list == null) {
                list = p5s.b(resources, 0);
            }
            a aVar = new a();
            aVar.a = str;
            aVar.b = str2;
            aVar.c = list;
            ProviderInfo providerInfo = m900Var.get(aVar);
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
            Collections.sort(arrayList, f5sVar);
            for (int i = 0; i < list.size(); i++) {
                ArrayList arrayList2 = new ArrayList(list.get(i));
                Collections.sort(arrayList2, f5sVar);
                if (arrayList.size() == arrayList2.size()) {
                    for (int i2 = 0; i2 < arrayList.size(); i2++) {
                        if (!Arrays.equals((byte[]) arrayList.get(i2), (byte[]) arrayList2.get(i2))) {
                            break;
                        }
                    }
                    m900Var.put(aVar, resolveContentProvider);
                    return resolveContentProvider;
                }
            }
            Trace.endSection();
            return null;
        } finally {
            Trace.endSection();
        }
    }

    public static d6s.b[] c(Context context, j5s j5sVar, String str) {
        ContentProviderClient contentProviderClient;
        ContentProviderClient contentProviderClient2;
        ContentProviderClient contentProviderClient3;
        Uri withAppendedId;
        Trace.beginSection(ndp0.f("FontProvider.query"));
        try {
            ArrayList arrayList = new ArrayList();
            Uri build = new Uri.Builder().scheme(HandleInvocationsFromAdViewer.KEY_PRIVACY_UPDATE_CONTENT).authority(str).build();
            Uri build2 = new Uri.Builder().scheme(HandleInvocationsFromAdViewer.KEY_PRIVACY_UPDATE_CONTENT).authority(str).appendPath(X3.i.b).build();
            ContentProviderClient acquireUnstableContentProviderClient = context.getContentResolver().acquireUnstableContentProviderClient(build);
            Cursor cursor = null;
            try {
                String[] strArr = {"_id", "file_id", "font_ttc_index", "font_variation_settings", "font_weight", "font_italic", "result_code"};
                Trace.beginSection(ndp0.f("ContentQueryWrapper.query"));
                try {
                    try {
                        String[] strArr2 = {j5sVar.c};
                        if (acquireUnstableContentProviderClient != null) {
                            try {
                                cursor = acquireUnstableContentProviderClient.query(build, strArr, "query = ?", strArr2, null, null);
                            } catch (RemoteException unused) {
                            }
                        }
                        if (cursor == null || cursor.getCount() <= 0) {
                            contentProviderClient2 = acquireUnstableContentProviderClient;
                        } else {
                            int columnIndex = cursor.getColumnIndex("result_code");
                            ArrayList arrayList2 = new ArrayList();
                            int columnIndex2 = cursor.getColumnIndex("_id");
                            int columnIndex3 = cursor.getColumnIndex("file_id");
                            int columnIndex4 = cursor.getColumnIndex("font_ttc_index");
                            int columnIndex5 = cursor.getColumnIndex("font_weight");
                            int columnIndex6 = cursor.getColumnIndex("font_italic");
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
                                arrayList2.add(new d6s.b(withAppendedId, i2, columnIndex5 != -1 ? cursor.getInt(columnIndex5) : 400, columnIndex6 != -1 && cursor.getInt(columnIndex6) == 1, j5sVar.f, i));
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
                        return (d6s.b[]) arrayList.toArray(new d6s.b[0]);
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
