package xsna;

import android.content.Context;
import android.view.MotionEvent;
import com.vk.dto.common.Attachment;
import com.vk.stickers.autosuggest.QuickStickerSuggestState;
import com.vk.writebar.WriteBar;
import com.vkontakte.android.R;
import com.vkontakte.android.attachments.AlbumAttachment;
import com.vkontakte.android.attachments.DocumentAttachment;
import com.vkontakte.android.attachments.PhotoAttachment;
import com.vkontakte.android.attachments.VideoAttachment;
import java.util.Arrays;
import java.util.LinkedHashSet;
import java.util.concurrent.TimeUnit;
import xsna.zbb;

/* compiled from: ChannelMsgSendVc.kt */
/* loaded from: classes16.dex */
public final class g6b implements h1y0, g530, gz20 {
    public Object b;

    public /* synthetic */ g6b(Object obj) {
        this.b = obj;
    }

    @Override // xsna.h1y0
    public void H0() {
        zbb.b bVar = ((com.vk.channels.impl.channel_screen.send_msg.a) this.b).E;
        if (bVar == null) {
            bVar = null;
        }
        bVar.H0();
    }

    @Override // xsna.g530
    public void H2() {
        ((com.vk.im.video.g) this.b).h();
    }

    @Override // xsna.h1y0
    public void U1() {
        zbb.b bVar = ((com.vk.channels.impl.channel_screen.send_msg.a) this.b).E;
        if (bVar == null) {
            bVar = null;
        }
        bVar.U1();
    }

    @Override // xsna.h1y0
    public boolean a(MotionEvent motionEvent) {
        return false;
    }

    public String b(long j) {
        Context context = (Context) this.b;
        TimeUnit timeUnit = TimeUnit.MILLISECONDS;
        return timeUnit.toSeconds(j) < 60 ? enj.f(R.plurals.time_seconds, (int) timeUnit.toSeconds(j), context) : timeUnit.toMinutes(j) < 60 ? enj.f(R.plurals.time_ago_minute, (int) timeUnit.toMinutes(j), context) : enj.f(R.plurals.time_ago_hour, (int) timeUnit.toHours(j), context);
    }

    @Override // xsna.h1y0
    public void b0() {
        zbb.b bVar = ((com.vk.channels.impl.channel_screen.send_msg.a) this.b).E;
        if (bVar == null) {
            bVar = null;
        }
        bVar.b0();
    }

    @Override // xsna.h1y0
    public void c(boolean z) {
        xgy xgyVar;
        com.vk.channels.impl.channel_screen.send_msg.a aVar = (com.vk.channels.impl.channel_screen.send_msg.a) this.b;
        int i = ify.a;
        int i2 = 1;
        if (ify.e(ify.c) || ((xgyVar = aVar.F) != null && xgyVar.e())) {
            mhy.b(aVar.o);
            com.vk.channels.impl.channel_screen.send_msg.a.G(aVar.F);
            WriteBar writeBar = aVar.x;
            if (writeBar == null) {
                writeBar = null;
            }
            bwt0.j(writeBar, new ln9(aVar, z, i2));
        } else {
            zbb.b bVar = aVar.E;
            if (bVar == null) {
                bVar = null;
            }
            bVar.Kb(z);
        }
        WriteBar writeBar2 = aVar.x;
        (writeBar2 != null ? writeBar2 : null).setQuickStickerSuggestState(QuickStickerSuggestState.DISABLED);
    }

    public String e(long j) {
        if (j <= 0) {
            return "00:00";
        }
        TimeUnit timeUnit = TimeUnit.MILLISECONDS;
        if (timeUnit.toMinutes(j) < 60) {
            return String.format("%02d:%02d", Arrays.copyOf(new Object[]{Long.valueOf(timeUnit.toMinutes(j)), Long.valueOf(timeUnit.toSeconds(j) % 60)}, 2));
        }
        return enj.f(R.plurals.time_ago_hour, (int) timeUnit.toHours(j), (Context) this.b);
    }

    public boolean f(Attachment attachment) {
        Boolean b = ((ybc0) this.b).b(attachment);
        if (b != null) {
            return b.booleanValue();
        }
        if (((attachment instanceof PhotoAttachment) && !(attachment instanceof AlbumAttachment)) || (attachment instanceof VideoAttachment)) {
            return true;
        }
        if (!(attachment instanceof DocumentAttachment)) {
            return false;
        }
        DocumentAttachment documentAttachment = (DocumentAttachment) attachment;
        return documentAttachment.Ib() && !documentAttachment.x5();
    }

    @Override // xsna.gz20
    public void onCancel() {
        ((hc40) this.b).c.invoke();
    }

    public g6b(int i) {
        switch (i) {
            case 6:
                this.b = new LinkedHashSet();
                break;
            case 7:
            default:
                this.b = new f4z();
                break;
            case 8:
                this.b = new ngj0();
                break;
        }
    }

    @Override // xsna.h1y0
    public void d() {
    }

    @Override // xsna.g530
    public void g3() {
    }
}
