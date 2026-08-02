package xsna;

import com.vk.clips.sdk.shared.api.deps.video.SdkClipVideoFile;
import com.vk.clips.sdk.shared.api.routing.models.ClipFeedTab;
import java.util.concurrent.atomic.AtomicReference;
import kotlin.NoWhenBranchMatchedException;

/* compiled from: ClipTrendsEngagementUIStateHelperImpl.kt */
/* loaded from: classes17.dex */
public final class wdd implements vdd {
    public final yof a;
    public final AtomicReference<String> b = new AtomicReference<>(null);
    public final AtomicReference<String> c = new AtomicReference<>(null);

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    /* compiled from: ClipTrendsEngagementUIStateHelperImpl.kt */
    public static final class a {
        private static final /* synthetic */ zrp $ENTRIES;
        private static final /* synthetic */ a[] $VALUES;
        public static final a ACTION_BUTTON;
        public static final a BADGE;

        static {
            a aVar = new a("BADGE", 0);
            BADGE = aVar;
            a aVar2 = new a("ACTION_BUTTON", 1);
            ACTION_BUTTON = aVar2;
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

    /* compiled from: ClipTrendsEngagementUIStateHelperImpl.kt */
    public static final /* synthetic */ class b {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;

        static {
            int[] iArr = new int[a.values().length];
            try {
                iArr[a.BADGE.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[a.ACTION_BUTTON.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            $EnumSwitchMapping$0 = iArr;
        }
    }

    public wdd(zof zofVar) {
        this.a = zofVar;
    }

    @Override // xsna.vdd
    public final boolean a(ClipFeedTab clipFeedTab, SdkClipVideoFile sdkClipVideoFile) {
        return e(clipFeedTab, sdkClipVideoFile.a1(), a.BADGE, this.b);
    }

    @Override // xsna.vdd
    public final void b(ClipFeedTab clipFeedTab, String str) {
        f(clipFeedTab, str, this.b);
    }

    @Override // xsna.vdd
    public final boolean c(ClipFeedTab clipFeedTab, SdkClipVideoFile sdkClipVideoFile) {
        return e(clipFeedTab, sdkClipVideoFile.a1(), a.ACTION_BUTTON, this.c);
    }

    @Override // xsna.vdd
    public final void d(ClipFeedTab clipFeedTab, String str) {
        f(clipFeedTab, str, this.c);
    }

    public final boolean e(ClipFeedTab clipFeedTab, String str, a aVar, AtomicReference<String> atomicReference) {
        String str2;
        String str3;
        yof yofVar = this.a;
        if (yofVar.J().a) {
            ClipFeedTab.Discover.b.getClass();
            boolean Ab = ClipFeedTab.Ab(clipFeedTab);
            int i = b.$EnumSwitchMapping$0[aVar.ordinal()];
            if (i != 1) {
                if (i == 2) {
                    return Ab || !yofVar.J().b || (str3 = atomicReference.get()) == null || str3.equals(str);
                }
                throw new NoWhenBranchMatchedException();
            }
            if (!Ab) {
                return !yofVar.J().b || (str2 = atomicReference.get()) == null || str2.equals(str);
            }
        }
        return false;
    }

    public final void f(ClipFeedTab clipFeedTab, String str, AtomicReference<String> atomicReference) {
        if (this.a.J().a) {
            ClipFeedTab.Discover.b.getClass();
            if (ClipFeedTab.Ab(clipFeedTab)) {
                return;
            }
            while (!atomicReference.compareAndSet(null, str) && atomicReference.get() == null) {
            }
        }
    }
}
