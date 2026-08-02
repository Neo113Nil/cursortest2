package xsna;

import com.vk.api.generated.base.dto.BaseUploadServerDto;
import com.vk.api.generated.calls.dto.CallsStartResponseDto;
import com.vk.api.generated.stickers.dto.StickersBonusBalanceDto;
import com.vk.api.generated.stickers.dto.StickersBonusRewardDto;
import com.vk.api.generated.store.dto.StoreGetStickersBonusRewardsCatalogResponseDto;
import com.vk.catalog2.common.dto.api.ui.UIBlock;
import com.vk.catalog2.common.dto.ui.UIBlockCatalog;
import com.vk.catalog2.common.dto.ui.UIBlockList;
import com.vk.core.serialize.Serializer;
import com.vk.dto.common.VideoFile;
import com.vk.dto.group.Group;
import com.vk.dto.music.Genre;
import com.vk.dto.stickers.bonus.StickersBonusBalance;
import com.vk.dto.stickers.bonus.StickersBonusReward;
import com.vk.dto.stickers.bonus.StickersBonusRewardsCatalog;
import com.vk.dto.user.UserProfile;
import com.vk.ecomm.storefrontservices.impl.presentation.feature.LoadingState;
import com.vk.log.L;
import com.vk.newsfeed.impl.postmodal.reactions.tabs.all.b;
import com.vk.newsfeed.posting.impl.presentation.model.PostingPollDto;
import com.vk.newsfeed.posting.poll_editor.domain.model.PollEditorState;
import com.vk.voip.api.id.CallId;
import java.util.ArrayList;
import java.util.List;
import kotlin.NoWhenBranchMatchedException;
import kotlin.Pair;
import kotlin.collections.EmptyList;
import ru.ok.android.webrtc.stat.call.methods.call_stat.IncomingVideoStatistics;
import ru.ok.android.webrtc.stat.rtc.Ssrc;
import xsna.ef00;
import xsna.hv70;
import xsna.jhw0;
import xsna.kx00;
import xsna.u6x;

/* compiled from: R8$$SyntheticClass */
/* loaded from: classes9.dex */
public final /* synthetic */ class zsw implements izs {
    public final /* synthetic */ int b;

    public /* synthetic */ zsw(int i) {
        this.b = i;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:107:0x02aa  */
    /* JADX WARN: Removed duplicated region for block: B:93:0x02a0  */
    /* JADX WARN: Removed duplicated region for block: B:96:0x02b9  */
    /* JADX WARN: Type inference failed for: r2v20, types: [kotlin.collections.EmptyList] */
    @Override // xsna.izs
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object invoke(Object obj) {
        ef00.b fVar;
        ef00.b eVar;
        boolean z;
        ArrayList arrayList;
        StickersBonusBalance stickersBonusBalance;
        String str;
        switch (this.b) {
            case 0:
                return IncomingVideoStatistics.a((Ssrc.VideoRecv) obj);
            case 1:
                return Boolean.valueOf(((u6x.b) obj).e() == null);
            case 2:
                qgi0.r((tgi0) obj, "SEARCH_FIELD_VOICE");
                return s3q0.a;
            case 3:
                jhw0 jhw0Var = (jhw0) obj;
                boolean isVisible = jhw0Var.isVisible();
                boolean isEnabled = jhw0Var.isEnabled();
                if (jhw0Var instanceof jhw0.c) {
                    eVar = ef00.b.C2804b.a;
                } else {
                    if (!(jhw0Var instanceof jhw0.e)) {
                        if (!(jhw0Var instanceof jhw0.b)) {
                            throw new NoWhenBranchMatchedException();
                        }
                        jhw0.b bVar = (jhw0.b) jhw0Var;
                        jhw0.f fVar2 = bVar.d;
                        jhw0.a aVar = bVar.e;
                        if (aVar instanceof jhw0.a.c) {
                            fVar = new ef00.b.d(((jhw0.a.c) aVar).a);
                        } else if (aVar instanceof jhw0.a.b) {
                            fVar = new ef00.b.c(((jhw0.a.b) aVar).a);
                        } else if (aVar instanceof jhw0.a.f) {
                            fVar = new ef00.b.h(((jhw0.a.f) aVar).a);
                        } else if (aVar instanceof jhw0.a.e) {
                            jhw0.a.e eVar2 = (jhw0.a.e) aVar;
                            fVar = new ef00.b.g(eVar2.a, epx.f(fVar2, jhw0.f.d.a), epx.f(fVar2, jhw0.f.c.a), eVar2.b);
                        } else if (aVar instanceof jhw0.a.C3120a) {
                            fVar = new ef00.b.a(((jhw0.a.C3120a) aVar).a);
                        } else {
                            if (!(aVar instanceof jhw0.a.d)) {
                                throw new NoWhenBranchMatchedException();
                            }
                            jhw0.a.d dVar = (jhw0.a.d) aVar;
                            fVar = new ef00.b.f(dVar.b, dVar.c);
                        }
                        jhw0.f c = jhw0Var.c();
                        ef00.a bVar2 = !(c instanceof jhw0.f.b) ? new ef00.a.b(((jhw0.f.b) c).a) : c instanceof jhw0.f.a ? ef00.a.C2803a.a : ef00.a.c.a;
                        z = jhw0Var instanceof jhw0.b;
                        ef00.c cVar = ef00.c.a.a;
                        if (z) {
                            jhw0.b bVar3 = (jhw0.b) jhw0Var;
                            int size = bVar3.g.size();
                            jhw0.d dVar2 = bVar3.f;
                            if (dVar2 instanceof jhw0.d.C3121d) {
                                ((jhw0.d.C3121d) dVar2).getClass();
                                cVar = new ef00.c.C2805c();
                            } else if (dVar2 instanceof jhw0.d.e) {
                                cVar = new ef00.c.b(size == 0);
                            }
                        }
                        return new ef00(fVar, bVar2, cVar, isVisible, isEnabled);
                    }
                    eVar = new ef00.b.e(((jhw0.e) jhw0Var).f);
                }
                fVar = eVar;
                jhw0.f c2 = jhw0Var.c();
                if (!(c2 instanceof jhw0.f.b)) {
                }
                z = jhw0Var instanceof jhw0.b;
                ef00.c cVar2 = ef00.c.a.a;
                if (z) {
                }
                return new ef00(fVar, bVar2, cVar2, isVisible, isEnabled);
            case 4:
                return Boolean.valueOf(((kx00.a) ((kx00) obj)).h);
            case 5:
                return Boolean.valueOf(((k110) obj).e);
            case 6:
                BaseUploadServerDto baseUploadServerDto = (BaseUploadServerDto) obj;
                return new ncq0(baseUploadServerDto.e(), baseUploadServerDto.d(), null, null, null, 28);
            case 7:
                return s3q0.a;
            case 8:
                ((vak0) co20.n).g(((Float) obj).floatValue());
                return s3q0.a;
            case 9:
                return b.C1397b.a;
            case 10:
                return ((Genre) obj).c;
            case 11:
                return ((hv70.c) obj).a;
            case 12:
                return Boolean.valueOf(((sy40) obj).e.e);
            case 13:
                PollEditorState pollEditorState = (PollEditorState) obj;
                return pollEditorState instanceof PollEditorState.Editing ? ((PollEditorState.Editing) pollEditorState).e : new PostingPollDto(0, null, null, null, false, false, false, false, 0L, false, false, 2047, null);
            case 14:
                return Boolean.valueOf(((VideoFile) obj).c0());
            case 15:
                L.i((Throwable) obj);
                return s3q0.a;
            case 16:
                return new UserProfile((Group) obj);
            case 17:
                CallsStartResponseDto callsStartResponseDto = (CallsStartResponseDto) obj;
                String d = callsStartResponseDto.d();
                if (d == null) {
                    d = "";
                }
                return new Pair(new CallId(d), callsStartResponseDto.e());
            case 18:
                return ((kym0) obj).a;
            case 19:
                return s3q0.a;
            case 20:
                return rl3.u0((Object[]) obj);
            case 21:
                StoreGetStickersBonusRewardsCatalogResponseDto storeGetStickersBonusRewardsCatalogResponseDto = (StoreGetStickersBonusRewardsCatalogResponseDto) obj;
                boolean f = epx.f(storeGetStickersBonusRewardsCatalogResponseDto.i(), Boolean.TRUE);
                List<StickersBonusRewardDto> f2 = storeGetStickersBonusRewardsCatalogResponseDto.f();
                if (f2 == null) {
                    arrayList = EmptyList.b;
                } else {
                    List<StickersBonusRewardDto> list = f2;
                    ArrayList arrayList2 = new ArrayList(c5g.u(list, 10));
                    for (StickersBonusRewardDto stickersBonusRewardDto : list) {
                        arrayList2.add(new StickersBonusReward(stickersBonusRewardDto.getId(), stickersBonusRewardDto.f(), stickersBonusRewardDto.getDescription(), stickersBonusRewardDto.g(), u8l0.a(stickersBonusRewardDto.e()), stickersBonusRewardDto.i(), epx.f(stickersBonusRewardDto.d(), Boolean.TRUE)));
                    }
                    arrayList = arrayList2;
                }
                StickersBonusBalanceDto d2 = storeGetStickersBonusRewardsCatalogResponseDto.d();
                if (d2 == null) {
                    stickersBonusBalance = new StickersBonusBalance(0, null, null, 0, null);
                } else {
                    stickersBonusBalance = new StickersBonusBalance(d2.i(), d2.d() != null ? Long.valueOf(r3.intValue() * 1000) : null, d2.e(), d2.g(), d2.f());
                }
                return new StickersBonusRewardsCatalog(f, arrayList, stickersBonusBalance, u8l0.b(storeGetStickersBonusRewardsCatalogResponseDto.g()), epx.f(storeGetStickersBonusRewardsCatalogResponseDto.e(), Boolean.TRUE));
            case 22:
                return mol0.a((mol0) obj, null, null, null, null, null, LoadingState.Page, 191);
            case 23:
                return s3q0.a;
            case 24:
                return s3q0.a;
            case 25:
                return s3q0.a;
            case 26:
                qgi0.u((tgi0) obj);
                return s3q0.a;
            case 27:
                int i = xpp0.l1;
                qgi0.r((tgi0) obj, "TrendingHashtagModalButtonAddTestTag");
                return s3q0.a;
            case 28:
                UIBlock uIBlock = (UIBlock) obj;
                Serializer.c<UIBlockCatalog> cVar3 = UIBlockCatalog.CREATOR;
                UIBlockList uIBlockList = uIBlock instanceof UIBlockList ? (UIBlockList) uIBlock : null;
                return (uIBlockList == null || (str = uIBlockList.z) == null) ? uIBlock.toString() : str;
            default:
                L.i((Throwable) obj);
                return s3q0.a;
        }
    }

    public /* synthetic */ zsw(Object obj, int i) {
        this.b = i;
    }
}
