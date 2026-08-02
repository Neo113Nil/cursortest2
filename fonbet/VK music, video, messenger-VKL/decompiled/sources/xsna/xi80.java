package xsna;

import android.app.Activity;
import com.my.tracker.personalize.PersonalizeApiClient;
import com.my.tracker.personalize.PersonalizeRequest;
import com.my.tracker.personalize.PersonalizeResponse;
import java.io.File;
import ru.ok.android.api.core.ApiClient;
import ru.ok.android.onelog.OneLogDirect;
import ru.ok.android.onelog.OneLogItem;

/* compiled from: R8$$SyntheticClass */
/* loaded from: classes9.dex */
public final /* synthetic */ class xi80 implements Runnable {
    public final /* synthetic */ int b;
    public final /* synthetic */ Object c;
    public final /* synthetic */ Object d;
    public final /* synthetic */ Object e;
    public final /* synthetic */ Object f;

    public /* synthetic */ xi80(Object obj, Object obj2, Object obj3, Object obj4, int i) {
        this.b = i;
        this.c = obj;
        this.d = obj2;
        this.e = obj3;
        this.f = obj4;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.b) {
            case 0:
                OneLogDirect.send_B_83SRM$lambda$1((String) this.c, (OneLogItem) this.d, (ApiClient) this.e, (wzs) this.f);
                break;
            case 1:
                ((PersonalizeApiClient) this.c).a((PersonalizeApiClient.OnCompleteListener) this.d, (PersonalizeRequest) this.e, (PersonalizeResponse) this.f);
                break;
            default:
                ((i6a0) this.c).a((File) this.d, (Activity) this.e, new quz((h13) this.f, 13));
                break;
        }
    }
}
