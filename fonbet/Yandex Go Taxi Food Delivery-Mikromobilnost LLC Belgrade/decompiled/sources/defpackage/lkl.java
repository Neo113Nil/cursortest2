package defpackage;

import android.view.View;
import androidx.transition.Transition;
import java.util.ArrayList;
import java.util.List;

/* loaded from: classes2.dex */
public final class lkl {
    public final Transition a;
    public final View b;
    public final ArrayList c;
    public final ArrayList d;

    public lkl(Transition transition, View view, ArrayList arrayList, ArrayList arrayList2) {
        this.a = transition;
        this.b = view;
        this.c = arrayList;
        this.d = arrayList2;
    }

    public final List a() {
        return this.c;
    }

    public final List b() {
        return this.d;
    }

    public final View c() {
        return this.b;
    }

    public final Transition d() {
        return this.a;
    }
}
