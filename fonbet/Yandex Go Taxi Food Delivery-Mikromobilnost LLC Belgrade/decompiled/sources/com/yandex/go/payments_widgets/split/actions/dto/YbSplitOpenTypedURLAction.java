package com.yandex.go.payments_widgets.split.actions.dto;

import defpackage.gsq0;
import defpackage.i3y;
import defpackage.k4o;
import defpackage.kr;
import defpackage.qje;
import defpackage.z151;
import kotlin.LazyThreadSafetyMode;
import kotlin.Metadata;
import ru.CryptoPro.JCP.tools.CertReader.Extension;

@gsq0
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0087\b\u0018\u0000 \u00022\u00020\u0001:\u0003\u0003\u0004\u0005¨\u0006\u0006"}, d2 = {"Lcom/yandex/go/payments_widgets/split/actions/dto/YbSplitOpenTypedURLAction;", "Lkr;", "Companion", "UrlType", "$serializer", "com/yandex/go/payments_widgets/split/actions/dto/a", "impl"}, k = 1, mv = {2, 4, 0}, xi = 48)
/* loaded from: classes8.dex */
public final /* data */ class YbSplitOpenTypedURLAction extends kr {
    public static final a Companion = new a();
    public static final i3y[] b = {kotlin.a.b(LazyThreadSafetyMode.PUBLICATION, new z151(16))};
    public final UrlType a;

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\u0005\b\u0086\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001j\u0002\b\u0002j\u0002\b\u0003j\u0002\b\u0004j\u0002\b\u0005¨\u0006\u0006"}, d2 = {"Lcom/yandex/go/payments_widgets/split/actions/dto/YbSplitOpenTypedURLAction$UrlType;", "", "Onboarding", "Account", "FuturePayments", "SaverPromo", "impl"}, k = 1, mv = {2, 4, 0}, xi = 48)
    /* loaded from: classes13.dex */
    public static final class UrlType {
        private static final /* synthetic */ k4o $ENTRIES;
        private static final /* synthetic */ UrlType[] $VALUES;
        public static final UrlType Account;
        public static final UrlType FuturePayments;
        public static final UrlType Onboarding;
        public static final UrlType SaverPromo;

        static {
            UrlType urlType = new UrlType("Onboarding", 0);
            Onboarding = urlType;
            UrlType urlType2 = new UrlType("Account", 1);
            Account = urlType2;
            UrlType urlType3 = new UrlType("FuturePayments", 2);
            FuturePayments = urlType3;
            UrlType urlType4 = new UrlType("SaverPromo", 3);
            SaverPromo = urlType4;
            UrlType[] urlTypeArr = {urlType, urlType2, urlType3, urlType4};
            $VALUES = urlTypeArr;
            $ENTRIES = kotlin.enums.a.a(urlTypeArr);
        }

        public static UrlType valueOf(String str) {
            return (UrlType) Enum.valueOf(UrlType.class, str);
        }

        public static UrlType[] values() {
            return (UrlType[]) $VALUES.clone();
        }
    }

    public /* synthetic */ YbSplitOpenTypedURLAction(int i, UrlType urlType) {
        if (1 == (i & 1)) {
            this.a = urlType;
        } else {
            qje.Z(i, 1, YbSplitOpenTypedURLAction$$serializer.INSTANCE.getDescriptor());
            throw null;
        }
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof YbSplitOpenTypedURLAction) && this.a == ((YbSplitOpenTypedURLAction) obj).a;
    }

    public final int hashCode() {
        return this.a.hashCode();
    }

    public final String toString() {
        return "YbSplitOpenTypedURLAction(urlType=" + this.a + Extension.C_BRAKE;
    }
}
