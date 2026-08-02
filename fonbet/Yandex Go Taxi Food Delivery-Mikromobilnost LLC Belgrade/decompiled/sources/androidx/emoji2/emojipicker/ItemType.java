package androidx.emoji2.emojipicker;

import defpackage.k4o;
import kotlin.Metadata;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\u0004\b\u0080\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001j\u0002\b\u0002j\u0002\b\u0003j\u0002\b\u0004¨\u0006\u0005"}, d2 = {"Landroidx/emoji2/emojipicker/ItemType;", "", "CATEGORY_TITLE", "PLACEHOLDER_TEXT", "EMOJI", "emoji2-emojipicker_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes10.dex */
public final class ItemType {
    private static final /* synthetic */ k4o $ENTRIES;
    private static final /* synthetic */ ItemType[] $VALUES;
    public static final ItemType CATEGORY_TITLE;
    public static final ItemType EMOJI;
    public static final ItemType PLACEHOLDER_TEXT;

    static {
        ItemType itemType = new ItemType("CATEGORY_TITLE", 0);
        CATEGORY_TITLE = itemType;
        ItemType itemType2 = new ItemType("PLACEHOLDER_TEXT", 1);
        PLACEHOLDER_TEXT = itemType2;
        ItemType itemType3 = new ItemType("EMOJI", 2);
        EMOJI = itemType3;
        ItemType[] itemTypeArr = {itemType, itemType2, itemType3};
        $VALUES = itemTypeArr;
        $ENTRIES = kotlin.enums.a.a(itemTypeArr);
    }

    public static ItemType valueOf(String str) {
        return (ItemType) Enum.valueOf(ItemType.class, str);
    }

    public static ItemType[] values() {
        return (ItemType[]) $VALUES.clone();
    }
}
