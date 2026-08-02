package com.ybsdk.rconfig.configs;

import com.squareup.moshi.Json;
import com.squareup.moshi.JsonClass;
import com.ybsdk.feature.transfer.version2.api.TransferRemoteConfig$TransfersRequisitesFormPayloadsEntity$FormPayloadEntity$FormEntityType;
import com.ybsdk.feature.transfer.version2.api.TransferRemoteConfig$TransfersRequisitesFormPayloadsEntity$FormPayloadItemEntity$FormPayloadItemEntityType;
import defpackage.jl40;
import defpackage.k4o;
import defpackage.oo01;
import defpackage.po01;
import defpackage.qo01;
import defpackage.tcc;
import defpackage.tse0;
import defpackage.w511;
import java.util.ArrayList;
import java.util.List;
import kotlin.Metadata;
import kotlin.Result;
import ru.CryptoPro.JCP.tools.CertReader.Extension;

@JsonClass(generateAdapter = true)
@Metadata(d1 = {"\u00004\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0007\b\u0081\b\u0018\u00002\u00020\u0001:\u0002\u001a\u001bB\u0015\u0012\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002¢\u0006\u0004\b\u0005\u0010\u0006J\r\u0010\b\u001a\u00020\u0007¢\u0006\u0004\b\b\u0010\tJ\u0016\u0010\n\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002HÆ\u0003¢\u0006\u0004\b\n\u0010\u000bJ \u0010\f\u001a\u00020\u00002\u000e\b\u0002\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002HÆ\u0001¢\u0006\u0004\b\f\u0010\rJ\u0010\u0010\u000f\u001a\u00020\u000eHÖ\u0001¢\u0006\u0004\b\u000f\u0010\u0010J\u0010\u0010\u0012\u001a\u00020\u0011HÖ\u0001¢\u0006\u0004\b\u0012\u0010\u0013J\u001a\u0010\u0016\u001a\u00020\u00152\b\u0010\u0014\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u0016\u0010\u0017R \u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0004\u0010\u0018\u001a\u0004\b\u0019\u0010\u000b¨\u0006\u001c"}, d2 = {"Lcom/ybsdk/rconfig/configs/TransfersRequisitesFormPayloadsConfig;", "", "", "Lcom/ybsdk/rconfig/configs/TransfersRequisitesFormPayloadsConfig$FormPayload;", "payloads", "<init>", "(Ljava/util/List;)V", "Lqo01;", "toEntity", "()Lqo01;", "component1", "()Ljava/util/List;", "copy", "(Ljava/util/List;)Lcom/ybsdk/rconfig/configs/TransfersRequisitesFormPayloadsConfig;", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "other", "", "equals", "(Ljava/lang/Object;)Z", "Ljava/util/List;", "getPayloads", "FormPayload", "FormPayloadItem", "yb-sdk_sdkRelease"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes9.dex */
public final /* data */ class TransfersRequisitesFormPayloadsConfig {

    @Json(name = "payloads")
    private final List<FormPayload> payloads;

    @JsonClass(generateAdapter = true)
    @Metadata(d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\n\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\b\u0081\b\u0018\u00002\u00020\u0001:\u0001\u0017B\u001d\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005¢\u0006\u0004\b\u0007\u0010\bJ\t\u0010\r\u001a\u00020\u0003HÆ\u0003J\u000f\u0010\u000e\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005HÆ\u0003J#\u0010\u000f\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\u000e\b\u0002\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005HÆ\u0001J\u0013\u0010\u0010\u001a\u00020\u00112\b\u0010\u0012\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u0013\u001a\u00020\u0014HÖ\u0001J\t\u0010\u0015\u001a\u00020\u0016HÖ\u0001R\u0016\u0010\u0002\u001a\u00020\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\nR\u001c\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00060\u00058\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\f¨\u0006\u0018"}, d2 = {"Lcom/ybsdk/rconfig/configs/TransfersRequisitesFormPayloadsConfig$FormPayload;", "", "formType", "Lcom/ybsdk/rconfig/configs/TransfersRequisitesFormPayloadsConfig$FormPayload$FormType;", "formPayloadItems", "", "Lcom/ybsdk/rconfig/configs/TransfersRequisitesFormPayloadsConfig$FormPayloadItem;", "<init>", "(Lcom/ybsdk/rconfig/configs/TransfersRequisitesFormPayloadsConfig$FormPayload$FormType;Ljava/util/List;)V", "getFormType", "()Lcom/ybsdk/rconfig/configs/TransfersRequisitesFormPayloadsConfig$FormPayload$FormType;", "getFormPayloadItems", "()Ljava/util/List;", "component1", "component2", "copy", "equals", "", "other", "hashCode", "", "toString", "", "FormType", "yb-sdk_sdkRelease"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final /* data */ class FormPayload {

        @Json(name = "form_payload_items")
        private final List<FormPayloadItem> formPayloadItems;

        @Json(name = "form_type")
        private final FormType formType;

        /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
        /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
        @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\u0006\b\u0086\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003j\u0002\b\u0004j\u0002\b\u0005j\u0002\b\u0006¨\u0006\u0007"}, d2 = {"Lcom/ybsdk/rconfig/configs/TransfersRequisitesFormPayloadsConfig$FormPayload$FormType;", "", "<init>", "(Ljava/lang/String;I)V", "HCS", "PERSON", "LEGAL", "yb-sdk_sdkRelease"}, k = 1, mv = {2, 1, 0}, xi = 48)
        public static final class FormType {
            private static final /* synthetic */ k4o $ENTRIES;
            private static final /* synthetic */ FormType[] $VALUES;
            public static final FormType HCS = new FormType("HCS", 0);
            public static final FormType PERSON = new FormType("PERSON", 1);
            public static final FormType LEGAL = new FormType("LEGAL", 2);

            private static final /* synthetic */ FormType[] $values() {
                return new FormType[]{HCS, PERSON, LEGAL};
            }

            static {
                FormType[] $values = $values();
                $VALUES = $values;
                $ENTRIES = kotlin.enums.a.a($values);
            }

            private FormType(String str, int i) {
            }

            public static k4o getEntries() {
                return $ENTRIES;
            }

            public static FormType valueOf(String str) {
                return (FormType) Enum.valueOf(FormType.class, str);
            }

            public static FormType[] values() {
                return (FormType[]) $VALUES.clone();
            }
        }

        public FormPayload(FormType formType, List<FormPayloadItem> list) {
            this.formType = formType;
            this.formPayloadItems = list;
        }

        /* JADX WARN: Multi-variable type inference failed */
        public static /* synthetic */ FormPayload copy$default(FormPayload formPayload, FormType formType, List list, int i, Object obj) {
            if ((i & 1) != 0) {
                formType = formPayload.formType;
            }
            if ((i & 2) != 0) {
                list = formPayload.formPayloadItems;
            }
            return formPayload.copy(formType, list);
        }

        /* renamed from: component1, reason: from getter */
        public final FormType getFormType() {
            return this.formType;
        }

        public final List<FormPayloadItem> component2() {
            return this.formPayloadItems;
        }

        public final FormPayload copy(FormType formType, List<FormPayloadItem> formPayloadItems) {
            return new FormPayload(formType, formPayloadItems);
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof FormPayload)) {
                return false;
            }
            FormPayload formPayload = (FormPayload) other;
            return this.formType == formPayload.formType && jl40.l(this.formPayloadItems, formPayload.formPayloadItems);
        }

        public final List<FormPayloadItem> getFormPayloadItems() {
            return this.formPayloadItems;
        }

        public final FormType getFormType() {
            return this.formType;
        }

        public int hashCode() {
            return this.formPayloadItems.hashCode() + (this.formType.hashCode() * 31);
        }

        public String toString() {
            return "FormPayload(formType=" + this.formType + ", formPayloadItems=" + this.formPayloadItems + Extension.C_BRAKE;
        }
    }

    @JsonClass(generateAdapter = true)
    @Metadata(d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\n\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0002\b\u0081\b\u0018\u00002\u00020\u0001:\u0001\u0015B\u0017\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005¢\u0006\u0004\b\u0006\u0010\u0007J\t\u0010\f\u001a\u00020\u0003HÆ\u0003J\t\u0010\r\u001a\u00020\u0005HÆ\u0003J\u001d\u0010\u000e\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u0005HÆ\u0001J\u0013\u0010\u000f\u001a\u00020\u00102\b\u0010\u0011\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u0012\u001a\u00020\u0005HÖ\u0001J\t\u0010\u0013\u001a\u00020\u0014HÖ\u0001R\u0016\u0010\u0002\u001a\u00020\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\b\u0010\tR\u0016\u0010\u0004\u001a\u00020\u00058\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\u000b¨\u0006\u0016"}, d2 = {"Lcom/ybsdk/rconfig/configs/TransfersRequisitesFormPayloadsConfig$FormPayloadItem;", "", "itemType", "Lcom/ybsdk/rconfig/configs/TransfersRequisitesFormPayloadsConfig$FormPayloadItem$FormPayloadItemType;", "maxInputLength", "", "<init>", "(Lcom/ybsdk/rconfig/configs/TransfersRequisitesFormPayloadsConfig$FormPayloadItem$FormPayloadItemType;I)V", "getItemType", "()Lcom/ybsdk/rconfig/configs/TransfersRequisitesFormPayloadsConfig$FormPayloadItem$FormPayloadItemType;", "getMaxInputLength", "()I", "component1", "component2", "copy", "equals", "", "other", "hashCode", "toString", "", "FormPayloadItemType", "yb-sdk_sdkRelease"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final /* data */ class FormPayloadItem {

        @Json(name = "item_type")
        private final FormPayloadItemType itemType;

        @Json(name = "max_input_length")
        private final int maxInputLength;

        /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
        /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
        @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\r\b\u0086\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003j\u0002\b\u0004j\u0002\b\u0005j\u0002\b\u0006j\u0002\b\u0007j\u0002\b\bj\u0002\b\tj\u0002\b\nj\u0002\b\u000bj\u0002\b\fj\u0002\b\r¨\u0006\u000e"}, d2 = {"Lcom/ybsdk/rconfig/configs/TransfersRequisitesFormPayloadsConfig$FormPayloadItem$FormPayloadItemType;", "", "<init>", "(Ljava/lang/String;I)V", "ACCOUNT_NUMBER", "BIC", "INN", "BENEFICIARY_NAME", "LAST_NAME", "FIRST_NAME", "MIDDLE_NAME", "PAYMENT_PURPOSE", "PERSONAL_ACCOUNT", "PAYMENT_PERIOD", "yb-sdk_sdkRelease"}, k = 1, mv = {2, 1, 0}, xi = 48)
        public static final class FormPayloadItemType {
            private static final /* synthetic */ k4o $ENTRIES;
            private static final /* synthetic */ FormPayloadItemType[] $VALUES;
            public static final FormPayloadItemType ACCOUNT_NUMBER = new FormPayloadItemType("ACCOUNT_NUMBER", 0);
            public static final FormPayloadItemType BIC = new FormPayloadItemType("BIC", 1);
            public static final FormPayloadItemType INN = new FormPayloadItemType("INN", 2);
            public static final FormPayloadItemType BENEFICIARY_NAME = new FormPayloadItemType("BENEFICIARY_NAME", 3);
            public static final FormPayloadItemType LAST_NAME = new FormPayloadItemType("LAST_NAME", 4);
            public static final FormPayloadItemType FIRST_NAME = new FormPayloadItemType("FIRST_NAME", 5);
            public static final FormPayloadItemType MIDDLE_NAME = new FormPayloadItemType("MIDDLE_NAME", 6);
            public static final FormPayloadItemType PAYMENT_PURPOSE = new FormPayloadItemType("PAYMENT_PURPOSE", 7);
            public static final FormPayloadItemType PERSONAL_ACCOUNT = new FormPayloadItemType("PERSONAL_ACCOUNT", 8);
            public static final FormPayloadItemType PAYMENT_PERIOD = new FormPayloadItemType("PAYMENT_PERIOD", 9);

            private static final /* synthetic */ FormPayloadItemType[] $values() {
                return new FormPayloadItemType[]{ACCOUNT_NUMBER, BIC, INN, BENEFICIARY_NAME, LAST_NAME, FIRST_NAME, MIDDLE_NAME, PAYMENT_PURPOSE, PERSONAL_ACCOUNT, PAYMENT_PERIOD};
            }

            static {
                FormPayloadItemType[] $values = $values();
                $VALUES = $values;
                $ENTRIES = kotlin.enums.a.a($values);
            }

            private FormPayloadItemType(String str, int i) {
            }

            public static k4o getEntries() {
                return $ENTRIES;
            }

            public static FormPayloadItemType valueOf(String str) {
                return (FormPayloadItemType) Enum.valueOf(FormPayloadItemType.class, str);
            }

            public static FormPayloadItemType[] values() {
                return (FormPayloadItemType[]) $VALUES.clone();
            }
        }

        public FormPayloadItem(FormPayloadItemType formPayloadItemType, int i) {
            this.itemType = formPayloadItemType;
            this.maxInputLength = i;
        }

        public static /* synthetic */ FormPayloadItem copy$default(FormPayloadItem formPayloadItem, FormPayloadItemType formPayloadItemType, int i, int i2, Object obj) {
            if ((i2 & 1) != 0) {
                formPayloadItemType = formPayloadItem.itemType;
            }
            if ((i2 & 2) != 0) {
                i = formPayloadItem.maxInputLength;
            }
            return formPayloadItem.copy(formPayloadItemType, i);
        }

        /* renamed from: component1, reason: from getter */
        public final FormPayloadItemType getItemType() {
            return this.itemType;
        }

        /* renamed from: component2, reason: from getter */
        public final int getMaxInputLength() {
            return this.maxInputLength;
        }

        public final FormPayloadItem copy(FormPayloadItemType itemType, int maxInputLength) {
            return new FormPayloadItem(itemType, maxInputLength);
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof FormPayloadItem)) {
                return false;
            }
            FormPayloadItem formPayloadItem = (FormPayloadItem) other;
            return this.itemType == formPayloadItem.itemType && this.maxInputLength == formPayloadItem.maxInputLength;
        }

        public final FormPayloadItemType getItemType() {
            return this.itemType;
        }

        public final int getMaxInputLength() {
            return this.maxInputLength;
        }

        public int hashCode() {
            return Integer.hashCode(this.maxInputLength) + (this.itemType.hashCode() * 31);
        }

        public String toString() {
            return "FormPayloadItem(itemType=" + this.itemType + ", maxInputLength=" + this.maxInputLength + Extension.C_BRAKE;
        }
    }

    public TransfersRequisitesFormPayloadsConfig(List<FormPayload> list) {
        this.payloads = list;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ TransfersRequisitesFormPayloadsConfig copy$default(TransfersRequisitesFormPayloadsConfig transfersRequisitesFormPayloadsConfig, List list, int i, Object obj) {
        if ((i & 1) != 0) {
            list = transfersRequisitesFormPayloadsConfig.payloads;
        }
        return transfersRequisitesFormPayloadsConfig.copy(list);
    }

    public final List<FormPayload> component1() {
        return this.payloads;
    }

    public final TransfersRequisitesFormPayloadsConfig copy(List<FormPayload> payloads) {
        return new TransfersRequisitesFormPayloadsConfig(payloads);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        return (other instanceof TransfersRequisitesFormPayloadsConfig) && jl40.l(this.payloads, ((TransfersRequisitesFormPayloadsConfig) other).payloads);
    }

    public final List<FormPayload> getPayloads() {
        return this.payloads;
    }

    public int hashCode() {
        return this.payloads.hashCode();
    }

    public final qo01 toEntity() {
        TransferRemoteConfig$TransfersRequisitesFormPayloadsEntity$FormPayloadEntity$FormEntityType transferRemoteConfig$TransfersRequisitesFormPayloadsEntity$FormPayloadEntity$FormEntityType;
        Object failure;
        List<FormPayload> list = this.payloads;
        ArrayList arrayList = new ArrayList(tcc.n(list, 10));
        for (FormPayload formPayload : list) {
            int i = d.a[formPayload.getFormType().ordinal()];
            if (i == 1) {
                transferRemoteConfig$TransfersRequisitesFormPayloadsEntity$FormPayloadEntity$FormEntityType = TransferRemoteConfig$TransfersRequisitesFormPayloadsEntity$FormPayloadEntity$FormEntityType.HCS;
            } else if (i == 2) {
                transferRemoteConfig$TransfersRequisitesFormPayloadsEntity$FormPayloadEntity$FormEntityType = TransferRemoteConfig$TransfersRequisitesFormPayloadsEntity$FormPayloadEntity$FormEntityType.PERSON;
            } else {
                if (i != 3) {
                    w511.b();
                    return null;
                }
                transferRemoteConfig$TransfersRequisitesFormPayloadsEntity$FormPayloadEntity$FormEntityType = TransferRemoteConfig$TransfersRequisitesFormPayloadsEntity$FormPayloadEntity$FormEntityType.LEGAL;
            }
            List<FormPayloadItem> formPayloadItems = formPayload.getFormPayloadItems();
            ArrayList arrayList2 = new ArrayList();
            for (FormPayloadItem formPayloadItem : formPayloadItems) {
                try {
                    failure = TransferRemoteConfig$TransfersRequisitesFormPayloadsEntity$FormPayloadItemEntity$FormPayloadItemEntityType.valueOf(formPayloadItem.getItemType().name());
                } catch (Throwable th) {
                    failure = new Result.Failure(th);
                }
                if (failure instanceof Result.Failure) {
                    failure = null;
                }
                TransferRemoteConfig$TransfersRequisitesFormPayloadsEntity$FormPayloadItemEntity$FormPayloadItemEntityType transferRemoteConfig$TransfersRequisitesFormPayloadsEntity$FormPayloadItemEntity$FormPayloadItemEntityType = (TransferRemoteConfig$TransfersRequisitesFormPayloadsEntity$FormPayloadItemEntity$FormPayloadItemEntityType) failure;
                po01 po01Var = transferRemoteConfig$TransfersRequisitesFormPayloadsEntity$FormPayloadItemEntity$FormPayloadItemEntityType == null ? null : new po01(transferRemoteConfig$TransfersRequisitesFormPayloadsEntity$FormPayloadItemEntity$FormPayloadItemEntityType, formPayloadItem.getMaxInputLength());
                if (po01Var != null) {
                    arrayList2.add(po01Var);
                }
            }
            arrayList.add(new oo01(transferRemoteConfig$TransfersRequisitesFormPayloadsEntity$FormPayloadEntity$FormEntityType, arrayList2));
        }
        return new qo01(arrayList);
    }

    public String toString() {
        return tse0.k("TransfersRequisitesFormPayloadsConfig(payloads=", Extension.C_BRAKE, this.payloads);
    }
}
