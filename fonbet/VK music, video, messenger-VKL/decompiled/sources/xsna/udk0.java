package xsna;

import com.vk.api.generated.groups.dto.GroupsGetObjectExtendedResponseDto;
import com.vk.api.generated.groups.dto.GroupsGroupFullDto;
import com.vk.dto.common.Attachment;
import com.vk.vmoji.storage.api.VmojiStorageException;
import com.vk.voip.ui.VoipViewModelState;
import java.io.File;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.NoWhenBranchMatchedException;
import xsna.itx;
import xsna.qr60;
import xsna.xdk0;
import xsna.ydk0;

/* compiled from: R8$$SyntheticClass */
/* loaded from: classes5.dex */
public final /* synthetic */ class udk0 implements izs {
    public final /* synthetic */ int b;

    public /* synthetic */ udk0(int i) {
        this.b = i;
    }

    @Override // xsna.izs
    public final Object invoke(Object obj) {
        Object bVar;
        switch (this.b) {
            case 0:
                xdk0 xdk0Var = (xdk0) obj;
                boolean z = xdk0Var.c;
                xdk0.a aVar = xdk0Var.b;
                if (aVar instanceof xdk0.a.c) {
                    return new ydk0.a.AbstractC4091a.e(z);
                }
                if (aVar instanceof xdk0.a.AbstractC3997a.C3998a) {
                    xdk0.a.AbstractC3997a.C3998a c3998a = (xdk0.a.AbstractC3997a.C3998a) aVar;
                    if (g5g.E(c3998a.c, itx.a.class).isEmpty()) {
                        return new ydk0.a.AbstractC4091a.b(z);
                    }
                    bVar = new ydk0.a.AbstractC4091a.AbstractC4092a.C4093a(c3998a.c, z);
                } else {
                    if (!(aVar instanceof xdk0.a.AbstractC3997a.b)) {
                        if (aVar instanceof xdk0.a.b) {
                            return new ydk0.a.AbstractC4091a.d(((xdk0.a.b) aVar).b);
                        }
                        throw new NoWhenBranchMatchedException();
                    }
                    xdk0.a.AbstractC3997a.b bVar2 = (xdk0.a.AbstractC3997a.b) aVar;
                    if (g5g.E(bVar2.c, itx.a.class).isEmpty()) {
                        return new ydk0.a.AbstractC4091a.c(z);
                    }
                    bVar = new ydk0.a.AbstractC4091a.AbstractC4092a.b(bVar2.c, z);
                }
                return bVar;
            case 1:
                com.vk.metrics.eventtracking.b.a.q((Throwable) obj);
                return s3q0.a;
            case 2:
                return ca3.b((Attachment) obj);
            case 3:
                bn40.c((Throwable) obj, new Object[0]);
                return s3q0.a;
            case 4:
                ((tdu) obj).Q0(1);
                return s3q0.a;
            case 5:
                hxq0 hxq0Var = (hxq0) obj;
                return new awq0(new qr60.a.f(hxq0Var.a, hxq0Var.b, hxq0Var.d));
            case 6:
                return ((com.vk.video.ui.discovery.minimizable.q) obj).g;
            case 7:
                List<GroupsGroupFullDto> e = ((GroupsGetObjectExtendedResponseDto) obj).e();
                ArrayList arrayList = new ArrayList(c5g.u(e, 10));
                Iterator<T> it = e.iterator();
                while (it.hasNext()) {
                    arrayList.add(d590.b((GroupsGroupFullDto) it.next()));
                }
                return arrayList;
            case 8:
                byte[] B = com.vk.core.files.a.B((File) obj, null);
                if (B != null) {
                    return B;
                }
                throw new VmojiStorageException("Can't read vmoji file", null);
            default:
                fjw0 fjw0Var = (fjw0) obj;
                VoipViewModelState voipViewModelState = fjw0Var.b;
                VoipViewModelState voipViewModelState2 = fjw0Var.a;
                VoipViewModelState voipViewModelState3 = VoipViewModelState.Idle;
                if (voipViewModelState == voipViewModelState3 && voipViewModelState2 != voipViewModelState3) {
                    bzu.c = false;
                }
                if (voipViewModelState2 == voipViewModelState3) {
                    bzu.c = true;
                }
                return s3q0.a;
        }
    }
}
