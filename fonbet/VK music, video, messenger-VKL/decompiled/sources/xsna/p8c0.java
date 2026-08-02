package xsna;

import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.util.Size;
import android.util.TypedValue;
import android.view.View;
import com.facebook.imagepipeline.nativecode.NativeBlurFilter;
import com.vk.dto.common.id.UserId;
import com.vk.log.L;
import com.vk.log.LoggerOutputTarget;
import com.vk.stickers.api.models.post.PostStickerStyle;
import java.io.File;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.NoWhenBranchMatchedException;
import xsna.c7g0;
import xsna.l8c0;
import xsna.u7c0;

/* compiled from: PostToStoryRepostPublisherImpl.kt */
/* loaded from: classes6.dex */
public final class p8c0 implements l8c0 {
    public final bpn0 b;
    public final bpn0 c;
    public final b25 d;
    public int e;
    public m8c0 f;

    /* compiled from: PostToStoryRepostPublisherImpl.kt */
    public static final class a {
        public final Bitmap a;
        public final Bitmap b;

        public a(Bitmap bitmap, Bitmap bitmap2) {
            this.a = bitmap;
            this.b = bitmap2;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof a)) {
                return false;
            }
            a aVar = (a) obj;
            return epx.f(this.a, aVar.a) && epx.f(this.b, aVar.b);
        }

        public final int hashCode() {
            return this.b.hashCode() + (this.a.hashCode() * 31);
        }

        public final String toString() {
            StringBuilder sb = new StringBuilder("ContentBitmap(raw=");
            sb.append(this.a);
            sb.append(", blurred=");
            return qr.c(sb, this.b, ')');
        }
    }

    /* compiled from: PostToStoryRepostPublisherImpl.kt */
    public static final class b {
        public final p7c0 a;
        public final a b;
        public final Bitmap c;
        public final Paint d;
        public final Canvas e;

        public b(p7c0 p7c0Var, a aVar, Bitmap bitmap, Paint paint, Canvas canvas) {
            this.a = p7c0Var;
            this.b = aVar;
            this.c = bitmap;
            this.d = paint;
            this.e = canvas;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof b)) {
                return false;
            }
            b bVar = (b) obj;
            return epx.f(this.a, bVar.a) && epx.f(this.b, bVar.b) && epx.f(this.c, bVar.c) && epx.f(this.d, bVar.d) && epx.f(this.e, bVar.e);
        }

        public final int hashCode() {
            int hashCode = this.a.hashCode() * 31;
            a aVar = this.b;
            return this.e.hashCode() + ((this.d.hashCode() + ((this.c.hashCode() + ((hashCode + (aVar == null ? 0 : aVar.hashCode())) * 31)) * 31)) * 31);
        }

        public final String toString() {
            return "StoryBitmapContext(sticker=" + this.a + ", contentBitmap=" + this.b + ", storyBitmap=" + this.c + ", paint=" + this.d + ", canvas=" + this.e + ')';
        }
    }

    /* compiled from: PostToStoryRepostPublisherImpl.kt */
    public static final class c {
        public final p7c0 a;
        public final File b;

        public c(p7c0 p7c0Var, File file) {
            this.a = p7c0Var;
            this.b = file;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof c)) {
                return false;
            }
            c cVar = (c) obj;
            return epx.f(this.a, cVar.a) && epx.f(this.b, cVar.b);
        }

        public final int hashCode() {
            return this.b.hashCode() + (this.a.hashCode() * 31);
        }

        public final String toString() {
            return "StoryUploadData(sticker=" + this.a + ", file=" + this.b + ')';
        }
    }

    public p8c0(bpn0 bpn0Var, bpn0 bpn0Var2, b25 b25Var) {
        this.b = bpn0Var;
        this.c = bpn0Var2;
        this.d = b25Var;
    }

    public static a c(Bitmap bitmap) {
        Bitmap copy = bitmap.copy(Bitmap.Config.ARGB_8888, true);
        NativeBlurFilter.iterativeBoxBlur(copy, 3, copy.getWidth() / 4);
        return new a(bitmap, copy);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static void d(p7c0 p7c0Var) {
        nxt0 nxt0Var = p7c0Var instanceof nxt0 ? (nxt0) p7c0Var : null;
        if (nxt0Var != null) {
            l8c0.a.getClass();
            nxt0Var.measure(View.MeasureSpec.makeMeasureSpec(l8c0.a.b, Integer.MIN_VALUE), View.MeasureSpec.makeMeasureSpec(l8c0.a.c, Integer.MIN_VALUE));
            nxt0Var.layout(0, 0, (int) nxt0Var.getRealWidth(), (int) nxt0Var.getRealHeight());
        }
    }

    @Override // xsna.l8c0
    public final void a() {
        bpn0 bpn0Var = this.c;
        this.e = 0;
        try {
            m8c0 m8c0Var = this.f;
            if (m8c0Var == null || !bpn0Var.isInitialized()) {
                return;
            }
            ((p870) bpn0Var.getValue()).g(m8c0Var);
        } catch (Throwable th) {
            com.vk.metrics.eventtracking.b.a.a(th);
        }
    }

    @Override // xsna.l8c0
    public final void b(c7g0 c7g0Var) {
        Context s;
        u7c0 u7c0Var;
        List a2;
        TypedValue typedValue = krv0.a;
        if (krv0.b == null || (s = dhr0.s()) == null) {
            L l = L.a;
            l.getClass();
            if (L.m(LoggerOutputTarget.NONE)) {
                return;
            }
            L.u(l, L.LogType.w, new Object[]{"Failed to retrieve context"});
            return;
        }
        if (c7g0Var instanceof c7g0.a) {
            v7c0 v7c0Var = new v7c0();
            p3c0 p3c0Var = ((c7g0.a) c7g0Var).a;
            Size size = new Size(1080, 1920);
            PostStickerStyle postStickerStyle = PostStickerStyle.MINIATURE;
            long j = p3c0Var.a;
            u7c0.c cVar = new u7c0.c(p3c0Var.d, null, p3c0Var.e);
            ArrayList arrayList = p3c0Var.f;
            ArrayList arrayList2 = new ArrayList(c5g.u(arrayList, 10));
            Iterator it = arrayList.iterator();
            while (it.hasNext()) {
                arrayList2.add(((pbm0) it.next()).a);
            }
            List D0 = j5g.D0(new ig2(1), arrayList2);
            ArrayList a3 = r7c0.a(null, D0);
            u7c0.a aVar = new u7c0.a(a3, D0, null, 0, 24);
            boolean f = v7c0.f(a3);
            v7c0Var.a = f;
            if (!f) {
                a2 = v7c0.c(D0, size);
            } else if (D0.isEmpty()) {
                PostStickerStyle.Companion.getClass();
                a2 = e43.l(PostStickerStyle.SIMPLIFIED_LIGHT, PostStickerStyle.SIMPLIFIED_DARK, PostStickerStyle.LIGHT, PostStickerStyle.DARK);
            } else {
                PostStickerStyle.Companion.getClass();
                a2 = PostStickerStyle.a.a(false);
            }
            if (postStickerStyle == null) {
                postStickerStyle = (PostStickerStyle) j5g.Y(a2);
            }
            gzs<s3q0> gzsVar = fkq0.a;
            u7c0Var = new u7c0(0, new UserId(j), cVar, null, p3c0Var.g, null, aVar, null, new u7c0.b(p3c0Var.c, new UserId(p3c0Var.b), new UserId(j)), new u7c0.e(postStickerStyle, a2));
        } else {
            if (!(c7g0Var instanceof c7g0.b)) {
                throw new NoWhenBranchMatchedException();
            }
            u7c0Var = ((c7g0.b) c7g0Var).a;
        }
        c7g0Var.b().invoke(new io.reactivex.rxjava3.internal.operators.single.r(new io.reactivex.rxjava3.internal.operators.single.b(new ox5(s, u7c0Var, c7g0Var, this)), new or20(new zgo(this, s, c7g0Var, 4), 10)).l(new op0(new qey(this, 24), 29)).m(asu0.a.c()).l(new nit(new yl0(20, this, c7g0Var), 14)).q(asu0.i()).subscribe(new uu60(new i0b0(this, 2), 8), new jsv(new ma(27, this, c7g0Var), 15)));
    }
}
