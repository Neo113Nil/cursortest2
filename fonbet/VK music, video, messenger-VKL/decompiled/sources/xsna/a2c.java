package xsna;

import android.content.Intent;
import com.vk.core.fragments.FragmentEntry;
import com.vk.core.fragments.FragmentImpl;
import com.vk.im.ui.components.attaches_history.attaches.model.simple.SimpleAttachListItem;
import com.vk.toggle.anonymous.SakFeatures;
import com.vkontakte.android.MainActivity;
import xsna.s8z;

/* compiled from: R8$$SyntheticClass */
/* loaded from: classes18.dex */
public final /* synthetic */ class a2c implements gzs {
    public final /* synthetic */ int b;
    public final /* synthetic */ Object c;
    public final /* synthetic */ Object d;
    public final /* synthetic */ Object e;

    public /* synthetic */ a2c(Object obj, Object obj2, Object obj3, int i) {
        this.b = i;
        this.c = obj;
        this.d = obj2;
        this.e = obj3;
    }

    @Override // xsna.gzs
    public final Object invoke() {
        Class<? extends FragmentImpl> cls;
        int i = this.b;
        Object obj = this.e;
        Object obj2 = this.d;
        Object obj3 = this.c;
        switch (i) {
            case 0:
                i2c.d((wh50) obj3, (wh50) obj2, (wh50) obj);
                break;
            case 1:
                s8z.a aVar = (s8z.a) obj2;
                SimpleAttachListItem simpleAttachListItem = (SimpleAttachListItem) obj;
                j0u0 j0u0Var = ((s8z) obj3).a;
                if (j0u0Var != null) {
                    ((g9z) j0u0Var.c).h(aVar.l.getContext(), simpleAttachListItem.b);
                }
                break;
            default:
                ww50 ww50Var = (ww50) obj3;
                FragmentEntry fragmentEntry = (FragmentEntry) obj2;
                FragmentEntry fragmentEntry2 = (FragmentEntry) obj;
                if (SakFeatures.Type.GET_USER_INFO_CUT_OFF_FROM_AUTH.h()) {
                    ww50Var.j0();
                }
                if (fragmentEntry != null) {
                    try {
                        cls = fragmentEntry.b;
                    } catch (IllegalArgumentException unused) {
                        Intent intent = new Intent(ww50Var.b, (Class<?>) MainActivity.class);
                        intent.addFlags(67108864);
                        intent.addFlags(32768);
                        intent.addFlags(268435456);
                        ww50Var.b.startActivity(intent);
                        c63 c63Var = c63.a;
                        c63.a(new exp0());
                    }
                } else {
                    cls = null;
                }
                if (cls == null || !b68.f().containsKey(cls)) {
                    cls = b68.d();
                }
                ww50Var.t(cls, null, true);
                if (fragmentEntry2 != null) {
                    ww50Var.t(fragmentEntry2.b, fragmentEntry2.c, false);
                }
                break;
        }
        return s3q0.a;
    }
}
