package xsna;

import android.view.View;
import com.vk.dto.common.VerifyInfo;
import com.vk.dto.common.im.ImageList;
import com.vk.im.engine.models.stories.ImStoryState;
import com.vk.im.ui.views.dialogs.DialogItemView;
import java.lang.ref.WeakReference;

/* compiled from: ChannelItemViewHolder.kt */
/* loaded from: classes16.dex */
public final class n0b extends vfz<j0b> {
    public final DialogItemView l;
    public final lgb m;
    public j0b n;

    public n0b(DialogItemView dialogItemView, final lgb lgbVar) {
        super(dialogItemView);
        this.l = dialogItemView;
        this.m = lgbVar;
        bwt0.i0(dialogItemView, new k22(1, lgbVar, this));
        dialogItemView.setOnLongClickListener(new View.OnLongClickListener() { // from class: xsna.l0b
            @Override // android.view.View.OnLongClickListener
            public final boolean onLongClick(View view) {
                j0b j0bVar = this.n;
                if (j0bVar == null) {
                    j0bVar = null;
                }
                lgb.this.r(j0bVar);
                return true;
            }
        });
    }

    @Override // xsna.vfz
    public final void W5(j0b j0bVar) {
        j0b j0bVar2 = j0bVar;
        final long j = j0bVar2.b;
        boolean z = j0bVar2.i;
        j0b j0bVar3 = this.n;
        boolean z2 = j0bVar3 != null && j0bVar3.b == j;
        this.n = j0bVar2;
        ImageList imageList = j0bVar2.c;
        int i = DialogItemView.e;
        DialogItemView dialogItemView = this.l;
        dialogItemView.f(imageList, null, false);
        final ImStoryState imStoryState = j0bVar2.j;
        dialogItemView.setStories(imStoryState);
        if (imStoryState.i()) {
            dialogItemView.setAvatarViewClickListener(new View.OnClickListener() { // from class: xsna.m0b
                @Override // android.view.View.OnClickListener
                public final void onClick(View view) {
                    n0b.this.m.w(j, imStoryState, new WeakReference<>(view));
                }
            });
        } else {
            dialogItemView.setAvatarViewClickListener(null);
        }
        dialogItemView.p(j0bVar2.d, false);
        dialogItemView.h(j0bVar2.e, null);
        dialogItemView.setMutedVisible(z);
        dialogItemView.setHiddenVisible(j0bVar2.m);
        int i2 = j0bVar2.h;
        if (i2 > 0) {
            dialogItemView.setUnreadInMuted(z);
            dialogItemView.r(i2, z2);
        } else {
            dialogItemView.u();
        }
        String str = j0bVar2.f;
        CharSequence charSequence = j0bVar2.g;
        dialogItemView.setTime(str);
        dialogItemView.setAccessibilityTime(charSequence);
        boolean z3 = j0bVar2.k;
        boolean z4 = j0bVar2.l;
        dialogItemView.o();
        dialogItemView.setCasperIconVisible(false);
        dialogItemView.setWritingDisabledIconVisible(false);
        dialogItemView.setImageStatusVisible(false);
        dialogItemView.setDonutIconVisible(false);
        dialogItemView.setVerified(new VerifyInfo(z3, false, false, false, false, false, 62, null));
        dialogItemView.k();
        dialogItemView.setUnreadOutVisible(false);
        dialogItemView.setReadOutVisible(false);
        dialogItemView.setSendingVisible(false);
        dialogItemView.setErrorVisible(false);
        dialogItemView.j((z4 && dialogItemView.c()) ? DialogItemView.ExtraIcon.PIN : DialogItemView.ExtraIcon.NONE, z);
    }
}
