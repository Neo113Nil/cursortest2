package xsna;

import com.vk.dto.common.id.UserId;
import com.vkontakte.android.data.FriendsUtils;
import java.util.function.IntConsumer;

/* compiled from: R8$$SyntheticClass */
/* loaded from: classes11.dex */
public final /* synthetic */ class xw2 implements Runnable {
    public final /* synthetic */ int b;
    public final /* synthetic */ int c;
    public final /* synthetic */ Object d;

    public /* synthetic */ xw2(Object obj, int i, int i2) {
        this.b = i2;
        this.d = obj;
        this.c = i;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.b) {
            case 0:
                ((IntConsumer) this.d).accept(this.c);
                break;
            default:
                FriendsUtils.d(this.c, (UserId) this.d);
                break;
        }
    }
}
