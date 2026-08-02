package xsna;

import com.mbridge.msdk.playercommon.exoplayer2.extractor.ts.PsExtractor;
import com.vk.log.L;
import com.vk.log.LoggerOutputTarget;
import com.vk.voip.OKVoipEngine;
import com.vungle.ads.internal.protos.Sdk;
import java.util.ArrayList;
import java.util.LinkedHashMap;
import kotlin.NoWhenBranchMatchedException;
import kotlin.collections.EmptyList;
import xsna.a990;
import xsna.avw0;
import xsna.rp90;
import xsna.up90;
import xsna.vo90;
import xsna.vuw0;
import xsna.wp90;
import xsna.wuw0;
import xsna.xuw0;

/* compiled from: VoipPastCallsReducer.kt */
/* loaded from: classes7.dex */
public final class zuw0 extends dm50<cvw0, b59, avw0> {
    public final wp90 d;
    public final uuw0 e;
    public final wo90 f;

    public zuw0() {
        super(avw0.c.b);
        this.d = new wp90();
        jp90 jp90Var = new jp90();
        gp90 gp90Var = new gp90();
        lp90 lp90Var = new lp90();
        ip90 ip90Var = new ip90();
        uo90 uo90Var = new uo90();
        this.e = new uuw0(new pp90(jp90Var, gp90Var, lp90Var, ip90Var, uo90Var));
        this.f = new wo90(jp90Var, gp90Var, lp90Var, ip90Var, uo90Var, OKVoipEngine.b);
    }

    @Override // xsna.dm50
    public final avw0 c(avw0 avw0Var, b59 b59Var) {
        rp90 a;
        wp90.a aVar;
        wp90.a aVar2;
        avw0 avw0Var2 = avw0Var;
        b59 b59Var2 = b59Var;
        if (b59Var2 instanceof vuw0) {
            vuw0 vuw0Var = (vuw0) b59Var2;
            if (epx.f(vuw0Var, vuw0.c.b)) {
                return avw0.c.b;
            }
            if (vuw0Var instanceof vuw0.a) {
                return avw0.b.b;
            }
            if (!(vuw0Var instanceof vuw0.b)) {
                throw new NoWhenBranchMatchedException();
            }
            vuw0.b bVar = (vuw0.b) vuw0Var;
            ArrayList arrayList = bVar.b;
            LinkedHashMap linkedHashMap = bVar.c;
            LinkedHashMap linkedHashMap2 = bVar.d;
            LinkedHashMap linkedHashMap3 = bVar.e;
            return new avw0.a(new rp90(arrayList, linkedHashMap, linkedHashMap2, linkedHashMap3, bVar.f, linkedHashMap3.isEmpty() ? rp90.b.a.a : rp90.b.d.a, rp90.a.C3619a.a), new a990(Long.valueOf(bVar.g), bVar.h, a990.a.b.a, a990.b.a.a), bVar.i);
        }
        if (b59Var2 instanceof xuw0) {
            xuw0 xuw0Var = (xuw0) b59Var2;
            if (avw0Var2 instanceof avw0.a) {
                if (xuw0Var instanceof xuw0.b) {
                    avw0.a aVar3 = (avw0.a) avw0Var2;
                    return avw0.a.a(aVar3, null, a990.a(aVar3.c, null, false, null, a990.b.C2531b.a, 7), 5);
                }
                if (!(xuw0Var instanceof xuw0.a)) {
                    throw new NoWhenBranchMatchedException();
                }
                xuw0.a aVar4 = (xuw0.a) xuw0Var;
                avw0.a aVar5 = (avw0.a) avw0Var2;
                return avw0.a.a(aVar5, rp90.a(aVar5.b, aVar4.b, aVar4.c, aVar4.d, aVar4.e, null, null, Sdk.SDKError.Reason.INVALID_JSON_BID_PAYLOAD_VALUE), new a990(Long.valueOf(aVar4.f), aVar4.g, a990.a.b.a, a990.b.a.a), 4);
            }
        } else if (b59Var2 instanceof wuw0) {
            wuw0 wuw0Var = (wuw0) b59Var2;
            if (avw0Var2 instanceof avw0.a) {
                if (epx.f(wuw0Var, wuw0.c.b)) {
                    avw0.a aVar6 = (avw0.a) avw0Var2;
                    return avw0.a.a(aVar6, null, a990.a(aVar6.c, null, false, a990.a.c.a, null, 11), 5);
                }
                if (wuw0Var instanceof wuw0.b) {
                    avw0.a aVar7 = (avw0.a) avw0Var2;
                    rp90 rp90Var = aVar7.b;
                    wuw0.b bVar2 = (wuw0.b) wuw0Var;
                    return avw0.a.a(aVar7, rp90.a(rp90Var, j5g.u0(bVar2.b, rp90Var.a), pn00.n(rp90Var.b, bVar2.c), pn00.n(rp90Var.c, bVar2.d), pn00.n(rp90Var.e, bVar2.e), null, null, Sdk.SDKError.Reason.INVALID_JSON_BID_PAYLOAD_VALUE), a990.a(aVar7.c, Long.valueOf(bVar2.f), bVar2.g, a990.a.b.a, null, 8), 4);
                }
                if (!(wuw0Var instanceof wuw0.a)) {
                    throw new NoWhenBranchMatchedException();
                }
                avw0.a aVar8 = (avw0.a) avw0Var2;
                return avw0.a.a(aVar8, null, a990.a(aVar8.c, null, false, new a990.a.C2530a(((wuw0.a) wuw0Var).b), null, 11), 5);
            }
        } else {
            boolean z = b59Var2 instanceof up90;
            wp90 wp90Var = this.d;
            if (z) {
                up90 up90Var = (up90) b59Var2;
                if (avw0Var2 instanceof avw0.a) {
                    avw0.a aVar9 = (avw0.a) avw0Var2;
                    rp90 rp90Var2 = aVar9.b;
                    a990<Long> a990Var = aVar9.c;
                    wp90Var.getClass();
                    if (up90Var instanceof up90.c.a) {
                        aVar = new wp90.a(rp90.a(rp90Var2, EmptyList.b, null, null, null, rp90.b.a.a, null, PsExtractor.PRIVATE_STREAM_1), a990.a(a990Var, null, false, a990.a.c.a, null, 11));
                    } else if (up90Var instanceof up90.c.d) {
                        aVar = new wp90.a(rp90.a(rp90Var2, EmptyList.b, null, null, null, rp90.b.d.a, null, PsExtractor.PRIVATE_STREAM_1), a990.a(a990Var, null, false, a990.a.c.a, null, 11));
                    } else if (up90Var instanceof up90.c.C3815c) {
                        aVar = new wp90.a(rp90.a(rp90Var2, EmptyList.b, null, null, null, rp90.b.c.a, null, PsExtractor.PRIVATE_STREAM_1), a990.a(a990Var, null, false, a990.a.c.a, null, 11));
                    } else {
                        if (up90Var instanceof up90.c.b) {
                            aVar2 = new wp90.a(rp90.a(rp90Var2, EmptyList.b, null, null, null, new rp90.b.C3620b(((up90.c.b) up90Var).b), null, PsExtractor.PRIVATE_STREAM_1), a990.a(a990Var, null, false, a990.a.c.a, null, 11));
                        } else if (up90Var instanceof up90.b) {
                            up90.b bVar3 = (up90.b) up90Var;
                            aVar2 = new wp90.a(rp90.a(rp90Var2, bVar3.b, bVar3.c, null, null, null, null, 249), a990.a(a990Var, Long.valueOf(bVar3.d), bVar3.e, a990.a.b.a, null, 8));
                        } else {
                            if (!(up90Var instanceof up90.a)) {
                                throw new NoWhenBranchMatchedException();
                            }
                            aVar = new wp90.a(rp90Var2, a990.a(a990Var, null, false, new a990.a.C2530a(((up90.a) up90Var).b), null, 11));
                        }
                        aVar = aVar2;
                    }
                    return avw0.a.a(aVar9, aVar.a, aVar.b, 4);
                }
            } else if (b59Var2 instanceof vo90) {
                vo90 vo90Var = (vo90) b59Var2;
                if (avw0Var2 instanceof avw0.a) {
                    avw0.a aVar10 = (avw0.a) avw0Var2;
                    rp90 rp90Var3 = aVar10.b;
                    wp90Var.getClass();
                    if (vo90Var instanceof vo90.b) {
                        vo90.b bVar4 = (vo90.b) vo90Var;
                        a = rp90.a(rp90Var3, null, null, null, null, null, new rp90.a.b(bVar4.b, bVar4.c), 127);
                    } else {
                        if (!(vo90Var instanceof vo90.a)) {
                            throw new NoWhenBranchMatchedException();
                        }
                        a = rp90.a(rp90Var3, null, null, null, null, null, rp90.a.C3619a.a, 127);
                    }
                    return avw0.a.a(aVar10, a, null, 6);
                }
            } else if (b59Var2 instanceof x8q0) {
                x8q0 x8q0Var = (x8q0) b59Var2;
                if (avw0Var2 instanceof avw0.a) {
                    avw0.a aVar11 = (avw0.a) avw0Var2;
                    return avw0.a.a(aVar11, rp90.a(aVar11.b, x8q0Var.b, null, null, null, null, null, 253), null, 6);
                }
            } else {
                L l = L.a;
                l.getClass();
                if (!L.m(LoggerOutputTarget.NONE)) {
                    L.u(l, L.LogType.w, new Object[]{"Unknown patch = " + b59Var2});
                    return avw0Var2;
                }
            }
        }
        return avw0Var2;
    }

    @Override // xsna.dm50
    public final cvw0 d() {
        return new cvw0(e(new xlq0(8)), e(new olt0(this, 7)), e(new fxi0(14)));
    }

    @Override // xsna.dm50
    public final void h(avw0 avw0Var, cvw0 cvw0Var) {
        avw0 avw0Var2 = avw0Var;
        cvw0 cvw0Var2 = cvw0Var;
        if (avw0Var2 instanceof avw0.a) {
            f(cvw0Var2.b, avw0Var2);
        } else if (avw0Var2 instanceof avw0.c) {
            f(cvw0Var2.a, avw0Var2);
        } else {
            if (!(avw0Var2 instanceof avw0.b)) {
                throw new NoWhenBranchMatchedException();
            }
            f(cvw0Var2.c, avw0Var2);
        }
    }
}
