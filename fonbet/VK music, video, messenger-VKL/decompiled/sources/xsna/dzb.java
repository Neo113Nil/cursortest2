package xsna;

import android.content.Context;
import android.graphics.drawable.Drawable;
import android.text.Editable;
import android.view.KeyEvent;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import androidx.appcompat.widget.AppCompatEditText;
import com.vk.core.view.components.picture.VkPictureOverlay;
import com.vk.dto.common.im.ImageList;
import com.vk.im.ui.views.avatars.VkImAvatar;
import com.vkontakte.android.R;
import xsna.dzb;
import xsna.e3m;
import xsna.vwb;

/* compiled from: ChatTitleAndAvatarDelegate.kt */
/* loaded from: classes2.dex */
public final class dzb extends p1u0<vwb.d> {
    public final xwb a;
    public final ucp b;

    /* compiled from: ChatTitleAndAvatarDelegate.kt */
    public static final class a extends vfz<vwb.d> {
        public final ucp l;
        public final hzb m;
        public final VkImAvatar n;
        public final AppCompatEditText o;
        public boolean p;
        public boolean q;

        public a(View view, ucp ucpVar, xwb xwbVar) {
            super(view);
            this.l = ucpVar;
            this.m = xwbVar;
            VkImAvatar vkImAvatar = (VkImAvatar) this.itemView.findViewById(R.id.avatar);
            this.n = vkImAvatar;
            AppCompatEditText appCompatEditText = (AppCompatEditText) this.itemView.findViewById(R.id.vkim_chat_title_edittext);
            this.o = appCompatEditText;
            this.p = true;
            this.q = true;
            bwt0.i0(vkImAvatar, new mb(this, 23));
            appCompatEditText.addTextChangedListener(new czb(this));
            appCompatEditText.setOnEditorActionListener(new TextView.OnEditorActionListener() { // from class: xsna.bzb
                @Override // android.widget.TextView.OnEditorActionListener
                public final boolean onEditorAction(TextView textView, int i, KeyEvent keyEvent) {
                    if (i != 6) {
                        return true;
                    }
                    mhy.d(dzb.a.this.o);
                    return true;
                }
            });
            vkImAvatar.setOverlay(new VkPictureOverlay(R.drawable.vk_icon_camera_outline_28, Integer.valueOf(R.attr.vk_ui_icon_contrast), VkPictureOverlay.Tint.MatchAppTheme));
        }

        @Override // xsna.vfz
        public final void W5(vwb.d dVar) {
            Drawable drawable;
            vwb.d dVar2 = dVar;
            String str = dVar2.b;
            boolean z = dVar2.c;
            AppCompatEditText appCompatEditText = this.o;
            int selectionStart = appCompatEditText.getSelectionStart();
            int min = Math.min(selectionStart, str.length());
            this.q = false;
            appCompatEditText.setText(str);
            this.q = true;
            appCompatEditText.setEnabled(z);
            if ((selectionStart != appCompatEditText.getSelectionStart() || this.p) && z) {
                if (this.p) {
                    this.p = false;
                    Editable text = appCompatEditText.getText();
                    if (text != null) {
                        appCompatEditText.setSelection(text.length());
                    }
                    appCompatEditText.clearFocus();
                } else {
                    appCompatEditText.setSelection(min);
                }
            }
            ImageList imageList = dVar2.d;
            Drawable drawable2 = dVar2.e;
            qcy<Object>[] qcyVarArr = VkImAvatar.z;
            VkImAvatar vkImAvatar = this.n;
            vkImAvatar.Z0(imageList, drawable2);
            vkImAvatar.setEnabled(z);
            if (z) {
                Context context = this.itemView.getContext();
                e3m.a aVar = e3m.a;
                drawable = m33.a(R.drawable.vkim_chat_profile_change_avatar_foreground, context);
            } else {
                drawable = null;
            }
            vkImAvatar.setForeground(drawable);
        }
    }

    public dzb(xwb xwbVar) {
        ucp ucpVar = ucp.a;
        this.a = xwbVar;
        this.b = ucpVar;
    }

    @Override // xsna.p1u0
    public final vfz<? extends vwb.d> b(ViewGroup viewGroup) {
        return new a(s3j0.b(viewGroup, R.layout.vkim_chat_control_title_and_avatar_item_new, viewGroup, false), this.b, this.a);
    }

    @Override // xsna.p1u0
    public final boolean c(hfz hfzVar) {
        return hfzVar instanceof vwb.d;
    }
}
