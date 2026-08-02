package xsna;

import android.content.Context;
import android.graphics.drawable.ColorDrawable;
import android.text.BidiFormatter;
import com.google.zxing.datamatrix.DataMatrixReader;
import com.vk.attachpicker.StubFragment;
import com.vk.clips.playlists.di.ClipsPlaylistsComponentImpl;
import com.vk.clips.viewer.impl.di.ClipsViewerComponentImpl;
import com.vk.ecomm.cart.api.di.CartComponent$Companion$STUB$1;
import com.vk.newsfeed.impl.postmodal.ModalPostCommonFragment;
import com.vk.posting.di.PostingComponentImpl;
import com.vk.toggle.features.FeedFeatures;
import com.vk.toggle.features.MusicFeatures;
import com.vk.toggle.features.SaFeatures;
import com.vk.toggle.features.VideoFeatures;
import com.vk.video.ui.upload.impl.publish.presentation.publish.fragment.PublishFragmentInternalComponent;
import com.vkontakte.android.R;
import java.text.SimpleDateFormat;
import kotlin.text.Regex;

/* compiled from: R8$$SyntheticClass */
/* loaded from: classes17.dex */
public final /* synthetic */ class ek implements gzs {
    public final /* synthetic */ int b;

    public /* synthetic */ ek(int i) {
        this.b = i;
    }

    @Override // xsna.gzs
    public final Object invoke() {
        switch (this.b) {
            case 0:
                return new SimpleDateFormat("HH:mm:ss");
            case 1:
                return new StubFragment();
            case 2:
                VideoFeatures videoFeatures = VideoFeatures.VIDEO_ACTION_AFTER_LOGIN;
                videoFeatures.getClass();
                return Boolean.valueOf(com.vk.toggle.b.A.a(videoFeatures));
            case 3:
                qcy<Object>[] qcyVarArr = CartComponent$Companion$STUB$1.f;
                return new hy9();
            case 4:
                Context context = e43.a;
                return (context != null ? context : null).getString(R.string.music_caption_recents);
            case 5:
                return new k4c();
            case 6:
                return new jid();
            case 7:
                qcy<Object>[] qcyVarArr2 = ClipsPlaylistsComponentImpl.h;
                return new kue();
            case 8:
                return s3q0.a;
            case 9:
                return new zyd();
            case 10:
                qcy<Object>[] qcyVarArr3 = ClipsViewerComponentImpl.o0;
                return new w5e();
            case 11:
                return new la60();
            case 12:
                return new c4s();
            case 13:
                return s3q0.a;
            case 14:
                return Boolean.valueOf(e370.s != null ? com.vk.toggle.b.A.a(SaFeatures.FEATURE_SA_HEALTH_TO_SDK) : false);
            case 15:
                return new uxy(new int[]{0}, new int[]{0});
            case 16:
                return new Regex("/clips/hashtag/([\\d\\p{L}_]{2,})");
            case 17:
                int i = ModalPostCommonFragment.a0;
                ColorDrawable colorDrawable = new ColorDrawable(-16777216);
                colorDrawable.setAlpha(0);
                return colorDrawable;
            case 18:
                eqy<bek0> eqyVar = com.vk.toggle.d.a;
                return Boolean.valueOf(MusicFeatures.AUDIO_ARTIST_CONCERTS.h());
            case 19:
                return new jo50();
            case 20:
                FeedFeatures feedFeatures = FeedFeatures.FEED_APPLOVIN_PRELOAD_CONFIG;
                feedFeatures.getClass();
                return Boolean.valueOf(com.vk.toggle.b.A.a(feedFeatures));
            case 21:
                return 2;
            case 22:
                return new vfa0();
            case 23:
                bdn bdnVar = bdn.a;
                return wgl.c;
            case 24:
                qcy<Object>[] qcyVarArr4 = PostingComponentImpl.j;
                return new ghc0();
            case 25:
                PublishFragmentInternalComponent.a aVar = PublishFragmentInternalComponent.v;
                bpn0 bpn0Var = fxc0.a;
                return (g7s0) (bpn0Var != null ? bpn0Var : null).getValue();
            case 26:
                return new DataMatrixReader();
            case 27:
                return new int[]{R.id.reaction_1, R.id.reaction_2, R.id.reaction_3, R.id.reaction_4, R.id.reaction_5, R.id.reaction_6, R.id.reaction_7, R.id.reaction_8};
            case 28:
                return BidiFormatter.getInstance();
            default:
                return s3q0.a;
        }
    }
}
