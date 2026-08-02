package xsna;

import com.vk.api.generated.catalog.dto.CatalogBlockDto;
import com.vk.api.generated.catalog.dto.CatalogPinnedVideosItemDto;
import com.vk.api.generated.catalog.dto.CatalogStatInfoItemDto;
import com.vk.api.generated.groups.dto.GroupsGroupFullDto;
import com.vk.api.generated.users.dto.UsersUserFullDto;
import com.vk.api.generated.video.dto.VideoVideoFullDto;
import com.vk.catalog.mvi.block.BlockId;
import com.vk.catalog.mvi.block.video.impl.video.largelist.entity.VideoLargeListState;
import com.vk.catalog.mvi.dto.CatalogExtraResponseObjectDto;
import com.vk.catalog.mvi.register.CatalogBlockVariant;
import com.vk.donut.video.model.presentation.cardsize.DonutVideoCardSource;
import com.vk.donut.video.model.presentation.video.DonutVideoUiModel;
import com.vk.dto.common.VideoFile;
import com.vk.dto.common.id.UserId;
import com.vk.libvideo.author.VideoPinType;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import kotlin.collections.EmptyList;

/* compiled from: R8$$SyntheticClass */
/* loaded from: classes.dex */
public final /* synthetic */ class lrs0 implements f2a {
    public final /* synthetic */ boolean a;
    public final /* synthetic */ l5o b;
    public final /* synthetic */ g7s0 c;

    public /* synthetic */ lrs0(l5o l5oVar, g7s0 g7s0Var, boolean z) {
        this.a = z;
        this.b = l5oVar;
        this.c = g7s0Var;
    }

    /* JADX WARN: Removed duplicated region for block: B:32:0x00ab  */
    /* JADX WARN: Removed duplicated region for block: B:44:0x00df  */
    /* JADX WARN: Removed duplicated region for block: B:47:0x00fb  */
    @Override // xsna.f2a
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final List a(CatalogExtraResponseObjectDto catalogExtraResponseObjectDto, CatalogBlockDto catalogBlockDto, CatalogBlockVariant catalogBlockVariant) {
        Object obj;
        String str;
        List<CatalogPinnedVideosItemDto> X1;
        VideoPinType videoPinType;
        VideoFile videoFile;
        Object obj2;
        CatalogPinnedVideosItemDto.PinTypeDto d;
        Object obj3;
        List<UsersUserFullDto> n = catalogExtraResponseObjectDto.n();
        List<GroupsGroupFullDto> g = catalogExtraResponseObjectDto.g();
        List<String> f3 = catalogBlockDto.f3();
        if (f3 == null) {
            return EmptyList.b;
        }
        ArrayList arrayList = new ArrayList();
        for (String str2 : f3) {
            List<VideoVideoFullDto> p = catalogExtraResponseObjectDto.p();
            VideoLargeListState videoLargeListState = null;
            if (p != null) {
                Iterator<T> it = p.iterator();
                while (true) {
                    if (!it.hasNext()) {
                        obj = null;
                        break;
                    }
                    obj = it.next();
                    VideoVideoFullDto videoVideoFullDto = (VideoVideoFullDto) obj;
                    StringBuilder sb = new StringBuilder();
                    UserId q = videoVideoFullDto.q();
                    sb.append(q != null ? Long.valueOf(q.b) : null);
                    sb.append('_');
                    sb.append(videoVideoFullDto.s1());
                    if (epx.f(str2, sb.toString())) {
                        break;
                    }
                }
                VideoVideoFullDto videoVideoFullDto2 = (VideoVideoFullDto) obj;
                if (videoVideoFullDto2 != null) {
                    List<CatalogStatInfoItemDto> M2 = catalogBlockDto.M2();
                    if (M2 != null) {
                        Iterator<T> it2 = M2.iterator();
                        while (true) {
                            if (!it2.hasNext()) {
                                obj3 = null;
                                break;
                            }
                            obj3 = it2.next();
                            if (epx.f(((CatalogStatInfoItemDto) obj3).d(), str2)) {
                                break;
                            }
                        }
                        CatalogStatInfoItemDto catalogStatInfoItemDto = (CatalogStatInfoItemDto) obj3;
                        if (catalogStatInfoItemDto != null) {
                            str = catalogStatInfoItemDto.r();
                            X1 = catalogBlockDto.X1();
                            if (X1 != null) {
                                Iterator<T> it3 = X1.iterator();
                                while (true) {
                                    if (!it3.hasNext()) {
                                        obj2 = null;
                                        break;
                                    }
                                    obj2 = it3.next();
                                    if (epx.f(((CatalogPinnedVideosItemDto) obj2).e(), str2)) {
                                        break;
                                    }
                                }
                                CatalogPinnedVideosItemDto catalogPinnedVideosItemDto = (CatalogPinnedVideosItemDto) obj2;
                                if (catalogPinnedVideosItemDto != null && (d = catalogPinnedVideosItemDto.d()) != null) {
                                    videoPinType = k3t0.a(d);
                                    if (str != null) {
                                        videoVideoFullDto2 = VideoVideoFullDto.a(videoVideoFullDto2, str);
                                    }
                                    videoFile = (VideoFile) j5g.a0(ums0.e(ums0.a, Collections.singletonList(videoVideoFullDto2), n, g, this.a, 20));
                                    if (videoFile != null) {
                                        BlockId.CompositeId c = com.vk.catalog.mvi.block.a.c(catalogBlockDto.getId(), videoFile.r1());
                                        DonutVideoUiModel a = this.b.a(nkt0.a(videoFile), DonutVideoCardSource.LARGE_CARD);
                                        String url = catalogBlockDto.getUrl();
                                        if (url == null) {
                                            url = "";
                                        }
                                        videoLargeListState = new VideoLargeListState(c, catalogBlockVariant, videoFile, url, str, a, videoPinType, true, false, false, null, null, null, false, null, null, null, null, null, null, null, null, null, null, null, 0, 67108608, null);
                                    }
                                }
                            }
                            videoPinType = null;
                            if (str != null) {
                            }
                            videoFile = (VideoFile) j5g.a0(ums0.e(ums0.a, Collections.singletonList(videoVideoFullDto2), n, g, this.a, 20));
                            if (videoFile != null) {
                            }
                        }
                    }
                    str = null;
                    X1 = catalogBlockDto.X1();
                    if (X1 != null) {
                    }
                    videoPinType = null;
                    if (str != null) {
                    }
                    videoFile = (VideoFile) j5g.a0(ums0.e(ums0.a, Collections.singletonList(videoVideoFullDto2), n, g, this.a, 20));
                    if (videoFile != null) {
                    }
                }
            }
            if (videoLargeListState != null) {
                arrayList.add(videoLargeListState);
            }
        }
        return arrayList;
    }
}
