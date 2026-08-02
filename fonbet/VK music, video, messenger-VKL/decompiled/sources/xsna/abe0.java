package xsna;

import android.view.View;
import android.view.ViewGroup;
import com.vk.clips.upload.vk.api.di.ClipsUploadVkComponent;
import com.vk.dto.common.id.UserId;
import com.vkontakte.android.R;
import java.util.List;

/* compiled from: PublicationBannerController.kt */
/* loaded from: classes17.dex */
public final class abe0 implements w8i {
    public final fee b;
    public final ViewGroup c;
    public final wye d;
    public boolean e;
    public View f;

    public abe0(fee feeVar, View view) {
        this.b = feeVar;
        bpn0 bpn0Var = new bpn0(new myd0(this, 2));
        this.c = (ViewGroup) view.findViewById(R.id.coordinator);
        this.d = ((ClipsUploadVkComponent) bpn0Var.getValue()).U5();
    }

    public final void a(UserId userId, List list) {
        if (this.e) {
            return;
        }
        this.e = true;
        this.d.e(new o15(list, userId, this, 6));
    }
}
