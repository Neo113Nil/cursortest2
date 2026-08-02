package xsna;

import android.os.Bundle;
import com.vk.api.sdk.auth.AccountProfileType;
import com.vk.auth.verification.base.ui.VkCheckEditText;
import com.vk.dto.common.id.UserId;
import com.vk.dto.music.Playlist;
import com.vk.log.L;
import com.vk.newsfeed.posting.music_picker.domain.model.MusicPickerList;
import com.vk.newsfeed.posting.music_picker.domain.model.MusicPickerState;
import com.vk.newsfeed.posting.music_picker.presentation.model.MusicPickerListItem;
import com.vk.superapp.multiaccount.api.PinCodeAnalyticsParams;
import com.vkontakte.android.R;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import java.util.Locale;
import java.util.concurrent.TimeUnit;
import kotlin.NoWhenBranchMatchedException;
import kotlin.collections.EmptyList;
import kotlin.jvm.internal.FunctionReferenceImpl;
import ru.ok.android.utils.Logger;
import xsna.ssf0;
import xsna.usi0;
import xsna.wcd0;

/* compiled from: MiniAppCallPiPView.kt */
/* loaded from: classes7.dex */
public final /* synthetic */ class yo20 extends FunctionReferenceImpl implements izs {
    public final /* synthetic */ int b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ yo20(int i, Object obj, Class cls, String str, String str2, int i2, int i3) {
        super(i, obj, cls, str, str2, i2);
        this.b = i3;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r13v12, types: [kotlin.collections.EmptyList] */
    /* JADX WARN: Type inference failed for: r13v13, types: [java.util.List] */
    /* JADX WARN: Type inference failed for: r13v15 */
    /* JADX WARN: Type inference failed for: r13v16, types: [java.util.ArrayList] */
    /* JADX WARN: Type inference failed for: r13v17, types: [java.util.List] */
    /* JADX WARN: Type inference failed for: r13v18, types: [java.util.List] */
    @Override // xsna.izs
    public final Object invoke(Object obj) {
        ?? a;
        Object obj2;
        UserId userId;
        fhq0 c;
        AccountProfileType accountProfileType;
        UserId userId2;
        io.reactivex.rxjava3.internal.operators.observable.l2 a2;
        switch (this.b) {
            case 0:
                boolean booleanValue = ((Boolean) obj).booleanValue();
                vo20 vo20Var = (vo20) this.receiver;
                vo20Var.getClass();
                vo20Var.f.setImageResource(booleanValue ? R.drawable.vk_icon_voice_24 : R.drawable.vk_icon_microphone_slash_24);
                return s3q0.a;
            case 1:
                ((com.vk.im.ui.components.msg_list.c) this.receiver).i((Throwable) obj);
                return s3q0.a;
            case 2:
                ((qs40) this.receiver).T((fu40) obj);
                return s3q0.a;
            case 3:
                MusicPickerState musicPickerState = (MusicPickerState) obj;
                ((com.vk.newsfeed.posting.music_picker.presentation.model.a) this.receiver).getClass();
                MusicPickerList musicPickerList = (MusicPickerList) j5g.k0(musicPickerState.j);
                if (musicPickerList instanceof MusicPickerList.Tracks) {
                    a = com.vk.newsfeed.posting.music_picker.presentation.model.a.a(musicPickerState, ((MusicPickerList.Tracks) musicPickerList).d, musicPickerList);
                } else if (musicPickerList instanceof MusicPickerList.Playlists) {
                    MusicPickerList.Playlists playlists = (MusicPickerList.Playlists) musicPickerList;
                    List<Playlist> list = playlists.d;
                    List singletonList = (!playlists.h || playlists.c.length() <= 0) ? Collections.singletonList(new MusicPickerListItem.EmptyListItem(R.string.music_picker_empty_playlists_list)) : Collections.singletonList(new MusicPickerListItem.EmptyListItem(R.string.music_picker_empty_search_list));
                    List<Playlist> list2 = list.isEmpty() ? null : list;
                    if (list2 != null) {
                        List<Playlist> list3 = list2;
                        a = new ArrayList(c5g.u(list3, 10));
                        Iterator it = list3.iterator();
                        while (it.hasNext()) {
                            a.add(new MusicPickerListItem.MusicPlaylistItem((Playlist) it.next()));
                        }
                    } else {
                        a = singletonList;
                    }
                } else {
                    a = musicPickerList instanceof MusicPickerList.SelectedPlaylist ? com.vk.newsfeed.posting.music_picker.presentation.model.a.a(musicPickerState, ((MusicPickerList.SelectedPlaylist) musicPickerList).d, musicPickerList) : EmptyList.b;
                }
                return new wow(a);
            case 4:
                L.i((Throwable) obj);
                return s3q0.a;
            case 5:
                wcd0 wcd0Var = (wcd0) obj;
                ycd0 ycd0Var = (ycd0) this.receiver;
                qcy<Object>[] qcyVarArr = ycd0.m1;
                ycd0Var.getClass();
                if (!(wcd0Var instanceof wcd0.a)) {
                    throw new NoWhenBranchMatchedException();
                }
                ((izs) ycd0Var.j1.getValue(ycd0Var, ycd0.m1[1])).invoke(((wcd0.a) wcd0Var).a);
                ycd0Var.hide();
                return s3q0.a;
            case 6:
                ssf0 ssf0Var = (ssf0) obj;
                osf0 osf0Var = (osf0) this.receiver;
                Bundle bundle = osf0Var.p1;
                bpn0 bpn0Var = osf0Var.j1;
                bpn0 bpn0Var2 = osf0Var.n1;
                if (ssf0Var instanceof ssf0.b) {
                    bundle.putBoolean("arg_pin_code_changed", ((ssf0.b) ssf0Var).a);
                    osf0Var.tn();
                } else if (ssf0Var instanceof ssf0.c) {
                    bundle.putParcelable("arg_user_to_switch", (UserId) bpn0Var2.getValue());
                    osf0Var.dismiss();
                } else if (ssf0Var instanceof ssf0.d) {
                    String str = ((ssf0.d) ssf0Var).a;
                    usi0.a i = ((mui0) bpn0Var.getValue()).i();
                    usi0.a.b bVar = i instanceof usi0.a.b ? (usi0.a.b) i : null;
                    nsf0 feature = osf0Var.getFeature();
                    if (bVar == null || (userId2 = bVar.g) == null) {
                        userId2 = (UserId) bpn0Var2.getValue();
                    }
                    feature.getClass();
                    int i2 = 21;
                    ufx ufxVar = new ufx("multiaccount.checkRelatedUserPinCode", new cr(i2), new e630(1));
                    ufx.n(ufxVar, "pin", str, 0, 12);
                    bx2 e = e370.e(ufxVar);
                    e.p = userId2;
                    a2 = px2.a((r3 & 4) != 0 ? "" : "AuthGetExchangeLoginData", e, dgn0.c(), null, null);
                    int i3 = 22;
                    feature.e.b(hg1.h(new io.reactivex.rxjava3.internal.operators.observable.c0(a2.A0(8L, TimeUnit.SECONDS, null, io.reactivex.rxjava3.schedulers.a.b()), new rkz(new aj50(feature, 16), i3), io.reactivex.rxjava3.internal.functions.a.c).F(new bqs(new af50(feature, i2), i3)), new ut30(feature, 14)));
                } else if (ssf0Var instanceof ssf0.a) {
                    VkCheckEditText vkCheckEditText = osf0Var.o1;
                    VkCheckEditText vkCheckEditText2 = vkCheckEditText != null ? vkCheckEditText : null;
                    vkCheckEditText2.setText("");
                    vkCheckEditText2.setSelection(0);
                } else if (ssf0Var instanceof ssf0.e) {
                    mui0 mui0Var = (mui0) bpn0Var.getValue();
                    long j = ((UserId) bpn0Var2.getValue()).b;
                    Iterator it2 = mui0Var.e().iterator();
                    while (true) {
                        if (it2.hasNext()) {
                            obj2 = it2.next();
                            if (((usi0.a) obj2).c().a.b == j) {
                            }
                        } else {
                            obj2 = null;
                        }
                    }
                    usi0.a aVar = (usi0.a) obj2;
                    if (aVar == null || (c = aVar.c()) == null || (accountProfileType = c.b) == null || accountProfileType != AccountProfileType.NORMAL) {
                        usi0.a i4 = ((mui0) bpn0Var.getValue()).i();
                        usi0.a.b bVar2 = i4 instanceof usi0.a.b ? (usi0.a.b) i4 : null;
                        if (bVar2 == null || (userId = bVar2.g) == null) {
                            userId = (UserId) bpn0Var2.getValue();
                        }
                    } else {
                        userId = (UserId) bpn0Var2.getValue();
                    }
                    ((com.vk.superapp.multiaccount.api.e) osf0Var.k1.getValue()).c(osf0Var.requireContext(), userId, new PinCodeAnalyticsParams(((ssf0.e) ssf0Var).a));
                } else {
                    if (!(ssf0Var instanceof ssf0.f)) {
                        throw new NoWhenBranchMatchedException();
                    }
                    VkCheckEditText vkCheckEditText3 = osf0Var.o1;
                    (vkCheckEditText3 != null ? vkCheckEditText3 : null).postDelayed(new sx3(osf0Var, 11), 150L);
                }
                return s3q0.a;
            case 7:
                ((eph0) this.receiver).T((nph0) obj);
                return s3q0.a;
            default:
                ((i6q0) this.receiver).getClass();
                if (epx.f(((nhp0) obj).a(), "STORY".toLowerCase(Locale.ROOT))) {
                    return ysa0.a;
                }
                return null;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public yo20(Object obj, int i) {
        super(1, obj, com.vk.im.ui.components.msg_list.c.class, "handleError", "handleError(Ljava/lang/Throwable;)V", 0);
        this.b = i;
        switch (i) {
            case 3:
                super(1, obj, com.vk.newsfeed.posting.music_picker.presentation.model.a.class, "mapItems", "mapItems-m4snZxA(Lcom/vk/newsfeed/posting/music_picker/domain/model/MusicPickerState;)Ljava/util/List;", 0);
                break;
            case 4:
                super(1, obj, L.class, Logger.METHOD_E, "e(Ljava/lang/Throwable;)V", 0);
                break;
            default:
                break;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public yo20(i6q0 i6q0Var) {
        super(1, i6q0Var, i6q0.class, "getModalControllerProvider", "getModalControllerProvider(Lcom/vk/network/kbh/TrackedScreen;)Lcom/vk/network/kbh/config/UnstableNetworkModalController;", 0);
        this.b = 8;
    }
}
