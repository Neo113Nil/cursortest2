package xsna;

import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.content.SharedPreferences;
import android.util.Size;
import android.view.ViewGroup;
import androidx.compose.runtime.snapshots.SnapshotStateList;
import com.google.zxing.client.result.ParsedResult;
import com.vk.core.serialize.Serializer;
import com.vk.dto.common.ClipVideoFile;
import com.vk.dto.common.DialogBackground;
import com.vk.dto.common.Peer;
import com.vk.dto.common.VideoFile;
import com.vk.im.engine.exceptions.NoNetworkConnectionException;
import com.vk.im.engine.models.dialogs.DialogTheme;
import com.vk.im.engine.models.dialogs.c;
import com.vk.im.engine.models.messages.Msg;
import com.vk.im.ui.components.theme_chooser.ThemeChooserState;
import com.vk.im.ui.components.theme_chooser.b;
import com.vk.libvideo.bottomsheet.about.delegate.AboutVideoItem;
import com.vk.music.podcast.impl.ui.page.PodcastFragment;
import com.vk.newsfeed.impl.posting.profilefriendslists.a;
import com.vk.photos.root.selectalbum.domain.a;
import com.vk.photos.root.selectalbum.presentation.SelectAlbumBottomSheet;
import com.vk.poll.fragments.PollResultsFragment;
import com.vk.profile.core.tabs.state.CommunityProfileContent;
import com.vk.profile.user.impl.ui.UserProfileFragment;
import com.vk.stickers.settings.b;
import com.vk.stories.design.view.editor.SideControlPanelView;
import com.vk.storycamera.screen.StoryCameraFragment;
import com.vk.video.ui.smartcrop.impl.presentation.feature.entity.SmartCropState;
import com.vkontakte.android.R;
import com.vkontakte.android.attachments.PollAttachment;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import kotlin.NoWhenBranchMatchedException;
import kotlin.Pair;
import kotlin.collections.EmptyList;
import kotlinx.serialization.KSerializer;
import one.video.player.OneVideoPlayer;
import xsna.ikv0;
import xsna.k840;
import xsna.pdg0;
import xsna.svq0;
import xsna.tlo0;
import xsna.tsb0;
import xsna.vhc0;
import xsna.xaf;
import xsna.xn50;
import xsna.yo60;

/* compiled from: R8$$SyntheticClass */
/* loaded from: classes2.dex */
public final /* synthetic */ class bl30 implements izs {
    public final /* synthetic */ int b;
    public final /* synthetic */ Object c;

    public /* synthetic */ bl30(int i, Object obj, Object obj2) {
        this.b = i;
        this.c = obj;
    }

    /* JADX WARN: Code restructure failed: missing block: B:288:0x063f, code lost:
    
        if ((r1 instanceof com.vk.im.engine.models.events.OnCacheInvalidateEvent) == false) goto L249;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r2v24, types: [java.lang.Object, kotlin.Lazy] */
    /* JADX WARN: Type inference failed for: r4v9, types: [java.lang.Object, kotlin.Lazy] */
    @Override // xsna.izs
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object invoke(Object obj) {
        com.vk.core.view.components.spinner.c cVar;
        lsi0 lsi0Var;
        Object obj2;
        int i = this.b;
        int i2 = 8;
        int i3 = 6;
        int i4 = 28;
        boolean z = true;
        z = true;
        z = true;
        Object obj3 = null;
        wyh0 wyh0Var = null;
        Object obj4 = this.c;
        switch (i) {
            case 0:
                Context context = ((com.vk.im.ui.components.msg_list.a) obj4).k;
                Integer valueOf = Integer.valueOf(R.attr.vk_ui_icon_negative);
                int i5 = kwg0.a;
                if (((Throwable) obj) instanceof NoNetworkConnectionException) {
                    tlo0.f h = tq.h(tlo0.Companion, R.string.vkim_msg_no_connection_error);
                    ikv0.a aVar = new ikv0.a(context);
                    aVar.t = new ikv0.c.C3058c(R.drawable.vk_icon_globe_cross_outline_20, valueOf, (Size) null, 12);
                    CharSequence a = tlo0.b.a(h, context);
                    aVar.u = new ikv0.d(new ikv0.d.c(a != null ? a.toString() : null), (ikv0.d.b) null, (ikv0.d.a) null, 6);
                    aVar.n();
                } else {
                    tlo0.f h2 = tq.h(tlo0.Companion, R.string.vkim_msg_request_conversation_failed);
                    ikv0.a aVar2 = new ikv0.a(context);
                    float f = 28;
                    aVar2.t = new ikv0.c.C3058c(R.drawable.vk_icon_error_triangle_outline_56, valueOf, new Size(iah0.a(f), iah0.a(f)), 8);
                    aVar2.u = new ikv0.d(new ikv0.d.c(tlo0.b.a(h2, context).toString()), (ikv0.d.b) null, (ikv0.d.a) null, 6);
                    aVar2.n();
                }
                return s3q0.a;
            case 1:
                return (xl30) ((ehu) obj4).invoke((xl30) obj);
            case 2:
                Msg msg = (Msg) obj4;
                sxp sxpVar = (sxp) obj;
                if (!(sxpVar instanceof p980)) {
                    if (!(sxpVar instanceof p680)) {
                        break;
                    }
                    return Boolean.valueOf(z);
                }
                int i6 = msg.b;
                Collection<Collection<Integer>> values = ((p980) sxpVar).d.values();
                if (!(values instanceof Collection) || !values.isEmpty()) {
                    Iterator<T> it = values.iterator();
                    while (it.hasNext()) {
                        if (((Collection) it.next()).contains(Integer.valueOf(i6))) {
                            return Boolean.valueOf(z);
                        }
                    }
                }
                z = false;
                return Boolean.valueOf(z);
            case 3:
                return new io.reactivex.rxjava3.internal.operators.single.v(new e1e((qi40) obj4, z ? 1 : 0));
            case 4:
                zi50 zi50Var = (zi50) obj4;
                ips ipsVar = (ips) obj;
                List<zxq0> list = ipsVar.b;
                if (list == null) {
                    list = EmptyList.b;
                }
                return io.reactivex.rxjava3.core.x.B(zi50Var.a(list), zi50Var.a(ipsVar.d.a), new g7(new l71(ipsVar, 5), 26));
            case 5:
                ((gzs) obj4).invoke();
                return s3q0.a;
            case 6:
                ((ikv0) obj).a();
                Activity h3 = e3m.h((Context) obj4);
                if (h3 != null) {
                    lyd.g().N(h3);
                }
                return s3q0.a;
            case 7:
                ((e2b0) obj4).f.b(new Object[0], ((Integer) obj).intValue(), true);
                return s3q0.a;
            case 8:
                j7b0 j7b0Var = (j7b0) obj4;
                r5v0 r5v0Var = k840.a.h;
                (r5v0Var != null ? r5v0Var : null).b(new z8b0(R.string.music_player_snack_bar_common_error, j7b0Var.c));
                return s3q0.a;
            case 9:
                int i7 = PodcastFragment.m0;
                ((PodcastFragment) obj4).s();
                return s3q0.a;
            case 10:
                msb0 msb0Var = (msb0) obj4;
                tsb0 tsb0Var = (tsb0) obj;
                int i8 = msb0.n1;
                if (tsb0Var instanceof tsb0.d) {
                    new PollResultsFragment.a(((tsb0.d) tsb0Var).a, false).k(msb0Var.mo2getContext());
                } else if (tsb0Var instanceof tsb0.a) {
                    ((p870) msb0Var.m1.getValue()).e(120, ((tsb0.a) tsb0Var).a);
                } else if (tsb0Var instanceof tsb0.c) {
                    PollAttachment pollAttachment = ((tsb0.c) tsb0Var).a;
                    ((hbc0) msb0Var.l1.getValue()).a(msb0Var.requireContext(), new vhc0.b(pollAttachment.f, new xhy(pollAttachment, msb0Var)), -1);
                } else if (tsb0Var instanceof tsb0.e) {
                    Context mo2getContext = msb0Var.mo2getContext();
                    if (mo2getContext != null) {
                        if (msb0Var.j1 == 0) {
                            com.vk.core.view.components.spinner.c e = qv20.e(mo2getContext, Integer.valueOf(R.string.rx_loading));
                            e.setCancelable(false);
                            e.show();
                            msb0Var.k1 = e;
                        }
                        msb0Var.j1++;
                    }
                } else {
                    if (!(tsb0Var instanceof tsb0.b)) {
                        throw new NoWhenBranchMatchedException();
                    }
                    int i9 = msb0Var.j1 - 1;
                    msb0Var.j1 = i9;
                    if (i9 == 0 && (cVar = msb0Var.k1) != null) {
                        qv20.b(cVar);
                    }
                }
                return s3q0.a;
            case 11:
                ((VideoFile) obj4).r0(((Boolean) obj).booleanValue());
                return s3q0.a;
            case 12:
                pgc0 pgc0Var = (pgc0) obj4;
                ((Long) obj).getClass();
                pgc0Var.g().a.d(pgc0Var.c);
                pgc0Var.h0();
                return s3q0.a;
            case 13:
                return new xwd0((ViewGroup) obj, (a.InterfaceC1385a) obj4);
            case 14:
                return ((faf0) ((SnapshotStateList) obj4).get(((Integer) obj).intValue())).a;
            case 15:
                uig0 uig0Var = (uig0) obj4;
                oig0 oig0Var = (oig0) obj;
                dw20 dw20Var = uig0Var.c;
                if (dw20Var != null) {
                    dw20Var.dismiss();
                }
                uig0Var.c = null;
                izs<oig0, s3q0> izsVar = uig0Var.b;
                if (izsVar != null) {
                    izsVar.invoke(oig0Var);
                }
                return s3q0.a;
            case 16:
                sfc sfcVar = (sfc) obj;
                for (Map.Entry entry : ((slh0) obj4).e.entrySet()) {
                    sfc.a(sfcVar, (String) entry.getKey(), ((KSerializer) entry.getValue()).getDescriptor());
                }
                return s3q0.a;
            case 17:
                boolean booleanValue = ((Boolean) obj).booleanValue();
                int i10 = SelectAlbumBottomSheet.p1;
                xn50.a.c((SelectAlbumBottomSheet) obj4, new a.d(booleanValue));
                return s3q0.a;
            case 18:
                u76 u76Var = ((SideControlPanelView) obj4).u;
                if (u76Var != null) {
                    u76Var.i4();
                }
                return s3q0.a;
            case 19:
                return SmartCropState.a((SmartCropState) obj, null, (OneVideoPlayer) obj4, null, null, 0L, false, null, false, false, null, 2045);
            case 20:
                ((com.vk.stickers.settings.g) obj4).a.c.invoke(b.h.b);
                return s3q0.a;
            case 21:
                com.vk.stickers.keyboard.page.a aVar3 = (com.vk.stickers.keyboard.page.a) obj4;
                return new cgy((ViewGroup) obj, aVar3.k, new orj0(aVar3, z ? 1 : 0));
            case 22:
                bnl0 bnl0Var = (bnl0) obj4;
                jnl0 jnl0Var = bnl0Var.e;
                mol0 mol0Var = (mol0) obj;
                lsi0 lsi0Var2 = mol0Var.e;
                if (lsi0Var2 != null) {
                    int i11 = lsi0Var2.a;
                    Map<Long, uoi0> map = lsi0Var2.b;
                    lsi0 lsi0Var3 = new lsi0(i11, map, lsi0Var2.c, lsi0Var2.d, lsi0Var2.e);
                    Collection<uoi0> values2 = map.values();
                    ArrayList arrayList = new ArrayList(c5g.u(values2, 10));
                    for (uoi0 uoi0Var : values2) {
                        arrayList.add(uoi0.l(uoi0Var, false, ((q530) jnl0Var.a.getValue()).a(uoi0Var.q), 7864319));
                    }
                    lsi0Var = lsi0Var3.a(arrayList);
                } else {
                    lsi0Var = null;
                }
                wyh0 wyh0Var2 = ((mol0) bnl0Var.b.getCurrentState()).f;
                if (wyh0Var2 != null) {
                    wyh0 a2 = wyh0.a(wyh0Var2, null, 7);
                    Collection<uoi0> values3 = a2.a.values();
                    ArrayList arrayList2 = new ArrayList(c5g.u(values3, 10));
                    for (uoi0 uoi0Var2 : values3) {
                        arrayList2.add(uoi0.l(uoi0Var2, false, ((q530) jnl0Var.a.getValue()).a(uoi0Var2.q), 7864319));
                    }
                    wyh0Var = a2.b(arrayList2);
                }
                return mol0.a(mol0Var, null, null, lsi0Var, wyh0Var, null, null, 231);
            case 23:
                StoryCameraFragment storyCameraFragment = (StoryCameraFragment) obj4;
                ArrayList arrayList3 = (ArrayList) obj;
                int i12 = StoryCameraFragment.T;
                if (!arrayList3.isEmpty()) {
                    String parsedResult = ((ParsedResult) arrayList3.get(0)).toString();
                    if (!drm0.N(parsedResult)) {
                        Intent c = pt20.b().c(parsedResult);
                        d0m0 d0m0Var = storyCameraFragment.P;
                        (d0m0Var != null ? d0m0Var : null).Md(c, true);
                    }
                }
                return s3q0.a;
            case 24:
                wjm0 wjm0Var = (wjm0) obj4;
                List list2 = (List) obj;
                wjm0Var.getClass();
                if (!list2.isEmpty()) {
                    wjm0Var.h.submitList(list2);
                }
                return s3q0.a;
            case 25:
                pwm0 pwm0Var = (pwm0) obj4;
                Pair pair = (Pair) obj;
                AboutVideoItem.d dVar = (AboutVideoItem.d) pair.d();
                if (!((Boolean) pair.g()).booleanValue()) {
                    return dVar;
                }
                AboutVideoItem.d.c cVar2 = dVar.l;
                if (cVar2 != null) {
                    Boolean bool = cVar2.a;
                    Boolean bool2 = Boolean.TRUE;
                    if (!epx.f(bool, bool2) && !epx.f(cVar2.b, bool2)) {
                        return dVar;
                    }
                }
                io.reactivex.rxjava3.subjects.d<Boolean> dVar2 = pwm0Var.g;
                Boolean bool3 = Boolean.FALSE;
                dVar2.onNext(bool3);
                return AboutVideoItem.d.a(dVar, new AboutVideoItem.d.c(bool3, bool3));
            case 26:
                com.vk.im.ui.components.theme_chooser.b bVar = (com.vk.im.ui.components.theme_chooser.b) obj4;
                ThemeChooserState themeChooserState = (ThemeChooserState) obj;
                String str = themeChooserState.b;
                b.c cVar3 = bVar.l;
                com.vk.im.ui.components.theme_chooser.a aVar4 = bVar.o;
                a1w a1wVar = bVar.i;
                b.c.a aVar5 = cVar3.b;
                if (!bVar.Z0().b()) {
                    Iterator<T> it2 = themeChooserState.g.iterator();
                    while (true) {
                        if (it2.hasNext()) {
                            Object next = it2.next();
                            if (epx.f(((DialogBackground) next).b, themeChooserState.d.b)) {
                                obj3 = next;
                            }
                        }
                    }
                    DialogBackground dialogBackground = (DialogBackground) obj3;
                    if (dialogBackground == null) {
                        dialogBackground = DialogBackground.e;
                    }
                    pdg0 n = a1wVar.n(bVar, new nkm(themeChooserState.c, dialogBackground));
                    if (n instanceof pdg0.b) {
                        ThemeChooserState a3 = ThemeChooserState.a(themeChooserState, null, ((DialogTheme) ((pdg0.b) n).a).b.a, null, null, false, null, null, null, 253);
                        aVar4.a(a3);
                        return a3;
                    }
                    if (!(n instanceof pdg0.a)) {
                        throw new NoWhenBranchMatchedException();
                    }
                    return themeChooserState;
                }
                if (!(aVar5 instanceof b.c.a.C1157a)) {
                    if (!(aVar5 instanceof b.c.a.C1158b)) {
                        throw new IllegalStateException("Unreachable case");
                    }
                    zdw zdwVar = bVar.j;
                    zdwVar.u.getClass();
                    SharedPreferences.Editor edit = cew.h().edit();
                    edit.putString("pref_cfg_chat_overriden_theme", str);
                    edit.apply();
                    aVar4.a(themeChooserState);
                    cew cewVar = zdwVar.u;
                    if (a1wVar.u()) {
                        wkm wkmVar = new wkm(a1wVar, cewVar);
                        new io.reactivex.rxjava3.internal.operators.observable.s0(new vkm(wkmVar, c.C1124c.c)).L(new jo3(new f1j(wkmVar, i3), i2), false).r0(asu0.a.c()).subscribe(io.reactivex.rxjava3.kotlin.c.a(new md(24)), io.reactivex.rxjava3.kotlin.c.c(new ve0(23)), io.reactivex.rxjava3.kotlin.c.b(new ee4(9)));
                    }
                    a1wVar.x(new fc80(str));
                    return themeChooserState;
                }
                b.c.a.C1157a c1157a = (b.c.a.C1157a) aVar5;
                Iterator<T> it3 = themeChooserState.f.iterator();
                while (true) {
                    if (it3.hasNext()) {
                        obj2 = it3.next();
                        if (epx.f(((DialogTheme) obj2).b.a, str)) {
                        }
                    } else {
                        obj2 = null;
                    }
                }
                DialogTheme dialogTheme = (DialogTheme) obj2;
                com.vk.im.engine.models.dialogs.c cVar4 = dialogTheme != null ? dialogTheme.b : null;
                Serializer.c<Peer> cVar5 = Peer.CREATOR;
                pdg0 n2 = a1wVar.n(bVar, new vvm(Peer.a.b(c1157a.a), cVar4));
                if (n2 instanceof pdg0.b) {
                    aVar4.a(themeChooserState);
                    return themeChooserState;
                }
                if (!(n2 instanceof pdg0.a)) {
                    throw new NoWhenBranchMatchedException();
                }
                Throwable th = ((pdg0.a) n2).a.b;
                bVar.q.onNext(new epo0(th));
                zk70.e(th);
                return themeChooserState;
            case 27:
                ymq0 ymq0Var = (ymq0) obj4;
                for (Pair pair2 : (List) obj) {
                    eed eedVar = (eed) pair2.j();
                    if (eedVar instanceof ced) {
                        if (((ClipVideoFile) pair2.i()).r == 0) {
                            ymq0Var.M(xaf.f.a);
                        }
                    } else if (eedVar instanceof ted) {
                        if (((ClipVideoFile) pair2.i()).r == 0) {
                            ymq0Var.M(xaf.f.a);
                        } else {
                            ymq0Var.M(xaf.e.a);
                        }
                    }
                }
                return s3q0.a;
            case 28:
                CommunityProfileContent communityProfileContent = (CommunityProfileContent) obj;
                com.vk.profile.user.impl.ui.i iVar = ((UserProfileFragment) obj4).Q;
                com.vk.profile.user.impl.ui.i iVar2 = iVar != null ? iVar : null;
                wjf0.c(iVar2.f, new n0(i4, iVar2, communityProfileContent));
                return s3q0.a;
            default:
                isq0 isq0Var = (isq0) obj4;
                List<ol60> list3 = ((dwq0) isq0Var.b.getCurrentState()).q.b.a;
                ArrayList arrayList4 = new ArrayList();
                for (Object obj5 : list3) {
                    if (obj5 instanceof z1c0) {
                        arrayList4.add(obj5);
                    }
                }
                ArrayList arrayList5 = new ArrayList(c5g.u(arrayList4, 10));
                Iterator it4 = arrayList4.iterator();
                while (it4.hasNext()) {
                    arrayList5.add(((z1c0) it4.next()).h.h);
                }
                ArrayList arrayList6 = new ArrayList();
                Iterator it5 = arrayList5.iterator();
                while (it5.hasNext()) {
                    Object next2 = it5.next();
                    if (next2 instanceof vt80) {
                        arrayList6.add(next2);
                    }
                }
                ArrayList arrayList7 = new ArrayList();
                Iterator it6 = arrayList6.iterator();
                while (it6.hasNext()) {
                    x9v0 x9v0Var = ((vt80) it6.next()).m.m;
                    if (x9v0Var != null) {
                        arrayList7.add(x9v0Var);
                    }
                }
                isq0Var.c(new svq0.a(new yo60.i.a(arrayList7)));
                return s3q0.a;
        }
    }

    public /* synthetic */ bl30(Object obj, int i) {
        this.b = i;
        this.c = obj;
    }
}
