package xsna;

import android.app.Activity;
import androidx.fragment.app.FragmentActivity;
import com.vkontakte.android.R;
import java.text.SimpleDateFormat;
import java.util.Locale;
import xsna.dw20;

/* compiled from: VideoArchivalContentBottomSheet.kt */
/* loaded from: classes2.dex */
public final class c2s0 extends kq6 {
    public final Activity c;
    public final dz20 d;
    public final Long e;

    public c2s0(FragmentActivity fragmentActivity, dz20 dz20Var, Long l) {
        this.c = fragmentActivity;
        this.d = dz20Var;
        this.e = l;
    }

    @Override // xsna.kq6
    public final dw20 a() {
        Activity activity = this.c;
        Long l = this.e;
        return ((dw20.b) dw20.a.R(new dw20.b(activity, null).M(R.drawable.vk_icon_archive_outline_56, Integer.valueOf(R.attr.vk_ui_icon_accent)).v0(R.string.archival_content_title), l != null ? activity.getString(R.string.archival_content_published_date_description, new SimpleDateFormat("dd MMMM yyyy", Locale.getDefault()).format(l)) : activity.getString(R.string.archival_content_description), 0, 17, 2)).h0(l != null ? R.string.archival_content_dialog_positive : R.string.archival_content_dialog_close, new im80(10)).a0(new e1s0(this, 1)).d0(new pnr0(this, 2)).f0(new lzl0(this, 4)).I0("video_archival_content");
    }
}
