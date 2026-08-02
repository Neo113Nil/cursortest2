package androidx.compose.foundation.text.selection;

import defpackage.k4o;
import kotlin.Metadata;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\u0003\b\u0080\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001j\u0002\b\u0002j\u0002\b\u0003¨\u0006\u0004"}, d2 = {"Landroidx/compose/foundation/text/selection/SelectedTextType;", "", "EditableText", "StaticText", "foundation"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes10.dex */
public final class SelectedTextType {
    private static final /* synthetic */ k4o $ENTRIES;
    private static final /* synthetic */ SelectedTextType[] $VALUES;
    public static final SelectedTextType EditableText;
    public static final SelectedTextType StaticText;

    static {
        SelectedTextType selectedTextType = new SelectedTextType("EditableText", 0);
        EditableText = selectedTextType;
        SelectedTextType selectedTextType2 = new SelectedTextType("StaticText", 1);
        StaticText = selectedTextType2;
        SelectedTextType[] selectedTextTypeArr = {selectedTextType, selectedTextType2};
        $VALUES = selectedTextTypeArr;
        $ENTRIES = kotlin.enums.a.a(selectedTextTypeArr);
    }

    public static SelectedTextType valueOf(String str) {
        return (SelectedTextType) Enum.valueOf(SelectedTextType.class, str);
    }

    public static SelectedTextType[] values() {
        return (SelectedTextType[]) $VALUES.clone();
    }
}
