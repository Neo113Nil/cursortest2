package defpackage;

import android.view.View;
import androidx.core.view.ViewCompat$Api21Impl;
import androidx.core.view.b;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.Map;
import java.util.WeakHashMap;

/* loaded from: classes10.dex */
public final class fes implements Runnable {
    public final /* synthetic */ int a = 0;
    public final /* synthetic */ int b;
    public final /* synthetic */ Object c;
    public final /* synthetic */ Serializable w;
    public final /* synthetic */ Object x;
    public final /* synthetic */ Object y;

    public /* synthetic */ fes(h3k h3kVar, int i, Exception exc, byte[] bArr, Map map) {
        this.c = h3kVar;
        this.b = i;
        this.w = exc;
        this.x = bArr;
        this.y = map;
    }

    @Override // java.lang.Runnable
    public final void run() {
        int i = this.a;
        Object obj = this.x;
        Serializable serializable = this.w;
        int i2 = this.b;
        Object obj2 = this.c;
        switch (i) {
            case 0:
                for (int i3 = 0; i3 < i2; i3++) {
                    View view = (View) ((ArrayList) obj2).get(i3);
                    String str = (String) ((ArrayList) serializable).get(i3);
                    WeakHashMap weakHashMap = b.a;
                    ViewCompat$Api21Impl.p(view, str);
                    ViewCompat$Api21Impl.p((View) ((ArrayList) obj).get(i3), (String) ((ArrayList) this.y).get(i3));
                }
                break;
            default:
                ((qua1) ((h3k) obj2).w).i(i2, (Exception) serializable, (byte[]) obj);
                break;
        }
    }

    public fes(int i, ArrayList arrayList, ArrayList arrayList2, ArrayList arrayList3, ArrayList arrayList4) {
        this.b = i;
        this.c = arrayList;
        this.w = arrayList2;
        this.x = arrayList3;
        this.y = arrayList4;
    }
}
