package xsna;

import com.unity3d.services.UnityAdsConstants;
import com.vk.core.serialize.Serializer;
import com.vk.dto.music.Thumb;
import xsna.chs;
import xsna.q630;

/* compiled from: MusicTrackImage.kt */
/* loaded from: classes3.dex */
public final class bc50 {
    public static final void a(final Object obj, final q630 q630Var, float f, yzs<? super q630, ? super androidx.compose.runtime.a, ? super Integer, s3q0> yzsVar, androidx.compose.runtime.a aVar, final int i, final int i2) {
        int i3;
        final float f2;
        final yzs<? super q630, ? super androidx.compose.runtime.a, ? super Integer, s3q0> yzsVar2;
        androidx.compose.runtime.a M = aVar.M(1402524818);
        if ((i & 6) == 0) {
            i3 = (M.J(obj) ? 4 : 2) | i;
        } else {
            i3 = i;
        }
        if ((i & 48) == 0) {
            i3 |= M.J(q630Var) ? 32 : 16;
        }
        int i4 = i2 & 4;
        if (i4 != 0) {
            i3 |= 384;
        } else if ((i & 384) == 0) {
            i3 |= M.n(f) ? 256 : 128;
        }
        int i5 = i3 | 3072;
        if (M.t(i5 & 1, (i5 & 1171) != 1170)) {
            final float f3 = i4 != 0 ? 4 : f;
            jai jaiVar = mnh0.e;
            if (androidx.compose.runtime.b.d()) {
                androidx.compose.runtime.b.f(1402524818, i5, -1, "com.vk.music.bottomsheets.track.redesigned.presentation.components.MusicTrackImage (MusicTrackImage.kt:29)");
            }
            ua8.a(rte0.d(sua.d(1.0f, q630Var, false), vog0.b(f3)), null, false, kai.c(-1862212248, new yzs() { // from class: xsna.yb50
                @Override // xsna.yzs
                public final Object invoke(Object obj2, Object obj3, Object obj4) {
                    String str;
                    jai jaiVar2 = mnh0.e;
                    va8 va8Var = (va8) obj2;
                    androidx.compose.runtime.a aVar2 = (androidx.compose.runtime.a) obj3;
                    int intValue = ((Integer) obj4).intValue();
                    if ((intValue & 6) == 0) {
                        intValue |= aVar2.J(va8Var) ? 4 : 2;
                    }
                    if (aVar2.t(intValue & 1, (intValue & 19) != 18)) {
                        if (androidx.compose.runtime.b.d()) {
                            androidx.compose.runtime.b.f(-1862212248, intValue, -1, "com.vk.music.bottomsheets.track.redesigned.presentation.components.MusicTrackImage.<anonymous> (MusicTrackImage.kt:36)");
                        }
                        float j = va8Var.j();
                        if (androidx.compose.runtime.b.d()) {
                            androidx.compose.runtime.b.f(856414703, 0, -1, "com.vk.music.bottomsheets.track.redesigned.presentation.components.getForSizeOrEmpty (MusicTrackImage.kt:86)");
                        }
                        Thumb thumb = (Thumb) obj;
                        if (androidx.compose.runtime.b.d()) {
                            androidx.compose.runtime.b.f(-2077561241, 0, -1, "com.vk.music.bottomsheets.track.redesigned.presentation.components.getForSizeOrEmpty (MusicTrackImage.kt:90)");
                        }
                        azl azlVar = (azl) aVar2.r(uvi.h);
                        if (thumb != null) {
                            int I0 = (int) azlVar.I0(j);
                            Serializer.c<Thumb> cVar = Thumb.CREATOR;
                            str = thumb.Ab(I0, false);
                        } else {
                            str = null;
                        }
                        if (str == null) {
                            str = "";
                        }
                        if (androidx.compose.runtime.b.d()) {
                            androidx.compose.runtime.b.e();
                        }
                        if (androidx.compose.runtime.b.d()) {
                            androidx.compose.runtime.b.e();
                        }
                        int length = str.length();
                        q630.a aVar3 = q630.a.a;
                        final float f4 = f3;
                        if (length == 0) {
                            aVar2.K(927578645);
                            q630 d = txj0.d(aVar3, 1.0f);
                            if (androidx.compose.runtime.b.d()) {
                                androidx.compose.runtime.b.f(1040687336, 0, -1, "com.vk.core.compose.theme.VkTheme.<get-colors> (VkTheme.kt:160)");
                            }
                            ylu0 ylu0Var = (ylu0) aVar2.r(rrv0.a);
                            if (androidx.compose.runtime.b.d()) {
                                androidx.compose.runtime.b.e();
                            }
                            f9t.e(hr80.m(d, ylu0Var.getBackground().z, vog0.b(f4)), aVar2, 0);
                            aVar2.j();
                        } else {
                            aVar2.K(927909942);
                            fwu0.c(txj0.d(aVar3, 1.0f), null, str, null, null, null, null, kai.c(-15550499, new a0t() { // from class: xsna.ac50
                                @Override // xsna.a0t
                                public final Object invoke(Object obj5, Object obj6, Object obj7, Object obj8, Object obj9) {
                                    int i6;
                                    chs chsVar = (chs) obj6;
                                    lg90 lg90Var = (lg90) obj7;
                                    androidx.compose.runtime.a aVar4 = (androidx.compose.runtime.a) obj8;
                                    int intValue2 = ((Integer) obj9).intValue();
                                    if ((intValue2 & 48) == 0) {
                                        i6 = (aVar4.J(chsVar) ? 32 : 16) | intValue2;
                                    } else {
                                        i6 = intValue2;
                                    }
                                    if ((intValue2 & 384) == 0) {
                                        i6 |= (intValue2 & 512) == 0 ? aVar4.J(lg90Var) : aVar4.y(lg90Var) ? 256 : 128;
                                    }
                                    if (aVar4.t(i6 & 1, (i6 & 1169) != 1168)) {
                                        if (androidx.compose.runtime.b.d()) {
                                            androidx.compose.runtime.b.f(-15550499, i6, -1, "com.vk.music.bottomsheets.track.redesigned.presentation.components.MusicTrackImage.<anonymous>.<anonymous> (MusicTrackImage.kt:50)");
                                        }
                                        boolean z = chsVar instanceof chs.b;
                                        q630.a aVar5 = q630.a.a;
                                        float f5 = f4;
                                        if (z || (chsVar instanceof chs.a) || (chsVar instanceof chs.c)) {
                                            aVar4.K(591758752);
                                            q630 d2 = txj0.d(aVar5, 1.0f);
                                            if (androidx.compose.runtime.b.d()) {
                                                androidx.compose.runtime.b.f(1040687336, 0, -1, "com.vk.core.compose.theme.VkTheme.<get-colors> (VkTheme.kt:160)");
                                            }
                                            ylu0 ylu0Var2 = (ylu0) aVar4.r(rrv0.a);
                                            if (androidx.compose.runtime.b.d()) {
                                                androidx.compose.runtime.b.e();
                                            }
                                            f9t.e(hr80.m(d2, ylu0Var2.getBackground().z, vog0.b(f5)), aVar4, 0);
                                            aVar4.j();
                                        } else {
                                            aVar4.K(592180879);
                                            q630 d3 = txj0.d(aVar5, 1.0f);
                                            float f6 = (float) 0.5d;
                                            if (androidx.compose.runtime.b.d()) {
                                                androidx.compose.runtime.b.f(1040687336, 0, -1, "com.vk.core.compose.theme.VkTheme.<get-colors> (VkTheme.kt:160)");
                                            }
                                            ylu0 ylu0Var3 = (ylu0) aVar4.r(rrv0.a);
                                            if (androidx.compose.runtime.b.d()) {
                                                androidx.compose.runtime.b.e();
                                            }
                                            y18 a = aqw.a(f6, ylu0Var3.getImage().a);
                                            vjw.a(lg90Var, null, rte0.d(r18.b(a.a, a.b, d3, vog0.b(f5)), vog0.b(f5)), null, null, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, null, aVar4, 56 | ((i6 >> 6) & 14), 120);
                                            aVar4.j();
                                        }
                                        if (androidx.compose.runtime.b.d()) {
                                            androidx.compose.runtime.b.e();
                                        }
                                    } else {
                                        aVar4.h();
                                    }
                                    return s3q0.a;
                                }
                            }, aVar2), aVar2, 100663302, 250);
                            aVar2.j();
                        }
                        jaiVar2.invoke(txj0.d(q630Var, 1.0f), aVar2, 0);
                        if (androidx.compose.runtime.b.d()) {
                            androidx.compose.runtime.b.e();
                        }
                    } else {
                        aVar2.h();
                    }
                    return s3q0.a;
                }
            }, M), M, 3072, 6);
            if (androidx.compose.runtime.b.d()) {
                androidx.compose.runtime.b.e();
            }
            yzsVar2 = jaiVar;
            f2 = f3;
        } else {
            M.h();
            f2 = f;
            yzsVar2 = yzsVar;
        }
        androidx.compose.runtime.f s = M.s();
        if (s != null) {
            s.d = new wzs() { // from class: xsna.zb50
                @Override // xsna.wzs
                public final Object invoke(Object obj2, Object obj3) {
                    ((Integer) obj3).getClass();
                    bc50.a(obj, q630Var, f2, yzsVar2, (androidx.compose.runtime.a) obj2, ne7.I(i | 1), i2);
                    return s3q0.a;
                }
            };
        }
    }
}
