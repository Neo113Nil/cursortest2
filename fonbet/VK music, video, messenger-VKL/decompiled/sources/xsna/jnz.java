package xsna;

import com.vk.dto.common.VideoUrl;
import com.vk.libvideo.live.impl.dialog.LiveVideoDialog;
import java.util.function.Predicate;

/* compiled from: R8$$SyntheticClass */
/* loaded from: classes3.dex */
public final /* synthetic */ class jnz implements Predicate {
    public final /* synthetic */ int a;

    public /* synthetic */ jnz(int i) {
        this.a = i;
    }

    @Override // java.util.function.Predicate
    public final boolean test(Object obj) {
        switch (this.a) {
            case 0:
                int i = LiveVideoDialog.B0;
                return !fxc0.B().i().c().contains((VideoUrl) obj);
            case 1:
                ihy0 ihy0Var = (ihy0) obj;
                if ((ihy0Var instanceof wgy0) || (ihy0Var instanceof fhy0) || (ihy0Var instanceof yby0) || (ihy0Var instanceof one.video.calls.sdk_private.c)) {
                    return true;
                }
                return (ihy0Var instanceof zby0) && ((zby0) ihy0Var).f == 28;
            default:
                return ((xmy0) obj).b();
        }
    }
}
