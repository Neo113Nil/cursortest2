package xsna;

import android.os.Build;
import android.os.Bundle;
import android.os.Parcelable;
import android.view.View;
import android.view.ViewGroup;
import androidx.constraintlayout.widget.ConstraintLayout;
import com.vk.api.generated.catalog.dto.CatalogGetClassifiedsCatalogContextDto;
import com.vk.api.generated.catalog.dto.CatalogGetClassifiedsDeliveryTypeDto;
import com.vk.api.generated.catalog.dto.CatalogGetClassifiedsStatusIdDto;
import com.vk.core.view.components.placeholder.main.VkPlaceholder;
import com.vk.dto.common.id.UserId;
import com.vk.dto.market.catalog.CatalogMarketDeliveryTypeDto;
import com.vk.dto.market.catalog.CatalogMarketStatusOptionId;
import kotlin.NoWhenBranchMatchedException;

/* compiled from: DiscoverMediaMviMappers.kt */
/* loaded from: classes4.dex */
public final class z3n implements yt60 {
    public final Object b;
    public final Object c;
    public final Object d;

    public z3n(b4n b4nVar, a4n a4nVar, y3n y3nVar) {
        this.b = b4nVar;
        this.c = a4nVar;
        this.d = y3nVar;
    }

    @Override // xsna.yt60
    public zt60 Z() {
        return (a4n) this.c;
    }

    /* JADX WARN: Removed duplicated region for block: B:101:0x0259  */
    /* JADX WARN: Removed duplicated region for block: B:103:0x0268  */
    /* JADX WARN: Removed duplicated region for block: B:105:0x0279  */
    /* JADX WARN: Removed duplicated region for block: B:107:0x028a  */
    /* JADX WARN: Removed duplicated region for block: B:109:0x02a1  */
    /* JADX WARN: Removed duplicated region for block: B:111:0x02b8  */
    /* JADX WARN: Removed duplicated region for block: B:113:0x02c9  */
    /* JADX WARN: Removed duplicated region for block: B:115:0x02db  */
    /* JADX WARN: Removed duplicated region for block: B:117:0x02e6  */
    /* JADX WARN: Removed duplicated region for block: B:119:0x02fa  */
    /* JADX WARN: Removed duplicated region for block: B:121:0x0309  */
    /* JADX WARN: Removed duplicated region for block: B:123:0x0318  */
    /* JADX WARN: Removed duplicated region for block: B:125:0x0329  */
    /* JADX WARN: Removed duplicated region for block: B:127:0x0338  */
    /* JADX WARN: Removed duplicated region for block: B:129:0x0347  */
    /* JADX WARN: Removed duplicated region for block: B:131:0x0356  */
    /* JADX WARN: Removed duplicated region for block: B:133:0x0365  */
    /* JADX WARN: Removed duplicated region for block: B:135:0x0374  */
    /* JADX WARN: Removed duplicated region for block: B:137:0x0383  */
    /* JADX WARN: Removed duplicated region for block: B:139:0x0394  */
    /* JADX WARN: Removed duplicated region for block: B:142:0x03a7  */
    /* JADX WARN: Removed duplicated region for block: B:144:0x03b2  */
    /* JADX WARN: Removed duplicated region for block: B:146:0x03bd  */
    /* JADX WARN: Removed duplicated region for block: B:148:0x03c8  */
    /* JADX WARN: Removed duplicated region for block: B:150:0x03d3  */
    /* JADX WARN: Removed duplicated region for block: B:152:0x03de  */
    /* JADX WARN: Removed duplicated region for block: B:154:0x03f4  */
    /* JADX WARN: Removed duplicated region for block: B:157:0x03f0  */
    /* JADX WARN: Removed duplicated region for block: B:158:0x02f6  */
    /* JADX WARN: Removed duplicated region for block: B:159:0x02d7  */
    /* JADX WARN: Removed duplicated region for block: B:160:0x0248  */
    /* JADX WARN: Removed duplicated region for block: B:94:0x021c  */
    /* JADX WARN: Removed duplicated region for block: B:97:0x0238  */
    /* JADX WARN: Removed duplicated region for block: B:99:0x024c  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public tfx a(String str, String str2, Bundle bundle) {
        UserId userId;
        CatalogGetClassifiedsStatusIdDto catalogGetClassifiedsStatusIdDto;
        CatalogGetClassifiedsDeliveryTypeDto catalogGetClassifiedsDeliveryTypeDto;
        tfx tfxVar;
        tfx tfxVar2;
        tfx tfxVar3;
        tfx tfxVar4;
        String string;
        String string2;
        CatalogMarketStatusOptionId catalogMarketStatusOptionId;
        Parcelable parcelable;
        Object parcelable2;
        Double c;
        Double c2;
        Long e;
        Long e2;
        CatalogGetClassifiedsCatalogContextDto catalogGetClassifiedsCatalogContextDto = CatalogGetClassifiedsCatalogContextDto.MARKET;
        String string3 = bundle != null ? bundle.getString("key_category_ids") : null;
        Integer valueOf = (bundle == null || (e2 = bo8.e(bundle, "key_filter_price_from")) == null) ? null : Integer.valueOf((int) e2.longValue());
        Integer valueOf2 = (bundle == null || (e = bo8.e(bundle, "key_filter_price_to")) == null) ? null : Integer.valueOf((int) e.longValue());
        Float valueOf3 = (bundle == null || (c2 = bo8.c(bundle, "key_latitude")) == null) ? null : Float.valueOf((float) c2.doubleValue());
        Float valueOf4 = (bundle == null || (c = bo8.c(bundle, "key_longitude")) == null) ? null : Float.valueOf((float) c.doubleValue());
        Integer d = bundle != null ? bo8.d(bundle, "key_filter_distance") : null;
        String string4 = bundle != null ? bundle.getString("key_location_name") : null;
        Boolean valueOf5 = bundle != null ? Boolean.valueOf(bundle.getBoolean("key_save_geo")) : null;
        String string5 = bundle != null ? bundle.getString("key_sorting_option_id") : null;
        String string6 = bundle != null ? bundle.getString("key_item_id") : null;
        String string7 = bundle != null ? bundle.getString("traffic_source") : null;
        String string8 = bundle != null ? bundle.getString("ref_source") : null;
        Integer d2 = bundle != null ? bo8.d(bundle, "ad_campaign_id") : null;
        String string9 = bundle != null ? bundle.getString("ad_campaign") : null;
        String string10 = bundle != null ? bundle.getString("ad_campaign_source") : null;
        String string11 = bundle != null ? bundle.getString("ad_campaign_medium") : null;
        String string12 = bundle != null ? bundle.getString("ad_campaign_term") : null;
        String string13 = bundle != null ? bundle.getString("ad_campaign_content") : null;
        if (bundle != null) {
            if (Build.VERSION.SDK_INT >= 33) {
                parcelable2 = bundle.getParcelable("owner_id", UserId.class);
                parcelable = (Parcelable) parcelable2;
            } else {
                Parcelable parcelable3 = bundle.getParcelable("owner_id");
                if (!(parcelable3 instanceof UserId)) {
                    parcelable3 = null;
                }
                parcelable = (UserId) parcelable3;
            }
            userId = (UserId) parcelable;
        } else {
            userId = null;
        }
        if (bundle == null || (string2 = bundle.getString("key_status_id")) == null) {
            catalogGetClassifiedsStatusIdDto = null;
        } else {
            CatalogMarketStatusOptionId.Companion.getClass();
            CatalogMarketStatusOptionId[] values = CatalogMarketStatusOptionId.values();
            int length = values.length;
            int i = 0;
            while (true) {
                if (i >= length) {
                    catalogMarketStatusOptionId = null;
                    break;
                }
                catalogMarketStatusOptionId = values[i];
                if (epx.f(catalogMarketStatusOptionId.h(), string2)) {
                    break;
                }
                i++;
            }
            if (catalogMarketStatusOptionId == null) {
                catalogMarketStatusOptionId = CatalogMarketStatusOptionId.ALL_ITEMS;
            }
            int i2 = y8a.$EnumSwitchMapping$0[catalogMarketStatusOptionId.ordinal()];
            if (i2 == 1) {
                catalogGetClassifiedsStatusIdDto = CatalogGetClassifiedsStatusIdDto.ALL_ITEMS;
            } else if (i2 == 2) {
                catalogGetClassifiedsStatusIdDto = CatalogGetClassifiedsStatusIdDto.BANNED;
            } else if (i2 == 3) {
                catalogGetClassifiedsStatusIdDto = CatalogGetClassifiedsStatusIdDto.NOT_IN_MARKET;
            } else {
                if (i2 != 4) {
                    throw new NoWhenBranchMatchedException();
                }
                catalogGetClassifiedsStatusIdDto = CatalogGetClassifiedsStatusIdDto.DISABLED;
            }
        }
        Integer d3 = bundle != null ? bo8.d(bundle, "album_id") : null;
        Boolean b = bundle != null ? bo8.b(bundle, "online_payment_enabled") : null;
        Boolean b2 = bundle != null ? bo8.b(bundle, "discount_enabled") : null;
        Boolean b3 = bundle != null ? bo8.b(bundle, "seller_high_rating_enabled") : null;
        Boolean b4 = bundle != null ? bo8.b(bundle, "friends_reviews_enabled") : null;
        Boolean b5 = bundle != null ? bo8.b(bundle, "friends_wishlist_enabled") : null;
        if (bundle != null && (string = bundle.getString("delivery_type")) != null) {
            CatalogMarketDeliveryTypeDto.Companion.getClass();
            CatalogMarketDeliveryTypeDto a = CatalogMarketDeliveryTypeDto.a.a(string);
            int i3 = a == null ? -1 : y8a.$EnumSwitchMapping$1[a.ordinal()];
            if (i3 == 1) {
                catalogGetClassifiedsDeliveryTypeDto = CatalogGetClassifiedsDeliveryTypeDto.ANY;
            } else if (i3 == 2) {
                catalogGetClassifiedsDeliveryTypeDto = CatalogGetClassifiedsDeliveryTypeDto.COURIER;
            } else if (i3 == 3) {
                catalogGetClassifiedsDeliveryTypeDto = CatalogGetClassifiedsDeliveryTypeDto.PICKUP;
            }
            tfx tfxVar5 = new tfx("catalog.getClassifieds", new com.vk.movika.sdk.android.defaultplayer.view.a(11), new er(8));
            if (catalogGetClassifiedsCatalogContextDto != null) {
                tfx.o(tfxVar5, "catalog_context", catalogGetClassifiedsCatalogContextDto.i(), 0, 0, 12);
                s3q0 s3q0Var = s3q0.a;
            }
            tfxVar5.j("need_blocks", true);
            s3q0 s3q0Var2 = s3q0.a;
            if (str == null) {
                tfxVar = tfxVar5;
                tfx.o(tfxVar, "section_id", str, 0, 255, 4);
            } else {
                tfxVar = tfxVar5;
            }
            if (string3 != null) {
                tfx.o(tfxVar, "category_ids", string3, 0, 0, 12);
            }
            if (str2 != null) {
                tfx.o(tfxVar, "query", str2, 0, 255, 4);
            }
            if (valueOf != null) {
                tfx.l(tfxVar, "price_min", valueOf.intValue(), 0, 0, 12);
            }
            if (valueOf2 != null) {
                tfx.l(tfxVar, "price_max", valueOf2.intValue(), 0, 0, 12);
            }
            if (valueOf3 != null) {
                tfxVar.h("latitude", valueOf3.floatValue(), -90.0d, 90.0d);
            }
            if (valueOf4 != null) {
                tfxVar.h("longitude", valueOf4.floatValue(), -180.0d, 180.0d);
            }
            if (d != null) {
                tfx.l(tfxVar, "distance_max", d.intValue(), -1, 0, 8);
            }
            if (string4 == null) {
                tfxVar2 = tfxVar;
                tfx.o(tfxVar2, "location_name", string4, 0, 0, 12);
            } else {
                tfxVar2 = tfxVar;
            }
            if (valueOf5 != null) {
                tfxVar2.j("is_save_geo", valueOf5.booleanValue());
            }
            if (string6 == null) {
                tfx tfxVar6 = tfxVar2;
                tfx.o(tfxVar6, "item_id", string6, 0, 0, 12);
                tfxVar3 = tfxVar6;
            } else {
                tfxVar3 = tfxVar2;
            }
            if (string7 != null) {
                tfx.o(tfxVar3, "traffic_source", string7, 0, 0, 12);
            }
            if (string8 != null) {
                tfx.o(tfxVar3, "ref_source", string8, 0, 0, 12);
            }
            if (d2 != null) {
                tfx.l(tfxVar3, "ad_campaign_id", d2.intValue(), 0, 0, 8);
            }
            if (string9 != null) {
                tfx.o(tfxVar3, "ad_campaign", string9, 0, 0, 12);
            }
            if (string10 != null) {
                tfx.o(tfxVar3, "ad_campaign_source", string10, 0, 0, 12);
            }
            if (string11 != null) {
                tfx.o(tfxVar3, "ad_campaign_medium", string11, 0, 0, 12);
            }
            if (string12 != null) {
                tfx.o(tfxVar3, "ad_campaign_term", string12, 0, 0, 12);
            }
            if (string13 != null) {
                tfx.o(tfxVar3, "ad_campaign_content", string13, 0, 0, 12);
            }
            if (userId != null) {
                tfx.n(tfxVar3, "owner_id", userId, 0L, 0L, 12);
            }
            if (catalogGetClassifiedsStatusIdDto != null) {
                tfx.o(tfxVar3, "status_id", catalogGetClassifiedsStatusIdDto.i(), 0, 0, 12);
            }
            if (d3 != null) {
                tfx.l(tfxVar3, "album_id", d3.intValue(), 1, 0, 8);
            }
            tfx tfxVar7 = tfxVar3;
            if (b != null) {
                tfxVar7.j("online_payment", b.booleanValue());
            }
            if (b2 != null) {
                tfxVar7.j("discount", b2.booleanValue());
            }
            if (b3 != null) {
                tfxVar7.j("seller_high_rating", b3.booleanValue());
            }
            if (b4 != null) {
                tfxVar7.j("friends_reviews", b4.booleanValue());
            }
            if (b5 != null) {
                tfxVar7.j("friends_wishlist", b5.booleanValue());
            }
            if (catalogGetClassifiedsDeliveryTypeDto == null) {
                tfxVar4 = tfxVar7;
                tfx.o(tfxVar4, "delivery_type", catalogGetClassifiedsDeliveryTypeDto.i(), 0, 0, 12);
            } else {
                tfxVar4 = tfxVar7;
            }
            if (string5 != null) {
                tfx.o(tfxVar4, "sorting_option_id", string5, 0, 0, 12);
            }
            return tfxVar4;
        }
        catalogGetClassifiedsDeliveryTypeDto = null;
        tfx tfxVar52 = new tfx("catalog.getClassifieds", new com.vk.movika.sdk.android.defaultplayer.view.a(11), new er(8));
        if (catalogGetClassifiedsCatalogContextDto != null) {
        }
        tfxVar52.j("need_blocks", true);
        s3q0 s3q0Var22 = s3q0.a;
        if (str == null) {
        }
        if (string3 != null) {
        }
        if (str2 != null) {
        }
        if (valueOf != null) {
        }
        if (valueOf2 != null) {
        }
        if (valueOf3 != null) {
        }
        if (valueOf4 != null) {
        }
        if (d != null) {
        }
        if (string4 == null) {
        }
        if (valueOf5 != null) {
        }
        if (string6 == null) {
        }
        if (string7 != null) {
        }
        if (string8 != null) {
        }
        if (d2 != null) {
        }
        if (string9 != null) {
        }
        if (string10 != null) {
        }
        if (string11 != null) {
        }
        if (string12 != null) {
        }
        if (string13 != null) {
        }
        if (userId != null) {
        }
        if (catalogGetClassifiedsStatusIdDto != null) {
        }
        if (d3 != null) {
        }
        tfx tfxVar72 = tfxVar3;
        if (b != null) {
        }
        if (b2 != null) {
        }
        if (b3 != null) {
        }
        if (b4 != null) {
        }
        if (b5 != null) {
        }
        if (catalogGetClassifiedsDeliveryTypeDto == null) {
        }
        if (string5 != null) {
        }
        return tfxVar4;
    }

    @Override // xsna.yt60
    public au60 d0() {
        return (b4n) this.b;
    }

    @Override // xsna.yt60
    public xt60 h1() {
        return (y3n) this.d;
    }

    public z3n(ViewGroup viewGroup, hx0 hx0Var, VkPlaceholder vkPlaceholder, View view, VkPlaceholder vkPlaceholder2, rw0 rw0Var) {
        ConstraintLayout constraintLayout;
        this.b = viewGroup;
        this.c = view;
        biq biqVar = new biq();
        biqVar.addTarget(hx0Var.b);
        biqVar.addTarget(view);
        if (rw0Var != null && (constraintLayout = (ConstraintLayout) rw0Var.a) != null) {
            biqVar.addTarget(constraintLayout);
        }
        if (vkPlaceholder != null) {
            biqVar.addTarget(vkPlaceholder);
        }
        if (vkPlaceholder2 != null) {
            biqVar.addTarget(vkPlaceholder2);
        }
        this.d = biqVar;
    }

    public z3n() {
        this.b = new xga();
        this.c = new e3a();
        this.d = new afa();
    }
}
