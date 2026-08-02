package xsna;

import android.animation.ValueAnimator;
import android.content.res.ColorStateList;
import android.graphics.drawable.Drawable;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import com.vk.channels.impl.comments.e;
import com.vk.core.view.links.LinkedTextView;
import com.vk.dto.common.id.UserId;
import com.vk.dto.common.im.ImageList;
import com.vk.im.ui.views.avatars.ImAvatarView;
import com.vkontakte.android.R;
import java.text.DecimalFormat;
import java.util.List;
import kotlin.LazyThreadSafetyMode;

/* compiled from: CommentHolder.kt */
/* loaded from: classes16.dex */
public final class ubg extends l5v<xbg> {
    public static final float[] s = {0.9f, 1.3f, 0.9f, 1.0f};
    public final Object m;
    public ValueAnimator n;
    public final Object o;
    public final Object p;
    public final b84 q;
    public xbg r;

    /* compiled from: CommentHolder.kt */
    public interface a {
        void a(int i);

        void b(int i);

        void c(UserId userId);

        void d(int i);

        void e(int i);

        void i(UserId userId);
    }

    /* compiled from: CommentHolder.kt */
    public static final class b {
        public final ImAvatarView a;
        public final ImAvatarView b;
        public final TextView c;
        public final TextView d;
        public final LinkedTextView e;
        public final TextView f;
        public final TextView g;
        public final RecyclerView h;
        public final ViewGroup i;
        public final ImageView j;
        public final TextView k;
        public final TextView l;

        public b(View view) {
            this.a = (ImAvatarView) view.findViewById(R.id.im_comment_author_avatar_big);
            this.b = (ImAvatarView) view.findViewById(R.id.im_comment_author_avatar_small);
            this.c = (TextView) view.findViewById(R.id.im_comment_author_name);
            this.d = (TextView) view.findViewById(R.id.im_reply_to_user_name);
            this.e = (LinkedTextView) view.findViewById(R.id.im_comment_text);
            this.f = (TextView) view.findViewById(R.id.im_comment_date);
            this.g = (TextView) view.findViewById(R.id.im_reply_to_comment);
            this.h = (RecyclerView) view.findViewById(R.id.im_attachments_list);
            this.i = (ViewGroup) view.findViewById(R.id.im_comment_reaction_container);
            this.j = (ImageView) view.findViewById(R.id.im_comment_reaction_icon);
            this.k = (TextView) view.findViewById(R.id.im_comment_reaction_count);
            this.l = (TextView) view.findViewById(R.id.im_comment_edited_label);
        }
    }

    public ubg(View view, RecyclerView.u uVar, e.a aVar) {
        super(view);
        zq3 zq3Var = new zq3(11);
        LazyThreadSafetyMode lazyThreadSafetyMode = LazyThreadSafetyMode.NONE;
        this.m = msy.a(lazyThreadSafetyMode, zq3Var);
        int i = 0;
        this.o = msy.a(lazyThreadSafetyMode, new sbg(view, i));
        this.p = msy.a(lazyThreadSafetyMode, new tbg(this, i));
        b84 b84Var = new b84();
        b84Var.y0(new s6q0());
        this.q = b84Var;
        RecyclerView recyclerView = i6().h;
        recyclerView.setNestedScrollingEnabled(false);
        view.getContext();
        recyclerView.setLayoutManager(new LinearLayoutManager());
        recyclerView.setRecycledViewPool(uVar);
        recyclerView.setAdapter(b84Var);
        ng3 ng3Var = new ng3(10, this, aVar);
        bwt0.i0(i6().b, ng3Var);
        bwt0.i0(i6().a, ng3Var);
        bwt0.i0(i6().c, new com.vk.movika.sdk.base.logic.processor.d(3, this, aVar));
        awt0.j(iah0.a(2), i6().g);
        bwt0.i0(i6().g, new az2(8, this, aVar));
        awt0.j(iah0.a(12), i6().i);
        bwt0.i0(i6().i, new np5(4, this, aVar));
        awt0.j(iah0.a(4), i6().d);
        bwt0.i0(i6().d, new qt5(5, this, aVar));
        bwt0.i0(view, new ij8(4, this, aVar));
    }

    /* JADX WARN: Type inference failed for: r3v1, types: [java.lang.Object, kotlin.Lazy] */
    @Override // xsna.vfz
    public final void W5(hfz hfzVar) {
        xbg xbgVar = (xbg) hfzVar;
        String str = xbgVar.f;
        ImageList imageList = xbgVar.c;
        this.r = xbgVar;
        RecyclerView recyclerView = i6().h;
        List<hfz> list = xbgVar.h;
        recyclerView.setVisibility(!list.isEmpty() ? 0 : 8);
        this.q.setItems(list);
        int i = xbgVar.k;
        ?? r3 = this.p;
        if (i == 0) {
            i6().a.setVisibility(0);
            i6().a.o1(imageList, (Drawable) r3.getValue());
            f4m.j(i6().b);
        } else {
            i6().b.setVisibility(0);
            i6().b.o1(imageList, (Drawable) r3.getValue());
            f4m.j(i6().a);
        }
        i6().c.setText(xbgVar.d);
        if (str.length() == 0) {
            f4m.j(i6().d);
        } else {
            i6().d.setVisibility(0);
            i6().d.setText(str);
        }
        i6().e.setText(xbgVar.g);
        i6().f.setText(xbgVar.i);
        i6().l.setVisibility(xbgVar.o ? 0 : 8);
        i6().g.setVisibility(xbgVar.j ? 0 : 8);
        ViewGroup viewGroup = i6().i;
        int i2 = xbgVar.m;
        viewGroup.setEnabled(true);
        if (xbgVar.n) {
            i6().j.setImageResource(R.drawable.vk_icon_like_16);
            int c = dhr0.t.c(R.attr.vk_ui_accent_red);
            i6().j.setImageTintList(ColorStateList.valueOf(c));
            i6().k.setTextColor(c);
        } else {
            i6().j.setImageResource(R.drawable.vk_icon_like_outline_16);
            int c2 = dhr0.t.c(R.attr.vk_ui_icon_secondary);
            i6().j.setImageTintList(ColorStateList.valueOf(c2));
            i6().k.setTextColor(c2);
        }
        if (i2 > 0) {
            i6().k.setVisibility(0);
            TextView textView = i6().k;
            DecimalFormat decimalFormat = uqm0.a;
            long j = i2;
            textView.setText(j > 1000000000 ? "∞" : uqm0.f(j));
        } else {
            i6().k.setVisibility(8);
        }
        h6(xbgVar.l);
    }

    @Override // xsna.l5v, xsna.vfz
    public final void g6() {
        ValueAnimator valueAnimator = this.n;
        if (valueAnimator != null) {
            valueAnimator.end();
        }
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, kotlin.Lazy] */
    public final b i6() {
        return (b) this.o.getValue();
    }
}
