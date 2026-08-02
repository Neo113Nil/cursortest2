package androidx.compose.foundation.gestures;

import defpackage.fwi;
import defpackage.gb30;
import defpackage.k631;
import defpackage.kjj;
import defpackage.ma91;
import defpackage.ni9;
import defpackage.ny61;
import defpackage.oi9;
import defpackage.p801;
import defpackage.plu;
import defpackage.pzt0;
import defpackage.qv10;
import defpackage.rrq0;
import defpackage.sb2;
import defpackage.tvd0;
import defpackage.vrq0;
import defpackage.wls;
import defpackage.zvd0;
import defpackage.zy11;
import java.util.List;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.jvm.internal.Ref$ObjectRef;
import ru.CryptoPro.JCP.ASN.Gost_CryptoPro_PrivateKey._Gost_CryptoPro_PrivateKeyValues;

/* loaded from: classes10.dex */
public final class a0 extends r {
    public final kotlinx.coroutines.channels.a f;
    public pzt0 g;

    public a0(y yVar, wls wlsVar, fwi fwiVar) {
        super(yVar, wlsVar, fwiVar);
        this.f = sb2.a(Integer.MAX_VALUE, null, null, 6);
    }

    /* JADX WARN: Code restructure failed: missing block: B:18:0x00cb, code lost:
    
        if (r0.invoke(r3, r4) != r5) goto L25;
     */
    /* JADX WARN: Code restructure failed: missing block: B:19:0x00cd, code lost:
    
        return r5;
     */
    /* JADX WARN: Code restructure failed: missing block: B:24:0x00a8, code lost:
    
        if (r18.b(r1, r4) == r5) goto L24;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:20:0x0041  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x002e  */
    /* JADX WARN: Type inference failed for: r1v7, types: [T, p801] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final Object c(a0 a0Var, y yVar, p801 p801Var, ContinuationImpl continuationImpl) {
        TrackpadScrollingLogic$dispatchTrackpadScroll$1 trackpadScrollingLogic$dispatchTrackpadScroll$1;
        int i;
        a0Var.getClass();
        kjj kjjVar = a0Var.e;
        if (continuationImpl instanceof TrackpadScrollingLogic$dispatchTrackpadScroll$1) {
            trackpadScrollingLogic$dispatchTrackpadScroll$1 = (TrackpadScrollingLogic$dispatchTrackpadScroll$1) continuationImpl;
            int i2 = trackpadScrollingLogic$dispatchTrackpadScroll$1.label;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                trackpadScrollingLogic$dispatchTrackpadScroll$1.label = i2 - Integer.MIN_VALUE;
                Object obj = trackpadScrollingLogic$dispatchTrackpadScroll$1.result;
                Object obj2 = CoroutineSingletons.COROUTINE_SUSPENDED;
                i = trackpadScrollingLogic$dispatchTrackpadScroll$1.label;
                if (i != 0) {
                    Ref$ObjectRef z = qv10.z(obj);
                    z.element = p801Var;
                    long j = p801Var.b;
                    long j2 = p801Var.a;
                    kjjVar.a.a(Float.intBitsToFloat((int) (j2 >> 32)), j);
                    kjjVar.b.a(Float.intBitsToFloat((int) (j2 & _Gost_CryptoPro_PrivateKeyValues.maxDWORD)), j);
                    p801 e = e(a0Var.f);
                    if (e != null) {
                        long j3 = e.b;
                        long j4 = e.a;
                        kjjVar.a.a(Float.intBitsToFloat((int) (j4 >> 32)), j3);
                        kjjVar.b.a(Float.intBitsToFloat((int) (j4 & _Gost_CryptoPro_PrivateKeyValues.maxDWORD)), j3);
                        z.element = ((p801) z.element).a(e);
                    }
                    wls trackpadScrollingLogic$dispatchTrackpadScroll$3 = new TrackpadScrollingLogic$dispatchTrackpadScroll$3(a0Var, yVar, z, null);
                    trackpadScrollingLogic$dispatchTrackpadScroll$1.label = 1;
                } else {
                    if (i != 1) {
                        if (i == 2) {
                            kotlin.b.b(obj);
                            return zy11.a;
                        }
                        ny61.r("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    kotlin.b.b(obj);
                }
                wls wlsVar = a0Var.b;
                k631 k631Var = new k631(ma91.a(kjjVar.a.b(Float.MAX_VALUE), kjjVar.b.b(Float.MAX_VALUE)));
                trackpadScrollingLogic$dispatchTrackpadScroll$1.label = 2;
            }
        }
        trackpadScrollingLogic$dispatchTrackpadScroll$1 = new TrackpadScrollingLogic$dispatchTrackpadScroll$1(a0Var, continuationImpl);
        Object obj3 = trackpadScrollingLogic$dispatchTrackpadScroll$1.result;
        Object obj22 = CoroutineSingletons.COROUTINE_SUSPENDED;
        i = trackpadScrollingLogic$dispatchTrackpadScroll$1.label;
        if (i != 0) {
        }
        wls wlsVar2 = a0Var.b;
        k631 k631Var2 = new k631(ma91.a(kjjVar.a.b(Float.MAX_VALUE), kjjVar.b.b(Float.MAX_VALUE)));
        trackpadScrollingLogic$dispatchTrackpadScroll$1.label = 2;
    }

    public static p801 e(kotlinx.coroutines.channels.a aVar) {
        p801 p801Var = null;
        rrq0 a = vrq0.a(new NonTouchScrollingLogicKt$untilNull$1(new gb30(aVar, 1), null));
        while (a.hasNext()) {
            p801 p801Var2 = (p801) a.next();
            if (p801Var != null) {
                p801Var2 = p801Var.a(p801Var2);
            }
            p801Var = p801Var2;
        }
        return p801Var;
    }

    public final boolean d(tvd0 tvd0Var) {
        boolean z;
        boolean z2;
        boolean z3;
        kotlinx.coroutines.channels.a aVar;
        y yVar;
        zvd0 zvd0Var = (zvd0) kotlin.collections.a.R(tvd0Var.a);
        if (zvd0Var != null) {
            List c = zvd0Var.c();
            int size = c.size();
            int i = 0;
            z3 = false;
            while (true) {
                aVar = this.f;
                yVar = this.a;
                if (i >= size) {
                    break;
                }
                plu pluVar = (plu) c.get(i);
                long j = pluVar.d ^ (-9223372034707292160L);
                if (!(yVar.i(yVar.e(j)) == 0.0f)) {
                    Object d = aVar.d(new p801(j, pluVar.a, false));
                    ni9 ni9Var = oi9.b;
                    z3 = !(d instanceof ni9) || z3;
                }
                i++;
            }
            z = true;
            z2 = false;
            long j2 = zvd0Var.l ^ (-9223372034707292160L);
            boolean z4 = tvd0Var.f == 12;
            if (!(yVar.i(yVar.e(j2)) == 0.0f) || z4) {
                Object d2 = aVar.d(new p801(j2, zvd0Var.b, z4));
                ni9 ni9Var2 = oi9.b;
                if (!(d2 instanceof ni9) || z3) {
                    z3 = true;
                }
            }
            return (!z3 || this.d) ? z : z2;
        }
        z = true;
        z2 = false;
        z3 = z2;
        if (z3) {
        }
    }
}
