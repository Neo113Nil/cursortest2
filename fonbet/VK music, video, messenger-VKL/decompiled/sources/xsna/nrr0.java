package xsna;

import android.R;
import android.content.Context;
import android.content.res.Resources;
import android.text.Editable;
import android.view.KeyEvent;
import android.view.View;
import android.view.ViewGroup;
import android.widget.EditText;
import android.widget.TextView;
import com.vk.core.serialize.Serializer;
import com.vk.dto.common.Peer;
import com.vk.im.engine.models.ProfilesInfo;
import com.vk.im.engine.models.ProfilesSimpleInfo;
import com.vk.im.engine.models.dialogs.ChatSettings;
import com.vk.im.engine.models.dialogs.Dialog;
import com.vk.im.engine.models.messages.PinnedMsg;
import com.vk.im.ui.formatters.DisplayNameFormatter;
import com.vk.im.ui.views.avatars.AvatarView;
import com.vk.im.ui.views.settings.LabelSettingsView;
import com.vk.im.ui.views.settings.SwitchSettingsView;
import kotlin.NoWhenBranchMatchedException;
import xsna.yyb;

/* compiled from: VhHeader.kt */
/* loaded from: classes2.dex */
public final class nrr0 extends kqr0<yyb.b> {
    public final LabelSettingsView A;
    public final View B;
    public final LabelSettingsView C;
    public final b D;
    public final LabelSettingsView E;
    public final LabelSettingsView F;
    public final DisplayNameFormatter G;
    public final tz30 H;
    public String I;
    public boolean J;
    public final com.vk.im.engine.models.c K;
    public final jj0 l;
    public final AvatarView m;
    public final EditText n;
    public final SwitchSettingsView o;
    public final LabelSettingsView p;
    public final View q;
    public final View r;
    public final View s;
    public final TextView t;
    public final TextView u;
    public final LabelSettingsView v;
    public final View w;
    public final View x;
    public final LabelSettingsView y;
    public final LabelSettingsView z;

    /* compiled from: VhHeader.kt */
    public static final class a extends rno0 {
        public a() {
        }

        @Override // xsna.rno0, android.text.TextWatcher
        public final void afterTextChanged(Editable editable) {
            ucp ucpVar = ucp.a;
            ucp.j(editable, Float.valueOf(nrr0.this.n.getTextSize()));
        }

        @Override // xsna.rno0, android.text.TextWatcher
        public final void onTextChanged(CharSequence charSequence, int i, int i2, int i3) {
            String obj = drm0.p0(charSequence.toString()).toString();
            nrr0 nrr0Var = nrr0.this;
            boolean hasFocus = nrr0Var.n.hasFocus();
            jj0 jj0Var = nrr0Var.l;
            if (epx.f(nrr0Var.I, obj) || !hasFocus) {
                jj0Var.w();
            } else {
                jj0Var.d(obj);
            }
        }
    }

    /* compiled from: VhHeader.kt */
    public final class b implements SwitchSettingsView.b {
        public b() {
        }

        @Override // com.vk.im.ui.views.settings.SwitchSettingsView.b
        public final void c(final boolean z, boolean z2) {
            final nrr0 nrr0Var = nrr0.this;
            nrr0Var.itemView.postDelayed(new Runnable() { // from class: xsna.orr0
                @Override // java.lang.Runnable
                public final void run() {
                    nrr0.this.l.n(z);
                }
            }, nrr0Var.itemView.getContext().getResources().getInteger(R.integer.config_mediumAnimTime));
        }
    }

    public nrr0(jj0 jj0Var, ViewGroup viewGroup) {
        super(com.vkontakte.android.R.layout.vkim_chat_settings_header, viewGroup);
        this.l = jj0Var;
        AvatarView avatarView = (AvatarView) this.itemView.findViewById(com.vkontakte.android.R.id.avatar);
        this.m = avatarView;
        EditText editText = (EditText) this.itemView.findViewById(com.vkontakte.android.R.id.title);
        this.n = editText;
        this.o = (SwitchSettingsView) this.itemView.findViewById(com.vkontakte.android.R.id.notifications);
        LabelSettingsView labelSettingsView = (LabelSettingsView) this.itemView.findViewById(com.vkontakte.android.R.id.attaches);
        this.p = labelSettingsView;
        View findViewById = this.itemView.findViewById(com.vkontakte.android.R.id.search);
        this.q = findViewById;
        View findViewById2 = this.itemView.findViewById(com.vkontakte.android.R.id.theme);
        this.r = findViewById2;
        View findViewById3 = this.itemView.findViewById(com.vkontakte.android.R.id.pinned);
        this.s = findViewById3;
        this.t = (TextView) this.itemView.findViewById(com.vkontakte.android.R.id.pinned_msg_sender);
        this.u = (TextView) this.itemView.findViewById(com.vkontakte.android.R.id.pinned_msg_content);
        LabelSettingsView labelSettingsView2 = (LabelSettingsView) this.itemView.findViewById(com.vkontakte.android.R.id.link);
        this.v = labelSettingsView2;
        View findViewById4 = this.itemView.findViewById(com.vkontakte.android.R.id.owner);
        this.w = findViewById4;
        View findViewById5 = this.itemView.findViewById(com.vkontakte.android.R.id.clear_history);
        this.x = findViewById5;
        LabelSettingsView labelSettingsView3 = (LabelSettingsView) this.itemView.findViewById(com.vkontakte.android.R.id.return_btn);
        this.y = labelSettingsView3;
        LabelSettingsView labelSettingsView4 = (LabelSettingsView) this.itemView.findViewById(com.vkontakte.android.R.id.leave_btn);
        this.z = labelSettingsView4;
        LabelSettingsView labelSettingsView5 = (LabelSettingsView) this.itemView.findViewById(com.vkontakte.android.R.id.spam_btn);
        this.A = labelSettingsView5;
        this.B = this.itemView.findViewById(com.vkontakte.android.R.id.casper_info);
        LabelSettingsView labelSettingsView6 = (LabelSettingsView) this.itemView.findViewById(com.vkontakte.android.R.id.donut_info);
        this.C = labelSettingsView6;
        this.D = new b();
        this.E = (LabelSettingsView) this.itemView.findViewById(com.vkontakte.android.R.id.create_casper);
        LabelSettingsView labelSettingsView7 = (LabelSettingsView) this.itemView.findViewById(com.vkontakte.android.R.id.chat_control_settings);
        this.F = labelSettingsView7;
        this.G = new DisplayNameFormatter(null, 3, null);
        this.H = new tz30(viewGroup.getContext());
        this.J = true;
        zdw zdwVar = i7o0.b;
        a1w a1wVar = (zdwVar != null ? zdwVar : null).b;
        a1wVar.getClass();
        this.K = a1wVar.r().h;
        bwt0.i0(avatarView, new ujm0(this, 9));
        editText.addTextChangedListener(new a());
        editText.setOnFocusChangeListener(new View.OnFocusChangeListener() { // from class: xsna.lrr0
            @Override // android.view.View.OnFocusChangeListener
            public final void onFocusChange(View view, boolean z) {
                nrr0 nrr0Var = nrr0.this;
                String obj = drm0.p0(nrr0Var.n.getText().toString()).toString();
                jj0 jj0Var2 = nrr0Var.l;
                if (epx.f(nrr0Var.I, obj) || !z) {
                    jj0Var2.w();
                } else {
                    jj0Var2.d(obj);
                }
            }
        });
        editText.setOnEditorActionListener(new TextView.OnEditorActionListener() { // from class: xsna.mrr0
            @Override // android.widget.TextView.OnEditorActionListener
            public final boolean onEditorAction(TextView textView, int i, KeyEvent keyEvent) {
                if (i != 6) {
                    return true;
                }
                nrr0 nrr0Var = nrr0.this;
                nrr0Var.l.i(drm0.p0(nrr0Var.n.getText().toString()).toString());
                return true;
            }
        });
        bwt0.i0(labelSettingsView, new pod0(this, 21));
        bwt0.i0(findViewById, new j6l0(this, 15));
        bwt0.i0(findViewById2, new bnc0(this, 20));
        bwt0.i0(findViewById3, new xvl0(this, 11));
        bwt0.i0(labelSettingsView2, new mdk0(this, 9));
        bwt0.i0(findViewById4, new sxl0(this, 7));
        bwt0.i0(findViewById5, new kvm0(this, 10));
        bwt0.i0(labelSettingsView3, new gsq0(this, 1));
        bwt0.i0(labelSettingsView4, new skj0(this, 8));
        bwt0.i0(labelSettingsView5, new gyo0(this, 2));
        bwt0.i0(labelSettingsView7, new vyq0(this, 1));
        labelSettingsView6.setIcon(krv0.e(com.vkontakte.android.R.drawable.vk_icon_donut_outline_28, this.itemView.getContext()));
    }

    @Override // xsna.kqr0
    public final void i6(yyb.b bVar) {
        ProfilesSimpleInfo profilesSimpleInfo;
        int i;
        String string;
        String string2;
        String string3;
        ChatSettings Hb;
        Dialog dialog = bVar.b;
        ProfilesInfo profilesInfo = bVar.e;
        String str = bVar.d;
        ChatSettings Hb2 = dialog.Hb();
        Resources resources = this.itemView.getResources();
        this.I = Hb2.b;
        bwt0.p0(this.B, dialog.sc());
        bwt0.p0(this.C, dialog.o1());
        AvatarView avatarView = this.m;
        if (profilesInfo != null) {
            avatarView.getClass();
            profilesSimpleInfo = profilesInfo.Ob();
        } else {
            profilesSimpleInfo = null;
        }
        avatarView.X0(dialog, profilesSimpleInfo);
        boolean z = Hb2.o;
        avatarView.setEnabled(z);
        if (str == null) {
            str = Hb2.b;
        }
        EditText editText = this.n;
        int selectionStart = editText.getSelectionStart();
        int min = Math.min(selectionStart, str.length());
        editText.setText(str);
        editText.setEnabled(z);
        boolean z2 = false;
        if ((selectionStart != editText.getSelectionStart() || this.J) && z) {
            if (this.J) {
                this.J = false;
                editText.setSelection(editText.getText().length());
                editText.clearFocus();
            } else {
                editText.setSelection(min);
            }
        }
        boolean qc = dialog.qc();
        LabelSettingsView labelSettingsView = this.p;
        bwt0.p0(labelSettingsView, qc);
        Context context = this.itemView.getContext();
        if (dialog.tc()) {
            i = com.vkontakte.android.R.string.vkim_dialog_attaches_open_channel;
        } else {
            if (!dialog.uc()) {
                throw new IllegalStateException("dialog should be chat or channel");
            }
            i = com.vkontakte.android.R.string.vkim_dialog_attaches_open_chat;
        }
        labelSettingsView.setTitle(context.getString(i));
        xuo0.a.getClass();
        boolean Ac = dialog.Ac(xuo0.a());
        SwitchSettingsView switchSettingsView = this.o;
        switchSettingsView.setOnCheckListener(null);
        switchSettingsView.setChecked(Ac);
        switchSettingsView.setOnCheckListener(this.D);
        PinnedMsg dc = dialog.dc();
        View view = this.s;
        if (dc != null) {
            bwt0.p0(view, true);
            Peer peer = dc.d;
            qcy<Object>[] qcyVarArr = DisplayNameFormatter.d;
            this.t.setText(this.G.a(peer, profilesInfo, DisplayNameFormatter.NameOrder.START_WITH_FIRSTNAME));
            this.u.setText(this.H.a(dc));
        } else {
            bwt0.p0(view, false);
        }
        ChatSettings Hb3 = dialog.Hb();
        bwt0.p0(switchSettingsView, Hb3 != null && Hb3.Q);
        bwt0.p0(this.w, dialog.tc());
        boolean tc = dialog.tc();
        if (tc) {
            string = this.itemView.getContext().getString(com.vkontakte.android.R.string.vkim_channel_invite_link);
        } else {
            if (tc) {
                throw new NoWhenBranchMatchedException();
            }
            string = this.itemView.getContext().getString(com.vkontakte.android.R.string.vkim_chat_invite_link);
        }
        LabelSettingsView labelSettingsView2 = this.v;
        labelSettingsView2.setTitle(string);
        bwt0.p0(labelSettingsView2, Hb2.v);
        boolean tc2 = dialog.tc();
        if (tc2) {
            string2 = this.itemView.getContext().getString(com.vkontakte.android.R.string.vkim_channel_settings_return);
        } else {
            if (tc2) {
                throw new NoWhenBranchMatchedException();
            }
            string2 = this.itemView.getContext().getString(com.vkontakte.android.R.string.vkim_chat_settings_members_return);
        }
        LabelSettingsView labelSettingsView3 = this.y;
        labelSettingsView3.setTitle(string2);
        ChatSettings Hb4 = dialog.Hb();
        bwt0.p0(labelSettingsView3, Hb4 != null && Hb4.S);
        boolean tc3 = dialog.tc();
        if (tc3) {
            string3 = this.itemView.getContext().getString(com.vkontakte.android.R.string.vkim_channel_settings_leave);
        } else {
            if (tc3) {
                throw new NoWhenBranchMatchedException();
            }
            string3 = this.itemView.getContext().getString(com.vkontakte.android.R.string.vkim_chat_settings_members_leave);
        }
        LabelSettingsView labelSettingsView4 = this.z;
        labelSettingsView4.setTitle(string3);
        ChatSettings Hb5 = dialog.Hb();
        bwt0.p0(labelSettingsView4, Hb5 != null && Hb5.R);
        bwt0.p0(this.A, !dialog.tc() && dialog.Cb() && (Hb = dialog.Hb()) != null && Hb.R);
        boolean f = myc0.f(Hb2.A);
        LabelSettingsView labelSettingsView5 = this.E;
        if (f) {
            bwt0.p0(labelSettingsView5, true);
            labelSettingsView5.setTitle(resources.getString(com.vkontakte.android.R.string.vkim_chat_settings_open_casper_chat));
            bwt0.i0(labelSettingsView5, new p0p0(1, this, Hb2));
        } else {
            bwt0.p0(labelSettingsView5, bVar.f);
            labelSettingsView5.setTitle(resources.getString(com.vkontakte.android.R.string.vkim_chat_settings_create_casper_chat));
            bwt0.i0(labelSettingsView5, new kyq0(this, 3));
        }
        bwt0.p0(this.F, (!Hb2.P || Hb2.h || Hb2.B == null) ? false : true);
        Serializer.c<Peer> cVar = Peer.CREATOR;
        boolean z3 = (epx.f(dialog.Zb(), new Peer.User(100L)) || dialog.sc()) ? false : true;
        if (Hb2.T && z3 && bVar.g) {
            z2 = true;
        }
        bwt0.p0(this.r, z2);
    }
}
