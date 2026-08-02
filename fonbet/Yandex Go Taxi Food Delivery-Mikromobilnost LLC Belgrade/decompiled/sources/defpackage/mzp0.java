package defpackage;

import java.util.List;
import kotlin.LazyThreadSafetyMode;
import kotlin.a;
import ru.CryptoPro.JCSP.MSCAPI.HProv;

@gsq0
/* loaded from: classes9.dex */
public final class mzp0 {
    public static final lzp0 Companion = new lzp0();
    public static final i3y[] h;
    public final kr a;
    public final kr b;
    public final kr c;
    public final kr d;
    public final kr e;
    public final kr f;
    public final List g;

    static {
        LazyThreadSafetyMode lazyThreadSafetyMode = LazyThreadSafetyMode.PUBLICATION;
        h = new i3y[]{a.b(lazyThreadSafetyMode, new wpp0(20)), a.b(lazyThreadSafetyMode, new wpp0(21)), a.b(lazyThreadSafetyMode, new wpp0(22)), a.b(lazyThreadSafetyMode, new wpp0(23)), a.b(lazyThreadSafetyMode, new wpp0(24)), a.b(lazyThreadSafetyMode, new wpp0(25)), a.b(lazyThreadSafetyMode, new wpp0(26))};
    }

    public /* synthetic */ mzp0(int i, kr krVar, kr krVar2, kr krVar3, kr krVar4, kr krVar5, kr krVar6, List list) {
        if (127 != (i & HProv.PP_VERSION_TIMESTAMP)) {
            qje.Z(i, HProv.PP_VERSION_TIMESTAMP, kzp0.a.getDescriptor());
            throw null;
        }
        this.a = krVar;
        this.b = krVar2;
        this.c = krVar3;
        this.d = krVar4;
        this.e = krVar5;
        this.f = krVar6;
        this.g = list;
    }

    public mzp0(kr krVar, kr krVar2, kr krVar3, kr krVar4, kr krVar5, kr krVar6, List list) {
        this.a = krVar;
        this.b = krVar2;
        this.c = krVar3;
        this.d = krVar4;
        this.e = krVar5;
        this.f = krVar6;
        this.g = list;
    }
}
