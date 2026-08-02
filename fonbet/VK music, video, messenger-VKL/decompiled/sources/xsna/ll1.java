package xsna;

import android.content.Context;
import android.text.Spannable;
import android.view.View;
import android.view.ViewGroup;
import android.view.Window;
import android.widget.LinearLayout;
import com.vk.api.generated.users.dto.UsersFieldsDto;
import com.vk.catalog2.common.dto.ui.UIBlockLink;
import com.vk.contacts.AndroidContact;
import com.vk.core.preference.Preference;
import com.vk.core.serialize.Serializer;
import com.vk.core.view.components.picture.VkImageSimple;
import com.vk.core.view.components.userstack.VkDiagonalUserStack;
import com.vk.core.view.components.userstack.VkMiniUserStack;
import com.vk.core.view.components.userstack.VkUserStack;
import com.vk.dto.common.DownloadingState;
import com.vk.dto.common.id.UserId;
import com.vk.dto.music.MusicTrack;
import com.vk.dto.music.audiobook.AudioBook;
import com.vk.dto.notifications.NotificationItem;
import com.vk.dto.photo.Photo;
import com.vk.dto.stickers.StickerStockItem;
import com.vk.dto.stories.model.CommonUploadParams;
import com.vk.dto.stories.model.StoriesContainer;
import com.vk.dto.stories.model.StoryEntry;
import com.vk.dto.stories.model.StoryUploadParams;
import com.vk.dto.stories.model.StoryUploadType;
import com.vk.dto.stories.model.ideas.StoryIdea;
import com.vk.dto.stories.model.ideas.StoryIdeaType;
import com.vk.im.engine.exceptions.chat.AlreadyInChatException;
import com.vk.im.engine.models.dialogs.DialogMember;
import com.vk.im.ui.fragments.ImDialogsSelectionFragment;
import com.vk.log.L;
import com.vk.media.entities.StoryEditorParams;
import com.vk.music.player.PlayRequestTrigger;
import com.vk.music.player.ShuffleMode;
import com.vk.music.player.StartPlaySource;
import com.vk.music.stats.AdsAudioPixelsContainer;
import com.vk.notifications.GroupedNotificationsFragment;
import com.vk.stat.scheme.MobileOfficialAppsSearchStat$TypeSearchClickItem;
import com.vk.story.api.LoadContext;
import com.vk.story.api.domain.interactor.repost.PublishedKind;
import com.vk.story.api.domain.interactor.upload.StoryMultiData;
import com.vk.story.api.media.StoryMediaData;
import com.vk.superapp.base.js.bridge.JsMethod;
import com.vk.superapp.common.js.bridge.api.events.RetargetingPixel$Error;
import com.vk.superapp.common.js.bridge.api.events.RetargetingPixel$Parameters;
import com.vk.superapp.vkpay.checkout.api.dto.response.TransactionStatusResponse;
import com.vk.superapp.vkpay.checkout.config.VkPayCheckoutConfig;
import com.vk.superapp.vkpay.checkout.feature.threedspayment.models.PaymentData3DS;
import com.vk.superapp.vkpay.checkout.feature.threedspayment.models.PostData3DS;
import com.vk.superapp.vkpay.checkout.feature.threedspayment.models.PostParams3DS;
import com.vk.superapp.vkpay.checkout.feature.verification.biometric.core.BiometricProcessor$AuthMode;
import com.vkontakte.android.R;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.Date;
import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.ListIterator;
import java.util.Locale;
import java.util.Set;
import kotlin.collections.EmptyList;
import kotlin.collections.builders.ListBuilder;
import kotlin.jvm.internal.Ref$ObjectRef;
import xsna.bbv0;
import xsna.cs90;
import xsna.h7u0;
import xsna.huv;
import xsna.jto0;
import xsna.li70;
import xsna.o2j;
import xsna.qvg;
import xsna.r0i;
import xsna.tlo0;
import xsna.v1j;

/* compiled from: R8$$SyntheticClass */
/* loaded from: classes4.dex */
public final /* synthetic */ class ll1 implements izs {
    public final /* synthetic */ int b;
    public final /* synthetic */ Object c;
    public final /* synthetic */ Object d;

    public /* synthetic */ ll1(int i, Object obj, Object obj2) {
        this.b = i;
        this.c = obj;
        this.d = obj2;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v162, types: [com.vk.dto.stories.model.StoriesContainer[], java.lang.Object[]] */
    /* JADX WARN: Type inference failed for: r10v13, types: [android.view.View, com.vk.core.view.components.userstack.VkDiagonalUserStack] */
    /* JADX WARN: Type inference failed for: r11v16 */
    /* JADX WARN: Type inference failed for: r11v5 */
    /* JADX WARN: Type inference failed for: r11v6 */
    /* JADX WARN: Type inference failed for: r12v6, types: [android.view.View, com.vk.core.view.components.userstack.VkUserStack] */
    /* JADX WARN: Type inference failed for: r12v7, types: [android.view.View, com.vk.core.view.components.userstack.VkUserStack] */
    /* JADX WARN: Type inference failed for: r15v12, types: [android.view.View, com.vk.core.view.components.userstack.VkMiniUserStack] */
    /* JADX WARN: Type inference failed for: r3v70, types: [xsna.rsg0] */
    /* JADX WARN: Type inference failed for: r4v31, types: [kotlin.collections.EmptyList] */
    /* JADX WARN: Type inference failed for: r4v32, types: [java.util.List] */
    /* JADX WARN: Type inference failed for: r4v33, types: [java.util.ArrayList] */
    /* JADX WARN: Type inference failed for: r4v75, types: [T, android.view.View, android.view.ViewGroup, android.widget.LinearLayout, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r5v10, types: [xsna.hou] */
    /* JADX WARN: Type inference failed for: r5v60, types: [android.view.View, android.view.ViewGroup, android.widget.LinearLayout] */
    @Override // xsna.izs
    public final Object invoke(Object obj) {
        String str;
        ?? r4;
        qtd0 aVar;
        DownloadingState downloadingState;
        int i = 24;
        int i2 = 8;
        int i3 = 6;
        int i4 = 2;
        int i5 = 10;
        int i6 = 3;
        boolean z = false;
        z = false;
        z = false;
        int i7 = 1;
        hc50 hc50Var = null;
        switch (this.b) {
            case 0:
                ((izs) this.c).invoke(((ql1) this.d).m);
                return s3q0.a;
            case 1:
                ((vf5) this.c).b.h((hyg0) obj, (wf5) this.d);
                return s3q0.a;
            case 2:
                p66 p66Var = (p66) this.c;
                ngl nglVar = (ngl) this.d;
                Throwable th = (Throwable) obj;
                ygg yggVar = p66Var.s;
                return yggVar != null ? yggVar.b(th, nglVar) : new xjq(th);
            case 3:
                laa laaVar = (laa) this.c;
                String str2 = (String) this.d;
                List list = (List) obj;
                vua0 vua0Var = laaVar.k;
                String str3 = laaVar.j;
                vua0Var.getClass();
                if (!drm0.N(str3)) {
                    String m = cqm0.m(drm0.p0(str3).toString());
                    List list2 = list;
                    ArrayList arrayList = new ArrayList();
                    for (Object obj2 : list2) {
                        if (drm0.D(((AudioBook) obj2).c, m, true)) {
                            arrayList.add(obj2);
                        }
                    }
                    ArrayList arrayList2 = new ArrayList();
                    for (Object obj3 : list2) {
                        if (drm0.D(((AudioBook) obj3).Db(), m, true)) {
                            arrayList2.add(obj3);
                        }
                    }
                    HashSet hashSet = new HashSet();
                    hashSet.addAll(arrayList);
                    hashSet.addAll(arrayList2);
                    ArrayList arrayList3 = new ArrayList();
                    for (Object obj4 : list2) {
                        if (hashSet.contains((AudioBook) obj4)) {
                            arrayList3.add(obj4);
                        }
                    }
                    list = arrayList3;
                }
                int hashCode = str2.hashCode();
                if (hashCode != -1529764530) {
                    if (hashCode != -185433675) {
                        if (hashCode == 505811102 && str2.equals("offline_music_replacement_default")) {
                            return j5g.y0(list);
                        }
                    } else if (str2.equals("offline_music_replacement_old_first")) {
                        return list;
                    }
                } else if (str2.equals("offline_music_replacement_name")) {
                    return j5g.D0(new caa(i7), list);
                }
                throw new IllegalArgumentException("Unknown replacement = ".concat(str2));
            case 4:
                VkImageSimple vkImageSimple = (VkImageSimple) this.c;
                gde gdeVar = (gde) this.d;
                if (g620.f().k0().a(vkImageSimple.getContext())) {
                    return s3q0.a;
                }
                MusicTrack musicTrack = gdeVar.t;
                if (musicTrack == null) {
                    return s3q0.a;
                }
                if (musicTrack.B()) {
                    gdeVar.m.g(musicTrack);
                } else {
                    gdeVar.l.N0(new lqk0((StartPlaySource) null, musicTrack, (List) null, gdeVar.n, 0, ShuffleMode.SHUFFLE_OFF, (PlayRequestTrigger) null, (AdsAudioPixelsContainer) null, 0L, 949));
                }
                return s3q0.a;
            case 5:
                ich ichVar = (ich) this.d;
                izs izsVar = (izs) this.c;
                dch dchVar = ichVar.m;
                if (dchVar == null || (str = dchVar.e) == null) {
                    return s3q0.a;
                }
                ichVar.l.invoke(new qvg.a(dchVar.f));
                izsVar.invoke(str);
                return s3q0.a;
            case 6:
                k0i k0iVar = (k0i) this.c;
                com.vk.profile.core.scheduled_clips.h hVar = (com.vk.profile.core.scheduled_clips.h) this.d;
                k0iVar.d.invoke((Date) obj);
                hVar.i.setContent(new jai(625736787, new qed(i6, r0i.b.a, hVar), true));
                return s3q0.a;
            case 7:
                v1j.a aVar2 = (v1j.a) this.c;
                a2j a2jVar = (a2j) this.d;
                L.e("Move participant " + aVar2.b + " to room " + aVar2.c + " failed");
                a2jVar.T(o2j.j.b);
                return s3q0.a;
            case 8:
                h4o h4oVar = (h4o) this.c;
                rg50 rg50Var = (rg50) this.d;
                s4o s4oVar = (s4o) obj;
                s4oVar.a(new wow(h4oVar.d), kq01.e);
                s4oVar.b(new itz0(rg50Var));
                return s3q0.a;
            case 9:
                CharSequence charSequence = null;
                com.vk.lists.c cVar = (com.vk.lists.c) this.c;
                GroupedNotificationsFragment groupedNotificationsFragment = (GroupedNotificationsFragment) this.d;
                com.vk.dto.notifications.a aVar3 = (com.vk.dto.notifications.a) obj;
                int i8 = GroupedNotificationsFragment.f0;
                String j = cVar.j();
                if (j == null || !j.equals("0")) {
                    hou houVar = groupedNotificationsFragment.Z;
                    if (houVar != null) {
                        houVar.q += aVar3.d;
                        houVar.R0();
                    }
                } else {
                    int i9 = aVar3.a;
                    groupedNotificationsFragment.c0 = i9;
                    hou houVar2 = groupedNotificationsFragment.Z;
                    if (houVar2 != null) {
                        houVar2.r = i9;
                    }
                    if (houVar2 != null) {
                        houVar2.q = aVar3.d;
                        houVar2.R0();
                    }
                }
                ?? r5 = groupedNotificationsFragment.Z;
                if (r5 != null) {
                    ArrayList<NotificationItem> arrayList4 = aVar3.b;
                    if (arrayList4 != null) {
                        int size = arrayList4.size();
                        int i10 = 0;
                        while (i10 < size) {
                            NotificationItem notificationItem = arrayList4.get(i10);
                            li70.b bVar = li70.R;
                            if (notificationItem != null) {
                                if (notificationItem.t == null) {
                                    notificationItem.t = li70.b.c(bVar, notificationItem, notificationItem.h, i);
                                }
                                charSequence = notificationItem.t;
                            }
                            if (charSequence != null && (charSequence instanceof Spannable)) {
                                Spannable spannable = (Spannable) charSequence;
                                x7q[] x7qVarArr = (x7q[]) spannable.getSpans(0, spannable.length(), x7q.class);
                                if (x7qVarArr.length != 0) {
                                    x7qVarArr[0].m = new dh0(i4, notificationItem, groupedNotificationsFragment);
                                }
                            }
                            i10++;
                            i = 24;
                            charSequence = null;
                        }
                    }
                    r5.n0(arrayList4);
                }
                String str4 = aVar3.c;
                cVar.s(str4);
                if (str4 != null && str4.length() != 0 && !str4.equals("0")) {
                    z = true;
                }
                cVar.r(z);
                return s3q0.a;
            case 10:
                final ptv ptvVar = (ptv) this.c;
                huv.a aVar4 = (huv.a) obj;
                StoryIdeaType x = s200.x(((StoryIdea) this.d).c);
                StoryUploadParams storyUploadParams = new StoryUploadParams();
                storyUploadParams.f = StoryUploadParams.CameraType.STORY_BOX;
                storyUploadParams.D = 24;
                g9m0 g9m0Var = ptvVar.d;
                String i11 = g9m0Var.i();
                if (i11.length() <= 0) {
                    i11 = null;
                }
                storyUploadParams.C = i11;
                storyUploadParams.j = aVar4.b;
                StoryIdeaType storyIdeaType = StoryIdeaType.BIRTHDAY;
                if (x == storyIdeaType) {
                    storyUploadParams.K = storyIdeaType.h();
                }
                CommonUploadParams commonUploadParams = new CommonUploadParams(ptvVar.f.c(), true, null, null, null, null, null, null, null, StoryUploadType.PUBLISH_NOW, null, false, null, false, null, null, 65020, null);
                commonUploadParams.o = false;
                commonUploadParams.q = x.h();
                commonUploadParams.h = ptvVar.h.name().toLowerCase(Locale.ROOT);
                Serializer.c<StoryMediaData> cVar2 = StoryMediaData.CREATOR;
                final int b = ptvVar.b.b(new StoryMultiData(Collections.singletonList(new StoryMediaData(aVar4.a, null, storyUploadParams, null)), new StoryEditorParams(1080, 1920), commonUploadParams, 0, null, 24, null));
                g9m0Var.m(storyUploadParams.C);
                LinkedHashSet linkedHashSet = new LinkedHashSet();
                final k4 k4Var = new k4(i2, linkedHashSet, ptvVar);
                bd70 bd70Var = new bd70() { // from class: xsna.mtv
                    @Override // xsna.bd70
                    public final void x0(int i12, int i13, Object obj5) {
                        zjm0 zjm0Var = (zjm0) obj5;
                        if (zjm0Var == null || zjm0Var.b != b) {
                            return;
                        }
                        k4Var.invoke();
                        StoryEntry storyEntry = zjm0Var.g;
                        if (storyEntry == null) {
                            return;
                        }
                        String Gb = storyEntry.Gb();
                        ptv ptvVar2 = ptvVar;
                        pam0 pam0Var = ptvVar2.e;
                        Window window = (Window) ptvVar2.g.invoke();
                        if (window != null) {
                            pam0Var.a(Gb, window, PublishedKind.STORY);
                        } else {
                            pam0Var.d(Gb);
                        }
                    }
                };
                bd70 bd70Var2 = new bd70() { // from class: xsna.ntv
                    @Override // xsna.bd70
                    public final void x0(int i12, int i13, Object obj5) {
                        zjm0 zjm0Var = (zjm0) obj5;
                        if (zjm0Var != null) {
                            int i14 = zjm0Var.b;
                            int i15 = b;
                            if (i14 == i15) {
                                k4Var.invoke();
                                ptv ptvVar2 = ptvVar;
                                pam0 pam0Var = ptvVar2.e;
                                Window window = (Window) ptvVar2.g.invoke();
                                if (window != null) {
                                    pam0Var.c(i15, window, PublishedKind.STORY);
                                } else {
                                    pam0Var.b(i15);
                                }
                            }
                        }
                    }
                };
                bd70 bd70Var3 = new bd70() { // from class: xsna.otv
                    @Override // xsna.bd70
                    public final void x0(int i12, int i13, Object obj5) {
                        zjm0 zjm0Var = (zjm0) obj5;
                        if (zjm0Var == null || zjm0Var.b != b) {
                            return;
                        }
                        k4Var.invoke();
                    }
                };
                linkedHashSet.add(bd70Var);
                linkedHashSet.add(bd70Var2);
                linkedHashSet.add(bd70Var3);
                p870 p870Var = ptvVar.c;
                p870Var.b(102, bd70Var);
                p870Var.b(104, bd70Var2);
                p870Var.b(109, bd70Var3);
                return s3q0.a;
            case 11:
                ImDialogsSelectionFragment imDialogsSelectionFragment = (ImDialogsSelectionFragment) this.c;
                urm urmVar = (urm) this.d;
                int i12 = ImDialogsSelectionFragment.n0;
                ohm ohmVar = (ohm) ((xpp) obj).a();
                if (ohmVar != null) {
                    r4 = new ArrayList(c5g.u(ohmVar, 10));
                    ListIterator listIterator = ohmVar.b.listIterator();
                    while (listIterator.hasNext()) {
                        r4.add(((DialogMember) listIterator.next()).b);
                    }
                } else {
                    r4 = EmptyList.b;
                }
                Object obj5 = imDialogsSelectionFragment.a0;
                if (r4.containsAll((Collection) (obj5 == null ? null : obj5))) {
                    throw new AlreadyInChatException();
                }
                return ((lzv) imDialogsSelectionFragment.S.getValue()).b(imDialogsSelectionFragment, urmVar);
            case 12:
                z4w z4wVar = (z4w) this.c;
                String str5 = (String) this.d;
                z4wVar.dismiss();
                t8j t8jVar = (t8j) j5g.a0((List) obj);
                if (t8jVar == null || (aVar = t8jVar.b) == null) {
                    aVar = new com.vk.im.engine.models.contacts.a(new AndroidContact(null, str5, false, Collections.singleton(str5), Collections.singleton(str5), null, 33, null));
                }
                izs<qtd0, s3q0> izsVar2 = z4wVar.b;
                if (izsVar2 != null) {
                    izsVar2.invoke(aVar);
                }
                return s3q0.a;
            case 13:
                t1z t1zVar = (t1z) this.c;
                d790 d790Var = (d790) this.d;
                View view = (View) obj;
                ucl0 ucl0Var = t1zVar.m;
                if (ucl0Var != null) {
                    ucl0Var.a(d790Var.a.b, MobileOfficialAppsSearchStat$TypeSearchClickItem.Action.BUY_OUT);
                }
                if (!t1zVar.l && d790Var.a.Q) {
                    d6w0.a(b6m.e(), view.getContext(), "stickers_preview", "create", 8);
                    return s3q0.a;
                }
                ArrayList g = d790Var.g();
                StickerStockItem stickerStockItem = d790Var.a;
                Iterator it = g.iterator();
                while (it.hasNext()) {
                    StickerStockItem stickerStockItem2 = (StickerStockItem) it.next();
                    if (stickerStockItem2.O == null) {
                        stickerStockItem2.O = t1zVar.f;
                    }
                    ucl0 ucl0Var2 = t1zVar.m;
                    if (ucl0Var2 != null) {
                        int i13 = stickerStockItem.b;
                        String str6 = ((long) i13) == ucl0Var2.b ? ucl0Var2.a : null;
                        if (str6 != null && stickerStockItem2.b == i13) {
                            stickerStockItem2.P = str6;
                        }
                    }
                }
                if (g.isEmpty()) {
                    cvk.u(R.string.error, false);
                    L.l("Nothing to purchase among selected packs: " + d790Var);
                } else {
                    t1zVar.h.Kk(g, new wn7(i3, d790Var, t1zVar));
                }
                return s3q0.a;
            case 14:
                Set set = (Set) this.d;
                izs izsVar3 = (izs) this.c;
                List O0 = j5g.O0(new ipw(set));
                ((nvy) obj).e(O0.size(), new sqz(new pqz(false ? 1 : 0), O0), new tqz(O0), new jai(802480018, new uqz(O0, izsVar3), true));
                return s3q0.a;
            case 15:
                return Boolean.valueOf(((we40) this.c).u.b((UIBlockLink) this.d, (yj40) obj));
            case 16:
                String str7 = (String) this.c;
                String str8 = (String) this.d;
                qyg0 V0 = ((hyg0) obj).V0("SELECT id, uid, mid, downloading_state, json_raw FROM audio_track WHERE uid = ? AND release_audio_id = ?");
                try {
                    V0.D3(1, str7);
                    V0.D3(2, str8);
                    if (V0.step()) {
                        int i14 = (int) V0.getLong(0);
                        UserId b2 = fwx0.b(V0.l2(1));
                        String l2 = V0.l2(2);
                        int i15 = (int) V0.getLong(3);
                        if (i15 == 0) {
                            downloadingState = DownloadingState.NotLoaded.b;
                        } else if (i15 == 1) {
                            downloadingState = DownloadingState.Downloaded.b;
                        } else if (i15 == 2) {
                            downloadingState = DownloadingState.PendingDownload.b;
                        } else if (i15 == 3) {
                            downloadingState = DownloadingState.PartlyDownloaded.b;
                        } else {
                            if (i15 != 4) {
                                throw new IllegalStateException("Incorrect download state value");
                            }
                            downloadingState = DownloadingState.Corrupted.b;
                        }
                        hc50Var = new hc50(i14, downloadingState, b2, l2, V0.l2(4));
                    }
                    return hc50Var;
                } finally {
                    V0.close();
                }
            case 17:
                ((um50) this.c).c(new ew3(15, (h7f0) obj, (Ref$ObjectRef) this.d));
                return s3q0.a;
            case 18:
                cs90 cs90Var = (cs90) this.c;
                PaymentData3DS paymentData3DS = (PaymentData3DS) this.d;
                ajp0 ajp0Var = (ajp0) obj;
                as90 as90Var = cs90Var.e;
                if (ajp0Var.c != TransactionStatusResponse.VkCheckoutTransactionStatus.PROCESSING) {
                    as90Var.un();
                    as90Var.Ob();
                    int i16 = cs90.a.$EnumSwitchMapping$0[ajp0Var.c.ordinal()];
                    if (i16 == 1) {
                        hk70 hk70Var = new hk70(cs90Var, i6);
                        l57 l57Var = cs90Var.k;
                        if (l57Var != null) {
                            String sb = cs90Var.d.toString();
                            m57 m57Var = l57Var.i;
                            Context mo2getContext = l57Var.c.mo2getContext();
                            if (!gz80.a(23) || mo2getContext == null) {
                                hk70Var.invoke();
                            } else {
                                m57Var.getClass();
                                ?? r11 = c57.c(mo2getContext).a(255) == 0 ? 1 : 0;
                                bbv0.g.getClass();
                                VkPayCheckoutConfig vkPayCheckoutConfig = bbv0.a.f().b;
                                if (vkPayCheckoutConfig == null) {
                                    throw new IllegalStateException("Config must not be null");
                                }
                                UserId userId = vkPayCheckoutConfig.c.getUserId();
                                boolean contains = Preference.g(mo2getContext).contains("VK_PAY_CHECKOUT_VKPAY_TOKEN/" + userId.b);
                                if (r11 == 0 || contains) {
                                    hk70Var.invoke();
                                } else if (r11 != 0 && !contains) {
                                    k57 k57Var = new k57(l57Var, sb, hk70Var);
                                    Context context = l57Var.f;
                                    m57Var.b(l57Var.b, k57Var, new o47(context.getString(R.string.vk_pay_checkout_biometric_create_token_dialog_title), context.getString(R.string.vk_pay_checkout_biometric_create_token_dialog_subtitle), context.getString(R.string.vk_pay_checkout_biometric_create_token_dialog_negative_button)), BiometricProcessor$AuthMode.ENCRYPTION);
                                }
                            }
                        } else {
                            hk70Var.invoke();
                        }
                    } else if (i16 == 2) {
                        String str9 = ajp0Var.d;
                        xou0 xou0Var = ajp0Var.e;
                        if (xou0Var == null) {
                            throw new IllegalArgumentException("Required value was null.");
                        }
                        cs90Var.i.h(PaymentData3DS.i(paymentData3DS, new PostData3DS(str9, new PostParams3DS(xou0Var.a, xou0Var.b, xou0Var.c))), null);
                        s3q0 s3q0Var = s3q0.a;
                    } else if (i16 == 3) {
                        cs90Var.a();
                        cs90Var.j();
                    }
                }
                return s3q0.a;
            case 19:
                rzo rzoVar = (rzo) this.c;
                u5a0 u5a0Var = (u5a0) this.d;
                UserId userId2 = rzoVar.a;
                int i17 = rzoVar.d;
                int i18 = rzoVar.b;
                String str10 = rzoVar.g;
                ArrayList arrayList5 = u5a0Var.a.b;
                ?? ittVar = new itt("photos.getComments");
                ittVar.C(i17, "photo_id");
                ittVar.F(userId2, "owner_id");
                ittVar.C(i18, "start_comment_id");
                ittVar.C(1, "count");
                ittVar.K("access_key", str10);
                ittVar.C(1, "extended");
                ArrayList arrayList6 = new ArrayList(c5g.u(arrayList5, 10));
                Iterator it2 = arrayList5.iterator();
                while (it2.hasNext()) {
                    arrayList6.add(((UsersFieldsDto) it2.next()).i());
                }
                ittVar.G("fields", arrayList6);
                ittVar.C(1, "photo_sizes");
                return rsg0.y0(ittVar, null, null, 3);
            case 20:
                cqa0 cqa0Var = (cqa0) this.c;
                RetargetingPixel$Parameters retargetingPixel$Parameters = (RetargetingPixel$Parameters) this.d;
                Throwable th2 = (Throwable) obj;
                svp svpVar = cqa0Var.c;
                String j2 = retargetingPixel$Parameters.j();
                svpVar.getClass();
                if (fco0.d(th2)) {
                    svpVar.n(fco0.h(j2, th2));
                } else {
                    com.vk.superapp.base.js.bridge.b.o(svpVar.a, new JsMethod("VKWebAppRetargetingPixel"), new RetargetingPixel$Error(null, new RetargetingPixel$Error.Data(RetargetingPixel$Error.Data.Type.API_ERROR, j2, null, fco0.g(th2), 4, null), 1, null), null, null, 12);
                }
                return s3q0.a;
            case 21:
                bzb0 bzb0Var = (bzb0) this.c;
                View view2 = (View) this.d;
                View view3 = (View) obj;
                LinearLayout linearLayout = new LinearLayout(bzb0Var.a);
                linearLayout.setOrientation(1);
                if (view2 != null) {
                    linearLayout.addView(view2);
                }
                linearLayout.addView(view3);
                return linearLayout;
            case 22:
                w0f0 w0f0Var = (w0f0) this.d;
                izs izsVar4 = (izs) this.c;
                zaw zawVar = w0f0Var.c;
                int i19 = ((k0f0) obj).a;
                if (zawVar.d(i19)) {
                    izsVar4.invoke(Integer.valueOf(i19));
                } else {
                    h7u0.a aVar5 = new h7u0.a(bwt0.w(w0f0Var));
                    aVar5.g0(R.string.im_msg_reaction_unknown_title);
                    aVar5.U(R.string.im_msg_reaction_unknown_message);
                    aVar5.c0(R.string.im_msg_reaction_unknown_button, null);
                    aVar5.m();
                }
                return s3q0.a;
            case 23:
                c1h c1hVar = (c1h) this.d;
                izs izsVar5 = (izs) this.c;
                ljo0 ljo0Var = (ljo0) obj;
                ((zak0) c1hVar.j).setValue(ljo0Var);
                izsVar5.invoke(ljo0Var);
                return s3q0.a;
            case 24:
                izs<? super Long, s3q0> izsVar6 = (izs) this.c;
                wh50 wh50Var = (wh50) this.d;
                b4i0 b4i0Var = new b4i0((Context) obj);
                b4i0Var.setLayoutParams(new ViewGroup.LayoutParams(-1, -2));
                b4i0Var.setOnSeekListener(izsVar6);
                wh50Var.setValue(b4i0Var);
                return b4i0Var;
            case 25:
                LoadContext loadContext = (LoadContext) this.c;
                UserId userId3 = (UserId) this.d;
                ArrayList arrayList7 = (ArrayList) obj;
                if (!epx.f(loadContext, LoadContext.All.b)) {
                    return arrayList7;
                }
                ArrayList arrayList8 = new ArrayList();
                Iterator it3 = arrayList7.iterator();
                while (it3.hasNext()) {
                    StoriesContainer storiesContainer = (StoriesContainer) it3.next();
                    if (epx.f(storiesContainer.Ab(), userId3) || storiesContainer.Cb()) {
                        arrayList8.add(storiesContainer);
                    }
                }
                return !arrayList8.isEmpty() ? arrayList8 : !arrayList7.isEmpty() ? e43.a(new StoriesContainer[]{arrayList7.get(0)}) : new ArrayList();
            case 26:
                u5n0 u5n0Var = (u5n0) this.c;
                Photo photo = (Photo) this.d;
                Runnable runnable = u5n0Var.F;
                if (runnable != null) {
                    runnable.run();
                }
                ysg0<Object> ysg0Var = ysg0.b;
                ysg0Var.a(new atv0());
                ysg0Var.a(new zaa0(-9000, photo.e, photo.c));
                u5n0Var.R6(null, u5n0Var.v6(R.string.photo_tags_decline));
                return s3q0.a;
            case 27:
                wdn0 wdn0Var = (wdn0) this.c;
                xdn0 xdn0Var = (xdn0) this.d;
                wdn0Var.p.b(wdn0Var.itemView.getContext(), xdn0Var.e.o.c, xdn0Var, null);
                return s3q0.a;
            case 28:
                ((i0b0) this.c).invoke(jto0.b.a((jto0.b) this.d, null, null, null, null, false, null, false, false, ((Boolean) obj).booleanValue(), false, null, false, false, false, null, false, 65279));
                return s3q0.a;
            default:
                wzq0 wzq0Var = (wzq0) this.c;
                Ref$ObjectRef ref$ObjectRef = (Ref$ObjectRef) this.d;
                Context context2 = (Context) obj;
                LinearLayout.LayoutParams layoutParams = new LinearLayout.LayoutParams(-1, -2);
                int b3 = (int) t1u0.b(4, context2);
                layoutParams.setMargins(b3, b3, b3, b3);
                ?? a = io.reactivex.rxjava3.internal.operators.observable.q1.a(1, context2);
                a.setLayoutParams(new ViewGroup.LayoutParams(-1, -2));
                ListBuilder listBuilder = wzq0Var.b;
                for (VkUserStack.Size size2 : VkUserStack.Size.h()) {
                    ?? vkMiniUserStack = new VkMiniUserStack(a.getContext(), null, 6);
                    vkMiniUserStack.setLayoutParams(new LinearLayout.LayoutParams(layoutParams));
                    vkMiniUserStack.setSize(size2);
                    ArrayList arrayList9 = new ArrayList(c5g.u(new wow(listBuilder), 10));
                    Iterator it4 = listBuilder.iterator();
                    while (it4.hasNext()) {
                        itj0.d((String) it4.next(), arrayList9);
                    }
                    vkMiniUserStack.setAvatars(arrayList9);
                    a.addView(vkMiniUserStack);
                }
                for (VkUserStack.Size size3 : VkUserStack.Size.h()) {
                    ?? vkUserStack = new VkUserStack(a.getContext(), null, 6);
                    vkUserStack.setLayoutParams(new LinearLayout.LayoutParams(layoutParams));
                    vkUserStack.setSize(size3);
                    vkUserStack.setCounter(0);
                    tlo0.Companion.getClass();
                    vkUserStack.setText(new tlo0.h("Description"));
                    ArrayList arrayList10 = new ArrayList(c5g.u(new wow(listBuilder), 10));
                    Iterator it5 = listBuilder.iterator();
                    while (it5.hasNext()) {
                        itj0.d((String) it5.next(), arrayList10);
                    }
                    vkUserStack.setAvatars(arrayList10);
                    a.addView(vkUserStack);
                }
                for (VkUserStack.AvatarsPosition avatarsPosition : VkUserStack.AvatarsPosition.h()) {
                    ?? vkUserStack2 = new VkUserStack(a.getContext(), null, 6);
                    vkUserStack2.setLayoutParams(new LinearLayout.LayoutParams(layoutParams));
                    ArrayList arrayList11 = new ArrayList(c5g.u(new wow(listBuilder), i5));
                    Iterator it6 = listBuilder.iterator();
                    while (it6.hasNext()) {
                        itj0.d((String) it6.next(), arrayList11);
                    }
                    vkUserStack2.setAvatars(arrayList11);
                    tlo0.a aVar6 = tlo0.Companion;
                    String str11 = "Avatars position = " + avatarsPosition.name();
                    aVar6.getClass();
                    vkUserStack2.setText(new tlo0.h(str11));
                    vkUserStack2.setAvatarsPosition(avatarsPosition);
                    a.addView(vkUserStack2);
                    i5 = 10;
                }
                ?? a2 = io.reactivex.rxjava3.internal.operators.observable.q1.a(0, context2);
                a2.setLayoutParams(new ViewGroup.LayoutParams(-2, -1));
                for (VkDiagonalUserStack.Size size4 : VkDiagonalUserStack.Size.h()) {
                    ?? vkDiagonalUserStack = new VkDiagonalUserStack(context2, null, 6);
                    vkDiagonalUserStack.setLayoutParams(new LinearLayout.LayoutParams(layoutParams));
                    vkDiagonalUserStack.setSize(size4);
                    ListBuilder listBuilder2 = wzq0Var.c;
                    ArrayList arrayList12 = new ArrayList(c5g.u(new wow(listBuilder2), 10));
                    Iterator it7 = listBuilder2.iterator();
                    while (it7.hasNext()) {
                        itj0.d((String) it7.next(), arrayList12);
                    }
                    vkDiagonalUserStack.setAvatars(arrayList12);
                    a2.addView(vkDiagonalUserStack);
                }
                a.addView(a2);
                ref$ObjectRef.element = a;
                return a;
        }
    }

    public /* synthetic */ ll1(int i, Object obj, izs izsVar) {
        this.b = i;
        this.d = obj;
        this.c = izsVar;
    }

    public /* synthetic */ ll1(Object obj, Object obj2, Object obj3, int i) {
        this.b = i;
        this.c = obj;
        this.d = obj2;
    }
}
