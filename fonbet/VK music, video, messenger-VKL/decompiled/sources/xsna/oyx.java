package xsna;

import androidx.work.WorkInfo;
import com.vk.log.L;

/* compiled from: JobStateObserverAdapter.kt */
/* loaded from: classes.dex */
public final class oyx implements fr70<WorkInfo> {
    public final xa40 b;

    /* compiled from: JobStateObserverAdapter.kt */
    public static final /* synthetic */ class a {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;

        static {
            int[] iArr = new int[WorkInfo.State.values().length];
            try {
                iArr[WorkInfo.State.ENQUEUED.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[WorkInfo.State.RUNNING.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[WorkInfo.State.CANCELLED.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            $EnumSwitchMapping$0 = iArr;
        }
    }

    public oyx(xa40 xa40Var) {
        this.b = xa40Var;
    }

    @Override // xsna.fr70
    public final void a(WorkInfo workInfo) {
        WorkInfo workInfo2 = workInfo;
        StringBuilder sb = new StringBuilder("New work info status = ");
        sb.append(workInfo2 != null ? workInfo2.b : null);
        L.e("WM-", sb.toString());
        WorkInfo.State state = workInfo2 != null ? workInfo2.b : null;
        int i = state == null ? -1 : a.$EnumSwitchMapping$0[state.ordinal()];
        xa40 xa40Var = this.b;
        if (i == 1 || i == 2) {
            xa40Var.invoke(Boolean.TRUE);
        } else {
            if (i != 3) {
                return;
            }
            xa40Var.invoke(Boolean.FALSE);
        }
    }
}
