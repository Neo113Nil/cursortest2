package xsna;

import android.annotation.SuppressLint;
import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;
import com.vk.voip.ui.view.VoipWatchersView;
import com.vkontakte.android.R;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Objects;
import xsna.dw20;
import xsna.i330;
import xsna.sj8;
import xsna.yf8;

/* compiled from: BroadcastFinishView.kt */
/* loaded from: classes7.dex */
public final class wf8 {
    public boolean A;
    public boolean B;
    public final Context a;

    @SuppressLint({"InflateParams"})
    public final ViewGroup b;
    public final View c;
    public final View d;
    public final View e;
    public final View f;
    public final View g;
    public final View h;
    public final TextView i;
    public final VoipWatchersView j;
    public final TextView k;
    public final TextView l;
    public final View m;
    public final View n;
    public final TextView o;
    public final Button p;
    public final Button q;
    public final Button r;
    public rj8 s;
    public io.reactivex.rxjava3.disposables.c t;
    public dw20 u;
    public boolean v;
    public boolean w;
    public final io.reactivex.rxjava3.subjects.f<xf8> x;
    public final i330<yf8> y;
    public final bzb0 z;

    public wf8(Context context) {
        this.a = context;
        ViewGroup viewGroup = (ViewGroup) LayoutInflater.from(context).inflate(R.layout.voip_broadcast_finish, (ViewGroup) null, false);
        this.b = viewGroup;
        View findViewById = viewGroup.findViewById(R.id.progress_container);
        this.c = findViewById;
        View findViewById2 = viewGroup.findViewById(R.id.progress_cancel);
        this.d = findViewById2;
        View findViewById3 = viewGroup.findViewById(R.id.error_container);
        this.e = findViewById3;
        View findViewById4 = viewGroup.findViewById(R.id.error_retry);
        this.f = findViewById4;
        View findViewById5 = viewGroup.findViewById(R.id.error_close);
        this.g = findViewById5;
        View findViewById6 = viewGroup.findViewById(R.id.content_container);
        this.h = findViewById6;
        this.i = (TextView) viewGroup.findViewById(R.id.content_title);
        this.j = (VoipWatchersView) viewGroup.findViewById(R.id.content_viewers_avatars);
        this.k = (TextView) viewGroup.findViewById(R.id.content_viewers_info);
        this.l = (TextView) viewGroup.findViewById(R.id.tv_record_subtitle);
        View findViewById7 = viewGroup.findViewById(R.id.content_open_stats);
        this.m = findViewById7;
        View findViewById8 = viewGroup.findViewById(R.id.content_share_params_container);
        this.n = findViewById8;
        this.o = (TextView) viewGroup.findViewById(R.id.content_share_params_value);
        Button button = (Button) viewGroup.findViewById(R.id.content_share_button);
        this.p = button;
        Button button2 = (Button) viewGroup.findViewById(R.id.btn_go_to_records);
        this.q = button2;
        Button button3 = (Button) viewGroup.findViewById(R.id.content_delete);
        this.r = button3;
        ImageView imageView = (ImageView) viewGroup.findViewById(R.id.content_close);
        this.v = true;
        this.w = true;
        this.x = new io.reactivex.rxjava3.subjects.f<>();
        ArrayList arrayList = new ArrayList();
        HashMap hashMap = new HashMap();
        arrayList.add(new i330.b(new bod(2), new e5(this, 13), new kxa((byte) 0, 5)));
        i330.a aVar = new i330.a();
        pv7 pv7Var = new pv7((byte) 0, 3);
        aVar.c(new bod(2), new com.vk.movika.sdk.base.observable.w(this, 11), pv7Var);
        int i = 0;
        aVar.c(rf8.b, new c95(1, this, wf8.class, "onShareViewModelChanged", "onShareViewModelChanged(Lcom/vk/voip/ui/broadcast/views/finish/ShareViewModel;)V", 0, 2), new pv7((byte) 0, 3));
        aVar.c(sf8.b, new tf8(1, this, wf8.class, "onViewersChanged", "onViewersChanged(Lcom/vk/voip/ui/broadcast/views/finish/BroadcastFinishViewModel$StatisticsModel;)V", 0), new pv7((byte) 0, 3));
        aVar.c(uf8.b, new com.vk.repository.internal.repos.stickers.suggests.a(1, this, wf8.class, "onCanViewStatsChanged", "onCanViewStatsChanged(Z)V", 0, 3), new pv7((byte) 0, 3));
        int i2 = 0;
        aVar.c(vf8.b, new kf8(1, this, wf8.class, "onCanGoToRecordChanged", "onCanGoToRecordChanged(Z)V", i, i2), new pv7((byte) 0, 3));
        aVar.c(lf8.b, new mf8(1, this, wf8.class, "onSwitchRecordOrStreamViews", "onSwitchRecordOrStreamViews(Z)V", i, i2), new pv7((byte) 0, 3));
        aVar.c(nf8.b, new pz(this, 8), new pv7((byte) 0, 3));
        aVar.c(of8.b, new pf8(1, this, wf8.class, "onCanShareChanged", "onCanShareChanged(Z)V", 0, 0), new pv7((byte) 0, 3));
        aVar.c(qf8.b, new b95(1, this, wf8.class, "onCanDeleteChanged", "onCanDeleteChanged(Z)V", i, 1), new pv7((byte) 0, 3));
        hashMap.put(fpf0.a(yf8.b.class), aVar.b());
        this.y = new i330<>(arrayList, hashMap);
        this.z = new bzb0(context);
        this.A = true;
        this.B = true;
        viewGroup.setOnClickListener(new o44(0));
        jjc.g(findViewById2, new w8(this, 14));
        jjc.g(findViewById4, new l5(this, 11));
        jjc.g(findViewById5, new po1(this, 8));
        jjc.g(findViewById7, new ix2(this, 10));
        int i3 = 13;
        jjc.g(imageView, new j9(this, i3));
        jjc.g(findViewById8, new com.vk.movika.sdk.base.data.a(this, i3));
        jjc.g(button, new com.vk.newsfeed.posting.impl.presentation.base.fragment.a(this, 10));
        jjc.g(button2, new e1(this, 13));
        jjc.g(button3, new k9(this, 15));
        bwt0.p0(findViewById, Objects.nonNull(yf8.c.a));
        bwt0.p0(findViewById3, false);
        bwt0.p0(findViewById6, false);
        c(this.v, this.w);
    }

    public final void a() {
        if (!this.A) {
            throw new IllegalStateException("Instance is destroyed");
        }
    }

    public final void b() {
        rj8 rj8Var = this.s;
        if (rj8Var != null) {
            rj8Var.h = false;
        }
        this.s = null;
        io.reactivex.rxjava3.disposables.c cVar = this.t;
        if (cVar != null) {
            cVar.dispose();
        }
        this.t = null;
        dw20 dw20Var = this.u;
        if (dw20Var != null) {
            dw20Var.tn();
        }
        this.u = null;
    }

    public final void c(boolean z, boolean z2) {
        this.v = z;
        this.w = z2;
        this.o.setText((z && z2) ? R.string.voip_broadcast_share_label_stories_wall : z ? R.string.voip_broadcast_share_label_stories : z2 ? R.string.voip_broadcast_share_label_wall : R.string.voip_broadcast_share_label_none);
    }

    public final void d(xf8 xf8Var) {
        if (this.A) {
            this.x.onNext(xf8Var);
        }
    }

    public final void e() {
        yf8 yf8Var = this.y.c;
        if ((yf8Var instanceof yf8.b ? (yf8.b) yf8Var : null) == null) {
            return;
        }
        Context context = this.a;
        rj8 rj8Var = new rj8(context);
        boolean z = this.v;
        boolean z2 = this.w;
        if (!rj8Var.h) {
            throw new IllegalStateException("Instance is destroyed");
        }
        rj8Var.c.setChecked(z);
        rj8Var.e.setChecked(z2);
        this.s = rj8Var;
        if (!rj8Var.h) {
            throw new IllegalStateException("Instance is destroyed");
        }
        this.t = rj8Var.g.b0(sj8.a.class).subscribe(new defpackage.p(new ec(this, 12), 6));
        dw20.b bVar = new dw20.b(context, tzp0.a(null, 3));
        dhr0.a.getClass();
        this.u = bVar.u0(dhr0.u().c).D0(this.s.a, false).a0(new j70(this, 7)).I0(null);
    }
}
