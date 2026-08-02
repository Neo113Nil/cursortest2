package xsna;

import com.vk.api.generated.shortVideo.dto.ShortVideoGetOwnerVideosResponseDto;
import com.vk.api.generated.shortVideo.dto.ShortVideoPlaylistMinDto;
import com.vk.api.generated.shortVideo.dto.ShortVideoShortVideoInfoDto;
import com.vk.api.generated.video.dto.VideoVideoFullDto;
import com.vk.dto.common.ClipVideoFile;
import com.vk.dto.common.id.UserId;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.List;

/* compiled from: R8$$SyntheticClass */
/* loaded from: classes16.dex */
public final /* synthetic */ class iue implements izs {
    public final /* synthetic */ int b;
    public final /* synthetic */ int c;
    public final /* synthetic */ w8i d;
    public final /* synthetic */ Object e;

    public /* synthetic */ iue(w8i w8iVar, Object obj, int i, int i2) {
        this.b = i2;
        this.d = w8iVar;
        this.e = obj;
        this.c = i;
    }

    @Override // xsna.izs
    public final Object invoke(Object obj) {
        ShortVideoShortVideoInfoDto I2;
        List<ShortVideoPlaylistMinDto> d0;
        switch (this.b) {
            case 0:
                kue kueVar = (kue) this.d;
                UserId userId = (UserId) this.e;
                ShortVideoGetOwnerVideosResponseDto shortVideoGetOwnerVideosResponseDto = (ShortVideoGetOwnerVideosResponseDto) obj;
                kueVar.e.getClass();
                ArrayList f = ums0.f(ums0.a, shortVideoGetOwnerVideosResponseDto.e(), shortVideoGetOwnerVideosResponseDto.j(), shortVideoGetOwnerVideosResponseDto.d());
                LinkedHashSet linkedHashSet = new LinkedHashSet();
                Iterator it = f.iterator();
                int i = 0;
                while (it.hasNext()) {
                    int i2 = i + 1;
                    ClipVideoFile clipVideoFile = (ClipVideoFile) it.next();
                    VideoVideoFullDto videoVideoFullDto = (VideoVideoFullDto) j5g.b0(i, shortVideoGetOwnerVideosResponseDto.e());
                    Object obj2 = null;
                    if (videoVideoFullDto != null && (I2 = videoVideoFullDto.I2()) != null && (d0 = I2.d0()) != null) {
                        Iterator<T> it2 = d0.iterator();
                        while (true) {
                            if (it2.hasNext()) {
                                Object next = it2.next();
                                ShortVideoPlaylistMinDto shortVideoPlaylistMinDto = (ShortVideoPlaylistMinDto) next;
                                if (shortVideoPlaylistMinDto.getId() == this.c && epx.f(shortVideoPlaylistMinDto.q(), userId)) {
                                    obj2 = next;
                                }
                            }
                        }
                        obj2 = (ShortVideoPlaylistMinDto) obj2;
                    }
                    if (obj2 != null) {
                        linkedHashSet.add(clipVideoFile.r1());
                    }
                    i = i2;
                }
                return new xpe(f, linkedHashSet, shortVideoGetOwnerVideosResponseDto.g());
            default:
                gcs0 gcs0Var = (gcs0) this.d;
                Integer num = (Integer) this.e;
                ((Integer) obj).getClass();
                int i3 = gcs0Var.j;
                UserId userId2 = gcs0Var.i;
                String str = gcs0Var.q;
                if (num.intValue() <= 0) {
                    num = null;
                }
                return new owt(i3, userId2, str, Integer.valueOf(this.c), Integer.valueOf(num != null ? num.intValue() : gcs0Var.k), 0, null, null, gcs0Var.H, 992);
        }
    }
}
