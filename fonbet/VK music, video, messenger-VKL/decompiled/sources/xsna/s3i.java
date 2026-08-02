package xsna;

import android.content.Context;
import android.view.LayoutInflater;
import android.widget.LinearLayout;
import android.widget.TextView;
import com.vkontakte.android.R;
import kotlin.LazyThreadSafetyMode;

/* compiled from: CommunityTimeCell.kt */
/* loaded from: classes17.dex */
public final class s3i extends LinearLayout {
    public final Object b;
    public final Object c;
    public boolean d;
    public String e;
    public String f;

    public s3i(Context context) {
        super(context, null, 0);
        e4 e4Var = new e4(this, 29);
        LazyThreadSafetyMode lazyThreadSafetyMode = LazyThreadSafetyMode.NONE;
        this.b = msy.a(lazyThreadSafetyMode, e4Var);
        this.c = msy.a(lazyThreadSafetyMode, new jcg(this, 6));
        this.e = "";
        this.f = "";
        LayoutInflater.from(context).inflate(R.layout.community_time_cell, this);
        setOrientation(0);
        int a = e3m.a(R.dimen.vk_ui_spacing_size2_xs, context);
        f4m.B(a, a, this);
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, kotlin.Lazy] */
    private final TextView getDayText() {
        return (TextView) this.b.getValue();
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, kotlin.Lazy] */
    private final TextView getStatusText() {
        return (TextView) this.c.getValue();
    }

    public final String getDay() {
        return this.e;
    }

    public final String getStatus() {
        return this.f;
    }

    public final void setAccent(boolean z) {
        this.d = z;
        int m = krv0.m(this.d ? R.attr.vk_ui_text_primary : R.attr.vk_ui_text_secondary, getContext());
        getDayText().setTextColor(m);
        getStatusText().setTextColor(m);
    }

    public final void setDay(String str) {
        this.e = str;
        getDayText().setText(str);
    }

    public final void setStatus(String str) {
        this.f = str;
        getStatusText().setText(str);
    }
}
