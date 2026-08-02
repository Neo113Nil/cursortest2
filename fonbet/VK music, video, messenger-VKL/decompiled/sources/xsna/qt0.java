package xsna;

import android.content.Context;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import com.vk.api.generated.audio.dto.AudioAudioRawIdTrackedDto;
import com.vk.api.generated.audio.dto.AudioGetIdsBySourceResponseDto;
import com.vk.api.generated.base.dto.BaseOkResponseDto;
import com.vk.api.generated.users.dto.UsersUserFullDto;
import com.vk.api.generated.wall.dto.WallLastPostingInfoExtendedResponseDto;
import com.vk.clips.sdk.shared.api.deps.video.SdkVideoFile;
import com.vk.core.view.BottomConfirmButton;
import com.vk.dto.common.Peer;
import com.vk.feed.design.view.newsfeed.avatar_stack.AvatarAnimatedStack;
import com.vk.im.ui.views.dialog_actions.DialogActionsListView;
import com.vk.log.L;
import com.vkontakte.android.R;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import xsna.e0j;
import xsna.oj8;
import xsna.tj50;
import xsna.vl7;
import xsna.wl7;
import xsna.x900;

/* compiled from: R8$$SyntheticClass */
/* loaded from: classes4.dex */
public final /* synthetic */ class qt0 implements izs {
    public final /* synthetic */ int b;

    public /* synthetic */ qt0(int i) {
        this.b = i;
    }

    @Override // xsna.izs
    public final Object invoke(Object obj) {
        switch (this.b) {
            case 0:
                return ((WallLastPostingInfoExtendedResponseDto) obj).d();
            case 1:
                qgi0.r((tgi0) obj, "AlbumItemTags.CHECKBOX");
                return s3q0.a;
            case 2:
                List<AudioAudioRawIdTrackedDto> d = ((AudioGetIdsBySourceResponseDto) obj).d();
                if (d != null) {
                    List<AudioAudioRawIdTrackedDto> list = d;
                    ArrayList arrayList = new ArrayList(c5g.u(list, 10));
                    Iterator<T> it = list.iterator();
                    while (it.hasNext()) {
                        arrayList.add(((AudioAudioRawIdTrackedDto) it.next()).d());
                    }
                    List x = rdi.x(arrayList);
                    if (x != null) {
                        return io.reactivex.rxjava3.core.x.k(x);
                    }
                }
                return io.reactivex.rxjava3.core.x.i(new RuntimeException("No audio ids received"));
            case 3:
                return ((eag0) obj).b.a;
            case 4:
                L.i((Throwable) obj);
                return s3q0.a;
            case 5:
                L.j((Throwable) obj, "[Blockstore] get ETs error");
                return s3q0.a;
            case 6:
                int i = BottomConfirmButton.n;
                return Boolean.TRUE;
            case 7:
                return Boolean.valueOf(((it80) obj).a != 0);
            case 8:
                return new oj8.b(((tj50.a) obj).e(yi8.b));
            case 9:
                return Integer.valueOf(((cka) obj).b);
            case 10:
                bdb bdbVar = (bdb) obj;
                return bdb.a(bdbVar, 0, 0, bdbVar.d, 0, bdbVar.f, 0, null, null, null, false, false, null, null, 0, null, null, null, null, null, null, null, null, null, false, false, -41, 7);
            case 11:
                return s3q0.a;
            case 12:
                qgi0.r((tgi0) obj, "checkout_form_field_caption");
                return s3q0.a;
            case 13:
                return (UsersUserFullDto) j5g.Y((List) obj);
            case 14:
                ((TextView) obj).setTextSize(11.0f);
                return s3q0.a;
            case 15:
                return Float.valueOf(sa30.E(((Float) obj).floatValue(), new k9x(0, 100, 1), new k9x(-1, 1, 1)));
            case 16:
                return s3q0.a;
            case 17:
                h03.b((Throwable) obj);
                return s3q0.a;
            case 18:
                View findViewById = ((View) obj).findViewById(R.id.content);
                if (findViewById != null) {
                    f4m.y(0, findViewById);
                }
                return s3q0.a;
            case 19:
                return ((ztg) obj).f;
            case 20:
                return e0j.b.a;
            case 21:
                wl7 wl7Var = new wl7(R.layout.vk_pay_checkout_bonuses_actions_list_item, (ViewGroup) obj);
                xl7 xl7Var = new xl7();
                RecyclerView recyclerView = (RecyclerView) wl7Var.itemView.findViewById(R.id.vk_pay_checkout_bonuses_action_selection_recyclerview);
                wl7.a aVar = new wl7.a();
                aVar.x0(vl7.b.class, new wd3(3, xl7Var, wl7Var));
                aVar.x0(vl7.a.class, new g22(2, xl7Var, wl7Var));
                wl7Var.l = aVar;
                wl7Var.m = new jtj0(aVar);
                wl7Var.itemView.getContext();
                recyclerView.setLayoutManager(new LinearLayoutManager());
                recyclerView.setAdapter(aVar);
                return wl7Var;
            case 22:
                LinkedHashMap linkedHashMap = DialogActionsListView.j;
                return e3m.e(R.attr.im_ic_show_attaches, (Context) obj);
            case 23:
                Peer peer = (Peer) obj;
                StringBuilder sb = new StringBuilder("(");
                sb.append(peer.c.h());
                sb.append(", ");
                return vu5.a(')', peer.d, sb);
            case 24:
                return v900.c((v900) obj, x900.c.a);
            case 25:
                p870 f = p870.f();
                s3q0 s3q0Var = s3q0.a;
                f.e(1200, s3q0Var);
                return s3q0Var;
            case 26:
                AvatarAnimatedStack avatarAnimatedStack = new AvatarAnimatedStack((Context) obj, null, 6);
                avatarAnimatedStack.setText(null);
                avatarAnimatedStack.a("https://vk.ru/reaction/3-reactions-0?c_uniq_tag=c0390bed2f5fe4bef86e18a800618094e818e47ec5210c33d15d298e27829c5e", e43.l("https://sun9-56.userapi.com/s/v1/ig2/cqW3O-sLWt9GB7fe8QspKJrGQGL_xgqZpw3bGkXTBgIxC8TBMVV7oggz7M4Ui7YnnQKiHTHMuamC3cONaMu_POMV.jpg?quality=95&as=32x24,48x36,72x54,108x81,160x120,240x180,360x270,480x360,540x405,640x480,720x540,800x600&from=bu&u=KCYXtnqDaHJ8JdBSHVrMQK4qMANCAxnpn7IXNr7YYYY&cs=800x0", "https://sun9-11.userapi.com/s/v1/ig2/8ASAJV_87mlTav5DoI-KU1OkK-2oZxOtJ062kVx7F3JElLG8Jj6M1TxCp5W9wlQngPZ9eU2Qfsc2rpxECzJU4jMD.jpg?quality=95&as=32x32,48x48,72x72,108x108,160x160,240x240,360x360,480x480,540x540,640x640,720x720,1080x1080&from=bu&u=piXpizO0HgNnhrf-R793MglftMbsHbMgi3HSaAXZ7j0&cs=1080x0"));
                return avatarAnimatedStack;
            case 27:
                List list2 = (List) obj;
                if (list2.isEmpty()) {
                    return io.reactivex.rxjava3.internal.operators.maybe.i.b;
                }
                HashSet hashSet = new HashSet();
                ArrayList arrayList2 = new ArrayList();
                for (Object obj2 : list2) {
                    if (hashSet.add(((SdkVideoFile) obj2).r1())) {
                        arrayList2.add(obj2);
                    }
                }
                return io.reactivex.rxjava3.core.k.i(arrayList2);
            case 28:
                qgi0.r((tgi0) obj, "friends_toolbar_title_test_tag");
                return s3q0.a;
            default:
                return Boolean.valueOf(((BaseOkResponseDto) obj) == BaseOkResponseDto.OK);
        }
    }

    public /* synthetic */ qt0(BottomConfirmButton.a aVar) {
        this.b = 6;
    }
}
