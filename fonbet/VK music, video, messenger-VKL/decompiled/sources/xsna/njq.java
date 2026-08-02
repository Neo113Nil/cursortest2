package xsna;

import androidx.recyclerview.widget.RecyclerView;
import com.vk.dto.common.VerifyInfo;
import com.vk.im.ui.views.dialogs.DialogItemView;
import com.vkontakte.android.R;
import xsna.e3m;
import xsna.hny;

/* compiled from: FakeDialogVh.kt */
/* loaded from: classes2.dex */
public class njq extends RecyclerView.e0 {
    public final DialogItemView l;
    public final vlm m;
    public final StringBuffer n;

    public njq(DialogItemView dialogItemView, int i, int i2) {
        super(dialogItemView);
        DialogItemView dialogItemView2 = (DialogItemView) this.itemView;
        this.l = dialogItemView2;
        this.m = new vlm(dialogItemView2.getContext());
        this.n = new StringBuffer();
        hny hnyVar = new hny(dialogItemView2.getContext());
        hnyVar.a(iah0.a(1000), R.color.vk_blue_200);
        e3m.a aVar = e3m.a;
        hnyVar.b.add(new hny.e(new baf0(m33.a(i, hnyVar.a), 0)));
        dialogItemView.f(null, hnyVar, false);
        dialogItemView.i();
        dialogItemView.p(dialogItemView.getContext().getString(i2), false);
        dialogItemView.k();
        dialogItemView.setErrorVisible(false);
        dialogItemView.setDonutIconVisible(false);
        dialogItemView.setCasperIconVisible(false);
        dialogItemView.setWritingDisabledIconVisible(false);
        dialogItemView.setVerified(new VerifyInfo(false, false, false, false, false, false, 63, null));
        dialogItemView.setUnreadOutVisible(false);
        dialogItemView.setReadOutVisible(false);
        dialogItemView.setSendingVisible(false);
        dialogItemView.setMutedVisible(false);
        dialogItemView.o();
        dialogItemView.j(DialogItemView.ExtraIcon.NONE, false);
        dialogItemView.u();
    }

    public final void V5(int i, Long l, String str) {
        DialogItemView dialogItemView = this.l;
        dialogItemView.r(i, false);
        String str2 = null;
        dialogItemView.h(str, null);
        if (l != null) {
            long longValue = l.longValue();
            StringBuffer stringBuffer = this.n;
            stringBuffer.setLength(0);
            g2v.c().getClass();
            this.m.getClass();
            vlm.b(longValue, stringBuffer);
            str2 = stringBuffer.toString();
        }
        if (str2 == null) {
            str2 = "";
        }
        dialogItemView.setTime(str2);
    }
}
