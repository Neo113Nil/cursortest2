package xsna;

import com.vk.music.player.PlayerMode;
import com.vk.stat.scheme.CommonAudioStat$TypeAudioPlayerUiClickItem;
import com.vk.stat.scheme.CommonAudioStat$TypeAudioUiNavigationItem;
import com.vk.stat.scheme.MobileOfficialAppsCoreNavStat$EventScreen;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.NoWhenBranchMatchedException;
import xsna.br3;
import xsna.ir3;
import xsna.k840;
import xsna.nr3;

/* compiled from: ArtistListBottomSheetFeature.kt */
/* loaded from: classes3.dex */
public final class hr3 extends wk50<mr3, lr3, br3, ir3> {
    public final com.vk.channels.impl.channel_screen.send_msg.c f;
    public final String g;
    public final x2b0 h;
    public final u750 i;
    public final f4z j;

    public hr3(kr3 kr3Var, com.vk.channels.impl.channel_screen.send_msg.c cVar, String str, x2b0 x2b0Var) {
        super(br3.b.b, kr3Var);
        this.f = cVar;
        this.g = str;
        this.h = x2b0Var;
        s750 s750Var = k840.a.e;
        this.i = s750Var == null ? null : s750Var;
        this.j = new f4z();
    }

    @Override // xsna.wk50
    public final void N(lr3 lr3Var, br3 br3Var) {
        lr3 lr3Var2 = lr3Var;
        br3 br3Var2 = br3Var;
        if (!br3Var2.equals(br3.b.b)) {
            boolean z = br3Var2 instanceof br3.c;
            f4z f4zVar = this.j;
            if (!z) {
                if (!br3Var2.equals(br3.a.b)) {
                    throw new NoWhenBranchMatchedException();
                }
                f4zVar.b(nr3.a.a);
                return;
            } else {
                f4zVar.b(new nr3.b(((br3.c) br3Var2).b));
                this.i.k0(CommonAudioStat$TypeAudioPlayerUiClickItem.EventType.TAP_GOTO_ARTIST_SEVERAL, PlayerMode.AUDIO);
                this.h.a(MobileOfficialAppsCoreNavStat$EventScreen.MUSIC_PLAYER_CONTROLS, CommonAudioStat$TypeAudioUiNavigationItem.EventType.TAP_GOTO, (r3 & 4) == 0);
                return;
            }
        }
        T(ir3.b.b);
        List<yq3> list = lr3Var2.b;
        ArrayList arrayList = new ArrayList(c5g.u(list, 10));
        Iterator<T> it = list.iterator();
        while (it.hasNext()) {
            arrayList.add(((yq3) it.next()).a);
        }
        com.vk.channels.impl.channel_screen.send_msg.c cVar = this.f;
        ((ix4) cVar.b).getClass();
        tfx tfxVar = new tfx("audio.getArtistsById", new ao(4), new bo(7));
        tfxVar.i("artist_ids", arrayList);
        String str = this.g;
        if (str != null) {
            tfx.o(tfxVar, "ref", str, 0, 0, 12);
        }
        this.e.b(rsg0.w0(yfb.x(tfxVar)).l(new ux0(new udo(cVar, 11), 28)).subscribe(new b60(new gr3(this, 0), 2), new c60(new sf1(this, 4), 2)));
    }
}
