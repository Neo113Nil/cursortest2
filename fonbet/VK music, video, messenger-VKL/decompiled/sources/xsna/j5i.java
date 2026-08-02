package xsna;

import android.app.Activity;
import android.content.Context;
import android.content.ContextWrapper;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffColorFilter;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.os.Parcelable;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;
import com.vk.bridges.ImageViewer;
import com.vk.core.serialize.Serializer;
import com.vk.core.utils.VerifyInfoHelper;
import com.vk.core.view.components.button.VkButton;
import com.vk.core.view.components.picture.VkImage;
import com.vk.dto.attachments.SnippetAttachment;
import com.vk.dto.common.Attachment;
import com.vk.dto.common.AttachmentWithMedia;
import com.vk.dto.common.Image;
import com.vk.dto.common.ImageSize;
import com.vk.dto.common.MusicVideoFile;
import com.vk.dto.common.VerifyInfo;
import com.vk.dto.common.VideoFile;
import com.vk.dto.common.restrictions.PhotoRestriction;
import com.vk.dto.common.restrictions.RestrictionButton;
import com.vk.dto.common.restrictions.VideoRestriction;
import com.vk.dto.newsfeed.Owner;
import com.vk.dto.newsfeed.entries.Photos;
import com.vk.dto.newsfeed.entries.Post;
import com.vk.dto.newsfeed.entries.PromoPost;
import com.vk.dto.photo.Photo;
import com.vk.feed.core.models.Description;
import com.vk.feed.core.models.EntryTitle;
import com.vk.feed.core.models.OverlayImage;
import com.vk.feed.core.models.Text;
import com.vk.feed.core.models.actions.ActionOpenModal;
import com.vk.feed.core.models.actions.HeaderAction;
import com.vk.feed.core.models.attachment.CompactAttachmentStyle;
import com.vk.feed.core.models.attachment.CompactRemovablePhotoStyle;
import com.vk.feed.core.models.attachment.EntryAttachment;
import com.vk.feed.core.models.attachment.EntryPhotoStyle;
import com.vk.feed.core.models.news.NewsEntry;
import com.vk.libvideo.api.ui.VideoResizer;
import com.vk.media.player.PlayerError;
import com.vk.newsfeed.common.views.StackSquareView;
import com.vk.newsfeed.common.views.header.CompactHeaderView;
import com.vk.newsfeed.common.views.header.HeaderPhotoView;
import com.vk.newsfeed.presentation.model.AdClickContext;
import com.vkontakte.android.R;
import com.vkontakte.android.attachments.AlbumAttachment;
import com.vkontakte.android.attachments.DocumentAttachment;
import com.vkontakte.android.attachments.LinkAttachment;
import com.vkontakte.android.attachments.MarketAttachment;
import com.vkontakte.android.attachments.MarketLinkAttachment;
import com.vkontakte.android.attachments.MarketMessageOwnerAttachment;
import com.vkontakte.android.attachments.NarrativeAttachment;
import com.vkontakte.android.attachments.PhotoAttachment;
import com.vkontakte.android.attachments.ShitAttachment;
import com.vkontakte.android.attachments.VideoAttachment;
import com.vkontakte.android.data.PostInteract;
import java.util.ArrayList;
import java.util.List;
import kotlin.LazyThreadSafetyMode;
import xsna.h7u0;
import xsna.v5a0;

/* compiled from: CompactAttachmentHolder.kt */
/* loaded from: classes4.dex */
public class j5i extends tb6 implements View.OnClickListener, blc0, io2, HeaderPhotoView.c, i7o, too0 {
    public final kdg0 E;
    public final HeaderPhotoView F;
    public final VkImage G;
    public final StackSquareView H;
    public final TextView I;
    public final TextView J;
    public final View K;
    public final TextView L;
    public final VkButton M;
    public final View N;
    public final View O;
    public final ImageView P;
    public x64 Q;
    public final v5a0 R;
    public final com.vk.newsfeed.common.recycler.holders.h S;
    public final float T;
    public qog0 U;
    public final float V;
    public final float W;
    public final float X;
    public final qog0 Y;
    public io.reactivex.rxjava3.disposables.c Z;
    public VideoRestriction a0;
    public VideoFile b0;
    public final int c0;
    public final float d0;
    public final int e0;
    public final Object f0;
    public e6o g0;

    /* compiled from: CompactAttachmentHolder.kt */
    public static final /* synthetic */ class a {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;

        static {
            int[] iArr = new int[EntryPhotoStyle.values().length];
            try {
                iArr[EntryPhotoStyle.Circle.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[EntryPhotoStyle.Squircle.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            $EnumSwitchMapping$0 = iArr;
        }
    }

    public j5i(ViewGroup viewGroup, kdg0 kdg0Var) {
        super(R.layout.attach_compact_v2_lego, viewGroup);
        this.E = kdg0Var;
        viewGroup.getContext();
        HeaderPhotoView headerPhotoView = (HeaderPhotoView) this.itemView.findViewById(R.id.attach_compact_image);
        this.F = headerPhotoView;
        VkImage vkImage = (VkImage) this.itemView.findViewById(R.id.attach_compact_photo);
        this.G = vkImage;
        this.H = (StackSquareView) this.itemView.findViewById(R.id.attach_compact_images_stack);
        this.I = (TextView) this.itemView.findViewById(R.id.attach_compact_title);
        this.J = (TextView) this.itemView.findViewById(R.id.attach_compact_restriction);
        this.K = this.itemView.findViewById(R.id.attach_compact_verified);
        this.L = (TextView) this.itemView.findViewById(R.id.attach_compact_subtitle);
        VkButton vkButton = (VkButton) this.itemView.findViewById(R.id.attach_compact_button);
        this.M = vkButton;
        this.N = this.itemView.findViewById(R.id.attach_compact_chevron);
        View findViewById = this.itemView.findViewById(R.id.attach_remove);
        this.O = findViewById;
        this.P = (ImageView) this.itemView.findViewById(R.id.attach_compact_overlay);
        this.R = new v5a0(vkImage);
        this.S = new com.vk.newsfeed.common.recycler.holders.h();
        float a2 = cn70.a() * 6.0f;
        this.T = a2;
        this.U = new qog0(a2, dhr0.t.c(R.attr.vk_ui_background_secondary));
        this.V = cn70.a() * 12.0f;
        float a3 = cn70.a() * 8.0f;
        this.W = a3;
        this.X = cn70.a() * 20.0f;
        this.Y = new qog0(a3, n8g.l(-16777216, an10.a(76.5d)));
        this.c0 = cn70.b(36);
        float a4 = cn70.a() * 8.0f;
        this.d0 = a4;
        this.e0 = cn70.b(24);
        this.f0 = msy.a(LazyThreadSafetyMode.NONE, new com.vk.movika.sdk.base.model.e(this, 25));
        View.OnClickListener onClickListener = this.g0;
        onClickListener = onClickListener == null ? this : onClickListener;
        this.itemView.setOnClickListener(onClickListener);
        vkButton.setOnClickListener(onClickListener);
        findViewById.setOnClickListener(onClickListener);
        headerPhotoView.setPhotoClickListener(this);
        vkImage.setCornerRadius(a4);
        vkImage.y0(iah0.b(0.5f), dhr0.Y(R.attr.vk_ui_image_border_alpha, this.itemView.getContext()));
    }

    @Override // xsna.blc0
    public final void D1(boolean z) {
        bwt0.p0(this.O, z);
    }

    @Override // xsna.io2
    public final boolean G() {
        return false;
    }

    @Override // xsna.io2
    public final boolean M() {
        return false;
    }

    /* JADX WARN: Type inference failed for: r0v1, types: [java.lang.Object, kotlin.Lazy] */
    @Override // xsna.too0
    public final void Ng() {
        abg0 abg0Var = dhr0.t;
        this.U = new qog0(this.T, abg0Var.c(R.attr.vk_ui_background_secondary));
        ((ccr0) this.f0.getValue()).setColorFilter(new PorterDuffColorFilter(abg0Var.c(R.attr.vk_ui_icon_medium), PorterDuff.Mode.SRC_IN));
    }

    @Override // xsna.qi6
    public final void Q6(s6o s6oVar) {
        super.Q6(s6oVar);
        e6o a2 = s6oVar.a(this, s6oVar.e);
        this.g0 = a2;
        this.itemView.setOnClickListener(a2);
        this.M.setOnClickListener(a2);
        this.O.setOnClickListener(a2);
    }

    @Override // xsna.tb6
    public final boolean R6() {
        Attachment attachment = this.D;
        if (attachment == null) {
            return false;
        }
        if (!e7(attachment)) {
            CompactAttachmentStyle compactAttachmentStyle = this.C;
            if ((compactAttachmentStyle != null ? compactAttachmentStyle.b : null) != null) {
                return true;
            }
        }
        if (attachment instanceof AlbumAttachment) {
            return super.R6();
        }
        if (!(attachment instanceof PhotoAttachment)) {
            if (!(attachment instanceof VideoAttachment)) {
                return super.R6();
            }
            VideoFile videoFile = ((VideoAttachment) attachment).k;
            if (!f7(attachment) && (videoFile.Z9() || J0() == null)) {
                return false;
            }
        }
        return true;
    }

    @Override // com.vk.newsfeed.common.views.header.HeaderPhotoView.c
    public final boolean S1() {
        HeaderAction headerAction;
        if (jjc.b()) {
            return false;
        }
        CompactAttachmentStyle compactAttachmentStyle = this.C;
        Boolean bool = null;
        if (compactAttachmentStyle != null && (headerAction = compactAttachmentStyle.b) != null) {
            bool = Boolean.valueOf(di60.O(headerAction, this.itemView.getContext(), null));
        }
        return bool != null;
    }

    /* JADX WARN: Type inference failed for: r0v16, types: [java.lang.Object, kotlin.Lazy] */
    @Override // xsna.tb6
    public final void T6(Attachment attachment, CompactAttachmentStyle compactAttachmentStyle) {
        boolean z;
        Image image;
        ImageSize Cb;
        PhotoRestriction photoRestriction;
        PhotoRestriction photoRestriction2;
        Integer valueOf = Integer.valueOf(R.drawable.vk_icon_hide_outline_24);
        Integer valueOf2 = Integer.valueOf(R.drawable.vk_icon_block_outline_24);
        this.a0 = null;
        this.b0 = null;
        io.reactivex.rxjava3.disposables.c cVar = this.Z;
        if (cVar != null) {
            cVar.dispose();
        }
        this.Z = null;
        boolean z2 = attachment instanceof PhotoAttachment;
        if (z2) {
            NewsEntry q6 = q6();
            v5a0 v5a0Var = this.R;
            v5a0Var.d = q6;
            v5a0Var.e = null;
        }
        boolean z3 = attachment instanceof AlbumAttachment;
        ImageView imageView = this.P;
        VkButton vkButton = this.M;
        View view = this.N;
        if (z3) {
            Photo photo = ((AlbumAttachment) attachment).l;
            if (!photo.Ib()) {
                X6(attachment, compactAttachmentStyle);
                return;
            }
            PhotoRestriction photoRestriction3 = photo.L;
            d7(photoRestriction3 != null ? photoRestriction3.b : null);
            PhotoRestriction photoRestriction4 = photo.L;
            if (photoRestriction4 == null) {
                valueOf = null;
            } else if (!photoRestriction4.d) {
                valueOf = valueOf2;
            }
            Y6(valueOf);
            if (!R6() || ((photoRestriction2 = photo.L) != null && !photoRestriction2.d)) {
                r5 = false;
            }
            bwt0.p0(view, r5);
            bwt0.p0(vkButton, false);
            bwt0.p0(imageView, false);
            return;
        }
        if (z2) {
            if (compactAttachmentStyle instanceof CompactRemovablePhotoStyle) {
                X6(attachment, compactAttachmentStyle);
                return;
            }
            Photo photo2 = ((PhotoAttachment) attachment).l;
            if (!photo2.Ib()) {
                X6(attachment, compactAttachmentStyle);
                return;
            }
            PhotoRestriction photoRestriction5 = photo2.L;
            if (photoRestriction5 == null) {
                valueOf = null;
            } else if (!photoRestriction5.d) {
                valueOf = valueOf2;
            }
            c7(valueOf != null ? dhr0.t.a(valueOf.intValue()) : null);
            PhotoRestriction photoRestriction6 = photo2.L;
            d7(photoRestriction6 != null ? photoRestriction6.b : null);
            if (!R6() || ((photoRestriction = photo2.L) != null && !photoRestriction.d)) {
                r5 = false;
            }
            bwt0.p0(view, r5);
            bwt0.p0(vkButton, false);
            bwt0.p0(imageView, false);
            return;
        }
        if (!(attachment instanceof VideoAttachment)) {
            if (attachment instanceof MarketAttachment) {
                X6(attachment, compactAttachmentStyle);
                dz5.J(((MarketAttachment) attachment).f, this.I);
                return;
            }
            boolean z4 = attachment instanceof MarketLinkAttachment;
            TextView textView = this.L;
            if (z4) {
                X6(attachment, compactAttachmentStyle);
                xo9.A(textView, ((MarketLinkAttachment) attachment).f);
                return;
            } else if (!(attachment instanceof MarketMessageOwnerAttachment)) {
                X6(attachment, compactAttachmentStyle);
                return;
            } else {
                X6(attachment, compactAttachmentStyle);
                xo9.A(textView, ((MarketMessageOwnerAttachment) attachment).g);
                return;
            }
        }
        VideoFile videoFile = ((VideoAttachment) attachment).k;
        if (!fxc0.B().c(videoFile)) {
            if (!videoFile.Z9()) {
                X6(attachment, compactAttachmentStyle);
                return;
            }
            Y6(valueOf2);
            d7(videoFile.J1());
            bwt0.p0(view, false);
            bwt0.p0(vkButton, false);
            bwt0.p0(imageView, false);
            return;
        }
        VideoRestriction O = videoFile.O();
        this.a0 = videoFile.O();
        this.b0 = videoFile;
        d7(O != null ? O.b : null);
        if (O != null && (image = O.g) != null && (Cb = image.Cb(this.e0, false, true)) != null) {
            r2 = Cb.d.d;
        }
        VkImage vkImage = this.G;
        if (r2 == null || r2.length() == 0) {
            z = false;
        } else {
            vkImage.clear();
            ?? r0 = this.f0;
            vkImage.J0((ccr0) r0.getValue(), ImageView.ScaleType.CENTER_INSIDE);
            ((ccr0) r0.getValue()).r(r2);
            vkImage.setBackgroundImage(this.U);
            z = true;
        }
        bwt0.p0(vkImage, z);
        bwt0.p0(this.F, false);
        bwt0.p0(this.H, false);
        io.reactivex.rxjava3.disposables.c subscribe = wjs0.b.a0(io.reactivex.rxjava3.android.schedulers.a.b()).b0(ayr0.class).subscribe(new n20(new o1e(this, 8), 17));
        hg1.b(this.itemView, subscribe);
        this.Z = subscribe;
        bwt0.p0(view, R6() && O != null && O.f);
        bwt0.p0(vkButton, false);
        bwt0.p0(imageView, false);
    }

    @Override // com.vk.newsfeed.common.views.header.HeaderPhotoView.c
    public final boolean U2() {
        CompactAttachmentStyle compactAttachmentStyle = this.C;
        return (compactAttachmentStyle != null ? compactAttachmentStyle.b : null) != null;
    }

    @Override // xsna.tb6
    public final void U6(View view) {
        ActionOpenModal.ModalButton modalButton;
        ActionOpenModal.ModalButton modalButton2;
        if (f7(this.D)) {
            h7(view);
            return;
        }
        Attachment attachment = this.D;
        boolean z = false;
        if (!(attachment instanceof PhotoAttachment) ? false : ((PhotoAttachment) attachment).l.Hb()) {
            Attachment attachment2 = this.D;
            if (attachment2 instanceof PhotoAttachment) {
                this.E.h(this.itemView.getContext(), ((PhotoAttachment) attachment2).l);
                return;
            }
            return;
        }
        Attachment attachment3 = this.D;
        if ((attachment3 instanceof MarketLinkAttachment) || (attachment3 instanceof MarketMessageOwnerAttachment)) {
            super.U6(view);
            return;
        }
        CompactAttachmentStyle compactAttachmentStyle = this.C;
        HeaderAction headerAction = null;
        if (!(((compactAttachmentStyle == null || (modalButton2 = compactAttachmentStyle.c) == null) ? null : modalButton2.c) != null)) {
            super.U6(view);
            return;
        }
        if (compactAttachmentStyle != null && (modalButton = compactAttachmentStyle.c) != null) {
            headerAction = modalButton.c;
        }
        NewsEntry q6 = q6();
        if (q6 != null && headerAction != null) {
            z = di60.O(headerAction, this.itemView.getContext(), q6);
        }
        if (z) {
            return;
        }
        super.U6(view);
    }

    /* JADX WARN: Code restructure failed: missing block: B:17:0x0035, code lost:
    
        if (((r4 == null || r1 == null) ? false : xsna.di60.O(r1, r22.itemView.getContext(), r4)) != false) goto L4;
     */
    /* JADX WARN: Type inference failed for: r9v4, types: [java.lang.Object, kotlin.Lazy] */
    @Override // xsna.tb6
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void W6(View view) {
        boolean z;
        List<EntryAttachment> N7;
        PostInteract postInteract;
        Attachment attachment = this.D;
        if (attachment != null) {
            if (!e7(attachment)) {
                CompactAttachmentStyle compactAttachmentStyle = this.C;
                if ((compactAttachmentStyle != null ? compactAttachmentStyle.b : null) != null) {
                    HeaderAction headerAction = compactAttachmentStyle != null ? compactAttachmentStyle.b : null;
                    NewsEntry q6 = q6();
                }
            }
            if (attachment instanceof AlbumAttachment) {
                super.W6(view);
                return;
            }
            if (attachment instanceof PhotoAttachment) {
                Photo photo = ((PhotoAttachment) attachment).l;
                if (photo.Hb()) {
                    this.E.h(this.itemView.getContext(), photo);
                    return;
                }
                Context context = this.itemView.getContext();
                Parcelable q62 = q6();
                u1c0 J0 = J0();
                boolean z2 = q62 instanceof ShitAttachment;
                v5a0 v5a0Var = this.R;
                if (z2) {
                    v5a0Var.getClass();
                    hd60.a().r0(context, (ShitAttachment) q62, J0 != null ? J0.k : -1, AdClickContext.IMAGE);
                    return;
                }
                ImageViewer.c<AttachmentWithMedia> cVar = v5a0Var.b;
                ?? r9 = v5a0Var.c;
                if (cVar == null) {
                    fsx0 fsx0Var = q62 instanceof fsx0 ? (fsx0) q62 : null;
                    if (fsx0Var != null && (N7 = fsx0Var.N7()) != null) {
                        ArrayList arrayList = new ArrayList();
                        int size = N7.size();
                        int i = 0;
                        for (int i2 = 0; i2 < size; i2++) {
                            Attachment attachment2 = N7.get(i2).b;
                            if (attachment == attachment2) {
                                i = arrayList.size();
                            }
                            if ((attachment2 instanceof PhotoAttachment) && !(attachment2 instanceof AlbumAttachment)) {
                                arrayList.add(attachment2);
                            } else if ((attachment2 instanceof DocumentAttachment) && ((DocumentAttachment) attachment2).Ib()) {
                                arrayList.add(attachment2);
                            }
                        }
                        if (J0 != null && (postInteract = J0.m) != null) {
                            postInteract.zb(PostInteract.Type.open_photo);
                        }
                        Integer valueOf = q62 instanceof Photos ? Integer.valueOf(((Photos) q62).r) : null;
                        v5a0Var.e = Integer.valueOf(i);
                        Activity h = e3m.h(context);
                        if (h != null) {
                            ((v5a0.a) r9.getValue()).c = valueOf;
                            v5a0.a aVar = (v5a0.a) r9.getValue();
                            int size2 = N7.size();
                            fp7 fp7Var = aVar.a;
                            fp7Var.a = size2;
                            fp7Var.b = false;
                            fp7Var.c = true;
                            v5a0Var.b = ImageViewer.f(myc0.d(), i, arrayList, h, (v5a0.a) r9.getValue(), null, null, null, false, null, false, 4080);
                        }
                    }
                }
            } else {
                if (!(attachment instanceof VideoAttachment)) {
                    if (attachment instanceof NarrativeAttachment) {
                        View view2 = this.F;
                        if (!bwt0.K(view2)) {
                            view2 = this.G;
                            if (!bwt0.K(view2)) {
                                view2 = this.H;
                                if (!bwt0.K(view2)) {
                                    view2 = this.itemView;
                                }
                            }
                        }
                        super.W6(view2);
                        return;
                    }
                    if (attachment instanceof LinkAttachment) {
                        LinkAttachment linkAttachment = (LinkAttachment) attachment;
                        NewsEntry q63 = q6();
                        if (((q63 instanceof PromoPost) || ((q63 instanceof Post) && ((Post) q63).dc())) && linkAttachment.m != null) {
                            super.U6(view);
                            return;
                        } else {
                            super.W6(view);
                            return;
                        }
                    }
                    if (!(attachment instanceof SnippetAttachment)) {
                        super.W6(view);
                        return;
                    }
                    SnippetAttachment snippetAttachment = (SnippetAttachment) attachment;
                    NewsEntry q64 = q6();
                    if (((q64 instanceof PromoPost) || ((q64 instanceof Post) && ((Post) q64).dc())) && snippetAttachment.v != null) {
                        super.U6(view);
                        return;
                    } else {
                        super.W6(view);
                        return;
                    }
                }
                if (f7(attachment)) {
                    h7(view);
                    return;
                }
                Context context2 = this.itemView.getContext();
                u1c0 J02 = J0();
                VideoAttachment videoAttachment = (VideoAttachment) attachment;
                com.vk.newsfeed.common.recycler.holders.h hVar = this.S;
                hVar.getClass();
                while (true) {
                    z = context2 instanceof Activity;
                    if (z || !(context2 instanceof ContextWrapper)) {
                        break;
                    } else {
                        context2 = ((ContextWrapper) context2).getBaseContext();
                    }
                }
                VideoFile videoFile = videoAttachment.k;
                if (videoFile != null) {
                    if (z) {
                        Activity activity = (Activity) context2;
                        if (epx.f(videoFile.toString(), activity.getIntent().getStringExtra("from_video"))) {
                            activity.finish();
                            return;
                        }
                    }
                    if (videoFile.Z9() && !(videoFile instanceof MusicVideoFile) && !hd60.a().x0(videoFile)) {
                        cvk.u(gpt0.n(PlayerError.ERROR_CONTENT_RESTRICTED, false), false);
                        return;
                    }
                    if (z) {
                        Activity activity2 = (Activity) context2;
                        if (videoFile.isEmpty()) {
                            w1s0.g(activity2, videoFile.I0(), videoFile.o0(), videoFile.C1(), false, false, false, new k2e(videoAttachment, hVar, activity2, J02, this, 2), 224);
                            return;
                        }
                        com.vk.newsfeed.common.recycler.holders.h.a(activity2, J02, videoAttachment, videoFile, this);
                        PostInteract postInteract2 = videoAttachment.g;
                        if (postInteract2 != null) {
                            postInteract2.zb(PostInteract.Type.video_start);
                        }
                    }
                }
            }
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:98:0x00f2, code lost:
    
        if (r0 == null) goto L52;
     */
    /* JADX WARN: Removed duplicated region for block: B:78:0x0099  */
    /* JADX WARN: Removed duplicated region for block: B:79:0x009e  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void X6(Attachment attachment, CompactAttachmentStyle compactAttachmentStyle) {
        String str;
        String str2;
        String str3;
        Image image;
        ImageSize Cb;
        Drawable drawable;
        Integer s;
        ImageSize Cb2;
        Text text;
        Text text2;
        Text text3;
        b7(attachment, compactAttachmentStyle);
        List<Image> list = compactAttachmentStyle.d;
        List<Image> list2 = compactAttachmentStyle.d;
        EntryTitle entryTitle = compactAttachmentStyle.g;
        String str4 = compactAttachmentStyle.f;
        int size = list.size();
        String str5 = null;
        StackSquareView stackSquareView = this.H;
        VkImage vkImage = this.G;
        HeaderPhotoView headerPhotoView = this.F;
        boolean z = true;
        if (size > 1) {
            bwt0.p0(headerPhotoView, false);
            bwt0.p0(vkImage, false);
            bwt0.p0(stackSquareView, true);
            int size2 = list2.size();
            if (size2 > 3) {
                size2 = 3;
            }
            stackSquareView.setCount(size2);
            for (int i = 0; i < size2; i++) {
                ImageSize Cb3 = list2.get(i).Cb(stackSquareView.s, true, false);
                stackSquareView.h(i, Cb3 != null ? Cb3.d.d : null);
            }
        } else {
            boolean z2 = attachment instanceof PhotoAttachment;
            int i2 = this.c0;
            if (!z2 || (attachment instanceof AlbumAttachment)) {
                bwt0.p0(headerPhotoView, true);
                bwt0.p0(vkImage, false);
                bwt0.p0(stackSquareView, false);
                Image image2 = (Image) j5g.a0(list2);
                OverlayImage overlayImage = compactAttachmentStyle.i;
                String str6 = (image2 == null || (Cb = image2.Cb(i2, true, false)) == null) ? null : Cb.d.d;
                Integer s2 = znk0.s(this.itemView.getContext(), str4);
                if (overlayImage != null && (image = overlayImage.b) != null) {
                    Serializer.c<Owner> cVar = Owner.CREATOR;
                    str2 = Owner.a.a(CompactHeaderView.v, image);
                }
                if (overlayImage != null) {
                    str2 = overlayImage.c;
                    str = str2;
                    this.F.m(str6, s2, str, (overlayImage != null || (str3 = overlayImage.d) == null) ? null : znk0.r(this.itemView.getContext(), str3), compactAttachmentStyle.e);
                } else {
                    str = null;
                    this.F.m(str6, s2, str, (overlayImage != null || (str3 = overlayImage.d) == null) ? null : znk0.r(this.itemView.getContext(), str3), compactAttachmentStyle.e);
                }
            } else {
                bwt0.p0(headerPhotoView, false);
                bwt0.p0(vkImage, true);
                bwt0.p0(stackSquareView, false);
                Image image3 = (Image) j5g.a0(list2);
                String str7 = (image3 == null || (Cb2 = image3.Cb(i2, true, false)) == null) ? null : Cb2.d.d;
                try {
                    s = znk0.s(this.itemView.getContext(), str4);
                } catch (Throwable th) {
                    com.vk.metrics.eventtracking.b.a.a(th);
                }
                if (s != null) {
                    drawable = dhr0.t.a(s.intValue());
                    if (drawable == null) {
                        c7(drawable);
                    } else if (str7 != null && str7.length() != 0) {
                        vkImage.o0(str7, null);
                        vkImage.setPlaceholderImage(this.U);
                        vkImage.setScaleType(ImageView.ScaleType.CENTER_CROP);
                        vkImage.setBackgroundImage(null);
                    }
                }
                drawable = null;
                if (drawable == null) {
                }
            }
        }
        String str8 = (entryTitle == null || (text3 = entryTitle.b) == null) ? null : text3.b;
        TextView textView = this.I;
        xo9.A(textView, str8);
        textView.setCompoundDrawablesRelativeWithIntrinsicBounds((Drawable) null, (Drawable) null, (Drawable) null, (Drawable) null);
        boolean z3 = entryTitle != null && entryTitle.c;
        View view = this.K;
        if (z3) {
            view.setBackground(VerifyInfoHelper.h(VerifyInfoHelper.a, new VerifyInfo(true, false, false, false, false, false, 62, null), this.itemView.getContext(), null, 28));
        }
        bwt0.p0(view, z3);
        Description description = compactAttachmentStyle.h;
        String str9 = (description == null || (text2 = description.b) == null) ? null : text2.b;
        TextView textView2 = this.L;
        xo9.A(textView2, str9);
        int i3 = bwt0.K(textView) ? 1 : 2;
        if (i3 != textView2.getMaxLines()) {
            textView2.setMaxLines(i3);
        }
        bwt0.p0(this.J, false);
        ActionOpenModal.ModalButton modalButton = compactAttachmentStyle.c;
        if (modalButton != null && (text = modalButton.b) != null) {
            str5 = text.b;
        }
        boolean z4 = compactAttachmentStyle instanceof CompactRemovablePhotoStyle;
        View view2 = this.N;
        VkButton vkButton = this.M;
        if (z4) {
            bwt0.p0(view2, false);
            bwt0.p0(vkButton, false);
            return;
        }
        if (str5 == null || str5.length() == 0) {
            bwt0.p0(view2, R6());
            bwt0.p0(vkButton, false);
            return;
        }
        if (str5.length() == 0) {
            z = false;
        } else {
            vkButton.setText(str5);
        }
        bwt0.p0(vkButton, z);
        vkButton.setContentDescription(str5);
        bwt0.p0(view2, false);
    }

    public final void Y6(Integer num) {
        EntryPhotoStyle entryPhotoStyle = EntryPhotoStyle.Square;
        HeaderPhotoView headerPhotoView = this.F;
        HeaderPhotoView.p(headerPhotoView, num, entryPhotoStyle, 13);
        bwt0.p0(headerPhotoView, true);
        bwt0.p0(this.H, false);
        bwt0.p0(this.G, false);
    }

    @Override // xsna.blc0
    public final void Z1(x64 x64Var) {
        this.Q = x64Var;
    }

    public void b7(Attachment attachment, CompactAttachmentStyle compactAttachmentStyle) {
        ImageSize Cb;
        boolean z = attachment instanceof SnippetAttachment;
        ImageView imageView = this.P;
        if (!z) {
            bwt0.p0(imageView, false);
            return;
        }
        if (((SnippetAttachment) attachment).q != null && compactAttachmentStyle.d.size() == 1) {
            Image image = (Image) j5g.a0(compactAttachmentStyle.d);
            String str = (image == null || (Cb = image.Cb(this.c0, true, false)) == null) ? null : Cb.d.d;
            if (znk0.s(this.itemView.getContext(), compactAttachmentStyle.f) == null && str != null && str.length() != 0) {
                bwt0.p0(imageView, true);
                qog0 qog0Var = this.Y;
                imageView.setBackground(qog0Var);
                imageView.setImageResource(R.drawable.vk_icon_flash_outline_24);
                int i = a.$EnumSwitchMapping$0[compactAttachmentStyle.e.ordinal()];
                qog0Var.j(i != 1 ? i != 2 ? this.W : this.V : this.X);
                return;
            }
        }
        bwt0.p0(imageView, false);
    }

    public final void c7(Drawable drawable) {
        boolean z;
        baf0 baf0Var = drawable != null ? new baf0(drawable, dhr0.t.c(R.attr.vk_ui_icon_medium)) : null;
        VkImage vkImage = this.G;
        if (baf0Var != null) {
            vkImage.clear();
            vkImage.J0(baf0Var, ImageView.ScaleType.CENTER_INSIDE);
            vkImage.setBackgroundImage(this.U);
            z = true;
        } else {
            z = false;
        }
        bwt0.p0(vkImage, z);
        bwt0.p0(this.F, false);
        bwt0.p0(this.H, false);
    }

    public final void d7(String str) {
        xo9.A(this.J, str);
        bwt0.p0(this.I, false);
        bwt0.p0(this.L, false);
        bwt0.p0(this.K, false);
    }

    public final boolean e7(Attachment attachment) {
        if (attachment instanceof AlbumAttachment) {
            return false;
        }
        if (attachment instanceof PhotoAttachment) {
            return ((PhotoAttachment) attachment).l.Hb();
        }
        if (attachment instanceof VideoAttachment) {
            return f7(attachment);
        }
        return false;
    }

    @Override // xsna.io2
    public final boolean f0() {
        return true;
    }

    public final boolean f7(Attachment attachment) {
        return (attachment instanceof VideoAttachment) && this.b0 != null && this.a0 != null && fxc0.B().c(this.b0);
    }

    @Override // xsna.io2
    public final Rect g0() {
        return new Rect();
    }

    @Override // xsna.io2
    public final VideoResizer.VideoFitType getContentScaleType() {
        return VideoResizer.VideoFitType.CROP;
    }

    public final void h7(View view) {
        VideoFile videoFile;
        VideoRestriction videoRestriction = this.a0;
        if (videoRestriction == null || (videoFile = this.b0) == null) {
            return;
        }
        Activity c = g2u0.c(view);
        RestrictionButton restrictionButton = videoRestriction.e;
        if (c == null || restrictionButton == null) {
            return;
        }
        h7u0.a aVar = new h7u0.a(c);
        aVar.h0(videoRestriction.b);
        aVar.a.f = videoRestriction.c;
        aVar.d0(restrictionButton.c, new gj3(videoFile, 2));
        aVar.W(R.string.close, null);
        aVar.m();
    }

    @Override // xsna.io2
    public final float i0() {
        return this.d0;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        if (view.equals(this.O)) {
            x64 x64Var = this.Q;
            if (x64Var != null) {
                x64Var.c(this.D);
                return;
            }
            return;
        }
        x64 x64Var2 = this.Q;
        if (x64Var2 != null) {
            if (x64Var2 != null) {
                x64Var2.a(this.D);
            }
        } else if (view.equals(this.M)) {
            U6(view);
        } else {
            W6(view);
        }
    }

    @Override // xsna.io2
    public final Rect t0() {
        return new Rect();
    }

    @Override // xsna.io2
    public final void C() {
    }

    @Override // xsna.io2
    public final void D0() {
    }

    @Override // xsna.io2
    public final void J() {
    }

    @Override // xsna.io2
    public final void e0() {
    }

    @Override // xsna.blc0
    public final void p5() {
    }

    @Override // xsna.blc0
    public final void j1(View.OnClickListener onClickListener) {
    }
}
