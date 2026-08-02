package xsna;

import com.vk.newsfeed.posting.impl.presentation.model.MusicDto;
import com.vkontakte.android.R;
import java.util.List;
import kotlin.collections.EmptyList;

/* compiled from: MusicUiDtoTransformer.kt */
/* loaded from: classes4.dex */
public final class me50 {
    public final ma40 a = new ma40(new us2(y8g0.e(R.string.posting_step2_music_button)), y8g0.e(R.string.posting_step2_empty_music_button_content_description), 64);

    public static ma40 a(MusicDto musicDto) {
        String str = musicDto.e;
        String str2 = musicDto.h;
        if (drm0.N(str2)) {
            str2 = null;
        }
        return new ma40(new us2(str), str.length() == 0 ? y8g0.e(R.string.posting_step2_empty_music_button_content_description) : y8g0.f(R.string.posting_step2_playlist_button_content_description, str), musicDto.g, str2, musicDto.j, true, true);
    }

    /* JADX WARN: Removed duplicated region for block: B:16:0x006b  */
    /* JADX WARN: Removed duplicated region for block: B:19:0x0099  */
    /* JADX WARN: Removed duplicated region for block: B:21:0x00a0  */
    /* JADX WARN: Removed duplicated region for block: B:24:0x00a9  */
    /* JADX WARN: Removed duplicated region for block: B:28:0x00ab  */
    /* JADX WARN: Removed duplicated region for block: B:29:0x009d  */
    /* JADX WARN: Removed duplicated region for block: B:30:0x0077  */
    /* JADX WARN: Removed duplicated region for block: B:36:0x003d  */
    /* JADX WARN: Removed duplicated region for block: B:6:0x003a  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static ma40 b(List list) {
        String str;
        String str2;
        String str3;
        String e;
        MusicDto musicDto = (MusicDto) j5g.a0(list);
        int size = list.size() - 1;
        if (list.size() > 1) {
            str2 = y8g0.d(R.plurals.posting_music_and_more_n_audios_plural, size, Integer.valueOf(size));
        } else if (list.size() != 1 || musicDto == null || (str2 = musicDto.h) == null || drm0.N(str2)) {
            str = null;
            str3 = musicDto == null ? musicDto.e : null;
            if (str3 != null || str3.length() == 0) {
                e = y8g0.e(R.string.posting_step2_empty_music_button_content_description);
            } else {
                e = y8g0.f(R.string.posting_step2_music_button_content_description, musicDto != null ? musicDto.e : null);
            }
            return new ma40(list.size() <= 1 ? gpc0.a((MusicDto) j5g.Y(list)) : list.size() == 1 ? gpc0.b((MusicDto) j5g.Y(list)) : new us2(y8g0.e(R.string.posting_step2_music_button), EmptyList.b, 0), e, musicDto == null ? musicDto.g : false, str, musicDto != null ? musicDto.j : null, list.size() != 1, false);
        }
        str = str2;
        if (musicDto == null) {
        }
        if (str3 != null) {
        }
        e = y8g0.e(R.string.posting_step2_empty_music_button_content_description);
        return new ma40(list.size() <= 1 ? gpc0.a((MusicDto) j5g.Y(list)) : list.size() == 1 ? gpc0.b((MusicDto) j5g.Y(list)) : new us2(y8g0.e(R.string.posting_step2_music_button), EmptyList.b, 0), e, musicDto == null ? musicDto.g : false, str, musicDto != null ? musicDto.j : null, list.size() != 1, false);
    }
}
