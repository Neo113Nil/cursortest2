package xsna;

import android.content.Context;
import android.os.Parcelable;
import android.text.TextUtils;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.TextView;
import com.unity3d.services.UnityAdsConstants;
import com.vk.common.links.AwayLink;
import com.vk.common.links.LaunchContext;
import com.vk.core.util.measure.ScaleType;
import com.vk.core.view.fresco.FrescoImageView;
import com.vk.dto.articles.AMP;
import com.vk.dto.articles.Article;
import com.vk.dto.attachments.Merchant;
import com.vk.dto.attachments.Product;
import com.vk.dto.attachments.SnippetAttachment;
import com.vk.dto.common.Image;
import com.vk.dto.common.Price;
import com.vk.dto.common.id.UserId;
import com.vk.dto.newsfeed.ButtonAction;
import com.vk.dto.newsfeed.Owner;
import com.vk.dto.newsfeed.entries.Post;
import com.vk.dto.newsfeed.entries.PromoPost;
import com.vk.dto.photo.Photo;
import com.vk.fave.entities.FaveEntry;
import com.vk.feed.core.models.news.NewsEntry;
import com.vkontakte.android.R;
import com.vkontakte.android.data.PostInteract;
import java.text.DecimalFormat;
import java.util.ArrayList;
import java.util.List;
import kotlin.jvm.internal.FunctionReferenceImpl;
import kotlin.jvm.internal.MutablePropertyReference0Impl;

/* compiled from: BaseProductSnippetHolder.kt */
/* loaded from: classes4.dex */
public abstract class wk6 extends m56<SnippetAttachment> implements View.OnClickListener {
    public static final /* synthetic */ int R = 0;
    public final FrescoImageView D;
    public final View E;
    public final TextView F;
    public final ViewGroup G;
    public final TextView H;
    public final TextView I;
    public final View J;
    public final TextView K;
    public final TextView L;
    public final TextView M;
    public final ImageView N;
    public final ImageView O;
    public final DecimalFormat P;
    public final StringBuilder Q;

    /* compiled from: BaseProductSnippetHolder.kt */
    public static final /* synthetic */ class a {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;

        static {
            int[] iArr = new int[Merchant.values().length];
            try {
                iArr[Merchant.ALIEXPRESS.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            $EnumSwitchMapping$0 = iArr;
        }
    }

    /* compiled from: BaseProductSnippetHolder.kt */
    public static final /* synthetic */ class b extends FunctionReferenceImpl implements gzs<Boolean> {
        /* JADX WARN: Multi-variable type inference failed */
        @Override // xsna.gzs
        public final Boolean invoke() {
            return (Boolean) ((mcy) this.receiver).get();
        }
    }

    /* compiled from: BaseProductSnippetHolder.kt */
    public static final /* synthetic */ class c extends MutablePropertyReference0Impl {
        @Override // kotlin.jvm.internal.MutablePropertyReference0Impl, xsna.rcy
        public final Object get() {
            wk6 wk6Var = (wk6) this.receiver;
            int i = wk6.R;
            return Boolean.valueOf(wk6Var.t);
        }

        @Override // kotlin.jvm.internal.MutablePropertyReference0Impl, xsna.mcy
        public final void set(Object obj) {
            wk6 wk6Var = (wk6) this.receiver;
            boolean booleanValue = ((Boolean) obj).booleanValue();
            int i = wk6.R;
            wk6Var.t = booleanValue;
        }
    }

    public wk6(ViewGroup viewGroup) {
        super(R.layout.attach_product_snippet_fave_big, viewGroup);
        FrescoImageView frescoImageView = (FrescoImageView) this.itemView.findViewById(R.id.snippet_image);
        this.D = frescoImageView;
        this.E = this.itemView.findViewById(R.id.iv_link_state);
        this.F = (TextView) this.itemView.findViewById(R.id.title);
        this.G = (ViewGroup) this.itemView.findViewById(R.id.info);
        this.H = (TextView) this.itemView.findViewById(R.id.rating);
        this.I = (TextView) this.itemView.findViewById(R.id.orders_count);
        this.J = this.itemView.findViewById(R.id.brand_logo);
        this.K = (TextView) this.itemView.findViewById(R.id.price);
        TextView textView = (TextView) this.itemView.findViewById(R.id.old_price);
        this.L = textView;
        TextView textView2 = (TextView) this.itemView.findViewById(R.id.button);
        this.M = textView2;
        ImageView imageView = (ImageView) this.itemView.findViewById(R.id.snippet_toggle_fave);
        this.N = imageView;
        ImageView imageView2 = (ImageView) this.itemView.findViewById(R.id.snippet_actions);
        this.O = imageView2;
        this.P = new DecimalFormat("#.#");
        this.Q = new StringBuilder();
        frescoImageView.l(gbg0.a(this.itemView.getResources(), 0.5f), ybk0.S);
        frescoImageView.m(gbg0.a(this.itemView.getResources(), 2.0f), 0, gbg0.a(this.itemView.getResources(), 2.0f), 0);
        frescoImageView.setPlaceholder(dhr0.t.a(R.drawable.attach_fb_placeholder_left));
        frescoImageView.setScaleType(ScaleType.CENTER_CROP);
        textView.setPaintFlags(17);
        this.itemView.setOnClickListener(this);
        textView2.setOnClickListener(this);
        imageView.setOnClickListener(this);
        imageView2.setOnClickListener(this);
    }

    public void X6() {
        boolean b7 = b7();
        ImageView imageView = this.O;
        ImageView imageView2 = this.N;
        if (!b7) {
            bwt0.p0(imageView2, false);
            bwt0.p0(imageView, q6() instanceof FaveEntry);
        } else {
            bwt0.p0(imageView2, true);
            SnippetAttachment snippetAttachment = (SnippetAttachment) this.C;
            imageView2.setActivated(snippetAttachment != null ? epx.f(snippetAttachment.w, Boolean.TRUE) : false);
            bwt0.p0(imageView, false);
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r7v1 */
    /* JADX WARN: Type inference failed for: r7v2, types: [boolean, int] */
    /* JADX WARN: Type inference failed for: r7v3 */
    @Override // xsna.m56
    /* renamed from: Y6, reason: merged with bridge method [inline-methods] */
    public void T6(SnippetAttachment snippetAttachment) {
        ?? r7;
        Image image;
        Image image2;
        Photo photo = snippetAttachment.p;
        String str = snippetAttachment.k;
        float f = snippetAttachment.s;
        Product product = snippetAttachment.r;
        if (product == null) {
            return;
        }
        int i = product.c;
        Price price = product.b;
        boolean z = true;
        int i2 = a.$EnumSwitchMapping$0[product.d.ordinal()] == 1 ? R.drawable.aliexpress : 0;
        boolean z2 = i2 != 0;
        String str2 = snippetAttachment.g;
        TextView textView = this.F;
        textView.setText(str2);
        boolean z3 = !Float.isNaN(f) && f > UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT;
        TextView textView2 = this.H;
        if (z3) {
            textView2.setText(this.P.format(Float.valueOf(f)));
            bwt0.p0(textView2, true);
        } else {
            bwt0.p0(textView2, false);
        }
        boolean z4 = i > 0;
        StringBuilder sb = this.Q;
        sb.setLength(0);
        TextView textView3 = this.I;
        if (z4) {
            if (z3) {
                sb.append(" · ");
            }
            sb.append(s6(R.plurals.orders, i, Integer.valueOf(i)));
            if (z2) {
                sb.append(" · ");
            }
            textView3.setText(sb);
            bwt0.p0(textView3, true);
        } else if (z3 && z2) {
            textView3.setText(" · ");
            bwt0.p0(textView3, true);
        } else {
            bwt0.p0(textView3, false);
        }
        View view = this.J;
        if (z2) {
            view.setBackgroundResource(i2);
        }
        bwt0.p0(view, z2);
        boolean z5 = z3 || z4 || z2;
        bwt0.p0(this.G, z5);
        textView.setSingleLine(z5);
        textView.setMaxLines(z5 ? 1 : 2);
        String str3 = price.e;
        String str4 = price.f;
        int length = str3.length();
        TextView textView4 = this.K;
        if (length > 0) {
            textView4.setText(price.e);
            bwt0.p0(textView4, true);
            r7 = 0;
        } else {
            r7 = 0;
            bwt0.p0(textView4, false);
        }
        TextView textView5 = this.L;
        if (str4 == null || str4.length() == 0) {
            bwt0.p0(textView5, r7);
        } else {
            sb.setLength(r7);
            sb.append(str4);
            textView5.setText(sb);
            bwt0.p0(textView5, true);
        }
        TextView textView6 = this.M;
        if (str == null || str.length() == 0) {
            bwt0.p0(textView6, r7);
        } else {
            textView6.setText(str);
            bwt0.p0(textView6, true);
        }
        b bVar = new b(0, new c(this, wk6.class, "isAdvertisement", "isAdvertisement()Z", 0), mcy.class, "get", "get()Ljava/lang/Object;", 0);
        FrescoImageView frescoImageView = this.D;
        frescoImageView.setIgnoreTrafficSaverPredicate(bVar);
        frescoImageView.setLocalImage((List<? extends fxj0>) null);
        frescoImageView.setRemoteImage((List<? extends fxj0>) ((photo == null || (image2 = photo.y) == null) ? null : image2.b));
        ArrayList arrayList = (photo == null || (image = photo.y) == null) ? null : image.b;
        if (arrayList != null && !arrayList.isEmpty()) {
            z = r7;
        }
        bwt0.p0(this.E, z);
        X6();
        ViewGroup.LayoutParams layoutParams = this.N.getLayoutParams();
        FrameLayout.LayoutParams layoutParams2 = layoutParams instanceof FrameLayout.LayoutParams ? (FrameLayout.LayoutParams) layoutParams : null;
        ImageView imageView = this.O;
        if (layoutParams2 != null) {
            layoutParams2.gravity = bwt0.K(imageView) ? 8388611 : 8388613;
        }
        f4m.r(b7() ? bwt0.K(imageView) ? gbg0.a(this.itemView.getResources(), 68.0f) : gbg0.a(this.itemView.getResources(), 36.0f) : r7, textView);
    }

    public final boolean b7() {
        NewsEntry q6 = q6();
        Post post = q6 instanceof Post ? (Post) q6 : null;
        return ((q6 instanceof FaveEntry) || (q6 instanceof PromoPost) || (post != null && post.dc())) ? false : true;
    }

    @Override // xsna.m56, android.view.View.OnClickListener
    public final void onClick(View view) {
        SnippetAttachment snippetAttachment;
        if (jjc.b() || (snippetAttachment = (SnippetAttachment) this.C) == null) {
            return;
        }
        ButtonAction buttonAction = snippetAttachment.v;
        AwayLink awayLink = snippetAttachment.f;
        AMP amp = epx.f(view, this.M) ? buttonAction != null ? buttonAction.f : null : snippetAttachment.q;
        if (epx.f(view, this.N)) {
            Parcelable q6 = q6();
            c6z c6zVar = q6 instanceof c6z ? (c6z) q6 : null;
            gd60.X0(hd60.a(), this.itemView.getContext(), snippetAttachment, new pqq(this.u, c6zVar != null ? c6zVar.r() : null, null, null, 12), new com.vk.movika.tools.controls.seekbar.u(this, 1), new vl1(this, 9), 32);
            return;
        }
        ImageView imageView = this.O;
        if (epx.f(view, imageView)) {
            G6(imageView);
            return;
        }
        if (amp != null) {
            UserId userId = UserId.d;
            Article article = new Article(0, userId, null, 0L, snippetAttachment.g, snippetAttachment.h, new Owner(userId, snippetAttachment.i, null, null, null, null, null, null, null, null, null, null, null, false, false, false, false, null, 0, null, null, false, 4194288, null), awayLink.b, amp.b, null, snippetAttachment.p, amp.c, amp.d, true, false, null, null, null, 0, false);
            Parcelable q62 = q6();
            c6z c6zVar2 = q62 instanceof c6z ? (c6z) q62 : null;
            hd60.a().q0(this.itemView.getContext(), article, (r15 & 4) != 0 ? null : snippetAttachment, (r15 & 8) != 0 ? null : null, c6zVar2 != null ? c6zVar2.r() : null, false);
            return;
        }
        PostInteract postInteract = this.w;
        if (postInteract != null) {
            postInteract.f = awayLink.b;
            postInteract.Cb(PostInteract.Type.snippet_button_action);
        }
        if (buttonAction == null) {
            if (TextUtils.isEmpty(snippetAttachment.l)) {
                return;
            }
            hd60.a().V(this.itemView.getContext(), snippetAttachment.l, snippetAttachment.j, awayLink.c, new LaunchContext(false, false, false, null, null, null, null, this.v, snippetAttachment.l, null, null, false, false, false, null, null, null, null, null, false, false, null, null, null, 67108479));
            return;
        }
        u1c0 J0 = J0();
        int i = J0 != null ? J0.k : -1;
        gd60 a2 = hd60.a();
        Context context = this.itemView.getContext();
        ButtonAction buttonAction2 = snippetAttachment.v;
        PostInteract postInteract2 = this.w;
        Integer.valueOf(i);
        a2.C(context, buttonAction2, postInteract2, (r14 & 16) != 0 ? null : null, (r14 & 32) != 0 ? null : this.v);
    }
}
