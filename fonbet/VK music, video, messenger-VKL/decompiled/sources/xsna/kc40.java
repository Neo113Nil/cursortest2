package xsna;

import android.app.Activity;
import android.content.ContextWrapper;
import android.os.Bundle;
import androidx.appcompat.app.AppCompatActivity;
import androidx.fragment.app.FragmentActivity;
import com.vk.dto.common.Image;
import com.vk.dto.music.MusicTrack;
import com.vk.dto.music.Playlist;
import com.vk.dto.music.audiobook.AudioBook;
import com.vk.dto.music.audiobook.AudioBookPerson;
import com.vk.dto.music.audiobook.AudioBookPersonRole;
import com.vk.dto.podcast.PodcastInfo;
import com.vk.feed.core.models.news.NewsEntry;
import com.vk.music.bottomsheets.MusicBottomSheetLaunchPoint;
import com.vk.music.bottomsheets.audiobook.AudioBookBottomSheetLaunchPoint;
import com.vk.music.bottomsheets.audiobook.AudioBookChapterBottomSheetLaunchPoint;
import com.vk.music.bottomsheets.audiobook.AudioBookPersonBottomSheetLaunchPoint;
import com.vk.music.bottomsheets.audiobook.presentation.model.AudioBookModel;
import com.vk.music.bottomsheets.domain.model.LinkButtonEntity;
import com.vk.music.bottomsheets.domain.model.MixData;
import com.vk.music.bottomsheets.domain.model.OnboardingInfoEntity;
import com.vk.music.bottomsheets.domain.model.PromoInfoEntity;
import com.vk.music.bottomsheets.onboarding.presentation.model.OnboardingInfo;
import com.vk.music.bottomsheets.promo.presentation.model.LinkButton;
import com.vk.music.bottomsheets.promo.presentation.model.PromoInfo;
import com.vk.music.bottomsheets.tracker.MusicBottomSheetActionTracker;
import com.vk.music.common.MusicPlaybackLaunchContext;
import com.vk.music.model.di.AudioModelsComponent;
import com.vk.stat.scheme.CommonAudioStat$TypeAudioSourceEnum;
import java.util.List;
import xsna.cbb0;
import xsna.d1b0;
import xsna.d6v0;
import xsna.di4;
import xsna.ec40;
import xsna.f0p;
import xsna.fr40;
import xsna.k840;
import xsna.nh4;
import xsna.o3b0;
import xsna.p250;
import xsna.ve50;
import xsna.wt4;
import xsna.yc50;
import xsna.zd4;
import xsna.zfp0;
import xsna.zh4;

/* compiled from: MusicBottomSheetLauncherImpl.kt */
/* loaded from: classes3.dex */
public final class kc40 implements ic40 {
    @Override // xsna.ic40
    public final void a(Activity activity, u2b0 u2b0Var, PodcastInfo podcastInfo, izs<? super Integer, s3q0> izsVar) {
        new aib0(u2b0Var, podcastInfo, izsVar, false).d(activity);
    }

    @Override // xsna.ic40
    public final void b(FragmentActivity fragmentActivity, boolean z) {
        d1b0.a aVar = new d1b0.a(fragmentActivity, tzp0.a(null, 3));
        aVar.P0();
        aVar.O0();
        aVar.p0(0);
        aVar.m0(0);
        aVar.n0(0);
        aVar.o0(0);
        aVar.N0();
        aVar.d.C1 = true;
        if (z) {
            aVar.h = true;
        }
        aVar.I0("player_equalizer_bottom_sheet");
    }

    @Override // xsna.ic40
    public final void c(Activity activity, MixData mixData, MusicBottomSheetLaunchPoint musicBottomSheetLaunchPoint, boolean z) {
        boolean z2 = activity instanceof AppCompatActivity;
        ContextWrapper contextWrapper = activity;
        if (z2) {
            if (z) {
                dhr0.a.getClass();
                contextWrapper = dhr0.t(activity);
            }
            new ve50.a(contextWrapper, mixData, musicBottomSheetLaunchPoint, z).I0("MusicVkMixSettingsModalBottomSheet");
        }
    }

    @Override // xsna.qd4
    public final void d(Activity activity, String str, String str2, AudioBookPersonRole audioBookPersonRole, MusicPlaybackLaunchContext musicPlaybackLaunchContext) {
        new di4.a(activity, str, str2, audioBookPersonRole, musicPlaybackLaunchContext).I0("AudioBookPersonDescriptionBottomSheet");
    }

    @Override // xsna.ic40
    public final void e(MusicBottomSheetLaunchPoint musicBottomSheetLaunchPoint, MusicPlaybackLaunchContext musicPlaybackLaunchContext, ms1 ms1Var, g9o g9oVar, u2b0 u2b0Var, MusicTrack musicTrack, a630 a630Var, boolean z, Activity activity) {
        new ga50(musicBottomSheetLaunchPoint, musicPlaybackLaunchContext, ms1Var, g9oVar, u2b0Var, musicTrack, null, new jc40(a630Var, activity, musicTrack, z), null, null, false, 3776).a(activity);
    }

    @Override // xsna.ic40
    public final void f(Activity activity, Playlist playlist, ec40.a aVar) {
        new go50(playlist, aVar).d(activity);
    }

    @Override // xsna.ic40
    public final void g(Activity activity, boolean z) {
        com.vk.music.player.d dVar = k840.a.f;
        if (dVar == null) {
            dVar = null;
        }
        List<Long> list = d6v0.d;
        new e6v0(d6v0.a.a(dVar), dVar, z).d(activity);
    }

    @Override // xsna.ic40
    public final void h(Activity activity, int i, PromoInfoEntity promoInfoEntity) {
        String str = promoInfoEntity.b;
        String str2 = promoInfoEntity.c;
        LinkButtonEntity linkButtonEntity = promoInfoEntity.d;
        new p250.a(activity, i, new PromoInfo(str, str2, new LinkButton(linkButtonEntity.b, linkButtonEntity.c, linkButtonEntity.d), promoInfoEntity.f, promoInfoEntity.g), promoInfoEntity.h).I0("MusicPromoModalBottomSheet");
    }

    @Override // xsna.ic40
    public final void i(Activity activity, boolean z, boolean z2, boolean z3, boolean z4) {
        o3b0.a aVar = new o3b0.a(activity, tzp0.a(null, 3));
        aVar.P0();
        aVar.O0();
        aVar.p0(0);
        aVar.m0(0);
        aVar.n0(0);
        aVar.o0(0);
        aVar.N0();
        aVar.d.C1 = true;
        if (z2) {
            aVar.h = true;
        }
        if (z) {
            aVar.k = CommonAudioStat$TypeAudioSourceEnum.MENU;
        }
        if (z3) {
            aVar.i = true;
        }
        if (z4) {
            aVar.j = true;
        }
        aVar.I0("audio_player_settings_menu");
    }

    @Override // xsna.ic40
    public final void k(Activity activity, OnboardingInfoEntity onboardingInfoEntity, String str) {
        new fr40.a(activity, new OnboardingInfo(onboardingInfoEntity.b, onboardingInfoEntity.c), str).I0("MusicOnboardingModalBottomSheet");
    }

    @Override // xsna.ic40
    public final void l(Activity activity, MusicPlaybackLaunchContext musicPlaybackLaunchContext, Playlist playlist, MusicBottomSheetLaunchPoint musicBottomSheetLaunchPoint, MusicBottomSheetActionTracker musicBottomSheetActionTracker) {
        ContextWrapper contextWrapper;
        boolean z = (musicBottomSheetLaunchPoint instanceof MusicBottomSheetLaunchPoint.App) || (musicBottomSheetLaunchPoint instanceof MusicBottomSheetLaunchPoint.Playlist);
        u2b0 r = ((AudioModelsComponent) m7m.a(activity).a(fpf0.a(AudioModelsComponent.class))).r();
        if (!z) {
            j7b0 j7b0Var = new j7b0(musicPlaybackLaunchContext, playlist, k840.c.b(playlist, j7b0.class.getSimpleName()), r, k840.a.d());
            new f7b0(playlist, j7b0Var, new nz8(playlist, j7b0Var), musicBottomSheetLaunchPoint, musicBottomSheetActionTracker, null).d(activity);
            return;
        }
        boolean M = dhr0.M();
        if (M) {
            dhr0.a.getClass();
            contextWrapper = dhr0.t(activity);
        } else {
            contextWrapper = activity;
        }
        cbb0.a aVar = new cbb0.a(contextWrapper, playlist);
        aVar.g = musicPlaybackLaunchContext;
        aVar.h = musicBottomSheetLaunchPoint;
        aVar.f = musicBottomSheetActionTracker;
        aVar.i = M;
        aVar.l = new mdv0(playlist, r);
        aVar.I0(null);
    }

    @Override // xsna.ic40
    public final void m(Activity activity, Playlist playlist, f0p.e.a aVar) {
        new v8b0(playlist, aVar).d(activity);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r14v0, types: [android.app.Activity, android.content.Context] */
    /* JADX WARN: Type inference failed for: r14v1, types: [android.content.ContextWrapper] */
    /* JADX WARN: Type inference failed for: r14v2, types: [xsna.l7s] */
    @Override // xsna.ic40
    public final void n(Activity activity, MusicBottomSheetLaunchPoint musicBottomSheetLaunchPoint, MusicTrack musicTrack, MusicPlaybackLaunchContext musicPlaybackLaunchContext, MusicBottomSheetActionTracker musicBottomSheetActionTracker, boolean z, boolean z2, String str, String str2) {
        if (activity instanceof AppCompatActivity) {
            if ((!(musicBottomSheetLaunchPoint instanceof MusicBottomSheetLaunchPoint.App) && !(musicBottomSheetLaunchPoint instanceof MusicBottomSheetLaunchPoint.Player) && !(musicBottomSheetLaunchPoint instanceof MusicBottomSheetLaunchPoint.Playlist)) || (!musicTrack.Tb() && !musicTrack.Wb())) {
                fy2 fy2Var = new fy2(0);
                ((Bundle) fy2Var.b).putBoolean("canSkipListening", z);
                new ga50(musicBottomSheetLaunchPoint, musicPlaybackLaunchContext, new com.vk.music.track.a(), k840.a.d(), ((AudioModelsComponent) m7m.a(activity).a(fpf0.a(AudioModelsComponent.class))).r(), musicTrack, fy2Var, null, musicBottomSheetActionTracker, null, z2, 1408).a(activity);
                return;
            }
            if (!musicTrack.Wb() && !(musicBottomSheetLaunchPoint instanceof MusicBottomSheetLaunchPoint.Player.Limited)) {
                l7s l7sVar = activity;
                if (!(musicBottomSheetLaunchPoint instanceof MusicBottomSheetLaunchPoint.Player.Messenger)) {
                    if (z2) {
                        dhr0.a.getClass();
                        l7sVar = dhr0.t(activity);
                    }
                    zfp0.a aVar = new zfp0.a(l7sVar, musicTrack, musicBottomSheetLaunchPoint);
                    aVar.h = musicPlaybackLaunchContext;
                    aVar.g = musicBottomSheetActionTracker;
                    aVar.i = z2;
                    aVar.j = str;
                    aVar.k = str2;
                    aVar.I0(null);
                    return;
                }
            }
            if (z2) {
                dhr0.a.getClass();
                activity = dhr0.t(activity);
            }
            yc50.a aVar2 = new yc50.a(activity, musicTrack, musicBottomSheetLaunchPoint);
            aVar2.h = musicPlaybackLaunchContext;
            aVar2.g = musicBottomSheetActionTracker;
            aVar2.i = z2;
            aVar2.j = str;
            aVar2.k = str2;
            aVar2.I0(null);
        }
    }

    @Override // xsna.qd4
    public final void o(Activity activity, AudioBook audioBook, AudioBookBottomSheetLaunchPoint audioBookBottomSheetLaunchPoint, MusicPlaybackLaunchContext musicPlaybackLaunchContext, boolean z) {
        int i = audioBook.b;
        boolean z2 = audioBook.f;
        String str = audioBook.c;
        Image image = audioBook.j;
        new nh4.a(activity, new AudioBookModel(i, z2, str, audioBook.Db(), image, audioBook.t, i5s.a(new StringBuilder("https://"), a0a.d, "/audiobook") + audioBook.b, audioBook.l, audioBook.m, audioBook.u), audioBookBottomSheetLaunchPoint, musicPlaybackLaunchContext, z).I0("AudioBookModalBottomSheet");
    }

    @Override // xsna.qd4
    public final void p(Activity activity, AudioBookPersonBottomSheetLaunchPoint audioBookPersonBottomSheetLaunchPoint, List<AudioBookPerson> list, AudioBookPerson audioBookPerson, MusicPlaybackLaunchContext musicPlaybackLaunchContext) {
        new zh4.a(activity, audioBookPersonBottomSheetLaunchPoint, list, audioBookPerson, musicPlaybackLaunchContext, audioBookPersonBottomSheetLaunchPoint.equals(AudioBookPersonBottomSheetLaunchPoint.Player.b)).I0("AudioBookPersonListBottomSheet");
    }

    @Override // xsna.ic40
    public final void q(Activity activity, String str, twi0 twi0Var, MusicBottomSheetLaunchPoint.Player.Full full) {
        if (activity instanceof AppCompatActivity) {
            dhr0.a.getClass();
            new wt4.a(dhr0.t(activity), str, full, twi0Var).I0("AudioReactionsModalBottomSheet");
        }
    }

    @Override // xsna.ic40
    public final void s(Activity activity, Playlist playlist, MusicPlaybackLaunchContext musicPlaybackLaunchContext, MusicBottomSheetLaunchPoint musicBottomSheetLaunchPoint, String str, NewsEntry newsEntry) {
        Playlist zb = Playlist.zb(playlist, null, null, null, null, -1, 255);
        u2b0 r = ((AudioModelsComponent) m7m.a(activity).a(fpf0.a(AudioModelsComponent.class))).r();
        lq40 d = k840.a.d();
        String canonicalName = str == null ? j7b0.class.getCanonicalName() : str;
        if (!(musicBottomSheetLaunchPoint instanceof MusicBottomSheetLaunchPoint.App) && !(musicBottomSheetLaunchPoint instanceof MusicBottomSheetLaunchPoint.Playlist)) {
            j7b0 j7b0Var = new j7b0(musicPlaybackLaunchContext, zb, k840.c.b(zb, canonicalName), r, d);
            new f7b0(zb, j7b0Var, new nz8(playlist, j7b0Var), musicBottomSheetLaunchPoint, null, newsEntry).d(activity);
            return;
        }
        ContextWrapper contextWrapper = activity;
        boolean M = dhr0.M();
        if (M) {
            dhr0.a.getClass();
            contextWrapper = dhr0.t(contextWrapper);
        }
        cbb0.a aVar = new cbb0.a(contextWrapper, zb);
        aVar.g = musicPlaybackLaunchContext;
        aVar.h = musicBottomSheetLaunchPoint;
        aVar.f = null;
        aVar.j = newsEntry;
        aVar.i = M;
        aVar.k = canonicalName;
        aVar.l = new mdv0(zb, r);
        aVar.I0(null);
    }

    @Override // xsna.qd4
    public final void u(Activity activity, AudioBookChapterBottomSheetLaunchPoint.RemoveDownload removeDownload) {
        new zd4.a(activity, removeDownload).I0("AudioBookChapterModalBottomSheet");
    }
}
