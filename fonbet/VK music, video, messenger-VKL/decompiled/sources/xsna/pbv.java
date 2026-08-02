package xsna;

import com.vk.core.tool.view.vkblur.VkBlurView;
import com.vk.dto.live.LiveSpectators;
import com.vk.dto.video.VideoOwner;
import com.vk.home.HomeFragment2;
import java.util.ArrayList;
import java.util.List;

/* compiled from: R8$$SyntheticClass */
/* loaded from: classes2.dex */
public final /* synthetic */ class pbv implements a0t {
    public final /* synthetic */ int b;
    public final /* synthetic */ Object c;

    public /* synthetic */ pbv(Object obj, int i) {
        this.b = i;
        this.c = obj;
    }

    @Override // xsna.a0t
    public final Object invoke(Object obj, Object obj2, Object obj3, Object obj4, Object obj5) {
        VkBlurView vkBlurView;
        int i = this.b;
        Object obj6 = this.c;
        switch (i) {
            case 0:
                HomeFragment2 homeFragment2 = (HomeFragment2) obj6;
                ((Integer) obj2).getClass();
                ((Integer) obj3).getClass();
                ((Integer) obj4).getClass();
                ((Integer) obj5).getClass();
                int i2 = HomeFragment2.x0;
                if (homeFragment2.jo() && (vkBlurView = homeFragment2.u0) != null) {
                    bwt0.S(vkBlurView, new cq3(13, vkBlurView, homeFragment2));
                }
                return s3q0.a;
            default:
                com.vk.libvideo.live.impl.views.stat.a aVar = (com.vk.libvideo.live.impl.views.stat.a) obj6;
                VideoOwner videoOwner = (VideoOwner) obj3;
                int intValue = ((Integer) obj5).intValue();
                int i3 = ((LiveSpectators) obj2).d;
                ArrayList arrayList = ((LiveSpectators) obj).g;
                aVar.k = Math.max(i3 - arrayList.size(), 0);
                aVar.n = videoOwner.f.L8();
                aVar.l = videoOwner.f.l1();
                aVar.d(videoOwner.f.getDuration());
                aVar.m = intValue;
                aVar.o = (List) obj4;
                return arrayList;
        }
    }
}
