package xsna;

import android.app.Notification;
import android.app.PendingIntent;
import android.content.Context;
import android.content.Intent;
import android.widget.RemoteViews;
import androidx.core.app.NotificationCompat;
import com.vk.dto.music.Artist;
import com.vk.dto.music.MusicTrack;
import com.vk.music.player.PlaybackActionMeta;
import com.vk.music.player.PlayerMode;
import com.vk.music.player.service.MusicPlayerAction;
import com.vkontakte.android.R;
import java.util.List;
import xsna.ay40;
import xsna.k840;

/* compiled from: FlymeNotificationCreatorStrategy.kt */
/* loaded from: classes3.dex */
public final class dvr extends z46 {
    public final u2b0 d;

    /* compiled from: FlymeNotificationCreatorStrategy.kt */
    public static final class a {
        public final CharSequence a;
        public final CharSequence b;
        public final PlayerMode c;

        public a(CharSequence charSequence, CharSequence charSequence2, PlayerMode playerMode) {
            this.a = charSequence;
            this.b = charSequence2;
            this.c = playerMode;
        }
    }

    /* compiled from: FlymeNotificationCreatorStrategy.kt */
    public static final /* synthetic */ class b {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;

        static {
            int[] iArr = new int[PlayerMode.values().length];
            try {
                iArr[PlayerMode.PODCAST.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[PlayerMode.NFT.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            $EnumSwitchMapping$0 = iArr;
        }
    }

    public dvr(tib tibVar) {
        super(tibVar, 1);
        this.d = k840.a.g().b();
    }

    public static int L0(MusicTrack musicTrack, PendingIntent pendingIntent) {
        if (pendingIntent == null) {
            return 4;
        }
        if (musicTrack == null || !musicTrack.Nb()) {
            return (musicTrack == null || !musicTrack.Wb()) ? 0 : 4;
        }
        return 4;
    }

    public static a X0(Context context, MusicTrack musicTrack) {
        CharSequence i;
        if (musicTrack == null) {
            return new a(null, null, PlayerMode.AUDIO);
        }
        String str = musicTrack.d;
        String str2 = musicTrack.e;
        String str3 = "";
        if (str == null) {
            str = "";
        }
        if (str2 == null) {
            str2 = "";
        }
        CharSequence p0 = drm0.p0(s490.b(str2, str, context.getColor(R.color.vk_white_alpha60)));
        if (musicTrack.Wb()) {
            i = context.getString(R.string.auido_radiostation_artist);
        } else {
            ucp ucpVar = ucp.a;
            StringBuilder sb = new StringBuilder();
            List<Artist> list = musicTrack.t;
            if (list != null) {
                str3 = s490.i(list);
            } else {
                String str4 = musicTrack.h;
                if (str4 != null) {
                    str3 = str4;
                }
            }
            sb.append(str3);
            sb.append(' ');
            sb.append(s490.c(musicTrack.u));
            i = ucp.i(drm0.p0(sb.toString()).toString());
        }
        return new a(p0, i, xo9.l(musicTrack));
    }

    public static boolean w0(PlayerMode playerMode) {
        int i = b.$EnumSwitchMapping$0[playerMode.ordinal()];
        return (i == 1 || i == 2) ? false : true;
    }

    public final PendingIntent b1(Context context, boolean z, PlayerMode playerMode) {
        Intent a2;
        tib tibVar = (tib) this.c;
        if (z) {
            return null;
        }
        if (w0(playerMode)) {
            PlaybackActionMeta playbackActionMeta = new PlaybackActionMeta(13, 0L, 2, null);
            a2 = tibVar.a(context, MusicPlayerAction.ACTION_NEXT, null);
            a2.putExtra("EXTRA_ACTION_META", playbackActionMeta);
        } else {
            PlaybackActionMeta playbackActionMeta2 = new PlaybackActionMeta(24, 0L, 2, null);
            a2 = tibVar.a(context, MusicPlayerAction.ACTION_NEXT_15, null);
            a2.putExtra("EXTRA_ACTION_META", playbackActionMeta2);
        }
        return z46.Z(context, a2);
    }

    public final PendingIntent d1(Context context, boolean z, PlayerMode playerMode) {
        Intent c;
        tib tibVar = (tib) this.c;
        if (z) {
            return null;
        }
        if (w0(playerMode)) {
            c = tibVar.c(context, true, new PlaybackActionMeta(14, 0L, 2, null), null);
        } else {
            PlaybackActionMeta playbackActionMeta = new PlaybackActionMeta(25, 0L, 2, null);
            c = tibVar.a(context, MusicPlayerAction.ACTION_PREV_15, null);
            c.putExtra("EXTRA_ACTION_META", playbackActionMeta);
        }
        return z46.Z(context, c);
    }

    @Override // xsna.ay40
    public final ay40.a k(final Context context, final boolean z, MusicTrack musicTrack, boolean z2) {
        final PendingIntent pendingIntent;
        PendingIntent Z;
        String str;
        PendingIntent Z2;
        tib tibVar = (tib) this.c;
        if (z2) {
            PlaybackActionMeta playbackActionMeta = new PlaybackActionMeta(32, 0L, 2, null);
            Intent a2 = tibVar.a(context, MusicPlayerAction.ACTION_STOP, null);
            a2.putExtra("EXTRA_ACTION_META", playbackActionMeta);
            pendingIntent = z46.Z(context, a2);
        } else {
            pendingIntent = null;
        }
        boolean z3 = musicTrack == null;
        a X0 = X0(context, musicTrack);
        PlayerMode playerMode = X0.c;
        if (z3) {
            Z = null;
        } else {
            PlaybackActionMeta playbackActionMeta2 = new PlaybackActionMeta(12, 0L, 2, null);
            Intent a3 = tibVar.a(context, MusicPlayerAction.ACTION_TOGGLE_RESUME_PAUSE, null);
            a3.putExtra("EXTRA_ACTION_META", playbackActionMeta2);
            Z = z46.Z(context, a3);
        }
        PendingIntent b1 = b1(context, z3, playerMode);
        PendingIntent d1 = d1(context, z3, playerMode);
        int i = 76;
        int i2 = b1 == null ? 76 : 255;
        int i3 = d1 == null ? 76 : 255;
        PlayerMode playerMode2 = PlayerMode.PODCAST;
        int i4 = playerMode == playerMode2 ? R.drawable.aplayer_cover_placeholder_podcast : R.drawable.aplayer_cover_placeholder;
        RemoteViews remoteViews = new RemoteViews(context.getPackageName(), R.layout.audio_notification);
        remoteViews.setTextViewText(R.id.title, X0.a);
        remoteViews.setTextViewText(R.id.content, X0.b);
        remoteViews.setImageViewResource(R.id.cover, i4);
        remoteViews.setOnClickPendingIntent(R.id.playpause, Z);
        remoteViews.setOnClickPendingIntent(R.id.next, b1);
        remoteViews.setOnClickPendingIntent(R.id.prev, d1);
        if (pendingIntent != null) {
            remoteViews.setOnClickPendingIntent(R.id.stop, pendingIntent);
        }
        remoteViews.setInt(R.id.next, "setAlpha", i2);
        remoteViews.setInt(R.id.prev, "setAlpha", i3);
        remoteViews.setImageViewResource(R.id.playpause, z ? R.drawable.vk_icon_pause_24 : R.drawable.vk_icon_play_24);
        remoteViews.setViewVisibility(R.id.next, L0(musicTrack, b1));
        remoteViews.setViewVisibility(R.id.prev, L0(musicTrack, d1));
        remoteViews.setImageViewResource(R.id.next, !w0(playerMode) ? R.drawable.ic_forward_15_20 : R.drawable.vk_icon_skip_next_24);
        remoteViews.setImageViewResource(R.id.prev, !w0(playerMode) ? R.drawable.ic_backward_15_20 : R.drawable.vk_icon_skip_previous_24);
        boolean z4 = musicTrack == null;
        a X02 = X0(context, musicTrack);
        PlayerMode playerMode3 = X02.c;
        if (z4) {
            Z2 = null;
            str = null;
        } else {
            PlaybackActionMeta playbackActionMeta3 = new PlaybackActionMeta(12, 0L, 2, null);
            str = null;
            Intent a4 = tibVar.a(context, MusicPlayerAction.ACTION_TOGGLE_RESUME_PAUSE, null);
            a4.putExtra("EXTRA_ACTION_META", playbackActionMeta3);
            Z2 = z46.Z(context, a4);
        }
        PendingIntent b12 = b1(context, z4, playerMode3);
        PendingIntent d12 = d1(context, z4, playerMode3);
        u2b0 u2b0Var = this.d;
        u2b0Var.U0();
        PendingIntent Z3 = z46.Z(context, tibVar.a(context, MusicPlayerAction.ACTION_TOGGLE_SHUFFLE, str));
        int i5 = b12 == null ? 76 : 255;
        int i6 = d12 == null ? 76 : 255;
        if (u2b0Var.U0() && Z3 != null) {
            i = 255;
        }
        boolean z5 = z4;
        int i7 = i;
        int i8 = playerMode3 == playerMode2 ? R.drawable.aplayer_cover_placeholder_podcast : R.drawable.aplayer_cover_placeholder;
        RemoteViews remoteViews2 = new RemoteViews(context.getPackageName(), R.layout.audio_notification_expanded);
        remoteViews2.setTextViewText(R.id.title, X02.a);
        remoteViews2.setTextViewText(R.id.content, X02.b);
        remoteViews2.setImageViewResource(R.id.cover, i8);
        remoteViews2.setOnClickPendingIntent(R.id.playpause, Z2);
        remoteViews2.setOnClickPendingIntent(R.id.next, b12);
        remoteViews2.setOnClickPendingIntent(R.id.prev, d12);
        remoteViews2.setOnClickPendingIntent(R.id.shuffle, Z3);
        if (pendingIntent != null) {
            remoteViews2.setOnClickPendingIntent(R.id.stop, pendingIntent);
        }
        remoteViews2.setInt(R.id.next, "setAlpha", i5);
        remoteViews2.setInt(R.id.prev, "setAlpha", i6);
        remoteViews2.setInt(R.id.shuffle, "setAlpha", i7);
        remoteViews2.setImageViewResource(R.id.playpause, z ? R.drawable.vk_icon_pause_36 : R.drawable.vk_icon_play_36);
        remoteViews2.setImageViewResource(R.id.next, z5 ? R.drawable.vk_icon_deprecated_ic_skip_next_alpha_40_28 : !w0(playerMode3) ? R.drawable.vk_icon_forward_15_24 : R.drawable.vk_icon_skip_next_36);
        remoteViews2.setImageViewResource(R.id.prev, z5 ? R.drawable.vk_icon_deprecated_ic_skip_previous_alpha_40_28 : !w0(playerMode3) ? R.drawable.vk_icon_replay_15_24 : R.drawable.vk_icon_skip_previous_36);
        remoteViews2.setImageViewResource(R.id.shuffle, R.drawable.vk_icon_shuffle_outline_24);
        remoteViews2.setViewVisibility(R.id.next, L0(musicTrack, b12));
        remoteViews2.setViewVisibility(R.id.prev, L0(musicTrack, d12));
        remoteViews2.setViewVisibility(R.id.shuffle, (Z3 == null || musicTrack == null || !ob50.e(musicTrack, u2b0Var)) ? 4 : 0);
        NotificationCompat.h hVar = new NotificationCompat.h(context, "audio_playback_channel");
        hVar.I.icon = z ? R.drawable.ic_stat_notify_play : R.drawable.ic_stat_notify_pause;
        hVar.r = "music_player_group";
        hVar.t = true;
        hVar.z = remoteViews;
        hVar.A = remoteViews2;
        return new ay40.a(hVar, new x9d(3), new izs() { // from class: xsna.cvr
            @Override // xsna.izs
            public final Object invoke(Object obj) {
                Notification notification = (Notification) obj;
                tib tibVar2 = (tib) dvr.this.c;
                MusicPlayerAction musicPlayerAction = MusicPlayerAction.ACTION_SHOW_PLAYER;
                Context context2 = context;
                notification.contentIntent = z46.Z(context2, tibVar2.a(context2, musicPlayerAction, null));
                notification.visibility = 1;
                PendingIntent pendingIntent2 = pendingIntent;
                if (pendingIntent2 != null) {
                    notification.deleteIntent = pendingIntent2;
                }
                notification.flags = z ? notification.flags | 34 : notification.flags & (-35);
                return s3q0.a;
            }
        });
    }
}
