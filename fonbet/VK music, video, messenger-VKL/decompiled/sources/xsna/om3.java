package xsna;

import android.content.Context;
import android.media.AudioManager;
import android.net.Uri;
import android.view.View;
import com.unity3d.services.UnityAdsConstants;
import com.vk.api.generated.users.dto.UsersUserFullDto;
import com.vk.dto.common.VideoFile;
import com.vk.dto.stories.model.StoryEntry;
import com.vk.log.L;
import com.vk.log.LoggerOutputTarget;
import com.vk.media.player.video.view.PlaylistPlayerVideoView;
import com.vk.queuesync.sync.models.SuperAppQueueAccessException;
import com.vk.stat.scheme.MobileOfficialAppsCoreNavStat$EventScreen;
import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.CopyOnWriteArrayList;
import java.util.concurrent.TimeUnit;
import one.video.player.OneVideoPlayer;
import one.video.player.RepeatMode;
import org.json.JSONObject;

/* compiled from: ArticleApiInteractorImpl.kt */
/* loaded from: classes15.dex */
public final class om3 implements p2q0, fsn0, owg0, xq2 {
    public final Object b;

    public /* synthetic */ om3(Object obj) {
        this.b = obj;
    }

    public static void c(ran0 ran0Var, qan0 qan0Var, y2 y2Var, g06 g06Var) {
        fco0.c();
        long j = ran0Var.b;
        List<JSONObject> list = ran0Var.a;
        pan0 pan0Var = ran0Var.c;
        if (j != -1) {
            qan0Var.d = j;
            g06Var.invoke(Long.valueOf(j), Boolean.valueOf(pan0Var != null));
        }
        if (pan0Var != null) {
            throw new SuperAppQueueAccessException(pan0Var);
        }
        if (list.isEmpty()) {
            return;
        }
        y2Var.invoke(list, Long.valueOf(ran0Var.b));
    }

    @Override // xsna.fsn0
    public boolean a(UsersUserFullDto usersUserFullDto) {
        return x19.B(usersUserFullDto);
    }

    @Override // xsna.owg0
    public void b(qan0 qan0Var, y2 y2Var, g06 g06Var) {
        try {
            L.e("[queue-sync-manager-slave-observer-1] loop started");
            while (true) {
                fco0.c();
                e0a e0aVar = (e0a) this.b;
                c((ran0) new san0(qan0Var.b, qan0Var, TimeUnit.SECONDS.toMillis(25L)).g((wy2) ((c2c0) e0aVar.b).invoke()), qan0Var, y2Var, g06Var);
            }
        } catch (Exception e) {
            L.e("[queue-sync-manager-slave-observer-1] loop stopped by reason: " + e);
            throw e;
        }
    }

    @Override // xsna.p2q0
    public dql d(Context context) {
        return new dql(context);
    }

    public void e(boolean z) {
        xaj0 xaj0Var;
        q7r q7rVar = (q7r) this.b;
        if ((!q7rVar.Y || z) && (xaj0Var = q7rVar.v) != null) {
            xaj0Var.d(z);
        }
    }

    public boolean f(StoryEntry storyEntry, CopyOnWriteArrayList copyOnWriteArrayList, boolean z, boolean z2) {
        OneVideoPlayer player;
        try {
            xaj0 xaj0Var = ((q7r) this.b).v;
            if (xaj0Var == null) {
                return false;
            }
            if (!z) {
                xaj0Var.f(RepeatMode.OFF);
                return true;
            }
            g(storyEntry, copyOnWriteArrayList, xaj0Var);
            if (z2) {
                PlaylistPlayerVideoView playlistPlayerVideoView = xaj0Var.a;
                OneVideoPlayer player2 = playlistPlayerVideoView.getPlayer();
                if ((player2 != null ? player2.getError() : null) != null && (player = playlistPlayerVideoView.getPlayer()) != null) {
                    player.e();
                }
            }
            return true;
        } catch (Throwable unused) {
            return false;
        }
    }

    public void g(StoryEntry storyEntry, List list, xaj0 xaj0Var) {
        VideoFile videoFile;
        q7r q7rVar = (q7r) this.b;
        mkm0 mkm0Var = q7rVar.i0;
        xaj0Var.a(list);
        PlaylistPlayerVideoView playlistPlayerVideoView = xaj0Var.a;
        VideoFile videoFile2 = storyEntry.n;
        int indexOf = list.indexOf(storyEntry) + 1;
        boolean z = false;
        boolean z2 = indexOf <= list.size() - 1 && ((StoryEntry) list.get(indexOf)).n != null;
        xaj0Var.c = z2;
        playlistPlayerVideoView.setContinuousMode(z2);
        if (storyEntry.Sb() || storyEntry.Qb() || videoFile2 == null) {
            xaj0Var.l = false;
            playlistPlayerVideoView.setVisibility(8);
            return;
        }
        xaj0Var.l = true;
        if (!xaj0Var.s) {
            playlistPlayerVideoView.setAlpha(UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT);
        }
        VideoFile videoFile3 = storyEntry.n;
        if (videoFile3 == null || videoFile3.getWidth() == 0 || (videoFile3.getWidth() < videoFile3.getHeight() && !storyEntry.Lb())) {
            if (storyEntry.F) {
                xaj0Var.c(!storyEntry.Lb());
            } else {
                xaj0Var.c(!(videoFile2.getWidth() >= videoFile2.getHeight()));
            }
        } else if (storyEntry.F) {
            xaj0Var.c(storyEntry.Lb());
        } else {
            xaj0Var.c(videoFile2.getWidth() >= videoFile2.getHeight());
        }
        elm0 elm0Var = mkm0Var.c;
        playlistPlayerVideoView.setNeedRequestAudioFocus(false);
        if (elm0Var != null && elm0Var.a()) {
            z = true;
        }
        xaj0Var.d(z);
        if (q7r.A0 && !a201.b().isHeadsetConnected()) {
            AudioManager audioManager = (AudioManager) mkm0Var.getContext().getSystemService("audio");
            if (audioManager.getStreamVolume(2) == 0 || audioManager.getRingerMode() == 1 || audioManager.getRingerMode() == 0) {
                e(true);
            }
        }
        StoryEntry currentStory = mkm0Var.getCurrentStory();
        if (currentStory != null && (videoFile = currentStory.n) != null && (!videoFile.v() || currentStory.Mb())) {
            rlt0 rlt0Var = new rlt0(currentStory.n, "story", null, false, null, null, null, null, null);
            q7rVar.n = rlt0Var;
            ArrayList arrayList = currentStory.W;
            if (arrayList != null) {
                rlt0Var.c = arrayList;
            }
        }
        Long b = q7rVar.b();
        asu0.a.getClass();
        asu0.n().execute(new u8p(this, storyEntry, b, 3));
        long j = q7rVar.q;
        m7q e = gpt0.e(gpt0.a, videoFile2, -1, com.vk.stat.scheme.t0.a(MobileOfficialAppsCoreNavStat$EventScreen.STORY_VIEWER), false, false, null, null, false, 480);
        Uri uri = e != null ? e.K : null;
        if (j != 0) {
            xaj0Var.g(videoFile2, uri, false, j, true);
            return;
        }
        L l = L.a;
        l.getClass();
        if (!L.m(LoggerOutputTarget.NONE)) {
            L.u(l, L.LogType.d, new Object[]{"VideoPlayer", i6n0.a(uri, "setVideoUri ")});
        }
        xaj0Var.g(videoFile2, uri, true, 0L, false);
    }

    @Override // xsna.xq2
    public aqr get(int i) {
        return (nqr) this.b;
    }

    @Override // xsna.p2q0
    public void l(View view, o2q0 o2q0Var) {
        if (view instanceof dql) {
            if (o2q0Var.b) {
                ad0.d((dql) view, o2q0Var);
            } else {
                ad0.h((dql) view, o2q0Var.g, o2q0Var.i, o2q0Var.d, o2q0Var.c);
            }
            ad0.f((dql) view, o2q0Var, (q7) this.b);
        }
    }

    public om3(float f, float f2) {
        this.b = new nqr(f, f2, 0.01f);
    }
}
