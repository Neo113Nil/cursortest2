package com.yandex.go.chargers.station.data.model;

import com.yandex.go.chargers.discounts.api.data.model.ChargersDiscountDto;
import com.yandex.go.chargers.surge.data.ChargersSurgeDto;
import com.yandex.go.chargers.tariff_item_info.api.data.model.ChargersTariffDto;
import com.yandex.go.chargers.tariff_item_info.api.data.model.ChargersTariffModalDto;
import defpackage.fna;
import defpackage.gsq0;
import defpackage.i3y;
import java.util.List;
import kotlin.LazyThreadSafetyMode;
import kotlin.Metadata;
import kotlin.collections.EmptyList;
import ru.yandex.taxi.common_models.net.FormattedText;

@gsq0
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u000b\b\u0007\u0018\u0000 \u00022\u00020\u0001:\t\u0003\u0004\u0005\u0006\u0007\b\t\n\u000b¨\u0006\f"}, d2 = {"Lcom/yandex/go/chargers/station/data/model/ChargersStationDetailsResponse;", "", "Companion", "AboutLocation", "UsageInstruction", "PopupV2", "Popup", "PartnerInformationDto", "ChargersStationOrderDetails", "NotificationDto", "$serializer", "com/yandex/go/chargers/station/data/model/i", "impl"}, k = 1, mv = {2, 4, 0}, xi = 48)
/* loaded from: classes12.dex */
public final class ChargersStationDetailsResponse {
    public static final i Companion = new i();
    public static final i3y[] q;
    public final FormattedText a;
    public final FormattedText b;
    public final AboutLocation c;
    public final UsageInstruction d;
    public final List e;
    public final ChargersTariffDto f;
    public final ChargersStationShortInfoDto g;
    public final ChargersTariffModalDto h;
    public final Popup i;
    public final List j;
    public final List k;
    public final PartnerInformationDto l;
    public final ChargersSurgeDto m;
    public final ChargersStationOrderDetails n;
    public final NotificationDto o;
    public final ChargersDiscountDto p;

    static {
        LazyThreadSafetyMode lazyThreadSafetyMode = LazyThreadSafetyMode.PUBLICATION;
        q = new i3y[]{null, null, null, null, kotlin.a.b(lazyThreadSafetyMode, new fna(20)), null, null, null, null, kotlin.a.b(lazyThreadSafetyMode, new fna(21)), kotlin.a.b(lazyThreadSafetyMode, new fna(22)), null, null, null, null, null};
    }

    public /* synthetic */ ChargersStationDetailsResponse(int i, FormattedText formattedText, FormattedText formattedText2, AboutLocation aboutLocation, UsageInstruction usageInstruction, List list, ChargersTariffDto chargersTariffDto, ChargersStationShortInfoDto chargersStationShortInfoDto, ChargersTariffModalDto chargersTariffModalDto, Popup popup, List list2, List list3, PartnerInformationDto partnerInformationDto, ChargersSurgeDto chargersSurgeDto, ChargersStationOrderDetails chargersStationOrderDetails, NotificationDto notificationDto, ChargersDiscountDto chargersDiscountDto) {
        this.a = (i & 1) == 0 ? FormattedText.c : formattedText;
        if ((i & 2) == 0) {
            this.b = FormattedText.c;
        } else {
            this.b = formattedText2;
        }
        if ((i & 4) == 0) {
            this.c = null;
        } else {
            this.c = aboutLocation;
        }
        if ((i & 8) == 0) {
            this.d = null;
        } else {
            this.d = usageInstruction;
        }
        if ((i & 16) == 0) {
            this.e = EmptyList.a;
        } else {
            this.e = list;
        }
        if ((i & 32) == 0) {
            this.f = null;
        } else {
            this.f = chargersTariffDto;
        }
        if ((i & 64) == 0) {
            this.g = null;
        } else {
            this.g = chargersStationShortInfoDto;
        }
        if ((i & 128) == 0) {
            this.h = null;
        } else {
            this.h = chargersTariffModalDto;
        }
        if ((i & 256) == 0) {
            this.i = null;
        } else {
            this.i = popup;
        }
        if ((i & 512) == 0) {
            this.j = null;
        } else {
            this.j = list2;
        }
        if ((i & 1024) == 0) {
            this.k = null;
        } else {
            this.k = list3;
        }
        if ((i & 2048) == 0) {
            this.l = null;
        } else {
            this.l = partnerInformationDto;
        }
        if ((i & 4096) == 0) {
            this.m = null;
        } else {
            this.m = chargersSurgeDto;
        }
        if ((i & 8192) == 0) {
            this.n = null;
        } else {
            this.n = chargersStationOrderDetails;
        }
        if ((i & 16384) == 0) {
            this.o = null;
        } else {
            this.o = notificationDto;
        }
        if ((i & 32768) == 0) {
            this.p = null;
        } else {
            this.p = chargersDiscountDto;
        }
    }

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0005\b\u0007\u0018\u0000 \u00022\u00020\u0001:\u0003\u0003\u0004\u0005¨\u0006\u0006"}, d2 = {"Lcom/yandex/go/chargers/station/data/model/ChargersStationDetailsResponse$PopupV2;", "", "Companion", "ShowPolicy", "$serializer", "com/yandex/go/chargers/station/data/model/n", "impl"}, k = 1, mv = {2, 4, 0}, xi = 48)
    @gsq0
    public static final class PopupV2 {
        public static final n Companion = new n();
        public final String a;
        public final String b;
        public final FormattedText c;
        public final FormattedText d;
        public final ShowPolicy e;

        public /* synthetic */ PopupV2(int i, String str, String str2, FormattedText formattedText, FormattedText formattedText2, ShowPolicy showPolicy) {
            this.a = (i & 1) == 0 ? "" : str;
            if ((i & 2) == 0) {
                this.b = null;
            } else {
                this.b = str2;
            }
            if ((i & 4) == 0) {
                this.c = FormattedText.c;
            } else {
                this.c = formattedText;
            }
            if ((i & 8) == 0) {
                this.d = null;
            } else {
                this.d = formattedText2;
            }
            if ((i & 16) == 0) {
                this.e = null;
            } else {
                this.e = showPolicy;
            }
        }

        @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0004\b\u0007\u0018\u0000 \u00022\u00020\u0001:\u0002\u0003\u0004¨\u0006\u0005"}, d2 = {"Lcom/yandex/go/chargers/station/data/model/ChargersStationDetailsResponse$PopupV2$ShowPolicy;", "", "Companion", "$serializer", "com/yandex/go/chargers/station/data/model/o", "impl"}, k = 1, mv = {2, 4, 0}, xi = 48)
        @gsq0
        public static final class ShowPolicy {
            public static final o Companion = new o();
            public final int a;

            public /* synthetic */ ShowPolicy(int i, int i2) {
                if ((i & 1) == 0) {
                    this.a = 0;
                } else {
                    this.a = i2;
                }
            }

            public ShowPolicy() {
                this.a = 0;
            }
        }

        public PopupV2() {
            FormattedText formattedText = FormattedText.c;
            this.a = "";
            this.b = null;
            this.c = formattedText;
            this.d = null;
            this.e = null;
        }
    }

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0004\b\u0007\u0018\u0000 \u00022\u00020\u0001:\u0002\u0003\u0004¨\u0006\u0005"}, d2 = {"Lcom/yandex/go/chargers/station/data/model/ChargersStationDetailsResponse$ChargersStationOrderDetails;", "", "Companion", "$serializer", "com/yandex/go/chargers/station/data/model/h", "impl"}, k = 1, mv = {2, 4, 0}, xi = 48)
    @gsq0
    public static final class ChargersStationOrderDetails {
        public static final h Companion = new h();
        public final Integer a;
        public final int b;

        public /* synthetic */ ChargersStationOrderDetails(int i, int i2, Integer num) {
            this.a = (i & 1) == 0 ? null : num;
            if ((i & 2) == 0) {
                this.b = 0;
            } else {
                this.b = i2;
            }
        }

        public ChargersStationOrderDetails() {
            this.a = null;
            this.b = 0;
        }
    }

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0005\b\u0007\u0018\u0000 \u00022\u00020\u0001:\u0003\u0003\u0004\u0005¨\u0006\u0006"}, d2 = {"Lcom/yandex/go/chargers/station/data/model/ChargersStationDetailsResponse$Popup;", "", "Companion", "ShowPolicy", "$serializer", "com/yandex/go/chargers/station/data/model/l", "impl"}, k = 1, mv = {2, 4, 0}, xi = 48)
    @gsq0
    public static final class Popup {
        public static final l Companion = new l();
        public final String a;
        public final FormattedText b;
        public final FormattedText c;
        public final ShowPolicy d;

        public /* synthetic */ Popup(int i, String str, FormattedText formattedText, FormattedText formattedText2, ShowPolicy showPolicy) {
            if ((i & 1) == 0) {
                this.a = null;
            } else {
                this.a = str;
            }
            if ((i & 2) == 0) {
                this.b = FormattedText.c;
            } else {
                this.b = formattedText;
            }
            if ((i & 4) == 0) {
                this.c = null;
            } else {
                this.c = formattedText2;
            }
            if ((i & 8) == 0) {
                this.d = new ShowPolicy(0);
            } else {
                this.d = showPolicy;
            }
        }

        @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0004\b\u0007\u0018\u0000 \u00022\u00020\u0001:\u0002\u0003\u0004¨\u0006\u0005"}, d2 = {"Lcom/yandex/go/chargers/station/data/model/ChargersStationDetailsResponse$Popup$ShowPolicy;", "", "Companion", "$serializer", "com/yandex/go/chargers/station/data/model/m", "impl"}, k = 1, mv = {2, 4, 0}, xi = 48)
        @gsq0
        public static final class ShowPolicy {
            public static final m Companion = new m();
            public final String a;
            public final int b;

            public /* synthetic */ ShowPolicy(int i, String str, int i2) {
                this.a = (i & 1) == 0 ? "" : str;
                if ((i & 2) == 0) {
                    this.b = 1;
                } else {
                    this.b = i2;
                }
            }

            public ShowPolicy(int i) {
                this.a = "";
                this.b = 1;
            }

            public ShowPolicy() {
                this(0);
            }
        }

        public Popup() {
            FormattedText formattedText = FormattedText.c;
            ShowPolicy showPolicy = new ShowPolicy(0);
            this.a = null;
            this.b = formattedText;
            this.c = null;
            this.d = showPolicy;
        }
    }

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0005\b\u0007\u0018\u0000 \u00022\u00020\u0001:\u0003\u0003\u0004\u0005¨\u0006\u0006"}, d2 = {"Lcom/yandex/go/chargers/station/data/model/ChargersStationDetailsResponse$UsageInstruction;", "", "Companion", "InstructionItem", "$serializer", "com/yandex/go/chargers/station/data/model/p", "impl"}, k = 1, mv = {2, 4, 0}, xi = 48)
    @gsq0
    public static final class UsageInstruction {
        public static final p Companion = new p();
        public static final i3y[] c = {null, kotlin.a.b(LazyThreadSafetyMode.PUBLICATION, new fna(26))};
        public final FormattedText a;
        public final List b;

        public /* synthetic */ UsageInstruction(int i, FormattedText formattedText, List list) {
            if ((i & 1) == 0) {
                this.a = null;
            } else {
                this.a = formattedText;
            }
            if ((i & 2) == 0) {
                this.b = null;
            } else {
                this.b = list;
            }
        }

        @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0004\b\u0007\u0018\u0000 \u00022\u00020\u0001:\u0002\u0003\u0004¨\u0006\u0005"}, d2 = {"Lcom/yandex/go/chargers/station/data/model/ChargersStationDetailsResponse$UsageInstruction$InstructionItem;", "", "Companion", "$serializer", "com/yandex/go/chargers/station/data/model/q", "impl"}, k = 1, mv = {2, 4, 0}, xi = 48)
        @gsq0
        public static final class InstructionItem {
            public static final q Companion = new q();
            public final String a;
            public final FormattedText b;

            public /* synthetic */ InstructionItem(int i, String str, FormattedText formattedText) {
                this.a = (i & 1) == 0 ? null : str;
                if ((i & 2) == 0) {
                    this.b = FormattedText.c;
                } else {
                    this.b = formattedText;
                }
            }

            public InstructionItem() {
                FormattedText formattedText = FormattedText.c;
                this.a = null;
                this.b = formattedText;
            }
        }

        public UsageInstruction() {
            this.a = null;
            this.b = null;
        }
    }

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0007\b\u0007\u0018\u0000 \u00022\u00020\u0001:\u0005\u0003\u0004\u0005\u0006\u0007¨\u0006\b"}, d2 = {"Lcom/yandex/go/chargers/station/data/model/ChargersStationDetailsResponse$AboutLocation;", "", "Companion", "DetailsBrick", "com/yandex/go/chargers/station/data/model/f", "com/yandex/go/chargers/station/data/model/g", "$serializer", "com/yandex/go/chargers/station/data/model/b", "impl"}, k = 1, mv = {2, 4, 0}, xi = 48)
    @gsq0
    public static final class AboutLocation {
        public static final b Companion = new b();
        public static final i3y[] d;
        public final List a;
        public final List b;
        public final f c;

        static {
            LazyThreadSafetyMode lazyThreadSafetyMode = LazyThreadSafetyMode.PUBLICATION;
            d = new i3y[]{kotlin.a.b(lazyThreadSafetyMode, new fna(23)), kotlin.a.b(lazyThreadSafetyMode, new fna(24)), null};
        }

        public /* synthetic */ AboutLocation(int i, List list, List list2, f fVar) {
            if ((i & 1) == 0) {
                this.a = null;
            } else {
                this.a = list;
            }
            if ((i & 2) == 0) {
                this.b = null;
            } else {
                this.b = list2;
            }
            if ((i & 4) == 0) {
                this.c = null;
            } else {
                this.c = fVar;
            }
        }

        @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0004\b\u0007\u0018\u0000 \u00022\u00020\u0001:\u0002\u0003\u0004¨\u0006\u0005"}, d2 = {"Lcom/yandex/go/chargers/station/data/model/ChargersStationDetailsResponse$AboutLocation$DetailsBrick;", "", "Companion", "$serializer", "com/yandex/go/chargers/station/data/model/c", "impl"}, k = 1, mv = {2, 4, 0}, xi = 48)
        @gsq0
        public static final class DetailsBrick {
            public static final c Companion = new c();
            public final FormattedText a;
            public final FormattedText b;

            public /* synthetic */ DetailsBrick(int i, FormattedText formattedText, FormattedText formattedText2) {
                this.a = (i & 1) == 0 ? FormattedText.c : formattedText;
                if ((i & 2) == 0) {
                    this.b = FormattedText.c;
                } else {
                    this.b = formattedText2;
                }
            }

            public DetailsBrick() {
                FormattedText formattedText = FormattedText.c;
                this.a = formattedText;
                this.b = formattedText;
            }
        }

        public AboutLocation() {
            this.a = null;
            this.b = null;
            this.c = null;
        }
    }

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0004\b\u0007\u0018\u0000 \u00022\u00020\u0001:\u0002\u0003\u0004¨\u0006\u0005"}, d2 = {"Lcom/yandex/go/chargers/station/data/model/ChargersStationDetailsResponse$NotificationDto;", "", "Companion", "$serializer", "com/yandex/go/chargers/station/data/model/j", "impl"}, k = 1, mv = {2, 4, 0}, xi = 48)
    @gsq0
    public static final class NotificationDto {
        public static final j Companion = new j();
        public final String a;
        public final FormattedText b;

        public /* synthetic */ NotificationDto(int i, String str, FormattedText formattedText) {
            this.a = (i & 1) == 0 ? null : str;
            if ((i & 2) == 0) {
                this.b = FormattedText.c;
            } else {
                this.b = formattedText;
            }
        }

        public NotificationDto() {
            FormattedText formattedText = FormattedText.c;
            this.a = null;
            this.b = formattedText;
        }
    }

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0004\b\u0007\u0018\u0000 \u00022\u00020\u0001:\u0002\u0003\u0004¨\u0006\u0005"}, d2 = {"Lcom/yandex/go/chargers/station/data/model/ChargersStationDetailsResponse$PartnerInformationDto;", "", "Companion", "$serializer", "com/yandex/go/chargers/station/data/model/k", "impl"}, k = 1, mv = {2, 4, 0}, xi = 48)
    @gsq0
    public static final class PartnerInformationDto {
        public static final k Companion = new k();
        public final String a;
        public final FormattedText b;
        public final FormattedText c;
        public final FormattedText d;

        public /* synthetic */ PartnerInformationDto(int i, String str, FormattedText formattedText, FormattedText formattedText2, FormattedText formattedText3) {
            this.a = (i & 1) == 0 ? null : str;
            if ((i & 2) == 0) {
                this.b = FormattedText.c;
            } else {
                this.b = formattedText;
            }
            if ((i & 4) == 0) {
                this.c = FormattedText.c;
            } else {
                this.c = formattedText2;
            }
            if ((i & 8) == 0) {
                this.d = FormattedText.c;
            } else {
                this.d = formattedText3;
            }
        }

        public PartnerInformationDto() {
            FormattedText formattedText = FormattedText.c;
            this.a = null;
            this.b = formattedText;
            this.c = formattedText;
            this.d = formattedText;
        }
    }

    public ChargersStationDetailsResponse() {
        FormattedText formattedText = FormattedText.c;
        this.a = formattedText;
        this.b = formattedText;
        this.c = null;
        this.d = null;
        this.e = EmptyList.a;
        this.f = null;
        this.g = null;
        this.h = null;
        this.i = null;
        this.j = null;
        this.k = null;
        this.l = null;
        this.m = null;
        this.n = null;
        this.o = null;
        this.p = null;
    }
}
