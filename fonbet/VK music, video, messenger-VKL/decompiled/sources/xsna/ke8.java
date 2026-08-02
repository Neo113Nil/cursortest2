package xsna;

import android.annotation.SuppressLint;
import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import androidx.constraintlayout.widget.Group;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import com.vk.voip.ui.broadcast.views.config.BroadcastConfigViewParams;
import com.vk.voip.ui.view.VoipActionMultiLineView;
import com.vkontakte.android.R;
import java.util.ArrayList;
import java.util.HashMap;
import xsna.ffw0;
import xsna.i330;
import xsna.me8;

/* compiled from: BroadcastConfigView.kt */
/* loaded from: classes7.dex */
public final class ke8 {
    public boolean A;
    public final Context a;
    public final boolean b;
    public final td8 c;
    public final bfw0 d;
    public final BroadcastConfigViewParams e;

    @SuppressLint({"InflateParams"})
    public final ViewGroup f;
    public final View g;
    public final View h;
    public final TextView i;
    public final View j;
    public final View k;
    public final TextView l;
    public final RecyclerView m;
    public final View n;
    public final VoipActionMultiLineView o;
    public final View p;
    public final Group q;
    public final EditText r;
    public final VoipActionMultiLineView s;
    public final TextView t;
    public final gdp u;
    public dw20 v;
    public final io.reactivex.rxjava3.subjects.f<le8> w;
    public final i330<me8> x;
    public final io.reactivex.rxjava3.disposables.b y;
    public boolean z;

    public ke8(Context context, ViewGroup viewGroup, boolean z, td8 td8Var, bfw0 bfw0Var, BroadcastConfigViewParams broadcastConfigViewParams) {
        Button button;
        Integer num;
        Integer num2;
        Integer num3;
        VoipActionMultiLineView voipActionMultiLineView;
        Integer num4;
        Integer num5;
        Integer num6;
        Integer num7;
        Integer num8;
        this.a = context;
        this.b = z;
        this.c = td8Var;
        this.d = bfw0Var;
        this.e = broadcastConfigViewParams;
        ViewGroup viewGroup2 = (ViewGroup) LayoutInflater.from(context).inflate(R.layout.voip_broadcast_config, viewGroup, false);
        this.f = viewGroup2;
        TextView textView = (TextView) viewGroup2.findViewById(R.id.tv_broacast_start_title);
        View findViewById = viewGroup2.findViewById(R.id.progress);
        this.g = findViewById;
        View findViewById2 = viewGroup2.findViewById(R.id.error);
        this.h = findViewById2;
        this.i = (TextView) viewGroup2.findViewById(R.id.error_text);
        TextView textView2 = (TextView) viewGroup2.findViewById(R.id.error_retry);
        View findViewById3 = viewGroup2.findViewById(R.id.content);
        this.j = findViewById3;
        View findViewById4 = viewGroup2.findViewById(R.id.ivClose);
        this.k = findViewById4;
        TextView textView3 = (TextView) viewGroup2.findViewById(R.id.owners_title);
        this.l = textView3;
        RecyclerView recyclerView = (RecyclerView) viewGroup2.findViewById(R.id.owners_list);
        this.m = recyclerView;
        this.n = viewGroup2.findViewById(R.id.owners_divider_bottom);
        VoipActionMultiLineView voipActionMultiLineView2 = (VoipActionMultiLineView) viewGroup2.findViewById(R.id.broadcast);
        this.o = voipActionMultiLineView2;
        this.p = viewGroup2.findViewById(R.id.broadcast_divider_bottom);
        this.q = (Group) viewGroup2.findViewById(R.id.record_title_group);
        EditText editText = (EditText) viewGroup2.findViewById(R.id.title_input);
        this.r = editText;
        VoipActionMultiLineView voipActionMultiLineView3 = (VoipActionMultiLineView) viewGroup2.findViewById(R.id.privacy_selector);
        this.s = voipActionMultiLineView3;
        TextView textView4 = (TextView) viewGroup2.findViewById(R.id.privacy_description);
        this.t = textView4;
        Button button2 = (Button) viewGroup2.findViewById(R.id.start);
        bpn0 bpn0Var = new bpn0(new ka0(this, 9));
        this.u = new gdp();
        this.w = new io.reactivex.rxjava3.subjects.f<>();
        ArrayList arrayList = new ArrayList();
        HashMap hashMap = new HashMap();
        arrayList.add(new i330.b(new bod(2), new dg(this, 10), new kxa((byte) 0, 5)));
        ArrayList arrayList2 = new ArrayList();
        HashMap hashMap2 = new HashMap();
        int i = 0;
        int i2 = 0;
        arrayList2.add(new i330.b(vd8.b, new wd8(1, this, ke8.class, "onErrorContentChanged", "onErrorContentChanged(Ljava/lang/Throwable;)V", i, i2), new pv7((byte) 0, 3)));
        hashMap.put(fpf0.a(me8.b.class), new i330(arrayList2, hashMap2));
        i330.a aVar = new i330.a();
        aVar.c(new de8(1, this, ke8.class, "toOwnersListDiffModel", "toOwnersListDiffModel(Lcom/vk/voip/ui/broadcast/views/config/BroadcastConfigViewModel$Configuration;)Lkotlin/Pair;", 0), new ee8(1, this, ke8.class, "onOwnersListChanged", "onOwnersListChanged(Lkotlin/Pair;)V", i, i2), new pv7((byte) 0, 3));
        aVar.c(new fe8(1, this, ke8.class, "toCustomTitleEnabledDiffModel", "toCustomTitleEnabledDiffModel(Lcom/vk/voip/ui/broadcast/views/config/BroadcastConfigViewModel$Configuration;)Z", 0), new gy(1, this, ke8.class, "onCustomTitleEnabledChanged", "onCustomTitleEnabledChanged(Z)V", 0, 3), new pv7((byte) 0, 3));
        aVar.c(new ge8(1, this, ke8.class, "toCustomTitleValueDiffModel", "toCustomTitleValueDiffModel(Lcom/vk/voip/ui/broadcast/views/config/BroadcastConfigViewModel$Configuration;)Ljava/lang/String;", 0), new m7(this, 13), new pv7((byte) 0, 3));
        int i3 = 0;
        aVar.c(new he8(1, this, ke8.class, "toBroadcastChangeEnabledDiffModel", "toBroadcastChangeEnabledDiffModel(Lcom/vk/voip/ui/broadcast/views/config/BroadcastConfigViewModel$Configuration;)Z", 0), new ie8(1, this, ke8.class, "onBroadcastChangeEnabledChanged", "onBroadcastChangeEnabledChanged(Z)V", i, i3), new pv7((byte) 0, 3));
        aVar.c(new je8(1, this, ke8.class, "toBroadcastTitleValueDiffModel", "toBroadcastTitleValueDiffModel(Lcom/vk/voip/ui/broadcast/views/config/BroadcastConfigViewModel$Configuration;)Ljava/lang/String;", 0), new xd8(1, this, ke8.class, "onBroadcastTitleValueChanged", "onBroadcastTitleValueChanged(Ljava/lang/String;)V", i, i3), new pv7((byte) 0, 3));
        aVar.c(new yd8(1, this, ke8.class, "toPrivacyChangeSupportedDiffModel", "toPrivacyChangeSupportedDiffModel(Lcom/vk/voip/ui/broadcast/views/config/BroadcastConfigViewModel$Configuration;)Z", 0), new wi3(1, this, ke8.class, "onPrivacyChangeSupportedChanged", "onPrivacyChangeSupportedChanged(Z)V", i, 1), new pv7((byte) 0, 3));
        aVar.c(new zd8(1, this, ke8.class, "toPrivacyChangeEnabledDiffModel", "toPrivacyChangeEnabledDiffModel(Lcom/vk/voip/ui/broadcast/views/config/BroadcastConfigViewModel$Configuration;)Z", 0), new ae8(1, this, ke8.class, "onPrivacyChangeEnabledChanged", "onPrivacyChangeEnabledChanged(Z)V", i, 0), new pv7((byte) 0, 3));
        int i4 = 1;
        aVar.c(new be8(1, this, ke8.class, "toPrivacySettingsDiffModel", "toPrivacySettingsDiffModel(Lcom/vk/voip/ui/broadcast/views/config/BroadcastConfigViewModel$Configuration;)Ljava/lang/CharSequence;", 0), new ai6(1, this, ke8.class, "onPrivacySettingsChanged", "onPrivacySettingsChanged(Ljava/lang/CharSequence;)V", i, i4), new pv7((byte) 0, 3));
        aVar.c(new ce8(1, this, ke8.class, "toPrivacyDescriptionDiffModel", "toPrivacyDescriptionDiffModel(Lcom/vk/voip/ui/broadcast/views/config/BroadcastConfigViewModel$Configuration;)Ljava/lang/CharSequence;", 0), new bi6(1, this, ke8.class, "onPrivacyDescriptionChanged", "onPrivacyDescriptionChanged(Ljava/lang/CharSequence;)V", i, i4), new pv7((byte) 0, 3));
        hashMap.put(fpf0.a(me8.a.class), aVar.b());
        this.x = new i330<>(arrayList, hashMap);
        io.reactivex.rxjava3.disposables.b bVar = new io.reactivex.rxjava3.disposables.b();
        this.y = bVar;
        this.z = true;
        this.A = true;
        if (z) {
            button = button2;
        } else {
            button = button2;
            button.setTextColor(e3m.f(R.attr.vk_ui_text_accent_themed, button2.getContext()));
            button.setBackground(m33.a(R.drawable.bg_live_btn, button.getContext()));
        }
        textView.setText(z ? (broadcastConfigViewParams == null || (num8 = broadcastConfigViewParams.c) == null) ? R.string.voip_toolbar_title_record : num8.intValue() : (broadcastConfigViewParams == null || (num = broadcastConfigViewParams.b) == null) ? R.string.voip_broadcast : num.intValue());
        button.setText(z ? (broadcastConfigViewParams == null || (num7 = broadcastConfigViewParams.h) == null) ? R.string.voip_start_record : num7.intValue() : (broadcastConfigViewParams == null || (num2 = broadcastConfigViewParams.i) == null) ? R.string.voip_broadcast_start : num2.intValue());
        textView3.setText(z ? (broadcastConfigViewParams == null || (num6 = broadcastConfigViewParams.g) == null) ? R.string.voip_broadcast_author_record : num6.intValue() : (broadcastConfigViewParams == null || (num3 = broadcastConfigViewParams.f) == null) ? R.string.voip_broadcast_author : num3.intValue());
        editText.setHint(context.getString(z ? R.string.voip_broadcast_title_hint_record : R.string.voip_broadcast_title_hint));
        if (broadcastConfigViewParams != null && (num5 = broadcastConfigViewParams.d) != null) {
            ((TextView) bpn0Var.getValue()).setText(num5.intValue());
        }
        if (broadcastConfigViewParams == null || (num4 = broadcastConfigViewParams.e) == null) {
            voipActionMultiLineView = voipActionMultiLineView3;
        } else {
            voipActionMultiLineView = voipActionMultiLineView3;
            voipActionMultiLineView.setTitle(num4.intValue());
        }
        recyclerView.getContext();
        LinearLayoutManager linearLayoutManager = new LinearLayoutManager(0, false);
        linearLayoutManager.l = true;
        recyclerView.setLayoutManager(linearLayoutManager);
        recyclerView.setAdapter(new n490(broadcastConfigViewParams, new ud8(1, this, ke8.class, "publishEvent", "publishEvent(Lcom/vk/voip/ui/broadcast/views/config/BroadcastConfigViewEvent;)V", 0, 0)));
        recyclerView.setItemAnimator(null);
        recyclerView.setHasFixedSize(true);
        bwt0.p0(findViewById, false);
        bwt0.p0(findViewById2, false);
        bwt0.p0(findViewById3, false);
        bwt0.p0(textView4, !z);
        bVar.b(bwt0.f(editText).subscribe(new sf(new com.vk.movika.sdk.base.logic.interactor.p(this, 9), 7)));
        jjc.g(voipActionMultiLineView2, new ay0(this, 10));
        int i5 = 9;
        jjc.g(voipActionMultiLineView, new fm0(this, i5));
        jjc.g(button, new g20(this, i5));
        jjc.g(textView2, new jm0(this, 4));
        jjc.g(findViewById4, new sa(this, 13));
    }

    public static int c(ffw0 ffw0Var) {
        return ffw0Var instanceof ffw0.c.C2868c ? R.string.voip_broadcast_privacy_mode_only_me : ffw0Var instanceof ffw0.c.b ? R.string.voip_broadcast_privacy_mode_friends : ffw0Var instanceof ffw0.c.a ? R.string.voip_broadcast_privacy_mode_all : ffw0Var instanceof ffw0.b.a ? R.string.voip_broadcast_group_privacy_mode_all : ffw0Var instanceof ffw0.b.f ? R.string.voip_broadcast_group_privacy_mode_members_and_by_link : ffw0Var instanceof ffw0.b.e ? R.string.voip_broadcast_group_privacy_mode_members : ffw0Var instanceof ffw0.b.C2867b ? R.string.voip_broadcast_group_privacy_mode_by_link : ffw0Var instanceof ffw0.b.d ? R.string.voip_broadcast_group_privacy_mode_editors : R.string.voip_broadcast_privacy_mode_all;
    }

    public final void a() {
        if (!this.z) {
            throw new IllegalStateException("Instance is destroyed");
        }
    }

    public final void b(le8 le8Var) {
        if (this.z) {
            this.w.onNext(le8Var);
        }
    }
}
