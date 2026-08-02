package xsna;

import com.google.gson.Gson;
import com.vk.api.generated.messages.dto.MessagesConfigItemDto;
import java.util.Collections;
import java.util.List;

/* compiled from: ResetCountersRepositoryImpl.kt */
/* loaded from: classes5.dex */
public final class k9g0 implements j9g0 {
    @Override // xsna.j9g0
    public final io.reactivex.rxjava3.disposables.c a(int i, Integer num, gzs<s3q0> gzsVar, gzs<s3q0> gzsVar2) {
        List singletonList = num != null ? Collections.singletonList(Integer.valueOf(num.intValue())) : null;
        tfx tfxVar = new tfx("messages.markConversationsAsRead", new com.vk.movika.sdk.android.defaultplayer.view.a(22), new er(24));
        tfx.l(tfxVar, "unread_min_days", i, 0, 0, 8);
        if (singletonList != null) {
            tfxVar.i("folder_ids", singletonList);
        }
        return rsg0.W(yfb.x(tfxVar), 7).m(asu0.a.d()).subscribe(new s440(new kb40(gzsVar, 20), 11), new g600(new t440(gzsVar2, 18), 20));
    }

    @Override // xsna.j9g0
    public final void b() {
        String json = new Gson().toJson(new MessagesConfigItemDto(null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, Boolean.FALSE, -1, 31, null));
        tfx tfxVar = new tfx("messages.setConfig", new pq(14), new j8(18));
        tfx.o(tfxVar, "config", json, 0, 0, 12);
        dz2 x = yfb.x(tfxVar);
        x.n = true;
        itg0.k(rsg0.W(x, 7), null, null, 3);
    }
}
