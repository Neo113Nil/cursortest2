package xsna;

import android.graphics.RectF;
import com.vk.api.generated.base.dto.BaseUserGroupFieldsDto;
import com.vk.api.generated.narratives.dto.NarrativesBatchEditInputDto;
import com.vk.api.generated.narratives.dto.NarrativesCreateResponseDto;
import com.vk.api.generated.narratives.dto.NarrativesEditResponseDto;
import com.vk.api.generated.narratives.dto.NarrativesGetByIdResponseDto;
import com.vk.api.generated.narratives.dto.NarrativesGetFromOwnerResponseDto;
import com.vk.dto.common.data.VKList;
import com.vk.dto.common.id.UserId;
import com.vk.dto.narratives.Narrative;
import com.vk.dto.photo.Photo;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import kotlin.NoWhenBranchMatchedException;
import kotlin.jvm.internal.FunctionReferenceImpl;
import ru.ok.android.webrtc.signaling.api.SignalingProtocol;
import xsna.us80;

/* compiled from: NarrativeRepositoryImpl.kt */
/* loaded from: classes3.dex */
public final class ru50 implements ou50 {
    public final pq3 a = new pq3();
    public final bpn0 b = new bpn0(new iz3(16));

    /* compiled from: NarrativeRepositoryImpl.kt */
    public static final /* synthetic */ class a extends FunctionReferenceImpl implements izs<NarrativesCreateResponseDto, Narrative> {
        @Override // xsna.izs
        public final Narrative invoke(NarrativesCreateResponseDto narrativesCreateResponseDto) {
            NarrativesCreateResponseDto narrativesCreateResponseDto2 = narrativesCreateResponseDto;
            ((xu50) this.receiver).getClass();
            return xu50.a(narrativesCreateResponseDto2.e(), narrativesCreateResponseDto2.f(), narrativesCreateResponseDto2.d());
        }
    }

    /* compiled from: NarrativeRepositoryImpl.kt */
    public static final /* synthetic */ class b extends FunctionReferenceImpl implements izs<NarrativesEditResponseDto, Narrative> {
        @Override // xsna.izs
        public final Narrative invoke(NarrativesEditResponseDto narrativesEditResponseDto) {
            NarrativesEditResponseDto narrativesEditResponseDto2 = narrativesEditResponseDto;
            ((xu50) this.receiver).getClass();
            return xu50.a(narrativesEditResponseDto2.e(), narrativesEditResponseDto2.f(), narrativesEditResponseDto2.d());
        }
    }

    /* compiled from: NarrativeRepositoryImpl.kt */
    public static final /* synthetic */ class c extends FunctionReferenceImpl implements izs<NarrativesGetByIdResponseDto, VKList<Narrative>> {
        @Override // xsna.izs
        public final VKList<Narrative> invoke(NarrativesGetByIdResponseDto narrativesGetByIdResponseDto) {
            NarrativesGetByIdResponseDto narrativesGetByIdResponseDto2 = narrativesGetByIdResponseDto;
            ((xu50) this.receiver).getClass();
            VKList<Narrative> vKList = new VKList<>(xu50.b(narrativesGetByIdResponseDto2.f(), narrativesGetByIdResponseDto2.d(), narrativesGetByIdResponseDto2.e()));
            vKList.o(narrativesGetByIdResponseDto2.getCount());
            return vKList;
        }
    }

    /* compiled from: NarrativeRepositoryImpl.kt */
    public static final /* synthetic */ class d extends FunctionReferenceImpl implements izs<NarrativesGetFromOwnerResponseDto, VKList<Narrative>> {
        @Override // xsna.izs
        public final VKList<Narrative> invoke(NarrativesGetFromOwnerResponseDto narrativesGetFromOwnerResponseDto) {
            NarrativesGetFromOwnerResponseDto narrativesGetFromOwnerResponseDto2 = narrativesGetFromOwnerResponseDto;
            ((xu50) this.receiver).getClass();
            VKList<Narrative> vKList = new VKList<>(xu50.b(narrativesGetFromOwnerResponseDto2.g(), narrativesGetFromOwnerResponseDto2.d(), narrativesGetFromOwnerResponseDto2.e()));
            vKList.o(narrativesGetFromOwnerResponseDto2.getCount());
            vKList.n(narrativesGetFromOwnerResponseDto2.f());
            return vKList;
        }
    }

    @Override // xsna.ou50
    public final io.reactivex.rxjava3.core.x a(int i, UserId userId, String str) {
        StringBuilder sb = new StringBuilder();
        sb.append(userId.b);
        sb.append('_');
        sb.append(i);
        return rsg0.w0(yfb.x(pq3.j(this.a, Collections.singletonList(sb.toString()), Collections.singletonList(BaseUserGroupFieldsDto.PHOTO_BASE), str, 16))).l(new qu50(new c(1, (xu50) this.b.getValue(), xu50.class, "parseNarrativesList", "parseNarrativesList(Lcom/vk/api/generated/narratives/dto/NarrativesGetByIdResponseDto;)Lcom/vk/dto/common/data/VKList;", 0), 0));
    }

    @Override // xsna.ou50
    public final io.reactivex.rxjava3.core.q b(int i, UserId userId, String str, boolean z) {
        Integer valueOf = Integer.valueOf(i);
        Boolean valueOf2 = Boolean.valueOf(z);
        List singletonList = Collections.singletonList(BaseUserGroupFieldsDto.PHOTO_BASE);
        this.a.getClass();
        tfx tfxVar = new tfx("narratives.getFromOwner", new pn(26), new mr(27));
        tfx.n(tfxVar, "owner_id", userId, 0L, 0L, 12);
        if (str != null) {
            tfx.o(tfxVar, "start_from", str, 0, 0, 12);
        }
        tfxVar.f(valueOf.intValue(), 0, 200, SignalingProtocol.KEY_LIMIT);
        tfxVar.j("with_empty", valueOf2.booleanValue());
        List list = singletonList;
        ArrayList arrayList = new ArrayList(c5g.u(list, 10));
        Iterator it = list.iterator();
        while (it.hasNext()) {
            arrayList.add(((BaseUserGroupFieldsDto) it.next()).i());
        }
        tfxVar.i("fields", arrayList);
        tfxVar.j("extended", true);
        return rsg0.y0(yfb.x(tfxVar), null, null, 3).U(new pu50(new d(1, (xu50) this.b.getValue(), xu50.class, "parseNarrativesList", "parseNarrativesList(Lcom/vk/api/generated/narratives/dto/NarrativesGetFromOwnerResponseDto;)Lcom/vk/dto/common/data/VKList;", 0), 0));
    }

    @Override // xsna.ou50
    public final io.reactivex.rxjava3.core.x<Narrative> c(UserId userId, String str, Collection<Integer> collection, ju50 ju50Var) {
        RectF rectF = ju50Var.a;
        List O0 = j5g.O0(collection);
        if (O0.isEmpty()) {
            O0 = null;
        }
        Integer num = ju50Var.b;
        Integer num2 = ju50Var.c;
        Float valueOf = rectF != null ? Float.valueOf(rectF.left) : null;
        Float valueOf2 = rectF != null ? Float.valueOf(rectF.top) : null;
        Float valueOf3 = rectF != null ? Float.valueOf(rectF.height()) : null;
        Float valueOf4 = rectF != null ? Float.valueOf(rectF.width()) : null;
        this.a.getClass();
        tfx tfxVar = new tfx("narratives.create", new ir(29), new jr(23));
        tfx.n(tfxVar, "owner_id", userId, 0L, 0L, 12);
        if (str != null) {
            tfx.o(tfxVar, "title", str, 0, 0, 12);
        }
        if (num != null) {
            tfx.l(tfxVar, "cover_story_id", num.intValue(), 0, 0, 8);
        }
        if (num2 != null) {
            tfx.l(tfxVar, "custom_cover_photo_id", num2.intValue(), 0, 0, 8);
        }
        if (valueOf != null) {
            tfxVar.h("crop_x", valueOf.floatValue(), -1.7976931348623157E308d, Double.MAX_VALUE);
        }
        if (valueOf2 != null) {
            tfxVar.h("crop_y", valueOf2.floatValue(), -1.7976931348623157E308d, Double.MAX_VALUE);
        }
        if (valueOf4 != null) {
            tfxVar.h("crop_width", valueOf4.floatValue(), -1.7976931348623157E308d, Double.MAX_VALUE);
        }
        if (valueOf3 != null) {
            tfxVar.h("crop_height", valueOf3.floatValue(), -1.7976931348623157E308d, Double.MAX_VALUE);
        }
        if (O0 != null) {
            tfxVar.i("story_ids", O0);
        }
        tfxVar.j("extended", true);
        return rsg0.w0(yfb.x(tfxVar)).l(new sj4(new a(1, (xu50) this.b.getValue(), xu50.class, "parseNarrative", "parseNarrative(Lcom/vk/api/generated/narratives/dto/NarrativesCreateResponseDto;)Lcom/vk/dto/narratives/Narrative;", 0), 22));
    }

    @Override // xsna.ou50
    public final io.reactivex.rxjava3.core.x<Narrative> d(UserId userId, int i, String str, Iterable<Integer> iterable, ju50 ju50Var) {
        RectF rectF = ju50Var.a;
        List O0 = j5g.O0(iterable);
        List list = !O0.isEmpty() ? O0 : null;
        Integer num = ju50Var.b;
        Integer num2 = ju50Var.c;
        Float valueOf = rectF != null ? Float.valueOf(rectF.left) : null;
        Float valueOf2 = rectF != null ? Float.valueOf(rectF.top) : null;
        Float valueOf3 = rectF != null ? Float.valueOf(rectF.height()) : null;
        return rsg0.w0(yfb.x(pq3.i(this.a, userId, i, str, list, num, num2, valueOf, valueOf2, rectF != null ? Float.valueOf(rectF.width()) : null, valueOf3, 2048))).l(new yh1(new b(1, (xu50) this.b.getValue(), xu50.class, "parseNarrative", "parseNarrative(Lcom/vk/api/generated/narratives/dto/NarrativesEditResponseDto;)Lcom/vk/dto/narratives/Narrative;", 0), 29));
    }

    @Override // xsna.ou50
    public final io.reactivex.rxjava3.core.q<Photo> e(String str) {
        this.a.getClass();
        tfx tfxVar = new tfx("narratives.saveCustomCover", new en(29), new wd10(4));
        tfx.o(tfxVar, "response_json", str, 0, 0, 12);
        return rsg0.a0(yfb.x(tfxVar)).L(new b9(new sux(7), 25), false).U(new d9(new n9w(10), 26));
    }

    @Override // xsna.ou50
    public final io.reactivex.rxjava3.core.x<s3q0> f(UserId userId, Iterable<? extends us80> iterable) {
        NarrativesBatchEditInputDto narrativesBatchEditInputDto;
        ArrayList arrayList = new ArrayList(c5g.u(iterable, 10));
        for (us80 us80Var : iterable) {
            if (us80Var instanceof us80.a) {
                us80.a aVar = (us80.a) us80Var;
                narrativesBatchEditInputDto = new NarrativesBatchEditInputDto(NarrativesBatchEditInputDto.OpDto.ADD, Integer.valueOf(aVar.a), Integer.valueOf(aVar.b), null, null, 24, null);
            } else if (us80Var instanceof us80.b) {
                narrativesBatchEditInputDto = new NarrativesBatchEditInputDto(NarrativesBatchEditInputDto.OpDto.DELETE_NARRATIVE, null, Integer.valueOf(((us80.b) us80Var).a), null, null, 26, null);
            } else if (us80Var instanceof us80.c) {
                us80.c cVar = (us80.c) us80Var;
                narrativesBatchEditInputDto = new NarrativesBatchEditInputDto(NarrativesBatchEditInputDto.OpDto.DELETE, Integer.valueOf(cVar.a), Integer.valueOf(cVar.b), null, null, 24, null);
            } else {
                if (!(us80Var instanceof us80.d)) {
                    throw new NoWhenBranchMatchedException();
                }
                NarrativesBatchEditInputDto.OpDto opDto = NarrativesBatchEditInputDto.OpDto.REORDER;
                us80.d dVar = (us80.d) us80Var;
                int i = dVar.a;
                int i2 = dVar.b;
                narrativesBatchEditInputDto = new NarrativesBatchEditInputDto(opDto, null, Integer.valueOf(i), Integer.valueOf(dVar.c), Integer.valueOf(i2), 2, null);
            }
            arrayList.add(narrativesBatchEditInputDto);
        }
        return rsg0.w0(yfb.x(this.a.h(userId, arrayList))).l(new com.vk.movika.sdk.android.defaultplayer.interactive.c(new x620(9), 22));
    }
}
