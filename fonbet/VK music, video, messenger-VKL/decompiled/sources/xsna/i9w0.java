package xsna;

import android.app.ProgressDialog;
import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import com.vk.vmoji.upload.VmojiPhotoUploadFragment;
import com.vkontakte.android.R;

/* compiled from: VmojiPhotoUploadView.kt */
/* loaded from: classes7.dex */
public final class i9w0 implements gm50 {
    public final Context b;
    public final VmojiPhotoUploadFragment.b c;
    public final f5z d;
    public final View e;
    public final View f;
    public ProgressDialog g;

    public i9w0(Context context, VmojiPhotoUploadFragment.b bVar, f5z f5zVar) {
        this.b = context;
        this.c = bVar;
        this.d = f5zVar;
        dhr0.a.getClass();
        View inflate = LayoutInflater.from(dhr0.s()).inflate(R.layout.vmoji_upload_fragment, (ViewGroup) null);
        this.e = inflate;
        View findViewById = inflate.findViewById(R.id.content_container);
        this.f = findViewById;
        View findViewById2 = inflate.findViewById(R.id.cancel_header);
        View findViewById3 = inflate.findViewById(R.id.retry);
        View findViewById4 = inflate.findViewById(R.id.cancel);
        ((ImageView) inflate.findViewById(R.id.icon)).setImageDrawable(dhr0.t.b(R.drawable.vk_icon_report_outline_56, R.attr.vk_legacy_placeholder_icon_foreground_primary));
        b8j0 b8j0Var = new b8j0(this, 23);
        jjc.g(findViewById2, b8j0Var);
        jjc.g(findViewById4, b8j0Var);
        jjc.g(findViewById3, new e9i0(this, 29));
        f4m.j(findViewById);
    }

    @Override // xsna.gm50
    public final f5z getViewOwner() {
        return this.d;
    }
}
