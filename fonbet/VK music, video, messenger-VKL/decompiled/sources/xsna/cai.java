package xsna;

import androidx.fragment.app.FragmentActivity;
import androidx.recyclerview.widget.RecyclerView;

/* compiled from: ComponentsDelegate.kt */
/* loaded from: classes17.dex */
public final class cai {
    public final FragmentActivity a;
    public final p5h b;
    public RecyclerView c;
    public final bai d;

    public cai(FragmentActivity fragmentActivity, p5h p5hVar) {
        this.a = fragmentActivity;
        this.b = p5hVar;
        bai baiVar = new bai(false);
        baiVar.x0(ub6.class, new tr0(10));
        baiVar.x0(bq8.class, new d40(21));
        baiVar.x0(bgm.class, new ur0(18));
        baiVar.x0(v1x.class, new vr0(26));
        baiVar.x0(tio0.class, new sc(16));
        baiVar.x0(p5p0.class, new tc(18));
        baiVar.setItems(bai.h);
        this.d = baiVar;
    }
}
