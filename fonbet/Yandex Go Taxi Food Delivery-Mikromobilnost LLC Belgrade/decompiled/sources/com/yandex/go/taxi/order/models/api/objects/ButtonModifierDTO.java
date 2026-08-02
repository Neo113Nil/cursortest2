package com.yandex.go.taxi.order.models.api.objects;

import defpackage.gsq0;
import defpackage.i3y;
import defpackage.k4o;
import defpackage.rm6;
import kotlin.LazyThreadSafetyMode;
import kotlin.Metadata;
import ru.yandex.taxi.net.taxi.dto.objects.Dialog;

@gsq0
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0005\b\u0007\u0018\u0000 \u00022\u00020\u0001:\u0003\u0003\u0004\u0005¨\u0006\u0006"}, d2 = {"Lcom/yandex/go/taxi/order/models/api/objects/ButtonModifierDTO;", "", "Companion", "ButtonName", "$serializer", "com/yandex/go/taxi/order/models/api/objects/h", "api"}, k = 1, mv = {2, 4, 0}, xi = 48)
/* loaded from: classes14.dex */
public final class ButtonModifierDTO {
    public static final h Companion = new h();
    public static final i3y[] f = {kotlin.a.b(LazyThreadSafetyMode.PUBLICATION, new rm6(15)), null, null, null, null};
    public final ButtonName a;
    public final boolean b;
    public final String c;
    public final Dialog d;
    public final String e;

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\u0004\b\u0087\u0081\u0002\u0018\u0000 \u00022\b\u0012\u0004\u0012\u00020\u00000\u0001:\u0001\u0003j\u0002\b\u0004¨\u0006\u0005"}, d2 = {"Lcom/yandex/go/taxi/order/models/api/objects/ButtonModifierDTO$ButtonName;", "", "Companion", "com/yandex/go/taxi/order/models/api/objects/g", "CALL_TO_DRIVER", "api"}, k = 1, mv = {2, 4, 0}, xi = 48)
    @gsq0
    public static final class ButtonName {
        private static final /* synthetic */ k4o $ENTRIES;
        private static final /* synthetic */ ButtonName[] $VALUES;
        private static final i3y $cachedSerializer$delegate;
        public static final ButtonName CALL_TO_DRIVER;
        public static final g Companion;

        static {
            ButtonName buttonName = new ButtonName("CALL_TO_DRIVER", 0);
            CALL_TO_DRIVER = buttonName;
            ButtonName[] buttonNameArr = {buttonName};
            $VALUES = buttonNameArr;
            $ENTRIES = kotlin.enums.a.a(buttonNameArr);
            Companion = new g();
            $cachedSerializer$delegate = kotlin.a.b(LazyThreadSafetyMode.PUBLICATION, new rm6(16));
        }

        public static ButtonName valueOf(String str) {
            return (ButtonName) Enum.valueOf(ButtonName.class, str);
        }

        public static ButtonName[] values() {
            return (ButtonName[]) $VALUES.clone();
        }
    }

    public /* synthetic */ ButtonModifierDTO(int i, ButtonName buttonName, boolean z, String str, Dialog dialog, String str2) {
        if ((i & 1) == 0) {
            this.a = null;
        } else {
            this.a = buttonName;
        }
        if ((i & 2) == 0) {
            this.b = false;
        } else {
            this.b = z;
        }
        if ((i & 4) == 0) {
            this.c = null;
        } else {
            this.c = str;
        }
        if ((i & 8) == 0) {
            this.d = new Dialog(0);
        } else {
            this.d = dialog;
        }
        if ((i & 16) == 0) {
            this.e = "";
        } else {
            this.e = str2;
        }
    }

    public ButtonModifierDTO() {
        Dialog dialog = new Dialog(0);
        this.a = null;
        this.b = false;
        this.c = null;
        this.d = dialog;
        this.e = "";
    }
}
