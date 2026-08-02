package xsna;

import android.content.Context;
import android.graphics.drawable.ColorDrawable;
import android.graphics.drawable.Drawable;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import androidx.appcompat.widget.AppCompatImageView;
import androidx.appcompat.widget.AppCompatTextView;
import com.facebook.drawee.generic.RoundingParams;
import com.vk.core.ui.tracking.UiTracker;
import com.vk.dto.newsfeed.entries.Digest;
import com.vk.dto.newsfeed.entries.Post;
import com.vk.feed.core.models.news.NewsEntry;
import com.vk.imageloader.view.VKImageView;
import com.vk.newsfeed.api.NewsfeedRouter;
import com.vkontakte.android.R;
import com.vkontakte.android.data.b;
import com.vungle.ads.internal.protos.Sdk;
import java.util.ArrayList;
import kotlin.LazyThreadSafetyMode;
import xsna.f5h0;

/* compiled from: FeedDigestInversedListItemHolder.kt */
/* loaded from: classes4.dex */
public final class byq extends qi6<Post> implements View.OnClickListener {
    public final eyq C;
    public final AppCompatTextView D;
    public final AppCompatTextView E;
    public final View F;
    public final AppCompatTextView G;
    public final VKImageView H;
    public final AppCompatImageView I;
    public final View J;
    public final View K;
    public final TextView L;
    public final TextView M;
    public final AppCompatTextView N;
    public final Object O;

    /* JADX WARN: Illegal instructions before constructor call */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public byq(ViewGroup viewGroup) {
        super(r0);
        eyq eyqVar = new eyq(viewGroup.getContext());
        this.C = eyqVar;
        this.D = eyqVar.getBadgeView();
        this.E = eyqVar.getCommentsDividerView();
        this.F = eyqVar.getCommentsIconView();
        this.G = eyqVar.getCommentsCounterView();
        VKImageView attachThumb = eyqVar.getAttachThumb();
        this.H = attachThumb;
        this.I = eyqVar.getOverlayView();
        View findViewById = this.itemView.findViewById(R.id.digest_list_item);
        this.J = findViewById;
        this.K = this.itemView.findViewById(R.id.digest_name_container);
        TextView textView = (TextView) this.itemView.findViewById(R.id.digest_name);
        this.L = textView;
        TextView textView2 = (TextView) this.itemView.findViewById(R.id.digest_text);
        this.M = textView2;
        this.N = eyqVar.getTimeView();
        ColorDrawable colorDrawable = new ColorDrawable(dhr0.t.c(R.attr.vk_ui_image_placeholder));
        this.O = msy.a(LazyThreadSafetyMode.NONE, new jpf(this, 17));
        dek0.b(attachThumb, null, null, 6);
        findViewById.setOnClickListener(this);
        attachThumb.setActualScaleType(f5h0.f.a);
        attachThumb.setPlaceholderImage(colorDrawable);
        textView.setOnClickListener(this);
        njt hierarchy = attachThumb.getHierarchy();
        RoundingParams roundingParams = new RoundingParams();
        roundingParams.f(cn70.a() * 4.0f);
        hierarchy.u(roundingParams);
        eyqVar.setMaxLines(2);
        textView2.setTransformationMethod(new quj0());
    }

    @Override // xsna.qi6
    public final void E6(Post post) {
        u1c0 J0 = J0();
        Object obj = J0 != null ? J0.h : null;
        ayq ayqVar = obj instanceof ayq ? (ayq) obj : null;
        if (ayqVar == null) {
            return;
        }
        this.L.setText(ayqVar.h);
        CharSequence charSequence = ayqVar.i;
        TextView textView = this.M;
        textView.setText(charSequence);
        bwt0.p0(textView, ayqVar.j);
        StringBuilder sb = ayqVar.z;
        sb.setLength(0);
        sb.append("· ");
        sb.append(pvo0.k(ayqVar.k, this.itemView.getResources(), false));
        AppCompatTextView appCompatTextView = this.N;
        appCompatTextView.setText(sb);
        bwt0.p0(appCompatTextView, ayqVar.l);
        String str = ayqVar.m;
        AppCompatTextView appCompatTextView2 = this.D;
        appCompatTextView2.setText(str);
        bwt0.p0(appCompatTextView2, ayqVar.n);
        bwt0.p0(this.E, ayqVar.u);
        boolean z = ayqVar.w;
        AppCompatTextView appCompatTextView3 = this.G;
        bwt0.p0(appCompatTextView3, z);
        bwt0.p0(this.F, ayqVar.x);
        appCompatTextView3.setText(ayqVar.v);
        boolean z2 = ayqVar.q;
        VKImageView vKImageView = this.H;
        bwt0.p0(vKImageView, z2);
        boolean z3 = ayqVar.t;
        AppCompatImageView appCompatImageView = this.I;
        bwt0.p0(appCompatImageView, z3);
        Drawable drawable = ayqVar.p;
        if (drawable != null) {
            vKImageView.clear();
            vKImageView.setBackground(drawable);
        } else {
            vKImageView.load(ayqVar.o);
        }
        appCompatImageView.setImageDrawable(ayqVar.r);
        appCompatImageView.setBackground(ayqVar.s);
        f4m.v(ayqVar.y, this.C);
    }

    /* JADX WARN: Type inference failed for: r1v0, types: [java.lang.Object, kotlin.Lazy] */
    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        Post post;
        if (jjc.b()) {
            return;
        }
        boolean f = epx.f(view, this.L);
        ?? r1 = this.O;
        if (f || epx.f(view, this.K)) {
            Post q6 = q6();
            if (q6 != null) {
                gd60.Z0(hd60.a(), this.itemView.getContext(), q6.m, null, null, 12);
                return;
            }
            return;
        }
        NewsEntry t6 = t6();
        Digest digest = t6 instanceof Digest ? (Digest) t6 : null;
        if (digest == null) {
            return;
        }
        String str = digest.j;
        Post q62 = q6();
        if (q62 != null) {
            if (str == null || str.length() == 0) {
                post = q62;
                NewsfeedRouter.E((NewsfeedRouter) r1.getValue(), this.itemView.getContext(), post, null, null, null, null, null, Sdk.SDKError.Reason.INVALID_LOG_ERROR_ENDPOINT_VALUE);
            } else {
                NewsfeedRouter newsfeedRouter = (NewsfeedRouter) r1.getValue();
                Context context = this.itemView.getContext();
                String str2 = this.u;
                ArrayList arrayList = digest.q;
                String Ab = q62.Ab();
                UiTracker uiTracker = UiTracker.a;
                String d = UiTracker.d();
                Digest.Header header = digest.k;
                newsfeedRouter.p(context, new NewsfeedRouter.d(str, arrayList, Ab, d, str2, header != null ? header.c : "", null, null));
                post = q62;
            }
            b.d dVar = new b.d("digest_post_open");
            dVar.b(digest.o, "track_code");
            dVar.b(post.Bb(), "post_id");
            dVar.e();
        }
    }
}
