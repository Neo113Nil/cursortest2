package xsna;

import com.unity3d.services.UnityAdsConstants;
import com.vk.api.generated.base.dto.BaseUserGroupFieldsDto;
import com.vk.dto.attaches.AttachDisplayConfig;
import com.vk.dto.attaches.AttachmentsArrangementConfig;
import com.vk.dto.attaches.CarouselRatio;
import java.util.ArrayList;
import java.util.Collections;
import java.util.LinkedHashMap;
import java.util.List;
import kotlin.Pair;

/* compiled from: PostingRepositoryImpl.kt */
/* loaded from: classes2.dex */
public final class elc0 implements clc0 {
    public static final List<BaseUserGroupFieldsDto> c = e43.l(BaseUserGroupFieldsDto.SEX, BaseUserGroupFieldsDto.VIDEO_FILES, BaseUserGroupFieldsDto.TRENDING, BaseUserGroupFieldsDto.VERIFIED, BaseUserGroupFieldsDto.IS_FAVORITE, BaseUserGroupFieldsDto.EMOJI_STATUS, BaseUserGroupFieldsDto.IMAGE_STATUS, BaseUserGroupFieldsDto.CAN_WRITE_PRIVATE_MESSAGE, BaseUserGroupFieldsDto.CAN_MESSAGE, BaseUserGroupFieldsDto.HAS_UNSEEN_STORIES, BaseUserGroupFieldsDto.IS_GOVERNMENT_ORGANIZATION, BaseUserGroupFieldsDto.IS_NFT, BaseUserGroupFieldsDto.IS_NFT_PHOTO, BaseUserGroupFieldsDto.PHOTO_BASE, BaseUserGroupFieldsDto.URL);
    public final bpn0 a = new bpn0(new d2(28));
    public final bpn0 b = new bpn0(new w2a0(4));

    public elc0(max0 max0Var) {
    }

    public static List b() {
        return e43.l("full", "compact");
    }

    public static ArrayList d(gzs gzsVar) {
        Iterable<Pair> iterable = (Iterable) gzsVar.invoke();
        ArrayList arrayList = new ArrayList(c5g.u(iterable, 10));
        for (Pair pair : iterable) {
            arrayList.add(new AttachDisplayConfig((String) pair.i(), (List) pair.j()));
        }
        return arrayList;
    }

    @Override // xsna.clc0
    public final io.reactivex.rxjava3.internal.operators.observable.m1 a() {
        io.reactivex.rxjava3.internal.operators.observable.s0 s0Var = new io.reactivex.rxjava3.internal.operators.observable.s0(new dlc0(this, 0));
        asu0 asu0Var = asu0.a;
        return s0Var.r0(asu0Var.c()).L(new je40(new r8a0(this, 6), 7), false).a0(asu0Var.d());
    }

    public final AttachmentsArrangementConfig c() {
        List singletonList = Collections.singletonList(d(new d14(24)));
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        for (String str : e43.l("video", "album", "photo", "market_album", "document_image")) {
            linkedHashMap.put(str, new AttachDisplayConfig(str, Collections.singletonList("full")));
        }
        return new AttachmentsArrangementConfig(-1L, singletonList, linkedHashMap, d(new xs6(this)), new CarouselRatio(UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, 3, null));
    }
}
