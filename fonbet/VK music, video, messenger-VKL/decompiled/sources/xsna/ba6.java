package xsna;

import com.vk.api.generated.groups.dto.GroupsGetResponseDto;
import com.vk.dto.common.id.UserId;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import java.util.Optional;

/* compiled from: R8$$SyntheticClass */
/* loaded from: classes16.dex */
public final /* synthetic */ class ba6 implements izs {
    public final /* synthetic */ int b;
    public final /* synthetic */ long c;

    public /* synthetic */ ba6(long j, int i) {
        this.b = i;
        this.c = j;
    }

    @Override // xsna.izs
    public final Object invoke(Object obj) {
        switch (this.b) {
            case 0:
                return Optional.ofNullable(((wpp) obj).c.get(Long.valueOf(this.c)));
            default:
                List<UserId> e = ((GroupsGetResponseDto) obj).e();
                boolean z = false;
                if (!(e instanceof Collection) || !e.isEmpty()) {
                    Iterator<T> it = e.iterator();
                    while (true) {
                        if (it.hasNext()) {
                            if (((UserId) it.next()).b == this.c) {
                                z = true;
                            }
                        }
                    }
                }
                return Boolean.valueOf(z);
        }
    }
}
