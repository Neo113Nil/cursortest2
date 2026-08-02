package xsna;

import android.util.Log;
import com.vk.dto.reactions.ReactionMeta;
import com.vk.feed.core.models.news.NewsEntry;

/* compiled from: AndroidLog.kt */
/* loaded from: classes3.dex */
public final class pa2 implements d000 {
    public final Object b;

    public /* synthetic */ pa2(Object obj) {
        this.b = obj;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static boolean a(NewsEntry newsEntry) {
        return (newsEntry instanceof o2f0 ? (o2f0) newsEntry : null) != null && di60.I(newsEntry);
    }

    public static String c(ReactionMeta reactionMeta) {
        if (reactionMeta != null) {
            return reactionMeta.e(cn70.b(24));
        }
        return null;
    }

    @Override // xsna.d000
    public void b(gzs gzsVar) {
    }

    @Override // xsna.d000
    public void h(atm atmVar) {
        Log.e((String) this.b, (String) atmVar.invoke());
    }

    public pa2(n7x0 n7x0Var, a6g a6gVar, c8g c8gVar, n7g n7gVar, hjp0 hjp0Var) {
        this.b = (n7x0Var == n7x0.Profile2 && a6gVar == a6g.Depth10 && n7gVar == n7g.BT2020 && (hjp0Var == hjp0.PQ || hjp0Var == hjp0.HLG) && c8gVar == c8g.BT2020NC) ? svu.a(hjp0Var) : null;
    }
}
