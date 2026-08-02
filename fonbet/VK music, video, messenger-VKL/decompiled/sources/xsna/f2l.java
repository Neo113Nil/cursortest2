package xsna;

import android.graphics.Bitmap;
import android.media.AudioTrack;
import android.view.View;
import android.widget.ImageView;
import androidx.recyclerview.widget.RecyclerView;
import com.vk.audiomsg.player.SpeakerType;
import com.vk.audiomsg.player.Speed;
import com.vk.audiomsg.player.trackplayer.oggtrackplayer.PlayState;
import com.vk.medianative.AudioNative;
import com.vk.music.player.domain.state.MusicBigPlayerPage;
import com.vk.music.player.presentation.main.SwipeBlockingViewPager;
import com.vk.music.ui.bottomsheet.MusicPlayerPersistentBottomSheet;
import com.vk.newsfeed.impl.newsfeed_post.presentation.fragment.PostFragment;
import com.vk.newsfeed.impl.stats.PostViewFragmentTimeSpentTracker;
import java.io.File;
import java.io.InterruptedIOException;
import java.util.Iterator;
import kotlin.Result;
import org.webrtc.PeerConnection;
import ru.ok.android.externcalls.analytics.internal.upload.DbUploader;
import ru.ok.android.webrtc.PeerConnectionClient;
import ru.ok.android.webrtc.protocol.RtcCommand;
import ru.ok.android.webrtc.protocol.RtcCommandExecutor;
import xsna.i4b0;
import xsna.kw70;

/* compiled from: R8$$SyntheticClass */
/* loaded from: classes9.dex */
public final /* synthetic */ class f2l implements Runnable {
    public final /* synthetic */ int b;
    public final /* synthetic */ Object c;
    public final /* synthetic */ Object d;

    public /* synthetic */ f2l(int i, Object obj, Object obj2) {
        this.b = i;
        this.c = obj;
        this.d = obj2;
    }

    /* JADX WARN: Removed duplicated region for block: B:132:0x01c5 A[DONT_GENERATE] */
    /* JADX WARN: Removed duplicated region for block: B:134:0x01ca A[DONT_GENERATE] */
    /* JADX WARN: Removed duplicated region for block: B:136:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Type inference failed for: r7v0 */
    /* JADX WARN: Type inference failed for: r7v3, types: [com.vk.audiomsg.player.SpeakerType, com.vk.audiomsg.player.Speed, com.vk.audiomsg.player.trackplayer.oggtrackplayer.PlayState, java.lang.Float] */
    /* JADX WARN: Type inference failed for: r7v5 */
    /* JADX WARN: Type inference failed for: r7v8 */
    /* JADX WARN: Type inference failed for: r7v9 */
    @Override // java.lang.Runnable
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void run() {
        Object failure;
        Object obj;
        AudioTrack audioTrack;
        boolean z;
        SpeakerType speakerType;
        PlayState playState;
        Float f;
        Float f2;
        Speed speed;
        SpeakerType speakerType2;
        boolean z2;
        switch (this.b) {
            case 0:
                DbUploader._init_$lambda$0((e9e0) this.c, (DbUploader) this.d);
                return;
            case 1:
                View view = (View) this.c;
                Runnable runnable = (Runnable) this.d;
                d3m.a(view, view.getAlpha(), view.getTranslationY());
                if (runnable != null) {
                    runnable.run();
                    return;
                }
                return;
            case 2:
                MusicPlayerPersistentBottomSheet musicPlayerPersistentBottomSheet = (MusicPlayerPersistentBottomSheet) this.c;
                String str = (String) this.d;
                wb40 wb40Var = musicPlayerPersistentBottomSheet.t0;
                if (wb40Var != null) {
                    MusicBigPlayerPage.Companion.getClass();
                    try {
                        failure = MusicBigPlayerPage.valueOf(str);
                    } catch (Throwable th) {
                        failure = new Result.Failure(th);
                    }
                    obj = MusicBigPlayerPage.DEFAULT_PAGE;
                    if (failure instanceof Result.Failure) {
                        failure = obj;
                    }
                    MusicBigPlayerPage musicBigPlayerPage = (MusicBigPlayerPage) failure;
                    int i = wb40.I;
                    com.vk.music.view.player.a aVar = wb40Var.w;
                    int size = aVar != null ? aVar.l.size() : 0;
                    for (int i2 = 0; i2 < size; i2++) {
                        MusicBigPlayerPage musicBigPlayerPage2 = (MusicBigPlayerPage) j5g.b0(i2, aVar.l);
                        if (musicBigPlayerPage2 == null) {
                            MusicBigPlayerPage.Companion.getClass();
                            musicBigPlayerPage2 = MusicBigPlayerPage.DEFAULT_PAGE;
                        }
                        if (musicBigPlayerPage2 == musicBigPlayerPage) {
                            SwipeBlockingViewPager swipeBlockingViewPager = wb40Var.F;
                            if (swipeBlockingViewPager != null) {
                                swipeBlockingViewPager.setCurrentItem(i2);
                                return;
                            }
                            return;
                        }
                    }
                    return;
                }
                return;
            case 3:
                kw70 kw70Var = (kw70) this.c;
                ur4 ur4Var = (ur4) this.d;
                i4b0.a aVar2 = new i4b0.a();
                boolean z3 = true;
                kw70Var.e = 1;
                ?? r7 = 0;
                try {
                    kw70.a t = kw70Var.t(ur4Var);
                    if (t != null) {
                        cw70 cw70Var = kw70Var.h;
                        File file = t.b;
                        synchronized (cw70Var) {
                            try {
                                z = (file.isFile() && file.exists() && file.canRead()) ? AudioNative.openOpusFile(file.getAbsolutePath()) != 0 : false;
                            } finally {
                            }
                        }
                        if (z) {
                            kw70Var.u(new sh3(kw70Var, ur4Var, t.a));
                            AudioTrack audioTrack2 = null;
                            boolean z4 = false;
                            while (!Thread.interrupted()) {
                                try {
                                    PlayState playState2 = PlayState.PLAY;
                                    Speed.a aVar3 = Speed.Companion;
                                    SpeakerType.a aVar4 = SpeakerType.Companion;
                                    synchronized (kw70Var.k) {
                                        try {
                                            speakerType = aVar2.g;
                                            aVar2.a(kw70Var.m.a);
                                            i4b0.b bVar = kw70Var.m.b;
                                            playState = bVar.a;
                                            f = bVar.b;
                                            f2 = bVar.c;
                                            speed = bVar.d;
                                            speakerType2 = bVar.e;
                                            bVar.a = r7;
                                            bVar.b = r7;
                                            bVar.c = r7;
                                            bVar.d = r7;
                                            bVar.e = r7;
                                            if (playState != null) {
                                                z4 = false;
                                            }
                                            if (!((playState == null && f == null && f2 == null && speed == null && speakerType2 == null) ? z3 : false) || z4) {
                                                z2 = false;
                                            } else {
                                                kw70Var.k.wait();
                                                z2 = z3;
                                            }
                                            s3q0 s3q0Var = s3q0.a;
                                        } finally {
                                        }
                                    }
                                    if (!z2) {
                                        if (playState != PlayState.STOP && playState != PlayState.COMPLETE) {
                                            if (audioTrack2 == null || speakerType2 != null) {
                                                if (audioTrack2 != null) {
                                                    audioTrack2.flush();
                                                }
                                                if (audioTrack2 != null) {
                                                    audioTrack2.release();
                                                }
                                                kw70Var.h.getClass();
                                                AudioTrack v = kw70Var.v(aVar2, AudioNative.audioGetTotalPcmDuration());
                                                try {
                                                    z4 = aVar2.c == PlayState.PLAY;
                                                    audioTrack2 = v;
                                                } catch (Throwable th2) {
                                                    th = th2;
                                                    audioTrack = v;
                                                    try {
                                                        if (!(th instanceof InterruptedException) && !(th instanceof InterruptedIOException)) {
                                                            kw70Var.s(ur4Var, th);
                                                        }
                                                        if (audioTrack == null) {
                                                            return;
                                                        } else {
                                                            return;
                                                        }
                                                    } finally {
                                                        if (audioTrack != null) {
                                                            audioTrack.flush();
                                                        }
                                                        if (audioTrack != null) {
                                                            audioTrack.release();
                                                        }
                                                    }
                                                }
                                            }
                                            SpeakerType speakerType3 = aVar2.g;
                                            if (speakerType != speakerType3) {
                                                kw70Var.u(new nk0(kw70Var, sgk0.a, speakerType3));
                                            }
                                            if (f != null) {
                                                float floatValue = f.floatValue();
                                                synchronized (kw70Var.h) {
                                                    AudioNative.audioSeekOpusFile(floatValue);
                                                }
                                            }
                                            if (f2 != null) {
                                                audioTrack2.setVolume(f2.floatValue());
                                            }
                                            if (speed == null || kw70Var.x(audioTrack2, speed)) {
                                                if (playState == PlayState.PLAY || z4) {
                                                    z4 = kw70Var.w(audioTrack2, ur4Var);
                                                }
                                                if (playState == PlayState.PAUSE) {
                                                    audioTrack2.pause();
                                                }
                                                z3 = true;
                                                r7 = 0;
                                            } else {
                                                z3 = true;
                                                r7 = 0;
                                                audioTrack2 = null;
                                            }
                                        }
                                        if (audioTrack2 != null) {
                                            audioTrack2.flush();
                                        }
                                        if (audioTrack2 != null) {
                                            audioTrack2.release();
                                            return;
                                        }
                                        return;
                                    }
                                } catch (Throwable th3) {
                                    th = th3;
                                    audioTrack = audioTrack2;
                                    if (!(th instanceof InterruptedException)) {
                                        kw70Var.s(ur4Var, th);
                                    }
                                }
                            }
                            throw new InterruptedException();
                        }
                    }
                    throw new IllegalArgumentException("Source for play cannot be loaded or opened as file. Source: " + ur4Var);
                } catch (Throwable th4) {
                    th = th4;
                    audioTrack = null;
                }
                break;
            case 4:
                ((PeerConnectionClient) this.c).b((PeerConnection.SignalingState) this.d);
                return;
            case 5:
                PostFragment postFragment = (PostFragment) this.c;
                RecyclerView recyclerView = (RecyclerView) this.d;
                int i3 = PostFragment.S0;
                PostViewFragmentTimeSpentTracker Co = postFragment.Co();
                if (Co != null) {
                    Co.a(recyclerView);
                    return;
                }
                return;
            case 6:
                com.mbridge.msdk.config.dynamic.utils.image.b.a((Bitmap[]) this.c, (ImageView) this.d);
                return;
            default:
                zwy0 zwy0Var = (zwy0) this.c;
                RtcCommand<?> rtcCommand = (RtcCommand) this.d;
                Iterator it = zwy0Var.b.iterator();
                while (it.hasNext()) {
                    try {
                        ((RtcCommandExecutor.Listener) it.next()).onRtcCommandSubmit(rtcCommand);
                    } catch (Throwable th5) {
                        zwy0Var.a.reportException("CallsListeners", "rtc.command.handle.listeners.oncommandsubmit", th5);
                    }
                }
                return;
        }
    }
}
