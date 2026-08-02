package xsna;

import com.vk.api.generated.base.dto.BaseImageDto;
import com.vk.api.generated.stickers.dto.StickersGetUGCPacksResponseDto;
import com.vk.api.generated.stickers.dto.StickersUgcPackDto;
import com.vk.api.generated.stickers.dto.StickersUgcPackEditDataDto;
import com.vk.api.generated.stickers.dto.StickersUgcStickerDto;
import com.vk.dto.common.id.UserId;
import com.vk.dto.common.im.Image;
import com.vk.dto.common.im.ImageList;
import com.vk.dto.stickers.ugc.UGCStickerModel;
import com.vk.dto.stickers.ugc.UgcStatus;
import com.vk.dto.stories.model.StoryPrivacyResponse;
import com.vk.profile.user.impl.ui.UserProfileFragment;
import com.vk.superapp.api.dto.story.WebStoryBox;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.TimeoutException;
import kotlin.Pair;
import org.json.JSONObject;
import xsna.asl0;
import xsna.ext;
import xsna.h6x0;
import xsna.xcw0;

/* compiled from: R8$$SyntheticClass */
/* loaded from: classes6.dex */
public final /* synthetic */ class zzl0 implements izs {
    public final /* synthetic */ int b;

    public /* synthetic */ zzl0(int i) {
        this.b = i;
    }

    @Override // xsna.izs
    public final Object invoke(Object obj) {
        Iterator it;
        StickersUgcPackDto stickersUgcPackDto;
        Iterator it2;
        ImageList imageList;
        switch (this.b) {
            case 0:
                Pair pair = (Pair) obj;
                b0m0 b0m0Var = new b0m0();
                WebStoryBox webStoryBox = (WebStoryBox) pair.i();
                return (epx.f(webStoryBox.b, "none") ? io.reactivex.rxjava3.core.q.T(webStoryBox) : b0m0Var.a(webStoryBox.d, webStoryBox.e).U(new si60(new ape0(webStoryBox, 11), 7))).L(new khc0(new q8i0(b0m0Var, 9), 6), false).U(new hkc0(new mnd(1, (Integer) pair.j()), 2));
            case 1:
                nf9.b.i(((Long) obj).longValue());
                return s3q0.a;
            case 2:
                return new Pair((StoryPrivacyResponse) obj, Boolean.FALSE);
            case 3:
                return s3q0.a;
            case 4:
                qgo0 qgo0Var = (qgo0) obj;
                Integer b = qgo0Var.b();
                if (b == null) {
                    return null;
                }
                int intValue = b.intValue();
                long j = qgo0Var.f;
                int i = qko0.c;
                return new ivl(((int) (j & 4294967295L)) - intValue, 0);
            case 5:
                sgi0<s3q0> sgi0Var = ngi0.B;
                s3q0 s3q0Var = s3q0.a;
                ((tgi0) obj).a(sgi0Var, s3q0Var);
                return s3q0Var;
            case 6:
                List<StickersUgcPackDto> d = ((StickersGetUGCPacksResponseDto) obj).d();
                int i2 = 10;
                ArrayList arrayList = new ArrayList(c5g.u(d, 10));
                Iterator it3 = d.iterator();
                while (it3.hasNext()) {
                    StickersUgcPackDto stickersUgcPackDto2 = (StickersUgcPackDto) it3.next();
                    UserId q = stickersUgcPackDto2.q();
                    long f = stickersUgcPackDto2.f();
                    List<StickersUgcStickerDto> g = stickersUgcPackDto2.g();
                    ArrayList arrayList2 = new ArrayList(c5g.u(g, i2));
                    Iterator it4 = g.iterator();
                    while (it4.hasNext()) {
                        StickersUgcStickerDto stickersUgcStickerDto = (StickersUgcStickerDto) it4.next();
                        UserId q2 = stickersUgcStickerDto.q();
                        long e = stickersUgcStickerDto.e();
                        Long g2 = stickersUgcStickerDto.g();
                        long longValue = g2 != null ? g2.longValue() : -1L;
                        List<BaseImageDto> f2 = stickersUgcStickerDto.f();
                        List<BaseImageDto> list = f2;
                        if (list == null || list.isEmpty()) {
                            it = it3;
                            stickersUgcPackDto = stickersUgcPackDto2;
                            it2 = it4;
                            imageList = null;
                        } else {
                            List<BaseImageDto> list2 = f2;
                            ArrayList arrayList3 = new ArrayList(c5g.u(list2, i2));
                            Iterator it5 = list2.iterator();
                            while (it5.hasNext()) {
                                BaseImageDto baseImageDto = (BaseImageDto) it5.next();
                                arrayList3.add(new Image(baseImageDto.getWidth(), baseImageDto.getHeight(), baseImageDto.getUrl(), epx.f(baseImageDto.e(), Boolean.TRUE)));
                                it5 = it5;
                                it3 = it3;
                                stickersUgcPackDto2 = stickersUgcPackDto2;
                                it4 = it4;
                            }
                            it = it3;
                            stickersUgcPackDto = stickersUgcPackDto2;
                            it2 = it4;
                            imageList = new ImageList(new ArrayList(arrayList3));
                        }
                        if (imageList == null) {
                            imageList = new ImageList(null, 1, null);
                        }
                        arrayList2.add(new UGCStickerModel(q2, e, longValue, imageList, epx.f(stickersUgcStickerDto.j(), Boolean.TRUE) ? UgcStatus.DELETED : stickersUgcStickerDto.i() == StickersUgcStickerDto.StatusDto.BANNED ? UgcStatus.BANNED : stickersUgcStickerDto.d() == StickersUgcStickerDto.ActiveRestrictionDto.AGE_18 ? UgcStatus.AGE_RESTRICTED : UgcStatus.OK, 0L, 32, null));
                        it3 = it;
                        stickersUgcPackDto2 = stickersUgcPackDto;
                        it4 = it2;
                        i2 = 10;
                    }
                    Iterator it6 = it3;
                    StickersUgcPackDto stickersUgcPackDto3 = stickersUgcPackDto2;
                    String e2 = stickersUgcPackDto3.e();
                    StickersUgcPackEditDataDto d2 = stickersUgcPackDto3.d();
                    arrayList.add(new ewp0(q, f, arrayList2, e2, d2 != null ? new iyp0(d2.e(), d2.f(), d2.d(), d2.g()) : null));
                    it3 = it6;
                    i2 = 10;
                }
                return arrayList;
            case 7:
                Throwable th = (Throwable) obj;
                int i3 = UserProfileFragment.p0;
                return th instanceof TimeoutException ? io.reactivex.rxjava3.core.x.k(asl0.b.a) : io.reactivex.rxjava3.core.x.i(th);
            case 8:
                return new pco(((sq2) obj).a);
            case 9:
                return ((ext.b) obj).a.u();
            case 10:
                return s3q0.a;
            case 11:
                com.vk.voip.ui.c cVar = com.vk.voip.ui.c.b;
                boolean z = ((xcw0.a) obj).a;
                cVar.getClass();
                com.vk.voip.ui.c.D0.b.a.a(z);
                return s3q0.a;
            case 12:
                return ((wj8) obj).c;
            case 13:
                return h6x0.d.a;
            default:
                return ((JSONObject) obj).getJSONObject("response");
        }
    }
}
