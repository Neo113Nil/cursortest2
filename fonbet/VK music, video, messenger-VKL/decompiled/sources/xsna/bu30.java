package xsna;

import android.content.Context;
import android.content.res.Resources;
import android.graphics.drawable.Drawable;
import android.text.TextUtils;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import com.vk.dto.attaches.Attach;
import com.vk.im.engine.models.dialogs.BubbleColors;
import com.vk.im.engine.models.messages.Msg;
import com.vk.im.ui.components.viewcontrollers.msg_list.adapter.model.MsgPartTwoRowSnippetItem;
import com.vk.im.ui.views.msg.MsgPartIconTwoRowView;
import com.vkontakte.android.R;
import xsna.e3m;

/* compiled from: MsgPartTwoRowSnippet.kt */
/* loaded from: classes2.dex */
public final class bu30 extends hr30<Attach, MsgPartTwoRowSnippetItem> {
    public MsgPartIconTwoRowView d;
    public String e;
    public pk30 f;
    public MsgPartTwoRowSnippetItem g;
    public final v5t h = new v5t(R.layout.vkim_msg_part_snippet);

    /* compiled from: MsgPartTwoRowSnippet.kt */
    public static final /* synthetic */ class a {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;

        static {
            int[] iArr = new int[MsgPartTwoRowSnippetItem.MsgPartTwoRowSnippetItemType.values().length];
            try {
                iArr[MsgPartTwoRowSnippetItem.MsgPartTwoRowSnippetItemType.AttachWall.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[MsgPartTwoRowSnippetItem.MsgPartTwoRowSnippetItemType.AttachPoll.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[MsgPartTwoRowSnippetItem.MsgPartTwoRowSnippetItemType.AttachHighlight.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            $EnumSwitchMapping$0 = iArr;
        }
    }

    /* compiled from: MsgPartHolderDelegate.kt */
    public static final class b implements izs<View, s3q0> {
        public b() {
        }

        @Override // xsna.izs
        public final s3q0 invoke(View view) {
            bu30 bu30Var = bu30.this;
            pk30 pk30Var = bu30Var.f;
            MsgPartTwoRowSnippetItem msgPartTwoRowSnippetItem = bu30Var.g;
            Msg msg = msgPartTwoRowSnippetItem != null ? msgPartTwoRowSnippetItem.l : null;
            Attach attach = msgPartTwoRowSnippetItem != null ? msgPartTwoRowSnippetItem.n : null;
            if (pk30Var != null && msg != null && attach != null) {
                pk30Var.R(attach, msg, msgPartTwoRowSnippetItem != null ? msgPartTwoRowSnippetItem.m : null);
            }
            return s3q0.a;
        }
    }

    /* compiled from: MsgPartHolderDelegate.kt */
    public static final class c implements View.OnLongClickListener {
        public c() {
        }

        @Override // android.view.View.OnLongClickListener
        public final boolean onLongClick(View view) {
            bu30 bu30Var = bu30.this;
            pk30 pk30Var = bu30Var.f;
            MsgPartTwoRowSnippetItem msgPartTwoRowSnippetItem = bu30Var.g;
            Boolean bool = null;
            bool = null;
            bool = null;
            Msg msg = msgPartTwoRowSnippetItem != null ? msgPartTwoRowSnippetItem.l : null;
            Attach attach = msgPartTwoRowSnippetItem != null ? msgPartTwoRowSnippetItem.n : null;
            if (pk30Var != null && msg != null && attach != null) {
                pk30Var.X(attach, msg, msgPartTwoRowSnippetItem != null ? msgPartTwoRowSnippetItem.m : null);
                bool = Boolean.TRUE;
            }
            if (bool != null) {
                return bool.booleanValue();
            }
            return false;
        }
    }

    @Override // xsna.hr30
    public final void o(BubbleColors bubbleColors) {
        MsgPartIconTwoRowView msgPartIconTwoRowView = this.d;
        if (msgPartIconTwoRowView == null) {
            msgPartIconTwoRowView = null;
        }
        hr30.j(msgPartIconTwoRowView, bubbleColors);
    }

    @Override // xsna.hr30
    public final void p(MsgPartTwoRowSnippetItem msgPartTwoRowSnippetItem, pk30 pk30Var, ub80 ub80Var, vb80 vb80Var) {
        String str;
        Drawable a2;
        MsgPartTwoRowSnippetItem msgPartTwoRowSnippetItem2 = msgPartTwoRowSnippetItem;
        MsgPartTwoRowSnippetItem.MsgPartTwoRowSnippetItemType msgPartTwoRowSnippetItemType = msgPartTwoRowSnippetItem2.i;
        this.f = pk30Var;
        this.g = msgPartTwoRowSnippetItem2;
        MsgPartIconTwoRowView msgPartIconTwoRowView = this.d;
        if (msgPartIconTwoRowView == null) {
            msgPartIconTwoRowView = null;
        }
        Resources resources = msgPartIconTwoRowView.getResources();
        int[] iArr = a.$EnumSwitchMapping$0;
        int i = iArr[msgPartTwoRowSnippetItemType.ordinal()];
        if (i == 1) {
            str = msgPartTwoRowSnippetItem2.d;
        } else if (i == 2) {
            str = msgPartTwoRowSnippetItem2.e;
        } else if (i != 3) {
            str = "";
        } else {
            String str2 = msgPartTwoRowSnippetItem2.g;
            if (str2 == null) {
                str2 = msgPartTwoRowSnippetItem2.h;
            }
            str = resources.getString(R.string.vkim_highligh_unavailable_title, str2);
        }
        if (TextUtils.isEmpty(str)) {
            MsgPartIconTwoRowView msgPartIconTwoRowView2 = this.d;
            if (msgPartIconTwoRowView2 == null) {
                msgPartIconTwoRowView2 = null;
            }
            msgPartIconTwoRowView2.setTitleText(s(msgPartTwoRowSnippetItem2));
            MsgPartIconTwoRowView msgPartIconTwoRowView3 = this.d;
            if (msgPartIconTwoRowView3 == null) {
                msgPartIconTwoRowView3 = null;
            }
            String str3 = this.e;
            if (str3 == null) {
                str3 = null;
            }
            msgPartIconTwoRowView3.setSubtitleText(str3);
        } else {
            CharSequence q = ine0.q(str.substring(0, Math.min(str.length(), 100)));
            ucp ucpVar = ucp.a;
            CharSequence i2 = ucp.i(q);
            MsgPartIconTwoRowView msgPartIconTwoRowView4 = this.d;
            if (msgPartIconTwoRowView4 == null) {
                msgPartIconTwoRowView4 = null;
            }
            msgPartIconTwoRowView4.setTitleText(i2);
            MsgPartIconTwoRowView msgPartIconTwoRowView5 = this.d;
            if (msgPartIconTwoRowView5 == null) {
                msgPartIconTwoRowView5 = null;
            }
            msgPartIconTwoRowView5.setSubtitleText(s(msgPartTwoRowSnippetItem2));
        }
        MsgPartIconTwoRowView msgPartIconTwoRowView6 = this.d;
        MsgPartIconTwoRowView msgPartIconTwoRowView7 = msgPartIconTwoRowView6 == null ? null : msgPartIconTwoRowView6;
        if (msgPartIconTwoRowView6 == null) {
            msgPartIconTwoRowView6 = null;
        }
        Context context = msgPartIconTwoRowView6.getContext();
        int i3 = iArr[msgPartTwoRowSnippetItemType.ordinal()];
        if (i3 == 1) {
            e3m.a aVar = e3m.a;
            a2 = m33.a(R.drawable.vkim_ic_attach_wall_post, context);
        } else if (i3 == 2) {
            e3m.a aVar2 = e3m.a;
            a2 = m33.a(R.drawable.vkim_ic_attach_poll, context);
        } else if (i3 != 3) {
            a2 = null;
        } else {
            e3m.a aVar3 = e3m.a;
            a2 = m33.a(R.drawable.vkim_ic_attach_highlight, context);
        }
        msgPartIconTwoRowView7.setIcon(a2);
        jr30 jr30Var = msgPartTwoRowSnippetItem2.b;
        MsgPartIconTwoRowView msgPartIconTwoRowView8 = this.d;
        hr30.m(jr30Var, msgPartIconTwoRowView8 != null ? msgPartIconTwoRowView8 : null);
    }

    @Override // xsna.hr30
    public final View q(LayoutInflater layoutInflater, ViewGroup viewGroup) {
        Resources resources = viewGroup.getContext().getResources();
        v5t v5tVar = this.h;
        this.d = (MsgPartIconTwoRowView) v5tVar.c(layoutInflater, viewGroup);
        View view = (View) v5tVar.c;
        if (view == null) {
            view = null;
        }
        jjc.g(view, new b());
        View view2 = (View) v5tVar.c;
        if (view2 == null) {
            view2 = null;
        }
        view2.setOnLongClickListener(new c());
        resources.getString(R.string.vkim_msg_list_wall_title_primary);
        this.e = resources.getString(R.string.vkim_msg_list_wall_title_secondary);
        MsgPartIconTwoRowView msgPartIconTwoRowView = this.d;
        if (msgPartIconTwoRowView == null) {
            return null;
        }
        return msgPartIconTwoRowView;
    }

    @Override // xsna.hr30
    public final void r() {
        this.f = null;
        this.g = null;
    }

    public final String s(MsgPartTwoRowSnippetItem msgPartTwoRowSnippetItem) {
        MsgPartIconTwoRowView msgPartIconTwoRowView = this.d;
        if (msgPartIconTwoRowView == null) {
            msgPartIconTwoRowView = null;
        }
        Resources resources = msgPartIconTwoRowView.getResources();
        int i = a.$EnumSwitchMapping$0[msgPartTwoRowSnippetItem.i.ordinal()];
        return i != 1 ? i != 2 ? i != 3 ? "" : msgPartTwoRowSnippetItem.f ? resources.getString(R.string.vkim_highligh_deleted) : resources.getString(R.string.vkim_highligh_unavailable) : resources.getString(R.string.vkim_msg_list_poll_subtitle) : resources.getString(R.string.vkim_msg_list_wall_title_primary);
    }
}
