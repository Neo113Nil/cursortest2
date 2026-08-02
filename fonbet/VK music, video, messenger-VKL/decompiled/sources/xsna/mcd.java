package xsna;

import android.widget.FrameLayout;
import android.widget.LinearLayout;
import com.mbridge.msdk.foundation.entity.CampaignEx;
import com.vk.auth.ui.fastlogin.VkFastLoginView;
import com.vk.catalog2.common.dto.ui.actions.UIBlockActionSearchMode;
import com.vk.catalog2.feature.music.ui.holder.MusicMyAudiosCatalogRootVh;
import com.vk.clips.design.view.component.video.seekbar.ClipSeekBarView;
import com.vk.voip.ui.scheduled.creation.ui.fragment.VoipCreateScheduleCallFragment;
import com.vkontakte.android.R;
import kotlin.jvm.internal.FunctionReferenceImpl;
import xsna.m3p0;

/* compiled from: ClipSeekBarView.kt */
/* loaded from: classes16.dex */
public final /* synthetic */ class mcd extends FunctionReferenceImpl implements gzs {
    public final /* synthetic */ int b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ mcd(int i, Object obj, Class cls, String str, String str2, int i2, int i3) {
        super(i, obj, cls, str, str2, i2);
        this.b = i3;
    }

    @Override // xsna.gzs
    public final Object invoke() {
        switch (this.b) {
            case 0:
                ClipSeekBarView clipSeekBarView = (ClipSeekBarView) this.receiver;
                int i = ClipSeekBarView.q;
                clipSeekBarView.getClass();
                FrameLayout frameLayout = new FrameLayout(clipSeekBarView.getContext());
                frameLayout.setId(R.id.clip_seekbar_preview);
                frameLayout.setLayoutParams(new LinearLayout.LayoutParams(-2, -2));
                frameLayout.setVisibility(8);
                return frameLayout;
            case 1:
                MusicMyAudiosCatalogRootVh musicMyAudiosCatalogRootVh = (MusicMyAudiosCatalogRootVh) this.receiver;
                musicMyAudiosCatalogRootVh.getClass();
                vtk0.d().d(musicMyAudiosCatalogRootVh.R(), new zo40(musicMyAudiosCatalogRootVh));
                return s3q0.a;
            case 2:
                return Boolean.valueOf(((b25) this.receiver).b());
            case 3:
                return Integer.valueOf(((k0l0) this.receiver).getBindingAdapterPosition());
            case 4:
                m3p0 m3p0Var = (m3p0) this.receiver;
                m3p0.a a = m3p0.a.a(m3p0Var.j, null, true, null, false, 5);
                m3p0Var.j = a;
                UIBlockActionSearchMode uIBlockActionSearchMode = a.a;
                if (uIBlockActionSearchMode != null) {
                    m3p0Var.b(uIBlockActionSearchMode);
                }
                m3p0Var.e.invoke(m3p0Var.j);
                return s3q0.a;
            case 5:
                return ((VkFastLoginView) this.receiver).getTrackingElement();
            case 6:
                ((com.vk.voip.ui.actions.feature.b) this.receiver).getClass();
                return Boolean.valueOf(com.vk.voip.ui.actions.feature.b.b());
            default:
                ((VoipCreateScheduleCallFragment) this.receiver).close();
                return s3q0.a;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public mcd(Object obj, int i) {
        super(0, obj, MusicMyAudiosCatalogRootVh.class, "onGoogleVoiceAssistantClicked", "onGoogleVoiceAssistantClicked()V", 0);
        this.b = i;
        switch (i) {
            case 4:
                super(0, obj, m3p0.class, "onSearchIconClicked", "onSearchIconClicked()V", 0);
                break;
            case 7:
                super(0, obj, VoipCreateScheduleCallFragment.class, CampaignEx.JSON_NATIVE_VIDEO_CLOSE, "close()V", 0);
                break;
            default:
                break;
        }
    }
}
