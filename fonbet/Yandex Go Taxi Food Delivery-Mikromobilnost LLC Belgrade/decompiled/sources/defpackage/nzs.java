package defpackage;

import android.os.Parcel;
import android.view.ViewGroup;
import com.yandex.mapkit.transport.masstransit.Route;
import com.yandex.runtime.bindings.Archive;
import com.yandex.runtime.bindings.ClassHandler;
import com.yandex.runtime.bindings.StringHandler;
import java.util.Collections;
import java.util.HashSet;
import java.util.List;
import java.util.Objects;
import java.util.Set;
import java.util.concurrent.atomic.AtomicReferenceFieldUpdater;
import kotlin.KotlinNothingValueException;
import kotlinx.coroutines.c;
import kotlinx.coroutines.internal.a;
import ru.CryptoPro.JCP.pref.JCPPref;
import ru.yandex.taxi.common_models.net.FormattedText;
import ru.yandex.taxi.design.ListItemComponent;

/* loaded from: classes15.dex */
public abstract /* synthetic */ class nzs {
    public static /* synthetic */ boolean A(AtomicReferenceFieldUpdater atomicReferenceFieldUpdater, c cVar, Object obj, Object obj2) {
        while (!atomicReferenceFieldUpdater.compareAndSet(cVar, obj, obj2)) {
            if (atomicReferenceFieldUpdater.get(cVar) != obj) {
                return false;
            }
        }
        return true;
    }

    public static /* synthetic */ boolean B(AtomicReferenceFieldUpdater atomicReferenceFieldUpdater, a aVar, a aVar2, a aVar3) {
        while (!atomicReferenceFieldUpdater.compareAndSet(aVar, aVar2, aVar3)) {
            if (atomicReferenceFieldUpdater.get(aVar) != aVar2) {
                return false;
            }
        }
        return true;
    }

    public static /* synthetic */ boolean C(AtomicReferenceFieldUpdater atomicReferenceFieldUpdater, a aVar, a aVar2, a aVar3) {
        while (!atomicReferenceFieldUpdater.compareAndSet(aVar, aVar2, aVar3)) {
            if (atomicReferenceFieldUpdater.get(aVar) != aVar2) {
                return false;
            }
        }
        return true;
    }

    public static /* synthetic */ boolean D(AtomicReferenceFieldUpdater atomicReferenceFieldUpdater, a aVar, a aVar2, a aVar3) {
        while (!atomicReferenceFieldUpdater.compareAndSet(aVar, aVar2, aVar3)) {
            if (atomicReferenceFieldUpdater.get(aVar) != aVar2) {
                return false;
            }
        }
        return true;
    }

    public static double a(Route route) {
        return route.getMetadata().getWeight().getTime().getValue();
    }

    public static String b(String str, String str2, boolean z) {
        return str + z + str2;
    }

    public static String c(StringBuilder sb, double d, String str) {
        sb.append(d);
        sb.append(str);
        return sb.toString();
    }

    public static String d(StringBuilder sb, Boolean bool, String str) {
        sb.append(bool);
        sb.append(str);
        return sb.toString();
    }

    public static List e(Class cls, Archive archive, List list, boolean z) {
        return archive.add(list, z, new ClassHandler(cls));
    }

    public static /* synthetic */ Set f(String str) {
        HashSet hashSet = new HashSet(1);
        Object obj = new Object[]{str}[0];
        Objects.requireNonNull(obj);
        if (hashSet.add(obj)) {
            return Collections.unmodifiableSet(hashSet);
        }
        ny61.g(qv10.o("duplicate element: ", obj));
        return null;
    }

    public static KotlinNothingValueException g(String str) {
        lxv.b(str);
        return new KotlinNothingValueException();
    }

    public static void h(int i, int i2, int i3, int i4, int i5) {
        jcb1.a(i);
        jcb1.a(i2);
        jcb1.a(i3);
        jcb1.a(i4);
        jcb1.a(i5);
    }

    public static void i(long j, oz40 oz40Var) {
        oz40Var.setValue(new wu60(j));
    }

    public static /* synthetic */ void j(v0y v0yVar) {
        throw new ClassCastException();
    }

    public static void k(Parcel parcel, int i, Boolean bool) {
        parcel.writeInt(i);
        parcel.writeInt(bool.booleanValue() ? 1 : 0);
    }

    public static void l(Archive archive, List list, boolean z) {
        archive.add(list, z, new StringHandler());
    }

    public static void m(Class cls, Archive archive, List list, boolean z) {
        archive.add(list, z, new ClassHandler(cls));
    }

    public static /* synthetic */ void n(Object obj) {
        throw new ClassCastException();
    }

    public static void o(StringBuilder sb, String str, double d, String str2) {
        sb.append(str);
        sb.append(d);
        sb.append(str2);
    }

    public static void p(StringBuilder sb, List list, String str, boolean z, String str2) {
        sb.append(list);
        sb.append(str);
        sb.append(z);
        sb.append(str2);
    }

    public static /* synthetic */ void q(AtomicReferenceFieldUpdater atomicReferenceFieldUpdater, sdz sdzVar, udz udzVar, udz udzVar2) {
        while (!atomicReferenceFieldUpdater.compareAndSet(sdzVar, udzVar, udzVar2) && atomicReferenceFieldUpdater.get(sdzVar) == udzVar) {
        }
    }

    public static /* synthetic */ void r(a aVar) {
        if (aVar != null) {
            return;
        }
        ny61.u();
    }

    public static void s(ListItemComponent listItemComponent, int i, int i2) {
        listItemComponent.setLayoutParams(new ViewGroup.LayoutParams(i, i2));
    }

    public static boolean t(int i, FormattedText formattedText) {
        return jl40.l(formattedText, new FormattedText(i));
    }

    public static boolean u(Class cls) {
        return new JCPPref(cls).isWriteAvailable();
    }

    public static /* synthetic */ boolean v(AtomicReferenceFieldUpdater atomicReferenceFieldUpdater, t8x t8xVar, Object obj, hxi0 hxi0Var) {
        while (!atomicReferenceFieldUpdater.compareAndSet(t8xVar, obj, hxi0Var)) {
            if (atomicReferenceFieldUpdater.get(t8xVar) != obj) {
                return false;
            }
        }
        return true;
    }

    public static /* synthetic */ boolean w(AtomicReferenceFieldUpdater atomicReferenceFieldUpdater, c cVar, wun wunVar, ipb ipbVar) {
        while (!atomicReferenceFieldUpdater.compareAndSet(cVar, wunVar, ipbVar)) {
            if (atomicReferenceFieldUpdater.get(cVar) != wunVar) {
                return false;
            }
        }
        return true;
    }

    public static /* synthetic */ boolean x(AtomicReferenceFieldUpdater atomicReferenceFieldUpdater, c cVar, t8x t8xVar) {
        wun wunVar = ffx.h;
        while (!atomicReferenceFieldUpdater.compareAndSet(cVar, t8xVar, wunVar)) {
            if (atomicReferenceFieldUpdater.get(cVar) != t8xVar) {
                return false;
            }
        }
        return true;
    }

    public static /* synthetic */ boolean y(AtomicReferenceFieldUpdater atomicReferenceFieldUpdater, c cVar, Object obj) {
        wun wunVar = ffx.h;
        while (!atomicReferenceFieldUpdater.compareAndSet(cVar, obj, wunVar)) {
            if (atomicReferenceFieldUpdater.get(cVar) != obj) {
                return false;
            }
        }
        return true;
    }

    public static /* synthetic */ boolean z(AtomicReferenceFieldUpdater atomicReferenceFieldUpdater, c cVar, Object obj, de60 de60Var) {
        while (!atomicReferenceFieldUpdater.compareAndSet(cVar, obj, de60Var)) {
            if (atomicReferenceFieldUpdater.get(cVar) != obj) {
                return false;
            }
        }
        return true;
    }
}
