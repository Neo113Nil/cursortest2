package xsna;

import android.content.Context;
import com.vk.voip.ui.call_list.scheduled.feature.model.ScheduledCallHighlightItem;
import com.vk.voip.ui.scheduled.creation.ui.VoipScheduleCallViewState;
import java.util.List;
import xsna.fxw0;

/* compiled from: VoipScheduleCallContentStateMapper.kt */
/* loaded from: classes7.dex */
public abstract class kww0 {
    public final Context a;

    /* compiled from: VoipScheduleCallContentStateMapper.kt */
    public static final /* synthetic */ class a {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;

        static {
            int[] iArr = new int[ScheduledCallHighlightItem.values().length];
            try {
                iArr[ScheduledCallHighlightItem.NAME.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            $EnumSwitchMapping$0 = iArr;
        }
    }

    public kww0(Context context) {
        this.a = context;
    }

    public abstract List<VoipScheduleCallViewState.ScreenState.Item> a(fxw0.a aVar);
}
