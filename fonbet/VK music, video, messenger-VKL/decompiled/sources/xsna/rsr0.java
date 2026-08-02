package xsna;

import android.content.Context;
import android.view.View;
import com.vk.im.design.view.listitem.ImCallBubble;
import com.vk.im.engine.models.dialogs.BubbleColors;
import com.vkontakte.android.R;
import xsna.tlo0;

/* compiled from: VhMsgCallSettingsSnippet.kt */
/* loaded from: classes2.dex */
public final class rsr0 extends osr0<ssr0> {
    public static final /* synthetic */ int o = 0;
    public final Context m;
    public final ImCallBubble n;

    public rsr0(View view) {
        super(view);
        this.m = view.getContext();
        this.n = (ImCallBubble) view.findViewById(R.id.bubble);
        qcy<Object>[] qcyVarArr = bwt0.a;
        bwt0.f0(view, (int) view.getResources().getDimension(R.dimen.vk_ui_spacing_size_xl), 0, (int) view.getResources().getDimension(R.dimen.vk_ui_spacing_size_xl), 0, 10);
    }

    @Override // xsna.osr0
    /* renamed from: a6, reason: merged with bridge method [inline-methods] */
    public final void V5(ssr0 ssr0Var, pk30 pk30Var) {
        StringBuilder sb = new StringBuilder();
        t040 t040Var = t040.a;
        long j = ssr0Var.k;
        t040Var.getClass();
        t040.a(j, false, this.m, sb, true);
        dyv dyvVar = new dyv(new os9(new gko(R.drawable.vk_icon_phone_cross_24), 10), oq.d(tlo0.Companion, ssr0Var.b), new tlo0.h(ssr0Var.c), new tlo0.h(sb));
        ImCallBubble imCallBubble = this.n;
        imCallBubble.setMiddle(dyvVar);
        imCallBubble.setBottom(new cyv(new byv(new tlo0.h(ssr0Var.d), new y4(28, pk30Var, ssr0Var))));
        imCallBubble.setBackgroundColor(dhr0.M() ? ssr0Var.h : ssr0Var.i);
        BubbleColors bubbleColors = dhr0.M() ? ssr0Var.g : ssr0Var.f;
        imCallBubble.setIconTintColor(bubbleColors.r);
        imCallBubble.setTitleTextColor(bubbleColors.d);
        imCallBubble.setSubtitleTintColor(bubbleColors.i);
        imCallBubble.setTimeTextColor(bubbleColors.h);
        imCallBubble.setButtonTextColor(bubbleColors.u);
    }
}
