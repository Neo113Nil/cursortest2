package xsna;

import android.app.Activity;
import android.content.Context;
import com.vk.android.launcher.icons.IconAlias;
import com.vk.core.preference.Preference;
import java.util.ArrayList;
import java.util.Set;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicInteger;
import kotlin.Pair;
import kotlin.collections.EmptyList;
import kotlin.jvm.internal.FunctionReferenceImpl;
import xsna.j1v0;

/* compiled from: IconSwitcher.kt */
/* loaded from: classes.dex */
public final class grv extends ja0 {
    public final Context b;
    public final j1v0 c;
    public final ijk0 d;
    public final AtomicInteger e = new AtomicInteger(0);

    /* compiled from: IconSwitcher.kt */
    /* loaded from: classes14.dex */
    public static final /* synthetic */ class a extends FunctionReferenceImpl implements gzs<s3q0> {
        public a(grv grvVar) {
            super(0, grvVar, grv.class, "setDefaultIcon", "setDefaultIcon()V", 0);
        }

        @Override // xsna.gzs
        public final s3q0 invoke() {
            grv grvVar = (grv) this.receiver;
            grvVar.getClass();
            bny bnyVar = bny.a;
            Context context = grvVar.b;
            bnyVar.getClass();
            v1v0 v1v0Var = bny.i;
            if (v1v0Var == null) {
                v1v0Var = null;
            }
            bny.a(context, v1v0Var.d);
            return s3q0.a;
        }
    }

    /* compiled from: IconSwitcher.kt */
    /* loaded from: classes14.dex */
    public static final /* synthetic */ class b extends FunctionReferenceImpl implements gzs<s3q0> {
        public b(Object obj) {
            super(0, obj, ijk0.class, "trySwitch", "trySwitch()V", 0);
        }

        @Override // xsna.gzs
        public final s3q0 invoke() {
            ijk0 ijk0Var = (ijk0) this.receiver;
            hd60 hd60Var = ijk0Var.d;
            hjk0 hjk0Var = ijk0Var.b;
            if (((Boolean) hjk0Var.a.invoke()).booleanValue()) {
                Pair pair = new Pair(Preference.s("__launcher_event_icon_change__", "__from_non_special_launcher_name__", ""), Preference.s("__launcher_event_icon_change__", "__to_special_launcher_name__", ""));
                String str = (String) pair.d();
                String str2 = (String) pair.g();
                pqm0 pqm0Var = hjk0Var.c;
                hjk0Var.b.invoke();
                ((EmptyList) pqm0Var.b).getClass();
                if (!epx.f(str2, null) && Preference.d("__launcher_event_icon_change__", "__last_feature_availability__", false)) {
                    ijk0Var.a(str);
                }
            } else if (Preference.d("__launcher_event_icon_change__", "__last_feature_availability__", false)) {
                ijk0Var.a((String) new Pair(Preference.s("__launcher_event_icon_change__", "__from_non_special_launcher_name__", ""), Preference.s("__launcher_event_icon_change__", "__to_special_launcher_name__", "")).d());
            }
            return s3q0.a;
        }
    }

    public grv(Context context, j1v0 j1v0Var, ijk0 ijk0Var) {
        this.b = context;
        this.c = j1v0Var;
        this.d = ijk0Var;
    }

    @Override // xsna.ja0, android.app.Application.ActivityLifecycleCallbacks
    public final void onActivityStarted(Activity activity) {
        this.e.getAndIncrement();
    }

    /* JADX WARN: Code restructure failed: missing block: B:11:0x009c, code lost:
    
        r8 = new xsna.grv.a(r7);
     */
    /* JADX WARN: Code restructure failed: missing block: B:41:0x0099, code lost:
    
        if (com.vk.core.preference.Preference.d("__launcher_event_icon_change__", "__last_feature_availability__", false) == false) goto L35;
     */
    @Override // xsna.ja0, android.app.Application.ActivityLifecycleCallbacks
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void onActivityStopped(Activity activity) {
        AtomicInteger atomicInteger = this.e;
        atomicInteger.decrementAndGet();
        if (atomicInteger.get() == 0) {
            j1v0 j1v0Var = this.c;
            vmy vmyVar = j1v0Var.c;
            Context context = this.b;
            if (vmyVar != null) {
                v1v0 v1v0Var = vmyVar.a;
                boolean a2 = j1v0Var.a(context);
                j1v0.a aVar = j1v0Var.a.get();
                bny bnyVar = bny.a;
                IconAlias iconAlias = v1v0Var.d;
                bnyVar.getClass();
                boolean c = bny.c(context, iconAlias);
                if (!(aVar instanceof j1v0.a.b)) {
                }
            }
            vmy vmyVar2 = j1v0Var.c;
            ijk0 ijk0Var = this.d;
            if (vmyVar2 != null) {
                v1v0 v1v0Var2 = vmyVar2.a;
                ArrayList<xmy> b2 = v1v0Var2.b(context);
                if (b2.size() == 1) {
                    if (!b2.isEmpty()) {
                        for (xmy xmyVar : b2) {
                            if (((Set) v1v0Var2.f.getValue()).contains(xmyVar) || epx.f(xmyVar, v1v0Var2.d)) {
                            }
                        }
                    }
                }
                if (!((Boolean) ijk0Var.b.a.invoke()).booleanValue()) {
                }
            }
            final FunctionReferenceImpl bVar = (((Boolean) ijk0Var.b.a.invoke()).booleanValue() || Preference.d("__launcher_event_icon_change__", "__last_feature_availability__", false)) ? new b(ijk0Var) : null;
            if (bVar != null) {
                asu0.a.getClass();
                asu0.u().schedule(new Runnable() { // from class: xsna.frv
                    @Override // java.lang.Runnable
                    public final void run() {
                        if (grv.this.e.get() == 0) {
                            ((gzs) bVar).invoke();
                        }
                    }
                }, 1000L, TimeUnit.MILLISECONDS);
            }
        }
    }
}
