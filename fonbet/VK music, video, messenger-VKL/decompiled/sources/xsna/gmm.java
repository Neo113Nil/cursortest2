package xsna;

import com.vkontakte.android.R;
import java.util.ArrayList;
import xsna.fmm;

/* compiled from: DialogUnreadMsgMediator.kt */
/* loaded from: classes2.dex */
public final class gmm implements fmm {
    public final com.vk.movika.sdk.android.defaultplayer.layout.a a;
    public final ArrayList b = new ArrayList();
    public int c;
    public int d;
    public int e;

    public gmm(com.vk.movika.sdk.android.defaultplayer.layout.a aVar) {
        this.a = aVar;
    }

    @Override // xsna.fmm
    public final void a(com.vk.im.ui.components.viewcontrollers.msg_list.adapter.vh.a aVar) {
        this.b.remove(aVar);
    }

    @Override // xsna.fmm
    public final String b(boolean z, Integer num) {
        String string;
        if (num == null) {
            return "";
        }
        int intValue = num.intValue();
        com.vk.movika.sdk.android.defaultplayer.layout.a aVar = this.a;
        if (!z ? intValue <= this.d : intValue <= this.c) {
            string = aVar != null ? aVar.a.getString(R.string.vkim_accessibility_msg_unread) : null;
            return string == null ? "" : string;
        }
        string = aVar != null ? aVar.a.getString(R.string.vkim_accessibility_msg_read) : null;
        return string == null ? "" : string;
    }

    @Override // xsna.fmm
    public final void c(fmm.a aVar) {
        this.b.add(aVar);
    }

    @Override // xsna.fmm
    public final int d() {
        return this.e;
    }
}
