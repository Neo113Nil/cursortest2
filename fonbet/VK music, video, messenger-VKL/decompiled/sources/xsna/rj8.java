package xsna;

import android.annotation.SuppressLint;
import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.CheckBox;
import com.vkontakte.android.R;

/* compiled from: BroadcastShareParamsView.kt */
/* loaded from: classes7.dex */
public final class rj8 {

    @SuppressLint({"InflateParams"})
    public final ViewGroup a;
    public final View b;
    public final CheckBox c;
    public final View d;
    public final CheckBox e;
    public final View f;
    public final io.reactivex.rxjava3.subjects.f<sj8> g;
    public boolean h;

    public rj8(Context context) {
        ViewGroup viewGroup = (ViewGroup) LayoutInflater.from(context).inflate(R.layout.voip_broadcast_share_params, (ViewGroup) null, false);
        this.a = viewGroup;
        View findViewById = viewGroup.findViewById(R.id.share_in_stories_container);
        this.b = findViewById;
        this.c = (CheckBox) viewGroup.findViewById(R.id.share_in_stories_checkbox);
        View findViewById2 = viewGroup.findViewById(R.id.share_on_wall_container);
        this.d = findViewById2;
        this.e = (CheckBox) viewGroup.findViewById(R.id.share_on_wall_checkbox);
        View findViewById3 = viewGroup.findViewById(R.id.done);
        this.f = findViewById3;
        this.g = new io.reactivex.rxjava3.subjects.f<>();
        this.h = true;
        findViewById.setOnClickListener(new pj8(this, 0));
        findViewById2.setOnClickListener(new qj8(this, 0));
        jjc.g(findViewById3, new com.vk.movika.sdk.base.observable.g(this, 9));
    }
}
