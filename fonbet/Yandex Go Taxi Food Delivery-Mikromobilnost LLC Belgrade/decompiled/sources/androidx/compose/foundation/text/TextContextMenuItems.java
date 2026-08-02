package androidx.compose.foundation.text;

import android.R;
import defpackage.b4a1;
import defpackage.k4o;
import kotlin.Metadata;
import ru.CryptoPro.JCPRequest.ca20.status.CA20Status;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\u0010\u0000\n\u0002\b\u0010\b\u0080\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u0010\u0004\u001a\u0004\b\u0005\u0010\u0006R\u0017\u0010\u0007\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0007\u0010\b\u001a\u0004\b\t\u0010\nR\u0017\u0010\u000b\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u000b\u0010\b\u001a\u0004\b\f\u0010\nj\u0002\b\rj\u0002\b\u000ej\u0002\b\u000fj\u0002\b\u0010j\u0002\b\u0011¨\u0006\u0012"}, d2 = {"Landroidx/compose/foundation/text/TextContextMenuItems;", "", "", "key", "Ljava/lang/Object;", "b", "()Ljava/lang/Object;", "stringId", CA20Status.STATUS_USER_I, "c", "()I", "drawableId", "a", "Cut", "Copy", "Paste", "SelectAll", "Autofill", "foundation"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes10.dex */
public final class TextContextMenuItems {
    private static final /* synthetic */ k4o $ENTRIES;
    private static final /* synthetic */ TextContextMenuItems[] $VALUES;
    public static final TextContextMenuItems Autofill;
    public static final TextContextMenuItems Copy;
    public static final TextContextMenuItems Cut;
    public static final TextContextMenuItems Paste;
    public static final TextContextMenuItems SelectAll;
    private final int drawableId;
    private final Object key;
    private final int stringId;

    static {
        TextContextMenuItems textContextMenuItems = new TextContextMenuItems("Cut", 0, b4a1.a, R.string.cut, R.attr.actionModeCutDrawable);
        Cut = textContextMenuItems;
        TextContextMenuItems textContextMenuItems2 = new TextContextMenuItems("Copy", 1, b4a1.b, R.string.copy, R.attr.actionModeCopyDrawable);
        Copy = textContextMenuItems2;
        TextContextMenuItems textContextMenuItems3 = new TextContextMenuItems("Paste", 2, b4a1.c, R.string.paste, R.attr.actionModePasteDrawable);
        Paste = textContextMenuItems3;
        TextContextMenuItems textContextMenuItems4 = new TextContextMenuItems("SelectAll", 3, b4a1.d, R.string.selectAll, R.attr.actionModeSelectAllDrawable);
        SelectAll = textContextMenuItems4;
        TextContextMenuItems textContextMenuItems5 = new TextContextMenuItems("Autofill", 4, b4a1.e, R.string.autofill, 0);
        Autofill = textContextMenuItems5;
        TextContextMenuItems[] textContextMenuItemsArr = {textContextMenuItems, textContextMenuItems2, textContextMenuItems3, textContextMenuItems4, textContextMenuItems5};
        $VALUES = textContextMenuItemsArr;
        $ENTRIES = kotlin.enums.a.a(textContextMenuItemsArr);
    }

    public TextContextMenuItems(String str, int i, Object obj, int i2, int i3) {
        this.key = obj;
        this.stringId = i2;
        this.drawableId = i3;
    }

    public static TextContextMenuItems valueOf(String str) {
        return (TextContextMenuItems) Enum.valueOf(TextContextMenuItems.class, str);
    }

    public static TextContextMenuItems[] values() {
        return (TextContextMenuItems[]) $VALUES.clone();
    }

    /* renamed from: a, reason: from getter */
    public final int getDrawableId() {
        return this.drawableId;
    }

    /* renamed from: b, reason: from getter */
    public final Object getKey() {
        return this.key;
    }

    /* renamed from: c, reason: from getter */
    public final int getStringId() {
        return this.stringId;
    }
}
