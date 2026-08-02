package xsna;

import com.vk.api.generated.users.dto.UsersUserFullDto;
import com.vkontakte.android.BirthdayBroadcastReceiver;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/* compiled from: R8$$SyntheticClass */
/* loaded from: classes7.dex */
public final /* synthetic */ class aa7 implements io.reactivex.rxjava3.functions.f {
    public final /* synthetic */ int b;

    public /* synthetic */ aa7(Object obj, int i) {
        this.b = i;
    }

    @Override // io.reactivex.rxjava3.functions.f
    public final void accept(Object obj) {
        switch (this.b) {
            case 0:
                int i = BirthdayBroadcastReceiver.a;
                ArrayList arrayList = new ArrayList();
                Iterator it = ((List) obj).iterator();
                while (it.hasNext()) {
                    arrayList.add(j2r0.a((UsersUserFullDto) it.next()));
                }
                BirthdayBroadcastReceiver.a(arrayList);
                break;
            default:
                s3q0 s3q0Var = s3q0.a;
                break;
        }
    }
}
