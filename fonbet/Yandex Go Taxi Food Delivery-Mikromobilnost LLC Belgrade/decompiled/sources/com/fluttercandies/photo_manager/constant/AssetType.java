package com.fluttercandies.photo_manager.constant;

import defpackage.k4o;
import kotlin.Metadata;
import kotlin.enums.a;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\u0004\b\u0086\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001j\u0002\b\u0002j\u0002\b\u0003j\u0002\b\u0004¨\u0006\u0005"}, d2 = {"Lcom/fluttercandies/photo_manager/constant/AssetType;", "", "Image", "Video", "Audio", "photo_manager_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
/* loaded from: classes10.dex */
public final class AssetType {
    private static final /* synthetic */ k4o $ENTRIES;
    private static final /* synthetic */ AssetType[] $VALUES;
    public static final AssetType Audio;
    public static final AssetType Image;
    public static final AssetType Video;

    static {
        AssetType assetType = new AssetType("Image", 0);
        Image = assetType;
        AssetType assetType2 = new AssetType("Video", 1);
        Video = assetType2;
        AssetType assetType3 = new AssetType("Audio", 2);
        Audio = assetType3;
        AssetType[] assetTypeArr = {assetType, assetType2, assetType3};
        $VALUES = assetTypeArr;
        $ENTRIES = a.a(assetTypeArr);
    }

    public static AssetType valueOf(String str) {
        return (AssetType) Enum.valueOf(AssetType.class, str);
    }

    public static AssetType[] values() {
        return (AssetType[]) $VALUES.clone();
    }
}
