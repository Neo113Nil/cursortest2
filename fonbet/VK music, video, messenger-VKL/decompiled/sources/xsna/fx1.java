package xsna;

import android.os.Bundle;
import androidx.annotation.NonNull;
import com.google.android.gms.common.util.VisibleForTesting;
import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;
import ru.ok.android.webrtc.signaling.api.SignalingProtocol;
import xsna.ex1;

/* compiled from: com.google.android.gms:play-services-measurement-api@@21.2.0 */
/* loaded from: classes.dex */
public final class fx1 implements ex1 {
    public static volatile fx1 c;

    @VisibleForTesting
    public final r73 a;

    @VisibleForTesting
    public final ConcurrentHashMap b;

    public fx1(r73 r73Var) {
        exc0.i(r73Var);
        this.a = r73Var;
        this.b = new ConcurrentHashMap();
    }

    @Override // xsna.ex1
    @NonNull
    public final ArrayList a() {
        ArrayList arrayList = new ArrayList();
        for (Bundle bundle : this.a.a.zzq("frc", "")) {
            HashSet hashSet = x501.a;
            exc0.i(bundle);
            ex1.a aVar = new ex1.a();
            String str = (String) k15.C(bundle, "origin", String.class, null);
            exc0.i(str);
            aVar.a = str;
            String str2 = (String) k15.C(bundle, "name", String.class, null);
            exc0.i(str2);
            aVar.b = str2;
            aVar.c = k15.C(bundle, "value", Object.class, null);
            aVar.d = (String) k15.C(bundle, "trigger_event_name", String.class, null);
            aVar.e = ((Long) k15.C(bundle, "trigger_timeout", Long.class, 0L)).longValue();
            aVar.f = (String) k15.C(bundle, "timed_out_event_name", String.class, null);
            aVar.g = (Bundle) k15.C(bundle, "timed_out_event_params", Bundle.class, null);
            aVar.h = (String) k15.C(bundle, "triggered_event_name", String.class, null);
            aVar.i = (Bundle) k15.C(bundle, "triggered_event_params", Bundle.class, null);
            aVar.j = ((Long) k15.C(bundle, "time_to_live", Long.class, 0L)).longValue();
            aVar.k = (String) k15.C(bundle, "expired_event_name", String.class, null);
            aVar.l = (Bundle) k15.C(bundle, "expired_event_params", Bundle.class, null);
            aVar.n = ((Boolean) k15.C(bundle, SignalingProtocol.KEY_ACTIVE, Boolean.class, Boolean.FALSE)).booleanValue();
            aVar.m = ((Long) k15.C(bundle, "creation_timestamp", Long.class, 0L)).longValue();
            aVar.o = ((Long) k15.C(bundle, "triggered_timestamp", Long.class, 0L)).longValue();
            arrayList.add(aVar);
        }
        return arrayList;
    }

    @Override // xsna.ex1
    public final void b(@NonNull String str) {
        this.a.a.zzw(str, null, null);
    }

    @Override // xsna.ex1
    @NonNull
    public final Map<String, Object> c(boolean z) {
        return this.a.a.zzr(null, null, z);
    }

    @Override // xsna.ex1
    public final void d(@NonNull String str, @NonNull String str2, @NonNull Bundle bundle) {
        if (x501.c(str) && x501.b(bundle, str2) && x501.a(str, str2, bundle)) {
            if ("clx".equals(str) && "_ae".equals(str2)) {
                bundle.putLong("_r", 1L);
            }
            this.a.a.zzz(str, str2, bundle);
        }
    }

    @Override // xsna.ex1
    @NonNull
    public final lyd e(@NonNull String str, @NonNull j4k j4kVar) {
        if (x501.c(str)) {
            boolean isEmpty = str.isEmpty();
            ConcurrentHashMap concurrentHashMap = this.b;
            if (isEmpty || !concurrentHashMap.containsKey(str) || concurrentHashMap.get(str) == null) {
                boolean equals = "fiam".equals(str);
                r73 r73Var = this.a;
                Object lyk0Var = equals ? new lyk0(r73Var, j4kVar) : "clx".equals(str) ? new ru8(r73Var, j4kVar) : null;
                if (lyk0Var != null) {
                    concurrentHashMap.put(str, lyk0Var);
                    return new lyd();
                }
            }
        }
        return null;
    }

    @Override // xsna.ex1
    public final void f(@NonNull String str) {
        if (x501.c("fcm") && x501.d("fcm", "_ln")) {
            this.a.a.zzO("fcm", "_ln", str, true);
        }
    }

    @Override // xsna.ex1
    public final void g(@NonNull ex1.a aVar) {
        Throwable th;
        ObjectInputStream objectInputStream;
        ObjectOutputStream objectOutputStream;
        ByteArrayOutputStream byteArrayOutputStream;
        HashSet hashSet = x501.a;
        String str = aVar.a;
        if (str == null || str.isEmpty()) {
            return;
        }
        Object obj = aVar.c;
        if (obj != null) {
            Object obj2 = null;
            try {
                try {
                    byteArrayOutputStream = new ByteArrayOutputStream();
                    objectOutputStream = new ObjectOutputStream(byteArrayOutputStream);
                } catch (IOException | ClassNotFoundException unused) {
                }
                try {
                    objectOutputStream.writeObject(obj);
                    objectOutputStream.flush();
                    objectInputStream = new ObjectInputStream(new ByteArrayInputStream(byteArrayOutputStream.toByteArray()));
                    try {
                        Object readObject = objectInputStream.readObject();
                        objectOutputStream.close();
                        objectInputStream.close();
                        obj2 = readObject;
                        if (obj2 == null) {
                            return;
                        }
                    } catch (Throwable th2) {
                        th = th2;
                        if (objectOutputStream != null) {
                            objectOutputStream.close();
                        }
                        if (objectInputStream == null) {
                            throw th;
                        }
                        objectInputStream.close();
                        throw th;
                    }
                } catch (Throwable th3) {
                    th = th3;
                    objectInputStream = null;
                }
            } catch (Throwable th4) {
                th = th4;
                objectInputStream = null;
                objectOutputStream = null;
            }
        }
        if (x501.c(str) && x501.d(str, aVar.b)) {
            String str2 = aVar.k;
            if (str2 == null || (x501.b(aVar.l, str2) && x501.a(str, aVar.k, aVar.l))) {
                String str3 = aVar.h;
                if (str3 == null || (x501.b(aVar.i, str3) && x501.a(str, aVar.h, aVar.i))) {
                    String str4 = aVar.f;
                    if (str4 == null || (x501.b(aVar.g, str4) && x501.a(str, aVar.f, aVar.g))) {
                        Bundle bundle = new Bundle();
                        String str5 = aVar.a;
                        if (str5 != null) {
                            bundle.putString("origin", str5);
                        }
                        String str6 = aVar.b;
                        if (str6 != null) {
                            bundle.putString("name", str6);
                        }
                        Object obj3 = aVar.c;
                        if (obj3 != null) {
                            k15.D(bundle, obj3);
                        }
                        String str7 = aVar.d;
                        if (str7 != null) {
                            bundle.putString("trigger_event_name", str7);
                        }
                        bundle.putLong("trigger_timeout", aVar.e);
                        String str8 = aVar.f;
                        if (str8 != null) {
                            bundle.putString("timed_out_event_name", str8);
                        }
                        Bundle bundle2 = aVar.g;
                        if (bundle2 != null) {
                            bundle.putBundle("timed_out_event_params", bundle2);
                        }
                        String str9 = aVar.h;
                        if (str9 != null) {
                            bundle.putString("triggered_event_name", str9);
                        }
                        Bundle bundle3 = aVar.i;
                        if (bundle3 != null) {
                            bundle.putBundle("triggered_event_params", bundle3);
                        }
                        bundle.putLong("time_to_live", aVar.j);
                        String str10 = aVar.k;
                        if (str10 != null) {
                            bundle.putString("expired_event_name", str10);
                        }
                        Bundle bundle4 = aVar.l;
                        if (bundle4 != null) {
                            bundle.putBundle("expired_event_params", bundle4);
                        }
                        bundle.putLong("creation_timestamp", aVar.m);
                        bundle.putBoolean(SignalingProtocol.KEY_ACTIVE, aVar.n);
                        bundle.putLong("triggered_timestamp", aVar.o);
                        this.a.a.zzE(bundle);
                    }
                }
            }
        }
    }

    @Override // xsna.ex1
    public final int h() {
        return this.a.a.zza("frc");
    }
}
