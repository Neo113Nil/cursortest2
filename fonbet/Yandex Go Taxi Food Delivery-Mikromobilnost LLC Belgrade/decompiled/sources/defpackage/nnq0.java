package defpackage;

import java.util.Comparator;

/* loaded from: classes10.dex */
public final /* synthetic */ class nnq0 implements Comparator {
    public final /* synthetic */ int a;
    public final /* synthetic */ wls b;

    public /* synthetic */ nnq0(wls wlsVar, int i) {
        this.a = i;
        this.b = wlsVar;
    }

    @Override // java.util.Comparator
    public final int compare(Object obj, Object obj2) {
        int i = this.a;
        wls wlsVar = this.b;
        switch (i) {
        }
        return ((Number) wlsVar.invoke(obj, obj2)).intValue();
    }
}
