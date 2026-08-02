package xsna;

import android.text.SpannableString;
import com.vk.api.generated.base.dto.BaseUploadServerDto;
import com.vk.core.serialize.Serializer;
import com.vk.dto.common.id.UserId;
import com.vk.dto.stories.model.clickable.ClickableMention;
import com.vk.dto.stories.model.mention.StoryMentionSpan;
import com.vk.log.L;
import com.vk.newsfeed.posting.mediapicker.videovk.presentation.PickerRecyclerPaginatedView;
import com.vk.voip.ui.calls.presentation.base.fragment.VoipCallServiceFragment;
import com.vkontakte.android.R;
import java.util.ArrayList;
import java.util.List;
import java.util.Objects;
import java.util.concurrent.TimeUnit;
import kotlin.Pair;
import xsna.sqc0;
import xsna.tj50;

/* compiled from: R8$$SyntheticClass */
/* loaded from: classes3.dex */
public final /* synthetic */ class k990 implements izs {
    public final /* synthetic */ int b;

    public /* synthetic */ k990(int i) {
        this.b = i;
    }

    @Override // xsna.izs
    public final Object invoke(Object obj) {
        int i = 17;
        switch (this.b) {
            case 0:
                utk utkVar = (utk) obj;
                break;
            case 1:
                break;
            case 2:
                BaseUploadServerDto baseUploadServerDto = (BaseUploadServerDto) obj;
                break;
            case 3:
                break;
            case 4:
                int i2 = PickerRecyclerPaginatedView.O;
                qgi0.r((tgi0) obj, "PostingMediaPickerEmptyTitle");
                break;
            case 5:
                L.i((Throwable) obj);
                cvk.u(R.string.common_network_error, false);
                break;
            case 6:
                break;
            case 7:
                break;
            case 8:
                break;
            case 9:
                sqc0 sqc0Var = (sqc0) obj;
                if (sqc0Var instanceof sqc0.a) {
                    break;
                }
                break;
            case 10:
                tj50.a aVar = (tj50.a) obj;
                c3v c3vVar = new c3v(15);
                ao8 ao8Var = ao8.d;
                break;
            case 11:
                qgi0.r((tgi0) obj, "product_card_top_bar_cart");
                break;
            case 12:
                break;
            case 13:
                break;
            case 14:
                break;
            case 15:
                break;
            case 16:
                qgi0.r((tgi0) obj, "search_filters_top_bar_search");
                break;
            case 17:
                Float f = (Float) obj;
                f.floatValue();
                int i3 = gbi0.o1;
                break;
            case 18:
                break;
            case 19:
                break;
            case 20:
                zk10 zk10Var = (zk10) obj;
                Serializer.c<ClickableMention> cVar = ClickableMention.CREATOR;
                Pair b = ClickableMention.a.b(zk10Var);
                if (b != null) {
                    UserId userId = (UserId) b.d();
                    String str = (String) b.g();
                    SpannableString spannableString = new SpannableString(str);
                    spannableString.setSpan(new StoryMentionSpan(userId, false, 0, 6, null), 0, str.length(), 17);
                    break;
                } else {
                    break;
                }
            case 21:
                break;
            case 22:
                t6g0 t6g0Var = t6g0.b;
                t6g0.b().a();
                break;
            case 23:
                io.reactivex.rxjava3.core.g gVar = (io.reactivex.rxjava3.core.g) obj;
                TimeUnit timeUnit = TimeUnit.SECONDS;
                gVar.getClass();
                io.reactivex.rxjava3.core.w a = io.reactivex.rxjava3.schedulers.a.a();
                Objects.requireNonNull(timeUnit, "unit is null");
                Objects.requireNonNull(a, "scheduler is null");
                break;
            case 24:
                break;
            case 25:
                break;
            case 26:
                break;
            case 27:
                ArrayList arrayList = new ArrayList();
                for (Object obj2 : (Object[]) obj) {
                    if (obj2 instanceof List) {
                        arrayList.add(obj2);
                    }
                }
                break;
            case 28:
                ((Integer) obj).intValue();
                break;
            default:
                int i4 = VoipCallServiceFragment.Y;
                qgi0.r((tgi0) obj, "VoipCallService.Calls");
                break;
        }
        return s3q0.a;
    }
}
