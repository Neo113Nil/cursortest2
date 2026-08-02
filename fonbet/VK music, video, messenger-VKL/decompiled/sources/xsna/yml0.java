package xsna;

import android.view.ViewGroup;
import com.vk.api.generated.friends.dto.FriendsAddResponseDto;
import com.vk.dto.stickers.AnimatedStickerInfo;
import com.vk.im.ui.components.theme_chooser.ThemeChooserState;
import com.vk.profile.design.view.profileheader.UserProfileBaseInfoView;
import com.vk.video.ui.discovery.minimizable.q;
import com.vk.video.ui.discovery.minimizable.s;
import com.vk.vmoji.character.model.RecommendationsBlockModel;
import com.vkontakte.android.R;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Optional;
import java.util.RandomAccess;
import xsna.taw0;

/* compiled from: R8$$SyntheticClass */
/* loaded from: classes18.dex */
public final /* synthetic */ class yml0 implements izs {
    public final /* synthetic */ int b;

    public /* synthetic */ yml0(int i) {
        this.b = i;
    }

    @Override // xsna.izs
    public final Object invoke(Object obj) {
        r1 = false;
        boolean z = false;
        r1 = false;
        r1 = false;
        r1 = false;
        boolean z2 = false;
        switch (this.b) {
            case 0:
                return mol0.a((mol0) obj, null, null, null, null, new ggr(null, null, null, null, null, 127), null, 207);
            case 1:
                qgi0.r((tgi0) obj, "template_title");
                return s3q0.a;
            case 2:
                return ThemeChooserState.a((ThemeChooserState) obj, ThemeChooserState.ListKind.COLOR, null, null, null, false, null, null, null, 254);
            case 3:
                qcy<Object>[] qcyVarArr = qgi0.a;
                sgi0<s3q0> sgi0Var = ngi0.e;
                s3q0 s3q0Var = s3q0.a;
                ((tgi0) obj).a(sgi0Var, s3q0Var);
                return s3q0Var;
            case 4:
                return Float.valueOf(((vkr0) obj).c);
            case 5:
                int i = UserProfileBaseInfoView.p;
                return s3q0.a;
            case 6:
                HashMap<String, AnimatedStickerInfo> hashMap = c7r0.g;
                List<AnimatedStickerInfo> list = (List) obj;
                if (list instanceof RandomAccess) {
                    List list2 = list;
                    int size = list2.size();
                    for (int i2 = 0; i2 < size; i2++) {
                        AnimatedStickerInfo animatedStickerInfo = (AnimatedStickerInfo) list2.get(i2);
                        hashMap.put(animatedStickerInfo.b, animatedStickerInfo);
                    }
                } else {
                    for (AnimatedStickerInfo animatedStickerInfo2 : list) {
                        hashMap.put(animatedStickerInfo2.b, animatedStickerInfo2);
                    }
                }
                return s3q0.a;
            case 7:
                return Integer.valueOf(((atp) obj).c);
            case 8:
                q.b bVar = (q.b) obj;
                boolean z3 = bVar.b;
                boolean z4 = bVar.f;
                boolean z5 = !z4;
                if (!z3 && bVar.a && !z4 && bVar.h) {
                    z2 = true;
                }
                return new s.b(z3, z5, z2);
            case 9:
                return Optional.ofNullable(null);
            case 10:
                FriendsAddResponseDto friendsAddResponseDto = (FriendsAddResponseDto) obj;
                return (friendsAddResponseDto == FriendsAddResponseDto.SEND || friendsAddResponseDto == FriendsAddResponseDto.APPROVED) ? io.reactivex.rxjava3.internal.operators.completable.i.b : io.reactivex.rxjava3.core.a.k(new IllegalStateException("User subscribe failed"));
            case 11:
                Integer num = (Integer) obj;
                if (num != null && num.intValue() == 5) {
                    z = true;
                }
                return Boolean.valueOf(z);
            case 12:
                Map.Entry entry = (Map.Entry) obj;
                return ((String) entry.getKey()) + ':' + ((Number) entry.getValue()).longValue();
            case 13:
                return s3q0.a;
            case 14:
                return new taw0.b.C3735b((RecommendationsBlockModel) obj);
            default:
                return new mww0(R.layout.voip_schedule_call_edit_tip_item, (ViewGroup) obj);
        }
    }

    public /* synthetic */ yml0(com.vk.video.ui.discovery.minimizable.p pVar) {
        this.b = 8;
    }
}
