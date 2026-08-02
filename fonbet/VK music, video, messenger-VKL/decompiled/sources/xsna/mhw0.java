package xsna;

import com.vk.im.ui.calls.CallStartAction;
import com.vk.voip.api.dto.VoipCallOnStartAction;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.Set;
import kotlin.NoWhenBranchMatchedException;

/* compiled from: VoipCallOnStartActionConverter.kt */
/* loaded from: classes7.dex */
public final class mhw0 {

    /* compiled from: VoipCallOnStartActionConverter.kt */
    public static final /* synthetic */ class a {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;

        static {
            int[] iArr = new int[CallStartAction.SetupMediaOptions.MediaOptionState.values().length];
            try {
                iArr[CallStartAction.SetupMediaOptions.MediaOptionState.UNMUTED.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[CallStartAction.SetupMediaOptions.MediaOptionState.UNMUTED_BUT_MUTED_ONCE.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[CallStartAction.SetupMediaOptions.MediaOptionState.MUTED_PERMANENT.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            $EnumSwitchMapping$0 = iArr;
        }
    }

    public static LinkedHashSet a(Set set) {
        Object obj;
        Object obj2;
        LinkedHashSet linkedHashSet = new LinkedHashSet();
        Iterator it = set.iterator();
        while (it.hasNext()) {
            CallStartAction callStartAction = (CallStartAction) it.next();
            if (callStartAction instanceof CallStartAction.f) {
                obj2 = VoipCallOnStartAction.g.a;
            } else {
                if (callStartAction instanceof CallStartAction.e) {
                    ((CallStartAction.e) callStartAction).getClass();
                    obj = new VoipCallOnStartAction.f(false);
                } else if (callStartAction instanceof CallStartAction.a) {
                    obj = new VoipCallOnStartAction.b(((CallStartAction.a) callStartAction).a);
                } else if (callStartAction instanceof CallStartAction.b) {
                    obj = new VoipCallOnStartAction.c(((CallStartAction.b) callStartAction).a);
                } else if (callStartAction instanceof CallStartAction.d) {
                    ((CallStartAction.d) callStartAction).getClass();
                    obj = new VoipCallOnStartAction.e();
                } else {
                    if (!(callStartAction instanceof CallStartAction.c)) {
                        if (!(callStartAction instanceof CallStartAction.SetupMediaOptions)) {
                            throw new NoWhenBranchMatchedException();
                        }
                        ((CallStartAction.SetupMediaOptions) callStartAction).getClass();
                        int[] iArr = a.$EnumSwitchMapping$0;
                        throw null;
                    }
                    ((CallStartAction.c) callStartAction).getClass();
                    obj = new VoipCallOnStartAction.d();
                }
                obj2 = obj;
            }
            linkedHashSet.add(obj2);
        }
        return linkedHashSet;
    }
}
