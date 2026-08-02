package xsna;

import android.content.Context;
import com.vk.sharing.api.di.SharingComponent;
import com.vk.sharing.api.dto.ActionsInfo;

/* compiled from: Sharing.kt */
/* loaded from: classes5.dex */
public interface bbj0 {
    public static final b a = b.b;

    /* compiled from: Sharing.kt */
    public interface a {
        um6 a(ActionsInfo actionsInfo);

        void c();
    }

    /* compiled from: Sharing.kt */
    public static final class b implements w8i {
        public static final /* synthetic */ b b;
        public static final SharingComponent c;
        public static final bbj0 d;

        static {
            b bVar = new b();
            b = bVar;
            SharingComponent sharingComponent = (SharingComponent) ((k7m) m7m.f(bVar)).a(fpf0.a(SharingComponent.class));
            c = sharingComponent;
            d = sharingComponent.F2();
        }

        @ozl
        public static a a(Context context) {
            return d.a(context);
        }
    }

    tbj0 a(Context context);
}
