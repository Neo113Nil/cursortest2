package xsna;

import android.text.format.DateUtils;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import com.google.android.gms.tasks.Continuation;
import com.google.android.gms.tasks.Task;
import com.google.android.gms.tasks.Tasks;
import com.google.firebase.remoteconfig.FirebaseRemoteConfigClientException;
import com.google.firebase.remoteconfig.FirebaseRemoteConfigException;
import com.google.firebase.remoteconfig.FirebaseRemoteConfigFetchThrottledException;
import com.google.firebase.remoteconfig.internal.b;
import java.util.ArrayList;
import java.util.Date;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.concurrent.Executor;
import java.util.concurrent.TimeUnit;
import java.util.regex.Pattern;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

/* compiled from: FirebaseRemoteConfig.java */
/* loaded from: classes.dex */
public final class zjr {

    @Nullable
    public final shr a;
    public final Executor b;
    public final ixi c;
    public final ixi d;
    public final com.google.firebase.remoteconfig.internal.b e;
    public final pxi f;
    public final com.google.firebase.remoteconfig.internal.c g;
    public final uir h;

    public zjr(uir uirVar, @Nullable shr shrVar, Executor executor, ixi ixiVar, ixi ixiVar2, ixi ixiVar3, com.google.firebase.remoteconfig.internal.b bVar, pxi pxiVar, com.google.firebase.remoteconfig.internal.c cVar) {
        this.h = uirVar;
        this.a = shrVar;
        this.b = executor;
        this.c = ixiVar;
        this.d = ixiVar2;
        this.e = bVar;
        this.f = pxiVar;
        this.g = cVar;
    }

    public static ArrayList e(JSONArray jSONArray) throws JSONException {
        ArrayList arrayList = new ArrayList();
        for (int i = 0; i < jSONArray.length(); i++) {
            HashMap hashMap = new HashMap();
            JSONObject jSONObject = jSONArray.getJSONObject(i);
            Iterator<String> keys = jSONObject.keys();
            while (keys.hasNext()) {
                String next = keys.next();
                hashMap.put(next, jSONObject.getString(next));
            }
            arrayList.add(hashMap);
        }
        return arrayList;
    }

    @NonNull
    public final Task<Boolean> a() {
        final com.google.firebase.remoteconfig.internal.b bVar = this.e;
        final long j = bVar.g.a.getLong("minimum_fetch_interval_in_seconds", com.google.firebase.remoteconfig.internal.b.i);
        return bVar.e.b().continueWithTask(bVar.c, new Continuation() { // from class: xsna.mxi
            @Override // com.google.android.gms.tasks.Continuation
            public final Object then(Task task) {
                Task continueWithTask;
                boolean before;
                final com.google.firebase.remoteconfig.internal.b bVar2 = com.google.firebase.remoteconfig.internal.b.this;
                Executor executor = bVar2.c;
                uir uirVar = bVar2.a;
                com.google.firebase.remoteconfig.internal.c cVar = bVar2.g;
                final Date date = new Date(System.currentTimeMillis());
                if (task.isSuccessful()) {
                    Date date2 = new Date(cVar.a.getLong("last_fetch_time_in_millis", -1L));
                    if (date2.equals(com.google.firebase.remoteconfig.internal.c.d)) {
                        before = false;
                    } else {
                        before = date.before(new Date(TimeUnit.SECONDS.toMillis(j) + date2.getTime()));
                    }
                    if (before) {
                        return Tasks.forResult(b.a.c());
                    }
                }
                Date date3 = cVar.a().b;
                if (!date.before(date3)) {
                    date3 = null;
                }
                if (date3 != null) {
                    continueWithTask = Tasks.forException(new FirebaseRemoteConfigFetchThrottledException(go9.b("Fetch is throttled. Please wait before calling fetch again: ", DateUtils.formatElapsedTime(TimeUnit.MILLISECONDS.toSeconds(date3.getTime() - date.getTime()))), date3.getTime()));
                } else {
                    final Task<String> id = uirVar.getId();
                    final Task token = uirVar.getToken();
                    continueWithTask = Tasks.whenAllComplete((Task<?>[]) new Task[]{id, token}).continueWithTask(executor, new Continuation() { // from class: xsna.nxi
                        @Override // com.google.android.gms.tasks.Continuation
                        public final Object then(Task task2) {
                            com.google.firebase.remoteconfig.internal.b bVar3 = com.google.firebase.remoteconfig.internal.b.this;
                            Date date4 = date;
                            Task task3 = id;
                            if (!task3.isSuccessful()) {
                                return Tasks.forException(new FirebaseRemoteConfigClientException("Firebase Installations failed to get installation ID for fetch.", task3.getException()));
                            }
                            Task task4 = token;
                            if (!task4.isSuccessful()) {
                                return Tasks.forException(new FirebaseRemoteConfigClientException("Firebase Installations failed to get installation auth token for fetch.", task4.getException()));
                            }
                            try {
                                b.a a = bVar3.a((String) task3.getResult(), ((k6x) task4.getResult()).b(), date4);
                                if (a.f() != 0) {
                                    return Tasks.forResult(a);
                                }
                                ixi ixiVar = bVar3.e;
                                com.google.firebase.remoteconfig.internal.a d = a.d();
                                Executor executor2 = ixiVar.a;
                                return Tasks.call(executor2, new gxi(0, ixiVar, d)).onSuccessTask(executor2, new hxi(ixiVar, d)).onSuccessTask(bVar3.c, new kb(a, 22));
                            } catch (FirebaseRemoteConfigException e) {
                                return Tasks.forException(e);
                            }
                        }
                    });
                }
                return continueWithTask.continueWithTask(executor, new Continuation() { // from class: xsna.oxi
                    @Override // com.google.android.gms.tasks.Continuation
                    public final Object then(Task task2) {
                        com.google.firebase.remoteconfig.internal.b bVar3 = com.google.firebase.remoteconfig.internal.b.this;
                        Date date4 = date;
                        bVar3.getClass();
                        if (task2.isSuccessful()) {
                            com.google.firebase.remoteconfig.internal.c cVar2 = bVar3.g;
                            synchronized (cVar2.b) {
                                cVar2.a.edit().putInt("last_fetch_status", -1).putLong("last_fetch_time_in_millis", date4.getTime()).apply();
                            }
                            return task2;
                        }
                        Exception exception = task2.getException();
                        if (exception == null) {
                            return task2;
                        }
                        if (exception instanceof FirebaseRemoteConfigFetchThrottledException) {
                            com.google.firebase.remoteconfig.internal.c cVar3 = bVar3.g;
                            synchronized (cVar3.b) {
                                cVar3.a.edit().putInt("last_fetch_status", 2).apply();
                            }
                            return task2;
                        }
                        com.google.firebase.remoteconfig.internal.c cVar4 = bVar3.g;
                        synchronized (cVar4.b) {
                            cVar4.a.edit().putInt("last_fetch_status", 1).apply();
                        }
                        return task2;
                    }
                });
            }
        }).onSuccessTask(pir.INSTANCE, new a7g()).onSuccessTask(this.b, new wjr(this, 0));
    }

    @NonNull
    public final HashMap b() {
        dkr dkrVar;
        HashSet hashSet = new HashSet();
        pxi pxiVar = this.f;
        ixi ixiVar = pxiVar.c;
        hashSet.addAll(pxi.c(ixiVar));
        ixi ixiVar2 = pxiVar.d;
        hashSet.addAll(pxi.c(ixiVar2));
        HashMap hashMap = new HashMap();
        Iterator it = hashSet.iterator();
        while (it.hasNext()) {
            String str = (String) it.next();
            String d = pxi.d(ixiVar, str);
            if (d != null) {
                pxiVar.a(pxi.b(ixiVar), str);
                dkrVar = new dkr(d, 2);
            } else {
                String d2 = pxi.d(ixiVar2, str);
                dkrVar = d2 != null ? new dkr(d2, 1) : new dkr("", 0);
            }
            hashMap.put(str, dkrVar);
        }
        return hashMap;
    }

    public final boolean c(@NonNull String str) {
        Pattern pattern = pxi.f;
        Pattern pattern2 = pxi.e;
        pxi pxiVar = this.f;
        ixi ixiVar = pxiVar.c;
        String d = pxi.d(ixiVar, str);
        if (d != null) {
            if (pattern2.matcher(d).matches()) {
                pxiVar.a(pxi.b(ixiVar), str);
                return true;
            }
            if (pattern.matcher(d).matches()) {
                pxiVar.a(pxi.b(ixiVar), str);
                return false;
            }
        }
        String d2 = pxi.d(pxiVar.d, str);
        if (d2 != null) {
            if (pattern2.matcher(d2).matches()) {
                return true;
            }
            pattern.matcher(d2).matches();
        }
        return false;
    }

    @NonNull
    public final String d(@NonNull String str) {
        pxi pxiVar = this.f;
        ixi ixiVar = pxiVar.c;
        String d = pxi.d(ixiVar, str);
        if (d != null) {
            pxiVar.a(pxi.b(ixiVar), str);
            return d;
        }
        String d2 = pxi.d(pxiVar.d, str);
        return d2 != null ? d2 : "";
    }
}
