package xsna;

import android.content.Context;
import android.view.View;
import android.widget.CompoundButton;
import android.widget.TextView;
import android.widget.Toast;
import com.vk.core.apps.BuildInfo;
import com.vk.voip.ui.share.link.pager.view.VoipShareLinkPagerView;
import com.vk.voip.ui.view.VoipActionMultiLineView;
import com.vkontakte.android.R;
import java.util.ArrayList;
import java.util.HashMap;
import kotlin.Lazy;
import kotlin.LazyThreadSafetyMode;
import xsna.cwb0;
import xsna.ddz;
import xsna.i330;
import xsna.mcz;

/* compiled from: LinkViewHolder.kt */
/* loaded from: classes7.dex */
public class zcz {
    public final Context a;
    public final View b;
    public final boolean c;
    public final boolean d;
    public final io.reactivex.rxjava3.subjects.f<mcz> e = new io.reactivex.rxjava3.subjects.f<>();
    public final bzb0 f;
    public final View g;
    public final View h;
    public final View i;
    public final View j;
    public final View k;
    public final TextView l;
    public final VoipShareLinkPagerView m;
    public final View n;
    public final View o;
    public final VoipActionMultiLineView p;
    public String q;
    public final ncz r;
    public final VoipActionMultiLineView s;
    public final pcz t;
    public final VoipActionMultiLineView u;
    public final qcz v;
    public final Object w;
    public final Object x;
    public final i330<ddz> y;
    public Toast z;

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r3v0, types: [android.widget.CompoundButton$OnCheckedChangeListener, xsna.pcz] */
    /* JADX WARN: Type inference failed for: r7v0, types: [android.widget.CompoundButton$OnCheckedChangeListener, xsna.ncz] */
    public zcz(Context context, View view, boolean z, boolean z2) {
        zcz zczVar;
        VoipActionMultiLineView voipActionMultiLineView;
        this.a = context;
        this.b = view;
        this.c = z;
        this.d = z2;
        this.f = new bzb0(context);
        View findViewById = view.findViewById(R.id.back);
        this.g = findViewById;
        this.h = view.findViewById(R.id.link_view_container);
        View findViewById2 = view.findViewById(R.id.copy_link_view);
        this.i = findViewById2;
        View findViewById3 = view.findViewById(R.id.share_link_view);
        this.j = findViewById3;
        View findViewById4 = view.findViewById(R.id.update_link_click_area_view);
        this.k = findViewById4;
        TextView textView = (TextView) view.findViewById(R.id.link_text);
        this.l = textView;
        this.m = (VoipShareLinkPagerView) view.findViewById(R.id.share_link_pager);
        this.n = view.findViewById(R.id.share_link_pager_refresh_description);
        this.o = view.findViewById(R.id.share_link_pager_divider);
        VoipActionMultiLineView voipActionMultiLineView2 = (VoipActionMultiLineView) view.findViewById(R.id.allow_join_anonymously_switch_view);
        this.p = voipActionMultiLineView2;
        this.q = "";
        ?? r7 = new CompoundButton.OnCheckedChangeListener() { // from class: xsna.ncz
            @Override // android.widget.CompoundButton.OnCheckedChangeListener
            public final void onCheckedChanged(CompoundButton compoundButton, boolean z3) {
                zcz zczVar2 = zcz.this;
                zczVar2.e.onNext(new mcz.a(!z3));
                zczVar2.d(z3 ? R.string.voip_anonymous_join_allowed : R.string.voip_anonymous_join_forbidden);
            }
        };
        this.r = r7;
        VoipActionMultiLineView voipActionMultiLineView3 = (VoipActionMultiLineView) view.findViewById(R.id.waiting_room_switch_view);
        this.s = voipActionMultiLineView3;
        ?? r3 = new CompoundButton.OnCheckedChangeListener() { // from class: xsna.pcz
            @Override // android.widget.CompoundButton.OnCheckedChangeListener
            public final void onCheckedChanged(CompoundButton compoundButton, boolean z3) {
                zcz zczVar2 = zcz.this;
                zczVar2.e.onNext(new mcz.e(z3));
                zczVar2.d(z3 ? R.string.voip_waiting_room_enabled : R.string.voip_waiting_room_disabled);
            }
        };
        this.t = r3;
        VoipActionMultiLineView voipActionMultiLineView4 = (VoipActionMultiLineView) view.findViewById(R.id.allow_feedback_switch_view);
        this.u = voipActionMultiLineView4;
        qcz qczVar = new qcz(this, 0);
        this.v = qczVar;
        cty ctyVar = new cty(this, 2);
        LazyThreadSafetyMode lazyThreadSafetyMode = LazyThreadSafetyMode.NONE;
        Lazy a = msy.a(lazyThreadSafetyMode, ctyVar);
        this.w = a;
        Lazy a2 = msy.a(lazyThreadSafetyMode, new n7w(this, 6));
        this.x = a2;
        ArrayList arrayList = new ArrayList();
        HashMap hashMap = new HashMap();
        arrayList.add(new i330.b(new bod(2), new wcz(1, this, zcz.class, "onLinkUpdate", "onLinkUpdate(Lcom/vk/voip/ui/settings/link_view/LinkViewModel$LinkState;)V", 0), new kxa((byte) 0, 5)));
        i330 i330Var = new i330(arrayList, hashMap);
        ArrayList arrayList2 = new ArrayList();
        HashMap hashMap2 = new HashMap();
        arrayList2.add(new i330.b(new bod(2), new lrk(this, 24), new kxa((byte) 0, 5)));
        ArrayList arrayList3 = new ArrayList();
        HashMap hashMap3 = new HashMap();
        int i = 0;
        arrayList3.add(new i330.b(rcz.b, new hx3(1, this, zcz.class, "onAnonJoinForbiddenChanged", "onAnonJoinForbiddenChanged(Z)V", i, 2), new pv7((byte) 0, 3)));
        arrayList3.add(new i330.b(scz.b, new hoh(1, this, zcz.class, "onCanModifyLinkChanged", "onCanModifyLinkChanged(Z)V", i, 4), new pv7((byte) 0, 3)));
        arrayList3.add(new i330.b(tcz.b, new yte(1, this, zcz.class, "onWaitingRoomChanged", "onWaitingRoomChanged(Z)V", i, 5), new pv7((byte) 0, 3)));
        arrayList3.add(new i330.b(ucz.b, new kp1(1, this, zcz.class, "onFeedbackChanged", "onFeedbackChanged(Z)V", 0, 9), new pv7((byte) 0, 3)));
        if (z2) {
            zczVar = this;
            arrayList3.add(new i330.b(vcz.b, new vs6(1, zczVar, zcz.class, "onIsServiceChatChanged", "onIsServiceChatChanged(Ljava/lang/Boolean;)V", 0, 5), new pv7((byte) 0, 3)));
        } else {
            zczVar = this;
        }
        hashMap2.put(fpf0.a(ddz.a.c.class), new i330(arrayList3, hashMap3));
        i330 i330Var2 = new i330(arrayList2, hashMap2);
        ArrayList arrayList4 = new ArrayList();
        HashMap hashMap4 = new HashMap();
        arrayList4.add(new i330.b(xcz.b, new d2y(i330Var, 1), new pv7((byte) 0, 3)));
        arrayList4.add(new i330.b(ycz.b, new qqe(i330Var2, 28), new pv7((byte) 0, 3)));
        zczVar.y = new i330<>(arrayList4, hashMap4);
        findViewById4.setContentDescription(context.getString(R.string.voip_update_call_link) + ". " + context.getString(R.string.voip_update_call_link_hint));
        voipActionMultiLineView2.setSwitchListener(r7);
        voipActionMultiLineView2.setSwitchVisible(true);
        voipActionMultiLineView3.setSwitchListener(r3);
        voipActionMultiLineView3.setSwitchVisible(true);
        voipActionMultiLineView4.setSwitchListener(qczVar);
        voipActionMultiLineView4.setSwitchVisible(true);
        if (z2 && (voipActionMultiLineView = (VoipActionMultiLineView) a.getValue()) != null) {
            bwt0.p0(voipActionMultiLineView, true);
            voipActionMultiLineView.setSwitchListener((CompoundButton.OnCheckedChangeListener) a2.getValue());
            voipActionMultiLineView.setSwitchVisible(true);
        }
        jjc.g(findViewById2, new iie(zczVar, 21));
        if (findViewById3 != null) {
            jjc.g(findViewById3, new l2k(zczVar, 23));
        }
        jjc.g(findViewById4, new rmg(zczVar, 19));
        if (textView != null) {
            jjc.g(textView, new xgv(zczVar, 5));
        }
        if (findViewById != null) {
            jjc.g(findViewById, new f0z(zczVar, 1));
        }
        zczVar.b(true);
    }

    public void a() {
        this.f.a();
    }

    public final void b(boolean z) {
        boolean z2 = false;
        boolean z3 = z && (BuildInfo.s() || BuildInfo.t());
        bwt0.p0(this.h, z && !z3);
        bwt0.p0(this.m, z3);
        bwt0.p0(this.n, z3);
        if (z3 && !this.c) {
            z2 = true;
        }
        bwt0.p0(this.o, z2);
    }

    public void c() {
        this.f.c(new cwb0.s0(null, R.string.voip_share_link_loading, 5), new ubw(this, 3));
    }

    public final void d(int i) {
        Toast toast = this.z;
        if (toast != null) {
            toast.cancel();
        }
        Toast makeText = Toast.makeText(this.a, i, 0);
        this.z = makeText;
        if (makeText != null) {
            makeText.show();
        }
    }
}
