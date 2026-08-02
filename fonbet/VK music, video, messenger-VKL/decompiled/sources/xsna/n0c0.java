package xsna;

import android.content.Context;
import android.content.res.ColorStateList;
import android.graphics.Bitmap;
import android.graphics.drawable.Drawable;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.TextView;
import com.facebook.drawee.generic.RoundingParams;
import com.unity3d.services.UnityAdsConstants;
import com.vk.attachpicker.stickers.post.attach.StoryAttachImageView;
import com.vk.core.tool.view.galvitalayout.GalvitaLayout;
import com.vk.dto.common.Attachment;
import com.vk.dto.common.Image;
import com.vk.dto.common.ImageSize;
import com.vk.dto.common.restrictions.PhotoRestriction;
import com.vk.dto.common.restrictions.Restriction;
import com.vk.dto.common.restrictions.VideoRestriction;
import com.vk.dto.photo.Photo;
import com.vk.imageloader.view.VKImageView;
import com.vk.stickers.api.models.post.PostStickerStyle;
import com.vk.stories.design.view.stickers.post.RoundedFrameLayout;
import com.vkontakte.android.R;
import com.vkontakte.android.attachments.AlbumAttachment;
import com.vkontakte.android.attachments.DocumentAttachment;
import com.vkontakte.android.attachments.PhotoAttachment;
import com.vkontakte.android.attachments.VideoAttachment;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.EnumMap;
import java.util.Iterator;
import java.util.List;
import java.util.WeakHashMap;
import kotlin.Pair;
import kotlin.jvm.internal.Ref$IntRef;
import xsna.e3m;
import xsna.f5h0;
import xsna.i0c0;
import xsna.j6t0;
import xsna.q7c0;
import xsna.u7c0;

/* compiled from: PostAttachmentsViewsCache.kt */
/* loaded from: classes15.dex */
public final class n0c0 {
    public final EnumMap<PostStickerStyle, View> a = new EnumMap<>(PostStickerStyle.class);
    public final EnumMap<PostStickerStyle, View> b = new EnumMap<>(PostStickerStyle.class);
    public final EnumMap<PostStickerStyle, View> c = new EnumMap<>(PostStickerStyle.class);

    public n0c0(i0c0 i0c0Var) {
    }

    /* JADX WARN: Removed duplicated region for block: B:12:0x002b  */
    /* JADX WARN: Removed duplicated region for block: B:281:0x0749  */
    /* JADX WARN: Removed duplicated region for block: B:282:0x0022  */
    /* JADX WARN: Removed duplicated region for block: B:60:0x0668  */
    /* JADX WARN: Removed duplicated region for block: B:77:0x074f  */
    /* JADX WARN: Removed duplicated region for block: B:85:0x0759  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x001e  */
    /* JADX WARN: Removed duplicated region for block: B:92:0x0740  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final View a(u7c0 u7c0Var, q7c0 q7c0Var, boolean z, i0c0.a aVar) {
        u7c0.a aVar2;
        u7c0.a aVar3;
        View view;
        VKImageView vKImageView;
        u7c0.a aVar4;
        VKImageView vKImageView2;
        Bitmap bitmap;
        EnumMap<PostStickerStyle, View> enumMap;
        List<Attachment> list;
        PostStickerStyle postStickerStyle;
        u7c0.a aVar5;
        List<Attachment> list2;
        View view2;
        View view3;
        w64 l;
        boolean z2;
        View view4;
        int i;
        Pair pair;
        Pair pair2;
        ImageSize Cb;
        ImageSize Cb2;
        Photo photo;
        float minAspectRatio;
        float maxAspectRatio;
        Image image;
        ImageSize Cb3;
        q7c0 q7c0Var2 = q7c0Var;
        PostStickerStyle postStickerStyle2 = u7c0Var.j.a;
        if (z) {
            u7c0.d dVar = u7c0Var.f;
            if (dVar == null) {
                aVar3 = null;
                EnumMap<PostStickerStyle, View> enumMap2 = !z ? this.b : this.a;
                view = enumMap2.get(postStickerStyle2);
                if (view != null) {
                    if (q7c0Var2 == null || aVar3 == null) {
                        vKImageView = null;
                        aVar4 = aVar3;
                        enumMap = enumMap2;
                        view = null;
                    } else {
                        List<Attachment> list3 = aVar3.b;
                        Context h = postStickerStyle2.h();
                        if (q7c0Var2 instanceof q7c0.b.e) {
                            float f = j6t0.a;
                            int b = aVar.b();
                            cty ctyVar = new cty(aVar, 27);
                            View inflate = LayoutInflater.from(h).inflate(R.layout.sticker_video_post, (ViewGroup) null);
                            FrameLayout frameLayout = (FrameLayout) inflate.findViewById(R.id.image_container);
                            StoryAttachImageView storyAttachImageView = new StoryAttachImageView(inflate.getContext(), null, 6, 0);
                            frameLayout.removeAllViews();
                            storyAttachImageView.setId(R.id.image);
                            float f2 = j6t0.a;
                            storyAttachImageView.setImageCornerRadius(f2);
                            frameLayout.addView(storyAttachImageView, new FrameLayout.LayoutParams(-1, -2));
                            storyAttachImageView.setOnBindCompleted(ctyVar);
                            TextView textView = (TextView) inflate.findViewById(R.id.duration_text);
                            View findViewById = inflate.findViewById(R.id.duration);
                            VKImageView vKImageView3 = (VKImageView) inflate.findViewById(R.id.restriction_icon);
                            TextView textView2 = (TextView) inflate.findViewById(R.id.restriction_text);
                            Object a0 = j5g.a0(list3);
                            VideoAttachment videoAttachment = a0 instanceof VideoAttachment ? (VideoAttachment) a0 : null;
                            if (videoAttachment != null) {
                                ImageSize a = j6t0.a.a(videoAttachment, b);
                                VideoRestriction O = videoAttachment.k.O();
                                float E0 = a != null ? a.E0() : 1.0f;
                                boolean z3 = E0 < 1.0f || O != null;
                                if (z3) {
                                    enumMap = enumMap2;
                                    minAspectRatio = 1.0f;
                                } else {
                                    enumMap = enumMap2;
                                    minAspectRatio = storyAttachImageView.getMinAspectRatio();
                                }
                                if (z3) {
                                    list = list3;
                                    maxAspectRatio = 1.0f;
                                } else {
                                    list = list3;
                                    maxAspectRatio = storyAttachImageView.getMaxAspectRatio();
                                }
                                aVar5 = aVar3;
                                postStickerStyle = postStickerStyle2;
                                vbr vbrVar = new vbr(j6t0.b, minAspectRatio, maxAspectRatio);
                                storyAttachImageView.setAspectRatio(z3 ? 1.0f : E0);
                                storyAttachImageView.getHierarchy().u(RoundingParams.b(f2));
                                storyAttachImageView.setActualScaleType(f5h0.i.a);
                                storyAttachImageView.setPostprocessor(vbrVar);
                                ImageView imageView = (ImageView) inflate.findViewById(R.id.play_icon);
                                e3m.a aVar6 = e3m.a;
                                Drawable a2 = m33.a(R.drawable.vk_icon_play_12, h);
                                ColorStateList valueOf = ColorStateList.valueOf(-1);
                                if (valueOf != null) {
                                    if (a2 != null) {
                                        a2 = a2.mutate();
                                        a2.setTintList(valueOf);
                                    } else {
                                        a2 = null;
                                    }
                                }
                                imageView.setImageDrawable(a2);
                                String str = a != null ? a.d.d : null;
                                int color = (O == null || !O.d) ? h.getColor(R.color.vk_steel_gray_400) : h.getColor(R.color.vk_white);
                                if (O != null || str == null || drm0.N(str)) {
                                    vKImageView3.setColorFilter(color);
                                    vKImageView3.load((O == null || (image = O.g) == null || (Cb3 = image.Cb(cn70.b(56), false, false)) == null) ? null : Cb3.d.d);
                                    Drawable a3 = m33.a(R.drawable.restriction_image_light, h);
                                    if (a3 != null) {
                                        int min = Math.min(videoAttachment.k.getWidth(), videoAttachment.k.getHeight());
                                        a3.setBounds(0, 0, min, min);
                                    } else {
                                        a3 = null;
                                    }
                                    storyAttachImageView.setBackground(a3);
                                    storyAttachImageView.setPostprocessor(new jwx(5, 20));
                                    String str2 = O != null ? O.b : null;
                                    if (str2 == null) {
                                        str2 = "";
                                    }
                                    textView2.setText(str2);
                                    textView2.setTextColor(color);
                                }
                                storyAttachImageView.T0(str);
                                bwt0.p0(findViewById, O == null);
                                int duration = videoAttachment.k.getDuration();
                                int i2 = duration / 3600;
                                int i3 = duration % 3600;
                                int i4 = i3 / 60;
                                int i5 = i3 % 60;
                                textView.setText(i2 == 0 ? String.format("%d:%02d", Arrays.copyOf(new Object[]{Integer.valueOf(i4), Integer.valueOf(i5)}, 2)) : String.format("%d:%02d:%02d", Arrays.copyOf(new Object[]{Integer.valueOf(i2), Integer.valueOf(i4), Integer.valueOf(i5)}, 3)));
                                view4 = inflate;
                                aVar4 = aVar5;
                                list2 = list;
                                postStickerStyle2 = postStickerStyle;
                                view2 = view4;
                                if (view2 != null) {
                                    Context h2 = postStickerStyle2.h();
                                    m5i b2 = i0c0.b(h2, q7c0Var2, (Attachment) j5g.a0(list2));
                                    View inflate2 = LayoutInflater.from(h2).inflate(R.layout.sticker_post_attachment_compact, (ViewGroup) null);
                                    boolean z4 = b2.e;
                                    tlo0 tlo0Var = b2.d;
                                    String str3 = b2.b;
                                    int i6 = b2.g;
                                    RoundingParams roundingParams = b2.f;
                                    if (z4) {
                                        inflate2.setAlpha(0.5f);
                                    }
                                    StoryAttachImageView storyAttachImageView2 = (StoryAttachImageView) inflate2.findViewById(R.id.post_sticker_attachment_compact_icon_bg);
                                    float[] fArr = roundingParams.c;
                                    storyAttachImageView2.setImageCornerRadius(fArr != null ? rl3.J(fArr) : UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT);
                                    storyAttachImageView2.getHierarchy().u(roundingParams);
                                    storyAttachImageView2.setBackground(h2.getDrawable(i6));
                                    storyAttachImageView2.setEmptyImagePlaceholder(i6);
                                    if (str3 != null) {
                                        storyAttachImageView2.setOnBindCompleted(new j0c0(0, aVar, i0c0.a.class, "onBindCompleted", "onBindCompleted()V", 0));
                                        storyAttachImageView2.setAspectRatio(1.0f);
                                        vKImageView = null;
                                        storyAttachImageView2.setBackground(null);
                                        storyAttachImageView2.T0(str3);
                                        bwt0.p0(inflate2.findViewById(R.id.post_sticker_attachment_compact_icon), false);
                                    } else {
                                        vKImageView = null;
                                        storyAttachImageView2.o0(null, null);
                                        ((ImageView) inflate2.findViewById(R.id.post_sticker_attachment_compact_icon)).setImageDrawable(enj.e(b2.a, R.attr.vk_ui_icon_medium, h2));
                                        WeakHashMap<View, b0u0> weakHashMap = iut0.a;
                                        if (inflate2.isLaidOut()) {
                                            aVar.a();
                                        } else {
                                            inflate2.addOnLayoutChangeListener(new k0c0(aVar));
                                        }
                                    }
                                    ((TextView) inflate2.findViewById(R.id.post_sticker_attachment_compact_title)).setText(b2.c.a(h2));
                                    if (tlo0Var != null) {
                                        ((TextView) inflate2.findViewById(R.id.post_sticker_attachment_compact_subtitle)).setText(tlo0Var.a(h2));
                                    } else {
                                        bwt0.p0(inflate2.findViewById(R.id.post_sticker_attachment_compact_subtitle), false);
                                    }
                                    view = inflate2;
                                } else {
                                    vKImageView = null;
                                    view = view2;
                                }
                            } else {
                                enumMap = enumMap2;
                                list2 = list3;
                                aVar4 = aVar3;
                                view2 = inflate;
                                if (view2 != null) {
                                }
                            }
                        } else {
                            list = list3;
                            postStickerStyle = postStickerStyle2;
                            aVar5 = aVar3;
                            enumMap = enumMap2;
                            int i7 = 16;
                            if (q7c0Var2 instanceof q7c0.b.c) {
                                int b3 = aVar.b();
                                n7w n7wVar = new n7w(aVar, 22);
                                View inflate3 = LayoutInflater.from(h).inflate(R.layout.sticker_post_photo, (ViewGroup) null);
                                StoryAttachImageView storyAttachImageView3 = (StoryAttachImageView) inflate3.findViewById(R.id.image);
                                View findViewById2 = inflate3.findViewById(R.id.image_overlay);
                                ImageView imageView2 = (ImageView) inflate3.findViewById(R.id.restriction_icon);
                                TextView textView3 = (TextView) inflate3.findViewById(R.id.restriction_text);
                                Attachment attachment = (Attachment) j5g.a0(list);
                                if (attachment != null) {
                                    boolean z5 = attachment instanceof PhotoAttachment;
                                    PhotoAttachment photoAttachment = z5 ? (PhotoAttachment) attachment : null;
                                    PhotoRestriction photoRestriction = (photoAttachment == null || (photo = photoAttachment.l) == null) ? null : photo.L;
                                    storyAttachImageView3.setOnBindCompleted(n7wVar);
                                    if (z5) {
                                        ImageSize Ab = ((PhotoAttachment) attachment).l.Ab(b3, b3);
                                        pair = new Pair(Float.valueOf(Ab.E0()), Ab.d.d);
                                    } else if (attachment instanceof DocumentAttachment) {
                                        Image image2 = ((DocumentAttachment) attachment).s;
                                        if ((image2 != null ? image2.E0() : 1.0f) > 1.0f) {
                                            pair2 = new Pair(Float.valueOf(image2 != null ? image2.E0() : 1.0f), (image2 == null || (Cb2 = image2.Cb(b3, true, true)) == null) ? null : Cb2.d.d);
                                        } else {
                                            pair2 = new Pair(Float.valueOf(image2 != null ? image2.E0() : 1.0f), (image2 == null || (Cb = image2.Cb(b3, false, true)) == null) ? null : Cb.d.d);
                                        }
                                        pair = pair2;
                                    } else {
                                        pair = new Pair(Float.valueOf(1.0f), null);
                                    }
                                    float floatValue = ((Number) pair.d()).floatValue();
                                    String str4 = (String) pair.g();
                                    storyAttachImageView3.setAspectRatio(floatValue);
                                    storyAttachImageView3.setLayoutParams(new ViewGroup.LayoutParams(-1, -1));
                                    storyAttachImageView3.getHierarchy().q(0);
                                    storyAttachImageView3.setDontLoadAgainIfSameResource(true);
                                    storyAttachImageView3.setScaleType(ImageView.ScaleType.CENTER_CROP);
                                    storyAttachImageView3.setActualScaleType(f5h0.f.a);
                                    storyAttachImageView3.setPostprocessor(new mt80(photoRestriction != null));
                                    storyAttachImageView3.T0(str4);
                                    storyAttachImageView3.setImageCornerRadius(cn70.c(16));
                                    if (photoRestriction != null) {
                                        jwx jwxVar = edg0.a;
                                        imageView2.setImageDrawable(edg0.a(photoRestriction, -1));
                                        textView3.setText(photoRestriction.b);
                                        e3m.a aVar7 = e3m.a;
                                        findViewById2.setBackground(m33.a(R.drawable.restriction_image_overlay, h));
                                    }
                                }
                                view4 = inflate3;
                            } else if (q7c0Var2 instanceof q7c0.b.a) {
                                float f3 = zc1.a;
                                int b4 = aVar.b();
                                View inflate4 = LayoutInflater.from(h).inflate(R.layout.sticker_post_album, (ViewGroup) null);
                                VKImageView vKImageView4 = (VKImageView) inflate4.findViewById(R.id.image);
                                TextView textView4 = (TextView) inflate4.findViewById(R.id.album_name);
                                TextView textView5 = (TextView) inflate4.findViewById(R.id.photos_count);
                                VKImageView vKImageView5 = (VKImageView) inflate4.findViewById(R.id.restriction_icon);
                                TextView textView6 = (TextView) inflate4.findViewById(R.id.restriction_text);
                                View findViewById3 = inflate4.findViewById(R.id.image_overlay);
                                Object a02 = j5g.a0(list);
                                AlbumAttachment albumAttachment = a02 instanceof AlbumAttachment ? (AlbumAttachment) a02 : null;
                                if (albumAttachment != null) {
                                    Photo photo2 = albumAttachment.l;
                                    int i8 = albumAttachment.y;
                                    PhotoRestriction photoRestriction2 = photo2.L;
                                    vKImageView4.setAspectRatio(1.0f);
                                    vKImageView4.getHierarchy().u(RoundingParams.b(zc1.a));
                                    String str5 = photo2.Fb(b4, true).d.d;
                                    boolean z6 = photoRestriction2 != null && photoRestriction2.d;
                                    boolean z7 = photoRestriction2 == null && !drm0.N(str5);
                                    int color2 = h.getColor((z6 || z7) ? R.color.vk_white : R.color.vk_steel_gray_400);
                                    if (!z7) {
                                        jwx jwxVar2 = edg0.a;
                                        vKImageView5.setImageDrawable(edg0.a(photoRestriction2, Integer.valueOf(color2)));
                                        if (z6) {
                                            e3m.a aVar8 = e3m.a;
                                            i = R.drawable.restriction_image_dark;
                                        } else {
                                            e3m.a aVar9 = e3m.a;
                                            i = R.drawable.restriction_image_light;
                                        }
                                        findViewById3.setBackground(m33.a(i, h));
                                        vKImageView4.setPostprocessor(new jwx(5, 20));
                                        String str6 = photoRestriction2 != null ? photoRestriction2.b : null;
                                        textView6.setText(str6 == null ? "" : str6);
                                        textView6.setTextColor(color2);
                                    }
                                    textView4.setTextColor(color2);
                                    textView4.setText(albumAttachment.m);
                                    textView5.setTextColor(color2);
                                    textView5.setText(i8 == 0 ? h.getString(R.string.album_no_photo) : h.getResources().getQuantityString(R.plurals.album_photos_count, i8, Integer.valueOf(i8)));
                                    vKImageView4.load(str5);
                                }
                                WeakHashMap<View, b0u0> weakHashMap2 = iut0.a;
                                if (inflate4.isLaidOut()) {
                                    aVar.a();
                                } else {
                                    inflate4.addOnLayoutChangeListener(new l0c0(aVar));
                                }
                                q7c0Var2 = q7c0Var;
                                view4 = inflate4;
                            } else {
                                if (q7c0Var2 instanceof q7c0.b.C3552b) {
                                    postStickerStyle2 = postStickerStyle;
                                    if (postStickerStyle2 == PostStickerStyle.MINIATURE) {
                                        int i9 = x5t.a;
                                        int b5 = aVar.b();
                                        xsw xswVar = new xsw(aVar, 23);
                                        RoundedFrameLayout roundedFrameLayout = (RoundedFrameLayout) LayoutInflater.from(h).inflate(R.layout.sticker_post_galvita_grid, (ViewGroup) null);
                                        GalvitaLayout galvitaLayout = (GalvitaLayout) roundedFrameLayout.findViewById(R.id.grid);
                                        roundedFrameLayout.setCornerRadius(x5t.b);
                                        ArrayList arrayList = new ArrayList();
                                        Iterator<T> it = list.iterator();
                                        while (it.hasNext()) {
                                            w64 l2 = egi.l(b5, (Attachment) it.next());
                                            if (l2 != null) {
                                                arrayList.add(l2);
                                            }
                                        }
                                        jsl0 jsl0Var = new jsl0(new a31(new Ref$IntRef(), arrayList, xswVar, 2));
                                        galvitaLayout.setGap(x5t.a);
                                        galvitaLayout.setViewPool(new c6t());
                                        galvitaLayout.setAdapter(jsl0Var);
                                        jsl0Var.e(arrayList);
                                        aVar4 = aVar5;
                                        list2 = list;
                                        view2 = roundedFrameLayout;
                                    } else {
                                        float f4 = bfu.a;
                                        int b6 = aVar.b();
                                        boolean N1 = aVar.N1();
                                        fm20 fm20Var = new fm20(aVar, i7);
                                        View inflate5 = LayoutInflater.from(h).inflate(R.layout.sticker_post_grid, (ViewGroup) null);
                                        VKImageView vKImageView6 = (VKImageView) inflate5.findViewById(R.id.image);
                                        View findViewById4 = inflate5.findViewById(R.id.image_overlay);
                                        VKImageView vKImageView7 = (VKImageView) inflate5.findViewById(R.id.restriction_icon);
                                        TextView textView7 = (TextView) inflate5.findViewById(R.id.files_count);
                                        TextView textView8 = (TextView) inflate5.findViewById(R.id.restriction_text);
                                        View findViewById5 = inflate5.findViewById(R.id.multiple_files_icon);
                                        if (vKImageView6 instanceof StoryAttachImageView) {
                                            StoryAttachImageView storyAttachImageView4 = (StoryAttachImageView) vKImageView6;
                                            storyAttachImageView4.setImageCornerRadius(bfu.a);
                                            storyAttachImageView4.setOnBindCompleted(fm20Var);
                                        }
                                        aVar4 = aVar5;
                                        list2 = list;
                                        Attachment attachment2 = (Attachment) j5g.b0(aVar4.d, list2);
                                        if (attachment2 == null || (l = egi.l(b6, attachment2)) == null) {
                                            view3 = inflate5;
                                        } else {
                                            Restriction restriction = l.c;
                                            view3 = inflate5;
                                            float f5 = l.b;
                                            String str7 = l.a;
                                            vKImageView6.setAspectRatio(f5);
                                            boolean z8 = vKImageView6 instanceof StoryAttachImageView;
                                            if (z8) {
                                                z2 = N1;
                                            } else {
                                                z2 = N1;
                                                vKImageView6.getHierarchy().u(RoundingParams.b(bfu.a));
                                            }
                                            vKImageView6.setPostprocessor(new mt80(restriction != null));
                                            if (z8) {
                                                ((StoryAttachImageView) vKImageView6).T0(str7);
                                            } else {
                                                vKImageView6.load(str7);
                                            }
                                            bwt0.p0(findViewById5, !z2);
                                            bwt0.p0(textView7, false);
                                            if (restriction != null) {
                                                egi.f(vKImageView7, bfu.b, restriction);
                                                textView8.setText(restriction.b);
                                                e3m.a aVar10 = e3m.a;
                                                findViewById4.setBackground(m33.a(R.drawable.restriction_image_overlay, h));
                                            }
                                        }
                                        view2 = view3;
                                    }
                                } else {
                                    aVar4 = aVar5;
                                    list2 = list;
                                    postStickerStyle2 = postStickerStyle;
                                    if (q7c0Var2 instanceof q7c0.b.d) {
                                        y9c0 y9c0Var = aVar4.c;
                                        FrameLayout frameLayout2 = new FrameLayout(h);
                                        cac0 cac0Var = new cac0(h);
                                        ebc0 ebc0Var = new ebc0(h);
                                        if (y9c0Var != null) {
                                            Drawable a4 = m33.a(R.drawable.bg_post_sticker_poster, h);
                                            if (a4 != null) {
                                                a4.setTint(y9c0Var.d);
                                            } else {
                                                a4 = null;
                                            }
                                            cac0Var.setBackground(a4);
                                            cac0Var.b.c(y9c0Var.b);
                                            cac0Var.c.c(y9c0Var.c);
                                            ebc0Var.setConstants(y9c0Var.f);
                                            ebc0Var.setTextColor(y9c0Var.e);
                                            ebc0Var.setText(y9c0Var.a);
                                        }
                                        frameLayout2.addView(cac0Var);
                                        frameLayout2.addView(ebc0Var);
                                        WeakHashMap<View, b0u0> weakHashMap3 = iut0.a;
                                        if (frameLayout2.isLaidOut()) {
                                            aVar.a();
                                            view2 = frameLayout2;
                                        } else {
                                            frameLayout2.addOnLayoutChangeListener(new m0c0(aVar));
                                            view2 = frameLayout2;
                                        }
                                    } else {
                                        view2 = null;
                                    }
                                }
                                if (view2 != null) {
                                }
                            }
                            aVar4 = aVar5;
                            list2 = list;
                            postStickerStyle2 = postStickerStyle;
                            view2 = view4;
                            if (view2 != null) {
                            }
                        }
                    }
                    enumMap.put((EnumMap<PostStickerStyle, View>) postStickerStyle2, (PostStickerStyle) view);
                } else {
                    vKImageView = null;
                    aVar4 = aVar3;
                }
                View view5 = view;
                vKImageView2 = view5 == null ? (VKImageView) view5.findViewById(R.id.image) : vKImageView;
                if (vKImageView2 != null && aVar4 != null && (bitmap = aVar4.e) != null) {
                    vKImageView2.setImageBitmap(bitmap);
                }
                return view5;
            }
            aVar2 = dVar.d;
        } else {
            aVar2 = u7c0Var.g;
        }
        aVar3 = aVar2;
        EnumMap<PostStickerStyle, View> enumMap22 = !z ? this.b : this.a;
        view = enumMap22.get(postStickerStyle2);
        if (view != null) {
        }
        View view52 = view;
        if (view52 == null) {
        }
        if (vKImageView2 != null) {
            vKImageView2.setImageBitmap(bitmap);
        }
        return view52;
    }
}
