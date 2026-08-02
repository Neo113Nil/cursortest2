package defpackage;

import java.util.ArrayList;

/* loaded from: classes9.dex */
public final class l3s {
    public final ArrayList a;
    public final ArrayList b;

    public l3s(int i) {
        this.a = new ArrayList();
        this.b = new ArrayList();
    }

    public final void a(String str, String str2) {
        this.a.add(jx81.i(str, 0, 0, " !\"#$&'()+,/:;<=>?@[\\]^`{|}~", false, false, false, false, 91));
        this.b.add(jx81.i(str2, 0, 0, " !\"#$&'()+,/:;<=>?@[\\]^`{|}~", false, false, false, false, 91));
    }

    public final void b(String str, String str2) {
        this.a.add(jx81.i(str, 0, 0, " !\"#$&'()+,/:;<=>?@[\\]^`{|}~", true, false, true, false, 83));
        this.b.add(jx81.i(str2, 0, 0, " !\"#$&'()+,/:;<=>?@[\\]^`{|}~", true, false, true, false, 83));
    }

    public l3s() {
        this(0);
    }
}
