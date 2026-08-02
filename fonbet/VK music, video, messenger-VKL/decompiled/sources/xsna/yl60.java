package xsna;

import xsna.h0x;
import xsna.mo60;

/* compiled from: NewsfeedInlineCommentScrollController.kt */
/* loaded from: classes4.dex */
public final class yl60 {
    public final c0x a;
    public final h0x b;
    public final mo60.a c;

    public yl60(c0x c0xVar, h0x h0xVar, mo60.a aVar) {
        this.a = c0xVar;
        this.b = h0xVar;
        this.c = aVar;
    }

    public final void a() {
        h0x h0xVar = this.b;
        h0x.b bVar = h0xVar.a;
        bVar.b = null;
        bVar.c = null;
        bVar.d.removeCallbacksAndMessages("CANCELLABLE_TASK_TAG");
        h0xVar.d = false;
    }

    public final void b() {
        this.b.d = true;
    }

    public final void c() {
        this.b.c = new a0x(this.a, this.c);
    }

    public final void d() {
        this.b.c = null;
    }
}
