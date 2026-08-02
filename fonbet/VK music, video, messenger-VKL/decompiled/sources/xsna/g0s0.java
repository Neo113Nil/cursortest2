package xsna;

import android.graphics.Paint;
import com.vk.core.view.components.cell.VkCell;
import com.vk.core.view.components.formitem.VkInputSelect;
import com.vk.video.ui.discovery.minimizable.VideoMinimizableDiscoveryFragment;
import com.vkontakte.android.R;
import java.lang.annotation.Annotation;

/* compiled from: R8$$SyntheticClass */
/* loaded from: classes6.dex */
public final /* synthetic */ class g0s0 implements gzs {
    public final /* synthetic */ int b;

    public /* synthetic */ g0s0(int i) {
        this.b = i;
    }

    @Override // xsna.gzs
    public final Object invoke() {
        switch (this.b) {
            case 0:
                o0s0 b = com.vk.toggle.d.K.b();
                return b == null ? new o0s0(true, true) : b;
            case 1:
                int i = VideoMinimizableDiscoveryFragment.p1;
                asu0.a.getClass();
                return new com.vk.stat.recycler.c(asu0.o(), "VideoDiscovery");
            case 2:
                return new tub0(fpf0.a(VkCell.f.class), new Annotation[0]);
            case 3:
                int i2 = VkInputSelect.m;
                return new int[]{R.attr.formItemStateError};
            case 4:
                Paint paint = new Paint();
                paint.setAntiAlias(true);
                paint.setColor(-1);
                paint.setStyle(Paint.Style.FILL);
                return paint;
            default:
                return s3q0.a;
        }
    }
}
