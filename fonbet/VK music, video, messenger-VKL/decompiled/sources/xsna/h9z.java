package xsna;

import android.net.Uri;
import android.text.TextUtils;
import android.view.View;
import android.view.ViewGroup;
import com.vk.common.links.AwayLink;
import com.vk.dto.common.Attachment;
import com.vk.imageloader.view.VKImageView;
import com.vkontakte.android.R;
import com.vkontakte.android.attachments.LinkAttachment;
import kotlin.Result;

/* compiled from: LinkHolder.kt */
/* loaded from: classes4.dex */
public final class h9z extends ikg<LinkAttachment> implements View.OnLongClickListener {
    public h9z(ViewGroup viewGroup) {
        super(viewGroup);
        VKImageView vKImageView = this.D;
        qcy<Object>[] qcyVarArr = bwt0.a;
        dhr0.f0(R.drawable.white_oval, R.attr.vk_ui_background_secondary, vKImageView);
        this.itemView.setOnLongClickListener(this);
    }

    @Override // xsna.m56
    public final void T6(Attachment attachment) {
        Object failure;
        LinkAttachment linkAttachment = (LinkAttachment) attachment;
        AwayLink awayLink = linkAttachment.f;
        omw.d(this.D, R.drawable.vk_icon_link_24, R.attr.vk_ui_icon_medium);
        String str = linkAttachment.g;
        if (TextUtils.isEmpty(str)) {
            str = v6(R.string.attach_link);
        }
        this.E.setText(str);
        try {
            failure = Uri.parse(awayLink.b).getAuthority();
        } catch (Throwable th) {
            failure = new Result.Failure(th);
        }
        if (failure instanceof Result.Failure) {
            failure = null;
        }
        String str2 = (String) failure;
        if (str2 == null) {
            str2 = awayLink.b;
        }
        this.F.setText(str2);
    }

    @Override // xsna.m56, android.view.View.OnClickListener
    public final void onClick(View view) {
        if (view == null) {
            return;
        }
        W6(view);
    }

    @Override // android.view.View.OnLongClickListener
    public final boolean onLongClick(View view) {
        s980 s980Var;
        Attachment attachment = this.C;
        if (attachment == null || (s980Var = this.y) == null) {
            return false;
        }
        return s980Var.u9(view, J0(), q6(), attachment);
    }
}
