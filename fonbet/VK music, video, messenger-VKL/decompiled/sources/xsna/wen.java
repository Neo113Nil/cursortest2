package xsna;

import java.util.List;
import ru.ok.android.externcalls.sdk.layout.ConversationDisplayLayoutItem;

/* compiled from: DisplayLayoutProvider.kt */
/* loaded from: classes7.dex */
public interface wen {

    /* compiled from: DisplayLayoutProvider.kt */
    public interface a {

        /* compiled from: DisplayLayoutProvider.kt */
        /* renamed from: xsna.wen$a$a, reason: collision with other inner class name */
        public static final class C3930a implements a {
            public static final C3930a a = new C3930a();
        }

        /* compiled from: DisplayLayoutProvider.kt */
        public static final class b implements a {
            public final List<ConversationDisplayLayoutItem> a;

            public b(List<ConversationDisplayLayoutItem> list) {
                this.a = list;
            }
        }
    }

    a getDisplayLayouts();
}
