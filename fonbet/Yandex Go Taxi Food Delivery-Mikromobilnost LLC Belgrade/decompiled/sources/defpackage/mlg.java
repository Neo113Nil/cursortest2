package defpackage;

import com.squareup.moshi.JsonAdapter;
import com.squareup.moshi.Moshi;
import com.ybsdk.core.common.data.network.dto.GradientDto;
import com.ybsdk.core.common.data.network.dto.SpoilerParamDto;
import com.ybsdk.core.common.data.network.dto.Themes;
import com.ybsdk.core.common.data.network.dto.cache.DataEntryDescriptorDto;
import com.ybsdk.core.common.data.network.dto.cache.ExpireableDto;
import com.ybsdk.core.common.data.network.dto.cache.ThemedDataEntryDescriptorDto;
import com.ybsdk.core.common.domain.entities.ColoredTextEntity;
import com.ybsdk.core.common.domain.entities.ThemedImageUrlEntity;
import com.ybsdk.core.utils.ColorModel;
import com.ybsdk.core.utils.text.Text;
import com.ybsdk.feature.banners.api.FullScreenEntity$Type;
import com.ybsdk.feature.banners.api.dto.FullScreenDto;
import com.ybsdk.feature.dashboard.internal.data.dto.BalanceV4Dto;
import com.ybsdk.feature.dashboard.internal.data.dto.CardA11yV2Dto;
import com.ybsdk.feature.dashboard.internal.data.dto.CardV2Dto;
import com.ybsdk.feature.dashboard.internal.data.dto.CarouselCardBackdrop;
import com.ybsdk.feature.dashboard.internal.data.dto.CarouselCardDivkitBackdropV2;
import com.ybsdk.feature.dashboard.internal.data.dto.CarouselProductV2Dto;
import com.ybsdk.feature.dashboard.internal.data.dto.DashboardV4Response;
import com.ybsdk.feature.dashboard.internal.data.dto.HeaderTopButtonsDto;
import com.ybsdk.feature.dashboard.internal.data.dto.NfcPayloadDto;
import com.ybsdk.feature.dashboard.internal.data.dto.ProductSkinDto;
import com.ybsdk.feature.dashboard.internal.data.dto.ScreenItemV2Dto;
import com.ybsdk.feature.divkit.api.domain.a;
import com.ybsdk.feature.divkit.api.dto.DivKitDataV2Dto;
import com.ybsdk.feature.educations.api.data.EducationsV2Dto;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import kotlin.Result;

/* loaded from: classes3.dex */
public final class mlg implements wvj0 {
    public final j0g a;
    public final JsonAdapter b;

    public mlg(Moshi moshi, j0g j0gVar) {
        this.a = j0gVar;
        this.b = moshi.adapter(DashboardV4Response.class);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:108:0x02da A[LOOP:2: B:106:0x02d4->B:108:0x02da, LOOP_END] */
    /* JADX WARN: Removed duplicated region for block: B:112:0x02ee  */
    /* JADX WARN: Removed duplicated region for block: B:115:0x02fd  */
    /* JADX WARN: Removed duplicated region for block: B:117:0x0321  */
    /* JADX WARN: Removed duplicated region for block: B:126:0x0362  */
    /* JADX WARN: Removed duplicated region for block: B:127:0x031e  */
    /* JADX WARN: Removed duplicated region for block: B:128:0x02f4  */
    /* JADX WARN: Removed duplicated region for block: B:132:0x02af  */
    /* JADX WARN: Removed duplicated region for block: B:134:0x0256  */
    /* JADX WARN: Removed duplicated region for block: B:136:0x01d6  */
    /* JADX WARN: Removed duplicated region for block: B:137:0x01c7  */
    /* JADX WARN: Removed duplicated region for block: B:138:0x01a8  */
    /* JADX WARN: Removed duplicated region for block: B:140:0x0192  */
    /* JADX WARN: Removed duplicated region for block: B:58:0x0165  */
    /* JADX WARN: Removed duplicated region for block: B:71:0x01a1  */
    /* JADX WARN: Removed duplicated region for block: B:74:0x01c0  */
    /* JADX WARN: Removed duplicated region for block: B:77:0x01cf  */
    /* JADX WARN: Removed duplicated region for block: B:85:0x0231  */
    /* JADX WARN: Removed duplicated region for block: B:95:0x025e  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final nv00 a(yvj0 yvj0Var) {
        Object obj;
        go4 go4Var;
        List list;
        rr51 rr51Var;
        CarouselCardDivkitBackdropV2 divkitBackdrop;
        DashboardV4Response dashboardV4Response;
        uw8 uw8Var;
        CardA11yV2Dto a11y;
        b98 b98Var;
        ProductSkinDto skin;
        a9f0 a9f0Var;
        Iterator<T> it;
        aso asoVar;
        aso asoVar2;
        aso c;
        String str;
        go4 go4Var2;
        String str2;
        LinkedHashMap linkedHashMap = yvj0Var.d;
        DashboardV4Response dashboardV4Response2 = (DashboardV4Response) yvj0Var.a;
        a aVar = new a(dashboardV4Response2.getCommonDivData());
        Iterator<T> it2 = dashboardV4Response2.getCarousel().iterator();
        while (true) {
            if (!it2.hasNext()) {
                obj = null;
                break;
            }
            obj = it2.next();
            if (jl40.l(((CarouselProductV2Dto) obj).getProductType(), dashboardV4Response2.getProductType())) {
                break;
            }
        }
        CarouselProductV2Dto carouselProductV2Dto = (CarouselProductV2Dto) obj;
        if (carouselProductV2Dto == null) {
            ny61.r("There is no item \"productType\" in carousel");
            return null;
        }
        List<ExpireableDto<ScreenItemV2Dto>> screenItems = dashboardV4Response2.getScreenItems();
        ArrayList arrayList = new ArrayList(tcc.n(screenItems, 10));
        Iterator<T> it3 = screenItems.iterator();
        while (it3.hasNext()) {
            aso a = yvj0Var.a((ExpireableDto) it3.next());
            arrayList.add(new aso(new dke(14, aVar, yvj0Var).invoke(a.a), a.b, a.c, a.d));
        }
        ExpireableDto<List<FullScreenDto>> fullscreens = dashboardV4Response2.getFullscreens();
        aso a2 = fullscreens != null ? yvj0Var.a(fullscreens) : null;
        ExpireableDto<List<EducationsV2Dto>> educationsV2 = dashboardV4Response2.getEducationsV2();
        aso a3 = educationsV2 != null ? yvj0Var.a(educationsV2) : null;
        CardV2Dto card = carouselProductV2Dto.getCard();
        lrp0 lrp0Var = lrp0.g;
        ThemedDataEntryDescriptorDto image = card.getBackground().getImage();
        aso d = image != null ? yvj0Var.d(image) : null;
        fxy0 fxy0Var = d != null ? (fxy0) d.a(false) : null;
        fxy0 entity = card.getBackground().getColor().toEntity();
        GradientDto gradient = card.getBackground().getGradient();
        eh4 eh4Var = new eh4(entity, fxy0Var, gradient != null ? j6a1.e(gradient) : null);
        aso c2 = yvj0Var.c(card.getBalance().getText());
        String str3 = c2 != null ? (String) c2.a(false) : null;
        if (str3 == null) {
            str3 = "";
        }
        BalanceV4Dto additionalBalance = card.getAdditionalBalance();
        if (additionalBalance != null) {
            aso c3 = yvj0Var.c(additionalBalance.getText());
            if (c3 != null && (str2 = (String) c3.a(false)) != null) {
                if (str2.length() <= 0) {
                    str2 = null;
                }
                if (str2 != null) {
                    aog aogVar = (aog) linkedHashMap.get(additionalBalance.getText().getKey());
                    go4Var2 = com.ybsdk.feature.dashboard.internal.data.mapper.a.b(additionalBalance, str2, aogVar != null && aogVar.d);
                    go4Var = go4Var2;
                }
            }
            go4Var2 = null;
            go4Var = go4Var2;
        } else {
            go4Var = null;
        }
        DivKitDataV2Dto divkitOverlay = card.getDivkitOverlay();
        if (divkitOverlay != null) {
            Object c4 = aVar.c(divkitOverlay, yvj0Var);
            Throwable a4 = Result.a(c4);
            if (a4 == null) {
                rr51Var = (rr51) c4;
                list = null;
                divkitBackdrop = card.getDivkitBackdrop();
                if (divkitBackdrop == null) {
                    Object c5 = aVar.c(divkitBackdrop.getDivkitData(), yvj0Var);
                    Throwable a5 = Result.a(c5);
                    dashboardV4Response = dashboardV4Response2;
                    if (a5 != null) {
                        x4c.g("Can't parse carousel card backdrop divkitData", a5, lrp0Var, list, 8);
                    }
                    if (c5 instanceof Result.Failure) {
                        c5 = null;
                    }
                    rr51 rr51Var2 = (rr51) c5;
                    uw8Var = rr51Var2 != null ? new uw8(divkitBackdrop.getPaddingBottom(), rr51Var2) : null;
                } else {
                    dashboardV4Response = dashboardV4Response2;
                    uw8Var = null;
                }
                String viewId = card.getViewId();
                CarouselCardBackdrop backdrop = card.getBackdrop();
                tw8 c6 = backdrop == null ? com.ybsdk.feature.dashboard.internal.data.mapper.a.c(backdrop) : null;
                ColoredTextEntity b = aic.b(card.getTitle(), new ColorModel.Attr(ung0.ybColor_textIcon_primary));
                Themes<String> titleIcon = card.getTitleIcon();
                ThemedImageUrlEntity c7 = titleIcon == null ? qxy0.c(titleIcon, null) : null;
                Themes<String> iconAfterTitle = card.getIconAfterTitle();
                ThemedImageUrlEntity c8 = iconAfterTitle == null ? qxy0.c(iconAfterTitle, null) : null;
                BalanceV4Dto balance = card.getBalance();
                aog aogVar2 = (aog) linkedHashMap.get(card.getBalance().getText().getKey());
                go4 b2 = com.ybsdk.feature.dashboard.internal.data.mapper.a.b(balance, str3, aogVar2 == null && aogVar2.d);
                SpoilerParamDto balanceSpoilerParams = card.getBalanceSpoilerParams();
                String productType = dashboardV4Response.getProductType();
                Themes<String> particleColor = balanceSpoilerParams.getParticleColor();
                svt0 svt0Var = new svt0(lvy0.b(particleColor.getLight(), particleColor.getDark(), new vmz(11, balanceSpoilerParams, productType)), balanceSpoilerParams.getWidth(), balanceSpoilerParams.getHeight());
                a11y = card.getA11y();
                if (a11y == null) {
                    DataEntryDescriptorDto balance2 = a11y.getBalance();
                    b98Var = new b98((balance2 == null || (c = yvj0Var.c(balance2)) == null || (str = (String) c.a(false)) == null) ? null : g8e.i(Text.Companion, str));
                } else {
                    b98Var = null;
                }
                skin = card.getSkin();
                if (skin == null) {
                    ThemedDataEntryDescriptorDto image2 = skin.getBackground().getImage();
                    aso d2 = image2 != null ? yvj0Var.d(image2) : null;
                    String id = skin.getId();
                    b9f0 f = j6a1.f(skin.getMini());
                    fxy0 entity2 = skin.getBackground().getColor().toEntity();
                    fxy0 fxy0Var2 = d2 != null ? (fxy0) d2.a(false) : null;
                    GradientDto gradient2 = skin.getBackground().getGradient();
                    a9f0Var = new a9f0(id, f, new eh4(entity2, fxy0Var2, gradient2 != null ? j6a1.e(gradient2) : null));
                } else {
                    a9f0Var = null;
                }
                ye8 ye8Var = new ye8(viewId, eh4Var, c6, uw8Var, b, c7, c8, b2, go4Var, svt0Var, rr51Var, b98Var, a9f0Var);
                String productType2 = carouselProductV2Dto.getProductType();
                List<HeaderTopButtonsDto> headerTopButtons = carouselProductV2Dto.getHeaderTopButtons();
                ArrayList arrayList2 = new ArrayList(tcc.n(headerTopButtons, 10));
                it = headerTopButtons.iterator();
                while (it.hasNext()) {
                    arrayList2.add(com.ybsdk.feature.dashboard.internal.data.mapper.a.f((HeaderTopButtonsDto) it.next()));
                }
                NfcPayloadDto nfcPayload = dashboardV4Response.getNfcPayload();
                v860 d3 = nfcPayload == null ? com.ybsdk.feature.dashboard.internal.data.mapper.a.d(nfcPayload) : new v860(0);
                if (a3 == null) {
                    asoVar = new aso(new suf(12).invoke(a3.a), a3.b, a3.c, a3.d);
                } else {
                    asoVar = null;
                }
                if (a2 == null) {
                    long j = a2.b;
                    List list2 = (List) a2.a;
                    ArrayList arrayList3 = new ArrayList(tcc.n(list2, 10));
                    Iterator it4 = list2.iterator();
                    while (it4.hasNext()) {
                        arrayList3.add(yua1.c((FullScreenDto) it4.next(), FullScreenEntity$Type.DASHBOARD));
                    }
                    asoVar2 = new aso(arrayList3, j, a2.c, a2.d);
                } else {
                    asoVar2 = null;
                }
                return new nv00(new ez8(productType2, ye8Var, arrayList2, arrayList, asoVar2, d3, asoVar), yvj0Var.e);
            }
            list = null;
            x4c.g("Can't parse divkitOverlay", a4, lrp0Var, null, 8);
        } else {
            list = null;
        }
        rr51Var = list;
        divkitBackdrop = card.getDivkitBackdrop();
        if (divkitBackdrop == null) {
        }
        String viewId2 = card.getViewId();
        CarouselCardBackdrop backdrop2 = card.getBackdrop();
        if (backdrop2 == null) {
        }
        ColoredTextEntity b3 = aic.b(card.getTitle(), new ColorModel.Attr(ung0.ybColor_textIcon_primary));
        Themes<String> titleIcon2 = card.getTitleIcon();
        if (titleIcon2 == null) {
        }
        Themes<String> iconAfterTitle2 = card.getIconAfterTitle();
        if (iconAfterTitle2 == null) {
        }
        BalanceV4Dto balance3 = card.getBalance();
        aog aogVar22 = (aog) linkedHashMap.get(card.getBalance().getText().getKey());
        go4 b22 = com.ybsdk.feature.dashboard.internal.data.mapper.a.b(balance3, str3, aogVar22 == null && aogVar22.d);
        SpoilerParamDto balanceSpoilerParams2 = card.getBalanceSpoilerParams();
        String productType3 = dashboardV4Response.getProductType();
        Themes<String> particleColor2 = balanceSpoilerParams2.getParticleColor();
        svt0 svt0Var2 = new svt0(lvy0.b(particleColor2.getLight(), particleColor2.getDark(), new vmz(11, balanceSpoilerParams2, productType3)), balanceSpoilerParams2.getWidth(), balanceSpoilerParams2.getHeight());
        a11y = card.getA11y();
        if (a11y == null) {
        }
        skin = card.getSkin();
        if (skin == null) {
        }
        ye8 ye8Var2 = new ye8(viewId2, eh4Var, c6, uw8Var, b3, c7, c8, b22, go4Var, svt0Var2, rr51Var, b98Var, a9f0Var);
        String productType22 = carouselProductV2Dto.getProductType();
        List<HeaderTopButtonsDto> headerTopButtons2 = carouselProductV2Dto.getHeaderTopButtons();
        ArrayList arrayList22 = new ArrayList(tcc.n(headerTopButtons2, 10));
        it = headerTopButtons2.iterator();
        while (it.hasNext()) {
        }
        NfcPayloadDto nfcPayload2 = dashboardV4Response.getNfcPayload();
        v860 d32 = nfcPayload2 == null ? com.ybsdk.feature.dashboard.internal.data.mapper.a.d(nfcPayload2) : new v860(0);
        if (a3 == null) {
        }
        if (a2 == null) {
        }
        return new nv00(new ez8(productType22, ye8Var2, arrayList22, arrayList, asoVar2, d32, asoVar), yvj0Var.e);
    }
}
