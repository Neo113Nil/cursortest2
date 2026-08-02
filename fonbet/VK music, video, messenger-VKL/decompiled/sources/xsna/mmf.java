package xsna;

import android.app.Dialog;
import android.content.Context;
import android.content.DialogInterface;
import android.content.Intent;
import android.graphics.Rect;
import android.util.Size;
import android.view.View;
import android.view.ViewGroup;
import android.view.Window;
import androidx.recyclerview.widget.RecyclerView;
import com.vk.api.generated.likes.dto.LikesDeleteResponseDto;
import com.vk.api.sdk.exceptions.VKApiExecutionException;
import com.vk.clips.attachments.impl.views.video.ClipsVideoAttachmentPickerFragment;
import com.vk.core.preference.Preference;
import com.vk.core.view.components.cell.rich.VkRichCell;
import com.vk.core.view.components.context.menu.VkContextMenu;
import com.vk.core.view.components.context.menu.e;
import com.vk.debug.ui.dev.DebugFileManagerFragment;
import com.vk.dialogslist.impl.list.adapter.DialogsListAdapter;
import com.vk.draftslist.impl.ui.entity.DraftsListState;
import com.vk.dto.common.data.VKList;
import com.vk.dto.newsfeed.entries.Post;
import com.vk.dto.polls.Poll;
import com.vk.ecomm.reviews.impl.communities.reviews.presentation.CommunityReviewsFragment;
import com.vk.im.engine.models.dialogs.FolderType;
import com.vk.im.ui.fragments.DialogsFragment;
import com.vk.lists.ListDataSet;
import com.vk.music.playlist.display.domain.e;
import com.vk.newsfeed.api.data.CommentThread;
import com.vk.newsfeed.api.data.NewsComment;
import com.vk.photo.editor.views.ToolButton;
import com.vk.polls.entities.exceptions.UserDidntVoteException;
import com.vk.profile.community.impl.ui.profile.CommunityProfileFragment;
import com.vk.profile.community.impl.ui.profile.d;
import com.vk.profile.community.suggestions.impl.ui.suggestions.a;
import com.vk.video.ui.upload.impl.coverchoose.presentation.feature.entity.CoverChooseState;
import com.vkontakte.android.R;
import com.vungle.ads.internal.protos.Sdk;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Optional;
import kotlin.NoWhenBranchMatchedException;
import xsna.asl0;
import xsna.drz;
import xsna.dzh;
import xsna.f0k;
import xsna.h7u0;
import xsna.hmf;
import xsna.ikv0;
import xsna.jqz;
import xsna.o0r0;
import xsna.qr60;
import xsna.rdg;
import xsna.s8k;
import xsna.ukl;
import xsna.v0h;

/* compiled from: R8$$SyntheticClass */
/* loaded from: classes16.dex */
public final /* synthetic */ class mmf implements izs {
    public final /* synthetic */ int b;
    public final /* synthetic */ Object c;

    public /* synthetic */ mmf(Object obj, int i) {
        this.b = i;
        this.c = obj;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r3v21, types: [com.vk.core.fragments.FragmentImpl, xsna.bfg] */
    /* JADX WARN: Type inference failed for: r6v0, types: [android.util.AttributeSet, android.util.Size, java.lang.String, xsna.ikv0$d$a, xsna.ikv0$d$b] */
    /* JADX WARN: Type inference failed for: r6v12 */
    /* JADX WARN: Type inference failed for: r8v14 */
    /* JADX WARN: Type inference failed for: r8v15, types: [boolean, int] */
    /* JADX WARN: Type inference failed for: r8v16 */
    @Override // xsna.izs
    public final Object invoke(Object obj) {
        ?? r8;
        com.vk.lists.c cVar;
        String str;
        Window window;
        Object obj2;
        int i = 8;
        int i2 = 6;
        int i3 = 0;
        int i4 = 1;
        switch (this.b) {
            case 0:
                ClipsVideoAttachmentPickerFragment clipsVideoAttachmentPickerFragment = (ClipsVideoAttachmentPickerFragment) this.c;
                hmf hmfVar = (hmf) obj;
                int i5 = ClipsVideoAttachmentPickerFragment.W;
                if (hmfVar instanceof hmf.b) {
                    if (((hmf.b) hmfVar).a) {
                        int i6 = h7u0.p;
                        h7u0.a c = h7u0.b.c(clipsVideoAttachmentPickerFragment.requireContext());
                        c.h0(clipsVideoAttachmentPickerFragment.requireContext().getString(R.string.clips_video_attachment_unsaved_changes_title));
                        c.a.f = clipsVideoAttachmentPickerFragment.requireContext().getString(R.string.clips_video_attachment_unsaved_changes_description);
                        c.X(clipsVideoAttachmentPickerFragment.requireContext().getString(R.string.clips_video_attachment_unsaved_changes_cancel), null);
                        c.d0(clipsVideoAttachmentPickerFragment.requireContext().getString(R.string.clips_video_attachment_unsaved_changes_exit), new f86(clipsVideoAttachmentPickerFragment, i4));
                        c.m();
                    } else {
                        clipsVideoAttachmentPickerFragment.finish();
                    }
                } else if (hmfVar instanceof hmf.c) {
                    ikv0.a aVar = new ikv0.a(bwt0.u(clipsVideoAttachmentPickerFragment.requireContext()));
                    aVar.o = Integer.valueOf(iah0.a(Sdk.SDKError.Reason.INVALID_LOG_ERROR_ENDPOINT_VALUE));
                    aVar.u = new ikv0.d(new ikv0.d.c(clipsVideoAttachmentPickerFragment.requireContext().getString(R.string.clips_video_attachment_unavailable_video, Integer.valueOf(((hmf.c) hmfVar).a))), (ikv0.d.b) r6, (ikv0.d.a) r6, i2);
                    float f = 24;
                    aVar.t = new ikv0.c.C3058c(R.drawable.vk_icon_error_circle_outline_28, Integer.valueOf(R.attr.vk_ui_accent_orange), new Size(iah0.a(f), iah0.a(f)), i);
                    aVar.d = true;
                    aVar.n();
                } else if (hmfVar instanceof hmf.e) {
                    hmf.e eVar = (hmf.e) hmfVar;
                    int i7 = eVar.a;
                    Rect rect = eVar.b;
                    View view = clipsVideoAttachmentPickerFragment.getView();
                    if (view != null) {
                        int c2 = dhr0.t.c(R.attr.vk_ui_icon_accent);
                        view.getContext();
                        e.c cVar2 = new e.c(null, rect, view, c2, 1);
                        cVar2.e = clipsVideoAttachmentPickerFragment.requireContext();
                        cVar2.g = m33.a(R.drawable.vk_icon_check_circle_on_20, clipsVideoAttachmentPickerFragment.requireContext());
                        cVar2.k = true;
                        cVar2.v = R.layout.clips_video_attachment_title_popup;
                        ArrayList arrayList = new ArrayList();
                        Iterator<q2s0> it = clipsVideoAttachmentPickerFragment.go().iterator();
                        while (it.hasNext()) {
                            q2s0 next = it.next();
                            arrayList.add(new VkContextMenu.a(next.b, null, null, next.a == i7, false, new u14(5, clipsVideoAttachmentPickerFragment, next), 22));
                        }
                        cVar2.h(arrayList);
                        cVar2.l(false);
                    }
                } else if (hmfVar instanceof hmf.d) {
                    com.vk.lists.c cVar3 = clipsVideoAttachmentPickerFragment.T;
                    if (cVar3 != null) {
                        cVar3.d();
                    }
                } else {
                    if (!(hmfVar instanceof hmf.a)) {
                        throw new NoWhenBranchMatchedException();
                    }
                    Intent intent = new Intent();
                    intent.putExtra("clips_video_attachment_result", ((hmf.a) hmfVar).a);
                    s3q0 s3q0Var = s3q0.a;
                    clipsVideoAttachmentPickerFragment.Mf(-1, intent);
                }
                return s3q0.a;
            case 1:
                HashMap hashMap = (HashMap) this.c;
                boolean booleanValue = ((Boolean) obj).booleanValue();
                ToolButton toolButton = (ToolButton) hashMap.get(Integer.valueOf(R.id.tabTone));
                if (toolButton != null) {
                    toolButton.setIndicatorActive(!booleanValue);
                }
                return s3q0.a;
            case 2:
                iag iagVar = (iag) this.c;
                iagVar.f0(false);
                iagVar.f(((LikesDeleteResponseDto) obj).l1());
                return iagVar;
            case 3:
                mdg mdgVar = (mdg) this.c;
                vqt vqtVar = (vqt) obj;
                ?? r3 = mdgVar.e;
                ListDataSet<cbg> listDataSet = mdgVar.K;
                NewsComment newsComment = mdgVar.O;
                if (newsComment != null) {
                    mdgVar.n8(newsComment);
                    VKList<NewsComment> vKList = vqtVar.a;
                    VKList<NewsComment> vKList2 = vqtVar.a;
                    g5g.D(vKList, true, new odg(1, newsComment, NewsComment.class, "containsComment", "containsComment(Lcom/vk/newsfeed/api/data/NewsComment;)Z", 0, 0));
                    CommentThread commentThread = newsComment.L;
                    CommentThread commentThread2 = commentThread != null ? new CommentThread(commentThread.b, commentThread.c, commentThread.d, commentThread.e, new ArrayList(commentThread.f), commentThread.g, commentThread.h, commentThread.i, commentThread.j) : new CommentThread(0, false, false, false, new ArrayList(), null, null, false, null);
                    commentThread2.b = vqtVar.b;
                    commentThread2.f.addAll(vKList2);
                    if (mdgVar.q8(vqtVar)) {
                        commentThread2.g = mdgVar.j7(vqtVar);
                    }
                    newsComment.L = commentThread2;
                    ArrayList arrayList2 = new ArrayList(vKList2.size());
                    if ((mdgVar.x7() && (str = vqtVar.d) != null && str.length() != 0) || (!mdgVar.x7() && vqtVar.c > 0)) {
                        mdgVar.d4().getClass();
                        arrayList2.add(new cbg(newsComment, 424, 2));
                    }
                    mdgVar.d4().b(newsComment, vKList2, arrayList2);
                    if (mdgVar.q8(vqtVar)) {
                        r8 = 0;
                        mdgVar.d4().e(arrayList2, mdgVar.j7(vqtVar), false);
                    } else {
                        r8 = 0;
                    }
                    listDataSet.n0(arrayList2);
                    if (mdgVar.q8(vqtVar) && (cVar = mdgVar.P) != 0) {
                        cVar.r(r8);
                    }
                    int w = listDataSet.w(new adg(new v5(mdgVar, 29), r8));
                    if (w >= 0) {
                        r3.wf(w);
                    } else {
                        r3.wf(r8);
                    }
                    mdgVar.o = r8;
                    mdgVar.G = r8;
                    r3.z(rdg.c.a);
                }
                return s3q0.a;
            case 4:
                mzp0 mzp0Var = ((yvg) this.c).j;
                if (mzp0Var != null) {
                    mzp0Var.a();
                }
                return s3q0.a;
            case 5:
                ((v0h.a) this.c).n = xa4.K((zhf0) obj);
                return s3q0.a;
            case 6:
                c2h c2hVar = (c2h) this.c;
                Throwable th = (Throwable) obj;
                int i8 = c2h.p1;
                c2hVar.Yn();
                Context requireContext = c2hVar.requireContext();
                Dialog dialog = c2hVar.s;
                if (dialog != null && (window = dialog.getWindow()) != null) {
                    String t = th instanceof VKApiExecutionException ? ((VKApiExecutionException) th).t() : requireContext.getString(R.string.error);
                    ikv0.a aVar2 = new ikv0.a(c2hVar.requireContext());
                    aVar2.t = new ikv0.c.C3058c(R.drawable.vk_icon_dismiss_substract_24, Integer.valueOf(requireContext.getColor(R.color.vk_red)), (Size) r6, 12);
                    aVar2.u = new ikv0.d(t, (String) r6, (ikv0.d.a) r6, i2);
                    aVar2.f = c2hVar.getView();
                    aVar2.p(window);
                }
                return s3q0.a;
            case 7:
                qah qahVar = (qah) this.c;
                VkRichCell vkRichCell = new VkRichCell(((ViewGroup) obj).getContext(), r6, i2, i3);
                vkRichCell.setLayoutParams(new ViewGroup.LayoutParams(-1, -2));
                return new tah(vkRichCell, qahVar.i);
            case 8:
                RecyclerView.Adapter adapter = ((RecyclerView) this.c).getAdapter();
                if (adapter != null) {
                    adapter.notifyDataSetChanged();
                }
                return s3q0.a;
            case 9:
                asl0.a aVar3 = (asl0.a) obj;
                com.vk.profile.community.impl.ui.profile.f fVar = ((CommunityProfileFragment) this.c).S;
                (fVar != null ? fVar : 0).H.d(aVar3.a);
                return s3q0.a;
            case 10:
                ((arh) this.c).h.invoke(new d.e((List) obj));
                return s3q0.a;
            case 11:
                ((CommunityReviewsFragment) this.c).R.c(dzh.a.a);
                return s3q0.a;
            case 12:
                ((com.vk.profile.community.suggestions.impl.ui.suggestions.g) this.c).c.invoke(a.C1636a.b);
                return s3q0.a;
            case 13:
                utj utjVar = (utj) this.c;
                Object obj3 = flv0.a;
                flv0.g(utjVar.r);
                return s3q0.a;
            case 14:
                return CoverChooseState.a((CoverChooseState) obj, null, ((f0k.b.C2843b) ((f0k.b) this.c)).b, null, false, 27);
            case 15:
                ((p8k) this.c).T(new s8k.e(true));
                return s3q0.a;
            case 16:
                ((DebugFileManagerFragment) this.c).P = (gzs) obj;
                return s3q0.a;
            case 17:
                ukl uklVar = (ukl) this.c;
                onb0 onb0Var = (onb0) obj;
                boolean z = onb0Var.b;
                Poll poll = onb0Var.a;
                if (z) {
                    ukl.a aVar4 = uklVar.a;
                    Poll currentPoll = aVar4 != null ? aVar4.getCurrentPoll() : null;
                    if (currentPoll != null && currentPoll.Ib()) {
                        poll.x.addAll(currentPoll.e);
                    }
                    ukl.a aVar5 = uklVar.a;
                    if (aVar5 != null) {
                        aVar5.e();
                    }
                    ukl.a aVar6 = uklVar.a;
                    if (aVar6 != null) {
                        aVar6.c(poll);
                    }
                } else {
                    ukl.a aVar7 = uklVar.a;
                    if (aVar7 != null) {
                        aVar7.d(new UserDidntVoteException("User didn't vote"), poll);
                    }
                }
                return s3q0.a;
            case 18:
                xam xamVar = (xam) this.c;
                Throwable th2 = (Throwable) obj;
                xam.y.a(th2);
                if (xamVar.u != null) {
                    zk70.e(th2);
                }
                return s3q0.a;
            case 19:
                ((hpm) this.c).b.b().h(new zkh((Collection) obj, i));
                return s3q0.a;
            case 20:
                DialogsFragment dialogsFragment = (DialogsFragment) this.c;
                boolean z2 = DialogsFragment.u0;
                cn o = o25.a().o();
                xwk.e().m(dialogsFragment.requireContext(), o.a, new o0r0.a(false, null, null, null, null, o.b, o.c, o.j, false, false, false, null, null, null, 65311));
                return s3q0.a;
            case 21:
                return new qg20((ViewGroup) obj, ((DialogsListAdapter) this.c).j);
            case 22:
                e4n.this.e(new i4n(new qr60.a.d(true)));
                return s3q0.a;
            case 23:
                jse0 jse0Var = ((k5n) this.c).p0;
                if (jse0Var != null) {
                    jse0Var.f();
                }
                return s3q0.a;
            case 24:
                com.vk.music.playlist.display.domain.b bVar = (com.vk.music.playlist.display.domain.b) this.c;
                Throwable th3 = (Throwable) obj;
                mzp0 mzp0Var2 = bVar.n;
                if (mzp0Var2 != null) {
                    mzp0Var2.f();
                }
                bVar.T(new e.k(new jqz.a(th3)));
                return s3q0.a;
            case 25:
                com.vk.notifications.dnd.impl.a aVar8 = (com.vk.notifications.dnd.impl.a) this.c;
                List<Long> list = lsn.a;
                Preference.F(0L, "notifications_prefs", "dnd_end");
                aVar8.b.onNext(Boolean.FALSE);
                return s3q0.a;
            case 26:
                DraftsListState draftsListState = (DraftsListState) obj;
                return DraftsListState.a(draftsListState, j5g.u0(draftsListState.c, Collections.singletonList((Post) this.c)), null, 0, false, true, 29);
            case 27:
                xtm xtmVar = vtm.this.F;
                if (xtmVar != null) {
                    xtmVar.m();
                }
                return s3q0.a;
            case 28:
                ((DialogInterface) this.c).dismiss();
                return s3q0.a;
            default:
                FolderType folderType = (FolderType) this.c;
                Iterator it2 = ((Map) ((drz.a) obj).a).values().iterator();
                while (true) {
                    if (it2.hasNext()) {
                        obj2 = it2.next();
                        if (((rpm) obj2).c == folderType) {
                        }
                    } else {
                        obj2 = null;
                    }
                }
                rpm rpmVar = (rpm) obj2;
                return Optional.ofNullable(rpmVar != null ? Integer.valueOf(rpmVar.a) : null);
        }
    }
}
