package com.yandex.go.payments.yb.experiments;

import defpackage.b64;
import defpackage.c6z;
import defpackage.g8e;
import defpackage.gsq0;
import defpackage.i3y;
import defpackage.jl40;
import defpackage.k4o;
import defpackage.oyr;
import defpackage.unr0;
import defpackage.w96;
import defpackage.z151;
import java.util.Map;
import kotlin.LazyThreadSafetyMode;
import kotlin.Metadata;
import ru.CryptoPro.JCP.tools.CertReader.Extension;

@gsq0
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\r\b\u0007\u0018\u0000 \u00032\u00020\u00012\u00020\u0002:\u000b\u0004\u0005\u0006\u0007\b\t\n\u000b\f\r\u000e¨\u0006\u000f"}, d2 = {"Lcom/yandex/go/payments/yb/experiments/YbInPaymentsPromotionExperiment;", "Lw96;", "Lc6z;", "Companion", "YbHeaderDto", "PaymentMethodListDto", "GroupItemLeading", "GroupItemTrailing", "AddCardDto", "AddCardTrailing", "ImageDto", "ImageType", "ContentType", "com/yandex/go/payments/yb/experiments/c", "$serializer", "impl"}, k = 1, mv = {2, 4, 0}, xi = 48)
/* loaded from: classes8.dex */
public final class YbInPaymentsPromotionExperiment extends w96 implements c6z {
    public static final c Companion = new c();
    public static final i3y[] f = {null, kotlin.a.b(LazyThreadSafetyMode.PUBLICATION, new z151(9)), null, null};
    public static final YbInPaymentsPromotionExperiment g = new YbInPaymentsPromotionExperiment(0);
    public final boolean b;
    public final Map c;
    public final AddCardDto d;
    public final PaymentMethodListDto e;

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\u0005\b\u0087\u0081\u0002\u0018\u0000 \u00022\b\u0012\u0004\u0012\u00020\u00000\u0001:\u0001\u0003j\u0002\b\u0004j\u0002\b\u0005¨\u0006\u0006"}, d2 = {"Lcom/yandex/go/payments/yb/experiments/YbInPaymentsPromotionExperiment$ContentType;", "", "Companion", "com/yandex/go/payments/yb/experiments/d", "LINK", "BUTTON", "impl"}, k = 1, mv = {2, 4, 0}, xi = 48)
    @gsq0
    public static final class ContentType {
        private static final /* synthetic */ k4o $ENTRIES;
        private static final /* synthetic */ ContentType[] $VALUES;
        private static final i3y $cachedSerializer$delegate;
        public static final ContentType BUTTON;
        public static final d Companion;
        public static final ContentType LINK;

        static {
            ContentType contentType = new ContentType("LINK", 0);
            LINK = contentType;
            ContentType contentType2 = new ContentType("BUTTON", 1);
            BUTTON = contentType2;
            ContentType[] contentTypeArr = {contentType, contentType2};
            $VALUES = contentTypeArr;
            $ENTRIES = kotlin.enums.a.a(contentTypeArr);
            Companion = new d();
            $cachedSerializer$delegate = kotlin.a.b(LazyThreadSafetyMode.PUBLICATION, new z151(10));
        }

        public static ContentType valueOf(String str) {
            return (ContentType) Enum.valueOf(ContentType.class, str);
        }

        public static ContentType[] values() {
            return (ContentType[]) $VALUES.clone();
        }
    }

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\u0004\b\u0087\u0081\u0002\u0018\u0000 \u00022\b\u0012\u0004\u0012\u00020\u00000\u0001:\u0001\u0003j\u0002\b\u0004¨\u0006\u0005"}, d2 = {"Lcom/yandex/go/payments/yb/experiments/YbInPaymentsPromotionExperiment$ImageType;", "", "Companion", "com/yandex/go/payments/yb/experiments/h", "YB", "impl"}, k = 1, mv = {2, 4, 0}, xi = 48)
    @gsq0
    public static final class ImageType {
        private static final /* synthetic */ k4o $ENTRIES;
        private static final /* synthetic */ ImageType[] $VALUES;
        private static final i3y $cachedSerializer$delegate;
        public static final h Companion;
        public static final ImageType YB;

        static {
            ImageType imageType = new ImageType("YB", 0);
            YB = imageType;
            ImageType[] imageTypeArr = {imageType};
            $VALUES = imageTypeArr;
            $ENTRIES = kotlin.enums.a.a(imageTypeArr);
            Companion = new h();
            $cachedSerializer$delegate = kotlin.a.b(LazyThreadSafetyMode.PUBLICATION, new z151(13));
        }

        public static ImageType valueOf(String str) {
            return (ImageType) Enum.valueOf(ImageType.class, str);
        }

        public static ImageType[] values() {
            return (ImageType[]) $VALUES.clone();
        }
    }

    public YbInPaymentsPromotionExperiment(int i, boolean z, Map map, AddCardDto addCardDto, PaymentMethodListDto paymentMethodListDto) {
        this.b = (i & 1) == 0 ? false : z;
        if ((i & 2) == 0) {
            this.c = kotlin.collections.b.f();
        } else {
            this.c = map;
        }
        if ((i & 4) == 0) {
            AddCardDto.Companion.getClass();
            this.d = AddCardDto.c;
        } else {
            this.d = addCardDto;
        }
        if ((i & 8) != 0) {
            this.e = paymentMethodListDto;
        } else {
            PaymentMethodListDto.Companion.getClass();
            this.e = PaymentMethodListDto.b;
        }
    }

    @Override // defpackage.c6z
    /* renamed from: f, reason: from getter */
    public final Map getC() {
        return this.c;
    }

    @Override // defpackage.w96
    /* renamed from: g, reason: from getter */
    public final boolean getB() {
        return this.b;
    }

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0004\b\u0087\b\u0018\u0000 \u00022\u00020\u0001:\u0002\u0003\u0004¨\u0006\u0005"}, d2 = {"Lcom/yandex/go/payments/yb/experiments/YbInPaymentsPromotionExperiment$PaymentMethodListDto;", "", "Companion", "com/yandex/go/payments/yb/experiments/i", "$serializer", "impl"}, k = 1, mv = {2, 4, 0}, xi = 48)
    @gsq0
    public static final /* data */ class PaymentMethodListDto {
        public static final i Companion = new i();
        public static final PaymentMethodListDto b = new PaymentMethodListDto(0);
        public final YbHeaderDto a;

        public /* synthetic */ PaymentMethodListDto(int i, YbHeaderDto ybHeaderDto) {
            if ((i & 1) == 0) {
                this.a = null;
            } else {
                this.a = ybHeaderDto;
            }
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof PaymentMethodListDto) && jl40.l(this.a, ((PaymentMethodListDto) obj).a);
        }

        public final int hashCode() {
            YbHeaderDto ybHeaderDto = this.a;
            if (ybHeaderDto == null) {
                return 0;
            }
            return ybHeaderDto.hashCode();
        }

        public final String toString() {
            return "PaymentMethodListDto(ybHeader=" + this.a + Extension.C_BRAKE;
        }

        public PaymentMethodListDto(int i) {
            this.a = null;
        }

        public PaymentMethodListDto() {
            this(0);
        }
    }

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0004\b\u0087\b\u0018\u0000 \u00022\u00020\u0001:\u0002\u0003\u0004¨\u0006\u0005"}, d2 = {"Lcom/yandex/go/payments/yb/experiments/YbInPaymentsPromotionExperiment$GroupItemLeading;", "", "Companion", "$serializer", "com/yandex/go/payments/yb/experiments/e", "impl"}, k = 1, mv = {2, 4, 0}, xi = 48)
    @gsq0
    public static final /* data */ class GroupItemLeading {
        public static final e Companion = new e();
        public final ImageDto a;

        public GroupItemLeading(int i, ImageDto imageDto) {
            if ((i & 1) != 0) {
                this.a = imageDto;
            } else {
                ImageDto.Companion.getClass();
                this.a = ImageDto.d;
            }
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof GroupItemLeading) && jl40.l(this.a, ((GroupItemLeading) obj).a);
        }

        public final int hashCode() {
            return this.a.hashCode();
        }

        public final String toString() {
            return "GroupItemLeading(image=" + this.a + Extension.C_BRAKE;
        }

        public GroupItemLeading() {
            ImageDto.Companion.getClass();
            this.a = ImageDto.d;
        }
    }

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0004\b\u0087\b\u0018\u0000 \u00022\u00020\u0001:\u0002\u0003\u0004¨\u0006\u0005"}, d2 = {"Lcom/yandex/go/payments/yb/experiments/YbInPaymentsPromotionExperiment$ImageDto;", "", "Companion", "com/yandex/go/payments/yb/experiments/g", "$serializer", "impl"}, k = 1, mv = {2, 4, 0}, xi = 48)
    @gsq0
    public static final /* data */ class ImageDto {
        public static final g Companion = new g();
        public static final i3y[] c = {kotlin.a.b(LazyThreadSafetyMode.PUBLICATION, new z151(12)), null};
        public static final ImageDto d = new ImageDto(0);
        public final ImageType a;
        public final String b;

        public /* synthetic */ ImageDto(int i, ImageType imageType, String str) {
            this.a = (i & 1) == 0 ? null : imageType;
            if ((i & 2) == 0) {
                this.b = "";
            } else {
                this.b = str;
            }
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof ImageDto)) {
                return false;
            }
            ImageDto imageDto = (ImageDto) obj;
            return this.a == imageDto.a && jl40.l(this.b, imageDto.b);
        }

        public final int hashCode() {
            ImageType imageType = this.a;
            return this.b.hashCode() + ((imageType == null ? 0 : imageType.hashCode()) * 31);
        }

        public final String toString() {
            return "ImageDto(imageType=" + this.a + ", contentDescriptionKey=" + this.b + Extension.C_BRAKE;
        }

        public ImageDto(int i) {
            this.a = null;
            this.b = "";
        }

        public ImageDto() {
            this(0);
        }
    }

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0004\b\u0087\b\u0018\u0000 \u00022\u00020\u0001:\u0002\u0003\u0004¨\u0006\u0005"}, d2 = {"Lcom/yandex/go/payments/yb/experiments/YbInPaymentsPromotionExperiment$YbHeaderDto;", "", "Companion", "com/yandex/go/payments/yb/experiments/j", "$serializer", "impl"}, k = 1, mv = {2, 4, 0}, xi = 48)
    @gsq0
    public static final /* data */ class YbHeaderDto {
        public static final j Companion = new j();
        public final GroupItemLeading a;
        public final GroupItemTrailing b;

        public YbHeaderDto(int i, GroupItemLeading groupItemLeading, GroupItemTrailing groupItemTrailing) {
            this.a = (i & 1) == 0 ? null : groupItemLeading;
            if ((i & 2) != 0) {
                this.b = groupItemTrailing;
            } else {
                GroupItemTrailing.Companion.getClass();
                this.b = GroupItemTrailing.g;
            }
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof YbHeaderDto)) {
                return false;
            }
            YbHeaderDto ybHeaderDto = (YbHeaderDto) obj;
            return jl40.l(this.a, ybHeaderDto.a) && jl40.l(this.b, ybHeaderDto.b);
        }

        public final int hashCode() {
            GroupItemLeading groupItemLeading = this.a;
            return this.b.hashCode() + ((groupItemLeading == null ? 0 : groupItemLeading.a.hashCode()) * 31);
        }

        public final String toString() {
            return "YbHeaderDto(leading=" + this.a + ", trailing=" + this.b + Extension.C_BRAKE;
        }

        public YbHeaderDto() {
            GroupItemTrailing.Companion.getClass();
            GroupItemTrailing groupItemTrailing = GroupItemTrailing.g;
            this.a = null;
            this.b = groupItemTrailing;
        }
    }

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0004\b\u0087\b\u0018\u0000 \u00022\u00020\u0001:\u0002\u0003\u0004¨\u0006\u0005"}, d2 = {"Lcom/yandex/go/payments/yb/experiments/YbInPaymentsPromotionExperiment$AddCardDto;", "", "Companion", "com/yandex/go/payments/yb/experiments/a", "$serializer", "impl"}, k = 1, mv = {2, 4, 0}, xi = 48)
    @gsq0
    public static final /* data */ class AddCardDto {
        public static final a Companion = new a();
        public static final AddCardDto c = new AddCardDto(0);
        public final ImageDto a;
        public final AddCardTrailing b;

        public AddCardDto(int i, ImageDto imageDto, AddCardTrailing addCardTrailing) {
            if ((i & 1) == 0) {
                ImageDto.Companion.getClass();
                imageDto = ImageDto.d;
            }
            this.a = imageDto;
            if ((i & 2) != 0) {
                this.b = addCardTrailing;
            } else {
                AddCardTrailing.Companion.getClass();
                this.b = AddCardTrailing.d;
            }
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof AddCardDto)) {
                return false;
            }
            AddCardDto addCardDto = (AddCardDto) obj;
            return jl40.l(this.a, addCardDto.a) && jl40.l(this.b, addCardDto.b);
        }

        public final int hashCode() {
            return this.b.hashCode() + (this.a.hashCode() * 31);
        }

        public final String toString() {
            return "AddCardDto(image=" + this.a + ", trailing=" + this.b + Extension.C_BRAKE;
        }

        public AddCardDto() {
            this(0);
        }

        public AddCardDto(int i) {
            ImageDto.Companion.getClass();
            ImageDto imageDto = ImageDto.d;
            AddCardTrailing.Companion.getClass();
            this.a = imageDto;
            this.b = AddCardTrailing.d;
        }
    }

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0004\b\u0087\b\u0018\u0000 \u00022\u00020\u0001:\u0002\u0003\u0004¨\u0006\u0005"}, d2 = {"Lcom/yandex/go/payments/yb/experiments/YbInPaymentsPromotionExperiment$AddCardTrailing;", "", "Companion", "com/yandex/go/payments/yb/experiments/b", "$serializer", "impl"}, k = 1, mv = {2, 4, 0}, xi = 48)
    @gsq0
    public static final /* data */ class AddCardTrailing {
        public static final b Companion = new b();
        public static final AddCardTrailing d = new AddCardTrailing(0);
        public final String a;
        public final String b;
        public final String c;

        public /* synthetic */ AddCardTrailing(int i, String str, String str2, String str3) {
            if ((i & 1) == 0) {
                this.a = "";
            } else {
                this.a = str;
            }
            if ((i & 2) == 0) {
                this.b = "";
            } else {
                this.b = str2;
            }
            if ((i & 4) == 0) {
                this.c = "";
            } else {
                this.c = str3;
            }
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof AddCardTrailing)) {
                return false;
            }
            AddCardTrailing addCardTrailing = (AddCardTrailing) obj;
            return jl40.l(this.a, addCardTrailing.a) && jl40.l(this.b, addCardTrailing.b) && jl40.l(this.c, addCardTrailing.c);
        }

        public final int hashCode() {
            return this.c.hashCode() + unr0.b(this.a.hashCode() * 31, 31, this.b);
        }

        public final String toString() {
            return oyr.t(b64.v("AddCardTrailing(textKey=", this.a, ", url=", this.b, ", contentDescriptionKey="), this.c, Extension.C_BRAKE);
        }

        public AddCardTrailing(int i) {
            this.a = "";
            this.b = "";
            this.c = "";
        }

        public AddCardTrailing() {
            this(0);
        }
    }

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0004\b\u0087\b\u0018\u0000 \u00022\u00020\u0001:\u0002\u0003\u0004¨\u0006\u0005"}, d2 = {"Lcom/yandex/go/payments/yb/experiments/YbInPaymentsPromotionExperiment$GroupItemTrailing;", "", "Companion", "com/yandex/go/payments/yb/experiments/f", "$serializer", "impl"}, k = 1, mv = {2, 4, 0}, xi = 48)
    @gsq0
    public static final /* data */ class GroupItemTrailing {
        public static final f Companion = new f();
        public static final i3y[] f = {null, null, null, null, kotlin.a.b(LazyThreadSafetyMode.PUBLICATION, new z151(11))};
        public static final GroupItemTrailing g = new GroupItemTrailing(0);
        public final String a;
        public final String b;
        public final String c;
        public final String d;
        public final ContentType e;

        public /* synthetic */ GroupItemTrailing(int i, String str, String str2, String str3, String str4, ContentType contentType) {
            if ((i & 1) == 0) {
                this.a = "";
            } else {
                this.a = str;
            }
            if ((i & 2) == 0) {
                this.b = "";
            } else {
                this.b = str2;
            }
            if ((i & 4) == 0) {
                this.c = "";
            } else {
                this.c = str3;
            }
            if ((i & 8) == 0) {
                this.d = "";
            } else {
                this.d = str4;
            }
            if ((i & 16) == 0) {
                this.e = ContentType.LINK;
            } else {
                this.e = contentType;
            }
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof GroupItemTrailing)) {
                return false;
            }
            GroupItemTrailing groupItemTrailing = (GroupItemTrailing) obj;
            return jl40.l(this.a, groupItemTrailing.a) && jl40.l(this.b, groupItemTrailing.b) && jl40.l(this.c, groupItemTrailing.c) && jl40.l(this.d, groupItemTrailing.d) && this.e == groupItemTrailing.e;
        }

        public final int hashCode() {
            return this.e.hashCode() + unr0.b(unr0.b(unr0.b(this.a.hashCode() * 31, 31, this.b), 31, this.c), 31, this.d);
        }

        public final String toString() {
            StringBuilder v = b64.v("GroupItemTrailing(textKey=", this.a, ", url=", this.b, ", deeplink=");
            g8e.D(v, this.c, ", contentDescriptionKey=", this.d, ", contentType=");
            v.append(this.e);
            v.append(Extension.C_BRAKE);
            return v.toString();
        }

        public GroupItemTrailing() {
            this(0);
        }

        public GroupItemTrailing(int i) {
            ContentType contentType = ContentType.LINK;
            this.a = "";
            this.b = "";
            this.c = "";
            this.d = "";
            this.e = contentType;
        }
    }

    public YbInPaymentsPromotionExperiment() {
        this(0);
    }

    public YbInPaymentsPromotionExperiment(int i) {
        Map f2 = kotlin.collections.b.f();
        AddCardDto.Companion.getClass();
        AddCardDto addCardDto = AddCardDto.c;
        PaymentMethodListDto.Companion.getClass();
        this.b = false;
        this.c = f2;
        this.d = addCardDto;
        this.e = PaymentMethodListDto.b;
    }
}
