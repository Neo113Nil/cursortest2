package com.yandex.plus.pay.adapter.api;

import android.os.Parcelable;
import com.adjust.sdk.Constants;
import defpackage.k4o;
import java.util.List;
import java.util.Map;
import kotlin.Metadata;
import ru.yandex.common.clid.ClidProvider;
import ru.yandex.video.m3.player.utils.DRMInfoProvider;

@Metadata(d1 = {"\u0000R\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\r\bf\u0018\u00002\u00020\u0001:\t'()*+,-./R\u0014\u0010\u0005\u001a\u00020\u00028&X¦\u0004¢\u0006\u0006\u001a\u0004\b\u0003\u0010\u0004R\u0014\u0010\t\u001a\u00020\u00068&X¦\u0004¢\u0006\u0006\u001a\u0004\b\u0007\u0010\bR\u0016\u0010\u000b\u001a\u0004\u0018\u00010\u00028&X¦\u0004¢\u0006\u0006\u001a\u0004\b\n\u0010\u0004R\u0016\u0010\u000f\u001a\u0004\u0018\u00010\f8&X¦\u0004¢\u0006\u0006\u001a\u0004\b\r\u0010\u000eR\u001a\u0010\u0014\u001a\b\u0012\u0004\u0012\u00020\u00110\u00108&X¦\u0004¢\u0006\u0006\u001a\u0004\b\u0012\u0010\u0013R\u0016\u0010\u0018\u001a\u0004\u0018\u00010\u00158&X¦\u0004¢\u0006\u0006\u001a\u0004\b\u0016\u0010\u0017R\u001a\u0010\u001b\u001a\b\u0012\u0004\u0012\u00020\u00190\u00108&X¦\u0004¢\u0006\u0006\u001a\u0004\b\u001a\u0010\u0013R\u0014\u0010\u001d\u001a\u00020\u001c8&X¦\u0004¢\u0006\u0006\u001a\u0004\b\u001d\u0010\u001eR\u0016\u0010\"\u001a\u0004\u0018\u00010\u001f8&X¦\u0004¢\u0006\u0006\u001a\u0004\b \u0010!R\u0014\u0010&\u001a\u00020#8&X¦\u0004¢\u0006\u0006\u001a\u0004\b$\u0010%ø\u0001\u0000\u0082\u0002\u0006\n\u0004\b!0\u0001¨\u00060À\u0006\u0001"}, d2 = {"com/yandex/plus/pay/adapter/api/PlusPaySdkAdapter$CompositeOffer", "Landroid/os/Parcelable;", "", "getPositionId", "()Ljava/lang/String;", "positionId", "Lcom/yandex/plus/pay/adapter/api/PlusPaySdkAdapter$CompositeOffer$StructureType;", "getStructureType", "()Lcom/yandex/plus/pay/adapter/api/PlusPaySdkAdapter$CompositeOffer$StructureType;", "structureType", "getActiveTariffId", "activeTariffId", "Lcom/yandex/plus/pay/adapter/api/PlusPaySdkAdapter$CompositeOffer$Tariff;", "getTariffOffer", "()Lcom/yandex/plus/pay/adapter/api/PlusPaySdkAdapter$CompositeOffer$Tariff;", "tariffOffer", "", "Lcom/yandex/plus/pay/adapter/api/PlusPaySdkAdapter$CompositeOffer$Option;", "getOptionOffers", "()Ljava/util/List;", "optionOffers", "Lcom/yandex/plus/pay/adapter/api/PlusPaySdkAdapter$CompositeOffer$LegalInfo;", "getLegalInfo", "()Lcom/yandex/plus/pay/adapter/api/PlusPaySdkAdapter$CompositeOffer$LegalInfo;", "legalInfo", "Lcom/yandex/plus/pay/adapter/api/PlusPaySdkAdapter$CompositeOffer$Invoice;", "getInvoices", "invoices", "", "isUpsale", "()Z", "Lcom/yandex/plus/pay/adapter/api/PlusPaySdkAdapter$CompositeOffer$Assets;", "getAssets", "()Lcom/yandex/plus/pay/adapter/api/PlusPaySdkAdapter$CompositeOffer$Assets;", "assets", "Lcom/yandex/plus/pay/adapter/api/PlusPaySdkAdapter$CompositeOffer$Meta;", "getMeta", "()Lcom/yandex/plus/pay/adapter/api/PlusPaySdkAdapter$CompositeOffer$Meta;", Constants.REFERRER_API_META, "StructureType", "Tariff", "Option", "Invoice", "Plan", "Vendor", "Assets", "Meta", "LegalInfo", "plus-home-pay-sdk-adapter-api_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
/* loaded from: classes2.dex */
public interface PlusPaySdkAdapter$CompositeOffer extends Parcelable {

    @Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0005\bf\u0018\u00002\u00020\u0001R\u0012\u0010\u0002\u001a\u00020\u0003X¦\u0004¢\u0006\u0006\u001a\u0004\b\u0004\u0010\u0005R\u0012\u0010\u0006\u001a\u00020\u0003X¦\u0004¢\u0006\u0006\u001a\u0004\b\u0007\u0010\u0005ø\u0001\u0000\u0082\u0002\u0006\n\u0004\b!0\u0001¨\u0006\bÀ\u0006\u0001"}, d2 = {"Lcom/yandex/plus/pay/adapter/api/PlusPaySdkAdapter$CompositeOffer$Assets;", "Landroid/os/Parcelable;", "buttonText", "", "getButtonText", "()Ljava/lang/String;", "buttonTextWithDetails", "getButtonTextWithDetails", "plus-home-pay-sdk-adapter-api_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public interface Assets extends Parcelable {
        String getButtonText();

        String getButtonTextWithDetails();
    }

    @Metadata(d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\t\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\bf\u0018\u00002\u00020\u0001R\u0012\u0010\u0002\u001a\u00020\u0003X¦\u0004¢\u0006\u0006\u001a\u0004\b\u0004\u0010\u0005R\u0012\u0010\u0006\u001a\u00020\u0007X¦\u0004¢\u0006\u0006\u001a\u0004\b\b\u0010\tø\u0001\u0000\u0082\u0002\u0006\n\u0004\b!0\u0001¨\u0006\nÀ\u0006\u0001"}, d2 = {"Lcom/yandex/plus/pay/adapter/api/PlusPaySdkAdapter$CompositeOffer$Invoice;", "Landroid/os/Parcelable;", ClidProvider.TIMESTAMP, "", "getTimestamp", "()J", "price", "Lcom/yandex/plus/pay/adapter/api/PlusPaySdkAdapter$Price;", "getPrice", "()Lcom/yandex/plus/pay/adapter/api/PlusPaySdkAdapter$Price;", "plus-home-pay-sdk-adapter-api_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public interface Invoice extends Parcelable {
        PlusPaySdkAdapter$Price getPrice();

        long getTimestamp();
    }

    @Metadata(d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0004\bf\u0018\u00002\u00020\u0001:\u0001\u000bR\u0012\u0010\u0002\u001a\u00020\u0003X¦\u0004¢\u0006\u0006\u001a\u0004\b\u0004\u0010\u0005R\u0018\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\b0\u0007X¦\u0004¢\u0006\u0006\u001a\u0004\b\t\u0010\nø\u0001\u0000\u0082\u0002\u0006\n\u0004\b!0\u0001¨\u0006\fÀ\u0006\u0001"}, d2 = {"Lcom/yandex/plus/pay/adapter/api/PlusPaySdkAdapter$CompositeOffer$LegalInfo;", "Landroid/os/Parcelable;", "text", "", "getText", "()Ljava/lang/String;", "items", "", "Lcom/yandex/plus/pay/adapter/api/PlusPaySdkAdapter$CompositeOffer$LegalInfo$Item;", "getItems", "()Ljava/util/List;", "Item", "plus-home-pay-sdk-adapter-api_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public interface LegalInfo extends Parcelable {

        @Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bv\u0018\u00002\u00020\u0001:\u0002\u0006\u0007R\u0012\u0010\u0002\u001a\u00020\u0003X¦\u0004¢\u0006\u0006\u001a\u0004\b\u0004\u0010\u0005\u0082\u0001\u0002\b\tø\u0001\u0000\u0082\u0002\u0006\n\u0004\b!0\u0001¨\u0006\nÀ\u0006\u0001"}, d2 = {"Lcom/yandex/plus/pay/adapter/api/PlusPaySdkAdapter$CompositeOffer$LegalInfo$Item;", "Landroid/os/Parcelable;", "key", "", "getKey", "()Ljava/lang/String;", "Link", "Text", "Lcom/yandex/plus/pay/adapter/api/PlusPaySdkAdapter$CompositeOffer$LegalInfo$Item$Link;", "Lcom/yandex/plus/pay/adapter/api/PlusPaySdkAdapter$CompositeOffer$LegalInfo$Item$Text;", "plus-home-pay-sdk-adapter-api_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
        public interface Item extends Parcelable {

            @Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0005\bf\u0018\u00002\u00020\u0001R\u0012\u0010\u0002\u001a\u00020\u0003X¦\u0004¢\u0006\u0006\u001a\u0004\b\u0004\u0010\u0005R\u0012\u0010\u0006\u001a\u00020\u0003X¦\u0004¢\u0006\u0006\u001a\u0004\b\u0007\u0010\u0005ø\u0001\u0000\u0082\u0002\u0006\n\u0004\b!0\u0001¨\u0006\bÀ\u0006\u0001"}, d2 = {"Lcom/yandex/plus/pay/adapter/api/PlusPaySdkAdapter$CompositeOffer$LegalInfo$Item$Link;", "Lcom/yandex/plus/pay/adapter/api/PlusPaySdkAdapter$CompositeOffer$LegalInfo$Item;", "text", "", "getText", "()Ljava/lang/String;", "link", "getLink", "plus-home-pay-sdk-adapter-api_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
            public interface Link extends Item {
                @Override // com.yandex.plus.pay.adapter.api.PlusPaySdkAdapter.CompositeOffer.LegalInfo.Item
                /* synthetic */ String getKey();

                String getLink();

                String getText();
            }

            @Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0003\bf\u0018\u00002\u00020\u0001R\u0012\u0010\u0002\u001a\u00020\u0003X¦\u0004¢\u0006\u0006\u001a\u0004\b\u0004\u0010\u0005ø\u0001\u0000\u0082\u0002\u0006\n\u0004\b!0\u0001¨\u0006\u0006À\u0006\u0001"}, d2 = {"Lcom/yandex/plus/pay/adapter/api/PlusPaySdkAdapter$CompositeOffer$LegalInfo$Item$Text;", "Lcom/yandex/plus/pay/adapter/api/PlusPaySdkAdapter$CompositeOffer$LegalInfo$Item;", "text", "", "getText", "()Ljava/lang/String;", "plus-home-pay-sdk-adapter-api_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
            public interface Text extends Item {
                @Override // com.yandex.plus.pay.adapter.api.PlusPaySdkAdapter.CompositeOffer.LegalInfo.Item
                /* synthetic */ String getKey();

                String getText();
            }

            String getKey();
        }

        List<Item> getItems();

        String getText();
    }

    @Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0007\bf\u0018\u00002\u00020\u0001R\u0012\u0010\u0002\u001a\u00020\u0003X¦\u0004¢\u0006\u0006\u001a\u0004\b\u0004\u0010\u0005R\u0012\u0010\u0006\u001a\u00020\u0003X¦\u0004¢\u0006\u0006\u001a\u0004\b\u0007\u0010\u0005R\u0012\u0010\b\u001a\u00020\u0003X¦\u0004¢\u0006\u0006\u001a\u0004\b\t\u0010\u0005ø\u0001\u0000\u0082\u0002\u0006\n\u0004\b!0\u0001¨\u0006\nÀ\u0006\u0001"}, d2 = {"Lcom/yandex/plus/pay/adapter/api/PlusPaySdkAdapter$CompositeOffer$Meta;", "Landroid/os/Parcelable;", "sessionId", "", "getSessionId", "()Ljava/lang/String;", "productTarget", "getProductTarget", "offersBatchId", "getOffersBatchId", "plus-home-pay-sdk-adapter-api_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public interface Meta extends Parcelable {
        String getOffersBatchId();

        String getProductTarget();

        String getSessionId();
    }

    @Metadata(d1 = {"\u00006\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\r\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010$\n\u0002\b\u0003\bf\u0018\u00002\u00020\u0001R\u0012\u0010\u0002\u001a\u00020\u0003X¦\u0004¢\u0006\u0006\u001a\u0004\b\u0004\u0010\u0005R\u0012\u0010\u0006\u001a\u00020\u0003X¦\u0004¢\u0006\u0006\u001a\u0004\b\u0007\u0010\u0005R\u0012\u0010\b\u001a\u00020\u0003X¦\u0004¢\u0006\u0006\u001a\u0004\b\t\u0010\u0005R\u0014\u0010\n\u001a\u0004\u0018\u00010\u0003X¦\u0004¢\u0006\u0006\u001a\u0004\b\u000b\u0010\u0005R\u0014\u0010\f\u001a\u0004\u0018\u00010\u0003X¦\u0004¢\u0006\u0006\u001a\u0004\b\r\u0010\u0005R\u0014\u0010\u000e\u001a\u0004\u0018\u00010\u0003X¦\u0004¢\u0006\u0006\u001a\u0004\b\u000f\u0010\u0005R\u0012\u0010\u0010\u001a\u00020\u0011X¦\u0004¢\u0006\u0006\u001a\u0004\b\u0012\u0010\u0013R\u0012\u0010\u0014\u001a\u00020\u0003X¦\u0004¢\u0006\u0006\u001a\u0004\b\u0015\u0010\u0005R\u0018\u0010\u0016\u001a\b\u0012\u0004\u0012\u00020\u00180\u0017X¦\u0004¢\u0006\u0006\u001a\u0004\b\u0019\u0010\u001aR\u0012\u0010\u001b\u001a\u00020\u001cX¦\u0004¢\u0006\u0006\u001a\u0004\b\u001d\u0010\u001eR \u0010\u001f\u001a\u0010\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u0003\u0018\u00010 X¦\u0004¢\u0006\u0006\u001a\u0004\b!\u0010\"ø\u0001\u0000\u0082\u0002\u0006\n\u0004\b!0\u0001¨\u0006#À\u0006\u0001"}, d2 = {"Lcom/yandex/plus/pay/adapter/api/PlusPaySdkAdapter$CompositeOffer$Option;", "Landroid/os/Parcelable;", "id", "", "getId", "()Ljava/lang/String;", "name", "getName", "title", "getTitle", DRMInfoProvider.MediaDRMKeys.PLUGIN_DESCRIPTION, "getDescription", "text", "getText", "additionalText", "getAdditionalText", "commonPrice", "Lcom/yandex/plus/pay/adapter/api/PlusPaySdkAdapter$Price;", "getCommonPrice", "()Lcom/yandex/plus/pay/adapter/api/PlusPaySdkAdapter$Price;", "commonPeriod", "getCommonPeriod", "plans", "", "Lcom/yandex/plus/pay/adapter/api/PlusPaySdkAdapter$CompositeOffer$Plan;", "getPlans", "()Ljava/util/List;", DRMInfoProvider.MediaDRMKeys.VENDOR, "Lcom/yandex/plus/pay/adapter/api/PlusPaySdkAdapter$CompositeOffer$Vendor;", "getVendor", "()Lcom/yandex/plus/pay/adapter/api/PlusPaySdkAdapter$CompositeOffer$Vendor;", "payload", "", "getPayload", "()Ljava/util/Map;", "plus-home-pay-sdk-adapter-api_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public interface Option extends Parcelable {
        String getAdditionalText();

        String getCommonPeriod();

        PlusPaySdkAdapter$Price getCommonPrice();

        String getDescription();

        String getId();

        String getName();

        Map<String, String> getPayload();

        List<Plan> getPlans();

        String getText();

        String getTitle();

        Vendor getVendor();
    }

    @Metadata(d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bv\u0018\u00002\u00020\u0001:\u0004\u0002\u0003\u0004\u0005\u0082\u0001\u0004\u0006\u0007\b\tø\u0001\u0000\u0082\u0002\u0006\n\u0004\b!0\u0001¨\u0006\nÀ\u0006\u0001"}, d2 = {"Lcom/yandex/plus/pay/adapter/api/PlusPaySdkAdapter$CompositeOffer$Plan;", "Landroid/os/Parcelable;", "Intro", "IntroUntil", "Trial", "TrialUntil", "Lcom/yandex/plus/pay/adapter/api/PlusPaySdkAdapter$CompositeOffer$Plan$Intro;", "Lcom/yandex/plus/pay/adapter/api/PlusPaySdkAdapter$CompositeOffer$Plan$IntroUntil;", "Lcom/yandex/plus/pay/adapter/api/PlusPaySdkAdapter$CompositeOffer$Plan$Trial;", "Lcom/yandex/plus/pay/adapter/api/PlusPaySdkAdapter$CompositeOffer$Plan$TrialUntil;", "plus-home-pay-sdk-adapter-api_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public interface Plan extends Parcelable {

        @Metadata(d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0003\bf\u0018\u00002\u00020\u0001R\u0012\u0010\u0002\u001a\u00020\u0003X¦\u0004¢\u0006\u0006\u001a\u0004\b\u0004\u0010\u0005R\u0012\u0010\u0006\u001a\u00020\u0007X¦\u0004¢\u0006\u0006\u001a\u0004\b\b\u0010\tR\u0012\u0010\n\u001a\u00020\u000bX¦\u0004¢\u0006\u0006\u001a\u0004\b\f\u0010\rø\u0001\u0000\u0082\u0002\u0006\n\u0004\b!0\u0001¨\u0006\u000eÀ\u0006\u0001"}, d2 = {"Lcom/yandex/plus/pay/adapter/api/PlusPaySdkAdapter$CompositeOffer$Plan$Intro;", "Lcom/yandex/plus/pay/adapter/api/PlusPaySdkAdapter$CompositeOffer$Plan;", "period", "", "getPeriod", "()Ljava/lang/String;", "price", "Lcom/yandex/plus/pay/adapter/api/PlusPaySdkAdapter$Price;", "getPrice", "()Lcom/yandex/plus/pay/adapter/api/PlusPaySdkAdapter$Price;", "repetitionCount", "", "getRepetitionCount", "()I", "plus-home-pay-sdk-adapter-api_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
        public interface Intro extends Plan {
            String getPeriod();

            PlusPaySdkAdapter$Price getPrice();

            int getRepetitionCount();
        }

        @Metadata(d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\t\n\u0002\b\u0003\bf\u0018\u00002\u00020\u0001R\u0012\u0010\u0002\u001a\u00020\u0003X¦\u0004¢\u0006\u0006\u001a\u0004\b\u0004\u0010\u0005R\u0012\u0010\u0006\u001a\u00020\u0007X¦\u0004¢\u0006\u0006\u001a\u0004\b\b\u0010\tø\u0001\u0000\u0082\u0002\u0006\n\u0004\b!0\u0001¨\u0006\nÀ\u0006\u0001"}, d2 = {"Lcom/yandex/plus/pay/adapter/api/PlusPaySdkAdapter$CompositeOffer$Plan$IntroUntil;", "Lcom/yandex/plus/pay/adapter/api/PlusPaySdkAdapter$CompositeOffer$Plan;", "price", "Lcom/yandex/plus/pay/adapter/api/PlusPaySdkAdapter$Price;", "getPrice", "()Lcom/yandex/plus/pay/adapter/api/PlusPaySdkAdapter$Price;", "until", "", "getUntil", "()J", "plus-home-pay-sdk-adapter-api_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
        public interface IntroUntil extends Plan {
            PlusPaySdkAdapter$Price getPrice();

            long getUntil();
        }

        @Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0003\bf\u0018\u00002\u00020\u0001R\u0012\u0010\u0002\u001a\u00020\u0003X¦\u0004¢\u0006\u0006\u001a\u0004\b\u0004\u0010\u0005ø\u0001\u0000\u0082\u0002\u0006\n\u0004\b!0\u0001¨\u0006\u0006À\u0006\u0001"}, d2 = {"Lcom/yandex/plus/pay/adapter/api/PlusPaySdkAdapter$CompositeOffer$Plan$Trial;", "Lcom/yandex/plus/pay/adapter/api/PlusPaySdkAdapter$CompositeOffer$Plan;", "period", "", "getPeriod", "()Ljava/lang/String;", "plus-home-pay-sdk-adapter-api_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
        public interface Trial extends Plan {
            String getPeriod();
        }

        @Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\t\n\u0002\b\u0003\bf\u0018\u00002\u00020\u0001R\u0012\u0010\u0002\u001a\u00020\u0003X¦\u0004¢\u0006\u0006\u001a\u0004\b\u0004\u0010\u0005ø\u0001\u0000\u0082\u0002\u0006\n\u0004\b!0\u0001¨\u0006\u0006À\u0006\u0001"}, d2 = {"Lcom/yandex/plus/pay/adapter/api/PlusPaySdkAdapter$CompositeOffer$Plan$TrialUntil;", "Lcom/yandex/plus/pay/adapter/api/PlusPaySdkAdapter$CompositeOffer$Plan;", "until", "", "getUntil", "()J", "plus-home-pay-sdk-adapter-api_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
        public interface TrialUntil extends Plan {
            long getUntil();
        }
    }

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\u0004\b\u0086\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001j\u0002\b\u0002j\u0002\b\u0003j\u0002\b\u0004¨\u0006\u0005"}, d2 = {"Lcom/yandex/plus/pay/adapter/api/PlusPaySdkAdapter$CompositeOffer$StructureType;", "", "TARIFF", "OPTION", "COMPOSITE", "plus-home-pay-sdk-adapter-api_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final class StructureType {
        private static final /* synthetic */ k4o $ENTRIES;
        private static final /* synthetic */ StructureType[] $VALUES;
        public static final StructureType COMPOSITE;
        public static final StructureType OPTION;
        public static final StructureType TARIFF;

        static {
            StructureType structureType = new StructureType("TARIFF", 0);
            TARIFF = structureType;
            StructureType structureType2 = new StructureType("OPTION", 1);
            OPTION = structureType2;
            StructureType structureType3 = new StructureType("COMPOSITE", 2);
            COMPOSITE = structureType3;
            StructureType[] structureTypeArr = {structureType, structureType2, structureType3};
            $VALUES = structureTypeArr;
            $ENTRIES = kotlin.enums.a.a(structureTypeArr);
        }

        public static StructureType valueOf(String str) {
            return (StructureType) Enum.valueOf(StructureType.class, str);
        }

        public static StructureType[] values() {
            return (StructureType[]) $VALUES.clone();
        }
    }

    @Metadata(d1 = {"\u00006\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\r\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010$\n\u0002\b\u0003\bf\u0018\u00002\u00020\u0001R\u0012\u0010\u0002\u001a\u00020\u0003X¦\u0004¢\u0006\u0006\u001a\u0004\b\u0004\u0010\u0005R\u0012\u0010\u0006\u001a\u00020\u0003X¦\u0004¢\u0006\u0006\u001a\u0004\b\u0007\u0010\u0005R\u0012\u0010\b\u001a\u00020\u0003X¦\u0004¢\u0006\u0006\u001a\u0004\b\t\u0010\u0005R\u0014\u0010\n\u001a\u0004\u0018\u00010\u0003X¦\u0004¢\u0006\u0006\u001a\u0004\b\u000b\u0010\u0005R\u0014\u0010\f\u001a\u0004\u0018\u00010\u0003X¦\u0004¢\u0006\u0006\u001a\u0004\b\r\u0010\u0005R\u0014\u0010\u000e\u001a\u0004\u0018\u00010\u0003X¦\u0004¢\u0006\u0006\u001a\u0004\b\u000f\u0010\u0005R\u0012\u0010\u0010\u001a\u00020\u0011X¦\u0004¢\u0006\u0006\u001a\u0004\b\u0012\u0010\u0013R\u0012\u0010\u0014\u001a\u00020\u0003X¦\u0004¢\u0006\u0006\u001a\u0004\b\u0015\u0010\u0005R\u0018\u0010\u0016\u001a\b\u0012\u0004\u0012\u00020\u00180\u0017X¦\u0004¢\u0006\u0006\u001a\u0004\b\u0019\u0010\u001aR\u0012\u0010\u001b\u001a\u00020\u001cX¦\u0004¢\u0006\u0006\u001a\u0004\b\u001d\u0010\u001eR \u0010\u001f\u001a\u0010\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u0003\u0018\u00010 X¦\u0004¢\u0006\u0006\u001a\u0004\b!\u0010\"ø\u0001\u0000\u0082\u0002\u0006\n\u0004\b!0\u0001¨\u0006#À\u0006\u0001"}, d2 = {"Lcom/yandex/plus/pay/adapter/api/PlusPaySdkAdapter$CompositeOffer$Tariff;", "Landroid/os/Parcelable;", "id", "", "getId", "()Ljava/lang/String;", "name", "getName", "title", "getTitle", DRMInfoProvider.MediaDRMKeys.PLUGIN_DESCRIPTION, "getDescription", "text", "getText", "additionalText", "getAdditionalText", "commonPrice", "Lcom/yandex/plus/pay/adapter/api/PlusPaySdkAdapter$Price;", "getCommonPrice", "()Lcom/yandex/plus/pay/adapter/api/PlusPaySdkAdapter$Price;", "commonPeriod", "getCommonPeriod", "plans", "", "Lcom/yandex/plus/pay/adapter/api/PlusPaySdkAdapter$CompositeOffer$Plan;", "getPlans", "()Ljava/util/List;", DRMInfoProvider.MediaDRMKeys.VENDOR, "Lcom/yandex/plus/pay/adapter/api/PlusPaySdkAdapter$CompositeOffer$Vendor;", "getVendor", "()Lcom/yandex/plus/pay/adapter/api/PlusPaySdkAdapter$CompositeOffer$Vendor;", "payload", "", "getPayload", "()Ljava/util/Map;", "plus-home-pay-sdk-adapter-api_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public interface Tariff extends Parcelable {
        String getAdditionalText();

        String getCommonPeriod();

        PlusPaySdkAdapter$Price getCommonPrice();

        String getDescription();

        String getId();

        String getName();

        Map<String, String> getPayload();

        List<Plan> getPlans();

        String getText();

        String getTitle();

        Vendor getVendor();
    }

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\u0004\b\u0086\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001j\u0002\b\u0002j\u0002\b\u0003j\u0002\b\u0004¨\u0006\u0005"}, d2 = {"Lcom/yandex/plus/pay/adapter/api/PlusPaySdkAdapter$CompositeOffer$Vendor;", "", "GOOGLE_PLAY", "NATIVE", "UNKNOWN", "plus-home-pay-sdk-adapter-api_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final class Vendor {
        private static final /* synthetic */ k4o $ENTRIES;
        private static final /* synthetic */ Vendor[] $VALUES;
        public static final Vendor GOOGLE_PLAY;
        public static final Vendor NATIVE;
        public static final Vendor UNKNOWN;

        static {
            Vendor vendor = new Vendor("GOOGLE_PLAY", 0);
            GOOGLE_PLAY = vendor;
            Vendor vendor2 = new Vendor("NATIVE", 1);
            NATIVE = vendor2;
            Vendor vendor3 = new Vendor("UNKNOWN", 2);
            UNKNOWN = vendor3;
            Vendor[] vendorArr = {vendor, vendor2, vendor3};
            $VALUES = vendorArr;
            $ENTRIES = kotlin.enums.a.a(vendorArr);
        }

        public static Vendor valueOf(String str) {
            return (Vendor) Enum.valueOf(Vendor.class, str);
        }

        public static Vendor[] values() {
            return (Vendor[]) $VALUES.clone();
        }
    }

    String getActiveTariffId();

    Assets getAssets();

    List<Invoice> getInvoices();

    LegalInfo getLegalInfo();

    Meta getMeta();

    List<Option> getOptionOffers();

    String getPositionId();

    StructureType getStructureType();

    Tariff getTariffOffer();

    boolean isUpsale();
}
