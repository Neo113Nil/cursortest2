package xsna;

import android.content.Context;
import android.net.Uri;
import com.vk.api.generated.ecosystem.dto.EcosystemGetMaxSessionStatusResponseDto;
import com.vk.api.generated.vmoji.dto.VmojiGetStickerPacksRecommendationBlockResponseDto;
import com.vk.catalog.mvi.block.video.impl.video.largelist.entity.VideoLargeListState;
import com.vk.catalog.mvi.section.ui.entity.CatalogBlockData;
import com.vk.catalog.mvi.section.ui.entity.CatalogSectionState;
import com.vk.core.serialize.Serializer;
import com.vk.core.view.components.cell.VkMiniInfoCell;
import com.vk.design.inspector.dsl.LegoStatus;
import com.vk.dto.common.ImageSize;
import com.vk.log.L;
import com.vk.music.stickyplayer.domain.PlayerUiMode;
import com.vk.reefton.Reef;
import com.vk.sharing.im_engine_impl.BaseSharingExternalActivity;
import com.vk.subscription.api.SubscribeStatus;
import com.vk.superapp.ui.SuperAppFragment;
import com.vk.superapp.views.SuperAppCriticalUiException;
import com.vk.video.ui.discovery.minimizable.dialog.about.VideoAboutFragment;
import com.vk.vmoji.character.model.RecommendationsBlockModel;
import java.util.List;
import java.util.concurrent.TimeoutException;
import java.util.concurrent.atomic.AtomicInteger;
import kotlin.collections.EmptyList;
import org.json.JSONObject;
import xsna.asl0;
import xsna.bs70;
import xsna.co20;
import xsna.k840;
import xsna.l5v0;
import xsna.pst;

/* compiled from: R8$$SyntheticClass */
/* loaded from: classes18.dex */
public final /* synthetic */ class t810 implements izs {
    public final /* synthetic */ int b;

    public /* synthetic */ t810(int i) {
        this.b = i;
    }

    @Override // xsna.izs
    public final Object invoke(Object obj) {
        switch (this.b) {
            case 0:
                return Boolean.valueOf(((y810) obj).C);
            case 1:
                EcosystemGetMaxSessionStatusResponseDto ecosystemGetMaxSessionStatusResponseDto = (EcosystemGetMaxSessionStatusResponseDto) obj;
                int e = ecosystemGetMaxSessionStatusResponseDto.e();
                return e != 0 ? e != 1 ? e != 2 ? e != 3 ? pst.a.a : pst.a.a : pst.b.a : new pst.d(ecosystemGetMaxSessionStatusResponseDto.d()) : pst.e.a;
            case 2:
                ((zak0) co20.i).setValue((co20.c) obj);
                return s3q0.a;
            case 3:
                JSONObject jSONObject = (JSONObject) obj;
                r5v0 r5v0Var = k840.a.h;
                (r5v0Var != null ? r5v0Var : null).b(v350.a);
                return jSONObject;
            case 4:
                ((BaseSharingExternalActivity) obj).finish();
                return s3q0.a;
            case 5:
                qgi0.r((tgi0) obj, "MusicPickerPreviewCellSnippetSubtitle");
                return s3q0.a;
            case 6:
                return Boolean.valueOf(((sy40) obj).b == PlayerUiMode.VK_MIX);
            case 7:
                return ((kb70) obj).getKey();
            case 8:
                bs70 bs70Var = (bs70) obj;
                bs70.a aVar = bs70Var instanceof bs70.a ? (bs70.a) bs70Var : null;
                if (aVar != null) {
                    return aVar.b;
                }
                return null;
            case 9:
                ((vgg) obj).c();
                return s3q0.a;
            case 10:
                return VideoLargeListState.a((VideoLargeListState) obj, null, false, false, null, null, null, false, null, null, null, null, null, null, null, null, null, null, null, 0, 67076095);
            case 11:
                AtomicInteger atomicInteger = Reef.i;
                Reef.a.a((Throwable) obj);
                return s3q0.a;
            case 12:
                CatalogSectionState catalogSectionState = (CatalogSectionState) obj;
                List<CatalogBlockData> list = catalogSectionState.k;
                if (list == null) {
                    list = catalogSectionState.d;
                }
                return CatalogSectionState.a(catalogSectionState, list, false, false, null, null, true, null, EmptyList.b, null, null, 6395);
            case 13:
                return ((com.vk.voip.ui.sessionrooms.f) obj).a;
            case 14:
                Throwable th = (Throwable) obj;
                return th instanceof TimeoutException ? io.reactivex.rxjava3.core.x.k(asl0.b.a) : io.reactivex.rxjava3.core.x.i(th);
            case 15:
                k9l0 k9l0Var = (k9l0) obj;
                return Integer.valueOf(k9l0Var.l + k9l0Var.g);
            case 16:
                qyg0 V0 = ((hyg0) obj).V0("DELETE FROM story_statistics_questions_meta");
                try {
                    V0.step();
                    V0.close();
                    return s3q0.a;
                } catch (Throwable th2) {
                    V0.close();
                    throw th2;
                }
            case 17:
                return s3q0.a;
            case 18:
                jmg0 jmg0Var = (jmg0) obj;
                bno bnoVar = new bno(jmg0Var, LegoStatus.Any);
                jmg0Var.a.add(bnoVar);
                int i = btm0.b;
                id3 id3Var = bnoVar.a;
                hd3.a(id3Var, i);
                hd3.b(id3Var, "✅");
                s3q0 s3q0Var = s3q0.a;
                w570 w570Var = new w570();
                jmg0Var.a.add(w570Var);
                int i2 = btm0.c;
                id3 id3Var2 = w570Var.a;
                hd3.a(id3Var2, i2);
                hd3.b(id3Var2, "⚠️");
                s3q0 s3q0Var2 = s3q0.a;
                return s3q0.a;
            case 19:
                int i3 = SuperAppFragment.o0;
                return new SuperAppCriticalUiException((Throwable) obj);
            case 20:
                VkMiniInfoCell vkMiniInfoCell = new VkMiniInfoCell((Context) obj, null, 6);
                vkMiniInfoCell.setMiddle(new VkMiniInfoCell.e(oq.d(tlo0.Companion, "This is a test [https://vk.com](https://vk.com) link"), false, false, false, true, null, 46));
                return vkMiniInfoCell;
            case 21:
                int i4 = VideoAboutFragment.S;
                qgi0.r((tgi0) obj, "close_tag");
                return s3q0.a;
            case 22:
                L.l(ms9.b("Observe overlay timings error: ", (Throwable) obj));
                return s3q0.a;
            case 23:
                return ((com.vk.video.ui.discovery.minimizable.q) obj).l;
            case 24:
                Uri parse = Uri.parse(((ImageSize) obj).d.d);
                return Boolean.valueOf(rhs.b().d(parse) || rhs.b().c(parse) || rhs.b().f(parse));
            case 25:
                SubscribeStatus.a aVar2 = SubscribeStatus.Companion;
                SubscribeStatus subscribeStatus = ((kym0) obj).a;
                aVar2.getClass();
                return Boolean.valueOf(SubscribeStatus.a.c(subscribeStatus));
            case 26:
                String str = ((wmu0) obj).b;
                return str == null ? "" : str;
            case 27:
                return new l5v0.a.b((xpp) obj);
            case 28:
                return s3q0.a;
            default:
                Serializer.c<RecommendationsBlockModel> cVar = RecommendationsBlockModel.CREATOR;
                return RecommendationsBlockModel.a.a((VmojiGetStickerPacksRecommendationBlockResponseDto) obj);
        }
    }
}
