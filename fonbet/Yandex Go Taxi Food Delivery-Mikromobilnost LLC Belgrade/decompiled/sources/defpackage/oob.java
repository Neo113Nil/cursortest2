package defpackage;

import java.util.ArrayList;

/* loaded from: classes13.dex */
public final class oob implements tls {
    public final /* synthetic */ int a;
    public final /* synthetic */ tls b;
    public final /* synthetic */ ArrayList c;

    public /* synthetic */ oob(int i, tls tlsVar, ArrayList arrayList) {
        this.a = i;
        this.b = tlsVar;
        this.c = arrayList;
    }

    @Override // defpackage.tls
    public final Object invoke(Object obj) {
        int i = this.a;
        ArrayList arrayList = this.c;
        tls tlsVar = this.b;
        switch (i) {
        }
        return tlsVar.invoke(arrayList.get(((Number) obj).intValue()));
    }
}
