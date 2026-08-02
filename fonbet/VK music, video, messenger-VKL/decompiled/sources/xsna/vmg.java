package xsna;

import android.content.Context;
import com.vk.clips.playlists.di.ClipsPlaylistsComponentImpl;
import com.vk.clips.playlists.ui.modal.EmptyPlaylistBottomSheet;
import com.vk.dto.common.id.UserId;
import com.vk.dto.search.SearchStatsLoggingInfo;
import com.vk.stickers.ContextUser;
import com.vk.stickers.bridge.b;
import xsna.eqe;
import xsna.kqe;

/* compiled from: R8$$SyntheticClass */
/* loaded from: classes5.dex */
public final /* synthetic */ class vmg implements izs {
    public final /* synthetic */ int b = 0;
    public final /* synthetic */ boolean c;
    public final /* synthetic */ Object d;
    public final /* synthetic */ Object e;
    public final /* synthetic */ Object f;

    public /* synthetic */ vmg(Context context, ContextUser contextUser, boolean z, SearchStatsLoggingInfo searchStatsLoggingInfo) {
        this.d = context;
        this.e = contextUser;
        this.c = z;
        this.f = searchStatsLoggingInfo;
    }

    /* JADX WARN: Type inference failed for: r9v5, types: [java.lang.Object, kotlin.Lazy] */
    @Override // xsna.izs
    public final Object invoke(Object obj) {
        switch (this.b) {
            case 0:
                b.a aVar = (b.a) obj;
                com.vk.stickers.bridge.b.a.q((Context) this.d, aVar.a, aVar.b, (ContextUser) this.e, this.c, (SearchStatsLoggingInfo) this.f);
                break;
            case 1:
                hqe hqeVar = (hqe) this.d;
                UserId userId = (UserId) this.e;
                EmptyPlaylistBottomSheet emptyPlaylistBottomSheet = (EmptyPlaylistBottomSheet) this.f;
                if (hqeVar != null) {
                    hqeVar.b(new eqe.c(userId));
                }
                iqe.a.onNext(new kqe.a(userId));
                vve.e(((ClipsPlaylistsComponentImpl) emptyPlaylistBottomSheet.m.getValue()).Ff(), tve.a, this.c, false, 4);
                break;
            default:
                String str = (String) this.d;
                String str2 = (String) this.e;
                izs izsVar = (izs) this.f;
                tgi0 tgi0Var = (tgi0) obj;
                qgi0.n(tgi0Var, 1);
                boolean z = this.c;
                qgi0.o(tgi0Var, z);
                qgi0.s(tgi0Var, new us2(str));
                qgi0.r(tgi0Var, "themeBoxTestTag" + str2);
                qgi0.e(tgi0Var, null, new hdx(izsVar, z, 0));
                break;
        }
        return s3q0.a;
    }

    public /* synthetic */ vmg(String str, String str2, izs izsVar, boolean z) {
        this.c = z;
        this.d = str;
        this.e = str2;
        this.f = izsVar;
    }

    public /* synthetic */ vmg(hqe hqeVar, UserId userId, EmptyPlaylistBottomSheet emptyPlaylistBottomSheet, boolean z) {
        this.d = hqeVar;
        this.e = userId;
        this.f = emptyPlaylistBottomSheet;
        this.c = z;
    }
}
