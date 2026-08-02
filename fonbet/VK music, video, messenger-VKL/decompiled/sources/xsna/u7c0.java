package xsna;

import android.graphics.Bitmap;
import android.graphics.drawable.Drawable;
import com.vk.dto.common.Attachment;
import com.vk.dto.common.id.UserId;
import com.vk.stickers.api.models.post.PostStickerStyle;
import java.util.ArrayList;
import java.util.List;

/* compiled from: PostStickerInfo.kt */
/* loaded from: classes5.dex */
public final class u7c0 {
    public final int a;
    public final UserId b;
    public final c c;
    public final List<c> d;
    public final CharSequence e;
    public final d f;
    public final a g;
    public final f h;
    public final b i;
    public final e j;

    /* compiled from: PostStickerInfo.kt */
    public static final class a {
        public final List<q7c0> a;
        public final List<Attachment> b;
        public final y9c0 c;
        public final int d;
        public Bitmap e;

        public a() {
            throw null;
        }

        public a(List list, List list2, y9c0 y9c0Var, int i, int i2) {
            i = (i2 & 8) != 0 ? 0 : i;
            this.a = list;
            this.b = list2;
            this.c = y9c0Var;
            this.d = i;
            this.e = null;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof a)) {
                return false;
            }
            a aVar = (a) obj;
            return epx.f(this.a, aVar.a) && epx.f(this.b, aVar.b) && epx.f(this.c, aVar.c) && this.d == aVar.d && epx.f(this.e, aVar.e);
        }

        public final int hashCode() {
            int a = fw3.a(this.a.hashCode() * 31, 31, this.b);
            y9c0 y9c0Var = this.c;
            int a2 = shy.a(this.d, (a + (y9c0Var == null ? 0 : y9c0Var.hashCode())) * 31, 31);
            Bitmap bitmap = this.e;
            return a2 + (bitmap != null ? bitmap.hashCode() : 0);
        }

        public final String toString() {
            StringBuilder sb = new StringBuilder("AttachmentsInfo(attachmentsTypes=");
            sb.append(this.a);
            sb.append(", attachments=");
            sb.append(this.b);
            sb.append(", poster=");
            sb.append(this.c);
            sb.append(", targetAttachIndex=");
            sb.append(this.d);
            sb.append(", contentImageBitmap=");
            return qr.c(sb, this.e, ')');
        }
    }

    /* compiled from: PostStickerInfo.kt */
    public static final class b {
        public final int a;
        public final UserId b;
        public final UserId c;

        public b(int i, UserId userId, UserId userId2) {
            this.a = i;
            this.b = userId;
            this.c = userId2;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof b)) {
                return false;
            }
            b bVar = (b) obj;
            return this.a == bVar.a && epx.f(this.b, bVar.b) && epx.f(this.c, bVar.c);
        }

        public final int hashCode() {
            return Long.hashCode(this.c.b) + bh10.a(Integer.hashCode(this.a) * 31, 31, this.b.b);
        }

        public final String toString() {
            StringBuilder sb = new StringBuilder("ChannelPostInfo(postId=");
            sb.append(this.a);
            sb.append(", channelId=");
            sb.append(this.b);
            sb.append(", channelOwnerId=");
            return gp.b(sb, this.c, ')');
        }
    }

    /* compiled from: PostStickerInfo.kt */
    public static final class c {
        public final String a;
        public final Drawable b;
        public final String c;

        public c(String str, Drawable drawable, String str2) {
            this.a = str;
            this.b = drawable;
            this.c = str2;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof c)) {
                return false;
            }
            c cVar = (c) obj;
            return epx.f(this.a, cVar.a) && epx.f(this.b, cVar.b) && epx.f(this.c, cVar.c);
        }

        public final int hashCode() {
            int hashCode = this.a.hashCode() * 31;
            Drawable drawable = this.b;
            return this.c.hashCode() + ((hashCode + (drawable == null ? 0 : drawable.hashCode())) * 31);
        }

        public final String toString() {
            StringBuilder sb = new StringBuilder("NameInfo(name=");
            sb.append(this.a);
            sb.append(", verifiedDrawable=");
            sb.append(this.b);
            sb.append(", photoUrl=");
            return ho8.a(sb, this.c, ')');
        }
    }

    /* compiled from: PostStickerInfo.kt */
    public static final class d {
        public final String a;
        public final List<String> b;
        public final CharSequence c;
        public final a d;

        public d(String str, ArrayList arrayList, CharSequence charSequence, a aVar) {
            this.a = str;
            this.b = arrayList;
            this.c = charSequence;
            this.d = aVar;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof d)) {
                return false;
            }
            d dVar = (d) obj;
            return epx.f(this.a, dVar.a) && epx.f(this.b, dVar.b) && epx.f(this.c, dVar.c) && epx.f(this.d, dVar.d);
        }

        public final int hashCode() {
            int hashCode = this.a.hashCode() * 31;
            List<String> list = this.b;
            int hashCode2 = (hashCode + (list == null ? 0 : list.hashCode())) * 31;
            CharSequence charSequence = this.c;
            return this.d.hashCode() + ((hashCode2 + (charSequence != null ? charSequence.hashCode() : 0)) * 31);
        }

        public final String toString() {
            return "RepostInfo(name=" + this.a + ", coauthorNameList=" + this.b + ", text=" + ((Object) this.c) + ", attachmentsInfo=" + this.d + ')';
        }
    }

    /* compiled from: PostStickerInfo.kt */
    public static final class e {
        public final PostStickerStyle a;
        public final List<PostStickerStyle> b;

        /* JADX WARN: Multi-variable type inference failed */
        public e(PostStickerStyle postStickerStyle, List<? extends PostStickerStyle> list) {
            this.a = postStickerStyle;
            this.b = list;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof e)) {
                return false;
            }
            e eVar = (e) obj;
            return this.a == eVar.a && epx.f(this.b, eVar.b);
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

    /* compiled from: PostStickerInfo.kt */
    public static final class f {
        public final int a;
        public final UserId b;

        public f(int i, UserId userId) {
            this.a = i;
            this.b = userId;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof f)) {
                return false;
            }
            f fVar = (f) obj;
            return this.a == fVar.a && epx.f(this.b, fVar.b);
        }

        public final int hashCode() {
            return Long.hashCode(this.b.b) + (Integer.hashCode(this.a) * 31);
        }

        public final String toString() {
            StringBuilder sb = new StringBuilder("VideoInfo(videoId=");
            sb.append(this.a);
            sb.append(", videoOwnerId=");
            return gp.b(sb, this.b, ')');
        }
    }

    public u7c0(int i, UserId userId, c cVar, List<c> list, CharSequence charSequence, d dVar, a aVar, f fVar, b bVar, e eVar) {
        this.a = i;
        this.b = userId;
        this.c = cVar;
        this.d = list;
        this.e = charSequence;
        this.f = dVar;
        this.g = aVar;
        this.h = fVar;
        this.i = bVar;
        this.j = eVar;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof u7c0)) {
            return false;
        }
        u7c0 u7c0Var = (u7c0) obj;
        return this.a == u7c0Var.a && epx.f(this.b, u7c0Var.b) && epx.f(this.c, u7c0Var.c) && epx.f(this.d, u7c0Var.d) && epx.f(this.e, u7c0Var.e) && epx.f(this.f, u7c0Var.f) && epx.f(this.g, u7c0Var.g) && epx.f(this.h, u7c0Var.h) && epx.f(this.i, u7c0Var.i) && epx.f(this.j, u7c0Var.j);
    }

    public final int hashCode() {
        int hashCode = (this.c.hashCode() + bh10.a(Integer.hashCode(this.a) * 31, 31, this.b.b)) * 31;
        List<c> list = this.d;
        int hashCode2 = (hashCode + (list == null ? 0 : list.hashCode())) * 31;
        CharSequence charSequence = this.e;
        int hashCode3 = (hashCode2 + (charSequence == null ? 0 : charSequence.hashCode())) * 31;
        d dVar = this.f;
        int hashCode4 = (this.g.hashCode() + ((hashCode3 + (dVar == null ? 0 : dVar.hashCode())) * 31)) * 31;
        f fVar = this.h;
        int hashCode5 = (hashCode4 + (fVar == null ? 0 : fVar.hashCode())) * 31;
        b bVar = this.i;
        return this.j.hashCode() + ((hashCode5 + (bVar != null ? bVar.hashCode() : 0)) * 31);
    }

    public final String toString() {
        return "PostStickerInfo(postId=" + this.a + ", ownerId=" + this.b + ", nameInfo=" + this.c + ", coauthorNameInfoList=" + this.d + ", text=" + ((Object) this.e) + ", repostInfo=" + this.f + ", attachmentsInfo=" + this.g + ", videoInfo=" + this.h + ", channelPostInfo=" + this.i + ", styleInfo=" + this.j + ')';
    }
}
