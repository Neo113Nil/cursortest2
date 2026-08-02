package xsna;

import android.view.View;
import com.vk.dto.common.VerifyInfo;
import com.vk.dto.common.im.ImageList;
import com.vk.im.engine.models.messages.MsgFromChannel;
import com.vk.im.engine.models.messages.NestedMsg;
import com.vk.im.ui.views.dialogs.DialogItemView;
import com.vkontakte.android.R;
import xsna.eh3;
import xsna.fi3;

/* compiled from: ArchiveChannelItemAsDefaultDialogItemAdapterDelegate.kt */
/* loaded from: classes15.dex */
public final class xh3 extends vfz<fi3.d> {
    public final DialogItemView l;
    public final m0g0 m;
    public fi3.d n;
    public final com.vk.im.ui.formatters.a o;
    public final en30 p;
    public final vlm q;

    public xh3(DialogItemView dialogItemView, m0g0 m0g0Var) {
        super(dialogItemView);
        this.l = dialogItemView;
        this.m = m0g0Var;
        this.o = new com.vk.im.ui.formatters.a(this.itemView.getContext());
        this.p = new en30(this.itemView.getContext());
        this.q = new vlm(this.itemView.getContext());
        bwt0.i0(dialogItemView, new v9(this, 2));
        dialogItemView.setOnLongClickListener(new View.OnLongClickListener() { // from class: xsna.wh3
            @Override // android.view.View.OnLongClickListener
            public final boolean onLongClick(View view) {
                xh3 xh3Var = xh3.this;
                m0g0 m0g0Var2 = xh3Var.m;
                fi3.d dVar = xh3Var.n;
                if (dVar == null) {
                    dVar = null;
                }
                ((fh3) m0g0Var2.b).O(new eh3.f(dVar.b));
                return true;
            }
        });
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r12v13, types: [java.lang.CharSequence] */
    @Override // xsna.vfz
    public final void W5(fi3.d dVar) {
        String str;
        String str2;
        fi3.d dVar2 = dVar;
        this.n = dVar2;
        ImageList imageList = dVar2.c;
        int i = DialogItemView.e;
        DialogItemView dialogItemView = this.l;
        dialogItemView.f(imageList, null, false);
        fi3.d dVar3 = this.n;
        if (dVar3 == null) {
            dVar3 = null;
        }
        dialogItemView.p(dVar3.d, false);
        fi3.d dVar4 = this.n;
        if (dVar4 == null) {
            dVar4 = null;
        }
        MsgFromChannel msgFromChannel = dVar4.e;
        if (msgFromChannel == null) {
            dialogItemView.h(h6(), null);
        } else {
            String str3 = msgFromChannel.I.a;
            if (str3.length() == 0) {
                if (msgFromChannel.g8()) {
                    str = this.o.b(msgFromChannel);
                } else {
                    boolean p3 = msgFromChannel.p3();
                    en30 en30Var = this.p;
                    str = p3 ? en30Var.b(msgFromChannel, NestedMsg.Type.REPLY) : msgFromChannel.db() ? en30Var.b(msgFromChannel, NestedMsg.Type.FWD) : h6();
                }
                str3 = str;
            }
            dialogItemView.h(str3, null);
        }
        fi3.d dVar5 = this.n;
        if (dVar5 == null) {
            dVar5 = null;
        }
        MsgFromChannel msgFromChannel2 = dVar5.e;
        if (msgFromChannel2 != null) {
            long j = msgFromChannel2.g;
            StringBuffer stringBuffer = this.q.e;
            vlm.b(j, stringBuffer);
            str2 = stringBuffer.toString();
        } else {
            str2 = "";
        }
        dialogItemView.setTime(str2);
        fi3.d dVar6 = this.n;
        if (dVar6 == null) {
            dVar6 = null;
        }
        dialogItemView.setVerified(new VerifyInfo(dVar6.f, false, false, false, false, false, 62, null));
        fi3.d dVar7 = this.n;
        if (dVar7 == null) {
            dVar7 = null;
        }
        dialogItemView.setMutedVisible(dVar7.g);
        fi3.d dVar8 = this.n;
        if (dVar8 == null) {
            dVar8 = null;
        }
        dialogItemView.setUnreadInMuted(dVar8.g);
        fi3.d dVar9 = this.n;
        int i2 = (dVar9 != null ? dVar9 : null).h;
        if (i2 > 0) {
            dialogItemView.r(i2, true);
        } else {
            dialogItemView.u();
        }
    }

    public final String h6() {
        g2v.c().getClass();
        return this.itemView.getContext().getString(R.string.im_archive_channels_no_channel_posts);
    }
}
