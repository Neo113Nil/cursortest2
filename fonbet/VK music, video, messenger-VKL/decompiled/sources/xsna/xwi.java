package xsna;

import xsna.qn60;

/* compiled from: ConditionalEditorAction.kt */
/* loaded from: classes4.dex */
public final class xwi implements qn60.b {
    public final qn60.b a;
    public final boolean b;

    public xwi(qn60.b bVar, boolean z) {
        this.a = bVar;
        this.b = z;
    }

    @Override // xsna.qn60.b
    public final void a(qn60.a aVar) {
        if (this.b) {
            this.a.a(aVar);
        }
    }
}
