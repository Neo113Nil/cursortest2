package defpackage;

import android.view.View;
import android.widget.CheckBox;
import android.widget.ProgressBar;
import java.util.LinkedHashMap;
import kotlin.collections.EmptyList;

/* loaded from: classes7.dex */
public final class pk61 {
    public final View a;
    public CheckBox b;
    public ProgressBar c;
    public final LinkedHashMap d;
    public EmptyList e;

    public pk61(View view) {
        this.a = view;
        this.d = new LinkedHashMap();
        this.e = EmptyList.a;
    }

    public pk61(View view, LinkedHashMap linkedHashMap) {
        this.a = view;
        this.e = EmptyList.a;
        this.d = new LinkedHashMap(linkedHashMap);
    }
}
