package defpackage;

import android.net.Uri;
import java.util.List;
import kotlin.collections.EmptyList;

/* loaded from: classes13.dex */
public final class mrf0 implements orf0 {
    public final Uri a;
    public final List b;
    public final v770 c;

    public /* synthetic */ mrf0(Uri uri, v770 v770Var, int i) {
        this((i & 1) != 0 ? null : uri, EmptyList.a, (i & 4) != 0 ? v770.b : v770Var);
    }

    public mrf0(Uri uri, List list, v770 v770Var) {
        this.a = uri;
        this.b = list;
        this.c = v770Var;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public mrf0() {
        this((Uri) null, (v770) (0 == true ? 1 : 0), 7);
    }
}
