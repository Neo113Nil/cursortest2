package xsna;

import android.content.Context;
import android.graphics.Rect;
import android.text.SpannableStringBuilder;
import com.vk.dto.common.Peer;
import com.vk.im.engine.models.dialogs.Dialog;
import com.vk.im.engine.models.messages.Msg;
import com.vk.im.reporters.api.di.ImReportersComponent;
import com.vk.im.ui.views.dialogs.DialogItemView;
import java.util.Collections;
import java.util.List;
import kotlin.collections.EmptyList;

/* compiled from: VhDialog.kt */
/* loaded from: classes2.dex */
public final class yqr0 extends zqr0<DialogItemView> implements ytx0, usx0, qsx0 {
    public static final /* synthetic */ int C = 0;
    public DialogItemView.ExtraIcon A;
    public boolean B;
    public final Context o;
    public final vlm p;
    public final com.vk.im.ui.formatters.a q;
    public final en30 r;
    public final zri s;
    public final SpannableStringBuilder t;
    public final SpannableStringBuilder u;
    public final k0w v;
    public final cew w;
    public agm x;
    public hcm y;
    public Msg z;

    public yqr0(DialogItemView dialogItemView) {
        super(dialogItemView);
        Context context = dialogItemView.getContext();
        this.o = context;
        this.p = new vlm(context);
        this.q = new com.vk.im.ui.formatters.a(context);
        this.r = new en30(context);
        this.s = new zri(context);
        this.t = new SpannableStringBuilder();
        this.u = new SpannableStringBuilder();
        this.v = ((ImReportersComponent) ((k7m) m7m.c(dialogItemView)).a(fpf0.a(ImReportersComponent.class))).K().w();
        zdw zdwVar = i7o0.b;
        this.w = (zdwVar == null ? null : zdwVar).u;
    }

    public static boolean a6(Dialog dialog) {
        xuo0.a.getClass();
        long a = xuo0.a();
        if (dialog != null) {
            return dialog.Ac(a);
        }
        return false;
    }

    @Override // xsna.zqr0, xsna.jsx0
    public final boolean H4() {
        agm agmVar = this.x;
        if (agmVar == null) {
            agmVar = null;
        }
        return agmVar.s;
    }

    @Override // xsna.qsx0
    public final boolean L4() {
        List<Peer.Type> list = rdw.a;
        Dialog dialog = this.m;
        if (dialog == null) {
            dialog = null;
        }
        Peer Zb = dialog.Zb();
        Dialog dialog2 = this.m;
        if (dialog2 == null) {
            dialog2 = null;
        }
        if (!rdw.a(Zb, dialog2.Jc())) {
            return false;
        }
        agm agmVar = this.x;
        return (agmVar != null ? agmVar : null).t.i();
    }

    @Override // xsna.usx0
    public final boolean M1() {
        agm agmVar = this.x;
        if (agmVar == null) {
            agmVar = null;
        }
        return agmVar.m;
    }

    @Override // xsna.ytx0
    public final Rect T5(Rect rect) {
        ((DialogItemView) this.l).b(rect);
        return rect;
    }

    @Override // xsna.usx0
    public final List<Rect> V3() {
        return EmptyList.b;
    }

    public final void W5() {
        DialogItemView dialogItemView = (DialogItemView) this.l;
        dialogItemView.u();
        dialogItemView.setUnreadOutVisible(false);
        dialogItemView.setReadOutVisible(false);
        dialogItemView.setSendingVisible(false);
        dialogItemView.setErrorVisible(false);
        DialogItemView.ExtraIcon extraIcon = DialogItemView.ExtraIcon.NONE;
        Dialog dialog = this.m;
        if (dialog == null) {
            dialog = null;
        }
        dialogItemView.j(extraIcon, !a6(dialog));
    }

    @Override // xsna.usx0
    public final List<Rect> p2() {
        Rect rect = new Rect();
        ((DialogItemView) this.l).getGlobalVisibleRect(rect);
        rect.left = rect.right - iah0.a(40);
        return Collections.singletonList(rect);
    }

    @Override // xsna.qsx0
    public final Rect u4(Rect rect) {
        ((DialogItemView) this.l).b(rect);
        return rect;
    }

    @Override // xsna.ytx0
    public final boolean w1() {
        agm agmVar = this.x;
        if (agmVar == null) {
            agmVar = null;
        }
        return agmVar.n;
    }
}
