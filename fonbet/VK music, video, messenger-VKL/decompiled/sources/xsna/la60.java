package xsna;

import android.app.Activity;
import android.content.Context;
import android.content.DialogInterface;
import android.os.Handler;
import android.os.Looper;
import android.view.View;
import android.webkit.WebView;
import com.mbridge.msdk.playercommon.exoplayer2.C;
import com.vk.core.serialize.Serializer;
import com.vk.core.view.components.context.menu.VkContextMenu;
import com.vk.dto.badges.Badgeable;
import com.vk.dto.badges.BadgesSet;
import com.vk.dto.common.Image;
import com.vk.dto.common.id.UserId;
import com.vk.dto.newsfeed.Owner;
import com.vk.dto.newsfeed.entries.Html5Entry;
import com.vk.dto.newsfeed.entries.MyTargetNativeAdEntry;
import com.vk.dto.newsfeed.entries.OptionalNativeAdEntry;
import com.vk.dto.newsfeed.entries.Post;
import com.vk.dto.newsfeed.entries.PromoPost;
import com.vk.dto.newsfeed.entries.post.NewsfeedCoowners;
import com.vk.dto.reactions.BadgeMeta;
import com.vk.dto.reactions.ReactionMeta;
import com.vk.dto.reactions.ReactionSet;
import com.vk.fave.entities.FavePage;
import com.vk.feed.core.models.discover.DiscoverMediaBlock;
import com.vk.feed.core.models.news.NewsEntry;
import com.vk.feed.core.models.news.YandexNativeAdEntry;
import com.vk.newsfeed.common.util.a;
import com.vk.newsfeed.common.views.SnackbarGroupSubscriptionView;
import com.vkontakte.android.R;
import com.vkontakte.android.attachments.ShitAttachment;
import java.util.ArrayList;
import java.util.Iterator;
import xsna.dw20;
import xsna.e3m;
import xsna.eeu0;
import xsna.h7u0;
import xsna.j7u0;
import xsna.utj;

/* compiled from: NewsEntryDialogs.kt */
/* loaded from: classes4.dex */
public final class la60 {
    public com.vk.core.view.components.spinner.c a;
    public final Handler b = new Handler(Looper.getMainLooper());

    public static void a(Context context, String str) {
        final WebView webView = new WebView(context);
        webView.loadData(str, "text/html", C.UTF8_NAME);
        int i = h7u0.p;
        h7u0.a c = h7u0.b.c(context);
        c.h0("Ads Debug");
        c.f = webView;
        c.c0(R.string.close, null);
        androidx.appcompat.app.d m = c.m();
        if (m != null) {
            m.setOnDismissListener(new DialogInterface.OnDismissListener() { // from class: xsna.ia60
                @Override // android.content.DialogInterface.OnDismissListener
                public final void onDismiss(DialogInterface dialogInterface) {
                    webView.destroy();
                }
            });
        }
    }

    public static void b(Context context, gzs gzsVar) {
        int i = h7u0.p;
        h7u0.a a = h7u0.b.a(context);
        a.g0(R.string.donut_publish_free_copy_title);
        a.U(R.string.donut_publish_free_copy_text);
        a.c0(R.string.donut_publish_free_copy_yes, new ja60(0, gzsVar));
        a.W(R.string.donut_publish_free_copy_no, null);
        a.m();
    }

    public static void c(Context context, NewsEntry newsEntry, UserId userId, boolean z, gzs gzsVar) {
        Post R;
        NewsfeedCoowners newsfeedCoowners;
        UserId userId2;
        int zb = newsEntry.zb();
        int i = di60.C(newsEntry) ? R.string.draft_delete_confirm_desc : (!rv60.h(userId, newsEntry) || !z || (R = di60.R(newsEntry)) == null || (newsfeedCoowners = R.f0) == null || (userId2 = newsfeedCoowners.d) == null || !fkq0.b(userId2)) ? (rv60.h(userId, newsEntry) && z) ? R.string.coowners_reject_dialog_profile_message : (!rv60.f(newsEntry) || rv60.g(newsEntry)) ? (zb == 1 || zb == 9) ? R.string.delete_photo_confirm : zb == 2 ? R.string.delete_video_confirm : R.string.delete_confirm : R.string.coowners_remove_dialog_message : R.string.coowners_reject_dialog_group_message;
        int i2 = di60.C(newsEntry) ? R.string.draft_delete_confirm : (rv60.h(userId, newsEntry) && z) ? R.string.coowners_reject_dialog_title : (!rv60.f(newsEntry) || rv60.g(newsEntry)) ? R.string.confirm : R.string.coowners_remove_dialog_title;
        int i3 = di60.C(newsEntry) ? R.string.delete : (rv60.h(userId, newsEntry) && z) ? R.string.coowners_reject : (!rv60.f(newsEntry) || rv60.g(newsEntry)) ? R.string.yes : R.string.coowners_dialog_remove;
        int i4 = di60.C(newsEntry) ? R.string.cancel : (rv60.h(userId, newsEntry) && z) ? R.string.coowners_leave_as_is : (!rv60.f(newsEntry) || rv60.g(newsEntry)) ? R.string.no : R.string.coowners_dialog_cancel;
        h7u0.a aVar = new h7u0.a(context, di60.C(newsEntry) ? R.style.VkAlertDialogThemeRedNegative : 0, j7u0.c.a);
        aVar.g0(i2);
        aVar.U(i);
        aVar.c0(i3, new ka60(gzsVar, 0));
        aVar.W(i4, null);
        aVar.m();
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:32:0x0121  */
    /* JADX WARN: Type inference failed for: r2v0, types: [com.vk.feed.core.models.news.NewsEntry, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r6v1, types: [com.vk.newsfeed.common.util.h] */
    /* JADX WARN: Type inference failed for: r6v10, types: [com.vk.newsfeed.common.util.a] */
    /* JADX WARN: Type inference failed for: r6v15, types: [com.vk.newsfeed.common.util.g] */
    /* JADX WARN: Type inference failed for: r6v2 */
    /* JADX WARN: Type inference failed for: r6v4, types: [com.vk.newsfeed.common.util.b] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static VkContextMenu d(View view, xm60 xm60Var, z960 z960Var, gzs gzsVar, View view2) {
        ?? hVar;
        v4d0 v4d0Var;
        ReactionSet s4;
        ?? r2 = xm60Var.a;
        NewsEntry newsEntry = xm60Var.b;
        if (r2 != 0 && !(r2 instanceof DiscoverMediaBlock) && (newsEntry instanceof DiscoverMediaBlock)) {
            Integer valueOf = Integer.valueOf(R.string.newsfeed_send_badge_full);
            hVar = new i2n(r2, newsEntry);
            boolean z = r2.d;
            hVar.n = z;
            boolean z2 = !z;
            hVar.o = z2;
            hVar.p = z2;
            hVar.k = z2;
            hVar.q = z2;
            hVar.e = z2;
            hVar.f = z2;
            hVar.r = z2;
            hVar.h = false;
            hVar.l = false;
            hVar.m = false;
            hVar.j = false;
            hVar.g = false;
            hVar.d = cn70.b(6);
            hVar.i = false;
            boolean z3 = r2 instanceof Post;
            if (z3 && i2n.e(r2)) {
                Post post = (Post) r2;
                ReactionSet reactionSet = post.V;
                if (reactionSet != null) {
                    ArrayList<ReactionMeta> arrayList = reactionSet.c;
                    if (!arrayList.isEmpty()) {
                        Iterator it = arrayList.iterator();
                        while (it.hasNext()) {
                            if (((ReactionMeta) it.next()) instanceof BadgeMeta) {
                            }
                        }
                    }
                }
                BadgesSet u0 = ((Badgeable) r2).u0();
                boolean z4 = u0 != null && u0.h;
                ReactionSet reactionSet2 = post.V;
                if (reactionSet2 != null) {
                    reactionSet2.c.add(new BadgeMeta(Integer.MAX_VALUE, null, valueOf, null, 0, z4, 26, null));
                }
                if (view2 != null) {
                    hVar.u = view2;
                }
            }
            boolean z5 = r2 instanceof PromoPost;
            if (z5 && i2n.e(r2)) {
                Post post2 = ((PromoPost) r2).n;
                ReactionSet reactionSet3 = post2.V;
                if (reactionSet3 != null) {
                    ArrayList<ReactionMeta> arrayList2 = reactionSet3.c;
                    if (!arrayList2.isEmpty()) {
                        Iterator it2 = arrayList2.iterator();
                        while (it2.hasNext()) {
                            if (((ReactionMeta) it2.next()) instanceof BadgeMeta) {
                            }
                        }
                    }
                }
                BadgesSet u02 = ((Badgeable) r2).u0();
                boolean z6 = u02 != null && u02.h;
                ReactionSet reactionSet4 = post2.V;
                if (reactionSet4 != null) {
                    reactionSet4.c.add(new BadgeMeta(Integer.MAX_VALUE, null, valueOf, null, 0, z6, 26, null));
                }
                if (view2 != null) {
                }
            }
            if ((z3 || z5) && (r2 instanceof o2f0) && !i2n.e(r2) && (s4 = ((o2f0) r2).s4()) != null) {
                s4.c.removeIf(new h2n(new qm0(19), 0));
            }
            if (view2 != null) {
            }
        } else if (r2 == 0 || !((r2 instanceof PromoPost) || (r2 instanceof ShitAttachment) || (r2 instanceof Html5Entry) || (r2 instanceof OptionalNativeAdEntry) || (r2 instanceof YandexNativeAdEntry) || (r2 instanceof MyTargetNativeAdEntry))) {
            FavePage favePage = xm60Var.c;
            if (favePage != null) {
                hVar = new com.vk.newsfeed.common.util.f(favePage);
            } else {
                hVar = new com.vk.newsfeed.common.util.h(r2, newsEntry);
                hVar.l = xm60Var.d;
                hVar.f = true;
                hVar.k = xm60Var.g;
                hVar.n = true;
                hVar.o = xm60Var.h;
                hVar.p = xm60Var.i;
                hVar.q = xm60Var.j;
                hVar.r = xm60Var.k;
                hVar.s = xm60Var.l;
                hVar.t = xm60Var.m;
                hVar.u = xm60Var.n;
                hVar.v = xm60Var.o;
            }
        } else {
            hVar = new com.vk.newsfeed.common.util.b(r2, newsEntry);
            hVar.h = true;
        }
        VkContextMenu a = hVar.b(new je40(z960Var, 1)).a(view.getContext(), new a.AbstractC1374a.b(view));
        boolean z7 = view2 != null;
        Context context = view.getContext();
        if (z7) {
            v4d0Var = new v4d0(context);
            v4d0Var.a = a;
        } else {
            v4d0Var = null;
        }
        a.f(new wf40(v4d0Var, 4));
        a.e(new hn9(20, v4d0Var, gzsVar));
        if (xm60Var.e) {
            a.j(true);
            return a;
        }
        a.g();
        return a;
    }

    public static /* synthetic */ VkContextMenu e(la60 la60Var, View view, xm60 xm60Var, z960 z960Var, gzs gzsVar, int i) {
        if ((i & 8) != 0) {
            gzsVar = null;
        }
        la60Var.getClass();
        return d(view, xm60Var, z960Var, gzsVar, null);
    }

    public static void f(Context context, CharSequence charSequence, wzs wzsVar) {
        int i = h7u0.p;
        eeu0.a.C2801a c2801a = new eeu0.a.C2801a(h7u0.b.a(context));
        c2801a.f(R.string.add_comment_hint);
        c2801a.g = charSequence;
        c2801a.m = 8;
        c2801a.q = true;
        c2801a.k = context.getString(R.string.save);
        c2801a.t = wzsVar;
        String string = context.getString(R.string.cancel);
        aad aadVar = new aad(7);
        c2801a.l = string;
        c2801a.u = aadVar;
        c2801a.g();
    }

    /* JADX WARN: Code restructure failed: missing block: B:14:0x0032, code lost:
    
        if (r1 == null) goto L19;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static void g(Context context, NewsEntry newsEntry) {
        Post R;
        Owner owner;
        String str;
        Activity h = e3m.h(context);
        if (h == null || h.isFinishing() || h.isDestroyed() || (R = di60.R(newsEntry)) == null || (owner = R.Q) == null) {
            return;
        }
        Image image = owner.g;
        if (image != null) {
            Serializer.c<Owner> cVar = Owner.CREATOR;
            str = Owner.a.a(iah0.a(32), image);
        }
        str = "";
        String str2 = owner.c;
        String str3 = str2 != null ? str2 : "";
        NewsEntry.TrackData Cb = newsEntry.Cb();
        SnackbarGroupSubscriptionView snackbarGroupSubscriptionView = new SnackbarGroupSubscriptionView(h);
        snackbarGroupSubscriptionView.c = new yzm0(owner);
        snackbarGroupSubscriptionView.setAvatarUrl(str);
        snackbarGroupSubscriptionView.setTitle(str3);
        snackbarGroupSubscriptionView.b = Cb;
        snackbarGroupSubscriptionView.c(SnackbarGroupSubscriptionView.ViewState.UNSUBSCRIBED);
        utj.a aVar = new utj.a(h);
        aVar.r = snackbarGroupSubscriptionView;
        aVar.i = true;
        aVar.m();
    }

    public static void h(Context context, hz20 hz20Var) {
        dw20.b bVar = new dw20.b(context, null);
        e3m.a aVar = e3m.a;
        ((dw20.b) dw20.a.Q(bVar.N(new baf0(m33.a(R.drawable.vk_icon_fire_56, context), context.getColor(R.color.vk_orange_fire))).v0(R.string.trending_post_edit_warning_title), R.string.trending_post_edit_warning_description)).T(R.string.cancel, new zq3(23)).i0(R.string.continue_, hz20Var).I0(null);
    }
}
