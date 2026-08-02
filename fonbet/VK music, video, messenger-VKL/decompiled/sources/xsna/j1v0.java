package xsna;

import android.content.Context;
import android.content.Intent;
import android.content.pm.ActivityInfo;
import android.content.pm.ResolveInfo;
import com.vk.core.preference.Preference;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.atomic.AtomicReference;
import kotlin.NoWhenBranchMatchedException;

/* compiled from: VkLauncherIconAvailability.kt */
/* loaded from: classes.dex */
public final class j1v0 {
    public final AtomicReference<a> a = new AtomicReference<>(a.C3091a.a);
    public final cny b = new cny();
    public vmy c;

    /* compiled from: VkLauncherIconAvailability.kt */
    public interface a {

        /* compiled from: VkLauncherIconAvailability.kt */
        /* renamed from: xsna.j1v0$a$a, reason: collision with other inner class name */
        public static final class C3091a implements a {
            public static final C3091a a = new C3091a();
        }

        /* compiled from: VkLauncherIconAvailability.kt */
        public static final class b implements a {
            public final boolean a;

            public b(boolean z) {
                this.a = z;
            }

            public final boolean equals(Object obj) {
                if (this == obj) {
                    return true;
                }
                return (obj instanceof b) && this.a == ((b) obj).a;
            }

            public final int hashCode() {
                return Boolean.hashCode(this.a);
            }

            public final String toString() {
                return defpackage.q0.a(new StringBuilder("ToggleUsedState(canFallback="), this.a, ')');
            }
        }

        /* compiled from: VkLauncherIconAvailability.kt */
        /* loaded from: classes14.dex */
        public static final class c implements a {
            public static final c a = new c();
        }
    }

    public final boolean a(Context context) {
        boolean z;
        a.b bVar;
        ActivityInfo activityInfo;
        String str;
        vmy vmyVar = this.c;
        boolean z2 = false;
        if (vmyVar == null) {
            return false;
        }
        boolean z3 = gz80.a >= ((Number) vmyVar.b.invoke()).intValue();
        List list = (List) vmyVar.c.invoke();
        bny.a.getClass();
        eny enyVar = (eny) bny.h.getValue();
        enyVar.getClass();
        ResolveInfo resolveActivity = context.getPackageManager().resolveActivity((Intent) enyVar.a.getValue(), 65536);
        if (resolveActivity != null && (activityInfo = resolveActivity.activityInfo) != null && (str = activityInfo.packageName) != null) {
            List list2 = list;
            if (!(list2 instanceof Collection) || !list2.isEmpty()) {
                Iterator it = list2.iterator();
                while (it.hasNext()) {
                    if (epx.f((String) it.next(), str)) {
                        z = true;
                        break;
                    }
                }
            }
        }
        z = false;
        if (z3 && z && gz80.a(29)) {
            z2 = true;
        }
        AtomicReference<a> atomicReference = this.a;
        a aVar = atomicReference.get();
        boolean f = epx.f(aVar, a.C3091a.a);
        cny cnyVar = this.b;
        if (f) {
            cnyVar.getClass();
            bVar = new a.b(!Preference.d("__launcher_icon_change__", "__last_feature_availability__", true));
        } else if (epx.f(aVar, a.c.a)) {
            cnyVar.getClass();
            Preference.I("__launcher_icon_change__", "__last_feature_availability__", z2);
            bVar = new a.b(!z2);
        } else {
            if (!(aVar instanceof a.b)) {
                throw new NoWhenBranchMatchedException();
            }
            bVar = (a.b) aVar;
        }
        if (!epx.f(bVar, aVar)) {
            atomicReference.set(bVar);
        }
        return z2;
    }
}
