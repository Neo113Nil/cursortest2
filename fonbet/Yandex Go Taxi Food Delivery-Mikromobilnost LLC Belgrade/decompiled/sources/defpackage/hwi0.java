package defpackage;

import java.util.ArrayList;
import kotlinx.serialization.modules.a;

/* loaded from: classes9.dex */
public final class hwi0 implements r1m {
    public final ArrayList a;

    public hwi0(ArrayList arrayList) {
        this.a = arrayList;
    }

    @Override // defpackage.r1m
    public final void extendDocumentParser(a aVar) {
        aVar.g(qoi0.a(t9.class), new iwi0(new urd(this.a)));
    }
}
