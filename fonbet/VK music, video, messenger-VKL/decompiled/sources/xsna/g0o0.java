package xsna;

import android.content.Context;
import android.text.Spannable;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import com.vk.core.view.links.LinkedTextView;
import com.vk.dto.common.id.UserId;
import com.vk.dto.newsfeed.TagConfirmation;
import com.vk.dto.newsfeed.entries.Photos;
import com.vk.dto.user.UserProfile;
import com.vk.imageloader.view.VKCircleImageView;
import com.vk.typography.Font;
import com.vk.typography.FontFamily;
import com.vk.typography.TextSizeUnit;
import com.vk.typography.a;
import com.vkontakte.android.R;
import com.vkontakte.android.attachments.PhotoAttachment;
import kotlin.NoWhenBranchMatchedException;

/* compiled from: TagConfirmationHolder.kt */
/* loaded from: classes4.dex */
public final class g0o0 extends qi6<Photos> implements View.OnClickListener {
    public final VKCircleImageView C;
    public final LinkedTextView D;
    public final Button E;
    public final Button F;
    public Runnable G;
    public TagConfirmation H;

    public g0o0(ViewGroup viewGroup) {
        super(R.layout.post_item_confirm_tag, viewGroup);
        VKCircleImageView vKCircleImageView = (VKCircleImageView) this.itemView.findViewById(R.id.photo);
        this.C = vKCircleImageView;
        this.D = (LinkedTextView) this.itemView.findViewById(R.id.text);
        Button button = (Button) this.itemView.findViewById(R.id.accept);
        this.E = button;
        Button button2 = (Button) this.itemView.findViewById(R.id.reject);
        this.F = button2;
        vKCircleImageView.setOnClickListener(this);
        button.setOnClickListener(this);
        button2.setOnClickListener(this);
    }

    @Override // xsna.qi6
    public final void E6(Photos photos) {
        Spannable spannable;
        UserProfile userProfile;
        UserProfile userProfile2;
        TagConfirmation tagConfirmation = this.H;
        LinkedTextView linkedTextView = this.D;
        if (tagConfirmation == null || (userProfile2 = tagConfirmation.c) == null) {
            spannable = null;
        } else {
            StringBuilder sb = new StringBuilder("[id");
            sb.append(userProfile2.c);
            sb.append('|');
            spannable = (Spannable) hd60.a().b0(x6(userProfile2.K().booleanValue() ? R.string.user_tagged_you_f : R.string.user_tagged_you_m, ho8.a(sb, userProfile2.e, ']')));
            qaz[] qazVarArr = (qaz[]) spannable.getSpans(0, spannable.length(), qaz.class);
            if (qazVarArr != null && qazVarArr.length != 0) {
                Context context = this.itemView.getContext();
                FontFamily fontFamily = FontFamily.MEDIUM;
                float textSize = linkedTextView.getTextSize();
                int i = a.C1933a.C1934a.$EnumSwitchMapping$0[TextSizeUnit.PX.ordinal()];
                if (i != 1) {
                    if (i != 2) {
                        throw new NoWhenBranchMatchedException();
                    }
                    textSize = com.vk.typography.b.b(textSize);
                }
                spannable.setSpan(new qup0(cqi.a(Font.Companion, fontFamily, textSize, context)), spannable.getSpanStart(qazVarArr[0]), spannable.getSpanEnd(qazVarArr[0]), 0);
            }
        }
        linkedTextView.setText(spannable);
        this.C.o0((tagConfirmation == null || (userProfile = tagConfirmation.c) == null) ? null : userProfile.h, null);
    }

    public final void R6() {
        Runnable runnable = this.G;
        if (runnable != null) {
            runnable.run();
        }
        TagConfirmation tagConfirmation = this.H;
        if (tagConfirmation != null) {
            ysg0.b.a(new zaa0(-9000, tagConfirmation.b.f));
        }
    }

    @Override // xsna.qi6
    public final void a6(u1c0 u1c0Var) {
        Object obj = u1c0Var.g;
        this.H = obj instanceof TagConfirmation ? (TagConfirmation) obj : null;
        super.a6(u1c0Var);
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        TagConfirmation tagConfirmation;
        UserProfile userProfile;
        UserId userId;
        if (epx.f(view, this.C)) {
            TagConfirmation tagConfirmation2 = this.H;
            if (tagConfirmation2 == null || (userProfile = tagConfirmation2.c) == null || (userId = userProfile.c) == null) {
                return;
            }
            gd60.Z0(hd60.a(), this.itemView.getContext(), userId, null, null, 12);
            return;
        }
        if (epx.f(view, this.E)) {
            TagConfirmation tagConfirmation3 = this.H;
            if (tagConfirmation3 != null) {
                PhotoAttachment photoAttachment = tagConfirmation3.b;
                hg1.m(rsg0.y0(new nea0(photoAttachment.g, photoAttachment.f, tagConfirmation3.d), null, null, 3), this.itemView.getContext(), 0L, false, 62).subscribe(new n1r(new m360(this, 22), 26), new uu60(new i0b0(this, 20), 24));
                return;
            }
            return;
        }
        if (!epx.f(view, this.F) || (tagConfirmation = this.H) == null) {
            return;
        }
        PhotoAttachment photoAttachment2 = tagConfirmation.b;
        hg1.m(rsg0.y0(new is(photoAttachment2.g, photoAttachment2.f, tagConfirmation.d), null, null, 3), this.itemView.getContext(), 0L, false, 62).subscribe(new jw80(new emh0(this, 8), 17), new f0o0(new jan0(this, 1), 0));
    }
}
