package xsna;

import com.vk.push.core.analytics.ExtensionsKt;

/* compiled from: InitElectionsEvent.kt */
/* loaded from: classes5.dex */
public abstract class nta {
    public final String a;
    public final String b;
    public final String c;

    /* compiled from: InitElectionsEvent.kt */
    public static final class a extends nta {
        public a(boolean z, boolean z2) {
            super("battery_permission", ExtensionsKt.asString(z), ExtensionsKt.asString(z2));
        }
    }

    /* compiled from: InitElectionsEvent.kt */
    public static final class b extends nta {
        public static final b d = new b("elections_not_finished", null, null);
    }

    public nta(String str, String str2, String str3) {
        this.a = str;
        this.b = str2;
        this.c = str3;
    }
}
