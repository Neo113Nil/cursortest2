package xsna;

import android.os.Bundle;
import android.os.Looper;
import android.os.Message;
import androidx.annotation.NonNull;
import com.ironsource.X3;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import one.video.pixels.model.PixelParam;
import xsna.nza0;

/* compiled from: TemplatePixelsProcessor.java */
/* loaded from: classes8.dex */
public final class v8o0 implements pqa0 {
    public final u8o0 a;

    public v8o0(@NonNull ky70 ky70Var, @NonNull nza0.b bVar) {
        this.a = new u8o0(Looper.getMainLooper(), ky70Var, bVar);
    }

    /* JADX WARN: Removed duplicated region for block: B:21:0x0051  */
    /* JADX WARN: Removed duplicated region for block: B:26:0x0062 A[EDGE_INSN: B:26:0x0062->B:27:0x0062 BREAK  A[LOOP:1: B:19:0x004b->B:25:?], SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:35:0x0064 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    @Override // xsna.pqa0
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void a(@NonNull zpa0 zpa0Var, long j) {
        ArrayList arrayList;
        PixelParam pixelParam;
        int parseInt;
        ArrayList arrayList2;
        Iterator it;
        ArrayList arrayList3;
        int i = zpa0Var.b;
        List<String> list = zpa0Var.a;
        PixelParam pixelParam2 = null;
        int i2 = 0;
        u8o0 u8o0Var = this.a;
        if (i != 7) {
            if (list != null) {
                if (i == 0) {
                    u8o0Var.removeCallbacksAndMessages(null);
                }
                if (i == 5) {
                    u8o0Var.removeMessages(7);
                }
                Message message = new Message();
                message.what = i;
                Bundle bundle = new Bundle();
                bundle.putLong(X3.i.L, j);
                message.obj = zpa0Var;
                message.setData(bundle);
                if ((zpa0Var instanceof di90) && (arrayList = ((di90) zpa0Var).d) != null) {
                    Iterator it2 = arrayList.iterator();
                    while (true) {
                        if (!it2.hasNext()) {
                            break;
                        }
                        PixelParam pixelParam3 = (PixelParam) it2.next();
                        if ("start".equals(pixelParam3.b)) {
                            pixelParam2 = pixelParam3;
                            break;
                        }
                    }
                }
                if (pixelParam2 != null) {
                    try {
                        i2 = Integer.parseInt(pixelParam2.c);
                    } catch (NumberFormatException unused) {
                    }
                }
                u8o0Var.sendMessageDelayed(message, i2 * 1000);
                if (i == 4) {
                    u8o0Var.postDelayed(new hv1(this, 18), r5 + 1);
                    return;
                }
                return;
            }
            return;
        }
        boolean z = zpa0Var instanceof di90;
        if (z && (arrayList3 = ((di90) zpa0Var).d) != null) {
            Iterator it3 = arrayList3.iterator();
            while (it3.hasNext()) {
                pixelParam = (PixelParam) it3.next();
                if ("start".equals(pixelParam.b)) {
                    break;
                }
            }
        }
        pixelParam = null;
        if (pixelParam != null) {
            try {
                parseInt = Integer.parseInt(pixelParam.c);
            } catch (NumberFormatException unused2) {
            }
            if (z && (arrayList2 = ((di90) zpa0Var).d) != null) {
                it = arrayList2.iterator();
                while (true) {
                    if (it.hasNext()) {
                        break;
                    }
                    PixelParam pixelParam4 = (PixelParam) it.next();
                    if ("interval".equals(pixelParam4.b)) {
                        pixelParam2 = pixelParam4;
                        break;
                    }
                }
            }
            if (pixelParam2 != null) {
                try {
                    i2 = Integer.parseInt(pixelParam2.c);
                } catch (NumberFormatException unused3) {
                }
            }
            if (list != null || i2 <= 0) {
            }
            Message message2 = new Message();
            message2.what = 7;
            Bundle bundle2 = new Bundle();
            bundle2.putLong(X3.i.L, j);
            bundle2.putBoolean("firstMessage", !u8o0Var.hasMessages(7, zpa0Var));
            message2.obj = zpa0Var;
            message2.setData(bundle2);
            u8o0Var.sendMessageDelayed(message2, parseInt * 1000);
            return;
        }
        parseInt = 0;
        if (z) {
            it = arrayList2.iterator();
            while (true) {
                if (it.hasNext()) {
                }
            }
        }
        if (pixelParam2 != null) {
        }
        if (list != null) {
        }
    }

    @Override // xsna.pqa0
    public final boolean b(@NonNull zpa0 zpa0Var) {
        return (zpa0Var instanceof rrj0) || (zpa0Var instanceof di90);
    }

    @Override // xsna.pqa0
    public final void release() {
        this.a.removeCallbacksAndMessages(null);
    }
}
