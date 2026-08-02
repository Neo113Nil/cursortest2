package com.yandex.go.trusted_contacts.data.entities.network;

import defpackage.gsq0;
import defpackage.i3y;
import defpackage.jg11;
import defpackage.k4o;
import defpackage.sg11;
import kotlin.LazyThreadSafetyMode;
import kotlin.Metadata;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
@gsq0
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\u0005\b\u0087\u0081\u0002\u0018\u0000 \u00022\b\u0012\u0004\u0012\u00020\u00000\u0001:\u0001\u0003j\u0002\b\u0004j\u0002\b\u0005¨\u0006\u0006"}, d2 = {"Lcom/yandex/go/trusted_contacts/data/entities/network/TrustedContactsErrorActionDto;", "", "Companion", "sg11", "BACK", "BACK_TO_CONTACT_SELECTION", "impl"}, k = 1, mv = {2, 4, 0}, xi = 48)
/* loaded from: classes14.dex */
public final class TrustedContactsErrorActionDto {
    private static final /* synthetic */ k4o $ENTRIES;
    private static final /* synthetic */ TrustedContactsErrorActionDto[] $VALUES;
    private static final i3y $cachedSerializer$delegate;
    public static final TrustedContactsErrorActionDto BACK;
    public static final TrustedContactsErrorActionDto BACK_TO_CONTACT_SELECTION;
    public static final sg11 Companion;

    static {
        TrustedContactsErrorActionDto trustedContactsErrorActionDto = new TrustedContactsErrorActionDto("BACK", 0);
        BACK = trustedContactsErrorActionDto;
        TrustedContactsErrorActionDto trustedContactsErrorActionDto2 = new TrustedContactsErrorActionDto("BACK_TO_CONTACT_SELECTION", 1);
        BACK_TO_CONTACT_SELECTION = trustedContactsErrorActionDto2;
        TrustedContactsErrorActionDto[] trustedContactsErrorActionDtoArr = {trustedContactsErrorActionDto, trustedContactsErrorActionDto2};
        $VALUES = trustedContactsErrorActionDtoArr;
        $ENTRIES = kotlin.enums.a.a(trustedContactsErrorActionDtoArr);
        Companion = new sg11();
        $cachedSerializer$delegate = kotlin.a.b(LazyThreadSafetyMode.PUBLICATION, new jg11(2));
    }

    public static TrustedContactsErrorActionDto valueOf(String str) {
        return (TrustedContactsErrorActionDto) Enum.valueOf(TrustedContactsErrorActionDto.class, str);
    }

    public static TrustedContactsErrorActionDto[] values() {
        return (TrustedContactsErrorActionDto[]) $VALUES.clone();
    }
}
