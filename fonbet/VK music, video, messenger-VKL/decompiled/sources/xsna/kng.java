package xsna;

import android.content.Context;
import android.os.Build;
import android.util.Size;
import com.vk.dto.common.Attachment;
import com.vk.dto.common.id.UserId;
import com.vk.dto.stickers.StickerItem;
import com.vk.newsfeed.api.data.CommentThread;
import com.vk.newsfeed.api.data.NewsComment;
import com.vk.newsfeed.api.data.TypeReply;
import com.vk.newsfeed.impl.fragments.VideoCommentThreadFragment;
import com.vk.stat.scheme.MobileOfficialAppsVideoStat$TypeVideoCommentClick;
import com.vkontakte.android.R;
import com.vkontakte.android.attachments.StickerAttachment;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.Pair;
import xsna.ikv0;

/* compiled from: CommonVideoCommentThreadPresenter.kt */
/* loaded from: classes4.dex */
public final class kng {
    public static final io.reactivex.rxjava3.subjects.f<a> b;
    public final ics0 a;

    /* compiled from: CommonVideoCommentThreadPresenter.kt */
    public static abstract class a {
        public final iag a;

        /* compiled from: CommonVideoCommentThreadPresenter.kt */
        /* renamed from: xsna.kng$a$a, reason: collision with other inner class name */
        public static final class C3190a extends a {
        }

        /* compiled from: CommonVideoCommentThreadPresenter.kt */
        public static final class b extends a {
        }

        /* compiled from: CommonVideoCommentThreadPresenter.kt */
        public static final class c extends a {
        }

        public a(iag iagVar) {
            this.a = iagVar;
        }
    }

    static {
        List<String> list = ics0.c;
        b = new io.reactivex.rxjava3.subjects.f<>();
    }

    public kng(ics0 ics0Var) {
        this.a = ics0Var;
    }

    public final io.reactivex.rxjava3.core.q<NewsComment> a(pak pakVar, wzs<? super pak, ? super Integer, owt> wzsVar) {
        Object obj;
        StickerItem stickerItem;
        k8 k8Var = new k8(10, wzsVar, pakVar);
        UserId userId = pakVar.k;
        List<Attachment> list = pakVar.d;
        Iterator<T> it = list.iterator();
        while (true) {
            if (!it.hasNext()) {
                obj = null;
                break;
            }
            obj = it.next();
            if (obj instanceof StickerAttachment) {
                break;
            }
        }
        if (!(obj instanceof StickerAttachment)) {
            obj = null;
        }
        StickerAttachment stickerAttachment = (StickerAttachment) obj;
        Pair pair = new Pair((stickerAttachment == null || (stickerItem = stickerAttachment.f) == null) ? null : Integer.valueOf(stickerItem.b), stickerAttachment != null ? stickerAttachment.h : null);
        Integer num = (Integer) pair.d();
        String str = (String) pair.g();
        uft0 uft0Var = new uft0();
        int i = pakVar.e;
        UserId userId2 = (userId == null || !fkq0.b(userId) || fxc0.B().J().h0()) ? pakVar.f : userId;
        String str2 = pakVar.g;
        String str3 = pakVar.a;
        List<Attachment> list2 = list;
        ArrayList arrayList = new ArrayList(c5g.u(list2, 10));
        Iterator<T> it2 = list2.iterator();
        while (it2.hasNext()) {
            arrayList.add(((Attachment) it2.next()).toString());
        }
        Boolean valueOf = Boolean.valueOf(userId != null && fkq0.b(userId));
        Integer num2 = pakVar.b;
        return rsg0.T(yfb.x(uft0Var.o(i, userId2, str2, str3, arrayList, valueOf, (num2 == null || num2.intValue() <= 0) ? null : num2, num, null, str, null, pakVar.h, pakVar.i, (userId == null || !fkq0.b(userId)) ? null : userId, pakVar.l))).L(new osk0(new h9i0(5, this.a, k8Var), 12), false);
    }

    public final io.reactivex.rxjava3.internal.operators.observable.m1 b(int i, UserId userId, String str) {
        return o25.a().m(false).L(new kb(new jng(this, userId, i, str), 20), false).a0(asu0.a.d());
    }

    public final void c(int i, Context context) {
        if (Build.VERSION.SDK_INT <= 32) {
            int i2 = VideoCommentThreadFragment.B0;
            l7s u = bwt0.u(context);
            ikv0.a aVar = new ikv0.a(u);
            float f = 24;
            aVar.t = new ikv0.c.C3058c(R.drawable.vk_icon_check_circle_outline_28, Integer.valueOf(R.attr.vk_ui_icon_accent_themed), new Size(iah0.a(f), iah0.a(f)), 8);
            aVar.u = new ikv0.d(u.getString(R.string.live_comment_copied), (String) null, (ikv0.d.a) null, 6);
            pkv0.e(aVar);
            pkv0.f(aVar);
        }
        if (((vbs0) this.a.a.getValue()) != null) {
            vbs0.a(MobileOfficialAppsVideoStat$TypeVideoCommentClick.Event.COPY, i);
        }
    }

    public final void d(iag iagVar, TypeReply typeReply) {
        if (!(iagVar instanceof NewsComment) || ((vbs0) this.a.a.getValue()) == null) {
            return;
        }
        int i = ((NewsComment) iagVar).i;
        if (typeReply == TypeReply.Click) {
            vbs0.a(MobileOfficialAppsVideoStat$TypeVideoCommentClick.Event.CLICK_TO_REPLY, i);
        } else {
            vbs0.a(MobileOfficialAppsVideoStat$TypeVideoCommentClick.Event.SWIPE_TO_REPLY, i);
        }
    }

    public final void e(iag iagVar) {
        NewsComment newsComment;
        if (iagVar instanceof NewsComment) {
            NewsComment newsComment2 = (NewsComment) iagVar;
            CommentThread commentThread = newsComment2.L;
            if (commentThread != null && (newsComment = (NewsComment) j5g.k0(commentThread.f)) != null) {
                newsComment2 = newsComment;
            }
            if (((vbs0) this.a.a.getValue()) != null) {
                vbs0.a(MobileOfficialAppsVideoStat$TypeVideoCommentClick.Event.CLICK_TO_REPLY, newsComment2.i);
            }
        }
    }

    public final void f(iag iagVar, aa aaVar, bfg<?> bfgVar) {
        if (iagVar instanceof NewsComment) {
            NewsComment newsComment = (NewsComment) iagVar;
            if (!newsComment.u && !newsComment.s) {
                bfgVar.Jg(newsComment, aaVar);
            }
        }
        if (((vbs0) this.a.a.getValue()) != null) {
            vbs0.a(MobileOfficialAppsVideoStat$TypeVideoCommentClick.Event.TAP, iagVar.getId());
        }
    }
}
