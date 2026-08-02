package xsna;

import android.content.Context;
import com.vk.dto.common.VideoFile;
import com.vk.dto.common.id.UserId;
import com.vk.log.L;
import com.vk.movika.sdk.base.ui.i0;
import com.vk.movika.sdk.player.base.components.b;
import com.vk.movika.sdk.player.base.model.PlayerItemVariant;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import kotlin.Pair;
import kotlin.collections.EmptyList;
import org.json.JSONObject;

/* compiled from: VideoVariantsResolverImpl.kt */
/* loaded from: classes3.dex */
public final class opt0 implements com.vk.movika.sdk.player.base.components.b {
    public static final PlayerItemVariant.Type g = PlayerItemVariant.Type.DASH;
    public final String a;
    public qr0 e;
    public final LinkedHashMap b = new LinkedHashMap();
    public final io.reactivex.rxjava3.disposables.b c = new io.reactivex.rxjava3.disposables.b();
    public Map<Integer, String> d = jgp.b;
    public Object f = EmptyList.b;

    public opt0(String str) {
        this.a = str;
    }

    @Override // com.vk.movika.sdk.player.base.components.b
    public final com.vk.movika.sdk.common.a a(com.vk.movika.sdk.player.base.model.a aVar, b.a aVar2) {
        Object obj;
        String str;
        String str2;
        ArrayList arrayList = aVar.d;
        Iterator it = arrayList.iterator();
        while (true) {
            if (!it.hasNext()) {
                obj = null;
                break;
            }
            obj = it.next();
            if (((PlayerItemVariant) obj).b == PlayerItemVariant.Type.CUSTOM) {
                break;
            }
        }
        PlayerItemVariant playerItemVariant = (PlayerItemVariant) obj;
        if (playerItemVariant != null && (str2 = playerItemVariant.e) != null) {
            try {
                str = new JSONObject(str2).getString("id");
            } catch (Exception e) {
                L.j(e, "Can not parse payload: ".concat(str2));
            }
            if (playerItemVariant != null || str == null || drm0.N(str)) {
                ((i0.c) aVar2).b(aVar, new IllegalArgumentException("Can not resolve VideoFile"));
                return new mpt0();
            }
            int indexOf = arrayList.indexOf(playerItemVariant);
            List b0 = drm0.b0(str, new char[]{'_'}, 0, 6);
            Pair pair = new Pair(new UserId(Long.parseLong((String) b0.get(0))), Integer.valueOf(Integer.parseInt((String) b0.get(1))));
            Context context = e43.a;
            final v1s0 g2 = w1s0.g(context != null ? context : null, (UserId) pair.i(), ((Number) pair.j()).intValue(), this.d.get(pair.j()), false, false, false, new ovm0(indexOf, 1, this, aVar, (i0.c) aVar2), 160);
            this.c.b(g2);
            return new com.vk.movika.sdk.common.a() { // from class: xsna.npt0
                @Override // com.vk.movika.sdk.common.a
                public final void cancel() {
                    v1s0 v1s0Var = v1s0.this;
                    v1s0Var.dispose();
                    this.c.a(v1s0Var);
                }
            };
        }
        str = null;
        if (playerItemVariant != null) {
        }
        ((i0.c) aVar2).b(aVar, new IllegalArgumentException("Can not resolve VideoFile"));
        return new mpt0();
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, java.util.List<xsna.lpt0>] */
    public final List<lpt0> b() {
        return this.f;
    }

    public final VideoFile c(String str) {
        return (VideoFile) this.b.get(str);
    }
}
