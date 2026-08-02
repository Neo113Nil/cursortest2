package xsna;

import com.vk.camera.editor.common.di.CommonEditorComponentImpl;
import com.vk.clips.coauthors.di.stub.ClipsCoauthorsComponentStub;
import com.vk.core.view.fresco.FrescoImageView;
import com.vk.im.engine.models.LongPollType;
import com.vk.toggle.features.ComFeatures;
import com.vk.toggle.features.VideoFeatures;
import com.vkontakte.android.actionlinks.views.fragments.ItemsDialogWrapper;
import java.util.concurrent.ConcurrentHashMap;

/* compiled from: R8$$SyntheticClass */
/* loaded from: classes18.dex */
public final /* synthetic */ class re0 implements gzs {
    public final /* synthetic */ int b;

    public /* synthetic */ re0(int i) {
        this.b = i;
    }

    @Override // xsna.gzs
    public final Object invoke() {
        switch (this.b) {
            case 0:
                VideoFeatures videoFeatures = VideoFeatures.VIDEO_AD_IN_PIP;
                videoFeatures.getClass();
                break;
            case 6:
                qcy<Object>[] qcyVarArr = ClipsCoauthorsComponentStub.d;
                break;
            case 7:
                qcy<Object>[] qcyVarArr2 = CommonEditorComponentImpl.h;
                break;
            case 10:
                int i = w8m.a;
                break;
            case 13:
                int i2 = FrescoImageView.R;
                VideoFeatures videoFeatures2 = VideoFeatures.VIDEO_SCROLL_OPTIMIZATIONS_V2;
                videoFeatures2.getClass();
                break;
            case 18:
                g2v.c().getClass();
                ConcurrentHashMap concurrentHashMap = new ConcurrentHashMap();
                concurrentHashMap.put(LongPollType.MESSAGES, Boolean.TRUE);
                break;
            case 19:
                int i3 = ItemsDialogWrapper.S;
                break;
            case 27:
                ComFeatures comFeatures = ComFeatures.COM_VIDEO_ON_MAIN_TAB;
                comFeatures.getClass();
                break;
            case 28:
                com.vk.voip.ui.a.a.getClass();
                com.vk.voip.ui.a.g();
                com.vk.voip.ui.a.g = true;
                break;
        }
        return s3q0.a;
    }
}
