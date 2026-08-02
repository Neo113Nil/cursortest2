package xsna;

import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;
import com.vk.dto.common.LinkButton;
import com.vk.dto.common.actions.Action;
import com.vk.dto.common.id.UserId;
import com.vk.dto.newsfeed.PostDonut;
import com.vk.dto.newsfeed.entries.Post;
import com.vkontakte.android.R;
import com.vkontakte.android.data.b;
import kotlin.LazyThreadSafetyMode;

/* compiled from: DonutPostPlaceholder.kt */
/* loaded from: classes4.dex */
public final class p1o extends qi6<Post> implements View.OnClickListener {
    public final TextView C;
    public final TextView D;
    public final Object E;
    public final Object F;

    public p1o(ViewGroup viewGroup) {
        super(R.layout.donut_post_placeholder, viewGroup);
        ImageView imageView = (ImageView) this.itemView.findViewById(R.id.donut_post_placeholder_icon);
        this.C = (TextView) this.itemView.findViewById(android.R.id.text1);
        TextView textView = (TextView) this.itemView.findViewById(android.R.id.button1);
        this.D = textView;
        gbj gbjVar = new gbj(this, 6);
        LazyThreadSafetyMode lazyThreadSafetyMode = LazyThreadSafetyMode.NONE;
        this.E = msy.a(lazyThreadSafetyMode, gbjVar);
        this.F = msy.a(lazyThreadSafetyMode, new d4(15));
        textView.setOnClickListener(this);
        imageView.setImageDrawable(krv0.f(R.drawable.vk_icon_donut_outline_56, R.attr.vk_ui_icon_secondary, this.itemView.getContext()));
    }

    /* JADX WARN: Type inference failed for: r2v0, types: [java.lang.Object, kotlin.Lazy] */
    /* JADX WARN: Type inference failed for: r2v4, types: [java.lang.Object, kotlin.Lazy] */
    @Override // xsna.qi6
    public final void E6(Post post) {
        LinkButton linkButton;
        PostDonut postDonut = post.R;
        PostDonut.Placeholder placeholder = postDonut != null ? postDonut.c : null;
        String str = (placeholder == null || (linkButton = placeholder.c) == null) ? null : linkButton.b;
        CharSequence charSequence = str;
        if (((Boolean) this.F.getValue()).booleanValue()) {
            a2o a2oVar = (a2o) this.E.getValue();
            String str2 = str;
            if (str == null) {
                str2 = "";
            }
            charSequence = y1o.b(a2oVar.parse(str2), this.itemView.getContext());
        }
        this.C.setText(placeholder != null ? placeholder.b : null);
        this.D.setText(charSequence);
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        Post q6;
        PostDonut.Placeholder placeholder;
        LinkButton linkButton;
        Action action;
        if (jjc.b() || (q6 = q6()) == null) {
            return;
        }
        PostDonut postDonut = q6.R;
        if (postDonut != null && (placeholder = postDonut.c) != null && (linkButton = placeholder.c) != null && (action = linkButton.c) != null) {
            hd60.a().v(action, this.itemView.getContext(), (r20 & 4) != 0 ? null : null, (r20 & 8) != 0 ? null : this.u, (r20 & 16) != 0 ? null : null, (r20 & 32) != 0 ? null : null, null, (r20 & 128) != 0 ? null : 423);
        }
        UserId userId = q6.m;
        b.d dVar = new b.d("donut_click_pay");
        dVar.b("post_placeholder", "source");
        dVar.b(userId, "owner_id");
        dVar.e();
    }
}
