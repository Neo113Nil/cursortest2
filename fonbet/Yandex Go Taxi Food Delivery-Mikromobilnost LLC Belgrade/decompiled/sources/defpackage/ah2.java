package defpackage;

import com.google.android.material.animation.a;
import java.util.ArrayList;
import java.util.Iterator;

/* loaded from: classes11.dex */
public final class ah2 implements w4n {
    public final /* synthetic */ a a;

    public ah2(a aVar) {
        this.a = aVar;
    }

    @Override // defpackage.w4n
    public final void a(y4n y4nVar, boolean z, float f, float f2) {
        ArrayList arrayList = y4nVar.k;
        int indexOf = arrayList.indexOf(this);
        if (indexOf >= 0) {
            arrayList.set(indexOf, null);
        }
        a aVar = this.a;
        int i = aVar.d - 1;
        aVar.d = i;
        if (i == 0) {
            Iterator it = aVar.c.iterator();
            while (it.hasNext()) {
                ((bh2) it.next()).b();
            }
            aVar.e = false;
        }
    }
}
