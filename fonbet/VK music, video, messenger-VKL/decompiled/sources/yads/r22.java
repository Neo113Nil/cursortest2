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
public final class r22 {
    public final View a;
    public final r32 b;
    public CheckBox c;
    public ProgressBar d;
    public final Map e;
    public ImageView f;
    public final List g = EmptyList.b;

    public r22(View view, r32 r32Var, Map map) {
        this.a = view;
        this.b = r32Var;
        this.e = new LinkedHashMap(map);
    }

    public final Map a() {
        return this.e;
    }

    public final List b() {
        return this.g;
    }

    public final ImageView c() {
        return this.f;
    }

    public final CheckBox d() {
        return this.c;
    }

    public final View e() {
        return this.a;
    }

    public final r32 f() {
        return this.b;
    }

    public final ProgressBar g() {
        return this.d;
    }
}
