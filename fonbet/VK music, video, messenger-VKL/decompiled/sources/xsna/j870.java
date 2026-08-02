package xsna;

import android.view.View;
import com.vk.im.design.view.comments.VkCommentView;
import com.vk.libvideo.autoplay.b;

/* compiled from: R8$$SyntheticClass */
/* loaded from: classes4.dex */
public final /* synthetic */ class j870 implements View.OnClickListener {
    public final /* synthetic */ int b;

    public /* synthetic */ j870(int i) {
        this.b = i;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        switch (this.b) {
            case 0:
                int i = m870.g;
                return;
            case 1:
                bpn0 bpn0Var = com.vk.libvideo.autoplay.b.B;
                b.C1208b.a().n();
                return;
            default:
                int i2 = VkCommentView.G;
                throw null;
        }
    }

    public /* synthetic */ j870(VkCommentView.d dVar) {
        this.b = 2;
    }
}
