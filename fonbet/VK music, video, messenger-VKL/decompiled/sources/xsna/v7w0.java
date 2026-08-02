package xsna;

import com.vk.dto.common.id.UserId;
import com.vk.vmoji.character.model.CharacterContext;
import com.vk.vmoji.character.model.RecommendationsBlockModel;
import com.vk.vmoji.character.model.VmojiCharacterModel;
import com.vk.vmoji.character.model.VmojiStickerPackPreviewModel;
import com.vk.vmoji.character.model.VmojiStickerPacksModel;
import com.vungle.ads.internal.protos.Sdk;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import kotlin.NoWhenBranchMatchedException;
import xsna.p7w0;
import xsna.sf90;
import xsna.z7w0;

/* compiled from: VmojiCharacterReducer.kt */
/* loaded from: classes7.dex */
public final class v7w0 extends dm50<i8w0, p7w0, z7w0> {
    public final w6w0 d;
    public final b7w0 e;

    public v7w0(w6w0 w6w0Var, UserId userId) {
        super(new z7w0.c(w6w0Var.e, userId));
        this.d = w6w0Var;
        this.e = new b7w0();
    }

    public static List i(List list, VmojiStickerPackPreviewModel vmojiStickerPackPreviewModel, boolean z) {
        if (!list.contains(vmojiStickerPackPreviewModel)) {
            return list;
        }
        VmojiStickerPackPreviewModel vmojiStickerPackPreviewModel2 = new VmojiStickerPackPreviewModel(vmojiStickerPackPreviewModel.b, vmojiStickerPackPreviewModel.c, vmojiStickerPackPreviewModel.d, vmojiStickerPackPreviewModel.e, vmojiStickerPackPreviewModel.f, z, vmojiStickerPackPreviewModel.h, vmojiStickerPackPreviewModel.i, vmojiStickerPackPreviewModel.j, vmojiStickerPackPreviewModel.k);
        List list2 = list;
        ArrayList arrayList = new ArrayList(c5g.u(list2, 10));
        for (Object obj : list2) {
            if (((VmojiStickerPackPreviewModel) obj).b == vmojiStickerPackPreviewModel.b) {
                obj = vmojiStickerPackPreviewModel2;
            }
            arrayList.add(obj);
        }
        return arrayList;
    }

    @Override // xsna.dm50
    public final z7w0 c(z7w0 z7w0Var, p7w0 p7w0Var) {
        String str;
        z7w0 z7w0Var2 = z7w0Var;
        p7w0 p7w0Var2 = p7w0Var;
        boolean z = p7w0Var2 instanceof p7w0.c;
        w6w0 w6w0Var = this.d;
        Object obj = null;
        if (z) {
            p7w0.c cVar = (p7w0.c) p7w0Var2;
            if (cVar instanceof p7w0.c.C3496c) {
                return new z7w0.c(((p7w0.c.C3496c) cVar).b, null);
            }
            if (!(cVar instanceof p7w0.c.b)) {
                if (cVar instanceof p7w0.c.a) {
                    return new z7w0.b(((p7w0.c.a) cVar).b);
                }
                throw new NoWhenBranchMatchedException();
            }
            CharacterContext characterContext = w6w0Var.e;
            p7w0.c.b bVar = (p7w0.c.b) cVar;
            VmojiCharacterModel vmojiCharacterModel = bVar.b;
            VmojiStickerPacksModel vmojiStickerPacksModel = bVar.c;
            List<VmojiStickerPackPreviewModel> list = vmojiStickerPacksModel.b;
            List<RecommendationsBlockModel> list2 = bVar.d;
            z7w0.a.AbstractC4164a.C4165a c4165a = z7w0.a.AbstractC4164a.C4165a.a;
            sf90.b bVar2 = new sf90.b(vmojiStickerPacksModel.c);
            LinkedHashMap linkedHashMap = new LinkedHashMap();
            for (RecommendationsBlockModel recommendationsBlockModel : list2) {
                linkedHashMap.put(recommendationsBlockModel.b, new sf90.b(recommendationsBlockModel.e));
            }
            return new z7w0.a(characterContext, vmojiCharacterModel, list, list2, null, c4165a, bVar2, linkedHashMap);
        }
        if (p7w0Var2 instanceof p7w0.f) {
            p7w0.f fVar = (p7w0.f) p7w0Var2;
            if (z7w0Var2 instanceof z7w0.a) {
                if (fVar instanceof p7w0.f.c) {
                    return z7w0.a.a((z7w0.a) z7w0Var2, null, null, null, null, null, z7w0.a.AbstractC4164a.b.a, null, null, Sdk.SDKError.Reason.STALE_CACHED_RESPONSE_VALUE);
                }
                if (fVar instanceof p7w0.f.b) {
                    p7w0.f.b bVar3 = (p7w0.f.b) fVar;
                    return z7w0.a.a((z7w0.a) z7w0Var2, w6w0Var.e, bVar3.b, bVar3.c.b, bVar3.d, null, z7w0.a.AbstractC4164a.C4165a.a, null, null, Sdk.SDKError.Reason.INVALID_BID_PAYLOAD_VALUE);
                }
                if (fVar instanceof p7w0.f.a) {
                    return z7w0.a.a((z7w0.a) z7w0Var2, null, null, null, null, null, z7w0.a.AbstractC4164a.C4165a.a, null, null, Sdk.SDKError.Reason.STALE_CACHED_RESPONSE_VALUE);
                }
                throw new NoWhenBranchMatchedException();
            }
        } else if (p7w0Var2 instanceof p7w0.d) {
            p7w0.d dVar = (p7w0.d) p7w0Var2;
            if (z7w0Var2 instanceof z7w0.a) {
                if (dVar instanceof p7w0.d.c) {
                    z7w0.a aVar = (z7w0.a) z7w0Var2;
                    return z7w0.a.a(aVar, null, null, null, null, null, null, new sf90.c(aVar.h.a), null, 191);
                }
                if (dVar instanceof p7w0.d.b) {
                    z7w0.a aVar2 = (z7w0.a) z7w0Var2;
                    List<VmojiStickerPackPreviewModel> list3 = aVar2.d;
                    VmojiStickerPacksModel vmojiStickerPacksModel2 = ((p7w0.d.b) dVar).b;
                    return z7w0.a.a(aVar2, null, null, j5g.u0(vmojiStickerPacksModel2.b, list3), null, null, null, new sf90.b(vmojiStickerPacksModel2.c), null, 187);
                }
                if (!(dVar instanceof p7w0.d.a)) {
                    throw new NoWhenBranchMatchedException();
                }
                z7w0.a aVar3 = (z7w0.a) z7w0Var2;
                return z7w0.a.a(aVar3, null, null, null, null, null, null, new sf90.a(((p7w0.d.a) dVar).b, aVar3.h.a), null, 191);
            }
        } else if (p7w0Var2 instanceof p7w0.e) {
            p7w0.e eVar = (p7w0.e) p7w0Var2;
            if (z7w0Var2 instanceof z7w0.a) {
                z7w0.a aVar4 = (z7w0.a) z7w0Var2;
                List<RecommendationsBlockModel> list4 = aVar4.e;
                Map<String, sf90> map = aVar4.i;
                String str2 = eVar.b;
                sf90 sf90Var = map.get(str2);
                if (sf90Var != null && (str = sf90Var.a) != null) {
                    LinkedHashMap linkedHashMap2 = new LinkedHashMap(map);
                    if (eVar instanceof p7w0.e.c) {
                        linkedHashMap2.put(str2, new sf90.c(str));
                        return z7w0.a.a(aVar4, null, null, null, null, null, null, null, linkedHashMap2, 127);
                    }
                    if (!(eVar instanceof p7w0.e.b)) {
                        if (!(eVar instanceof p7w0.e.a)) {
                            throw new NoWhenBranchMatchedException();
                        }
                        linkedHashMap2.put(str2, new sf90.a(((p7w0.e.a) eVar).d, str));
                        return z7w0.a.a(aVar4, null, null, null, null, null, null, null, linkedHashMap2, 127);
                    }
                    RecommendationsBlockModel recommendationsBlockModel2 = ((p7w0.e.b) eVar).d;
                    linkedHashMap2.put(str2, new sf90.b(recommendationsBlockModel2.e));
                    List<RecommendationsBlockModel> list5 = list4;
                    Iterator<T> it = list5.iterator();
                    while (true) {
                        if (!it.hasNext()) {
                            break;
                        }
                        Object next = it.next();
                        if (epx.f(((RecommendationsBlockModel) next).b, str2)) {
                            obj = next;
                            break;
                        }
                    }
                    RecommendationsBlockModel recommendationsBlockModel3 = (RecommendationsBlockModel) obj;
                    if (recommendationsBlockModel3 != null) {
                        RecommendationsBlockModel recommendationsBlockModel4 = new RecommendationsBlockModel(recommendationsBlockModel3.b, recommendationsBlockModel3.c, recommendationsBlockModel3.d, recommendationsBlockModel2.e, j5g.u0(recommendationsBlockModel2.f, recommendationsBlockModel3.f));
                        ArrayList arrayList = new ArrayList(c5g.u(list5, 10));
                        for (Object obj2 : list5) {
                            if (epx.f(((RecommendationsBlockModel) obj2).b, eVar.b)) {
                                obj2 = recommendationsBlockModel4;
                            }
                            arrayList.add(obj2);
                        }
                        return z7w0.a.a(aVar4, null, null, null, arrayList, null, null, null, linkedHashMap2, Sdk.SDKError.Reason.JSON_ENCODE_ERROR_VALUE);
                    }
                }
                return z7w0Var2;
            }
        } else if (p7w0Var2.equals(p7w0.a.b)) {
            if (z7w0Var2 instanceof z7w0.a) {
                return z7w0.a.a((z7w0.a) z7w0Var2, null, null, null, null, null, null, null, null, 239);
            }
        } else if (p7w0Var2 instanceof p7w0.h) {
            if (z7w0Var2 instanceof z7w0.a) {
                return z7w0.a.a((z7w0.a) z7w0Var2, null, null, null, null, ((p7w0.h) p7w0Var2).b, null, null, null, 239);
            }
        } else if (p7w0Var2 instanceof p7w0.b) {
            p7w0.b bVar4 = (p7w0.b) p7w0Var2;
            if (z7w0Var2 instanceof z7w0.a) {
                z7w0.a aVar5 = (z7w0.a) z7w0Var2;
                return z7w0.a.a(aVar5, null, null, i(aVar5.d, bVar4.b, false), null, null, null, null, null, 251);
            }
        } else if (p7w0Var2 instanceof p7w0.i) {
            p7w0.i iVar = (p7w0.i) p7w0Var2;
            if (z7w0Var2 instanceof z7w0.a) {
                z7w0.a aVar6 = (z7w0.a) z7w0Var2;
                return z7w0.a.a(aVar6, null, null, i(aVar6.d, iVar.b, true), null, null, null, null, null, 251);
            }
        } else {
            if (!(p7w0Var2 instanceof p7w0.g)) {
                throw new NoWhenBranchMatchedException();
            }
            if (z7w0Var2 instanceof z7w0.a) {
                z7w0.a aVar7 = (z7w0.a) z7w0Var2;
                VmojiCharacterModel vmojiCharacterModel2 = aVar7.c;
                return z7w0.a.a(aVar7, null, new VmojiCharacterModel(vmojiCharacterModel2.b, vmojiCharacterModel2.c, vmojiCharacterModel2.d, vmojiCharacterModel2.e, vmojiCharacterModel2.f, vmojiCharacterModel2.g, vmojiCharacterModel2.h, vmojiCharacterModel2.i, vmojiCharacterModel2.j, vmojiCharacterModel2.k, vmojiCharacterModel2.l, 0, null), null, null, null, null, null, null, 253);
            }
        }
        return z7w0Var2;
    }

    @Override // xsna.dm50
    public final i8w0 d() {
        return new i8w0(e(new l5r0(9)), e(new r7w0(0)), e(new e9i0(this, 28)));
    }

    @Override // xsna.dm50
    public final void h(z7w0 z7w0Var, i8w0 i8w0Var) {
        z7w0 z7w0Var2 = z7w0Var;
        i8w0 i8w0Var2 = i8w0Var;
        if (z7w0Var2 instanceof z7w0.c) {
            f(i8w0Var2.a, z7w0Var2);
        } else if (z7w0Var2 instanceof z7w0.b) {
            f(i8w0Var2.b, z7w0Var2);
        } else {
            if (!(z7w0Var2 instanceof z7w0.a)) {
                throw new NoWhenBranchMatchedException();
            }
            f(i8w0Var2.c, z7w0Var2);
        }
    }
}
