package xsna;

import com.vk.clips.internal.nps.api.model.QuestionType;
import java.util.LinkedHashMap;
import kotlin.NoWhenBranchMatchedException;
import ru.ok.android.commons.http.Http;
import xsna.rpe0;
import xsna.sjx;
import xsna.wjx;

/* compiled from: InternalNpsReducer.kt */
/* loaded from: classes16.dex */
public final class tjx extends dm50<bkx, sjx, wjx> {
    public final bpn0 d;

    public tjx() {
        super(wjx.c.b);
        this.d = new bpn0(new hy2(15));
    }

    public static rpe0.a i(wjx wjxVar, sjx sjxVar) {
        if (sjxVar instanceof sjx.a) {
            if ((wjxVar instanceof wjx.a ? (wjx.a) wjxVar : null) != null && ((wjx.a) wjxVar).g.b == QuestionType.TEXT) {
                String str = (String) j5g.Z(((sjx.a) sjxVar).c);
                return new rpe0.a(str != null ? str.length() : 0);
            }
        } else if (sjxVar instanceof sjx.b) {
            if (((sjx.b) sjxVar).e.b == QuestionType.TEXT) {
                return new rpe0.a(0);
            }
        } else {
            if (!(sjxVar instanceof sjx.c)) {
                if (sjxVar instanceof sjx.d) {
                    return null;
                }
                throw new NoWhenBranchMatchedException();
            }
            if (((sjx.c) sjxVar).d.b == QuestionType.TEXT) {
                return new rpe0.a(0);
            }
        }
        return null;
    }

    @Override // xsna.dm50
    public final wjx c(wjx wjxVar, sjx sjxVar) {
        wjx wjxVar2 = wjxVar;
        sjx sjxVar2 = sjxVar;
        if (sjxVar2 instanceof sjx.d) {
            return wjx.b.b;
        }
        if (sjxVar2 instanceof sjx.b) {
            sjx.b bVar = (sjx.b) sjxVar2;
            return new wjx.a(bVar.b, bVar.c, bVar.d, 1, bVar.f, bVar.e, i(wjxVar2, bVar), jgp.b, bVar.g);
        }
        if (sjxVar2 instanceof sjx.a) {
            sjx.a aVar = (sjx.a) sjxVar2;
            if (wjxVar2 instanceof wjx.a) {
                wjx.a aVar2 = (wjx.a) wjxVar2;
                boolean z = aVar.b;
                LinkedHashMap linkedHashMap = new LinkedHashMap(aVar2.i);
                linkedHashMap.put(aVar2.g.c, aVar.c);
                return wjx.a.a(aVar2, 0, z, null, i(wjxVar2, aVar), linkedHashMap, Http.StatusCode.SEE_OTHER);
            }
        } else {
            if (!(sjxVar2 instanceof sjx.c)) {
                throw new NoWhenBranchMatchedException();
            }
            sjx.c cVar = (sjx.c) sjxVar2;
            if (wjxVar2 instanceof wjx.a) {
                return wjx.a.a((wjx.a) wjxVar2, cVar.c, cVar.b, cVar.d, i(wjxVar2, cVar), null, 391);
            }
        }
        return wjxVar2;
    }

    @Override // xsna.dm50
    public final bkx d() {
        return new bkx(e(new wcj(this, 17)), e(new srg(this, 23)));
    }

    @Override // xsna.dm50
    public final void h(wjx wjxVar, bkx bkxVar) {
        wjx wjxVar2 = wjxVar;
        bkx bkxVar2 = bkxVar;
        if (wjxVar2 instanceof wjx.a) {
            f(bkxVar2.a, wjxVar2);
        } else if (wjxVar2 instanceof wjx.b) {
            f(bkxVar2.b, wjxVar2);
        } else if (!(wjxVar2 instanceof wjx.c)) {
            throw new NoWhenBranchMatchedException();
        }
    }
}
