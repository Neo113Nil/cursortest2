package defpackage;

import android.view.View;

/* loaded from: classes.dex */
public abstract class f851 {
    public static final hz40 a = cmm0.b();

    public static final ttd a(View view) {
        Object tag = view.getTag(ohh0.androidx_compose_ui_view_composition_context);
        if (tag instanceof ttd) {
            return (ttd) tag;
        }
        return null;
    }
}
