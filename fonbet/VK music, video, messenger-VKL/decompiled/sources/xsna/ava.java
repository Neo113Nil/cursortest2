package xsna;

import com.vk.api.generated.base.dto.BaseUploadServerDto;
import com.vk.api.generated.channels.dto.ChannelsSaveCoverResponseDto;
import com.vk.api.generated.photos.dto.PhotosPhotoDto;
import java.util.List;
import xsna.m7r0;

/* compiled from: ChannelChangeAvatarApiCmd.kt */
/* loaded from: classes2.dex */
public final class ava extends nx2<String> {
    public final String b;
    public final ckq<String> c;

    public ava() {
        this("");
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof ava) && epx.f(this.b, ((ava) obj).b);
    }

    @Override // xsna.nx2
    public final String f(l7r0 l7r0Var) {
        Object e;
        PhotosPhotoDto photosPhotoDto;
        BaseUploadServerDto baseUploadServerDto = (BaseUploadServerDto) bz2.d(new tfx("channels.getCoverUploadServer", new jq(8), new kq(10)));
        String e2 = baseUploadServerDto.e();
        String d = baseUploadServerDto.d();
        m7r0.a.C3325a c3325a = m7r0.a.a;
        ckq<String> ckqVar = this.c;
        k7r0<String> k7r0Var = ckqVar.b;
        izs<String, akv> izsVar = ckqVar.a;
        try {
            e = bz2.e(izsVar.invoke(e2), c3325a, k7r0Var);
        } catch (Exception e3) {
            if (d == null || d.equals(e2)) {
                throw e3;
            }
            e = bz2.e(izsVar.invoke(d), c3325a, k7r0Var);
        }
        String str = (String) e;
        tfx tfxVar = new tfx("channels.saveCover", new cq(6), new dq(7));
        if (str != null) {
            tfx.o(tfxVar, "photo", str, 0, 0, 12);
        }
        ChannelsSaveCoverResponseDto channelsSaveCoverResponseDto = (ChannelsSaveCoverResponseDto) bz2.d(tfxVar);
        List<PhotosPhotoDto> d2 = channelsSaveCoverResponseDto.d();
        if (d2 == null || (photosPhotoDto = (PhotosPhotoDto) j5g.a0(d2)) == null) {
            throw new IllegalArgumentException("photoResult is invalid: " + channelsSaveCoverResponseDto);
        }
        StringBuilder sb = new StringBuilder();
        sb.append(photosPhotoDto.q());
        sb.append('_');
        sb.append(photosPhotoDto.getId());
        return sb.toString();
    }

    public final int hashCode() {
        return Boolean.hashCode(false) + (this.b.hashCode() * 31);
    }

    public final String toString() {
        return i5s.a(new StringBuilder("ChannelChangeAvatarApiCmd(filePath="), this.b, ", awaitNetwork=false)");
    }

    public ava(String str) {
        this.b = str;
        this.c = new ckq<>(new op1(this, 16), zua.b);
    }
}
