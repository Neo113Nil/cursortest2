package xsna;

import androidx.compose.runtime.a;
import com.vk.clips.upload.vk.ui.impl.fragment.ClipsUploadFragmentImpl;
import com.vk.clips.upload.vk.ui.impl.fragment.ClipsUploadFragmentImpl$onCreateView$1$1$stateHolder$1$1;
import com.vk.clips.upload.vk.ui.impl.fragment.ClipsUploadFragmentImpl.f;
import com.vungle.ads.internal.protos.Sdk;
import xsna.sga;

/* compiled from: R8$$SyntheticClass */
/* loaded from: classes16.dex */
public final /* synthetic */ class mga implements wzs {
    public final /* synthetic */ int b;
    public final /* synthetic */ Object c;
    public final /* synthetic */ Object d;
    public final /* synthetic */ Object e;
    public final /* synthetic */ Object f;
    public final /* synthetic */ Object g;

    public /* synthetic */ mga(Object obj, Object obj2, Object obj3, Object obj4, Object obj5, int i) {
        this.b = i;
        this.c = obj;
        this.d = obj2;
        this.e = obj3;
        this.f = obj4;
        this.g = obj5;
    }

    @Override // xsna.wzs
    public final Object invoke(Object obj, Object obj2) {
        int i = this.b;
        Object obj3 = this.g;
        Object obj4 = this.f;
        Object obj5 = this.e;
        Object obj6 = this.d;
        Object obj7 = this.c;
        int i2 = 1;
        switch (i) {
            case 0:
                rga rgaVar = (rga) obj7;
                sga sgaVar = (sga) obj6;
                izs izsVar = (izs) obj5;
                jai jaiVar = (jai) obj4;
                tpr tprVar = (tpr) obj3;
                androidx.compose.runtime.a aVar = (androidx.compose.runtime.a) obj;
                int intValue = ((Integer) obj2).intValue();
                if (aVar.t(intValue & 1, (intValue & 3) != 2)) {
                    if (androidx.compose.runtime.b.d()) {
                        androidx.compose.runtime.b.f(851254810, intValue, -1, "com.vk.catalog.mvi.section.impl.ui.view.CatalogSectionViewImpl.Content.<anonymous> (CatalogSectionViewImpl.kt:153)");
                    }
                    rgaVar.f((sga.a) sgaVar, izsVar, kai.c(-1241346516, new zl3(jaiVar, sgaVar, tprVar, i2), aVar), aVar, 384);
                    if (androidx.compose.runtime.b.d()) {
                        androidx.compose.runtime.b.e();
                    }
                } else {
                    aVar.h();
                }
                break;
            default:
                final ClipsUploadFragmentImpl clipsUploadFragmentImpl = (ClipsUploadFragmentImpl) obj7;
                hjf hjfVar = (hjf) obj6;
                final ClipsUploadFragmentImpl$onCreateView$1$1$stateHolder$1$1 clipsUploadFragmentImpl$onCreateView$1$1$stateHolder$1$1 = (ClipsUploadFragmentImpl$onCreateView$1$1$stateHolder$1$1) obj5;
                final ahf ahfVar = (ahf) obj4;
                final fgf fgfVar = (fgf) obj3;
                androidx.compose.runtime.a aVar2 = (androidx.compose.runtime.a) obj;
                int intValue2 = ((Integer) obj2).intValue();
                String str = ClipsUploadFragmentImpl.a0;
                if (aVar2.t(intValue2 & 1, (intValue2 & 3) != 2)) {
                    if (androidx.compose.runtime.b.d()) {
                        androidx.compose.runtime.b.f(-1433203430, intValue2, -1, "com.vk.clips.upload.vk.ui.impl.fragment.ClipsUploadFragmentImpl.onCreateView.<anonymous>.<anonymous>.<anonymous> (ClipsUploadFragmentImpl.kt:246)");
                    }
                    boolean J = aVar2.J(clipsUploadFragmentImpl) | aVar2.y(hjfVar);
                    Object x = aVar2.x();
                    a.C0011a.C0012a c0012a = a.C0011a.a;
                    if (J || x == c0012a) {
                        x = new n40(26, clipsUploadFragmentImpl, hjfVar);
                        aVar2.R(x);
                    }
                    izs izsVar2 = (izs) x;
                    boolean J2 = aVar2.J(clipsUploadFragmentImpl) | aVar2.y(hjfVar);
                    Object x2 = aVar2.x();
                    if (J2 || x2 == c0012a) {
                        x2 = clipsUploadFragmentImpl.new f(hjfVar, null);
                        aVar2.R(x2);
                    }
                    r37.a(izsVar2, (yzs) x2, kai.c(2012007778, new zzs() { // from class: xsna.qff
                        @Override // xsna.zzs
                        public final Object invoke(Object obj8, Object obj9, Object obj10, Object obj11) {
                            z37<lbf> z37Var = (z37) obj8;
                            androidx.compose.runtime.a aVar3 = (androidx.compose.runtime.a) obj10;
                            int intValue3 = ((Integer) obj11).intValue();
                            String str2 = ClipsUploadFragmentImpl.a0;
                            if ((intValue3 & 6) == 0) {
                                intValue3 |= aVar3.J(z37Var) ? 4 : 2;
                            }
                            if (aVar3.t(intValue3 & 1, (intValue3 & Sdk.SDKError.Reason.MRAID_JS_WRITE_FAILED_VALUE) != 130)) {
                                if (androidx.compose.runtime.b.d()) {
                                    androidx.compose.runtime.b.f(2012007778, intValue3, -1, "com.vk.clips.upload.vk.ui.impl.fragment.ClipsUploadFragmentImpl.onCreateView.<anonymous>.<anonymous>.<anonymous>.<anonymous> (ClipsUploadFragmentImpl.kt:251)");
                                }
                                pqo pqoVar = pvz.a;
                                ClipsUploadFragmentImpl clipsUploadFragmentImpl2 = ClipsUploadFragmentImpl.this;
                                c9e0 b = pqoVar.b(clipsUploadFragmentImpl2);
                                ahf ahfVar2 = ahfVar;
                                ClipsUploadFragmentImpl$onCreateView$1$1$stateHolder$1$1 clipsUploadFragmentImpl$onCreateView$1$1$stateHolder$1$12 = clipsUploadFragmentImpl$onCreateView$1$1$stateHolder$1$1;
                                rvi.a(b, kai.c(205328930, new uff(ahfVar2, clipsUploadFragmentImpl$onCreateView$1$1$stateHolder$1$12, fgfVar), aVar3), aVar3, 56);
                                clipsUploadFragmentImpl2.eo(z37Var, clipsUploadFragmentImpl$onCreateView$1$1$stateHolder$1$12.c, aVar3, intValue3 & 14);
                                if (androidx.compose.runtime.b.d()) {
                                    androidx.compose.runtime.b.e();
                                }
                            } else {
                                aVar3.h();
                            }
                            return s3q0.a;
                        }
                    }, aVar2), aVar2, 384, 0);
                    if (androidx.compose.runtime.b.d()) {
                        androidx.compose.runtime.b.e();
                    }
                } else {
                    aVar2.h();
                }
                break;
        }
        return s3q0.a;
    }
}
