package yads;

import android.view.View;
import android.widget.CheckBox;
import android.widget.ImageView;
import android.widget.ProgressBar;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import kotlin.collections.EmptyList;

/* loaded from: classes10.dex */
public final class y22 {
    public final View a;
    public CheckBox b;
    public ProgressBar c;
    public List d = EmptyList.b;
    public final Map e;
    public ImageView f;

    public y22(View view, Map map) {
        this.a = view;
        this.e = new LinkedHashMap(map);
    }

    public final Map a() {
        return this.e;
    }

    public final List b() {
        return this.d;
    }

    public final ImageView c() {
        return this.f;
    }

    public final CheckBox d() {
        return this.b;
    }

    public final View e() {
        return this.a;
    }

    public final ProgressBar f() {
        return this.c;
    }
}
