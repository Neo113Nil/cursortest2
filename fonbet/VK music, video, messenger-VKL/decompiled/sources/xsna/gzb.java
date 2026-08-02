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
import com.vkontakte.android.R;
import xsna.e3m;
import xsna.gzb;
import xsna.vwb;

/* compiled from: ChatTitleAndAvatarDelegateOld.kt */
/* loaded from: classes2.dex */
public final class gzb extends p1u0<vwb.d> {
    public final xwb a;
    public final ucp b;

    /* compiled from: ChatTitleAndAvatarDelegateOld.kt */
    public static final class a extends vfz<vwb.d> {
        public final ucp l;
        public final hzb m;
        public final AvatarView n;
        public final EditText o;
        public boolean p;
        public boolean q;

        public a(View view, ucp ucpVar, xwb xwbVar) {
            super(view);
            this.l = ucpVar;
            this.m = xwbVar;
            AvatarView avatarView = (AvatarView) this.itemView.findViewById(R.id.vkim_chat_profile_title_and_avatar_item__avatar_view);
            this.n = avatarView;
            EditText editText = (EditText) this.itemView.findViewById(R.id.vkim_chat_profile_title_and_avatar_item__title_edittext);
            this.o = editText;
            this.p = true;
            this.q = true;
            bwt0.i0(avatarView, new iz(this, 19));
            editText.addTextChangedListener(new fzb(this));
            editText.setOnEditorActionListener(new TextView.OnEditorActionListener() { // from class: xsna.ezb
                @Override // android.widget.TextView.OnEditorActionListener
                public final boolean onEditorAction(TextView textView, int i, KeyEvent keyEvent) {
                    if (i != 6) {
                        return true;
                    }
                    mhy.d(gzb.a.this.o);
                    return true;
                }
            });
        }

        @Override // xsna.vfz
        public final void W5(vwb.d dVar) {
            Drawable drawable;
            vwb.d dVar2 = dVar;
            String str = dVar2.b;
            boolean z = dVar2.c;
            EditText editText = this.o;
            int selectionStart = editText.getSelectionStart();
            int min = Math.min(selectionStart, str.length());
            this.q = false;
            editText.setText(str);
            this.q = true;
            editText.setEnabled(z);
            if ((selectionStart != editText.getSelectionStart() || this.p) && z) {
                if (this.p) {
                    this.p = false;
                    editText.setSelection(editText.getText().length());
                    editText.clearFocus();
                } else {
                    editText.setSelection(min);
                }
            }
            ImageList imageList = dVar2.d;
            Drawable drawable2 = dVar2.e;
            AvatarView avatarView = this.n;
            avatarView.T0(imageList, drawable2);
            avatarView.setEnabled(z);
            if (z) {
                Context context = this.itemView.getContext();
                e3m.a aVar = e3m.a;
                drawable = m33.a(R.drawable.vkim_chat_profile_change_avatar_foreground, context);
            } else {
                drawable = null;
            }
            avatarView.setForeground(drawable);
        }
    }

    public gzb(xwb xwbVar) {
        ucp ucpVar = ucp.a;
        this.a = xwbVar;
        this.b = ucpVar;
    }

    @Override // xsna.p1u0
    public final vfz<? extends vwb.d> b(ViewGroup viewGroup) {
        return new a(s3j0.b(viewGroup, R.layout.vkim_chat_control_title_and_avatar_item, viewGroup, false), this.b, this.a);
    }

    @Override // xsna.p1u0
    public final boolean c(hfz hfzVar) {
        return hfzVar instanceof vwb.d;
    }
}
