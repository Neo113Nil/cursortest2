package com.yandex.go.zone.dto.objects;

import defpackage.dvw0;
import defpackage.gsq0;
import defpackage.i3y;
import defpackage.jl40;
import defpackage.jsq0;
import defpackage.k4o;
import defpackage.ksq0;
import kotlin.LazyThreadSafetyMode;
import kotlin.Metadata;
import ru.CryptoPro.JCP.tools.CertReader.Extension;
import ru.yandex.taxi.common_models.net.FormattedText;

@gsq0
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0005\b\u0087\b\u0018\u0000 \u00022\u00020\u0001:\u0003\u0003\u0004\u0005¨\u0006\u0006"}, d2 = {"Lcom/yandex/go/zone/dto/objects/TariffModifierInfo;", "", "Companion", "ModifierShowMode", "com/yandex/go/zone/dto/objects/l6", "$serializer", "zone_models"}, k = 1, mv = {2, 4, 0}, xi = 48)
/* loaded from: classes14.dex */
public final /* data */ class TariffModifierInfo {
    public static final l6 Companion = new l6();
    public static final i3y[] c = {null, kotlin.a.b(LazyThreadSafetyMode.PUBLICATION, new dvw0(28))};
    public static final TariffModifierInfo d = new TariffModifierInfo(0);
    public final FormattedText a;
    public final jsq0 b;

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\u0006\b\u0087\u0081\u0002\u0018\u0000 \u00022\b\u0012\u0004\u0012\u00020\u00000\u0001:\u0001\u0003j\u0002\b\u0004j\u0002\b\u0005j\u0002\b\u0006¨\u0006\u0007"}, d2 = {"Lcom/yandex/go/zone/dto/objects/TariffModifierInfo$ModifierShowMode;", "", "Companion", "com/yandex/go/zone/dto/objects/m6", "SELECTED", "NOT_SELECTED", "UNKNOWN", "zone_models"}, k = 1, mv = {2, 4, 0}, xi = 48)
    @gsq0
    public static final class ModifierShowMode {
        private static final /* synthetic */ k4o $ENTRIES;
        private static final /* synthetic */ ModifierShowMode[] $VALUES;
        private static final i3y $cachedSerializer$delegate;
        public static final m6 Companion;
        public static final ModifierShowMode NOT_SELECTED;
        public static final ModifierShowMode SELECTED;
        public static final ModifierShowMode UNKNOWN;

        static {
            ModifierShowMode modifierShowMode = new ModifierShowMode("SELECTED", 0);
            SELECTED = modifierShowMode;
            ModifierShowMode modifierShowMode2 = new ModifierShowMode("NOT_SELECTED", 1);
            NOT_SELECTED = modifierShowMode2;
            ModifierShowMode modifierShowMode3 = new ModifierShowMode("UNKNOWN", 2);
            UNKNOWN = modifierShowMode3;
            ModifierShowMode[] modifierShowModeArr = {modifierShowMode, modifierShowMode2, modifierShowMode3};
            $VALUES = modifierShowModeArr;
            $ENTRIES = kotlin.enums.a.a(modifierShowModeArr);
            Companion = new m6();
            $cachedSerializer$delegate = kotlin.a.b(LazyThreadSafetyMode.PUBLICATION, new dvw0(29));
        }

        public static ModifierShowMode valueOf(String str) {
            return (ModifierShowMode) Enum.valueOf(ModifierShowMode.class, str);
        }

        public static ModifierShowMode[] values() {
            return (ModifierShowMode[]) $VALUES.clone();
        }
    }

    public /* synthetic */ TariffModifierInfo(int i, FormattedText formattedText, jsq0 jsq0Var) {
        this.a = (i & 1) == 0 ? FormattedText.c : formattedText;
        if ((i & 2) == 0) {
            this.b = ksq0.a;
        } else {
            this.b = jsq0Var;
        }
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof TariffModifierInfo)) {
            return false;
        }
        TariffModifierInfo tariffModifierInfo = (TariffModifierInfo) obj;
        return jl40.l(this.a, tariffModifierInfo.a) && jl40.l(this.b, tariffModifierInfo.b);
    }

    public final int hashCode() {
        return this.b.a.hashCode() + (this.a.a.hashCode() * 31);
    }

    public final String toString() {
        return "TariffModifierInfo(attributedText=" + this.a + ", showModes=" + this.b + Extension.C_BRAKE;
    }

    public TariffModifierInfo() {
        this(0);
    }

    public TariffModifierInfo(int i) {
        FormattedText formattedText = FormattedText.c;
        jsq0 jsq0Var = ksq0.a;
        this.a = formattedText;
        this.b = jsq0Var;
    }
}
