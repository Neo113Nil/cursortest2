package xsna;

import android.content.Context;
import android.graphics.drawable.Drawable;
import android.view.KeyEvent;
import android.view.View;
import android.view.ViewGroup;
import android.widget.EditText;
import android.widget.TextView;
import com.vk.dto.common.im.ImageList;
import com.vk.im.ui.views.avatars.AvatarView;
import com.vk.im.ui.views.settings.MaterialSwitchSettingsView;
import com.vkontakte.android.R;
import xsna.e3m;
import xsna.kcb;
import xsna.vwb;

/* compiled from: ChannelSettingsDelegate.kt */
/* loaded from: classes2.dex */
public final class kcb extends p1u0<vwb.a> {
    public final xwb a;
    public final ucp b;

    public kcb(xwb xwbVar) {
        ucp ucpVar = ucp.a;
        this.a = xwbVar;
        this.b = ucpVar;
    }

    @Override // xsna.p1u0
    public final vfz<? extends vwb.a> b(ViewGroup viewGroup) {
        return new a(s3j0.b(viewGroup, R.layout.vkim_channel_settings_item, viewGroup, false), this.b, this.a);
    }

    @Override // xsna.p1u0
    public final boolean c(hfz hfzVar) {
        return hfzVar instanceof vwb.a;
    }

    /* compiled from: ChannelSettingsDelegate.kt */
    public static final class a extends vfz<vwb.a> {
        public final ucp l;
        public final InterfaceC3174a m;
        public final AvatarView n;
        public final EditText o;
        public final EditText p;
        public final MaterialSwitchSettingsView q;
        public boolean r;
        public boolean s;

        public a(View view, ucp ucpVar, xwb xwbVar) {
            super(view);
            this.l = ucpVar;
            this.m = xwbVar;
            AvatarView avatarView = (AvatarView) this.itemView.findViewById(R.id.vkim_channel_title_avatar_description_item__avatar_view);
            this.n = avatarView;
            EditText editText = (EditText) this.itemView.findViewById(R.id.vkim_channel_settings_item__title_edittext);
            this.o = editText;
            EditText editText2 = (EditText) this.itemView.findViewById(R.id.vkim_channel_settings_item__description_edittext);
            this.p = editText2;
            MaterialSwitchSettingsView materialSwitchSettingsView = (MaterialSwitchSettingsView) this.itemView.findViewById(R.id.messages_settings_container);
            this.q = materialSwitchSettingsView;
            this.r = true;
            this.s = true;
            bwt0.i0(avatarView, new d7(this, 17));
            editText.setBackground(xus.g(this.itemView.getContext()));
            editText2.setBackground(xus.g(this.itemView.getContext()));
            editText.addTextChangedListener(new icb(this));
            editText.setOnEditorActionListener(new fcb(this, 0));
            editText2.addTextChangedListener(new jcb(this));
            editText2.setOnEditorActionListener(new TextView.OnEditorActionListener() { // from class: xsna.gcb
                @Override // android.widget.TextView.OnEditorActionListener
                public final boolean onEditorAction(TextView textView, int i, KeyEvent keyEvent) {
                    if (i != 6) {
                        return true;
                    }
                    mhy.d(kcb.a.this.p);
                    return true;
                }
            });
            editText2.setOnTouchListener(new hcb());
            materialSwitchSettingsView.setListener(new h7(this, 8));
        }

        @Override // xsna.vfz
        public final void W5(vwb.a aVar) {
            vwb.a aVar2 = aVar;
            String str = aVar2.b;
            boolean z = aVar2.e;
            EditText editText = this.o;
            int selectionStart = editText.getSelectionStart();
            int min = Math.min(selectionStart, str.length());
            this.s = false;
            editText.setText(str);
            this.s = true;
            editText.setEnabled(z);
            if ((selectionStart != editText.getSelectionStart() || this.r) && z) {
                if (this.r) {
                    this.r = false;
                    editText.setSelection(editText.getText().length());
                    editText.clearFocus();
                } else {
                    editText.setSelection(min);
                }
            }
            this.s = false;
            String str2 = aVar2.c;
            EditText editText2 = this.p;
            editText2.setText(str2);
            this.s = true;
            editText2.setEnabled(z);
            ImageList imageList = aVar2.f;
            AvatarView avatarView = this.n;
            Drawable drawable = null;
            avatarView.T0(imageList, null);
            avatarView.setEnabled(z);
            if (z) {
                Context context = this.itemView.getContext();
                e3m.a aVar3 = e3m.a;
                drawable = m33.a(R.drawable.vkim_chat_profile_change_avatar_foreground, context);
            }
            avatarView.setForeground(drawable);
            this.s = false;
            this.q.setChecked(aVar2.d);
            this.s = true;
        }

        /* compiled from: ChannelSettingsDelegate.kt */
        /* renamed from: xsna.kcb$a$a, reason: collision with other inner class name */
        public interface InterfaceC3174a {
            void f();

            void g(String str);

            default void R(boolean z) {
            }

            default void q0(String str) {
            }
        }
    }
}
