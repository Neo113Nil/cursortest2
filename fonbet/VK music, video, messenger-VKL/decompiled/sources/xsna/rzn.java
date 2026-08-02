package xsna;

import android.content.Context;
import android.text.TextUtils;
import android.view.LayoutInflater;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import com.vk.community.tool.view.donut.feedactionbutton.FadeOutText;
import com.vk.core.view.components.button.VkButton;
import com.vk.core.view.components.picture.VkImageSimple;
import com.vkontakte.android.R;
import xsna.tlo0;

/* compiled from: DonutFeedSnippet.kt */
/* loaded from: classes17.dex */
public final class rzn extends LinearLayout {
    public final FadeOutText b;
    public final VkButton c;
    public final VkImageSimple d;
    public a e;
    public tlo0 f;

    /* compiled from: DonutFeedSnippet.kt */
    public interface a {

        /* compiled from: DonutFeedSnippet.kt */
        /* renamed from: xsna.rzn$a$a, reason: collision with other inner class name */
        public static final class C3643a implements a {
            public final CharSequence a;

            public C3643a(CharSequence charSequence) {
                this.a = charSequence;
            }
        }

        /* compiled from: DonutFeedSnippet.kt */
        public static final class b implements a {
            public static final b a = new b();

            public final boolean equals(Object obj) {
                return this == obj || (obj instanceof b);
            }

            public final int hashCode() {
                return -192977911;
            }

            public final String toString() {
                return "Chevron";
            }
        }
    }

    public rzn(Context context) {
        super(context, null, 0);
        tlo0.Companion.getClass();
        this.f = tlo0.c.a;
        LayoutInflater.from(context).inflate(R.layout.donut_feed_snippet, (ViewGroup) this, true);
        bwt0.Z(R.attr.vk_ui_background_secondary, this);
        setMinimumHeight(iah0.a(44));
        this.c = (VkButton) findViewById(R.id.donut_snippet_button);
        FadeOutText fadeOutText = (FadeOutText) findViewById(R.id.donut_snippet_text);
        this.b = fadeOutText;
        this.d = (VkImageSimple) findViewById(R.id.donut_snippet_chevron);
        if (fadeOutText != null) {
            fadeOutText.setEllipsize(TextUtils.TruncateAt.END);
        }
    }

    private final void setUpRight(a aVar) {
        this.d.setVisibility(aVar instanceof a.b ? 0 : 8);
        boolean z = aVar instanceof a.C3643a;
        int i = z ? 0 : 8;
        VkButton vkButton = this.c;
        vkButton.setVisibility(i);
        if (z) {
            vkButton.setText(((a.C3643a) aVar).a);
        }
    }

    public final a getRightContent() {
        return this.e;
    }

    public final tlo0 getText() {
        return this.f;
    }

    public final void setRightContent(a aVar) {
        this.e = aVar;
        setUpRight(aVar);
    }

    public final void setText(tlo0 tlo0Var) {
        this.f = tlo0Var;
        FadeOutText fadeOutText = this.b;
        if (fadeOutText != null) {
            fadeOutText.setText(tlo0Var.a(getContext()));
        }
    }
}
