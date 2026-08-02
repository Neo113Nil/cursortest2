package xsna;

import android.content.Context;
import android.view.ViewGroup;
import android.widget.TextView;
import androidx.appcompat.widget.AppCompatEditText;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.fragment.app.FragmentActivity;
import com.vk.attachpicker.screen.filters.a;
import com.vk.catalog2.common.dto.api.music.CatalogMusicTrackLocalState;
import com.vk.catalog2.common.dto.api.ui.UIBlock;
import com.vk.catalog2.feature.music.dto.ui.UIBlockMusicTrack;
import com.vk.catalog2.feature.music.dto.ui.search.UIBlockSearchHistory;
import com.vk.core.voip.VoipCallSource;
import com.vk.dto.common.Peer;
import com.vk.dto.music.MusicTrack;
import com.vk.dto.narratives.Narrative;
import com.vk.dto.photo.Photo;
import com.vk.im.chat.clips.decoration.impl.presentation.bottom.view.linkedtext.LinkedMessageView;
import com.vk.im.engine.models.ImBgSyncState;
import com.vk.im.engine.models.LongPollType;
import com.vk.im.engine.models.dialogs.ChatSettings;
import com.vk.im.engine.models.dialogs.DialogExt;
import com.vk.im.ui.components.msg_search.domain.model.PeersSearchBlock;
import com.vk.im.ui.fragments.ImSelectContactsFragment;
import com.vk.im.ui.fragments.chat.ChatFragment;
import com.vk.narratives.impl.highlights.HighlightEditFragment;
import com.vk.newsfeed.impl.presentation.newsfeed_geo.presentation.fragment.GeoPostsFragment;
import com.vk.photos.ui.editalbum.domain.Mode;
import com.vk.stat.scheme.MobileOfficialAppsCallsStat$TypeVoipCallItem;
import com.vk.stat.scheme.MobileOfficialAppsCoreNavStat$EventScreen;
import com.vk.storycamera.builder.StoryCameraParams;
import com.vk.superapp.api.dto.story.WebStoryBox;
import com.vk.superapp.vkpay.checkout.api.dto.model.VkCheckoutPayMethod;
import com.vk.voip.dto.call_member.CallMemberId;
import com.vk.voip.ui.groupcalls.GroupCallViewModel;
import com.vk.voip.ui.groupcalls.list.ListGroupCallView;
import com.vkontakte.android.R;
import com.vkontakte.android.data.b;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.Collections;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Map;
import kotlin.NoWhenBranchMatchedException;
import kotlin.collections.EmptyList;
import kotlin.collections.EmptySet;
import xsna.b26;
import xsna.chu;
import xsna.gbt;
import xsna.h8n;
import xsna.iem;
import xsna.jw00;
import xsna.mbv;
import xsna.phw0;
import xsna.qn60;
import xsna.qr60;
import xsna.sct;
import xsna.x900;
import xsna.xat;

/* compiled from: R8$$SyntheticClass */
/* loaded from: classes2.dex */
public final /* synthetic */ class vam implements izs {
    public final /* synthetic */ int b;
    public final /* synthetic */ Object c;

    public /* synthetic */ vam(Object obj, int i) {
        this.b = i;
        this.c = obj;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r7v15, types: [com.vk.catalog2.feature.music.dto.ui.UIBlockMusicTrack] */
    @Override // xsna.izs
    public final Object invoke(Object obj) {
        WebStoryBox webStoryBox;
        pk30 pk30Var;
        Object uIBlockSearchHistoryTrack;
        UIBlockSearchHistory.UIBlockSearchHistoryTrack uIBlockSearchHistoryTrack2;
        int i = this.b;
        Object obj2 = this.c;
        switch (i) {
            case 0:
                xam xamVar = (xam) obj2;
                o0w b = xamVar.k.b();
                FragmentActivity fragmentActivity = xamVar.i;
                b.i(fragmentActivity);
                edw.k(edw.a, fragmentActivity, R.string.vkim_msg_report_spam_chat_toast_message);
                return s3q0.a;
            case 1:
                iem.a aVar = ((kem) obj2).e;
                if (aVar != null) {
                    iem iemVar = iem.this;
                    chu chuVar = iemVar.o;
                    if (chuVar instanceof chu.b) {
                        chu.b bVar = (chu.b) chuVar;
                        String str = bVar.d;
                        if (str == null) {
                            tv4.b("Try to join to call while join link is null", com.vk.metrics.eventtracking.b.a);
                        } else {
                            b26.e eVar = iemVar.k;
                            String str2 = bVar.e;
                            ChatFragment.b bVar2 = b26.this.m;
                            if (bVar2 != null) {
                                VoipCallSource voipCallSource = new VoipCallSource(MobileOfficialAppsCallsStat$TypeVoipCallItem.Source.IM_JOIN_HEADER, MobileOfficialAppsCoreNavStat$EventScreen.IM_CHAT);
                                umb umbVar = ChatFragment.this.Y;
                                if (umbVar == null) {
                                    umbVar = null;
                                }
                                kyv kyvVar = umbVar.d;
                                Context context = umbVar.a;
                                DialogExt dialogExt = umbVar.b;
                                if (kyvVar.f(dialogExt.e, context)) {
                                    kyvVar.g(context);
                                } else {
                                    phw0 phw0Var = umbVar.e;
                                    WeakReference weakReference = new WeakReference(context);
                                    if (str2 == null) {
                                        str2 = "";
                                    }
                                    String title = dialogExt.getTitle();
                                    ChatSettings Bb = dialogExt.Bb();
                                    phw0Var.d(new phw0.d(weakReference, str2, voipCallSource, str, title, Bb != null ? Bb.c : null, 0, null, 448));
                                }
                            }
                        }
                    }
                }
                return s3q0.a;
            case 2:
                return pwm.a((pwm) obj, false, 0, false, null, false, 0, (sr5) obj2, null, false, 28671);
            case 3:
                x960 x960Var = (x960) obj2;
                qn60.c cVar = (qn60.c) obj;
                return new j170(cVar.a, cVar.b, x960Var.a().c, x960Var.a().b.b, true, false);
            case 4:
                h8n.a aVar2 = (h8n.a) obj2;
                aVar2.a();
                h8n.this.e(new i8n(qr60.a.b.a, null, null));
                return s3q0.a;
            case 5:
                return new q44((vcn) obj2, (izs) obj);
            case 6:
                ur90 ur90Var = (ur90) obj;
                return new xr90(ur90Var.b, ur90Var.c, ur90Var.d, (VkCheckoutPayMethod) obj2, ur90Var.e);
            case 7:
                kzo kzoVar = (kzo) obj2;
                Mode mode = (Mode) obj;
                if (mode instanceof Mode.Community) {
                    bwt0.p0(kzoVar.l, false);
                    bwt0.p0(kzoVar.m, false);
                } else if (mode instanceof Mode.User) {
                    bwt0.p0(kzoVar.l, true);
                    Mode.User user = (Mode.User) mode;
                    kzoVar.o.setText(user.b.c);
                    bwt0.p0(kzoVar.m, true);
                    kzoVar.p.setText(user.c.c);
                } else {
                    if (!(mode instanceof Mode.SystemAlbum)) {
                        throw new NoWhenBranchMatchedException();
                    }
                    bwt0.p0(kzoVar.l, true);
                    kzoVar.o.setText(((Mode.SystemAlbum) mode).b.c);
                    bwt0.p0(kzoVar.m, false);
                    bwt0.p0(kzoVar.k, false);
                    kzoVar.g.setEnabled(false);
                    bwt0.p0(kzoVar.j, false);
                    bwt0.p0(kzoVar.h, false);
                }
                return s3q0.a;
            case 8:
                g2q g2qVar = (g2q) obj2;
                jr20 jr20Var = g2qVar.p;
                Object obj3 = g2qVar.l;
                jr20Var.A4(((bjf0) (obj3 != null ? obj3 : null)).a.d(), g2qVar.getAdapterPosition());
                return s3q0.a;
            case 9:
                return v900.c((v900) obj, new x900.b(Collections.singletonList(((a.AbstractC0387a.c) ((a.AbstractC0387a) obj2)).b)));
            case 10:
                qyr qyrVar = (qyr) obj2;
                a1s a1sVar = (a1s) obj;
                int i2 = qyrVar.c;
                io.reactivex.rxjava3.subjects.f<zsm> fVar = qyrVar.h;
                boolean z = a1sVar instanceof e580;
                npx npxVar = npx.a;
                if (z) {
                    e580 e580Var = (e580) a1sVar;
                    if (e580Var.b == i2 && (!e580Var.c.isEmpty() || !e580Var.d.isEmpty())) {
                        fVar.onNext(npxVar);
                    }
                } else {
                    if (!(a1sVar instanceof f580)) {
                        if (a1sVar instanceof l580) {
                            fVar.onNext(npxVar);
                        }
                        return s3q0.a;
                    }
                    if (((f580) a1sVar).b == i2) {
                        fVar.onNext(npxVar);
                    }
                }
                qyrVar.e.b(new qfj(a1sVar, 6));
                return s3q0.a;
            case 11:
                wjs wjsVar = (wjs) obj2;
                wjsVar.b.l0((Throwable) obj);
                wjsVar.d = null;
                return s3q0.a;
            case 12:
                b.d dVar = (b.d) obj;
                StoryCameraParams storyCameraParams = ((com.vk.attachpicker.fragment.gallery.c) obj2).h;
                if (storyCameraParams != null && (webStoryBox = storyCameraParams.u) != null && webStoryBox.Db()) {
                    nf9 nf9Var = nf9.b;
                    nf9.n(dVar, storyCameraParams.Y);
                }
                return s3q0.a;
            case 13:
                tat tatVar = (tat) obj2;
                sct sctVar = (sct) obj;
                if (sctVar instanceof sct.a) {
                    tatVar.T(new xat.b(((sct.a) sctVar).a));
                } else if (sctVar instanceof sct.b) {
                    sct.b bVar3 = (sct.b) sctVar;
                    tatVar.k.b(new gbt.b(bVar3.b));
                    if (bVar3.b) {
                        tatVar.T(new xat.a(bVar3.a));
                    }
                }
                return s3q0.a;
            case 14:
                final GeoPostsFragment geoPostsFragment = (GeoPostsFragment) obj2;
                com.vk.mvi.binder.c cVar2 = (com.vk.mvi.binder.c) obj;
                qcy<Object>[] qcyVarArr = GeoPostsFragment.q0;
                com.vk.mvi.binder.c.a(cVar2, f9t.w(geoPostsFragment.ho()), new iyp() { // from class: xsna.nlt
                    @Override // xsna.iyp
                    public final void a(pk50 pk50Var) {
                        qcy<Object>[] qcyVarArr2 = GeoPostsFragment.q0;
                        GeoPostsFragment geoPostsFragment2 = GeoPostsFragment.this;
                        geoPostsFragment2.eo();
                        jlt.a(geoPostsFragment2.eo(), geoPostsFragment2, geoPostsFragment2.getActivity(), geoPostsFragment2.Z, (xlt) pk50Var);
                    }
                });
                com.vk.mvi.binder.c.b(cVar2, f9t.F(f9t.z(geoPostsFragment.ho()), new oa(29)), new qa(geoPostsFragment, 23));
                return s3q0.a;
            case 15:
                b5v b5vVar = (b5v) obj2;
                Narrative narrative = (Narrative) obj;
                ArrayList arrayList = b5vVar.m;
                arrayList.clear();
                g5g.y(narrative.l, arrayList);
                b5vVar.L0(narrative.e);
                b5vVar.j7();
                HighlightEditFragment highlightEditFragment = b5vVar.c;
                String str3 = narrative.d;
                zak0 zak0Var = (zak0) highlightEditFragment.a0;
                zak0Var.setValue(tho0.a((tho0) zak0Var.getValue(), str3));
                highlightEditFragment.jo(!drm0.N(((tho0) zak0Var.getValue()).a.c));
                return s3q0.a;
            case 16:
                cbv cbvVar = (cbv) obj2;
                mbv mbvVar = (mbv) obj;
                TextView textView = cbvVar.h;
                boolean z2 = mbvVar instanceof mbv.b;
                bwt0.p0(cbvVar.a, z2);
                boolean z3 = mbvVar instanceof mbv.e;
                boolean z4 = z3 || (mbvVar instanceof mbv.d);
                bwt0.p0(cbvVar.e, z4);
                bwt0.p0(cbvVar.f, z4);
                boolean z5 = (epx.f(mbvVar, mbv.a.a) || z2) ? false : true;
                bwt0.p0(cbvVar.g, z5);
                bwt0.p0(textView, z5);
                boolean z6 = mbvVar instanceof mbv.d;
                if (z6) {
                    ViewGroup.LayoutParams layoutParams = textView.getLayoutParams();
                    if (layoutParams == null) {
                        throw new NullPointerException("null cannot be cast to non-null type androidx.constraintlayout.widget.ConstraintLayout.LayoutParams");
                    }
                    ConstraintLayout.b bVar4 = (ConstraintLayout.b) layoutParams;
                    bVar4.t = 0;
                    bVar4.v = -1;
                    textView.setLayoutParams(bVar4);
                } else {
                    ViewGroup.LayoutParams layoutParams2 = textView.getLayoutParams();
                    if (layoutParams2 == null) {
                        throw new NullPointerException("null cannot be cast to non-null type androidx.constraintlayout.widget.ConstraintLayout.LayoutParams");
                    }
                    ConstraintLayout.b bVar5 = (ConstraintLayout.b) layoutParams2;
                    bVar5.t = 0;
                    bVar5.v = 0;
                    textView.setLayoutParams(bVar5);
                }
                bwt0.p0(cbvVar.i, z6);
                bwt0.p0(cbvVar.k, z6);
                cbvVar.s = z6 || z3 || (mbvVar instanceof mbv.c);
                return s3q0.a;
            case 17:
                pno0 pno0Var = (pno0) obj;
                com.vk.im.ui.components.contacts.a aVar3 = ((ImSelectContactsFragment) obj2).c0;
                (aVar3 != null ? aVar3 : null).a1(pno0Var.d());
                return s3q0.a;
            case 18:
                com.vk.newsfeed.common.recycler.holders.b bVar6 = (com.vk.newsfeed.common.recycler.holders.b) obj2;
                AppCompatEditText appCompatEditText = (AppCompatEditText) obj;
                appCompatEditText.setEnabled(true);
                bVar6.B = false;
                appCompatEditText.setText(bVar6.D);
                appCompatEditText.requestFocus();
                appCompatEditText.setSelection(appCompatEditText.length());
                return s3q0.a;
            case 19:
                int i3 = LinkedMessageView.f;
                ucp.f((LinkedMessageView) obj2);
                return s3q0.a;
            case 20:
                ListGroupCallView listGroupCallView = (ListGroupCallView) obj2;
                GroupCallViewModel.b bVar7 = (GroupCallViewModel.b) obj;
                float f = ListGroupCallView.o0;
                ArrayList arrayList2 = new ArrayList(izi0.j(izi0.j(izi0.j(bVar7.a, bVar7.b), bVar7.c), bVar7.d));
                LinkedHashSet j = izi0.j(listGroupCallView.V, listGroupCallView.W);
                CallMemberId primaryId = listGroupCallView.getPrimaryId();
                arrayList2.retainAll(izi0.j(j, primaryId == null ? EmptySet.b : Collections.singleton(primaryId)));
                if (!arrayList2.isEmpty()) {
                    listGroupCallView.y.a();
                }
                return s3q0.a;
            case 21:
                ((eqz) obj2).b.f(new vxf0());
                return s3q0.a;
            case 22:
                return new it00((ViewGroup) obj, ((wr00) obj2).i);
            case 23:
                lw00 lw00Var = (lw00) obj2;
                ay00 ay00Var = (ay00) obj;
                if (ay00Var.q() != null && lw00Var.e(new jw00.b.a(ay00Var.q()))) {
                    r3 = true;
                }
                return Boolean.valueOf(r3);
            case 24:
                return ((com.vk.newsfeed.posting.market_picker.presentation.base.view.f) obj2).e((Photo) obj);
            case 25:
                ((vb20) obj2).a.c1();
                return s3q0.a;
            case 26:
                pq30 pq30Var = (pq30) obj2;
                Peer peer = pq30Var.j;
                if (peer != null && (pk30Var = pq30Var.e) != null) {
                    pk30Var.L(peer);
                }
                return s3q0.a;
            case 27:
                rw30 rw30Var = (rw30) obj2;
                hy30 hy30Var = rw30Var.p;
                hy30Var.q = EmptyList.b;
                eu90 eu90Var = hy30Var.j;
                List<PeersSearchBlock> list = eu90Var.a;
                ArrayList arrayList3 = new ArrayList();
                for (Object obj4 : list) {
                    if (!(((PeersSearchBlock) obj4) instanceof PeersSearchBlock.c)) {
                        arrayList3.add(obj4);
                    }
                }
                hy30Var.j = eu90.a(eu90Var, arrayList3);
                rw30Var.b1().e(rw30Var.p);
                return s3q0.a;
            case 28:
                ImBgSyncState a = ((u180) obj).b.a((LongPollType) obj2);
                return Boolean.valueOf(a == ImBgSyncState.REFRESHING || a == ImBgSyncState.REFRESHED || a == ImBgSyncState.CONNECTED);
            default:
                Map map = (Map) obj2;
                UIBlock uIBlock = (UIBlock) obj;
                if (uIBlock instanceof UIBlockMusicTrack) {
                    ?? r7 = (UIBlockMusicTrack) uIBlock;
                    MusicTrack musicTrack = (MusicTrack) map.get(r7.z.Fb());
                    uIBlockSearchHistoryTrack2 = r7;
                    if (musicTrack != null) {
                        uIBlockSearchHistoryTrack = (!epx.f(r7.z.Z, musicTrack.Fb()) || musicTrack.W == null) ? new UIBlockMusicTrack(r7, musicTrack, null, null, 12, null) : new UIBlockMusicTrack(r7, MusicTrack.zb(r7.z, 0, null, 0, 0, null, false, null, musicTrack.J, false, false, null, null, null, -1, 1015803), null, null, 12, null);
                        return uIBlockSearchHistoryTrack;
                    }
                    return uIBlockSearchHistoryTrack2;
                }
                if (!(uIBlock instanceof UIBlockSearchHistory.UIBlockSearchHistoryTrack)) {
                    return uIBlock;
                }
                UIBlockSearchHistory.UIBlockSearchHistoryTrack uIBlockSearchHistoryTrack3 = (UIBlockSearchHistory.UIBlockSearchHistoryTrack) uIBlock;
                MusicTrack musicTrack2 = (MusicTrack) map.get(uIBlockSearchHistoryTrack3.A.Fb());
                uIBlockSearchHistoryTrack2 = uIBlockSearchHistoryTrack3;
                if (musicTrack2 != null) {
                    uIBlockSearchHistoryTrack = (!epx.f(uIBlockSearchHistoryTrack3.A.Z, musicTrack2.Fb()) || musicTrack2.W == null) ? new UIBlockSearchHistory.UIBlockSearchHistoryTrack(uIBlockSearchHistoryTrack3, musicTrack2, (CatalogMusicTrackLocalState) null, 4, (zcl) null) : new UIBlockSearchHistory.UIBlockSearchHistoryTrack(uIBlockSearchHistoryTrack3, MusicTrack.zb(uIBlockSearchHistoryTrack3.A, 0, null, 0, 0, null, false, null, musicTrack2.J, false, false, null, null, null, -1, 1015803), (CatalogMusicTrackLocalState) null, 4, (zcl) null);
                    return uIBlockSearchHistoryTrack;
                }
                return uIBlockSearchHistoryTrack2;
        }
    }

    public /* synthetic */ vam(wjs wjsVar, Peer peer) {
        this.b = 11;
        this.c = wjsVar;
    }

    public /* synthetic */ vam(s140 s140Var, LongPollType longPollType) {
        this.b = 28;
        this.c = longPollType;
    }
}
