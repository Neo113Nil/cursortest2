package xsna;

import com.vk.api.generated.base.dto.BaseImageDto;
import com.vk.api.generated.shortVideo.dto.ShortVideoGetPlaylistsResponseDto;
import com.vk.api.generated.shortVideo.dto.ShortVideoPlaylistFullDto;
import com.vk.clips.sdk.shared.api.playlist.ClipsPlaylist;
import com.vk.dto.common.ImageSize;
import com.vk.dto.common.data.VKList;
import com.vk.imageloader.ImageScreenSize;
import com.vk.menu.data.network.response.StreamParcelableSuperAppMenu;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.Lazy;
import kotlin.LazyThreadSafetyMode;
import kotlin.collections.EmptyList;
import xsna.hov;
import xsna.n9n0;

/* compiled from: R8$$SyntheticClass */
/* loaded from: classes3.dex */
public final /* synthetic */ class a720 implements izs {
    public final /* synthetic */ int b = 1;
    public final /* synthetic */ boolean c;

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:40:0x00dc  */
    @Override // xsna.izs
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object invoke(Object obj) {
        boolean z;
        EmptyList emptyList;
        switch (this.b) {
            case 0:
                boolean z2 = this.c;
                hov.a aVar = (hov.a) obj;
                k720 k720Var = k720.a;
                n9n0 n9n0Var = k720.R;
                if (n9n0Var != null) {
                    n9n0.a c = n9n0Var.c();
                    if (!(c instanceof n9n0.a.C3389a) || !((n9n0.a.C3389a) c).a()) {
                        z = false;
                        if (z) {
                            T t = aVar.a;
                            if (t != 0) {
                                k720.X(new n9n0(k720.K(((StreamParcelableSuperAppMenu) t).b), new n9n0.a.C3389a(false)));
                            }
                            n9n0 n9n0Var2 = k720.R;
                            if (n9n0Var2 != null) {
                                k720.a0(n9n0Var2);
                            }
                        }
                        if (!z || z2) {
                            pro0.e(new tdf(1));
                        }
                        return s3q0.a;
                    }
                }
                z = true;
                if (z) {
                }
                if (!z) {
                }
                pro0.e(new tdf(1));
                return s3q0.a;
            default:
                boolean z3 = this.c;
                ShortVideoGetPlaylistsResponseDto shortVideoGetPlaylistsResponseDto = (ShortVideoGetPlaylistsResponseDto) obj;
                List<ShortVideoPlaylistFullDto> d = shortVideoGetPlaylistsResponseDto.d();
                ArrayList arrayList = new ArrayList(c5g.u(d, 10));
                for (ShortVideoPlaylistFullDto shortVideoPlaylistFullDto : d) {
                    int id = shortVideoPlaylistFullDto.getId();
                    String title = shortVideoPlaylistFullDto.getTitle();
                    List<List<BaseImageDto>> e = shortVideoPlaylistFullDto.e();
                    Lazy a = msy.a(LazyThreadSafetyMode.NONE, new iy2(5));
                    if (e != null) {
                        List<List<BaseImageDto>> list = e;
                        ArrayList arrayList2 = new ArrayList(c5g.u(list, 10));
                        Iterator<T> it = list.iterator();
                        while (it.hasNext()) {
                            List list2 = (List) it.next();
                            ((ne6) a.getValue()).getClass();
                            ImageSize Cb = ne6.a(list2).Cb(ImageScreenSize.VERY_SMALL.h(), true, false);
                            String str = Cb != null ? Cb.d.d : null;
                            if (str == null) {
                                str = "";
                            }
                            arrayList2.add(str);
                        }
                        emptyList = arrayList2;
                    } else {
                        emptyList = null;
                    }
                    if (emptyList == null) {
                        emptyList = EmptyList.b;
                    }
                    arrayList.add(new ClipsPlaylist(id, title, emptyList, shortVideoPlaylistFullDto.getCount(), shortVideoPlaylistFullDto.q(), z3, null, 64, null));
                }
                VKList vKList = new VKList(arrayList);
                vKList.n(shortVideoGetPlaylistsResponseDto.g());
                return vKList;
        }
    }

    public /* synthetic */ a720(boolean z) {
        this.c = z;
    }
}
