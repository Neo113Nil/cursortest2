package xsna;

import android.graphics.drawable.ColorDrawable;
import android.graphics.drawable.Drawable;
import android.os.Parcelable;
import android.text.TextUtils;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;
import com.unity3d.services.UnityAdsConstants;
import com.vk.core.util.measure.ScaleType;
import com.vk.core.view.RatingView;
import com.vk.core.view.fresco.FrescoImageView;
import com.vk.dto.attachments.Product;
import com.vk.dto.attachments.SnippetAttachment;
import com.vk.dto.common.Image;
import com.vk.dto.common.ImageSize;
import com.vk.dto.common.Price;
import com.vk.dto.newsfeed.entries.Post;
import com.vk.dto.newsfeed.entries.PromoPost;
import com.vk.dto.photo.Photo;
import com.vk.dto.photo.PhotoScaleType;
import com.vk.fave.entities.FaveEntry;
import com.vk.feed.core.models.news.NewsEntry;
import com.vkontakte.android.R;
import java.util.ArrayList;
import java.util.Iterator;
import kotlin.NoWhenBranchMatchedException;

/* compiled from: SnippetHolder.kt */
/* loaded from: classes4.dex */
public abstract class ybk0 extends m56<SnippetAttachment> implements View.OnClickListener, blc0 {
    public static final int S = dhr0.t.c(R.attr.vk_ui_separator_primary_alpha);
    public final FrescoImageView D;
    public final ImageView E;
    public final ViewGroup F;
    public final TextView G;
    public final TextView H;
    public final RatingView I;
    public final TextView J;
    public final TextView K;
    public final TextView L;
    public final ImageView M;
    public final ImageView N;
    public final ImageView O;
    public e6o P;
    public final v3o Q;
    public e6o R;

    /* compiled from: SnippetHolder.kt */
    public static final /* synthetic */ class a {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;

        static {
            int[] iArr = new int[PhotoScaleType.values().length];
            try {
                iArr[PhotoScaleType.TOP_CROP.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[PhotoScaleType.CENTER_CROP.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[PhotoScaleType.BOTTOM_CROP.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            $EnumSwitchMapping$0 = iArr;
        }
    }

    public ybk0(int i, ViewGroup viewGroup) {
        super(i, viewGroup);
        FrescoImageView frescoImageView = (FrescoImageView) this.itemView.findViewById(R.id.snippet_image);
        this.D = frescoImageView;
        this.E = (ImageView) this.itemView.findViewById(R.id.iv_amp);
        this.F = (ViewGroup) this.itemView.findViewById(R.id.info);
        this.G = (TextView) this.itemView.findViewById(R.id.attach_title);
        this.H = (TextView) this.itemView.findViewById(R.id.attach_subtitle);
        this.I = (RatingView) this.itemView.findViewById(R.id.attach_rating);
        this.J = (TextView) this.itemView.findViewById(R.id.attach_review_count);
        this.K = (TextView) this.itemView.findViewById(R.id.attach_subsubtitle);
        TextView textView = (TextView) this.itemView.findViewById(R.id.attach_button);
        this.L = textView;
        this.M = (ImageView) this.itemView.findViewById(R.id.snippet_toggle_fave);
        this.N = (ImageView) this.itemView.findViewById(R.id.snippet_actions);
        this.O = (ImageView) this.itemView.findViewById(R.id.attach_snippet_remove_button);
        this.Q = new v3o(this, 9);
        Y6();
        frescoImageView.setScaleType(ScaleType.CENTER_CROP);
        frescoImageView.setPlaceholder(new ColorDrawable(dhr0.t.c(R.attr.vk_ui_image_placeholder)));
        dek0.b(frescoImageView, null, null, 6);
        if (textView != null) {
            textView.setCompoundDrawableTintList(textView.getTextColors());
            textView.setCompoundDrawablePadding(iah0.a(6));
        }
    }

    @Override // xsna.blc0
    public final void D1(boolean z) {
        ImageView imageView = this.O;
        if (imageView != null) {
            bwt0.p0(imageView, true);
        }
    }

    @Override // xsna.qi6
    public final void Q6(s6o s6oVar) {
        super.Q6(s6oVar);
        ba baVar = s6oVar.e;
        this.P = s6oVar.a(this, baVar);
        this.R = s6oVar.a(this.Q, baVar);
        Y6();
    }

    public final ArrayList X6(SnippetAttachment snippetAttachment) {
        Image image;
        ArrayList arrayList;
        Image image2 = snippetAttachment.F;
        if (image2 != null) {
            sr10 sr10Var = dy2.a;
            if ((sr10Var != null ? sr10Var.c() : true) || this.t) {
                ArrayList arrayList2 = image2.b;
                ArrayList arrayList3 = new ArrayList(c5g.u(arrayList2, 10));
                Iterator it = arrayList2.iterator();
                while (it.hasNext()) {
                    arrayList3.add(((ImageSize) it.next()).d);
                }
                return arrayList3;
            }
        }
        Photo photo = snippetAttachment.p;
        if (photo == null || (image = photo.y) == null || (arrayList = image.b) == null) {
            return null;
        }
        ArrayList arrayList4 = new ArrayList(c5g.u(arrayList, 10));
        Iterator it2 = arrayList.iterator();
        while (it2.hasNext()) {
            arrayList4.add(((ImageSize) it2.next()).d);
        }
        return arrayList4;
    }

    public final void Y6() {
        View.OnClickListener onClickListener = this.P;
        if (onClickListener == null) {
            onClickListener = this;
        }
        this.itemView.setOnClickListener(onClickListener);
        TextView textView = this.L;
        if (textView != null) {
            textView.setOnClickListener(onClickListener);
        }
        ImageView imageView = this.M;
        if (imageView != null) {
            imageView.setOnClickListener(onClickListener);
        }
        View.OnClickListener onClickListener2 = this.R;
        if (onClickListener2 == null) {
            onClickListener2 = this.Q;
        }
        ImageView imageView2 = this.N;
        if (imageView2 != null) {
            imageView2.setOnClickListener(onClickListener2);
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:66:0x00cc  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public void b7(SnippetAttachment snippetAttachment) {
        ScaleType scaleType;
        String str;
        Price price;
        Integer num;
        String str2 = snippetAttachment.k;
        Photo photo = snippetAttachment.p;
        PhotoScaleType photoScaleType = photo != null ? photo.M : null;
        int i = photoScaleType == null ? -1 : a.$EnumSwitchMapping$0[photoScaleType.ordinal()];
        if (i == -1) {
            scaleType = ScaleType.CENTER_CROP;
        } else if (i == 1) {
            scaleType = ScaleType.TOP_CROP;
        } else if (i == 2) {
            scaleType = ScaleType.CENTER_CROP;
        } else {
            if (i != 3) {
                throw new NoWhenBranchMatchedException();
            }
            scaleType = ScaleType.BOTTOM_CROP;
        }
        this.D.setScaleType(scaleType);
        this.G.setText(snippetAttachment.g);
        if (snippetAttachment.Gb()) {
            Product product = snippetAttachment.r;
            str = (product == null || (price = product.b) == null) ? null : price.e;
        } else {
            str = snippetAttachment.h;
        }
        this.H.setText(str);
        TextView textView = this.K;
        if (textView != null) {
            textView.setText(snippetAttachment.i);
        }
        boolean isEmpty = TextUtils.isEmpty(str2);
        TextView textView2 = this.L;
        if (!isEmpty) {
            if (textView2 != null) {
                textView2.setVisibility(0);
            }
            if (textView2 != null) {
                textView2.setText(str2);
            }
            String str3 = snippetAttachment.m;
            if (str3 != null) {
                int hashCode = str3.hashCode();
                if (hashCode != 3443508) {
                    if (hashCode != 106642798) {
                        if (hashCode == 1379209310 && str3.equals("services")) {
                            num = Integer.valueOf(R.drawable.vk_icon_services_16);
                            if (textView2 != null) {
                                textView2.setCompoundDrawablesRelativeWithIntrinsicBounds(num != null ? m33.a(num.intValue(), e43.a) : null, (Drawable) null, (Drawable) null, (Drawable) null);
                            }
                        }
                    } else if (str3.equals("phone")) {
                        num = Integer.valueOf(R.drawable.vk_icon_phone_16);
                        if (textView2 != null) {
                        }
                    }
                } else if (str3.equals("play")) {
                    num = Integer.valueOf(R.drawable.vk_icon_play_16);
                    if (textView2 != null) {
                    }
                }
            }
            num = null;
            if (textView2 != null) {
            }
        } else if (textView2 != null) {
            textView2.setVisibility(8);
        }
        ImageView imageView = this.E;
        if (imageView != null) {
            bwt0.p0(imageView, snippetAttachment.q != null);
        }
        float f = snippetAttachment.s;
        boolean isNaN = Float.isNaN(f);
        RatingView ratingView = this.I;
        if (!isNaN && f > UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT) {
            if (ratingView != null) {
                ratingView.setVisibility(0);
            }
            if (ratingView != null) {
                ratingView.setRating(f);
            }
        } else if (ratingView != null) {
            ratingView.setVisibility(8);
        }
        TextView textView3 = this.J;
        if (textView3 != null) {
            textView3.setVisibility(8);
        }
        c7();
        ImageView imageView2 = this.N;
        if (imageView2 != null) {
            bwt0.p0(imageView2, q6() instanceof FaveEntry);
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:7:0x0019, code lost:
    
        if (r2.dc() == true) goto L12;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void c7() {
        boolean z;
        NewsEntry q6 = q6();
        NewsEntry t6 = t6();
        Post post = q6 instanceof Post ? (Post) q6 : null;
        if (post != null) {
            z = true;
        }
        z = false;
        boolean z2 = t6 instanceof FaveEntry;
        ImageView imageView = this.M;
        if (z2 || (q6 instanceof FaveEntry) || (q6 instanceof PromoPost) || z) {
            if (imageView != null) {
                imageView.setVisibility(8);
                return;
            }
            return;
        }
        if (imageView != null) {
            imageView.setVisibility(0);
        }
        SnippetAttachment snippetAttachment = (SnippetAttachment) this.C;
        if (snippetAttachment != null) {
            if (imageView != null) {
                imageView.setActivated(snippetAttachment.w.booleanValue());
            }
            if (imageView != null) {
                imageView.setContentDescription(v6(snippetAttachment.w.booleanValue() ? R.string.fave_accessibility_remove_from_favorite : R.string.fave_accessibility_add_to_favorite));
            }
        }
    }

    @Override // xsna.blc0
    public final void j1(View.OnClickListener onClickListener) {
        ImageView imageView = this.O;
        if (imageView != null) {
            imageView.setOnClickListener(onClickListener);
        }
    }

    @Override // xsna.m56, android.view.View.OnClickListener
    public void onClick(View view) {
        if (view == null || jjc.b()) {
            return;
        }
        if (!view.equals(this.M)) {
            if (view.equals(this.L)) {
                U6(view);
                return;
            } else {
                W6(view);
                return;
            }
        }
        SnippetAttachment snippetAttachment = (SnippetAttachment) this.C;
        if (snippetAttachment == null) {
            return;
        }
        Parcelable q6 = q6();
        c6z c6zVar = q6 instanceof c6z ? (c6z) q6 : null;
        gd60.X0(hd60.a(), this.itemView.getContext(), snippetAttachment, new pqq(null, this.u, c6zVar != null ? c6zVar.r() : null, null, 9), new y6c(this, 13), new gda0(this, 18), 32);
    }

    @Override // xsna.blc0
    public final void p5() {
        ImageView imageView = this.M;
        if (imageView != null) {
            bwt0.p0(imageView, false);
        }
    }

    @Override // xsna.blc0
    public final void Z1(x64 x64Var) {
    }
}
