package xsna;

import com.vk.channels.api.Channel;
import com.vk.core.serialize.Serializer;
import com.vk.dto.common.Peer;
import com.vk.im.engine.models.dialogs.Dialog;
import com.vk.im.engine.models.im_item.ImItemType;
import java.util.Collection;
import java.util.Iterator;
import kotlin.NoWhenBranchMatchedException;

/* compiled from: ImItemRelatedProfilesFinder.kt */
/* loaded from: classes2.dex */
public final class s7w {

    /* compiled from: ImItemRelatedProfilesFinder.kt */
    public static final /* synthetic */ class a {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;

        static {
            int[] iArr = new int[ImItemType.values().length];
            try {
                iArr[ImItemType.DIALOG.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[ImItemType.CHANNEL.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            $EnumSwitchMapping$0 = iArr;
        }
    }

    public static f1e0 a(Collection collection) {
        f1e0 f1e0Var = new f1e0();
        Iterator it = collection.iterator();
        while (it.hasNext()) {
            a5w a5wVar = (a5w) it.next();
            int i = a.$EnumSwitchMapping$0[a5wVar.M8().ordinal()];
            if (i == 1) {
                ijm.b((Dialog) a5wVar, f1e0Var);
            } else {
                if (i != 2) {
                    throw new NoWhenBranchMatchedException();
                }
                long j = ((Channel) a5wVar).b;
                Serializer.c<Peer> cVar = Peer.CREATOR;
                f1e0Var.a(Peer.a.d(j), Peer.a.f(j));
            }
        }
        return f1e0Var;
    }
}
