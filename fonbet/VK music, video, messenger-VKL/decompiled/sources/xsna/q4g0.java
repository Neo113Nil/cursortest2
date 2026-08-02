package xsna;

import android.graphics.drawable.Drawable;
import com.vk.attachpicker.stickers.reply.ReplyVideoStickerStyle;
import com.vk.dto.common.id.UserId;
import com.vk.dto.user.ObsceneTextFilter;
import java.util.ArrayList;
import java.util.List;

/* compiled from: ReplyVideoStickerInfo.kt */
/* loaded from: classes15.dex */
public final class q4g0 {
    public final b a;
    public final String b;
    public final Drawable c;
    public final int d;
    public final a e;
    public final boolean f;
    public final ObsceneTextFilter g;

    /* compiled from: ReplyVideoStickerInfo.kt */
    public static final class a {
        public final ReplyVideoStickerStyle a;
        public final List<ReplyVideoStickerStyle> b;

        /* JADX WARN: Multi-variable type inference failed */
        public a(ReplyVideoStickerStyle replyVideoStickerStyle, List<? extends ReplyVideoStickerStyle> list) {
            this.a = replyVideoStickerStyle;
            this.b = list;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof a)) {
                return false;
            }
            a aVar = (a) obj;
            return this.a == aVar.a && epx.f(this.b, aVar.b);
        }

        public final int hashCode() {
            return this.b.hashCode() + (this.a.hashCode() * 31);
        }

        public final String toString() {
            StringBuilder sb = new StringBuilder("StyleInfo(currentStyle=");
            sb.append(this.a);
            sb.append(", availableStyles=");
            return ms9.a(')', sb, this.b);
        }
    }

    /* compiled from: ReplyVideoStickerInfo.kt */
    public static abstract class b {

        /* compiled from: ReplyVideoStickerInfo.kt */
        public static final class a extends b {
            public final UserId a;
            public final int b;
            public final String c;
            public final ArrayList d;

            public a(int i, UserId userId, String str, ArrayList arrayList) {
                this.a = userId;
                this.b = i;
                this.c = str;
                this.d = arrayList;
            }
        }

        /* compiled from: ReplyVideoStickerInfo.kt */
        /* renamed from: xsna.q4g0$b$b, reason: collision with other inner class name */
        public static final class C3548b extends b {
            public static final C3548b a = new C3548b();

            public final boolean equals(Object obj) {
                return this == obj || (obj instanceof C3548b);
            }

            public final int hashCode() {
                return 171881382;
            }

            public final String toString() {
                return "Story";
            }
        }
    }

    public q4g0(b bVar, String str, Drawable drawable, int i, a aVar, boolean z, ObsceneTextFilter obsceneTextFilter) {
        this.a = bVar;
        this.b = str;
        this.c = drawable;
        this.d = i;
        this.e = aVar;
        this.f = z;
        this.g = obsceneTextFilter;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof q4g0)) {
            return false;
        }
        q4g0 q4g0Var = (q4g0) obj;
        return epx.f(this.a, q4g0Var.a) && epx.f(this.b, q4g0Var.b) && epx.f(this.c, q4g0Var.c) && this.d == q4g0Var.d && epx.f(this.e, q4g0Var.e) && this.f == q4g0Var.f && this.g == q4g0Var.g;
    }

    public final int hashCode() {
        int a2 = urd0.a(this.a.hashCode() * 31, 31, this.b);
        Drawable drawable = this.c;
        return this.g.hashCode() + qoy.b((this.e.hashCode() + shy.a(this.d, (a2 + (drawable == null ? 0 : drawable.hashCode())) * 31, 31)) * 31, 31, this.f);
    }

    public final String toString() {
        return "ReplyVideoStickerInfo(videoMeta=" + this.a + ", ownerName=" + this.b + ", verifyDrawable=" + this.c + ", prefixResId=" + this.d + ", styleInfo=" + this.e + ", isClickable=" + this.f + ", obsceneTextFilter=" + this.g + ')';
    }
}
