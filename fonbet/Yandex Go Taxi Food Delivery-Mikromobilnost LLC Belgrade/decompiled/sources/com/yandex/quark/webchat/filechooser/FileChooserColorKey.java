package com.yandex.quark.webchat.filechooser;

import defpackage.k4o;
import kotlin.Metadata;
import kotlin.enums.a;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\u0004\b\u0080\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001j\u0002\b\u0002j\u0002\b\u0003j\u0002\b\u0004¨\u0006\u0005"}, d2 = {"Lcom/yandex/quark/webchat/filechooser/FileChooserColorKey;", "", "TextAndIconPrimary", "BackgroundPrimary", "Separator", "quark-web-chat_multiRelease"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes2.dex */
public final class FileChooserColorKey {
    private static final /* synthetic */ k4o $ENTRIES;
    private static final /* synthetic */ FileChooserColorKey[] $VALUES;
    public static final FileChooserColorKey BackgroundPrimary;
    public static final FileChooserColorKey Separator;
    public static final FileChooserColorKey TextAndIconPrimary;

    static {
        FileChooserColorKey fileChooserColorKey = new FileChooserColorKey("TextAndIconPrimary", 0);
        TextAndIconPrimary = fileChooserColorKey;
        FileChooserColorKey fileChooserColorKey2 = new FileChooserColorKey("BackgroundPrimary", 1);
        BackgroundPrimary = fileChooserColorKey2;
        FileChooserColorKey fileChooserColorKey3 = new FileChooserColorKey("Separator", 2);
        Separator = fileChooserColorKey3;
        FileChooserColorKey[] fileChooserColorKeyArr = {fileChooserColorKey, fileChooserColorKey2, fileChooserColorKey3};
        $VALUES = fileChooserColorKeyArr;
        $ENTRIES = a.a(fileChooserColorKeyArr);
    }

    public static FileChooserColorKey valueOf(String str) {
        return (FileChooserColorKey) Enum.valueOf(FileChooserColorKey.class, str);
    }

    public static FileChooserColorKey[] values() {
        return (FileChooserColorKey[]) $VALUES.clone();
    }
}
