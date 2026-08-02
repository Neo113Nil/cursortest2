package xsna;

import android.graphics.Bitmap;
import com.vk.dto.common.Image;
import com.vk.dto.common.ImageSize;
import com.vk.dto.common.VideoFile;
import com.vk.dto.photo.Photo;
import com.vk.dto.stories.model.StoryEntry;
import com.vk.dto.stories.model.clickable.ClickableClip;
import com.vk.dto.stories.model.clickable.ClickablePhoto;
import com.vk.dto.stories.model.clickable.ClickablePhotoAlbum;
import com.vk.dto.stories.model.clickable.ClickablePost;
import com.vk.dto.stories.model.clickable.ClickableSticker;
import com.vk.dto.stories.model.clickable.ClickableStickers;
import com.vk.dto.stories.model.clickable.ClickableVideo;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;
import kotlin.NoWhenBranchMatchedException;
import kotlin.jvm.internal.AdaptedFunctionReference;
import xsna.egg0;
import xsna.el9;

/* compiled from: CameraReplyDelegate.kt */
/* loaded from: classes16.dex */
public final class dl9 {
    public final el9 a;
    public final v76 b;
    public final u440 c;
    public final lh9 d;
    public final scd e;
    public final Image f;
    public final String g;
    public final ImageSize h;

    /* compiled from: CameraReplyDelegate.kt */
    public static final /* synthetic */ class a extends AdaptedFunctionReference implements izs<Bitmap, s3q0> {
        @Override // xsna.izs
        public final s3q0 invoke(Bitmap bitmap) {
            lh9.d((lh9) this.receiver, bitmap);
            return s3q0.a;
        }
    }

    public dl9(el9 el9Var, v76 v76Var, u440 u440Var, lh9 lh9Var, scd scdVar) {
        Image w2;
        String str;
        this.a = el9Var;
        this.b = v76Var;
        this.c = u440Var;
        this.d = lh9Var;
        this.e = scdVar;
        Object obj = null;
        if (el9Var instanceof el9.a) {
            w2 = ((el9.a) el9Var).a.w2();
        } else {
            if (!(el9Var instanceof el9.b)) {
                throw new NoWhenBranchMatchedException();
            }
            StoryEntry storyEntry = ((el9.b) el9Var).a;
            if (storyEntry.Sb()) {
                Photo photo = storyEntry.m;
                if (photo != null) {
                    w2 = photo.y;
                }
                w2 = null;
            } else {
                VideoFile videoFile = storyEntry.n;
                if (videoFile != null) {
                    w2 = videoFile.w2();
                }
                w2 = null;
            }
        }
        w2 = w2 == null ? Image.d : w2;
        this.f = w2;
        Iterator it = new egg0(w2.b).iterator();
        while (true) {
            ListIterator<T> listIterator = ((egg0.a) it).b;
            if (!listIterator.hasPrevious()) {
                break;
            }
            Object previous = listIterator.previous();
            if (mcr0.p(((ImageSize) previous).d.d)) {
                obj = previous;
                break;
            }
        }
        ImageSize imageSize = (ImageSize) obj;
        if (imageSize == null || (str = imageSize.d.d) == null) {
            ImageSize Cb = w2.Cb(0, true, false);
            str = Cb != null ? Cb.d.d : "";
        }
        this.g = str;
        ImageSize Bb = Image.Bb(iah0.f().widthPixels, this.f.b, true, false, true);
        this.h = Bb == null ? ImageSize.f : Bb;
    }

    public static boolean a(StoryEntry storyEntry) {
        List<ClickableSticker> list;
        if (storyEntry.R != null) {
            return true;
        }
        ClickableStickers clickableStickers = storyEntry.X;
        if (clickableStickers == null || (list = clickableStickers.d) == null) {
            return false;
        }
        List<ClickableSticker> list2 = list;
        if ((list2 instanceof Collection) && list2.isEmpty()) {
            return false;
        }
        for (ClickableSticker clickableSticker : list2) {
            if ((clickableSticker instanceof ClickableClip) || (clickableSticker instanceof ClickablePost) || (clickableSticker instanceof ClickableVideo) || (clickableSticker instanceof ClickablePhoto) || (clickableSticker instanceof ClickablePhotoAlbum)) {
                return true;
            }
        }
        return false;
    }

    public final void b() {
        lh9 lh9Var = this.d;
        lh9Var.b(this.g, new a(1, lh9Var, lh9.class, "setBlurredBackground", "setBlurredBackground(Landroid/graphics/Bitmap;Z)V", 0));
    }
}
