package xsna;

import android.os.Bundle;
import android.os.Handler;
import android.os.Looper;
import android.os.Message;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import com.ironsource.X3;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.Random;
import one.video.pixels.model.PixelParam;
import one.video.player.OneVideoPlayer;
import xsna.nza0;

/* compiled from: TemplatePixelsHandler.java */
/* loaded from: classes8.dex */
public final class u8o0 extends Handler {

    @NonNull
    public final ky70 a;

    @NonNull
    public final nza0.b b;

    @NonNull
    public final Random c;

    public u8o0(Looper looper, ky70 ky70Var, nza0.b bVar) {
        super(looper);
        this.c = new Random();
        this.a = ky70Var;
        this.b = bVar;
    }

    public final long a(@Nullable OneVideoPlayer oneVideoPlayer, long j) {
        if (oneVideoPlayer != null) {
            return oneVideoPlayer.j() != null && oneVideoPlayer.j().c ? (System.currentTimeMillis() - (this.c.nextInt(20000) + 10000)) / 1000 : oneVideoPlayer.getCurrentPosition() / 1000;
        }
        return j / 1000;
    }

    @Override // android.os.Handler
    public final void handleMessage(@NonNull Message message) {
        int parseInt;
        ArrayList arrayList;
        super.handleMessage(message);
        int i = message.what;
        ky70 ky70Var = this.a;
        nza0.b bVar = this.b;
        switch (i) {
            case 0:
            case 1:
            case 2:
            case 3:
            case 4:
            case 5:
            case 6:
                zpa0 zpa0Var = (zpa0) message.obj;
                long a = a(bVar.a, message.getData().getLong(X3.i.L));
                if (!hasMessages(6, message.obj)) {
                    ky70Var.a(zpa0Var, a);
                    break;
                }
                break;
            case 7:
                zpa0 zpa0Var2 = (zpa0) message.obj;
                boolean z = message.getData().getBoolean("firstMessage", false);
                if (hasMessages(7, message.obj)) {
                    removeMessages(7, message.obj);
                    z = true;
                }
                OneVideoPlayer oneVideoPlayer = bVar.a;
                if (oneVideoPlayer != null && oneVideoPlayer.getState() == OneVideoPlayer.State.PLAYING && !z) {
                    ky70Var.a(zpa0Var2, a(oneVideoPlayer, message.getData().getLong(X3.i.L)));
                }
                PixelParam pixelParam = null;
                if ((zpa0Var2 instanceof di90) && (arrayList = ((di90) zpa0Var2).d) != null) {
                    Iterator it = arrayList.iterator();
                    while (true) {
                        if (it.hasNext()) {
                            PixelParam pixelParam2 = (PixelParam) it.next();
                            if ("interval".equals(pixelParam2.b)) {
                                pixelParam = pixelParam2;
                            }
                        }
                    }
                }
                if (pixelParam != null) {
                    try {
                        parseInt = Integer.parseInt(pixelParam.c);
                    } catch (NumberFormatException unused) {
                    }
                    Message message2 = new Message();
                    message2.what = 7;
                    Bundle bundle = new Bundle();
                    bundle.putLong(X3.i.L, message.getData().getLong(X3.i.L));
                    bundle.putBoolean("firstMessage", false);
                    message2.obj = zpa0Var2;
                    message2.setData(bundle);
                    sendMessageDelayed(message2, parseInt * 1000);
                    break;
                }
                parseInt = 0;
                Message message22 = new Message();
                message22.what = 7;
                Bundle bundle2 = new Bundle();
                bundle2.putLong(X3.i.L, message.getData().getLong(X3.i.L));
                bundle2.putBoolean("firstMessage", false);
                message22.obj = zpa0Var2;
                message22.setData(bundle2);
                sendMessageDelayed(message22, parseInt * 1000);
                break;
        }
    }
}
