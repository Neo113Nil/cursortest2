package xsna;

import android.content.DialogInterface;
import androidx.fragment.app.FragmentActivity;
import com.vk.common.links.LaunchContext;
import com.vkontakte.android.R;
import com.vkontakte.android.attachments.LinkAttachment;
import xsna.e5i;

/* compiled from: R8$$SyntheticClass */
/* loaded from: classes5.dex */
public final /* synthetic */ class d5i implements DialogInterface.OnClickListener {
    public final /* synthetic */ int b;
    public final /* synthetic */ Object c;
    public final /* synthetic */ Object d;

    public /* synthetic */ d5i(int i, Object obj, Object obj2) {
        this.b = i;
        this.c = obj;
        this.d = obj2;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // android.content.DialogInterface.OnClickListener
    public final void onClick(DialogInterface dialogInterface, int i) {
        switch (this.b) {
            case 0:
                e5i.a aVar = (e5i.a) this.c;
                String str = (String) this.d;
                if (i == 0) {
                    maz.c(((e5i) aVar.m).h.f(), aVar.itemView.getContext(), str, LaunchContext.A, null, null, 24);
                    aVar.q6(str, "long_tap");
                    break;
                } else if (i == 1) {
                    mhy.a(aVar.itemView.getContext(), str);
                    cvk.u(R.string.link_copied, false);
                    aVar.q6(str, "copy");
                    break;
                } else if (i == 2) {
                    kbj0.e((kbj0) ((e5i) aVar.m).h.A0.getValue(), aVar.itemView.getContext(), new LinkAttachment(str), false, null, false, null, 60);
                    aVar.q6(str, "share");
                    break;
                }
                break;
            default:
                xxt xxtVar = (xxt) this.c;
                FragmentActivity fragmentActivity = (FragmentActivity) this.d;
                m4s.y(fragmentActivity, new uxt(xxtVar, fragmentActivity, null));
                break;
        }
    }
}
