package xsna;

import com.vk.dto.newsfeed.SituationalSuggest;
import com.vk.log.L;
import com.vk.log.LoggerOutputTarget;
import com.vungle.ads.internal.protos.Sdk;
import kotlin.NoWhenBranchMatchedException;
import xsna.jv60;

/* compiled from: NewsfeedSitpostingReducer.kt */
/* loaded from: classes4.dex */
public final class lz60 implements bm50<qz60, jv60.d> {
    public final lv60 a;

    public lz60(lv60 lv60Var) {
        this.a = lv60Var;
    }

    @Override // xsna.bm50
    public final qz60 a(qz60 qz60Var, jv60.d dVar) {
        qz60 qz60Var2 = qz60Var;
        jv60.d dVar2 = dVar;
        pz60 pz60Var = qz60Var2.g;
        if (!this.a.a(qz60Var2, dVar2)) {
            L l = L.a;
            l.getClass();
            if (!L.m(LoggerOutputTarget.NONE)) {
                L.u(l, L.LogType.d, new Object[]{"Skipping " + dVar2});
                return qz60Var2;
            }
        } else {
            if (!(dVar2 instanceof jv60.d.a)) {
                if (dVar2 instanceof jv60.d.b) {
                    SituationalSuggest situationalSuggest = ((jv60.d.b) dVar2).a;
                    pz60Var.getClass();
                    return qz60.a(qz60Var2, null, 0, null, null, null, new pz60(situationalSuggest, false), null, null, Sdk.SDKError.Reason.STALE_CACHED_RESPONSE_VALUE);
                }
                if (!(dVar2 instanceof jv60.d.c)) {
                    throw new NoWhenBranchMatchedException();
                }
                pz60Var.getClass();
                return qz60.a(qz60Var2, null, 0, null, null, null, new pz60(null, true), null, null, Sdk.SDKError.Reason.STALE_CACHED_RESPONSE_VALUE);
            }
            if (pz60Var.b) {
                return qz60.a(qz60Var2, null, 0, null, null, null, new pz60(((jv60.d.a) dVar2).a, true), null, null, Sdk.SDKError.Reason.STALE_CACHED_RESPONSE_VALUE);
            }
        }
        return qz60Var2;
    }

    @Override // xsna.bm50
    public final /* bridge */ /* synthetic */ boolean b(jv60.d dVar) {
        return true;
    }
}
