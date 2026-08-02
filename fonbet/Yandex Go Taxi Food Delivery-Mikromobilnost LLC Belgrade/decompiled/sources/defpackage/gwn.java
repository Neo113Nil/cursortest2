package defpackage;

import com.ybsdk.core.transfer.utils.domain.dto.EmptyListInfoDto;
import com.ybsdk.core.utils.text.Text;
import com.ybsdk.core.utils.text.b;

/* loaded from: classes2.dex */
public abstract class gwn {
    public static final fwn a(EmptyListInfoDto emptyListInfoDto) {
        b bVar = Text.Companion;
        return new fwn(g8e.i(bVar, emptyListInfoDto.getTitle()), g8e.i(bVar, emptyListInfoDto.getDescription()), job1.f(qxy0.c(emptyListInfoDto.getImage(), null), new urm(27)));
    }
}
