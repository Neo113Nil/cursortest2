package defpackage;

import android.os.RemoteException;
import androidx.room.IMultiInstanceInvalidationService;
import androidx.room.f;
import java.util.Collection;
import java.util.Collections;
import java.util.Set;
import kotlin.collections.EmptySet;
import kotlin.collections.builders.SetBuilder;

/* loaded from: classes10.dex */
public final class er60 {
    public final at20 a;
    public final int[] b;
    public final String[] c;
    public final Set d;

    public er60(at20 at20Var, int[] iArr, String[] strArr) {
        this.a = at20Var;
        this.b = iArr;
        this.c = strArr;
        if (iArr.length == strArr.length) {
            this.d = !(strArr.length == 0) ? Collections.singleton(strArr[0]) : EmptySet.a;
        } else {
            ny61.r("Check failed.");
            throw null;
        }
    }

    public final void a(Set set) {
        int[] iArr = this.b;
        int length = iArr.length;
        Collection collection = EmptySet.a;
        if (length != 0) {
            if (length != 1) {
                SetBuilder setBuilder = new SetBuilder();
                int length2 = iArr.length;
                int i = 0;
                int i2 = 0;
                while (i < length2) {
                    int i3 = i2 + 1;
                    if (set.contains(Integer.valueOf(iArr[i]))) {
                        setBuilder.add(this.c[i2]);
                    }
                    i++;
                    i2 = i3;
                }
                collection = setBuilder.b();
            } else if (set.contains(Integer.valueOf(iArr[0]))) {
                collection = this.d;
            }
        }
        if (collection.isEmpty()) {
            return;
        }
        f fVar = (f) this.a.b;
        if (fVar.e.get()) {
            return;
        }
        try {
            IMultiInstanceInvalidationService iMultiInstanceInvalidationService = fVar.g;
            if (iMultiInstanceInvalidationService != null) {
                iMultiInstanceInvalidationService.broadcastInvalidation(fVar.f, (String[]) collection.toArray(new String[0]));
            }
        } catch (RemoteException unused) {
        }
    }
}
