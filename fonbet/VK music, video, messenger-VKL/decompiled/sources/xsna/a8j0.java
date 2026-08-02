package xsna;

import android.graphics.Rect;
import com.vk.auth.smartflow.impl.SmartflowComponentImpl;
import com.vk.core.view.components.cell.VkCell;
import com.vk.stories.design.view.viewer.StoryBottomViewGroup;
import com.vk.subscription.impl.di.SubscriptionComponentImpl;
import com.vk.toggle.features.StoriesFeatures;
import com.vk.toggle.features.VideoFeatures;
import java.lang.annotation.Annotation;
import xsna.bcp0;

/* compiled from: R8$$SyntheticClass */
/* loaded from: classes16.dex */
public final /* synthetic */ class a8j0 implements gzs {
    public final /* synthetic */ int b;

    public /* synthetic */ a8j0(int i) {
        this.b = i;
    }

    @Override // xsna.gzs
    public final Object invoke() {
        switch (this.b) {
            case 0:
                return new zqu();
            case 1:
                qcy<Object>[] qcyVarArr = SmartflowComponentImpl.c;
                return ck20.a;
            case 2:
                return new xgu();
            case 3:
                int i = StoryBottomViewGroup.P;
                StoriesFeatures storiesFeatures = StoriesFeatures.ST_REACTION_STICKER;
                storiesFeatures.getClass();
                return Boolean.valueOf(com.vk.toggle.b.A.a(storiesFeatures));
            case 4:
                qcy<Object>[] qcyVarArr2 = SubscriptionComponentImpl.d;
                return new kwm0();
            case 5:
                return new Rect();
            case 6:
                VideoFeatures videoFeatures = VideoFeatures.VIDEO_FIX_CLEAR_HISTORY;
                videoFeatures.getClass();
                return Boolean.valueOf(com.vk.toggle.b.A.a(videoFeatures));
            case 7:
                return s3q0.a;
            case 8:
                bcp0.a aVar = bcp0.w;
                return Boolean.FALSE;
            case 9:
                return s3q0.a;
            case 10:
                VideoFeatures videoFeatures2 = VideoFeatures.VIDEO_ACTION_AFTER_LOGIN;
                videoFeatures2.getClass();
                return Boolean.valueOf(com.vk.toggle.b.A.a(videoFeatures2));
            case 11:
                return new tub0(fpf0.a(VkCell.f.class), new Annotation[0]);
            case 12:
                return ywv0.b();
            default:
                com.vk.voip.ui.c cVar = com.vk.voip.ui.c.b;
                cVar.B0();
                cVar.r1();
                return s3q0.a;
        }
    }
}
