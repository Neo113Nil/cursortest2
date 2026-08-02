package xsna;

import android.content.Context;
import android.media.MediaPlayer;
import com.vk.media.player.video.view.SystemVideoView;
import xsna.nlg;

/* compiled from: CommonPhotoViewerBridge.kt */
/* loaded from: classes7.dex */
public final class nlg implements cea0 {
    public static final nlg a = new nlg();

    /* compiled from: CommonPhotoViewerBridge.kt */
    public static final class a implements vqt0 {
        public final SystemVideoView a;

        public a(Context context) {
            this.a = new SystemVideoView(context);
        }

        @Override // xsna.vqt0
        public final long a() {
            return this.a.getDuration();
        }

        @Override // xsna.vqt0
        public final void c(String str, boolean z, boolean z2, gzs gzsVar, final gzs gzsVar2, final gzs gzsVar3, final gzs gzsVar4, final gzs gzsVar5, final gzs gzsVar6) {
            gzsVar.invoke();
            SystemVideoView systemVideoView = this.a;
            systemVideoView.setVideoPath(str);
            systemVideoView.setLoop(z);
            systemVideoView.setSound(z2);
            systemVideoView.setOnInfoListener(new MediaPlayer.OnInfoListener() { // from class: xsna.klg
                @Override // android.media.MediaPlayer.OnInfoListener
                public final boolean onInfo(MediaPlayer mediaPlayer, int i, int i2) {
                    if (i == 3) {
                        gzsVar3.invoke();
                        return true;
                    }
                    if (i == 701) {
                        gzs.this.invoke();
                        return true;
                    }
                    if (i != 702) {
                        return false;
                    }
                    gzsVar5.invoke();
                    return true;
                }
            });
            systemVideoView.setOnPreparedListener(new MediaPlayer.OnPreparedListener() { // from class: xsna.llg
                @Override // android.media.MediaPlayer.OnPreparedListener
                public final void onPrepared(MediaPlayer mediaPlayer) {
                    SystemVideoView systemVideoView2 = nlg.a.this.a;
                    systemVideoView2.g(1);
                    systemVideoView2.i();
                    gzsVar2.invoke();
                }
            });
            systemVideoView.setOnCompletionListener(new MediaPlayer.OnCompletionListener() { // from class: xsna.mlg
                @Override // android.media.MediaPlayer.OnCompletionListener
                public final void onCompletion(MediaPlayer mediaPlayer) {
                    gzs.this.invoke();
                }
            });
        }

        @Override // xsna.vqt0
        public final long d() {
            return this.a.getCurrentPosition();
        }

        @Override // xsna.vqt0
        public final void release() {
            this.a.j();
        }

        @Override // xsna.vqt0
        public final void seekTo(long j) {
            this.a.g((int) j);
        }

        @Override // xsna.vqt0
        public final void setPlayWhenReady(boolean z) {
            SystemVideoView systemVideoView = this.a;
            if (z) {
                systemVideoView.i();
            } else {
                systemVideoView.d();
            }
        }
    }

    @Override // xsna.cea0
    public final a a(Context context) {
        return new a(context);
    }
}
