package xsna;

import android.text.Annotation;
import android.text.SpannableStringBuilder;
import android.text.SpannedString;
import android.view.ViewGroup;
import androidx.recyclerview.widget.RecyclerView;
import androidx.recyclerview.widget.m;
import com.vk.censoredsettings.presentation.obscenetext.ObsceneTextFilterFragment;
import com.vk.core.view.components.text.VkText;
import com.vkontakte.android.R;
import java.util.NoSuchElementException;

/* compiled from: ObsceneTextFilterAdapter.kt */
/* loaded from: classes16.dex */
public final class eq70 extends androidx.recyclerview.widget.x<zif0, j2j0<?>> {
    public ObsceneTextFilterFragment.b c;

    /* compiled from: ObsceneTextFilterAdapter.kt */
    public static final class a extends m.e<zif0> {
        public final Object a = new Object();

        @Override // androidx.recyclerview.widget.m.e
        public final boolean areContentsTheSame(zif0 zif0Var, zif0 zif0Var2) {
            return zif0Var.equals(zif0Var2);
        }

        @Override // androidx.recyclerview.widget.m.e
        public final boolean areItemsTheSame(zif0 zif0Var, zif0 zif0Var2) {
            return zif0Var.a() == zif0Var2.a();
        }

        @Override // androidx.recyclerview.widget.m.e
        public final Object getChangePayload(zif0 zif0Var, zif0 zif0Var2) {
            return this.a;
        }
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    public final int getItemViewType(int i) {
        return getCurrentList().get(i).b();
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    public final void onBindViewHolder(RecyclerView.e0 e0Var, int i) {
        j2j0 j2j0Var = (j2j0) e0Var;
        j2j0Var.V5(getCurrentList().get(i));
        j2j0Var.n = this.c;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    public final RecyclerView.e0 onCreateViewHolder(ViewGroup viewGroup, int i) {
        if (i == 0) {
            return new fnn0(viewGroup);
        }
        if (i == 1) {
            return new rr9(viewGroup);
        }
        if (i != 2) {
            throw new IllegalStateException(lhg.a(i, "Unknown viewType = "));
        }
        int i2 = 0;
        gq70 gq70Var = new gq70(viewGroup, R.layout.holder_obscene_text_preview, 0);
        VkText vkText = (VkText) gq70Var.itemView.findViewById(R.id.date);
        VkText vkText2 = (VkText) gq70Var.itemView.findViewById(R.id.description);
        vkText.setText(pvo0.h(pvo0.a(), null, false, false, false, true, false, false, true));
        CharSequence text = gq70Var.itemView.getContext().getText(R.string.censored_sett_example);
        SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder(text);
        if (text instanceof SpannedString) {
            SpannedString spannedString = (SpannedString) text;
            Annotation[] annotationArr = (Annotation[]) spannedString.getSpans(0, spannedString.length(), Annotation.class);
            while (i2 < annotationArr.length) {
                int i3 = i2 + 1;
                try {
                    Annotation annotation = annotationArr[i2];
                    if (epx.f(annotation.getValue(), "censored")) {
                        spannableStringBuilder.setSpan(new m7s(R.attr.vk_ui_text_secondary), spannedString.getSpanStart(annotation), spannedString.getSpanEnd(annotation), 33);
                    }
                    i2 = i3;
                } catch (ArrayIndexOutOfBoundsException e) {
                    throw new NoSuchElementException(e.getMessage());
                }
            }
        }
        vkText2.setText(spannableStringBuilder);
        return gq70Var;
    }
}
