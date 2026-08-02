package xsna;

import android.graphics.Color;
import com.vk.api.generated.base.dto.BaseImageDto;
import com.vk.api.generated.wall.dto.WallPosterConstantsDto;
import com.vk.api.generated.wall.dto.WallPosterDto;
import com.vk.dto.common.Image;
import com.vk.dto.common.id.UserId;
import com.vk.dto.newsfeed.Owner;
import com.vk.dto.newsfeed.entries.Poster;
import java.util.List;
import java.util.Map;

/* compiled from: WallPosterDtoToPosterMapper.kt */
/* loaded from: classes3.dex */
public final class aax0 {
    public static Poster a(WallPosterDto wallPosterDto, Map map) {
        int i;
        int i2;
        Integer k;
        Float g;
        Float e;
        Float f;
        Float d;
        Integer j;
        Integer i3;
        UserId f2 = wallPosterDto.f();
        if (f2 == null) {
            f2 = UserId.d;
        }
        UserId userId = f2;
        try {
            i = Color.parseColor(wallPosterDto.j());
        } catch (Exception unused) {
            i = -1;
        }
        int i4 = i;
        try {
            i2 = Color.parseColor(wallPosterDto.k());
        } catch (Exception unused2) {
            i2 = -16777216;
        }
        int i5 = i2;
        List<List<BaseImageDto>> i6 = wallPosterDto.i();
        new ne6();
        Image a = ne6.a(i6 != null ? (List) j5g.b0(0, i6) : null);
        Image a2 = ne6.a(i6 != null ? (List) j5g.b0(1, i6) : null);
        WallPosterConstantsDto g2 = wallPosterDto.g();
        Poster.Constants constants = new Poster.Constants((g2 == null || (i3 = g2.i()) == null) ? 160 : i3.intValue(), (g2 == null || (j = g2.j()) == null) ? 104 : j.intValue(), (g2 == null || (d = g2.d()) == null) ? 0.06667f : d.floatValue(), (g2 == null || (f = g2.f()) == null) ? 0.07777f : f.floatValue(), (g2 == null || (e = g2.e()) == null) ? 0.06111f : e.floatValue(), (g2 == null || (g = g2.g()) == null) ? 0.07222f : g.floatValue(), (g2 == null || (k = g2.k()) == null) ? 5 : k.intValue());
        int i7 = 0;
        Integer e2 = wallPosterDto.e();
        if (e2 != null) {
            i7 = e2.intValue();
        }
        boolean f3 = true ^ epx.f(wallPosterDto.l(), Boolean.TRUE);
        Owner owner = map != null ? (Owner) map.get(userId) : null;
        String d2 = wallPosterDto.d();
        if (d2 == null) {
            d2 = "";
        }
        return new Poster(i7, userId, i4, i5, a, a2, constants, f3, owner, d2, null);
    }
}
