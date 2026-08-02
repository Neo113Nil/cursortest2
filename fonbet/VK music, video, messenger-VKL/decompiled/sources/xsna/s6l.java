package xsna;

import android.content.Context;
import android.content.Intent;
import android.net.Uri;
import android.view.View;
import com.vk.dto.common.data.PrivacySetting;
import com.vk.photos.legacy.EditAlbumFragment;

/* compiled from: R8$$SyntheticClass */
/* loaded from: classes6.dex */
public final /* synthetic */ class s6l implements View.OnClickListener {
    public final /* synthetic */ int b;
    public final /* synthetic */ Context c;

    public /* synthetic */ s6l(Context context, int i) {
        this.b = i;
        this.c = context;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        int i = this.b;
        Context context = this.c;
        switch (i) {
            case 0:
                Intent intent = new Intent("android.settings.action.MANAGE_OVERLAY_PERMISSION", Uri.parse("package:" + context.getPackageName()));
                intent.addFlags(268435456);
                context.startActivity(intent);
                break;
            default:
                int i2 = EditAlbumFragment.s0;
                rwi.d().c().e(context, (PrivacySetting) view.getTag());
                break;
        }
    }
}
