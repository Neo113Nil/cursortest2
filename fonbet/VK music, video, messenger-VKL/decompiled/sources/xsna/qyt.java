package xsna;

import com.vk.libvideo.ui.video2.skippablepart.VideoSkippablePartView;
import com.vk.music.podcast.impl.ui.episode.PodcastEpisodeFragment;
import kotlin.jvm.internal.FunctionReferenceImpl;

/* compiled from: GifHolder.kt */
/* loaded from: classes4.dex */
public final /* synthetic */ class qyt extends FunctionReferenceImpl implements gzs {
    public final /* synthetic */ int b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ qyt(int i, Object obj, Class cls, String str, String str2, int i2, int i3) {
        super(i, obj, cls, str, str2, i2);
        this.b = i3;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // xsna.gzs
    public final Object invoke() {
        switch (this.b) {
            case 0:
                return (Boolean) ((mcy) this.receiver).get();
            case 1:
                PodcastEpisodeFragment podcastEpisodeFragment = (PodcastEpisodeFragment) this.receiver;
                int i = PodcastEpisodeFragment.u0;
                podcastEpisodeFragment.jo();
                return s3q0.a;
            case 2:
                ((com.vk.video.kidsprofile.restricteduseractions.a) this.receiver).getClass();
                return null;
            default:
                VideoSkippablePartView videoSkippablePartView = (VideoSkippablePartView) this.receiver;
                int i2 = VideoSkippablePartView.C;
                return Boolean.valueOf(videoSkippablePartView.s());
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public qyt(com.vk.video.kidsprofile.restricteduseractions.a aVar) {
        super(0, aVar, com.vk.video.kidsprofile.restricteduseractions.a.class, "getRestrictedUserActions", "getRestrictedUserActions()Lcom/vk/video/kidsprofile/restricteduseractions/RestrictedUserActions;", 0);
        this.b = 2;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public qyt(Object obj) {
        super(0, obj, PodcastEpisodeFragment.class, "copyPodcastLink", "copyPodcastLink()V", 0);
        this.b = 1;
    }
}
