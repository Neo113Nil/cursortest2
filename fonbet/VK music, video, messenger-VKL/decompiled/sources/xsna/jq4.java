package xsna;

import android.content.Context;
import com.vk.core.serialize.Serializer;
import com.vk.dto.common.id.UserId;
import com.vk.dto.music.Artist;
import com.vk.dto.music.MusicTrack;
import com.vk.dto.music.Playlist;
import com.vk.dto.music.PlaylistLink;
import com.vk.dto.music.Thumb;
import com.vk.newsfeed.posting.impl.domain.model.upload.UploadDto;
import com.vk.newsfeed.posting.impl.presentation.model.MusicDto;
import java.util.List;
import java.util.Set;

/* compiled from: AudioMappers.kt */
/* loaded from: classes4.dex */
public final class jq4 {
    /* JADX WARN: Code restructure failed: missing block: B:4:0x0012, code lost:
    
        if (r1 == null) goto L8;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final MusicDto a(Context context, Playlist playlist) {
        String b;
        String g;
        String str;
        PlaylistLink playlistLink = playlist.f;
        if (playlistLink != null) {
            Set<Integer> set = Playlist.P;
            b = Playlist.a.b(playlistLink.b, playlistLink.c, playlist.x);
        }
        Set<Integer> set2 = Playlist.P;
        b = Playlist.a.b(playlist.b, playlist.c, playlist.x);
        String str2 = b;
        UserId userId = playlist.c;
        int i = playlist.b;
        String str3 = playlist.h;
        String str4 = str3 == null ? "" : str3;
        String str5 = playlist.i;
        String str6 = str5 == null ? "" : str5;
        int i2 = playlist.l;
        if (!playlist.Eb() || i2 <= 0) {
            g = c9b0.g(context, playlist);
        } else {
            g = c9b0.g(context, playlist) + " · " + i2;
        }
        String str7 = g;
        Thumb thumb = (Thumb) j5g.a0(playlist.Cb());
        if (thumb != null) {
            int a = iah0.a(44);
            Serializer.c<Thumb> cVar = Thumb.CREATOR;
            str = thumb.Ab(a, false);
        } else {
            str = null;
        }
        return new MusicDto(str2, userId, i, str4, str6, false, str7, "", str, true, false, null, new UploadDto.UploadState(UploadDto.UploadStep.Uploaded.b, null, 0, 0, 0, null, null, false, 254, null), 0L);
    }

    public static final MusicDto b(MusicTrack musicTrack) {
        String Ib = musicTrack.Ib();
        UserId userId = musicTrack.c;
        int i = musicTrack.b;
        String str = musicTrack.d;
        String str2 = "";
        if (str == null) {
            str = "";
        }
        String str3 = musicTrack.e;
        if (str3 == null) {
            str3 = "";
        }
        boolean Lb = musicTrack.Lb();
        String str4 = musicTrack.h;
        String str5 = str4 == null ? "" : str4;
        StringBuilder sb = new StringBuilder();
        List<Artist> list = musicTrack.t;
        if (list != null) {
            str2 = s490.i(list);
        } else {
            String str6 = musicTrack.h;
            if (str6 != null) {
                str2 = str6;
            }
        }
        sb.append(str2);
        sb.append(' ');
        sb.append(s490.c(musicTrack.u));
        return new MusicDto(Ib, userId, i, str, str3, Lb, drm0.p0(sb.toString()).toString().toString(), str5, musicTrack.Kb(iah0.a(44)), false, musicTrack.Y != null, musicTrack, new UploadDto.UploadState(UploadDto.UploadStep.Uploaded.b, null, 0, 0, 0, null, null, false, 254, null), 0L);
    }
}
