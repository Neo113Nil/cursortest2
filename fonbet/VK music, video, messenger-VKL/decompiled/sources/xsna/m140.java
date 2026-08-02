package xsna;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.appcompat.widget.Toolbar;
import com.vk.im.ui.components.common.PinnedMsgAction;
import com.vkontakte.android.R;

/* compiled from: MsgViewHeaderVc.kt */
/* loaded from: classes2.dex */
public final class m140 {
    public final View a;
    public final Context b;
    public final Toolbar c;
    public final bpn0 d;
    public boolean e;
    public boolean f;
    public com.vk.movika.sdk.base.asset.b g;

    /* compiled from: MsgViewHeaderVc.kt */
    public static final /* synthetic */ class a {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;

        static {
            int[] iArr = new int[PinnedMsgAction.values().length];
            try {
                iArr[PinnedMsgAction.SHOW.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[PinnedMsgAction.HIDE.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[PinnedMsgAction.UNPIN.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            $EnumSwitchMapping$0 = iArr;
        }
    }

    public m140(LayoutInflater layoutInflater, ViewGroup viewGroup) {
        View inflate = layoutInflater.inflate(R.layout.vkim_msg_view_header, viewGroup, false);
        this.a = inflate;
        this.b = layoutInflater.getContext();
        Toolbar toolbar = (Toolbar) inflate.findViewById(R.id.toolbar);
        this.c = toolbar;
        this.d = new bpn0(new jw30(this, 1));
        toolbar.setNavigationOnClickListener(new mo3(this, 10));
        toolbar.setOnMenuItemClickListener(new yzt(this, 7));
    }
}
