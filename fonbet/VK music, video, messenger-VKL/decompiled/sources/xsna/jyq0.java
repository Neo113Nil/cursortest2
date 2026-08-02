package xsna;

import android.view.ViewGroup;
import com.vk.api.generated.groups.dto.GroupsGetByIdObjectResponseDto;
import com.vk.dto.stickers.AnimatedStickerContent;
import com.vkontakte.android.R;
import java.util.ArrayList;
import java.util.List;
import kotlin.NoWhenBranchMatchedException;
import ru.ok.android.externcalls.sdk.watch_together.WatchTogetherError;
import xsna.dug0;
import xsna.gkw0;
import xsna.lyq0;

/* compiled from: R8$$SyntheticClass */
/* loaded from: classes4.dex */
public final /* synthetic */ class jyq0 implements izs {
    public final /* synthetic */ int b;

    public /* synthetic */ jyq0(int i) {
        this.b = i;
    }

    @Override // xsna.izs
    public final Object invoke(Object obj) {
        int i;
        switch (this.b) {
            case 0:
                ryq0 ryq0Var = (ryq0) obj;
                int i2 = lyq0.a.$EnumSwitchMapping$0[ryq0Var.l.ordinal()];
                if (i2 == 1) {
                    i = ryq0Var.k ? R.string.user_recom_themes_registration_placeholder_step1_title : R.string.user_recom_themes_placeholder_step1_title;
                } else {
                    if (i2 != 2) {
                        throw new NoWhenBranchMatchedException();
                    }
                    i = R.string.user_recom_themes_placeholder_step2_title;
                }
                return Integer.valueOf(i);
            case 1:
                return sni.f(((AnimatedStickerContent) obj).c);
            case 2:
                tq2 tq2Var = (tq2) obj;
                return new ov70((Float.floatToRawIntBits(tq2Var.a) << 32) | (Float.floatToRawIntBits(tq2Var.b) & 4294967295L));
            case 3:
                return new GroupsGetByIdObjectResponseDto(null, null, 3, null);
            case 4:
                return Integer.valueOf(((j0l0) obj).a);
            case 5:
                return s3q0.a;
            case 6:
                return ((nex0) obj).a;
            case 7:
                ((Integer) obj).intValue();
                return s3q0.a;
            case 8:
                return Boolean.valueOf(((dug0.c) obj).c());
            case 9:
                List<t8j> list = (List) obj;
                ArrayList arrayList = new ArrayList(c5g.u(list, 10));
                for (t8j t8jVar : list) {
                    qtd0 qtd0Var = t8jVar.b;
                    String str = t8jVar.o;
                    if (str == null) {
                        str = "";
                    }
                    arrayList.add(new zpp(qtd0Var, str));
                }
                return arrayList;
            case 10:
                WatchTogetherError watchTogetherError = (WatchTogetherError) obj;
                int i3 = watchTogetherError == null ? -1 : gkw0.a.$EnumSwitchMapping$0[watchTogetherError.ordinal()];
                return Integer.valueOf(i3 != 1 ? i3 != 2 ? i3 != 3 ? R.string.voip_watch_together_unknown_error : R.string.voip_watch_together_no_rights_error : R.string.voip_watch_together_video_unavailable_error : R.string.voip_watch_together_limit_error);
            case 11:
                return ((wj8) obj).d;
            case 12:
                return new w990((ViewGroup) obj);
            default:
                return Boolean.valueOf(((it80) obj).a != 0);
        }
    }
}
