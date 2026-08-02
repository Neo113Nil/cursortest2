package defpackage;

import java.util.function.Supplier;
import kotlin.jvm.internal.PropertyReference0;

/* loaded from: classes5.dex */
public final /* synthetic */ class i0i implements Supplier {
    public final /* synthetic */ int a;
    public final /* synthetic */ hgx b;

    public /* synthetic */ i0i(hgx hgxVar, int i) {
        this.a = i;
        this.b = hgxVar;
    }

    @Override // java.util.function.Supplier
    public final Object get() {
        int i = this.a;
        hgx hgxVar = this.b;
        switch (i) {
        }
        return (String) ((PropertyReference0) hgxVar).get();
    }
}
