package xsna;

import androidx.compose.runtime.a;
import com.ironsource.mediationsdk.logger.IronSourceError;
import java.util.ArrayList;
import xsna.psn0;

/* compiled from: GoodDescriptionTabsContent.kt */
/* loaded from: classes18.dex */
public final class r4u {
    public static final void a(final int i, final ArrayList arrayList, final izs izsVar, androidx.compose.runtime.a aVar, final int i2) {
        androidx.compose.runtime.a M = aVar.M(-2124241288);
        int i3 = (M.o(i) ? 4 : 2) | i2 | (M.J(arrayList) ? 32 : 16);
        if (M.t(i3 & 1, (i3 & 147) != 146)) {
            if (androidx.compose.runtime.b.d()) {
                androidx.compose.runtime.b.f(-2124241288, i3, -1, "com.vk.ecomm.market.good.ui.holder.description.ui.GoodDescriptionTabsContent (GoodDescriptionTabsContent.kt:14)");
            }
            ziv0.b(i, kai.c(-1497180930, new yzs() { // from class: xsna.o4u
                /* JADX WARN: Multi-variable type inference failed */
                @Override // xsna.yzs
                public final Object invoke(Object obj, Object obj2, Object obj3) {
                    ArrayList arrayList2;
                    boolean z;
                    k1i0 k1i0Var = (k1i0) obj;
                    androidx.compose.runtime.a aVar2 = (androidx.compose.runtime.a) obj2;
                    int intValue = ((Integer) obj3).intValue();
                    if ((intValue & 6) == 0) {
                        intValue |= aVar2.J(k1i0Var) ? 4 : 2;
                    }
                    int i4 = intValue;
                    int i5 = 0;
                    if (aVar2.t(i4 & 1, (i4 & 19) != 18)) {
                        if (androidx.compose.runtime.b.d()) {
                            androidx.compose.runtime.b.f(-1497180930, i4, -1, "com.vk.ecomm.market.good.ui.holder.description.ui.GoodDescriptionTabsContent.<anonymous> (GoodDescriptionTabsContent.kt:18)");
                        }
                        ArrayList arrayList3 = arrayList;
                        int size = arrayList3.size();
                        int i6 = 0;
                        while (i6 < size) {
                            int intValue2 = ((Number) arrayList3.get(i6)).intValue();
                            if (i6 == i) {
                                arrayList2 = arrayList3;
                                z = 1;
                            } else {
                                arrayList2 = arrayList3;
                                z = i5;
                            }
                            Object obj4 = izsVar;
                            boolean J = aVar2.J(obj4) | aVar2.o(i6);
                            Object x = aVar2.x();
                            Object obj5 = a.C0011a.a;
                            if (J || x == obj5) {
                                x = new q4u(obj4, i6, 0);
                                aVar2.R(x);
                            }
                            gzs<s3q0> gzsVar = (gzs) x;
                            String N = d370.N(intValue2, i5, aVar2);
                            if (androidx.compose.runtime.b.d()) {
                                androidx.compose.runtime.b.f(1591975853, 48, -1, "com.vk.core.compose.component.tabs.TabItem.Middle.Text.Companion.invoke (VkTabItem.kt:181)");
                            }
                            Object x2 = aVar2.x();
                            if (x2 == obj5) {
                                x2 = new psn0.a(N);
                                aVar2.R(x2);
                            }
                            psn0.a aVar3 = (psn0.a) x2;
                            ((zak0) aVar3.b).setValue(N);
                            if (androidx.compose.runtime.b.d()) {
                                androidx.compose.runtime.b.e();
                            }
                            k1i0Var.c(z, gzsVar, null, aVar3, null, null, null, aVar2, (i4 << 21) & 29360128, 116);
                            i6++;
                            size = size;
                            arrayList3 = arrayList2;
                            i5 = 0;
                        }
                        if (androidx.compose.runtime.b.d()) {
                            androidx.compose.runtime.b.e();
                        }
                    } else {
                        aVar2.h();
                    }
                    return s3q0.a;
                }
            }, M), null, 0L, false, null, null, null, false, M, (i3 & 14) | 48, IronSourceError.ERROR_CODE_INIT_FAILED);
            if (androidx.compose.runtime.b.d()) {
                androidx.compose.runtime.b.e();
            }
        } else {
            M.h();
        }
        androidx.compose.runtime.f s = M.s();
        if (s != null) {
            s.d = new wzs(i, arrayList, izsVar, i2) { // from class: xsna.p4u
                public final /* synthetic */ int b;
                public final /* synthetic */ ArrayList c;
                public final /* synthetic */ izs d;

                @Override // xsna.wzs
                public final Object invoke(Object obj, Object obj2) {
                    ((Integer) obj2).getClass();
                    int I = ne7.I(385);
                    r4u.a(this.b, this.c, this.d, (androidx.compose.runtime.a) obj, I);
                    return s3q0.a;
                }
            };
        }
    }
}
