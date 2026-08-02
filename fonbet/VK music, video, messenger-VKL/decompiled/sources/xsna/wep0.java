package xsna;

import android.graphics.Bitmap;
import android.graphics.PorterDuff;
import android.graphics.drawable.Icon;
import androidx.core.graphics.drawable.IconCompat;
import com.vk.api.generated.base.dto.BaseOkResponseDto;
import com.vk.api.generated.groups.dto.GroupsGetByIdObjectResponseDto;
import com.vk.core.utils.newtork.d;
import com.vk.dto.common.id.UserId;
import com.vk.profile.user.impl.ui.h;
import java.util.ArrayList;
import xsna.it80;
import xsna.sx40;
import xsna.tj50;

/* compiled from: R8$$SyntheticClass */
/* loaded from: classes3.dex */
public final /* synthetic */ class wep0 implements izs {
    public final /* synthetic */ int b;

    public /* synthetic */ wep0(int i) {
        this.b = i;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // xsna.izs
    public final Object invoke(Object obj) {
        IconCompat iconCompat;
        boolean z = true;
        switch (this.b) {
            case 0:
                sx40 sx40Var = (sx40) obj;
                if ((sx40Var instanceof sx40.b.g) || (!(sx40Var instanceof sx40.b.j) ? !(sx40Var instanceof sx40.b) : ((sx40.b.j) sx40Var).b)) {
                    z = false;
                }
                return Boolean.valueOf(z);
            case 1:
                return s3q0.a;
            case 2:
                tj50.a aVar = (tj50.a) obj;
                com.vk.profile.user.impl.ui.c cVar = com.vk.profile.user.impl.ui.c.b;
                ao8 ao8Var = ao8.d;
                return new h.a(aVar.a(cVar, ao8Var), aVar.a(iuq0.b, ao8Var), aVar.a(guq0.b, ao8Var), aVar.a(huq0.b, ao8Var), aVar.e(juq0.b), aVar.e(com.vk.profile.user.impl.ui.d.b), aVar.a(kuq0.b, ao8Var), aVar.e(luq0.b), aVar.a(muq0.b, ao8Var), aVar.a(fuq0.b, ao8Var));
            case 3:
                return Boolean.valueOf(epx.f(((wxr0) obj).b, "videos_history_remove"));
            case 4:
                return Boolean.valueOf(((com.vk.core.utils.newtork.d) obj) instanceof d.a);
            case 5:
                return ((BaseOkResponseDto) obj) == BaseOkResponseDto.OK ? io.reactivex.rxjava3.internal.operators.completable.i.b : io.reactivex.rxjava3.core.a.k(new IllegalStateException("Group unsubscribe failed"));
            case 6:
                return ((GroupsGetByIdObjectResponseDto) obj).d();
            case 7:
                qyg0 V0 = ((hyg0) obj).V0("SELECT user, file, last_access from user_vmoji_files order by last_access asc");
                try {
                    ArrayList arrayList = new ArrayList();
                    while (V0.step()) {
                        arrayList.add(new o8w0(V0.getLong(2), new UserId(V0.getLong(0)), V0.l2(1)));
                    }
                    return arrayList;
                } finally {
                    V0.close();
                }
            case 8:
                Boolean bool = (Boolean) obj;
                bool.booleanValue();
                return bool;
            case 9:
                com.vk.metrics.eventtracking.b.a.q((Throwable) obj);
                return s3q0.a;
            case 10:
                it80.a aVar2 = it80.b;
                Bitmap bitmap = (Bitmap) ((it80) obj).a;
                if (bitmap != null) {
                    Icon createWithBitmap = Icon.createWithBitmap(bitmap);
                    PorterDuff.Mode mode = IconCompat.k;
                    iconCompat = IconCompat.a.a(createWithBitmap);
                } else {
                    iconCompat = null;
                }
                aVar2.getClass();
                return new it80(iconCompat);
            default:
                return Boolean.valueOf(brm0.B(((StackTraceElement) obj).getClassName(), "jdk.internal", false));
        }
    }

    public /* synthetic */ wep0(w8w0 w8w0Var) {
        this.b = 7;
    }
}
