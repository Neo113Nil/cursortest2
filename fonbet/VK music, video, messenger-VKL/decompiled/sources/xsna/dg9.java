package xsna;

import android.view.View;
import com.vk.clips.design.view.floatingbutton.FloatingButtonView;
import com.vk.clips.sdk.shared.clips.SdkClipAudioTemplate;
import com.vk.dto.actionlinks.ActionLink;
import com.vk.dto.actionlinks.ActionLinkSnippet;
import com.vk.dto.common.clips.ClipAudioTemplate;
import com.vk.dto.common.id.UserId;
import com.vk.dto.music.MusicTrack;
import com.vk.dto.shortvideo.ChallengeStyle;
import com.vk.dto.shortvideo.ClipCameraParams;
import com.vk.dto.shortvideo.ClipGridParams;
import com.vk.dto.shortvideo.ClipsChallenge;
import com.vkontakte.android.R;
import java.util.Iterator;
import java.util.List;
import kotlin.NoWhenBranchMatchedException;

/* compiled from: CameraButtonController.kt */
/* loaded from: classes17.dex */
public final class dg9 {
    public final fee a;
    public final sjd b;
    public SdkClipAudioTemplate c;
    public final cfu d;
    public final cfu e;
    public final io.reactivex.rxjava3.disposables.b f;

    public dg9(fee feeVar, sjd sjdVar, View view) {
        this.a = feeVar;
        this.b = sjdVar;
        bpn0 bpn0Var = new bpn0(new fc(3));
        this.d = ((!feeVar.F0() || feeVar.U1()) && tyx.a().getExperiments().c()) ? new ece((FloatingButtonView) view.findViewById(R.id.clips_grid_create_clip_button), (pxo0) bpn0Var.getValue()) : new dd80(5);
        this.e = ((!feeVar.F0() || feeVar.U1()) && tyx.a().getExperiments().c()) ? new ude((FloatingButtonView) view.findViewById(R.id.clips_grid_create_live_button), (pxo0) bpn0Var.getValue()) : new dd80(5);
        this.f = new io.reactivex.rxjava3.disposables.b();
    }

    public final void a(ClipGridParams.Data data, ClipsChallenge clipsChallenge) {
        Integer num;
        ChallengeStyle challengeStyle;
        ActionLink actionLink;
        ActionLinkSnippet actionLinkSnippet;
        boolean z = data instanceof ClipGridParams.Data.Music;
        if (z) {
            ClipAudioTemplate clipAudioTemplate = ((ClipGridParams.Data.Music) data).g;
            this.c = clipAudioTemplate != null ? new SdkClipAudioTemplate(clipAudioTemplate.b) : null;
        }
        String str = (clipsChallenge == null || (actionLink = clipsChallenge.n) == null || (actionLinkSnippet = actionLink.f) == null) ? null : actionLinkSnippet.e;
        Integer valueOf = Integer.valueOf(R.string.clip_grid_record_clip_with_trend);
        boolean z2 = true;
        if ((data instanceof ClipGridParams.Data.Profile) || (data instanceof ClipGridParams.Data.ClipCompilation) || (data instanceof ClipGridParams.Data.GeoPlace)) {
            if (this.a.F0()) {
                valueOf = Integer.valueOf(R.string.video_clips_create_clip);
                num = valueOf;
            }
            num = null;
        } else if (z) {
            ClipGridParams.Data.Music music = (ClipGridParams.Data.Music) data;
            MusicTrack musicTrack = music.b;
            if (musicTrack.F) {
                if (!music.i) {
                    valueOf = musicTrack.K != null ? Integer.valueOf(R.string.clip_grid_record_clip_with_original_sound) : Integer.valueOf(R.string.clip_grid_record_clip_with_music);
                }
                num = valueOf;
            }
            num = null;
        } else {
            if (data instanceof ClipGridParams.Data.Hashtag) {
                if (clipsChallenge == null || (challengeStyle = clipsChallenge.m) == null || !challengeStyle.e) {
                    if (!((ClipGridParams.Data.Hashtag) data).d) {
                        valueOf = clipsChallenge != null ? Integer.valueOf(R.string.clip_grid_record_clip_with_challenge) : Integer.valueOf(R.string.clip_grid_record_clip_with_hashtag);
                    }
                }
                num = null;
            } else {
                if (!(data instanceof ClipGridParams.Data.CameraMask)) {
                    throw new NoWhenBranchMatchedException();
                }
                valueOf = Integer.valueOf(((ClipGridParams.Data.CameraMask) data).b.u ? R.string.clip_grid_record_clip_with_effect : R.string.clip_grid_record_clip_with_mask);
            }
            num = valueOf;
        }
        if (!tyx.a().getExperiments().c() || (num == null && str == null)) {
            z2 = false;
        }
        c(z2, data, clipsChallenge != null ? clipsChallenge.d : null, num, clipsChallenge != null ? clipsChallenge.n : null);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v3 */
    /* JADX WARN: Type inference failed for: r0v4 */
    /* JADX WARN: Type inference failed for: r0v5, types: [java.lang.Object] */
    public final void b(UserId userId, List list) {
        ClipGridParams.Data.Profile profile;
        boolean c = tyx.a().getExperiments().c();
        Iterator it = list.iterator();
        while (true) {
            if (!it.hasNext()) {
                profile = 0;
                break;
            } else {
                profile = it.next();
                if (((ClipGridParams.Data.Profile) profile).b.b.b.b == userId.b) {
                    break;
                }
            }
        }
        ClipGridParams.Data.Profile profile2 = profile;
        if (profile2 != null) {
            c(c, profile2, null, Integer.valueOf(R.string.video_clips_create_clip), null);
        }
    }

    public final void c(boolean z, ClipGridParams.Data data, ClipCameraParams clipCameraParams, Integer num, ActionLink actionLink) {
        cfu cfuVar = this.d;
        cfu cfuVar2 = this.e;
        if (z && !this.a.c() && g620.f().getExperiments().c()) {
            cfuVar2.d(false);
            cfuVar.d(true);
        } else {
            cfuVar2.d(false);
            cfuVar.d(false);
        }
        if (z) {
            cfuVar.setVisible(true);
            cfuVar.a(new ag9(this, data, clipCameraParams, actionLink, 0));
            cfuVar2.a(new h5(this, 15));
            cfuVar.c(num, actionLink);
        }
    }

    public final void d(boolean z) {
        if (this.b.f()) {
            cfu cfuVar = this.d;
            cfu cfuVar2 = this.e;
            if (z && !this.a.c() && g620.f().getExperiments().c()) {
                cfuVar2.d(false);
                cfuVar.d(true);
            } else {
                cfuVar2.d(false);
                cfuVar.d(false);
            }
        }
    }
}
