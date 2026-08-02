package xsna;

import android.content.Context;
import com.vk.dto.music.MusicTrack;
import com.vk.dto.music.Thumb;
import com.vk.newsfeed.posting.impl.presentation.model.MusicDto;
import com.vkontakte.android.R;

/* compiled from: MusicTrackExt.kt */
/* loaded from: classes4.dex */
public final class nb50 {
    public static final String a(MusicTrack musicTrack) {
        int i = musicTrack.Bb() == 1 ? R.string.music_talkback_track_cover_one_author : R.string.music_talkback_track_cover_many_authors;
        String str = musicTrack.d;
        if (str == null) {
            str = "";
        }
        String str2 = musicTrack.h;
        return y8g0.f(i, str, str2 != null ? str2 : "");
    }

    public static final ae50 b(MusicDto musicDto, boolean z, boolean z2) {
        String str;
        String str2;
        us2 b = gpc0.b(musicDto);
        String str3 = musicDto.b;
        String str4 = b.c;
        boolean z3 = musicDto.g;
        String str5 = musicDto.h;
        String str6 = musicDto.j;
        MusicTrack musicTrack = musicDto.m;
        Thumb Jb = musicTrack != null ? musicTrack.Jb() : null;
        String a = musicTrack != null ? a(musicTrack) : null;
        if (musicTrack == null || (str = (String) musicTrack.b0.getValue()) == null) {
            str = "";
        }
        us2 us2Var = new us2(str);
        if (musicTrack != null) {
            Context context = e43.a;
            String obj = f870.p(context != null ? context : null, musicTrack.f, musicTrack.s).toString();
            if (obj != null) {
                str2 = obj;
                return new ae50(str3, b, str4, z3, str5, str6, a, Jb, false, z2, false, true, us2Var, str2, musicTrack == null && musicTrack.B(), z);
            }
        }
        str2 = "";
        return new ae50(str3, b, str4, z3, str5, str6, a, Jb, false, z2, false, true, us2Var, str2, musicTrack == null && musicTrack.B(), z);
    }
}
