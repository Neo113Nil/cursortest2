package xsna;

import android.graphics.Point;
import androidx.fragment.app.FragmentActivity;
import com.vk.writebar.a;
import com.vkontakte.android.api.ExtendedUserProfile;

/* compiled from: R8$$SyntheticClass */
/* loaded from: classes5.dex */
public final /* synthetic */ class mhq0 implements Runnable {
    public final /* synthetic */ int b;
    public final /* synthetic */ Object c;
    public final /* synthetic */ Object d;
    public final /* synthetic */ Object e;

    public /* synthetic */ mhq0(Object obj, Object obj2, Object obj3, int i) {
        this.b = i;
        this.c = obj;
        this.d = obj2;
        this.e = obj3;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.b) {
            case 0:
                rhq0 rhq0Var = (rhq0) this.c;
                rhq0Var.e.c().b((FragmentActivity) this.d, fkq0.e(((ExtendedUserProfile.g) this.e).a.c));
                break;
            default:
                com.vk.writebar.a aVar = (com.vk.writebar.a) this.c;
                int[] iArr = (int[]) this.d;
                Point point = (Point) this.e;
                a.C2099a c2099a = aVar.j;
                if (c2099a != null) {
                    c2099a.showAtLocation(aVar.d, 0, iArr[0], point.y);
                    break;
                }
                break;
        }
    }
}
