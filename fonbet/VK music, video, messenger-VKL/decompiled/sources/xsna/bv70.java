package xsna;

import com.vkontakte.android.R;
import kotlin.NoWhenBranchMatchedException;
import kotlin.jvm.internal.FunctionReferenceImpl;
import xsna.bi40;

/* compiled from: OfflinePodcastEpisodesMviComposeComponent.kt */
/* loaded from: classes3.dex */
public final /* synthetic */ class bv70 extends FunctionReferenceImpl implements izs<bi40, Integer> {
    public static final bv70 b = new bv70(1, cv70.class, "downloadIconContentDescription", "downloadIconContentDescription(Lcom/vk/music/offline/core/model/MusicDownloadState;)I", 1);

    @Override // xsna.izs
    public final Integer invoke(bi40 bi40Var) {
        int i;
        bi40 bi40Var2 = bi40Var;
        bpn0 bpn0Var = cv70.a;
        if (epx.f(bi40Var2, bi40.a.a)) {
            i = R.string.music_talkback_downloaded_podcast_episode;
        } else if (epx.f(bi40Var2, bi40.c.a)) {
            i = R.string.music_talkback_download_podcast_episode;
        } else if (epx.f(bi40Var2, bi40.d.a)) {
            i = R.string.music_talkback_pending_downloading_podcast_episode;
        } else {
            if (!(bi40Var2 instanceof bi40.b)) {
                throw new NoWhenBranchMatchedException();
            }
            i = R.string.music_talkback_downloading_podcast_episode;
        }
        return Integer.valueOf(i);
    }
}
