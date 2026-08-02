package xsna;

import com.vk.api.generated.audio.dto.AudioRestrictionDto;
import com.vk.api.generated.audio.dto.AudioRestrictionInfoDto;
import com.vk.api.generated.base.dto.BaseImageDto;
import com.vk.api.generated.base.dto.BaseLinkButtonActionDto;
import com.vk.api.generated.base.dto.BaseLinkButtonDto;
import com.vk.dto.common.Image;
import java.util.List;

/* compiled from: AudioRestrictionMapper.kt */
/* loaded from: classes3.dex */
public final class rw4 {
    public final ne6 a = new ne6();

    public final lw4 a(AudioRestrictionInfoDto audioRestrictionInfoDto) {
        Image image;
        BaseLinkButtonActionDto e;
        AudioRestrictionDto f = audioRestrictionInfoDto.f();
        int j = f != null ? f.j() : 0;
        String title = audioRestrictionInfoDto.getTitle();
        String str = title == null ? "" : title;
        String g = audioRestrictionInfoDto.g();
        String str2 = g == null ? "" : g;
        List<BaseImageDto> e2 = audioRestrictionInfoDto.e();
        if (e2 != null) {
            this.a.getClass();
            image = ne6.a(e2);
        } else {
            image = Image.d;
        }
        Image image2 = image;
        BaseLinkButtonDto d = audioRestrictionInfoDto.d();
        String str3 = null;
        String title2 = d != null ? d.getTitle() : null;
        if (title2 == null) {
            title2 = "";
        }
        BaseLinkButtonDto d2 = audioRestrictionInfoDto.d();
        if (d2 != null && (e = d2.e()) != null) {
            str3 = e.getUrl();
        }
        return new lw4(j, str, str2, image2, new fw4(title2, str3 != null ? str3 : ""));
    }
}
