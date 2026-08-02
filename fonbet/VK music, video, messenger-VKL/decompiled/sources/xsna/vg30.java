package xsna;

import com.vk.im.engine.models.messages.MsgFromUser;
import java.util.Map;

/* compiled from: MsgActionDelegatesProvider.kt */
/* loaded from: classes2.dex */
public interface vg30 {

    /* compiled from: MsgActionDelegatesProvider.kt */
    public static final class a {
        public static final C3889a a = new C3889a();

        /* compiled from: MsgActionDelegatesProvider.kt */
        /* renamed from: xsna.vg30$a$a, reason: collision with other inner class name */
        public static final class C3889a implements vg30 {
            @Override // xsna.vg30
            public final Map<ug30, cpj0> a(MsgFromUser msgFromUser) {
                return jgp.b;
            }
        }
    }

    Map<ug30, cpj0> a(MsgFromUser msgFromUser);
}
