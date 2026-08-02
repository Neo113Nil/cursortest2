package xsna;

import android.graphics.drawable.ColorDrawable;
import com.vk.libvideo.di.VideoSubscriptionComponentImpl;
import com.vk.libvideo.video.queue.impl.di.VideoQueueComponentImpl;
import com.vk.newsfeed.impl.fragments.VideoBottomSheetTreeCommentsFragment;
import com.vk.toggle.features.StoriesFeatures;
import com.vkontakte.android.R;
import kotlin.collections.EmptyList;
import xsna.rwm0;

/* compiled from: R8$$SyntheticClass */
/* loaded from: classes6.dex */
public final /* synthetic */ class k0m0 implements gzs {
    public final /* synthetic */ int b;

    public /* synthetic */ k0m0(int i) {
        this.b = i;
    }

    @Override // xsna.gzs
    public final Object invoke() {
        switch (this.b) {
            case 0:
                StoriesFeatures storiesFeatures = StoriesFeatures.SAFE_UPDATE;
                storiesFeatures.getClass();
                return Boolean.valueOf(com.vk.toggle.b.A.a(storiesFeatures));
            case 1:
                int i = rwm0.g;
                dhr0.a.getClass();
                return rwm0.a.a(dhr0.y());
            case 2:
                return new com.vk.avatar.impl.border.item.path.a();
            case 3:
                int i2 = VideoBottomSheetTreeCommentsFragment.l1;
                dhr0.a.getClass();
                ColorDrawable colorDrawable = new ColorDrawable(e3m.f(R.attr.vk_ui_background_content, dhr0.s()));
                colorDrawable.setAlpha(0);
                return colorDrawable;
            case 4:
                if (gsi0.b().d) {
                    return new fjt0();
                }
                return null;
            case 5:
                qcy<Object>[] qcyVarArr = VideoQueueComponentImpl.c;
                return new btt0();
            case 6:
                return new i1t0(true, bo.h());
            case 7:
                qcy<Object>[] qcyVarArr2 = VideoSubscriptionComponentImpl.b;
                return new wit0(new uft0(), new zqu());
            case 8:
                return EmptyList.b;
            default:
                com.vk.voip.ui.c.b.getClass();
                u4x0 u4x0Var = com.vk.voip.ui.c.Y;
                u4x0Var.h(true ^ u4x0Var.e);
                return s3q0.a;
        }
    }
}
