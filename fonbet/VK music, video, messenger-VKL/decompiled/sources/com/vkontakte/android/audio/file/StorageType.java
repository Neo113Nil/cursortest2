package com.vkontakte.android.audio.file;

import com.vk.core.files.a;

/* loaded from: classes7.dex */
public enum StorageType {
    internal("internal"),
    sdCard("sdCard");

    public final String nameForPreference;

    StorageType(String str) {
        this.nameForPreference = str;
    }

    public static StorageType a(String str) {
        String valueOf = String.valueOf(str);
        return !valueOf.equals("sdCard") ? !valueOf.equals("internal") ? a.A(valueOf) ? sdCard : internal : internal : sdCard;
    }
}
