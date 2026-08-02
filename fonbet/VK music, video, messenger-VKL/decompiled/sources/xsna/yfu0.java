package xsna;

import android.annotation.SuppressLint;
import android.content.Context;
import android.view.View;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.TextView;
import com.vkontakte.android.R;

/* compiled from: VkBrowserMenuView.kt */
@SuppressLint({"ViewConstructor"})
/* loaded from: classes6.dex */
public final class yfu0 extends FrameLayout {
    public final ImageView b;
    public final ImageView c;
    public final TextView d;
    public final View e;
    public a f;

    /* compiled from: VkBrowserMenuView.kt */
    public interface a {
        void a();

        void b();
    }

    public yfu0(Context context, int i) {
        super(context, null, 0);
        View.inflate(context, i, this);
        ImageView imageView = (ImageView) findViewById(R.id.vk_menu_more);
        this.b = imageView;
        imageView.setOnClickListener(new a06(this, 14));
        ImageView imageView2 = (ImageView) findViewById(R.id.vk_menu_close);
        this.c = imageView2;
        imageView2.setOnClickListener(new i1(this, 11));
        this.d = (TextView) findViewById(R.id.game_name_textview);
        this.e = findViewById(R.id.main_container);
    }

    public final a getDelegate() {
        return this.f;
    }

    public final void setAppearanceAlpha(float f) {
        setAlpha(f);
    }

    public final void setCloseButtonIcon(int i) {
        this.c.setImageResource(i);
    }

    public final void setDelegate(a aVar) {
        this.f = aVar;
    }

    public final void setTitle(String str) {
        TextView textView = this.d;
        if (textView != null) {
            textView.setText(str);
        }
    }
}
