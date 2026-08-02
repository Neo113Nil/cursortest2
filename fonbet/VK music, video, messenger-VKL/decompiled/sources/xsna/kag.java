package xsna;

import android.content.Context;
import com.vk.dto.common.id.UserId;
import com.vk.newsfeed.api.data.NewsComment;
import com.vkontakte.android.R;
import java.util.ArrayList;
import java.util.List;
import kotlin.Pair;

/* compiled from: CommentActionsMenuBuilderImpl.kt */
/* loaded from: classes4.dex */
public final class kag implements jag {
    public final NewsComment a;
    public boolean b;
    public boolean c;
    public boolean d;
    public boolean e;
    public boolean f;
    public boolean h;
    public int k;
    public UserId l;
    public UserId m;
    public boolean n;
    public boolean o;
    public boolean p;
    public boolean g = true;
    public boolean i = true;
    public boolean j = true;

    /* compiled from: CommentActionsMenuBuilderImpl.kt */
    public static final class a extends wx20 {
        public final /* synthetic */ wzs<Context, e520, s3q0> c;
        public final /* synthetic */ ArrayList<e520> d;

        public a(ArrayList arrayList, wzs wzsVar) {
            this.c = wzsVar;
            this.d = arrayList;
        }

        @Override // xsna.wx20
        public final List a() {
            return this.d;
        }

        @Override // xsna.wx20
        public final void f(Context context, e520 e520Var) {
            this.c.invoke(context, e520Var);
        }
    }

    public kag(NewsComment newsComment) {
        this.a = newsComment;
        UserId userId = UserId.d;
        this.l = userId;
        this.m = userId;
    }

    /* JADX WARN: Code restructure failed: missing block: B:18:0x004b, code lost:
    
        if (r4.equals(r27.l) == false) goto L24;
     */
    /* JADX WARN: Code restructure failed: missing block: B:96:0x02e2, code lost:
    
        if (xsna.t6g0.b().g0(r3.j) != false) goto L114;
     */
    /* JADX WARN: Removed duplicated region for block: B:131:0x037c  */
    /* JADX WARN: Removed duplicated region for block: B:134:0x0384 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:24:0x0064  */
    /* JADX WARN: Removed duplicated region for block: B:33:0x00d2  */
    /* JADX WARN: Removed duplicated region for block: B:41:0x0108  */
    @Override // xsna.jag
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final wx20 a(wzs<? super Context, ? super e520, s3q0> wzsVar) {
        boolean z;
        String str;
        UserId b = t11.b();
        ArrayList arrayList = new ArrayList();
        NewsComment newsComment = this.a;
        boolean z2 = false;
        if (!newsComment.m && !newsComment.z && !epx.f(newsComment.j, b) && !epx.f(this.l, b) && (!epx.f(this.m, b) || !epx.f(this.l, b))) {
            if (this.d) {
                UserId userId = newsComment.j;
                if (userId.b != 101) {
                }
            }
            t6g0 t6g0Var = t6g0.b;
            if (!t6g0.b().g0(newsComment.j)) {
                z = false;
                if (this.b) {
                    Pair pair = (!this.c || fxc0.B().J().h0()) ? new Pair(Integer.valueOf(R.string.reply_to), 1) : new Pair(Integer.valueOf(R.string.reply_from_group), 2);
                    arrayList.add(new e520(((Number) pair.g()).intValue(), R.drawable.vk_icon_reply_outline_28, ((Number) pair.d()).intValue(), arrayList.size() + 1, false, 0, 0, false, null, 0, null, false, 8176));
                }
                if (newsComment.o) {
                    arrayList.add(new e520(11, R.drawable.vk_icon_like_outline_28, newsComment.r ? R.string.remove_like_as_community : R.string.like_as_community, arrayList.size() + 1, false, 0, 0, false, null, 0, null, false, 8176));
                }
                if (!newsComment.s) {
                    if (newsComment.p > 0) {
                        arrayList.add(new e520(6, R.drawable.vk_icon_users_outline_28, R.string.liked, arrayList.size() + 1, false, 0, 0, false, null, 0, null, false, 8176));
                    }
                    if (this.j && !newsComment.V8() && !newsComment.D4() && (str = newsComment.b) != null && !drm0.N(str)) {
                        arrayList.add(new e520(3, R.drawable.vk_icon_copy_outline_28, R.string.copy_comment_text, arrayList.size() + 1, false, 0, 0, false, null, 0, null, false, 8176));
                    }
                    if (this.k == 0 && fkq0.c(b) && this.e) {
                        arrayList.add(new e520(10, R.drawable.vk_icon_share_outline_28, R.string.repost, arrayList.size() + 1, false, 0, 0, false, null, 0, null, false, 8176));
                    } else {
                        int i = this.k;
                        if (i == 6 && this.f) {
                            arrayList.add(new e520(18, R.drawable.vk_icon_share_outline_28, R.string.repost, arrayList.size() + 1, false, 0, 0, false, null, 0, null, false, 8176));
                        } else if ((i == 0 || i == 1 || i == 2 || i == 6) && this.j) {
                            arrayList.add(new e520(4, R.drawable.vk_icon_chain_outline_28, R.string.copy_link, arrayList.size() + 1, false, 0, 0, false, null, 0, null, false, 8176));
                        }
                    }
                    if (this.n && newsComment.x) {
                        arrayList.add(new e520(17, R.drawable.vk_icon_block_outline_28, R.string.comment_action_remove_from_blacklist, arrayList.size() + 1, false, 0, 0, false, null, 0, null, false, 8176));
                    }
                    boolean z3 = fkq0.d(b) && !epx.f(newsComment.j, b);
                    if (z3 && this.d) {
                        UserId userId2 = newsComment.j;
                        z3 = (userId2.b == 101 || userId2.equals(this.l)) ? false : true;
                    }
                    if (z3 && this.i) {
                        arrayList.add(new e520(9, R.drawable.vk_icon_report_outline_28, R.string.report_content, arrayList.size() + 1, this.o, 0, 0, false, null, 0, null, false, 8160));
                    }
                    if (this.n && !newsComment.x) {
                        arrayList.add(new e520(14, R.drawable.vk_icon_block_outline_28, R.string.comment_action_add_to_blacklist, arrayList.size() + 1, true, 0, 0, false, null, 0, null, false, 8160));
                    }
                    if (z) {
                        if (!epx.f(newsComment.j, b)) {
                            if (fkq0.b(newsComment.j)) {
                                t6g0 t6g0Var2 = t6g0.b;
                            }
                            if (this.g && z2 && newsComment.z1()) {
                                arrayList.add(new e520(8, R.drawable.vk_icon_edit_outline_28, R.string.edit, arrayList.size() + 1, false, 0, 0, false, null, 0, null, false, 8176));
                            }
                        }
                        z2 = true;
                        if (this.g) {
                            arrayList.add(new e520(8, R.drawable.vk_icon_edit_outline_28, R.string.edit, arrayList.size() + 1, false, 0, 0, false, null, 0, null, false, 8176));
                        }
                    }
                    if (z) {
                        arrayList.add(new e520(7, R.drawable.vk_icon_delete_outline_28, this.p ? R.string.comment_action_delete_comment_short_title : R.string.delete_comment, arrayList.size() + 1, true, 0, 0, false, null, 0, null, false, 8160));
                    }
                }
                if (newsComment.s && this.h) {
                    arrayList.add(new e520(15, R.drawable.vk_icon_delete_outline_28, R.string.comment_action_delete_thread, arrayList.size() + 1, true, 0, 0, false, null, 0, null, false, 8160));
                }
                if (arrayList.isEmpty()) {
                    return new a(arrayList, wzsVar);
                }
                return null;
            }
        }
        z = true;
        if (this.b) {
        }
        if (newsComment.o) {
        }
        if (!newsComment.s) {
        }
        if (newsComment.s) {
            arrayList.add(new e520(15, R.drawable.vk_icon_delete_outline_28, R.string.comment_action_delete_thread, arrayList.size() + 1, true, 0, 0, false, null, 0, null, false, 8160));
        }
        if (arrayList.isEmpty()) {
        }
    }
}
