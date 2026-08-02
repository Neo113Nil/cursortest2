package defpackage;

import android.view.View;
import android.view.ViewConfiguration;
import com.yandex.android.webview.view.a;

/* loaded from: classes11.dex */
public final class ifh implements hn50 {
    public final View a;
    public final a b;
    public final a c;
    public final int d;
    public int e;
    public int f;
    public boolean g;
    public final int[] h = new int[2];
    public final int[] i = new int[2];
    public int j;
    public final sn50 k;
    public boolean l;

    public ifh(View view, a aVar, a aVar2) {
        this.a = view;
        this.k = new sn50(view);
        this.d = ViewConfiguration.get(view.getContext()).getScaledTouchSlop();
        this.b = aVar;
        this.c = aVar2;
    }
}
