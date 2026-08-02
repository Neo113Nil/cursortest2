package xsna;

import android.content.Context;
import android.text.TextUtils;
import android.view.View;
import android.widget.LinearLayout;
import androidx.appcompat.widget.AppCompatTextView;
import com.vk.typography.FontFamily;
import com.vkontakte.android.R;
import kotlin.LazyThreadSafetyMode;
import xsna.e3m;

/* compiled from: VideoActionCompleteView.kt */
/* loaded from: classes2.dex */
public final class xwr0 extends quy<vwr0> {
    public final Object c;
    public final Object d;

    /* compiled from: VideoActionCompleteView.kt */
    public static final class a {
        public final String a;
        public final View.OnClickListener b;

        public a(String str, View.OnClickListener onClickListener) {
            this.a = str;
            this.b = onClickListener;
        }
    }

    public xwr0(Context context) {
        super(context, null, 0);
        b990 b990Var = new b990(this, 27);
        LazyThreadSafetyMode lazyThreadSafetyMode = LazyThreadSafetyMode.NONE;
        this.c = msy.a(lazyThreadSafetyMode, b990Var);
        this.d = msy.a(lazyThreadSafetyMode, new acp0(this, 3));
        setOrientation(1);
        setGravity(17);
        this.b.getClass();
        if (vsy.d()) {
            b();
        }
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, kotlin.Lazy] */
    private final AppCompatTextView getVideoActionView() {
        return (AppCompatTextView) this.c.getValue();
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, kotlin.Lazy] */
    private final AppCompatTextView getVideoPlayAgainView() {
        return (AppCompatTextView) this.d.getValue();
    }

    @Override // xsna.quy
    public final void b() {
        AppCompatTextView appCompatTextView = new AppCompatTextView(getContext());
        appCompatTextView.setId(R.id.video_complete_action);
        float f = 186;
        float f2 = 30;
        appCompatTextView.setLayoutParams(new LinearLayout.LayoutParams(iah0.a(f), iah0.a(f2)));
        Context context = appCompatTextView.getContext();
        e3m.a aVar = e3m.a;
        appCompatTextView.setBackground(m33.a(R.drawable.btn_white_8dp, context));
        appCompatTextView.setTextColor(appCompatTextView.getContext().getColor(R.color.vk_gray_800));
        FontFamily fontFamily = FontFamily.MEDIUM;
        Float valueOf = Float.valueOf(14.0f);
        com.vk.typography.b.k(appCompatTextView, fontFamily, valueOf, 4);
        appCompatTextView.setGravity(17);
        TextUtils.TruncateAt truncateAt = TextUtils.TruncateAt.END;
        appCompatTextView.setEllipsize(truncateAt);
        float f3 = 16;
        float f4 = 5;
        appCompatTextView.setPadding(iah0.a(f3), iah0.a(f4), iah0.a(f3), iah0.a(f4));
        addView(appCompatTextView);
        AppCompatTextView appCompatTextView2 = new AppCompatTextView(getContext());
        appCompatTextView2.setId(R.id.video_play_again);
        LinearLayout.LayoutParams layoutParams = new LinearLayout.LayoutParams(iah0.a(f), iah0.a(f2));
        layoutParams.setMargins(0, iah0.a(12), 0, 0);
        appCompatTextView2.setLayoutParams(layoutParams);
        appCompatTextView2.setText(appCompatTextView2.getContext().getString(R.string.video_replay_view_text));
        appCompatTextView2.setBackground(m33.a(R.drawable.video_snippet_button_8, appCompatTextView2.getContext()));
        appCompatTextView2.setTextColor(appCompatTextView2.getContext().getColor(R.color.vk_white));
        com.vk.typography.b.k(appCompatTextView2, fontFamily, valueOf, 4);
        appCompatTextView2.setGravity(17);
        appCompatTextView2.setEllipsize(truncateAt);
        appCompatTextView2.setPadding(iah0.a(f3), iah0.a(f4), iah0.a(f3), iah0.a(f4));
        addView(appCompatTextView2);
    }

    @Override // xsna.quy
    public final void c(vwr0 vwr0Var) {
        a c = vwr0Var.c();
        String str = c.a;
        View.OnClickListener onClickListener = c.b;
        getVideoActionView().setText(str);
        getVideoActionView().setOnClickListener(onClickListener);
        getVideoPlayAgainView().setOnClickListener(onClickListener);
    }
}
