package ru.mail.libverify.a;

import android.util.Log;
import androidx.lifecycle.Lifecycle;
import androidx.lifecycle.l;
import androidx.lifecycle.q;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.concurrent.atomic.AtomicReference;
import ru.mail.verify.core.utils.FileLog;
import ru.ok.android.webrtc.signaling.api.SignalingProtocol;
import xsna.asp;
import xsna.c8y0;
import xsna.f5z;
import xsna.ttp0;
import xsna.zrp;

/* loaded from: classes9.dex */
public final class a {
    private static l a;
    private static final ArrayList<InterfaceC2188a> b = new ArrayList<>();
    private static final AtomicReference<b> c = new AtomicReference<>(b.UNTRACKED);

    /* renamed from: ru.mail.libverify.a.a$a, reason: collision with other inner class name */
    public interface InterfaceC2188a {
        void a();

        void onResume();
    }

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    public static final class b {
        private static final /* synthetic */ zrp $ENTRIES;
        private static final /* synthetic */ b[] $VALUES;
        public static final b ACTIVE;
        public static final b INACTIVE;
        public static final b UNTRACKED;

        static {
            b bVar = new b(SignalingProtocol.STATE_ACTIVE, 0);
            ACTIVE = bVar;
            b bVar2 = new b("INACTIVE", 1);
            INACTIVE = bVar2;
            b bVar3 = new b("UNTRACKED", 2);
            UNTRACKED = bVar3;
            b[] bVarArr = {bVar, bVar2, bVar3};
            $VALUES = bVarArr;
            $ENTRIES = new asp(bVarArr);
        }

        private b(String str, int i) {
        }

        public static b valueOf(String str) {
            return (b) Enum.valueOf(b.class, str);
        }

        public static b[] values() {
            return (b[]) $VALUES.clone();
        }
    }

    public /* synthetic */ class c {
        public static final /* synthetic */ int[] a;

        static {
            int[] iArr = new int[Lifecycle.Event.values().length];
            try {
                iArr[Lifecycle.Event.ON_RESUME.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[Lifecycle.Event.ON_PAUSE.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            a = iArr;
        }
    }

    public static final void a(InterfaceC2188a interfaceC2188a) {
        if (!a()) {
            Log.e("AppStateListener", "androidx.lifecycle doesn't present in this app.");
            return;
        }
        try {
            if (a == null) {
                c8y0 c8y0Var = new c8y0();
                q qVar = q.j;
                q.j.g.addObserver(c8y0Var);
                a = c8y0Var;
            }
            b.add(interfaceC2188a);
        } catch (Throwable th) {
            FileLog.e("AppStateListener", "Failed to execute AppStateModel#register", th);
        }
    }

    public static final b b() {
        return c.get();
    }

    public static final void b(InterfaceC2188a interfaceC2188a) {
        try {
            ArrayList<InterfaceC2188a> arrayList = b;
            ttp0.a(arrayList).remove(interfaceC2188a);
            if (arrayList.isEmpty()) {
                if (a != null) {
                    q qVar = q.j;
                    q.j.g.removeObserver(a);
                }
                a = null;
                c.set(b.UNTRACKED);
            }
        } catch (Throwable th) {
            FileLog.e("AppStateListener", "Failed to execute AppStateModel#unregister", th);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void a(f5z f5zVar, Lifecycle.Event event) {
        int i = c.a[event.ordinal()];
        if (i == 1) {
            c.set(b.ACTIVE);
            Iterator<InterfaceC2188a> it = b.iterator();
            while (it.hasNext()) {
                it.next().onResume();
            }
            return;
        }
        if (i != 2) {
            return;
        }
        c.set(b.INACTIVE);
        Iterator<InterfaceC2188a> it2 = b.iterator();
        while (it2.hasNext()) {
            it2.next().a();
        }
    }

    public static final boolean a() {
        Class a2;
        Class a3;
        Class a4;
        Class a5;
        Class a6;
        Class<?> cls;
        try {
            Class a7 = a("androidx.lifecycle.ProcessLifecycleOwner");
            if (a7 == null || (a2 = a("androidx.lifecycle.LifecycleEventObserver")) == null || (a3 = a("androidx.lifecycle.Lifecycle")) == null || (a4 = a("androidx.lifecycle.Lifecycle$Event")) == null || (a5 = a("androidx.lifecycle.LifecycleObserver")) == null || (a6 = a("androidx.lifecycle.LifecycleOwner")) == null) {
                return false;
            }
            try {
                cls = a7.getDeclaredField("Companion").getType();
            } catch (NoSuchFieldException unused) {
                cls = null;
            }
            if ((a(a7, "get", new Class[0]) || cls == null || a(cls, "get", new Class[0])) && a(a6, "getLifecycle", new Class[0]) && a(a3, "removeObserver", a5) && a(a3, "addObserver", a5)) {
                return a(a2, "onStateChanged", a6, a4);
            }
            return false;
        } catch (Throwable th) {
            FileLog.e("AppStateListener", "Failed to invoke canUseLifecycle", th);
            return false;
        }
    }

    private static boolean a(Class cls, String str, Class... clsArr) {
        try {
            cls.getMethod(str, (Class[]) Arrays.copyOf(clsArr, clsArr.length));
            return true;
        } catch (Exception unused) {
            return false;
        }
    }

    private static Class a(String str) {
        try {
            return Class.forName(str);
        } catch (ClassNotFoundException unused) {
            return null;
        }
    }
}
