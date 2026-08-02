package xsna;

import android.net.Uri;
import android.view.View;
import com.facebook.soloader.MinElf;
import com.vk.catalog2.common.ui.holders.group.GroupSubscriptionState;
import com.vk.catalog2.common.ui.holders.group.cell.GroupCellVh;
import com.vk.catalog2.common.ui.mvp.holder.header.SearchQueryVh;
import com.vk.catalog2.feature.music.holders.audiobook.AudioContentVh;
import com.vk.clips.sdk.shared.api.analytics.ClipsBottomSheetSideEffectOptions;
import com.vk.core.tool.view.onboarding.highlighter.VkOnboardingHighlighter;
import com.vk.core.view.components.cell.rich.VkRichCell;
import com.vk.core.view.search.ModernSearchView;
import com.vk.dto.actionlinks.ActionLink;
import com.vk.dto.group.Group;
import com.vk.dto.shortvideo.ClipGridParams;
import com.vk.ecomm.onlinebooking.impl.services.presentation.a;
import com.vk.ecomm.onlinebooking.impl.services.presentation.model.BookingServicesScreenState;
import com.vk.feed.core.models.news.NewsEntry;
import com.vk.games.model.GamesHeaderSectionInfo;
import com.vk.games.presentation.utils.HapticHelper;
import com.vk.imageloader.ImageScreenSize;
import com.vk.newsfeed.impl.presenters.EntriesListPresenter;
import com.vk.onboarding.api.stat.VkOnboardingStat$Delegate;
import com.vk.photos.root.albumdetails.presentation.a;
import com.vk.poll.fragments.PollVotersFragment;
import com.vk.superapp.browser.internal.commands.controller.VkUiCommand;
import com.vk.update.core.a;
import java.lang.ref.WeakReference;
import xsna.djc;
import xsna.e8v0;
import xsna.gh8;
import xsna.o0r0;
import xsna.o9t;
import xsna.uc50;
import xsna.udt;

/* compiled from: R8$$SyntheticClass */
/* loaded from: classes17.dex */
public final /* synthetic */ class fy0 implements gzs {
    public final /* synthetic */ int b;
    public final /* synthetic */ Object c;
    public final /* synthetic */ Object d;

    public /* synthetic */ fy0(int i, Object obj, Object obj2) {
        this.b = i;
        this.c = obj;
        this.d = obj2;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // xsna.gzs
    public final Object invoke() {
        ovv0 J;
        dvv0 a;
        int i = this.b;
        boolean z = false;
        int i2 = 3;
        Object obj = this.d;
        Object obj2 = this.c;
        switch (i) {
            case 0:
                break;
            case 1:
                ((gg1) obj2).C(a.d.a((a.d) obj));
                break;
            case 2:
                jjc.a(new g4(4, (View) obj, (AudioContentVh) obj2));
                break;
            case 3:
                ((izs) obj2).invoke(new a.h((BookingServicesScreenState.ServiceWrapper) obj));
                break;
            case 4:
                xwk.e().m(((VkRichCell) obj2).getContext(), ((ClipGridParams.Data.Music) obj).b.c, new o0r0.a(false, null, null, null, null, null, null, false, false, false, false, null, null, null, MinElf.PN_XNUM));
                break;
            case 5:
                ynh ynhVar = (ynh) obj;
                com.vk.core.fragments.a aVar = (com.vk.core.fragments.a) ((WeakReference) obj2).get();
                if (aVar != null && aVar.y(ynhVar.a)) {
                    z = true;
                }
                break;
            case 6:
                break;
            case 7:
                EntriesListPresenter entriesListPresenter = (EntriesListPresenter) obj2;
                entriesListPresenter.Y();
                entriesListPresenter.b.mk((NewsEntry) obj);
                break;
            case 8:
                udt.h.c cVar = (udt.h.c) obj2;
                izs izsVar = (izs) obj;
                GamesHeaderSectionInfo gamesHeaderSectionInfo = cVar.i;
                if (gamesHeaderSectionInfo != null) {
                    izsVar.invoke(new o9t.m(new djc.c(gamesHeaderSectionInfo, cVar.e)));
                }
                break;
            case 9:
                fdi.D((View) obj2, HapticHelper.RIGID);
                ((izs) obj).invoke(o9t.q.e.b);
                break;
            case 10:
                GroupCellVh groupCellVh = (GroupCellVh) obj2;
                GroupSubscriptionState groupSubscriptionState = (GroupSubscriptionState) obj;
                Group group = groupCellVh.p;
                if (group != null) {
                    groupCellVh.a(groupSubscriptionState, group);
                }
                break;
            case 11:
                myc0.h((yvj) obj2, null, null, new exu((fxu) obj, null), 3);
                break;
            case 12:
                ((com.vk.update.core.a) obj2).b((a.C1935a) obj);
                break;
            case 13:
                fvv0 fvv0Var = (fvv0) obj;
                fvv0 M = ((y2y) obj2).a.M();
                if (M != null && (J = M.J()) != null && (a = J.a(VkUiCommand.EMAIL)) != null) {
                    a.a(String.valueOf(fvv0Var.getAppId()));
                }
                break;
            case 14:
                ((izs) obj2).invoke((jiq0) obj);
                break;
            case 15:
                wh50 wh50Var = (wh50) obj;
                VkOnboardingHighlighter vkOnboardingHighlighter = (VkOnboardingHighlighter) ((wh50) obj2).getValue();
                if (vkOnboardingHighlighter != null) {
                    vkOnboardingHighlighter.c(true);
                }
                wh50Var.setValue(Boolean.FALSE);
                break;
            case 16:
                int i3 = PollVotersFragment.a0;
                myc0.h((yvj) obj2, null, null, new PollVotersFragment.b((mc90) obj, null), 3);
                break;
            case 17:
                nkd nkdVar = (nkd) obj2;
                ikd ikdVar = (ikd) obj;
                if (nkdVar != null) {
                    nkdVar.a(ClipsBottomSheetSideEffectOptions.DELAY_CLIP_PUBLISHED_NOW, ikdVar.a);
                }
                break;
            case 18:
                ModernSearchView modernSearchView = (ModernSearchView) obj;
                gzs<Boolean> gzsVar = ((SearchQueryVh) obj2).c;
                if (gzsVar != null && gzsVar.invoke().booleanValue()) {
                    z = true;
                }
                if (z) {
                    modernSearchView.h();
                }
                break;
            case 19:
                ((uhj0) obj2).x((ActionLink) obj);
                break;
            case 20:
                clj0 clj0Var = (clj0) obj2;
                gh8.g gVar = (gh8.g) obj;
                clj0Var.k = io.reactivex.rxjava3.kotlin.c.e(new io.reactivex.rxjava3.internal.operators.single.n(new io.reactivex.rxjava3.internal.operators.single.b(new qca0(new y4(22, clj0Var, gVar.a), i2)).q(clj0Var.f).m(clj0Var.g), new wx00(new ml1(27, clj0Var, gVar), 16)), new ju(24, clj0Var, gVar), new com.vk.libvideo.design.view.video.a(29, clj0Var, gVar));
                break;
            case 21:
                k7k0 k7k0Var = (k7k0) obj2;
                siq siqVar = (siq) obj;
                if (!epx.f(k7k0Var, siqVar.a)) {
                    g5g.D(siqVar.b, true, new r9c0(k7k0Var, 8));
                    vef0 vef0Var = siqVar.c;
                    if (vef0Var != null) {
                        vef0Var.invalidate();
                    }
                }
                break;
            case 22:
                myc0.h((yvj) obj2, null, null, new lyn0((yjl) obj, null), 3);
                break;
            case 23:
                ((izs) obj2).invoke(((uc50.b) ((uc50) obj)).a);
                break;
            case 24:
                zhf0 e = p490.e((Float.floatToRawIntBits(r6.I0(irp0.c)) & 4294967295L) | (Float.floatToRawIntBits(r6.I0(trp0.a) + ((lqr) obj).a) << 32), (Float.floatToRawIntBits(r6.I0(irp0.g)) & 4294967295L) | (Float.floatToRawIntBits(r6.I0(irp0.f)) << 32));
                float I0 = ((dmb0) obj2).I0(irp0.h);
                break;
            case 25:
                ((izs) obj2).invoke(Integer.valueOf(((yoa) obj).a));
                break;
            case 26:
                ((com.vk.libvideo.offline.ui.a) obj2).p.e.L0((Uri) obj, ImageScreenSize.MID);
                break;
            default:
                VkOnboardingStat$Delegate vkOnboardingStat$Delegate = (VkOnboardingStat$Delegate) obj2;
                gzs gzsVar2 = (gzs) obj;
                if (vkOnboardingStat$Delegate != null) {
                    vkOnboardingStat$Delegate.d4(e8v0.g.b);
                }
                if (gzsVar2 != null) {
                    gzsVar2.invoke();
                }
                break;
        }
        return s3q0.a;
    }
}
