package xsna;

import android.graphics.drawable.Drawable;
import android.view.View;
import android.widget.ProgressBar;
import androidx.credentials.exceptions.publickeycredential.DomExceptionUtils;
import com.vk.dto.common.Attachment;
import com.vk.log.L;
import com.vk.writebar.attach.AttachmentsEditorView;
import com.vkontakte.android.R;
import java.util.ArrayList;
import xsna.o34;

/* compiled from: AttachUploaderCallback.kt */
/* loaded from: classes7.dex */
public final class p34 implements o34.a {
    public final com.vk.writebar.c a;

    public p34(com.vk.writebar.c cVar) {
        this.a = cVar;
    }

    @Override // xsna.o34.a
    public final void a(ju90<?> ju90Var, int i, int i2) {
        AttachmentsEditorView c = this.a.c();
        View findViewWithTag = c.findViewWithTag(ju90Var);
        if (findViewWithTag == null) {
            findViewWithTag = c.b.getChildAt(c.c.indexOf(ju90Var));
        }
        ProgressBar progressBar = (ProgressBar) findViewWithTag.findViewById(R.id.attach_progress);
        if (progressBar == null) {
            return;
        }
        if (progressBar.getVisibility() != 0) {
            progressBar.setVisibility(0);
        }
        progressBar.setProgress(i);
        progressBar.setMax(i2);
        if (vx2.d.u()) {
            L.p("vk", "Upload " + ju90Var.getUri() + " progress: " + i + DomExceptionUtils.SEPARATOR + i2);
        }
    }

    @Override // xsna.o34.a
    public final void b(ju90<?> ju90Var) {
        com.vk.writebar.c cVar = this.a;
        Runnable runnable = cVar.r;
        if (runnable != null) {
            runnable.run();
        }
        cVar.r = null;
        cVar.q = null;
        AttachmentsEditorView c = cVar.c();
        View findViewWithTag = c.findViewWithTag(ju90Var);
        if (findViewWithTag == null) {
            findViewWithTag = c.b.getChildAt(c.c.indexOf(ju90Var));
        }
        if (findViewWithTag == null || findViewWithTag.findViewById(R.id.attach_progress) == null) {
            return;
        }
        u1u0.n(8, findViewWithTag.findViewById(R.id.attach_progress));
        u1u0.n(0, findViewWithTag.findViewById(R.id.attach_error));
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // xsna.o34.a
    public final void c(ju90<?> ju90Var, Attachment attachment) {
        com.vk.writebar.c cVar = this.a;
        AttachmentsEditorView c = cVar.c();
        View findViewWithTag = c.findViewWithTag(ju90Var);
        if (findViewWithTag == null) {
            findViewWithTag = c.b.getChildAt(c.c.indexOf(ju90Var));
        }
        if (findViewWithTag != null && findViewWithTag.findViewById(R.id.attach_progress) != null) {
            Drawable progressDrawable = ((ProgressBar) findViewWithTag.findViewById(R.id.attach_progress)).getProgressDrawable();
            if (progressDrawable instanceof pdc) {
                pdc pdcVar = (pdc) progressDrawable;
                pdcVar.q = true;
                pdcVar.s = System.currentTimeMillis();
                pdcVar.invalidateSelf();
                c.postDelayed(new i84(findViewWithTag), 650L);
            } else {
                u1u0.n(8, findViewWithTag.findViewById(R.id.attach_progress));
            }
            findViewWithTag.setTag(attachment);
            if (vx2.d.u()) {
                L.p("vk", "Upload " + ju90Var + " done: " + attachment);
            }
        }
        ArrayList<Attachment> arrayList = cVar.c().c;
        int indexOf = arrayList.indexOf((Attachment) ju90Var);
        if (indexOf != -1) {
            arrayList.set(indexOf, attachment);
        }
        if (cVar.c().f()) {
            return;
        }
        Runnable runnable = cVar.q;
        if (runnable != null) {
            runnable.run();
        }
        cVar.r = null;
        cVar.q = null;
    }
}
