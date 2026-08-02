package xsna;

import java.lang.annotation.Annotation;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import kotlin.collections.EmptyList;
import kotlinx.serialization.descriptors.SerialDescriptor;

/* compiled from: SerialDescriptors.kt */
/* loaded from: classes8.dex */
public final class sfc {
    public final String a;
    public List<? extends Annotation> b = EmptyList.b;
    public final ArrayList c = new ArrayList();
    public final HashSet d = new HashSet();
    public final ArrayList e = new ArrayList();
    public final ArrayList f = new ArrayList();
    public final ArrayList g = new ArrayList();

    public sfc(String str) {
        this.a = str;
    }

    public static void a(sfc sfcVar, String str, SerialDescriptor serialDescriptor) {
        EmptyList emptyList = EmptyList.b;
        if (!sfcVar.d.add(str)) {
            StringBuilder a = t33.a("Element with name '", str, "' is already registered in ");
            a.append(sfcVar.a);
            throw new IllegalArgumentException(a.toString().toString());
        }
        sfcVar.c.add(str);
        sfcVar.e.add(serialDescriptor);
        sfcVar.f.add(emptyList);
        sfcVar.g.add(false);
    }
}
