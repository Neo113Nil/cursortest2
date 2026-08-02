package xsna;

import com.vk.dto.common.Source;
import com.vk.im.engine.models.dialogs.DialogTheme;
import com.vk.im.engine.models.dialogs.c;
import com.vk.im.engine.models.events.OnCacheInvalidateEvent;
import java.util.Collections;
import java.util.List;
import kotlin.NoWhenBranchMatchedException;
import org.chromium.base.TimeUtils;

/* compiled from: DialogThemeGetByIdCmd.kt */
/* loaded from: classes2.dex */
public final class rkm extends le6<it80<DialogTheme>> {
    public final com.vk.im.engine.models.dialogs.c b;
    public final Source c;
    public final boolean d = true;

    /* compiled from: DialogThemeGetByIdCmd.kt */
    public static final /* synthetic */ class a {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;

        static {
            int[] iArr = new int[Source.values().length];
            try {
                iArr[Source.CACHE.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[Source.ACTUAL.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[Source.NETWORK.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            $EnumSwitchMapping$0 = iArr;
        }
    }

    public rkm(com.vk.im.engine.models.dialogs.c cVar, Source source) {
        this.b = cVar;
        this.c = source;
    }

    @Override // xsna.le6
    public final it80<DialogTheme> e(w2w w2wVar) {
        DialogTheme e;
        boolean z;
        String a2;
        String i;
        w2wVar.getConfig().getClass();
        int[] iArr = a.$EnumSwitchMapping$0;
        Source source = this.c;
        int i2 = iArr[source.ordinal()];
        com.vk.im.engine.models.dialogs.c cVar = this.b;
        if (i2 != 1) {
            ukm ukmVar = ukm.a;
            if (i2 == 2) {
                elm i3 = w2wVar.I0().i();
                String str = cVar.a;
                boolean z2 = i3.b(str) != null;
                boolean f = i3.f(str);
                boolean d = i3.d(str);
                boolean c = i3.c(cVar);
                if (z2 && !f && (i = i3.i(str)) != null) {
                    List singletonList = Collections.singletonList(i);
                    if (!singletonList.isEmpty()) {
                        w2wVar.L0(ukmVar, new jam(singletonList, this.c, true, this.d, false));
                    }
                }
                if (z2 && !d && !c && (a2 = i3.a(str)) != null) {
                    List singletonList2 = Collections.singletonList(a2);
                    if (!singletonList2.isEmpty()) {
                        w2wVar.L0(ukmVar, new t9m(singletonList2, source, true));
                    }
                }
                long h = i3.h(str);
                if (!cVar.equals(c.g.c)) {
                    if (h + TimeUtils.MILLISECONDS_PER_DAY < w2wVar.f1()) {
                        z = true;
                        if (z2 || z) {
                            ukmVar.a(w2wVar, this.c, true, (List) bz2.c(new olm(true, Collections.singletonList(str), null, 4), "DialogThemeGetByIdCmd.loadActual"), this.d, false);
                            w2wVar.S0().u(null, OnCacheInvalidateEvent.Reason.COMPLICATED_DB_CHANGE);
                        }
                        e = w2wVar.I0().i().e(cVar);
                    }
                }
                z = false;
                if (z2) {
                }
                ukmVar.a(w2wVar, this.c, true, (List) bz2.c(new olm(true, Collections.singletonList(str), null, 4), "DialogThemeGetByIdCmd.loadActual"), this.d, false);
                w2wVar.S0().u(null, OnCacheInvalidateEvent.Reason.COMPLICATED_DB_CHANGE);
                e = w2wVar.I0().i().e(cVar);
            } else {
                if (i2 != 3) {
                    throw new NoWhenBranchMatchedException();
                }
                ukmVar.a(w2wVar, this.c, true, (List) bz2.c(new olm(true, Collections.singletonList(cVar.a), null, 4), "DialogThemesLoadApiCmd.loadNetwork"), this.d, false);
                e = w2wVar.I0().i().e(cVar);
            }
        } else {
            e = w2wVar.I0().i().e(cVar);
        }
        it80.b.getClass();
        return new it80<>(e);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof rkm)) {
            return false;
        }
        rkm rkmVar = (rkm) obj;
        return epx.f(this.b, rkmVar.b) && this.c == rkmVar.c && this.d == rkmVar.d;
    }

    @Override // xsna.le6, xsna.e1w
    public final int hashCode() {
        return Boolean.hashCode(false) + qoy.b(io.reactivex.rxjava3.internal.operators.mixed.k.c(this.b.a.hashCode() * 31, 31, this.c), 31, this.d);
    }

    @Override // xsna.e1w
    public final String toString() {
        StringBuilder sb = new StringBuilder("DialogThemeGetByIdCmd(themeId=");
        sb.append(this.b);
        sb.append(", source=");
        sb.append(this.c);
        sb.append(", shouldLoadBackgroundFiles=");
        return n23.b(sb, this.d, ", shouldAwaitProcessingBackgroundResult=false)");
    }
}
