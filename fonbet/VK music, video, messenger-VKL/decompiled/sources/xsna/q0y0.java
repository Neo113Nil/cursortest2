package xsna;

import android.view.ViewStub;
import com.vk.writebar.WriteBar;
import com.vk.writebar.attach.AttachmentsEditorView;
import com.vkontakte.android.R;

/* compiled from: R8$$SyntheticClass */
/* loaded from: classes7.dex */
public final /* synthetic */ class q0y0 implements gzs {
    public final /* synthetic */ int b;
    public final /* synthetic */ Object c;

    public /* synthetic */ q0y0(Object obj, int i) {
        this.b = i;
        this.c = obj;
    }

    @Override // xsna.gzs
    public final Object invoke() {
        Void q;
        switch (this.b) {
            case 0:
                com.vk.writebar.c cVar = (com.vk.writebar.c) this.c;
                WriteBar writeBar = cVar.a;
                AttachmentsEditorView attachmentsEditorView = (AttachmentsEditorView) ((ViewStub) writeBar.findViewById(R.id.write_bar_attach_editor_layout_viewstub)).inflate();
                attachmentsEditorView.setCallback(new k84(writeBar, cVar));
                attachmentsEditorView.setShowPhotoEditorEntryPoints(cVar.n);
                attachmentsEditorView.setNewEditorScreenFactory(cVar.o);
                attachmentsEditorView.setResultFragment(cVar.k);
                cVar.e(attachmentsEditorView, cVar.i);
                u1u0.g(writeBar);
                return attachmentsEditorView;
            default:
                q = ((ru.mail.libverify.api.s) this.c).q();
                return q;
        }
    }
}
