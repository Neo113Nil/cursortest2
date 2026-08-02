package defpackage;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import kotlin.collections.EmptyList;
import kotlinx.serialization.descriptors.SerialDescriptor;

/* loaded from: classes9.dex */
public final class h0c {
    public final String a;
    public List b = EmptyList.a;
    public final ArrayList c = new ArrayList();
    public final HashSet d = new HashSet();
    public final ArrayList e = new ArrayList();
    public final ArrayList f = new ArrayList();
    public final ArrayList g = new ArrayList();

    public h0c(String str) {
        this.a = str;
    }

    public final void a(String str, SerialDescriptor serialDescriptor, boolean z) {
        if (!this.d.add(str)) {
            StringBuilder x = unr0.x("Element with name '", str, "' is already registered in ");
            x.append(this.a);
            throw new IllegalArgumentException(x.toString().toString());
        }
        this.c.add(str);
        this.e.add(serialDescriptor);
        this.f.add(EmptyList.a);
        this.g.add(Boolean.valueOf(z));
    }
}
