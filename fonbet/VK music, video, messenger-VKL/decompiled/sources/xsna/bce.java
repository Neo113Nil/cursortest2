package xsna;

import android.view.View;
import android.view.ViewGroup;
import com.vkontakte.android.R;
import java.util.List;

/* compiled from: ClipsGridBlockVideosContainer.kt */
/* loaded from: classes17.dex */
public final class bce {
    public final View a;
    public final sjt0 b;
    public final pbe c;
    public final List<zbe> d;
    public final tae e;

    public bce(View view, sjt0 sjt0Var, pbe pbeVar) {
        this.a = view;
        this.b = sjt0Var;
        this.c = pbeVar;
        tae taeVar = new tae();
        this.e = taeVar;
        this.d = e43.l(new zbe((ViewGroup) view.findViewById(R.id.top_left_clip_item), sjt0Var.create(view.getContext())), new zbe((ViewGroup) view.findViewById(R.id.top_right_clip_item), sjt0Var.create(view.getContext())), new zbe((ViewGroup) view.findViewById(R.id.bottom_left_clip_item), sjt0Var.create(view.getContext())), new zbe((ViewGroup) view.findViewById(R.id.bottom_right_clip_item), sjt0Var.create(view.getContext())));
        taeVar.a = new ace(this);
    }
}
