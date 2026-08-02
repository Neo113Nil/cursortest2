package xsna;

import android.content.Context;
import com.vk.api.generated.base.dto.BaseImageDto;
import com.vk.api.generated.market.dto.MarketItemLabelActionDto;
import com.vk.api.generated.market.dto.MarketModalDto;
import com.vk.api.generated.market.dto.MarketModalIntegrationFullSizeContentItemDto;
import com.vk.api.generated.market.dto.MarketModalOzonFullSizeContentItemDto;
import com.vk.ecomm.market.api.labels.MarketItemModalApproveInfoModel;
import com.vk.ecomm.market.api.labels.MarketModalContentItem;
import com.vk.toggle.features.SoccomFeatures;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.NoWhenBranchMatchedException;
import kotlin.collections.EmptyList;

/* compiled from: GoodLabelActionProvider.kt */
/* loaded from: classes18.dex */
public final class e5u {
    public final Context a;
    public final boolean b;
    public final bpn0 c;
    public dw20 d;

    /* compiled from: GoodLabelActionProvider.kt */
    public static final /* synthetic */ class a {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;
        public static final /* synthetic */ int[] $EnumSwitchMapping$1;

        static {
            int[] iArr = new int[MarketModalOzonFullSizeContentItemDto.TypeDto.values().length];
            try {
                iArr[MarketModalOzonFullSizeContentItemDto.TypeDto.APPLICATION.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[MarketModalOzonFullSizeContentItemDto.TypeDto.PAYMENT.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[MarketModalOzonFullSizeContentItemDto.TypeDto.DELIVERY.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            $EnumSwitchMapping$0 = iArr;
            int[] iArr2 = new int[MarketModalIntegrationFullSizeContentItemDto.TypeDto.values().length];
            try {
                iArr2[MarketModalIntegrationFullSizeContentItemDto.TypeDto.APPLICATION.ordinal()] = 1;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                iArr2[MarketModalIntegrationFullSizeContentItemDto.TypeDto.PAYMENT.ordinal()] = 2;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                iArr2[MarketModalIntegrationFullSizeContentItemDto.TypeDto.DELIVERY.ordinal()] = 3;
            } catch (NoSuchFieldError unused6) {
            }
            $EnumSwitchMapping$1 = iArr2;
        }
    }

    public e5u(Context context) {
        this.a = context;
        SoccomFeatures soccomFeatures = SoccomFeatures.MULTI_INTEGRATION;
        soccomFeatures.getClass();
        this.b = com.vk.toggle.b.A.a(soccomFeatures);
        this.c = new bpn0(new ee4(16));
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r9v0, types: [kotlin.collections.EmptyList] */
    /* JADX WARN: Type inference failed for: r9v1 */
    /* JADX WARN: Type inference failed for: r9v2, types: [java.util.ArrayList] */
    /* JADX WARN: Type inference failed for: r9v3, types: [kotlin.collections.EmptyList] */
    /* JADX WARN: Type inference failed for: r9v4 */
    /* JADX WARN: Type inference failed for: r9v5, types: [java.util.ArrayList] */
    public final void a(MarketItemLabelActionDto marketItemLabelActionDto) {
        ?? r9;
        MarketModalContentItem marketModalContentItem;
        dly dlyVar;
        Object obj;
        String url;
        Object obj2;
        String url2;
        ?? r92;
        MarketModalContentItem marketModalContentItem2;
        if (marketItemLabelActionDto == null || !(marketItemLabelActionDto instanceof MarketItemLabelActionDto.MarketItemLabelActionOpenModalDto)) {
            return;
        }
        MarketModalDto d = ((MarketItemLabelActionDto.MarketItemLabelActionOpenModalDto) marketItemLabelActionDto).d();
        boolean z = d instanceof MarketModalDto.MarketModalApproveInfoDto;
        bpn0 bpn0Var = this.c;
        if (z) {
            MarketModalDto.MarketModalApproveInfoDto marketModalApproveInfoDto = (MarketModalDto.MarketModalApproveInfoDto) d;
            ne6 ne6Var = (ne6) bpn0Var.getValue();
            List<BaseImageDto> e = marketModalApproveInfoDto.e();
            ne6Var.getClass();
            b(new MarketItemModalApproveInfoModel(ne6.a(e), marketModalApproveInfoDto.getTitle(), marketModalApproveInfoDto.f(), marketModalApproveInfoDto.d(), MarketItemModalApproveInfoModel.ModalApproveInfoType.LABEL), false);
            return;
        }
        int i = 3;
        int i2 = 2;
        if (d instanceof MarketModalDto.MarketModalOzonFullSizeDto) {
            MarketModalDto.MarketModalOzonFullSizeDto marketModalOzonFullSizeDto = (MarketModalDto.MarketModalOzonFullSizeDto) d;
            List<MarketModalOzonFullSizeContentItemDto> e2 = marketModalOzonFullSizeDto.e();
            if (e2 != null) {
                List<MarketModalOzonFullSizeContentItemDto> list = e2;
                r92 = new ArrayList(c5g.u(list, 10));
                for (MarketModalOzonFullSizeContentItemDto marketModalOzonFullSizeContentItemDto : list) {
                    int i3 = a.$EnumSwitchMapping$0[marketModalOzonFullSizeContentItemDto.e().ordinal()];
                    if (i3 == 1) {
                        marketModalContentItem2 = MarketModalContentItem.FULL_SIZE_APPLICATION;
                    } else if (i3 == 2) {
                        marketModalContentItem2 = MarketModalContentItem.FULL_SIZE_PAYMENT;
                    } else {
                        if (i3 != 3) {
                            throw new NoWhenBranchMatchedException();
                        }
                        marketModalContentItem2 = MarketModalContentItem.FULL_SIZE_DELIVERY;
                    }
                    r92.add(new c210(marketModalContentItem2, marketModalOzonFullSizeContentItemDto.getTitle(), marketModalOzonFullSizeContentItemDto.d(), null));
                }
            } else {
                r92 = EmptyList.b;
            }
            List list2 = r92;
            ne6 ne6Var2 = (ne6) bpn0Var.getValue();
            List<BaseImageDto> f = marketModalOzonFullSizeDto.f();
            ne6Var2.getClass();
            b(new MarketItemModalApproveInfoModel(ne6.a(f), marketModalOzonFullSizeDto.getTitle(), marketModalOzonFullSizeDto.g(), marketModalOzonFullSizeDto.d(), MarketItemModalApproveInfoModel.ModalApproveInfoType.LABEL, list2), true);
            return;
        }
        if ((d instanceof MarketModalDto.MarketModalIntegrationFullSizeDto) && this.b) {
            MarketModalDto.MarketModalIntegrationFullSizeDto marketModalIntegrationFullSizeDto = (MarketModalDto.MarketModalIntegrationFullSizeDto) d;
            List<MarketModalIntegrationFullSizeContentItemDto> e3 = marketModalIntegrationFullSizeDto.e();
            if (e3 != null) {
                List<MarketModalIntegrationFullSizeContentItemDto> list3 = e3;
                r9 = new ArrayList(c5g.u(list3, 10));
                for (MarketModalIntegrationFullSizeContentItemDto marketModalIntegrationFullSizeContentItemDto : list3) {
                    int i4 = a.$EnumSwitchMapping$1[marketModalIntegrationFullSizeContentItemDto.f().ordinal()];
                    if (i4 == 1) {
                        marketModalContentItem = MarketModalContentItem.FULL_SIZE_APPLICATION;
                    } else if (i4 == i2) {
                        marketModalContentItem = MarketModalContentItem.FULL_SIZE_PAYMENT;
                    } else {
                        if (i4 != i) {
                            throw new NoWhenBranchMatchedException();
                        }
                        marketModalContentItem = MarketModalContentItem.FULL_SIZE_DELIVERY;
                    }
                    String title = marketModalIntegrationFullSizeContentItemDto.getTitle();
                    String e4 = marketModalIntegrationFullSizeContentItemDto.e();
                    List<BaseImageDto> d2 = marketModalIntegrationFullSizeContentItemDto.d();
                    if (d2 != null) {
                        List<BaseImageDto> list4 = d2;
                        Iterator it = list4.iterator();
                        while (true) {
                            if (it.hasNext()) {
                                obj = it.next();
                                if (((BaseImageDto) obj).d() == BaseImageDto.ThemeDto.LIGHT) {
                                    break;
                                }
                            } else {
                                obj = null;
                                break;
                            }
                        }
                        BaseImageDto baseImageDto = (BaseImageDto) obj;
                        if (baseImageDto == null || (url = baseImageDto.getUrl()) == null) {
                            BaseImageDto baseImageDto2 = (BaseImageDto) j5g.a0(d2);
                            url = baseImageDto2 != null ? baseImageDto2.getUrl() : null;
                        }
                        Iterator it2 = list4.iterator();
                        while (true) {
                            if (it2.hasNext()) {
                                obj2 = it2.next();
                                if (((BaseImageDto) obj2).d() == BaseImageDto.ThemeDto.DARK) {
                                    break;
                                }
                            } else {
                                obj2 = null;
                                break;
                            }
                        }
                        BaseImageDto baseImageDto3 = (BaseImageDto) obj2;
                        if (baseImageDto3 == null || (url2 = baseImageDto3.getUrl()) == null) {
                            BaseImageDto baseImageDto4 = (BaseImageDto) j5g.a0(d2);
                            url2 = baseImageDto4 != null ? baseImageDto4.getUrl() : null;
                        }
                        BaseImageDto baseImageDto5 = (BaseImageDto) j5g.a0(d2);
                        Integer valueOf = baseImageDto5 != null ? Integer.valueOf(baseImageDto5.getWidth()) : null;
                        BaseImageDto baseImageDto6 = (BaseImageDto) j5g.a0(d2);
                        dlyVar = new dly(url, url2, valueOf, baseImageDto6 != null ? Integer.valueOf(baseImageDto6.getHeight()) : null);
                    } else {
                        dlyVar = null;
                    }
                    r9.add(new c210(marketModalContentItem, title, e4, dlyVar));
                    i = 3;
                    i2 = 2;
                }
            } else {
                r9 = EmptyList.b;
            }
            List list5 = r9;
            ne6 ne6Var3 = (ne6) bpn0Var.getValue();
            List<BaseImageDto> f2 = marketModalIntegrationFullSizeDto.f();
            ne6Var3.getClass();
            b(new MarketItemModalApproveInfoModel(ne6.a(f2), marketModalIntegrationFullSizeDto.getTitle(), marketModalIntegrationFullSizeDto.g(), marketModalIntegrationFullSizeDto.d(), MarketItemModalApproveInfoModel.ModalApproveInfoType.LABEL, list5), true);
        }
    }

    public final void b(MarketItemModalApproveInfoModel marketItemModalApproveInfoModel, boolean z) {
        dw20 dw20Var = this.d;
        if (dw20Var != null) {
            dw20Var.dismiss();
        }
        this.d = new l5u(this.a, marketItemModalApproveInfoModel, new qzg(this, 19), z).I0(null);
    }
}
