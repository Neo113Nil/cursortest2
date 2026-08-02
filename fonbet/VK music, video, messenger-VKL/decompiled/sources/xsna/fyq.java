package xsna;

import android.content.Context;
import android.view.View;
import android.view.ViewGroup;
import androidx.appcompat.widget.AppCompatTextView;
import com.facebook.drawee.generic.RoundingParams;
import com.vk.core.tool.view.FluidHorizontalLayout;
import com.vk.core.ui.tracking.UiTracker;
import com.vk.dto.common.id.UserId;
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
import xsna.dek0;
import xsna.f5h0;

/* compiled from: FeedDigestSpotlightHolder.kt */
/* loaded from: classes4.dex */
public final class fyq extends qi6<Post> implements View.OnClickListener {
    public final iyq C;
    public final AppCompatTextView D;
    public final AppCompatTextView E;
    public final View F;
    public final AppCompatTextView G;
    public final AppCompatTextView H;
    public final FluidHorizontalLayout I;
    public final AppCompatTextView J;
    public final AppCompatTextView K;
    public final AppCompatTextView L;
    public final VKImageView M;
    public final Object N;
    public final Object O;

    /* JADX WARN: Illegal instructions before constructor call */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public fyq(ViewGroup viewGroup) {
        super(r0);
        iyq iyqVar = new iyq(viewGroup.getContext());
        this.C = iyqVar;
        this.D = iyqVar.getBadgeView();
        this.E = iyqVar.getCommentsDividerView();
        this.F = iyqVar.getCommentsIconView();
        this.G = iyqVar.getCommentsCounterView();
        this.H = iyqVar.getTimeView();
        this.I = iyqVar.getFluidLayout();
        AppCompatTextView nameTextView = iyqVar.getNameTextView();
        this.J = nameTextView;
        AppCompatTextView textView = iyqVar.getTextView();
        this.K = textView;
        this.L = iyqVar.getTitleView();
        VKImageView coverView = iyqVar.getCoverView();
        this.M = coverView;
        qbj qbjVar = new qbj(this, 6);
        LazyThreadSafetyMode lazyThreadSafetyMode = LazyThreadSafetyMode.NONE;
        this.N = msy.a(lazyThreadSafetyMode, qbjVar);
        this.O = msy.a(lazyThreadSafetyMode, new tvj(this, 7));
        iyqVar.setOnClickListener(this);
        nameTextView.setOnClickListener(this);
        iyqVar.setMaxLines(2);
        textView.setTransformationMethod(new quj0());
        int i = dek0.a;
        dek0.b(coverView, null, new dek0.a(cn70.a() * 8.0f, true), 2);
        coverView.setPlaceholderImage(R.drawable.placeholder_radius_8);
        RoundingParams roundingParams = coverView.getHierarchy().c;
        if (roundingParams != null) {
            roundingParams.f(cn70.a() * 8.0f);
            roundingParams.c(cn70.a() * 0.5f, this.itemView.getContext().getColor(R.color.vk_black_alpha8));
        }
        coverView.setActualScaleType(f5h0.f.a);
    }

    @Override // xsna.qi6
    public final void E6(Post post) {
        u1c0 J0 = J0();
        Object obj = J0 != null ? J0.h : null;
        gyq gyqVar = obj instanceof gyq ? (gyq) obj : null;
        if (gyqVar == null) {
            return;
        }
        CharSequence charSequence = gyqVar.h;
        AppCompatTextView appCompatTextView = this.L;
        appCompatTextView.setText(charSequence);
        bwt0.p0(appCompatTextView, gyqVar.i);
        this.J.setText(gyqVar.k);
        CharSequence charSequence2 = gyqVar.l;
        AppCompatTextView appCompatTextView2 = this.K;
        appCompatTextView2.setText(charSequence2);
        bwt0.p0(appCompatTextView2, gyqVar.m);
        StringBuilder sb = gyqVar.z;
        sb.setLength(0);
        sb.append("· ");
        sb.append(pvo0.k(gyqVar.n, this.itemView.getResources(), false));
        String sb2 = sb.toString();
        AppCompatTextView appCompatTextView3 = this.H;
        appCompatTextView3.setText(sb2);
        bwt0.p0(appCompatTextView3, gyqVar.o);
        String str = gyqVar.p;
        AppCompatTextView appCompatTextView4 = this.D;
        appCompatTextView4.setText(str);
        bwt0.p0(appCompatTextView4, gyqVar.q);
        bwt0.p0(this.E, gyqVar.u);
        boolean z = gyqVar.w;
        AppCompatTextView appCompatTextView5 = this.G;
        bwt0.p0(appCompatTextView5, z);
        bwt0.p0(this.F, gyqVar.x);
        appCompatTextView5.setText(gyqVar.v);
        String str2 = gyqVar.r;
        VKImageView vKImageView = this.M;
        vKImageView.load(str2);
        bwt0.p0(vKImageView, gyqVar.s);
        njt hierarchy = vKImageView.getHierarchy();
        if (hierarchy != null) {
            hierarchy.r(gyqVar.j, 0);
        }
        this.C.setSeparatorVisibility(gyqVar.t);
    }

    /* JADX WARN: Type inference failed for: r1v0, types: [java.lang.Object, kotlin.Lazy] */
    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        Post post;
        if (jjc.b()) {
            return;
        }
        boolean f = epx.f(view, this.J);
        ?? r1 = this.O;
        if (f || epx.f(view, this.I)) {
            Post q6 = q6();
            if (q6 != null) {
                nym nymVar = (nym) r1.getValue();
                Context context = this.itemView.getContext();
                UserId userId = q6.m;
                nymVar.getClass();
                gd60.Z0(hd60.a(), context, userId, null, null, 12);
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
                NewsfeedRouter.E(((nym) r1.getValue()).a, this.itemView.getContext(), post, null, null, null, null, null, Sdk.SDKError.Reason.INVALID_LOG_ERROR_ENDPOINT_VALUE);
            } else {
                nym nymVar2 = (nym) r1.getValue();
                Context context2 = this.itemView.getContext();
                String str2 = this.u;
                NewsfeedRouter newsfeedRouter = nymVar2.a;
                ArrayList arrayList = digest.q;
                String Ab = q62.Ab();
                String d = UiTracker.d();
                Digest.Header header = digest.k;
                newsfeedRouter.p(context2, new NewsfeedRouter.d(str, arrayList, Ab, d, str2, header != null ? header.c : "", null, null));
                post = q62;
            }
            b.d dVar = new b.d("digest_post_open");
            dVar.b(digest.o, "track_code");
            dVar.b(post.Bb(), "post_id");
            dVar.e();
        }
    }
}
