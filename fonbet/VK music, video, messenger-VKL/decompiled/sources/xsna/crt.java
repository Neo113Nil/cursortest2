package xsna;

import com.vk.dto.messages.MessageSource;
import com.vk.im.engine.models.dialogs.ChatSettings;
import com.vk.im.engine.models.dialogs.Dialog;
import java.util.Comparator;
import xsna.brt;

/* compiled from: Comparisons.kt */
/* loaded from: classes2.dex */
public final class crt implements Comparator {
    public final /* synthetic */ int b;

    public /* synthetic */ crt(int i) {
        this.b = i;
    }

    @Override // java.util.Comparator
    public final int compare(Object obj, Object obj2) {
        int i;
        ChatSettings Hb;
        ChatSettings Hb2;
        switch (this.b) {
            case 0:
                MessageSource messageSource = ((kwe0) obj).d;
                int[] iArr = brt.a.$EnumSwitchMapping$0;
                int i2 = Integer.MAX_VALUE;
                switch (iArr[messageSource.ordinal()]) {
                    case 1:
                    case 2:
                        i = 0;
                        break;
                    case 3:
                    case 4:
                        i = 1;
                        break;
                    case 5:
                    case 6:
                        i = 2;
                        break;
                    case 7:
                    case 8:
                        i = 3;
                        break;
                    default:
                        i = Integer.MAX_VALUE;
                        break;
                }
                Integer valueOf = Integer.valueOf(i);
                switch (iArr[((kwe0) obj2).d.ordinal()]) {
                    case 1:
                    case 2:
                        i2 = 0;
                        break;
                    case 3:
                    case 4:
                        i2 = 1;
                        break;
                    case 5:
                    case 6:
                        i2 = 2;
                        break;
                    case 7:
                    case 8:
                        i2 = 3;
                        break;
                }
                return jw5.b(valueOf, Integer.valueOf(i2));
            default:
                Dialog dialog = (Dialog) obj;
                int i3 = 0;
                Integer valueOf2 = Integer.valueOf((!dialog.Gb() || (dialog.uc() && ((Hb2 = dialog.Hb()) == null || !Hb2.Q))) ? 1 : 0);
                Dialog dialog2 = (Dialog) obj2;
                if (!dialog2.Gb() || (dialog2.uc() && ((Hb = dialog2.Hb()) == null || !Hb.Q))) {
                    i3 = 1;
                }
                return jw5.b(valueOf2, Integer.valueOf(i3));
        }
    }
}
