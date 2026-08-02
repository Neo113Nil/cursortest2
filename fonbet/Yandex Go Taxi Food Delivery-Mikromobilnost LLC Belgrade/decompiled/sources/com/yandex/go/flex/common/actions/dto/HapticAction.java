package com.yandex.go.flex.common.actions.dto;

import defpackage.gmt;
import defpackage.gsq0;
import defpackage.i3y;
import defpackage.k4o;
import defpackage.kr;
import defpackage.qje;
import kotlin.LazyThreadSafetyMode;
import kotlin.Metadata;
import ru.CryptoPro.JCP.tools.CertReader.Extension;

@gsq0
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0081\b\u0018\u0000 \u00022\u00020\u0001:\u0003\u0003\u0004\u0005¨\u0006\u0006"}, d2 = {"Lcom/yandex/go/flex/common/actions/dto/HapticAction;", "Lkr;", "Companion", "HapticType", "$serializer", "com/yandex/go/flex/common/actions/dto/a", "impl"}, k = 1, mv = {2, 4, 0}, xi = 48)
/* loaded from: classes.dex */
public final /* data */ class HapticAction extends kr {
    public static final a Companion = new a();
    public static final i3y[] c = {kotlin.a.b(LazyThreadSafetyMode.PUBLICATION, new gmt(20)), null};
    public final HapticType a;
    public final boolean b;

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\u0004\b\u0087\u0081\u0002\u0018\u0000 \u00022\b\u0012\u0004\u0012\u00020\u00000\u0001:\u0001\u0003j\u0002\b\u0004¨\u0006\u0005"}, d2 = {"Lcom/yandex/go/flex/common/actions/dto/HapticAction$HapticType;", "", "Companion", "com/yandex/go/flex/common/actions/dto/b", "ClickLight", "impl"}, k = 1, mv = {2, 4, 0}, xi = 48)
    @gsq0
    public static final class HapticType {
        private static final /* synthetic */ k4o $ENTRIES;
        private static final /* synthetic */ HapticType[] $VALUES;
        private static final i3y $cachedSerializer$delegate;
        public static final HapticType ClickLight;
        public static final b Companion;

        static {
            HapticType hapticType = new HapticType("ClickLight", 0);
            ClickLight = hapticType;
            HapticType[] hapticTypeArr = {hapticType};
            $VALUES = hapticTypeArr;
            $ENTRIES = kotlin.enums.a.a(hapticTypeArr);
            Companion = new b();
            $cachedSerializer$delegate = kotlin.a.b(LazyThreadSafetyMode.PUBLICATION, new gmt(21));
        }

        public static HapticType valueOf(String str) {
            return (HapticType) Enum.valueOf(HapticType.class, str);
        }

        public static HapticType[] values() {
            return (HapticType[]) $VALUES.clone();
        }
    }

    public /* synthetic */ HapticAction(int i, HapticType hapticType, boolean z) {
        if (3 != (i & 3)) {
            qje.Z(i, 3, HapticAction$$serializer.INSTANCE.getDescriptor());
            throw null;
        }
        this.a = hapticType;
        this.b = z;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof HapticAction)) {
            return false;
        }
        HapticAction hapticAction = (HapticAction) obj;
        return this.a == hapticAction.a && this.b == hapticAction.b;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.b) + (this.a.hashCode() * 31);
    }

    public final String toString() {
        return "HapticAction(hapticType=" + this.a + ", runOnAndroidWithoutAmplitudeControl=" + this.b + Extension.C_BRAKE;
    }
}
