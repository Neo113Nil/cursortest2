package xsna;

import com.vk.log.L;
import com.vk.log.LoggerOutputTarget;
import com.vk.music.notifications.restriction.MusicRestrictionPopupDisplayer;
import java.util.Collections;
import java.util.List;
import kotlin.Pair;
import xsna.k840;

/* compiled from: MusicBackgroundRestrictionStrategy.kt */
/* loaded from: classes3.dex */
public final class bb40 {
    public final yqd0 a;
    public final jz70 b;
    public final u750 c;
    public final o450 d;
    public final MusicRestrictionPopupDisplayer e;
    public final Object f;
    public boolean g;
    public int h;

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    /* compiled from: MusicBackgroundRestrictionStrategy.kt */
    public static final class a {
        private static final /* synthetic */ zrp $ENTRIES;
        private static final /* synthetic */ a[] $VALUES;
        public static final a BACKGROUND;
        public static final a FOREGROUND;

        static {
            a aVar = new a("BACKGROUND", 0);
            BACKGROUND = aVar;
            a aVar2 = new a("FOREGROUND", 1);
            FOREGROUND = aVar2;
            a[] aVarArr = {aVar, aVar2};
            $VALUES = aVarArr;
            $ENTRIES = new asp(aVarArr);
        }

        public a() {
            throw null;
        }

        public static a valueOf(String str) {
            return (a) Enum.valueOf(a.class, str);
        }

        public static a[] values() {
            return (a[]) $VALUES.clone();
        }
    }

    public bb40(yqd0 yqd0Var, jz70 jz70Var) {
        this.a = yqd0Var;
        this.b = jz70Var;
        s750 s750Var = k840.a.e;
        this.c = s750Var == null ? null : s750Var;
        s450 s450Var = k840.a.c;
        this.d = s450Var == null ? null : s450Var;
        com.vk.music.notifications.restriction.a aVar = k840.a.d;
        this.e = aVar != null ? aVar : null;
        a aVar2 = a.FOREGROUND;
        a aVar3 = a.BACKGROUND;
        this.f = pn00.k(new Pair(1, e43.l(aVar2, aVar3)), new Pair(2, Collections.singletonList(aVar2)), new Pair(3, e43.l(aVar2, aVar3)));
    }

    /* JADX WARN: Type inference failed for: r1v2, types: [java.lang.Object, java.util.Map] */
    public final void a() {
        L l = L.a;
        l.getClass();
        boolean m = L.m(LoggerOutputTarget.NONE);
        o450 o450Var = this.d;
        if (!m) {
            L.u(l, L.LogType.i, new Object[]{"count = " + o450Var.b()});
        }
        List list = (List) this.f.get(Integer.valueOf(o450Var.b()));
        if (list == null || !list.contains(a.FOREGROUND)) {
            return;
        }
        c63 c63Var = c63.a;
        if (c63.b() == null) {
            return;
        }
        this.e.getClass();
        if (this.g) {
            o450Var.a();
            this.b.invoke();
            this.g = false;
        }
    }
}
