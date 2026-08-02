package xsna;

import android.text.TextPaint;
import android.view.View;
import com.vk.clips.interests.impl.di.ClipsInterestsComponentImpl;
import com.vk.clips.viewer.impl.feed.view.ClipFeedListFragment;
import com.vk.dialogsscreen.impl.DialogsScreenFragment;
import com.vk.fave.di.FaveComponentImpl;
import com.vk.music.player.MusicPlayerServiceComponentImpl;
import com.vk.music.playlist.display.audiobook.presentation.fragment.DisplayAudioBookChaptersFragment;
import com.vk.photos.root.photoflow.tags.presentation.PhotoTagsFragment;
import com.vk.superapp.dating.js.bridge.impl.di.JsDatingDelegateComponentImpl;
import com.vk.toggle.features.ComFeatures;
import com.vk.toggle.features.FeedFeatures;
import com.vk.toggle.features.MusicFeatures;
import com.vk.toggle.features.SmbAdFeatures;
import com.vkontakte.android.R;
import java.util.regex.Pattern;
import xsna.mlf;

/* compiled from: R8$$SyntheticClass */
/* loaded from: classes3.dex */
public final /* synthetic */ class qo0 implements gzs {
    public final /* synthetic */ int b;

    public /* synthetic */ qo0(int i) {
        this.b = i;
    }

    @Override // xsna.gzs
    public final Object invoke() {
        switch (this.b) {
            case 0:
                return s3q0.a;
            case 1:
                float f = es1.a;
                return rbl.a;
            case 2:
                return s3q0.a;
            case 3:
                return new k3a();
            case 4:
                int i = ClipFeedListFragment.a2;
                return qsk0.a;
            case 5:
                return Integer.valueOf(View.generateViewId());
            case 6:
                qcy<Object>[] qcyVarArr = ClipsInterestsComponentImpl.o;
                return new die();
            case 7:
                return new mlf.a();
            case 8:
                SmbAdFeatures smbAdFeatures = SmbAdFeatures.FEATURE_SMB_CLIP_UPLOAD_EASY_PROMOTE;
                smbAdFeatures.getClass();
                return Boolean.valueOf(com.vk.toggle.b.A.a(smbAdFeatures));
            case 9:
                return s3q0.a;
            case 10:
                ComFeatures.COM_TRUST_MARKS_AB.getClass();
                return Boolean.valueOf(!com.vk.toggle.b.A.a(r0));
            case 11:
                return new nmh0();
            case 12:
                return new zzw(0);
            case 13:
                int i2 = DialogsScreenFragment.p0;
                return g2v.c().m();
            case 14:
                return Boolean.valueOf(fxc0.B().J().s1());
            case 15:
                int i3 = DisplayAudioBookChaptersFragment.b0;
                return Boolean.valueOf(MusicFeatures.AUDIO_BOOK_CHAPTER_DOWNLOAD.h());
            case 16:
                qcy<Object>[] qcyVarArr2 = FaveComponentImpl.e;
                return new wrq();
            case 17:
                return txq.a(R.drawable.vk_icon_pause_24);
            case 18:
                return new omv0();
            case 19:
                qcy<Object>[] qcyVarArr3 = JsDatingDelegateComponentImpl.b;
                return new u3y();
            case 20:
                return Pattern.compile("\\[#alias\\|([^|]+)\\|([^]]+)]");
            case 21:
                return new ma10(0);
            case 22:
                return s3q0.a;
            case 23:
                return s3q0.a;
            case 24:
                return new TextPaint();
            case 25:
                qcy<Object>[] qcyVarArr4 = MusicPlayerServiceComponentImpl.b;
                return new py40();
            case 26:
                return 0;
            case 27:
                FeedFeatures feedFeatures = FeedFeatures.DEVICE_VOLUME;
                feedFeatures.getClass();
                return Boolean.valueOf(com.vk.toggle.b.A.a(feedFeatures));
            case 28:
                int i4 = PhotoTagsFragment.U;
                return new vca0();
            default:
                return new ssd0();
        }
    }
}
