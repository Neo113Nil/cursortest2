package xsna;

import android.content.Context;
import android.graphics.Typeface;
import android.view.View;
import android.widget.TextView;
import androidx.appcompat.widget.AppCompatTextView;
import com.vkontakte.android.R;

/* compiled from: EmojiHeaderHolder.java */
/* loaded from: classes18.dex */
public final class idp extends kdp {
    public final TextView l;

    /* compiled from: EmojiHeaderHolder.java */
    public class a extends AppCompatTextView {
        public final /* synthetic */ Context b;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public a(Context context, Context context2) {
            super(context);
            this.b = context2;
        }

        @Override // androidx.appcompat.widget.AppCompatTextView, android.widget.TextView, android.view.View
        public final void onMeasure(int i, int i2) {
            super.onMeasure(i, View.MeasureSpec.makeMeasureSpec((int) this.b.getResources().getDimension(R.dimen.vk_emoji_keyboard_header_height), 1073741824));
        }
    }

    public idp(Context context, Typeface typeface) {
        super(new a(context, context));
        TextView textView = (TextView) this.itemView;
        this.l = textView;
        textView.setLetterSpacing(0.05f);
        textView.setPadding((int) k46.a(context, 12.0f), 0, 0, (int) k46.a(context, 5.0f));
        textView.setTextSize(12.0f);
        textView.setAllCaps(true);
        textView.setTextColor(krv0.m(R.attr.vk_ui_text_secondary, context));
        textView.setGravity(83);
        if (typeface != null) {
            textView.setTypeface(typeface);
        } else {
            textView.setTypeface(null, 1);
        }
    }
}
