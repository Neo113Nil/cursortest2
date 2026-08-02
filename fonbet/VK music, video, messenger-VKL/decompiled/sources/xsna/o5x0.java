package xsna;

import com.vk.api.generated.base.dto.BaseImageDto;
import com.vk.api.generated.messages.dto.MessagesGetCallParticipantsResponseDto;
import com.vk.api.generated.users.dto.UsersUserFullDto;
import com.vk.dto.common.id.UserId;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import xsna.or2;

/* compiled from: VoipVmojiAvatarResolver.kt */
/* loaded from: classes7.dex */
public final class o5x0 implements b6w0 {
    public final yh a;
    public final lz0 b;
    public final com.vk.movika.sdk.android.defaultplayer.view.timeline.a c;
    public final h9 d;
    public final vg20 e = new vg20();

    public o5x0(yh yhVar, lz0 lz0Var, com.vk.movika.sdk.android.defaultplayer.view.timeline.a aVar, h9 h9Var) {
        this.a = yhVar;
        this.b = lz0Var;
        this.c = aVar;
        this.d = h9Var;
    }

    @Override // xsna.b6w0
    public final Map<UserId, x5w0> a(Collection<UserId> collection) {
        List<UsersUserFullDto> g;
        String i;
        String str;
        Map<UserId, x5w0> map = jgp.b;
        if (!collection.isEmpty()) {
            xdw0 xdw0Var = (xdw0) this.a.c;
            vg20 vg20Var = this.e;
            String str2 = ((or2.a.InterfaceC3466a) this.c.c).b().b;
            Collection<UserId> collection2 = collection;
            ArrayList arrayList = new ArrayList(c5g.u(collection2, 10));
            Iterator<T> it = collection2.iterator();
            while (it.hasNext()) {
                arrayList.add(new UserId(((UserId) it.next()).b));
            }
            dz2 x = yfb.x(sg20.e(vg20Var, str2, null, arrayList, Collections.singletonList("animated_avatar"), xdw0Var != null ? xdw0Var.g : null, (xdw0Var == null || (str = xdw0Var.b) == null) ? null : arm0.n(str), 74));
            if (xdw0Var != null) {
                x.h = true;
                x.d = true;
                x.c = true;
            } else {
                zdw0.a(x, this.d);
            }
            x.q = 0;
            x.n = false;
            MessagesGetCallParticipantsResponseDto messagesGetCallParticipantsResponseDto = (MessagesGetCallParticipantsResponseDto) x.u(0L);
            if (messagesGetCallParticipantsResponseDto != null && (i = messagesGetCallParticipantsResponseDto.i()) != null) {
                this.b.invoke(i);
            }
            if (messagesGetCallParticipantsResponseDto != null && (g = messagesGetCallParticipantsResponseDto.g()) != null) {
                map = new LinkedHashMap<>();
                for (UsersUserFullDto usersUserFullDto : g) {
                    BaseImageDto g2 = usersUserFullDto.g();
                    if (g2 != null) {
                        map.put(usersUserFullDto.s1(), new x5w0(g2.getUrl(), g2.getWidth(), g2.getHeight()));
                    }
                }
            }
        }
        return map;
    }
}
