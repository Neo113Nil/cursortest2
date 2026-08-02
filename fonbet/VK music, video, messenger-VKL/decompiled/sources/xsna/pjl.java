package xsna;

import android.app.PendingIntent;
import android.content.Context;
import android.content.Intent;
import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.drawable.Drawable;
import android.support.v4.media.session.MediaSessionCompat;
import androidx.core.app.NotificationCompat;
import androidx.core.graphics.drawable.IconCompat;
import com.vk.dto.music.Artist;
import com.vk.dto.music.MusicTrack;
import com.vk.music.player.PlaybackActionMeta;
import com.vk.music.player.service.MusicPlayerAction;
import com.vk.music.utils.MusicPlayerNotificationTrampolineActivity;
import com.vkontakte.android.R;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import xsna.ay40;
import xsna.k840;

/* compiled from: DefaultNotificationCreatorStrategy.kt */
/* loaded from: classes3.dex */
public final class pjl extends z46 {
    public final MediaSessionCompat d;
    public final boolean e;
    public final com.vk.music.track.a f;
    public final i2p0 g;

    /* compiled from: DefaultNotificationCreatorStrategy.kt */
    public static final class a {
        public final NotificationCompat.h a;
        public final ArrayList<Integer> b = new ArrayList<>();
        public int c;

        public a(NotificationCompat.h hVar) {
            this.a = hVar;
        }

        public final void a(NotificationCompat.a aVar, boolean z) {
            this.a.b(aVar);
            if (z) {
                this.b.add(Integer.valueOf(this.c));
            }
            this.c++;
        }
    }

    public pjl(tib tibVar, MediaSessionCompat mediaSessionCompat, boolean z, com.vk.music.track.a aVar, i2p0 i2p0Var) {
        super(tibVar, 1);
        this.d = mediaSessionCompat;
        this.e = z;
        this.f = aVar;
        this.g = i2p0Var;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r13v5 */
    /* JADX WARN: Type inference failed for: r13v6, types: [boolean, int] */
    /* JADX WARN: Type inference failed for: r13v7 */
    /* JADX WARN: Type inference failed for: r6v30, types: [java.lang.CharSequence] */
    /* JADX WARN: Type inference failed for: r9v1, types: [androidx.core.app.NotificationCompat$h] */
    @Override // xsna.ay40
    public final ay40.a k(Context context, boolean z, MusicTrack musicTrack, boolean z2) {
        boolean z3;
        boolean z4;
        boolean z5;
        boolean z6;
        IconCompat d;
        Intent a2;
        Intent c;
        CharSequence charSequence;
        MediaSessionCompat.Token token;
        ?? r13;
        PendingIntent Z;
        String str;
        tib tibVar = (tib) this.c;
        PlaybackActionMeta playbackActionMeta = new PlaybackActionMeta(32, 0L, 2, null);
        Intent a3 = tibVar.a(context, MusicPlayerAction.ACTION_STOP, null);
        a3.putExtra("EXTRA_ACTION_META", playbackActionMeta);
        PendingIntent Z2 = z46.Z(context, a3);
        if (z && Z2 == null) {
            bn40.d("Unable to create pending intent due to system limits");
            i2p0 i2p0Var = this.g;
            i2p0Var.getClass();
            long currentTimeMillis = System.currentTimeMillis();
            if (currentTimeMillis - i2p0Var.a >= 60000) {
                cvk.u(R.string.music_player_restart_device, false);
                i2p0Var.a = currentTimeMillis;
            }
        }
        ?? hVar = new NotificationCompat.h(context, "audio_playback_channel");
        if (!z2) {
            Z2 = null;
        }
        a aVar = new a(hVar);
        boolean z7 = musicTrack != null && musicTrack.Nb();
        boolean z8 = musicTrack != null && musicTrack.Wb();
        u2b0 b = k840.a.g().b();
        boolean z9 = this.e;
        if (Z2 != null) {
            aVar.a(new NotificationCompat.a(R.drawable.vk_icon_cancel_24, context.getString(R.string.ui_accessibility_close), Z2), z9 || z7 || z8);
        }
        if (z9) {
            aVar.a(w0(context, !z), true);
        } else {
            boolean z10 = (z7 || z8) ? false : true;
            boolean z11 = (musicTrack != null && musicTrack.Vb()) || (musicTrack != null && musicTrack.Qb()) || ((musicTrack != null && musicTrack.Mb()) || (musicTrack != null && musicTrack.Ub()));
            if (z10) {
                if (z11) {
                    PlaybackActionMeta playbackActionMeta2 = new PlaybackActionMeta(25, 0L, 2, null);
                    c = tibVar.a(context, MusicPlayerAction.ACTION_PREV_15, null);
                    c.putExtra("EXTRA_ACTION_META", playbackActionMeta2);
                } else {
                    c = tibVar.c(context, true, new PlaybackActionMeta(14, 0L, 2, null), null);
                }
                z3 = z10;
                NotificationCompat.a aVar2 = new NotificationCompat.a(z11 ? R.drawable.ic_backward_15_28 : R.drawable.vk_icon_skip_previous_28, context.getString(z11 ? R.string.accessibility_rewind_on_15_sec_backward : R.string.music_talkback_prev), z46.Z(context, c));
                z4 = true;
                aVar.a(aVar2, true);
            } else {
                z3 = z10;
                z4 = true;
            }
            aVar.a(w0(context, !z), z4);
            if (z3) {
                if (z11) {
                    PlaybackActionMeta playbackActionMeta3 = new PlaybackActionMeta(24, 0L, 2, null);
                    a2 = tibVar.a(context, MusicPlayerAction.ACTION_NEXT_15, null);
                    a2.putExtra("EXTRA_ACTION_META", playbackActionMeta3);
                } else {
                    PlaybackActionMeta playbackActionMeta4 = new PlaybackActionMeta(13, 0L, 2, null);
                    a2 = tibVar.a(context, MusicPlayerAction.ACTION_NEXT, null);
                    a2.putExtra("EXTRA_ACTION_META", playbackActionMeta4);
                }
                z5 = true;
                aVar.a(new NotificationCompat.a(z11 ? R.drawable.ic_forward_15_28 : R.drawable.vk_icon_skip_next_28, context.getString(z11 ? R.string.accessibility_rewind_on_15_sec_forward : R.string.music_talkback_next), z46.Z(context, a2)), true);
            } else {
                z5 = true;
            }
            if (this.f.i(musicTrack) == z5 && !z8 && musicTrack != null) {
                aVar.a(new NotificationCompat.a(R.drawable.vk_icon_add_24, context.getString(R.string.music_talkback_add_audio), z46.Z(context, tibVar.a(context, MusicPlayerAction.ACTION_ADD_CURRENT, null))), false);
            }
            if (musicTrack != null && ob50.e(musicTrack, b)) {
                boolean U0 = b.U0();
                Intent a4 = tibVar.a(context, MusicPlayerAction.ACTION_TOGGLE_SHUFFLE, null);
                Drawable drawable = context.getDrawable(R.drawable.vk_icon_shuffle_24);
                Drawable mutate = drawable != null ? drawable.mutate() : null;
                if (mutate != null) {
                    Bitmap createBitmap = Bitmap.createBitmap(mutate.getIntrinsicWidth(), mutate.getIntrinsicHeight(), Bitmap.Config.ARGB_8888);
                    Canvas canvas = new Canvas(createBitmap);
                    mutate.setAlpha(U0 ? 255 : 138);
                    z6 = false;
                    mutate.setBounds(0, 0, mutate.getIntrinsicWidth(), mutate.getIntrinsicHeight());
                    mutate.draw(canvas);
                    d = IconCompat.c(createBitmap);
                } else {
                    z6 = false;
                    d = IconCompat.d(R.drawable.vk_icon_shuffle_24, context);
                }
                aVar.a(new NotificationCompat.a(d, context.getString(R.string.music_button_shuffle_compact), z46.Z(context, a4)), z6);
            }
        }
        hVar.I.icon = z ? R.drawable.ic_stat_notify_play : R.drawable.ic_stat_notify_pause;
        String str2 = "";
        if (z9) {
            charSequence = context.getString(R.string.audio_ad_title);
        } else if (musicTrack == null || (charSequence = s490.d(context, musicTrack.d, musicTrack.e, R.attr.vk_ui_text_secondary)) == null) {
            charSequence = "";
        }
        hVar.e = NotificationCompat.h.d(charSequence);
        if (!z9) {
            if (musicTrack != null && musicTrack.Wb()) {
                str2 = context.getString(R.string.auido_radiostation_artist);
            } else if (musicTrack != null) {
                ucp ucpVar = ucp.a;
                StringBuilder sb = new StringBuilder();
                List<Artist> list = musicTrack.t;
                if (list != null) {
                    str = s490.i(list);
                } else {
                    str = musicTrack.h;
                    if (str == null) {
                        str = "";
                    }
                }
                sb.append(str);
                sb.append(' ');
                sb.append(s490.c(musicTrack.u));
                ?? i = ucp.i(drm0.p0(sb.toString()).toString());
                if (i != 0) {
                    str2 = i;
                }
            }
        }
        hVar.f = NotificationCompat.h.d(str2);
        hVar.x = 1;
        hVar.r = "music_player_group";
        Context context2 = e43.a;
        if (context2 == null) {
            context2 = null;
        }
        if (context2.getApplicationInfo().targetSdkVersion >= 31) {
            token = null;
            Intent intent = new Intent("ACTION_SHOW_PLAYER", null, context, MusicPlayerNotificationTrampolineActivity.class);
            intent.setFlags(872415232);
            intent.putExtra("music_notification", "notification");
            r13 = 0;
            Z = t2i0.a(context, 0, intent, 167772160);
        } else {
            token = null;
            r13 = 0;
            Z = z46.Z(context, tibVar.a(context, MusicPlayerAction.ACTION_SHOW_PLAYER, null));
        }
        hVar.g = Z;
        hVar.l(r13);
        hVar.n(2, z);
        hVar.t = true;
        hVar.u = "service";
        hVar.l = r13;
        n970 n970Var = new n970();
        if (musicTrack != null && !musicTrack.Nb()) {
            MediaSessionCompat mediaSessionCompat = this.d;
            n970Var.f = mediaSessionCompat != null ? mediaSessionCompat.getSessionToken() : token;
        }
        int[] N0 = j5g.N0(aVar.b);
        n970Var.e = Arrays.copyOf(N0, N0.length);
        hVar.B(n970Var);
        return new ay40.a(hVar, new x7c(7), new sc(20));
    }

    public final NotificationCompat.a w0(Context context, boolean z) {
        tib tibVar = (tib) this.c;
        PlaybackActionMeta playbackActionMeta = new PlaybackActionMeta(12, 0L, 2, null);
        Intent a2 = tibVar.a(context, MusicPlayerAction.ACTION_TOGGLE_RESUME_PAUSE, null);
        a2.putExtra("EXTRA_ACTION_META", playbackActionMeta);
        return new NotificationCompat.a(z ? R.drawable.vk_icon_play_28 : R.drawable.vk_icon_pause_28, context.getString(z ? R.string.music_talkback_play : R.string.music_talkback_pause), z46.Z(context, a2));
    }
}
