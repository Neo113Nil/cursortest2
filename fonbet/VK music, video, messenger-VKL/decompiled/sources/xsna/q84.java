package xsna;

import android.content.Intent;
import android.net.Uri;
import com.vk.bridges.ImageViewer;
import com.vk.dto.common.Attachment;
import com.vk.pending.PendingPhotoAttachment;
import java.util.List;
import kotlin.jvm.internal.Ref$ObjectRef;
import xsna.g760;

/* compiled from: AttachmentEditorViewer.kt */
/* loaded from: classes7.dex */
public final class q84 implements g760.a {
    public final /* synthetic */ o84 a;
    public final /* synthetic */ int b;
    public final /* synthetic */ Ref$ObjectRef<izs<Boolean, s3q0>> c;

    public q84(o84 o84Var, int i, Ref$ObjectRef<izs<Boolean, s3q0>> ref$ObjectRef) {
        this.a = o84Var;
        this.b = i;
        this.c = ref$ObjectRef;
    }

    @Override // xsna.g760.a
    public final void V2(Intent intent) {
        Uri uri;
        o84 o84Var = this.a;
        g94 g94Var = o84Var.b;
        ImageViewer.c<?> cVar = o84Var.l;
        if (cVar != null) {
            cVar.a(false);
        }
        o84Var.l = null;
        boolean booleanExtra = intent != null ? intent.getBooleanExtra("ImageWasChanged", false) : false;
        if (booleanExtra) {
            PendingPhotoAttachment pendingPhotoAttachment = new PendingPhotoAttachment((intent == null || (uri = (Uri) intent.getParcelableExtra("ProcessedImage")) == null) ? null : uri.toString());
            boolean booleanExtra2 = intent.getBooleanExtra("spoiler_donate_enabled", false);
            boolean booleanExtra3 = intent.getBooleanExtra("spoiler_blur_enabled", false);
            pendingPhotoAttachment.m = booleanExtra2;
            pendingPhotoAttachment.l = (booleanExtra3 || booleanExtra2) ? "" : null;
            List<Attachment> all = g94Var.getAll();
            int i = this.b;
            g94Var.i(i);
            g94Var.g(pendingPhotoAttachment, i == -1 ? null : Integer.valueOf(i));
            s0y0 s0y0Var = o84Var.p;
            if (s0y0Var != null) {
                s0y0Var.c(all, g94Var.getAll());
            }
        }
        Ref$ObjectRef<izs<Boolean, s3q0>> ref$ObjectRef = this.c;
        izs<Boolean, s3q0> izsVar = ref$ObjectRef.element;
        if (izsVar != null) {
            izsVar.invoke(Boolean.valueOf(booleanExtra));
        }
        ref$ObjectRef.element = null;
        Object obj = o84Var.m;
        em6 em6Var = obj instanceof em6 ? (em6) obj : null;
        if (em6Var != null) {
            em6Var.c();
        }
        o84Var.m = null;
    }
}
