package xsna;

import android.view.View;
import android.widget.TextView;
import com.vk.auth.DefaultAuthActivity;
import com.vk.bridges.di.BridgeComponent;
import com.vk.core.view.components.formitem.VkFormField;
import com.vk.dto.common.VideoFileOld;
import com.vk.libvideo.impl.di.VkVideoBackgroundViewStatDelegateComponentImpl;
import com.vk.newsfeed.impl.fragments.VideoPostViewFragment;
import com.vkontakte.android.R;
import java.util.List;

/* compiled from: R8$$SyntheticClass */
/* loaded from: classes3.dex */
public final /* synthetic */ class m0t0 implements gzs {
    public final /* synthetic */ int b;
    public final /* synthetic */ Object c;

    public /* synthetic */ m0t0(Object obj, int i) {
        this.b = i;
        this.c = obj;
    }

    @Override // xsna.gzs
    public final Object invoke() {
        int i = this.b;
        Object obj = this.c;
        switch (i) {
            case 0:
                fxc0.B().s().D((VideoFileOld) obj);
                return s3q0.a;
            case 1:
                int i2 = VideoPostViewFragment.W0;
                return ((BridgeComponent) m7m.d((VideoPostViewFragment) obj).a(fpf0.a(BridgeComponent.class))).s();
            case 2:
                ((dfu0) obj).invalidateSelf();
                return s3q0.a;
            case 3:
                List<Class<? extends View>> list = VkFormField.C;
                return (TextView) ((VkFormField) obj).findViewById(R.id.vk_form_item_layout_caption);
            case 4:
                DefaultAuthActivity defaultAuthActivity = ((c7v0) obj).b;
                defaultAuthActivity.G = true;
                defaultAuthActivity.finish();
                return s3q0.a;
            case 5:
                return ((VkVideoBackgroundViewStatDelegateComponentImpl) obj).a.Z7();
            case 6:
                return new vfw0(((bgw0) obj).b);
            case 7:
                puw0 puw0Var = (puw0) obj;
                return new ohw0(puw0Var.k, puw0Var.q);
            case 8:
                ((zx90) obj).invoke();
                return s3q0.a;
            default:
                return ((c1y0) obj).a.findViewById(R.id.writebar_bottom_offset);
        }
    }
}
