package xsna;

import com.vk.dto.photo.Photo;
import com.vk.dto.photo.PhotoTag;
import io.appmetrica.analytics.coreutils.internal.StringUtils;
import java.util.Collections;
import java.util.List;
import org.json.JSONObject;

/* compiled from: VideoLiveDeleteBan.java */
/* loaded from: classes15.dex */
public final class oss0 extends xsg0 {
    public final /* synthetic */ int s = 1;

    public /* synthetic */ oss0(String str) {
        super(str);
    }

    @Override // xsna.xsg0
    /* renamed from: F0 */
    public Boolean a(JSONObject jSONObject) {
        switch (this.s) {
            case 0:
                return Boolean.TRUE;
            default:
                return super.a(jSONObject);
        }
    }

    @Override // xsna.xsg0, xsna.oer0, xsna.k7r0
    public /* bridge */ /* synthetic */ Object a(JSONObject jSONObject) {
        switch (this.s) {
            case 0:
                return Boolean.TRUE;
            default:
                return super.a(jSONObject);
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public oss0(Photo photo, PhotoTag photoTag, String str, String str2) {
        super("photos.declineTags");
        List singletonList = Collections.singletonList(photoTag);
        K("tags", j5g.g0(singletonList, StringUtils.COMMA, null, null, 0, new cwa(photo.e, photo.c, 1), 30));
        K("track_code", str);
        K("nav_screen", str2);
    }
}
