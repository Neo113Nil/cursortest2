package xsna;

import android.app.Activity;
import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.os.Handler;
import com.vk.core.apps.BuildInfo;
import com.vk.core.fragments.FragmentEntry;
import com.vk.core.fragments.FragmentImpl;
import com.vk.core.fragments.internal.transition.TransitionAnimation;
import com.vk.core.preference.Preference;
import com.vk.log.L;
import com.vk.navigation.NavigationException;
import com.vkontakte.android.FragmentWrapperActivity;
import com.vkontakte.android.MainActivity;
import com.vkontakte.android.TabletDialogActivity;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.Random;
import java.util.Set;
import java.util.UUID;
import java.util.concurrent.TimeUnit;
import kotlin.Pair;
import kotlin.collections.EmptySet;
import xsna.q6i;

/* compiled from: Navigator.kt */
/* loaded from: classes.dex */
public class oz50 extends tby {
    public static rsr k;
    public static final fv1 l = fv1.a;
    public final bpn0 c;
    public boolean d;
    public boolean e;
    public boolean f;
    public Class<? extends FragmentImpl> g;
    public final Class<? extends Activity> h;
    public TabletDialogActivity.a i;
    public final Bundle j;

    /* compiled from: Navigator.kt */
    /* loaded from: classes3.dex */
    public static abstract class a {
        public final Class<? extends Activity> a;
        public final Bundle b;

        public a(int i) {
            Bundle bundle = new Bundle();
            this.a = TabletDialogActivity.class;
            this.b = bundle;
        }

        public final Class<? extends Activity> a() {
            return this.a;
        }
    }

    /* compiled from: Navigator.kt */
    public static final class b {
        public static final Bundle a(Class cls, Bundle bundle) {
            rsr rsrVar = oz50.k;
            Bundle bundle2 = new Bundle();
            bundle2.putSerializable("class", cls);
            bundle2.putBundle("args", bundle);
            String E0 = erm0.E0(4, UUID.randomUUID().toString());
            bundle2.putString("id", E0);
            oz50.l.getClass();
            fv1.b.add(E0);
            Preference preference = Preference.a;
            Preference.K(izi0.k(Preference.u(EmptySet.b, "by_version", "allowed_intent_ids_set"), E0), "by_version", "allowed_intent_ids_set");
            return bundle2;
        }

        /* JADX WARN: Removed duplicated region for block: B:20:0x003a A[RETURN] */
        /* JADX WARN: Removed duplicated region for block: B:5:0x0015 A[Catch: all -> 0x0010, TRY_LEAVE, TryCatch #0 {all -> 0x0010, blocks: (B:22:0x0003, B:24:0x0009, B:5:0x0015), top: B:21:0x0003 }] */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
        */
        public static Bundle b(Intent intent) {
            Bundle bundle;
            String str;
            ComponentName component;
            if (intent != null) {
                try {
                    Bundle extras = intent.getExtras();
                    if (extras != null) {
                        bundle = extras.getBundle("args");
                        if (bundle != null) {
                            return bundle;
                        }
                        bundle.keySet();
                        return bundle;
                    }
                } catch (Throwable th) {
                    com.vk.metrics.eventtracking.b bVar = com.vk.metrics.eventtracking.b.a;
                    if (intent == null || (component = intent.getComponent()) == null || (str = component.toString()) == null) {
                        str = "No Intent info";
                    }
                    bVar.a(new NavigationException("Can't extract args\n".concat(str), th));
                    return null;
                }
            }
            bundle = null;
            if (bundle != null) {
            }
        }

        /* JADX WARN: Code restructure failed: missing block: B:22:0x00ab, code lost:
        
            if (r0.longValue() != r4) goto L47;
         */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
        */
        public static FragmentEntry c(Bundle bundle) {
            String E0;
            long j;
            Long valueOf;
            fv1 fv1Var = oz50.l;
            String string = bundle != null ? bundle.getString("id") : null;
            fv1Var.getClass();
            if (!j5g.P(fv1.b, string)) {
                Preference preference = Preference.a;
                if (!j5g.P(Preference.u(EmptySet.b, "by_version", "allowed_intent_ids_set"), string)) {
                    rsr rsrVar = oz50.k;
                    if (rsrVar == null) {
                        rsrVar = null;
                    }
                    rsrVar.getClass();
                    psp0 psp0Var = new psp0();
                    q6i.a aVar = q6i.a;
                    if (psp0Var != aVar && bundle != null) {
                        long j2 = bundle.getLong("s_id");
                        rsr rsrVar2 = oz50.k;
                        if (rsrVar2 == null) {
                            rsrVar2 = null;
                        }
                        rsrVar2.getClass();
                        if (new psp0() == aVar) {
                            valueOf = null;
                        } else {
                            rsr rsrVar3 = oz50.k;
                            if (rsrVar3 == null) {
                                rsrVar3 = null;
                            }
                            rsrVar3.getClass();
                            psp0 psp0Var2 = new psp0();
                            a1w a1wVar = q1w.a;
                            if (a1wVar == null) {
                                a1wVar = null;
                            }
                            if (a1wVar.u()) {
                                a1w a1wVar2 = q1w.a;
                                if (a1wVar2 == null) {
                                    a1wVar2 = null;
                                }
                                Long l = (Long) vdg0.b(a1wVar2.o(psp0Var2, qsp0.b, 500L), new n99(psp0Var2));
                                if (l != null) {
                                    j = l.longValue();
                                    valueOf = Long.valueOf(new Random(j).nextLong());
                                }
                            }
                            j = -1;
                            valueOf = Long.valueOf(new Random(j).nextLong());
                        }
                        if (valueOf != null) {
                        }
                    }
                    if (bundle != null) {
                        Set<String> keySet = bundle.keySet();
                        ArrayList arrayList = new ArrayList(c5g.u(keySet, 10));
                        for (String str : keySet) {
                            arrayList.add(new Pair(str, bundle.get(str)));
                        }
                        String str2 = "Attempt to open disallowed entry: " + arrayList;
                        if (BuildInfo.m()) {
                            L.l(str2);
                            return null;
                        }
                        com.vk.metrics.eventtracking.b.a.a(new NavigationException(str2));
                        return null;
                    }
                    return null;
                }
            }
            Serializable serializable = bundle != null ? bundle.getSerializable("class") : null;
            Class cls = serializable instanceof Class ? (Class) serializable : null;
            Bundle bundle2 = bundle != null ? bundle.getBundle("args") : null;
            if (bundle == null || (E0 = bundle.getString("id")) == null) {
                E0 = erm0.E0(4, UUID.randomUUID().toString());
            }
            if (cls != null && bundle2 != null) {
                return new FragmentEntry(cls, bundle2, E0);
            }
            return null;
        }

        public static Class d() {
            rsr rsrVar = oz50.k;
            if (rsrVar == null) {
                rsrVar = null;
            }
            rsrVar.getClass();
            return MainActivity.class;
        }
    }

    public oz50() {
        throw null;
    }

    public oz50(Class<? extends FragmentImpl> cls, Class<? extends Activity> cls2, Bundle bundle) {
        this.c = new bpn0(new com.vk.movika.sdk.base.ui.v(27));
        this.f = true;
        this.g = cls;
        this.h = cls2;
        bundle = bundle == null ? new Bundle() : bundle;
        this.j = bundle;
        bundle.putBoolean("_fragment_impl_key_hide_bottom_fragment", true);
    }

    public final FragmentImpl f() {
        return j().Ab();
    }

    public final void g(int i, FragmentImpl fragmentImpl) {
        i(xa4.M(fragmentImpl), i);
    }

    public final void h(Activity activity, int i) {
        if (activity != null) {
            i(xa4.L(activity), i);
        }
    }

    public final void i(u90 u90Var, int i) {
        if (p()) {
            Intent n = n(u90Var.B());
            r(n);
            u90Var.D(n, i, null);
            q(n);
        }
    }

    public final FragmentEntry j() {
        return new FragmentEntry(this.g, this.j);
    }

    public final void k(Context context) {
        if (context != null) {
            m(xa4.L(context));
        }
    }

    public final void l(FragmentImpl fragmentImpl) {
        m(xa4.M(fragmentImpl));
    }

    public final void m(u90 u90Var) {
        if (p()) {
            Intent n = n(u90Var.B());
            r(n);
            u90Var.E(n);
            q(n);
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:11:0x0027, code lost:
    
        if (r1.get("should_open_auth_edu") == null) goto L14;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:14:0x002f  */
    /* JADX WARN: Removed duplicated region for block: B:19:0x0048  */
    /* JADX WARN: Removed duplicated region for block: B:25:0x0063  */
    /* JADX WARN: Removed duplicated region for block: B:29:0x0070  */
    /* JADX WARN: Removed duplicated region for block: B:32:0x0089  */
    /* JADX WARN: Removed duplicated region for block: B:35:0x006c  */
    /* JADX WARN: Removed duplicated region for block: B:36:0x0053  */
    /* JADX WARN: Removed duplicated region for block: B:40:0x0040  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public Intent n(Context context) {
        boolean z;
        Bundle a2;
        Class<? extends Activity> cls;
        Class<? extends Activity> cls2;
        Bundle bundle = this.j;
        Class<? extends Activity> cls3 = null;
        if (!bundle.containsKey("need_relogin")) {
            if (this.d) {
                rsr rsrVar = k;
                if (rsrVar == null) {
                    rsrVar = null;
                }
                rsrVar.getClass();
                if (q6r0.f().A()) {
                }
            }
            z = false;
            if (z) {
                a2 = b.a(this.g, bundle);
            } else {
                rsr rsrVar2 = k;
                if (rsrVar2 == null) {
                    rsrVar2 = null;
                }
                rsrVar2.getClass();
                a2 = b.a(b68.d(), bundle);
            }
            if (z) {
                rsr rsrVar3 = k;
                if (rsrVar3 == null) {
                    rsrVar3 = null;
                }
                rsrVar3.getClass();
                cls = FragmentWrapperActivity.class;
            } else {
                rsr rsrVar4 = k;
                if (rsrVar4 == null) {
                    rsrVar4 = null;
                }
                rsrVar4.getClass();
                cls = MainActivity.class;
            }
            cls2 = this.h;
            if (cls2 != null) {
                TabletDialogActivity.a aVar = this.i;
                if (aVar != null) {
                    cls3 = aVar.a();
                }
            } else {
                cls3 = cls2;
            }
            if (cls3 != null) {
                cls = cls3;
            }
            Intent intent = new Intent(context, cls);
            intent.putExtras(a2);
            intent.putExtra("key_clear_top", this.e);
            intent.putExtra("initialize_camera", this.f);
            if (context instanceof ey50) {
                ((ey50) context).Y().b0(intent);
            }
            return intent;
        }
        z = true;
        if (z) {
        }
        if (z) {
        }
        cls2 = this.h;
        if (cls2 != null) {
        }
        if (cls3 != null) {
        }
        Intent intent2 = new Intent(context, cls);
        intent2.putExtras(a2);
        intent2.putExtra("key_clear_top", this.e);
        intent2.putExtra("initialize_camera", this.f);
        if (context instanceof ey50) {
        }
        return intent2;
    }

    public final void o() {
        this.j.putBoolean("ignore_auth", true);
    }

    public boolean p() {
        return true;
    }

    public final void q(Intent intent) {
        ((Handler) this.c.getValue()).postDelayed(new nx3(b.c(intent.getExtras()), 11), TimeUnit.SECONDS.toMillis(15L));
    }

    public final void s(boolean z) {
        this.j.putBoolean("no_bottom_navigation", z);
    }

    public final void t() {
        this.j.putBoolean("no_left_menu", true);
    }

    public final void u(TransitionAnimation.Animations animations) {
        Bundle bundle = this.j;
        bundle.remove("withoutAnimation");
        bundle.putParcelable("transition", animations);
    }

    public final void v(Class cls) {
        if (cls != null) {
            this.j.putSerializable("_fragment_impl_key_root_fragment", cls);
        }
    }

    public final void w(int i) {
        this.j.putInt("theme", i);
    }

    public final void x() {
        Bundle bundle = this.j;
        bundle.putBoolean("withoutAnimation", true);
        bundle.remove("transition");
    }

    public oz50(Class<? extends FragmentImpl> cls, Bundle bundle) {
        this(cls, null, bundle);
    }

    public void r(Intent intent) {
    }
}
