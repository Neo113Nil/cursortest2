package xsna;

import com.vk.dto.common.Source;
import com.vk.im.engine.models.dialogs.DialogTheme;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.NoWhenBranchMatchedException;
import org.chromium.base.TimeUtils;

/* compiled from: DialogThemeGetAllCmd.kt */
/* loaded from: classes2.dex */
public final class qkm extends le6<List<? extends DialogTheme>> {
    public final Source b;
    public final boolean c;

    /* compiled from: DialogThemeGetAllCmd.kt */
    public static final /* synthetic */ class a {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;

        static {
            int[] iArr = new int[Source.values().length];
            try {
                iArr[Source.CACHE.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[Source.NETWORK.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[Source.ACTUAL.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            $EnumSwitchMapping$0 = iArr;
        }
    }

    public qkm(Source source, boolean z) {
        this.b = source;
        this.c = z;
    }

    @Override // xsna.le6
    public final List<? extends DialogTheme> e(w2w w2wVar) {
        ArrayList all;
        w2wVar.getConfig().getClass();
        int[] iArr = a.$EnumSwitchMapping$0;
        Source source = this.b;
        int i = iArr[source.ordinal()];
        if (i != 1) {
            ukm ukmVar = ukm.a;
            if (i == 2) {
                long f1 = w2wVar.f1() / 1000;
                Long valueOf = Long.valueOf(w2wVar.I0().k().g("last_update_time_theme_request"));
                boolean z = this.c;
                ukmVar.a(w2wVar, this.b, z, (List) bz2.c(new olm(z, null, valueOf, 2), "DialogThemeGetAllCmd.DialogThemesLoadApiCmd"), false, false);
                w2wVar.I0().k().j("last_update_time_theme_request", f1);
                all = w2wVar.I0().i().getAll();
            } else {
                if (i != 3) {
                    throw new NoWhenBranchMatchedException();
                }
                long j = 1000;
                if ((w2wVar.I0().k().g("last_update_time_theme_request") * j) + TimeUtils.MILLISECONDS_PER_DAY < w2wVar.f1()) {
                    long f12 = w2wVar.f1() / j;
                    Long valueOf2 = Long.valueOf(w2wVar.I0().k().g("last_update_time_theme_request"));
                    boolean z2 = this.c;
                    ukmVar.a(w2wVar, this.b, z2, (List) bz2.c(new olm(z2, null, valueOf2, 2), "DialogThemeGetAllCmd.DialogThemesLoadApiCmd"), false, false);
                    w2wVar.I0().k().j("last_update_time_theme_request", f12);
                    all = w2wVar.I0().i().getAll();
                } else {
                    all = w2wVar.I0().i().getAll();
                }
            }
        } else {
            all = w2wVar.I0().i().getAll();
        }
        if (!all.isEmpty()) {
            Iterator it = all.iterator();
            while (it.hasNext()) {
                if (((DialogTheme) it.next()).e == null) {
                    w2wVar.L0(this, new klm(source, this.c));
                    return w2wVar.I0().i().getAll();
                }
            }
        }
        return all;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof qkm)) {
            return false;
        }
        qkm qkmVar = (qkm) obj;
        return this.b == qkmVar.b && this.c == qkmVar.c;
    }

    @Override // xsna.le6, xsna.e1w
    public final int hashCode() {
        return Boolean.hashCode(false) + qoy.b(qoy.b(this.b.hashCode() * 31, 31, this.c), 31, false);
    }

    @Override // xsna.e1w
    public final String toString() {
        StringBuilder sb = new StringBuilder("DialogThemeGetAllCmd(source=");
        sb.append(this.b);
        sb.append(", awaitNetwork=");
        return n23.b(sb, this.c, ", shouldLoadBackgroundFiles=false, shouldAwaitProcessingBackgroundResult=false)");
    }
}
