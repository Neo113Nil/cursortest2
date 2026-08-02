package xsna;

import android.content.Context;
import android.view.View;
import androidx.appcompat.widget.AppCompatTextView;

/* compiled from: VkCellTextViewHolder.kt */
/* loaded from: classes17.dex */
public interface ziu0 {

    /* compiled from: VkCellTextViewHolder.kt */
    public static final class a implements ziu0 {
        public final AppCompatTextView b;
        public final AppCompatTextView c;

        public a(Context context) {
            AppCompatTextView appCompatTextView = new AppCompatTextView(context);
            this.b = appCompatTextView;
            this.c = appCompatTextView;
        }

        @Override // xsna.ziu0
        public final AppCompatTextView a() {
            return this.b;
        }

        @Override // xsna.ziu0
        public final View getView() {
            return this.c;
        }

        @Override // xsna.ziu0
        public final void setText(CharSequence charSequence) {
            this.b.setText(charSequence);
        }
    }

    AppCompatTextView a();

    View getView();

    void setText(CharSequence charSequence);
}
