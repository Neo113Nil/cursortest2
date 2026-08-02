package xsna;

import com.vk.api.generated.calls.dto.CallsGetReactionsResponseDto;
import com.vk.api.generated.calls.dto.CallsReactionDto;
import com.vk.api.generated.calls.dto.CallsReactionImageDto;
import com.vk.dto.common.im.Image;
import com.vk.dto.common.im.ImageList;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import kotlin.collections.EmptyList;

/* compiled from: GetFeedbackImagesRepository.kt */
/* loaded from: classes11.dex */
public final class lrt implements dow0 {
    public final rd9 b;
    public final HashMap<String, b69> c = new HashMap<>();
    public volatile Object d = EmptyList.b;

    public lrt(rd9 rd9Var) {
        this.b = rd9Var;
    }

    public static ArrayList c(CallsGetReactionsResponseDto callsGetReactionsResponseDto) {
        List<CallsReactionDto> d = callsGetReactionsResponseDto.d();
        ArrayList arrayList = new ArrayList(c5g.u(d, 10));
        for (CallsReactionDto callsReactionDto : d) {
            String e = callsReactionDto.e();
            List<CallsReactionImageDto> d2 = callsReactionDto.d();
            ArrayList arrayList2 = new ArrayList(c5g.u(d2, 10));
            for (CallsReactionImageDto callsReactionImageDto : d2) {
                arrayList2.add(new Image(callsReactionImageDto.getWidth(), callsReactionImageDto.getHeight(), callsReactionImageDto.getUrl(), false));
            }
            arrayList.add(new b69(e, new ImageList(new ArrayList(arrayList2)), callsReactionDto.getDescription()));
        }
        return arrayList;
    }

    @Override // xsna.dow0
    public final b69 a(String str) {
        if (str != null) {
            return this.c.get(str);
        }
        return null;
    }

    public final io.reactivex.rxjava3.internal.operators.single.f0 b() {
        return new io.reactivex.rxjava3.internal.operators.single.d0(xa4.I(new io.reactivex.rxjava3.internal.operators.single.b(new iw3(this, 15)), 2, 1007), new yq(16), null).q(asu0.a.c());
    }
}
