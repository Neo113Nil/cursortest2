package xsna;

import android.view.MenuItem;
import androidx.appcompat.widget.Toolbar;
import com.vk.api.generated.messages.dto.MessagesScheduledCallItemDto;
import com.vk.dto.common.VideoFile;
import com.vk.libvideo.api.Subscription;
import com.vk.newsfeed.impl.posting.attachments.PostingAttachLocationFragment;
import com.vk.poll.fragments.PollResultsFragment;
import com.vk.video.ui.discovery.minimizable.c;
import com.vk.voip.dto.AudioDevice;
import com.vkontakte.android.R;
import com.vkontakte.android.api.ExtendedUserProfile;
import java.util.List;
import xsna.h8z0;
import xsna.hjz0;

/* compiled from: R8$$SyntheticClass */
/* loaded from: classes3.dex */
public final /* synthetic */ class xhb0 implements io.reactivex.rxjava3.functions.l, Toolbar.h, ptk0, io.reactivex.rxjava3.functions.g, io.reactivex.rxjava3.functions.c, h8z0.b, yads.ta0, yads.ng1 {
    public final /* synthetic */ int b;
    public final /* synthetic */ Object c;

    public /* synthetic */ xhb0(Object obj, int i) {
        this.b = i;
        this.c = obj;
    }

    @Override // xsna.h8z0.b
    public void a() {
        hjz0.a aVar;
        switch (this.b) {
            case 21:
                xyy0 xyy0Var = (xyy0) this.c;
                aVar = xyy0Var.a;
                String str = xyy0Var.k.F;
                break;
            default:
                t6z0 t6z0Var = (t6z0) this.c;
                aVar = t6z0Var.a;
                String str2 = t6z0Var.l.F;
                break;
        }
        yil0.d(aVar);
    }

    @Override // io.reactivex.rxjava3.functions.l
    public Object apply(Object obj) {
        int i = this.b;
        Object obj2 = this.c;
        switch (i) {
            case 0:
                return (List) ((fv90) obj2).invoke(obj);
            case 1:
            case 10:
            case 13:
            case 15:
            default:
                return (io.reactivex.rxjava3.core.t) ((n0m0) obj2).invoke(obj);
            case 2:
                return (List) ((fv90) obj2).invoke(obj);
            case 3:
                int i2 = PostingAttachLocationFragment.I0;
                return (io.reactivex.rxjava3.core.t) ((fv90) obj2).invoke(obj);
            case 4:
                return (vcc0) ((qey) obj2).invoke(obj);
            case 5:
                return (io.reactivex.rxjava3.core.b0) ((ya) obj2).invoke(obj);
            case 6:
                return (io.reactivex.rxjava3.core.b0) ((p6e0) obj2).invoke(obj);
            case 7:
                return (List) ((p6e0) obj2).invoke(obj);
            case 8:
                return (io.reactivex.rxjava3.core.e) ((nhm0) obj2).invoke(obj);
            case 9:
                return (ExtendedUserProfile) ((xzk0) obj2).invoke(obj);
            case 11:
                return (io.reactivex.rxjava3.core.t) ((b7r0) obj2).invoke(obj);
            case 12:
                return (VideoFile) ((vtt) obj2).invoke(obj);
            case 14:
                return (io.reactivex.rxjava3.core.t) ((c4q0) obj2).invoke(obj);
            case 16:
                return ((gv8) obj2).invoke(obj);
            case 17:
                return (it80) ((c4q0) obj2).invoke(obj);
            case 18:
                return (MessagesScheduledCallItemDto) ((p6e0) obj2).invoke(obj);
            case 19:
                return (AudioDevice) ((e4x0) obj2).invoke(obj);
        }
    }

    @Override // io.reactivex.rxjava3.functions.g
    public Object d(Object obj, Object obj2, Object obj3) {
        return (c.s0.e) ((zco) this.c).invoke(obj, obj2, obj3);
    }

    @Override // yads.ng1
    public void invoke(Object obj) {
        ((yads.nf2) obj).a((yads.ut1) this.c);
    }

    @Override // androidx.appcompat.widget.Toolbar.h
    public boolean onMenuItemClick(MenuItem menuItem) {
        PollResultsFragment pollResultsFragment = (PollResultsFragment) this.c;
        int i = PollResultsFragment.b0;
        if (menuItem.getItemId() == R.id.filters) {
            return pollResultsFragment.mo();
        }
        return false;
    }

    @Override // xsna.ptk0
    public void a(lm50 lm50Var) {
        ((vxq0) this.c).w.a(s3q0.a, (xxq0) lm50Var);
    }

    @Override // io.reactivex.rxjava3.functions.c
    public Object apply(Object obj, Object obj2) {
        return (Subscription) ((t8c) this.c).invoke(obj, obj2);
    }
}
