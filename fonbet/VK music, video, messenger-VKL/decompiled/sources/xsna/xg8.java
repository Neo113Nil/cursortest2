package xsna;

import android.annotation.SuppressLint;
import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import com.vkontakte.android.R;
import java.util.ArrayList;
import java.util.HashMap;
import xsna.i330;
import xsna.zg8;

/* compiled from: BroadcastLaunchView.kt */
/* loaded from: classes7.dex */
public final class xg8 {

    @SuppressLint({"InflateParams"})
    public final ViewGroup a;
    public final TextView b;
    public final View c;
    public final View d;
    public final View e;
    public final TextView f;
    public final View g;
    public final View h;
    public final io.reactivex.rxjava3.subjects.f<yg8> i;
    public final i330<zg8> j;
    public boolean k;
    public boolean l;

    public xg8(Context context) {
        ViewGroup viewGroup = (ViewGroup) LayoutInflater.from(context).inflate(R.layout.voip_broadcast_launch, (ViewGroup) null, false);
        this.a = viewGroup;
        this.b = (TextView) viewGroup.findViewById(R.id.awaiting);
        this.c = viewGroup.findViewById(R.id.launching);
        View findViewById = viewGroup.findViewById(R.id.cancel);
        this.d = findViewById;
        this.e = viewGroup.findViewById(R.id.error_icon);
        this.f = (TextView) viewGroup.findViewById(R.id.error_text);
        View findViewById2 = viewGroup.findViewById(R.id.error_retry);
        this.g = findViewById2;
        View findViewById3 = viewGroup.findViewById(R.id.error_close);
        this.h = findViewById3;
        this.i = new io.reactivex.rxjava3.subjects.f<>();
        ArrayList arrayList = new ArrayList();
        HashMap hashMap = new HashMap();
        arrayList.add(new i330.b(new bod(2), new jy(this, 15), new kxa((byte) 0, 5)));
        ArrayList arrayList2 = new ArrayList();
        HashMap hashMap2 = new HashMap();
        arrayList2.add(new i330.b(tg8.b, new ug8(1, this, xg8.class, "onAwaitCounterChanged", "onAwaitCounterChanged(J)V", 0, 0), new pv7((byte) 0, 3)));
        hashMap.put(fpf0.a(zg8.a.class), new i330(arrayList2, hashMap2));
        ArrayList arrayList3 = new ArrayList();
        HashMap hashMap3 = new HashMap();
        arrayList3.add(new i330.b(vg8.b, new wg8(1, this, xg8.class, "onErrorTextChanged", "onErrorTextChanged(Ljava/lang/CharSequence;)V", 0, 0), new pv7((byte) 0, 3)));
        hashMap.put(fpf0.a(zg8.b.class), new i330(arrayList3, hashMap3));
        this.j = new i330<>(arrayList, hashMap);
        this.k = true;
        this.l = true;
        viewGroup.setOnClickListener(new o44(0));
        jjc.g(findViewById, new za(this, 11));
        jjc.g(findViewById2, new tm0(this, 14));
        jjc.g(findViewById3, new g60(this, 11));
    }
}
