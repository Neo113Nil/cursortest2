package xsna;

import java.util.AbstractList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import kotlin.collections.EmptyList;
import one.video.player.error.OneVideoPlaybackException;

/* compiled from: BrokenSourceErrorResolver.kt */
/* loaded from: classes2.dex */
public final class kk8 implements owp {
    public final boolean a;
    public uht0 b;

    /* compiled from: BrokenSourceErrorResolver.kt */
    public static final /* synthetic */ class a {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;

        static {
            int[] iArr = new int[OneVideoPlaybackException.ErrorCode.values().length];
            try {
                iArr[OneVideoPlaybackException.ErrorCode.PARSING_MANIFEST_MALFORMED.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[OneVideoPlaybackException.ErrorCode.PARSING_CONTAINER_MALFORMED.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[OneVideoPlaybackException.ErrorCode.IO_UNSPECIFIED.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            $EnumSwitchMapping$0 = iArr;
        }
    }

    public kk8(boolean z) {
        this.a = z;
    }

    @Override // xsna.owp
    public final List<avp> a(Throwable th, m7q m7qVar, long j) {
        if (m7qVar == null) {
            return EmptyList.b;
        }
        sht0 e = jgz.e(m7qVar);
        if (e instanceof mv70) {
            return EmptyList.b;
        }
        if (th instanceof OneVideoPlaybackException) {
            OneVideoPlaybackException oneVideoPlaybackException = (OneVideoPlaybackException) th;
            if (oneVideoPlaybackException.j() == OneVideoPlaybackException.Type.SOURCE) {
                int i = a.$EnumSwitchMapping$0[oneVideoPlaybackException.d().ordinal()];
                if (i == 1 || i == 2 || (i == 3 && this.a)) {
                    uht0 uht0Var = this.b;
                    sht0 sht0Var = null;
                    if (uht0Var != null) {
                        AbstractList abstractList = uht0Var.b;
                        Iterator it = abstractList.iterator();
                        int i2 = 0;
                        while (true) {
                            if (!it.hasNext()) {
                                i2 = -1;
                                break;
                            }
                            if (epx.f(e.b, ((sht0) it.next()).b)) {
                                break;
                            }
                            i2++;
                        }
                        Integer valueOf = Integer.valueOf(i2);
                        if (i2 == -1) {
                            valueOf = null;
                        }
                        if (valueOf != null) {
                            sht0Var = (sht0) j5g.b0(valueOf.intValue() + 1, abstractList);
                        }
                    }
                    sht0 sht0Var2 = sht0Var;
                    return sht0Var2 != null ? Collections.singletonList(new unn0(m7q.a(m7qVar, sht0Var2, null, null, 0, false, false, null, j, null, null, false, 133955567))) : EmptyList.b;
                }
            }
        }
        return EmptyList.b;
    }

    @Override // xsna.owp
    public final void reset() {
    }
}
