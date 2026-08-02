package xsna;

import android.content.Context;
import com.vk.api.generated.docs.dto.DocsGetResponseDto;
import com.vk.clips.playlists.ClipsPlaylistsFolderLaunchParams;
import com.vk.dto.common.Peer;
import com.vk.dto.music.Artist;
import com.vk.im.engine.models.dialogs.DialogExt;
import com.vk.im.engine.models.dialogs.DialogMember;
import com.vk.im.engine.models.dialogs.DialogsCounters;
import com.vk.im.ui.views.dialog_actions.DialogActionsListView;
import com.vk.log.L;
import com.vk.toggle.internal.a;
import com.vk.voip.ui.VoipViewModelState;
import com.vk.voip.ui.broadcast.fragments.config.BroadcastConfigFragment;
import com.vkontakte.android.R;
import java.util.Collection;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Optional;
import xsna.aue;
import xsna.cce;
import xsna.r2j;
import xsna.tj50;
import xsna.wgb;
import xsna.wwh;
import xsna.ybe;

/* compiled from: R8$$SyntheticClass */
/* loaded from: classes18.dex */
public final /* synthetic */ class y40 implements izs {
    public final /* synthetic */ int b;

    public /* synthetic */ y40(int i) {
        this.b = i;
    }

    @Override // xsna.izs
    public final Object invoke(Object obj) {
        List O0;
        int i = 0;
        switch (this.b) {
            case 0:
                return s3q0.a;
            case 1:
                L.C("vk", (Throwable) obj);
                return s3q0.a;
            case 2:
                Collection<adm> collection = ((t480) obj).b;
                if (!(collection instanceof Collection) || !collection.isEmpty()) {
                    Iterator<T> it = collection.iterator();
                    while (it.hasNext()) {
                        DialogsCounters.Type type = ((adm) it.next()).a;
                        if (type != DialogsCounters.Type.ARCHIVE_UNREAD && type != DialogsCounters.Type.ARCHIVE_MENTIONS && type != DialogsCounters.Type.ARCHIVE_UNREAD_UNMUTED) {
                        }
                        return Boolean.valueOf(r2);
                        break;
                    }
                }
                r2 = false;
                return Boolean.valueOf(r2);
            case 3:
                return ((Artist) obj).c;
            case 4:
                return Boolean.valueOf(((DialogExt) obj).Cb() != null);
            case 5:
                return fwx0.c().a((CharSequence) obj);
            case 6:
                return (com.vk.ecomm.onlinebooking.impl.main.presentation.mvi2.d) obj;
            case 7:
                int i2 = BroadcastConfigFragment.U;
                return Boolean.valueOf(((VoipViewModelState) obj).h());
            case 8:
                L.f("DebugMenuFeature", "ui options error", (Throwable) obj);
                return s3q0.a;
            case 9:
                return Boolean.valueOf(((wgb.b) obj).e);
            case 10:
                bdb bdbVar = (bdb) obj;
                return Boolean.valueOf((bdbVar.l || bdbVar.m) ? false : true);
            case 11:
                return ((com.vk.movika.sdk.base.model.g) obj).f;
            case 12:
                return ((ixw) obj).d;
            case 13:
                return null;
            case 14:
                return io.reactivex.rxjava3.internal.operators.maybe.i.b;
            case 15:
                ybe.a aVar = (ybe.a) obj;
                yae yaeVar = aVar.d;
                return yaeVar != null ? new cce.f.b(yaeVar.a, aVar.k) : cce.f.a.a;
            case 16:
                L.i((Throwable) obj);
                return s3q0.a;
            case 17:
                return Boolean.valueOf(((aue.b) obj).b instanceof ClipsPlaylistsFolderLaunchParams.FoldersLaunchType.Reorder);
            case 18:
                return s3q0.a;
            case 19:
                return wwh.c.a;
            case 20:
                h03.b((Throwable) obj);
                return s3q0.a;
            case 21:
                co1.c((nvy) obj, new ir1(e43.l(new foi0(0, "Album0", null), new foi0(1, "Album1", null), new foi0(2, "Album2", "https://sun9-62.userapi.com/z4_z-ls5mVpMw1edyggl4gz6RoItDjH0pGxbyg/FII3YzuW73Y.jpg")), true, 42, true, false), new rl2(15), false);
                return s3q0.a;
            case 22:
                ((uzh0) obj).n();
                return s3q0.a;
            case 23:
                return new r2j.f(((tj50.a) obj).a(new zj(22), ao8.d));
            case 24:
                return s3q0.a;
            case 25:
                LinkedHashMap linkedHashMap = DialogActionsListView.j;
                return ((Context) obj).getString(R.string.vkim_msg_header_menu_call_with_audio);
            case 26:
                zk70.e((Throwable) obj);
                return s3q0.a;
            case 27:
                return Optional.of((DocsGetResponseDto) obj);
            case 28:
                ohm ohmVar = ((dem) obj).a.b;
                if (ohmVar == null || (O0 = j5g.O0(ohmVar.b)) == null) {
                    return null;
                }
                List list = O0;
                if (!(list instanceof Collection) || !list.isEmpty()) {
                    Iterator it2 = list.iterator();
                    while (it2.hasNext()) {
                        Peer peer = ((DialogMember) it2.next()).b;
                        peer.getClass();
                        if (peer.Ab(Peer.Type.USER) && (i = i + 1) < 0) {
                            e43.s();
                            throw null;
                        }
                    }
                }
                return Integer.valueOf(i);
            default:
                return Boolean.valueOf(((com.vk.toggle.internal.a) obj) instanceof a.c);
        }
    }
}
