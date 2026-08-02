package defpackage;

import android.content.ContentProviderClient;
import android.content.Context;
import android.content.pm.ApplicationInfo;
import android.content.pm.ProviderInfo;
import android.database.Cursor;
import android.database.MatrixCursor;
import android.net.Uri;
import android.os.IBinder;
import android.os.IInterface;
import android.os.RemoteException;
import android.os.SystemClock;
import android.util.Log;
import com.google.android.gms.common.b;
import com.google.android.gms.dynamic.IObjectWrapper;
import com.google.android.gms.dynamic.ObjectWrapper;
import com.google.android.gms.dynamite.DynamiteModule$DynamiteLoaderClassLoader;
import com.google.android.gms.dynamite.DynamiteModule$LoadingException;
import com.google.android.gms.dynamite.zzp;
import com.google.android.gms.dynamite.zzq;
import dalvik.system.DelegateLastClassLoader;
import java.lang.reflect.Field;
import java.lang.reflect.InvocationTargetException;
import ru.CryptoPro.JCP.tools.CertReader.Extension;
import ru.CryptoPro.JCP.tools.SelfTester_JCP;
import ru.CryptoPro.JCSP.MSCAPI.HProv;

/* loaded from: classes.dex */
public final class gan {
    public static final op91 b;
    public static final xp91 c;
    public static final sp91 d;
    public static final dq91 e;
    public static Boolean f = null;
    public static String g = null;
    public static boolean h = false;
    public static int i = -1;
    public static Boolean j;
    public static final ThreadLocal k = new ThreadLocal();
    public static final wc2 l = new wc2(9);
    public static final xp91 m = new xp91(1);
    public static zzp n;
    public static zzq o;
    public final Context a;

    static {
        int i2 = 5;
        b = new op91(i2);
        c = new xp91(i2);
        int i3 = 6;
        d = new sp91(i3);
        e = new dq91(i3);
    }

    public gan(Context context) {
        this.a = context;
    }

    public static int a(Context context, String str) {
        try {
            ClassLoader classLoader = context.getApplicationContext().getClassLoader();
            StringBuilder sb = new StringBuilder(String.valueOf(str).length() + 61);
            sb.append("com.google.android.gms.dynamite.descriptors.");
            sb.append(str);
            sb.append(".ModuleDescriptor");
            Class<?> loadClass = classLoader.loadClass(sb.toString());
            Field declaredField = loadClass.getDeclaredField("MODULE_ID");
            Field declaredField2 = loadClass.getDeclaredField("MODULE_VERSION");
            if (ooc.m(declaredField.get(null), str)) {
                return declaredField2.getInt(null);
            }
            String valueOf = String.valueOf(declaredField.get(null));
            StringBuilder sb2 = new StringBuilder(valueOf.length() + 50 + String.valueOf(str).length() + 1);
            sb2.append("Module descriptor id '");
            sb2.append(valueOf);
            sb2.append("' didn't match expected id '");
            sb2.append(str);
            sb2.append("'");
            Log.e("DynamiteModule", sb2.toString());
            return 0;
        } catch (ClassNotFoundException unused) {
            new StringBuilder(String.valueOf(str).length() + 45);
            return 0;
        } catch (Exception e2) {
            Log.e("DynamiteModule", "Failed to load module descriptor class: ".concat(String.valueOf(e2.getMessage())));
            return 0;
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:68:0x02bb A[DONT_GENERATE] */
    /* JADX WARN: Removed duplicated region for block: B:71:0x02ca A[DONT_GENERATE] */
    /* JADX WARN: Removed duplicated region for block: B:74:0x02c1 A[DONT_GENERATE] */
    /* JADX WARN: Type inference failed for: r4v0, types: [java.lang.String] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static gan c(Context context, fan fanVar, String str) {
        Context context2;
        int i2;
        gan ganVar;
        int i3;
        Boolean bool;
        IObjectWrapper zzg;
        zzq zzqVar;
        boolean z;
        ?? r4 = ":";
        Context applicationContext = context.getApplicationContext();
        if (applicationContext == null) {
            throw new DynamiteModule$LoadingException("null application Context");
        }
        ThreadLocal threadLocal = k;
        f3b1 f3b1Var = (f3b1) threadLocal.get();
        f3b1 f3b1Var2 = new f3b1();
        threadLocal.set(f3b1Var2);
        wc2 wc2Var = l;
        Long l2 = (Long) wc2Var.get();
        long longValue = l2.longValue();
        try {
            wc2Var.set(Long.valueOf(SystemClock.uptimeMillis()));
            ean b2 = fanVar.b(context, str, m);
            int i4 = b2.a;
            int i5 = b2.b;
            StringBuilder sb = new StringBuilder(String.valueOf(str).length() + 26 + String.valueOf(i4).length() + 19 + String.valueOf(str).length() + 1 + String.valueOf(i5).length());
            sb.append("Considering local module ");
            sb.append(str);
            sb.append(":");
            sb.append(i4);
            sb.append(" and remote module ");
            sb.append(str);
            sb.append(":");
            sb.append(i5);
            Log.i("DynamiteModule", sb.toString());
            int i6 = b2.c;
            if (i6 != 0) {
                if (i6 == -1) {
                    if (b2.a != 0) {
                        i6 = -1;
                    }
                }
                if (i6 != 1 || b2.b != 0) {
                    if (i6 == -1) {
                        Log.i("DynamiteModule", "Selected local version of ".concat(String.valueOf(str)));
                        gan ganVar2 = new gan(applicationContext);
                        if (longValue == 0) {
                            wc2Var.remove();
                        } else {
                            wc2Var.set(l2);
                        }
                        Cursor cursor = f3b1Var2.a;
                        if (cursor != null) {
                            cursor.close();
                        }
                        threadLocal.set(f3b1Var);
                        return ganVar2;
                    }
                    if (i6 != 1) {
                        StringBuilder sb2 = new StringBuilder(String.valueOf(i6).length() + 36);
                        sb2.append("VersionPolicy returned invalid code:");
                        sb2.append(i6);
                        throw new DynamiteModule$LoadingException(sb2.toString());
                    }
                    byte b3 = 0;
                    try {
                        try {
                            i3 = b2.b;
                        } catch (DynamiteModule$LoadingException e2) {
                            e = e2;
                            context2 = r4;
                            new StringBuilder(String.valueOf(e.getMessage()).length() + 30);
                            i2 = b2.a;
                            if (i2 != 0 || fanVar.b(context2, str, new dn60(i2, 18, b3)).c != -1) {
                                throw new DynamiteModule$LoadingException("Remote load failed. No local fallback found.", e);
                            }
                            Log.i("DynamiteModule", "Selected local version of ".concat(String.valueOf(str)));
                            ganVar = new gan(applicationContext);
                            return ganVar;
                        }
                    } catch (DynamiteModule$LoadingException e3) {
                        e = e3;
                        context2 = context;
                        new StringBuilder(String.valueOf(e.getMessage()).length() + 30);
                        i2 = b2.a;
                        if (i2 != 0) {
                        }
                        throw new DynamiteModule$LoadingException("Remote load failed. No local fallback found.", e);
                    }
                    try {
                        synchronized (gan.class) {
                            if (!e(context)) {
                                throw new DynamiteModule$LoadingException("Remote loading disabled");
                            }
                            bool = f;
                        }
                        if (bool == null) {
                            throw new DynamiteModule$LoadingException("Failed to determine which loading route to use.");
                        }
                        if (bool.booleanValue()) {
                            StringBuilder sb3 = new StringBuilder(String.valueOf(str).length() + 40 + String.valueOf(i3).length());
                            sb3.append("Selected remote version of ");
                            sb3.append(str);
                            sb3.append(", version >= ");
                            sb3.append(i3);
                            Log.i("DynamiteModule", sb3.toString());
                            synchronized (gan.class) {
                                zzqVar = o;
                            }
                            if (zzqVar == null) {
                                throw new DynamiteModule$LoadingException("DynamiteLoaderV2 was not cached.");
                            }
                            f3b1 f3b1Var3 = (f3b1) threadLocal.get();
                            if (f3b1Var3 == null || f3b1Var3.a == null) {
                                throw new DynamiteModule$LoadingException("No result cursor");
                            }
                            Context applicationContext2 = context.getApplicationContext();
                            Cursor cursor2 = f3b1Var3.a;
                            ObjectWrapper.wrap(null);
                            synchronized (gan.class) {
                                z = i >= 2;
                            }
                            Context context3 = (Context) ObjectWrapper.unwrap(z ? zzqVar.zzf(ObjectWrapper.wrap(applicationContext2), str, i3, ObjectWrapper.wrap(cursor2)) : zzqVar.zze(ObjectWrapper.wrap(applicationContext2), str, i3, ObjectWrapper.wrap(cursor2)));
                            if (context3 == null) {
                                throw new DynamiteModule$LoadingException("Failed to get module context");
                            }
                            ganVar = new gan(context3);
                        } else {
                            StringBuilder sb4 = new StringBuilder(String.valueOf(str).length() + 40 + String.valueOf(i3).length());
                            sb4.append("Selected remote version of ");
                            sb4.append(str);
                            sb4.append(", version >= ");
                            sb4.append(i3);
                            Log.i("DynamiteModule", sb4.toString());
                            zzp h2 = h(context);
                            if (h2 == null) {
                                throw new DynamiteModule$LoadingException("Failed to create IDynamiteLoader.");
                            }
                            int zzi = h2.zzi();
                            if (zzi >= 3) {
                                f3b1 f3b1Var4 = (f3b1) threadLocal.get();
                                if (f3b1Var4 == null) {
                                    throw new DynamiteModule$LoadingException("No cached result cursor holder");
                                }
                                zzg = h2.zzk(ObjectWrapper.wrap(context), str, i3, ObjectWrapper.wrap(f3b1Var4.a));
                            } else {
                                zzg = zzi == 2 ? h2.zzg(ObjectWrapper.wrap(context), str, i3) : h2.zze(ObjectWrapper.wrap(context), str, i3);
                            }
                            Object unwrap = ObjectWrapper.unwrap(zzg);
                            if (unwrap == null) {
                                throw new DynamiteModule$LoadingException("Failed to load remote module.");
                            }
                            ganVar = new gan((Context) unwrap);
                        }
                        return ganVar;
                    } catch (RemoteException e4) {
                        throw new DynamiteModule$LoadingException("Failed to load remote module.", e4);
                    } catch (DynamiteModule$LoadingException e5) {
                        throw e5;
                    } catch (Throwable th) {
                        m2f.a(context, th);
                        throw new DynamiteModule$LoadingException("Failed to load remote module.", th);
                    }
                }
            }
            int i7 = b2.a;
            int i8 = b2.b;
            StringBuilder sb5 = new StringBuilder(String.valueOf(str).length() + 46 + String.valueOf(i7).length() + 23 + String.valueOf(i8).length() + 1);
            sb5.append("No acceptable module ");
            sb5.append(str);
            sb5.append(" found. Local version is ");
            sb5.append(i7);
            sb5.append(" and remote version is ");
            sb5.append(i8);
            sb5.append(Extension.DOT_CHAR);
            throw new DynamiteModule$LoadingException(sb5.toString());
        } finally {
            if (longValue == 0) {
                l.remove();
            } else {
                l.set(l2);
            }
            Cursor cursor3 = f3b1Var2.a;
            if (cursor3 != null) {
                cursor3.close();
            }
            k.set(f3b1Var);
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:40:0x0141, code lost:
    
        if (r2 != false) goto L95;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static int d(Context context, String str, boolean z) {
        Field declaredField;
        Throwable th;
        RemoteException remoteException;
        Cursor cursor;
        try {
            synchronized (gan.class) {
                Boolean bool = f;
                boolean z2 = true;
                Cursor cursor2 = null;
                int i2 = 0;
                if (bool == null) {
                    try {
                        declaredField = context.getApplicationContext().getClassLoader().loadClass(DynamiteModule$DynamiteLoaderClassLoader.class.getName()).getDeclaredField("sClassLoader");
                    } catch (ClassNotFoundException | IllegalAccessException | NoSuchFieldException e2) {
                        new StringBuilder(e2.toString().length() + 30);
                        bool = Boolean.FALSE;
                    }
                    synchronized (declaredField.getDeclaringClass()) {
                        ClassLoader classLoader = (ClassLoader) declaredField.get(null);
                        if (classLoader == ClassLoader.getSystemClassLoader()) {
                            bool = Boolean.FALSE;
                        } else if (classLoader != null) {
                            try {
                                g(classLoader);
                            } catch (DynamiteModule$LoadingException unused) {
                            }
                            bool = Boolean.TRUE;
                        } else {
                            if (!e(context)) {
                                return 0;
                            }
                            if (!h) {
                                Boolean bool2 = Boolean.TRUE;
                                if (!bool2.equals(null)) {
                                    try {
                                        int f2 = f(context, str, z, true);
                                        String str2 = g;
                                        if (str2 != null && !str2.isEmpty()) {
                                            ClassLoader j2 = i891.j();
                                            if (j2 == null) {
                                                String str3 = g;
                                                cvw.l(str3);
                                                j2 = new DelegateLastClassLoader(str3, ClassLoader.getSystemClassLoader());
                                            }
                                            g(j2);
                                            declaredField.set(null, j2);
                                            f = bool2;
                                            return f2;
                                        }
                                        return f2;
                                    } catch (DynamiteModule$LoadingException unused2) {
                                        declaredField.set(null, ClassLoader.getSystemClassLoader());
                                        bool = Boolean.FALSE;
                                    }
                                }
                            }
                            declaredField.set(null, ClassLoader.getSystemClassLoader());
                            bool = Boolean.FALSE;
                        }
                        f = bool;
                    }
                }
                if (bool.booleanValue()) {
                    try {
                        return f(context, str, z, false);
                    } catch (DynamiteModule$LoadingException e3) {
                        new StringBuilder(String.valueOf(e3.getMessage()).length() + 42);
                        return 0;
                    }
                }
                zzp h2 = h(context);
                if (h2 != null) {
                    try {
                        try {
                            int zzi = h2.zzi();
                            if (zzi >= 3) {
                                ThreadLocal threadLocal = k;
                                f3b1 f3b1Var = (f3b1) threadLocal.get();
                                if (f3b1Var == null || (cursor = f3b1Var.a) == null) {
                                    Cursor cursor3 = (Cursor) ObjectWrapper.unwrap(h2.zzj(ObjectWrapper.wrap(context), str, z, ((Long) l.get()).longValue()));
                                    if (cursor3 != null) {
                                        try {
                                            if (cursor3.moveToFirst()) {
                                                int i3 = cursor3.getInt(0);
                                                if (i3 > 0) {
                                                    f3b1 f3b1Var2 = (f3b1) threadLocal.get();
                                                    if (f3b1Var2 == null || f3b1Var2.a != null) {
                                                        z2 = false;
                                                    } else {
                                                        f3b1Var2.a = cursor3;
                                                    }
                                                }
                                                cursor2 = cursor3;
                                                if (cursor2 != null) {
                                                    cursor2.close();
                                                }
                                                i2 = i3;
                                            }
                                        } catch (RemoteException e4) {
                                            remoteException = e4;
                                            cursor2 = cursor3;
                                            new StringBuilder(String.valueOf(remoteException.getMessage()).length() + 42);
                                            if (cursor2 != null) {
                                                cursor2.close();
                                            }
                                            return i2;
                                        } catch (Throwable th2) {
                                            th = th2;
                                            cursor2 = cursor3;
                                            if (cursor2 == null) {
                                                throw th;
                                            }
                                            cursor2.close();
                                            throw th;
                                        }
                                    }
                                    if (cursor3 != null) {
                                        cursor3.close();
                                    }
                                } else {
                                    i2 = cursor.getInt(0);
                                }
                            } else {
                                i2 = zzi == 2 ? h2.zzh(ObjectWrapper.wrap(context), str, z) : h2.zzf(ObjectWrapper.wrap(context), str, z);
                            }
                        } catch (RemoteException e5) {
                            remoteException = e5;
                        }
                    } catch (Throwable th3) {
                        th = th3;
                    }
                }
                return i2;
            }
        } catch (Throwable th4) {
            m2f.a(context, th4);
            throw th4;
        }
    }

    public static boolean e(Context context) {
        ApplicationInfo applicationInfo;
        Boolean bool = Boolean.TRUE;
        if (bool.equals(null) || bool.equals(j)) {
            return true;
        }
        boolean z = false;
        if (j == null) {
            ProviderInfo resolveContentProvider = context.getPackageManager().resolveContentProvider("com.google.android.gms.chimera", SelfTester_JCP.IMITA);
            if (b.b.d(context, 10000000) == 0 && resolveContentProvider != null && "com.google.android.gms".equals(resolveContentProvider.packageName)) {
                z = true;
            }
            j = Boolean.valueOf(z);
            if (z && (applicationInfo = resolveContentProvider.applicationInfo) != null && (applicationInfo.flags & HProv.PP_SECURITY_LEVEL) == 0) {
                Log.i("DynamiteModule", "Non-system-image GmsCore APK, forcing V1");
                h = true;
            }
        }
        if (!z) {
            Log.e("DynamiteModule", "Invalid GmsCore APK, remote loading disabled.");
        }
        return z;
    }

    /* JADX WARN: Code restructure failed: missing block: B:38:0x0137, code lost:
    
        if (r6 != false) goto L92;
     */
    /* JADX WARN: Finally extract failed */
    /* JADX WARN: Removed duplicated region for block: B:14:0x00e7 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static int f(Context context, String str, boolean z, boolean z2) {
        Exception exc;
        Throwable th;
        Cursor query;
        MatrixCursor matrixCursor;
        boolean z3;
        MatrixCursor matrixCursor2 = null;
        try {
            try {
                boolean z4 = true;
                Uri build = new Uri.Builder().scheme("content").authority("com.google.android.gms.chimera").path(true != z ? "api" : "api_force_staging").appendPath(str).appendQueryParameter("requestStartUptime", String.valueOf(((Long) l.get()).longValue())).build();
                ContentProviderClient acquireUnstableContentProviderClient = context.getContentResolver().acquireUnstableContentProviderClient(build);
                boolean z5 = false;
                if (acquireUnstableContentProviderClient != null) {
                    try {
                        query = acquireUnstableContentProviderClient.query(build, null, null, null, null);
                    } catch (RemoteException unused) {
                    } catch (Throwable th2) {
                        acquireUnstableContentProviderClient.release();
                        throw th2;
                    }
                    if (query != null) {
                        try {
                            int count = query.getCount();
                            int columnCount = query.getColumnCount();
                            matrixCursor = new MatrixCursor(query.getColumnNames(), count);
                            for (int i2 = 0; i2 < count; i2++) {
                                if (!query.moveToPosition(i2)) {
                                    throw new RemoteException("Cursor read incomplete (ContentProvider dead?)");
                                }
                                Object[] objArr = new Object[columnCount];
                                for (int i3 = 0; i3 < columnCount; i3++) {
                                    int type = query.getType(i3);
                                    if (type == 0) {
                                        objArr[i3] = null;
                                    } else if (type == 1) {
                                        objArr[i3] = Long.valueOf(query.getLong(i3));
                                    } else if (type == 2) {
                                        objArr[i3] = Double.valueOf(query.getDouble(i3));
                                    } else if (type == 3) {
                                        objArr[i3] = query.getString(i3);
                                    } else {
                                        if (type != 4) {
                                            throw new RemoteException("Unknown column type");
                                        }
                                        objArr[i3] = query.getBlob(i3);
                                    }
                                }
                                matrixCursor.addRow(objArr);
                            }
                            query.close();
                            acquireUnstableContentProviderClient.release();
                            if (matrixCursor != null) {
                                try {
                                    if (matrixCursor.moveToFirst()) {
                                        int i4 = matrixCursor.getInt(0);
                                        if (i4 > 0) {
                                            synchronized (gan.class) {
                                                try {
                                                    g = matrixCursor.getString(2);
                                                    int columnIndex = matrixCursor.getColumnIndex("loaderVersion");
                                                    if (columnIndex >= 0) {
                                                        i = matrixCursor.getInt(columnIndex);
                                                    }
                                                    int columnIndex2 = matrixCursor.getColumnIndex("disableStandaloneDynamiteLoader2");
                                                    if (columnIndex2 >= 0) {
                                                        z3 = matrixCursor.getInt(columnIndex2) != 0;
                                                        h = z3;
                                                    } else {
                                                        z3 = false;
                                                    }
                                                } finally {
                                                }
                                            }
                                            f3b1 f3b1Var = (f3b1) k.get();
                                            if (f3b1Var == null || f3b1Var.a != null) {
                                                z4 = false;
                                            } else {
                                                f3b1Var.a = matrixCursor;
                                            }
                                            z5 = z3;
                                        }
                                        matrixCursor2 = matrixCursor;
                                        if (z2 && z5) {
                                            throw new DynamiteModule$LoadingException("forcing fallback to container DynamiteLoader impl");
                                        }
                                        if (matrixCursor2 != null) {
                                            matrixCursor2.close();
                                        }
                                        return i4;
                                    }
                                } catch (Exception e2) {
                                    exc = e2;
                                    if (exc instanceof DynamiteModule$LoadingException) {
                                        throw exc;
                                    }
                                    String message = exc.getMessage();
                                    StringBuilder sb = new StringBuilder(String.valueOf(message).length() + 25);
                                    sb.append("V2 version check failed: ");
                                    sb.append(message);
                                    throw new DynamiteModule$LoadingException(sb.toString(), exc);
                                } catch (Throwable th3) {
                                    th = th3;
                                    matrixCursor2 = matrixCursor;
                                    if (matrixCursor2 == null) {
                                        throw th;
                                    }
                                    matrixCursor2.close();
                                    throw th;
                                }
                            }
                            throw new DynamiteModule$LoadingException("Failed to connect to dynamite module ContentResolver.");
                        } catch (Throwable th4) {
                            try {
                                query.close();
                                throw th4;
                            } catch (Throwable th5) {
                                th4.addSuppressed(th5);
                                throw th4;
                            }
                        }
                    }
                    acquireUnstableContentProviderClient.release();
                }
                matrixCursor = null;
                if (matrixCursor != null) {
                }
                throw new DynamiteModule$LoadingException("Failed to connect to dynamite module ContentResolver.");
            } catch (Throwable th6) {
                th = th6;
            }
        } catch (Exception e3) {
            exc = e3;
        }
    }

    public static void g(ClassLoader classLoader) {
        try {
            zzq zzqVar = null;
            IBinder iBinder = (IBinder) classLoader.loadClass("com.google.android.gms.dynamiteloader.DynamiteLoaderV2").getConstructor(null).newInstance(null);
            if (iBinder != null) {
                IInterface queryLocalInterface = iBinder.queryLocalInterface("com.google.android.gms.dynamite.IDynamiteLoaderV2");
                zzqVar = queryLocalInterface instanceof zzq ? (zzq) queryLocalInterface : new zzq(iBinder);
            }
            o = zzqVar;
        } catch (ClassNotFoundException | IllegalAccessException | InstantiationException | NoSuchMethodException | InvocationTargetException e2) {
            throw new DynamiteModule$LoadingException("Failed to instantiate dynamite loader", e2);
        }
    }

    public static zzp h(Context context) {
        zzp zzpVar;
        synchronized (gan.class) {
            zzp zzpVar2 = n;
            if (zzpVar2 != null) {
                return zzpVar2;
            }
            try {
                IBinder iBinder = (IBinder) context.createPackageContext("com.google.android.gms", 3).getClassLoader().loadClass("com.google.android.gms.chimera.container.DynamiteLoaderImpl").newInstance();
                if (iBinder == null) {
                    zzpVar = null;
                } else {
                    IInterface queryLocalInterface = iBinder.queryLocalInterface("com.google.android.gms.dynamite.IDynamiteLoader");
                    zzpVar = queryLocalInterface instanceof zzp ? (zzp) queryLocalInterface : new zzp(iBinder);
                }
                if (zzpVar != null) {
                    n = zzpVar;
                    return zzpVar;
                }
            } catch (Exception e2) {
                String message = e2.getMessage();
                StringBuilder sb = new StringBuilder(String.valueOf(message).length() + 45);
                sb.append("Failed to load IDynamiteLoader from GmsCore: ");
                sb.append(message);
                Log.e("DynamiteModule", sb.toString());
            }
            return null;
        }
    }

    public final IBinder b(String str) {
        try {
            return (IBinder) this.a.getClassLoader().loadClass(str).newInstance();
        } catch (ClassNotFoundException | IllegalAccessException | InstantiationException e2) {
            throw new DynamiteModule$LoadingException("Failed to instantiate module class: ".concat(str), e2);
        }
    }
}
