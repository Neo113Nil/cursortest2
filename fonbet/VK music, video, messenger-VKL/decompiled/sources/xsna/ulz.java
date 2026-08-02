package xsna;

import android.view.View;
import android.view.ViewGroup;
import com.vk.api.generated.audio.dto.AudioAudioDto;
import com.vk.api.generated.base.dto.BaseBoolIntDto;
import com.vk.api.generated.ecosystem.dto.EcosystemSendOtpResponseDto;
import com.vk.catalog2.common.dto.ui.UIBlockList;
import com.vk.dto.attaches.Attach;
import com.vk.dto.attaches.AttachWidget;
import com.vk.dto.common.id.UserId;
import com.vk.log.L;
import com.vk.newsfeed.posting.impl.domain.model.PostingState;
import com.vk.profile.questions.impl.QuestionsListFragment;
import com.vkontakte.android.R;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import xsna.dmz;
import xsna.dug0;
import xsna.sqc0;
import xsna.uhg0;
import xsna.ywi0;

/* compiled from: R8$$SyntheticClass */
/* loaded from: classes3.dex */
public final /* synthetic */ class ulz implements izs {
    public final /* synthetic */ int b;

    public /* synthetic */ ulz(int i) {
        this.b = i;
    }

    @Override // xsna.izs
    public final Object invoke(Object obj) {
        switch (this.b) {
            case 0:
                return dmz.b.a;
            case 1:
                return Boolean.valueOf(((BaseBoolIntDto) obj) == BaseBoolIntDto.YES);
            case 2:
                return bn00.a((EcosystemSendOtpResponseDto) obj);
            case 3:
                return new juj(1);
            case 4:
                return Boolean.valueOf(((dug0.c) obj).c());
            case 5:
                List list = (List) obj;
                ArrayList arrayList = new ArrayList(c5g.u(list, 10));
                Iterator it = list.iterator();
                while (it.hasNext()) {
                    arrayList.add(oc4.d((AudioAudioDto) it.next()));
                }
                return arrayList;
            case 6:
                return Boolean.valueOf(((Attach) obj) instanceof AttachWidget);
            case 7:
                return ((UIBlockList) obj).y;
            case 8:
                qgi0.r((tgi0) obj, "downloads_settings_remove_all_dialog_accept_btn");
                return s3q0.a;
            case 9:
                cvk.u(R.string.common_network_error, false);
                return s3q0.a;
            case 10:
                return Boolean.valueOf(((View) obj).getId() == R.id.music_player);
            case 11:
                return Boolean.valueOf(fkq0.c((UserId) obj));
            case 12:
                j03.l((Throwable) obj);
                return s3q0.a;
            case 13:
                L.i((Throwable) obj);
                return s3q0.a;
            case 14:
                com.vk.metrics.eventtracking.b.a.a(new IllegalArgumentException("Can not save posting draft", (Throwable) obj));
                return s3q0.a;
            case 15:
                return ((PostingState.Editing) obj).i.c;
            case 16:
                sqc0 sqc0Var = (sqc0) obj;
                if (sqc0Var instanceof sqc0.c) {
                    return ((sqc0.c) sqc0Var).b;
                }
                return null;
            case 17:
                return ((rdd0) obj).c;
            case 18:
                return ((upd0) obj).a.s;
            case 19:
                return Float.valueOf(((hfk) obj).getX1());
            case 20:
                int i = QuestionsListFragment.f0;
                qgi0.r((tgi0) obj, "toolbar");
                return s3q0.a;
            case 21:
                return s3q0.a;
            case 22:
                return uhg0.d.a;
            case 23:
                return epx.f(obj, 0) ? new gno0(8589934592L) : epx.f(obj, 1) ? new gno0(4294967296L) : new gno0(0L);
            case 24:
                return s3q0.a;
            case 25:
                return ((uki0) obj).iterator();
            case 26:
                return ywi0.c.a;
            case 27:
                return rsg0.y0(new z0r0((List) obj, new String[]{"sex,first_name", "last_name", "photo_base", "is_friend", eok.ONLINE_EXTRAS_KEY, "online_mobile", "online_app", "online_vk_mobile"}), null, null, 3);
            case 28:
                ViewGroup viewGroup = (ViewGroup) obj;
                int i2 = wgk0.l;
                return new wgk0(s3j0.b(viewGroup, R.layout.vkim_space_view_holder, viewGroup, false));
            default:
                Throwable th = (Throwable) obj;
                L.i(th);
                h03.b(th);
                return s3q0.a;
        }
    }
}
