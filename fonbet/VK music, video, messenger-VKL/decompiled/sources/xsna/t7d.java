package xsna;

import android.content.Context;
import android.graphics.drawable.Drawable;
import android.text.Spannable;
import android.text.SpannableStringBuilder;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewStub;
import android.widget.ImageView;
import android.widget.TextView;
import com.vk.clips.sdk.shared.api.domain.HashtagParseMode;
import com.vk.core.serialize.Serializer;
import com.vk.core.utils.VerifyInfoHelper;
import com.vk.core.view.TextViewEllipsizeEnd;
import com.vk.core.view.components.picture.VkImage;
import com.vk.dto.common.ClipVideoFile;
import com.vk.dto.common.VerifyInfo;
import com.vk.dto.common.VideoFile;
import com.vk.dto.music.AlbumLink;
import com.vk.dto.music.MusicTrack;
import com.vk.dto.music.Thumb;
import com.vkontakte.android.R;
import java.util.Arrays;
import kotlin.LazyThreadSafetyMode;
import xsna.xod;

/* compiled from: ClipMatchParentWidthOverlayDelegate.kt */
/* loaded from: classes4.dex */
public final class t7d extends q8d implements w8i {
    public final Object q;

    public t7d(ViewStub viewStub) {
        super(viewStub);
        this.q = msy.a(LazyThreadSafetyMode.NONE, new im0(this, 17));
    }

    /* JADX WARN: Removed duplicated region for block: B:53:0x0136  */
    /* JADX WARN: Removed duplicated region for block: B:56:0x0143  */
    /* JADX WARN: Removed duplicated region for block: B:59:0x0150  */
    /* JADX WARN: Removed duplicated region for block: B:65:0x0169  */
    /* JADX WARN: Removed duplicated region for block: B:68:0x0186  */
    /* JADX WARN: Removed duplicated region for block: B:73:0x0195  */
    /* JADX WARN: Type inference failed for: r1v1, types: [java.lang.Object, kotlin.Lazy] */
    /* JADX WARN: Type inference failed for: r1v14, types: [java.lang.Object, kotlin.Lazy] */
    /* JADX WARN: Type inference failed for: r1v4, types: [java.lang.Object, kotlin.Lazy] */
    /* JADX WARN: Type inference failed for: r1v7, types: [java.lang.Object, kotlin.Lazy] */
    /* JADX WARN: Type inference failed for: r3v10, types: [java.lang.Object, kotlin.Lazy] */
    /* JADX WARN: Type inference failed for: r3v16, types: [java.lang.Object, kotlin.Lazy] */
    /* JADX WARN: Type inference failed for: r3v19, types: [java.lang.Object, kotlin.Lazy] */
    /* JADX WARN: Type inference failed for: r3v22, types: [java.lang.Object, kotlin.Lazy] */
    /* JADX WARN: Type inference failed for: r3v3, types: [java.lang.Object, kotlin.Lazy] */
    /* JADX WARN: Type inference failed for: r8v0, types: [java.lang.Object, kotlin.Lazy] */
    /* JADX WARN: Type inference failed for: r9v7, types: [java.lang.Object, kotlin.Lazy] */
    @Override // xsna.q8d
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void a(VideoFile videoFile) {
        boolean z;
        ViewGroup viewGroup;
        ImageView imageView;
        ?? r3;
        VkImage vkImage;
        TextView textView;
        TextView textView2;
        VkImage vkImage2;
        AlbumLink albumLink;
        Drawable drawable;
        if (videoFile == null || !g620.f().d(videoFile)) {
            if (this.c.isInitialized()) {
                bwt0.p0(b(), false);
                return;
            }
            return;
        }
        bwt0.p0(b(), true);
        TextView textView3 = (TextView) this.i.getValue();
        if (textView3 != null) {
            f4m.j(textView3);
        }
        if (videoFile instanceof ClipVideoFile) {
            ClipVideoFile clipVideoFile = (ClipVideoFile) videoFile;
            TextView textView4 = (TextView) this.e.getValue();
            if (textView4 != null) {
                SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder();
                String str = clipVideoFile.p0;
                if (str != null) {
                    spannableStringBuilder.append((CharSequence) str);
                    if (di60.A(clipVideoFile.o0)) {
                        VerifyInfoHelper verifyInfoHelper = VerifyInfoHelper.a;
                        VerifyInfo verifyInfo = clipVideoFile.o0;
                        Context context = e43.a;
                        if (context == null) {
                            context = null;
                        }
                        Drawable h = VerifyInfoHelper.h(verifyInfoHelper, verifyInfo, context, VerifyInfoHelper.ColorTheme.white, 8);
                        if (h != null) {
                            baf0 baf0Var = (baf0) h;
                            h.setBounds(0, 0, baf0Var.b.getIntrinsicWidth(), baf0Var.b.getIntrinsicHeight());
                            drawable = h;
                        } else {
                            drawable = null;
                        }
                        int a = iah0.a(4);
                        Spannable newSpannable = Spannable.Factory.getInstance().newSpannable(" ");
                        drawable.setBounds(0, 0, ((baf0) drawable).b.getIntrinsicWidth(), ((baf0) drawable).b.getIntrinsicHeight());
                        newSpannable.setSpan(new tzx0(drawable, 3, -1.0f, false, 0, a, 0), 0, 1, 33);
                        spannableStringBuilder.append((CharSequence) newSpannable);
                    }
                    spannableStringBuilder.append((CharSequence) " · ");
                    spannableStringBuilder.append((CharSequence) y8g0.e(R.string.clip));
                }
                textView4.setText(spannableStringBuilder);
            }
            String str2 = clipVideoFile.m;
            MusicTrack musicTrack = clipVideoFile.D1;
            ?? r8 = this.f;
            if (str2 == null || drm0.N(str2)) {
                TextViewEllipsizeEnd textViewEllipsizeEnd = (TextViewEllipsizeEnd) r8.getValue();
                if (textViewEllipsizeEnd != null) {
                    bwt0.p0(textViewEllipsizeEnd, false);
                }
            } else {
                TextViewEllipsizeEnd textViewEllipsizeEnd2 = (TextViewEllipsizeEnd) r8.getValue();
                if (textViewEllipsizeEnd2 != null) {
                    bwt0.p0(textViewEllipsizeEnd2, true);
                }
                TextViewEllipsizeEnd textViewEllipsizeEnd3 = (TextViewEllipsizeEnd) r8.getValue();
                if (textViewEllipsizeEnd3 != null) {
                    CharSequence charSequence = clipVideoFile.U1;
                    bpn0 bpn0Var = cqm0.a;
                    if (charSequence == null || charSequence.length() == 0) {
                        charSequence = null;
                    }
                    if (charSequence == null) {
                        charSequence = xod.a.a((ibr0) this.q.getValue(), str2, HashtagParseMode.DEFAULT, true, 4);
                    }
                    String e = y8g0.e(R.string.clip_description_expand);
                    int i = TextViewEllipsizeEnd.d;
                    textViewEllipsizeEnd3.b(charSequence, e, false, false);
                }
            }
            if (!clipVideoFile.Q0) {
                if (((musicTrack == null || (albumLink = musicTrack.q) == null) ? null : albumLink.f) != null) {
                    z = true;
                    viewGroup = (ViewGroup) this.h.getValue();
                    if (viewGroup != null) {
                        bwt0.p0(viewGroup, z);
                    }
                    imageView = (ImageView) this.n.getValue();
                    if (imageView != null) {
                        imageView.setSelected(z);
                    }
                    r3 = this.m;
                    vkImage = (VkImage) r3.getValue();
                    if (vkImage != null) {
                        bwt0.p0(vkImage, z);
                    }
                    if (((VkImage) r3.getValue()) != null && z) {
                        Thumb thumb = musicTrack.q.f;
                        vkImage2 = (VkImage) r3.getValue();
                        if (vkImage2 != null) {
                            int width = ((VkImage) r3.getValue()).getWidth();
                            Serializer.c<Thumb> cVar = Thumb.CREATOR;
                            vkImage2.o0(thumb.Ab(width, false), null);
                        }
                    }
                    ?? r1 = this.g;
                    textView = (TextView) r1.getValue();
                    if (textView != null) {
                        bwt0.p0(textView, musicTrack != null);
                    }
                    textView2 = (TextView) r1.getValue();
                    if (textView2 != null) {
                        textView2.setText(String.format("%s - %s", Arrays.copyOf(new Object[]{musicTrack != null ? musicTrack.h : null, musicTrack != null ? musicTrack.d : null}, 2)));
                    }
                }
            }
            z = false;
            viewGroup = (ViewGroup) this.h.getValue();
            if (viewGroup != null) {
            }
            imageView = (ImageView) this.n.getValue();
            if (imageView != null) {
            }
            r3 = this.m;
            vkImage = (VkImage) r3.getValue();
            if (vkImage != null) {
            }
            if (((VkImage) r3.getValue()) != null) {
                Thumb thumb2 = musicTrack.q.f;
                vkImage2 = (VkImage) r3.getValue();
                if (vkImage2 != null) {
                }
            }
            ?? r12 = this.g;
            textView = (TextView) r12.getValue();
            if (textView != null) {
            }
            textView2 = (TextView) r12.getValue();
            if (textView2 != null) {
            }
        }
        View view = (View) this.l.getValue();
        if (view != null) {
            bwt0.c0(iah0.a(16), view);
        }
        View view2 = (View) this.d.getValue();
        if (view2 != null) {
            view2.setVisibility(0);
        }
    }
}
