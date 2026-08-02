package yads;

import android.content.Context;
import android.view.ViewGroup;
import android.view.ViewTreeObserver;
import java.util.List;

/* loaded from: classes10.dex */
public final class bn {
    public final Context a;
    public final ViewGroup b;
    public final ze1 c;
    public final xe1 d;
    public final an e;

    public /* synthetic */ bn(Context context, ViewGroup viewGroup, List list, ViewTreeObserver.OnPreDrawListener onPreDrawListener) {
        this(context, viewGroup, new ze1(list), new xe1(), new an(onPreDrawListener));
    }

    public bn(Context context, ViewGroup viewGroup, ze1 ze1Var, xe1 xe1Var, an anVar) {
        this.a = context;
        this.b = viewGroup;
        this.c = ze1Var;
        this.d = xe1Var;
        this.e = anVar;
    }
}
