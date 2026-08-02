package xsna;

import android.content.Context;
import com.vk.newsfeed.api.data.NewsComment;
import com.vkontakte.android.R;
import java.util.List;
import kotlin.collections.builders.ListBuilder;

/* compiled from: CommentVideoActionsMenuBuilderImpl.kt */
/* loaded from: classes4.dex */
public final class pdg implements jag {
    public final qdg a;

    /* compiled from: CommentVideoActionsMenuBuilderImpl.kt */
    public static final class a extends wx20 {
        public final /* synthetic */ wzs<Context, e520, s3q0> c;
        public final /* synthetic */ List<e520> d;

        public a(wzs wzsVar, ListBuilder listBuilder) {
            this.c = wzsVar;
            this.d = listBuilder;
        }

        @Override // xsna.wx20
        public final List<e520> a() {
            return this.d;
        }

        @Override // xsna.wx20
        public final void f(Context context, e520 e520Var) {
            this.c.invoke(context, e520Var);
        }
    }

    public pdg(qdg qdgVar) {
        this.a = qdgVar;
    }

    @Override // xsna.jag
    public final wx20 a(wzs<? super Context, ? super e520, s3q0> wzsVar) {
        int i;
        int i2;
        String str;
        ListBuilder e = e43.e();
        qdg qdgVar = this.a;
        boolean z = qdgVar.p;
        int i3 = qdgVar.h;
        NewsComment newsComment = qdgVar.a;
        if (z) {
            i = 1;
            e.add(new e520(8, R.drawable.vk_icon_edit_outline_28, R.string.edit, 1, false, 0, 0, true, null, 0, null, false, 7904));
        } else {
            i = 0;
        }
        if (qdgVar.b) {
            if (!qdgVar.c || fxc0.B().J().h0()) {
                int i4 = i + 1;
                e.add(new e520(1, R.drawable.vk_icon_reply_outline_28, R.string.reply_to, i4, false, 0, 0, true, null, 0, null, false, 7904));
                i = i4;
            } else {
                int i5 = i + 1;
                e.add(new e520(2, R.drawable.vk_icon_reply_outline_28, R.string.reply_from_group, i5, false, 0, 0, true, null, 0, null, false, 7904));
                i = i5;
            }
        }
        if (newsComment.o) {
            int i6 = i + 1;
            e.add(new e520(11, R.drawable.vk_icon_like_outline_28, newsComment.r ? R.string.remove_like_as_community : R.string.like_as_community, i6, false, 0, 0, true, null, 0, null, false, 7904));
            i = i6;
        }
        int i7 = i + 1;
        e.add(new e520(5, R.drawable.vk_icon_like_outline_28, qdgVar.g ? R.string.me_unlike : R.string.me_like, i7, false, 0, 0, true, null, 0, null, false, 7904));
        if (!newsComment.s) {
            if (newsComment.p > 0) {
                int i8 = i + 2;
                e.add(new e520(6, R.drawable.vk_icon_users_outline_28, R.string.liked, i8, false, 0, 0, true, null, 0, null, false, 7904));
                i7 = i8;
            }
            if (!newsComment.V8() && !newsComment.D4() && (str = newsComment.b) != null && !drm0.N(str)) {
                int i9 = i7 + 1;
                e.add(new e520(3, R.drawable.vk_icon_copy_outline_28, R.string.copy_comment_text, i9, false, 0, 0, true, null, 0, null, false, 7904));
                i7 = i9;
            }
            if (i3 == 0 && fkq0.c(qdgVar.k) && qdgVar.e) {
                i2 = i7 + 1;
                e.add(new e520(10, R.drawable.vk_icon_share_outline_28, R.string.repost, i2, false, 0, 0, true, null, 0, null, false, 7904));
            } else if (qdgVar.o && i3 != 2) {
                i2 = i7 + 1;
                e.add(new e520(4, R.drawable.vk_icon_chain_outline_28, R.string.copy_link, i2, false, 0, 0, true, null, 0, null, false, 7904));
            }
            i7 = i2;
        }
        if (qdgVar.n) {
            int i10 = i7 + 1;
            e.add(new e520(9, R.drawable.vk_icon_report_outline_28, R.string.report_content, i10, false, 0, 0, true, null, 0, null, false, 7904));
            i7 = i10;
        }
        if (!newsComment.s && qdgVar.l) {
            if (qdgVar.f && qdgVar.m) {
                newsComment.z1();
            }
            e.add(new e520(7, 0, R.string.delete_comment, i7 + 1, true, 0, 0, true, null, 0, null, false, 7904));
        }
        ListBuilder g = e.g();
        a aVar = new a(wzsVar, g);
        if (g.isEmpty()) {
            return null;
        }
        return aVar;
    }
}
