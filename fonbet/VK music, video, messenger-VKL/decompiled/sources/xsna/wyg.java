package xsna;

import android.content.Context;
import com.vk.api.generated.base.dto.BaseImageDto;
import com.vk.api.generated.base.dto.BaseOkResponseDto;
import com.vk.api.generated.market.dto.MarketCommunityReviewDto;
import com.vk.api.generated.market.dto.MarketGetCommunityReviewResponseDto;
import com.vk.catalog2.common.dto.api.CatalogCatalog;
import com.vk.catalog2.common.dto.api.CatalogExtendedData;
import com.vk.catalog2.common.dto.api.block.CatalogBlock;
import com.vk.catalog2.common.dto.api.video.CatalogAiAssistantItem;
import com.vk.catalog2.common.dto.ui.UIBlockAiAssistant;
import com.vk.catalog2.common.ui.mvp.fragment.CatalogShowAllFragment;
import com.vk.dto.common.id.UserId;
import com.vk.dto.music.MusicTrack;
import com.vk.dto.music.Playlist;
import com.vk.dto.music.PlaylistPermissions;
import com.vk.ecomm.reviews.api.model.createreview.CreateCommunityReviewData;
import com.vk.ecomm.reviews.api.model.createreview.UploadImageModel;
import com.vk.navigation.NavigationDelegateActivity;
import com.vkontakte.android.R;
import java.util.List;
import kotlin.NoWhenBranchMatchedException;
import kotlin.collections.EmptyList;
import org.json.JSONObject;
import xsna.czg;
import xsna.rmw;
import xsna.vho0;
import xsna.wkh0;

/* compiled from: R8$$SyntheticClass */
/* loaded from: classes18.dex */
public final /* synthetic */ class wyg implements izs {
    public final /* synthetic */ int b;
    public final /* synthetic */ Object c;
    public final /* synthetic */ Object d;
    public final /* synthetic */ Object e;

    public /* synthetic */ wyg(Object obj, Object obj2, Object obj3, int i) {
        this.b = i;
        this.c = obj;
        this.d = obj2;
        this.e = obj3;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // xsna.izs
    public final Object invoke(Object obj) {
        switch (this.b) {
            case 0:
                yyg yygVar = (yyg) this.c;
                CreateCommunityReviewData createCommunityReviewData = (CreateCommunityReviewData) this.d;
                UserId userId = ((fzg) this.e).d;
                MarketCommunityReviewDto d = ((MarketGetCommunityReviewResponseDto) obj).d();
                Integer valueOf = Integer.valueOf(d.l());
                String g = d.g();
                List<List<BaseImageDto>> o = d.o();
                List a = o != null ? azg.a(o) : null;
                if (a == null) {
                    a = EmptyList.b;
                }
                CreateCommunityReviewData createCommunityReviewData2 = new CreateCommunityReviewData(valueOf, g, a, createCommunityReviewData.e);
                List<UploadImageModel> list = createCommunityReviewData.d;
                if (list == null) {
                    list = createCommunityReviewData2.d;
                }
                List X = list != null ? yygVar.X(userId, list) : EmptyList.b;
                Integer num = createCommunityReviewData.b;
                int intValue = num != null ? num.intValue() : d.l();
                String str = createCommunityReviewData.c;
                if (str == null && (str = d.g()) == null) {
                    str = "";
                }
                yygVar.T(new czg.c(intValue, str, X, createCommunityReviewData2));
                return s3q0.a;
            case 1:
                j1z j1zVar = (j1z) this.c;
                tho0 tho0Var = (tho0) this.d;
                uv70 uv70Var = (uv70) this.e;
                oio oioVar = (oio) obj;
                mjo0 d2 = j1zVar.d();
                if (d2 != null) {
                    yq9 a2 = oioVar.a0().a();
                    long j = ((qko0) ((zak0) j1zVar.A).getValue()).a;
                    long j2 = ((qko0) ((zak0) j1zVar.B).getValue()).a;
                    ljo0 ljo0Var = d2.a;
                    va2 va2Var = j1zVar.y;
                    long j3 = j1zVar.z;
                    if (!qko0.c(j)) {
                        va2Var.d(j3);
                        int b = uv70Var.b(qko0.f(j));
                        int b2 = uv70Var.b(qko0.e(j));
                        if (b != b2) {
                            a2.k(ljo0Var.k(b, b2), va2Var);
                        }
                    } else if (!qko0.c(j2)) {
                        long b3 = ljo0Var.a.b.b();
                        l5g l5gVar = new l5g(b3);
                        if (b3 == 16) {
                            l5gVar = null;
                        }
                        long j4 = l5gVar != null ? l5gVar.a : l5g.b;
                        va2Var.d(l5g.c(14, j4, l5g.e(j4) * 0.2f));
                        int b4 = uv70Var.b(qko0.f(j2));
                        int b5 = uv70Var.b(qko0.e(j2));
                        if (b4 != b5) {
                            a2.k(ljo0Var.k(b4, b5), va2Var);
                        }
                    } else if (!qko0.c(tho0Var.b)) {
                        va2Var.d(j3);
                        long j5 = tho0Var.b;
                        int b6 = uv70Var.b(qko0.f(j5));
                        int b7 = uv70Var.b(qko0.e(j5));
                        if (b6 != b7) {
                            a2.k(ljo0Var.k(b6, b7), va2Var);
                        }
                    }
                    boolean e = ljo0Var.e();
                    m540 m540Var = ljo0Var.b;
                    kjo0 kjo0Var = ljo0Var.a;
                    boolean z = e && kjo0Var.f != 3;
                    if (z) {
                        long j6 = ljo0Var.c;
                        zhf0 e2 = p490.e(0L, (Float.floatToRawIntBits((int) (j6 >> 32)) << 32) | (4294967295L & Float.floatToRawIntBits((int) (j6 & 4294967295L))));
                        a2.e();
                        a2.b(e2);
                    }
                    hik0 hik0Var = kjo0Var.b.a;
                    pdo0 pdo0Var = hik0Var.m;
                    vho0 vho0Var = hik0Var.a;
                    if (pdo0Var == null) {
                        pdo0Var = pdo0.b;
                    }
                    pdo0 pdo0Var2 = pdo0Var;
                    v4j0 v4j0Var = hik0Var.n;
                    if (v4j0Var == null) {
                        v4j0Var = v4j0.d;
                    }
                    v4j0 v4j0Var2 = v4j0Var;
                    qio qioVar = hik0Var.p;
                    if (qioVar == null) {
                        qioVar = qbr.a;
                    }
                    qio qioVar2 = qioVar;
                    try {
                        yk8 e3 = vho0Var.e();
                        vho0.a aVar = vho0.a.a;
                        if (e3 != null) {
                            m540Var.k(a2, e3, vho0Var != aVar ? vho0Var.a() : 1.0f, v4j0Var2, pdo0Var2, qioVar2);
                        } else {
                            m540Var.j(a2, vho0Var != aVar ? vho0Var.c() : l5g.b, v4j0Var2, pdo0Var2, qioVar2);
                        }
                        if (z) {
                            a2.a();
                        }
                    } finally {
                    }
                }
                return s3q0.a;
            case 2:
                izs izsVar = (izs) this.c;
                rmw.e eVar = (rmw.e) this.d;
                wh50 wh50Var = (wh50) this.e;
                if (!((Boolean) wh50Var.getValue()).booleanValue()) {
                    wh50Var.setValue(Boolean.TRUE);
                    izsVar.invoke(eVar);
                }
                return s3q0.a;
            case 3:
                Playlist playlist = (Playlist) this.c;
                List<MusicTrack> list2 = (List) this.d;
                com.vk.music.playlist.display.data.a aVar2 = (com.vk.music.playlist.display.data.a) this.e;
                if (((BaseOkResponseDto) obj) != BaseOkResponseDto.OK) {
                    return null;
                }
                Playlist m = xx1.m(playlist);
                m.g = null;
                m.t = false;
                PlaylistPermissions playlistPermissions = m.B;
                m.B = playlistPermissions != null ? PlaylistPermissions.zb(playlistPermissions, true) : null;
                m.y = list2;
                aVar2.a.b(new b9b0(playlist, m, false));
                return m;
            case 4:
                return new UIBlockAiAssistant(((w060) this.c).e((CatalogBlock) this.d, (CatalogExtendedData) this.e).b(), (CatalogAiAssistantItem) obj);
            case 5:
                wkh0.b bVar = (wkh0.b) this.c;
                Context context = (Context) this.d;
                UserId userId2 = (UserId) this.e;
                io.reactivex.rxjava3.core.q qVar = (io.reactivex.rxjava3.core.q) obj;
                if (bVar instanceof wkh0.b.a) {
                    return qVar;
                }
                if (bVar instanceof wkh0.b.C3939b) {
                    return t7i.a(qVar, context, context.getString(fkq0.b(userId2) ? R.string.clip_author_subscribe_done_group : R.string.clip_author_subscribe_done_profile), context.getString(R.string.clip_action_progress));
                }
                throw new NoWhenBranchMatchedException();
            case 6:
                b9s0 b9s0Var = (b9s0) this.c;
                r4a r4aVar = (r4a) this.d;
                NavigationDelegateActivity navigationDelegateActivity = ((qot0) this.e).a;
                Object obj2 = ((hda) obj).a;
                CatalogCatalog catalogCatalog = obj2 instanceof CatalogCatalog ? (CatalogCatalog) obj2 : null;
                String str2 = catalogCatalog != null ? catalogCatalog.c : null;
                if (str2 != null) {
                    CatalogShowAllFragment.a aVar3 = new CatalogShowAllFragment.a();
                    aVar3.B(b9s0Var);
                    aVar3.C(r4aVar.a);
                    aVar3.F(str2);
                    aVar3.G(navigationDelegateActivity.getString(R.string.video_album_uploaded));
                    aVar3.k(navigationDelegateActivity);
                }
                return s3q0.a;
            default:
                ohw0 ohw0Var = (ohw0) this.c;
                JSONObject jSONObject = (JSONObject) obj;
                ohw0Var.b.a((rp90) this.d, (a59) this.e, new mlf0(ohw0Var, 28));
                r3y.c("VKWebAppReturnReason");
                return jSONObject;
        }
    }
}
