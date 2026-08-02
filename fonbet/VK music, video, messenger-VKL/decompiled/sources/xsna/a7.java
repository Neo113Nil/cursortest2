package xsna;

import android.text.SpannableString;
import android.text.style.ForegroundColorSpan;
import com.vk.api.generated.photos.dto.PhotosGetAlbumsResponseDto;
import com.vk.api.generated.photos.dto.PhotosPhotoAlbumFullDto;
import com.vk.dto.common.id.UserId;
import com.vk.feed.core.models.news.NewsEntry;
import com.vk.libvideo.bottomsheet.about.delegate.n;
import com.vk.photos.root.photoflow.domain.AlbumsRepository;
import com.vk.tabbar.core.api.domain.TabbarItem;
import com.vk.tabbar.settings.impl.mvi.InteractSource;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import xsna.awn0;

/* compiled from: R8$$SyntheticClass */
/* loaded from: classes2.dex */
public final /* synthetic */ class a7 implements izs {
    public final /* synthetic */ int b;
    public final /* synthetic */ int c;
    public final /* synthetic */ Object d;
    public final /* synthetic */ Object e;

    public /* synthetic */ a7(Object obj, int i, Object obj2, int i2) {
        this.b = i2;
        this.d = obj;
        this.c = i;
        this.e = obj2;
    }

    @Override // xsna.izs
    public final Object invoke(Object obj) {
        Object obj2;
        switch (this.b) {
            case 0:
                n.a aVar = (n.a) this.d;
                Integer num = (Integer) this.e;
                zk10 zk10Var = (zk10) obj;
                int h6 = n.a.h6(zk10Var.getValue());
                if (h6 < 0 || h6 >= this.c) {
                    return zk10Var.getValue();
                }
                String value = zk10Var.getValue();
                SpannableString spannableString = new SpannableString(value);
                spannableString.setSpan(new com.vk.libvideo.bottomsheet.about.delegate.m(aVar, value), 0, spannableString.length(), 0);
                if (num == null) {
                    return spannableString;
                }
                spannableString.setSpan(new ForegroundColorSpan(num.intValue()), 0, spannableString.length(), 0);
                return spannableString;
            case 1:
                up1 up1Var = (up1) this.d;
                UserId userId = (UserId) this.e;
                Iterator<T> it = ((PhotosGetAlbumsResponseDto) obj).d().iterator();
                while (true) {
                    if (it.hasNext()) {
                        obj2 = it.next();
                        PhotosPhotoAlbumFullDto photosPhotoAlbumFullDto = (PhotosPhotoAlbumFullDto) obj2;
                        if (photosPhotoAlbumFullDto.getId() != this.c || !epx.f(photosPhotoAlbumFullDto.q(), userId)) {
                        }
                    } else {
                        obj2 = null;
                    }
                }
                PhotosPhotoAlbumFullDto photosPhotoAlbumFullDto2 = (PhotosPhotoAlbumFullDto) obj2;
                if (photosPhotoAlbumFullDto2 == null) {
                    throw new AlbumsRepository.PermissionException();
                }
                ((tfa0) up1Var.c.getValue()).getClass();
                return tfa0.a(photosPhotoAlbumFullDto2);
            case 2:
                NewsEntry newsEntry = (NewsEntry) this.d;
                wzs wzsVar = (wzs) this.e;
                u1c0 u1c0Var = (u1c0) obj;
                NewsEntry newsEntry2 = u1c0Var.b;
                NewsEntry newsEntry3 = u1c0Var.a;
                NewsEntry newsEntry4 = epx.f(newsEntry2, newsEntry) ? newsEntry : u1c0Var.b;
                if (!epx.f(newsEntry3, newsEntry)) {
                    newsEntry = newsEntry3;
                }
                u1c0 b = lbs.b(u1c0Var, newsEntry, newsEntry4, this.c);
                wzsVar.invoke(b, newsEntry);
                return b;
            default:
                nvn0 nvn0Var = (nvn0) this.d;
                ArrayList arrayList = nvn0Var.j;
                InteractSource interactSource = (InteractSource) this.e;
                List list = (List) obj;
                ArrayList W = nvn0Var.W(list, interactSource == InteractSource.USER_INTERACT_WITH_BOTTOM_PANEL);
                String d = ((TabbarItem) arrayList.get(nvn0Var.k)).d();
                int i = nvn0Var.k;
                boolean z = nvn0Var.l;
                boolean z2 = !epx.f(nvn0Var.h.h(), arrayList);
                ArrayList b2 = nvn0Var.i.b();
                ArrayList arrayList2 = new ArrayList();
                Iterator it2 = b2.iterator();
                while (it2.hasNext()) {
                    xvn0 Z = nvn0Var.Z((wvn0) it2.next(), W, list);
                    if (Z != null) {
                        arrayList2.add(Z);
                    }
                }
                nvn0Var.T(new awn0.a(d, this.c, i, z, W, z2, arrayList2, interactSource));
                return s3q0.a;
        }
    }

    public /* synthetic */ a7(nvn0 nvn0Var, InteractSource interactSource, int i) {
        this.b = 3;
        this.d = nvn0Var;
        this.e = interactSource;
        this.c = i;
    }
}
