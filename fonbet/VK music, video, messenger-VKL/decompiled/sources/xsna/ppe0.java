package xsna;

import android.annotation.SuppressLint;
import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.PaintFlagsDrawFilter;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import com.vk.core.serialize.Serializer;
import com.vk.dto.common.Image;
import com.vk.dto.common.id.UserId;
import com.vk.dto.newsfeed.Owner;
import com.vk.dto.stories.model.StoryOwner;
import com.vk.dto.stories.model.StoryQuestionAnswer;
import com.vk.imageloader.view.VKImageView;
import com.vk.superapp.api.dto.story.WebStickerType;
import com.vkontakte.android.R;
import xsna.nov;

/* compiled from: QuestionAnswerSticker.kt */
@SuppressLint({"ViewConstructor"})
/* loaded from: classes6.dex */
public final class ppe0 extends nxt0 implements upe0 {
    public final StoryQuestionAnswer f;
    public final Owner g;
    public final String h;
    public final UserId i;

    @SuppressLint({"InflateParams"})
    public final View j;
    public final float k;
    public final View l;
    public final View m;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ppe0(Context context, StoryQuestionAnswer storyQuestionAnswer, Owner owner, String str, UserId userId) {
        super(context);
        String str2 = storyQuestionAnswer.d;
        StoryOwner storyOwner = storyQuestionAnswer.g;
        Owner owner2 = storyQuestionAnswer.c;
        this.f = storyQuestionAnswer;
        this.g = owner;
        this.h = str;
        this.i = userId;
        String str3 = null;
        View inflate = LayoutInflater.from(context).inflate(R.layout.sticker_answer, (ViewGroup) null);
        this.j = inflate;
        this.k = (iah0.f().widthPixels * 0.8f) + inflate.getPaddingStart() + inflate.getPaddingEnd();
        setRemovable(false);
        addView(inflate);
        View findViewById = inflate.findViewById(R.id.sticker_answer_cl_question);
        tse0 tse0Var = new tse0();
        tse0Var.c = new int[]{-1, -1};
        tse0Var.a();
        tse0Var.invalidateSelf();
        float b = iah0.b(16.0f);
        if (tse0Var.e != b) {
            tse0Var.e = b;
            tse0Var.b();
            tse0Var.invalidateSelf();
        }
        if (!tse0Var.d) {
            tse0Var.d = true;
            tse0Var.invalidateSelf();
        }
        findViewById.setBackground(tse0Var);
        this.l = findViewById;
        View findViewById2 = inflate.findViewById(R.id.sticker_answer_cl_answer);
        tse0 tse0Var2 = new tse0();
        tse0Var2.c = new int[]{-1, -1};
        tse0Var2.a();
        tse0Var2.invalidateSelf();
        float b2 = iah0.b(16.0f);
        if (tse0Var2.e != b2) {
            tse0Var2.e = b2;
            tse0Var2.b();
            tse0Var2.invalidateSelf();
        }
        findViewById2.setBackground(tse0Var2);
        this.m = findViewById2;
        ((VKImageView) inflate.findViewById(R.id.sticker_answer_iv_author)).load(owner2 != null ? owner2.f((int) getResources().getDimension(R.dimen.sticker_answer_iv_author_size)) : null);
        if (storyOwner != null) {
            ((TextView) inflate.findViewById(R.id.sticker_answer_tv_author)).setText(storyOwner.Db());
            ((TextView) inflate.findViewById(R.id.sticker_answer_tv_question)).setText(str2);
        } else {
            ((TextView) inflate.findViewById(R.id.sticker_answer_tv_author)).setText(owner2 != null ? owner2.c : null);
            ((TextView) inflate.findViewById(R.id.sticker_answer_tv_question)).setText(str2);
        }
        if (owner == null || ((owner.d == null && owner.e == null && owner.g == null) || owner.c == null)) {
            ((VKImageView) inflate.findViewById(R.id.sticker_answer_iv_responder)).setImageResource(R.drawable.vk_icon_avatar_placeholder_anonim_150);
            ((TextView) inflate.findViewById(R.id.sticker_answer_tv_responder)).setText(y8g0.e(R.string.questions_anonymity_profile));
        } else {
            VKImageView vKImageView = (VKImageView) inflate.findViewById(R.id.sticker_answer_iv_responder);
            String str4 = owner.d;
            if (str4 == null) {
                Image image = owner.g;
                if (image != null) {
                    Serializer.c<Owner> cVar = Owner.CREATOR;
                    str3 = Owner.a.a((int) getResources().getDimension(R.dimen.sticker_answer_iv_author_size), image);
                }
                str4 = str3 == null ? owner.e : str3;
            }
            vKImageView.load(str4);
            ((TextView) inflate.findViewById(R.id.sticker_answer_tv_responder)).setText(owner.c);
        }
        ((TextView) inflate.findViewById(R.id.sticker_answer_tv_answer)).setText(storyQuestionAnswer.e);
        inflate.measure(View.MeasureSpec.makeMeasureSpec((int) getOriginalWidth(), 1073741824), View.MeasureSpec.makeMeasureSpec(View.MeasureSpec.getSize(iah0.f().heightPixels), Integer.MIN_VALUE));
    }

    @Override // xsna.nxt0, xsna.nov
    public final nov C0() {
        float f = getContext().getResources().getDisplayMetrics().density;
        Bitmap createBitmap = Bitmap.createBitmap((int) (getWidth() * f), (int) (getHeight() * f), Bitmap.Config.ARGB_8888);
        Canvas canvas = new Canvas(createBitmap);
        canvas.setDrawFilter(new PaintFlagsDrawFilter(0, 3));
        canvas.scale(f, f);
        draw(canvas);
        l0u0 l0u0Var = new l0u0(createBitmap, getMeasuredWidth() * 2, WebStickerType.PHOTO, "");
        l0u0Var.q = ppe0.class;
        l0u0Var.r = this;
        nov.a.b(this, l0u0Var);
        return l0u0Var;
    }

    @Override // xsna.nxt0, xsna.nov
    public final nov E0(nov novVar) {
        return super.E0(new ppe0(getContext(), this.f, this.g, this.h, this.i));
    }

    public final StoryQuestionAnswer getAnswer() {
        return this.f;
    }

    public final String getName() {
        return this.h;
    }

    @Override // xsna.nxt0, xsna.nov
    public float getOriginalHeight() {
        return this.j.getMeasuredHeight();
    }

    @Override // xsna.nxt0, xsna.nov
    public float getOriginalWidth() {
        return this.k;
    }

    public final Owner getResponder() {
        return this.g;
    }

    public final UserId getUid() {
        return this.i;
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void onLayout(boolean z, int i, int i2, int i3, int i4) {
        this.j.layout(i, i2, i3, i4);
    }
}
