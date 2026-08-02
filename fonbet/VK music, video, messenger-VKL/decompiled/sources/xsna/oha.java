package xsna;

import androidx.compose.runtime.a;
import com.vk.catalog.mvi.block.music.impl.filters.MusicTabsFiltersView;
import xsna.q630;

/* compiled from: R8$$SyntheticClass */
/* loaded from: classes16.dex */
public final /* synthetic */ class oha implements yzs {
    public final /* synthetic */ int b;
    public final /* synthetic */ izs c;
    public final /* synthetic */ Object d;

    public /* synthetic */ oha(int i, Object obj, izs izsVar) {
        this.b = i;
        this.d = obj;
        this.c = izsVar;
    }

    @Override // xsna.yzs
    public final Object invoke(Object obj, Object obj2, Object obj3) {
        switch (this.b) {
            case 0:
                MusicTabsFiltersView.f fVar = (MusicTabsFiltersView.f) this.d;
                k1i0 k1i0Var = (k1i0) obj;
                androidx.compose.runtime.a aVar = (androidx.compose.runtime.a) obj2;
                int intValue = ((Integer) obj3).intValue();
                if ((intValue & 6) == 0) {
                    intValue |= aVar.J(k1i0Var) ? 4 : 2;
                }
                if (aVar.t(intValue & 1, (intValue & 19) != 18)) {
                    if (androidx.compose.runtime.b.d()) {
                        androidx.compose.runtime.b.f(-1873589274, intValue, -1, "com.vk.catalog.mvi.block.music.impl.filters.ui.CatalogTabFilterView.<anonymous>.<anonymous> (CatalogTabsFiltersView.kt:33)");
                    }
                    for (final MusicTabsFiltersView.e eVar : fVar.c) {
                        boolean z = eVar.c;
                        boolean J = aVar.J(eVar) | aVar.J(fVar);
                        Object obj4 = this.c;
                        boolean J2 = J | aVar.J(obj4);
                        Object x = aVar.x();
                        if (J2 || x == a.C0011a.a) {
                            x = new k14(eVar, fVar, obj4, 2);
                            aVar.R(x);
                        }
                        k1i0Var.b(z, (gzs) x, kai.c(-224448850, new zzs() { // from class: xsna.nha
                            @Override // xsna.zzs
                            public final Object invoke(Object obj5, Object obj6, Object obj7, Object obj8) {
                                long j;
                                boolean booleanValue = ((Boolean) obj6).booleanValue();
                                androidx.compose.runtime.a aVar2 = (androidx.compose.runtime.a) obj7;
                                int intValue2 = ((Integer) obj8).intValue();
                                if ((intValue2 & 48) == 0) {
                                    intValue2 |= aVar2.l(booleanValue) ? 32 : 16;
                                }
                                if (aVar2.t(intValue2 & 1, (intValue2 & 145) != 144)) {
                                    if (androidx.compose.runtime.b.d()) {
                                        androidx.compose.runtime.b.f(-224448850, intValue2, -1, "com.vk.catalog.mvi.block.music.impl.filters.ui.CatalogTabFilterView.<anonymous>.<anonymous>.<anonymous>.<anonymous> (CatalogTabsFiltersView.kt:47)");
                                    }
                                    String str = MusicTabsFiltersView.e.this.b;
                                    if (booleanValue) {
                                        aVar2.K(-946974503);
                                        if (androidx.compose.runtime.b.d()) {
                                            androidx.compose.runtime.b.f(1040687336, 0, -1, "com.vk.core.compose.theme.VkTheme.<get-colors> (VkTheme.kt:160)");
                                        }
                                        ylu0 ylu0Var = (ylu0) aVar2.r(rrv0.a);
                                        if (androidx.compose.runtime.b.d()) {
                                            androidx.compose.runtime.b.e();
                                        }
                                        j = ylu0Var.getText().m;
                                    } else {
                                        aVar2.K(-946973317);
                                        if (androidx.compose.runtime.b.d()) {
                                            androidx.compose.runtime.b.f(1040687336, 0, -1, "com.vk.core.compose.theme.VkTheme.<get-colors> (VkTheme.kt:160)");
                                        }
                                        ylu0 ylu0Var2 = (ylu0) aVar2.r(rrv0.a);
                                        if (androidx.compose.runtime.b.d()) {
                                            androidx.compose.runtime.b.e();
                                        }
                                        j = ylu0Var2.getText().p;
                                    }
                                    aVar2.j();
                                    if (androidx.compose.runtime.b.d()) {
                                        androidx.compose.runtime.b.f(-473561179, 0, -1, "com.vk.core.compose.theme.VkTheme.<get-typography> (VkTheme.kt:165)");
                                    }
                                    wuv0 wuv0Var = (wuv0) aVar2.r(rrv0.c);
                                    if (androidx.compose.runtime.b.d()) {
                                        androidx.compose.runtime.b.e();
                                    }
                                    yqv0.c(str, null, j, null, null, 0, 0, null, 0, false, 0, 0, null, wuv0Var.O, aVar2, 0, 0, 8186);
                                    if (androidx.compose.runtime.b.d()) {
                                        androidx.compose.runtime.b.e();
                                    }
                                } else {
                                    aVar2.h();
                                }
                                return s3q0.a;
                            }
                        }, aVar), ahn.E(q630.a.a, "music_tab_filter_tag"), aVar, ((intValue << 12) & 57344) | 3456, 0);
                    }
                    if (androidx.compose.runtime.b.d()) {
                        androidx.compose.runtime.b.e();
                    }
                } else {
                    aVar.h();
                }
                break;
            default:
                ivs ivsVar = (ivs) this.d;
                q630 q630Var = (q630) obj;
                androidx.compose.runtime.a aVar2 = (androidx.compose.runtime.a) obj2;
                int intValue2 = ((Integer) obj3).intValue();
                if ((intValue2 & 6) == 0) {
                    intValue2 |= aVar2.J(q630Var) ? 4 : 2;
                }
                if (aVar2.t(intValue2 & 1, (intValue2 & 19) != 18)) {
                    if (androidx.compose.runtime.b.d()) {
                        androidx.compose.runtime.b.f(-1037780822, intValue2, -1, "com.vk.music.stickyplayer.presentation.RedesignedMusicWithBottomPlayer.<anonymous> (PlayerContentView.kt:79)");
                    }
                    k0b0.a(ivsVar, this.c, q630Var, aVar2, (intValue2 << 6) & 896);
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
