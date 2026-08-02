package xsna;

import android.net.Uri;
import com.ironsource.X3;
import com.vk.api.internal.LongPollMode;
import com.vk.dto.common.Peer;
import java.util.Map;
import kotlin.Pair;
import xsna.a400;

/* compiled from: SseUrlBuilder.kt */
/* loaded from: classes2.dex */
public final class xnk0 implements vnk0 {
    public final String a;

    public xnk0(String str) {
        this.a = str;
    }

    @Override // xsna.vnk0
    public final String a(a400 a400Var, Peer peer) {
        a400.b bVar = (a400.b) a400Var;
        Uri.Builder buildUpon = Uri.parse(this.a).buildUpon();
        Pair pair = new Pair("key", bVar.b);
        int i = 0;
        for (LongPollMode longPollMode : LongPollMode.values()) {
            i |= longPollMode.h();
        }
        for (Map.Entry entry : pn00.k(pair, new Pair(X3.a.t, Integer.valueOf(i)), new Pair("ts", Long.valueOf(bVar.a.b)), new Pair("uid", Long.valueOf(peer.d)), new Pair("version", "21")).entrySet()) {
            buildUpon.appendQueryParameter((String) entry.getKey(), entry.getValue().toString());
        }
        return buildUpon.build().toString();
    }
}
