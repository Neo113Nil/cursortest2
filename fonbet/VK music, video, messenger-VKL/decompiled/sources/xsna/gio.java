package xsna;

import com.unity3d.services.UnityAdsConstants;
import com.vk.photo.editor.features.markup.draw.internal.mvi.model.BrushType;
import com.vungle.ads.internal.protos.Sdk;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import kotlin.NoWhenBranchMatchedException;
import xsna.fio;
import xsna.hio;

/* compiled from: DrawEditReducer.kt */
/* loaded from: classes4.dex */
public final class gio extends z9 {
    public final hio c;

    public gio(hio hioVar) {
        super(hioVar);
        this.c = hioVar;
    }

    @Override // xsna.z9
    public final void d(mwx mwxVar) {
        Object value;
        hio hioVar;
        fio fioVar = (fio) mwxVar;
        utk0 utk0Var = (utk0) this.a;
        do {
            value = utk0Var.getValue();
            hioVar = (hio) value;
            boolean z = fioVar instanceof fio.a;
            hio.a.b bVar = hio.a.b.a;
            if (z) {
                fio.a aVar = (fio.a) fioVar;
                hio.a aVar2 = hioVar.i;
                if (epx.f(aVar, fio.a.C2876a.a)) {
                    hioVar = hio.a(hioVar, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, null, 0, null, null, aVar2, false, false, hio.a.C3000a.a, Sdk.SDKError.Reason.STALE_CACHED_RESPONSE_VALUE);
                } else if (epx.f(aVar, fio.a.b.a)) {
                    hioVar = hio.a(hioVar, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, null, 0, null, null, aVar2, false, false, bVar, Sdk.SDKError.Reason.STALE_CACHED_RESPONSE_VALUE);
                } else {
                    if (!(aVar instanceof fio.a.c)) {
                        throw new NoWhenBranchMatchedException();
                    }
                    hioVar = hio.a(hioVar, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, null, 0, null, null, aVar2, false, false, new hio.a.d(((fio.a.c) aVar).a), Sdk.SDKError.Reason.STALE_CACHED_RESPONSE_VALUE);
                }
            } else if (fioVar instanceof aio) {
                boolean z2 = !hioVar.g;
                BrushType brushType = ((aio) fioVar).a;
                hio.a aVar3 = hioVar.i;
                hioVar = hio.a(hioVar, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, null, 0, brushType, null, aVar3, z2, true, aVar3, 23);
            } else if (fioVar instanceof bio) {
                bio bioVar = (bio) fioVar;
                boolean z3 = !hioVar.g;
                x5g x5gVar = new x5g(bioVar.a, bioVar.b);
                hio.a aVar4 = hioVar.i;
                hioVar = hio.a(hioVar, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, x5gVar, 0, null, null, aVar4, z3, true, aVar4, 29);
            } else {
                if (fioVar instanceof fio.c) {
                    ((fio.c) fioVar).getClass();
                    throw null;
                }
                if (fioVar instanceof dio) {
                    boolean z4 = !hioVar.g;
                    float f = ((dio) fioVar).a;
                    hio.a aVar5 = hioVar.i;
                    hioVar = hio.a(hioVar, f, null, 0, null, null, aVar5, z4, true, aVar5, 30);
                } else if (fioVar instanceof eio) {
                    List<vlo> list = hioVar.e;
                    int i = hioVar.c;
                    Object i0 = j5g.i0(list);
                    vlo vloVar = ((eio) fioVar).a;
                    if (!epx.f(i0, vloVar)) {
                        ArrayList v0 = i == e43.h(list) ? j5g.v0(vloVar, list) : j5g.v0(vloVar, list.subList(0, i + 1));
                        hio.a aVar6 = hioVar.i;
                        hioVar = hio.a(hioVar, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, null, e43.h(v0), null, v0, aVar6, false, false, aVar6, 75);
                    }
                } else if (fioVar instanceof cio) {
                    boolean z5 = !hioVar.g;
                    hio.a aVar7 = hioVar.i;
                    hioVar = hio.a(hioVar, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, null, 0, null, null, aVar7, z5, true, aVar7, 31);
                } else if (epx.f(fioVar, fio.d.a)) {
                    if (hioVar.c < e43.h(hioVar.e)) {
                        hio.a aVar8 = hioVar.i;
                        hioVar = hio.a(hioVar, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, null, hioVar.c + 1, null, null, aVar8, false, false, aVar8, 91);
                    }
                } else if (epx.f(fioVar, fio.f.a)) {
                    int i2 = hioVar.c;
                    if (i2 > 0) {
                        hio.a aVar9 = hioVar.i;
                        hioVar = hio.a(hioVar, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, null, i2 - 1, null, null, aVar9, false, false, aVar9, 91);
                    }
                } else if (epx.f(fioVar, fio.e.a)) {
                    hio.a aVar10 = hioVar.i;
                    hioVar = hio.a(hioVar, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, null, 0, null, Collections.singletonList(j5g.Y(hioVar.e)), aVar10, false, false, aVar10, 75);
                } else {
                    if (!(fioVar instanceof fio.b)) {
                        throw new NoWhenBranchMatchedException();
                    }
                    hioVar = hio.a(this.c, hioVar.a, hioVar.b, 0, hioVar.d, Collections.singletonList(((fio.b) fioVar).a), null, !hioVar.g, true, bVar, 32);
                }
            }
        } while (!utk0Var.compareAndSet(value, hioVar));
    }
}
