package xsna;

import android.os.SystemClock;
import android.util.SparseArray;
import android.widget.CheckBox;
import com.unity3d.services.UnityAdsConstants;
import com.vk.api.generated.messages.dto.MessagesExtendedIncognitoMemberDto;
import com.vk.api.generated.messages.dto.MessagesGetIncognitoMembersByIdsResponseDto;
import com.vk.catalog2.common.dto.ui.UIBlockLink;
import com.vk.catalog2.common.dto.ui.profile.UIBlockProfile;
import com.vk.catalog2.common.ui.holders.friend.FriendsSuggestsVh;
import com.vk.core.serialize.Serializer;
import com.vk.core.view.components.cell.rich.VkRichCell;
import com.vk.dto.common.Direction;
import com.vk.dto.common.Peer;
import com.vk.dto.common.id.UserId;
import com.vk.dto.messages.MsgSyncState;
import com.vk.dto.music.StoryMusicInfo;
import com.vk.dto.stories.model.StoriesContainer;
import com.vk.dto.stories.model.StoryEntry;
import com.vk.external.miniapp.net.app.WebImage;
import com.vk.external.miniapp.net.app.WebImageSize;
import com.vk.im.engine.internal.merge.messages.WeightStrategy;
import com.vk.im.engine.models.dialogs.DialogMember;
import com.vk.im.engine.models.messages.Msg;
import com.vk.photo.editor.features.collage.model.CollageAspectRatioFormat;
import com.vk.photo.editor.ivm.EditorMessage;
import com.vk.superapp.api.dto.group.WebGroup;
import com.vk.superapp.api.dto.group.WebGroupShortInfo;
import com.vk.superapp.base.js.bridge.JsMethod;
import com.vk.superapp.base.js.bridge.Responses$ClientError;
import com.vk.superapp.base.js.bridge.Responses$ReasonUserDenied;
import com.vk.superapp.vkclient.js.bridge.api.events.GetGroupInfo$Parameters;
import com.vk.superapp.vkclient.js.bridge.api.events.GetGroupInfo$Response;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import kotlin.NoWhenBranchMatchedException;
import kotlin.Pair;
import kotlin.jvm.internal.Ref$ObjectRef;
import xsna.dug0;
import xsna.mj9;
import xsna.o360;
import xsna.w0g;

/* compiled from: R8$$SyntheticClass */
/* loaded from: classes16.dex */
public final /* synthetic */ class wh9 implements izs {
    public final /* synthetic */ int b;
    public final /* synthetic */ Object c;
    public final /* synthetic */ Object d;
    public final /* synthetic */ Object e;

    public /* synthetic */ wh9(Object obj, Object obj2, Object obj3, int i) {
        this.b = i;
        this.c = obj;
        this.d = obj2;
        this.e = obj3;
    }

    /* JADX WARN: Code restructure failed: missing block: B:91:0x0309, code lost:
    
        if (r5 == null) goto L89;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v10, types: [java.lang.Object, java.util.Map] */
    @Override // xsna.izs
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object invoke(Object obj) {
        pgv0 pgv0Var;
        Object obj2;
        Object obj3;
        String str;
        Object obj4;
        String str2;
        Object obj5;
        String str3;
        String str4;
        GetGroupInfo$Parameters getGroupInfo$Parameters;
        Integer num;
        Peer peer;
        SparseArray i0;
        Iterator it;
        int i;
        int i2;
        SparseArray sparseArray;
        int i3 = this.b;
        int i4 = 23;
        Object obj6 = this.e;
        Object obj7 = this.d;
        Object obj8 = this.c;
        switch (i3) {
            case 0:
                bi9 bi9Var = (bi9) obj8;
                StoryMusicInfo storyMusicInfo = (StoryMusicInfo) obj7;
                Ref$ObjectRef ref$ObjectRef = (Ref$ObjectRef) obj6;
                mj9 mj9Var = (mj9) obj;
                if (mj9Var instanceof mj9.b) {
                    bi9Var.d = false;
                    bi9Var.f(storyMusicInfo, (String) ref$ObjectRef.element, ((mj9.b) mj9Var).a);
                } else if (mj9Var instanceof mj9.a) {
                    dug0.c cVar = ((mj9.a) mj9Var).a;
                    if (cVar.d()) {
                        bi9Var.b.setShutterLoadingProgress(cVar.b);
                    } else if (cVar.c()) {
                        bi9Var.d = false;
                        bi9Var.f(storyMusicInfo, (String) ref$ObjectRef.element, cVar.c);
                    }
                }
                return s3q0.a;
            case 1:
                n3g n3gVar = (n3g) obj8;
                e4p e4pVar = (e4p) obj7;
                e4p e4pVar2 = (e4p) obj6;
                gzs gzsVar = (gzs) obj;
                peu peuVar = peu.a;
                ?? r0 = peu.b;
                h2k0 h2k0Var = h2k0.a;
                w0g.a aVar = (w0g.a) r0.get(h2k0Var);
                n3gVar.getClass();
                c2g c2gVar = new c2g(aVar.b, aVar.c, aVar.d, aVar.e, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, 1.0f, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, e4pVar);
                com.vk.photo.editor.ivm.d dVar = n3gVar.b;
                (dVar != null ? dVar : null).a(new EditorMessage.i(new bc0(e4pVar2, peuVar, CollageAspectRatioFormat.CollageOriginal, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, f0g.e, new g2g(on00.f(new Pair(h2k0Var, c2gVar)))), null, 6));
                gzsVar.invoke();
                return s3q0.a;
            case 2:
                UIBlockProfile uIBlockProfile = (UIBlockProfile) obj7;
                FriendsSuggestsVh friendsSuggestsVh = (FriendsSuggestsVh) obj6;
                ((izs) obj8).invoke(obj);
                if (uIBlockProfile.equals(friendsSuggestsVh.h)) {
                    int i5 = uIBlockProfile.E;
                    VkRichCell vkRichCell = friendsSuggestsVh.g;
                    VkRichCell vkRichCell2 = vkRichCell != null ? vkRichCell : null;
                    if (vkRichCell == null) {
                        vkRichCell = null;
                    }
                    pgv0 middle = vkRichCell.getMiddle();
                    if (middle != null) {
                        VkRichCell vkRichCell3 = friendsSuggestsVh.g;
                        pgv0Var = friendsSuggestsVh.a(middle, (vkRichCell3 != null ? vkRichCell3 : null).getContext(), uIBlockProfile, i5);
                    } else {
                        pgv0Var = null;
                    }
                    vkRichCell2.setMiddle(pgv0Var);
                }
                return s3q0.a;
            case 3:
                x7y x7yVar = (x7y) obj7;
                GetGroupInfo$Parameters getGroupInfo$Parameters2 = (GetGroupInfo$Parameters) obj6;
                List list = (List) obj;
                List list2 = (List) obj8;
                int i6 = 2;
                if (!(list2 instanceof Collection) || !list2.isEmpty()) {
                    Iterator it2 = list2.iterator();
                    while (true) {
                        if (it2.hasNext()) {
                            if (((WebGroupShortInfo) it2.next()).d == 2) {
                                if (list.isEmpty()) {
                                    x7yVar.L0().c(new Responses$ClientError(null, new Responses$ClientError.ErrorData(Responses$ClientError.ErrorData.Type.REASON_USER_DENIED, null, null, null, null, new Responses$ReasonUserDenied(0, null, 3, null), null, null, null, null, null, null, null, null, null, null, null, 131038, null), getGroupInfo$Parameters2.f(), 1, null));
                                }
                            }
                        }
                    }
                }
                List<WebGroupShortInfo> list3 = list;
                ArrayList arrayList = new ArrayList(c5g.u(list3, 10));
                for (WebGroupShortInfo webGroupShortInfo : list3) {
                    WebImage webImage = webGroupShortInfo.i;
                    WebGroup webGroup = webGroupShortInfo.b;
                    Iterator<T> it3 = webImage.b.iterator();
                    while (true) {
                        if (it3.hasNext()) {
                            obj2 = it3.next();
                            if (epx.f(((WebImageSize) obj2).g, Boolean.TRUE)) {
                            }
                        } else {
                            obj2 = r7;
                        }
                    }
                    WebImageSize webImageSize = (WebImageSize) obj2;
                    if (webImageSize != null) {
                        String str5 = webImageSize.b;
                        WebImageSize.CREATOR.getClass();
                        String str6 = WebImageSize.a.a(50, str5).b;
                        str2 = WebImageSize.a.a(100, str5).b;
                        str3 = WebImageSize.a.a(200, str5).b;
                        str4 = str6;
                    } else {
                        List<WebImageSize> list4 = webImage.b;
                        Iterator<T> it4 = list4.iterator();
                        while (true) {
                            if (it4.hasNext()) {
                                obj3 = it4.next();
                                if (((WebImageSize) obj3).d == 50) {
                                }
                            } else {
                                obj3 = r7;
                            }
                        }
                        WebImageSize webImageSize2 = (WebImageSize) obj3;
                        if (webImageSize2 == null || (str = webImageSize2.b) == null) {
                            str = "";
                        }
                        Iterator<T> it5 = list4.iterator();
                        while (true) {
                            if (it5.hasNext()) {
                                obj4 = it5.next();
                                if (((WebImageSize) obj4).d == 100) {
                                }
                            } else {
                                obj4 = r7;
                            }
                        }
                        WebImageSize webImageSize3 = (WebImageSize) obj4;
                        if (webImageSize3 == null || (str2 = webImageSize3.b) == null) {
                            str2 = "";
                        }
                        Iterator<T> it6 = list4.iterator();
                        while (true) {
                            if (it6.hasNext()) {
                                obj5 = it6.next();
                                if (((WebImageSize) obj5).d == 200) {
                                }
                            } else {
                                obj5 = r7;
                            }
                        }
                        WebImageSize webImageSize4 = (WebImageSize) obj5;
                        if (webImageSize4 == null || (str3 = webImageSize4.b) == null) {
                            str3 = "";
                        }
                        str4 = str;
                    }
                    String str7 = str3;
                    String str8 = str2;
                    int i7 = webGroupShortInfo.d;
                    GetGroupInfo$Response.Group.IsClosed isClosed = i7 != 0 ? i7 != 1 ? i7 != i6 ? GetGroupInfo$Response.Group.IsClosed.OPEN : GetGroupInfo$Response.Group.IsClosed.PRIVATE : GetGroupInfo$Response.Group.IsClosed.CLOSED : GetGroupInfo$Response.Group.IsClosed.OPEN;
                    long j = webGroup.b;
                    String str9 = webGroup.c;
                    String str10 = webGroupShortInfo.c;
                    String str11 = webGroupShortInfo.e;
                    String str12 = webGroupShortInfo.g;
                    Integer valueOf = Integer.valueOf(webGroupShortInfo.h);
                    xwv0 xwv0Var = x7yVar.d;
                    if (xwv0Var != null) {
                        getGroupInfo$Parameters = getGroupInfo$Parameters2;
                        if ((-webGroup.b) == xwv0Var.t().q) {
                            num = Integer.valueOf(webGroupShortInfo.f);
                            arrayList.add(new GetGroupInfo$Response.Group(j, str9, str10, str4, str8, str7, isClosed, str11, str12, valueOf, num));
                            getGroupInfo$Parameters2 = getGroupInfo$Parameters;
                            i6 = 2;
                            r7 = null;
                        }
                    } else {
                        getGroupInfo$Parameters = getGroupInfo$Parameters2;
                    }
                    num = null;
                    arrayList.add(new GetGroupInfo$Response.Group(j, str9, str10, str4, str8, str7, isClosed, str11, str12, valueOf, num));
                    getGroupInfo$Parameters2 = getGroupInfo$Parameters;
                    i6 = 2;
                    r7 = null;
                }
                u1n0 X0 = x7yVar.X0();
                String f = getGroupInfo$Parameters2.f();
                X0.getClass();
                com.vk.superapp.base.js.bridge.b.p(X0.a, new JsMethod("VKWebAppGetGroupInfo"), new GetGroupInfo$Response(null, arrayList.size() > 1 ? new GetGroupInfo$Response.Data.GroupsValue(new GetGroupInfo$Response.Groups(arrayList)) : new GetGroupInfo$Response.Data.GroupValue((GetGroupInfo$Response.Group) arrayList.get(0)), f, 1, null), null, null, false, null, 60);
                return s3q0.a;
            case 4:
                bf20 bf20Var = (bf20) obj8;
                l7r0 l7r0Var = (l7r0) obj7;
                LinkedHashMap linkedHashMap = (LinkedHashMap) obj6;
                List list5 = (List) obj;
                if (!list5.isEmpty()) {
                    long j2 = bf20Var.b;
                    tfx tfxVar = new tfx("messages.getIncognitoMembersByIds", new io.reactivex.rxjava3.processors.b(i4), new io.reactivex.rxjava3.subjects.b(26));
                    tfx.m(tfxVar, "peer_id", j2, 0L, 12);
                    tfxVar.i("incognito_member_ids", list5);
                    List<MessagesExtendedIncognitoMemberDto> d = ((MessagesGetIncognitoMembersByIdsResponseDto) ((az2) bz2.n(tfxVar, new qi00(bf20Var, 4)).c).invoke(l7r0Var)).d();
                    ArrayList arrayList2 = new ArrayList(c5g.u(d, 10));
                    for (MessagesExtendedIncognitoMemberDto messagesExtendedIncognitoMemberDto : d) {
                        Integer valueOf2 = Integer.valueOf(messagesExtendedIncognitoMemberDto.getId());
                        String i8 = messagesExtendedIncognitoMemberDto.i();
                        int id = messagesExtendedIncognitoMemberDto.getId();
                        UserId g = messagesExtendedIncognitoMemberDto.g();
                        if (g != null) {
                            Serializer.c<Peer> cVar2 = Peer.CREATOR;
                            peer = Peer.a.b(g.b);
                            break;
                        }
                        Serializer.c<Peer> cVar3 = Peer.CREATOR;
                        peer = Peer.Unknown.e;
                        Peer peer2 = peer;
                        Boolean d2 = messagesExtendedIncognitoMemberDto.d();
                        arrayList2.add(new Pair(valueOf2, new DialogMember(peer2, com.vk.dto.common.a.a(messagesExtendedIncognitoMemberDto.e()), messagesExtendedIncognitoMemberDto.f() * 1000, false, Integer.valueOf(id), i8, false, d2 != null ? d2.booleanValue() : false, false, 72, null)));
                    }
                    pn00.p(linkedHashMap, arrayList2);
                }
                return s3q0.a;
            case 5:
                oj30 oj30Var = (oj30) obj8;
                w2w w2wVar = (w2w) obj7;
                List list6 = (List) obj6;
                xgl0 xgl0Var = (xgl0) obj;
                long j3 = ((Msg) j5g.Y(oj30Var.c)).c;
                int d3 = xgl0Var.system().d();
                Serializer.c<Peer> cVar4 = Peer.CREATOR;
                Peer b = Peer.a.b(j3);
                WeightStrategy weightStrategy = oj30Var.d;
                final xgl0 I0 = w2wVar.I0();
                d040 o = I0.o();
                boolean z = weightStrategy == WeightStrategy.FORCE_LATEST;
                Integer c = o.c(b.b);
                int intValue = c != null ? c.intValue() : Integer.MAX_VALUE;
                if (z) {
                    i0 = new SparseArray();
                } else {
                    if (z) {
                        throw new NoWhenBranchMatchedException();
                    }
                    List list7 = list6;
                    ArrayList arrayList3 = new ArrayList(c5g.u(list7, 10));
                    Iterator it7 = list7.iterator();
                    while (it7.hasNext()) {
                        arrayList3.add(Integer.valueOf(((Msg) it7.next()).b));
                    }
                    i0 = o.i0(arrayList3);
                }
                List list8 = list6;
                ArrayList arrayList4 = new ArrayList(c5g.u(list8, 10));
                Iterator it8 = list8.iterator();
                while (it8.hasNext()) {
                    Msg msg = (Msg) it8.next();
                    gkx0 gkx0Var = (gkx0) i0.get(msg.b);
                    if (z || gkx0Var == null) {
                        it = it8;
                        i = intValue;
                        i2 = i;
                        sparseArray = i0;
                    } else {
                        long j4 = gkx0Var.b;
                        it = it8;
                        xo9.j(j4, n140.a);
                        i2 = intValue;
                        sparseArray = i0;
                        i = (int) xo9.j(j4, n140.b);
                        xo9.j(j4, n140.c);
                    }
                    Msg zb = msg.zb();
                    zb.p = n140.b(i, msg.b, msg.o == MsgSyncState.SENDING);
                    zb.q = false;
                    zb.r = false;
                    zb.u = d3;
                    arrayList4.add(zb);
                    it8 = it;
                    intValue = i2;
                    i0 = sparseArray;
                }
                Msg msg2 = (Msg) j5g.Y(arrayList4);
                Msg msg3 = (Msg) j5g.i0(arrayList4);
                boolean z2 = z;
                yg20 yg20Var = new yg20(new jod(I0), new r66(0, I0.system(), frn0.class, "getPhase", "getPhase()I", 0, 2), new zzs() { // from class: xsna.xzb
                    @Override // xsna.zzs
                    public final Object invoke(Object obj9, Object obj10, Object obj11, Object obj12) {
                        int intValue2 = ((Integer) obj12).intValue();
                        return xgl0.this.o().n((Peer) obj9, (gkx0) obj10, (Direction) obj11, intValue2);
                    }
                }, new ec(I0, 24));
                if (epx.f(msg2, msg3)) {
                    xgk0 a = yg20Var.a(b, msg2.p);
                    msg2.q = a.a;
                    msg3.r = z2 ? false : a.b;
                } else {
                    msg2.q = yg20Var.a(b, msg2.p).a;
                    msg3.r = z2 ? false : yg20Var.a(b, msg3.p).b;
                }
                izs<List<? extends Msg>, s3q0> izsVar = oj30Var.e;
                if (izsVar != null) {
                    izsVar.invoke(arrayList4);
                }
                w2wVar.I0().o().a(arrayList4);
                return new ArrayList(arrayList4);
            case 6:
                ilv0 ilv0Var = (ilv0) obj;
                qi00 qi00Var = new qi00((List) obj7, (s040) obj6);
                ilv0Var.getClass();
                hlv0 hlv0Var = new hlv0((CharSequence) obj8);
                ilv0Var.a.add(hlv0Var);
                qi00Var.invoke(hlv0Var);
                return s3q0.a;
            case 7:
                pe40 pe40Var = (pe40) obj8;
                return ((Boolean) obj).booleanValue() ? pe40Var.a.g((String) obj7).l(new rt0(new w110(pe40Var, (UIBlockLink) obj6), i4)) : io.reactivex.rxjava3.core.x.k(new tt70(7, 0L, (List) null));
            case 8:
                o360 o360Var = (o360) obj8;
                Boolean bool = (Boolean) obj7;
                lkw lkwVar = (lkw) obj;
                o360Var.getClass();
                long elapsedRealtime = SystemClock.elapsedRealtime();
                lkwVar.f = Long.valueOf(elapsedRealtime);
                lkwVar.i = bool;
                List<o360.b> d4 = o360Var.c.d((String) obj6);
                if (d4 != null) {
                    Iterator<T> it9 = d4.iterator();
                    while (it9.hasNext()) {
                        ((o360.b) it9.next()).d(elapsedRealtime, bool);
                    }
                }
                return s3q0.a;
            case 9:
                CheckBox checkBox = (CheckBox) obj7;
                b9l0 b9l0Var = (b9l0) obj6;
                ((izs) obj8).invoke(f4m.h(checkBox) ? Boolean.valueOf(checkBox.isChecked()) : null);
                androidx.appcompat.app.d dVar2 = b9l0Var.b;
                if (dVar2 != null) {
                    dVar2.dismiss();
                }
                return s3q0.a;
            default:
                jzl0 jzl0Var = (jzl0) obj8;
                List<uwl0> g2 = jzl0Var.g((StoryEntry) obj7, (StoriesContainer) obj6, jzl0Var.o, jzl0Var.p, false);
                jzl0Var.r = g2;
                jzl0Var.a.setActionItems(g2);
                return s3q0.a;
        }
    }
}
