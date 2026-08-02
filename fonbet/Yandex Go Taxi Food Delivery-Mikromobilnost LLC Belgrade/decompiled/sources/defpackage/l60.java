package defpackage;

import java.util.List;
import kotlin.LazyThreadSafetyMode;
import kotlin.a;
import ru.yandex.taxi.scooters.data.model.PhotoType;

@gsq0
/* loaded from: classes6.dex */
public final class l60 {
    public static final k60 Companion = new k60();
    public static final i3y[] d;
    public final String a;
    public final List b;
    public final PhotoType c;

    static {
        LazyThreadSafetyMode lazyThreadSafetyMode = LazyThreadSafetyMode.PUBLICATION;
        d = new i3y[]{null, a.b(lazyThreadSafetyMode, new c20(3)), a.b(lazyThreadSafetyMode, new c20(4))};
    }

    public /* synthetic */ l60(int i, String str, List list, PhotoType photoType) {
        if (7 != (i & 7)) {
            qje.Z(i, 7, j60.a.getDescriptor());
            throw null;
        }
        this.a = str;
        this.b = list;
        this.c = photoType;
    }

    public l60(String str, List list, PhotoType photoType) {
        this.a = str;
        this.b = list;
        this.c = photoType;
    }
}
