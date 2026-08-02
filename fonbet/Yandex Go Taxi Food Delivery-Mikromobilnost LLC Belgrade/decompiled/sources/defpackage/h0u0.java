package defpackage;

import android.content.Context;
import android.text.TextUtils;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import androidx.constraintlayout.widget.ConstraintLayout;
import com.yandex.dsl.views.layouts.constraint.ConstraintSetBuilder;
import com.yandex.dsl.views.layouts.constraint.b;
import com.yandex.messaging.internal.avatar.AvatarImageView;
import com.yandex.messaging.ui.starred.StarredListItemUi$special$$inlined$textView$default$1;
import com.yandex.messaging.ui.starred.StarredListItemUi$special$$inlined$view$default$1;
import com.yandex.messaging.ui.starred.StarredListItemUi$special$$inlined$view$default$2;
import com.yandex.messaging.ui.starred.StarredListItemUi$special$$inlined$view$default$3;
import com.yandex.messaging.views.AppCompatEmojiTextView;

/* loaded from: classes15.dex */
public final class h0u0 extends b {
    public final AvatarImageView w;
    public final AppCompatEmojiTextView x;
    public final TextView y;
    public final AppCompatEmojiTextView z;

    public h0u0(Context context) {
        super(context);
        int generateViewId = View.generateViewId();
        View view = (View) StarredListItemUi$special$$inlined$view$default$1.b.invoke(jh91.e(w0i0.Messaging_ChatListAvatarView, this.a), 0, 0);
        if (generateViewId != -1) {
            view.setId(generateViewId);
        }
        addToParent(view);
        this.w = (AvatarImageView) view;
        int i = e9h0.starred_list_item_title;
        View view2 = (View) StarredListItemUi$special$$inlined$view$default$2.b.invoke(jh91.e(w0i0.Messaging_ChatListItemTitle, this.a), 0, 0);
        if (i != -1) {
            view2.setId(i);
        }
        addToParent(view2);
        AppCompatEmojiTextView appCompatEmojiTextView = (AppCompatEmojiTextView) view2;
        TextUtils.TruncateAt truncateAt = TextUtils.TruncateAt.END;
        appCompatEmojiTextView.setEllipsize(truncateAt);
        appCompatEmojiTextView.setMaxLines(1);
        this.x = appCompatEmojiTextView;
        int generateViewId2 = View.generateViewId();
        View view3 = (View) StarredListItemUi$special$$inlined$textView$default$1.b.invoke(jh91.e(w0i0.Messaging_ChatListItemTime, this.a), 0, 0);
        if (generateViewId2 != -1) {
            view3.setId(generateViewId2);
        }
        addToParent(view3);
        this.y = (TextView) view3;
        int i2 = e9h0.starred_list_item_content;
        View view4 = (View) StarredListItemUi$special$$inlined$view$default$3.b.invoke(jh91.e(w0i0.Messaging_ChatListItemContent, this.a), 0, 0);
        if (i2 != -1) {
            view4.setId(i2);
        }
        addToParent(view4);
        AppCompatEmojiTextView appCompatEmojiTextView2 = (AppCompatEmojiTextView) view4;
        appCompatEmojiTextView2.setEllipsize(truncateAt);
        appCompatEmojiTextView2.setMaxLines(2);
        this.z = appCompatEmojiTextView2;
        ConstraintLayout root = getRoot();
        root.setBackgroundResource(wwg0.msg_bg_chat_list_item);
        root.setClickable(true);
        root.setFocusable(true);
        root.setMinimumHeight(kjs0.b(84));
        int b = kjs0.b(84);
        ViewGroup.LayoutParams layoutParams = root.getLayoutParams();
        root.setLayoutParams(layoutParams == null ? new ViewGroup.LayoutParams(-1, b) : layoutParams);
    }

    @Override // com.yandex.dsl.views.layouts.constraint.b
    public final void a(ConstraintSetBuilder constraintSetBuilder) {
        constraintSetBuilder.A(new f0u0(this, constraintSetBuilder), this.w);
        constraintSetBuilder.A(new g0u0(0, constraintSetBuilder), this.y);
        constraintSetBuilder.A(new f0u0(constraintSetBuilder, this, 1), this.x);
        constraintSetBuilder.A(new f0u0(constraintSetBuilder, this, 2), this.z);
    }
}
