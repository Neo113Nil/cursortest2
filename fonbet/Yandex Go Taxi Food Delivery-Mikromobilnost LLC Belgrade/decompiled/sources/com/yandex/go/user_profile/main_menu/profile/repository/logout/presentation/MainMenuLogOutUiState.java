package com.yandex.go.user_profile.main_menu.profile.repository.logout.presentation;

import defpackage.k4o;
import kotlin.Metadata;
import kotlin.enums.a;
import ru.CryptoPro.JCP.JCP;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\u0004\b\u0086\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001j\u0002\b\u0002j\u0002\b\u0003j\u0002\b\u0004¨\u0006\u0005"}, d2 = {"Lcom/yandex/go/user_profile/main_menu/profile/repository/logout/presentation/MainMenuLogOutUiState;", "", "ENABLED", "DISABLED", JCP.RAW_PREFIX, "api"}, k = 1, mv = {2, 4, 0}, xi = 48)
/* loaded from: classes8.dex */
public final class MainMenuLogOutUiState {
    private static final /* synthetic */ k4o $ENTRIES;
    private static final /* synthetic */ MainMenuLogOutUiState[] $VALUES;
    public static final MainMenuLogOutUiState DISABLED;
    public static final MainMenuLogOutUiState ENABLED;
    public static final MainMenuLogOutUiState NONE;

    static {
        MainMenuLogOutUiState mainMenuLogOutUiState = new MainMenuLogOutUiState("ENABLED", 0);
        ENABLED = mainMenuLogOutUiState;
        MainMenuLogOutUiState mainMenuLogOutUiState2 = new MainMenuLogOutUiState("DISABLED", 1);
        DISABLED = mainMenuLogOutUiState2;
        MainMenuLogOutUiState mainMenuLogOutUiState3 = new MainMenuLogOutUiState(JCP.RAW_PREFIX, 2);
        NONE = mainMenuLogOutUiState3;
        MainMenuLogOutUiState[] mainMenuLogOutUiStateArr = {mainMenuLogOutUiState, mainMenuLogOutUiState2, mainMenuLogOutUiState3};
        $VALUES = mainMenuLogOutUiStateArr;
        $ENTRIES = a.a(mainMenuLogOutUiStateArr);
    }

    public static MainMenuLogOutUiState valueOf(String str) {
        return (MainMenuLogOutUiState) Enum.valueOf(MainMenuLogOutUiState.class, str);
    }

    public static MainMenuLogOutUiState[] values() {
        return (MainMenuLogOutUiState[]) $VALUES.clone();
    }
}
