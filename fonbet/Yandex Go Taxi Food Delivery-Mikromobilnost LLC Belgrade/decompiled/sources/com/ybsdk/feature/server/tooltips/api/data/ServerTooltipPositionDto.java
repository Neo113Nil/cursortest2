package com.ybsdk.feature.server.tooltips.api.data;

import defpackage.k4o;
import kotlin.Metadata;
import kotlin.enums.a;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\u0005\b\u0086\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003j\u0002\b\u0004j\u0002\b\u0005¨\u0006\u0006"}, d2 = {"Lcom/ybsdk/feature/server/tooltips/api/data/ServerTooltipPositionDto;", "", "<init>", "(Ljava/lang/String;I)V", "ABOVE", "BELOW", "feature-server-tooltips-api_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes3.dex */
public final class ServerTooltipPositionDto {
    private static final /* synthetic */ k4o $ENTRIES;
    private static final /* synthetic */ ServerTooltipPositionDto[] $VALUES;
    public static final ServerTooltipPositionDto ABOVE = new ServerTooltipPositionDto("ABOVE", 0);
    public static final ServerTooltipPositionDto BELOW = new ServerTooltipPositionDto("BELOW", 1);

    private static final /* synthetic */ ServerTooltipPositionDto[] $values() {
        return new ServerTooltipPositionDto[]{ABOVE, BELOW};
    }

    static {
        ServerTooltipPositionDto[] $values = $values();
        $VALUES = $values;
        $ENTRIES = a.a($values);
    }

    private ServerTooltipPositionDto(String str, int i) {
    }

    public static k4o getEntries() {
        return $ENTRIES;
    }

    public static ServerTooltipPositionDto valueOf(String str) {
        return (ServerTooltipPositionDto) Enum.valueOf(ServerTooltipPositionDto.class, str);
    }

    public static ServerTooltipPositionDto[] values() {
        return (ServerTooltipPositionDto[]) $VALUES.clone();
    }
}
