package xsna;

import androidx.compose.runtime.a;

/* compiled from: PrimaryBlock.kt */
/* loaded from: classes17.dex */
public interface k7d0 {

    /* compiled from: PrimaryBlock.kt */
    public static abstract class a implements k7d0 {

        /* compiled from: PrimaryBlock.kt */
        /* renamed from: xsna.k7d0$a$a, reason: collision with other inner class name */
        public static final class C3167a {
            public static cdh a(String str, String str2, gzs gzsVar, androidx.compose.runtime.a aVar) {
                if (androidx.compose.runtime.b.d()) {
                    androidx.compose.runtime.b.f(163683606, 24576, -1, "com.vk.community.design.compose.primaryblock.PrimaryBlock.InfoBlock.AdsPromotion.Companion.invoke (PrimaryBlock.kt:279)");
                }
                if (androidx.compose.runtime.b.d()) {
                    androidx.compose.runtime.b.f(144720468, 6, -1, "com.vk.community.design.compose.primaryblock.remember (CommunityPrimaryBlockAdsPromotionImpl.kt:91)");
                }
                Object x = aVar.x();
                if (x == a.C0011a.a) {
                    x = new cdh(str, str2, gzsVar);
                    aVar.R(x);
                }
                cdh cdhVar = (cdh) x;
                ((zak0) cdhVar.a).setValue(str);
                ((zak0) cdhVar.b).setValue(str2);
                ((zak0) cdhVar.c).setValue(gzsVar);
                ((zak0) cdhVar.d).setValue(null);
                if (androidx.compose.runtime.b.d()) {
                    androidx.compose.runtime.b.e();
                }
                if (androidx.compose.runtime.b.d()) {
                    androidx.compose.runtime.b.e();
                }
                return cdhVar;
            }
        }
    }

    void a(q630 q630Var, androidx.compose.runtime.a aVar, int i);
}
