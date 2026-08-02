package xsna;

import com.vk.im.engine.models.LongPollType;
import java.util.LinkedHashMap;
import java.util.Locale;
import java.util.concurrent.atomic.AtomicInteger;
import kotlin.NoWhenBranchMatchedException;
import xsna.fxv;

/* compiled from: LongPollSyncThreadFactory.kt */
/* loaded from: classes2.dex */
public final class b500 implements w8i {
    public final w2w b;
    public final y400 c;
    public final c500 d;
    public final LinkedHashMap e;

    /* compiled from: LongPollSyncThreadFactory.kt */
    public static final /* synthetic */ class a {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;

        static {
            int[] iArr = new int[LongPollType.values().length];
            try {
                iArr[LongPollType.CHANNELS.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[LongPollType.MESSAGES.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            $EnumSwitchMapping$0 = iArr;
        }
    }

    public b500(w2w w2wVar, y400 y400Var, d500 d500Var) {
        this.b = w2wVar;
        this.c = y400Var;
        this.d = d500Var;
        LongPollType[] values = LongPollType.values();
        int e = on00.e(values.length);
        LinkedHashMap linkedHashMap = new LinkedHashMap(e < 16 ? 16 : e);
        for (LongPollType longPollType : values) {
            linkedHashMap.put(longPollType, new AtomicInteger());
        }
        this.e = linkedHashMap;
    }

    public final a500 a(LongPollType longPollType, py6 py6Var, fxv.a aVar, String str) {
        String str2;
        w400 a2 = this.c.a(longPollType);
        bis bisVar = new bis();
        int[] iArr = a.$EnumSwitchMapping$0;
        int i = iArr[longPollType.ordinal()];
        if (i != 1 && i != 2) {
            throw new NoWhenBranchMatchedException();
        }
        w2w w2wVar = this.b;
        a500 a500Var = new a500(longPollType, w2wVar, py6Var, a2, this.d, bisVar, w2wVar.getConfig().e0, new xis(longPollType, 13), e9w.b("LongPollSyncThread-" + longPollType.toString().toLowerCase(Locale.ROOT) + '-' + ((AtomicInteger) this.e.get(longPollType)).getAndIncrement()), str, aVar, new m1y(this, 1));
        int i2 = iArr[a500Var.b.ordinal()];
        if (i2 == 1) {
            str2 = "im-long-poll-sync-channels-thread";
        } else {
            if (i2 != 2) {
                throw new NoWhenBranchMatchedException();
            }
            str2 = "im-long-poll-sync-thread";
        }
        a500Var.setName(str2);
        a500Var.setPriority(10);
        return a500Var;
    }
}
