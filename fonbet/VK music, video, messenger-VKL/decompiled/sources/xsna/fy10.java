package xsna;

import android.annotation.SuppressLint;
import android.app.PendingIntent;
import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import android.graphics.Bitmap;
import android.net.Uri;
import android.os.Bundle;
import android.support.v4.media.MediaMetadataCompat;
import android.support.v4.media.RatingCompat;
import android.support.v4.media.session.MediaSessionCompat;
import android.support.v4.media.session.PlaybackStateCompat;
import android.text.TextUtils;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.media.session.MediaButtonReceiver;
import com.vk.api.sdk.exceptions.VKApiExecutionException;
import com.vk.dto.music.AlbumLink;
import com.vk.dto.music.MusicTrack;
import com.vk.imageloader.ImageScreenSize;
import com.vk.log.L;
import com.vk.music.player.PlayState;
import com.vk.music.player.PlayerTrack;
import com.vk.music.player.service.MusicPlayerAction;
import com.vk.music.playerservice.impl.PlayerService;
import com.vkontakte.android.R;
import java.util.LinkedList;
import xsna.k840;
import xsna.kd50;

/* compiled from: MediaSessionHelper.java */
/* loaded from: classes3.dex */
public final class fy10 {
    public final Context a;
    public final io.reactivex.rxjava3.disposables.g b = new io.reactivex.rxjava3.disposables.g();
    public MediaSessionCompat c;
    public final u2b0 d;
    public final nd50 e;

    @NonNull
    public final dy10 f;
    public boolean g;
    public final e2b0 h;
    public final boolean i;
    public final a j;

    /* compiled from: MediaSessionHelper.java */
    public class a implements kd50.a {
        public a() {
        }

        @Override // xsna.kd50.a
        public final void a(@Nullable MusicTrack musicTrack, @Nullable VKApiExecutionException vKApiExecutionException, boolean z) {
            c(musicTrack);
        }

        @Override // xsna.kd50.a
        public final void b(@Nullable MusicTrack musicTrack) {
            c(musicTrack);
        }

        public final void c(@Nullable MusicTrack musicTrack) {
            fy10 fy10Var = fy10.this;
            MusicTrack f = fy10Var.h.e.f();
            if (f == null || musicTrack == null || !musicTrack.Fb().equals(f.Fb())) {
                return;
            }
            PlayState o0 = e2b0.o0(fy10Var.h.u);
            e2b0 e2b0Var = fy10Var.h;
            fy10Var.b(o0, e2b0Var.e, e2b0Var.k(), fy10Var.h.y.getSize());
        }
    }

    /* compiled from: MediaSessionHelper.java */
    public static /* synthetic */ class b {
        public static final /* synthetic */ int[] a;

        static {
            int[] iArr = new int[PlayState.values().length];
            a = iArr;
            try {
                iArr[PlayState.STOPPED.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                a[PlayState.PAUSED.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                a[PlayState.PLAYING.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
        }
    }

    public fy10(PlayerService playerService, @NonNull dy10 dy10Var, e2b0 e2b0Var, boolean z) {
        u2b0 b2 = k840.a.g().b();
        this.d = b2;
        this.e = new nd50(b2, o25.a());
        this.j = new a();
        this.a = playerService.getApplicationContext();
        this.f = dy10Var;
        this.h = e2b0Var;
        this.i = z;
        a();
    }

    public final void a() {
        Context context = this.a;
        if (this.g) {
            return;
        }
        try {
            MediaSessionCompat mediaSessionCompat = new MediaSessionCompat(context, "VK Music", new ComponentName(context, (Class<?>) MediaButtonReceiver.class), PendingIntent.getBroadcast(context, 0, new Intent("android.intent.action.MEDIA_BUTTON", null, context, MediaButtonReceiver.class), 33554432));
            this.c = mediaSessionCompat;
            mediaSessionCompat.setCallback(this.f);
            this.c.setFlags(3);
            this.e.r1(this.j);
            this.g = true;
        } catch (SecurityException e) {
            com.vk.metrics.eventtracking.b.a.q(e);
        }
    }

    @SuppressLint({"CheckResult"})
    public final void b(PlayState playState, final com.vk.music.player.f fVar, final int i, final int i2) {
        MusicTrack f = fVar.f();
        PlaybackStateCompat.Builder builder = new PlaybackStateCompat.Builder();
        if (f != null) {
            boolean Vb = f.Vb();
            boolean z = this.i;
            if (Vb || f.Ub()) {
                builder.setActions((z ? 1L : 0L) | 910);
            } else if (f.Wb()) {
                builder.setActions((z ? 1L : 0L) | 518);
                Bundle bundle = new Bundle();
                bundle.putBoolean("android.media.playback.ALWAYS_RESERVE_SPACE_FOR.ACTION_SKIP_TO_PREVIOUS", true);
                bundle.putBoolean("android.media.playback.ALWAYS_RESERVE_SPACE_FOR.ACTION_SKIP_TO_NEXT", true);
                builder.setExtras(bundle);
            } else {
                builder.setActions((z ? 1L : 0L) | 830);
            }
            boolean Vb2 = f.Vb();
            Context context = this.a;
            if (Vb2 || f.Ub()) {
                builder.addCustomAction(MusicPlayerAction.ACTION_PREV_15.name(), context.getString(R.string.accessibility_rewind_on_15_sec_backward), R.drawable.ic_backward_15_28);
                builder.addCustomAction(MusicPlayerAction.ACTION_NEXT_15.name(), context.getString(R.string.accessibility_rewind_on_15_sec_forward), R.drawable.ic_forward_15_28);
            }
            if (z) {
                builder.addCustomAction(MusicPlayerAction.ACTION_STOP.name(), context.getString(R.string.ui_accessibility_close), R.drawable.vk_icon_cancel_24);
            }
            if (f.Tb() && this.e.i(f)) {
                builder.addCustomAction(MusicPlayerAction.ACTION_ADD_CURRENT.name(), context.getString(R.string.accessibility_add_audio), R.drawable.vk_icon_add_24);
            }
            u2b0 u2b0Var = this.d;
            if (ob50.e(f, u2b0Var)) {
                builder.addCustomAction(MusicPlayerAction.ACTION_TOGGLE_SHUFFLE.name(), context.getString(R.string.playlist_shuffle), u2b0Var.U0() ? R.drawable.vk_icon_shuffle_outline_dot_24 : R.drawable.vk_icon_shuffle_outline_24);
            }
        }
        int i3 = b.a[playState.ordinal()];
        if (i3 == 1) {
            builder.setState(1, 0L, 1.0f);
        } else if (i3 == 2) {
            builder.setState(2, fVar.h(), 1.0f);
        } else if (i3 == 3) {
            builder.setState(3, fVar.h(), 1.0f);
        }
        MediaSessionCompat mediaSessionCompat = this.c;
        if (mediaSessionCompat == null) {
            return;
        }
        mediaSessionCompat.setPlaybackState(builder.build());
        PlayerTrack playerTrack = fVar.c;
        if (playerTrack != null) {
            MusicTrack musicTrack = playerTrack.b;
            boolean z2 = musicTrack.W != null;
            ImageScreenSize imageScreenSize = ImageScreenSize.MID;
            String Kb = musicTrack.Kb(imageScreenSize.h());
            if (TextUtils.isEmpty(Kb) || z2) {
                e(fVar, null, i, i2);
            } else {
                e(fVar, null, i, i2);
                this.b.b(mcr0.j(Uri.parse(Kb), imageScreenSize).r0(asu0.a.c()).a0(io.reactivex.rxjava3.android.schedulers.a.b()).F(new xmb(1)).subscribe(new io.reactivex.rxjava3.functions.f() { // from class: xsna.ey10
                    @Override // io.reactivex.rxjava3.functions.f
                    public final void accept(Object obj) {
                        int i4 = i2;
                        fy10.this.e(fVar, (Bitmap) obj, i, i4);
                    }
                }));
            }
        }
        this.c.setActive(true);
    }

    public final void c() {
        if (this.g) {
            this.g = false;
            this.b.b(null);
            LinkedList linkedList = this.e.c;
            if (linkedList != null) {
                linkedList.remove(this.j);
            }
            MediaSessionCompat mediaSessionCompat = this.c;
            if (mediaSessionCompat != null) {
                mediaSessionCompat.setActive(false);
                this.c.release();
                this.c = null;
            }
        }
    }

    public final void d(PlayState playState, com.vk.music.player.f fVar, int i, int i2) {
        if (playState == PlayState.STOPPED) {
            c();
        } else {
            a();
            b(playState, fVar, i, i2);
        }
    }

    public final void e(com.vk.music.player.f fVar, Bitmap bitmap, int i, int i2) {
        MusicTrack f = fVar.f();
        MediaSessionCompat mediaSessionCompat = this.c;
        if (mediaSessionCompat == null || !mediaSessionCompat.isActive() || f == null) {
            return;
        }
        try {
            bn40.f("updateMetadata", "artist", f.h, "title", f.d, "bitmap", bitmap);
            MediaMetadataCompat.Builder builder = new MediaMetadataCompat.Builder();
            RatingCompat newHeartRating = RatingCompat.newHeartRating(f.U);
            AlbumLink albumLink = f.q;
            builder.putString(MediaMetadataCompat.METADATA_KEY_ALBUM, albumLink == null ? "" : albumLink.e);
            builder.putString(MediaMetadataCompat.METADATA_KEY_ALBUM_ARTIST, f.h);
            builder.putString(MediaMetadataCompat.METADATA_KEY_ARTIST, f.h);
            builder.putString(MediaMetadataCompat.METADATA_KEY_TITLE, f.d);
            builder.putLong(MediaMetadataCompat.METADATA_KEY_DURATION, fVar.e());
            builder.putLong(MediaMetadataCompat.METADATA_KEY_TRACK_NUMBER, i + 1);
            builder.putLong(MediaMetadataCompat.METADATA_KEY_NUM_TRACKS, i2);
            builder.putRating(MediaMetadataCompat.METADATA_KEY_USER_RATING, newHeartRating);
            if (bitmap != null && !bitmap.isRecycled() && s101.q(bitmap)) {
                builder.putBitmap(MediaMetadataCompat.METADATA_KEY_ALBUM_ART, bitmap.getConfig() == null ? bitmap.copy(Bitmap.Config.ARGB_8888, false) : bitmap);
            }
            this.c.setMetadata(builder.build());
        } catch (Exception e) {
            L.G("error: can't apply meta data " + e);
        }
    }
}
