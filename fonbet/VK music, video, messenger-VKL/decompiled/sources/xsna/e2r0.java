package xsna;

import android.content.ContentProviderClient;
import android.content.ContentUris;
import android.content.ContentValues;
import android.content.Context;
import android.content.pm.PackageInfo;
import android.content.pm.ProviderInfo;
import android.net.Uri;
import android.util.Log;
import com.unity3d.ads.core.domain.HandleInvocationsFromAdViewer;
import com.vk.dto.common.id.UserId;
import io.reactivex.rxjava3.internal.operators.flowable.b;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.Comparator;
import java.util.Iterator;
import java.util.List;
import java.util.Objects;
import java.util.concurrent.Callable;
import kotlin.Result;
import kotlin.collections.EmptyList;
import xsna.c2r0;
import xsna.hfr;

/* compiled from: UsersStoreContentResolver.kt */
/* loaded from: classes11.dex */
public final class e2r0 implements c2r0 {
    public static volatile List<c2r0.b> c;
    public static zww d;
    public static final e2r0 b = new e2r0();
    public static final bpn0 e = new bpn0(new ug9(8));

    /* compiled from: Comparisons.kt */
    public static final class a<T> implements Comparator {
        /* JADX WARN: Multi-variable type inference failed */
        @Override // java.util.Comparator
        public final int compare(T t, T t2) {
            return jw5.b(Long.valueOf(((c2r0.b) t2).b()), Long.valueOf(((c2r0.b) t).b()));
        }
    }

    public static ArrayList a(Context context) {
        Object failure;
        ProviderInfo providerInfo;
        try {
            failure = context.getPackageManager().getInstalledPackages(8);
        } catch (Throwable th) {
            failure = new Result.Failure(th);
        }
        Throwable a2 = Result.a(failure);
        if (a2 != null) {
            Log.e("UsersStoreContentResolver", "Something wrong with querying installed packages", a2);
        }
        Object obj = EmptyList.b;
        if (failure instanceof Result.Failure) {
            failure = obj;
        }
        ArrayList arrayList = new ArrayList();
        for (PackageInfo packageInfo : (Iterable) failure) {
            String concat = packageInfo.packageName.concat(".UsersContentProvider");
            ProviderInfo[] providerInfoArr = packageInfo.providers;
            String str = null;
            if (providerInfoArr != null) {
                int length = providerInfoArr.length;
                int i = 0;
                while (true) {
                    if (i >= length) {
                        providerInfo = null;
                        break;
                    }
                    providerInfo = providerInfoArr[i];
                    if (epx.f(providerInfo != null ? providerInfo.authority : null, concat)) {
                        break;
                    }
                    i++;
                }
                if (providerInfo != null) {
                    str = providerInfo.packageName;
                }
            }
            if (str != null) {
                arrayList.add(str);
            }
        }
        return arrayList;
    }

    public static boolean d(Context context, String str, UserId userId, ContentValues contentValues) {
        Object failure;
        c = null;
        try {
            Uri withAppendedId = ContentUris.withAppendedId(Uri.withAppendedPath(new Uri.Builder().scheme(HandleInvocationsFromAdViewer.KEY_PRIVACY_UPDATE_CONTENT).authority(str.concat(".UsersContentProvider")).appendQueryParameter("version", "2").build(), "users"), userId.b);
            ContentProviderClient acquireUnstableContentProviderClient = context.getContentResolver().acquireUnstableContentProviderClient(withAppendedId);
            if (acquireUnstableContentProviderClient != null) {
                try {
                    r5 = acquireUnstableContentProviderClient.update(withAppendedId, contentValues, null, null) != 0;
                    yfb.d(acquireUnstableContentProviderClient, null);
                } finally {
                }
            }
            failure = Boolean.valueOf(r5);
        } catch (Throwable th) {
            failure = new Result.Failure(th);
        }
        Object obj = Boolean.FALSE;
        if (failure instanceof Result.Failure) {
            failure = obj;
        }
        return ((Boolean) failure).booleanValue();
    }

    @Override // xsna.c2r0
    public final boolean b(Context context, UserId userId) {
        Object failure;
        c = null;
        zww zwwVar = d;
        if (zwwVar != null) {
            zwwVar.invoke(userId);
        }
        r55 r55Var = r55.a;
        ((l2q) r55.d()).i(userId);
        ArrayList a2 = a(context);
        ArrayList arrayList = new ArrayList(c5g.u(a2, 10));
        Iterator it = a2.iterator();
        while (true) {
            if (!it.hasNext()) {
                Iterator it2 = arrayList.iterator();
                while (it2.hasNext()) {
                    r4 |= ((Boolean) it2.next()).booleanValue();
                }
                return r4;
            }
            String str = (String) it.next();
            b.getClass();
            c = null;
            try {
                Uri withAppendedId = ContentUris.withAppendedId(Uri.withAppendedPath(new Uri.Builder().scheme(HandleInvocationsFromAdViewer.KEY_PRIVACY_UPDATE_CONTENT).authority(str.concat(".UsersContentProvider")).appendQueryParameter("version", "2").build(), "users"), userId.b);
                ContentProviderClient acquireUnstableContentProviderClient = context.getContentResolver().acquireUnstableContentProviderClient(withAppendedId);
                if (acquireUnstableContentProviderClient != null) {
                    try {
                        r4 = acquireUnstableContentProviderClient.delete(withAppendedId, null, null) != 0;
                        yfb.d(acquireUnstableContentProviderClient, null);
                    } finally {
                    }
                }
                failure = Boolean.valueOf(r4);
            } catch (Throwable th) {
                failure = new Result.Failure(th);
            }
            Object obj = Boolean.FALSE;
            if (failure instanceof Result.Failure) {
                failure = obj;
            }
            arrayList.add((Boolean) failure);
        }
    }

    @Override // xsna.c2r0
    public final io.reactivex.rxjava3.core.x<List<c2r0.b>> c(final Context context, final boolean z) {
        return new io.reactivex.rxjava3.internal.operators.single.v(new Callable() { // from class: xsna.d2r0
            @Override // java.util.concurrent.Callable
            public final Object call() {
                return e2r0.b.h(context, z);
            }
        });
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r3v6, types: [java.util.ArrayList] */
    /* JADX WARN: Type inference failed for: r3v7, types: [java.util.List] */
    /* JADX WARN: Type inference failed for: r3v8, types: [java.util.List<xsna.c2r0$b>] */
    /* JADX WARN: Type inference failed for: r3v9, types: [kotlin.collections.EmptyList] */
    @Override // xsna.c2r0
    public final List<c2r0.b> h(Context context, boolean z) {
        ?? b2;
        boolean z2 = z || ((Boolean) e.getValue()).booleanValue();
        List<c2r0.b> list = c;
        if (z2 && list != null) {
            return list;
        }
        ehn ehnVar = new ehn(new hfr.a(rli0.j(new qli0(rli0.p(new i5g(a(context)), new l8m(context, 4)), new a()), new da4(5))), new iej(6));
        if (ehnVar.hasNext()) {
            Object next = ehnVar.next();
            if (ehnVar.hasNext()) {
                b2 = y57.b(next);
                while (ehnVar.hasNext()) {
                    b2.add(ehnVar.next());
                }
            } else {
                b2 = Collections.singletonList(next);
            }
        } else {
            b2 = EmptyList.b;
        }
        c = b2;
        return b2;
    }

    @Override // xsna.c2r0
    public final boolean i(Context context, UserId userId) {
        b.a aVar;
        List l = e43.l(io.reactivex.rxjava3.core.a.l(new xsb(userId, 4)).q(io.reactivex.rxjava3.schedulers.a.b()).t(Boolean.TRUE), new io.reactivex.rxjava3.internal.operators.single.v(new aa4(2, context, userId)).q(io.reactivex.rxjava3.schedulers.a.b()));
        int i = io.reactivex.rxjava3.core.g.b;
        Objects.requireNonNull(l, "source is null");
        io.reactivex.rxjava3.internal.operators.flowable.t g = new io.reactivex.rxjava3.internal.operators.flowable.y(l).g(io.reactivex.rxjava3.internal.functions.a.a, Integer.MAX_VALUE);
        io.reactivex.rxjava3.internal.functions.b.a(2, "bufferSize");
        Iterable bVar = new io.reactivex.rxjava3.internal.operators.flowable.b(g);
        if (!(bVar instanceof Collection) || !((Collection) bVar).isEmpty()) {
            Iterator it = bVar.iterator();
            do {
                aVar = (b.a) it;
                if (aVar.hasNext()) {
                }
            } while (((Boolean) aVar.next()).booleanValue());
            return false;
        }
        return true;
    }

    @Override // xsna.c2r0
    public final boolean j(Context context, c2r0.b bVar) {
        c = null;
        io.reactivex.rxjava3.internal.observers.d dVar = new io.reactivex.rxjava3.internal.observers.d();
        io.reactivex.rxjava3.core.a.l(new yyo(bVar, 5)).q(io.reactivex.rxjava3.schedulers.a.b()).subscribe(dVar);
        ContentValues b2 = f2r0.b(bVar);
        ArrayList a2 = a(context);
        ArrayList arrayList = new ArrayList(c5g.u(a2, 10));
        Iterator it = a2.iterator();
        while (it.hasNext()) {
            String str = (String) it.next();
            e2r0 e2r0Var = b;
            UserId d2 = bVar.d();
            e2r0Var.getClass();
            arrayList.add(Boolean.valueOf(d(context, str, d2, b2)));
        }
        Iterator it2 = arrayList.iterator();
        boolean z = false;
        while (it2.hasNext()) {
            z |= ((Boolean) it2.next()).booleanValue();
        }
        dVar.b();
        return z;
    }

    @Override // xsna.c2r0
    public final boolean k(Context context, c2r0.b bVar) {
        Object failure;
        c = null;
        if (j(context, bVar)) {
            return true;
        }
        try {
            Uri withAppendedId = ContentUris.withAppendedId(Uri.withAppendedPath(new Uri.Builder().scheme(HandleInvocationsFromAdViewer.KEY_PRIVACY_UPDATE_CONTENT).authority(context.getPackageName().concat(".UsersContentProvider")).appendQueryParameter("version", "2").build(), "users"), bVar.d().b);
            ContentProviderClient acquireUnstableContentProviderClient = context.getContentResolver().acquireUnstableContentProviderClient(withAppendedId);
            boolean z = false;
            if (acquireUnstableContentProviderClient != null) {
                try {
                    boolean z2 = acquireUnstableContentProviderClient.insert(withAppendedId, f2r0.b(bVar)) != null;
                    yfb.d(acquireUnstableContentProviderClient, null);
                    z = z2;
                } finally {
                }
            }
            failure = Boolean.valueOf(z);
        } catch (Throwable th) {
            failure = new Result.Failure(th);
        }
        Object obj = Boolean.FALSE;
        if (failure instanceof Result.Failure) {
            failure = obj;
        }
        return ((Boolean) failure).booleanValue();
    }
}
