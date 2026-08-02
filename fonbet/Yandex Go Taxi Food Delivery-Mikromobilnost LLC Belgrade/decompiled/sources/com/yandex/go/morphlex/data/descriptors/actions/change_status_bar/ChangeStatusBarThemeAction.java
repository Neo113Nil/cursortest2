package com.yandex.go.morphlex.data.descriptors.actions.change_status_bar;

import defpackage.gsq0;
import defpackage.i3y;
import defpackage.jc9;
import defpackage.k4o;
import defpackage.kr;
import kotlin.LazyThreadSafetyMode;
import kotlin.Metadata;

@gsq0
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0007\u0018\u0000 \u00022\u00020\u0001:\u0003\u0003\u0004\u0005¨\u0006\u0006"}, d2 = {"Lcom/yandex/go/morphlex/data/descriptors/actions/change_status_bar/ChangeStatusBarThemeAction;", "Lkr;", "Companion", "StatusBarThemeDto", "$serializer", "com/yandex/go/morphlex/data/descriptors/actions/change_status_bar/a", "impl"}, k = 1, mv = {2, 4, 0}, xi = 48)
/* loaded from: classes12.dex */
public final class ChangeStatusBarThemeAction extends kr {
    public static final a Companion = new a();
    public static final i3y[] b = {kotlin.a.b(LazyThreadSafetyMode.PUBLICATION, new jc9(15))};
    public final StatusBarThemeDto a;

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\u0003\b\u0086\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001j\u0002\b\u0002j\u0002\b\u0003¨\u0006\u0004"}, d2 = {"Lcom/yandex/go/morphlex/data/descriptors/actions/change_status_bar/ChangeStatusBarThemeAction$StatusBarThemeDto;", "", "DARK", "LIGHT", "impl"}, k = 1, mv = {2, 4, 0}, xi = 48)
    public static final class StatusBarThemeDto {
        private static final /* synthetic */ k4o $ENTRIES;
        private static final /* synthetic */ StatusBarThemeDto[] $VALUES;
        public static final StatusBarThemeDto DARK;
        public static final StatusBarThemeDto LIGHT;

        static {
            StatusBarThemeDto statusBarThemeDto = new StatusBarThemeDto("DARK", 0);
            DARK = statusBarThemeDto;
            StatusBarThemeDto statusBarThemeDto2 = new StatusBarThemeDto("LIGHT", 1);
            LIGHT = statusBarThemeDto2;
            StatusBarThemeDto[] statusBarThemeDtoArr = {statusBarThemeDto, statusBarThemeDto2};
            $VALUES = statusBarThemeDtoArr;
            $ENTRIES = kotlin.enums.a.a(statusBarThemeDtoArr);
        }

        public static StatusBarThemeDto valueOf(String str) {
            return (StatusBarThemeDto) Enum.valueOf(StatusBarThemeDto.class, str);
        }

        public static StatusBarThemeDto[] values() {
            return (StatusBarThemeDto[]) $VALUES.clone();
        }
    }

    public /* synthetic */ ChangeStatusBarThemeAction(int i, StatusBarThemeDto statusBarThemeDto) {
        if ((i & 1) == 0) {
            this.a = StatusBarThemeDto.LIGHT;
        } else {
            this.a = statusBarThemeDto;
        }
    }

    public ChangeStatusBarThemeAction() {
        this.a = StatusBarThemeDto.LIGHT;
    }
}
