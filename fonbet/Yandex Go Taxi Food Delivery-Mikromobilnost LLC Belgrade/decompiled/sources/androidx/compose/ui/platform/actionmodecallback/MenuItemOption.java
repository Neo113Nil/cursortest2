package androidx.compose.ui.platform.actionmodecallback;

import android.R;
import defpackage.k4o;
import defpackage.w511;
import defpackage.yl10;
import kotlin.Metadata;
import kotlin.enums.a;
import ru.CryptoPro.JCPRequest.ca20.status.CA20Status;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\u0010\b\n\u0002\b\f\b\u0080\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u0010\u0004\u001a\u0004\b\u0005\u0010\u0006R\u0017\u0010\u0007\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0007\u0010\u0004\u001a\u0004\b\b\u0010\u0006j\u0002\b\tj\u0002\b\nj\u0002\b\u000bj\u0002\b\fj\u0002\b\r¨\u0006\u000e"}, d2 = {"Landroidx/compose/ui/platform/actionmodecallback/MenuItemOption;", "", "", "id", CA20Status.STATUS_USER_I, "a", "()I", "order", "b", "Copy", "Paste", "Cut", "SelectAll", "Autofill", "ui"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes10.dex */
public final class MenuItemOption {
    private static final /* synthetic */ k4o $ENTRIES;
    private static final /* synthetic */ MenuItemOption[] $VALUES;
    public static final MenuItemOption Autofill;
    public static final MenuItemOption Copy;
    public static final MenuItemOption Cut;
    public static final MenuItemOption Paste;
    public static final MenuItemOption SelectAll;
    private final int id;
    private final int order;

    static {
        MenuItemOption menuItemOption = new MenuItemOption("Copy", 0, R.id.copy, 0);
        Copy = menuItemOption;
        MenuItemOption menuItemOption2 = new MenuItemOption("Paste", 1, R.id.paste, 1);
        Paste = menuItemOption2;
        MenuItemOption menuItemOption3 = new MenuItemOption("Cut", 2, R.id.cut, 2);
        Cut = menuItemOption3;
        MenuItemOption menuItemOption4 = new MenuItemOption("SelectAll", 3, R.id.selectAll, 3);
        SelectAll = menuItemOption4;
        MenuItemOption menuItemOption5 = new MenuItemOption("Autofill", 4, R.id.autofill, 4);
        Autofill = menuItemOption5;
        MenuItemOption[] menuItemOptionArr = {menuItemOption, menuItemOption2, menuItemOption3, menuItemOption4, menuItemOption5};
        $VALUES = menuItemOptionArr;
        $ENTRIES = a.a(menuItemOptionArr);
    }

    public MenuItemOption(String str, int i, int i2, int i3) {
        this.id = i2;
        this.order = i3;
    }

    public static MenuItemOption valueOf(String str) {
        return (MenuItemOption) Enum.valueOf(MenuItemOption.class, str);
    }

    public static MenuItemOption[] values() {
        return (MenuItemOption[]) $VALUES.clone();
    }

    /* renamed from: a, reason: from getter */
    public final int getId() {
        return this.id;
    }

    /* renamed from: b, reason: from getter */
    public final int getOrder() {
        return this.order;
    }

    public final int c() {
        int i = yl10.a[ordinal()];
        if (i == 1) {
            return R.string.copy;
        }
        if (i == 2) {
            return R.string.paste;
        }
        if (i == 3) {
            return R.string.cut;
        }
        if (i == 4) {
            return R.string.selectAll;
        }
        if (i == 5) {
            return R.string.autofill;
        }
        w511.b();
        return 0;
    }
}
