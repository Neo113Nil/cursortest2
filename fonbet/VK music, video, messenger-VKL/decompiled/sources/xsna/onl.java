package xsna;

import android.content.Context;
import androidx.activity.ComponentActivity;
import androidx.lifecycle.Lifecycle;
import com.vk.update.core.InAppUpdateUi;
import com.vk.update.core.a;
import io.reactivex.rxjava3.internal.util.ErrorMode;
import java.util.ArrayList;
import java.util.Collection;
import java.util.concurrent.TimeUnit;
import xsna.gex0;

/* compiled from: DefaultSuperappInAppUpdateBridge.kt */
/* loaded from: classes11.dex */
public final class onl {
    public final a a;
    public final bpn0 b = new bpn0(new cp(this, 2));

    /* compiled from: DefaultSuperappInAppUpdateBridge.kt */
    public static final class a {
        public final int a;
        public final Context b;
        public final String c;
        public final tmu0 d;
        public final io.reactivex.rxjava3.internal.operators.observable.t e;
        public final boolean f;
        public final r63 g;
        public final fex0 h;
        public final long i;
        public final ro j;
        public final gex0.b k;

        public a(int i, Context context, String str, tmu0 tmu0Var, io.reactivex.rxjava3.internal.operators.observable.t tVar, boolean z, r63 r63Var, fex0 fex0Var, long j, ro roVar, gex0.b bVar) {
            this.a = i;
            this.b = context;
            this.c = str;
            this.d = tmu0Var;
            this.e = tVar;
            this.f = z;
            this.g = r63Var;
            this.h = fex0Var;
            this.i = j;
            this.j = roVar;
            this.k = bVar;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof a)) {
                return false;
            }
            a aVar = (a) obj;
            return this.a == aVar.a && this.b.equals(aVar.b) && epx.f(this.c, aVar.c) && this.d.equals(aVar.d) && this.e.equals(aVar.e) && this.f == aVar.f && this.g.equals(aVar.g) && this.h.equals(aVar.h) && this.i == aVar.i && this.j.equals(aVar.j) && this.k.equals(aVar.k);
        }

        public final int hashCode() {
            return this.k.hashCode() + ((this.j.hashCode() + bh10.a((this.h.hashCode() + ((this.g.hashCode() + qoy.b((this.e.hashCode() + ((this.d.hashCode() + urd0.a((this.b.hashCode() + (Integer.hashCode(this.a) * 31)) * 31, 31, this.c)) * 31)) * 31, 31, this.f)) * 31)) * 31, 31, this.i)) * 31);
        }

        public final String toString() {
            return "Config(versionCode=" + this.a + ", context=" + this.b + ", baseUrl=" + this.c + ", inAppUpdateUiProvider=" + this.d + ", canShowInAppUpdate=" + this.e + ", internalUpdateEnabled=" + this.f + ", okHttpClientProvider=" + this.g + ", primaryUpdateEnginesProvider=" + this.h + ", updateTimeIntervalMs=" + this.i + ", logger=" + this.j + ", statListener=" + this.k + ')';
        }
    }

    /* compiled from: DefaultSuperappInAppUpdateBridge.kt */
    /* loaded from: classes6.dex */
    public static final class b implements androidx.lifecycle.l {
        public final ComponentActivity b;
        public final com.vk.update.core.a c;

        /* compiled from: DefaultSuperappInAppUpdateBridge.kt */
        public static final /* synthetic */ class a {
            public static final /* synthetic */ int[] $EnumSwitchMapping$0;

            static {
                int[] iArr = new int[Lifecycle.Event.values().length];
                try {
                    iArr[Lifecycle.Event.ON_RESUME.ordinal()] = 1;
                } catch (NoSuchFieldError unused) {
                }
                try {
                    iArr[Lifecycle.Event.ON_START.ordinal()] = 2;
                } catch (NoSuchFieldError unused2) {
                }
                try {
                    iArr[Lifecycle.Event.ON_STOP.ordinal()] = 3;
                } catch (NoSuchFieldError unused3) {
                }
                try {
                    iArr[Lifecycle.Event.ON_DESTROY.ordinal()] = 4;
                } catch (NoSuchFieldError unused4) {
                }
                $EnumSwitchMapping$0 = iArr;
            }
        }

        public b(ComponentActivity componentActivity, com.vk.update.core.a aVar) {
            this.b = componentActivity;
            this.c = aVar;
        }

        @Override // androidx.lifecycle.l
        public final void onStateChanged(f5z f5zVar, Lifecycle.Event event) {
            com.vk.update.core.a aVar = this.c;
            hn70 hn70Var = aVar.l;
            int i = a.$EnumSwitchMapping$0[event.ordinal()];
            if (i != 1) {
                if (i != 2) {
                    if (i == 3) {
                        aVar.k.dispose();
                        return;
                    } else {
                        if (i != 4) {
                            return;
                        }
                        this.b.getLifecycle().removeObserver(this);
                        return;
                    }
                }
                aVar.k.dispose();
                io.reactivex.rxjava3.subjects.f<a.C1935a> fVar = aVar.j;
                fVar.getClass();
                io.reactivex.rxjava3.internal.operators.observable.y yVar = new io.reactivex.rxjava3.internal.operators.observable.y(fVar, io.reactivex.rxjava3.internal.functions.a.a, io.reactivex.rxjava3.internal.functions.b.a);
                dg1 dg1Var = new dg1(new xcd(aVar, 29), 24);
                io.reactivex.rxjava3.internal.functions.b.a(2, "bufferSize");
                io.reactivex.rxjava3.disposables.c subscribe = new io.reactivex.rxjava3.internal.operators.mixed.h(yVar, dg1Var, ErrorMode.IMMEDIATE).subscribe(new oz(new com.vk.update.core.b(1, aVar, com.vk.update.core.a.class, "onUpdateEvent", "onUpdateEvent(Lcom/vk/update/core/InAppUpdateManager$UpdateEvent;)V", 0), 20));
                hg1.a(subscribe, aVar.b);
                aVar.k = subscribe;
                return;
            }
            ro roVar = aVar.g;
            roVar.l("start_update_checking: " + aVar.a);
            io.reactivex.rxjava3.internal.operators.single.f0 q = new io.reactivex.rxjava3.internal.operators.single.v(new yrw()).q(io.reactivex.rxjava3.schedulers.a.b());
            long a2 = qni0.a();
            StringBuilder b = fp.b(a2, "current:", ", interval:");
            long j = aVar.f;
            b.append(j);
            b.append(", updateTime:");
            qcy<Object>[] qcyVarArr = com.vk.update.core.a.m;
            qcy<Object> qcyVar = qcyVarArr[0];
            b.append(hn70Var.a().longValue());
            roVar.l(b.toString());
            StringBuilder sb = new StringBuilder("current-updateAvailableTime:");
            qcy<Object> qcyVar2 = qcyVarArr[0];
            sb.append(a2 - hn70Var.a().longValue());
            roVar.l(sb.toString());
            long j2 = a2 - j;
            qcy<Object> qcyVar3 = qcyVarArr[0];
            io.reactivex.rxjava3.core.x B = io.reactivex.rxjava3.core.x.B(q, io.reactivex.rxjava3.core.x.k(Boolean.valueOf(j2 > hn70Var.a().longValue())), new ca6(new lk1(aVar, 5), 22));
            TimeUnit timeUnit = TimeUnit.MILLISECONDS;
            aVar.a(B.g(5000L));
        }
    }

    public onl(a aVar) {
        this.a = aVar;
    }

    public final void a(ComponentActivity componentActivity) {
        a aVar = this.a;
        int i = aVar.a;
        InAppUpdateUi inAppUpdateUi = (InAppUpdateUi) aVar.d.invoke(componentActivity);
        io.reactivex.rxjava3.internal.operators.observable.t tVar = aVar.e;
        ArrayList arrayList = new ArrayList();
        arrayList.addAll((Collection) aVar.h.invoke(componentActivity));
        arrayList.add((vrw) this.b.getValue());
        s3q0 s3q0Var = s3q0.a;
        componentActivity.getLifecycle().addObserver(new b(componentActivity, new com.vk.update.core.a(i, componentActivity, inAppUpdateUi, tVar, arrayList, aVar.i, aVar.j, aVar.k)));
    }
}
