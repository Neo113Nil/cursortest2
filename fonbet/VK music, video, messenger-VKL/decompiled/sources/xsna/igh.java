package xsna;

import android.text.Editable;
import android.text.InputFilter;
import android.view.View;
import android.view.ViewGroup;
import android.widget.EditText;
import android.widget.ImageView;
import androidx.recyclerview.widget.RecyclerView;
import com.ironsource.InterfaceC4319fe;
import com.vk.api.generated.groups.dto.GroupsGroupFullDto;
import com.vk.catalog2.feature.music.holders.curator.CuratorInfoVhOld;
import com.vk.comments.api.di.CommentsComponent;
import com.vk.comments.impl.marketitem.commentlist.presentation.MarketItemCommentsFragment;
import com.vk.community.strikes.api.di.CommunityStrikesComponent;
import com.vk.core.serialize.Serializer;
import com.vk.core.tool.onboarding.VkTooltip$BalloonPosition;
import com.vk.core.tool.onboarding.VkTooltip$BalloonTilt;
import com.vk.core.tool.onboarding.VkTooltip$MarkerSize;
import com.vk.dto.common.Attachment;
import com.vk.dto.common.Direction;
import com.vk.dto.common.Peer;
import com.vk.dto.common.Source;
import com.vk.dto.common.id.UserId;
import com.vk.dto.stories.model.GifWithQueryData;
import com.vk.feed.core.models.news.NewsEntry;
import com.vk.folders.impl.configure.a;
import com.vk.folders.impl.configure.e;
import com.vk.friends.impl.cleanup.presentation.fragment.FriendsCleanupFragment;
import com.vk.im.engine.models.dialogs.Dialog;
import com.vk.im.engine.models.dialogs.DialogsHistory;
import com.vk.im.engine.models.dialogs.FolderType;
import com.vk.im.engine.models.messages.Msg;
import com.vk.newsfeed.posting.impl.domain.request.ParsedAttachment;
import com.vk.profile.community.impl.ui.profile.d;
import com.vk.voip.ui.sessionrooms.dialog.model.a;
import com.vk.voip.ui.sessionrooms.f;
import com.vk.writebar.WriteBar;
import com.vkontakte.android.R;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import java.util.NoSuchElementException;
import java.util.Set;
import java.util.concurrent.locks.ReentrantReadWriteLock;
import kotlin.NoWhenBranchMatchedException;
import kotlin.Pair;
import kotlin.collections.EmptyList;
import kotlin.collections.builders.SetBuilder;
import xsna.b6l0;
import xsna.bfz;
import xsna.brx;
import xsna.cos;
import xsna.ebk;
import xsna.fbk;
import xsna.feg;
import xsna.g1e0;
import xsna.h2g0;
import xsna.hgh;
import xsna.m010;
import xsna.m6w;
import xsna.m8v;
import xsna.m8v0;
import xsna.mat;
import xsna.mgg;
import xsna.o2j;
import xsna.p810;
import xsna.pwh;
import xsna.pzx;
import xsna.ueg;
import xsna.w1g0;

/* compiled from: R8$$SyntheticClass */
/* loaded from: classes5.dex */
public final /* synthetic */ class igh implements izs {
    public final /* synthetic */ int b;
    public final /* synthetic */ Object c;

    public /* synthetic */ igh(Object obj, int i) {
        this.b = i;
        this.c = obj;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // xsna.izs
    public final Object invoke(Object obj) {
        WriteBar writeBar;
        EditText input;
        int i = this.b;
        int i2 = 17;
        int i3 = 0;
        Object obj2 = this.c;
        switch (i) {
            case 0:
                ((hgh.b) obj2).n.invoke();
                return s3q0.a;
            case 1:
                osh oshVar = (osh) obj2;
                it80 it80Var = (it80) obj;
                CharSequence charSequence = (CharSequence) it80Var.a;
                if (charSequence != null && charSequence.length() != 0) {
                    oshVar.f.invoke(new d.n.c.a.h((String) it80Var.a));
                }
                return s3q0.a;
            case 2:
                jwh jwhVar = (jwh) obj2;
                jwhVar.T(qwh.b);
                jwhVar.k.b(new h2g0.e("", EmptyList.b));
                jwhVar.C(w1g0.m.b);
                jwhVar.T(pwh.b.b);
                return s3q0.a;
            case 3:
                ((z37) obj2).b((q610) obj);
                return s3q0.a;
            case 4:
                a2j a2jVar = (a2j) obj2;
                a.b bVar = (a.b) obj;
                f.a aVar = bVar.a;
                boolean z = bVar.b;
                Collection collection = bVar.d;
                int size = collection != null ? collection.size() : 0;
                if (collection == null) {
                    collection = EmptyList.b;
                }
                a2jVar.T(new o2j.x(aVar, z, size, collection, bVar.c, bVar.e));
                return s3q0.a;
            case 5:
                u90 u90Var = ((com.vk.im.ui.components.contacts.a) obj2).l;
                Throwable th = (Throwable) obj;
                if (th instanceof NoSuchElementException) {
                    s3q0 s3q0Var = s3q0.a;
                } else if (th instanceof IOException) {
                    new fbk.a(u90Var.B()).I0(null);
                } else {
                    new ebk.a(u90Var.B()).I0(null);
                }
                return s3q0.a;
            case 6:
                com.vk.profile.questions.impl.b bVar2 = (com.vk.profile.questions.impl.b) obj2;
                Editable editable = (Editable) obj;
                if (editable != null) {
                    int i4 = com.vk.profile.questions.impl.b.q1;
                    sua.s(editable);
                }
                t9k t9kVar = bVar2.i1;
                if (t9kVar != null) {
                    String valueOf = String.valueOf(editable);
                    int codePointCount = editable != null ? Character.codePointCount(editable, 0, editable.length()) : 0;
                    t9kVar.f = valueOf;
                    t9kVar.e = codePointCount;
                    t9kVar.b();
                }
                return s3q0.a;
            case 7:
                CuratorInfoVhOld curatorInfoVhOld = (CuratorInfoVhOld) obj2;
                curatorInfoVhOld.n = null;
                ImageView imageView = curatorInfoVhOld.h;
                (imageView != null ? imageView : null).setImageDrawable(curatorInfoVhOld.p);
                return s3q0.a;
            case 8:
                ((zam) obj2).g.getClass();
                return gdp.a((CharSequence) obj);
            case 9:
                return com.vk.im.engine.models.dialogs.b.a((com.vk.im.engine.models.dialogs.b) obj, (vjm) obj2, null, null, 0, 0, 0, 0, 0, 0, false, null, null, null, null, null, false, null, false, null, null, null, false, null, null, null, null, 0, false, false, null, null, 0, null, 0, -5, 2097151);
            case 10:
                View moreButtonView = ((m5p) obj2).b.getSideControlPanel().getMoreButtonView();
                int i5 = m8v0.M;
                m8v0.a.a(moreButtonView, (String) obj, null, null, VkTooltip$MarkerSize.Size64, null, VkTooltip$BalloonPosition.BottomLeft, VkTooltip$BalloonTilt.Left, new i5p(moreButtonView, 0), new g54(22), null, null, null, null, null, 0, false, null, null, false, null, false, 8387628);
                return s3q0.a;
            case 11:
                NewsEntry newsEntry = (NewsEntry) obj2;
                u1c0 u1c0Var = (u1c0) obj;
                int i6 = u1c0Var.c;
                return Boolean.valueOf((i6 == 56 || i6 == 57) && epx.f(u1c0Var.b, newsEntry));
            case 12:
                apq apqVar = (apq) obj2;
                nn50<State, TaskId, OutTask, Patch, Event> nn50Var = apqVar.b;
                zoq zoqVar = apqVar.k;
                rem remVar = apqVar.j;
                if (((kpq) nn50Var.getCurrentState()).b == null) {
                    apqVar.s().w().b(1208, zoqVar);
                    apqVar.s().w().b(1209, zoqVar);
                }
                apqVar.s().w().b(InterfaceC4319fe.a.b, remVar);
                apqVar.s().w().b(InterfaceC4319fe.a.c, remVar);
                apqVar.s().w().b(1204, remVar);
                apqVar.s().w().b(1205, remVar);
                return s3q0.a;
            case 13:
                com.vk.folders.impl.configure.d dVar = (com.vk.folders.impl.configure.d) obj2;
                ayr ayrVar = (ayr) obj;
                Set<Long> set = ayrVar.h;
                String str = ayrVar.d;
                com.vk.folders.impl.configure.a aVar2 = dVar.h;
                z0s z0sVar = dVar.k;
                if (epx.f(aVar2, a.C1068a.a)) {
                    FolderType folderType = FolderType.DEFAULT;
                    Set<Long> set2 = set;
                    ArrayList arrayList = new ArrayList(c5g.u(set2, 10));
                    Iterator<T> it = set2.iterator();
                    while (it.hasNext()) {
                        long longValue = ((Number) it.next()).longValue();
                        Serializer.c<Peer> cVar = Peer.CREATOR;
                        arrayList.add(Peer.a.b(longValue));
                    }
                    di6.a(dVar, z0sVar.D(str, folderType, arrayList));
                    dVar.m(e.c.a);
                } else {
                    if (!(aVar2 instanceof a.b)) {
                        throw new NoWhenBranchMatchedException();
                    }
                    a.b bVar3 = (a.b) aVar2;
                    if (!epx.f(bVar3.c.j(), FolderType.CHANNELS.j())) {
                        di6.a(dVar, z0sVar.p(bVar3.a, str, j5g.O0(set), j5g.O0(ayrVar.i)));
                    }
                    dVar.m(e.c.a);
                }
                return s3q0.a;
            case 14:
                FriendsCleanupFragment friendsCleanupFragment = (FriendsCleanupFragment) obj2;
                cos.d dVar2 = (cos.d) obj;
                pms pmsVar = friendsCleanupFragment.R;
                if (pmsVar == null) {
                    pmsVar = null;
                }
                pmsVar.setItems(dVar2.a);
                pms pmsVar2 = friendsCleanupFragment.R;
                (pmsVar2 != null ? pmsVar2 : null).notifyDataSetChanged();
                friendsCleanupFragment.fo().a.setRefreshing(dVar2.b);
                return s3q0.a;
            case 15:
                fws fwsVar = (fws) obj2;
                fwsVar.a.e = new GifWithQueryData("", EmptyList.b);
                fwsVar.a.d = new b6l0.a("", new ArrayList(), new ArrayList());
                io.reactivex.rxjava3.subjects.f<s3q0> fVar = fwsVar.n;
                s3q0 s3q0Var2 = s3q0.a;
                fVar.onNext(s3q0Var2);
                return s3q0Var2;
            case 16:
                ((izs) obj2).invoke(new mat.b((uet) obj));
                return s3q0.a;
            case 17:
                boolean booleanValue = ((Boolean) obj).booleanValue();
                ((c5w) obj2).getClass();
                if (booleanValue) {
                    return s3q0.a;
                }
                throw new IllegalStateException("Source is not available");
            case 18:
                ((d7w) obj2).e(new m6w.c((f8w) obj));
                return s3q0.a;
            case 19:
                p0x p0xVar = (p0x) obj2;
                io.reactivex.rxjava3.disposables.c cVar2 = (io.reactivex.rxjava3.disposables.c) obj;
                io.reactivex.rxjava3.disposables.c cVar3 = p0xVar.l;
                if (cVar3 != null) {
                    cVar3.dispose();
                }
                p0xVar.l = cVar2;
                return s3q0.a;
            case 20:
                ((drx) obj2).k.b(new brx.e(((Integer) obj).intValue()));
                return s3q0.a;
            case 21:
                ((kzx) obj2).T(new pzx.b.c((GroupsGroupFullDto) obj));
                return s3q0.a;
            case 22:
                return Integer.valueOf(((xry) obj2).c(((Integer) obj).intValue()));
            case 23:
                ((dfz) obj2).d.onNext((bfz.a) obj);
                return s3q0.a;
            case 24:
                kuz kuzVar = (kuz) obj2;
                DialogsHistory dialogsHistory = (DialogsHistory) obj;
                List<Dialog> k = dialogsHistory.k();
                f1e0 f1e0Var = new f1e0();
                Iterator<T> it2 = k.iterator();
                while (it2.hasNext()) {
                    ijm.b((Dialog) it2.next(), f1e0Var);
                }
                SetBuilder h = f1e0Var.h();
                g1e0.a aVar3 = new g1e0.a();
                aVar3.h(h);
                aVar3.b = Source.CACHE;
                aVar3.c = false;
                return kuzVar.b.C(kuzVar, new d1e0(new g1e0(aVar3))).l(new nz(new mre(dialogsHistory, 27), 23));
            case 25:
                mzz mzzVar = (mzz) obj2;
                jxz jxzVar = mzzVar.l;
                if (jxzVar != null) {
                    uxz uxzVar = mzzVar.n;
                    jxzVar.h(uxzVar != null ? uxzVar : null);
                }
                return s3q0.a;
            case 26:
                MarketItemCommentsFragment marketItemCommentsFragment = (MarketItemCommentsFragment) obj2;
                m010 m010Var = (m010) obj;
                int i7 = MarketItemCommentsFragment.j0;
                if (m010Var instanceof m010.a) {
                    if (marketItemCommentsFragment.a0 == null) {
                        m010.a aVar4 = (m010.a) m010Var;
                        feg wf = ((CommentsComponent) m7m.d(marketItemCommentsFragment).mo408a(fpf0.a(CommentsComponent.class))).wf();
                        o2i ge = ((CommunityStrikesComponent) m7m.d(marketItemCommentsFragment).a(fpf0.a(CommunityStrikesComponent.class))).ge();
                        d510 d510Var = new d510(marketItemCommentsFragment.T);
                        View inflate = marketItemCommentsFragment.getLayoutInflater().inflate(R.layout.market_item_reply_bar, (ViewGroup) null, false);
                        UserId userId = aVar4.a;
                        UserId userId2 = aVar4.a;
                        marketItemCommentsFragment.b0 = new f3g0(inflate, userId, true, false, new w010(marketItemCommentsFragment));
                        leg a = wf.a(new feg.a(userId2, new mgg(new mgg.a(new q010(marketItemCommentsFragment, i3), new k5h(marketItemCommentsFragment, 29), new l500(d510Var, 2), new jrh(marketItemCommentsFragment, 25), new r010(marketItemCommentsFragment, i3), new flu(inflate, 13), new krh(marketItemCommentsFragment, 29), new ldl(marketItemCommentsFragment, 24)), aVar4.d, aVar4.e, new dam(17)), new v010(marketItemCommentsFragment), ((CommentsComponent) m7m.d(marketItemCommentsFragment).mo408a(fpf0.a(CommentsComponent.class))).U6().a(new ueg.a(userId2, aVar4.b, aVar4.c, marketItemCommentsFragment.requireContext(), new pvn(new k0x(4), false), new com.vk.comments.impl.a(new yd10()), new sd9(), marketItemCommentsFragment.b0)), aVar4.d, true), new cvh(marketItemCommentsFragment, 22), new owv(marketItemCommentsFragment, 4), new yu1(15, ge, marketItemCommentsFragment), 2048);
                        marketItemCommentsFragment.a0 = a;
                        l010 l010Var = new l010(new yeg(a), new o010(marketItemCommentsFragment, 0));
                        marketItemCommentsFragment.S = l010Var;
                        RecyclerView recyclerView = marketItemCommentsFragment.R;
                        if (recyclerView != null) {
                            recyclerView.setAdapter(l010Var);
                        }
                        WriteBar writeBar2 = marketItemCommentsFragment.T;
                        if (writeBar2 != null && (input = writeBar2.getInput()) != null) {
                            input.setHint(marketItemCommentsFragment.getString(R.string.market_item_comments_input_hint));
                            input.setFilters((InputFilter[]) jw5.y(new InputFilter.LengthFilter(2048), input.getFilters()));
                        }
                        if (aVar4.f && (writeBar = marketItemCommentsFragment.T) != null) {
                            writeBar.B();
                        }
                    }
                    eeg eegVar = marketItemCommentsFragment.a0;
                    if (eegVar != null) {
                        eegVar.h(((m010.a) m010Var).d);
                    }
                } else if (m010Var instanceof m010.b) {
                    View view = marketItemCommentsFragment.getView();
                    if (view != null) {
                        view.postDelayed(new qn9(3, marketItemCommentsFragment, m010Var), 250L);
                    }
                } else {
                    if (!(m010Var instanceof m010.c)) {
                        throw new NoWhenBranchMatchedException();
                    }
                    eeg eegVar2 = marketItemCommentsFragment.a0;
                    if (eegVar2 != null) {
                        eegVar2.a(((m010.c) m010Var).a);
                    }
                }
                return s3q0.a;
            case 27:
                ((f810) obj2).T(new p810.j((Throwable) obj));
                return s3q0.a;
            case 28:
                return Boolean.valueOf(epx.f(((ParsedAttachment) obj).b, (Attachment) obj2));
            default:
                w920 w920Var = (w920) obj2;
                pfl pflVar = w920Var.n;
                m8v m8vVar = (m8v) obj;
                if (m8vVar instanceof m8v.d) {
                    List<Msg> list = ((m8v.d) m8vVar).a;
                    if (!list.isEmpty()) {
                        w920Var.i();
                        w920.p(w920Var, pflVar.c((io.reactivex.rxjava3.core.w) pflVar.b, new com.vk.voip.a(16, w920Var, list)));
                    }
                } else if (m8vVar instanceof m8v.c) {
                    w920Var.q(((m8v.c) m8vVar).a, true);
                } else if (m8vVar instanceof m8v.e) {
                    w920Var.q(((m8v.e) m8vVar).a, false);
                } else if (m8vVar instanceof m8v.a) {
                    m8v.a aVar5 = (m8v.a) m8vVar;
                    if (aVar5.a.xb() != 0) {
                        w920Var.i();
                        w920.p(w920Var, pflVar.c((io.reactivex.rxjava3.core.w) pflVar.b, new cg1(i2, w920Var, aVar5)));
                    }
                } else {
                    if (!(m8vVar instanceof m8v.b)) {
                        throw new NoWhenBranchMatchedException();
                    }
                    if (w920Var.s) {
                        w920Var.i();
                        ReentrantReadWriteLock.ReadLock readLock = w920Var.t.readLock();
                        readLock.lock();
                        try {
                            Pair pair = w920Var.c().isEmpty() ? new Pair(Integer.valueOf(w920Var.e), uj30.d) : new Pair(Integer.valueOf(w920Var.c().size()), new wj30(((Msg) j5g.h0(w920Var.c())).p, Direction.BEFORE));
                            readLock.unlock();
                            w920Var.n((wj30) pair.g(), Math.min(((Number) pair.d()).intValue(), 200));
                        } catch (Throwable th2) {
                            readLock.unlock();
                            throw th2;
                        }
                    }
                }
                return s3q0.a;
        }
    }
}
