package xsna;

import android.content.Context;
import android.graphics.drawable.Drawable;
import android.text.SpannableStringBuilder;
import android.text.style.StrikethroughSpan;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.TextView;
import com.vk.core.serialize.Serializer;
import com.vk.core.ui.fave.FaveTagViewGroup;
import com.vk.core.utils.b;
import com.vk.dto.articles.ArticleDonut;
import com.vk.dto.attachments.ArticleAttachment;
import com.vk.dto.attachments.SnippetAttachment;
import com.vk.dto.common.ClassifiedJob;
import com.vk.dto.common.Image;
import com.vk.dto.common.ImageSize;
import com.vk.dto.common.MusicVideoFile;
import com.vk.dto.common.Price;
import com.vk.dto.common.VideoFile;
import com.vk.dto.common.restrictions.VideoRestriction;
import com.vk.dto.narratives.Narrative;
import com.vk.dto.newsfeed.FaveTag;
import com.vk.dto.newsfeed.Owner;
import com.vk.dto.photo.Photo;
import com.vk.ecomm.fave.api.models.FaveMarketItem;
import com.vk.fave.FaveItem;
import com.vk.fave.entities.FaveEntry;
import com.vk.imageloader.view.VKImageView;
import com.vk.libvideo.design.view.movika.InteractiveDurationView;
import com.vk.libvideo.design.view.overlay.VideoOverlayView;
import com.vk.libvideo.pip.VideoPipStateHolder;
import com.vk.newsfeed.common.recycler.holders.fave.FaveSmallSize;
import com.vk.typography.Font;
import com.vk.typography.FontFamily;
import com.vk.typography.TextSizeUnit;
import com.vk.typography.a;
import com.vkontakte.android.R;
import com.vkontakte.android.attachments.VideoAttachment;
import com.vungle.ads.internal.protos.Sdk;
import java.util.List;
import kotlin.LazyThreadSafetyMode;
import kotlin.NoWhenBranchMatchedException;

/* compiled from: FaveSmallHolder.kt */
/* loaded from: classes4.dex */
public final class bsq extends qi6<FaveEntry> {
    public final View C;
    public final VKImageView D;
    public final TextView E;
    public final ImageView F;
    public final TextView G;
    public final TextView H;
    public final InteractiveDurationView I;
    public final TextView J;
    public final ImageView K;
    public final FaveTagViewGroup L;
    public final View M;
    public final VideoOverlayView N;
    public final TextView O;
    public final SpannableStringBuilder P;
    public io.reactivex.rxjava3.disposables.c Q;
    public final Object R;
    public final Object S;
    public final Object T;
    public final Object U;

    /* compiled from: FaveSmallHolder.kt */
    public static final /* synthetic */ class a {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;

        static {
            int[] iArr = new int[FaveSmallSize.values().length];
            try {
                iArr[FaveSmallSize.SMALL.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[FaveSmallSize.BIG.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[FaveSmallSize.SQUARE.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            $EnumSwitchMapping$0 = iArr;
        }
    }

    public bsq(ViewGroup viewGroup, FaveSmallSize faveSmallSize) {
        super(R.layout.fave_small_holder, viewGroup);
        int i;
        View findViewById = this.itemView.findViewById(R.id.iv_actions);
        this.C = findViewById;
        VKImageView vKImageView = (VKImageView) this.itemView.findViewById(R.id.iv_fave_image);
        this.D = vKImageView;
        TextView textView = (TextView) this.itemView.findViewById(R.id.tv_title);
        this.E = textView;
        this.F = (ImageView) this.itemView.findViewById(R.id.iv_subtitle_state_icon);
        this.G = (TextView) this.itemView.findViewById(R.id.tv_subtitle);
        this.H = (TextView) this.itemView.findViewById(R.id.tv_duration);
        this.I = (InteractiveDurationView) this.itemView.findViewById(R.id.interactive_duration);
        this.J = (TextView) this.itemView.findViewById(R.id.tv_description);
        this.K = (ImageView) this.itemView.findViewById(R.id.iv_status_image);
        this.L = (FaveTagViewGroup) this.itemView.findViewById(R.id.ft_tag_group);
        this.M = this.itemView.findViewById(R.id.iv_tag_icon);
        this.N = (VideoOverlayView) this.itemView.findViewById(R.id.fave_small_holder_overlay);
        FrameLayout frameLayout = (FrameLayout) this.itemView.findViewById(R.id.fave_small_holder_image_container);
        this.O = (TextView) this.itemView.findViewById(R.id.overlay_view);
        this.P = new SpannableStringBuilder();
        n1 n1Var = new n1(17);
        LazyThreadSafetyMode lazyThreadSafetyMode = LazyThreadSafetyMode.NONE;
        this.R = msy.a(lazyThreadSafetyMode, n1Var);
        this.S = msy.a(lazyThreadSafetyMode, new a44(16));
        this.T = msy.a(lazyThreadSafetyMode, new de4(16));
        this.U = msy.a(lazyThreadSafetyMode, new ee4(12));
        vKImageView.setEmptyImagePlaceholder(R.drawable.fave_gray_rounded_bg);
        findViewById.setOnClickListener(new asq(this, 0));
        ViewGroup.LayoutParams layoutParams = frameLayout.getLayoutParams();
        int[] iArr = a.$EnumSwitchMapping$0;
        int i2 = iArr[faveSmallSize.ordinal()];
        int i3 = 72;
        if (i2 == 1) {
            i = 120;
        } else if (i2 == 2) {
            i = Sdk.SDKError.Reason.PRIVACY_URL_ERROR_VALUE;
        } else {
            if (i2 != 3) {
                throw new NoWhenBranchMatchedException();
            }
            i = 72;
        }
        layoutParams.width = iah0.a(i);
        ViewGroup.LayoutParams layoutParams2 = frameLayout.getLayoutParams();
        int i4 = iArr[faveSmallSize.ordinal()];
        if (i4 == 1) {
            i3 = 68;
        } else if (i4 == 2) {
            i3 = 77;
        } else if (i4 != 3) {
            throw new NoWhenBranchMatchedException();
        }
        layoutParams2.height = iah0.a(i3);
        textView.setTextSize(faveSmallSize == FaveSmallSize.SQUARE ? 16.0f : 14.0f);
    }

    public static boolean T6(FaveEntry faveEntry) {
        gmq gmqVar = faveEntry.i.f;
        if (gmqVar instanceof VideoAttachment) {
            return ((VideoAttachment) gmqVar).k.W9();
        }
        return false;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r3v63, types: [java.lang.Object, kotlin.Lazy] */
    /* JADX WARN: Type inference failed for: r9v11, types: [java.lang.Object, kotlin.Lazy] */
    @Override // xsna.qi6
    public final void E6(FaveEntry faveEntry) {
        String str;
        CharSequence d;
        CharSequence P;
        ArticleDonut.Placeholder placeholder;
        VideoFile A;
        String str2;
        FaveEntry faveEntry2 = faveEntry;
        FaveItem faveItem = faveEntry2.i;
        FaveItem faveItem2 = faveEntry2.i;
        gmq gmqVar = faveItem.f;
        String str3 = null;
        Drawable a2 = (!(gmqVar instanceof SnippetAttachment) || ((SnippetAttachment) gmqVar).q == null) ? null : m33.a(R.drawable.vk_icon_flash_circle_12, this.itemView.getContext());
        ImageView imageView = this.F;
        if (a2 != null) {
            imageView.setVisibility(0);
            imageView.setImageDrawable(a2);
        } else {
            imageView.setVisibility(8);
        }
        gmq gmqVar2 = faveItem.f;
        boolean T6 = T6(faveEntry2);
        CharSequence charSequence = "";
        TextView textView = this.H;
        InteractiveDurationView interactiveDurationView = this.I;
        if (T6) {
            gmq gmqVar3 = faveItem2.f;
            if (gmqVar3 instanceof VideoAttachment) {
                int duration = ((VideoAttachment) gmqVar3).k.getDuration();
                gpt0 gpt0Var = gpt0.a;
                str2 = z8s.a(duration);
            } else {
                str2 = null;
            }
            if (str2 == null) {
                str2 = "";
            }
            interactiveDurationView.setDurationText(str2);
            interactiveDurationView.setTextDescriptionVisible(false);
        } else {
            gmq gmqVar4 = faveItem2.f;
            if (gmqVar4 instanceof VideoAttachment) {
                int duration2 = ((VideoAttachment) gmqVar4).k.getDuration();
                gpt0 gpt0Var2 = gpt0.a;
                str = z8s.a(duration2);
            } else {
                str = null;
            }
            textView.setText(str);
        }
        if (gmqVar2 instanceof VideoAttachment) {
            VideoAttachment videoAttachment = (VideoAttachment) gmqVar2;
            bpn0 bpn0Var = VideoOverlayView.I;
            TextView textView2 = T6(faveEntry2) ? interactiveDurationView : textView;
            boolean c = fxc0.B().c(videoAttachment.k);
            VideoRestriction O = videoAttachment.k.O();
            com.vk.libvideo.design.view.overlay.b a3 = O != null ? ((a390) this.T.getValue()).a(O) : null;
            boolean z = videoAttachment.k.d8() || videoAttachment.k.z0();
            VideoPipStateHolder.a.getClass();
            yg5 c2 = VideoPipStateHolder.c();
            int i = 5;
            VideoOverlayView.b.a(new VideoOverlayView.a(this.D, this.N, new j6(i, this, faveEntry2), new x2e(this, 17), textView2, false, false, c, new k6k(videoAttachment, 9), new xg2(i, this, videoAttachment), a3, z, epx.f((c2 == null || (A = c2.A()) == null) ? null : A.a1(), videoAttachment.k.a1()), new akh(this, 15), (i1t0) this.U.getValue(), null, 65760));
        } else {
            R6(faveEntry2);
        }
        gmq gmqVar5 = faveItem.f;
        if (gmqVar5 instanceof ArticleAttachment) {
            String str4 = ((ArticleAttachment) gmqVar5).f.f;
            if (str4 != null) {
                charSequence = str4;
            }
        } else if (gmqVar5 instanceof SnippetAttachment) {
            SnippetAttachment snippetAttachment = (SnippetAttachment) gmqVar5;
            if (snippetAttachment.Db()) {
                ClassifiedJob classifiedJob = snippetAttachment.z;
                if (classifiedJob != null) {
                    charSequence = classifiedJob.c;
                }
                charSequence = null;
            } else {
                charSequence = snippetAttachment.g;
            }
        } else if (gmqVar5 instanceof FaveMarketItem) {
            charSequence = ((FaveMarketItem) gmqVar5).b.d;
        } else if (gmqVar5 instanceof VideoAttachment) {
            VideoAttachment videoAttachment2 = (VideoAttachment) gmqVar5;
            VideoFile videoFile = videoAttachment2.k;
            if (videoFile instanceof MusicVideoFile) {
                Context context = this.itemView.getContext();
                MusicVideoFile musicVideoFile = (MusicVideoFile) videoAttachment2.k;
                charSequence = s490.d(context, musicVideoFile.l, musicVideoFile.D1, R.attr.vk_ui_text_secondary);
            } else {
                charSequence = videoFile.getTitle();
            }
        } else {
            if (gmqVar5 instanceof Narrative) {
                charSequence = ((Narrative) gmqVar5).d;
            }
            charSequence = null;
        }
        gmq gmqVar6 = faveItem.f;
        if (gmqVar6 instanceof FaveMarketItem) {
            d = ((FaveMarketItem) gmqVar6).b.e;
        } else if (gmqVar6 instanceof Narrative) {
            Owner owner = ((Narrative) gmqVar6).f;
            if (owner != null) {
                d = owner.c;
            }
            d = null;
        } else {
            if (gmqVar6 instanceof VideoAttachment) {
                VideoAttachment videoAttachment3 = (VideoAttachment) gmqVar6;
                if (videoAttachment3.k instanceof MusicVideoFile) {
                    Context context2 = this.itemView.getContext();
                    MusicVideoFile musicVideoFile2 = (MusicVideoFile) videoAttachment3.k;
                    d = s490.d(context2, s490.i(musicVideoFile2.B1), s490.c(musicVideoFile2.C1), R.attr.vk_ui_text_secondary);
                }
            }
            d = null;
        }
        gmq gmqVar7 = faveItem.f;
        if (gmqVar7 instanceof ArticleAttachment) {
            Owner owner2 = ((ArticleAttachment) gmqVar7).f.h;
            if (owner2 != null) {
                P = owner2.c;
            }
            P = null;
        } else if (gmqVar7 instanceof SnippetAttachment) {
            SnippetAttachment snippetAttachment2 = (SnippetAttachment) gmqVar7;
            if (snippetAttachment2.Db()) {
                ClassifiedJob classifiedJob2 = snippetAttachment2.z;
                if (classifiedJob2 != null) {
                    P = classifiedJob2.b;
                }
                P = null;
            } else {
                P = snippetAttachment2.i;
            }
        } else if (gmqVar7 instanceof FaveMarketItem) {
            Price price = ((FaveMarketItem) gmqVar7).b.h;
            String str5 = price.e;
            String str6 = price.f;
            if (str6 == null || str6.length() == 0) {
                P = str5;
            } else {
                SpannableStringBuilder spannableStringBuilder = this.P;
                spannableStringBuilder.clear();
                SpannableStringBuilder append = spannableStringBuilder.append(str5, new m7s(R.attr.vk_ui_text_primary), 33);
                Context context3 = this.itemView.getContext();
                FontFamily fontFamily = FontFamily.MEDIUM;
                int i2 = a.C1933a.C1934a.$EnumSwitchMapping$0[TextSizeUnit.SP.ordinal()];
                float f = 13.0f;
                if (i2 != 1) {
                    if (i2 != 2) {
                        throw new NoWhenBranchMatchedException();
                    }
                    f = com.vk.typography.b.b(13.0f);
                }
                append.setSpan(new qup0(cqi.a(Font.Companion, fontFamily, f, context3)), 0, append.length(), 33);
                P = append.append((CharSequence) rik0.b(7.0f)).append(str6, new StrikethroughSpan(), 33);
            }
        } else {
            if (gmqVar7 instanceof VideoAttachment) {
                VideoFile videoFile2 = ((VideoAttachment) gmqVar7).k;
                if (videoFile2 instanceof MusicVideoFile) {
                    MusicVideoFile musicVideoFile3 = (MusicVideoFile) videoFile2;
                    P = b.C0795b.d(musicVideoFile3.F1, musicVideoFile3.E1);
                } else {
                    String j1 = videoFile2.j1();
                    if (j1 == null || j1.length() == 0) {
                        P = videoFile2.P();
                    } else {
                        cvk cvkVar = s420.a;
                        P = s420.a(videoFile2.j1()).toString();
                    }
                }
            }
            P = null;
        }
        List<FaveTag> list = faveItem.e;
        List<FaveTag> list2 = list;
        int i3 = (((P == null || P.length() == 0) ? 1 : 0) ^ 1) + (((d == null || d.length() == 0) ? 1 : 0) ^ 1) + (((list2 == null || list2.isEmpty()) ? 1 : 0) ^ 1);
        TextView textView3 = this.E;
        bwt0.p0(textView3, true);
        boolean z2 = !list2.isEmpty();
        bwt0.p0(this.M, z2);
        FaveTagViewGroup faveTagViewGroup = this.L;
        bwt0.p0(faveTagViewGroup, z2);
        boolean z3 = P == null || P.length() == 0;
        TextView textView4 = this.G;
        bwt0.p0(textView4, !z3);
        boolean z4 = (d == null || d.length() == 0 || i3 >= 3) ? false : true;
        TextView textView5 = this.J;
        bwt0.p0(textView5, z4);
        textView3.setText(charSequence);
        textView4.setText(P);
        textView5.setText(d);
        faveTagViewGroup.setTags(list);
        textView3.setMaxLines(i3 >= 2 ? 1 : 2);
        gmq gmqVar8 = faveItem.f;
        boolean z5 = gmqVar8 instanceof ArticleAttachment;
        TextView textView6 = this.O;
        if (z5) {
            ArticleAttachment articleAttachment = (ArticleAttachment) gmqVar8;
            if (articleAttachment.f.d()) {
                textView6.setCompoundDrawablesRelativeWithIntrinsicBounds(dhr0.t.b(R.drawable.vk_icon_star_circle_12, R.attr.vk_ui_icon_secondary), (Drawable) null, (Drawable) null, (Drawable) null);
                ArticleDonut articleDonut = articleAttachment.f.q;
                if (articleDonut != null && (placeholder = articleDonut.c) != null) {
                    str3 = placeholder.b;
                }
                textView6.setText(str3);
                bwt0.p0(textView6, true);
                return;
            }
        }
        bwt0.p0(textView6, false);
    }

    public final void R6(FaveEntry faveEntry) {
        String b;
        ImageSize Cb;
        Image image;
        ImageSize Cb2;
        FaveItem faveItem = faveEntry.i;
        gmq gmqVar = faveItem.f;
        boolean z = true;
        baf0 baf0Var = null;
        if (gmqVar instanceof ArticleAttachment) {
            b = ((ArticleAttachment) gmqVar).h9();
        } else if (gmqVar instanceof SnippetAttachment) {
            Photo photo = ((SnippetAttachment) gmqVar).p;
            if (photo != null && (image = photo.y) != null && (Cb2 = image.Cb(iah0.a(Sdk.SDKError.Reason.PRIVACY_URL_ERROR_VALUE), true, false)) != null) {
                b = Cb2.d.d;
            }
            b = null;
        } else if (gmqVar instanceof FaveMarketItem) {
            Image image2 = ((FaveMarketItem) gmqVar).b.n;
            if (image2 != null && (Cb = image2.Cb(iah0.a(Sdk.SDKError.Reason.PRIVACY_URL_ERROR_VALUE), true, false)) != null) {
                b = Cb.d.d;
            }
            b = null;
        } else if (gmqVar instanceof VideoAttachment) {
            ImageSize Cb3 = ((VideoAttachment) gmqVar).k.getImage().Cb(iah0.a(Sdk.SDKError.Reason.PRIVACY_URL_ERROR_VALUE), true, false);
            if (Cb3 != null) {
                b = Cb3.d.d;
            }
            b = null;
        } else {
            if (gmqVar instanceof Narrative) {
                Serializer.c<Narrative> cVar = Narrative.CREATOR;
                b = Narrative.a.b((Narrative) gmqVar, iah0.a(100));
            }
            b = null;
        }
        VKImageView vKImageView = this.D;
        vKImageView.load(b);
        vKImageView.setVisibility(0);
        if (b != null && b.length() != 0) {
            z = false;
        }
        ImageView imageView = this.K;
        bwt0.p0(imageView, z);
        gmq gmqVar2 = faveItem.f;
        if (gmqVar2 instanceof ArticleAttachment) {
            baf0Var = dhr0.t.b(R.drawable.vk_icon_article_36, R.attr.vk_ui_vkontakte_color_placeholder_icon_foreground_primary);
        } else if (gmqVar2 instanceof SnippetAttachment) {
            baf0Var = dhr0.t.b(R.drawable.vk_icon_linked_24, R.attr.vk_ui_vkontakte_color_placeholder_icon_foreground_primary);
        }
        imageView.setImageDrawable(baf0Var);
        boolean T6 = T6(faveEntry);
        TextView textView = this.H;
        InteractiveDurationView interactiveDurationView = this.I;
        if (T6) {
            bwt0.p0(interactiveDurationView, faveItem.f instanceof VideoAttachment);
            bwt0.p0(textView, false);
        } else {
            bwt0.p0(textView, faveItem.f instanceof VideoAttachment);
            bwt0.p0(interactiveDurationView, false);
        }
        f4m.j(this.N);
    }
}
