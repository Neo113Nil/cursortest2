package xsna;

import com.vk.api.base.VkPaginationList;
import com.vk.attachpicker.impl.fragment.video.AttachVideoFragment;
import com.vk.attachpicker.impl.fragment.video.VideoData;
import com.vk.dto.common.VideoFile;
import com.vk.dto.common.data.VKList;
import java.util.ArrayList;
import java.util.Iterator;

/* compiled from: R8$$SyntheticClass */
/* loaded from: classes15.dex */
public final /* synthetic */ class s34 implements izs {
    public final /* synthetic */ int b = 0;
    public final /* synthetic */ int c;
    public final /* synthetic */ int d;
    public final /* synthetic */ Object e;

    public /* synthetic */ s34(int i, AttachVideoFragment attachVideoFragment, int i2) {
        this.c = i;
        this.e = attachVideoFragment;
        this.d = i2;
    }

    @Override // xsna.izs
    public final Object invoke(Object obj) {
        int i = this.b;
        int i2 = this.d;
        int i3 = this.c;
        Object obj2 = this.e;
        switch (i) {
            case 0:
                AttachVideoFragment attachVideoFragment = (AttachVideoFragment) obj2;
                VKList vKList = (VKList) obj;
                int i4 = AttachVideoFragment.F0;
                if (i3 == 0) {
                    Iterator<T> it = vKList.iterator();
                    int i5 = 0;
                    while (it.hasNext() && epx.f(((VideoFile) it.next()).I0(), attachVideoFragment.b0)) {
                        i5++;
                    }
                    b34<T, VH> b34Var = attachVideoFragment.a0;
                    if (b34Var != 0) {
                        b34Var.W0(i5);
                    }
                }
                ArrayList arrayList = new ArrayList(c5g.u(vKList, 10));
                Iterator<T> it2 = vKList.iterator();
                while (it2.hasNext()) {
                    arrayList.add(new VideoData((VideoFile) it2.next(), null, 2, null));
                }
                return new VkPaginationList(arrayList, vKList.i(), i2 + i3 < vKList.i(), i3);
            default:
                ((exd0) obj2).v7(i3, i2, ((Boolean) obj).booleanValue());
                return s3q0.a;
        }
    }

    public /* synthetic */ s34(exd0 exd0Var, int i, int i2) {
        this.e = exd0Var;
        this.c = i;
        this.d = i2;
    }
}
