package xsna;

import android.view.View;
import com.vk.api.generated.market.dto.MarketReviewCommentDto;
import com.vk.api.generated.market.dto.MarketReviewCommentsDto;
import com.vk.dto.common.id.UserId;
import com.vk.ecomm.market.good.GoodFragment;
import com.vk.im.engine.models.dialogs.Dialog;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import kotlin.Pair;

/* compiled from: ChatClipsMsgSendVc.kt */
/* loaded from: classes2.dex */
public final class qob implements s1y0 {
    public final Object b;

    public /* synthetic */ qob(Object obj) {
        this.b = obj;
    }

    @Override // xsna.s1y0
    public void a(f1y0 f1y0Var) {
        oob oobVar = (oob) this.b;
        e4w e4wVar = oobVar.D;
        View view = oobVar.t;
        if (view == null) {
            view = null;
        }
        if (e4wVar.b(view)) {
            return;
        }
        oobVar.G(ly30.f);
    }

    @Override // xsna.s1y0
    public void b(f1y0 f1y0Var) {
        ((oob) this.b).G(ly30.f);
    }

    /* JADX WARN: Type inference failed for: r2v3, types: [java.lang.Object, kotlin.Lazy] */
    @Override // xsna.s1y0
    public boolean c() {
        oob oobVar = (oob) this.b;
        tb tbVar = oobVar.i;
        Dialog Cb = oobVar.l.Cb();
        if (Cb != null && Cb.sc()) {
            return false;
        }
        oobVar.c.getClass();
        e140 e140Var = (e140) oobVar.C.getValue();
        View view = oobVar.t;
        if (view == null) {
            view = null;
        }
        e140.c(e140Var, view, tbVar);
        return true;
    }

    public String d() {
        return (String) this.b;
    }

    public j2g0 e(MarketReviewCommentsDto marketReviewCommentsDto, int i, boolean z, boolean z2) {
        Map t = pn00.t(d370.o(marketReviewCommentsDto.d(), marketReviewCommentsDto.f()));
        int count = marketReviewCommentsDto.getCount();
        List<MarketReviewCommentDto> e = marketReviewCommentsDto.e();
        int e2 = on00.e(c5g.u(e, 10));
        if (e2 < 16) {
            e2 = 16;
        }
        LinkedHashMap linkedHashMap = new LinkedHashMap(e2);
        for (MarketReviewCommentDto marketReviewCommentDto : e) {
            Pair pair = new Pair(Integer.valueOf(marketReviewCommentDto.getId()), ((iid) this.b).e(marketReviewCommentDto, i, (big0) t.get(new UserId(marketReviewCommentDto.e())), marketReviewCommentsDto.c0(), z, z2));
            linkedHashMap.put(pair.i(), pair.j());
        }
        return new j2g0(count, linkedHashMap, t);
    }

    public void f(ird0 ird0Var, int i) {
        Object obj;
        krd0 krd0Var = ird0Var.d;
        Iterator it = ird0Var.c.iterator();
        while (true) {
            if (!it.hasNext()) {
                obj = null;
                break;
            } else {
                obj = it.next();
                if (((krd0) obj).a == i) {
                    break;
                }
            }
        }
        krd0 krd0Var2 = (krd0) obj;
        if (krd0Var2 == null || krd0Var2.equals(krd0Var)) {
            return;
        }
        ((GoodFragment) this.b).V3(krd0Var2, krd0Var);
    }

    public qob(tkv tkvVar) {
        this.b = tkvVar.a;
    }
}
