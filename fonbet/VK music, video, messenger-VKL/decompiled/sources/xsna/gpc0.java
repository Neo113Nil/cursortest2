package xsna;

import com.vk.newsfeed.posting.impl.presentation.model.MusicDto;
import com.vkontakte.android.R;
import java.util.ArrayList;
import xsna.us2;

/* compiled from: PostingUiDtoExt.kt */
/* loaded from: classes4.dex */
public final class gpc0 {
    public static final us2 a(MusicDto musicDto) {
        String str = musicDto.i;
        String e = y8g0.e(R.string.posting_step2_music_button);
        ArrayList arrayList = new ArrayList();
        String str2 = musicDto.e;
        String str3 = musicDto.f;
        String obj = drm0.p0(y8g0.f(R.string.posting_music_title_additional_info, str2, str3)).toString();
        int K = drm0.K(0, 6, obj, str3, false);
        if (K >= 0) {
            arrayList.add(new us2.d(new hik0(f870.c(dhr0.t.c(R.attr.vk_ui_text_secondary)), 0L, null, null, null, null, null, 0L, null, null, null, 0L, null, null, 65534), K, str3.length() + K));
        }
        if (obj.length() > 0 && !drm0.N(str)) {
            return new us2(y8g0.f(R.string.posting_music_title_more_n_audios, obj, str), arrayList, 0);
        }
        if (obj.length() > 0) {
            return new us2(obj, arrayList, 0);
        }
        if (drm0.N(str)) {
            str = null;
        }
        if (str != null) {
            e = str;
        }
        return new us2(e, arrayList, 0);
    }

    public static final us2 b(MusicDto musicDto) {
        ArrayList arrayList = new ArrayList();
        String str = musicDto.e;
        String str2 = musicDto.f;
        String obj = drm0.p0(y8g0.f(R.string.posting_music_title_additional_info, str, str2)).toString();
        int K = drm0.K(0, 6, obj, str2, false);
        if (K >= 0) {
            arrayList.add(new us2.d(new hik0(f870.c(dhr0.t.c(R.attr.vk_ui_text_secondary)), 0L, null, null, null, null, null, 0L, null, null, null, 0L, null, null, 65534), K, str2.length() + K));
        }
        return new us2(obj, arrayList, 0);
    }
}
