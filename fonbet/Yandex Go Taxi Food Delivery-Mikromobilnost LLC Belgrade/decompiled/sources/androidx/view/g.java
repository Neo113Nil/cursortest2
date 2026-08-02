package androidx.view;

import android.os.Bundle;
import defpackage.d550;
import defpackage.f550;
import defpackage.k550;
import defpackage.ke50;
import defpackage.nrb1;
import defpackage.ny61;
import defpackage.oa50;
import defpackage.oyr;
import defpackage.tls;
import defpackage.vg10;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import kotlin.Metadata;
import kotlin.collections.b;
import kotlin.jvm.internal.Ref$ObjectRef;

@Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0017\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001¨\u0006\u0003"}, d2 = {"Landroidx/navigation/g;", "Landroidx/navigation/j;", "Lf550;", "navigation-common_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
@oa50("navigation")
/* loaded from: classes10.dex */
public class g extends j {
    public final ke50 c;

    public g(ke50 ke50Var) {
        this.c = ke50Var;
    }

    @Override // androidx.view.j
    public final f a() {
        return new f550(this);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v3, types: [T, android.os.Bundle] */
    /* JADX WARN: Type inference failed for: r4v4, types: [T, android.os.Bundle] */
    @Override // androidx.view.j
    public final void d(List list, k550 k550Var) {
        String str;
        Iterator it = list.iterator();
        while (it.hasNext()) {
            b bVar = (b) it.next();
            f550 f550Var = (f550) bVar.b;
            final Ref$ObjectRef ref$ObjectRef = new Ref$ObjectRef();
            ref$ObjectRef.element = bVar.a();
            int i = f550Var.F;
            String str2 = f550Var.H;
            if (i == 0 && str2 == null) {
                StringBuilder sb = new StringBuilder("no start destination defined via app:startDestination for ");
                int i2 = f550Var.A;
                if (i2 != 0) {
                    str = f550Var.c;
                    if (str == null) {
                        str = String.valueOf(i2);
                    }
                } else {
                    str = "the root navigation";
                }
                sb.append(str);
                throw new IllegalStateException(sb.toString().toString());
            }
            f g = str2 != null ? f550Var.g(str2, false) : (f) f550Var.E.b(i);
            if (g == null) {
                if (f550Var.G == null) {
                    String str3 = f550Var.H;
                    if (str3 == null) {
                        str3 = String.valueOf(f550Var.F);
                    }
                    f550Var.G = str3;
                }
                ny61.g(oyr.p("navigation destination ", f550Var.G, " is not a direct child of this NavGraph"));
                return;
            }
            LinkedHashMap linkedHashMap = g.z;
            if (str2 != null) {
                if (!str2.equals(g.B)) {
                    d550 d = g.d(str2);
                    Bundle bundle = d != null ? d.b : null;
                    if (bundle != null && !bundle.isEmpty()) {
                        ?? bundle2 = new Bundle();
                        bundle2.putAll(bundle);
                        Bundle bundle3 = (Bundle) ref$ObjectRef.element;
                        if (bundle3 != null) {
                            bundle2.putAll(bundle3);
                        }
                        ref$ObjectRef.element = bundle2;
                    }
                }
                if (b.t(linkedHashMap).isEmpty()) {
                    continue;
                } else {
                    ArrayList a = nrb1.a(b.t(linkedHashMap), new tls() { // from class: androidx.navigation.NavGraphNavigator$navigate$missingRequiredArgs$1
                        {
                            super(1);
                        }

                        @Override // defpackage.tls
                        public final Object invoke(Object obj) {
                            String str4 = (String) obj;
                            Bundle bundle4 = Ref$ObjectRef.this.element;
                            boolean z = true;
                            if (bundle4 != null && bundle4.containsKey(str4)) {
                                z = false;
                            }
                            return Boolean.valueOf(z);
                        }
                    });
                    if (!a.isEmpty()) {
                        vg10.a(93, g, ". Missing required arguments [", a, "Cannot navigate to startDestination ");
                        return;
                    }
                }
            }
            this.c.b(g.a).d(Collections.singletonList(b().a(g, g.a((Bundle) ref$ObjectRef.element))), k550Var);
        }
    }
}
