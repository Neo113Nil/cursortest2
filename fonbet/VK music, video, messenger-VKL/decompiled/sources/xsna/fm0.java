package xsna;

import android.graphics.Bitmap;
import android.view.View;
import android.view.ViewGroup;
import androidx.appcompat.widget.AppCompatImageView;
import androidx.recyclerview.widget.RecyclerView;
import com.vk.api.generated.donut.dto.DonutGroupSettingsDto;
import com.vk.api.generated.shortVideo.dto.ShortVideoPlaylistFullDto;
import com.vk.bridges.di.BridgeComponent;
import com.vk.catalog2.common.dto.api.ui.UIBlock;
import com.vk.clips.playlists.ClipsPlaylistNamingLaunchParams;
import com.vk.clips.playlists.folders.root.h;
import com.vk.clips.sdk.shared.api.playlist.ClipsPlaylist;
import com.vk.core.ui.utils.ItemType;
import com.vk.core.ui.utils.TitleColorAttr;
import com.vk.core.view.BottomConfirmButton;
import com.vk.core.view.components.placeholder.main.VkPlaceholder;
import com.vk.dto.common.id.UserId;
import com.vk.dto.common.im.ImageList;
import com.vk.dto.group.Group;
import com.vk.im.engine.models.ImBgSyncState;
import com.vk.im.engine.models.ProfilesSimpleInfo;
import com.vk.im.engine.models.users.User;
import com.vk.im.ui.fragments.chat.ChatFragment;
import com.vk.im.ui.views.WaveFormView;
import com.vk.newsfeed.impl.posting.viewpresenter.bottom.attachment.e;
import com.vk.voip.ui.broadcast.views.config.BroadcastConfigViewParams;
import com.vkontakte.android.R;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.NoSuchElementException;
import kotlin.NoWhenBranchMatchedException;
import kotlin.Pair;
import ru.ok.android.externcalls.sdk.audio.CallsAudioDeviceInfo;
import xsna.cxl;
import xsna.d4b;
import xsna.dw20;
import xsna.e0j;
import xsna.f4b;
import xsna.g4b;
import xsna.hfr;
import xsna.icl;
import xsna.k4e;
import xsna.l1c;
import xsna.me8;
import xsna.nr3;
import xsna.oy6;
import xsna.qv4;
import xsna.t6k;
import xsna.tj50;
import xsna.tlo0;
import xsna.xse;
import xsna.y5c;
import xsna.y7f;
import xsna.zxd0;

/* compiled from: R8$$SyntheticClass */
/* loaded from: classes6.dex */
public final /* synthetic */ class fm0 implements izs {
    public final /* synthetic */ int b;
    public final /* synthetic */ Object c;

    public /* synthetic */ fm0(Object obj, int i) {
        this.b = i;
        this.c = obj;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r10v4 */
    /* JADX WARN: Type inference failed for: r10v5 */
    /* JADX WARN: Type inference failed for: r10v6 */
    /* JADX WARN: Type inference failed for: r10v7 */
    /* JADX WARN: Type inference failed for: r13v10 */
    /* JADX WARN: Type inference failed for: r13v11 */
    /* JADX WARN: Type inference failed for: r13v12 */
    /* JADX WARN: Type inference failed for: r13v7 */
    /* JADX WARN: Type inference failed for: r13v8 */
    /* JADX WARN: Type inference failed for: r13v9 */
    /* JADX WARN: Type inference failed for: r1v8, types: [java.lang.Object, kotlin.Lazy] */
    /* JADX WARN: Type inference failed for: r3v15, types: [android.view.View] */
    /* JADX WARN: Type inference failed for: r6v10 */
    /* JADX WARN: Type inference failed for: r6v11 */
    /* JADX WARN: Type inference failed for: r6v12 */
    /* JADX WARN: Type inference failed for: r6v13 */
    /* JADX WARN: Type inference failed for: r6v14 */
    /* JADX WARN: Type inference failed for: r6v15 */
    /* JADX WARN: Type inference failed for: r6v16 */
    /* JADX WARN: Type inference failed for: r6v17 */
    /* JADX WARN: Type inference failed for: r6v9 */
    @Override // xsna.izs
    public final Object invoke(Object obj) {
        ?? r6;
        ?? r13;
        User user;
        ImageList imageList;
        fxj0 fxj0Var;
        String url;
        g4b g4bVar;
        String str;
        int i = this.b;
        int i2 = 4;
        int i3 = 2;
        boolean z = true;
        Object obj2 = this.c;
        switch (i) {
            case 0:
                ((y5c.a) obj2).b();
                return s3q0.a;
            case 1:
                ((uru) obj2).a.setAlpha(((Integer) obj).intValue());
                return s3q0.a;
            case 2:
                ar3 ar3Var = (ar3) obj2;
                ?? r1 = ar3Var.j1;
                nr3 nr3Var = (nr3) obj;
                int i4 = ar3.l1;
                if (nr3Var instanceof nr3.b) {
                    yq3 yq3Var = ((nr3.b) nr3Var).a;
                    String str2 = yq3Var.a;
                    int i5 = yq3Var.d;
                    if (str2.length() > 0 && !"0".equals(str2) && !jnj.j(i5)) {
                        wk40.d(((BridgeComponent) r1.getValue()).Le().g(), ar3Var.requireContext(), yq3Var.a, ar3Var.requireArguments().getString("ref", ""), ar3Var.requireArguments().getString("launch_origin", "unknown"), null, 48);
                    } else if (jnj.d(i5)) {
                        i0q0.f(new i3r(ar3Var.requireContext(), 2));
                    } else {
                        ((BridgeComponent) r1.getValue()).Le().g().a(ar3Var.requireContext(), yq3Var.b);
                    }
                } else if (!nr3Var.equals(nr3.a.a)) {
                    throw new NoWhenBranchMatchedException();
                }
                ar3Var.dismiss();
                return s3q0.a;
            case 3:
                pv4 pv4Var = (pv4) obj2;
                qv4.a aVar = (qv4.a) obj;
                kkm kkmVar = pv4Var.c;
                WaveFormView waveFormView = pv4Var.k;
                if (waveFormView == null) {
                    waveFormView = null;
                }
                kkmVar.e(waveFormView, new cv4(aVar, (int) (0 == true ? 1 : 0)));
                View view = pv4Var.n;
                if (view == null) {
                    view = null;
                }
                kkmVar.e(view, new zu3(aVar, i3));
                AppCompatImageView appCompatImageView = pv4Var.p;
                if (appCompatImageView == null) {
                    appCompatImageView = null;
                }
                kkmVar.d(appCompatImageView, aVar.a() ? R.attr.vk_legacy_destructive : R.attr.vk_legacy_accent);
                ?? r3 = pv4Var.o;
                kkmVar.e(r3 != 0 ? r3 : null, new dv4(aVar, 0 == true ? 1 : 0));
                return s3q0.a;
            case 4:
                UserId userId = (UserId) obj2;
                Group group = (Group) obj;
                if (!group.c.equals(userId) && !group.c.equals(fkq0.e(userId))) {
                    z = false;
                }
                return Boolean.valueOf(z);
            case 5:
                oy6 oy6Var = (oy6) obj2;
                Map map = (Map) obj;
                hfr.a aVar2 = new hfr.a(rli0.j(rn00.w(map), new g20(oy6Var, 7)));
                if (!aVar2.hasNext()) {
                    throw new NoSuchElementException();
                }
                Object next = aVar2.next();
                if (aVar2.hasNext()) {
                    int i6 = oy6.a.$EnumSwitchMapping$0[((ImBgSyncState) ((Map.Entry) next).getValue()).ordinal()];
                    if (i6 == 1) {
                        r6 = 0;
                    } else if (i6 == 2) {
                        r6 = 1;
                    } else if (i6 == 3) {
                        r6 = 2;
                    } else if (i6 == 4) {
                        r6 = 3;
                    } else {
                        if (i6 != 5) {
                            throw new NoWhenBranchMatchedException();
                        }
                        r6 = 4;
                    }
                    do {
                        Object next2 = aVar2.next();
                        int i7 = oy6.a.$EnumSwitchMapping$0[((ImBgSyncState) ((Map.Entry) next2).getValue()).ordinal()];
                        if (i7 == 1) {
                            r13 = 0;
                        } else if (i7 == 2) {
                            r13 = 1;
                        } else if (i7 == 3) {
                            r13 = 2;
                        } else if (i7 == 4) {
                            r13 = 3;
                        } else {
                            if (i7 != 5) {
                                throw new NoWhenBranchMatchedException();
                            }
                            r13 = 4;
                        }
                        if (r6 > r13) {
                            next = next2;
                            r6 = r13;
                        }
                    } while (aVar2.hasNext());
                }
                oy6Var.b.c.onNext(new ixv((ImBgSyncState) ((Map.Entry) next).getValue(), map));
                return s3q0.a;
            case 6:
                eb7 eb7Var = (eb7) obj2;
                eb7Var.g.setVisibility(8);
                eb7Var.h.setVisibility(8);
                eb7Var.i.setVisibility(8);
                VkPlaceholder vkPlaceholder = eb7Var.j;
                vkPlaceholder.setVisibility(0);
                vkPlaceholder.setTop(new VkPlaceholder.c.b(new gko(R.drawable.vk_icon_gift_outline_56), new x7g(R.attr.vk_ui_icon_accent), null, 12));
                vkPlaceholder.setMiddle(new VkPlaceholder.b(new VkPlaceholder.b.c(i3, tq.h(tlo0.Companion, R.string.birthdays_list_empty_state_title)), new VkPlaceholder.b.C0859b(14, new tlo0.f(R.string.birthdays_list_empty_state_subtitle))));
                return s3q0.a;
            case 7:
                BottomConfirmButton.a aVar3 = (BottomConfirmButton.a) obj2;
                int i8 = BottomConfirmButton.n;
                if (aVar3 != null) {
                    aVar3.b();
                }
                return s3q0.a;
            case 8:
                s68 s68Var = (s68) obj2;
                View view2 = (View) obj;
                e.a.b bVar = s68Var.o;
                if (bVar != null) {
                    view2.performHapticFeedback(3);
                    s68Var.l.invoke(bVar);
                }
                return s3q0.a;
            case 9:
                ke8 ke8Var = (ke8) obj2;
                BroadcastConfigViewParams broadcastConfigViewParams = ke8Var.e;
                me8 me8Var = ke8Var.x.c;
                me8.a aVar4 = me8Var instanceof me8.a ? (me8.a) me8Var : null;
                if (aVar4 != null) {
                    Collection<ffw0> collection = aVar4.c;
                    if (collection.size() >= 2) {
                        ArrayList arrayList = new ArrayList();
                        if (broadcastConfigViewParams != null && broadcastConfigViewParams.k) {
                            Integer num = broadcastConfigViewParams.e;
                            arrayList.add(new brj0(0, 0, null, num != null ? num.intValue() : R.string.voip_broadcast_privacy_label, null, false, false, ItemType.TITLE, 0, null, TitleColorAttr.SUBHEAD, null, null, null, 126710));
                        }
                        for (ffw0 ffw0Var : collection) {
                            int hashCode = ffw0Var.hashCode();
                            int c = ke8.c(ffw0Var);
                            ffw0 ffw0Var2 = aVar4.g;
                            arrayList.add(new brj0(hashCode, 0, null, c, null, false, false, (broadcastConfigViewParams == null || !broadcastConfigViewParams.l) ? (ffw0Var2 == null || !ffw0Var.equals(ffw0Var2)) ? ItemType.DEFAULT : ItemType.DEFAULT_WITH_CHECK : ItemType.DEFAULT, 0, null, null, null, null, ffw0Var, 65270));
                        }
                        ke8Var.v = new dw20.b(ke8Var.a, null).P(arrayList, new vs(ke8Var, 11)).I0(null);
                    }
                }
                return s3q0.a;
            case 10:
                Long l = (Long) obj;
                return (l.longValue() < 0 || (user = (User) ((ProfilesSimpleInfo) obj2).b.get(l)) == null || (imageList = user.h) == null || (fxj0Var = (fxj0) j5g.Z(imageList)) == null || (url = fxj0Var.getUrl()) == null) ? "" : url;
            case 11:
                com.vk.metrics.eventtracking.b.a.a(new IllegalStateException("Error on set audio device " + ((CallsAudioDeviceInfo) obj2), (Throwable) obj));
                return s3q0.a;
            case 12:
                return Boolean.valueOf(epx.f(((UIBlock) obj).b, ((ktf0) ((n3a) obj2)).a));
            case 13:
                y3b y3bVar = (y3b) obj2;
                DonutGroupSettingsDto donutGroupSettingsDto = (DonutGroupSettingsDto) obj;
                y3bVar.k.b(d4b.a.a);
                boolean l2 = donutGroupSettingsDto.l();
                boolean k = donutGroupSettingsDto.k();
                Boolean n = donutGroupSettingsDto.n();
                boolean booleanValue = n != null ? n.booleanValue() : false;
                String g = donutGroupSettingsDto.g();
                if (epx.f(g, "bankcard")) {
                    String e = donutGroupSettingsDto.e();
                    g4bVar = new g4b.a(e != null ? e : "");
                } else {
                    g4bVar = epx.f(g, "vk_pay") ? g4b.c.a : g4b.b.a;
                }
                y3bVar.T(new f4b.a(l2, k, booleanValue, g4bVar));
                return s3q0.a;
            case 14:
                ((w9b) obj2).s(new zxd0.l((xub) obj));
                return s3q0.a;
            case 15:
                ecb ecbVar = ((mcb) obj2).c;
                rcb rcbVar = ecbVar.j;
                rcbVar.d();
                RecyclerView recyclerView = rcbVar.k;
                (recyclerView != null ? recyclerView : null).addOnItemTouchListener(rcbVar.m);
                rcbVar.e();
                rcbVar.l();
                ecbVar.t = true;
                ecbVar.a1();
                return s3q0.a;
            case 16:
                ChatFragment.d dVar = ChatFragment.w1;
                edw edwVar = edw.a;
                edw.d(R.string.vkim_error_internal, ((ChatFragment) obj2).requireContext(), true);
                return s3q0.a;
            case 17:
                Throwable th = (Throwable) obj;
                xyb.C.a(th);
                if (((xyb) obj2).A != null) {
                    zk70.e(th);
                }
                return s3q0.a;
            case 18:
                return new l1c.a(((tj50.a) obj).a(new g20((i1c) obj2, 21), ao8.d));
            case 19:
                twc twcVar = (twc) obj2;
                String str3 = (String) obj;
                if (twcVar.getCover().isAttachedToWindow()) {
                    twcVar.getCover().load(str3);
                } else {
                    twcVar.A = str3;
                }
                return s3q0.a;
            case 20:
                com.vk.clips.favorites.impl.ui.folders.renaming.b bVar2 = (com.vk.clips.favorites.impl.ui.folders.renaming.b) obj2;
                String str4 = com.vk.clips.favorites.impl.ui.folders.renaming.b.m1;
                if (!(((k4e) obj) instanceof k4e.a)) {
                    throw new NoWhenBranchMatchedException();
                }
                bVar2.dismiss();
                return s3q0.a;
            case 21:
                kse kseVar = (kse) obj2;
                xse xseVar = (xse) obj;
                qcy<Object>[] qcyVarArr = kse.n1;
                if (!(xseVar instanceof xse.a)) {
                    throw new NoWhenBranchMatchedException();
                }
                ShortVideoPlaylistFullDto shortVideoPlaylistFullDto = ((xse.a) xseVar).a;
                int id = shortVideoPlaylistFullDto.getId();
                String title = shortVideoPlaylistFullDto.getTitle();
                Object obj3 = lqe.a;
                ClipsPlaylist clipsPlaylist = new ClipsPlaylist(id, title, lqe.b(shortVideoPlaylistFullDto.e()), 0, shortVideoPlaylistFullDto.q(), true, null, 64, null);
                ClipsPlaylistNamingLaunchParams clipsPlaylistNamingLaunchParams = (ClipsPlaylistNamingLaunchParams) kseVar.requireArguments().getParcelable("folder_input_params");
                if (clipsPlaylistNamingLaunchParams != null && (str = clipsPlaylistNamingLaunchParams.e) != null) {
                    kseVar.getParentFragmentManager().k0(yfb.b(new Pair("playlist_selected", clipsPlaylist)), str);
                }
                g9e.a.onNext(new h.c(clipsPlaylist));
                i0q0.i(1000L, new q44(kseVar, i2));
                return s3q0.a;
            case 22:
                o6f o6fVar = (o6f) obj2;
                Pair pair = (Pair) obj;
                z8d z8dVar = o6fVar.e;
                m8f m8fVar = o6fVar.h;
                z8dVar.e = 0L;
                z8dVar.d(false);
                z7f z7fVar = (z7f) pair.i();
                List list = (List) pair.j();
                y7f.e eVar = o6fVar.c;
                eVar.e(z7fVar);
                List<n7f> list2 = z7fVar.d;
                ArrayList arrayList2 = new ArrayList(c5g.u(list2, 10));
                Iterator it = list2.iterator();
                while (it.hasNext()) {
                    arrayList2.add(fz5.x((n7f) it.next(), z7fVar.f));
                }
                eVar.d(arrayList2);
                m8fVar.v7();
                r8f c2 = eVar.c();
                if (c2 != null) {
                    s8f s8fVar = (s8f) c2;
                    s8fVar.q(0L, list);
                    s8fVar.c(0L);
                    s8fVar.d(z7fVar.c());
                }
                m8fVar.j7();
                eVar.a();
                return s3q0.a;
            case 23:
                return new e0j.a(((tj50.a) obj).a(new tb4((a0j) obj2), ao8.d));
            case 24:
                j3k j3kVar = (j3k) obj2;
                j3kVar.a.post(new r44(j3kVar, 9));
                j3kVar.a.setImageBitmap((Bitmap) obj);
                return s3q0.a;
            case 25:
                ((t6k.d) obj2).l.f();
                return s3q0.a;
            case 26:
                e1l e1lVar = (e1l) obj2;
                int i9 = ((efn) obj).a;
                Long g2 = e1lVar.g();
                if (g2 != null) {
                    e1lVar.d(e1lVar.c.f(g2.longValue()).e);
                }
                ((zak0) e1lVar.h).setValue(new efn(i9));
                return s3q0.a;
            case 27:
                return new jv9((ViewGroup) obj, (icl.a) obj2);
            case 28:
                ((io.reactivex.rxjava3.disposables.b) ((pfl) obj2).d).b((io.reactivex.rxjava3.disposables.c) obj);
                return s3q0.a;
            default:
                ((mxl) obj2).a.invoke(new cxl.a((List) obj));
                return s3q0.a;
        }
    }
}
