package xsna;

import android.view.View;
import android.view.ViewGroup;
import com.vk.dto.common.Attachment;
import com.vk.imageloader.view.VKImageView;
import com.vkontakte.android.R;
import com.vkontakte.android.attachments.NoteAttachment;

/* compiled from: NoteHolder.kt */
/* loaded from: classes4.dex */
public final class h770 extends ikg<NoteAttachment> {
    public h770(ViewGroup viewGroup) {
        super(viewGroup);
        VKImageView vKImageView = this.D;
        qcy<Object>[] qcyVarArr = bwt0.a;
        dhr0.f0(R.drawable.white_oval, R.attr.vk_ui_background_secondary, vKImageView);
    }

    @Override // xsna.m56
    public final void T6(Attachment attachment) {
        omw.d(this.D, R.drawable.vk_icon_note_24, R.attr.vk_ui_icon_medium);
        this.E.setText(((NoteAttachment) attachment).f);
        this.F.setText(R.string.attach_note);
    }

    @Override // xsna.m56, android.view.View.OnClickListener
    public final void onClick(View view) {
        if (view == null) {
            return;
        }
        W6(view);
    }
}
