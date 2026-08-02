package xsna;

import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import com.vk.attachpicker.PhotoVideoAttachActivity;
import com.vk.preview.presentation.view.c;

/* compiled from: PhotoEditorLargePickerPreviewFactory.kt */
/* loaded from: classes5.dex */
public final class p6a0 implements rly {
    @Override // xsna.rly
    public final com.vk.preview.presentation.view.c a(PhotoVideoAttachActivity photoVideoAttachActivity, zb60 zb60Var, sly slyVar) {
        com.vk.preview.presentation.view.c cVar = new com.vk.preview.presentation.view.c(photoVideoAttachActivity);
        cVar.e = zb60Var;
        cVar.d = new t6a0(new q6a0(cVar), slyVar);
        RecyclerView recyclerView = cVar.b;
        recyclerView.getContext();
        recyclerView.setLayoutManager(new LinearLayoutManager(0, false));
        recyclerView.setAdapter(cVar.d);
        recyclerView.addItemDecoration(new c.a());
        recyclerView.setItemAnimator(null);
        return cVar;
    }
}
