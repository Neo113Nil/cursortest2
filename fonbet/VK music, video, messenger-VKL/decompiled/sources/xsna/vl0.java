package xsna;

import android.content.DialogInterface;
import com.vk.clips.viewer.impl.feed.view.ClipFeedListFragment;
import com.vk.friends.requests.impl.requests.presentation.FriendRequestsFragment;
import com.vk.voip.ui.groupcalls.grid.GroupCallGridContainerView;
import xsna.cdz;

/* compiled from: R8$$SyntheticClass */
/* loaded from: classes7.dex */
public final /* synthetic */ class vl0 implements io.reactivex.rxjava3.functions.f {
    public final /* synthetic */ int b;
    public final /* synthetic */ Object c;

    public /* synthetic */ vl0(Object obj, int i) {
        this.b = i;
        this.c = obj;
    }

    @Override // io.reactivex.rxjava3.functions.f
    public final void accept(Object obj) {
        int i = this.b;
        Object obj2 = this.c;
        switch (i) {
            case 0:
                ((s6) obj2).invoke(obj);
                break;
            case 1:
                ((s6) obj2).invoke(obj);
                break;
            case 2:
                ((s6) obj2).invoke(obj);
                break;
            case 3:
                ((s6) obj2).invoke(obj);
                break;
            case 4:
                ((s6) obj2).invoke(obj);
                break;
            case 5:
                ((h57) obj2).invoke(obj);
                break;
            case 6:
                ((s6) obj2).invoke(obj);
                break;
            case 7:
                ((wq3) obj2).invoke(obj);
                break;
            case 8:
                ((com.vk.channels.impl.channel_screen.send_msg.e) obj2).invoke(obj);
                break;
            case 9:
                int i2 = ClipFeedListFragment.a2;
                ((cyc) obj2).invoke(obj);
                break;
            case 10:
                ((s6) obj2).invoke(obj);
                break;
            case 11:
                ((s6) obj2).invoke(obj);
                break;
            case 12:
                ((s6) obj2).invoke(obj);
                break;
            case 13:
                ((ii3) obj2).invoke(obj);
                break;
            case 14:
                ((cvg) obj2).invoke(obj);
                break;
            case 15:
                ((s6) obj2).invoke(obj);
                break;
            case 16:
                ((h57) obj2).invoke(obj);
                break;
            case 17:
                ((l3f) obj2).invoke(obj);
                break;
            case 18:
                ((a2a) obj2).invoke(obj);
                break;
            case 19:
                ((l3f) obj2).invoke(obj);
                break;
            case 20:
                ((e4n) obj2).e((h4n) obj);
                break;
            case 21:
                int i3 = FriendRequestsFragment.d0;
                ((hxl) obj2).invoke(obj);
                break;
            case 22:
                ((yd6) obj2).invoke(obj);
                break;
            case 23:
                ((wq3) obj2).invoke(obj);
                break;
            case 24:
                int i4 = GroupCallGridContainerView.i;
                ((hxl) obj2).invoke(obj);
                break;
            case 25:
                com.vk.core.view.components.spinner.c cVar = (com.vk.core.view.components.spinner.c) obj2;
                final io.reactivex.rxjava3.disposables.c cVar2 = (io.reactivex.rxjava3.disposables.c) obj;
                cVar.setOnCancelListener(new DialogInterface.OnCancelListener() { // from class: xsna.rax
                    @Override // android.content.DialogInterface.OnCancelListener
                    public final void onCancel(DialogInterface dialogInterface) {
                        io.reactivex.rxjava3.disposables.c.this.dispose();
                    }
                });
                cVar.show();
                break;
            case 26:
                ((jp5) obj2).invoke(obj);
                break;
            case 27:
                ((cdz.b) obj2).invoke(obj);
                break;
            case 28:
                ((wmc) obj2).invoke(obj);
                break;
            default:
                ((hxl) obj2).invoke(obj);
                break;
        }
    }
}
