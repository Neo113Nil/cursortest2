package ru.ok.gleffects.dto;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import java.io.File;

/* loaded from: classes9.dex */
public class UserInfo {
    public final int age;

    @Nullable
    public final File userAvatarFile;

    @NonNull
    public final String userCity;

    @NonNull
    public final UserGender userGender;

    @NonNull
    public final String userName;

    public UserInfo(@Nullable File file, String str, String str2, UserGender userGender, int i) {
        this.userAvatarFile = file;
        this.userName = str == null ? "" : str;
        this.userCity = str2 == null ? "" : str2;
        this.userGender = userGender == null ? UserGender.UNKNOWN : userGender;
        this.age = i;
    }
}
