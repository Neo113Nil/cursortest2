package xsna;

import androidx.recyclerview.widget.RecyclerView;
import com.vk.clips.design.view.camera.widgets.TabsRecycler;
import com.vk.content.design.view.camera.CameraUIView;
import com.vk.dto.stories.entities.StoryCameraMode;
import xsna.h7v;

/* compiled from: CameraUIView.kt */
/* loaded from: classes17.dex */
public final class wn9 implements h7v.b {
    public final /* synthetic */ CameraUIView a;

    public wn9(CameraUIView cameraUIView) {
        this.a = cameraUIView;
    }

    @Override // xsna.h7v.b
    public final void a(boolean z) {
        RecyclerView.Adapter adapter;
        float f = CameraUIView.w1;
        TabsRecycler tabs = this.a.getTabs();
        if (tabs == null) {
            return;
        }
        int indexOf = tabs.s.indexOf(StoryCameraMode.CLIPS);
        if (indexOf >= 0 && (adapter = tabs.getAdapter()) != null) {
            adapter.notifyItemChanged(indexOf);
        }
    }
}
