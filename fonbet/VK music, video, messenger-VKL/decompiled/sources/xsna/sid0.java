package xsna;

import android.content.Context;
import com.vk.dto.common.id.UserId;
import com.vk.ecomm.design.view.tile.MarketProductTileConfig;
import com.vk.ecomm.moderation.api.restrictions.ModerationRestriction;
import com.vk.stat.scheme.CommonMarketStat$TypeMarketContextContent;
import com.vk.stat.scheme.CommonMarketStat$TypeRefSource;
import java.util.LinkedHashMap;

/* compiled from: R8$$SyntheticClass */
/* loaded from: classes18.dex */
public final /* synthetic */ class sid0 implements izs {
    public final /* synthetic */ LinkedHashMap b;
    public final /* synthetic */ izs c;
    public final /* synthetic */ tid0 d;
    public final /* synthetic */ tmc e;
    public final /* synthetic */ CommonMarketStat$TypeRefSource f;

    public /* synthetic */ sid0(LinkedHashMap linkedHashMap, izs izsVar, tid0 tid0Var, tmc tmcVar, CommonMarketStat$TypeRefSource commonMarketStat$TypeRefSource) {
        this.b = linkedHashMap;
        this.c = izsVar;
        this.d = tid0Var;
        this.e = tmcVar;
        this.f = commonMarketStat$TypeRefSource;
    }

    @Override // xsna.izs
    public final Object invoke(Object obj) {
        c5u c5uVar = (c5u) this.b.get((MarketProductTileConfig) obj);
        if (c5uVar != null) {
            c530 c530Var = c5uVar.h;
            this.c.invoke(c5uVar);
            tid0 tid0Var = this.d;
            ah5 ah5Var = tid0Var.b;
            w530 w530Var = (w530) ah5Var.b;
            ModerationRestriction a = w530Var.a(c530Var);
            if (!a.h() || !w530Var.b(c530Var, a)) {
                sz00 sz00Var = (sz00) ah5Var.c;
                Context context = tid0Var.a;
                long j = c5uVar.a;
                UserId userId = c5uVar.b;
                String str = c5uVar.i;
                tmc tmcVar = this.e;
                int i = tmcVar.a;
                long j2 = tmcVar.b.b;
                sz00Var.d(context, new qz00(j, userId, this.f, null, null, null, null, null, null, str, CommonMarketStat$TypeMarketContextContent.Type.CLIP, Integer.valueOf(i), Long.valueOf(j2), 987128));
            }
        }
        return s3q0.a;
    }
}
