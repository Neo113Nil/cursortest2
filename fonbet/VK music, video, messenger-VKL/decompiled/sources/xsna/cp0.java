package xsna;

import android.graphics.drawable.Drawable;
import com.vk.channels.api.Channel;
import com.vk.clips.upload.vk.impl.uploader.e;
import com.vk.clips.viewer.impl.utils.ClipVideoPixelExecutorDelegate;
import com.vk.dto.common.id.UserId;
import com.vk.dto.group.Group;
import com.vk.dto.newsfeed.Owner;
import com.vk.dto.newsfeed.activities.Activity;
import com.vk.dto.newsfeed.activities.Comment;
import com.vk.dto.newsfeed.activities.CommentsActivity;
import com.vk.dto.newsfeed.entries.Post;
import com.vk.feed.core.models.news.NewsEntry;
import com.vk.newsfeed.api.data.NewsComment;
import com.vk.newsfeed.impl.presenters.EntriesListPresenter;
import com.vk.voip.ui.broadcast.fragments.scheduled.BroadcastScheduledFragment;
import com.vk.voip.ui.call_effects.beauty.ui.BeautyVideoFragment;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.Map;
import xsna.drz;
import xsna.el50;

/* compiled from: R8$$SyntheticClass */
/* loaded from: classes17.dex */
public final /* synthetic */ class cp0 implements io.reactivex.rxjava3.functions.f {
    public final /* synthetic */ int b;
    public final /* synthetic */ Object c;

    public /* synthetic */ cp0(Object obj, int i) {
        this.b = i;
        this.c = obj;
    }

    @Override // io.reactivex.rxjava3.functions.f
    public final void accept(Object obj) {
        ArrayList<Comment> arrayList;
        int i = this.b;
        Object obj2 = this.c;
        switch (i) {
            case 0:
                ((p40) obj2).invoke(obj);
                break;
            case 1:
                ((g22) obj2).invoke(obj);
                break;
            case 2:
                ((p40) obj2).invoke(obj);
                break;
            case 3:
                ((p40) obj2).invoke(obj);
                break;
            case 4:
                ((p40) obj2).invoke(obj);
                break;
            case 5:
                int i2 = BeautyVideoFragment.S;
                ((p40) obj2).invoke(obj);
                break;
            case 6:
                ((dj1) obj2).invoke(obj);
                break;
            case 7:
                int i3 = BroadcastScheduledFragment.U;
                ((p40) obj2).invoke(obj);
                break;
            case 8:
                ubb ubbVar = (ubb) obj2;
                ubbVar.q(new defpackage.b0(6, ubbVar, (Channel) obj));
                break;
            case 9:
                ((p40) obj2).invoke(obj);
                break;
            case 10:
                int i4 = sgc.n1;
                ((p40) obj2).invoke(obj);
                break;
            case 11:
                ((dj1) obj2).invoke(obj);
                break;
            case 12:
                ((ClipVideoPixelExecutorDelegate.a) obj2).invoke(obj);
                break;
            case 13:
                ((e.a) obj2).invoke(obj);
                break;
            case 14:
                ((zcg) obj2).invoke(obj);
                break;
            case 15:
                ((dj1) obj2).invoke(obj);
                break;
            case 16:
                com.vk.profile.community.creationonboarding.impl.finish.presentation.feature.b bVar = (com.vk.profile.community.creationonboarding.impl.finish.presentation.feature.b) obj2;
                el50.a.b(bVar, new yve(bVar, 4));
                break;
            case 17:
                ((g22) obj2).invoke(obj);
                break;
            case 18:
                ((iie) obj2).invoke(obj);
                break;
            case 19:
                ((zjl) obj2).invoke(obj);
                break;
            case 20:
                ((j9k) obj2).invoke((Integer) obj);
                break;
            case 21:
                ((dj1) obj2).invoke(obj);
                break;
            case 22:
                psm psmVar = (psm) obj2;
                psmVar.q(new ri0(12, psmVar, (drz.a) obj));
                break;
            case 23:
                ((iie) obj2).invoke(obj);
                break;
            case 24:
                EntriesListPresenter entriesListPresenter = (EntriesListPresenter) obj2;
                fqp fqpVar = entriesListPresenter.b;
                ArrayList<NewsEntry> arrayList2 = entriesListPresenter.d;
                if (!(obj instanceof d0x)) {
                    if (!(obj instanceof b0x)) {
                        if (obj instanceof o1y0) {
                            o1y0 o1y0Var = (o1y0) obj;
                            if (fqpVar.s1()) {
                                fqpVar.Y1(o1y0Var.a, o1y0Var.b);
                                break;
                            }
                        }
                    } else {
                        b0x b0xVar = (b0x) obj;
                        Post u = EntriesListPresenter.u(b0xVar.a, b0xVar.b, arrayList2);
                        if (u != null) {
                            Activity activity = u.C;
                            if ((activity instanceof CommentsActivity) && (arrayList = ((CommentsActivity) activity).d) != null) {
                                Iterator<Comment> it = arrayList.iterator();
                                int i5 = 0;
                                int i6 = 0;
                                while (true) {
                                    if (!it.hasNext()) {
                                        i6 = -1;
                                    } else if (it.next().b != b0xVar.c) {
                                        i6++;
                                    }
                                }
                                Iterator<u1c0> it2 = entriesListPresenter.c.d.iterator();
                                while (it2.hasNext()) {
                                    u1c0 next = it2.next();
                                    if (epx.f(next.b, u) && next.c == 60 && next.f == i6) {
                                        fqpVar.H3(next, i5);
                                        break;
                                    } else {
                                        i5++;
                                    }
                                }
                                break;
                            }
                        }
                    }
                } else {
                    d0x d0xVar = (d0x) obj;
                    Post u2 = EntriesListPresenter.u(d0xVar.a, d0xVar.b, arrayList2);
                    if (u2 != null) {
                        iag iagVar = d0xVar.c;
                        NewsComment newsComment = iagVar instanceof NewsComment ? (NewsComment) iagVar : null;
                        if (newsComment != null) {
                            Activity activity2 = u2.C;
                            CommentsActivity commentsActivity = activity2 instanceof CommentsActivity ? (CommentsActivity) activity2 : null;
                            if (commentsActivity != null) {
                                Map<UserId, Owner> map = commentsActivity.e;
                                Comment comment = new Comment(newsComment.i, newsComment.j, null, 0, newsComment.f, newsComment.b, 0, false, newsComment.J, newsComment.K, newsComment.l, newsComment.M, newsComment.P, newsComment.Q, newsComment.H, newsComment.A, newsComment.B, newsComment.C, newsComment.D, 204, null);
                                ArrayList<Comment> arrayList3 = commentsActivity.d;
                                if (arrayList3 != null) {
                                    arrayList3.add(comment);
                                }
                                UserId userId = comment.c;
                                if (!map.containsKey(userId)) {
                                    Owner owner = new Owner(null, null, null, null, null, null, null, null, null, null, null, null, null, false, false, false, false, null, 0, null, null, false, 4194303, null);
                                    owner.b = newsComment.j;
                                    owner.c = newsComment.c;
                                    owner.e = newsComment.h;
                                    owner.f = newsComment.N;
                                    owner.k = newsComment.O;
                                    if (o25.a().a(userId)) {
                                        cn o = o25.a().o();
                                        owner.m = o.a();
                                        owner.n = (String) o.n.getValue();
                                    } else {
                                        owner.m = newsComment.c;
                                    }
                                    owner.B(newsComment.T);
                                    map.put(userId, owner);
                                }
                                entriesListPresenter.I(u2);
                                break;
                            }
                        }
                    }
                }
                break;
            case 25:
                ((iie) obj2).invoke(obj);
                break;
            case 26:
                Drawable drawable = (Drawable) obj;
                uur uurVar = ((xur) obj2).c;
                if (uurVar != null) {
                    uurVar.j3(drawable);
                    break;
                }
                break;
            case 27:
                ((iie) obj2).invoke(obj);
                break;
            case 28:
                t6g0 t6g0Var = t6g0.b;
                t6g0.b().G0(((Group) obj2).c);
                break;
            default:
                ((byo) obj2).invoke(obj);
                break;
        }
    }
}
