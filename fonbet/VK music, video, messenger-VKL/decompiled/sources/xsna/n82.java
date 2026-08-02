package xsna;

import android.content.Context;
import android.view.TextureView;
import com.vk.api.generated.channels.dto.ChannelsChannelDto;
import com.vk.api.generated.channels.dto.ChannelsChannelWithLastMessageDto;
import com.vk.api.generated.channels.dto.ChannelsCreateResponseDto;
import com.vk.clips.coauthors.selector.presentation.state.ClipsCoauthorsSelectorMviState;
import com.vk.dto.common.id.UserId;
import com.vk.dto.music.Artist;
import com.vk.dto.music.MusicTrack;
import com.vk.dto.music.Thumb;
import com.vk.friends.recommendations.impl.presentation.FriendsImportFragment;
import com.vk.importcontacts.impl.presentation.details.fragment.ImportContactsDetailsFragment;
import com.vk.music.player.PlayerTrack;
import com.vk.video.ui.upload.impl.attachedclips.presentation.feature.entity.AttachedClipsState;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import java.util.NoSuchElementException;
import java.util.concurrent.TimeUnit;
import org.json.JSONObject;
import ru.ok.android.api.core.ApiInvocationException;
import xsna.b230;
import xsna.e9k0;
import xsna.gfp0;
import xsna.go20;
import xsna.iqq;
import xsna.m0x;
import xsna.obz;
import xsna.pqc;
import xsna.r7q0;

/* compiled from: R8$$SyntheticClass */
/* loaded from: classes11.dex */
public final /* synthetic */ class n82 implements izs {
    public final /* synthetic */ int b;

    public /* synthetic */ n82(int i) {
        this.b = i;
    }

    @Override // xsna.izs
    public final Object invoke(Object obj) {
        ChannelsChannelWithLastMessageDto channelsChannelWithLastMessageDto;
        ChannelsChannelDto d;
        boolean z = true;
        UserId userId = null;
        switch (this.b) {
            case 0:
                return new TextureView((Context) obj);
            case 1:
                List<lhk0> list = ((fw2) obj).b;
                if (!(list instanceof Collection) || !list.isEmpty()) {
                    Iterator<T> it = list.iterator();
                    while (it.hasNext()) {
                        if (((lhk0) it.next()).b) {
                            return Boolean.valueOf(z);
                        }
                    }
                }
                z = false;
                return Boolean.valueOf(z);
            case 2:
                ((r7q0.a) obj).getClass();
                return Boolean.TRUE;
            case 3:
                tdu tduVar = (tdu) obj;
                tduVar.A(1.2f);
                tduVar.B(1.2f);
                return s3q0.a;
            case 4:
                return AttachedClipsState.a((AttachedClipsState) obj, null, null, null, null, null, false, false, false, false, e9k0.d.a, ApiInvocationException.ErrorCodes.IDS_BLOCKED);
            case 5:
                PlayerTrack playerTrack = ((sy40) obj).d;
                if (playerTrack == null) {
                    return gfp0.a.g;
                }
                String str = playerTrack.f;
                Thumb Jb = playerTrack.b.Jb();
                if (Jb == null) {
                    Jb = lso0.a;
                }
                MusicTrack musicTrack = playerTrack.b;
                String str2 = musicTrack.d;
                String str3 = "";
                if (str2 == null) {
                    str2 = "";
                }
                ucp ucpVar = ucp.a;
                StringBuilder sb = new StringBuilder();
                List<Artist> list2 = musicTrack.t;
                if (list2 != null) {
                    str3 = s490.i(list2);
                } else {
                    String str4 = musicTrack.h;
                    if (str4 != null) {
                        str3 = str4;
                    }
                }
                sb.append(str3);
                sb.append(' ');
                sb.append(s490.c(musicTrack.u));
                return new gfp0.a(str, Jb, str2, ucp.i(drm0.p0(sb.toString()).toString()).toString(), playerTrack.b.Lb(), jnj.d(playerTrack.b.V));
            case 6:
                h03.b((Throwable) obj);
                return s3q0.a;
            case 7:
                return ((com.vk.upload.impl.b) obj).s();
            case 8:
                return Long.valueOf(((bdb) obj).b);
            case 9:
                w2c w2cVar = (w2c) obj;
                return new x25(w2cVar.a, w2cVar.b);
            case 10:
                return new pqc.a.c((hda) obj);
            case 11:
                return fnd.a(((ClipsCoauthorsSelectorMviState.c) obj).c.size());
            case 12:
                return Boolean.valueOf(!((wah) obj).f.isEmpty());
            case 13:
                return s3q0.a;
            case 14:
                qgi0.r((tgi0) obj, "community_top_bar_manage_icon");
                return s3q0.a;
            case 15:
                c9k c9kVar = (c9k) obj;
                String str5 = c9kVar.d;
                y9k i = x8k.i(c9kVar.e);
                Integer num = c9kVar.f;
                return new x9k(str5, (num == null || num.intValue() <= 0) ? 2500 : num.intValue(), i);
            case 16:
                int i2 = com.vk.profile.questions.impl.b.q1;
                qgi0.r((tgi0) obj, "create_question_avatar");
                return s3q0.a;
            case 17:
                qgi0.g((tgi0) obj);
                return s3q0.a;
            case 18:
                h6n0 h6n0Var = (h6n0) obj;
                return io.reactivex.rxjava3.core.q.T(h6n0Var).A(h6n0Var.a.c ? 0L : 400L, TimeUnit.MILLISECONDS);
            case 19:
                List<ChannelsChannelWithLastMessageDto> d2 = ((ChannelsCreateResponseDto) obj).d();
                if (d2 != null && (channelsChannelWithLastMessageDto = (ChannelsChannelWithLastMessageDto) j5g.a0(d2)) != null && (d = channelsChannelWithLastMessageDto.d()) != null) {
                    userId = d.d();
                }
                return userId != null ? io.reactivex.rxjava3.core.x.k(userId) : io.reactivex.rxjava3.core.x.i(new NoSuchElementException("channelId is null"));
            case 20:
                int i3 = FriendsImportFragment.a0;
                return drm0.p0(((pno0) obj).d()).toString();
            case 21:
                return iqq.a.a(((JSONObject) obj).getJSONObject("response"));
            case 22:
                return Float.valueOf(((com.vk.photo.editor.features.colorgrading.a) obj).j.m);
            case 23:
                int i4 = ImportContactsDetailsFragment.O;
                return s3q0.a;
            case 24:
                return ((m0x.a) obj).b;
            case 25:
                return s3q0.a;
            case 26:
                obz obzVar = (obz) obj;
                if (!(obzVar instanceof obz.a)) {
                    return null;
                }
                obz.a aVar = (obz.a) obzVar;
                afu0 afu0Var = aVar.b;
                int i5 = afu0Var.a;
                List<xeu0> list3 = afu0Var.b;
                ArrayList arrayList = new ArrayList(c5g.u(list3, 10));
                for (xeu0 xeu0Var : list3) {
                    arrayList.add(new iar0(xeu0Var.b, xeu0Var.c, xeu0Var.d, xeu0Var.a, xeu0Var.e));
                }
                return new wbz(arrayList, i5, aVar.c, aVar.d);
            case 27:
                ((zak0) go20.u).setValue((go20.a) obj);
                return s3q0.a;
            case 28:
                return b230.c.a;
            default:
                com.vk.im.ui.components.viewcontrollers.msg_list.adapter.model.c E0 = ((com.vk.im.ui.components.viewcontrollers.msg_list.adapter.model.g) obj).E0();
                if (E0 != null) {
                    return Integer.valueOf(E0.b);
                }
                return null;
        }
    }

    public /* synthetic */ n82(Object obj, int i) {
        this.b = i;
    }
}
