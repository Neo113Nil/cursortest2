package com.yandex.messaging.domain.statuses;

import defpackage.dqg0;
import defpackage.k4o;
import defpackage.oyg0;
import defpackage.p8u0;
import defpackage.wwg0;
import kotlin.Metadata;
import ru.CryptoPro.JCPRequest.ca20.status.CA20Status;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\u0010\b\n\u0002\b\u000e\b\u0086\u0081\u0002\u0018\u0000 \r2\b\u0012\u0004\u0012\u00020\u00000\u0001:\u0001\u000eR\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u0010\u0004\u001a\u0004\b\u0005\u0010\u0006R\u0017\u0010\u0007\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0007\u0010\u0004\u001a\u0004\b\b\u0010\u0006R\u0019\u0010\t\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b\t\u0010\n\u001a\u0004\b\u000b\u0010\fj\u0002\b\u000f¨\u0006\u0010"}, d2 = {"Lcom/yandex/messaging/domain/statuses/StatusIconType;", "", "", "iconRes", CA20Status.STATUS_USER_I, "b", "()I", "color", "a", "coloredIcon", "Ljava/lang/Integer;", "getColoredIcon", "()Ljava/lang/Integer;", "Companion", "p8u0", "TELEMOST", "messaging-core-internal_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes15.dex */
public final class StatusIconType {
    private static final /* synthetic */ k4o $ENTRIES;
    private static final /* synthetic */ StatusIconType[] $VALUES;
    public static final p8u0 Companion;
    public static final StatusIconType TELEMOST;
    public static final String TELEMOST_BACKEND_VALUE = "telemost";
    private final int color;
    private final Integer coloredIcon;
    private final int iconRes;

    static {
        StatusIconType statusIconType = new StatusIconType(oyg0.call_solid_md, dqg0.orb_text_accent_17, Integer.valueOf(wwg0.msg_call_icon_colored_red));
        TELEMOST = statusIconType;
        StatusIconType[] statusIconTypeArr = {statusIconType};
        $VALUES = statusIconTypeArr;
        $ENTRIES = kotlin.enums.a.a(statusIconTypeArr);
        Companion = new p8u0();
    }

    public StatusIconType(int i, int i2, Integer num) {
        this.iconRes = i;
        this.color = i2;
        this.coloredIcon = num;
    }

    public static StatusIconType valueOf(String str) {
        return (StatusIconType) Enum.valueOf(StatusIconType.class, str);
    }

    public static StatusIconType[] values() {
        return (StatusIconType[]) $VALUES.clone();
    }

    /* renamed from: a, reason: from getter */
    public final int getColor() {
        return this.color;
    }

    /* renamed from: b, reason: from getter */
    public final int getIconRes() {
        return this.iconRes;
    }
}
