package xsna;

import com.vk.api.comments.CommentsOrder;
import com.vk.dto.common.data.LikeInfo;
import com.vk.dto.common.data.VKList;
import com.vk.dto.reactions.ItemReactions;
import com.vk.dto.reactions.ReactionSet;
import com.vk.newsfeed.api.data.NewsComment;
import com.vk.newsfeed.api.data.WallNegativeRepliesPlaceholder;
import java.util.List;

/* compiled from: GetCommentsResult.kt */
/* loaded from: classes3.dex */
public final class vqt {
    public final VKList<NewsComment> a;
    public final int b;
    public int c;
    public String d;
    public String e;
    public final CommentsOrder f;
    public final String g;
    public final a h;
    public final String i;
    public final WallNegativeRepliesPlaceholder j;
    public final int k;

    /* compiled from: GetCommentsResult.kt */
    public static final class a {
        public final List<LikeInfo> a;
        public final int b;
        public final int c;
        public final int d;
        public final boolean e;
        public final ReactionSet f;
        public final ItemReactions g;

        public a(List list, int i, int i2, int i3, boolean z, ReactionSet reactionSet, ItemReactions itemReactions) {
            this.a = list;
            this.b = i;
            this.c = i2;
            this.d = i3;
            this.e = z;
            this.f = reactionSet;
            this.g = itemReactions;
        }
    }

    public vqt(VKList<NewsComment> vKList, int i, int i2, String str, String str2, CommentsOrder commentsOrder, String str3, a aVar, String str4, WallNegativeRepliesPlaceholder wallNegativeRepliesPlaceholder, int i3) {
        this.a = vKList;
        this.b = i;
        this.c = i2;
        this.d = str;
        this.e = str2;
        this.f = commentsOrder;
        this.g = str3;
        this.h = aVar;
        this.i = str4;
        this.j = wallNegativeRepliesPlaceholder;
        this.k = i3;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof vqt)) {
            return false;
        }
        vqt vqtVar = (vqt) obj;
        return this.a.equals(vqtVar.a) && this.b == vqtVar.b && this.c == vqtVar.c && epx.f(this.d, vqtVar.d) && epx.f(this.e, vqtVar.e) && epx.f(this.f, vqtVar.f) && epx.f(this.g, vqtVar.g) && this.h.equals(vqtVar.h) && epx.f(this.i, vqtVar.i) && epx.f(this.j, vqtVar.j) && this.k == vqtVar.k;
    }

    public final int hashCode() {
        int a2 = shy.a(this.c, shy.a(this.b, this.a.hashCode() * 31, 31), 31);
        String str = this.d;
        int hashCode = (a2 + (str == null ? 0 : str.hashCode())) * 31;
        String str2 = this.e;
        int hashCode2 = (hashCode + (str2 == null ? 0 : str2.hashCode())) * 31;
        CommentsOrder commentsOrder = this.f;
        int hashCode3 = (hashCode2 + (commentsOrder == null ? 0 : commentsOrder.hashCode())) * 31;
        String str3 = this.g;
        int hashCode4 = (this.h.hashCode() + ((hashCode3 + (str3 == null ? 0 : str3.hashCode())) * 31)) * 31;
        String str4 = this.i;
        int hashCode5 = (hashCode4 + (str4 == null ? 0 : str4.hashCode())) * 31;
        WallNegativeRepliesPlaceholder wallNegativeRepliesPlaceholder = this.j;
        return Integer.hashCode(this.k) + ((hashCode5 + (wallNegativeRepliesPlaceholder != null ? wallNegativeRepliesPlaceholder.hashCode() : 0)) * 31);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("GetCommentsResult(comments=");
        sb.append(this.a);
        sb.append(", currentLevelCount=");
        sb.append(this.b);
        sb.append(", offset=");
        sb.append(this.c);
        sb.append(", prevFrom=");
        sb.append(this.d);
        sb.append(", nextFrom=");
        sb.append(this.e);
        sb.append(", order=");
        sb.append(this.f);
        sb.append(", currentOrder=");
        sb.append(this.g);
        sb.append(", counters=");
        sb.append(this.h);
        sb.append(", toxicNextFrom=");
        sb.append(this.i);
        sb.append(", negativeRepliesPlaceholder=");
        sb.append(this.j);
        sb.append(", direction=");
        return vu5.b(sb, this.k, ')');
    }
}
