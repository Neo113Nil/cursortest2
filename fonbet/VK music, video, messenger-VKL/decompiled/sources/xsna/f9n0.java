package xsna;

import com.vk.superapp.api.dto.menu.WidgetIds;
import com.vk.superapp.ui.widgets.SuperAppWidget;
import com.vk.superapp.ui.widgets.SuperAppWidgetSize;

/* compiled from: SuperAppItems.kt */
/* loaded from: classes6.dex */
public abstract class f9n0 extends z8n0 {
    public final String b;
    public final String c;
    public final boolean d;

    public f9n0(String str, String str2, boolean z, SuperAppWidgetSize superAppWidgetSize, int i) {
        super((i & 8) != 0 ? SuperAppWidgetSize.REGULAR : superAppWidgetSize);
        this.b = str;
        this.c = str2;
        this.d = z;
    }

    public abstract SuperAppWidget c();

    public String d() {
        return this.c;
    }

    public String e() {
        return this.b;
    }

    public final String f() {
        WidgetIds d;
        SuperAppWidget c = c();
        if (c == null || (d = c.d()) == null) {
            return null;
        }
        return d.b;
    }

    public boolean g() {
        return this.d;
    }
}
