package defpackage;

import java.util.Set;

/* loaded from: classes2.dex */
public final class d7u extends e7u {
    public final /* synthetic */ int a;
    public final Object b;

    public /* synthetic */ d7u(int i, Object obj) {
        this.a = i;
        this.b = obj;
    }

    @Override // defpackage.e7u
    public final Object a() {
        switch (this.a) {
            case 0:
                return (Float) this.b;
            case 1:
                return (String) this.b;
            default:
                return (Set) this.b;
        }
    }
}
