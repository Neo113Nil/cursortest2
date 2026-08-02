package xsna;

import android.content.Context;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import com.vk.core.view.components.button.VkButton;
import com.vk.core.view.components.divider.VkSeparator;
import com.vk.dto.newsfeed.entries.Digest;
import com.vk.newsfeed.api.NewsfeedRouter;
import com.vk.newsfeed.common.PostActions;
import com.vkontakte.android.R;
import com.vkontakte.android.data.b;
import java.util.ArrayList;
import kotlin.LazyThreadSafetyMode;

/* compiled from: DigestFooterHolder.kt */
/* loaded from: classes4.dex */
public final class aym extends qi6<Digest> implements View.OnClickListener {
    public final VkButton C;
    public final VkSeparator D;
    public final Object E;

    /* JADX WARN: Illegal instructions before constructor call */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public aym(ViewGroup viewGroup) {
        super(r0);
        FrameLayout frameLayout = new FrameLayout(viewGroup.getContext());
        frameLayout.setLayoutParams(new ViewGroup.LayoutParams(-1, -2));
        frameLayout.setMinimumHeight(cn70.b(48));
        int b = cn70.b(16);
        frameLayout.setPadding(b, 0, b, 0);
        getContext();
        FrameLayout frameLayout2 = (FrameLayout) this.itemView;
        frameLayout2.setOnClickListener(this);
        this.E = msy.a(LazyThreadSafetyMode.NONE, new z3i(this, 5));
        VkButton vkButton = new VkButton(this.itemView.getContext(), null, 6, 0);
        vkButton.setAppearance(VkButton.Appearance.Accent);
        vkButton.setMode(VkButton.Mode.Link);
        vkButton.setSize(VkButton.Size.Small);
        vkButton.setTextTint(R.attr.vk_ui_text_accent);
        vkButton.d5(Integer.valueOf(R.drawable.vk_icon_chevron_24));
        vkButton.setTrailingIconTint(R.attr.vk_ui_text_accent);
        this.C = vkButton;
        frameLayout2.addView(this.C, new FrameLayout.LayoutParams(-1, -2, 17));
        VkSeparator vkSeparator = new VkSeparator(frameLayout2.getContext(), null, 6);
        vkSeparator.setDividerHeight(cn70.b(1));
        vkSeparator.setBackgroundColor(dhr0.t.c(R.attr.vk_ui_separator_primary_alpha));
        this.D = vkSeparator;
        frameLayout2.addView(this.D, new FrameLayout.LayoutParams(-1, cn70.b(1), 49));
    }

    @Override // xsna.qi6
    public final void E6(Digest digest) {
        String str;
        Digest.Footer footer = digest.l;
        if (footer == null || (str = footer.c) == null) {
            str = "";
        }
        VkButton vkButton = this.C;
        if (vkButton != null) {
            vkButton.setText(str);
        }
    }

    /* JADX WARN: Type inference failed for: r0v3, types: [java.lang.Object, kotlin.Lazy] */
    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        Digest q6;
        Digest q62;
        if (jjc.b() || (q6 = q6()) == null) {
            return;
        }
        Digest.Footer footer = q6.l;
        String str = null;
        String str2 = footer != null ? footer.e : null;
        if (str2 == null || str2.length() == 0) {
            str = q6.j;
        } else if (footer != null) {
            str = footer.e;
        }
        String str3 = str;
        if (epx.f(str3, "discover_category_trends/trends")) {
            u1c0 J0 = J0();
            int i = J0 != null ? J0.k : 0;
            s980 s980Var = this.y;
            if (s980Var != null) {
                s980Var.d9(q6, t6(), PostActions.ACTION_OPEN_NEWS_TAB.h(), i);
            }
        } else if (str3 != null && str3.length() != 0 && (q62 = q6()) != null) {
            NewsfeedRouter newsfeedRouter = (NewsfeedRouter) this.E.getValue();
            Context context = this.itemView.getContext();
            ArrayList arrayList = q62.q;
            String str4 = this.u;
            Digest.Header header = q62.k;
            NewsfeedRouter.b(newsfeedRouter, context, str3, arrayList, header != null ? header.c : "", str4, 16);
            s3q0 s3q0Var = s3q0.a;
        }
        Digest q63 = q6();
        if (q63 != null) {
            b.d dVar = new b.d("digest_more");
            dVar.b(q63.o, "track_code");
            dVar.e();
        }
    }
}
