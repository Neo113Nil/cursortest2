package defpackage;

import com.yandex.messaging.ChatRequest;

/* loaded from: classes15.dex */
public abstract class ky4 extends xx4 implements b9b {
    public final ChatRequest w;
    public e1k x;

    public ky4(ChatRequest chatRequest) {
        this.w = chatRequest;
    }

    @Override // defpackage.xx4, defpackage.hr
    public void b() {
        i(null);
        e1k e1kVar = this.x;
        if (e1kVar != null) {
            e1kVar.close();
            this.x = null;
        }
    }

    @Override // defpackage.xx4
    public void j(cl21 cl21Var) {
        this.x = ((d9g) cl21Var).b().c(this.w, this);
    }
}
