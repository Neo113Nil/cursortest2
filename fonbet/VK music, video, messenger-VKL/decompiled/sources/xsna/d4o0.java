package xsna;

import android.content.Context;
import android.view.View;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import com.vk.core.serialize.Serializer;
import com.vk.dto.common.im.ImageList;
import com.vk.im.ui.views.avatars.AvatarView;
import com.vk.sharing.api.dto.Target;
import com.vkontakte.android.R;

/* compiled from: TargetView.java */
/* loaded from: classes5.dex */
public final class d4o0 extends FrameLayout implements g4o0 {

    @NonNull
    public final AvatarView b;

    @NonNull
    public final View c;

    @NonNull
    public final TextView d;
    public final ImageView e;

    @NonNull
    public final cz9 f;

    @Nullable
    public Target g;

    public d4o0(@NonNull Context context) {
        super(context, null, 0);
        setBackgroundResource(R.drawable.rounded_list_selector);
        View.inflate(context, R.layout.layout_share_target_view, this);
        this.f = new cz9(context, R.drawable.vk_icon_ghost_12, iah0.a(1.5f), iah0.a(3.0f));
        this.c = getChildAt(1);
        this.b = (AvatarView) getChildAt(0);
        this.e = (ImageView) getChildAt(2);
        TextView textView = (TextView) getChildAt(3);
        this.d = textView;
        textView.setTextColor(anj.b(R.color.sharing_label_text, context));
    }

    @Override // xsna.g4o0
    @Nullable
    public Target getTarget() {
        return this.g;
    }

    @Override // android.widget.FrameLayout, android.view.View
    public final void onMeasure(int i, int i2) {
        super.onMeasure(View.MeasureSpec.makeMeasureSpec(getResources().getDimensionPixelSize(R.dimen.sharing_target_width), 1073741824), View.MeasureSpec.makeMeasureSpec(getResources().getDimensionPixelSize(R.dimen.sharing_target_height), 1073741824));
    }

    public void setIconContentDescription(String str) {
        this.b.setContentDescription(str);
    }

    @Override // xsna.g4o0
    public void setTarget(@Nullable Target target) {
        AvatarView avatarView = this.b;
        TextView textView = this.d;
        ImageView imageView = this.e;
        if (target != null) {
            String str = target.f;
            avatarView.getClass();
            Serializer.c<ImageList> cVar = ImageList.CREATOR;
            avatarView.T0(ImageList.a.c(-1, -1, str), null);
            textView.setText(target.d);
            setContentDescription(target.d);
            textView.setSelected(target.g);
            boolean z = target.g;
            View view = this.c;
            if (z) {
                imageView.setImageResource(R.drawable.ic_check_circle_composite_24_full);
                imageView.setVisibility(0);
                view.setVisibility(0);
            } else {
                imageView.setImageResource(R.drawable.ic_casper_chat_icon_22);
                imageView.setVisibility(target.n ? 0 : 4);
                view.setVisibility(4);
            }
            this.f.getDrawable(1).setTint(target.o);
            if (target.zb()) {
                setAlpha(1.0f);
            } else {
                setAlpha(0.5f);
            }
        } else {
            avatarView.U0();
            textView.setText((CharSequence) null);
            setContentDescription(null);
            avatarView.setSelected(false);
            textView.setSelected(false);
            imageView.setVisibility(4);
        }
        this.g = target;
    }
}
