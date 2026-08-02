package xsna;

import com.vk.dto.common.Attachment;
import com.vk.writebar.WriteBar;
import com.vk.writebar.attach.AttachmentsEditorView;

/* compiled from: AttachmentsEditorViewCallback.kt */
/* loaded from: classes7.dex */
public final class k84 implements AttachmentsEditorView.j {
    public final WriteBar a;
    public final com.vk.writebar.c b;
    public final gv2 c = new gv2(this, 1);

    public k84(WriteBar writeBar, com.vk.writebar.c cVar) {
        this.a = writeBar;
        this.b = cVar;
    }

    @Override // com.vk.writebar.attach.AttachmentsEditorView.j
    public final void a(ju90<?> ju90Var) {
        pc pcVar = this.b.y;
        if (pcVar == null) {
            pcVar = null;
        }
        pcVar.d(ju90Var);
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // com.vk.writebar.attach.AttachmentsEditorView.j
    public final void b(Attachment attachment) {
        s0y0 s0y0Var;
        com.vk.writebar.c cVar = this.b;
        if (cVar.d().size() == 0) {
            WriteBar writeBar = this.a;
            gv2 gv2Var = this.c;
            writeBar.removeCallbacks(gv2Var);
            writeBar.postDelayed(gv2Var, 150L);
        }
        cVar.f();
        if (attachment instanceof ju90) {
            pc pcVar = cVar.y;
            if (pcVar == null) {
                pcVar = null;
            }
            pcVar.f((ju90) attachment);
        }
        if (attachment == 0 || (s0y0Var = cVar.g) == null) {
            return;
        }
        s0y0Var.e();
    }

    @Override // com.vk.writebar.attach.AttachmentsEditorView.j
    public final void c(ju90<?> ju90Var) {
        pc pcVar = this.b.y;
        if (pcVar == null) {
            pcVar = null;
        }
        pcVar.e(ju90Var);
    }
}
