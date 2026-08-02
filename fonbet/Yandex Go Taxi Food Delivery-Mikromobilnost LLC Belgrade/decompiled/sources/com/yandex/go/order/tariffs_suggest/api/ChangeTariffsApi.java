package com.yandex.go.order.tariffs_suggest.api;

import defpackage.cmt;
import defpackage.gsq0;
import defpackage.i3y;
import defpackage.jc9;
import defpackage.jl40;
import defpackage.k4o;
import defpackage.oyr;
import defpackage.q76;
import defpackage.s490;
import defpackage.unr0;
import defpackage.xvz;
import defpackage.z8u;
import java.util.List;
import kotlin.LazyThreadSafetyMode;
import kotlin.Metadata;
import kotlin.collections.EmptyList;
import ru.CryptoPro.JCP.tools.CertReader.Extension;

@Metadata(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\bf\u0018\u00002\u00020\u0001:\u0002\n\u000bJ)\u0010\b\u001a\b\u0012\u0004\u0012\u00020\u00070\u00062\b\b\u0001\u0010\u0003\u001a\u00020\u00022\b\b\u0001\u0010\u0005\u001a\u00020\u0004H'¢\u0006\u0004\b\b\u0010\t¨\u0006\fÀ\u0006\u0003"}, d2 = {"Lcom/yandex/go/order/tariffs_suggest/api/ChangeTariffsApi;", "", "", "idempotencyToken", "Lcom/yandex/go/order/tariffs_suggest/api/ChangeTariffsApi$ChangeTariffRequest;", "requestParam", "Lcmt;", "Lcom/yandex/go/order/tariffs_suggest/api/ChangeTariffsApi$ChangeTariffDto;", "a", "(Ljava/lang/String;Lcom/yandex/go/order/tariffs_suggest/api/ChangeTariffsApi$ChangeTariffRequest;)Lcmt;", "ChangeTariffRequest", "ChangeTariffDto", "impl"}, k = 1, mv = {2, 4, 0}, xi = 48)
/* loaded from: classes12.dex */
public interface ChangeTariffsApi {
    @s490("order-modifier/v1/change-tariffs")
    cmt<ChangeTariffDto> a(@z8u("X-Idempotency-Token") String idempotencyToken, @q76 ChangeTariffRequest requestParam);

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0006\b\u0087\b\u0018\u0000 \u00022\u00020\u0001:\u0004\u0003\u0004\u0005\u0006¨\u0006\u0007"}, d2 = {"Lcom/yandex/go/order/tariffs_suggest/api/ChangeTariffsApi$ChangeTariffDto;", "", "Companion", "StatusDto", "Message", "$serializer", "com/yandex/go/order/tariffs_suggest/api/a", "impl"}, k = 1, mv = {2, 4, 0}, xi = 48)
    @gsq0
    public static final /* data */ class ChangeTariffDto {
        public static final a Companion = new a();
        public static final i3y[] e = {kotlin.a.b(LazyThreadSafetyMode.PUBLICATION, new jc9(16)), null, null, null};
        public final StatusDto a;
        public final String b;
        public final String c;
        public final Message d;

        /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
        /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
        @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\u0007\b\u0087\u0081\u0002\u0018\u0000 \u00022\b\u0012\u0004\u0012\u00020\u00000\u0001:\u0001\u0003j\u0002\b\u0004j\u0002\b\u0005j\u0002\b\u0006j\u0002\b\u0007¨\u0006\b"}, d2 = {"Lcom/yandex/go/order/tariffs_suggest/api/ChangeTariffsApi$ChangeTariffDto$StatusDto;", "", "Companion", "com/yandex/go/order/tariffs_suggest/api/c", "PENDING", "FAILED", "UNAVAILABLE", "SUCCESS", "impl"}, k = 1, mv = {2, 4, 0}, xi = 48)
        @gsq0
        public static final class StatusDto {
            private static final /* synthetic */ k4o $ENTRIES;
            private static final /* synthetic */ StatusDto[] $VALUES;
            private static final i3y $cachedSerializer$delegate;
            public static final c Companion;
            public static final StatusDto FAILED;
            public static final StatusDto PENDING;
            public static final StatusDto SUCCESS;
            public static final StatusDto UNAVAILABLE;

            static {
                StatusDto statusDto = new StatusDto("PENDING", 0);
                PENDING = statusDto;
                StatusDto statusDto2 = new StatusDto("FAILED", 1);
                FAILED = statusDto2;
                StatusDto statusDto3 = new StatusDto("UNAVAILABLE", 2);
                UNAVAILABLE = statusDto3;
                StatusDto statusDto4 = new StatusDto("SUCCESS", 3);
                SUCCESS = statusDto4;
                StatusDto[] statusDtoArr = {statusDto, statusDto2, statusDto3, statusDto4};
                $VALUES = statusDtoArr;
                $ENTRIES = kotlin.enums.a.a(statusDtoArr);
                Companion = new c();
                $cachedSerializer$delegate = kotlin.a.b(LazyThreadSafetyMode.PUBLICATION, new jc9(17));
            }

            public static StatusDto valueOf(String str) {
                return (StatusDto) Enum.valueOf(StatusDto.class, str);
            }

            public static StatusDto[] values() {
                return (StatusDto[]) $VALUES.clone();
            }
        }

        public /* synthetic */ ChangeTariffDto(int i, StatusDto statusDto, String str, String str2, Message message) {
            this.a = (i & 1) == 0 ? StatusDto.PENDING : statusDto;
            if ((i & 2) == 0) {
                this.b = null;
            } else {
                this.b = str;
            }
            if ((i & 4) == 0) {
                this.c = null;
            } else {
                this.c = str2;
            }
            if ((i & 8) == 0) {
                this.d = null;
            } else {
                this.d = message;
            }
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof ChangeTariffDto)) {
                return false;
            }
            ChangeTariffDto changeTariffDto = (ChangeTariffDto) obj;
            return this.a == changeTariffDto.a && jl40.l(this.b, changeTariffDto.b) && jl40.l(this.c, changeTariffDto.c) && jl40.l(this.d, changeTariffDto.d);
        }

        public final int hashCode() {
            int hashCode = this.a.hashCode() * 31;
            String str = this.b;
            int hashCode2 = (hashCode + (str == null ? 0 : str.hashCode())) * 31;
            String str2 = this.c;
            int hashCode3 = (hashCode2 + (str2 == null ? 0 : str2.hashCode())) * 31;
            Message message = this.d;
            return hashCode3 + (message != null ? message.hashCode() : 0);
        }

        public final String toString() {
            return "ChangeTariffDto(status=" + this.a + ", changeId=" + this.b + ", reason=" + this.c + ", message=" + this.d + Extension.C_BRAKE;
        }

        @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0004\b\u0007\u0018\u0000 \u00022\u00020\u0001:\u0002\u0003\u0004¨\u0006\u0005"}, d2 = {"Lcom/yandex/go/order/tariffs_suggest/api/ChangeTariffsApi$ChangeTariffDto$Message;", "", "Companion", "$serializer", "com/yandex/go/order/tariffs_suggest/api/b", "impl"}, k = 1, mv = {2, 4, 0}, xi = 48)
        @gsq0
        public static final class Message {
            public static final b Companion = new b();
            public final String a;
            public final String b;

            public /* synthetic */ Message(int i, String str, String str2) {
                if ((i & 1) == 0) {
                    this.a = null;
                } else {
                    this.a = str;
                }
                if ((i & 2) == 0) {
                    this.b = null;
                } else {
                    this.b = str2;
                }
            }

            public Message() {
                this.a = null;
                this.b = null;
            }
        }

        public ChangeTariffDto() {
            this.a = StatusDto.PENDING;
            this.b = null;
            this.c = null;
            this.d = null;
        }
    }

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0004\b\u0087\b\u0018\u0000 \u00022\u00020\u0001:\u0002\u0003\u0004¨\u0006\u0005"}, d2 = {"Lcom/yandex/go/order/tariffs_suggest/api/ChangeTariffsApi$ChangeTariffRequest;", "", "Companion", "$serializer", "com/yandex/go/order/tariffs_suggest/api/d", "impl"}, k = 1, mv = {2, 4, 0}, xi = 48)
    @gsq0
    public static final /* data */ class ChangeTariffRequest {
        public static final d Companion = new d();
        public static final i3y[] d = {null, kotlin.a.b(LazyThreadSafetyMode.PUBLICATION, new jc9(18)), null};
        public final String a;
        public final List b;
        public final String c;

        public /* synthetic */ ChangeTariffRequest(int i, String str, String str2, List list) {
            this.a = (i & 1) == 0 ? "" : str;
            if ((i & 2) == 0) {
                this.b = EmptyList.a;
            } else {
                this.b = list;
            }
            if ((i & 4) == 0) {
                this.c = null;
            } else {
                this.c = str2;
            }
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof ChangeTariffRequest)) {
                return false;
            }
            ChangeTariffRequest changeTariffRequest = (ChangeTariffRequest) obj;
            return jl40.l(this.a, changeTariffRequest.a) && jl40.l(this.b, changeTariffRequest.b) && jl40.l(this.c, changeTariffRequest.c);
        }

        public final int hashCode() {
            int c = unr0.c(this.a.hashCode() * 31, 31, this.b);
            String str = this.c;
            return c + (str == null ? 0 : str.hashCode());
        }

        public final String toString() {
            return oyr.t(xvz.r("ChangeTariffRequest(orderId=", this.a, ", selectedTariffs=", this.b, ", suggestId="), this.c, Extension.C_BRAKE);
        }

        public ChangeTariffRequest(String str, List list, String str2) {
            this.a = str;
            this.b = list;
            this.c = str2;
        }

        public ChangeTariffRequest() {
            this("", EmptyList.a, null);
        }
    }
}
