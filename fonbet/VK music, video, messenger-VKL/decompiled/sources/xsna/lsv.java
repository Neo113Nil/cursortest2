package xsna;

import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import com.vk.core.view.components.picture.VkImage;
import com.vk.dto.stories.model.web.StoryBoxPrepared;
import com.vk.log.L;
import com.vk.stories.design.view.stickers.StickersDrawingViewGroup;
import com.vk.story.viewer.impl.presentation.ideas.ui.IdeasStoryAvatarView;
import com.vk.superapp.api.dto.story.WebStoryBox;
import java.io.IOException;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.Callable;
import xsna.lsv;

/* compiled from: IdeasAvatarRenderer.kt */
/* loaded from: classes6.dex */
public final class lsv {
    public final VkImage a;
    public final StickersDrawingViewGroup b;
    public final s5m0 c;
    public final com.vk.stickers.api.styles.b d;
    public ca6 e;
    public ca6 f;
    public io.reactivex.rxjava3.disposables.c g;
    public StoryBoxPrepared h;
    public StoryBoxPrepared i;
    public final HashMap<StoryBoxPrepared, b> j = new HashMap<>();
    public int k;
    public int l;

    /* compiled from: IdeasAvatarRenderer.kt */
    public static final class a {
        public final Bitmap a;

        public a(Bitmap bitmap) {
            this.a = bitmap;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof a) && epx.f(this.a, ((a) obj).a);
        }

        public final int hashCode() {
            Bitmap bitmap = this.a;
            if (bitmap == null) {
                return 0;
            }
            return bitmap.hashCode();
        }

        public final String toString() {
            return qr.c(new StringBuilder("Background(bitmap="), this.a, ')');
        }
    }

    /* compiled from: IdeasAvatarRenderer.kt */
    public static final class b {
        public final Bitmap a;
        public final List<nov> b;

        /* JADX WARN: Multi-variable type inference failed */
        public b(Bitmap bitmap, List<? extends nov> list) {
            this.a = bitmap;
            this.b = list;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof b)) {
                return false;
            }
            b bVar = (b) obj;
            return epx.f(this.a, bVar.a) && epx.f(this.b, bVar.b);
        }

        public final int hashCode() {
            Bitmap bitmap = this.a;
            return this.b.hashCode() + ((bitmap == null ? 0 : bitmap.hashCode()) * 31);
        }

        public final String toString() {
            StringBuilder sb = new StringBuilder("RenderedContent(background=");
            sb.append(this.a);
            sb.append(", stickers=");
            return ms9.a(')', sb, this.b);
        }
    }

    public lsv(VkImage vkImage, StickersDrawingViewGroup stickersDrawingViewGroup, s5m0 s5m0Var, com.vk.stickers.api.styles.b bVar) {
        this.a = vkImage;
        this.b = stickersDrawingViewGroup;
        this.c = s5m0Var;
        this.d = bVar;
    }

    public final void a(StoryBoxPrepared storyBoxPrepared, b bVar) {
        izs<? super StoryBoxPrepared, s3q0> izsVar;
        c();
        this.a.setImageBitmap(bVar.a);
        Iterator<T> it = bVar.b.iterator();
        while (it.hasNext()) {
            this.b.g((nov) it.next(), null);
        }
        this.h = storyBoxPrepared;
        ca6 ca6Var = this.e;
        if (ca6Var == null || (izsVar = ((IdeasStoryAvatarView) ca6Var.c).e) == null) {
            return;
        }
        izsVar.invoke(storyBoxPrepared);
    }

    public final void b() {
        io.reactivex.rxjava3.disposables.c cVar = this.g;
        if (cVar != null) {
            cVar.dispose();
        }
        this.g = null;
        c();
        this.a.setImageBitmap(null);
        this.h = null;
        HashMap<StoryBoxPrepared, b> hashMap = this.j;
        Iterator<T> it = hashMap.values().iterator();
        while (it.hasNext()) {
            Bitmap bitmap = ((b) it.next()).a;
            if (bitmap != null) {
                bitmap.recycle();
            }
        }
        hashMap.clear();
    }

    public final void c() {
        StickersDrawingViewGroup stickersDrawingViewGroup = this.b;
        stickersDrawingViewGroup.i();
        Iterator it = j5g.O0(stickersDrawingViewGroup.getStickersState().a).iterator();
        while (it.hasNext()) {
            stickersDrawingViewGroup.t((nov) it.next());
        }
    }

    public final void d() {
        io.reactivex.rxjava3.core.b0 k;
        StoryBoxPrepared storyBoxPrepared = this.i;
        if (this.k <= 0 || this.l <= 0) {
            return;
        }
        if (storyBoxPrepared != this.h || storyBoxPrepared == null) {
            io.reactivex.rxjava3.disposables.c cVar = this.g;
            if (cVar != null) {
                cVar.dispose();
            }
            this.g = null;
            VkImage vkImage = this.a;
            if (storyBoxPrepared == null) {
                c();
                vkImage.setImageBitmap(null);
                this.h = null;
                return;
            }
            WebStoryBox webStoryBox = storyBoxPrepared.b;
            b bVar = this.j.get(storyBoxPrepared);
            if (bVar != null) {
                a(storyBoxPrepared, bVar);
                return;
            }
            c();
            vkImage.setImageBitmap(null);
            this.h = null;
            final int i = this.k;
            final int i2 = this.l;
            final String str = webStoryBox.d;
            String str2 = webStoryBox.b;
            if (epx.f(str2, "image")) {
                k = (str == null || drm0.N(str)) ? io.reactivex.rxjava3.core.x.k(new a(null)) : new io.reactivex.rxjava3.internal.operators.single.v(new Callable() { // from class: xsna.ksv
                    @Override // java.util.concurrent.Callable
                    public final Object call() {
                        String str3 = str;
                        Bitmap decodeFile = BitmapFactory.decodeFile(str3);
                        if (decodeFile != null) {
                            return new lsv.a(new cyl0(i, i2).b(decodeFile).i());
                        }
                        throw new IOException(go9.b("ideas: can't decode background from ", str3));
                    }
                });
            } else if (epx.f(str2, "video")) {
                L.G("ideas: video background is not supported, falling back to empty bg");
                k = io.reactivex.rxjava3.core.x.k(new a(null));
            } else {
                k = io.reactivex.rxjava3.core.x.k(new a(null));
            }
            this.g = io.reactivex.rxjava3.core.x.B(k, new szl0(this.k, this.l, this.c, this.d).b(webStoryBox).K().l(new wp(16)), new n7(new cf3(3), 28)).q(asu0.a.c()).m(io.reactivex.rxjava3.android.schedulers.a.b()).subscribe(new jsv(new j20(17, this, storyBoxPrepared), 0), new n3t(new rm0(13, this, storyBoxPrepared), 4));
        }
    }
}
