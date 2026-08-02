package defpackage;

import com.yandex.go.places.models.data.entities.network.bottom_panel.BottomPanelButtonDto;
import com.yandex.go.places.models.data.entities.network.bottom_panel.BottomPanelContentDto;
import com.yandex.go.places.models.data.entities.network.bottom_panel.BrowserInfoAttributesDto;
import com.yandex.go.places.models.data.entities.network.bottom_panel.OrganizationCardAnalyticsParams;
import com.yandex.go.places.models.data.entities.network.bottom_panel.PromoDetailsDto;
import com.yandex.go.places.models.data.entities.network.bottom_panel.PromoInfoDto;
import com.yandex.go.places.models.data.entities.network.bottom_panel.k;
import com.yandex.go.places.models.data.entities.network.map.e;
import com.yandex.go.places.models.domain.entities.bottom_panel.BottomPanelButtonSize;
import com.yandex.go.places.models.domain.entities.bottom_panel.BottomPanelButtonType;
import com.yandex.go.places.organization.card.impl.ui.card.flex.v2.b;
import com.yandex.go.places.organization.card.impl.ui.card.flex.v2.c;
import java.util.ArrayList;
import java.util.List;
import kotlinx.serialization.KSerializer;

/* loaded from: classes13.dex */
public final class fe80 implements e9c0 {
    public final /* synthetic */ int a = 1;
    public final String b;
    public final String c;
    public final KSerializer d;
    public final Object e;
    public Object f;

    public fe80(de6 de6Var, c cVar) {
        KSerializer serializer = BottomPanelContentDto.Companion.serializer();
        this.b = "bottom_panel_field";
        this.c = "bottomPanelSharedDataParser";
        this.d = serializer;
        this.e = de6Var;
        this.f = cVar;
    }

    @Override // defpackage.e9c0
    public final String a() {
        switch (this.a) {
        }
        return this.c;
    }

    @Override // defpackage.e9c0
    public final void b(Object obj) {
        OrganizationCardAnalyticsParams organizationCardAnalyticsParams;
        il6 il6Var;
        ud6 ud6Var;
        fr c;
        BottomPanelButtonType bottomPanelButtonType;
        BottomPanelButtonSize bottomPanelButtonSize;
        BottomPanelButtonSize bottomPanelButtonSize2;
        BottomPanelButtonType bottomPanelButtonType2;
        ti80 ti80Var;
        int i = this.a;
        Object obj2 = this.e;
        be6 be6Var = null;
        switch (i) {
            case 0:
                BottomPanelContentDto bottomPanelContentDto = obj instanceof BottomPanelContentDto ? (BottomPanelContentDto) obj : null;
                if (bottomPanelContentDto != null) {
                    de6 de6Var = (de6) obj2;
                    de6Var.getClass();
                    BrowserInfoAttributesDto browserInfoAttributesDto = bottomPanelContentDto.a;
                    if (browserInfoAttributesDto != null) {
                        de6Var.b.getClass();
                        String str = browserInfoAttributesDto.a;
                        if (evu0.J(str)) {
                            str = null;
                        }
                        String str2 = browserInfoAttributesDto.b;
                        if (str2 == null || evu0.J(str2)) {
                            str2 = null;
                        }
                        il6Var = new il6(str, str2);
                    } else {
                        il6Var = null;
                    }
                    List<BottomPanelButtonDto> list = bottomPanelContentDto.c;
                    ArrayList arrayList = new ArrayList();
                    for (BottomPanelButtonDto bottomPanelButtonDto : list) {
                        k kVar = bottomPanelButtonDto.f;
                        if (kVar == null || (c = de6Var.a.c(kVar, il6Var)) == null) {
                            ud6Var = null;
                        } else {
                            String str3 = bottomPanelButtonDto.a;
                            String a = str3 != null ? ((m7x0) de6Var.c).a(str3) : null;
                            String str4 = bottomPanelButtonDto.b;
                            String str5 = bottomPanelButtonDto.c;
                            com.yandex.go.places.models.data.entities.network.bottom_panel.BottomPanelButtonType bottomPanelButtonType3 = bottomPanelButtonDto.d;
                            if (bottomPanelButtonType3 != null) {
                                int i2 = ce6.a[bottomPanelButtonType3.ordinal()];
                                if (i2 == 1) {
                                    bottomPanelButtonType2 = BottomPanelButtonType.MAIN;
                                } else if (i2 != 2) {
                                    w511.b();
                                    break;
                                } else {
                                    bottomPanelButtonType2 = BottomPanelButtonType.MINOR;
                                }
                                bottomPanelButtonType = bottomPanelButtonType2;
                            } else {
                                bottomPanelButtonType = null;
                            }
                            com.yandex.go.places.models.data.entities.network.bottom_panel.BottomPanelButtonSize bottomPanelButtonSize3 = bottomPanelButtonDto.e;
                            if (bottomPanelButtonSize3 != null) {
                                int i3 = ce6.b[bottomPanelButtonSize3.ordinal()];
                                if (i3 == 1) {
                                    bottomPanelButtonSize2 = BottomPanelButtonSize.BIG;
                                } else if (i3 != 2) {
                                    w511.b();
                                    break;
                                } else {
                                    bottomPanelButtonSize2 = BottomPanelButtonSize.SMALL;
                                }
                                bottomPanelButtonSize = bottomPanelButtonSize2;
                            } else {
                                bottomPanelButtonSize = null;
                            }
                            ud6Var = new ud6(a, str4, str5, bottomPanelButtonType, bottomPanelButtonSize, c);
                        }
                        if (ud6Var != null) {
                            arrayList.add(ud6Var);
                        }
                    }
                    PromoInfoDto promoInfoDto = bottomPanelContentDto.d;
                    rnf0 rnf0Var = promoInfoDto != null ? new rnf0(promoInfoDto.a, promoInfoDto.b, promoInfoDto.c, promoInfoDto.d) : null;
                    PromoDetailsDto promoDetailsDto = bottomPanelContentDto.e;
                    be6Var = new be6(arrayList, rnf0Var, promoDetailsDto != null ? promoDetailsDto.a : null);
                }
                c cVar = (c) this.f;
                if (bottomPanelContentDto == null || (organizationCardAnalyticsParams = bottomPanelContentDto.b) == null) {
                    organizationCardAnalyticsParams = new OrganizationCardAnalyticsParams(0);
                }
                cVar.invoke(be6Var, organizationCardAnalyticsParams);
                break;
            default:
                e eVar = obj instanceof e ? (e) obj : null;
                if (eVar != null) {
                    rg80 rg80Var = (rg80) this.f;
                    if (rg80Var != null) {
                        rg80Var.g = eVar;
                    }
                    if (rg80Var != null && (ti80Var = rg80Var.h) != null) {
                        ((b) obj2).invoke(ti80Var);
                        break;
                    }
                }
                break;
        }
    }

    @Override // defpackage.e9c0
    public final String c() {
        switch (this.a) {
        }
        return this.b;
    }

    @Override // defpackage.e9c0
    public final KSerializer d() {
        switch (this.a) {
        }
        return this.d;
    }

    public fe80(b bVar) {
        KSerializer serializer = e.Companion.serializer();
        this.b = "map_object";
        this.c = "mapObjectSharedDataParser";
        this.d = serializer;
        this.e = bVar;
    }
}
